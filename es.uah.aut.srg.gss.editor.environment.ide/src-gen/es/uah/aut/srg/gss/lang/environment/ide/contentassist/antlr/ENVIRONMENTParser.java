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
package es.uah.aut.srg.gss.lang.environment.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.environment.ide.contentassist.antlr.internal.InternalENVIRONMENTParser;
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ENVIRONMENTParser extends AbstractContentAssistParser {

	@Inject
	private ENVIRONMENTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalENVIRONMENTParser createParser() {
		InternalENVIRONMENTParser result = new InternalENVIRONMENTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getAlternatives_3(), "rule__GSSEnvironmentPeriodicTCs__Alternatives_3");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlternatives_3(), "rule__GSSEnvironmentMonitors__Alternatives_3");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getAlternatives_23(), "rule__GSSEnvironmentInterface__Alternatives_23");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getAlternatives_32(), "rule__GSSEnvironmentSpecialPacket__Alternatives_32");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getAlternatives_18(), "rule__GSSEnvironmentGlobalVar__Alternatives_18");
					put(grammarAccess.getGSSEnvironmentPlotAccess().getAlternatives_10(), "rule__GSSEnvironmentPlot__Alternatives_10");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getAlternatives_14(), "rule__GSSEnvironmentAlarmMsg__Alternatives_14");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getAlternatives_14(), "rule__GSSEnvironmentModify__Alternatives_14");
					put(grammarAccess.getGSSEnvironmentAlarmValAccess().getAlternatives_10(), "rule__GSSEnvironmentAlarmVal__Alternatives_10");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSEnvironmentEnableDisableAccess().getAlternatives(), "rule__GSSEnvironmentEnableDisable__Alternatives");
					put(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getAlternatives(), "rule__GSSEnvironmentInterfaceType__Alternatives");
					put(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getAlternatives(), "rule__GSSEnvironmentInterfaceIOType__Alternatives");
					put(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().getAlternatives(), "rule__GSSEnvironmentUpperLevelLevel__Alternatives");
					put(grammarAccess.getGSSEnvironmentUnitAccess().getAlternatives(), "rule__GSSEnvironmentUnit__Alternatives");
					put(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getAlternatives(), "rule__GSSEnvironmentGlobalVarType__Alternatives");
					put(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getAlternatives(), "rule__GSSEnvironmentReferenceFieldType__Alternatives");
					put(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlternatives(), "rule__GSSEnvironmentAlarmMsgType__Alternatives");
					put(grammarAccess.getGSSEnvironmentModifyTypeAccess().getAlternatives(), "rule__GSSEnvironmentModifyType__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGroup(), "rule__GSSEnvironmentGSSEnvironment__Group__0");
					put(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGroup_3(), "rule__GSSEnvironmentGSSEnvironment__Group_3__0");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getGroup(), "rule__GSSEnvironmentScenario__Group__0");
					put(grammarAccess.getGSSEnvironmentOptionsAccess().getGroup(), "rule__GSSEnvironmentOptions__Group__0");
					put(grammarAccess.getGSSEnvironmentProtocolsAccess().getGroup(), "rule__GSSEnvironmentProtocols__Group__0");
					put(grammarAccess.getGSSEnvironmentInterfacesAccess().getGroup(), "rule__GSSEnvironmentInterfaces__Group__0");
					put(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGroup(), "rule__GSSEnvironmentSpecialPackets__Group__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGroup(), "rule__GSSEnvironmentPeriodicTCs__Group__0");
					put(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGroup(), "rule__GSSEnvironmentGlobalVars__Group__0");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getGroup(), "rule__GSSEnvironmentMonitors__Group__0");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getGroup_2(), "rule__GSSEnvironmentMonitors__Group_2__0");
					put(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGroup(), "rule__GSSEnvironmentGSSInfo__Group__0");
					put(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGroup_14(), "rule__GSSEnvironmentGSSInfo__Group_14__0");
					put(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGroup(), "rule__GSSEnvironmentGSSInfoPrint__Group__0");
					put(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGroup(), "rule__GSSEnvironmentPhyHeaderPrint__Group__0");
					put(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGroup(), "rule__GSSEnvironmentGSSDiscardErrorFlags__Group__0");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getGroup(), "rule__GSSEnvironmentProtocol__Group__0");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getGroup_18(), "rule__GSSEnvironmentProtocol__Group_18__0");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup(), "rule__GSSEnvironmentMainInterface__Group__0");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup_22(), "rule__GSSEnvironmentMainInterface__Group_22__0");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup_23(), "rule__GSSEnvironmentMainInterface__Group_23__0");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getGroup(), "rule__GSSEnvironmentInterface__Group__0");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getGroup_22(), "rule__GSSEnvironmentInterface__Group_22__0");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup(), "rule__GSSEnvironmentLevelInOut__Group__0");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup_22(), "rule__GSSEnvironmentLevelInOut__Group_22__0");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup_23(), "rule__GSSEnvironmentLevelInOut__Group_23__0");
					put(grammarAccess.getGSSEnvironmentLevelInAccess().getGroup(), "rule__GSSEnvironmentLevelIn__Group__0");
					put(grammarAccess.getGSSEnvironmentLevelInAccess().getGroup_14(), "rule__GSSEnvironmentLevelIn__Group_14__0");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getGroup(), "rule__GSSEnvironmentLevelOut__Group__0");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getGroup_18(), "rule__GSSEnvironmentLevelOut__Group_18__0");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGroup(), "rule__GSSEnvironmentSpecialPacket__Group__0");
					put(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGroup(), "rule__GSSEnvironmentUpperLevels__Group__0");
					put(grammarAccess.getGSSEnvironmentPrintingDataAccess().getGroup(), "rule__GSSEnvironmentPrintingData__Group__0");
					put(grammarAccess.getGSSEnvironmentPeriodAccess().getGroup(), "rule__GSSEnvironmentPeriod__Group__0");
					put(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGroup(), "rule__GSSEnvironmentIntervalRange__Group__0");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup(), "rule__GSSEnvironmentUpperLevel__Group__0");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_6(), "rule__GSSEnvironmentUpperLevel__Group_6__0");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_7(), "rule__GSSEnvironmentUpperLevel__Group_7__0");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_8(), "rule__GSSEnvironmentUpperLevel__Group_8__0");
					put(grammarAccess.getGSSEnvironmentStructuredDataAccess().getGroup(), "rule__GSSEnvironmentStructuredData__Group__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup(), "rule__GSSEnvironmentPeriodicTCLevel2__Group__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_22(), "rule__GSSEnvironmentPeriodicTCLevel2__Group_22__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_27(), "rule__GSSEnvironmentPeriodicTCLevel2__Group_27__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_28(), "rule__GSSEnvironmentPeriodicTCLevel2__Group_28__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_29(), "rule__GSSEnvironmentPeriodicTCLevel2__Group_29__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_30(), "rule__GSSEnvironmentPeriodicTCLevel2__Group_30__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup(), "rule__GSSEnvironmentPeriodicTCLevel1__Group__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_22(), "rule__GSSEnvironmentPeriodicTCLevel1__Group_22__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_27(), "rule__GSSEnvironmentPeriodicTCLevel1__Group_27__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_28(), "rule__GSSEnvironmentPeriodicTCLevel1__Group_28__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGroup(), "rule__GSSEnvironmentPeriodicTCLevel0__Group__0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGroup_22(), "rule__GSSEnvironmentPeriodicTCLevel0__Group_22__0");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getGroup(), "rule__GSSEnvironmentGlobalVar__Group__0");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGroup(), "rule__GSSEnvironmentReferenceField__Group__0");
					put(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGroup(), "rule__GSSEnvironmentReferencePeriodicTC__Group__0");
					put(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGroup(), "rule__GSSEnvironmentReferenceSpecialPacket__Group__0");
					put(grammarAccess.getGSSEnvironmentPlotAccess().getGroup(), "rule__GSSEnvironmentPlot__Group__0");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGroup(), "rule__GSSEnvironmentAlarmMsg__Group__0");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getGroup(), "rule__GSSEnvironmentModify__Group__0");
					put(grammarAccess.getGSSEnvironmentAlarmValAccess().getGroup(), "rule__GSSEnvironmentAlarmVal__Group__0");
					put(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGroup(), "rule__GSSEnvironmentGVFiltered__Group__0");
					put(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGroup_6(), "rule__GSSEnvironmentGVFiltered__Group_6__0");
					put(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGroup(), "rule__GSSEnvironmentGVPeriodic__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getDATEAccess().getGroup(), "rule__DATE__Group__0");
					put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
					put(grammarAccess.getURLAccess().getGroup_1(), "rule__URL__Group_1__0");
					put(grammarAccess.getURLAccess().getGroup_3(), "rule__URL__Group_3__0");
					put(grammarAccess.getURLAccess().getGroup_4(), "rule__URL__Group_4__0");
					put(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0(), "rule__GSSModelFile__ImportsAssignment_0");
					put(grammarAccess.getGSSModelFileAccess().getElementAssignment_1(), "rule__GSSModelFile__ElementAssignment_1");
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2(), "rule__GSSModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameAssignment_1(), "rule__GSSEnvironmentGSSEnvironment__NameAssignment_1");
					put(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriAssignment_3_2(), "rule__GSSEnvironmentGSSEnvironment__UriAssignment_3_2");
					put(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionAssignment_6(), "rule__GSSEnvironmentGSSEnvironment__VersionAssignment_6");
					put(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioAssignment_8(), "rule__GSSEnvironmentGSSEnvironment__ScenarioAssignment_8");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getNameAssignment_1(), "rule__GSSEnvironmentScenario__NameAssignment_1");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getIdAssignment_5(), "rule__GSSEnvironmentScenario__IdAssignment_5");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsAssignment_7(), "rule__GSSEnvironmentScenario__Gss_optionsAssignment_7");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsAssignment_8(), "rule__GSSEnvironmentScenario__ProtocolsAssignment_8");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesAssignment_9(), "rule__GSSEnvironmentScenario__InterfacesAssignment_9");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsAssignment_10(), "rule__GSSEnvironmentScenario__SpecialPacketsAssignment_10");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsAssignment_11(), "rule__GSSEnvironmentScenario__PeriodicTCsAssignment_11");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsAssignment_12_0(), "rule__GSSEnvironmentScenario__GlobalVarsAssignment_12_0");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsAssignment_12_1(), "rule__GSSEnvironmentScenario__MonitorsAssignment_12_1");
					put(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoAssignment_2(), "rule__GSSEnvironmentOptions__Gss_infoAssignment_2");
					put(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printAssignment_3(), "rule__GSSEnvironmentOptions__Gss_info_printAssignment_3");
					put(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printAssignment_4(), "rule__GSSEnvironmentOptions__Phy_header_printAssignment_4");
					put(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsAssignment_5(), "rule__GSSEnvironmentOptions__DiscardErrorFlagsAssignment_5");
					put(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolAssignment_2(), "rule__GSSEnvironmentProtocols__ProtocolAssignment_2");
					put(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceAssignment_2(), "rule__GSSEnvironmentInterfaces__MainInterfaceAssignment_2");
					put(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceAssignment_3(), "rule__GSSEnvironmentInterfaces__InterfaceAssignment_3");
					put(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketAssignment_2(), "rule__GSSEnvironmentSpecialPackets__SpecialPacketAssignment_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0(), "rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_2Assignment_3_0");
					put(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1(), "rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_1Assignment_3_1");
					put(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2(), "rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_0Assignment_3_2");
					put(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarAssignment_2(), "rule__GSSEnvironmentGlobalVars__GlobalVarAssignment_2");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileAssignment_2_2(), "rule__GSSEnvironmentMonitors__ChartsFileAssignment_2_2");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotAssignment_3_0(), "rule__GSSEnvironmentMonitors__PlotAssignment_3_0");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgAssignment_3_1(), "rule__GSSEnvironmentMonitors__AlarmMsgAssignment_3_1");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyAssignment_3_2(), "rule__GSSEnvironmentMonitors__ModifyAssignment_3_2");
					put(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValAssignment_3_3(), "rule__GSSEnvironmentMonitors__AlarmValAssignment_3_3");
					put(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignAssignment_4(), "rule__GSSEnvironmentGSSInfo__Test_campaignAssignment_4");
					put(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionAssignment_8(), "rule__GSSEnvironmentGSSInfo__VersionAssignment_8");
					put(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateAssignment_12(), "rule__GSSEnvironmentGSSInfo__DateAssignment_12");
					put(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlAssignment_14_2(), "rule__GSSEnvironmentGSSInfo__Version_control_urlAssignment_14_2");
					put(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogAssignment_4(), "rule__GSSEnvironmentGSSInfoPrint__MainLogAssignment_4");
					put(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsAssignment_8(), "rule__GSSEnvironmentGSSInfoPrint__PortLogsAssignment_8");
					put(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogAssignment_12(), "rule__GSSEnvironmentGSSInfoPrint__RawLogAssignment_12");
					put(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogAssignment_4(), "rule__GSSEnvironmentPhyHeaderPrint__MainLogAssignment_4");
					put(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsAssignment_8(), "rule__GSSEnvironmentPhyHeaderPrint__PortLogsAssignment_8");
					put(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogAssignment_12(), "rule__GSSEnvironmentPhyHeaderPrint__RawLogAssignment_12");
					put(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsAssignment_16(), "rule__GSSEnvironmentPhyHeaderPrint__GssTabsAssignment_16");
					put(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4(), "rule__GSSEnvironmentGSSDiscardErrorFlags__TxErrorsAssignment_4");
					put(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8(), "rule__GSSEnvironmentGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8");
					put(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12(), "rule__GSSEnvironmentGSSDiscardErrorFlags__FiltersKoAssignment_12");
					put(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16(), "rule__GSSEnvironmentGSSDiscardErrorFlags__ValidTimesKoAssignment_16");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getIdAssignment_4(), "rule__GSSEnvironmentProtocol__IdAssignment_4");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getNameAssignment_8(), "rule__GSSEnvironmentProtocol__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelAssignment_12(), "rule__GSSEnvironmentProtocol__TypeLevelAssignment_12");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetAssignment_16(), "rule__GSSEnvironmentProtocol__TypeOffsetAssignment_16");
					put(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetAssignment_18_2(), "rule__GSSEnvironmentProtocol__SubtypeOffsetAssignment_18_2");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdAssignment_4(), "rule__GSSEnvironmentMainInterface__IdAssignment_4");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameAssignment_8(), "rule__GSSEnvironmentMainInterface__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeAssignment_12(), "rule__GSSEnvironmentMainInterface__IfTypeAssignment_12");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigAssignment_16(), "rule__GSSEnvironmentMainInterface__IfConfigAssignment_16");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeAssignment_20(), "rule__GSSEnvironmentMainInterface__IoTypeAssignment_20");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDAssignment_22_2(), "rule__GSSEnvironmentMainInterface__ProtocolIDAssignment_22_2");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileAssignment_23_2(), "rule__GSSEnvironmentMainInterface__ProtocolPacketsFileAssignment_23_2");
					put(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutAssignment_24(), "rule__GSSEnvironmentMainInterface__LevelInOutAssignment_24");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdAssignment_4(), "rule__GSSEnvironmentInterface__IdAssignment_4");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameAssignment_8(), "rule__GSSEnvironmentInterface__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeAssignment_12(), "rule__GSSEnvironmentInterface__IfTypeAssignment_12");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigAssignment_16(), "rule__GSSEnvironmentInterface__IfConfigAssignment_16");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeAssignment_20(), "rule__GSSEnvironmentInterface__IoTypeAssignment_20");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDAssignment_22_2(), "rule__GSSEnvironmentInterface__ProtocolIDAssignment_22_2");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutAssignment_23_0(), "rule__GSSEnvironmentInterface__LevelInOutAssignment_23_0");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInAssignment_23_1(), "rule__GSSEnvironmentInterface__LevelInAssignment_23_1");
					put(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutAssignment_23_2(), "rule__GSSEnvironmentInterface__LevelOutAssignment_23_2");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdAssignment_4(), "rule__GSSEnvironmentLevelInOut__IdAssignment_4");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameAssignment_8(), "rule__GSSEnvironmentLevelInOut__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatAssignment_12(), "rule__GSSEnvironmentLevelInOut__TMformatAssignment_12");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatAssignment_16(), "rule__GSSEnvironmentLevelInOut__TCformatAssignment_16");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterAssignment_20(), "rule__GSSEnvironmentLevelInOut__InputFilterAssignment_20");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2(), "rule__GSSEnvironmentLevelInOut__Export_to_prev_LevelAssignment_22_2");
					put(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2(), "rule__GSSEnvironmentLevelInOut__Import_from_prev_LevelAssignment_23_2");
					put(grammarAccess.getGSSEnvironmentLevelInAccess().getIdAssignment_4(), "rule__GSSEnvironmentLevelIn__IdAssignment_4");
					put(grammarAccess.getGSSEnvironmentLevelInAccess().getNameAssignment_8(), "rule__GSSEnvironmentLevelIn__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatAssignment_12(), "rule__GSSEnvironmentLevelIn__TCformatAssignment_12");
					put(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelAssignment_14_2(), "rule__GSSEnvironmentLevelIn__Export_to_prev_LevelAssignment_14_2");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdAssignment_4(), "rule__GSSEnvironmentLevelOut__IdAssignment_4");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameAssignment_8(), "rule__GSSEnvironmentLevelOut__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatAssignment_12(), "rule__GSSEnvironmentLevelOut__TMformatAssignment_12");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterAssignment_16(), "rule__GSSEnvironmentLevelOut__InputFilterAssignment_16");
					put(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelAssignment_18_2(), "rule__GSSEnvironmentLevelOut__Import_from_prev_LevelAssignment_18_2");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusAssignment_4(), "rule__GSSEnvironmentSpecialPacket__StatusAssignment_4");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameAssignment_8(), "rule__GSSEnvironmentSpecialPacket__NameAssignment_8");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdAssignment_12(), "rule__GSSEnvironmentSpecialPacket__IdAssignment_12");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefAssignment_16(), "rule__GSSEnvironmentSpecialPacket__IfRefAssignment_16");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsAssignment_20(), "rule__GSSEnvironmentSpecialPacket__LevelsAssignment_20");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefAssignment_24(), "rule__GSSEnvironmentSpecialPacket__LevelRefAssignment_24");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterAssignment_28(), "rule__GSSEnvironmentSpecialPacket__InputFilterAssignment_28");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsAssignment_30(), "rule__GSSEnvironmentSpecialPacket__UpperLevelsAssignment_30");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataAssignment_31(), "rule__GSSEnvironmentSpecialPacket__PrintingDataAssignment_31");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodAssignment_32_0(), "rule__GSSEnvironmentSpecialPacket__PeriodAssignment_32_0");
					put(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeAssignment_32_1(), "rule__GSSEnvironmentSpecialPacket__IntervalRangeAssignment_32_1");
					put(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelAssignment_2(), "rule__GSSEnvironmentUpperLevels__UpperLevelAssignment_2");
					put(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusAssignment_4(), "rule__GSSEnvironmentPrintingData__PrintStatusAssignment_4");
					put(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataAssignment_6(), "rule__GSSEnvironmentPrintingData__StructuredDataAssignment_6");
					put(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueAssignment_4(), "rule__GSSEnvironmentPeriod__Min_valueAssignment_4");
					put(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitAssignment_8(), "rule__GSSEnvironmentPeriod__Min_unitAssignment_8");
					put(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueAssignment_12(), "rule__GSSEnvironmentPeriod__Max_valueAssignment_12");
					put(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitAssignment_16(), "rule__GSSEnvironmentPeriod__Max_unitAssignment_16");
					put(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinAssignment_4(), "rule__GSSEnvironmentIntervalRange__MinAssignment_4");
					put(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxAssignment_8(), "rule__GSSEnvironmentIntervalRange__MaxAssignment_8");
					put(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueAssignment_12(), "rule__GSSEnvironmentIntervalRange__Interval_valueAssignment_12");
					put(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitAssignment_16(), "rule__GSSEnvironmentIntervalRange__Interval_unitAssignment_16");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelAssignment_4(), "rule__GSSEnvironmentUpperLevel__LevelAssignment_4");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatAssignment_6_2(), "rule__GSSEnvironmentUpperLevel__TMformatAssignment_6_2");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterAssignment_7_2(), "rule__GSSEnvironmentUpperLevel__InputFilterAssignment_7_2");
					put(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2(), "rule__GSSEnvironmentUpperLevel__Import_from_prev_LevelAssignment_8_2");
					put(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefAssignment_4(), "rule__GSSEnvironmentStructuredData__LevelRefAssignment_4");
					put(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldAssignment_8(), "rule__GSSEnvironmentStructuredData__FirstFieldAssignment_8");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameAssignment_4(), "rule__GSSEnvironmentPeriodicTCLevel2__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdAssignment_8(), "rule__GSSEnvironmentPeriodicTCLevel2__IdAssignment_8");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefAssignment_12(), "rule__GSSEnvironmentPeriodicTCLevel2__IfRefAssignment_12");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueAssignment_16(), "rule__GSSEnvironmentPeriodicTCLevel2__Period_valueAssignment_16");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitAssignment_20(), "rule__GSSEnvironmentPeriodicTCLevel2__Period_unitAssignment_20");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Assignment_22_2(), "rule__GSSEnvironmentPeriodicTCLevel2__Level2Assignment_22_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Assignment_25(), "rule__GSSEnvironmentPeriodicTCLevel2__App_to_level2Assignment_25");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Assignment_27_2(), "rule__GSSEnvironmentPeriodicTCLevel2__Level1Assignment_27_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2(), "rule__GSSEnvironmentPeriodicTCLevel2__Level2_to_level1Assignment_28_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Assignment_29_2(), "rule__GSSEnvironmentPeriodicTCLevel2__Level0Assignment_29_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2(), "rule__GSSEnvironmentPeriodicTCLevel2__Level1_to_level0Assignment_30_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameAssignment_4(), "rule__GSSEnvironmentPeriodicTCLevel1__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdAssignment_8(), "rule__GSSEnvironmentPeriodicTCLevel1__IdAssignment_8");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefAssignment_12(), "rule__GSSEnvironmentPeriodicTCLevel1__IfRefAssignment_12");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueAssignment_16(), "rule__GSSEnvironmentPeriodicTCLevel1__Period_valueAssignment_16");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitAssignment_20(), "rule__GSSEnvironmentPeriodicTCLevel1__Period_unitAssignment_20");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Assignment_22_2(), "rule__GSSEnvironmentPeriodicTCLevel1__Level1Assignment_22_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Assignment_25(), "rule__GSSEnvironmentPeriodicTCLevel1__App_to_level1Assignment_25");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Assignment_27_2(), "rule__GSSEnvironmentPeriodicTCLevel1__Level0Assignment_27_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2(), "rule__GSSEnvironmentPeriodicTCLevel1__Level1_to_level0Assignment_28_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameAssignment_4(), "rule__GSSEnvironmentPeriodicTCLevel0__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdAssignment_8(), "rule__GSSEnvironmentPeriodicTCLevel0__IdAssignment_8");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefAssignment_12(), "rule__GSSEnvironmentPeriodicTCLevel0__IfRefAssignment_12");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueAssignment_16(), "rule__GSSEnvironmentPeriodicTCLevel0__Period_valueAssignment_16");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitAssignment_20(), "rule__GSSEnvironmentPeriodicTCLevel0__Period_unitAssignment_20");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Assignment_22_2(), "rule__GSSEnvironmentPeriodicTCLevel0__Level0Assignment_22_2");
					put(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Assignment_25(), "rule__GSSEnvironmentPeriodicTCLevel0__App_to_level0Assignment_25");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameAssignment_4(), "rule__GSSEnvironmentGlobalVar__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdAssignment_8(), "rule__GSSEnvironmentGlobalVar__IdAssignment_8");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeAssignment_12(), "rule__GSSEnvironmentGlobalVar__TypeAssignment_12");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueAssignment_16(), "rule__GSSEnvironmentGlobalVar__Initial_valueAssignment_16");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldAssignment_18_0(), "rule__GSSEnvironmentGlobalVar__ReferenceFieldAssignment_18_0");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCAssignment_18_1(), "rule__GSSEnvironmentGlobalVar__ReferencePeriodicTCAssignment_18_1");
					put(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2(), "rule__GSSEnvironmentGlobalVar__ReferenceSpecialPacketAssignment_18_2");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeAssignment_4(), "rule__GSSEnvironmentReferenceField__TypeAssignment_4");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefAssignment_8(), "rule__GSSEnvironmentReferenceField__IfRefAssignment_8");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelAssignment_12(), "rule__GSSEnvironmentReferenceField__LevelAssignment_12");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefAssignment_16(), "rule__GSSEnvironmentReferenceField__FieldRefAssignment_16");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetAssignment_20(), "rule__GSSEnvironmentReferenceField__OffsetAssignment_20");
					put(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeAssignment_24(), "rule__GSSEnvironmentReferenceField__SizeAssignment_24");
					put(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefAssignment_4(), "rule__GSSEnvironmentReferencePeriodicTC__IdRefAssignment_4");
					put(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelAssignment_8(), "rule__GSSEnvironmentReferencePeriodicTC__LevelAssignment_8");
					put(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefAssignment_12(), "rule__GSSEnvironmentReferencePeriodicTC__FieldRefAssignment_12");
					put(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetAssignment_16(), "rule__GSSEnvironmentReferencePeriodicTC__OffsetAssignment_16");
					put(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeAssignment_20(), "rule__GSSEnvironmentReferencePeriodicTC__SizeAssignment_20");
					put(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefAssignment_4(), "rule__GSSEnvironmentReferenceSpecialPacket__IdRefAssignment_4");
					put(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelAssignment_8(), "rule__GSSEnvironmentReferenceSpecialPacket__LevelAssignment_8");
					put(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefAssignment_12(), "rule__GSSEnvironmentReferenceSpecialPacket__FieldRefAssignment_12");
					put(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetAssignment_16(), "rule__GSSEnvironmentReferenceSpecialPacket__OffsetAssignment_16");
					put(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeAssignment_20(), "rule__GSSEnvironmentReferenceSpecialPacket__SizeAssignment_20");
					put(grammarAccess.getGSSEnvironmentPlotAccess().getNameAssignment_4(), "rule__GSSEnvironmentPlot__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefAssignment_8(), "rule__GSSEnvironmentPlot__ChartRefAssignment_8");
					put(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredAssignment_10_0(), "rule__GSSEnvironmentPlot__GVFilteredAssignment_10_0");
					put(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicAssignment_10_1(), "rule__GSSEnvironmentPlot__GVPeriodicAssignment_10_1");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameAssignment_4(), "rule__GSSEnvironmentAlarmMsg__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeAssignment_8(), "rule__GSSEnvironmentAlarmMsg__TypeAssignment_8");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextAssignment_12(), "rule__GSSEnvironmentAlarmMsg__TextAssignment_12");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredAssignment_14_0(), "rule__GSSEnvironmentAlarmMsg__GVFilteredAssignment_14_0");
					put(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicAssignment_14_1(), "rule__GSSEnvironmentAlarmMsg__GVPeriodicAssignment_14_1");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getNameAssignment_4(), "rule__GSSEnvironmentModify__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getTypeAssignment_8(), "rule__GSSEnvironmentModify__TypeAssignment_8");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getValueAssignment_12(), "rule__GSSEnvironmentModify__ValueAssignment_12");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredAssignment_14_0(), "rule__GSSEnvironmentModify__GVFilteredAssignment_14_0");
					put(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicAssignment_14_1(), "rule__GSSEnvironmentModify__GVPeriodicAssignment_14_1");
					put(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameAssignment_4(), "rule__GSSEnvironmentAlarmVal__NameAssignment_4");
					put(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeAssignment_8(), "rule__GSSEnvironmentAlarmVal__TypeAssignment_8");
					put(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredAssignment_10_0(), "rule__GSSEnvironmentAlarmVal__GVFilteredAssignment_10_0");
					put(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicAssignment_10_1(), "rule__GSSEnvironmentAlarmVal__GVPeriodicAssignment_10_1");
					put(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefAssignment_4(), "rule__GSSEnvironmentGVFiltered__GlobalVarRefAssignment_4");
					put(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterAssignment_6_2(), "rule__GSSEnvironmentGVFiltered__FilterAssignment_6_2");
					put(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefAssignment_4(), "rule__GSSEnvironmentGVPeriodic__GlobalVarRefAssignment_4");
					put(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueAssignment_8(), "rule__GSSEnvironmentGVPeriodic__Period_valueAssignment_8");
					put(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitAssignment_12(), "rule__GSSEnvironmentGVPeriodic__Period_unitAssignment_12");
					put(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12(), "rule__GSSEnvironmentScenario__UnorderedGroup_12");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalENVIRONMENTParser typedParser = (InternalENVIRONMENTParser) parser;
			typedParser.entryRuleGSSModelFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ENVIRONMENTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ENVIRONMENTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
