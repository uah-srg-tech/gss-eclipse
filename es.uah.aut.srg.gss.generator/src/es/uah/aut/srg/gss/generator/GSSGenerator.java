package es.uah.aut.srg.gss.generator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import es.uah.aut.srg.gss.format.GSSFormatCSField;
import es.uah.aut.srg.gss.format.GSSFormatCheckType;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.export.GSSExportActivateDICs;
import es.uah.aut.srg.gss.export.GSSExportDIC;
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingFromField;
import es.uah.aut.srg.gss.export.GSSExportSettingFromSize;
import es.uah.aut.srg.gss.export.GSSExportSettings;
import es.uah.aut.srg.gss.export.GSSExportSizeInBits;
import es.uah.aut.srg.gss.export.GSSExportSizes;
import es.uah.aut.srg.gss.export.GSSExportUnit;
import es.uah.aut.srg.gss.export.exportFactory;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVar;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef;
import es.uah.aut.srg.gss.filter.GSSFilterConstant;
import es.uah.aut.srg.gss.filter.GSSFilterConstantType;
import es.uah.aut.srg.gss.filter.GSSFilterFieldOp;
import es.uah.aut.srg.gss.filter.GSSFilterMinterm;
import es.uah.aut.srg.gss.filter.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.filter.GSSFilterOPType;
import es.uah.aut.srg.gss.filter.filterFactory;
import es.uah.aut.srg.gss.import_.GSSImportDataSource;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.import_.GSSImportUnit;
import es.uah.aut.srg.gss.import_.GSSImportVirtualSize;
import es.uah.aut.srg.gss.import_.importFactory;
import es.uah.aut.srg.gss.format.GSSFormatAField;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder;
import es.uah.aut.srg.gss.format.GSSFormatFieldToCheck;
import es.uah.aut.srg.gss.format.GSSFormatFieldType;
import es.uah.aut.srg.gss.format.GSSFormatFloatingOffset;
import es.uah.aut.srg.gss.format.GSSFormatBytesBits;
import es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit;
import es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck;
import es.uah.aut.srg.gss.format.GSSFormatFDICField;
import es.uah.aut.srg.gss.format.GSSFormatField;
import es.uah.aut.srg.gss.format.GSSFormatVRFieldSize;
import es.uah.aut.srg.gss.format.GSSFormatVariableSize;
import es.uah.aut.srg.gss.format.GSSFormatArrayDimension;
import es.uah.aut.srg.gss.format.GSSFormatArrayRef;
import es.uah.aut.srg.gss.format.GSSFormatUnit;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatFormatType;
import es.uah.aut.srg.gss.format.formatFactory;

public class GSSGenerator {
	
	public static final int MAX_APP_DATA_BYTES = 236;
	public static final int MAX_SRC_DATA_BYTES = 4096;
	public static final String CNAME_CRC = "NID00048";
	public static final String CNAME_CRC_HK = "NID00198";
	public static final String CNAME_CHECKSUM = "NID10413";
	
