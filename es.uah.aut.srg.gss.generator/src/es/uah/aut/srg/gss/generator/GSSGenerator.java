package es.uah.aut.srg.gss.generator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormatType;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatFactory;

public class GSSGenerator {
	
	public static final int MAX_APP_DATA_BYTES = 236;
	
	public static Collection<GSSTmTcFormatTmTcFormat> getTmTcFormats(String database) throws IOException {

		Map<String, GSSTmTcFormatTmTcFormat> formats = new HashMap<String, GSSTmTcFormatTmTcFormat>();
	    Integer fid = 0, isArrayFormatField = 0, n_max = 0;
	    String lastID = "";

		//process TC database tables and populate the collection
		
		//read TC format names from CCF table
		BufferedReader ccf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\ccf.dat")));
	    String ccf_line;
	    while ((ccf_line = ccf.readLine()) != null) {
	    	
	    	String[] ccf_rows = ccf_line.split("\t");
		    
			GSSTmTcFormatTmTcFormat format = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
			format.setName(ccf_rows[0]);
			format.setProtocol(ccf_rows[0]);
			format.setType(GSSTmTcFormatTmTcFormatType.TC);
			
			formats.put(ccf_rows[0], format);
	    	
	    }
		ccf.close();

		//read TC fields and field sizes from CDF table
		BufferedReader cdf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\cdf.dat")));
	    String cdf_line;
	    while ((cdf_line = cdf.readLine()) != null) {
	    	
	    	String[] cdf_rows = cdf_line.split("\t");
	    	Integer constSizeBits = 0, vbleSizeBits = 0, maxSizeBits = 0;
	    	if(cdf_rows[0].compareTo(lastID) != 0) {
	    		
	    		//new format, compare all fields to check if packet constant or variable
			    fid = 0;
		    	isArrayFormatField = 0;
		    	n_max = 0;
	    		Integer countFields = 0;
	    		
	    		String cdf_same_field = cdf_line;
		    	cdf.mark(1500);
	    		do {
	    	    	String[] cdf_same_field_rows = cdf_same_field.split("\t");
	    	    	if(cdf_same_field_rows[0].compareTo(cdf_rows[0]) != 0) {
	    	    		break;
	    	    	}
	    	    	countFields++; 
	    	    	
			    	if(cdf_same_field_rows[5].compareTo("0") == 0) {//GRP_SIZE
			    		if(isArrayFormatField == 0) {
			    			constSizeBits += Integer.parseInt(cdf_same_field_rows[3]);//ELLEN
			    		}
			    		else {
			    			vbleSizeBits += Integer.parseInt(cdf_same_field_rows[3]);//ELLEN
			    		}
			    	}
			    	else {
		    			constSizeBits += Integer.parseInt(cdf_same_field_rows[3]);//ELLEN
		    			isArrayFormatField = countFields;
			    	}
	    	    }while ((cdf_same_field = cdf.readLine()) != null);
	    	    cdf.reset();
		    	
		    	if(isArrayFormatField == 0) {
		    		//insert CSField ApplicationData
		    		GSSTmTcFormatCSField csfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatCSField();
		    		csfield.setFid(Integer.toString(0));
		    		csfield.setPfid(Integer.toString(0));
		    		csfield.setName("ApplicationData");
		    		csfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
		    		csfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
		    		csfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
		    		
		    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
		    		formatSize.setBytes(Integer.toString(constSizeBits%8));
		    		formatSize.setBits(Integer.toString(constSizeBits/8));
		    		csfield.setSize(formatSize);
		    		
		    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
		    		formatOffset.setBytes(Integer.toString(0));
		    		formatOffset.setBits(Integer.toString(0));
		    		csfield.setGlobalOffset(formatOffset);
		    		
		    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
		    		if(format != null)
		    			format.getCSField().add(csfield);
		    	}
		    	else {
		    		//insert VSField ApplicationData
		    		GSSTmTcFormatVSField vsfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatVSField();
		    		vsfield.setFid(Integer.toString(0));
		    		vsfield.setPfid(Integer.toString(0));
		    		vsfield.setName("ApplicationData");
		    		vsfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
		    		vsfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
		    		vsfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
		    		
		    		GSSTmTcFormatConstSize formatConstSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatConstSize();
		    		formatConstSize.setBytes(Integer.toString(constSizeBits%8));
		    		formatConstSize.setBits(Integer.toString(constSizeBits/8));
		    		vsfield.setConstSize(formatConstSize);
		    		
		    		GSSTmTcFormatVariableSize formatVariableSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatVariableSize();
		    		formatVariableSize.setFidRef(Integer.toString(isArrayFormatField));
		    		formatVariableSize.setUnit(GSSTmTcFormatUnit.BYTES);
		    		vsfield.setVariableSize(formatVariableSize);

			    	n_max = (MAX_APP_DATA_BYTES*8 - constSizeBits) / vbleSizeBits;
		    		maxSizeBits = constSizeBits + n_max * vbleSizeBits;
		    		GSSTmTcFormatMaxSize formatMaxSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatMaxSize();
		    		formatMaxSize.setBytes(Integer.toString(maxSizeBits%8));
		    		formatMaxSize.setBits(Integer.toString(maxSizeBits/8));
		    		vsfield.setMaxSize(formatMaxSize);
		    		
		    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
		    		formatOffset.setBytes(Integer.toString(0));
		    		formatOffset.setBits(Integer.toString(0));
		    		vsfield.setGlobalOffset(formatOffset);
		    		
		    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
		    		if(format != null)
		    			format.getVSField().add(vsfield);
		    	}
	    	}
	    	fid++;
	    	lastID = cdf_rows[0];
	    	
	    	if(fid <= isArrayFormatField) {
	    		//insert CSFIELD
	    		GSSTmTcFormatCSField csfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatCSField();
	    		csfield.setFid(Integer.toString(fid));
	    		csfield.setPfid(Integer.toString(0));
	    		csfield.setName(cdf_rows[0]);//CNAME
	    		csfield.setDescription(cdf_rows[2]);//DESCR
	    		csfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		csfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		csfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
	    		
	    		Integer sizeBits = Integer.parseInt(cdf_rows[3]);//ELLEN
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		csfield.setSize(formatSize);
	    		
	    		Integer offsetBits = Integer.parseInt(cdf_rows[5]);//BIT
	    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
	    		formatOffset.setBytes(Integer.toString(offsetBits%8));
	    		formatOffset.setBits(Integer.toString(offsetBits/8));
	    		csfield.setGlobalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
	    		if(format != null)
	    			format.getCSField().add(csfield);
	    	}
	    	else if(fid > isArrayFormatField) {
	    		//insert AIFIELD too
	    		GSSTmTcFormatAIField aifield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatAIField();
	    		aifield.setFid(Integer.toString(fid));
	    		aifield.setPfid(Integer.toString(0));
	    		aifield.setName(cdf_rows[0]);//CNAME
	    		aifield.setDescription(cdf_rows[2]);//DESCR
	    		aifield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		aifield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		aifield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
	    		
	    		GSSTmTcFormatArrayRef arrayRef = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatArrayRef();
	    		arrayRef.setFidRef(Integer.toString(isArrayFormatField));
	    		aifield.setArrayRef(arrayRef);
	    		
	    		Integer sizeBits = Integer.parseInt(cdf_rows[3]);//ELLEN
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		aifield.setSize(formatSize);
	    		
	    		Integer offsetBits = Integer.parseInt(cdf_rows[5]) - constSizeBits;//BIT
	    		GSSTmTcFormatLocalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatLocalOffset();
	    		formatOffset.setBytes(Integer.toString(offsetBits%8));
	    		formatOffset.setBits(Integer.toString(offsetBits/8));
	    		aifield.setLocalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
	    		if(format != null)
	    			format.getAIField().add(aifield);
	    	}
	    	if(fid == isArrayFormatField) {
	    		//insert AFIELD
	    		GSSTmTcFormatAField afield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatAField();
	    		afield.setFid(Integer.toString(fid));
	    		afield.setPfid(Integer.toString(0));
	    		afield.setName(cdf_rows[0]);//CNAME
	    		afield.setDescription(cdf_rows[2]);//DESCR
	    		afield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		afield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		afield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
	    		
	    		GSSTmTcFormatArrayDimension arrayDimension = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatArrayDimension();
	    		arrayDimension.setFidRef(Integer.toString(isArrayFormatField));
	    		arrayDimension.setMaxItems(Integer.toString(n_max));
	    		afield.setArrayDimension(arrayDimension);
	    		
	    		Integer sizeBits = Integer.parseInt(cdf_rows[3]);//ELLEN
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		afield.setSize(formatSize);
	    		
	    		Integer offsetBits = Integer.parseInt(cdf_rows[5]);//BIT
	    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
	    		formatOffset.setBytes(Integer.toString(offsetBits%8));
	    		formatOffset.setBits(Integer.toString(offsetBits/8));
	    		afield.setGlobalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
	    		if(format != null)
	    			format.getAField().add(afield);
	    	}
		}
		cdf.close();

		//process TM database tables and populate the collection

		//read TM format names from PID table
		BufferedReader pid = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\pid.dat")));
	    String pid_line;
	    while ((pid_line = pid.readLine()) != null) {
	    	
	    	String[] pid_rows = pid_line.split("\t");
		    
			GSSTmTcFormatTmTcFormat format = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
			format.setName(pid_rows[5]);//NAME
			format.setProtocol(pid_rows[5]);//NAME
			format.setType(GSSTmTcFormatTmTcFormatType.TM);
			
			formats.put(pid_rows[5], format);
	    	
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
	    	
	    	if(plf_rows[0].compareTo("NID00048") == 0) {
	    		continue;
	    	}

	    	if(plf_rows[1].compareTo(lastID) != 0) {
	    		
	    		//new format, compare all fields to check if packet constant or variable
			    fid = 0;
		    	Integer sizeBits = 0;
		    	
	    		String plf_same_field = plf_line;
		    	plf.mark(7000);
	    		do {
	    	    	String[] plf_same_field_rows = plf_same_field.split("\t");
	    	    	if(plf_same_field_rows[0].compareTo("NID00048") == 0) {
	    	    		continue;
	    	    	}
	    	    	
	    	    	if(plf_same_field_rows[1].compareTo(plf_rows[1]) != 0) {
	    	    		break;
	    	    	}
	        		sizeBits += tmSizes.get(plf_same_field_rows[0]);
	    	    }while ((plf_same_field = plf.readLine()) != null);
	    		plf.reset();
	    	    
	    		//insert CSField SourceData
	    		GSSTmTcFormatCSField csfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatCSField();
	    		csfield.setFid(Integer.toString(0));
	    		csfield.setPfid(Integer.toString(0));
	    		csfield.setName("SourceData");
	    		csfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		csfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		csfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
	    		
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		csfield.setSize(formatSize);
	    		
	    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
	    		formatOffset.setBytes(Integer.toString(0));
	    		formatOffset.setBits(Integer.toString(0));
	    		csfield.setGlobalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(plf_rows[1]);
	    		if(format != null)
	    			format.getCSField().add(csfield);
	    	}
	    	fid++;
	    	lastID = plf_rows[1];

    		//insert CSFIELD
    		GSSTmTcFormatCSField csfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatCSField();
    		csfield.setFid(Integer.toString(fid));
    		csfield.setPfid(Integer.toString(0));
    		csfield.setName(plf_rows[0]);//NAME
    		csfield.setDescription(tmDescr.get(plf_rows[0]));
    		csfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
    		csfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
    		csfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);

    		Integer sizeBits = tmSizes.get(plf_rows[0]);
    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
    		formatSize.setBytes(Integer.toString(sizeBits%8));
    		formatSize.setBits(Integer.toString(sizeBits/8));
    		csfield.setSize(formatSize);
    		
    		Integer offsetBits = Integer.parseInt(plf_rows[2]) + Integer.parseInt(plf_rows[3]);//OFFBY+OFFBI
    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
    		formatOffset.setBytes(Integer.toString(offsetBits%8));
    		formatOffset.setBits(Integer.toString(offsetBits/8));
    		csfield.setGlobalOffset(formatOffset);
    		
    		GSSTmTcFormatTmTcFormat format = formats.get(plf_rows[1]);
    		if(format != null)
    			format.getCSField().add(csfield);
	    }
	    plf.close();

