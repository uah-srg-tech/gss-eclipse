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
package es.uah.aut.srg.gss.lang.environment.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment;
import es.uah.aut.srg.gss.environment.environmentPackage;
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;
import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg;
import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal;
import es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags;
import es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered;
import es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars;
import es.uah.aut.srg.gss.scenario.GSSScenarioInfo;
import es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterface;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces;
import es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut;
import es.uah.aut.srg.gss.scenario.GSSScenarioMainInterface;
import es.uah.aut.srg.gss.scenario.GSSScenarioModify;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitors;
import es.uah.aut.srg.gss.scenario.GSSScenarioOptions;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriod;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs;
import es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint;
import es.uah.aut.srg.gss.scenario.GSSScenarioPlot;
import es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocol;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocols;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket;
import es.uah.aut.srg.gss.scenario.GSSScenarioScenario;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets;
import es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels;
import es.uah.aut.srg.gss.scenario.scenarioPackage;
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
public class ENVIRONMENTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ENVIRONMENTGrammarAccess grammarAccess;
	
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
		else if (epackage == environmentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case environmentPackage.GSS_ENVIRONMENT_ENVIRONMENT:
				sequence_GSSEnvironmentEnvironment(context, (GSSEnvironmentEnvironment) semanticObject); 
				return; 
			}
		else if (epackage == scenarioPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case scenarioPackage.GSS_SCENARIO_ALARM_MSG:
				sequence_GSSScenarioAlarmMsg(context, (GSSScenarioAlarmMsg) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_ALARM_VAL:
				sequence_GSSScenarioAlarmVal(context, (GSSScenarioAlarmVal) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS:
				sequence_GSSScenarioGSSDiscardErrorFlags(context, (GSSScenarioDiscardErrorFlags) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED:
				sequence_GSSScenarioGVFiltered(context, (GSSScenarioGVFiltered) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC:
				sequence_GSSScenarioGVPeriodic(context, (GSSScenarioGVPeriodic) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VAR:
				sequence_GSSScenarioGlobalVar(context, (GSSScenarioGlobalVar) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VARS:
				sequence_GSSScenarioGlobalVars(context, (GSSScenarioGlobalVars) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_INFO:
				sequence_GSSScenarioGSSInfo(context, (GSSScenarioInfo) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_INFO_PRINT:
				sequence_GSSScenarioGSSInfoPrint(context, (GSSScenarioInfoPrint) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_INTERFACE:
				sequence_GSSScenarioInterface(context, (GSSScenarioInterface) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_INTERFACES:
				sequence_GSSScenarioInterfaces(context, (GSSScenarioInterfaces) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_INTERVAL_RANGE:
				sequence_GSSScenarioIntervalRange(context, (GSSScenarioIntervalRange) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN:
				sequence_GSSScenarioLevelIn(context, (GSSScenarioLevelIn) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT:
				sequence_GSSScenarioLevelInOut(context, (GSSScenarioLevelInOut) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_LEVEL_OUT:
				sequence_GSSScenarioLevelOut(context, (GSSScenarioLevelOut) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_MAIN_INTERFACE:
				sequence_GSSScenarioMainInterface(context, (GSSScenarioMainInterface) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_MODIFY:
				sequence_GSSScenarioModify(context, (GSSScenarioModify) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_MONITORS:
				sequence_GSSScenarioMonitors(context, (GSSScenarioMonitors) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_OPTIONS:
				sequence_GSSScenarioOptions(context, (GSSScenarioOptions) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PERIOD:
				sequence_GSSScenarioPeriod(context, (GSSScenarioPeriod) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL0:
				sequence_GSSScenarioPeriodicTCLevel0(context, (GSSScenarioPeriodicTCLevel0) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL1:
				sequence_GSSScenarioPeriodicTCLevel1(context, (GSSScenarioPeriodicTCLevel1) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2:
				sequence_GSSScenarioPeriodicTCLevel2(context, (GSSScenarioPeriodicTCLevel2) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS:
				sequence_GSSScenarioPeriodicTCs(context, (GSSScenarioPeriodicTCs) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT:
				sequence_GSSScenarioPhyHeaderPrint(context, (GSSScenarioPhyHeaderPrint) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PLOT:
				sequence_GSSScenarioPlot(context, (GSSScenarioPlot) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PRINTING_DATA:
				sequence_GSSScenarioPrintingData(context, (GSSScenarioPrintingData) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PROTOCOL:
				sequence_GSSScenarioProtocol(context, (GSSScenarioProtocol) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_PROTOCOL_TYPE:
				if (rule == grammarAccess.getGSSScenarioProtocolSubtypeRule()) {
					sequence_GSSScenarioProtocolSubtype(context, (GSSScenarioProtocolType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getGSSScenarioProtocolTypeRule()) {
					sequence_GSSScenarioProtocolType(context, (GSSScenarioProtocolType) semanticObject); 
					return; 
				}
				else break;
			case scenarioPackage.GSS_SCENARIO_PROTOCOLS:
				sequence_GSSScenarioProtocols(context, (GSSScenarioProtocols) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_REFERENCE_FIELD:
				sequence_GSSScenarioReferenceField(context, (GSSScenarioReferenceField) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_REFERENCE_PERIODIC_TC:
				sequence_GSSScenarioReferencePeriodicTC(context, (GSSScenarioReferencePeriodicTC) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_REFERENCE_SPECIAL_PACKET:
				sequence_GSSScenarioReferenceSpecialPacket(context, (GSSScenarioReferenceSpecialPacket) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_SCENARIO:
				sequence_GSSScenarioScenario(context, (GSSScenarioScenario) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET:
				sequence_GSSScenarioSpecialPacket(context, (GSSScenarioSpecialPacket) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKETS:
				sequence_GSSScenarioSpecialPackets(context, (GSSScenarioSpecialPackets) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA:
				sequence_GSSScenarioStructuredData(context, (GSSScenarioStructuredData) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL:
				sequence_GSSScenarioUpperLevel(context, (GSSScenarioUpperLevel) semanticObject); 
				return; 
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVELS:
				sequence_GSSScenarioUpperLevels(context, (GSSScenarioUpperLevels) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSEnvironmentEnvironment returns GSSEnvironmentEnvironment
	 *
	 * Constraint:
	 *     (name=ID uri=QualifiedName version=Version scenario+=GSSScenarioScenario+)
	 */
	protected void sequence_GSSEnvironmentEnvironment(ISerializationContext context, GSSEnvironmentEnvironment semanticObject) {
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
	 *     (imports+=GSSModelFileImport* element=GSSEnvironmentEnvironment)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioMonitor returns GSSScenarioAlarmMsg
	 *     GSSScenarioAlarmMsg returns GSSScenarioAlarmMsg
	 *
	 * Constraint:
	 *     (name=STRING type=GSSScenarioAlarmMsgType text=STRING GVRef=GSSScenarioGVRef)
	 */
	protected void sequence_GSSScenarioAlarmMsg(ISerializationContext context, GSSScenarioAlarmMsg semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_ALARM_MSG__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_ALARM_MSG__TYPE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_ALARM_MSG__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_ALARM_MSG__TEXT));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVRefGSSScenarioGVRefParserRuleCall_14_0(), semanticObject.getGVRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioMonitor returns GSSScenarioAlarmVal
	 *     GSSScenarioAlarmVal returns GSSScenarioAlarmVal
	 *
	 * Constraint:
	 *     (name=STRING type=GSSScenarioAlarmValType GVRef=GSSScenarioGVRef)
	 */
	protected void sequence_GSSScenarioAlarmVal(ISerializationContext context, GSSScenarioAlarmVal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_ALARM_VAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_ALARM_VAL__TYPE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioAlarmValAccess().getTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSScenarioAlarmValAccess().getGVRefGSSScenarioGVRefParserRuleCall_10_0(), semanticObject.getGVRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGSSDiscardErrorFlags returns GSSScenarioDiscardErrorFlags
	 *
	 * Constraint:
	 *     (
	 *         txErrors=GSSScenarioEnableDisable 
	 *         notExpectedPackets=GSSScenarioEnableDisable 
	 *         filtersKo=GSSScenarioEnableDisable 
	 *         validTimesKo=GSSScenarioEnableDisable
	 *     )
	 */
	protected void sequence_GSSScenarioGSSDiscardErrorFlags(ISerializationContext context, GSSScenarioDiscardErrorFlags semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0(), semanticObject.getTxErrors());
		feeder.accept(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0(), semanticObject.getNotExpectedPackets());
		feeder.accept(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0(), semanticObject.getFiltersKo());
		feeder.accept(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0(), semanticObject.getValidTimesKo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGSSInfoPrint returns GSSScenarioInfoPrint
	 *
	 * Constraint:
	 *     (mainLog=GSSScenarioEnableDisable portLogs=GSSScenarioEnableDisable rawLog=GSSScenarioEnableDisable)
	 */
	protected void sequence_GSSScenarioGSSInfoPrint(ISerializationContext context, GSSScenarioInfoPrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INFO_PRINT__MAIN_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INFO_PRINT__MAIN_LOG));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INFO_PRINT__PORT_LOGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INFO_PRINT__PORT_LOGS));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INFO_PRINT__RAW_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INFO_PRINT__RAW_LOG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0(), semanticObject.getMainLog());
		feeder.accept(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0(), semanticObject.getPortLogs());
		feeder.accept(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0(), semanticObject.getRawLog());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGSSInfo returns GSSScenarioInfo
	 *
	 * Constraint:
	 *     (test_campaign=STRING version=Version date=DATE version_control_url=URL?)
	 */
	protected void sequence_GSSScenarioGSSInfo(ISerializationContext context, GSSScenarioInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGVRef returns GSSScenarioGVFiltered
	 *     GSSScenarioGVFiltered returns GSSScenarioGVFiltered
	 *
	 * Constraint:
	 *     (GlobalVarRef=[GSSScenarioGlobalVar|STRING] filter=[GSSFilterFilter|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSScenarioGVFiltered(ISerializationContext context, GSSScenarioGVFiltered semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGVRef returns GSSScenarioGVPeriodic
	 *     GSSScenarioGVPeriodic returns GSSScenarioGVPeriodic
	 *
	 * Constraint:
	 *     (GlobalVarRef=[GSSScenarioGlobalVar|STRING] period_value=INTEGER period_unit=GSSScenarioUnit)
	 */
	protected void sequence_GSSScenarioGVPeriodic(ISerializationContext context, GSSScenarioGVPeriodic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1(), semanticObject.getGlobalVarRef());
		feeder.accept(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0(), semanticObject.getPeriod_value());
		feeder.accept(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitGSSScenarioUnitEnumRuleCall_12_0(), semanticObject.getPeriod_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGlobalVar returns GSSScenarioGlobalVar
	 *
	 * Constraint:
	 *     (name=STRING id=INTEGER type=GSSScenarioGlobalVarType initial_value=INTEGER reference=GSSScenarioReference)
	 */
	protected void sequence_GSSScenarioGlobalVar(ISerializationContext context, GSSScenarioGlobalVar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, es.uah.aut.srg.tmtcif.scenario.scenarioPackage.Literals.TMTCIF_SCENARIO_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, es.uah.aut.srg.tmtcif.scenario.scenarioPackage.Literals.TMTCIF_SCENARIO_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__ID));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__TYPE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__INITIAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__INITIAL_VALUE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_GLOBAL_VAR__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioGlobalVarAccess().getIdINTEGERParserRuleCall_8_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0(), semanticObject.getInitial_value());
		feeder.accept(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceGSSScenarioReferenceParserRuleCall_18_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioGlobalVars returns GSSScenarioGlobalVars
	 *
	 * Constraint:
	 *     GlobalVar+=GSSScenarioGlobalVar+
	 */
	protected void sequence_GSSScenarioGlobalVars(ISerializationContext context, GSSScenarioGlobalVars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioInterface returns GSSScenarioInterface
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         ifType=GSSScenarioInterfaceType 
	 *         ifConfig=[GSSIfacePortConfig|VersionedQualifiedName] 
	 *         ioType=GSSScenarioInterfaceIOType 
	 *         protocolID=[GSSScenarioProtocol|VersionedQualifiedReferenceName]? 
	 *         (LevelInOut+=GSSScenarioLevelInOut | LevelIn+=GSSScenarioLevelIn | LevelOut+=GSSScenarioLevelOut)+
	 *     )
	 */
	protected void sequence_GSSScenarioInterface(ISerializationContext context, GSSScenarioInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioInterfaces returns GSSScenarioInterfaces
	 *
	 * Constraint:
	 *     (
	 *         ProtocolPacketsFile=[GSSProtocolPacketsProtocolPackets|VersionedQualifiedName]? 
	 *         MainInterface=GSSScenarioMainInterface 
	 *         Interface+=GSSScenarioInterface*
	 *     )
	 */
	protected void sequence_GSSScenarioInterfaces(ISerializationContext context, GSSScenarioInterfaces semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioIntervalRange returns GSSScenarioIntervalRange
	 *
	 * Constraint:
	 *     (min=INTEGER max=INTEGER interval_value=INTEGER interval_unit=GSSScenarioUnit)
	 */
	protected void sequence_GSSScenarioIntervalRange(ISerializationContext context, GSSScenarioIntervalRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__MIN));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__MAX));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_VALUE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0(), semanticObject.getMax());
		feeder.accept(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0(), semanticObject.getInterval_value());
		feeder.accept(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitGSSScenarioUnitEnumRuleCall_16_0(), semanticObject.getInterval_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioLevelInOut returns GSSScenarioLevelInOut
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         TMformat=[GSSFormatFormat|VersionedQualifiedName] 
	 *         TCformat=[GSSFormatFormat|VersionedQualifiedName] 
	 *         inputFilter=[GSSFilterFilter|VersionedQualifiedName] 
	 *         export_to_prev_Level=[GSSExportExport|VersionedQualifiedName]? 
	 *         import_from_prev_Level=[GSSImportImport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSScenarioLevelInOut(ISerializationContext context, GSSScenarioLevelInOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioLevelIn returns GSSScenarioLevelIn
	 *
	 * Constraint:
	 *     (id=INTEGER name=STRING TCformat=[GSSFormatFormat|VersionedQualifiedName] export_to_prev_Level=[GSSExportExport|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSScenarioLevelIn(ISerializationContext context, GSSScenarioLevelIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioLevelOut returns GSSScenarioLevelOut
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         TMformat=[GSSFormatFormat|VersionedQualifiedName] 
	 *         inputFilter=[GSSFilterFilter|VersionedQualifiedName] 
	 *         import_from_prev_Level=[GSSImportImport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSScenarioLevelOut(ISerializationContext context, GSSScenarioLevelOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioMainInterface returns GSSScenarioMainInterface
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         ifType=GSSScenarioInterfaceType 
	 *         ifConfig=[GSSIfacePortConfig|VersionedQualifiedName] 
	 *         ioType=GSSScenarioInterfaceIOType 
	 *         protocolID=[GSSScenarioProtocol|VersionedQualifiedReferenceName]? 
	 *         LevelInOut+=GSSScenarioLevelInOut+
	 *     )
	 */
	protected void sequence_GSSScenarioMainInterface(ISerializationContext context, GSSScenarioMainInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioMonitor returns GSSScenarioModify
	 *     GSSScenarioModify returns GSSScenarioModify
	 *
	 * Constraint:
	 *     (name=STRING type=GSSScenarioModifyType value=INTEGER GVRef=GSSScenarioGVRef)
	 */
	protected void sequence_GSSScenarioModify(ISerializationContext context, GSSScenarioModify semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MODIFY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MODIFY__TYPE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MODIFY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MODIFY__VALUE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioModifyAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioModifyAccess().getTypeGSSScenarioModifyTypeEnumRuleCall_8_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSScenarioModifyAccess().getValueINTEGERParserRuleCall_12_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getGSSScenarioModifyAccess().getGVRefGSSScenarioGVRefParserRuleCall_14_0(), semanticObject.getGVRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioMonitors returns GSSScenarioMonitors
	 *
	 * Constraint:
	 *     (ChartsFile=[GSSChartsCharts|VersionedQualifiedName]? monitor+=GSSScenarioMonitor+)
	 */
	protected void sequence_GSSScenarioMonitors(ISerializationContext context, GSSScenarioMonitors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioOptions returns GSSScenarioOptions
	 *
	 * Constraint:
	 *     (
	 *         gss_info=GSSScenarioGSSInfo 
	 *         gss_info_print=GSSScenarioGSSInfoPrint 
	 *         phy_header_print=GSSScenarioPhyHeaderPrint 
	 *         discardErrorFlags=GSSScenarioGSSDiscardErrorFlags
	 *     )
	 */
	protected void sequence_GSSScenarioOptions(ISerializationContext context, GSSScenarioOptions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__GSS_INFO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__GSS_INFO));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__GSS_INFO_PRINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__GSS_INFO_PRINT));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__PHY_HEADER_PRINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__PHY_HEADER_PRINT));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__DISCARD_ERROR_FLAGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_OPTIONS__DISCARD_ERROR_FLAGS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoGSSScenarioGSSInfoParserRuleCall_2_0(), semanticObject.getGss_info());
		feeder.accept(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0(), semanticObject.getGss_info_print());
		feeder.accept(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0(), semanticObject.getPhy_header_print());
		feeder.accept(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0(), semanticObject.getDiscardErrorFlags());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPeriod returns GSSScenarioPeriod
	 *
	 * Constraint:
	 *     (min_value=INTEGER min_unit=GSSScenarioUnit max_value=INTEGER max_unit=GSSScenarioUnit)
	 */
	protected void sequence_GSSScenarioPeriod(ISerializationContext context, GSSScenarioPeriod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MIN_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MIN_VALUE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MIN_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MIN_UNIT));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MAX_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MAX_VALUE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MAX_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PERIOD__MAX_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0(), semanticObject.getMin_value());
		feeder.accept(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitGSSScenarioUnitEnumRuleCall_8_0(), semanticObject.getMin_unit());
		feeder.accept(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0(), semanticObject.getMax_value());
		feeder.accept(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitGSSScenarioUnitEnumRuleCall_16_0(), semanticObject.getMax_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPeriodicTC returns GSSScenarioPeriodicTCLevel0
	 *     GSSScenarioPeriodicTCLevel0 returns GSSScenarioPeriodicTCLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSScenarioUnit 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level0=[GSSExportExport|VersionedQualifiedName]
	 *     )
	 */
	protected void sequence_GSSScenarioPeriodicTCLevel0(ISerializationContext context, GSSScenarioPeriodicTCLevel0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPeriodicTC returns GSSScenarioPeriodicTCLevel1
	 *     GSSScenarioPeriodicTCLevel1 returns GSSScenarioPeriodicTCLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSScenarioUnit 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level1=[GSSExportExport|VersionedQualifiedName] 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[GSSExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSScenarioPeriodicTCLevel1(ISerializationContext context, GSSScenarioPeriodicTCLevel1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPeriodicTC returns GSSScenarioPeriodicTCLevel2
	 *     GSSScenarioPeriodicTCLevel2 returns GSSScenarioPeriodicTCLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSScenarioUnit 
	 *         level2=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level2=[GSSExportExport|VersionedQualifiedName] 
	 *         level1=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level2_to_level1=[GSSExportExport|VersionedQualifiedName]? 
	 *         level0=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[GSSExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSScenarioPeriodicTCLevel2(ISerializationContext context, GSSScenarioPeriodicTCLevel2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPeriodicTCs returns GSSScenarioPeriodicTCs
	 *
	 * Constraint:
	 *     PeriodicTC+=GSSScenarioPeriodicTC*
	 */
	protected void sequence_GSSScenarioPeriodicTCs(ISerializationContext context, GSSScenarioPeriodicTCs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPhyHeaderPrint returns GSSScenarioPhyHeaderPrint
	 *
	 * Constraint:
	 *     (mainLog=GSSScenarioEnableDisable portLogs=GSSScenarioEnableDisable rawLog=GSSScenarioEnableDisable gssTabs=GSSScenarioEnableDisable)
	 */
	protected void sequence_GSSScenarioPhyHeaderPrint(ISerializationContext context, GSSScenarioPhyHeaderPrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0(), semanticObject.getMainLog());
		feeder.accept(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0(), semanticObject.getPortLogs());
		feeder.accept(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0(), semanticObject.getRawLog());
		feeder.accept(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0(), semanticObject.getGssTabs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioMonitor returns GSSScenarioPlot
	 *     GSSScenarioPlot returns GSSScenarioPlot
	 *
	 * Constraint:
	 *     (name=STRING chartRef=[GSSChartsChart|VersionedQualifiedReferenceName] GVRef=GSSScenarioGVRef)
	 */
	protected void sequence_GSSScenarioPlot(ISerializationContext context, GSSScenarioPlot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PLOT__CHART_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PLOT__CHART_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_MONITOR__GV_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioPlotAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getChartRef());
		feeder.accept(grammarAccess.getGSSScenarioPlotAccess().getGVRefGSSScenarioGVRefParserRuleCall_10_0(), semanticObject.getGVRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioPrintingData returns GSSScenarioPrintingData
	 *
	 * Constraint:
	 *     (printStatus=GSSScenarioEnableDisable structuredData=GSSScenarioStructuredData?)
	 */
	protected void sequence_GSSScenarioPrintingData(ISerializationContext context, GSSScenarioPrintingData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioProtocolSubtype returns GSSScenarioProtocolType
	 *
	 * Constraint:
	 *     (name=STRING offset=INTEGER)
	 */
	protected void sequence_GSSScenarioProtocolSubtype(ISerializationContext context, GSSScenarioProtocolType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__OFFSET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetINTEGERParserRuleCall_8_0(), semanticObject.getOffset());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioProtocolType returns GSSScenarioProtocolType
	 *
	 * Constraint:
	 *     (name=STRING offset=INTEGER)
	 */
	protected void sequence_GSSScenarioProtocolType(ISerializationContext context, GSSScenarioProtocolType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_PROTOCOL_TYPE__OFFSET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetINTEGERParserRuleCall_8_0(), semanticObject.getOffset());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioProtocol returns GSSScenarioProtocol
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID typeLevel=INTEGER type=GSSScenarioProtocolType subtype=GSSScenarioProtocolSubtype?)
	 */
	protected void sequence_GSSScenarioProtocol(ISerializationContext context, GSSScenarioProtocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioProtocols returns GSSScenarioProtocols
	 *
	 * Constraint:
	 *     Protocol+=GSSScenarioProtocol*
	 */
	protected void sequence_GSSScenarioProtocols(ISerializationContext context, GSSScenarioProtocols semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioReference returns GSSScenarioReferenceField
	 *     GSSScenarioReferenceField returns GSSScenarioReferenceField
	 *
	 * Constraint:
	 *     (
	 *         type=GSSScenarioReferenceFieldType 
	 *         ifRef=INTEGER 
	 *         level=INTEGER 
	 *         fieldRef=INTEGER 
	 *         offset=INTEGER 
	 *         size=INTEGER
	 *     )
	 */
	protected void sequence_GSSScenarioReferenceField(ISerializationContext context, GSSScenarioReferenceField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_FIELD__TYPE));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_FIELD__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_FIELD__IF_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__LEVEL));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__OFFSET));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioReference returns GSSScenarioReferencePeriodicTC
	 *     GSSScenarioReferencePeriodicTC returns GSSScenarioReferencePeriodicTC
	 *
	 * Constraint:
	 *     (idRef=[GSSScenarioPeriodicTC|STRING] level=INTEGER fieldRef=INTEGER offset=INTEGER size=INTEGER)
	 */
	protected void sequence_GSSScenarioReferencePeriodicTC(ISerializationContext context, GSSScenarioReferencePeriodicTC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_PERIODIC_TC__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_PERIODIC_TC__ID_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__LEVEL));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__OFFSET));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCSTRINGTerminalRuleCall_4_0_1(), semanticObject.getIdRef());
		feeder.accept(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioReference returns GSSScenarioReferenceSpecialPacket
	 *     GSSScenarioReferenceSpecialPacket returns GSSScenarioReferenceSpecialPacket
	 *
	 * Constraint:
	 *     (idRef=[GSSScenarioSpecialPacket|STRING] level=INTEGER fieldRef=INTEGER offset=INTEGER size=INTEGER)
	 */
	protected void sequence_GSSScenarioReferenceSpecialPacket(ISerializationContext context, GSSScenarioReferenceSpecialPacket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__ID_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__LEVEL));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__OFFSET));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_REFERENCE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketSTRINGTerminalRuleCall_4_0_1(), semanticObject.getIdRef());
		feeder.accept(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioScenario returns GSSScenarioScenario
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         gss_options=GSSScenarioOptions 
	 *         Protocols=GSSScenarioProtocols 
	 *         Interfaces=GSSScenarioInterfaces 
	 *         SpecialPackets=GSSScenarioSpecialPackets? 
	 *         PeriodicTCs=GSSScenarioPeriodicTCs? 
	 *         (GlobalVars=GSSScenarioGlobalVars | Monitors=GSSScenarioMonitors)*
	 *     )
	 */
	protected void sequence_GSSScenarioScenario(ISerializationContext context, GSSScenarioScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioSpecialPacket returns GSSScenarioSpecialPacket
	 *
	 * Constraint:
	 *     (
	 *         status=GSSScenarioEnableDisable 
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         levels=INTEGER 
	 *         levelRef=INTEGER 
	 *         inputFilter=[GSSFilterFilter|VersionedQualifiedName] 
	 *         UpperLevels+=GSSScenarioUpperLevels? 
	 *         printingData=GSSScenarioPrintingData 
	 *         (period=GSSScenarioPeriod | intervalRange=GSSScenarioIntervalRange)?
	 *     )
	 */
	protected void sequence_GSSScenarioSpecialPacket(ISerializationContext context, GSSScenarioSpecialPacket semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioSpecialPackets returns GSSScenarioSpecialPackets
	 *
	 * Constraint:
	 *     SpecialPacket+=GSSScenarioSpecialPacket+
	 */
	protected void sequence_GSSScenarioSpecialPackets(ISerializationContext context, GSSScenarioSpecialPackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioStructuredData returns GSSScenarioStructuredData
	 *
	 * Constraint:
	 *     (levelRef=INTEGER firstField=INTEGER)
	 */
	protected void sequence_GSSScenarioStructuredData(ISerializationContext context, GSSScenarioStructuredData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF));
			if (transientValues.isValueTransient(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, scenarioPackage.Literals.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0(), semanticObject.getLevelRef());
		feeder.accept(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0(), semanticObject.getFirstField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioUpperLevel returns GSSScenarioUpperLevel
	 *
	 * Constraint:
	 *     (
	 *         level=GSSScenarioUpperLevelLevel 
	 *         TMformat=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         inputFilter=[GSSFilterFilter|VersionedQualifiedName]? 
	 *         import_from_prev_Level=[GSSImportImport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSScenarioUpperLevel(ISerializationContext context, GSSScenarioUpperLevel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSScenarioUpperLevels returns GSSScenarioUpperLevels
	 *
	 * Constraint:
	 *     UpperLevel+=GSSScenarioUpperLevel+
	 */
	protected void sequence_GSSScenarioUpperLevels(ISerializationContext context, GSSScenarioUpperLevels semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