	public static Collection<GSSExportExport> getExportsToLevel0(String database,
			GSSFormatFormat ccsdsTcFormat, GSSFormatFormat epdPusTcFormat) throws IOException {

		Set<GSSExportExport> exportsToLevel0 = new HashSet<GSSExportExport>();
	    
		//process TC database tables and populate the collection
		
		//read TC format names from CCF table
		BufferedReader ccf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database + "\\ccf.dat")));
	    String ccf_line;
	    while ((ccf_line = ccf.readLine()) != null) {
	    	
	    	String[] ccf_rows = ccf_line.split("\t");
			
	    	GSSExportExport exportToLevel0 = exportFactory.eINSTANCE.createGSSExportExport();
	    	exportToLevel0.setName(ccf_rows[0]);
	    	exportToLevel0.setDescription(ccf_rows[1]);
	    	exportToLevel0.setVersion("v1");
	    	exportToLevel0.setFrom(epdPusTcFormat);
	    	exportToLevel0.setTo(ccsdsTcFormat);

	    	GSSExportSizes sizes = exportFactory.eINSTANCE.createGSSExportSizes();
	    	GSSExportSizeInBits sizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
	    	sizeInBits.setId("0");
	    	sizeInBits.setFrom("ApplicationData");
	    	sizeInBits.setAddSize("5");
	    	sizeInBits.setUnit(GSSExportUnit.BYTES);
	    	sizes.getSizeInBits().add(sizeInBits);
	    	exportToLevel0.setSizes(sizes);

	    	GSSExportSettings settings = exportFactory.eINSTANCE.createGSSExportSettings();
	    	createExportSettingFromField(settings, epdPusTcFormat.getCSField().get(0), ccsdsTcFormat.getCSField().get(12));//SecondaryHeader
	    	createExportSettingFromField(settings, epdPusTcFormat.getVSField().get(0), ccsdsTcFormat.getVSField().get(2));//ApplicationData
	    	createExportSettingFromConst(settings, "0", ccsdsTcFormat.getCSField().get(2));//VersionNumber
	    	createExportSettingFromConst(settings, "1", ccsdsTcFormat.getCSField().get(3));//Type
	    	createExportSettingFromConst(settings, "1", ccsdsTcFormat.getCSField().get(4));//DFHFlag
	    	createExportSettingFromConst(settings, ccf_rows[8], ccsdsTcFormat.getCSField().get(5));//APID
	    	createExportSettingFromConst(settings, "3", ccsdsTcFormat.getCSField().get(9));//SequenceFlag
	    	createExportSettingFromSize(settings, "0", ccsdsTcFormat.getCSField().get(11));//PacketLength
	    	exportToLevel0.setSettings(settings);

	    	GSSExportActivateDICs activateDICs = exportFactory.eINSTANCE.createGSSExportActivateDICs();
	    	
	    	GSSExportDIC cssdsDic = exportFactory.eINSTANCE.createGSSExportDIC();
	    	cssdsDic.setId("0");
	    	cssdsDic.setDICRef("CRC");
	    	activateDICs.getDIC().add(cssdsDic);
	    	
	    	exportToLevel0.setActivateDICs(activateDICs);
	    	
	    	exportsToLevel0.add(exportToLevel0);
	    }
		ccf.close();
	    
		return exportsToLevel0;
	}

	public static Collection<GSSExportExport> getExportsToLevel1(String database,
			Map<String, GSSFormatFormat> formats) throws IOException {

		Set<GSSExportExport> exportsToLevel1 = new HashSet<GSSExportExport>();
		GSSFormatFormat epdPusTcFormat = formats.get("EPD_PUS_TC");
		
		//read TC format names from CCF table
		BufferedReader ccf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database + "\\ccf.dat")));
	    String ccf_line;
	    while ((ccf_line = ccf.readLine()) != null) {
	    	
	    	String[] ccf_rows = ccf_line.split("\t");
			
	    	GSSExportExport exportToLevel1 = exportFactory.eINSTANCE.createGSSExportExport();
	    	exportToLevel1.setName(ccf_rows[0]);
	    	exportToLevel1.setDescription(ccf_rows[1]);
	    	exportToLevel1.setVersion("v1");
	    	exportToLevel1.setFrom(formats.get(ccf_rows[0]));
	    	exportToLevel1.setTo(epdPusTcFormat);

	    	GSSExportSizeInBits sizeInBits = null;
	    	if(formats.get(ccf_rows[0]).getVSField().size() != 0) {
		    	if(formats.get(ccf_rows[0]).getAField().size() == 0) {
		    		//csfields and vsfields: ZID52538 & ZID52540
			    	sizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
    				sizeInBits.setFrom("PID00075");
    				sizeInBits.setAddSize(formats.get(ccf_rows[0]).getVSField().get(0).getConstSize().getBytes());
    				//EPD PUS ApplicationData
		    	}
		    	else {
		    		//csfields, vsfields and afields
			    	sizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
					sizeInBits.setFrom("ApplicationData");
					sizeInBits.setAddSize("0");
		    	}
	    	}
	    	if(sizeInBits != null) {
	    		sizeInBits.setId("0");
	    		sizeInBits.setUnit(GSSExportUnit.BYTES);
	    		
		    	GSSExportSizes sizes = exportFactory.eINSTANCE.createGSSExportSizes();
	    		sizes.getSizeInBits().add(sizeInBits);
		    	exportToLevel1.setSizes(sizes);
	    	}

	    	GSSExportSettings settings = exportFactory.eINSTANCE.createGSSExportSettings();
	    	createExportSettingFromConst(settings, "0", epdPusTcFormat.getCSField().get(1));//CCSDSSecondaryHeaderFlag
	    	createExportSettingFromConst(settings, "1", epdPusTcFormat.getCSField().get(2));//PUSVersion
	    	createExportSettingFromConst(settings, ccf_rows[19], epdPusTcFormat.getCSField().get(3));//ACK
	    	createExportSettingFromConst(settings, ccf_rows[6], epdPusTcFormat.getCSField().get(4));//Type
	    	createExportSettingFromConst(settings, ccf_rows[7], epdPusTcFormat.getCSField().get(5));//Subtype
	    	createExportSettingFromConst(settings, "120", epdPusTcFormat.getCSField().get(6));//SourceID
	    	
	    	if(formats.get(ccf_rows[0]).getVSField().size() == 0) {
	    		//only csfields or not fields
	    		String appDataLengthValue;
		    	
	    		if(formats.get(ccf_rows[0]).getCSField().size() == 0) {
		    		appDataLengthValue = "0";
		    	}
		    	else {
		    		createExportSettingFromField(settings, formats.get(ccf_rows[0]).getCSField().get(0),
		    				epdPusTcFormat.getVSField().get(0));//EPD PUS ApplicationData
					appDataLengthValue = formats.get(ccf_rows[0]).getCSField().get(0).getSize().getBytes();
		    	}
	    		createExportSettingFromConst(settings, appDataLengthValue, epdPusTcFormat.getVRFieldSize().get(0));
	    	}
	    	else {
	    		//vsfields, (csfields, afields)
	    		createExportSettingFromField(settings, formats.get(ccf_rows[0]).getVSField().get(0),
	    				epdPusTcFormat.getVSField().get(0));//EPD PUS ApplicationData
		    	createExportSettingFromSize(settings, "0", epdPusTcFormat.getVRFieldSize().get(0));//AppDataLength
	    	}
	    	exportToLevel1.setSettings(settings);

	    	exportsToLevel1.add(exportToLevel1);
	    }
		ccf.close();
	    
		return exportsToLevel1;
	}
	
	public static Collection<GSSFilterMintermFilter> getFiltersLevel0(String database,
			GSSFormatFormat ccsdsTmFormat) throws IOException {

		Set<GSSFilterMintermFilter> filters = new HashSet<GSSFilterMintermFilter>();

		//read APID from PID table
		BufferedReader pid = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pid.dat")));
	    String pid_line;
	    while ((pid_line = pid.readLine()) != null) {
	    	
	    	String[] pid_rows = pid_line.split("\t");
		    
	    	GSSFilterMintermFilter filter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
	    	filter.setName("YID" + pid_rows[5]);//NAME
	    	filter.setDescription(pid_rows[6]);//DESCR
	    	filter.setVersion("v1");
	    	filter.setFormatFile(ccsdsTmFormat);

	    	createMintermFilterBoolVar(filter, "0", ccsdsTmFormat.getCSField().get(5), pid_rows[2]);//APID
			
	    	createMintermFilterMinterm(filter, "0", 0, 1);
	    	filters.add(filter);
	    }
	    pid.close();
		return filters;
	}
	
	public static Collection<GSSFilterMintermFilter> getFiltersLevel1(String database,
			GSSFormatFormat epdPusTmFormat) throws IOException {

		Set<GSSFilterMintermFilter> filters = new HashSet<GSSFilterMintermFilter>();

		//read TYPE & STYPE from PID table
		BufferedReader pid = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pid.dat")));
	    String pid_line;
	    while ((pid_line = pid.readLine()) != null) {
	    	
	    	String[] pid_rows = pid_line.split("\t");
		    
	    	GSSFilterMintermFilter filter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
	    	filter.setName("YID" + pid_rows[5]);//NAME
	    	filter.setDescription(pid_rows[6]);//DESCR
	    	filter.setVersion("v1");
	    	filter.setFormatFile(epdPusTmFormat);

	    	createMintermFilterBoolVar(filter, "0", epdPusTmFormat.getCSField().get(4), pid_rows[0]);//ServiceSubtype
	    	createMintermFilterBoolVar(filter, "1", epdPusTmFormat.getCSField().get(5), pid_rows[1]);//ServiceType

	    	createMintermFilterMinterm(filter, "0", 0, 2);
	    	filters.add(filter);
	    }
	    pid.close();
		return filters;
	}

	public static Collection<GSSFilterMintermFilter> getFiltersLevel2(String database,
			Map<String, GSSFormatFormat> formats) throws IOException {

		Set<GSSFilterMintermFilter> filters = new HashSet<GSSFilterMintermFilter>();
		
		//read PI1_OFF from PIC table
		Map<String, String> picTypeSubtype = new HashMap<String, String>();
		BufferedReader pic = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pic.dat")));
	    String pic_line;
	    while ((pic_line = pic.readLine()) != null) {
	    	
	    	String[] pic_rows = pic_line.split("\t");
	    	
	    	picTypeSubtype.put(pic_rows[0] + "_" + pic_rows[1], pic_rows[2]);
	    }
	    pic.close();
	    
		//read PI1_VAL from PID table only if PI1_OFF from PIC is not -1 
		BufferedReader pid = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pid.dat")));
	    String pid_line;
	    while ((pid_line = pid.readLine()) != null) {
	    	
	    	String[] pid_rows = pid_line.split("\t");
	    	
	    	if(picTypeSubtype.get(pid_rows[0] + "_" + pid_rows[1]).compareTo("-1") == 0) {
	    		continue;
	    	}

	    	GSSFormatField fieldRefPI1_val = null;
	    	if((formats.get("YID" + pid_rows[5]).getCSField().size() == 0) &&
	    			(formats.get("YID" + pid_rows[5]).getVSField().size() == 0)) {
	    		//if no fields -> empty format
	    		continue;
	    	}
	    	else if(formats.get("YID" + pid_rows[5]).getVSField().size() == 0) {
	    		//only csfields: get second csfield
	    		fieldRefPI1_val = formats.get("YID" + pid_rows[5]).getCSField().get(1);
	    	}
	    	else {
	    		//csfields and vsfields: get first csfield
	    		fieldRefPI1_val = formats.get("YID" + pid_rows[5]).getCSField().get(0);
	    	}
		    
	    	GSSFilterMintermFilter filter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
	    	filter.setName("YID" + pid_rows[5]);//NAME
	    	filter.setDescription(pid_rows[6]);//DESCR
	    	filter.setVersion("v1");
	    	filter.setFormatFile(formats.get("YID" + pid_rows[5]));
			
	    	createMintermFilterBoolVar(filter, "0", fieldRefPI1_val, pid_rows[3]);//PI1_VAL

	    	createMintermFilterMinterm(filter, "0", 0, 1);
	    	filters.add(filter);
	    }
	    pid.close();
		return filters;
	}
	
	public static Map<String, GSSFormatFormat> getTcFormats(String database) throws IOException {

		Map<String, GSSFormatFormat> formats = new HashMap<String, GSSFormatFormat>();
	    Integer constSizeBits = 0, fid = 0, n_max = 0;
	    Integer arrayFormatFieldRef = Integer.MAX_VALUE, lastArrayFormatFieldRef = 0;
	    Integer variableFormatField = Integer.MAX_VALUE, variableFormatFieldRef = Integer.MAX_VALUE;
	    String lastID = "";

		//process TC database tables and populate the collection
		
		//read TC format names from CCF table
		BufferedReader ccf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database + "\\ccf.dat")));
	    String ccf_line;
	    while ((ccf_line = ccf.readLine()) != null) {
	    	
	    	String[] ccf_rows = ccf_line.split("\t");
		    
			GSSFormatFormat format = formatFactory.eINSTANCE.createGSSFormatFormat();
			format.setName(ccf_rows[0]);//NAME
			format.setDescription(ccf_rows[0] + ": " + ccf_rows[1]);//NAME: DESCR
			format.setVersion("v1");
			format.setProtocol("EPD_PUS");
			format.setType(GSSFormatFormatType.TC);
			
			formats.put(ccf_rows[0], format);
	    	
	    }
		ccf.close();

		//read TC fields and field sizes from CDF table
		BufferedReader cdf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\cdf.dat")));
	    String cdf_line;
	    while ((cdf_line = cdf.readLine()) != null) {
	    	
	    	String[] cdf_rows = cdf_line.split("\t");
	    	Integer vbleSizeBits = 0, maxSizeBits = 0;
	    	if(cdf_rows[0].compareTo(lastID) != 0) {

	    		//new format, compare all fields to check if packet constant or variable
	    		constSizeBits = 0;
			    fid = 0;
		    	n_max = 0;
			    arrayFormatFieldRef = Integer.MAX_VALUE;
			    lastArrayFormatFieldRef = 0;
			    variableFormatField = Integer.MAX_VALUE;
			    variableFormatFieldRef = Integer.MAX_VALUE;
			    
	    		Integer countFields = 0;
	    		
	    		String cdf_same_format = cdf_line;
		    	cdf.mark(1500);
	    		do {
	    	    	String[] cdf_same_format_rows = cdf_same_format.split("\t");
	    	    	if(cdf_same_format_rows[0].compareTo(cdf_rows[0]) != 0) {
	    	    		break;
	    	    	}
	    	    	countFields++; 
	    	    	if(cdf_same_format_rows[3].compareTo("0") == 0) {//ELLEN
		    	    	variableFormatField = countFields;
		    	    	if(cdf_same_format_rows[0].compareTo("ZID52538") == 0) {
		    	    		variableFormatFieldRef = countFields-1;
		    	    	}
		    	    	else if(cdf_same_format_rows[0].compareTo("ZID52540") == 0) {
		    	    		variableFormatFieldRef = countFields+1;
		    	    	}
	    	    	}
	    	    	if(cdf_same_format_rows[5].compareTo("0") == 0) {//GRP_SIZE
			    		if((countFields > arrayFormatFieldRef) && (countFields <= lastArrayFormatFieldRef)){
			    			vbleSizeBits += Integer.parseInt(cdf_same_format_rows[3]);//ELLEN
			    		}
			    		else {
			    			constSizeBits += Integer.parseInt(cdf_same_format_rows[3]);//ELLEN
			    		}
			    	}
			    	else {
		    			constSizeBits += Integer.parseInt(cdf_same_format_rows[3]);//ELLEN
		    			arrayFormatFieldRef = countFields;
		    			lastArrayFormatFieldRef = countFields+1+Integer.parseInt(cdf_same_format_rows[5]);//GRP_SIZE
	    	    	}
	    	    }while ((cdf_same_format = cdf.readLine()) != null);
	    	    cdf.reset();

	    		GSSFormatFormat format = formats.get(cdf_rows[0]); 		
	    		if(format != null) {
	    			
			    	if((arrayFormatFieldRef == Integer.MAX_VALUE) && (variableFormatFieldRef == Integer.MAX_VALUE)) {
			    		//insert CSField ApplicationData
			    		createCSField(format, 0, 0, "ApplicationData", null, constSizeBits, 0);
			    	}
			    	else {
			    		//insert VSField ApplicationData
			    		Integer fidRef = 0;
			    		if(arrayFormatFieldRef != Integer.MAX_VALUE) {
			    			fidRef = arrayFormatFieldRef;
					    	n_max = (MAX_APP_DATA_BYTES*8 - constSizeBits) / vbleSizeBits;
				    		maxSizeBits = constSizeBits + n_max * vbleSizeBits;
			    		}
			    		else if(variableFormatFieldRef != Integer.MAX_VALUE) {
			    			fidRef = variableFormatFieldRef;
				    		maxSizeBits = MAX_APP_DATA_BYTES*8;
			    		}
		    			createVSField(format, 0, 0, "ApplicationData", null, constSizeBits, fidRef, vbleSizeBits,
		    					maxSizeBits, 0);
			    	}
		    	}
		    	lastID = cdf_rows[0];
	    	}
	    	fid++;
    		
    		GSSFormatFormat format = formats.get(cdf_rows[0]);
    		if(format != null) {
    			
        		String name, descr;
        		if(cdf_rows[6].length() == 0) {
        			name = cdf_rows[2];//DESCR
        			descr = null;
        		} else {
        			name = cdf_rows[6];//PNAME
        			descr = cdf_rows[2];//DESCR
        		}
        		
		    	if(fid == variableFormatField) {
		    		//insert VSFIELD
	    			createVSField(format, fid, 0, name, descr, 0, variableFormatFieldRef, vbleSizeBits,
	    					(MAX_APP_DATA_BYTES*8 - constSizeBits), Integer.parseInt(cdf_rows[4]));//BIT
		    		
		    		if(fid < variableFormatFieldRef) {
			    		//insert VRFIELDSIZE too
		        		if(cdf_rows[6].length() == 0) {
			    			name = cdf_rows[2] + "_length";//DESCR
							descr = null;
			    		} else {
			    			name = cdf_rows[6] + "_length";//PNAME
							descr = null;
			    		}
		    			createVRFieldSize(format, fid+1, fid, name);
		    		}
		    	}
		    	else if((fid > arrayFormatFieldRef) && (fid <= lastArrayFormatFieldRef)) {
		    		//insert AIFIELD
		    		createAIField(format, fid, 0, name, descr, arrayFormatFieldRef+1, Integer.parseInt(cdf_rows[3]),
		    				(Integer.parseInt(cdf_rows[4]) - constSizeBits));//ELLEN, BIT
		    	}
		    	else {
		    		//insert CSFIELD	    	
	    			createCSField(format, fid, 0, name, descr, Integer.parseInt(cdf_rows[3]), Integer.parseInt(cdf_rows[4]));//ELLEN, BIT
		    	}
    		
		    	if(fid == arrayFormatFieldRef) {
		    		//insert AFIELD too
	        		if(cdf_rows[6].length() == 0) {
		    			name = cdf_rows[2] + "_block";//DESCR
		    			descr = null;
		    		} else {
		    			name = cdf_rows[6] + "_block";//PNAME
		    			descr = null;
		    		}
			    	fid++;
			    	
	    			createAField(format, fid, 0, name, null, arrayFormatFieldRef, n_max, vbleSizeBits, 
	    					(Integer.parseInt(cdf_rows[4]) + Integer.parseInt(cdf_rows[3])));//BIT + ELLEN
		    	}
    		}
		}
		cdf.close();
		return formats;
	}

	public static Map<String, GSSFormatFormat> getTmFormats(String database) throws IOException {
		//process TM database tables and populate the collection

		Map<String, GSSFormatFormat> formats = new HashMap<String, GSSFormatFormat>();
	    Integer constSizeBits = 0, fid = 0, n_max = 0;
	    Integer arrayFormatFieldRef = Integer.MAX_VALUE, lastArrayFormatFieldRef = 0;
	    String lastID = "";
	    
		//read TM format names from PID table
		BufferedReader pid = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pid.dat")));
	    String pid_line;
	    while ((pid_line = pid.readLine()) != null) {
	    	
	    	String[] pid_rows = pid_line.split("\t");
		    
			GSSFormatFormat format = formatFactory.eINSTANCE.createGSSFormatFormat();
			format.setName("YID" + pid_rows[5]);//NAME
			format.setDescription("YID" + pid_rows[5] + ": " + pid_rows[6]);//NAME: DESCR
			format.setVersion("v1");
			format.setProtocol("EPD_PUS");
			format.setType(GSSFormatFormatType.TM);
			
			formats.put("YID" + pid_rows[5], format);
	    	
	    }
	    pid.close();

		//read TM field sizes from PCF table
		Map<String, Integer> tmSizes = new HashMap<String, Integer>();
		Map<String, String> tmDescr = new HashMap<String, String>();
		
		BufferedReader pcf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pcf.dat")));
	    String pcf_line;
	    while ((pcf_line = pcf.readLine()) != null) {
	    	
	    	String[] pcf_rows = pcf_line.split("\t");
		    Integer sizeBits = getSizeBitsFromPtcFfc(Integer.parseInt(pcf_rows[4]), Integer.parseInt(pcf_rows[5]));
			tmSizes.put(pcf_rows[0], sizeBits);
			tmDescr.put(pcf_rows[0], pcf_rows[1]);
	    }
	    pcf.close();

		//read TM fields from PLF table (fixed packets)
		BufferedReader plf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\plf.dat")));
	    String plf_line;
	    while ((plf_line = plf.readLine()) != null) {
	    	
	    	String[] plf_rows = plf_line.split("\t");
	    	
	    	if((plf_rows[0].compareTo(CNAME_CRC) == 0) ||
	    			(plf_rows[0].compareTo(CNAME_CRC_HK) == 0) ||
	    			(plf_rows[0].compareTo(CNAME_CHECKSUM) == 0)) {
	    		continue;
	    	}

	    	if(plf_rows[1].compareTo(lastID) != 0) {
	    		
	    		//new format, compare all fields to check if packet constant or variable
			    fid = 0;
		    	Integer sizeBits = 0;
		    	
	    		String plf_same_format = plf_line;
		    	plf.mark(7000);
	    		do {
	    	    	String[] plf_same_format_rows = plf_same_format.split("\t");
    		    	if((plf_same_format_rows[0].compareTo(CNAME_CRC) == 0) ||
    		    			(plf_same_format_rows[0].compareTo(CNAME_CRC_HK) == 0) ||
    		    			(plf_same_format_rows[0].compareTo(CNAME_CHECKSUM) == 0)) {
	    	    		continue;
	    	    	}
	    	    	
	    	    	if(plf_same_format_rows[1].compareTo(plf_rows[1]) != 0) {
	    	    		break;
	    	    	}
	        		sizeBits += tmSizes.get(plf_same_format_rows[0]);
	    	    }while ((plf_same_format = plf.readLine()) != null);
	    		plf.reset();

	    		GSSFormatFormat format = formats.get("YID" + plf_rows[1]);
	    		if(format != null) {
		    		//insert CSField SourceData
		    		createCSField(format, 0, 0, "SourceData", null, sizeBits, 0);
	    		}
		    	lastID = plf_rows[1];
	    	}
	    	fid++;

    		//insert CSFIELD
    		GSSFormatFormat format = formats.get("YID" + plf_rows[1]);
    		if(format != null) {
        		Integer offsetBits = (Integer.parseInt(plf_rows[2]) - 16) * 8 + Integer.parseInt(plf_rows[3]);
        		//(OFFBY - CCSDS + PUS HEADER) * 8 + OFFBI
	    		createCSField(format, fid, 0, plf_rows[0], tmDescr.get(plf_rows[0]), tmSizes.get(plf_rows[0]), offsetBits);
    		}
	    }
	    plf.close();

		//read TM fields from VPD table (variable packets)
		BufferedReader vpd = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\vpd.dat")));
	    String vpd_line;
	    Integer offsetBits = 0, vbleSizeBits = 0;
	    while ((vpd_line = vpd.readLine()) != null) {

	    	String[] vpd_rows = vpd_line.split("\t");
	    	Integer maxSizeBits = 0, last_NIDG_field = 0;

	    	if((vpd_rows[2].compareTo(CNAME_CRC) == 0) ||
	    			(vpd_rows[2].compareTo(CNAME_CRC_HK) == 0) ||
	    			(vpd_rows[2].compareTo(CNAME_CHECKSUM) == 0)) {
	    		continue;
	    	}

	    	if(vpd_rows[0].compareTo(lastID) != 0) {

	    		//new format, compare all fields to check if packet constant or variable
	    		constSizeBits = 0;
	    		vbleSizeBits = 0;
			    fid = 0;
		    	n_max = 0;
			    arrayFormatFieldRef = Integer.MAX_VALUE;
			    lastArrayFormatFieldRef = 0;
			    
		    	Integer countFields = 0;
	    		String vpd_same_format = vpd_line;
	    		vpd.mark(7000);
	    		do {

	    	    	String[] vpd_same_format_rows = vpd_same_format.split("\t");
	    	    	if((vpd_same_format_rows[2].compareTo(CNAME_CRC) == 0) ||
	    	    			(vpd_same_format_rows[2].compareTo(CNAME_CRC_HK) == 0) ||
	    	    			(vpd_same_format_rows[2].compareTo(CNAME_CHECKSUM) == 0)) {
	    	    		continue;
	    	    	}
	    	    	countFields++; 
	    	    	
	    	    	if(vpd_same_format_rows[0].compareTo(vpd_rows[0]) != 0) {
	    	    		break;
	    	    	}

			    	if(vpd_same_format_rows[3].compareTo("0") == 0) {//GRP_SIZE
			    		if (vpd_same_format_rows[2].substring(0, 4).compareTo("NIDD") != 0) {
				    		if((countFields > arrayFormatFieldRef) && (countFields <= lastArrayFormatFieldRef)){
				    			vbleSizeBits += tmSizes.get(vpd_same_format_rows[2]);
				    		}
				    		else {
				    			constSizeBits += tmSizes.get(vpd_same_format_rows[2]);
				    		}
			    		}
			    	}
			    	else {
		    			constSizeBits += tmSizes.get(vpd_same_format_rows[2]);
		    			arrayFormatFieldRef = countFields;
		    			lastArrayFormatFieldRef = countFields+1+Integer.parseInt(vpd_same_format_rows[3]);//GRP_SIZE
			    	}
	    	    }while ((vpd_same_format = vpd.readLine()) != null);
	    		vpd.reset();
	    	    
	    		//insert VSField SourceData
		    	n_max = (MAX_SRC_DATA_BYTES*8 - constSizeBits) / vbleSizeBits;
	    		maxSizeBits = constSizeBits + n_max * vbleSizeBits;
	    		
	    		GSSFormatFormat format = formats.get("YID" + vpd_rows[0]);
	    		if(format != null) {
	    			createVSField(format, 0, 0, "SourceData", null, constSizeBits, arrayFormatFieldRef, vbleSizeBits,
	    					maxSizeBits, 0);//BIT
	    		}
	    		
			    offsetBits = 0;
		    	lastID = vpd_rows[0];
		    	last_NIDG_field = 0;
	    	}
	    	fid++;

    		GSSFormatFormat format = formats.get("YID" + vpd_rows[0]);
    		if(format != null) {
    			
		    	if((fid > arrayFormatFieldRef) && (fid <= lastArrayFormatFieldRef)){
		    		//insert AIFIELD
		    		offsetBits += Integer.parseInt(vpd_rows[13]);
		    		
		    		createAIField(format, fid, 0, vpd_rows[2], tmDescr.get(vpd_rows[2]), arrayFormatFieldRef+1,
		    				tmSizes.get(vpd_rows[2]), offsetBits);
		    	}
		    	else {
		    		//insert CSFIELD
	    			Integer pfid = 0;
	    			if(vpd_rows[2].substring(0, 4).compareTo("NIDD") == 0) {
	    				pfid = last_NIDG_field;
	    			}
	    			else {
	    				last_NIDG_field = fid;
	    			}
		    		offsetBits += Integer.parseInt(vpd_rows[13]);
	    			
		    		createCSField(format, fid, pfid, vpd_rows[2], tmDescr.get(vpd_rows[2]), tmSizes.get(vpd_rows[2]), offsetBits);
		    	}
		    	
		    	if(fid == arrayFormatFieldRef) {
		    		//insert AFIELD too
			    	fid++;
			    	
		    		//add current field offset bits for getting AField Offset 
			    	offsetBits += tmSizes.get(vpd_rows[2]);
			    	
	    			createAField(format, fid, 0, vpd_rows[2] + "_block", null, arrayFormatFieldRef, n_max, vbleSizeBits, 
	    					offsetBits);//BIT + ELLEN

		    		//reset offset bits for Local Offset
			    	offsetBits = 0;
		    		
		    	}
		    	else {
					//previous offset + db offset value
			    	offsetBits += tmSizes.get(vpd_rows[2]);
		    	}
	    	}
	    }
	    vpd.close();
	    
		return formats;
	}

	public static Integer getSizeBitsFromPtcFfc(Integer ptc, Integer pfc) {
		Integer length = 0;
		switch(ptc)
		{
			case 1:
				length = 1;
				break;
	
			case 2: case 6:
				length = pfc;
				break;
	
			case 3: case 4:
				switch (pfc)
				{
					case 13:
						length = 24;
						break;
					case 14:
						length = 32;
						break;
					default:
						length = 4+pfc;
						break;
	
				}
				break;
	
			case 7: case 8:
				length = pfc * 8;
				break;
	
			case 9:
				switch (pfc)
				{
					case 15:
						length = 48;
						break;
					case 17:
						length = 32;
						break;
					default:
						break;
	
				}
				break;
	
			default:
				break;
		}
		return length;
	}

	public static GSSFormatUnit getVariableFieldUnitText(Integer variable_field_length_bits) {
		GSSFormatUnit ret = GSSFormatUnit.BYTES;
		
		switch(variable_field_length_bits)
		{
			case 1:
				ret = GSSFormatUnit.BITS;
				break;
			case 16:
				ret = GSSFormatUnit.HALFWORD;
				break;
			case 80:
				ret = GSSFormatUnit.STRING10;
				break;
			case 136:
				ret = GSSFormatUnit.STRING17;
				break;
			case 552:
				ret = GSSFormatUnit.STRING69;
				break;
			default: case 8:
				break;
		}
		return ret;
	}

	public static void createVSField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer constSizeBits, Integer fidRef, Integer vbleSizeBits, Integer maxSizeBits, Integer offsetBits) {

		GSSFormatVSField vsfield = formatFactory.eINSTANCE.createGSSFormatVSField();
		vsfield.setFid(Integer.toString(fid));
		vsfield.setPfid(Integer.toString(pfid));
		vsfield.setName(name);
		vsfield.setDescription(descr);
		vsfield.setType(GSSFormatFieldType.STRUCTURED);
		vsfield.setByteOrder(GSSFormatFieldByteOrder.BIG_ENDIAN);
		vsfield.setFirstBit(GSSFormatSFieldFirstBit.MSB);
		
		GSSFormatBytesBits formatConstSize = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatConstSize.setBytes(Integer.toString(constSizeBits/8));
		formatConstSize.setBits(Integer.toString(constSizeBits%8));
		vsfield.setConstSize(formatConstSize);
		
		GSSFormatVariableSize formatVariableSize = formatFactory.eINSTANCE.createGSSFormatVariableSize();
		formatVariableSize.setFidRef(Integer.toString(fidRef));
		formatVariableSize.setUnit(getVariableFieldUnitText(vbleSizeBits));
		vsfield.setVariableSize(formatVariableSize);

		GSSFormatBytesBits formatMaxSize = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatMaxSize.setBytes(Integer.toString(maxSizeBits/8));
		formatMaxSize.setBits(Integer.toString(maxSizeBits%8));
		vsfield.setMaxSize(formatMaxSize);
		
		GSSFormatBytesBits formatOffset = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatOffset.setBytes(Integer.toString(offsetBits/8));
		formatOffset.setBits(Integer.toString(offsetBits%8));
		vsfield.setGlobalOffset(formatOffset);
		
		format.getVSField().add(vsfield);
	}

	public static void createCSField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer constSizeBits, Integer offsetBits) {

		GSSFormatCSField csfield = formatFactory.eINSTANCE.createGSSFormatCSField();
		csfield.setFid(Integer.toString(fid));
		csfield.setPfid(Integer.toString(pfid));
		csfield.setName(name);
		csfield.setDescription(descr);
		csfield.setType(GSSFormatFieldType.STRUCTURED);
		csfield.setByteOrder(GSSFormatFieldByteOrder.BIG_ENDIAN);
		csfield.setFirstBit(GSSFormatSFieldFirstBit.MSB);
		
		GSSFormatBytesBits formatSize = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatSize.setBytes(Integer.toString(constSizeBits/8));
		formatSize.setBits(Integer.toString(constSizeBits%8));
		csfield.setSize(formatSize);
		
		GSSFormatBytesBits formatOffset = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatOffset.setBytes(Integer.toString(offsetBits/8));
		formatOffset.setBits(Integer.toString(offsetBits%8));
		csfield.setGlobalOffset(formatOffset);
		
		format.getCSField().add(csfield);
	}

	public static void createAIField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer fidRef, Integer sizeBits, Integer offsetBits) {

		GSSFormatAIField aifield = formatFactory.eINSTANCE.createGSSFormatAIField();
		aifield.setFid(Integer.toString(fid));
		aifield.setPfid(Integer.toString(pfid));
		aifield.setName(name);
		aifield.setDescription(descr);
		aifield.setType(GSSFormatFieldType.STRUCTURED);
		aifield.setByteOrder(GSSFormatFieldByteOrder.BIG_ENDIAN);
		aifield.setFirstBit(GSSFormatSFieldFirstBit.MSB);
		
		GSSFormatArrayRef arrayRef = formatFactory.eINSTANCE.createGSSFormatArrayRef();
		arrayRef.setFidRef(Integer.toString(fidRef));
		aifield.setArrayRef(arrayRef);
		
		GSSFormatBytesBits formatSize = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatSize.setBytes(Integer.toString(sizeBits/8));
		formatSize.setBits(Integer.toString(sizeBits%8));
		aifield.setSize(formatSize);
		
		GSSFormatBytesBits formatOffset = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatOffset.setBytes(Integer.toString(offsetBits/8));
		formatOffset.setBits(Integer.toString(offsetBits%8));
		aifield.setLocalOffset(formatOffset);
		
		format.getAIField().add(aifield);
	}
	
	public static void createAField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer arrayFormatFieldRef, Integer n_max, Integer vbleSizeBits, Integer offsetBits) {

		GSSFormatAField afield = formatFactory.eINSTANCE.createGSSFormatAField();
		afield.setFid(Integer.toString(fid));
		afield.setPfid(Integer.toString(pfid));
		afield.setName(name);
		afield.setDescription(null);
		afield.setType(GSSFormatFieldType.STRUCTURED);
		afield.setByteOrder(GSSFormatFieldByteOrder.BIG_ENDIAN);
		afield.setFirstBit(GSSFormatSFieldFirstBit.MSB);
		
		GSSFormatArrayDimension arrayDimension = formatFactory.eINSTANCE.createGSSFormatArrayDimension();
		arrayDimension.setFidRef(Integer.toString(arrayFormatFieldRef));
		arrayDimension.setMaxItems(Integer.toString(n_max));
		afield.setArrayDimension(arrayDimension);
		
		GSSFormatBytesBits formatSize = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatSize.setBytes(Integer.toString(vbleSizeBits/8));
		formatSize.setBits(Integer.toString(vbleSizeBits%8));
		afield.setSize(formatSize);
		
		GSSFormatBytesBits formatOffset = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatOffset.setBytes(Integer.toString(offsetBits/8));
		formatOffset.setBits(Integer.toString(offsetBits%8));
		afield.setGlobalOffset(formatOffset);

		format.getAField().add(afield);
	}
	
	public static void createVRFieldSize(GSSFormatFormat format, Integer fid, Integer pfid, String name) {

		GSSFormatVRFieldSize vrfieldsize = formatFactory.eINSTANCE.createGSSFormatVRFieldSize();
		
		vrfieldsize.setFid(Integer.toString(fid));
		vrfieldsize.setPfid(Integer.toString(pfid));
		vrfieldsize.setName(name);
		format.getVRFieldSize().add(vrfieldsize);

		format.getVRFieldSize().add(vrfieldsize);
	}
	
	public static void createFDICField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer sizeBits, Integer fidRef, ArrayList<Integer> fieldsToCheck) {

		GSSFormatFDICField fdicfield = formatFactory.eINSTANCE.createGSSFormatFDICField();
		
		fdicfield.setFid(Integer.toString(fid));
		fdicfield.setPfid(Integer.toString(pfid));
		fdicfield.setName(name);
		fdicfield.setDescription(descr);
		fdicfield.setCheckType(GSSFormatCheckType.CRC16);
		fdicfield.setByteOrder(GSSFormatFieldByteOrder.BIG_ENDIAN);
		fdicfield.setFirstBit(GSSFormatSFieldFirstBit.MSB);
		
		GSSFormatBytesBits formatSize = formatFactory.eINSTANCE.createGSSFormatBytesBits();
		formatSize.setBytes(Integer.toString(sizeBits/8));
		formatSize.setBits(Integer.toString(sizeBits%8));
		fdicfield.setSize(formatSize);
		
		GSSFormatFloatingOffset floatingOffset = formatFactory.eINSTANCE.createGSSFormatFloatingOffset();
		floatingOffset.setFidRef(Integer.toString(fidRef));
		fdicfield.setFloatingOffset(floatingOffset);
		
		GSSFormatSortedFieldsToCheck sortedFieldsToCheck = formatFactory.eINSTANCE.createGSSFormatSortedFieldsToCheck();

		for (Integer field : fieldsToCheck) {
			GSSFormatFieldToCheck fieldToCheck = formatFactory.eINSTANCE.createGSSFormatFieldToCheck();
			fieldToCheck.setFidRef(Integer.toString(field));
			sortedFieldsToCheck.getFieldToCheck().add(fieldToCheck);
		}
		fdicfield.setSortedFieldsToCheck(sortedFieldsToCheck);

		format.getFDICField().add(fdicfield);
	}
	
	public static void createExportSettingFromField(GSSExportSettings settings, GSSFormatField fieldRef,
			GSSFormatField toFieldRef) {
		
    	GSSExportSettingFromField settingFromField = exportFactory.eINSTANCE.createGSSExportSettingFromField();
    	settingFromField.setFieldRef(fieldRef);
    	settingFromField.setToFieldRef(toFieldRef);
    	settings.getSettingFromField().add(settingFromField);
	}
	
	public static void createExportSettingFromConst(GSSExportSettings settings, String value,
			GSSFormatField toFieldRef) {

    	GSSExportSettingFromConst settingFromConst = exportFactory.eINSTANCE.createGSSExportSettingFromConst();
    	settingFromConst.setValue(value);
    	settingFromConst.setToFieldRef(toFieldRef);
    	settings.getSettingFromConst().add(settingFromConst);
	}
	
	public static void createExportSettingFromSize(GSSExportSettings settings, String sizeRef,
			GSSFormatField toFieldRef) {

		GSSExportSettingFromSize settingFromSize = exportFactory.eINSTANCE.createGSSExportSettingFromSize();
		settingFromSize.setSizeRef(sizeRef);
		settingFromSize.setToFieldRef(toFieldRef);
		settings.getSettingFromSize().add(settingFromSize);
	}

	public static void createMintermFilterBoolVar(GSSFilterMintermFilter filter, String id, GSSFormatField fieldRef, String value) {
		
    	GSSFilterBoolVar boolvar = filterFactory.eINSTANCE.createGSSFilterBoolVar();
    	boolvar.setId(id);
    	boolvar.setName(fieldRef.getName() + "_" + value);
    	boolvar.setConstantType(GSSFilterConstantType.DECIMAL);
    	boolvar.setFieldRef(fieldRef);
    	
    	GSSFilterFieldOp fieldOp = filterFactory.eINSTANCE.createGSSFilterFieldOp();
    	fieldOp.setType(GSSFilterOPType.EQUAL);
    	boolvar.setOp(fieldOp);
    	
    	GSSFilterConstant constant = filterFactory.eINSTANCE.createGSSFilterConstant();
    	constant.setValue(value);
    	boolvar.setConstant(constant);
    	
    	filter.getBoolVar().add(boolvar);
	}

	public static void createMintermFilterBoolVarFDIC(GSSFilterMintermFilter filter, String id, GSSFormatFDICField fdicFieldRef) {
		
    	GSSFilterBoolVarFDIC boolvarFDIC = filterFactory.eINSTANCE.createGSSFilterBoolVarFDIC();
    	boolvarFDIC.setId(id);
    	boolvarFDIC.setName(fdicFieldRef.getName());
    	boolvarFDIC.setFieldRef(fdicFieldRef);
    	
    	GSSFilterFieldOp fieldOp = filterFactory.eINSTANCE.createGSSFilterFieldOp();
    	fieldOp.setType(GSSFilterOPType.EQUAL);
    	boolvarFDIC.setOp(fieldOp);
    	
    	filter.getBoolVarFDIC().add(boolvarFDIC);
	}

	public static void createMintermFilterMinterm(GSSFilterMintermFilter filter, String id, Integer start, Integer end) {

    	GSSFilterMinterm minterm = filterFactory.eINSTANCE.createGSSFilterMinterm();
    	minterm.setId(id);
    	for(Integer idx=start; idx<end; ++idx) {
    		createMintermFilterBoolVarRef(minterm, Integer.toString(idx));
    	}
    	filter.getMinterm().add(minterm);
	}

	public static void createMintermFilterBoolVarRef(GSSFilterMinterm minterm, String idRef) {

		GSSFilterBoolVarRef boolvarRef = filterFactory.eINSTANCE.createGSSFilterBoolVarRef();
		boolvarRef.setIdRef(idRef);
		minterm.getBoolVarRef().add(boolvarRef);
	}
	
	public static void createImportDataSource(GSSImportImport imports, GSSFormatField fieldRef, String leftTrim, String rightTrim) {

		GSSImportDataSource dataSource = importFactory.eINSTANCE.createGSSImportDataSource();
		dataSource.setFieldRef(fieldRef);
		dataSource.setLeftTrim(leftTrim);
		dataSource.setRightTrim(rightTrim);
		imports.getDataSource().add(dataSource);
	}
	
	public static void createImportVirtualSize(GSSImportImport imports, GSSFormatField fieldRef, GSSFormatVRFieldSize to,
			String addSize) {
		
		GSSImportVirtualSize virtualSize = importFactory.eINSTANCE.createGSSImportVirtualSize();
		virtualSize.setFieldRef(fieldRef);
		virtualSize.setTo(to);
		virtualSize.setAddSize(addSize);
		virtualSize.setUnit(GSSImportUnit.BYTES);
		imports.setVirtualSize(virtualSize);
	}
}