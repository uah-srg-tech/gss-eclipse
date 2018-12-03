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

		//process TC database tables and populate the collection
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

	    Integer fid = 0, isArrayFormatField = 0, n_max = 0;
		BufferedReader cdf = new BufferedReader(
		        new InputStreamReader(new FileInputStream(database+"\\cdf.dat")));
	    String cdf_line, lastID = "";
	    while ((cdf_line = cdf.readLine()) != null) {
	    	
	    	String[] cdf_rows = cdf_line.split("\t");
	    	Integer constSizeBits = 0, vbleSizeBits = 0, maxSizeBits = 0;
	    	if(cdf_rows[0].compareTo(lastID) != 0) {
	    		
	    		//new format, compare all fields to check if packet constant or variable
			    fid = 0;
		    	isArrayFormatField = 0;
		    	n_max = 0;
			    
		    	cdf.mark(1500);
	    		String cdf_same_field = cdf_line;
	    		Integer countFields = 0;
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
		    		
		    		// TODO: Check if "format" exists?
		    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
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
		    		
		    		// TODO: Check if "format" exists?
		    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
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
	    		
	    		// TODO: Check if "format" exists?
	    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
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
	    		
	    		// TODO: Check if "format" exists?
	    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
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
	    		
	    		// TODO: Check if "format" exists?
	    		GSSTmTcFormatTmTcFormat format = formats.get(cdf_rows[0]);
	    		format.getAField().add(afield);
	    	}
		}
		cdf.close();
		return formats.values();
	}
}