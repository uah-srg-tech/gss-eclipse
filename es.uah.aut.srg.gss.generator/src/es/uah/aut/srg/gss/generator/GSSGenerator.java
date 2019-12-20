package es.uah.aut.srg.gss.generator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
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
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField;
import es.uah.aut.srg.gss.tcheaderinput.tcheaderinputFactory;
import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput;
import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField;
import es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputFactory;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvalueFactory;
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

	public static final int MAX_CCSDS_TC_LEN_BYTES = 248;
	public static final int MAX_CCSDS_TM_LEN_BYTES = 4112;
	public static final int CRC_LEN_BYTES = 2;
	public static final int MAX_APP_DATA_BYTES = 236;
	public static final int MAX_SRC_DATA_BYTES = 4096;
	public static final int CCSDS_PACKET_LENGTH_CONST_BYTES = 7;
	public static final int APPDATA_LENGTH_CONST_BYTES = -5;
	public static final int SECOND_HEADER_LENGTH_BYTES = 4;
	public static final int SRC_DATA_LENGTH_CONST_BYTES = -11;
	public static final int BYTES = 8;
	public static final String CNAME_CRC = "NID00048";
	public static final String CNAME_CRC_HK = "NID00198";
	public static final String CNAME_CHECKSUM = "NID10413";
	
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

		//create WrongPacket format
		GSSFormatFormat format = formatFactory.eINSTANCE.createGSSFormatFormat();
		format.setName("WrongPacket");//NAME
		format.setDescription("WrongPacket: Packet with wrong type and subtype");//NAME: DESCR
		format.setVersion("v1");
		format.setProtocol("EPD_PUS");
		format.setType(GSSFormatFormatType.TC);
		formats.put("WrongPacket", format);
		
		// get ccsds/pus headers
		GSSFormatFormat ccsdsTcFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		ccsdsTcFormat.setName("CCSDS_TC");
		ccsdsTcFormat.setDescription("CCSDS_TC");
		ccsdsTcFormat.setUri("es.uah.aut.srg.CCSDS_TC");
		ccsdsTcFormat.setVersion("v1");
		ccsdsTcFormat.setProtocol("CCSDS");
		ccsdsTcFormat.setType(GSSFormatFormatType.TC);
		FileInputStream pcdf_file = new FileInputStream(database+"\\pcdf.dat");
		BufferedReader pcdf = new BufferedReader(new InputStreamReader(pcdf_file));
	    String pcdf_line;
		Integer headerLenBits = 0, lengthFieldRef = 0;
		Integer id = 0;
		//first pass: get sizes and LENGTH field
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	String[] pcdf_rows = pcdf_line.split("\t");
	    	headerLenBits += Integer.parseInt(pcdf_rows[3]);
	    	if(pcdf_rows[5].compareTo("LENGTH") == 0) {
	    		lengthFieldRef = id;
	    	}
	    	id++;
	    }
		id = 2;
		lengthFieldRef += 2;//to mantain consistency in length id
		createVSField(ccsdsTcFormat, 0, 0, "CCSDS_Packet", null, CCSDS_PACKET_LENGTH_CONST_BYTES*BYTES,
				lengthFieldRef, BYTES, MAX_CCSDS_TC_LEN_BYTES*BYTES, 0);
		createCSField(ccsdsTcFormat, 1, 0, "Packet_Header", null, headerLenBits, 0);
		//second pass: get CCSDS fields
		pcdf_file.getChannel().position(0);
		pcdf = new BufferedReader(new InputStreamReader(pcdf_file));
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	String[] pcdf_rows = pcdf_line.split("\t");
			createCSField(ccsdsTcFormat, id, 1, pcdf_rows[1].replace(" ", "_"),
					null, Integer.parseInt(pcdf_rows[3]), Integer.parseInt(pcdf_rows[4])); //NAME, LEN, BIT
			id++;
	    }
	    pcdf.close();
	    
	    Integer appDataId = id;
		createVSField(ccsdsTcFormat, appDataId, 0, "Application_Data", null,
				APPDATA_LENGTH_CONST_BYTES*BYTES, lengthFieldRef, BYTES, MAX_APP_DATA_BYTES*BYTES, headerLenBits);
		createFDICField(ccsdsTcFormat, appDataId+1, 0, "CRC", null, CRC_LEN_BYTES*BYTES, appDataId,
				new ArrayList<Integer>(Arrays.asList(1, appDataId)));
		formats.put("CCSDS_TC", ccsdsTcFormat);
		
		return formats;
	}

	public static Collection<GSSExportExport> getExports(String database,
			Map<String, GSSFormatFormat> tcFormats) throws IOException {

		Set<GSSExportExport> exports = new HashSet<GSSExportExport>();
		GSSFormatFormat ccsdsTcFormat = tcFormats.get("CCSDS_TC");
		
		// get ccsds/pus header fixed values
		Map<String, String> ccsdsTCFieldFixedValues = new HashMap<String, String>();
		String APID = null, TYPE = null, SUBTYPE = null, ACK = null, LENGTH = null;
		BufferedReader pcdf = new BufferedReader(new InputStreamReader(
				new FileInputStream(database+"\\pcdf.dat")));
	    String pcdf_line;
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	String[] pcdf_rows = pcdf_line.split("\t");
	    	if(pcdf_rows[2].compareTo("F") == 0){
	    		ccsdsTCFieldFixedValues.put(pcdf_rows[1].replace(" ", "_"), pcdf_rows[6]);
	    	}
	    	else if(pcdf_rows[2].compareTo("A") == 0){
	    		APID = pcdf_rows[1].replace(" ", "_");
	    	}
	    	else if(pcdf_rows[2].compareTo("T") == 0){
	    		TYPE = pcdf_rows[1].replace(" ", "_");
	    	}
	    	else if(pcdf_rows[2].compareTo("S") == 0){
	    		SUBTYPE = pcdf_rows[1].replace(" ", "_");
	    	}
	    	else if(pcdf_rows[2].compareTo("K") == 0){
	    		ACK = pcdf_rows[1].replace(" ", "_");
	    	}
	    	else if(pcdf_rows[5].compareTo("LENGTH") == 0){
	    		LENGTH = pcdf_rows[1].replace(" ", "_");
	    	}
	    }
	    pcdf.close();

	    //create mapping field/name
		Map<String, GSSFormatField> ccsdsTcFormatFields = new HashMap<String, GSSFormatField>();
    	GSSFormatField appDataLengthField = null, appDataField = null;
		for(GSSFormatField ccsdsCField : ccsdsTcFormat.getCSField()) {
			ccsdsTcFormatFields.put(ccsdsCField.getName(), ccsdsCField);
			if(ccsdsCField.getName().compareTo(LENGTH) == 0) {
				appDataLengthField = ccsdsCField;
			}
		}
		for(GSSFormatField ccsdsVField : ccsdsTcFormat.getVSField()) {
			if((ccsdsVField.getName().compareTo("Application_Data")) == 0) {
				appDataField = ccsdsVField;
				break;
			}
		}
		
		//read TC format names from CCF table
		BufferedReader ccf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database + "\\ccf.dat")));
	    String ccf_line;
	    while ((ccf_line = ccf.readLine()) != null) {
	    	
	    	String[] ccf_rows = ccf_line.split("\t");
			
	    	GSSExportExport export = exportFactory.eINSTANCE.createGSSExportExport();
	    	export.setName(ccf_rows[0]);
	    	export.setDescription(ccf_rows[1]);
	    	export.setVersion("v1");
	    	export.setFrom(tcFormats.get(ccf_rows[0]));
	    	export.setTo(ccsdsTcFormat);

	    	GSSExportSettings settings = exportFactory.eINSTANCE.createGSSExportSettings();
	    	//set header values
	        for(Map.Entry<String,String> ccsdsTCFieldFixedValue : ccsdsTCFieldFixedValues.entrySet()) {
		    	createExportSettingFromConst(settings, ccsdsTCFieldFixedValue.getValue(), 
		    			ccsdsTcFormatFields.get(ccsdsTCFieldFixedValue.getKey()));
	        }
	    	createExportSettingFromConst(settings, ccf_rows[8], ccsdsTcFormatFields.get(APID));
	    	createExportSettingFromConst(settings, ccf_rows[6], ccsdsTcFormatFields.get(TYPE));
	    	createExportSettingFromConst(settings, ccf_rows[7], ccsdsTcFormatFields.get(SUBTYPE));
	    	createExportSettingFromConst(settings, ccf_rows[19], ccsdsTcFormatFields.get(ACK));
	    	
	    	//set size and ApplicationData if necessary
	    	GSSExportSizeInBits sizeInBits = null;
    		Integer appDataLengthValue = SECOND_HEADER_LENGTH_BYTES+1;
	    	if(tcFormats.get(ccf_rows[0]).getVSField().size() != 0) {
	    		//csfields, vsfields, (maybe afields)
		    	if(tcFormats.get(ccf_rows[0]).getAField().size() == 0) {
		    		//csfields and only these vsfields: ZID52538 & ZID52540
			    	sizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
    				sizeInBits.setFrom("PID00075");
    				appDataLengthValue += Integer.parseInt(tcFormats.get(ccf_rows[0]).getVSField().get(0).getConstSize().getBytes());
    				sizeInBits.setAddSize(Integer.toString(appDataLengthValue));
    				//ApplicationData
		    	}
		    	else {
		    		//csfields, vsfields and afields
			    	sizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
					sizeInBits.setFrom("ApplicationData");
    				sizeInBits.setAddSize(Integer.toString(SECOND_HEADER_LENGTH_BYTES));
		    	}
		    	if(sizeInBits != null) {
		    		sizeInBits.setId("0");
		    		sizeInBits.setUnit(GSSExportUnit.BYTES);
		    		
			    	GSSExportSizes sizes = exportFactory.eINSTANCE.createGSSExportSizes();
		    		sizes.getSizeInBits().add(sizeInBits);
		    		export.setSizes(sizes);
		    	}
	    		createExportSettingFromField(settings, tcFormats.get(ccf_rows[0]).getVSField().get(0), appDataField);
		    	createExportSettingFromSize(settings, "0", appDataLengthField);
	    	}
	    	else
	    	{
	    		//only csfields or not fields
	    		if(tcFormats.get(ccf_rows[0]).getCSField().size() != 0) {
		    		//only csfields
		    		createExportSettingFromField(settings, tcFormats.get(ccf_rows[0]).getCSField().get(0),
		    				appDataField);//EPD PUS ApplicationData
    				appDataLengthValue += Integer.parseInt(tcFormats.get(ccf_rows[0]).getCSField().get(0).getSize().getBytes());
		    	}
	    		createExportSettingFromConst(settings, Integer.toString(appDataLengthValue), appDataLengthField);
	    	}
	    	export.setSettings(settings);
	    	
	    	GSSExportActivateDICs activateDICs = exportFactory.eINSTANCE.createGSSExportActivateDICs();
	    	GSSExportDIC cssdsDic = exportFactory.eINSTANCE.createGSSExportDIC();
	    	cssdsDic.setId("0");
	    	cssdsDic.setDICRef("CRC");
	    	activateDICs.getDIC().add(cssdsDic);
	    	export.setActivateDICs(activateDICs);

	    	//before adding, copy export for creating different ack versions
	    	/*GSSExportExport export_variant1 = copyExportToLevel1(export);
	    	GSSExportExport export_variant2 = copyExportToLevel1(export);
	    	GSSExportExport export_variant3 = copyExportToLevel1(export);
	    	if(export.getSettings().getSettingFromConst().get(2).getValue().compareTo("9") == 0) {
	    		export_variant1.getSettings().getSettingFromConst().get(2).setValue("8");
	    		export_variant2.getSettings().getSettingFromConst().get(2).setValue("1");
	    		export_variant3.getSettings().getSettingFromConst().get(2).setValue("0");
	    	}
	    	else if(export.getSettings().getSettingFromConst().get(2).getValue().compareTo("8") == 0) {
	    		export_variant1.getSettings().getSettingFromConst().get(2).setValue("9");
	    		export_variant2.getSettings().getSettingFromConst().get(2).setValue("1");
	    		export_variant3.getSettings().getSettingFromConst().get(2).setValue("0");
	    	}
	    	else if(export.getSettings().getSettingFromConst().get(2).getValue().compareTo("1") == 0) {
	    		export_variant1.getSettings().getSettingFromConst().get(2).setValue("9");
	    		export_variant2.getSettings().getSettingFromConst().get(2).setValue("8");
	    		export_variant3.getSettings().getSettingFromConst().get(2).setValue("0");
	    	}
	    	else if(export.getSettings().getSettingFromConst().get(2).getValue().compareTo("0") == 0) {
	    		export_variant1.getSettings().getSettingFromConst().get(2).setValue("9");
	    		export_variant2.getSettings().getSettingFromConst().get(2).setValue("8");
	    		export_variant3.getSettings().getSettingFromConst().get(2).setValue("1");
	    	}
	    	exports.add(export_variant1);
	    	exports.add(export_variant2);
	    	exports.add(export_variant3);*/
	    	exports.add(export);
	    }
		ccf.close();

		//create WrongPacket export
    	GSSExportExport export = exportFactory.eINSTANCE.createGSSExportExport();
    	export.setName("WrongPacket");
    	export.setDescription("Packet with wrong type and subtype");
    	export.setVersion("v1");
    	export.setFrom(tcFormats.get("WrongPacket"));
    	export.setTo(ccsdsTcFormat);
    	GSSExportSettings settings = exportFactory.eINSTANCE.createGSSExportSettings();
        for(Map.Entry<String,String> ccsdsTCFieldFixedValue : ccsdsTCFieldFixedValues.entrySet()) {
	    	createExportSettingFromConst(settings, ccsdsTCFieldFixedValue.getValue(), 
	    			ccsdsTcFormatFields.get(ccsdsTCFieldFixedValue.getKey()));
        }
    	createExportSettingFromConst(settings, "812", ccsdsTcFormatFields.get(APID));
    	createExportSettingFromConst(settings, "0", ccsdsTcFormatFields.get(TYPE));
    	createExportSettingFromConst(settings, "0", ccsdsTcFormatFields.get(SUBTYPE));
    	createExportSettingFromConst(settings, "9", ccsdsTcFormatFields.get(ACK));
    	export.setSettings(settings);
    	exports.add(export);
    	
		return exports;
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
		
    	GSSFormatFormat ccsdsTmFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		ccsdsTmFormat.setName("CCSDS_TM");
		ccsdsTmFormat.setDescription("CCSDS_TM");
		ccsdsTmFormat.setUri("es.uah.aut.srg.CCSDS_TM");
		ccsdsTmFormat.setVersion("v1");
		ccsdsTmFormat.setProtocol("CCSDS");
		ccsdsTmFormat.setType(GSSFormatFormatType.TM);
		FileInputStream pcdf_file = new FileInputStream(database+"\\pcdf.dat");
		BufferedReader pcdf = new BufferedReader(new InputStreamReader(pcdf_file));
	    String pcdf_line;
		Integer headerLenBits = 0, lengthFieldRef = 0;
		Integer id = 0;
		//first pass: get sizes and LENGTH field
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	String[] pcdf_rows = pcdf_line.split("\t");
	    	headerLenBits += Integer.parseInt(pcdf_rows[3]);
	    	if(pcdf_rows[5].compareTo("LENGTH") == 0) {
	    		lengthFieldRef = id;
	    	}
	    	id++;
	    }
		id = 2;
		lengthFieldRef += 2;//to mantain consistency in length id
	    Integer headerLenBitsWithTime = headerLenBits + (4+2)*8; //SECONDS+SUBSECONDS 
		createVSField(ccsdsTmFormat, 0, 0, "CCSDS_Packet", null, CCSDS_PACKET_LENGTH_CONST_BYTES*BYTES,
				lengthFieldRef, BYTES, MAX_CCSDS_TM_LEN_BYTES*BYTES, 0);
		createCSField(ccsdsTmFormat, 1, 0, "Packet_Header", null, headerLenBitsWithTime, 0);
		//second pass: get CCSDS fields
		pcdf_file.getChannel().position(0);
		pcdf = new BufferedReader(new InputStreamReader(pcdf_file));
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	String[] pcdf_rows = pcdf_line.split("\t");
			createCSField(ccsdsTmFormat, id, 1, pcdf_rows[1].replace(" ", "_"),
					null, Integer.parseInt(pcdf_rows[3]), Integer.parseInt(pcdf_rows[4])); //NAME, LEN, BIT
			id++;
	    }
	    pcdf.close();
		GSSGenerator.createCSField(ccsdsTmFormat, id, 0, "SCTime", null, 6*BYTES, headerLenBits);
		GSSGenerator.createCSField(ccsdsTmFormat, id+1, 7, "Sync", null, 1, headerLenBits);
		GSSGenerator.createCSField(ccsdsTmFormat, id+2, 7, "Seconds", null, 31, headerLenBits+1);
		GSSGenerator.createCSField(ccsdsTmFormat, id+3, 7, "Subseconds", null, 16, headerLenBits+32);
	    
	    Integer srcDataId = id+4;
		createVSField(ccsdsTmFormat, srcDataId, 0, "Source_Data", null,
				SRC_DATA_LENGTH_CONST_BYTES*BYTES, lengthFieldRef, BYTES, MAX_SRC_DATA_BYTES*BYTES, headerLenBitsWithTime);
		createFDICField(ccsdsTmFormat, srcDataId+1, 0, "CRC", null, CRC_LEN_BYTES*BYTES, srcDataId,
				new ArrayList<Integer>(Arrays.asList(1, srcDataId)));
		formats.put("CCSDS_TM", ccsdsTmFormat);
		return formats;
	}

	public static Collection<GSSFilterMintermFilter> getFiltersBottomLevel(String database,
			Map<String, GSSFormatFormat> tmFormats) throws IOException {

		Set<GSSFilterMintermFilter> filters = new HashSet<GSSFilterMintermFilter>();
		GSSFormatFormat ccsdsTmFormat = tmFormats.get("CCSDS_TM");

		Map<String, String> ccsdsTMFieldFixedValues = new HashMap<String, String>();
		String APID = null, TYPE = null, SUBTYPE = null;
		BufferedReader pcdf = new BufferedReader(new InputStreamReader(
				new FileInputStream(database+"\\pcdf.dat")));
	    String pcdf_line;
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	String[] pcdf_rows = pcdf_line.split("\t");
	    	if(pcdf_rows[2].compareTo("F") == 0){
	    		if((pcdf_rows[1].compareTo("Version Number") == 0) || 
	    				(pcdf_rows[1].compareTo("PUS Version") == 0)) {
	    			ccsdsTMFieldFixedValues.put(pcdf_rows[1].replace(" ", "_"), pcdf_rows[6]);
	    		}
	    	}
	    	else if(pcdf_rows[2].compareTo("A") == 0){
	    		APID = pcdf_rows[1].replace(" ", "_");
	    	}
	    	else if(pcdf_rows[2].compareTo("T") == 0){
	    		TYPE = pcdf_rows[1].replace(" ", "_");
	    	}
	    	else if(pcdf_rows[2].compareTo("S") == 0){
	    		SUBTYPE = pcdf_rows[1].replace(" ", "_");
	    	}
	    }
	    pcdf.close();
		GSSFilterMintermFilter epdCcsdsFilter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
		epdCcsdsFilter.setName("EPD_CCSDS_TM");
		epdCcsdsFilter.setDescription("EPD_CCSDS_TM");
		epdCcsdsFilter.setUri("es.uah.aut.srg.EPD_CCSDS_TM");
		epdCcsdsFilter.setVersion("v1");
		epdCcsdsFilter.setFormatFile(ccsdsTmFormat);//CCSDS
		Integer id = 0;
		for(GSSFormatField ccsdsCField : ccsdsTmFormat.getCSField()) {
			if(ccsdsTMFieldFixedValues.get(ccsdsCField.getName()) != null) {
				createMintermFilterBoolVar(epdCcsdsFilter, Integer.toString(id++), ccsdsCField,
						ccsdsTMFieldFixedValues.get(ccsdsCField.getName()));
			}
		}
		GSSGenerator.createMintermFilterBoolVarFDIC(epdCcsdsFilter, Integer.toString(id),
				ccsdsTmFormat.getFDICField().get(0));//CRC
		GSSGenerator.createMintermFilterMinterm(epdCcsdsFilter, "0", 0, id);
		filters.add(epdCcsdsFilter);

	    //create mapping field/name
		Map<String, GSSFormatField> ccsdsTmFormatFields = new HashMap<String, GSSFormatField>();
		for(GSSFormatField ccsdsCField : ccsdsTmFormat.getCSField()) {
			ccsdsTmFormatFields.put(ccsdsCField.getName(), ccsdsCField);
		}
		
		//read value from PID table
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

	    	createMintermFilterBoolVar(filter, "0", ccsdsTmFormatFields.get(APID), pid_rows[2]);
	    	createMintermFilterBoolVar(filter, "1", ccsdsTmFormatFields.get(TYPE), pid_rows[0]);
	    	createMintermFilterBoolVar(filter, "2", ccsdsTmFormatFields.get(SUBTYPE), pid_rows[1]);
			
	    	createMintermFilterMinterm(filter, "0", 0, 2);
	    	filters.add(filter);
	    }
	    pid.close();
		return filters;
	}
	
	public static Map<String, GSSFilterMintermFilter> getFiltersTopLevel(String database,
			Map<String, GSSFormatFormat> tmFormats) throws IOException {

		Map<String, GSSFilterMintermFilter> filters = new HashMap<String, GSSFilterMintermFilter>();
		
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
	    	if((tmFormats.get("YID" + pid_rows[5]).getCSField().size() == 0) &&
	    			(tmFormats.get("YID" + pid_rows[5]).getVSField().size() == 0)) {
	    		//if no fields -> empty format
	    		continue;
	    	}
	    	else if(tmFormats.get("YID" + pid_rows[5]).getVSField().size() == 0) {
	    		//only csfields: get second csfield
	    		fieldRefPI1_val = tmFormats.get("YID" + pid_rows[5]).getCSField().get(1);
	    	}
	    	else {
	    		//csfields and vsfields: get first csfield
	    		fieldRefPI1_val = tmFormats.get("YID" + pid_rows[5]).getCSField().get(0);
	    	}
		    
	    	GSSFilterMintermFilter filter = filterFactory.eINSTANCE.createGSSFilterMintermFilter();
	    	filter.setName("YID" + pid_rows[5]);//NAME
	    	filter.setDescription(pid_rows[6]);//DESCR
	    	filter.setVersion("v1");
	    	filter.setFormatFile(tmFormats.get("YID" + pid_rows[5]));
			
	    	createMintermFilterBoolVar(filter, "0", fieldRefPI1_val, pid_rows[3]);//PI1_VAL

	    	createMintermFilterMinterm(filter, "0", 0, 0);
	    	filters.put(filter.getName(), filter);
	    }
	    pid.close();
		return filters;
	}
	
	public static Collection<GSSImportImport> getImports(String database,
			Map<String, GSSFormatFormat> tmFormats) throws IOException {

		Collection<GSSImportImport> imports = new HashSet<GSSImportImport>();

		GSSFormatFormat epdPusDataDataTmFormat = formatFactory.eINSTANCE.createGSSFormatFormat();
		epdPusDataDataTmFormat.setName("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setDescription("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setVersion("v1");
		epdPusDataDataTmFormat.setProtocol("PUS_DATA");
		epdPusDataDataTmFormat.setType(GSSFormatFormatType.TM);
		createVSField(epdPusDataDataTmFormat, 0, 0, "SourceData", null, 0, 1, 8, 4096*8, 10*8);
		createVRFieldSize(epdPusDataDataTmFormat, 1, 0, "SourceDataLength");
		tmFormats.put("EPD_PUS_TM_DATA",epdPusDataDataTmFormat);
		
		GSSImportImport epdPusDataFromCcsdsImport = importFactory.eINSTANCE.createGSSImportImport();
		epdPusDataFromCcsdsImport.setName("EPD_PUS_TM_DATA_FROM_CCSDS_TM");
		epdPusDataFromCcsdsImport.setDescription("EPD_PUS_TM_DATA_FROM_CCSDS_TM");
		epdPusDataFromCcsdsImport.setUri("es.uah.aut.srg.EPD_PUS_TM_DATA_FROM_CCSDS_TM");
		epdPusDataFromCcsdsImport.setVersion("v1");
		epdPusDataFromCcsdsImport.setFrom(tmFormats.get("CCSDS_TM"));
		epdPusDataFromCcsdsImport.setTo(epdPusDataDataTmFormat);
		createImportDataSource(epdPusDataFromCcsdsImport,
				tmFormats.get("CCSDS_TM").getVSField().get(0), "0", "0");//SourceData
		epdPusDataFromCcsdsImport.setVirtualSize(null);
		
		imports.add(epdPusDataFromCcsdsImport);
		return imports;
	}

	public static GSSTCHeaderInput createTcHeader(String database, GSSFormatFormat tcFormatHeader) throws IOException {
		GSSTCHeaderInput tcHeader = tcheaderinputFactory.eINSTANCE.createGSSTCHeaderInput();
		tcHeader.setName("CCSDS_TC");
		tcHeader.setFormat(tcFormatHeader);
		
		Map<String, GSSFormatField> tcFormatFields = new HashMap<String, GSSFormatField>();
		for(GSSFormatCSField csField : tcFormatHeader.getCSField()) {
			tcFormatFields.put(csField.getName(), csField);
		}
		
		BufferedReader pcdf = new BufferedReader(new InputStreamReader(
				new FileInputStream(database+"\\pcdf.dat")));
	    String pcdf_line;
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	
	    	String[] pcdf_rows = pcdf_line.split("\t");
	    	
	    	GSSTCHeaderInputField tcHeaderField = tcheaderinputFactory.eINSTANCE.createGSSTCHeaderInputField();
			tcHeaderField.setName(pcdf_rows[1].replace(" ", "_"));
			tcHeaderField.setGssHeaderField(tcFormatFields.get(tcHeaderField.getName()));
			
	    	if(pcdf_rows[2].compareTo("F") == 0) {
				TMTCIFFieldValueRaw fieldValueRaw = fieldvalueFactory.eINSTANCE.createTMTCIFFieldValueRaw();
				fieldValueRaw.setValue(pcdf_rows[6]);
				tcHeaderField.setFieldValue(fieldValueRaw);
	    	}
			tcHeader.getGssHeaderFields().add(tcHeaderField);
	    }
	    pcdf.close();
	    //add fields not found in TC
	    GSSTCHeaderInputField appDataField = tcheaderinputFactory.eINSTANCE.createGSSTCHeaderInputField();
		appDataField.setName("Application_Data");
		appDataField.setGssHeaderField(tcFormatHeader.getVSField().get(0));
		tcHeader.getGssHeaderFields().add(appDataField);
		GSSTCHeaderInputField crcField = tcheaderinputFactory.eINSTANCE.createGSSTCHeaderInputField();
		crcField.setName("CRC");
		crcField.setGssHeaderField(tcFormatHeader.getFDICField().get(0));
		tcHeader.getGssHeaderFields().add(crcField);
	    return tcHeader;
	}

	public static GSSTMHeaderOutput createTmHeader(String database, GSSFormatFormat tmFormatHeader) throws IOException {
		GSSTMHeaderOutput tmHeader = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutput();
		tmHeader.setName("CCSDS_TM");
		tmHeader.setFormat(tmFormatHeader);
		
		Map<String, GSSFormatField> tmFormatFields = new HashMap<String, GSSFormatField>();
		for(GSSFormatCSField csField : tmFormatHeader.getCSField()) {
			tmFormatFields.put(csField.getName(), csField);
		}
		
		BufferedReader pcdf = new BufferedReader(new InputStreamReader(
				new FileInputStream(database+"\\pcdf.dat")));
	    String pcdf_line;
	    while ((pcdf_line = pcdf.readLine()) != null) {
	    	
	    	String[] pcdf_rows = pcdf_line.split("\t");
	    	
	    	GSSTMHeaderOutputField tmHeaderField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();
			tmHeaderField.setName(pcdf_rows[1].replace(" ", "_"));
			tmHeaderField.setGssHeaderField(tmFormatFields.get(tmHeaderField.getName()));

			/* manually add values as they are not in database */
	    	if(pcdf_rows[1].compareTo("Version Number") == 0) {
				TMTCIFFieldValueRaw fieldValueRaw = fieldvalueFactory.eINSTANCE.createTMTCIFFieldValueRaw();
				fieldValueRaw.setValue(pcdf_rows[6]);
				tmHeaderField.setFieldValue(fieldValueRaw);
	    	}
	    	else if(pcdf_rows[1].compareTo("Type") == 0) {
				TMTCIFFieldValueRaw fieldValueRaw = fieldvalueFactory.eINSTANCE.createTMTCIFFieldValueRaw();
				fieldValueRaw.setValue("1"); //0 defined in database is for TCs
				tmHeaderField.setFieldValue(fieldValueRaw);
	    	}
	    	else if(pcdf_rows[1].compareTo("Data Field Header Flag") == 0) {
				TMTCIFFieldValueRaw fieldValueRaw = fieldvalueFactory.eINSTANCE.createTMTCIFFieldValueRaw();
				fieldValueRaw.setValue(pcdf_rows[6]);
				tmHeaderField.setFieldValue(fieldValueRaw);
	    	}
	    	else if(pcdf_rows[1].compareTo("PUS Version") == 0) {
				TMTCIFFieldValueRaw fieldValueRaw = fieldvalueFactory.eINSTANCE.createTMTCIFFieldValueRaw();
				fieldValueRaw.setValue(pcdf_rows[6]);
				tmHeaderField.setFieldValue(fieldValueRaw);
	    	}
			tmHeader.getGssHeaderFields().add(tmHeaderField);
	    }
	    pcdf.close();
	    //add fields not found in TC
    	GSSTMHeaderOutputField scTimeField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();
		scTimeField.setName("SCTime");
		scTimeField.setGssHeaderField(tmFormatFields.get("SCTime"));
		tmHeader.getGssHeaderFields().add(scTimeField);
		GSSTMHeaderOutputField syncField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();
		syncField.setName("Sync");
		syncField.setGssHeaderField(tmFormatFields.get("Sync"));
		tmHeader.getGssHeaderFields().add(syncField);
		GSSTMHeaderOutputField secondsField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();
	    secondsField.setName("Seconds");
	    secondsField.setGssHeaderField(tmFormatFields.get("Seconds"));
		tmHeader.getGssHeaderFields().add(secondsField);
		GSSTMHeaderOutputField subsecondsField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();;
		subsecondsField.setName("Subseconds");
		subsecondsField.setGssHeaderField(tmFormatFields.get("Subseconds"));
		tmHeader.getGssHeaderFields().add(subsecondsField);
		GSSTMHeaderOutputField srcDataField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();
		srcDataField.setName("Source_Data");
		srcDataField.setGssHeaderField(tmFormatHeader.getVSField().get(0));
		tmHeader.getGssHeaderFields().add(srcDataField);
		GSSTMHeaderOutputField crcField = tmheaderoutputFactory.eINSTANCE.createGSSTMHeaderOutputField();
		crcField.setName("CRC");
		crcField.setGssHeaderField(tmFormatHeader.getFDICField().get(0));
		tmHeader.getGssHeaderFields().add(crcField);
	    return tmHeader;
	}
	
	private static Integer getSizeBitsFromPtcFfc(Integer ptc, Integer pfc) {
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

	private static GSSFormatUnit getVariableFieldUnitText(Integer variable_field_length_bits) {
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

	private static void createVSField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
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

	private static void createCSField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer constSizeBits, Integer offsetBits) {

		GSSFormatCSField csfield = formatFactory.eINSTANCE.createGSSFormatCSField();
		csfield.setFid(Integer.toString(fid));
		csfield.setPfid(Integer.toString(pfid));
		csfield.setName(name.replace(".", "_"));
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

	private static void createAIField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer fidRef, Integer sizeBits, Integer offsetBits) {

		GSSFormatAIField aifield = formatFactory.eINSTANCE.createGSSFormatAIField();
		aifield.setFid(Integer.toString(fid));
		aifield.setPfid(Integer.toString(pfid));
		aifield.setName(name.replace(".", "_"));
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
	
	private static void createAField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer arrayFormatFieldRef, Integer n_max, Integer vbleSizeBits, Integer offsetBits) {

		GSSFormatAField afield = formatFactory.eINSTANCE.createGSSFormatAField();
		afield.setFid(Integer.toString(fid));
		afield.setPfid(Integer.toString(pfid));
		afield.setName(name.replace(".", "_"));
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
	
	private static void createVRFieldSize(GSSFormatFormat format, Integer fid, Integer pfid, String name) {

		GSSFormatVRFieldSize vrfieldsize = formatFactory.eINSTANCE.createGSSFormatVRFieldSize();
		
		vrfieldsize.setFid(Integer.toString(fid));
		vrfieldsize.setPfid(Integer.toString(pfid));
		vrfieldsize.setName(name.replace(".", "_"));
		format.getVRFieldSize().add(vrfieldsize);

		format.getVRFieldSize().add(vrfieldsize);
	}
	
	private static void createFDICField(GSSFormatFormat format, Integer fid, Integer pfid, String name, String descr,
			Integer sizeBits, Integer fidRef, ArrayList<Integer> fieldsToCheck) {

		GSSFormatFDICField fdicfield = formatFactory.eINSTANCE.createGSSFormatFDICField();
		
		fdicfield.setFid(Integer.toString(fid));
		fdicfield.setPfid(Integer.toString(pfid));
		fdicfield.setName(name.replace(".", "_"));
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
	
	private static void createExportSettingFromField(GSSExportSettings settings, GSSFormatField fieldRef,
			GSSFormatField toFieldRef) {
		
    	GSSExportSettingFromField settingFromField = exportFactory.eINSTANCE.createGSSExportSettingFromField();
    	settingFromField.setFieldRef(fieldRef);
    	settingFromField.setToFieldRef(toFieldRef);
    	settings.getSettingFromField().add(settingFromField);
	}
	
	private static void createExportSettingFromConst(GSSExportSettings settings, String value,
			GSSFormatField toFieldRef) {

    	GSSExportSettingFromConst settingFromConst = exportFactory.eINSTANCE.createGSSExportSettingFromConst();
    	settingFromConst.setValue(value);
    	settingFromConst.setToFieldRef(toFieldRef);
    	settings.getSettingFromConst().add(settingFromConst);
	}
	
	private static void createExportSettingFromSize(GSSExportSettings settings, String sizeRef,
			GSSFormatField toFieldRef) {

		GSSExportSettingFromSize settingFromSize = exportFactory.eINSTANCE.createGSSExportSettingFromSize();
		settingFromSize.setSizeRef(sizeRef);
		settingFromSize.setToFieldRef(toFieldRef);
		settings.getSettingFromSize().add(settingFromSize);
	}

	private static void createMintermFilterBoolVar(GSSFilterMintermFilter filter, String id, GSSFormatField fieldRef, String value) {
		
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

	private static void createMintermFilterBoolVarFDIC(GSSFilterMintermFilter filter, String id, GSSFormatFDICField fdicFieldRef) {
		
    	GSSFilterBoolVarFDIC boolvarFDIC = filterFactory.eINSTANCE.createGSSFilterBoolVarFDIC();
    	boolvarFDIC.setId(id);
    	boolvarFDIC.setName(fdicFieldRef.getName());
    	boolvarFDIC.setFieldRef(fdicFieldRef);
    	
    	GSSFilterFieldOp fieldOp = filterFactory.eINSTANCE.createGSSFilterFieldOp();
    	fieldOp.setType(GSSFilterOPType.EQUAL);
    	boolvarFDIC.setOp(fieldOp);
    	
    	filter.getBoolVarFDIC().add(boolvarFDIC);
	}

	private static void createMintermFilterMinterm(GSSFilterMintermFilter filter, String id, Integer start, Integer end) {

    	GSSFilterMinterm minterm = filterFactory.eINSTANCE.createGSSFilterMinterm();
    	minterm.setId(id);
    	for(Integer idx=start; idx<=end; ++idx) {
    		createMintermFilterBoolVarRef(minterm, Integer.toString(idx));
    	}
    	filter.getMinterm().add(minterm);
	}

	private static void createMintermFilterBoolVarRef(GSSFilterMinterm minterm, String idRef) {

		GSSFilterBoolVarRef boolvarRef = filterFactory.eINSTANCE.createGSSFilterBoolVarRef();
		boolvarRef.setIdRef(idRef);
		minterm.getBoolVarRef().add(boolvarRef);
	}
	
	private static void createImportDataSource(GSSImportImport imports, GSSFormatField fieldRef, String leftTrim, String rightTrim) {

		GSSImportDataSource dataSource = importFactory.eINSTANCE.createGSSImportDataSource();
		dataSource.setFieldRef(fieldRef);
		dataSource.setLeftTrim(leftTrim);
		dataSource.setRightTrim(rightTrim);
		imports.getDataSource().add(dataSource);
	}
	
	@SuppressWarnings("unused")
	private static void createImportVirtualSize(GSSImportImport imports, GSSFormatField fieldRef,
			GSSFormatVRFieldSize to, String addSize) {
		
		GSSImportVirtualSize virtualSize = importFactory.eINSTANCE.createGSSImportVirtualSize();
		virtualSize.setFieldRef(fieldRef);
		virtualSize.setTo(to);
		virtualSize.setAddSize(addSize);
		virtualSize.setUnit(GSSImportUnit.BYTES);
		imports.setVirtualSize(virtualSize);
	}
	
/*	private static GSSExportExport copyExportToLevel1(GSSExportExport orig) {
    	GSSExportExport ret = exportFactory.eINSTANCE.createGSSExportExport();
    	ret.setName(orig.getName());
    	ret.setDescription(orig.getDescription());
    	ret.setVersion(orig.getVersion());
    	ret.setFrom(orig.getFrom());
    	ret.setTo(orig.getTo());

    	if((orig.getSizes() != null) && (orig.getSizes().getSizeInBits().size() != 0)) {
        	GSSExportSizes sizes = exportFactory.eINSTANCE.createGSSExportSizes();
    		GSSExportSizeInBits sizeInBits = exportFactory.eINSTANCE.createGSSExportSizeInBits();
    		sizeInBits.setId("0");
			sizeInBits.setFrom(orig.getSizes().getSizeInBits().get(0).getFrom());
			sizeInBits.setAddSize(orig.getSizes().getSizeInBits().get(0).getAddSize());
			sizeInBits.setUnit(orig.getSizes().getSizeInBits().get(0).getUnit());
    		sizes.getSizeInBits().add(sizeInBits);
    		ret.setSizes(sizes);
    	}
    	
    	GSSExportSettings settings = exportFactory.eINSTANCE.createGSSExportSettings();
    	for(int i=0; i<6; ++i) {
    		createExportSettingFromConst(settings,
    				orig.getSettings().getSettingFromConst().get(i).getValue(),
    				orig.getSettings().getSettingFromConst().get(i).getToFieldRef());
    	}
    	if(orig.getSettings().getSettingFromField().size() != 0) {
    		createExportSettingFromField(settings,
    				orig.getSettings().getSettingFromField().get(0).getFieldRef(),
    				orig.getSettings().getSettingFromField().get(0).getToFieldRef());
    	}
    	if(orig.getSettings().getSettingFromSize().size() != 0) {
    		createExportSettingFromSize(settings, "0",
    				orig.getSettings().getSettingFromSize().get(0).getToFieldRef());
    	}
    	else {
    		createExportSettingFromConst(settings,
    				orig.getSettings().getSettingFromConst().get(6).getValue(),
    				orig.getSettings().getSettingFromConst().get(6).getToFieldRef());
    	}
    	ret.setSettings(settings);
    	
		return ret;
	}*/
}