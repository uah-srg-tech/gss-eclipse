/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.lang.format.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.format.GSSFormatAField;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatArrayDimension;
import es.uah.aut.srg.gss.format.GSSFormatArrayRef;
import es.uah.aut.srg.gss.format.GSSFormatBytesBits;
import es.uah.aut.srg.gss.format.GSSFormatCSField;
import es.uah.aut.srg.gss.format.GSSFormatCSFormulaField;
import es.uah.aut.srg.gss.format.GSSFormatFDICField;
import es.uah.aut.srg.gss.format.GSSFormatFieldToCheck;
import es.uah.aut.srg.gss.format.GSSFormatFloatingOffset;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatFormula;
import es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck;
import es.uah.aut.srg.gss.format.GSSFormatVRFieldSize;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.format.GSSFormatVariableSize;
import es.uah.aut.srg.gss.format.formatPackage;
import es.uah.aut.srg.gss.lang.format.services.FORMATGrammarAccess;
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
public class FORMATSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FORMATGrammarAccess grammarAccess;
	
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
		else if (epackage == formatPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case formatPackage.GSS_FORMAT_AFIELD:
				sequence_GSSFormatAField(context, (GSSFormatAField) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_AI_FIELD:
				sequence_GSSFormatAIField(context, (GSSFormatAIField) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION:
				sequence_GSSFormatArrayDimension(context, (GSSFormatArrayDimension) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_ARRAY_REF:
				sequence_GSSFormatArrayRef(context, (GSSFormatArrayRef) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_BYTES_BITS:
				if (rule == grammarAccess.getGSSFormatConstSizeRule()) {
					sequence_GSSFormatConstSize(context, (GSSFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSFormatGlobalOffsetRule()) {
					sequence_GSSFormatGlobalOffset(context, (GSSFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSFormatLocalOffsetRule()) {
					sequence_GSSFormatLocalOffset(context, (GSSFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSFormatMaxSizeRule()) {
					sequence_GSSFormatMaxSize(context, (GSSFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSFormatSizeRule()) {
					sequence_GSSFormatSize(context, (GSSFormatBytesBits) semanticObject); 
					return; 
				}
				else break;
			case formatPackage.GSS_FORMAT_CS_FIELD:
				sequence_GSSFormatCSField(context, (GSSFormatCSField) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_CS_FORMULA_FIELD:
				sequence_GSSFormatCSFormulaField(context, (GSSFormatCSFormulaField) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_FDIC_FIELD:
				sequence_GSSFormatFDICField(context, (GSSFormatFDICField) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_FIELD_TO_CHECK:
				sequence_GSSFormatFieldToCheck(context, (GSSFormatFieldToCheck) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_FLOATING_OFFSET:
				sequence_GSSFormatFloatingOffset(context, (GSSFormatFloatingOffset) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_FORMAT:
				sequence_GSSFormatFormat(context, (GSSFormatFormat) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_FORMULA:
				sequence_GSSFormatFormula(context, (GSSFormatFormula) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_SORTED_FIELDS_TO_CHECK:
				sequence_GSSFormatSortedFieldsToCheck(context, (GSSFormatSortedFieldsToCheck) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_VR_FIELD_SIZE:
				sequence_GSSFormatVRFieldSize(context, (GSSFormatVRFieldSize) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_VS_FIELD:
				sequence_GSSFormatVSField(context, (GSSFormatVSField) semanticObject); 
				return; 
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE:
				sequence_GSSFormatVariableSize(context, (GSSFormatVariableSize) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatAField
	 *     GSSFormatAField returns GSSFormatAField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=GSSFormatFieldType 
	 *         byteOrder=GSSFormatFieldByteOrder 
	 *         firstBit=GSSFormatSFieldFirstBit 
	 *         arrayDimension=GSSFormatArrayDimension 
	 *         size=GSSFormatSize 
	 *         globalOffset=GSSFormatGlobalOffset
	 *     )
	 */
	protected void sequence_GSSFormatAField(ISerializationContext context, GSSFormatAField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatAIField
	 *     GSSFormatAIField returns GSSFormatAIField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=GSSFormatFieldType 
	 *         byteOrder=GSSFormatFieldByteOrder 
	 *         firstBit=GSSFormatSFieldFirstBit 
	 *         arrayRef=GSSFormatArrayRef 
	 *         size=GSSFormatSize 
	 *         localOffset=GSSFormatLocalOffset
	 *     )
	 */
	protected void sequence_GSSFormatAIField(ISerializationContext context, GSSFormatAIField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatArrayDimension returns GSSFormatArrayDimension
	 *
	 * Constraint:
	 *     (fidRef=INTEGER maxItems=INTEGER)
	 */
	protected void sequence_GSSFormatArrayDimension(ISerializationContext context, GSSFormatArrayDimension semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_ARRAY_DIMENSION__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_ARRAY_DIMENSION__FID_REF));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.accept(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0(), semanticObject.getMaxItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatArrayRef returns GSSFormatArrayRef
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_GSSFormatArrayRef(ISerializationContext context, GSSFormatArrayRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_ARRAY_REF__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_ARRAY_REF__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatCSField
	 *     GSSFormatCSField returns GSSFormatCSField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=GSSFormatFieldType 
	 *         byteOrder=GSSFormatFieldByteOrder 
	 *         firstBit=GSSFormatSFieldFirstBit 
	 *         size=GSSFormatSize 
	 *         globalOffset=GSSFormatGlobalOffset
	 *     )
	 */
	protected void sequence_GSSFormatCSField(ISerializationContext context, GSSFormatCSField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatCSFormulaField
	 *     GSSFormatCSFormulaField returns GSSFormatCSFormulaField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=GSSFormatFieldType 
	 *         byteOrder=GSSFormatFieldByteOrder 
	 *         firstBit=GSSFormatSFieldFirstBit 
	 *         size=GSSFormatSize 
	 *         globalOffset=GSSFormatGlobalOffset 
	 *         formula=GSSFormatFormula
	 *     )
	 */
	protected void sequence_GSSFormatCSFormulaField(ISerializationContext context, GSSFormatCSFormulaField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatConstSize returns GSSFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSFormatConstSize(ISerializationContext context, GSSFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatFDICField
	 *     GSSFormatFDICField returns GSSFormatFDICField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         checkType=GSSFormatCheckType 
	 *         byteOrder=GSSFormatFieldByteOrder 
	 *         firstBit=GSSFormatSFieldFirstBit 
	 *         size=GSSFormatSize 
	 *         floatingOffset=GSSFormatFloatingOffset 
	 *         sortedFieldsToCheck=GSSFormatSortedFieldsToCheck
	 *     )
	 */
	protected void sequence_GSSFormatFDICField(ISerializationContext context, GSSFormatFDICField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatFieldToCheck returns GSSFormatFieldToCheck
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_GSSFormatFieldToCheck(ISerializationContext context, GSSFormatFieldToCheck semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_FIELD_TO_CHECK__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_FIELD_TO_CHECK__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatFloatingOffset returns GSSFormatFloatingOffset
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_GSSFormatFloatingOffset(ISerializationContext context, GSSFormatFloatingOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_FLOATING_OFFSET__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_FLOATING_OFFSET__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatFormat returns GSSFormatFormat
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         uri=QualifiedName 
	 *         version=Version 
	 *         protocol=ID 
	 *         type=GSSFormatFormatType 
	 *         Field+=GSSFormatField*
	 *     )
	 */
	protected void sequence_GSSFormatFormat(ISerializationContext context, GSSFormatFormat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatFormula returns GSSFormatFormula
	 *
	 * Constraint:
	 *     (slope=STRING intercept=STRING)
	 */
	protected void sequence_GSSFormatFormula(ISerializationContext context, GSSFormatFormula semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_FORMULA__SLOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_FORMULA__SLOPE));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_FORMULA__INTERCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_FORMULA__INTERCEPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0(), semanticObject.getSlope());
		feeder.accept(grammarAccess.getGSSFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0(), semanticObject.getIntercept());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatGlobalOffset returns GSSFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSFormatGlobalOffset(ISerializationContext context, GSSFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatLocalOffset returns GSSFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSFormatLocalOffset(ISerializationContext context, GSSFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatMaxSize returns GSSFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSFormatMaxSize(ISerializationContext context, GSSFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatSize returns GSSFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_GSSFormatSize(ISerializationContext context, GSSFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getGSSFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatSortedFieldsToCheck returns GSSFormatSortedFieldsToCheck
	 *
	 * Constraint:
	 *     fieldToCheck+=GSSFormatFieldToCheck+
	 */
	protected void sequence_GSSFormatSortedFieldsToCheck(ISerializationContext context, GSSFormatSortedFieldsToCheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatVRFieldSize
	 *     GSSFormatVRFieldSize returns GSSFormatVRFieldSize
	 *
	 * Constraint:
	 *     (fid=INTEGER pfid=INTEGER name=STRING)
	 */
	protected void sequence_GSSFormatVRFieldSize(ISerializationContext context, GSSFormatVRFieldSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_FIELD__FID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_FIELD__FID));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.GSS_FORMAT_FIELD__PFID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.GSS_FORMAT_FIELD__PFID));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_OBJECT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0(), semanticObject.getFid());
		feeder.accept(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0(), semanticObject.getPfid());
		feeder.accept(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatField returns GSSFormatVSField
	 *     GSSFormatVSField returns GSSFormatVSField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=GSSFormatFieldType 
	 *         byteOrder=GSSFormatFieldByteOrder 
	 *         firstBit=GSSFormatSFieldFirstBit 
	 *         constSize=GSSFormatConstSize 
	 *         variableSize=GSSFormatVariableSize 
	 *         maxSize=GSSFormatMaxSize 
	 *         globalOffset=GSSFormatGlobalOffset
	 *     )
	 */
	protected void sequence_GSSFormatVSField(ISerializationContext context, GSSFormatVSField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFormatVariableSize returns GSSFormatVariableSize
	 *
	 * Constraint:
	 *     (fidRef=INTEGER unit=GSSFormatUnit power=GSSFormatPower?)
	 */
	protected void sequence_GSSFormatVariableSize(ISerializationContext context, GSSFormatVariableSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFileImport returns GSSModelFileImport
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSFormatFormat)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
