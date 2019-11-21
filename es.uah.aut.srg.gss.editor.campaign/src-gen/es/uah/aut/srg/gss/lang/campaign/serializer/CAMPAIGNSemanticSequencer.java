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
package es.uah.aut.srg.gss.lang.campaign.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.campaign.GSSCampaignCampaign;
import es.uah.aut.srg.gss.campaign.GSSCampaignScenario;
import es.uah.aut.srg.gss.campaign.GSSCampaignTestCase;
import es.uah.aut.srg.gss.campaign.GSSCampaignTests;
import es.uah.aut.srg.gss.campaign.campaignPackage;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.lang.campaign.services.CAMPAIGNGrammarAccess;
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
public class CAMPAIGNSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CAMPAIGNGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == campaignPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN:
				sequence_GSSCampaignCampaign(context, (GSSCampaignCampaign) semanticObject); 
				return; 
			case campaignPackage.GSS_CAMPAIGN_SCENARIO:
				sequence_GSSCampaignScenario(context, (GSSCampaignScenario) semanticObject); 
				return; 
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE:
				sequence_GSSCampaignTestCase(context, (GSSCampaignTestCase) semanticObject); 
				return; 
			case campaignPackage.GSS_CAMPAIGN_TESTS:
				sequence_GSSCampaignTests(context, (GSSCampaignTests) semanticObject); 
				return; 
			}
		else if (epackage == commonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case commonPackage.GSS_MODEL_FILE:
				sequence_GSSModelFile(context, (GSSModelFile) semanticObject); 
				return; 
			case commonPackage.GSS_MODEL_FILE_IMPORT:
				sequence_GSSModelFileImport(context, (GSSModelFileImport) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSCampaignCampaign returns GSSCampaignCampaign
	 *
	 * Constraint:
	 *     (name=ID uri=QualifiedName version=Version Scenario=GSSCampaignScenario Tests=GSSCampaignTests)
	 */
	protected void sequence_GSSCampaignCampaign(ISerializationContext context, GSSCampaignCampaign semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__URI));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_ELEMENT__VERSION));
			if (transientValues.isValueTransient(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_CAMPAIGN__SCENARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_CAMPAIGN__SCENARIO));
			if (transientValues.isValueTransient(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_CAMPAIGN__TESTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_CAMPAIGN__TESTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSCampaignCampaignAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSCampaignCampaignAccess().getUriQualifiedNameParserRuleCall_3_2_0(), semanticObject.getUri());
		feeder.accept(grammarAccess.getGSSCampaignCampaignAccess().getVersionVersionParserRuleCall_6_0(), semanticObject.getVersion());
		feeder.accept(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSCampaignScenarioParserRuleCall_8_0(), semanticObject.getScenario());
		feeder.accept(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSCampaignTestsParserRuleCall_9_0(), semanticObject.getTests());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSCampaignScenario returns GSSCampaignScenario
	 *
	 * Constraint:
	 *     (environment=[GSSEnvironmentEnvironment|VersionedQualifiedName] scenario=[GSSEnvironmentScenario|VersionedQualifiedReferenceName])
	 */
	protected void sequence_GSSCampaignScenario(ISerializationContext context, GSSCampaignScenario semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT));
			if (transientValues.isValueTransient(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_SCENARIO__SCENARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, campaignPackage.Literals.GSS_CAMPAIGN_SCENARIO__SCENARIO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentVersionedQualifiedNameParserRuleCall_4_0_1(), semanticObject.getEnvironment());
		feeder.accept(grammarAccess.getGSSCampaignScenarioAccess().getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getScenario());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSCampaignTestCase returns GSSCampaignTestCase
	 *
	 * Constraint:
	 *     (name=STRING procedure=[GSSTestProcTestProc|VersionedQualifiedName] req=ID? reqAction=GSSCampaignTestReqAction?)
	 */
	protected void sequence_GSSCampaignTestCase(ISerializationContext context, GSSCampaignTestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSCampaignTests returns GSSCampaignTests
	 *
	 * Constraint:
	 *     TestCase+=GSSCampaignTestCase+
	 */
	protected void sequence_GSSCampaignTests(ISerializationContext context, GSSCampaignTests semanticObject) {
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
	 *     (imports+=GSSModelFileImport* element=GSSCampaignCampaign)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
