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
import es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg;
import es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal;
import es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags;
import es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInfo;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterface;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces;
import es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut;
import es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface;
import es.uah.aut.srg.gss.environment.GSSEnvironmentModify;
import es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors;
import es.uah.aut.srg.gss.environment.GSSEnvironmentOptions;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPlot;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentScenario;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets;
import es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels;
import es.uah.aut.srg.gss.environment.environmentPackage;
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;
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
			case environmentPackage.GSS_ENVIRONMENT_ALARM_MSG:
				sequence_GSSEnvironmentAlarmMsg(context, (GSSEnvironmentAlarmMsg) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_ALARM_VAL:
				sequence_GSSEnvironmentAlarmVal(context, (GSSEnvironmentAlarmVal) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS:
				sequence_GSSEnvironmentGSSDiscardErrorFlags(context, (GSSEnvironmentDiscardErrorFlags) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_ENVIRONMENT:
				sequence_GSSEnvironmentGSSEnvironment(context, (GSSEnvironmentEnvironment) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED:
				sequence_GSSEnvironmentGVFiltered(context, (GSSEnvironmentGVFiltered) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_GV_PERIODIC:
				sequence_GSSEnvironmentGVPeriodic(context, (GSSEnvironmentGVPeriodic) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR:
				sequence_GSSEnvironmentGlobalVar(context, (GSSEnvironmentGlobalVar) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS:
				sequence_GSSEnvironmentGlobalVars(context, (GSSEnvironmentGlobalVars) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_INFO:
				sequence_GSSEnvironmentGSSInfo(context, (GSSEnvironmentInfo) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_INFO_PRINT:
				sequence_GSSEnvironmentGSSInfoPrint(context, (GSSEnvironmentInfoPrint) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE:
				sequence_GSSEnvironmentInterface(context, (GSSEnvironmentInterface) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_INTERFACES:
				sequence_GSSEnvironmentInterfaces(context, (GSSEnvironmentInterfaces) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE:
				sequence_GSSEnvironmentIntervalRange(context, (GSSEnvironmentIntervalRange) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_IN:
				sequence_GSSEnvironmentLevelIn(context, (GSSEnvironmentLevelIn) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_IN_OUT:
				sequence_GSSEnvironmentLevelInOut(context, (GSSEnvironmentLevelInOut) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_OUT:
				sequence_GSSEnvironmentLevelOut(context, (GSSEnvironmentLevelOut) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE:
				sequence_GSSEnvironmentMainInterface(context, (GSSEnvironmentMainInterface) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_MODIFY:
				sequence_GSSEnvironmentModify(context, (GSSEnvironmentModify) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_MONITORS:
				sequence_GSSEnvironmentMonitors(context, (GSSEnvironmentMonitors) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_OPTIONS:
				sequence_GSSEnvironmentOptions(context, (GSSEnvironmentOptions) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PERIOD:
				sequence_GSSEnvironmentPeriod(context, (GSSEnvironmentPeriod) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0:
				sequence_GSSEnvironmentPeriodicTCLevel0(context, (GSSEnvironmentPeriodicTCLevel0) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1:
				sequence_GSSEnvironmentPeriodicTCLevel1(context, (GSSEnvironmentPeriodicTCLevel1) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2:
				sequence_GSSEnvironmentPeriodicTCLevel2(context, (GSSEnvironmentPeriodicTCLevel2) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS:
				sequence_GSSEnvironmentPeriodicTCs(context, (GSSEnvironmentPeriodicTCs) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT:
				sequence_GSSEnvironmentPhyHeaderPrint(context, (GSSEnvironmentPhyHeaderPrint) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PLOT:
				sequence_GSSEnvironmentPlot(context, (GSSEnvironmentPlot) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA:
				sequence_GSSEnvironmentPrintingData(context, (GSSEnvironmentPrintingData) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL:
				sequence_GSSEnvironmentProtocol(context, (GSSEnvironmentProtocol) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS:
				sequence_GSSEnvironmentProtocols(context, (GSSEnvironmentProtocols) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_FIELD:
				sequence_GSSEnvironmentReferenceField(context, (GSSEnvironmentReferenceField) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC:
				sequence_GSSEnvironmentReferencePeriodicTC(context, (GSSEnvironmentReferencePeriodicTC) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET:
				sequence_GSSEnvironmentReferenceSpecialPacket(context, (GSSEnvironmentReferenceSpecialPacket) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO:
				sequence_GSSEnvironmentScenario(context, (GSSEnvironmentScenario) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET:
				sequence_GSSEnvironmentSpecialPacket(context, (GSSEnvironmentSpecialPacket) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS:
				sequence_GSSEnvironmentSpecialPackets(context, (GSSEnvironmentSpecialPackets) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_STRUCTURED_DATA:
				sequence_GSSEnvironmentStructuredData(context, (GSSEnvironmentStructuredData) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL:
				sequence_GSSEnvironmentUpperLevel(context, (GSSEnvironmentUpperLevel) semanticObject); 
				return; 
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVELS:
				sequence_GSSEnvironmentUpperLevels(context, (GSSEnvironmentUpperLevels) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSEnvironmentAlarmMsg returns GSSEnvironmentAlarmMsg
	 *
	 * Constraint:
	 *     (name=STRING type=GSSEnvironmentAlarmMsgType text=STRING (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic))
	 */
	protected void sequence_GSSEnvironmentAlarmMsg(ISerializationContext context, GSSEnvironmentAlarmMsg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentAlarmVal returns GSSEnvironmentAlarmVal
	 *
	 * Constraint:
	 *     (name=STRING type=GSSEnvironmentAlarmValType (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic))
	 */
	protected void sequence_GSSEnvironmentAlarmVal(ISerializationContext context, GSSEnvironmentAlarmVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGSSDiscardErrorFlags returns GSSEnvironmentDiscardErrorFlags
	 *
	 * Constraint:
	 *     (
	 *         txErrors=GSSEnvironmentEnableDisable 
	 *         notExpectedPackets=GSSEnvironmentEnableDisable 
	 *         filtersKo=GSSEnvironmentEnableDisable 
	 *         validTimesKo=GSSEnvironmentEnableDisable
	 *     )
	 */
	protected void sequence_GSSEnvironmentGSSDiscardErrorFlags(ISerializationContext context, GSSEnvironmentDiscardErrorFlags semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0(), semanticObject.getTxErrors());
		feeder.accept(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0(), semanticObject.getNotExpectedPackets());
		feeder.accept(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0(), semanticObject.getFiltersKo());
		feeder.accept(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0(), semanticObject.getValidTimesKo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGSSEnvironment returns GSSEnvironmentEnvironment
	 *
	 * Constraint:
	 *     (name=ID uri=QualifiedName version=Version scenario+=GSSEnvironmentScenario)
	 */
	protected void sequence_GSSEnvironmentGSSEnvironment(ISerializationContext context, GSSEnvironmentEnvironment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGSSInfoPrint returns GSSEnvironmentInfoPrint
	 *
	 * Constraint:
	 *     (mainLog=GSSEnvironmentEnableDisable portLogs=GSSEnvironmentEnableDisable rawLog=GSSEnvironmentEnableDisable)
	 */
	protected void sequence_GSSEnvironmentGSSInfoPrint(ISerializationContext context, GSSEnvironmentInfoPrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INFO_PRINT__MAIN_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INFO_PRINT__MAIN_LOG));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INFO_PRINT__PORT_LOGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INFO_PRINT__PORT_LOGS));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INFO_PRINT__RAW_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INFO_PRINT__RAW_LOG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0(), semanticObject.getMainLog());
		feeder.accept(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0(), semanticObject.getPortLogs());
		feeder.accept(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0(), semanticObject.getRawLog());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGSSInfo returns GSSEnvironmentInfo
	 *
	 * Constraint:
	 *     (test_campaign=STRING version=Version date=DATE version_control_url=URL?)
	 */
	protected void sequence_GSSEnvironmentGSSInfo(ISerializationContext context, GSSEnvironmentInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGVFiltered returns GSSEnvironmentGVFiltered
	 *
	 * Constraint:
	 *     (GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] filter=[TMTCIFFilterFilter|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSEnvironmentGVFiltered(ISerializationContext context, GSSEnvironmentGVFiltered semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGVPeriodic returns GSSEnvironmentGVPeriodic
	 *
	 * Constraint:
	 *     (GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] period_value=INTEGER period_unit=GSSEnvironmentUnit)
	 */
	protected void sequence_GSSEnvironmentGVPeriodic(ISerializationContext context, GSSEnvironmentGVPeriodic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_GV_PERIODIC__GLOBAL_VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_GV_PERIODIC__GLOBAL_VAR_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_VALUE));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1(), semanticObject.getGlobalVarRef());
		feeder.accept(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0(), semanticObject.getPeriod_value());
		feeder.accept(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0(), semanticObject.getPeriod_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGlobalVar returns GSSEnvironmentGlobalVar
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         type=GSSEnvironmentGlobalVarType 
	 *         initial_value=INTEGER 
	 *         (
	 *             referenceField=GSSEnvironmentReferenceField | 
	 *             referencePeriodicTC=GSSEnvironmentReferencePeriodicTC | 
	 *             referenceSpecialPacket=GSSEnvironmentReferenceSpecialPacket
	 *         )
	 *     )
	 */
	protected void sequence_GSSEnvironmentGlobalVar(ISerializationContext context, GSSEnvironmentGlobalVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentGlobalVars returns GSSEnvironmentGlobalVars
	 *
	 * Constraint:
	 *     GlobalVar+=GSSEnvironmentGlobalVar+
	 */
	protected void sequence_GSSEnvironmentGlobalVars(ISerializationContext context, GSSEnvironmentGlobalVars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentInterface returns GSSEnvironmentInterface
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         ifType=GSSEnvironmentInterfaceType 
	 *         ifConfig=[GSSIfacePortConfig|VersionedQualifiedName] 
	 *         ioType=GSSEnvironmentInterfaceIOType 
	 *         protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName]? 
	 *         (LevelInOut+=GSSEnvironmentLevelInOut | LevelIn+=GSSEnvironmentLevelIn | LevelOut+=GSSEnvironmentLevelOut)+
	 *     )
	 */
	protected void sequence_GSSEnvironmentInterface(ISerializationContext context, GSSEnvironmentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentInterfaces returns GSSEnvironmentInterfaces
	 *
	 * Constraint:
	 *     (MainInterface=GSSEnvironmentMainInterface Interface+=GSSEnvironmentInterface*)
	 */
	protected void sequence_GSSEnvironmentInterfaces(ISerializationContext context, GSSEnvironmentInterfaces semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentIntervalRange returns GSSEnvironmentIntervalRange
	 *
	 * Constraint:
	 *     (min=INTEGER max=INTEGER interval_value=INTEGER interval_unit=GSSEnvironmentUnit)
	 */
	protected void sequence_GSSEnvironmentIntervalRange(ISerializationContext context, GSSEnvironmentIntervalRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0(), semanticObject.getMax());
		feeder.accept(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0(), semanticObject.getInterval_value());
		feeder.accept(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0(), semanticObject.getInterval_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentLevelInOut returns GSSEnvironmentLevelInOut
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         TMformat=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *         TCformat=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *         inputFilter=[TMTCIFFilterFilter|VersionedQualifiedName] 
	 *         export_to_prev_Level=[TMTCIFExportExport|VersionedQualifiedName]? 
	 *         import_from_prev_Level=[TMTCIFImportImport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSEnvironmentLevelInOut(ISerializationContext context, GSSEnvironmentLevelInOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentLevelIn returns GSSEnvironmentLevelIn
	 *
	 * Constraint:
	 *     (id=INTEGER name=STRING TCformat=[TMTCIFFormatFormat|VersionedQualifiedName] export_to_prev_Level=[TMTCIFExportExport|VersionedQualifiedName]?)
	 */
	protected void sequence_GSSEnvironmentLevelIn(ISerializationContext context, GSSEnvironmentLevelIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentLevelOut returns GSSEnvironmentLevelOut
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         TMformat=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *         inputFilter=[TMTCIFFilterFilter|VersionedQualifiedName] 
	 *         import_from_prev_Level=[TMTCIFImportImport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSEnvironmentLevelOut(ISerializationContext context, GSSEnvironmentLevelOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentMainInterface returns GSSEnvironmentMainInterface
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=STRING 
	 *         ifType=GSSEnvironmentInterfaceType 
	 *         ifConfig=[GSSIfacePortConfig|VersionedQualifiedName] 
	 *         ioType=GSSEnvironmentInterfaceIOType 
	 *         protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName]? 
	 *         ProtocolPacketsFile=[GSSProtocolPacketsProtocolPackets|VersionedQualifiedName]? 
	 *         LevelInOut+=GSSEnvironmentLevelInOut+
	 *     )
	 */
	protected void sequence_GSSEnvironmentMainInterface(ISerializationContext context, GSSEnvironmentMainInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentModify returns GSSEnvironmentModify
	 *
	 * Constraint:
	 *     (name=STRING type=GSSEnvironmentModifyType value=INTEGER (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic))
	 */
	protected void sequence_GSSEnvironmentModify(ISerializationContext context, GSSEnvironmentModify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentMonitors returns GSSEnvironmentMonitors
	 *
	 * Constraint:
	 *     (
	 *         ChartsFile=[GSSChartsCharts|VersionedQualifiedName]? 
	 *         (plot+=GSSEnvironmentPlot | alarmMsg+=GSSEnvironmentAlarmMsg | modify+=GSSEnvironmentModify | alarmVal+=GSSEnvironmentAlarmVal)+
	 *     )
	 */
	protected void sequence_GSSEnvironmentMonitors(ISerializationContext context, GSSEnvironmentMonitors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentOptions returns GSSEnvironmentOptions
	 *
	 * Constraint:
	 *     (
	 *         gss_info=GSSEnvironmentGSSInfo 
	 *         gss_info_print=GSSEnvironmentGSSInfoPrint 
	 *         phy_header_print=GSSEnvironmentPhyHeaderPrint 
	 *         discardErrorFlags=GSSEnvironmentGSSDiscardErrorFlags
	 *     )
	 */
	protected void sequence_GSSEnvironmentOptions(ISerializationContext context, GSSEnvironmentOptions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__GSS_INFO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__GSS_INFO));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__GSS_INFO_PRINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__GSS_INFO_PRINT));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__PHY_HEADER_PRINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__PHY_HEADER_PRINT));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__DISCARD_ERROR_FLAGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_OPTIONS__DISCARD_ERROR_FLAGS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0(), semanticObject.getGss_info());
		feeder.accept(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0(), semanticObject.getGss_info_print());
		feeder.accept(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0(), semanticObject.getPhy_header_print());
		feeder.accept(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0(), semanticObject.getDiscardErrorFlags());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPeriod returns GSSEnvironmentPeriod
	 *
	 * Constraint:
	 *     (min_value=INTEGER min_unit=GSSEnvironmentUnit max_value=INTEGER max_unit=GSSEnvironmentUnit)
	 */
	protected void sequence_GSSEnvironmentPeriod(ISerializationContext context, GSSEnvironmentPeriod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MIN_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MIN_VALUE));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MIN_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MIN_UNIT));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MAX_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MAX_VALUE));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MAX_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PERIOD__MAX_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0(), semanticObject.getMin_value());
		feeder.accept(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitGSSEnvironmentUnitEnumRuleCall_8_0(), semanticObject.getMin_unit());
		feeder.accept(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0(), semanticObject.getMax_value());
		feeder.accept(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitGSSEnvironmentUnitEnumRuleCall_16_0(), semanticObject.getMax_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPeriodicTCLevel0 returns GSSEnvironmentPeriodicTCLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSEnvironmentUnit 
	 *         level0=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level0=[TMTCIFExportExport|VersionedQualifiedName]
	 *     )
	 */
	protected void sequence_GSSEnvironmentPeriodicTCLevel0(ISerializationContext context, GSSEnvironmentPeriodicTCLevel0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPeriodicTCLevel1 returns GSSEnvironmentPeriodicTCLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSEnvironmentUnit 
	 *         level1=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level1=[TMTCIFExportExport|VersionedQualifiedName] 
	 *         level0=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[TMTCIFExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSEnvironmentPeriodicTCLevel1(ISerializationContext context, GSSEnvironmentPeriodicTCLevel1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPeriodicTCLevel2 returns GSSEnvironmentPeriodicTCLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSEnvironmentUnit 
	 *         level2=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         app_to_level2=[TMTCIFExportExport|VersionedQualifiedName] 
	 *         level1=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         level2_to_level1=[TMTCIFExportExport|VersionedQualifiedName]? 
	 *         level0=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         level1_to_level0=[TMTCIFExportExport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSEnvironmentPeriodicTCLevel2(ISerializationContext context, GSSEnvironmentPeriodicTCLevel2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPeriodicTCs returns GSSEnvironmentPeriodicTCs
	 *
	 * Constraint:
	 *     (
	 *         PeriodicTC_level_2+=GSSEnvironmentPeriodicTCLevel2 | 
	 *         PeriodicTC_level_1+=GSSEnvironmentPeriodicTCLevel1 | 
	 *         PeriodicTC_level_0+=GSSEnvironmentPeriodicTCLevel0
	 *     )*
	 */
	protected void sequence_GSSEnvironmentPeriodicTCs(ISerializationContext context, GSSEnvironmentPeriodicTCs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPhyHeaderPrint returns GSSEnvironmentPhyHeaderPrint
	 *
	 * Constraint:
	 *     (mainLog=GSSEnvironmentEnableDisable portLogs=GSSEnvironmentEnableDisable rawLog=GSSEnvironmentEnableDisable gssTabs=GSSEnvironmentEnableDisable)
	 */
	protected void sequence_GSSEnvironmentPhyHeaderPrint(ISerializationContext context, GSSEnvironmentPhyHeaderPrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0(), semanticObject.getMainLog());
		feeder.accept(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0(), semanticObject.getPortLogs());
		feeder.accept(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0(), semanticObject.getRawLog());
		feeder.accept(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0(), semanticObject.getGssTabs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPlot returns GSSEnvironmentPlot
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         chartRef=[GSSChartsChart|VersionedQualifiedReferenceName] 
	 *         (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
	 *     )
	 */
	protected void sequence_GSSEnvironmentPlot(ISerializationContext context, GSSEnvironmentPlot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentPrintingData returns GSSEnvironmentPrintingData
	 *
	 * Constraint:
	 *     (printStatus=GSSEnvironmentEnableDisable structuredData=GSSEnvironmentStructuredData?)
	 */
	protected void sequence_GSSEnvironmentPrintingData(ISerializationContext context, GSSEnvironmentPrintingData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentProtocol returns GSSEnvironmentProtocol
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID typeLevel=INTEGER typeOffset=INTEGER subtypeOffset=INTEGER?)
	 */
	protected void sequence_GSSEnvironmentProtocol(ISerializationContext context, GSSEnvironmentProtocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentProtocols returns GSSEnvironmentProtocols
	 *
	 * Constraint:
	 *     Protocol+=GSSEnvironmentProtocol+
	 */
	protected void sequence_GSSEnvironmentProtocols(ISerializationContext context, GSSEnvironmentProtocols semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentReferenceField returns GSSEnvironmentReferenceField
	 *
	 * Constraint:
	 *     (
	 *         type=GSSEnvironmentReferenceFieldType 
	 *         ifRef=INTEGER 
	 *         level=INTEGER 
	 *         fieldRef=INTEGER 
	 *         offset=INTEGER 
	 *         size=INTEGER
	 *     )
	 */
	protected void sequence_GSSEnvironmentReferenceField(ISerializationContext context, GSSEnvironmentReferenceField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__TYPE));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__IF_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__LEVEL));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__OFFSET));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_FIELD__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentReferencePeriodicTC returns GSSEnvironmentReferencePeriodicTC
	 *
	 * Constraint:
	 *     (idRef=[GSSEnvironmentPeriodicTC|STRING] level=INTEGER fieldRef=INTEGER offset=INTEGER size=INTEGER)
	 */
	protected void sequence_GSSEnvironmentReferencePeriodicTC(ISerializationContext context, GSSEnvironmentReferencePeriodicTC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__ID_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__LEVEL));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__OFFSET));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCSTRINGTerminalRuleCall_4_0_1(), semanticObject.getIdRef());
		feeder.accept(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentReferenceSpecialPacket returns GSSEnvironmentReferenceSpecialPacket
	 *
	 * Constraint:
	 *     (idRef=[GSSEnvironmentSpecialPacket|STRING] level=INTEGER fieldRef=INTEGER offset=INTEGER size=INTEGER)
	 */
	protected void sequence_GSSEnvironmentReferenceSpecialPacket(ISerializationContext context, GSSEnvironmentReferenceSpecialPacket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketSTRINGTerminalRuleCall_4_0_1(), semanticObject.getIdRef());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentScenario returns GSSEnvironmentScenario
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         gss_options=GSSEnvironmentOptions 
	 *         Protocols=GSSEnvironmentProtocols 
	 *         Interfaces=GSSEnvironmentInterfaces 
	 *         SpecialPackets=GSSEnvironmentSpecialPackets? 
	 *         PeriodicTCs=GSSEnvironmentPeriodicTCs? 
	 *         (GlobalVars=GSSEnvironmentGlobalVars | Monitors=GSSEnvironmentMonitors)*
	 *     )
	 */
	protected void sequence_GSSEnvironmentScenario(ISerializationContext context, GSSEnvironmentScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentSpecialPacket returns GSSEnvironmentSpecialPacket
	 *
	 * Constraint:
	 *     (
	 *         status=GSSEnvironmentEnableDisable 
	 *         name=STRING 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         levels=INTEGER 
	 *         levelRef=INTEGER 
	 *         inputFilter=[TMTCIFFilterFilter|VersionedQualifiedName] 
	 *         UpperLevels+=GSSEnvironmentUpperLevels? 
	 *         printingData=GSSEnvironmentPrintingData 
	 *         (period=GSSEnvironmentPeriod | intervalRange=GSSEnvironmentIntervalRange)?
	 *     )
	 */
	protected void sequence_GSSEnvironmentSpecialPacket(ISerializationContext context, GSSEnvironmentSpecialPacket semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentSpecialPackets returns GSSEnvironmentSpecialPackets
	 *
	 * Constraint:
	 *     SpecialPacket+=GSSEnvironmentSpecialPacket
	 */
	protected void sequence_GSSEnvironmentSpecialPackets(ISerializationContext context, GSSEnvironmentSpecialPackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentStructuredData returns GSSEnvironmentStructuredData
	 *
	 * Constraint:
	 *     (levelRef=INTEGER firstField=INTEGER)
	 */
	protected void sequence_GSSEnvironmentStructuredData(ISerializationContext context, GSSEnvironmentStructuredData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_STRUCTURED_DATA__LEVEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_STRUCTURED_DATA__LEVEL_REF));
			if (transientValues.isValueTransient(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_STRUCTURED_DATA__FIRST_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, environmentPackage.Literals.GSS_ENVIRONMENT_STRUCTURED_DATA__FIRST_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0(), semanticObject.getLevelRef());
		feeder.accept(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0(), semanticObject.getFirstField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentUpperLevel returns GSSEnvironmentUpperLevel
	 *
	 * Constraint:
	 *     (
	 *         level=GSSEnvironmentUpperLevelLevel 
	 *         TMformat=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         inputFilter=[TMTCIFFilterFilter|VersionedQualifiedName]? 
	 *         import_from_prev_Level=[TMTCIFImportImport|VersionedQualifiedName]?
	 *     )
	 */
	protected void sequence_GSSEnvironmentUpperLevel(ISerializationContext context, GSSEnvironmentUpperLevel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSEnvironmentUpperLevels returns GSSEnvironmentUpperLevels
	 *
	 * Constraint:
	 *     UpperLevel+=GSSEnvironmentUpperLevel+
	 */
	protected void sequence_GSSEnvironmentUpperLevels(ISerializationContext context, GSSEnvironmentUpperLevels semanticObject) {
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
	 *     (imports+=GSSModelFileImport* element=GSSEnvironmentGSSEnvironment)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
