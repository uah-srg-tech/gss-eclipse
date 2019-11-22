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
import es.uah.aut.srg.gss.export.GSSExportActivateDICs;
import es.uah.aut.srg.gss.export.GSSExportDIC;
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.export.GSSExportSettings;
import es.uah.aut.srg.gss.export.GSSExportSizeInBits;
import es.uah.aut.srg.gss.export.GSSExportSizes;
import es.uah.aut.srg.gss.export.GSSExportUnit;
import es.uah.aut.srg.gss.export.exportFactory;
import es.uah.aut.srg.gss.filter.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.filter.filterFactory;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.import_.importFactory;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatFormatType;
import es.uah.aut.srg.gss.format.formatFactory;
import es.uah.aut.srg.gss.xtext.xml.XMLGeneratorUtil;

public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	static final boolean createXMI=true;
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		boolean useTypeInsteadOfId = true;

		//create common ccsds/pus formats, filters and imports
		GSSFormatFormat ccsdsTcFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		ccsdsTcFormat.setName("CCSDS_TC");
		ccsdsTcFormat.setDescription("CCSDS_TC");
		ccsdsTcFormat.setUri("es.uah.aut.srg.CCSDS_TC");
		ccsdsTcFormat.setVersion("v1");
		ccsdsTcFormat.setProtocol("CCSDS");
		ccsdsTcFormat.setType(GSSFormatFormatType.TC);
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
		
		GSSFormatFormat epdPusTcFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		epdPusTcFormat.setName("EPD_PUS_TC");
		epdPusTcFormat.setDescription("EPD_PUS_TC");
		epdPusTcFormat.setUri("es.uah.aut.srg.EPD_PUS_TC");
		epdPusTcFormat.setVersion("v1");
		epdPusTcFormat.setProtocol("PUS");
		epdPusTcFormat.setType(GSSFormatFormatType.TC);
		GSSGenerator.createCSField(epdPusTcFormat, 0, 0, "SecondaryHeader", null, 4*8, 0);
		GSSGenerator.createCSField(epdPusTcFormat, 1, 0, "CCSDSSecondaryHeaderFlag", null, 1, 0);
		GSSGenerator.createCSField(epdPusTcFormat, 2, 0, "PUSVersion", null, 3, 1);
		GSSGenerator.createCSField(epdPusTcFormat, 3, 0, "ACK", null, 4, 4);
		GSSGenerator.createCSField(epdPusTcFormat, 4, 0, "ServiceType", null, 1*8, 1*8);
		GSSGenerator.createCSField(epdPusTcFormat, 5, 0, "ServiceSubtype", null, 1*8, 2*8);
		GSSGenerator.createCSField(epdPusTcFormat, 6, 0, "SourceID", null, 1*8, 3*8);
		GSSGenerator.createVSField(epdPusTcFormat, 7, 7, "ApplicationData", null, 0, 8, 8, 236*8, 4*8);
		GSSGenerator.createVRFieldSize(epdPusTcFormat, 8, 7, "AppDataLength");
		
    	GSSExportExport epdExportPusToLevel0 = exportFactory.eINSTANCE.createGSSExportExport();
    	epdExportPusToLevel0.setName("EPD_PUS_TC_TO_CCSDS_TC");
    	epdExportPusToLevel0.setUri("es.uah.aut.srg.EPD_PUS_TC_TO_CCSDS_TC");
    	epdExportPusToLevel0.setVersion("v1");
    	epdExportPusToLevel0.setFrom(epdPusTcFormat);
    	epdExportPusToLevel0.setTo(ccsdsTcFormat);
    	GSSExportSizes epdExportPusToLevel0Sizes = exportFactory.eINSTANCE.createGSSExportSizes();
    	GSSExportSizeInBits epdExportPusToLevel0SizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
    	epdExportPusToLevel0SizeInBits.setId("0");
    	epdExportPusToLevel0SizeInBits.setFrom("ApplicationData");
    	epdExportPusToLevel0SizeInBits.setAddSize("5");
    	epdExportPusToLevel0SizeInBits.setUnit(GSSExportUnit.BYTES);
    	epdExportPusToLevel0Sizes.getSizeInBits().add(epdExportPusToLevel0SizeInBits);
    	epdExportPusToLevel0.setSizes(epdExportPusToLevel0Sizes);
    	GSSExportSettings epdExportPusToCcsdsSettings = exportFactory.eINSTANCE.createGSSExportSettings();
    	GSSGenerator.createExportSettingFromField(epdExportPusToCcsdsSettings, epdPusTcFormat.getCSField().get(0), ccsdsTcFormat.getCSField().get(12));//SecondaryHeader
    	GSSGenerator.createExportSettingFromField(epdExportPusToCcsdsSettings, epdPusTcFormat.getVSField().get(0), ccsdsTcFormat.getVSField().get(2));//ApplicationData
    	GSSGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "0", ccsdsTcFormat.getCSField().get(2));//VersionNumber
    	GSSGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "1", ccsdsTcFormat.getCSField().get(3));//Type
    	GSSGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "1", ccsdsTcFormat.getCSField().get(4));//DFHFlag
    	GSSGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "812", ccsdsTcFormat.getCSField().get(5));//APID
    	GSSGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "3", ccsdsTcFormat.getCSField().get(9));//SequenceFlag
    	GSSGenerator.createExportSettingFromSize(epdExportPusToCcsdsSettings, "0", ccsdsTcFormat.getCSField().get(11));//PacketLength
    	epdExportPusToLevel0.setSettings(epdExportPusToCcsdsSettings);
    	GSSExportActivateDICs activateDICs = exportFactory.eINSTANCE.createGSSExportActivateDICs();
    	GSSExportDIC cssdsDic = exportFactory.eINSTANCE.createGSSExportDIC();
    	cssdsDic.setId("0");
    	cssdsDic.setDICRef("CRC");
    	activateDICs.getDIC().add(cssdsDic);
    	epdExportPusToLevel0.setActivateDICs(activateDICs);
		
		GSSFormatFormat ccsdsTmFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		ccsdsTmFormat.setName("CCSDS_TM");
		ccsdsTmFormat.setDescription("CCSDS_TM");
		ccsdsTmFormat.setUri("es.uah.aut.srg.CCSDS_TM");
		ccsdsTmFormat.setVersion("v1");
		ccsdsTmFormat.setProtocol("CCSDS");
		ccsdsTmFormat.setType(GSSFormatFormatType.TM);
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
		
		GSSFormatFormat epdPusTmFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		epdPusTmFormat.setName("EPD_PUS_TM");
		epdPusTmFormat.setDescription("EPD_PUS_TM");
		epdPusTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM");
		epdPusTmFormat.setVersion("v1");
		epdPusTmFormat.setProtocol("PUS");
		epdPusTmFormat.setType(GSSFormatFormatType.TM);
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
		
		GSSFormatFormat epdPusDataDataTmFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		epdPusDataDataTmFormat.setName("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setDescription("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setVersion("v1");
		epdPusDataDataTmFormat.setProtocol("PUS_DATA");
		epdPusDataDataTmFormat.setType(GSSFormatFormatType.TM);
		GSSGenerator.createVSField(epdPusDataDataTmFormat, 0, 0, "SourceData", null, 0, 1, 8, 4096*8, 10*8);
		GSSGenerator.createVRFieldSize(epdPusDataDataTmFormat, 1, 0, "SourceDataLength");
		
		GSSFilterMintermFilter epdCcsdsFilter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
		epdCcsdsFilter.setName("EPD_CCSDS_TM");
		epdCcsdsFilter.setDescription("EPD_CCSDS_TM");
		epdCcsdsFilter.setUri("es.uah.aut.srg.EPD_CCSDS_TM");
		epdCcsdsFilter.setVersion("v1");
		epdCcsdsFilter.setFormatFile(ccsdsTmFormat);//CCSDS
		GSSGenerator.createMintermFilterBoolVar(epdCcsdsFilter, "0", ccsdsTmFormat.getCSField().get(2), "0");//Version
		GSSGenerator.createMintermFilterBoolVarFDIC(epdCcsdsFilter, "1", ccsdsTmFormat.getFDICField().get(0));//CRC
		GSSGenerator.createMintermFilterMinterm(epdCcsdsFilter, "0", 0, 2);
		
		GSSFilterMintermFilter epdPusFilter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
		epdPusFilter.setName("EPD_PUS_TM");
		epdPusFilter.setDescription("EPD_PUS_TM");
		epdPusFilter.setUri("es.uah.aut.srg.EPD_PUS_TM");
		epdPusFilter.setVersion("v1");
		epdPusFilter.setFormatFile(epdPusTmFormat);//CCSDS
		GSSGenerator.createMintermFilterBoolVar(epdPusFilter, "0", epdPusTmFormat.getCSField().get(2), "1");//PUSVersion
		GSSGenerator.createMintermFilterMinterm(epdPusFilter, "0", 0, 1);
		
		GSSImportImport epdPusFromCcsdsImport = importFactory.eINSTANCE.createGSSImportImport();
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
		
		GSSImportImport epdPusDataFromEpdPusImport = importFactory.eINSTANCE.createGSSImportImport();
		epdPusDataFromEpdPusImport.setName("EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setDescription("EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setUri("es.uah.aut.srg.EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setVersion("v1");
		epdPusDataFromEpdPusImport.setFrom(epdPusTmFormat);
		epdPusDataFromEpdPusImport.setTo(epdPusDataDataTmFormat);
		GSSGenerator.createImportDataSource(epdPusDataFromEpdPusImport, epdPusTmFormat.getVSField().get(0), "0", "0");//SourceData
		epdPusDataFromEpdPusImport.setVirtualSize(null);

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
		tcFormats.put("CCSDS_TC", ccsdsTcFormat);
		tcFormats.put("EPD_PUS_TC", epdPusTcFormat);
		
		Collection<GSSExportExport> exportsToLevel0 = null;
		try {
			exportsToLevel0 = GSSGenerator.getExportsToLevel0(database, ccsdsTcFormat, epdPusTcFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		exportsToLevel0.add(epdExportPusToLevel0);
		
		Collection<GSSExportExport> exportsToLevel1 = null;
		try {
			exportsToLevel1 = GSSGenerator.getExportsToLevel1(database, tcFormats);
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
		filtersLevel1.add(epdPusFilter);
		
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
		
		//get type/subtype names mapped to DB ID
		Map<String, String> ZID_tc_type = new HashMap<String, String>();
		Map<String, String> YID_tm_type = new HashMap<String, String>();
		if(useTypeInsteadOfId) {
			for (GSSExportExport GSSExportExport : exportsToLevel1) {
				String typeSubtype = "tc_";
				if(Integer.parseInt(GSSExportExport.getName().substring(5, 8)) >= 500) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += GSSExportExport.getSettings().getSettingFromConst().get(3).getValue() + "_"
						 + GSSExportExport.getSettings().getSettingFromConst().get(4).getValue();
				//warning! SIS has several same type+subtype for different tcs
				//change the name of one at least
				if(GSSExportExport.getName().compareTo("ZID52377") == 0) {//tc 129.152 1W
					typeSubtype += "_w";
				}
				else if(GSSExportExport.getName().compareTo("ZID52378") == 0) {//tc 129.152 1L
					typeSubtype += "_l";
				}
				ZID_tc_type.put(GSSExportExport.getName(), typeSubtype);
			}

			Map<String, String> PI1_Val = new HashMap<String, String>();
			for (GSSFilterMintermFilter GSSFilterMintermFilter : filtersLevel2) {
				PI1_Val.put(GSSFilterMintermFilter.getName(),
						GSSFilterMintermFilter.getBoolVar().get(0).getConstant().getValue());
			}
			for (GSSFilterMintermFilter GSSFilterMintermFilter : filtersLevel1) {
				if(GSSFilterMintermFilter.getName().substring(0, 3).compareTo("EPD") == 0) {
					continue;
				}
				String typeSubtype = "tm_";
				if(Integer.parseInt(GSSFilterMintermFilter.getName().substring(5, 8)) < 700) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += GSSFilterMintermFilter.getBoolVar().get(0).getConstant().getValue() + "_"
						 + GSSFilterMintermFilter.getBoolVar().get(1).getConstant().getValue();
				if(PI1_Val.get(GSSFilterMintermFilter.getName()) != null) {
					typeSubtype += "_" + PI1_Val.get(GSSFilterMintermFilter.getName());
				}
				//warning! SIS has several same type+subtype for different tms
				//change the name of one at least
				if(GSSFilterMintermFilter.getName().compareTo("YID52970") == 0) {//tm 129.224 ASW
					typeSubtype += "_asw";
				}
				YID_tm_type.put(GSSFilterMintermFilter.getName(), typeSubtype);
			}
		}

		//create final gss & xmi files
		for (GSSFormatFormat GSSFormatFormat : tcFormats.values()) {

			if((useTypeInsteadOfId) && (GSSFormatFormat.getName().compareTo("CCSDS_TC") != 0)
					 && (GSSFormatFormat.getName().compareTo("EPD_PUS_TC") != 0)) {
				GSSFormatFormat.setName(ZID_tc_type.get(GSSFormatFormat.getName()));
			}
			GSSFormatFormat.setUri("es.uah.aut.srg." + GSSFormatFormat.getName());

			String formatName = "tcFormats\\" + GSSFormatFormat.getName() + ".gss_format";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSFormatFormat,
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
		
		for (GSSExportExport GSSExportExport : exportsToLevel0) {

			if(GSSExportExport.getName().compareTo("EPD_PUS_TC_TO_CCSDS_TC") != 0) {

				if(useTypeInsteadOfId)
					GSSExportExport.setName(ZID_tc_type.get(GSSExportExport.getName())); 

				GSSExportExport.setName(GSSExportExport.getName() + "_export_to_level_0");
				GSSExportExport.setUri("es.uah.aut.srg." + GSSExportExport.getName());
			}
			
			String exportName = "exportsToLevel0\\" + GSSExportExport.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSExportExport,
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
		
		for (GSSExportExport GSSExportExport : exportsToLevel1) {

			if(useTypeInsteadOfId)
				GSSExportExport.setName(ZID_tc_type.get(GSSExportExport.getName())); 
			    	
	    	if(GSSExportExport.getSettings().getSettingFromConst().get(2).getValue().compareTo("9") == 0) {
	    		GSSExportExport.setName(GSSExportExport.getName() + "_export_to_level_1_ack");
	    	}
	    	else {
	    		GSSExportExport.setName(GSSExportExport.getName() + "_export_to_level_1");
	    	}
			GSSExportExport.setUri("es.uah.aut.srg." + GSSExportExport.getName());
		
			String exportName = "exportsToLevel1\\" + GSSExportExport.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSExportExport,
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
		
		for (GSSFormatFormat GSSFormatFormat : tmFormats.values()) {

			if((useTypeInsteadOfId) && (GSSFormatFormat.getName().compareTo("CCSDS_TM") != 0)
					 && (GSSFormatFormat.getName().compareTo("EPD_PUS_TM") != 0)
					 && (GSSFormatFormat.getName().compareTo("EPD_PUS_TM_DATA") != 0)) {
				GSSFormatFormat.setName(YID_tm_type.get(GSSFormatFormat.getName()));
			}
			GSSFormatFormat.setUri("es.uah.aut.srg." + GSSFormatFormat.getName());
		
			String formatName = "tmFormats\\" + GSSFormatFormat.getName() + ".gss_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSFormatFormat,
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
		
		for (GSSFilterMintermFilter GSSFilterMintermFilter : filtersLevel0) {

			if(GSSFilterMintermFilter.getName().compareTo("EPD_CCSDS_TM") != 0) {

				if(useTypeInsteadOfId)
					GSSFilterMintermFilter.setName(YID_tm_type.get(GSSFilterMintermFilter.getName())); 
				
				GSSFilterMintermFilter.setName(GSSFilterMintermFilter.getName() + "_filter_level_0");
				GSSFilterMintermFilter.setUri("es.uah.aut.srg." + GSSFilterMintermFilter.getName());
			}
		
			String filterName = "filtersLevel0\\" + GSSFilterMintermFilter.getName() + ".gss_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSFilterMintermFilter,
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

		for (GSSFilterMintermFilter GSSFilterMintermFilter : filtersLevel1) {

			if(GSSFilterMintermFilter.getName().compareTo("EPD_PUS_TM") != 0) {

				if(useTypeInsteadOfId)
					GSSFilterMintermFilter.setName(YID_tm_type.get(GSSFilterMintermFilter.getName())); 
				
				GSSFilterMintermFilter.setName(GSSFilterMintermFilter.getName() + "_filter_level_1");
				GSSFilterMintermFilter.setUri("es.uah.aut.srg." + GSSFilterMintermFilter.getName());
			}
		
			String filterName = "filtersLevel1\\" + GSSFilterMintermFilter.getName() + ".gss_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSFilterMintermFilter,
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
		
		for (GSSFilterMintermFilter GSSFilterMintermFilter : filtersLevel2) {
			
			if(useTypeInsteadOfId)
				GSSFilterMintermFilter.setName(YID_tm_type.get(GSSFilterMintermFilter.getName())); 
			
			GSSFilterMintermFilter.setName(GSSFilterMintermFilter.getName() + "_filter_level_2");
			GSSFilterMintermFilter.setUri("es.uah.aut.srg." + GSSFilterMintermFilter.getName());
		
			String filterName = "filtersLevel2\\" + GSSFilterMintermFilter.getName() + ".gss_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSFilterMintermFilter,
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
		
		for (GSSImportImport GSSImportImport : imports) {
		
			String importName = "imports\\" + GSSImportImport.getName() + ".gss_import";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), GSSImportImport,
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
	}
}