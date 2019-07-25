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
package es.uah.aut.srg.gss.lang.config.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.config.GSSConfigConfig;
import es.uah.aut.srg.gss.config.GSSConfigTestCase;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.configPackage;
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;
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
public class CONFIGSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CONFIGGrammarAccess grammarAccess;
	
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
		else if (epackage == configPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case configPackage.GSS_CONFIG_CONFIG:
				sequence_GSSConfigGSSConfig(context, (GSSConfigConfig) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_TEST_CASE:
				sequence_GSSConfigTestCase(context, (GSSConfigTestCase) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_TESTS:
				sequence_GSSConfigTests(context, (GSSConfigTests) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSConfigGSSConfig returns GSSConfigConfig
	 *
	 * Constraint:
	 *     (name=ID uri=QualifiedName version=Version scenario=[GSSEnvironmentScenario|VersionedQualifiedReferenceName] Tests=GSSConfigTests)
	 */
	protected void sequence_GSSConfigGSSConfig(ISerializationContext context, GSSConfigConfig semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__URI));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__VERSION));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_CONFIG__SCENARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_CONFIG__SCENARIO));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_CONFIG__TESTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_CONFIG__TESTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0(), semanticObject.getUri());
		feeder.accept(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0(), semanticObject.getVersion());
		feeder.accept(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1(), semanticObject.getScenario());
		feeder.accept(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_12_0(), semanticObject.getTests());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigTestCase returns GSSConfigTestCase
	 *
	 * Constraint:
	 *     (name=STRING procedure=[GSSTestProcTestProc|VersionedQualifiedName] req=ID? reqAction=GSSConfigReqAction?)
	 */
	protected void sequence_GSSConfigTestCase(ISerializationContext context, GSSConfigTestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigTests returns GSSConfigTests
	 *
	 * Constraint:
	 *     TestCase+=GSSConfigTestCase+
	 */
	protected void sequence_GSSConfigTests(ISerializationContext context, GSSConfigTests semanticObject) {
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
	 *     (imports+=GSSModelFileImport* element=GSSConfigGSSConfig)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
