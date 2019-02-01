package es.uah.aut.srg.gss.generator.ui;

import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

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
import es.uah.aut.srg.gss.filters.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.filters.filtersFactory;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.imports.GSSImportImport;
import es.uah.aut.srg.gss.imports.importsFactory;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormatType;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatFactory;
import es.uah.aut.srg.gss.xtext.xml.XMLGeneratorUtil;


public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		boolean useTypeInsteadOfId = true;

		//create common ccsds/pus formats, filters and imports
		GSSTmTcFormatTmTcFormat ccsdsTcFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		ccsdsTcFormat.setName("CCSDS_TC");
		ccsdsTcFormat.setDescription("CCSDS_TC");
		ccsdsTcFormat.setUri("es.uah.aut.srg.CCSDS_TC");
		ccsdsTcFormat.setVersion("v1");
		ccsdsTcFormat.setProtocol("CCSDS");
		ccsdsTcFormat.setType(GSSTmTcFormatTmTcFormatType.TC);
		GSSGenerator.createVSField(ccsdsTcFormat, 0, 0, "CCSDSPacket", null, 7*8, 12, 8, 248*8, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 1, 0, "PacketHeader", null, 6*8, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 2, 1, "PacketID", null, 16, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 3, 2, "VersionNumber", null, 3, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 4, 2, "Type", null, 1, 3);
		GSSGenerator.createCSField(ccsdsTcFormat, 5, 2, "DFHFlag", null, 1, 4);
		GSSGenerator.createCSField(ccsdsTcFormat, 6, 2, "APID", null, 11, 5);
		GSSGenerator.createCSField(ccsdsTcFormat, 7, 6, "PID", null, 7, 5);
		GSSGenerator.createCSField(ccsdsTcFormat, 8, 6, "PCAT", null, 4, 12);
		GSSGenerator.createCSField(ccsdsTcFormat, 9, 1, "PacketSequenceControl", null, 16, 16);
		GSSGenerator.createCSField(ccsdsTcFormat, 10, 9, "SequenceFlag", null, 2, 16);
		GSSGenerator.createCSField(ccsdsTcFormat, 11, 9, "SequenceCount", null, 14, 18);
		GSSGenerator.createCSField(ccsdsTcFormat, 12, 1, "PacketLength", null, 16, 32);
		GSSGenerator.createVSField(ccsdsTcFormat, 13, 0, "PacketDataField", null, 1*8, 12, 8, 242*8, 6*8);
		GSSGenerator.createCSField(ccsdsTcFormat, 14, 13, "SecondaryHeader", null, 4*8, 6*8);
		GSSGenerator.createVSField(ccsdsTcFormat, 15, 13, "ApplicationData", null, -5*8, 12, 8, 236*8, 10*8);
		GSSGenerator.createFDICField(ccsdsTcFormat, 16, 13, "CRC", null, 16, 15,
				new ArrayList<Integer>(Arrays.asList(1, 14, 15)));
		
		GSSTmTcFormatTmTcFormat epdPusTcFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		epdPusTcFormat.setName("EPD_PUS_TC");
		epdPusTcFormat.setDescription("EPD_PUS_TC");
		epdPusTcFormat.setUri("es.uah.aut.srg.EPD_PUS_TC");
		epdPusTcFormat.setVersion("v1");
		epdPusTcFormat.setProtocol("PUS");
		epdPusTcFormat.setType(GSSTmTcFormatTmTcFormatType.TC);
		GSSGenerator.createCSField(epdPusTcFormat, 0, 0, "SecondaryHeader", null, 4*8, 0);
		GSSGenerator.createCSField(epdPusTcFormat, 1, 0, "CCSDSSecondaryHeaderFlag", null, 1, 0);
		GSSGenerator.createCSField(epdPusTcFormat, 2, 0, "PUSVersion", null, 3, 1);
		GSSGenerator.createCSField(epdPusTcFormat, 3, 0, "ACK", null, 4, 4);
		GSSGenerator.createCSField(epdPusTcFormat, 4, 0, "ServiceType", null, 1*8, 1*8);
		GSSGenerator.createCSField(epdPusTcFormat, 5, 0, "ServiceSubtype", null, 1*8, 2*8);
		GSSGenerator.createCSField(epdPusTcFormat, 6, 0, "SourceID", null, 1*8, 3*8);
		GSSGenerator.createVSField(epdPusTcFormat, 7, 7, "ApplicationData", null, 0, 8, 8, 236*8, 4*8);
		GSSGenerator.createVRFieldSize(epdPusTcFormat, 8, 7, "AppDataLength");
		
		GSSTmTcFormatTmTcFormat ccsdsTmFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		ccsdsTmFormat.setName("CCSDS_TM");
		ccsdsTmFormat.setDescription("CCSDS_TM");
		ccsdsTmFormat.setUri("es.uah.aut.srg.CCSDS_TM");
		ccsdsTmFormat.setVersion("v1");
		ccsdsTmFormat.setProtocol("CCSDS");
		ccsdsTmFormat.setType(GSSTmTcFormatTmTcFormatType.TM);
		GSSGenerator.createVSField(ccsdsTmFormat, 0, 0, "CCSDSPacket", null, 7*8, 12, 8, 4112*8, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 1, 0, "PacketHeader", null, 6*8, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 2, 1, "PacketID", null, 16, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 3, 2, "VersionNumber", null, 3, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 4, 2, "Type", null, 1, 3);
		GSSGenerator.createCSField(ccsdsTmFormat, 5, 2, "DFHFlag", null, 1, 4);
		GSSGenerator.createCSField(ccsdsTmFormat, 6, 2, "APID", null, 11, 5);
		GSSGenerator.createCSField(ccsdsTmFormat, 7, 6, "PID", null, 7, 5);
		GSSGenerator.createCSField(ccsdsTmFormat, 8, 6, "PCAT", null, 4, 12);
		GSSGenerator.createCSField(ccsdsTmFormat, 9, 1, "PacketSequenceControl", null, 16, 16);
		GSSGenerator.createCSField(ccsdsTmFormat, 10, 9, "SequenceFlag", null, 2, 16);
		GSSGenerator.createCSField(ccsdsTmFormat, 11, 9, "SequenceCount", null, 14, 18);
		GSSGenerator.createCSField(ccsdsTmFormat, 12, 1, "PacketLength", null, 16, 32);
		GSSGenerator.createVSField(ccsdsTmFormat, 13, 0, "PacketDataField", null, 8, 12, 8, 4106*8, 6*8);
		GSSGenerator.createCSField(ccsdsTmFormat, 14, 13, "SecondaryHeader", null, 10*8, 6*8);
		GSSGenerator.createVSField(ccsdsTmFormat, 15, 13, "SourceData", null, -11*8, 12, 8, 4096*8, 16*8);
		GSSGenerator.createFDICField(ccsdsTmFormat, 16, 13, "CRC", null, 16, 15,
				new ArrayList<Integer>(Arrays.asList(1, 14, 15)));
		
		GSSTmTcFormatTmTcFormat epdPusTmFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		epdPusTmFormat.setName("EPD_PUS_TM");
		epdPusTmFormat.setDescription("EPD_PUS_TM");
		epdPusTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM");
		epdPusTmFormat.setVersion("v1");
		epdPusTmFormat.setProtocol("PUS");
		epdPusTmFormat.setType(GSSTmTcFormatTmTcFormatType.TM);
		GSSGenerator.createCSField(epdPusTmFormat, 0, 0, "SecondaryHeader", null, 10*8, 0);
		GSSGenerator.createCSField(epdPusTmFormat, 1, 0, "Spare", null, 1, 0);
		GSSGenerator.createCSField(epdPusTmFormat, 2, 0, "PUSVersion", null, 3, 1);
		GSSGenerator.createCSField(epdPusTmFormat, 3, 0, "Spare", null, 4, 4);
		GSSGenerator.createCSField(epdPusTmFormat, 4, 0, "ServiceType", null, 8, 1*8);
		GSSGenerator.createCSField(epdPusTmFormat, 5, 0, "ServiceSubtype", null, 8, 2*8);
		GSSGenerator.createCSField(epdPusTmFormat, 6, 0, "DestinationID", null, 8, 3*8);
		GSSGenerator.createCSField(epdPusTmFormat, 7, 0, "SCTime", null, 6*8, 4*8);
		GSSGenerator.createCSField(epdPusTmFormat, 8, 7, "Sync", null, 1, 4*8);
		GSSGenerator.createCSField(epdPusTmFormat, 9, 7, "Seconds", null, 31, 4*8+1);
		GSSGenerator.createCSField(epdPusTmFormat, 10, 7, "Subseconds", null, 16, 8*8);
		GSSGenerator.createVSField(epdPusTmFormat, 11, 11, "SourceData", null, 0, 12, 8, 4096*8, 10*8);
		GSSGenerator.createVRFieldSize(epdPusTmFormat, 12, 11, "SourceDataLength");
		
		GSSTmTcFormatTmTcFormat epdPusDataDataTmFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		epdPusDataDataTmFormat.setName("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setDescription("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setVersion("v1");
		epdPusDataDataTmFormat.setProtocol("PUS_DATA");
		epdPusDataDataTmFormat.setType(GSSTmTcFormatTmTcFormatType.TM);
		GSSGenerator.createVSField(epdPusDataDataTmFormat, 0, 0, "SourceData", null, 0, 1, 8, 4096*8, 10*8);
		GSSGenerator.createVRFieldSize(epdPusDataDataTmFormat, 1, 0, "SourceDataLength");
		
		GSSFilterMintermFilter epdCcsdsFilter = filtersFactory.eINSTANCE.createGSSFilterMintermFilter();
		epdCcsdsFilter.setName("EPD_CCSDS_TM");
		epdCcsdsFilter.setDescription("EPD_CCSDS_TM");
		epdCcsdsFilter.setUri("es.uah.aut.srg.EPD_CCSDS_TM");
		epdCcsdsFilter.setVersion("v1");
		epdCcsdsFilter.setFormatFile(ccsdsTmFormat);//CCSDS
		GSSGenerator.createMintermFilterBoolVar(epdCcsdsFilter, "0", ccsdsTmFormat.getCSField().get(2), "0");//Version
		GSSGenerator.createMintermFilterBoolVarFDIC(epdCcsdsFilter, "1", ccsdsTmFormat.getFDICField().get(0));//CRC
		GSSGenerator.createMintermFilterMinterm(epdCcsdsFilter, "0", 0, 2);
		
		GSSImportImport epdPusFromCcsdsImport = importsFactory.eINSTANCE.createGSSImportImport();
		epdPusFromCcsdsImport.setName("EPD_PUS_TM_FROM_CCSDS_TM");
		epdPusFromCcsdsImport.setDescription("EPD_PUS_TM_FROM_CCSDS_TM");
		epdPusFromCcsdsImport.setUri("es.uah.aut.srg.EPD_PUS_TM_FROM_CCSDS_TM");
		epdPusFromCcsdsImport.setVersion("v1");
		epdPusFromCcsdsImport.setFrom(ccsdsTmFormat);
		epdPusFromCcsdsImport.setTo(epdPusTmFormat);
		GSSGenerator.createImportDataSource(epdPusFromCcsdsImport, ccsdsTmFormat.getCSField().get(12), "0", "0");//SecondaryHeader
		GSSGenerator.createImportDataSource(epdPusFromCcsdsImport, ccsdsTmFormat.getVSField().get(2), "0", "0");//SourceData
		GSSGenerator.createImportVirtualSize(epdPusFromCcsdsImport, ccsdsTmFormat.getCSField().get(11),
				epdPusTmFormat.getVRFieldSize().get(0), "-11");//PacketLength to SourceDataLength
		
		GSSImportImport epdPusDataFromEpdPusImport = importsFactory.eINSTANCE.createGSSImportImport();
		epdPusDataFromEpdPusImport.setName("EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setDescription("EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setUri("es.uah.aut.srg.EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setVersion("v1");
		epdPusDataFromEpdPusImport.setFrom(epdPusTmFormat);
		epdPusDataFromEpdPusImport.setTo(epdPusDataDataTmFormat);
		GSSGenerator.createImportDataSource(epdPusDataFromEpdPusImport, epdPusTmFormat.getVSField().get(0), "0", "0");//SourceData
		epdPusDataFromEpdPusImport.setVirtualSize(null);
		
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		String output = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
		
		Map<String, GSSTmTcFormatTmTcFormat> tcFormats = null;
		try {
			tcFormats = GSSGenerator.getTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		tcFormats.put("CCSDS_TC", ccsdsTcFormat);
		tcFormats.put("EPD_PUS_TC", epdPusTcFormat);
		
		Collection<GSSExportExport> exportsToLevel0 = null;
		try {
			exportsToLevel0 = GSSGenerator.getExportsToLevel0(database, ccsdsTcFormat, epdPusTcFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSExportExport> exportsToLevel1 = null;
		try {
			exportsToLevel1 = GSSGenerator.getExportsToLevel1(database, tcFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Map<String, GSSTmTcFormatTmTcFormat> tmFormats = null;
		try {
			tmFormats = GSSGenerator.getTmFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		tmFormats.put("CCSDS_TM", ccsdsTmFormat);
		tmFormats.put("EPD_PUS_TM", epdPusTmFormat);
		tmFormats.put("EPD_PUS_TM_DATA", epdPusDataDataTmFormat);
		
		Collection<GSSFilterMintermFilter> filtersLevel0 = null;
		try {
			filtersLevel0 = GSSGenerator.getFiltersLevel0(database, ccsdsTmFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		filtersLevel0.add(epdCcsdsFilter);
		
		Collection<GSSFilterMintermFilter> filtersLevel1 = null;
		try {
			filtersLevel1 = GSSGenerator.getFiltersLevel1(database, epdPusTmFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSFilterMintermFilter> filtersLevel2 = null;
		try {
			filtersLevel2 = GSSGenerator.getFiltersLevel2(database, tmFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSImportImport> imports = new HashSet<GSSImportImport>();
		imports.add(epdPusFromCcsdsImport);
		imports.add(epdPusDataFromEpdPusImport);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource folder = root.findMember(output);
		
		if (folder == null || (folder instanceof IFolder) == false) {
			throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + output + "' not found!"));
		}
		
		Map<String, String> ZID_tc_type = new HashMap<String, String>();
		Map<String, String> YID_tm_type = new HashMap<String, String>();
		if(useTypeInsteadOfId) {
			for (GSSExportExport gssExportExport : exportsToLevel1) {
				String typeSubtype = "tc_";
				if(Integer.parseInt(gssExportExport.getName().substring(5, 8)) >= 500) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += gssExportExport.getSettings().getSettingFromConst().get(3).getValue() + "_"
						 + gssExportExport.getSettings().getSettingFromConst().get(4).getValue();
				ZID_tc_type.put(gssExportExport.getName(), typeSubtype);
			}

			Map<String, String> PI1_Val = new HashMap<String, String>();
			for (GSSFilterMintermFilter gssFilterMintermFilter : filtersLevel2) {
				PI1_Val.put(gssFilterMintermFilter.getName(),
						gssFilterMintermFilter.getBoolVar().get(0).getConstant().getValue());
			}
			for (GSSFilterMintermFilter gssFilterMintermFilter : filtersLevel1) {
				String typeSubtype = "tm_";
				if(Integer.parseInt(gssFilterMintermFilter.getName().substring(5, 8)) < 700) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += gssFilterMintermFilter.getBoolVar().get(0).getConstant().getValue() + "_"
						 + gssFilterMintermFilter.getBoolVar().get(1).getConstant().getValue();
				if(PI1_Val.get(gssFilterMintermFilter.getName()) != null) {
					typeSubtype += "_" + PI1_Val.get(gssFilterMintermFilter.getName());
				}
				YID_tm_type.put(gssFilterMintermFilter.getName(), typeSubtype);
			}
		}
		
		for (GSSTmTcFormatTmTcFormat gssTmTcFormatTmTcFormat : tcFormats.values()) {

			if((useTypeInsteadOfId) && (gssTmTcFormatTmTcFormat.getName().compareTo("CCSDS_TC") != 0)
					 && (gssTmTcFormatTmTcFormat.getName().compareTo("EPD_PUS_TC") != 0)) {
				gssTmTcFormatTmTcFormat.setName(ZID_tc_type.get(gssTmTcFormatTmTcFormat.getName()));
			}
			gssTmTcFormatTmTcFormat.setUri("es.uah.aut.srg." + gssTmTcFormatTmTcFormat.getName());
			
			String formatName = "tcFormats\\" + gssTmTcFormatTmTcFormat.getName() + ".gss_tm_tc_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTmTcFormatTmTcFormat,
					"es::uah::aut::srg::gss::generator::templates::tm_tc_formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
		
		for (GSSExportExport gssExportExport : exportsToLevel0) {

			if(useTypeInsteadOfId)
				gssExportExport.setName(ZID_tc_type.get(gssExportExport.getName())); 
		
			gssExportExport.setName(gssExportExport.getName() + "_export_to_level_0");
			gssExportExport.setUri("es.uah.aut.srg." + gssExportExport.getName());
			
			String exportName = "exportsToLevel0\\" + gssExportExport.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssExportExport,
					"es::uah::aut::srg::gss::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
		
		for (GSSExportExport gssExportExport : exportsToLevel1) {

			if(useTypeInsteadOfId)
				gssExportExport.setName(ZID_tc_type.get(gssExportExport.getName())); 
			    	
	    	if(gssExportExport.getSettings().getSettingFromConst().get(2).getValue().compareTo("9") == 0) {
	    		gssExportExport.setName(gssExportExport.getName() + "_export_to_level_1_ack");
	    	}
	    	else {
	    		gssExportExport.setName(gssExportExport.getName() + "_export_to_level_1");
	    	}
			gssExportExport.setUri("es.uah.aut.srg." + gssExportExport.getName());
		
			String exportName = "exportsToLevel1\\" + gssExportExport.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssExportExport,
					"es::uah::aut::srg::gss::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
		
		for (GSSTmTcFormatTmTcFormat gssTmTcFormatTmTcFormat : tmFormats.values()) {

			if((useTypeInsteadOfId) && (gssTmTcFormatTmTcFormat.getName().compareTo("CCSDS_TM") != 0)
					 && (gssTmTcFormatTmTcFormat.getName().compareTo("EPD_PUS_TM") != 0)
					 && (gssTmTcFormatTmTcFormat.getName().compareTo("EPD_PUS_TM_DATA") != 0)) {
				gssTmTcFormatTmTcFormat.setName(YID_tm_type.get(gssTmTcFormatTmTcFormat.getName()));
			}
			gssTmTcFormatTmTcFormat.setUri("es.uah.aut.srg." + gssTmTcFormatTmTcFormat.getName());
		
			String formatName = "tmFormats\\" + gssTmTcFormatTmTcFormat.getName() + ".gss_tm_tc_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTmTcFormatTmTcFormat,
					"es::uah::aut::srg::gss::generator::templates::tm_tc_formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
		
		for (GSSFilterMintermFilter gssFilterMintermFilter : filtersLevel0) {

			if(gssFilterMintermFilter.getName().compareTo("EPD_CCSDS_TM") != 0) {

				if(useTypeInsteadOfId)
					gssFilterMintermFilter.setName(YID_tm_type.get(gssFilterMintermFilter.getName())); 
				
				gssFilterMintermFilter.setName(gssFilterMintermFilter.getName() + "_filter_level_0");
				gssFilterMintermFilter.setUri("es.uah.aut.srg." + gssFilterMintermFilter.getName());
			}
		
			String filterName = "filtersLevel0\\" + gssFilterMintermFilter.getName() + ".gss_filters";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssFilterMintermFilter,
					"es::uah::aut::srg::gss::generator::templates::filtersSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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

		for (GSSFilterMintermFilter gssFilterMintermFilter : filtersLevel1) {
			
			if(useTypeInsteadOfId)
				gssFilterMintermFilter.setName(YID_tm_type.get(gssFilterMintermFilter.getName())); 
			
			gssFilterMintermFilter.setName(gssFilterMintermFilter.getName() + "_filter_level_1");
			gssFilterMintermFilter.setUri("es.uah.aut.srg." + gssFilterMintermFilter.getName());
		
			String filterName = "filtersLevel1\\" + gssFilterMintermFilter.getName() + ".gss_filters";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssFilterMintermFilter,
					"es::uah::aut::srg::gss::generator::templates::filtersSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
		
		for (GSSFilterMintermFilter gssFilterMintermFilter : filtersLevel2) {
			
			if(useTypeInsteadOfId)
				gssFilterMintermFilter.setName(YID_tm_type.get(gssFilterMintermFilter.getName())); 
			
			gssFilterMintermFilter.setName(gssFilterMintermFilter.getName() + "_filter_level_2");
			gssFilterMintermFilter.setUri("es.uah.aut.srg." + gssFilterMintermFilter.getName());
		
			String filterName = "filtersLevel2\\" + gssFilterMintermFilter.getName() + ".gss_filters";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssFilterMintermFilter,
					"es::uah::aut::srg::gss::generator::templates::filtersSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
		
		for (GSSImportImport gSSImportImport : imports) {
		
			String importName = "imports\\" + gSSImportImport.getName() + ".gss_imports";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gSSImportImport,
					"es::uah::aut::srg::gss::generator::templates::importsSerializer::Serializer", 
					false, importName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
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
}