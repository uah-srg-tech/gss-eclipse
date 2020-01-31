package es.uah.aut.srg.gss.generator.ui;

import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.filter.GSSFilterConstant;
import es.uah.aut.srg.gss.filter.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.tcheader.GSSTCHeader;
import es.uah.aut.srg.gss.tc.GSSTC;
import es.uah.aut.srg.gss.tc.GSSTCField;
import es.uah.aut.srg.gss.tc.tcFactory;
import es.uah.aut.srg.gss.tmheader.GSSTMHeader;
import es.uah.aut.srg.gss.tm.GSSTM;
import es.uah.aut.srg.gss.tm.GSSTMField;
import es.uah.aut.srg.gss.tm.GSSTMPi1;
import es.uah.aut.srg.gss.tm.tmFactory;
import es.uah.aut.srg.gss.format.GSSFormatAField;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatCSField;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.xtext.xml.XMLGeneratorUtil;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;

public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	static final boolean createXMI = true;
	static final boolean useTypeInsteadOfId = true;
	static final boolean createTmTcInOuts = true;
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {

		//parse database
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		String output = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
		
		Map<String, GSSFormatFormat> tcFormats = null;
		try {
			tcFormats = GSSGenerator.getTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSExportExport> tcExports = null;
		try {
			tcExports = GSSGenerator.getExports(database, tcFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Map<String, GSSFormatFormat> tmFormats = null;
		try {
			tmFormats = GSSGenerator.getTmFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSFilterMintermFilter> filtersBottomLevel = null;
		try {
			filtersBottomLevel = GSSGenerator.getFiltersBottomLevel(database, tmFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
				
		Map<String, GSSFilterMintermFilter> filtersTopLevel = null;
		try {
			filtersTopLevel = GSSGenerator.getFiltersTopLevel(database, tmFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSImportImport> imports = null;
		try {
			imports = GSSGenerator.getImports(database, tmFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource folder = root.findMember(output);
		
		if (folder == null || (folder instanceof IFolder) == false) {
			throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + output + "' not found!"));
		}

		//get type/subtype names mapped to DB ID
		Map<String, String> ZID_tc_type = new HashMap<String, String>();
		Map<String, String> YID_tm_type = new HashMap<String, String>();
		Map<String, String> YID_tm_type_inverse = new HashMap<String, String>();
		if(useTypeInsteadOfId) {
			for (GSSExportExport export : tcExports) {
				String typeSubtype = "tc_";
				if(export.getName().compareTo("WrongPacket") == 0) {
					typeSubtype += "epd_0_0";
				}
				else {
					if(Integer.parseInt(export.getName().substring(5, 8)) >= 500) {
						typeSubtype += "epd_";
					} else {
						typeSubtype += "sis_";
					}
					typeSubtype += export.getSettings().getSettingFromConst().get(8).getValue() + "_"
							 + export.getSettings().getSettingFromConst().get(9).getValue();
					//warning! SIS has several same type+subtype for different tcs
					//change the name of one at least
					if(export.getName().compareTo("ZID52377") == 0) {//tc 129.152 1W
						typeSubtype += "_w";
					}
					else if(export.getName().compareTo("ZID52378") == 0) {//tc 129.152 1L
						typeSubtype += "_l";
					}
				}
				ZID_tc_type.put(export.getName(), typeSubtype);
			}

			Map<String, String> PI1_Val = new HashMap<String, String>();
			for (GSSFilterMintermFilter filterTopLevel : filtersTopLevel.values()) {
				PI1_Val.put(filterTopLevel.getName(),
						((GSSFilterConstant)filterTopLevel.getBoolVar().get(0).getValue()).getValue());
			}
			for (GSSFilterMintermFilter filterBottomLevel : filtersBottomLevel) {
				if(filterBottomLevel.getName().substring(0, 3).compareTo("EPD") == 0) {
					continue;
				}
				String typeSubtype = "tm_";
				if(Integer.parseInt(filterBottomLevel.getName().substring(5, 8)) < 700) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += ((GSSFilterConstant)filterBottomLevel.getBoolVar().get(1).getValue()).getValue() + "_"
						 + ((GSSFilterConstant)filterBottomLevel.getBoolVar().get(2).getValue()).getValue();
				if(PI1_Val.get(filterBottomLevel.getName()) != null) {
					typeSubtype += "_" + PI1_Val.get(filterBottomLevel.getName());
				}
				//warning! SIS has several same type+subtype for different tms
				//change the name of one at least
				if(filterBottomLevel.getName().compareTo("YID52970") == 0) {//tm 129.224 ASW
					typeSubtype += "_asw";
				}
				YID_tm_type.put(filterBottomLevel.getName(), typeSubtype);
				YID_tm_type_inverse.put(typeSubtype, filterBottomLevel.getName());
			}
		}

		//create final gss & xmi files
		for (GSSFormatFormat tcFormat : tcFormats.values()) {

			if((useTypeInsteadOfId) && (tcFormat.getName().compareTo("CCSDS_TC") != 0)
					 && (tcFormat.getName().compareTo("EPD_PUS_TC") != 0)) {
				tcFormat.setName(ZID_tc_type.get(tcFormat.getName()));
			}
			tcFormat.setUri("es.uah.aut.srg." + tcFormat.getName());

			String formatName = "tcFormats\\" + tcFormat.getName() + ".gss_format";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tcFormat,
					"es::uah::aut::srg::gss::generator::templates::formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
				// If everything went fine, we should be able to open the new file
				
				ResourceSet resourceSet = new ResourceSetImpl();
				
				IResource newFile = ((IFolder)folder).findMember(formatName);
				
				if (newFile == null) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
				}
				
				Resource xtextResource = 
						resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
					
				EObject model = xtextResource.getContents().get(0);
					
				XMLGeneratorUtil.convertReferences(model);
	
				EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
				String pathName = 
						newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
					
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
													
				xmiResource.getContents().add(outputModel);
				
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
				}
			}
		}

		for (GSSExportExport export : tcExports) {

			if(useTypeInsteadOfId)
				export.setName(ZID_tc_type.get(export.getName())); 
			    	
			String ACK = null;
			for(GSSExportSettingFromConst setting : export.getSettings().getSettingFromConst()) {
				if(setting.getToFieldRef().getName().compareTo("ACK") == 0) {
					ACK = setting.getValue();
				}
			}
	    	if(ACK.compareTo("9") == 0) {
	    		export.setName(export.getName() + "_export_ack");
	    	}
	    	else if(ACK.compareTo("8") == 0) {
	    		export.setName(export.getName() + "_export_ack");
	    	}
	    	else if(ACK.compareTo("1") == 0) {
	    		export.setName(export.getName() + "_export_ack");
	    	}
	    	else if(ACK.compareTo("0") == 0) {
	    		export.setName(export.getName() + "_export");
	    	}
	    	export.setUri("es.uah.aut.srg." + export.getName());
		
			String exportName = "exports\\" + export.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), export,
					"es::uah::aut::srg::gss::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
				// If everything went fine, we should be able to open the new file
				
				ResourceSet resourceSet = new ResourceSetImpl();
				
				IResource newFile = ((IFolder)folder).findMember(exportName);
				
				if (newFile == null) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
				}
				
				Resource xtextResource = 
						resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
					
				EObject model = xtextResource.getContents().get(0);
					
				XMLGeneratorUtil.convertReferences(model);
	
				EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
				String pathName = 
						newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
					
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
													
				xmiResource.getContents().add(outputModel);
				
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
				}
			}
		}
		
		for (GSSFormatFormat tmFormat : tmFormats.values()) {

			if((useTypeInsteadOfId) && (tmFormat.getName().compareTo("CCSDS_TM") != 0)
					 && (tmFormat.getName().compareTo("EPD_PUS_TM") != 0)
					 && (tmFormat.getName().compareTo("EPD_PUS_TM_DATA") != 0)) {
				tmFormat.setName(YID_tm_type.get(tmFormat.getName()));
			}
			tmFormat.setUri("es.uah.aut.srg." + tmFormat.getName());
		
			String formatName = "tmFormats\\" + tmFormat.getName() + ".gss_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tmFormat,
					"es::uah::aut::srg::gss::generator::templates::formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
				// If everything went fine, we should be able to open the new file
				
				ResourceSet resourceSet = new ResourceSetImpl();
				
				IResource newFile = ((IFolder)folder).findMember(formatName);
				
				if (newFile == null) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
				}
				
				Resource xtextResource = 
						resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
					
				EObject model = xtextResource.getContents().get(0);
					
				XMLGeneratorUtil.convertReferences(model);
	
				EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
				String pathName = 
						newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
					
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
													
				xmiResource.getContents().add(outputModel);
				
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
				}
			}
		}
		
		for (GSSFilterMintermFilter filterBottomLevel : filtersBottomLevel) {

			if(filterBottomLevel.getName().compareTo("EPD_CCSDS_TM") != 0) {

				if(useTypeInsteadOfId)
					filterBottomLevel.setName(YID_tm_type.get(filterBottomLevel.getName())); 
				
				filterBottomLevel.setName(filterBottomLevel.getName() + "_filter_level_0");
				filterBottomLevel.setUri("es.uah.aut.srg." + filterBottomLevel.getName());
			}
		
			String filterName = "filtersBottomLevel\\" + filterBottomLevel.getName() + ".gss_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), filterBottomLevel,
					"es::uah::aut::srg::gss::generator::templates::filterSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
				// If everything went fine, we should be able to open the new file
				
				ResourceSet resourceSet = new ResourceSetImpl();
				
				IResource newFile = ((IFolder)folder).findMember(filterName);
				
				if (newFile == null) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
				}
				
				Resource xtextResource = 
						resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
					
				EObject model = xtextResource.getContents().get(0);
					
				XMLGeneratorUtil.convertReferences(model);
	
				EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
				String pathName = 
						newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
					
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
													
				xmiResource.getContents().add(outputModel);
				
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
				}
			}
		}
		
		for (GSSFilterMintermFilter filterTopLevel : filtersTopLevel.values()) {
			
			if(useTypeInsteadOfId)
				filterTopLevel.setName(YID_tm_type.get(filterTopLevel.getName())); 
			
			filterTopLevel.setName(filterTopLevel.getName() + "_filter_level_1");
			filterTopLevel.setUri("es.uah.aut.srg." + filterTopLevel.getName());
		
			String filterName = "filtersTopLevel\\" + filterTopLevel.getName() + ".gss_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), filterTopLevel,
					"es::uah::aut::srg::gss::generator::templates::filterSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
				// If everything went fine, we should be able to open the new file
				
				ResourceSet resourceSet = new ResourceSetImpl();
				
				IResource newFile = ((IFolder)folder).findMember(filterName);
				
				if (newFile == null) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
				}
				
				Resource xtextResource = 
						resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
					
				EObject model = xtextResource.getContents().get(0);
					
				XMLGeneratorUtil.convertReferences(model);
	
				EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
				String pathName = 
						newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
					
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
													
				xmiResource.getContents().add(outputModel);
				
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
				}
			}
		}
		
		for (GSSImportImport import_ : imports) {
		
			String importName = "imports\\" + import_.getName() + ".gss_import";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), import_,
					"es::uah::aut::srg::gss::generator::templates::importSerializer::Serializer", 
					false, importName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
				// If everything went fine, we should be able to open the new file
				
				ResourceSet resourceSet = new ResourceSetImpl();
				
				IResource newFile = ((IFolder)folder).findMember(importName);
				
				if (newFile == null) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
				}
				
				Resource xtextResource = 
						resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
					
				EObject model = xtextResource.getContents().get(0);
					
				XMLGeneratorUtil.convertReferences(model);
	
				EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
				String pathName = 
						newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
					
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
													
				xmiResource.getContents().add(outputModel);
				
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					throw new CoreException(new Status(
							IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
				}
			}
		}

		if((useTypeInsteadOfId) && (createTmTcInOuts)) {

			//create tc enum
			Map<String, String> tcParamEnum = null;
			Map<String, TMTCIFEnum> tcEnums = null;
			try {
				tcParamEnum = GSSGenerator.getTCParamEnum(database);
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
			try {
				tcEnums = GSSGenerator.getTCEnum(database);
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}

			for (TMTCIFEnum tcEnum : tcEnums.values()) {
				String tcEnumName = "tcEnums\\" + tcEnum.getName() + ".tmtcif_enum";
	
				XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tcEnum,
						"es::uah::aut::srg::gss::generator::templates::enumSerializer::Serializer", 
						false, tcEnumName);
				
				folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			}
			
			//create tc inputs
			for (GSSExportExport export : tcExports) {
				GSSTC gssTc = tcFactory.eINSTANCE.createGSSTC();
				
				//get type and subtype
				StringTokenizer exportNameTokens = new StringTokenizer(export.getName(), "_");
				String gssTcInputName = exportNameTokens.nextToken();//"tc"
				gssTcInputName += "_" + exportNameTokens.nextToken() + "_";//"epd" OR "sis"
				gssTc.setType(exportNameTokens.nextToken());
				gssTc.setSubtype(exportNameTokens.nextToken());
				gssTcInputName += gssTc.getType() + "_" + gssTc.getSubtype();
				//check ack
				String exportNameSuffix = exportNameTokens.nextToken();//"export" or TC modifier (for SIS)
				if(exportNameSuffix.compareTo("export") != 0) {
					gssTcInputName += "_" + exportNameSuffix;
					exportNameTokens.nextToken();//real "export"
				}
				while(exportNameTokens.hasMoreTokens()) { //"{X}"; "ack"
					gssTcInputName += "_" + exportNameTokens.nextToken();
				}
				gssTc.setName(gssTcInputName);
				gssTc.setTo_level0_export(export);
				
				//get fields
				GSSFormatFormat tcFormat = export.getFrom();
				if((tcFormat.getCSField().size() != 0) || (tcFormat.getVSField().size() != 0) ||
						(tcFormat.getAField().size() != 0)) {
					gssTc.setLevels("2");
					gssTc.setLevel1_format(tcFormat);
					
					for(GSSFormatCSField GSSFormatCSField : tcFormat.getCSField()) {
						if(GSSFormatCSField.getName().compareTo("ApplicationData") == 0) {
							continue;
						}
						GSSTCField gssTcCSField = tcFactory.eINSTANCE.createGSSTCField();
						gssTcCSField.setGssField(GSSFormatCSField);
						if(GSSFormatCSField.getDescription() != null) {
							gssTcCSField.setName(GSSFormatCSField.getDescription());
						} else {
							gssTcCSField.setName(GSSFormatCSField.getName());
						}
						if(tcParamEnum.get((GSSFormatCSField.getName())) != null) {
							gssTcCSField.setEnumRef(tcEnums.get(tcParamEnum.get(GSSFormatCSField.getName())));
						}
						gssTc.getGssFields().add(gssTcCSField);
					}
					for(GSSFormatVSField GSSFormatVSField : tcFormat.getVSField()) {
						if(GSSFormatVSField.getName().compareTo("ApplicationData") == 0) {
							continue;
						}
						GSSTCField gssTcVSField = tcFactory.eINSTANCE.createGSSTCField();
						gssTcVSField.setGssField(GSSFormatVSField);
						if(GSSFormatVSField.getDescription() != null) {
							gssTcVSField.setName(GSSFormatVSField.getDescription());
						} else {
							gssTcVSField.setName(GSSFormatVSField.getName());
						}
						gssTc.getGssFields().add(gssTcVSField);
					}
					for(GSSFormatAField GSSFormatAField : tcFormat.getAField()) {
						GSSTCField gssTcAField = tcFactory.eINSTANCE.createGSSTCField();
						gssTcAField.setGssField(GSSFormatAField);
						if(GSSFormatAField.getDescription() != null) {
							gssTcAField.setName(GSSFormatAField.getDescription());
						} else {
							gssTcAField.setName(GSSFormatAField.getName());
						}
						gssTc.getGssFields().add(gssTcAField);
					}
					for(GSSFormatAIField GSSFormatAIField : tcFormat.getAIField()) {
						GSSTCField gssTcAIField = tcFactory.eINSTANCE.createGSSTCField();
						gssTcAIField.setGssField(GSSFormatAIField);
						if(GSSFormatAIField.getDescription() != null) {
							gssTcAIField.setName(GSSFormatAIField.getDescription());
						} else {
							gssTcAIField.setName(GSSFormatAIField.getName());
						}
						gssTc.getGssFields().add(gssTcAIField);
					}
				}
				else {
					gssTc.setLevels("1");
				}
			
				String inputName = "tc\\" + gssTc.getName() + ".gss_tc";

				XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTc,
						"es::uah::aut::srg::gss::generator::templates::tcSerializer::Serializer", 
						false, inputName);
				
				folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			}
			
			//create tc header
			GSSTCHeader tcHeader = null;
			try {
				tcHeader = GSSGenerator.createTcHeader(database, tcFormats.get("CCSDS_TC"));
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
			
			String tcHeaderName = "tc\\" + tcHeader.getName() + ".gss_tcheader";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tcHeader,
					"es::uah::aut::srg::gss::generator::templates::tcHeaderSerializer::Serializer", 
					false, tcHeaderName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			//create tm enum
			Map<String, String> tmParamEnum = null;
			Map<String, TMTCIFEnum> tmEnums = null;
			try {
				tmParamEnum = GSSGenerator.getTMParamEnum(database);
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
			try {
				tmEnums = GSSGenerator.getTMEnum(database);
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}

			for (TMTCIFEnum tmEnum : tmEnums.values()) {
				String tmEnumName = "tmEnums\\" + tmEnum.getName() + ".tmtcif_enum";
	
				XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tmEnum,
						"es::uah::aut::srg::gss::generator::templates::enumSerializer::Serializer", 
						false, tmEnumName);
				
				folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			}
			
			//create tm outputs
			GSSImportImport ccsdsImport = null;
			for(GSSImportImport import_ : imports) {
				if(import_.getName().compareTo("EPD_PUS_TM_DATA_FROM_CCSDS_TM") == 0) {
					ccsdsImport = import_;
					break;
				}
			}
			for (GSSFilterMintermFilter filterBottomLevel : filtersBottomLevel) {
				GSSTM gssTm = tmFactory.eINSTANCE.createGSSTM();

				if(filterBottomLevel.getName().compareTo("EPD_CCSDS_TM") == 0) {
					continue;
				}
				String pi1_name = "", pi1_val = "";
				
				//get type and subtype
				StringTokenizer filterNameTokens = new StringTokenizer(filterBottomLevel.getName(), "_");
				String gssTmOutputName = filterNameTokens.nextToken();//"tm"
				gssTmOutputName += "_" + filterNameTokens.nextToken() + "_";//"epd" OR "sis"
				gssTm.setType(filterNameTokens.nextToken());
				gssTm.setSubtype(filterNameTokens.nextToken());
				gssTmOutputName += gssTm.getType() + "_" + gssTm.getSubtype();
				String final_str = filterNameTokens.nextToken();
				if(final_str.compareTo("asw") == 0) {//exception for TM SIS 129.224
					gssTmOutputName += "_" + final_str;
				} else if(final_str.compareTo("filter") != 0) {
					gssTmOutputName += "_" + final_str;
					pi1_val = final_str;
				}
				gssTm.setName(gssTmOutputName);
				gssTm.setLevel0_filter(filterBottomLevel);
				gssTm.setFrom_level0_import(ccsdsImport);

				//get pi1_name
				GSSFilterMintermFilter filterTopLevel = filtersTopLevel.get(YID_tm_type_inverse.get(gssTmOutputName));
				if(filterTopLevel != null) {
					pi1_name = filterTopLevel.getBoolVar().get(0).getFieldRef().getName();
					gssTm.setLevel1_filter(filterTopLevel);
				};
				
				//get fields
				GSSFormatFormat tmFormat = tmFormats.get(YID_tm_type_inverse.get(gssTmOutputName));
				gssTm.setLevel1_format(tmFormat);
				for(GSSFormatCSField GSSFormatCSField : tmFormat.getCSField()) {
					if(GSSFormatCSField.getName().compareTo("SourceData") == 0){
						continue;
					}
					else if(GSSFormatCSField.getName().compareTo(pi1_name) == 0) {
						GSSTMPi1 gssTmPi1 = tmFactory.eINSTANCE.createGSSTMPi1();
						gssTmPi1.setVal(pi1_val);
						gssTmPi1.setGssField(GSSFormatCSField);
						if(GSSFormatCSField.getDescription() != null) {
							gssTmPi1.setName(GSSFormatCSField.getDescription());
						} else {
							gssTmPi1.setName(GSSFormatCSField.getName());
						}
						gssTm.setGssPi1(gssTmPi1);
					}
					else {
						GSSTMField gssTmCSField = tmFactory.eINSTANCE.createGSSTMField();
						gssTmCSField.setGssField(GSSFormatCSField);
						if(GSSFormatCSField.getDescription() != null) {
							gssTmCSField.setName(GSSFormatCSField.getDescription());
						} else {
							gssTmCSField.setName(GSSFormatCSField.getName());
						}
						if(tmParamEnum.get((GSSFormatCSField.getName())) != null) {
							gssTmCSField.setEnumRef(tmEnums.get(tmParamEnum.get(GSSFormatCSField.getName())));
						}
						gssTm.getGssFields().add(gssTmCSField);
					}
				}
				for(GSSFormatVSField GSSFormatVSField : tmFormat.getVSField()) {
					if(GSSFormatVSField.getName().compareTo("SourceData") == 0) {
						continue;
					}
					GSSTMField gssTmVSField = tmFactory.eINSTANCE.createGSSTMField();
					gssTmVSField.setGssField(GSSFormatVSField);
					if(GSSFormatVSField.getDescription() != null) {
						gssTmVSField.setName(GSSFormatVSField.getDescription());
					} else {
						gssTmVSField.setName(GSSFormatVSField.getName());
					}
					gssTm.getGssFields().add(gssTmVSField);
				}
				for(GSSFormatAField GSSFormatAField : tmFormat.getAField()) {
					GSSTMField gssTmAField = tmFactory.eINSTANCE.createGSSTMField();
					gssTmAField.setGssField(GSSFormatAField);
					if(GSSFormatAField.getDescription() != null) {
						gssTmAField.setName(GSSFormatAField.getDescription());
					} else {
						gssTmAField.setName(GSSFormatAField.getName());
					}
					gssTm.getGssFields().add(gssTmAField);
				}
				for(GSSFormatAIField GSSFormatAIField : tmFormat.getAIField()) {
					GSSTMField gssTmAIField = tmFactory.eINSTANCE.createGSSTMField();
					gssTmAIField.setGssField(GSSFormatAIField);
					if(GSSFormatAIField.getDescription() != null) {
						gssTmAIField.setName(GSSFormatAIField.getDescription());
					} else {
						gssTmAIField.setName(GSSFormatAIField.getName());
					}
					gssTm.getGssFields().add(gssTmAIField);
				}
				if((tmFormat.getCSField().size() != 0) || (tmFormat.getVSField().size() != 0) ||
						(tmFormat.getAField().size() != 0)) {
					gssTm.setLevels("2");
				} else {
					gssTm.setLevels("1");
				}
			
				String outputName = "tm\\" + gssTm.getName() + ".gss_tm";

				XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTm,
						"es::uah::aut::srg::gss::generator::templates::tmSerializer::Serializer", 
						false, outputName);
				
				folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			}
			
			//create tm header
			GSSTMHeader tmHeader = null;
			try {
				tmHeader = GSSGenerator.createTmHeader(database, tmFormats.get("CCSDS_TM"));
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
			
			String tmHeaderName = "tm\\" + tmHeader.getName() + ".gss_tmheader";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tmHeader,
					"es::uah::aut::srg::gss::generator::templates::tmHeaderSerializer::Serializer", 
					false, tmHeaderName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
		}
	}
}