		//read TM fields from VPD table (variable packets)
		BufferedReader vpd = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\vpd.dat")));
	    String vpd_line;
	    Integer offsetBits = 0;
	    while ((vpd_line = vpd.readLine()) != null) {

	    	String[] vpd_rows = vpd_line.split("\t");
	    	Integer constSizeBits = 0, vbleSizeBits = 0, maxSizeBits = 0;
	    	
	    	if(vpd_rows[2].compareTo("NID00048") == 0) {
	    		continue;
	    	}

	    	if(vpd_rows[0].compareTo(lastID) != 0) {
	    		
	    		//new format, compare all fields to check if packet constant or variable
			    fid = 0;
			    offsetBits = 0;
		    	Integer countFields = 0;
	    		String vpd_same_field = vpd_line;
	    		vpd.mark(7000);
	    		do {

	    	    	String[] vpd_same_field_rows = vpd_same_field.split("\t");
	    	    	if(vpd_same_field_rows[2].compareTo("NID00048") == 0) {
	    	    		continue;
	    	    	}
	    	    	countFields++; 
	    	    	
	    	    	if(vpd_same_field_rows[0].compareTo(vpd_rows[0]) != 0) {
	    	    		break;
	    	    	}
	    	    	
			    	if(vpd_same_field_rows[3].compareTo("0") == 0) {//GRP_SIZE
			    		if(isArrayFormatField == 0) {
			    			constSizeBits += tmSizes.get(vpd_rows[2]);
			    		}
			    		else {
			    			vbleSizeBits += tmSizes.get(vpd_rows[2]);
			    		}
			    	}
			    	else {
		    			constSizeBits += tmSizes.get(vpd_rows[2]);
		    			isArrayFormatField = countFields;
			    	}
	    	    }while ((vpd_same_field = vpd.readLine()) != null);
	    		vpd.reset();
	    	    
	    		//insert VSField SourceData
	    		GSSTmTcFormatVSField vsfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatVSField();
	    		vsfield.setFid(Integer.toString(0));
	    		vsfield.setPfid(Integer.toString(0));
	    		vsfield.setName("SourceData");
	    		vsfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		vsfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		vsfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);

	    		GSSTmTcFormatConstSize formatConstSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatConstSize();
	    		formatConstSize.setBytes(Integer.toString(constSizeBits%8));
	    		formatConstSize.setBits(Integer.toString(constSizeBits/8));
	    		vsfield.setConstSize(formatConstSize);
	    		
	    		GSSTmTcFormatVariableSize formatVariableSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatVariableSize();
	    		formatVariableSize.setFidRef(Integer.toString(isArrayFormatField));
	    		formatVariableSize.setUnit(GSSTmTcFormatUnit.BYTES);
	    		vsfield.setVariableSize(formatVariableSize);

		    	n_max = (MAX_APP_DATA_BYTES*8 - constSizeBits) / vbleSizeBits;
	    		maxSizeBits = constSizeBits + n_max * vbleSizeBits;
	    		GSSTmTcFormatMaxSize formatMaxSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatMaxSize();
	    		formatMaxSize.setBytes(Integer.toString(maxSizeBits%8));
	    		formatMaxSize.setBits(Integer.toString(maxSizeBits/8));
	    		vsfield.setMaxSize(formatMaxSize);
	    		
	    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
	    		formatOffset.setBytes(Integer.toString(0));
	    		formatOffset.setBits(Integer.toString(0));
	    		vsfield.setGlobalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(vpd_rows[2]);
	    		if(format != null)
	    			format.getVSField().add(vsfield);
	    	}
	    	fid++;
	    	lastID = vpd_rows[3];

