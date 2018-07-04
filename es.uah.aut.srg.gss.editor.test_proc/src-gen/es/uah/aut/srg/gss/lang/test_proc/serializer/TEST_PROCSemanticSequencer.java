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
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps;
import es.uah.aut.srg.gss.test_proc.GSSTestProcDisable;
import es.uah.aut.srg.gss.test_proc.GSSTestProcDisablePrint;
import es.uah.aut.srg.gss.test_proc.GSSTestProcEnable;
import es.uah.aut.srg.gss.test_proc.GSSTestProcEnablePrint;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1FromLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1ToLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2FromLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2ToLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3FromLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3ToLevel2;
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
			case test_procPackage.GSS_TEST_PROC_APP_TO_LEVEL0:
				sequence_GSSTestProcAppToLevel0(context, (GSSTestProcAppToLevel0) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_APP_TO_LEVEL1:
				sequence_GSSTestProcAppToLevel1(context, (GSSTestProcAppToLevel1) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_APP_TO_LEVEL2:
				sequence_GSSTestProcAppToLevel2(context, (GSSTestProcAppToLevel2) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_APP_TO_LEVEL3:
				sequence_GSSTestProcAppToLevel3(context, (GSSTestProcAppToLevel3) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEP:
				sequence_GSSTestProcConcurrentStep(context, (GSSTestProcConcurrentStep) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEPS:
				sequence_GSSTestProcConcurrentSteps(context, (GSSTestProcConcurrentSteps) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_DISABLE:
				sequence_GSSTestProcDisable(context, (GSSTestProcDisable) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_DISABLE_PRINT:
				sequence_GSSTestProcDisablePrint(context, (GSSTestProcDisablePrint) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_ENABLE:
				sequence_GSSTestProcEnable(context, (GSSTestProcEnable) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_ENABLE_PRINT:
				sequence_GSSTestProcEnablePrint(context, (GSSTestProcEnablePrint) semanticObject); 
				return; 
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
			case test_procPackage.GSS_TEST_PROC_LEVEL0:
				sequence_GSSTestProcLevel0(context, (GSSTestProcLevel0) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER:
				sequence_GSSTestProcLevel0Filter(context, (GSSTestProcLevel0Filter) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL1:
				sequence_GSSTestProcLevel1(context, (GSSTestProcLevel1) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL1_FILTER:
				sequence_GSSTestProcLevel1Filter(context, (GSSTestProcLevel1Filter) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL1_FROM_LEVEL0:
				sequence_GSSTestProcLevel1FromLevel0(context, (GSSTestProcLevel1FromLevel0) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL1_TO_LEVEL0:
				sequence_GSSTestProcLevel1ToLevel0(context, (GSSTestProcLevel1ToLevel0) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL2:
				sequence_GSSTestProcLevel2(context, (GSSTestProcLevel2) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL2_FILTER:
				sequence_GSSTestProcLevel2Filter(context, (GSSTestProcLevel2Filter) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL2_FROM_LEVEL1:
				sequence_GSSTestProcLevel2FromLevel1(context, (GSSTestProcLevel2FromLevel1) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL2_TO_LEVEL1:
				sequence_GSSTestProcLevel2ToLevel1(context, (GSSTestProcLevel2ToLevel1) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL3:
				sequence_GSSTestProcLevel3(context, (GSSTestProcLevel3) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL3_FILTER:
				sequence_GSSTestProcLevel3Filter(context, (GSSTestProcLevel3Filter) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL3_FROM_LEVEL2:
				sequence_GSSTestProcLevel3FromLevel2(context, (GSSTestProcLevel3FromLevel2) semanticObject); 
				return; 
			case test_procPackage.GSS_TEST_PROC_LEVEL3_TO_LEVEL2:
				sequence_GSSTestProcLevel3ToLevel2(context, (GSSTestProcLevel3ToLevel2) semanticObject); 
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
	 *     importURI=ID
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_2_0(), semanticObject.getImportURI());
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
	 *     GSSTestProcAppToLevel0 returns GSSTestProcAppToLevel0
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcAppToLevel0(ISerializationContext context, GSSTestProcAppToLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL0__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL0__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcAppToLevel0Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcAppToLevel1 returns GSSTestProcAppToLevel1
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcAppToLevel1(ISerializationContext context, GSSTestProcAppToLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL1__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL1__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcAppToLevel1Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcAppToLevel2 returns GSSTestProcAppToLevel2
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcAppToLevel2(ISerializationContext context, GSSTestProcAppToLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL2__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL2__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcAppToLevel2Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcAppToLevel3 returns GSSTestProcAppToLevel3
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcAppToLevel3(ISerializationContext context, GSSTestProcAppToLevel3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL3__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_APP_TO_LEVEL3__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcAppToLevel3Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
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
	 *     GSSTestProcDisablePrint returns GSSTestProcDisablePrint
	 *
	 * Constraint:
	 *     id=INTEGER
	 */
	protected void sequence_GSSTestProcDisablePrint(ISerializationContext context, GSSTestProcDisablePrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_DISABLE_PRINT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_DISABLE_PRINT__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcDisablePrintAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcDisable returns GSSTestProcDisable
	 *
	 * Constraint:
	 *     id=INTEGER
	 */
	protected void sequence_GSSTestProcDisable(ISerializationContext context, GSSTestProcDisable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_DISABLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_DISABLE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcDisableAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcEnablePrint returns GSSTestProcEnablePrint
	 *
	 * Constraint:
	 *     id=INTEGER
	 */
	protected void sequence_GSSTestProcEnablePrint(ISerializationContext context, GSSTestProcEnablePrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_ENABLE_PRINT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_ENABLE_PRINT__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcEnablePrintAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcEnable returns GSSTestProcEnable
	 *
	 * Constraint:
	 *     id=INTEGER
	 */
	protected void sequence_GSSTestProcEnable(ISerializationContext context, GSSTestProcEnable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_ENABLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_ENABLE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcEnableAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInputLevel0 returns GSSTestProcInputLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level0=GSSTestProcLevel0 
	 *         app_to_level0=GSSTestProcAppToLevel0
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel0(ISerializationContext context, GSSTestProcInputLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__NAME));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__IF_REF));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__DELAY_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__DELAY_VALUE));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__DELAY_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__DELAY_UNIT));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__APP_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL0__APP_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcInputLevel0Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueINTEGERParserRuleCall_12_0(), semanticObject.getDelay_value());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0(), semanticObject.getDelay_unit());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0GSSTestProcLevel0ParserRuleCall_18_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0GSSTestProcAppToLevel0ParserRuleCall_19_0(), semanticObject.getApp_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInputLevel1 returns GSSTestProcInputLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level1=GSSTestProcLevel1 
	 *         app_to_level1=GSSTestProcAppToLevel1 
	 *         level0=GSSTestProcLevel0 
	 *         level1_to_level0=GSSTestProcLevel1ToLevel0
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel1(ISerializationContext context, GSSTestProcInputLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__NAME));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueINTEGERParserRuleCall_12_0(), semanticObject.getDelay_value());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0(), semanticObject.getDelay_unit());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1GSSTestProcLevel1ParserRuleCall_18_0(), semanticObject.getLevel1());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1GSSTestProcAppToLevel1ParserRuleCall_19_0(), semanticObject.getApp_to_level1());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0GSSTestProcLevel0ParserRuleCall_20_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0GSSTestProcLevel1ToLevel0ParserRuleCall_21_0(), semanticObject.getLevel1_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInputLevel2 returns GSSTestProcInputLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level2=GSSTestProcLevel2 
	 *         app_to_level2=GSSTestProcAppToLevel2 
	 *         level1=GSSTestProcLevel1 
	 *         level2_to_level1=GSSTestProcLevel2ToLevel1 
	 *         level0=GSSTestProcLevel0 
	 *         level1_to_level0=GSSTestProcLevel1ToLevel0
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel2(ISerializationContext context, GSSTestProcInputLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__NAME));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__IF_REF));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__DELAY_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__DELAY_VALUE));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__DELAY_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__DELAY_UNIT));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__APP_TO_LEVEL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__APP_TO_LEVEL2));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2_TO_LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2_TO_LEVEL1));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueINTEGERParserRuleCall_12_0(), semanticObject.getDelay_value());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0(), semanticObject.getDelay_unit());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2GSSTestProcLevel2ParserRuleCall_18_0(), semanticObject.getLevel2());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2GSSTestProcAppToLevel2ParserRuleCall_19_0(), semanticObject.getApp_to_level2());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1GSSTestProcLevel1ParserRuleCall_20_0(), semanticObject.getLevel1());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1GSSTestProcLevel2ToLevel1ParserRuleCall_21_0(), semanticObject.getLevel2_to_level1());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0GSSTestProcLevel0ParserRuleCall_22_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0GSSTestProcLevel1ToLevel0ParserRuleCall_23_0(), semanticObject.getLevel1_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInputLevel3 returns GSSTestProcInputLevel3
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ifRef=INTEGER 
	 *         delay_value=INTEGER 
	 *         delay_unit=GSSTestProcUnit 
	 *         level3=GSSTestProcLevel3 
	 *         app_to_level3=GSSTestProcAppToLevel3 
	 *         level2=GSSTestProcLevel2 
	 *         level3_to_level2=GSSTestProcLevel3ToLevel2 
	 *         level1=GSSTestProcLevel1 
	 *         level2_to_level1=GSSTestProcLevel2ToLevel1 
	 *         level0=GSSTestProcLevel0 
	 *         level1_to_level0=GSSTestProcLevel1ToLevel0
	 *     )
	 */
	protected void sequence_GSSTestProcInputLevel3(ISerializationContext context, GSSTestProcInputLevel3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__NAME));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueINTEGERParserRuleCall_12_0(), semanticObject.getDelay_value());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0(), semanticObject.getDelay_unit());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3GSSTestProcLevel3ParserRuleCall_18_0(), semanticObject.getLevel3());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3GSSTestProcAppToLevel3ParserRuleCall_19_0(), semanticObject.getApp_to_level3());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2GSSTestProcLevel2ParserRuleCall_20_0(), semanticObject.getLevel2());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2GSSTestProcLevel3ToLevel2ParserRuleCall_21_0(), semanticObject.getLevel3_to_level2());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1GSSTestProcLevel1ParserRuleCall_22_0(), semanticObject.getLevel1());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1GSSTestProcLevel2ToLevel1ParserRuleCall_23_0(), semanticObject.getLevel2_to_level1());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0GSSTestProcLevel0ParserRuleCall_24_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0GSSTestProcLevel1ToLevel0ParserRuleCall_25_0(), semanticObject.getLevel1_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcInputs returns GSSTestProcInputs
	 *
	 * Constraint:
	 *     (
	 *         input_level_3+=GSSTestProcInputLevel3 | 
	 *         input_level_2+=GSSTestProcInputLevel2 | 
	 *         input_level_1+=GSSTestProcInputLevel1 | 
	 *         input_level_0+=GSSTestProcInputLevel0
	 *     )+
	 */
	protected void sequence_GSSTestProcInputs(ISerializationContext context, GSSTestProcInputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel0Filter returns GSSTestProcLevel0Filter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=XMLREF)
	 */
	protected void sequence_GSSTestProcLevel0Filter(ISerializationContext context, GSSTestProcLevel0Filter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0(), semanticObject.getApply_def_filter());
		feeder.accept(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterXMLREFParserRuleCall_8_0(), semanticObject.getExtra_filter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel0 returns GSSTestProcLevel0
	 *
	 * Constraint:
	 *     format=XMLREF
	 */
	protected void sequence_GSSTestProcLevel0(ISerializationContext context, GSSTestProcLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL0__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL0__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel0Access().getFormatXMLREFParserRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel1Filter returns GSSTestProcLevel1Filter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=XMLREF)
	 */
	protected void sequence_GSSTestProcLevel1Filter(ISerializationContext context, GSSTestProcLevel1Filter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_FILTER__APPLY_DEF_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_FILTER__APPLY_DEF_FILTER));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_FILTER__EXTRA_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_FILTER__EXTRA_FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0(), semanticObject.getApply_def_filter());
		feeder.accept(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterXMLREFParserRuleCall_8_0(), semanticObject.getExtra_filter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel1FromLevel0 returns GSSTestProcLevel1FromLevel0
	 *
	 * Constraint:
	 *     import=XMLREF
	 */
	protected void sequence_GSSTestProcLevel1FromLevel0(ISerializationContext context, GSSTestProcLevel1FromLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_FROM_LEVEL0__IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_FROM_LEVEL0__IMPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel1FromLevel0Access().getImportXMLREFParserRuleCall_4_0(), semanticObject.getImport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel1ToLevel0 returns GSSTestProcLevel1ToLevel0
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcLevel1ToLevel0(ISerializationContext context, GSSTestProcLevel1ToLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_TO_LEVEL0__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1_TO_LEVEL0__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel1ToLevel0Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel1 returns GSSTestProcLevel1
	 *
	 * Constraint:
	 *     format=XMLREF
	 */
	protected void sequence_GSSTestProcLevel1(ISerializationContext context, GSSTestProcLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL1__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel1Access().getFormatXMLREFParserRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel2Filter returns GSSTestProcLevel2Filter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=XMLREF)
	 */
	protected void sequence_GSSTestProcLevel2Filter(ISerializationContext context, GSSTestProcLevel2Filter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_FILTER__APPLY_DEF_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_FILTER__APPLY_DEF_FILTER));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_FILTER__EXTRA_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_FILTER__EXTRA_FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0(), semanticObject.getApply_def_filter());
		feeder.accept(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterXMLREFParserRuleCall_8_0(), semanticObject.getExtra_filter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel2FromLevel1 returns GSSTestProcLevel2FromLevel1
	 *
	 * Constraint:
	 *     import=XMLREF
	 */
	protected void sequence_GSSTestProcLevel2FromLevel1(ISerializationContext context, GSSTestProcLevel2FromLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_FROM_LEVEL1__IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_FROM_LEVEL1__IMPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel2FromLevel1Access().getImportXMLREFParserRuleCall_4_0(), semanticObject.getImport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel2ToLevel1 returns GSSTestProcLevel2ToLevel1
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcLevel2ToLevel1(ISerializationContext context, GSSTestProcLevel2ToLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_TO_LEVEL1__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2_TO_LEVEL1__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel2ToLevel1Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel2 returns GSSTestProcLevel2
	 *
	 * Constraint:
	 *     format=XMLREF
	 */
	protected void sequence_GSSTestProcLevel2(ISerializationContext context, GSSTestProcLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL2__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel2Access().getFormatXMLREFParserRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel3Filter returns GSSTestProcLevel3Filter
	 *
	 * Constraint:
	 *     (apply_def_filter=GSSTestProcYesNo extra_filter=XMLREF)
	 */
	protected void sequence_GSSTestProcLevel3Filter(ISerializationContext context, GSSTestProcLevel3Filter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_FILTER__APPLY_DEF_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_FILTER__APPLY_DEF_FILTER));
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_FILTER__EXTRA_FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_FILTER__EXTRA_FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0(), semanticObject.getApply_def_filter());
		feeder.accept(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterXMLREFParserRuleCall_8_0(), semanticObject.getExtra_filter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel3FromLevel2 returns GSSTestProcLevel3FromLevel2
	 *
	 * Constraint:
	 *     import=XMLREF
	 */
	protected void sequence_GSSTestProcLevel3FromLevel2(ISerializationContext context, GSSTestProcLevel3FromLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_FROM_LEVEL2__IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_FROM_LEVEL2__IMPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel3FromLevel2Access().getImportXMLREFParserRuleCall_4_0(), semanticObject.getImport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel3ToLevel2 returns GSSTestProcLevel3ToLevel2
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSTestProcLevel3ToLevel2(ISerializationContext context, GSSTestProcLevel3ToLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_TO_LEVEL2__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3_TO_LEVEL2__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel3ToLevel2Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcLevel3 returns GSSTestProcLevel3
	 *
	 * Constraint:
	 *     format=ID
	 */
	protected void sequence_GSSTestProcLevel3(ISerializationContext context, GSSTestProcLevel3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, test_procPackage.Literals.GSS_TEST_PROC_LEVEL3__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTestProcLevel3Access().getFormatIDTerminalRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
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
	 *     GSSTestProcOutputLevel0 returns GSSTestProcOutputLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level0=GSSTestProcLevel0 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel0(ISerializationContext context, GSSTestProcOutputLevel0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutputLevel1 returns GSSTestProcOutputLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level1=GSSTestProcLevel1 
	 *         level1_filter=GSSTestProcLevel1Filter 
	 *         level0=GSSTestProcLevel0 
	 *         level1_from_level0=GSSTestProcLevel1FromLevel0 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel1(ISerializationContext context, GSSTestProcOutputLevel1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutputLevel2 returns GSSTestProcOutputLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level2=GSSTestProcLevel2 
	 *         level2_filter=GSSTestProcLevel2Filter 
	 *         level1=GSSTestProcLevel1 
	 *         level2_from_level1=GSSTestProcLevel2FromLevel1 
	 *         level1_filter=GSSTestProcLevel1Filter 
	 *         level0=GSSTestProcLevel0 
	 *         level1_from_level0=GSSTestProcLevel1FromLevel0 
	 *         level0_filter=GSSTestProcLevel0Filter
	 *     )
	 */
	protected void sequence_GSSTestProcOutputLevel2(ISerializationContext context, GSSTestProcOutputLevel2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcOutputLevel3 returns GSSTestProcOutputLevel3
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         optional=INTEGER? 
	 *         level3=GSSTestProcLevel3 
	 *         level3_filter=GSSTestProcLevel3Filter 
	 *         level2=GSSTestProcLevel2 
	 *         level3_from_level2=GSSTestProcLevel3FromLevel2 
	 *         level2_filter=GSSTestProcLevel2Filter 
	 *         level1=GSSTestProcLevel1 
	 *         level2_from_level1=GSSTestProcLevel2FromLevel1 
	 *         level1_filter=GSSTestProcLevel1Filter 
	 *         level0=GSSTestProcLevel0 
	 *         level1_from_level0=GSSTestProcLevel1FromLevel0 
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
	 *     (
	 *         checkmode=GSSTestProcCheckmode 
	 *         valid_time_interval_value=INTEGER 
	 *         valid_time_interval_unit=GSSTestProcUnit 
	 *         (
	 *             output_level_3+=GSSTestProcOutputLevel3 | 
	 *             output_level_2+=GSSTestProcOutputLevel2 | 
	 *             output_level_1+=GSSTestProcOutputLevel1 | 
	 *             output_level_0+=GSSTestProcOutputLevel0
	 *         )+
	 *     )
	 */
	protected void sequence_GSSTestProcOutputs(ISerializationContext context, GSSTestProcOutputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTestProcSpecialPackets returns GSSTestProcSpecialPackets
	 *
	 * Constraint:
	 *     (enable+=GSSTestProcEnable | disable+=GSSTestProcDisable | enable_print+=GSSTestProcEnablePrint | disable_print+=GSSTestProcDisablePrint)+
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
	 *         prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName]? 
	 *         output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName]? 
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
