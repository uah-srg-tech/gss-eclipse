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
import es.uah.aut.srg.gss.filter.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput;
import es.uah.aut.srg.gss.tcinput.GSSTCInput;
import es.uah.aut.srg.gss.tcinput.GSSTCInputField;
import es.uah.aut.srg.gss.tcinput.tcinputFactory;
import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutput;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutputField;
import es.uah.aut.srg.gss.tmoutput.tmoutputFactory;
import es.uah.aut.srg.gss.format.GSSFormatAField;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatCSField;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.xtext.xml.XMLGeneratorUtil;

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
						filterTopLevel.getBoolVar().get(0).getConstant().getValue());
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
				typeSubtype += filterBottomLevel.getBoolVar().get(1).getConstant().getValue() + "_"
						 + filterBottomLevel.getBoolVar().get(2).getConstant().getValue();
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
			//create tc inputs
			for (GSSExportExport export : tcExports) {
				GSSTCInput gssTcInput = tcinputFactory.eINSTANCE.createGSSTCInput();
				
				//get type and subtype
				StringTokenizer exportNameTokens = new StringTokenizer(export.getName(), "_");
				String gssTcInputName = exportNameTokens.nextToken();//"tc"
				gssTcInputName += "_" + exportNameTokens.nextToken() + "_";//"epd" OR "sis"
				gssTcInput.setType(exportNameTokens.nextToken());
				gssTcInput.setSubtype(exportNameTokens.nextToken());
				gssTcInputName += gssTcInput.getType() + "_" + gssTcInput.getSubtype();
				//check ack
				String exportNameSuffix = exportNameTokens.nextToken();//"export" or TC modifier (for SIS)
				if(exportNameSuffix.compareTo("export") != 0) {
					gssTcInputName += "_" + exportNameSuffix;
					exportNameTokens.nextToken();//real "export"
				}
				while(exportNameTokens.hasMoreTokens()) { //"{X}"; "ack"
					gssTcInputName += "_" + exportNameTokens.nextToken();
				}
				gssTcInput.setName(gssTcInputName);
				gssTcInput.setTo_level0_export(export);
				
				//get fields
				GSSFormatFormat tcFormat = export.getFrom();
				if((tcFormat.getCSField().size() != 0) || (tcFormat.getVSField().size() != 0) ||
						(tcFormat.getAField().size() != 0)) {
					gssTcInput.setLevels("2");
					gssTcInput.setLevel1_format(tcFormat);
					
					for(GSSFormatCSField GSSFormatCSField : tcFormat.getCSField()) {
						if(GSSFormatCSField.getName().compareTo("ApplicationData") == 0) {
							continue;
						}
						GSSTCInputField gssTcInputField = tcinputFactory.eINSTANCE.createGSSTCInputField();
						gssTcInputField.setGssField(GSSFormatCSField);
						if(GSSFormatCSField.getDescription() != null) {
							gssTcInputField.setName(GSSFormatCSField.getDescription());
						} else {
							gssTcInputField.setName(GSSFormatCSField.getName());
						}
						gssTcInput.getGssFields().add(gssTcInputField);
					}
					for(GSSFormatVSField GSSFormatVSField : tcFormat.getVSField()) {
						if(GSSFormatVSField.getName().compareTo("ApplicationData") == 0) {
							continue;
						}
						GSSTCInputField gssTcInputField = tcinputFactory.eINSTANCE.createGSSTCInputField();
						gssTcInputField.setGssField(GSSFormatVSField);
						if(GSSFormatVSField.getDescription() != null) {
							gssTcInputField.setName(GSSFormatVSField.getDescription());
						} else {
							gssTcInputField.setName(GSSFormatVSField.getName());
						}
						gssTcInput.getGssFields().add(gssTcInputField);
					}
					for(GSSFormatAField GSSFormatAField : tcFormat.getAField()) {
						GSSTCInputField gssTcInputField = tcinputFactory.eINSTANCE.createGSSTCInputField();
						gssTcInputField.setGssField(GSSFormatAField);
						if(GSSFormatAField.getDescription() != null) {
							gssTcInputField.setName(GSSFormatAField.getDescription());
						} else {
							gssTcInputField.setName(GSSFormatAField.getName());
						}
						gssTcInput.getGssFields().add(gssTcInputField);
					}
					for(GSSFormatAIField GSSFormatAIField : tcFormat.getAIField()) {
						GSSTCInputField gssTcInputField = tcinputFactory.eINSTANCE.createGSSTCInputField();
						gssTcInputField.setGssField(GSSFormatAIField);
						if(GSSFormatAIField.getDescription() != null) {
							gssTcInputField.setName(GSSFormatAIField.getDescription());
						} else {
							gssTcInputField.setName(GSSFormatAIField.getName());
						}
						gssTcInput.getGssFields().add(gssTcInputField);
					}
				}
				else {
					gssTcInput.setLevels("1");
				}
			
				String inputName = "tcInputs\\" + gssTcInput.getName() + ".gss_tcinput";

				XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTcInput,
						"es::uah::aut::srg::gss::generator::templates::tcInputSerializer::Serializer", 
						false, inputName);
				
				folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			}
			
			//create tc header
			GSSTCHeaderInput tcHeader = null;
			try {
				tcHeader = GSSGenerator.createTcHeader(database, tcFormats.get("CCSDS_TC"));
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
			
			String tcHeaderName = "tcInputs\\" + tcHeader.getName() + ".gss_tcheaderinput";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tcHeader,
					"es::uah::aut::srg::gss::generator::templates::tcHeaderInputSerializer::Serializer", 
					false, tcHeaderName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
			//create tm outputs
			GSSImportImport ccsdsImport = null;
			for(GSSImportImport import_ : imports) {
				if(import_.getName().compareTo("EPD_PUS_TM_DATA_FROM_CCSDS_TM") == 0) {
					ccsdsImport = import_;
					break;
				}
			}
			for (GSSFilterMintermFilter filterBottomLevel : filtersBottomLevel) {
				GSSTMOutput gssTmOutput = tmoutputFactory.eINSTANCE.createGSSTMOutput();

				if(filterBottomLevel.getName().compareTo("EPD_CCSDS_TM") == 0) {
					continue;
				}
				//get type and subtype
				StringTokenizer filterNameTokens = new StringTokenizer(filterBottomLevel.getName(), "_");
				String gssTmOutputName = filterNameTokens.nextToken();//"tm"
				gssTmOutputName += "_" + filterNameTokens.nextToken() + "_";//"epd" OR "sis"
				gssTmOutput.setType(filterNameTokens.nextToken());
				gssTmOutput.setSubtype(filterNameTokens.nextToken());
				gssTmOutputName += gssTmOutput.getType() + "_" + gssTmOutput.getSubtype();
				String pi1_val_str = filterNameTokens.nextToken();
				if(pi1_val_str.compareTo("asw") == 0) {//exception for TM SIS 129.224
					gssTmOutputName += "_" + pi1_val_str;
				} else if(pi1_val_str.compareTo("filter") != 0) {
					gssTmOutput.setPi1_val(pi1_val_str);
					gssTmOutputName += "_" + gssTmOutput.getPi1_val();
				}
				gssTmOutput.setName(gssTmOutputName);
				gssTmOutput.setLevel0_filter(filterBottomLevel);
				gssTmOutput.setFrom_level0_import(ccsdsImport);

				//get pi1_val
				String Pi1_val_name = "";
				GSSFilterMintermFilter filterTopLevel = filtersTopLevel.get(YID_tm_type_inverse.get(gssTmOutputName));
				if(filterTopLevel != null) {
					Pi1_val_name = filterTopLevel.getBoolVar().get(0).getFieldRef().getName();
					gssTmOutput.setLevel1_filter(filterTopLevel);
				};
				
				//get fields
				GSSFormatFormat tmFormat = tmFormats.get(YID_tm_type_inverse.get(gssTmOutputName));
				gssTmOutput.setLevel1_format(tmFormat);
				for(GSSFormatCSField GSSFormatCSField : tmFormat.getCSField()) {
					if((GSSFormatCSField.getName().compareTo("SourceData") == 0) ||
							(GSSFormatCSField.getName().compareTo(Pi1_val_name) == 0)){
						continue;
					}
					GSSTMOutputField gssTmOutputField = tmoutputFactory.eINSTANCE.createGSSTMOutputField();
					gssTmOutputField.setGssField(GSSFormatCSField);
					if(GSSFormatCSField.getDescription() != null) {
						gssTmOutputField.setName(GSSFormatCSField.getDescription());
					} else {
						gssTmOutputField.setName(GSSFormatCSField.getName());
					}
					gssTmOutput.getGssFields().add(gssTmOutputField);
				}
				for(GSSFormatVSField GSSFormatVSField : tmFormat.getVSField()) {
					if(GSSFormatVSField.getName().compareTo("SourceData") == 0) {
						continue;
					}
					GSSTMOutputField gssTmOutputField = tmoutputFactory.eINSTANCE.createGSSTMOutputField();
					gssTmOutputField.setGssField(GSSFormatVSField);
					if(GSSFormatVSField.getDescription() != null) {
						gssTmOutputField.setName(GSSFormatVSField.getDescription());
					} else {
						gssTmOutputField.setName(GSSFormatVSField.getName());
					}
					gssTmOutput.getGssFields().add(gssTmOutputField);
				}
				for(GSSFormatAField GSSFormatAField : tmFormat.getAField()) {
					GSSTMOutputField gssTmOutputField = tmoutputFactory.eINSTANCE.createGSSTMOutputField();
					gssTmOutputField.setGssField(GSSFormatAField);
					if(GSSFormatAField.getDescription() != null) {
						gssTmOutputField.setName(GSSFormatAField.getDescription());
					} else {
						gssTmOutputField.setName(GSSFormatAField.getName());
					}
					gssTmOutput.getGssFields().add(gssTmOutputField);
				}
				for(GSSFormatAIField GSSFormatAIField : tmFormat.getAIField()) {
					GSSTMOutputField gssTmOutputField = tmoutputFactory.eINSTANCE.createGSSTMOutputField();
					gssTmOutputField.setGssField(GSSFormatAIField);
					if(GSSFormatAIField.getDescription() != null) {
						gssTmOutputField.setName(GSSFormatAIField.getDescription());
					} else {
						gssTmOutputField.setName(GSSFormatAIField.getName());
					}
					gssTmOutput.getGssFields().add(gssTmOutputField);
				}
				if((tmFormat.getCSField().size() != 0) || (tmFormat.getVSField().size() != 0) ||
						(tmFormat.getAField().size() != 0)) {
					gssTmOutput.setLevels("2");
				} else {
					gssTmOutput.setLevels("1");
				}
			
				String outputName = "tmOutputs\\" + gssTmOutput.getName() + ".gss_tmoutput";

				XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTmOutput,
						"es::uah::aut::srg::gss::generator::templates::tmOutputSerializer::Serializer", 
						false, outputName);
				
				folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			}
			
			//create tm header
			GSSTMHeaderOutput tmHeader = null;
			try {
				tmHeader = GSSGenerator.createTmHeader(database, tmFormats.get("CCSDS_TM"));
			} catch (IOException e) {
				throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
			
			String tmHeaderName = "tmOutputs\\" + tmHeader.getName() + ".gss_tmheaderoutput";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), tmHeader,
					"es::uah::aut::srg::gss::generator::templates::tmHeaderOutputSerializer::Serializer", 
					false, tmHeaderName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
		}
	}
}