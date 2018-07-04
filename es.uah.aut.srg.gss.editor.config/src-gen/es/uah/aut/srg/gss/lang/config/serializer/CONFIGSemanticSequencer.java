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
import es.uah.aut.srg.gss.config.GSSConfigAlarmMsg;
import es.uah.aut.srg.gss.config.GSSConfigAlarmVal;
import es.uah.aut.srg.gss.config.GSSConfigAppToLevel0;
import es.uah.aut.srg.gss.config.GSSConfigAppToLevel1;
import es.uah.aut.srg.gss.config.GSSConfigAppToLevel2;
import es.uah.aut.srg.gss.config.GSSConfigExportToPrevLevel;
import es.uah.aut.srg.gss.config.GSSConfigGSSConfig;
import es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfo;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint;
import es.uah.aut.srg.gss.config.GSSConfigGSSOptions;
import es.uah.aut.srg.gss.config.GSSConfigGVFiltered;
import es.uah.aut.srg.gss.config.GSSConfigGVPeriodic;
import es.uah.aut.srg.gss.config.GSSConfigGlobalVar;
import es.uah.aut.srg.gss.config.GSSConfigGlobalVars;
import es.uah.aut.srg.gss.config.GSSConfigImportFromPrevLevel;
import es.uah.aut.srg.gss.config.GSSConfigInputFilter;
import es.uah.aut.srg.gss.config.GSSConfigInterface;
import es.uah.aut.srg.gss.config.GSSConfigInterfaces;
import es.uah.aut.srg.gss.config.GSSConfigIntervalRange;
import es.uah.aut.srg.gss.config.GSSConfigLevel0;
import es.uah.aut.srg.gss.config.GSSConfigLevel1;
import es.uah.aut.srg.gss.config.GSSConfigLevel1ToLevel0;
import es.uah.aut.srg.gss.config.GSSConfigLevel2;
import es.uah.aut.srg.gss.config.GSSConfigLevel2ToLevel1;
import es.uah.aut.srg.gss.config.GSSConfigLevelIn;
import es.uah.aut.srg.gss.config.GSSConfigLevelInOut;
import es.uah.aut.srg.gss.config.GSSConfigLevelOut;
import es.uah.aut.srg.gss.config.GSSConfigMainInterface;
import es.uah.aut.srg.gss.config.GSSConfigModify;
import es.uah.aut.srg.gss.config.GSSConfigMonitors;
import es.uah.aut.srg.gss.config.GSSConfigPeriod;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs;
import es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint;
import es.uah.aut.srg.gss.config.GSSConfigPlot;
import es.uah.aut.srg.gss.config.GSSConfigPrintingData;
import es.uah.aut.srg.gss.config.GSSConfigProtocol;
import es.uah.aut.srg.gss.config.GSSConfigProtocols;
import es.uah.aut.srg.gss.config.GSSConfigReferenceField;
import es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC;
import es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket;
import es.uah.aut.srg.gss.config.GSSConfigSpecialPacket;
import es.uah.aut.srg.gss.config.GSSConfigSpecialPackets;
import es.uah.aut.srg.gss.config.GSSConfigStructuredData;
import es.uah.aut.srg.gss.config.GSSConfigTCFormat;
import es.uah.aut.srg.gss.config.GSSConfigTMFormat;
import es.uah.aut.srg.gss.config.GSSConfigTestCase;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevel;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevels;
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
			case configPackage.GSS_CONFIG_ALARM_MSG:
				sequence_GSSConfigAlarmMsg(context, (GSSConfigAlarmMsg) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_ALARM_VAL:
				sequence_GSSConfigAlarmVal(context, (GSSConfigAlarmVal) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_APP_TO_LEVEL0:
				sequence_GSSConfigAppToLevel0(context, (GSSConfigAppToLevel0) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_APP_TO_LEVEL1:
				sequence_GSSConfigAppToLevel1(context, (GSSConfigAppToLevel1) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_APP_TO_LEVEL2:
				sequence_GSSConfigAppToLevel2(context, (GSSConfigAppToLevel2) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_EXPORT_TO_PREV_LEVEL:
				sequence_GSSConfigExportToPrevLevel(context, (GSSConfigExportToPrevLevel) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GSS_CONFIG:
				sequence_GSSConfigGSSConfig(context, (GSSConfigGSSConfig) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS:
				sequence_GSSConfigGSSDiscardErrorFlags(context, (GSSConfigGSSDiscardErrorFlags) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GSS_INFO:
				sequence_GSSConfigGSSInfo(context, (GSSConfigGSSInfo) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT:
				sequence_GSSConfigGSSInfoPrint(context, (GSSConfigGSSInfoPrint) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GSS_OPTIONS:
				sequence_GSSConfigGSSOptions(context, (GSSConfigGSSOptions) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GV_FILTERED:
				sequence_GSSConfigGVFiltered(context, (GSSConfigGVFiltered) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GV_PERIODIC:
				sequence_GSSConfigGVPeriodic(context, (GSSConfigGVPeriodic) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GLOBAL_VAR:
				sequence_GSSConfigGlobalVar(context, (GSSConfigGlobalVar) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_GLOBAL_VARS:
				sequence_GSSConfigGlobalVars(context, (GSSConfigGlobalVars) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_IMPORT_FROM_PREV_LEVEL:
				sequence_GSSConfigImportFromPrevLevel(context, (GSSConfigImportFromPrevLevel) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_INPUT_FILTER:
				sequence_GSSConfigInputFilter(context, (GSSConfigInputFilter) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_INTERFACE:
				sequence_GSSConfigInterface(context, (GSSConfigInterface) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_INTERFACES:
				sequence_GSSConfigInterfaces(context, (GSSConfigInterfaces) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_INTERVAL_RANGE:
				sequence_GSSConfigIntervalRange(context, (GSSConfigIntervalRange) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL0:
				sequence_GSSConfigLevel0(context, (GSSConfigLevel0) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL1:
				sequence_GSSConfigLevel1(context, (GSSConfigLevel1) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL1_TO_LEVEL0:
				sequence_GSSConfigLevel1ToLevel0(context, (GSSConfigLevel1ToLevel0) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL2:
				sequence_GSSConfigLevel2(context, (GSSConfigLevel2) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL2_TO_LEVEL1:
				sequence_GSSConfigLevel2ToLevel1(context, (GSSConfigLevel2ToLevel1) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL_IN:
				sequence_GSSConfigLevelIn(context, (GSSConfigLevelIn) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL_IN_OUT:
				sequence_GSSConfigLevelInOut(context, (GSSConfigLevelInOut) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_LEVEL_OUT:
				sequence_GSSConfigLevelOut(context, (GSSConfigLevelOut) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_MAIN_INTERFACE:
				sequence_GSSConfigMainInterface(context, (GSSConfigMainInterface) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_MODIFY:
				sequence_GSSConfigModify(context, (GSSConfigModify) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_MONITORS:
				sequence_GSSConfigMonitors(context, (GSSConfigMonitors) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PERIOD:
				sequence_GSSConfigPeriod(context, (GSSConfigPeriod) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0:
				sequence_GSSConfigPeriodicTCLevel0(context, (GSSConfigPeriodicTCLevel0) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1:
				sequence_GSSConfigPeriodicTCLevel1(context, (GSSConfigPeriodicTCLevel1) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2:
				sequence_GSSConfigPeriodicTCLevel2(context, (GSSConfigPeriodicTCLevel2) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PERIODIC_TCS:
				sequence_GSSConfigPeriodicTCs(context, (GSSConfigPeriodicTCs) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT:
				sequence_GSSConfigPhyHeaderPrint(context, (GSSConfigPhyHeaderPrint) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PLOT:
				sequence_GSSConfigPlot(context, (GSSConfigPlot) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PRINTING_DATA:
				sequence_GSSConfigPrintingData(context, (GSSConfigPrintingData) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PROTOCOL:
				sequence_GSSConfigProtocol(context, (GSSConfigProtocol) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_PROTOCOLS:
				sequence_GSSConfigProtocols(context, (GSSConfigProtocols) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_REFERENCE_FIELD:
				sequence_GSSConfigReferenceField(context, (GSSConfigReferenceField) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_REFERENCE_PERIODIC_TC:
				sequence_GSSConfigReferencePeriodicTC(context, (GSSConfigReferencePeriodicTC) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_REFERENCE_SPECIAL_PACKET:
				sequence_GSSConfigReferenceSpecialPacket(context, (GSSConfigReferenceSpecialPacket) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_SPECIAL_PACKET:
				sequence_GSSConfigSpecialPacket(context, (GSSConfigSpecialPacket) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS:
				sequence_GSSConfigSpecialPackets(context, (GSSConfigSpecialPackets) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_STRUCTURED_DATA:
				sequence_GSSConfigStructuredData(context, (GSSConfigStructuredData) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_TC_FORMAT:
				sequence_GSSConfigTCFormat(context, (GSSConfigTCFormat) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_TM_FORMAT:
				sequence_GSSConfigTMFormat(context, (GSSConfigTMFormat) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_TEST_CASE:
				sequence_GSSConfigTestCase(context, (GSSConfigTestCase) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_TESTS:
				sequence_GSSConfigTests(context, (GSSConfigTests) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_UPPER_LEVEL:
				sequence_GSSConfigUpperLevel(context, (GSSConfigUpperLevel) semanticObject); 
				return; 
			case configPackage.GSS_CONFIG_UPPER_LEVELS:
				sequence_GSSConfigUpperLevels(context, (GSSConfigUpperLevels) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSConfigAlarmMsg returns GSSConfigAlarmMsg
	 *
	 * Constraint:
	 *     (name=ID type=GSSConfigAlarmMsgType text=ID (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic))
	 */
	protected void sequence_GSSConfigAlarmMsg(ISerializationContext context, GSSConfigAlarmMsg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigAlarmVal returns GSSConfigAlarmVal
	 *
	 * Constraint:
	 *     (name=ID type=GSSConfigAlarmValType (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic))
	 */
	protected void sequence_GSSConfigAlarmVal(ISerializationContext context, GSSConfigAlarmVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigAppToLevel0 returns GSSConfigAppToLevel0
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSConfigAppToLevel0(ISerializationContext context, GSSConfigAppToLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_APP_TO_LEVEL0__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_APP_TO_LEVEL0__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigAppToLevel0Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigAppToLevel1 returns GSSConfigAppToLevel1
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSConfigAppToLevel1(ISerializationContext context, GSSConfigAppToLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_APP_TO_LEVEL1__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_APP_TO_LEVEL1__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigAppToLevel1Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigAppToLevel2 returns GSSConfigAppToLevel2
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSConfigAppToLevel2(ISerializationContext context, GSSConfigAppToLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_APP_TO_LEVEL2__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_APP_TO_LEVEL2__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigAppToLevel2Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigExportToPrevLevel returns GSSConfigExportToPrevLevel
	 *
	 * Constraint:
	 *     file=XMLREF
	 */
	protected void sequence_GSSConfigExportToPrevLevel(ISerializationContext context, GSSConfigExportToPrevLevel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_EXPORT_TO_PREV_LEVEL__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_EXPORT_TO_PREV_LEVEL__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigExportToPrevLevelAccess().getFileXMLREFParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGSSConfig returns GSSConfigGSSConfig
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (uri=QualifiedName | version=Version)+ 
	 *         gss_options=GSSConfigGSSOptions 
	 *         Protocols=GSSConfigProtocols 
	 *         Interfaces=GSSConfigInterfaces 
	 *         SpecialPackets=GSSConfigSpecialPackets? 
	 *         PeriodicTCs=GSSConfigPeriodicTCs? 
	 *         (GlobalVars=GSSConfigGlobalVars | Monitors=GSSConfigMonitors)* 
	 *         Tests=GSSConfigTests
	 *     )
	 */
	protected void sequence_GSSConfigGSSConfig(ISerializationContext context, GSSConfigGSSConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGSSDiscardErrorFlags returns GSSConfigGSSDiscardErrorFlags
	 *
	 * Constraint:
	 *     (txErrors=GSSConfigEnableDisable notExpectedPackets=GSSConfigEnableDisable filtersKo=GSSConfigEnableDisable validTimesKo=GSSConfigEnableDisable)
	 */
	protected void sequence_GSSConfigGSSDiscardErrorFlags(ISerializationContext context, GSSConfigGSSDiscardErrorFlags semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0(), semanticObject.getTxErrors());
		feeder.accept(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0(), semanticObject.getNotExpectedPackets());
		feeder.accept(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0(), semanticObject.getFiltersKo());
		feeder.accept(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0(), semanticObject.getValidTimesKo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGSSInfoPrint returns GSSConfigGSSInfoPrint
	 *
	 * Constraint:
	 *     (mainLog=GSSConfigEnableDisable portLogs=GSSConfigEnableDisable debugLog=GSSConfigEnableDisable)
	 */
	protected void sequence_GSSConfigGSSInfoPrint(ISerializationContext context, GSSConfigGSSInfoPrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0(), semanticObject.getMainLog());
		feeder.accept(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0(), semanticObject.getPortLogs());
		feeder.accept(grammarAccess.getGSSConfigGSSInfoPrintAccess().getDebugLogGSSConfigEnableDisableEnumRuleCall_12_0(), semanticObject.getDebugLog());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGSSInfo returns GSSConfigGSSInfo
	 *
	 * Constraint:
	 *     (test_campaign=ID version=Version date=DATE version_control_url=URL?)
	 */
	protected void sequence_GSSConfigGSSInfo(ISerializationContext context, GSSConfigGSSInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGSSOptions returns GSSConfigGSSOptions
	 *
	 * Constraint:
	 *     (
	 *         gss_info=GSSConfigGSSInfo 
	 *         gss_info_print=GSSConfigGSSInfoPrint 
	 *         phy_header_print=GSSConfigPhyHeaderPrint 
	 *         discardErrorFlags=GSSConfigGSSDiscardErrorFlags
	 *     )
	 */
	protected void sequence_GSSConfigGSSOptions(ISerializationContext context, GSSConfigGSSOptions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__GSS_INFO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__GSS_INFO));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoGSSConfigGSSInfoParserRuleCall_2_0(), semanticObject.getGss_info());
		feeder.accept(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0(), semanticObject.getGss_info_print());
		feeder.accept(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0(), semanticObject.getPhy_header_print());
		feeder.accept(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0(), semanticObject.getDiscardErrorFlags());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGVFiltered returns GSSConfigGVFiltered
	 *
	 * Constraint:
	 *     (GlobalVarRef=INTEGER filter=XMLREF)
	 */
	protected void sequence_GSSConfigGVFiltered(ISerializationContext context, GSSConfigGVFiltered semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GV_FILTERED__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GV_FILTERED__FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefINTEGERParserRuleCall_4_0(), semanticObject.getGlobalVarRef());
		feeder.accept(grammarAccess.getGSSConfigGVFilteredAccess().getFilterXMLREFParserRuleCall_8_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGVPeriodic returns GSSConfigGVPeriodic
	 *
	 * Constraint:
	 *     (GlobalVarRef=INTEGER period_value=INTEGER period_unit=GSSConfigUnit)
	 */
	protected void sequence_GSSConfigGVPeriodic(ISerializationContext context, GSSConfigGVPeriodic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GV_PERIODIC__GLOBAL_VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GV_PERIODIC__GLOBAL_VAR_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GV_PERIODIC__PERIOD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GV_PERIODIC__PERIOD_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_GV_PERIODIC__PERIOD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_GV_PERIODIC__PERIOD_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefINTEGERParserRuleCall_5_0(), semanticObject.getGlobalVarRef());
		feeder.accept(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_9_0(), semanticObject.getPeriod_value());
		feeder.accept(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitGSSConfigUnitEnumRuleCall_13_0(), semanticObject.getPeriod_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGlobalVar returns GSSConfigGlobalVar
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         type=GSSConfigGlobalVarType 
	 *         initial_value=INTEGER 
	 *         (referenceField=GSSConfigReferenceField | referencePeriodicTC=GSSConfigReferencePeriodicTC | referenceSpecialPacket=GSSConfigReferenceSpecialPacket)
	 *     )
	 */
	protected void sequence_GSSConfigGlobalVar(ISerializationContext context, GSSConfigGlobalVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigGlobalVars returns GSSConfigGlobalVars
	 *
	 * Constraint:
	 *     GlobalVar+=GSSConfigGlobalVar+
	 */
	protected void sequence_GSSConfigGlobalVars(ISerializationContext context, GSSConfigGlobalVars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigImportFromPrevLevel returns GSSConfigImportFromPrevLevel
	 *
	 * Constraint:
	 *     file=XMLREF
	 */
	protected void sequence_GSSConfigImportFromPrevLevel(ISerializationContext context, GSSConfigImportFromPrevLevel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_IMPORT_FROM_PREV_LEVEL__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_IMPORT_FROM_PREV_LEVEL__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigImportFromPrevLevelAccess().getFileXMLREFParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigInputFilter returns GSSConfigInputFilter
	 *
	 * Constraint:
	 *     file=XMLREF
	 */
	protected void sequence_GSSConfigInputFilter(ISerializationContext context, GSSConfigInputFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_INPUT_FILTER__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_INPUT_FILTER__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigInputFilterAccess().getFileXMLREFParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigInterface returns GSSConfigInterface
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         ifType=GSSConfigInterfaceType 
	 *         ifConfig=ID 
	 *         ioType=GSSConfigInterfaceIOType 
	 *         protocolID=INTEGER? 
	 *         (LevelInOut+=GSSConfigLevelInOut | LevelIn+=GSSConfigLevelIn | LevelOut+=GSSConfigLevelOut)+
	 *     )
	 */
	protected void sequence_GSSConfigInterface(ISerializationContext context, GSSConfigInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigInterfaces returns GSSConfigInterfaces
	 *
	 * Constraint:
	 *     (MainInterface=GSSConfigMainInterface Interface+=GSSConfigInterface+)
	 */
	protected void sequence_GSSConfigInterfaces(ISerializationContext context, GSSConfigInterfaces semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigIntervalRange returns GSSConfigIntervalRange
	 *
	 * Constraint:
	 *     (min=INTEGER max=INTEGER interval_value=INTEGER interval_unit=GSSConfigUnit)
	 */
	protected void sequence_GSSConfigIntervalRange(ISerializationContext context, GSSConfigIntervalRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__MIN));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__MAX));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__INTERVAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__INTERVAL_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__INTERVAL_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_INTERVAL_RANGE__INTERVAL_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0(), semanticObject.getMax());
		feeder.accept(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0(), semanticObject.getInterval_value());
		feeder.accept(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitGSSConfigUnitEnumRuleCall_16_0(), semanticObject.getInterval_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevel0 returns GSSConfigLevel0
	 *
	 * Constraint:
	 *     format=XMLREF
	 */
	protected void sequence_GSSConfigLevel0(ISerializationContext context, GSSConfigLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL0__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL0__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigLevel0Access().getFormatXMLREFParserRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevel1ToLevel0 returns GSSConfigLevel1ToLevel0
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSConfigLevel1ToLevel0(ISerializationContext context, GSSConfigLevel1ToLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL1_TO_LEVEL0__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL1_TO_LEVEL0__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigLevel1ToLevel0Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevel1 returns GSSConfigLevel1
	 *
	 * Constraint:
	 *     format=XMLREF
	 */
	protected void sequence_GSSConfigLevel1(ISerializationContext context, GSSConfigLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL1__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL1__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigLevel1Access().getFormatXMLREFParserRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevel2ToLevel1 returns GSSConfigLevel2ToLevel1
	 *
	 * Constraint:
	 *     export=XMLREF
	 */
	protected void sequence_GSSConfigLevel2ToLevel1(ISerializationContext context, GSSConfigLevel2ToLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL2_TO_LEVEL1__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL2_TO_LEVEL1__EXPORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigLevel2ToLevel1Access().getExportXMLREFParserRuleCall_4_0(), semanticObject.getExport());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevel2 returns GSSConfigLevel2
	 *
	 * Constraint:
	 *     format=XMLREF
	 */
	protected void sequence_GSSConfigLevel2(ISerializationContext context, GSSConfigLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL2__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_LEVEL2__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigLevel2Access().getFormatXMLREFParserRuleCall_4_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevelInOut returns GSSConfigLevelInOut
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         TMformat=GSSConfigTMFormat 
	 *         TCformat=GSSConfigTCFormat 
	 *         inputFilter=GSSConfigInputFilter 
	 *         export_to_prev_Level=GSSConfigExportToPrevLevel? 
	 *         import_from_prev_Level=GSSConfigImportFromPrevLevel?
	 *     )
	 */
	protected void sequence_GSSConfigLevelInOut(ISerializationContext context, GSSConfigLevelInOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevelIn returns GSSConfigLevelIn
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID TCformat=GSSConfigTCFormat export_to_prev_Level=GSSConfigExportToPrevLevel?)
	 */
	protected void sequence_GSSConfigLevelIn(ISerializationContext context, GSSConfigLevelIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigLevelOut returns GSSConfigLevelOut
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID TMformat=GSSConfigTMFormat inputFilter=GSSConfigInputFilter import_from_prev_Level=GSSConfigImportFromPrevLevel?)
	 */
	protected void sequence_GSSConfigLevelOut(ISerializationContext context, GSSConfigLevelOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigMainInterface returns GSSConfigMainInterface
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         ifType=GSSConfigMainInterfaceType 
	 *         ifConfig=ID 
	 *         ioType=GSSConfigMainInterfaceIOType 
	 *         protocolID=INTEGER? 
	 *         LevelInOut+=GSSConfigLevelInOut+
	 *     )
	 */
	protected void sequence_GSSConfigMainInterface(ISerializationContext context, GSSConfigMainInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigModify returns GSSConfigModify
	 *
	 * Constraint:
	 *     (name=ID type=GSSConfigModifyType value=INTEGER (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic))
	 */
	protected void sequence_GSSConfigModify(ISerializationContext context, GSSConfigModify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigMonitors returns GSSConfigMonitors
	 *
	 * Constraint:
	 *     (ChartsFile=ID? (plot+=GSSConfigPlot | alarmMsg+=GSSConfigAlarmMsg | modify+=GSSConfigModify | alarmVal+=GSSConfigAlarmVal)+)
	 */
	protected void sequence_GSSConfigMonitors(ISerializationContext context, GSSConfigMonitors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPeriod returns GSSConfigPeriod
	 *
	 * Constraint:
	 *     (min_value=INTEGER min_unit=GSSConfigUnit max_value=INTEGER max_unit=GSSConfigUnit)
	 */
	protected void sequence_GSSConfigPeriod(ISerializationContext context, GSSConfigPeriod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MIN_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MIN_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MIN_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MIN_UNIT));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MAX_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MAX_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MAX_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIOD__MAX_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0(), semanticObject.getMin_value());
		feeder.accept(grammarAccess.getGSSConfigPeriodAccess().getMin_unitGSSConfigUnitEnumRuleCall_8_0(), semanticObject.getMin_unit());
		feeder.accept(grammarAccess.getGSSConfigPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0(), semanticObject.getMax_value());
		feeder.accept(grammarAccess.getGSSConfigPeriodAccess().getMax_unitGSSConfigUnitEnumRuleCall_16_0(), semanticObject.getMax_unit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPeriodicTCLevel0 returns GSSConfigPeriodicTCLevel0
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSConfigUnit 
	 *         level0=GSSConfigLevel0 
	 *         app_to_level0=GSSConfigAppToLevel0
	 *     )
	 */
	protected void sequence_GSSConfigPeriodicTCLevel0(ISerializationContext context, GSSConfigPeriodicTCLevel0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0(), semanticObject.getPeriod_value());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0(), semanticObject.getPeriod_unit());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0GSSConfigLevel0ParserRuleCall_22_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0GSSConfigAppToLevel0ParserRuleCall_23_0(), semanticObject.getApp_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPeriodicTCLevel1 returns GSSConfigPeriodicTCLevel1
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSConfigUnit 
	 *         level1=GSSConfigLevel1 
	 *         app_to_level1=GSSConfigAppToLevel1 
	 *         level0=GSSConfigLevel0 
	 *         level1_to_level0=GSSConfigLevel1ToLevel0
	 *     )
	 */
	protected void sequence_GSSConfigPeriodicTCLevel1(ISerializationContext context, GSSConfigPeriodicTCLevel1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0(), semanticObject.getPeriod_value());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0(), semanticObject.getPeriod_unit());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1GSSConfigLevel1ParserRuleCall_22_0(), semanticObject.getLevel1());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1GSSConfigAppToLevel1ParserRuleCall_23_0(), semanticObject.getApp_to_level1());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0GSSConfigLevel0ParserRuleCall_24_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0GSSConfigLevel1ToLevel0ParserRuleCall_25_0(), semanticObject.getLevel1_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPeriodicTCLevel2 returns GSSConfigPeriodicTCLevel2
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         period_value=INTEGER 
	 *         period_unit=GSSConfigUnit 
	 *         level2=GSSConfigLevel2 
	 *         app_to_level2=GSSConfigAppToLevel2 
	 *         level1=GSSConfigLevel1 
	 *         level2_to_level1=GSSConfigLevel2ToLevel1 
	 *         level0=GSSConfigLevel0 
	 *         level1_to_level0=GSSConfigLevel1ToLevel0
	 *     )
	 */
	protected void sequence_GSSConfigPeriodicTCLevel2(ISerializationContext context, GSSConfigPeriodicTCLevel2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0(), semanticObject.getPeriod_value());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0(), semanticObject.getPeriod_unit());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2GSSConfigLevel2ParserRuleCall_22_0(), semanticObject.getLevel2());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2GSSConfigAppToLevel2ParserRuleCall_23_0(), semanticObject.getApp_to_level2());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1GSSConfigLevel1ParserRuleCall_24_0(), semanticObject.getLevel1());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1GSSConfigLevel2ToLevel1ParserRuleCall_25_0(), semanticObject.getLevel2_to_level1());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0GSSConfigLevel0ParserRuleCall_26_0(), semanticObject.getLevel0());
		feeder.accept(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0GSSConfigLevel1ToLevel0ParserRuleCall_27_0(), semanticObject.getLevel1_to_level0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPeriodicTCs returns GSSConfigPeriodicTCs
	 *
	 * Constraint:
	 *     (PeriodicTC_level_2+=GSSConfigPeriodicTCLevel2 | PeriodicTC_level_1+=GSSConfigPeriodicTCLevel1 | PeriodicTC_level_0+=GSSConfigPeriodicTCLevel0)*
	 */
	protected void sequence_GSSConfigPeriodicTCs(ISerializationContext context, GSSConfigPeriodicTCs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPhyHeaderPrint returns GSSConfigPhyHeaderPrint
	 *
	 * Constraint:
	 *     (mainLog=GSSConfigEnableDisable portLogs=GSSConfigEnableDisable debugLog=GSSConfigEnableDisable gssTabs=GSSConfigEnableDisable)
	 */
	protected void sequence_GSSConfigPhyHeaderPrint(ISerializationContext context, GSSConfigPhyHeaderPrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0(), semanticObject.getMainLog());
		feeder.accept(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0(), semanticObject.getPortLogs());
		feeder.accept(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getDebugLogGSSConfigEnableDisableEnumRuleCall_12_0(), semanticObject.getDebugLog());
		feeder.accept(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsGSSConfigEnableDisableEnumRuleCall_16_0(), semanticObject.getGssTabs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPlot returns GSSConfigPlot
	 *
	 * Constraint:
	 *     (name=ID (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic))
	 */
	protected void sequence_GSSConfigPlot(ISerializationContext context, GSSConfigPlot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigPrintingData returns GSSConfigPrintingData
	 *
	 * Constraint:
	 *     (printStatus=GSSConfigEnableDisable structuredData=GSSConfigStructuredData?)
	 */
	protected void sequence_GSSConfigPrintingData(ISerializationContext context, GSSConfigPrintingData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigProtocol returns GSSConfigProtocol
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID typeLevel=INTEGER typeOffset=INTEGER subtypeOffset=INTEGER?)
	 */
	protected void sequence_GSSConfigProtocol(ISerializationContext context, GSSConfigProtocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigProtocols returns GSSConfigProtocols
	 *
	 * Constraint:
	 *     Protocol+=GSSConfigProtocol+
	 */
	protected void sequence_GSSConfigProtocols(ISerializationContext context, GSSConfigProtocols semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigReferenceField returns GSSConfigReferenceField
	 *
	 * Constraint:
	 *     (
	 *         type=GSSConfigReferenceFieldType 
	 *         ifRef=INTEGER 
	 *         level=INTEGER 
	 *         fieldRef=INTEGER 
	 *         offset=INTEGER 
	 *         size=INTEGER
	 *     )
	 */
	protected void sequence_GSSConfigReferenceField(ISerializationContext context, GSSConfigReferenceField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__TYPE));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__IF_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__LEVEL));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__OFFSET));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_FIELD__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigReferencePeriodicTC returns GSSConfigReferencePeriodicTC
	 *
	 * Constraint:
	 *     (idRef=INTEGER level=INTEGER fieldRef=INTEGER offset=INTEGER size=INTEGER)
	 */
	protected void sequence_GSSConfigReferencePeriodicTC(ISerializationContext context, GSSConfigReferencePeriodicTC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__ID_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__LEVEL));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__OFFSET));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_PERIODIC_TC__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefINTEGERParserRuleCall_4_0(), semanticObject.getIdRef());
		feeder.accept(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigReferenceSpecialPacket returns GSSConfigReferenceSpecialPacket
	 *
	 * Constraint:
	 *     (idRef=INTEGER level=INTEGER fieldRef=INTEGER offset=INTEGER size=INTEGER)
	 */
	protected void sequence_GSSConfigReferenceSpecialPacket(ISerializationContext context, GSSConfigReferenceSpecialPacket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__ID_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__LEVEL));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__OFFSET));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_REFERENCE_SPECIAL_PACKET__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefINTEGERParserRuleCall_4_0(), semanticObject.getIdRef());
		feeder.accept(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0(), semanticObject.getOffset());
		feeder.accept(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigSpecialPacket returns GSSConfigSpecialPacket
	 *
	 * Constraint:
	 *     (
	 *         status=GSSConfigEnableDisable 
	 *         name=ID 
	 *         id=INTEGER 
	 *         ifRef=INTEGER 
	 *         levels=INTEGER 
	 *         levelRef=INTEGER 
	 *         inputFilter=GSSConfigInputFilter 
	 *         UpperLevels+=GSSConfigUpperLevels? 
	 *         printingData=GSSConfigPrintingData 
	 *         (period=GSSConfigPeriod | intervalRange=GSSConfigIntervalRange)?
	 *     )
	 */
	protected void sequence_GSSConfigSpecialPacket(ISerializationContext context, GSSConfigSpecialPacket semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigSpecialPackets returns GSSConfigSpecialPackets
	 *
	 * Constraint:
	 *     SpecialPacket+=GSSConfigSpecialPacket
	 */
	protected void sequence_GSSConfigSpecialPackets(ISerializationContext context, GSSConfigSpecialPackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigStructuredData returns GSSConfigStructuredData
	 *
	 * Constraint:
	 *     (levelRef=INTEGER firstField=INTEGER)
	 */
	protected void sequence_GSSConfigStructuredData(ISerializationContext context, GSSConfigStructuredData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_STRUCTURED_DATA__LEVEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_STRUCTURED_DATA__LEVEL_REF));
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_STRUCTURED_DATA__FIRST_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_STRUCTURED_DATA__FIRST_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0(), semanticObject.getLevelRef());
		feeder.accept(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0(), semanticObject.getFirstField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigTCFormat returns GSSConfigTCFormat
	 *
	 * Constraint:
	 *     file=XMLREF
	 */
	protected void sequence_GSSConfigTCFormat(ISerializationContext context, GSSConfigTCFormat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_TC_FORMAT__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_TC_FORMAT__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigTCFormatAccess().getFileXMLREFParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigTMFormat returns GSSConfigTMFormat
	 *
	 * Constraint:
	 *     file=XMLREF
	 */
	protected void sequence_GSSConfigTMFormat(ISerializationContext context, GSSConfigTMFormat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, configPackage.Literals.GSS_CONFIG_TM_FORMAT__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, configPackage.Literals.GSS_CONFIG_TM_FORMAT__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSConfigTMFormatAccess().getFileXMLREFParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigTestCase returns GSSConfigTestCase
	 *
	 * Constraint:
	 *     (name=ID procedure=ID req=ID? reqAction=GSSConfigReqAction?)
	 */
	protected void sequence_GSSConfigTestCase(ISerializationContext context, GSSConfigTestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigTests returns GSSConfigTests
	 *
	 * Constraint:
	 *     (ProtocolPacketsFile=ID? TestCase+=GSSConfigTestCase+)
	 */
	protected void sequence_GSSConfigTests(ISerializationContext context, GSSConfigTests semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigUpperLevel returns GSSConfigUpperLevel
	 *
	 * Constraint:
	 *     (level=GSSConfigUpperLevelLevel TMformat=GSSConfigTMFormat inputFilter=GSSConfigInputFilter import_from_prev_Level=GSSConfigImportFromPrevLevel?)
	 */
	protected void sequence_GSSConfigUpperLevel(ISerializationContext context, GSSConfigUpperLevel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSConfigUpperLevels returns GSSConfigUpperLevels
	 *
	 * Constraint:
	 *     UpperLevel+=GSSConfigUpperLevel+
	 */
	protected void sequence_GSSConfigUpperLevels(ISerializationContext context, GSSConfigUpperLevels semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (imports+=GSSModelFileImport* element=GSSConfigGSSConfig)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