	    	if(fid <= isArrayFormatField) {
	    		//insert CSFIELD
	    		GSSTmTcFormatCSField csfield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatCSField();
	    		csfield.setFid(Integer.toString(fid));
	    		csfield.setPfid(Integer.toString(0));
	    		csfield.setName(vpd_rows[2]);//NAME
	    		csfield.setDescription(tmDescr.get(vpd_rows[2]));
	    		csfield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		csfield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		csfield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);

	    		Integer sizeBits = tmSizes.get(vpd_rows[2]);
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		csfield.setSize(formatSize);
	    		
	    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
	    		formatOffset.setBytes(Integer.toString(offsetBits%8));
	    		formatOffset.setBits(Integer.toString(offsetBits/8));
	    		csfield.setGlobalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(vpd_rows[2]);
	    		if(format != null)
	    			format.getCSField().add(csfield);
	    	}
	    	else if(fid > isArrayFormatField) {
	    		//insert AIFIELD too
	    		GSSTmTcFormatAIField aifield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatAIField();
	    		aifield.setFid(Integer.toString(fid));
	    		aifield.setPfid(Integer.toString(0));
	    		aifield.setName(vpd_rows[2]);//NAME
	    		aifield.setDescription(tmDescr.get(vpd_rows[2]));
	    		aifield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		aifield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		aifield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
	    		
	    		GSSTmTcFormatArrayRef arrayRef = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatArrayRef();
	    		arrayRef.setFidRef(Integer.toString(isArrayFormatField));
	    		aifield.setArrayRef(arrayRef);

	    		Integer sizeBits = tmSizes.get(vpd_rows[2]);
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		aifield.setSize(formatSize);
	    		
	    		GSSTmTcFormatLocalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatLocalOffset();
	    		formatOffset.setBytes(Integer.toString(offsetBits%8));
	    		formatOffset.setBits(Integer.toString(offsetBits/8));
	    		aifield.setLocalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(vpd_rows[2]);
	    		if(format != null)
	    			format.getAIField().add(aifield);
	    	}
	    	if(fid == isArrayFormatField) {
	    		//insert AFIELD
	    		GSSTmTcFormatAField afield = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatAField();
	    		afield.setFid(Integer.toString(fid));
	    		afield.setPfid(Integer.toString(0));
	    		afield.setName(vpd_rows[2]);//NAME
	    		afield.setDescription(tmDescr.get(vpd_rows[2]));
	    		afield.setType(GSSTmTcFormatFieldType.STRUCTURED);
	    		afield.setByteOrder(GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
	    		afield.setFirstBit(GSSTmTcFormatSFieldFirstBit.MSB);
	    		
	    		GSSTmTcFormatArrayDimension arrayDimension = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatArrayDimension();
	    		arrayDimension.setFidRef(Integer.toString(isArrayFormatField));
	    		arrayDimension.setMaxItems(Integer.toString(n_max));
	    		afield.setArrayDimension(arrayDimension);

	    		Integer sizeBits = tmSizes.get(vpd_rows[2]);
	    		GSSTmTcFormatSize formatSize = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatSize();
	    		formatSize.setBytes(Integer.toString(sizeBits%8));
	    		formatSize.setBits(Integer.toString(sizeBits/8));
	    		afield.setSize(formatSize);
	    		
	    		GSSTmTcFormatGlobalOffset formatOffset = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatGlobalOffset();
	    		formatOffset.setBytes(Integer.toString(offsetBits%8));
	    		formatOffset.setBits(Integer.toString(offsetBits/8));
	    		afield.setGlobalOffset(formatOffset);
	    		
	    		GSSTmTcFormatTmTcFormat format = formats.get(vpd_rows[2]);
	    		if(format != null)
	    			format.getAField().add(afield);
	    	}
	    	offsetBits += tmSizes.get(vpd_rows[2]);
	    }
	    vpd.close();
	    
		return formats.values();
	}

	public static Integer getSizeBitsFromPtcFfc(Integer ptc, Integer pfc)
	{
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
}