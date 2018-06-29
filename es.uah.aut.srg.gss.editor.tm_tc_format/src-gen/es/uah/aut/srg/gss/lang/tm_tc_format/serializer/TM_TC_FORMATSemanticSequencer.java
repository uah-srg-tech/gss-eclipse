/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.lang.tm_tc_format.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.lang.tm_tc_format.services.TM_TC_FORMATGrammarAccess;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TM_TC_FORMATSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TM_TC_FORMATGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == commonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case commonPackage.GSS_MODEL_FILE:
				sequence_GSSModelFile(context, (GSSModelFile) semanticObject); 
				return; 
			case commonPackage.GSS_MODEL_FILE_IMPORT:
				sequence_GSSModelFileImport(context, (GSSModelFileImport) semanticObject); 
				return; 
			}
		else if (epackage == tm_tc_formatPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AFIELD:
				sequence_GSSTmTcFormatAField(context, (GSSTmTcFormatAField) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD:
				sequence_GSSTmTcFormatAIField(context, (GSSTmTcFormatAIField) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_ARRAY_DIMENSION:
				sequence_GSSTmTcFormatArrayDimension(context, (GSSTmTcFormatArrayDimension) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_ARRAY_REF:
				sequence_GSSTmTcFormatArrayRef(context, (GSSTmTcFormatArrayRef) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD:
				sequence_GSSTmTcFormatCSField(context, (GSSTmTcFormatCSField) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FORMULA_FIELD:
				sequence_GSSTmTcFormatCSFormulaField(context, (GSSTmTcFormatCSFormulaField) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CONST_SIZE:
				sequence_GSSTmTcFormatConstSize(context, (GSSTmTcFormatConstSize) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD:
				sequence_GSSTmTcFormatFDICField(context, (GSSTmTcFormatFDICField) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_TO_CHECK:
				sequence_GSSTmTcFormatFieldToCheck(context, (GSSTmTcFormatFieldToCheck) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET:
				sequence_GSSTmTcFormatFloatingOffset(context, (GSSTmTcFormatFloatingOffset) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA:
				sequence_GSSTmTcFormatFormula(context, (GSSTmTcFormatFormula) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_GLOBAL_OFFSET:
				sequence_GSSTmTcFormatGlobalOffset(context, (GSSTmTcFormatGlobalOffset) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_LOCAL_OFFSET:
				sequence_GSSTmTcFormatLocalOffset(context, (GSSTmTcFormatLocalOffset) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE:
				sequence_GSSTmTcFormatMaxSize(context, (GSSTmTcFormatMaxSize) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SIZE:
				sequence_GSSTmTcFormatSize(context, (GSSTmTcFormatSize) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK:
				sequence_GSSTmTcFormatSortedFieldsToCheck(context, (GSSTmTcFormatSortedFieldsToCheck) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT:
				sequence_GSSTmTcFormatTmTCFormat(context, (GSSTmTcFormatTmTCFormat) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VR_FIELD_SIZE:
				sequence_GSSTmTcFormatVRFieldSize(context, (GSSTmTcFormatVRFieldSize) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD:
				sequence_GSSTmTcFormatVSField(context, (GSSTmTcFormatVSField) semanticObject); 
				return; 
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VARIABLE_SIZE:
				sequence_GSSTmTcFormatVariableSize(context, (GSSTmTcFormatVariableSize) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSModelFileImport returns GSSModelFileImport
	 *
	 * Constraint:
	 *     importURI=ID
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSTmTcFormatTmTCFormat)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatAField returns GSSTmTcFormatAField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=ID 
	 *         description=ID? 
	 *         type=GSSTmTcFormatFieldType 
	 *         byteOrder=GSSTmTcFormatFieldByteOrder 
	 *         firstBit=GSSTmTcFormatSFieldFirstBit 
	 *         size=GSSTmTcFormatSize 
	 *         globalOffset=GSSTmTcFormatGlobalOffset 
	 *         arrayDimension=GSSTmTcFormatArrayDimension
	 *     )
	 */
	protected void sequence_GSSTmTcFormatAField(ISerializationContext context, GSSTmTcFormatAField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatAIField returns GSSTmTcFormatAIField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=ID 
	 *         description=ID? 
	 *         type=GSSTmTcFormatFieldType 
	 *         byteOrder=GSSTmTcFormatFieldByteOrder 
	 *         firstBit=GSSTmTcFormatSFieldFirstBit 
	 *         size=GSSTmTcFormatSize 
	 *         localOffset=GSSTmTcFormatLocalOffset 
	 *         arrayRef=GSSTmTcFormatArrayRef
	 *     )
	 */
	protected void sequence_GSSTmTcFormatAIField(ISerializationContext context, GSSTmTcFormatAIField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatArrayDimension returns GSSTmTcFormatArrayDimension
	 *
	 * Constraint:
	 *     (fidRef=INTEGER maxItems=INTEGER)
	 */
	protected void sequence_GSSTmTcFormatArrayDimension(ISerializationContext context, GSSTmTcFormatArrayDimension semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_ARRAY_DIMENSION__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_ARRAY_DIMENSION__FID_REF));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_ARRAY_DIMENSION__MAX_ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_ARRAY_DIMENSION__MAX_ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.accept(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0(), semanticObject.getMaxItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatArrayRef returns GSSTmTcFormatArrayRef
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_GSSTmTcFormatArrayRef(ISerializationContext context, GSSTmTcFormatArrayRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_ARRAY_REF__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_ARRAY_REF__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatCSField returns GSSTmTcFormatCSField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=ID 
	 *         description=ID? 
	 *         type=GSSTmTcFormatFieldType 
	 *         byteOrder=GSSTmTcFormatFieldByteOrder 
	 *         firstBit=GSSTmTcFormatSFieldFirstBit 
	 *         size=GSSTmTcFormatSize 
	 *         globalOffset=GSSTmTcFormatGlobalOffset
	 *     )
	 */
	protected void sequence_GSSTmTcFormatCSField(ISerializationContext context, GSSTmTcFormatCSField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatCSFormulaField returns GSSTmTcFormatCSFormulaField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=ID 
	 *         description=ID? 
	 *         type=GSSTmTcFormatFieldType 
	 *         byteOrder=GSSTmTcFormatFieldByteOrder 
	 *         firstBit=GSSTmTcFormatSFieldFirstBit 
	 *         size=GSSTmTcFormatSize 
	 *         globalOffset=GSSTmTcFormatGlobalOffset 
	 *         formula=GSSTmTcFormatFormula
	 *     )
	 */
	protected void sequence_GSSTmTcFormatCSFormulaField(ISerializationContext context, GSSTmTcFormatCSFormulaField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatConstSize returns GSSTmTcFormatConstSize
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSTmTcFormatConstSize(ISerializationContext context, GSSTmTcFormatConstSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_CONST_SIZE__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_CONST_SIZE__BYTES));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_CONST_SIZE__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_CONST_SIZE__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatFDICField returns GSSTmTcFormatFDICField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=ID 
	 *         description=ID? 
	 *         checkType=GSSTmTcFormatCheckType 
	 *         byteOrder=GSSTmTcFormatFieldByteOrder 
	 *         firstBit=GSSTmTcFormatSFieldFirstBit 
	 *         size=GSSTmTcFormatSize 
	 *         floatingOffset=GSSTmTcFormatFloatingOffset 
	 *         sortedFieldsToCheck=GSSTmTcFormatSortedFieldsToCheck
	 *     )
	 */
	protected void sequence_GSSTmTcFormatFDICField(ISerializationContext context, GSSTmTcFormatFDICField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatFieldToCheck returns GSSTmTcFormatFieldToCheck
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_GSSTmTcFormatFieldToCheck(ISerializationContext context, GSSTmTcFormatFieldToCheck semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FIELD_TO_CHECK__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FIELD_TO_CHECK__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatFloatingOffset returns GSSTmTcFormatFloatingOffset
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_GSSTmTcFormatFloatingOffset(ISerializationContext context, GSSTmTcFormatFloatingOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatFormula returns GSSTmTcFormatFormula
	 *
	 * Constraint:
	 *     (slope=REAL intercept=REAL)
	 */
	protected void sequence_GSSTmTcFormatFormula(ISerializationContext context, GSSTmTcFormatFormula semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FORMULA__SLOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FORMULA__SLOPE));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeREALParserRuleCall_4_0(), semanticObject.getSlope());
		feeder.accept(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptREALParserRuleCall_8_0(), semanticObject.getIntercept());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatGlobalOffset returns GSSTmTcFormatGlobalOffset
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSTmTcFormatGlobalOffset(ISerializationContext context, GSSTmTcFormatGlobalOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BYTES));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatLocalOffset returns GSSTmTcFormatLocalOffset
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSTmTcFormatLocalOffset(ISerializationContext context, GSSTmTcFormatLocalOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_LOCAL_OFFSET__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_LOCAL_OFFSET__BYTES));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_LOCAL_OFFSET__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_LOCAL_OFFSET__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatMaxSize returns GSSTmTcFormatMaxSize
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSTmTcFormatMaxSize(ISerializationContext context, GSSTmTcFormatMaxSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_MAX_SIZE__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_MAX_SIZE__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatSize returns GSSTmTcFormatSize
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSTmTcFormatSize(ISerializationContext context, GSSTmTcFormatSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_SIZE__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_SIZE__BYTES));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_SIZE__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_SIZE__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatSortedFieldsToCheck returns GSSTmTcFormatSortedFieldsToCheck
	 *
	 * Constraint:
	 *     fieldToCheck+=GSSTmTcFormatFieldToCheck+
	 */
	protected void sequence_GSSTmTcFormatSortedFieldsToCheck(ISerializationContext context, GSSTmTcFormatSortedFieldsToCheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatTmTCFormat returns GSSTmTcFormatTmTCFormat
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             ((uri=QualifiedName | version=Version | protocol=ID) (type=GSSTmTcFormatTmTCFormatType CSField+=GSSTmTcFormatCSField?)?)+ | 
	 *             (
	 *                 type=GSSTmTcFormatTmTCFormatType 
	 *                 CSField+=GSSTmTcFormatCSField? 
	 *                 (
	 *                     (
	 *                         type=GSSTmTcFormatTmTCFormatType | 
	 *                         CSFormulaField+=GSSTmTcFormatCSFormulaField | 
	 *                         VSField+=GSSTmTcFormatVSField | 
	 *                         FDICField+=GSSTmTcFormatFDICField | 
	 *                         VRFieldSize+=GSSTmTcFormatVRFieldSize | 
	 *                         AField+=GSSTmTcFormatAField | 
	 *                         AIField+=GSSTmTcFormatAIField
	 *                     )? 
	 *                     CSField+=GSSTmTcFormatCSField?
	 *                 )* 
	 *                 ((uri=QualifiedName | version=Version | protocol=ID) (type=GSSTmTcFormatTmTCFormatType CSField+=GSSTmTcFormatCSField?)?)+
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_GSSTmTcFormatTmTCFormat(ISerializationContext context, GSSTmTcFormatTmTCFormat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatVRFieldSize returns GSSTmTcFormatVRFieldSize
	 *
	 * Constraint:
	 *     (fid=INTEGER pfid=INTEGER name=ID)
	 */
	protected void sequence_GSSTmTcFormatVRFieldSize(ISerializationContext context, GSSTmTcFormatVRFieldSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VR_FIELD_SIZE__FID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VR_FIELD_SIZE__FID));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VR_FIELD_SIZE__PFID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VR_FIELD_SIZE__PFID));
			if (transientValues.isValueTransient(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VR_FIELD_SIZE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VR_FIELD_SIZE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0(), semanticObject.getFid());
		feeder.accept(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0(), semanticObject.getPfid());
		feeder.accept(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameIDTerminalRuleCall_12_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatVSField returns GSSTmTcFormatVSField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=ID 
	 *         description=ID? 
	 *         type=GSSTmTcFormatFieldType 
	 *         byteOrder=GSSTmTcFormatFieldByteOrder 
	 *         firstBit=GSSTmTcFormatSFieldFirstBit 
	 *         constSize=GSSTmTcFormatConstSize 
	 *         globalOffset=GSSTmTcFormatGlobalOffset 
	 *         maxSize=GSSTmTcFormatMaxSize 
	 *         variableSize=GSSTmTcFormatVariableSize
	 *     )
	 */
	protected void sequence_GSSTmTcFormatVSField(ISerializationContext context, GSSTmTcFormatVSField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTmTcFormatVariableSize returns GSSTmTcFormatVariableSize
	 *
	 * Constraint:
	 *     (fidRef=INTEGER unit=GSSTmTcFormatUnit power=GSSTmTcFormatPower?)
	 */
	protected void sequence_GSSTmTcFormatVariableSize(ISerializationContext context, GSSTmTcFormatVariableSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
