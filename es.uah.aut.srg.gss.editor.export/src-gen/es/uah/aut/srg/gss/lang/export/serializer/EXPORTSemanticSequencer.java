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
package es.uah.aut.srg.gss.lang.export.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.export.GSSExportActivateDICs;
import es.uah.aut.srg.gss.export.GSSExportDIC;
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile;
import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingFromField;
import es.uah.aut.srg.gss.export.GSSExportSettingFromFile;
import es.uah.aut.srg.gss.export.GSSExportSettingFromSize;
import es.uah.aut.srg.gss.export.GSSExportSettings;
import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength;
import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine;
import es.uah.aut.srg.gss.export.GSSExportSizeInBits;
import es.uah.aut.srg.gss.export.GSSExportSizes;
import es.uah.aut.srg.gss.export.exportPackage;
import es.uah.aut.srg.gss.lang.export.services.EXPORTGrammarAccess;
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
public class EXPORTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EXPORTGrammarAccess grammarAccess;
	
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
		else if (epackage == exportPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS:
				sequence_GSSExportActivateDICs(context, (GSSExportActivateDICs) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_DIC:
				sequence_GSSExportDIC(context, (GSSExportDIC) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_EXPORT:
				sequence_GSSExportExport(context, (GSSExportExport) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST:
				sequence_GSSExportSettingAIFromConst(context, (GSSExportSettingAIFromConst) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE:
				sequence_GSSExportSettingAIFromFile(context, (GSSExportSettingAIFromFile) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST:
				sequence_GSSExportSettingFromConst(context, (GSSExportSettingFromConst) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD:
				sequence_GSSExportSettingFromField(context, (GSSExportSettingFromField) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTING_FROM_FILE:
				sequence_GSSExportSettingFromFile(context, (GSSExportSettingFromFile) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTING_FROM_SIZE:
				sequence_GSSExportSettingFromSize(context, (GSSExportSettingFromSize) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SETTINGS:
				sequence_GSSExportSettings(context, (GSSExportSettings) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH:
				sequence_GSSExportSizeFromFileLength(context, (GSSExportSizeFromFileLength) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE:
				sequence_GSSExportSizeFromFileLine(context, (GSSExportSizeFromFileLine) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SIZE_IN_BITS:
				sequence_GSSExportSizeInBits(context, (GSSExportSizeInBits) semanticObject); 
				return; 
			case exportPackage.GSS_EXPORT_SIZES:
				sequence_GSSExportSizes(context, (GSSExportSizes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSExportActivateDICs returns GSSExportActivateDICs
	 *
	 * Constraint:
	 *     DIC+=GSSExportDIC+
	 */
	protected void sequence_GSSExportActivateDICs(ISerializationContext context, GSSExportActivateDICs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportDIC returns GSSExportDIC
	 *
	 * Constraint:
	 *     (id=INTEGER DICRef=ID)
	 */
	protected void sequence_GSSExportDIC(ISerializationContext context, GSSExportDIC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_DIC__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_DIC__ID));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_DIC__DIC_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_DIC__DIC_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSExportDICAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSExportDICAccess().getDICRefIDTerminalRuleCall_8_0(), semanticObject.getDICRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportExport returns GSSExportExport
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (uri=QualifiedName | version=Version)+ 
	 *         from=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         to=[GSSFormatFormat|VersionedQualifiedName] 
	 *         Sizes=GSSExportSizes? 
	 *         settings=GSSExportSettings 
	 *         activateDICs=GSSExportActivateDICs?
	 *     )
	 */
	protected void sequence_GSSExportExport(ISerializationContext context, GSSExportExport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSetting returns GSSExportSettingAIFromConst
	 *     GSSExportSettingAIFromConst returns GSSExportSettingAIFromConst
	 *
	 * Constraint:
	 *     (value=INTEGER toFieldRef=[GSSFormatAIField|VersionedQualifiedReferenceName] toArrayIndex=INTEGER)
	 */
	protected void sequence_GSSExportSettingAIFromConst(ISerializationContext context, GSSExportSettingAIFromConst semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.accept(grammarAccess.getGSSExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0(), semanticObject.getToArrayIndex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSetting returns GSSExportSettingAIFromFile
	 *     GSSExportSettingAIFromFile returns GSSExportSettingAIFromFile
	 *
	 * Constraint:
	 *     (
	 *         file=ID 
	 *         toFieldRef=[GSSFormatAIField|VersionedQualifiedReferenceName] 
	 *         toArrayIndex=INTEGER 
	 *         offset=INTEGER? 
	 *         size=INTEGER? 
	 *         line=INTEGER?
	 *     )
	 */
	protected void sequence_GSSExportSettingAIFromFile(ISerializationContext context, GSSExportSettingAIFromFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSetting returns GSSExportSettingFromConst
	 *     GSSExportSettingFromConst returns GSSExportSettingFromConst
	 *
	 * Constraint:
	 *     (value=INTEGER toFieldRef=[GSSFormatField|VersionedQualifiedReferenceName])
	 */
	protected void sequence_GSSExportSettingFromConst(ISerializationContext context, GSSExportSettingFromConst semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_FROM_CONST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_FROM_CONST__VALUE));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSetting returns GSSExportSettingFromField
	 *     GSSExportSettingFromField returns GSSExportSettingFromField
	 *
	 * Constraint:
	 *     (fieldRef=[GSSFormatField|VersionedQualifiedReferenceName] toFieldRef=[GSSFormatField|VersionedQualifiedReferenceName])
	 */
	protected void sequence_GSSExportSettingFromField(ISerializationContext context, GSSExportSettingFromField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSetting returns GSSExportSettingFromFile
	 *     GSSExportSettingFromFile returns GSSExportSettingFromFile
	 *
	 * Constraint:
	 *     (file=ID toFieldRef=[GSSFormatField|VersionedQualifiedReferenceName] offset=INTEGER? size=INTEGER? line=INTEGER?)
	 */
	protected void sequence_GSSExportSettingFromFile(ISerializationContext context, GSSExportSettingFromFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSetting returns GSSExportSettingFromSize
	 *     GSSExportSettingFromSize returns GSSExportSettingFromSize
	 *
	 * Constraint:
	 *     (sizeRef=INTEGER toFieldRef=[GSSFormatField|VersionedQualifiedReferenceName])
	 */
	protected void sequence_GSSExportSettingFromSize(ISerializationContext context, GSSExportSettingFromSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_FROM_SIZE__SIZE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING_FROM_SIZE__SIZE_REF));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.GSS_EXPORT_SETTING__TO_FIELD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0(), semanticObject.getSizeRef());
		feeder.accept(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSettings returns GSSExportSettings
	 *
	 * Constraint:
	 *     setting+=GSSExportSetting*
	 */
	protected void sequence_GSSExportSettings(ISerializationContext context, GSSExportSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSize returns GSSExportSizeFromFileLength
	 *     GSSExportSizeFromFileLength returns GSSExportSizeFromFileLength
	 *
	 * Constraint:
	 *     (id=INTEGER fromFile=ID addSize=INTEGER? unit=GSSExportUnit?)
	 */
	protected void sequence_GSSExportSizeFromFileLength(ISerializationContext context, GSSExportSizeFromFileLength semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSize returns GSSExportSizeFromFileLine
	 *     GSSExportSizeFromFileLine returns GSSExportSizeFromFileLine
	 *
	 * Constraint:
	 *     (id=INTEGER fromFile=ID line=INTEGER addSize=INTEGER? unit=GSSExportUnit?)
	 */
	protected void sequence_GSSExportSizeFromFileLine(ISerializationContext context, GSSExportSizeFromFileLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSize returns GSSExportSizeInBits
	 *     GSSExportSizeInBits returns GSSExportSizeInBits
	 *
	 * Constraint:
	 *     (id=INTEGER from=ID addSize=INTEGER? unit=GSSExportUnit?)
	 */
	protected void sequence_GSSExportSizeInBits(ISerializationContext context, GSSExportSizeInBits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSExportSizes returns GSSExportSizes
	 *
	 * Constraint:
	 *     size+=GSSExportSize+
	 */
	protected void sequence_GSSExportSizes(ISerializationContext context, GSSExportSizes semanticObject) {
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
	 *     (imports+=GSSModelFileImport* element=GSSExportExport)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
