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
package es.uah.aut.srg.gss.lang.test_proc.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.lang.test_proc.services.TEST_PROCGrammarAccess;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps;
import es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable;
import es.uah.aut.srg.gss.test_proc.GSSTestProcFilter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets;
import es.uah.aut.srg.gss.test_proc.GSSTestProcStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
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
public class TEST_PROCSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TEST_PROCGrammarAccess grammarAccess;
	
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
		else if (epackage == test_procPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEP:
				sequence_GSSTestProcConcurrentStep(context, (GSSTestProcConcurrentStep) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEPS:
				sequence_GSSTestProcConcurrentSteps(context, (GSSTestProcConcurrentSteps) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_ENABLE_DISABLE:
				sequence_GSSTestProcEnableDisable(context, (GSSTestProcEnableDisable) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_FILTER:
				if (rule == grammarAccess.getGSSTestProcLevel0FilterRule()) {
					sequence_GSSTestProcLevel0Filter(context, (GSSTestProcFilter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSTestProcLevel1FilterRule()) {
					sequence_GSSTestProcLevel1Filter(context, (GSSTestProcFilter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSTestProcLevel2FilterRule()) {
					sequence_GSSTestProcLevel2Filter(context, (GSSTestProcFilter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSTestProcLevel3FilterRule()) {
					sequence_GSSTestProcLevel3Filter(context, (GSSTestProcFilter) semanticObject); 
					return; 
				}
				else break;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL0:
				sequence_GSSTestProcInputLevel0(context, (GSSTestProcInputLevel0) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1:
				sequence_GSSTestProcInputLevel1(context, (GSSTestProcInputLevel1) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL2:
				sequence_GSSTestProcInputLevel2(context, (GSSTestProcInputLevel2) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3:
				sequence_GSSTestProcInputLevel3(context, (GSSTestProcInputLevel3) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_INPUTS:
				sequence_GSSTestProcInputs(context, (GSSTestProcInputs) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_NEXT_STEP:
				sequence_GSSTestProcNextStep(context, (GSSTestProcNextStep) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0:
				sequence_GSSTestProcOutputLevel0(context, (GSSTestProcOutputLevel0) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL1:
				sequence_GSSTestProcOutputLevel1(context, (GSSTestProcOutputLevel1) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2:
				sequence_GSSTestProcOutputLevel2(context, (GSSTestProcOutputLevel2) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL3:
				sequence_GSSTestProcOutputLevel3(context, (GSSTestProcOutputLevel3) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_OUTPUTS:
				sequence_GSSTestProcOutputs(context, (GSSTestProcOutputs) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_SPECIAL_PACKETS:
				sequence_GSSTestProcSpecialPackets(context, (GSSTestProcSpecialPackets) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_STEP:
				sequence_GSSTestProcStep(context, (GSSTestProcStep) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_TEST_PROC:
				sequence_GSSTestProcTestProc(context, (GSSTestProcTestProc) semanticObject); 
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
	 *     importURI=STRING
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSTestProcTestProc)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcConcurrentStep returns GSSTestProcConcurrentStep
	 *
	 * Constraint:
	 *     id=INTEGER
	 */
	protected void sequence_GSSTestProcConcurrentStep(ISerializationContext context, GSSTestProcConcurrentStep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_CONCURRENT_STEP__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_CONCURRENT_STEP__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcConcurrentSteps returns GSSTestProcConcurrentSteps
	 *
	 * Constraint:
	 *     (nextStep=GSSTestProcNextStep concurrent_step+=GSSTestProcConcurrentStep+)
	 */
	protected void sequence_GSSTestProcConcurrentSteps(ISerializationContext context, GSSTestProcConcurrentSteps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcEnableDisable returns GSSTestProcEnableDisable
	 *
	 * Constraint:
	 *     id=INTEGER
	 */
	protected void sequence_GSSTestProcEnableDisable(ISerializationContext context, GSSTestProcEnableDisable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_ENABLE_DISABLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_ENABLE_DISABLE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcEnableDisableAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInput returns GSSTestProcInputLevel0
	 *     GSSTestProcInputLevel0 returns GSSTestProcInputLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level0=[GSSExportExport|VersionedQualifiedName]
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel0(ISerializationContext context, GSSTestProcInputLevel0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInput returns GSSTestProcInputLevel1
	 *     GSSTestProcInputLevel1 returns GSSTestProcInputLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level1=[GSSExportExport|VersionedQualifiedName] 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[GSSExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel1(ISerializationContext context, GSSTestProcInputLevel1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInput returns GSSTestProcInputLevel2
	 *     GSSTestProcInputLevel2 returns GSSTestProcInputLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level2=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level2=[GSSExportExport|VersionedQualifiedName] 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level2_to_level1=[GSSExportExport|VersionedQualifiedName]? 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[GSSExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel2(ISerializationContext context, GSSTestProcInputLevel2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInput returns GSSTestProcInputLevel3
	 *     GSSTestProcInputLevel3 returns GSSTestProcInputLevel3
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level3=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level3=[GSSExportExport|VersionedQualifiedName] 
	 *         level2=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level3_to_level2=[GSSExportExport|VersionedQualifiedName]? 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level2_to_level1=[GSSExportExport|VersionedQualifiedName]? 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[GSSExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel3(ISerializationContext context, GSSTestProcInputLevel3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInputs returns GSSTestProcInputs
	 *
	 * Constraint:
	 *     input+=GSSTestProcInput+
	 */
	protected void sequence_GSSTestProcInputs(ISerializationContext context, GSSTestProcInputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel0Filter returns GSSTestProcFilter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=[GSSFilterFilter|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSTestProcLevel0Filter(ISerializationContext context, GSSTestProcFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel1Filter returns GSSTestProcFilter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=[GSSFilterFilter|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSTestProcLevel1Filter(ISerializationContext context, GSSTestProcFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel2Filter returns GSSTestProcFilter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=[GSSFilterFilter|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSTestProcLevel2Filter(ISerializationContext context, GSSTestProcFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel3Filter returns GSSTestProcFilter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=[GSSFilterFilter|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSTestProcLevel3Filter(ISerializationContext context, GSSTestProcFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcNextStep returns GSSTestProcNextStep
	 *
	 * Constraint:
	 *     (id=INTEGER isConcurrent=GSSTestProcYesNo)
	 */
	protected void sequence_GSSTestProcNextStep(ISerializationContext context, GSSTestProcNextStep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_NEXT_STEP__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_NEXT_STEP__ID));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_NEXT_STEP__IS_CONCURRENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_NEXT_STEP__IS_CONCURRENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcNextStepAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0(), semanticObject.getIsConcurrent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutput returns GSSTestProcOutputLevel0
	 *     GSSTestProcOutputLevel0 returns GSSTestProcOutputLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel0(ISerializationContext context, GSSTestProcOutputLevel0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutput returns GSSTestProcOutputLevel1
	 *     GSSTestProcOutputLevel1 returns GSSTestProcOutputLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_filter=GSSTestProcLevel1Filter 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_from_level0=[GSSImportImport|VersionedQualifiedName]? 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel1(ISerializationContext context, GSSTestProcOutputLevel1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutput returns GSSTestProcOutputLevel2
	 *     GSSTestProcOutputLevel2 returns GSSTestProcOutputLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level2=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level2_filter=GSSTestProcLevel2Filter 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level2_from_level1=[GSSImportImport|VersionedQualifiedName]? 
	 *         level1_filter=GSSTestProcLevel1Filter 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_from_level0=[GSSImportImport|VersionedQualifiedName]? 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel2(ISerializationContext context, GSSTestProcOutputLevel2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutput returns GSSTestProcOutputLevel3
	 *     GSSTestProcOutputLevel3 returns GSSTestProcOutputLevel3
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level3=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level3_filter=GSSTestProcLevel3Filter 
	 *         level2=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level3_from_level2=[GSSImportImport|VersionedQualifiedName]? 
	 *         level2_filter=GSSTestProcLevel2Filter 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level2_from_level1=[GSSImportImport|VersionedQualifiedName]? 
	 *         level1_filter=GSSTestProcLevel1Filter 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_from_level0=[GSSImportImport|VersionedQualifiedName]? 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel3(ISerializationContext context, GSSTestProcOutputLevel3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutputs returns GSSTestProcOutputs
	 *
	 * Constraint:
	 *     (checkmode=GSSTestProcCheckmode valid_time_interval_value=INTEGER valid_time_interval_unit=GSSTestProcUnit output+=GSSTestProcOutput+)
	 */
	protected void sequence_GSSTestProcOutputs(ISerializationContext context, GSSTestProcOutputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcSpecialPackets returns GSSTestProcSpecialPackets
	 *
	 * Constraint:
	 *     (
	 *         enable+=GSSTestProcEnableDisable | 
	 *         disable+=GSSTestProcEnableDisable | 
	 *         enable_print+=GSSTestProcEnableDisable | 
	 *         disable_print+=GSSTestProcEnableDisable
	 *     )+
	 */
	protected void sequence_GSSTestProcSpecialPackets(ISerializationContext context, GSSTestProcSpecialPackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcStep returns GSSTestProcStep
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         (
	 *             prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName] 
	 *             output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName]
	 *         )? 
	 *         mode=GSSTestProcMode 
	 *         replays=INTEGER? 
	 *         inputs=GSSTestProcInputs 
	 *         outputs=GSSTestProcOutputs? 
	 *         specialPackets=GSSTestProcSpecialPackets? 
	 *         concurrent_steps=GSSTestProcConcurrentSteps?
	 *     )
	 */
	protected void sequence_GSSTestProcStep(ISerializationContext context, GSSTestProcStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcTestProc returns GSSTestProcTestProc
	 *
	 * Constraint:
	 *     (name=ID (uri=QualifiedName | version=Version)+ step+=GSSTestProcStep+)
	 */
	protected void sequence_GSSTestProcTestProc(ISerializationContext context, GSSTestProcTestProc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
