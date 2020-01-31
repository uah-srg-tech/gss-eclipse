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
package es.uah.aut.srg.gss.lang.config.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.config.ide.contentassist.antlr.internal.InternalCONFIGParser;
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class CONFIGParser extends AbstractContentAssistParser {

	@Inject
	private CONFIGGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCONFIGParser createParser() {
		InternalCONFIGParser result = new InternalCONFIGParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSScenarioPeriodicTCsAccess().getAlternatives_3(), "rule__GSSScenarioPeriodicTCs__Alternatives_3");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getAlternatives_3(), "rule__GSSScenarioMonitors__Alternatives_3");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getAlternatives_23(), "rule__GSSScenarioInterface__Alternatives_23");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getAlternatives_32(), "rule__GSSScenarioSpecialPacket__Alternatives_32");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getAlternatives_18(), "rule__GSSScenarioGlobalVar__Alternatives_18");
					put(grammarAccess.getGSSScenarioPlotAccess().getAlternatives_10(), "rule__GSSScenarioPlot__Alternatives_10");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getAlternatives_14(), "rule__GSSScenarioAlarmMsg__Alternatives_14");
					put(grammarAccess.getGSSScenarioModifyAccess().getAlternatives_14(), "rule__GSSScenarioModify__Alternatives_14");
					put(grammarAccess.getGSSScenarioAlarmValAccess().getAlternatives_10(), "rule__GSSScenarioAlarmVal__Alternatives_10");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSScenarioEnableDisableAccess().getAlternatives(), "rule__GSSScenarioEnableDisable__Alternatives");
					put(grammarAccess.getGSSScenarioInterfaceTypeAccess().getAlternatives(), "rule__GSSScenarioInterfaceType__Alternatives");
					put(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getAlternatives(), "rule__GSSScenarioInterfaceIOType__Alternatives");
					put(grammarAccess.getGSSScenarioUpperLevelLevelAccess().getAlternatives(), "rule__GSSScenarioUpperLevelLevel__Alternatives");
					put(grammarAccess.getGSSScenarioUnitAccess().getAlternatives(), "rule__GSSScenarioUnit__Alternatives");
					put(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getAlternatives(), "rule__GSSScenarioGlobalVarType__Alternatives");
					put(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getAlternatives(), "rule__GSSScenarioReferenceFieldType__Alternatives");
					put(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlternatives(), "rule__GSSScenarioAlarmMsgType__Alternatives");
					put(grammarAccess.getGSSScenarioModifyTypeAccess().getAlternatives(), "rule__GSSScenarioModifyType__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getGroup(), "rule__GSSConfigGSSConfig__Group__0");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getGroup_3(), "rule__GSSConfigGSSConfig__Group_3__0");
					put(grammarAccess.getGSSScenarioScenarioAccess().getGroup(), "rule__GSSScenarioScenario__Group__0");
					put(grammarAccess.getGSSScenarioOptionsAccess().getGroup(), "rule__GSSScenarioOptions__Group__0");
					put(grammarAccess.getGSSScenarioProtocolsAccess().getGroup(), "rule__GSSScenarioProtocols__Group__0");
					put(grammarAccess.getGSSScenarioInterfacesAccess().getGroup(), "rule__GSSScenarioInterfaces__Group__0");
					put(grammarAccess.getGSSScenarioInterfacesAccess().getGroup_2(), "rule__GSSScenarioInterfaces__Group_2__0");
					put(grammarAccess.getGSSScenarioSpecialPacketsAccess().getGroup(), "rule__GSSScenarioSpecialPackets__Group__0");
					put(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGroup(), "rule__GSSScenarioPeriodicTCs__Group__0");
					put(grammarAccess.getGSSScenarioGlobalVarsAccess().getGroup(), "rule__GSSScenarioGlobalVars__Group__0");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getGroup(), "rule__GSSScenarioMonitors__Group__0");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getGroup_2(), "rule__GSSScenarioMonitors__Group_2__0");
					put(grammarAccess.getGSSScenarioGSSInfoAccess().getGroup(), "rule__GSSScenarioGSSInfo__Group__0");
					put(grammarAccess.getGSSScenarioGSSInfoAccess().getGroup_14(), "rule__GSSScenarioGSSInfo__Group_14__0");
					put(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGroup(), "rule__GSSScenarioGSSInfoPrint__Group__0");
					put(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGroup(), "rule__GSSScenarioPhyHeaderPrint__Group__0");
					put(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGroup(), "rule__GSSScenarioGSSDiscardErrorFlags__Group__0");
					put(grammarAccess.getGSSScenarioProtocolAccess().getGroup(), "rule__GSSScenarioProtocol__Group__0");
					put(grammarAccess.getGSSScenarioProtocolTypeAccess().getGroup(), "rule__GSSScenarioProtocolType__Group__0");
					put(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGroup(), "rule__GSSScenarioProtocolSubtype__Group__0");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getGroup(), "rule__GSSScenarioMainInterface__Group__0");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getGroup_22(), "rule__GSSScenarioMainInterface__Group_22__0");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getGroup(), "rule__GSSScenarioInterface__Group__0");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getGroup_22(), "rule__GSSScenarioInterface__Group_22__0");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup(), "rule__GSSScenarioLevelInOut__Group__0");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup_22(), "rule__GSSScenarioLevelInOut__Group_22__0");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup_23(), "rule__GSSScenarioLevelInOut__Group_23__0");
					put(grammarAccess.getGSSScenarioLevelInAccess().getGroup(), "rule__GSSScenarioLevelIn__Group__0");
					put(grammarAccess.getGSSScenarioLevelInAccess().getGroup_14(), "rule__GSSScenarioLevelIn__Group_14__0");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getGroup(), "rule__GSSScenarioLevelOut__Group__0");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getGroup_18(), "rule__GSSScenarioLevelOut__Group_18__0");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getGroup(), "rule__GSSScenarioSpecialPacket__Group__0");
					put(grammarAccess.getGSSScenarioUpperLevelsAccess().getGroup(), "rule__GSSScenarioUpperLevels__Group__0");
					put(grammarAccess.getGSSScenarioPrintingDataAccess().getGroup(), "rule__GSSScenarioPrintingData__Group__0");
					put(grammarAccess.getGSSScenarioPeriodAccess().getGroup(), "rule__GSSScenarioPeriod__Group__0");
					put(grammarAccess.getGSSScenarioIntervalRangeAccess().getGroup(), "rule__GSSScenarioIntervalRange__Group__0");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup(), "rule__GSSScenarioUpperLevel__Group__0");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_6(), "rule__GSSScenarioUpperLevel__Group_6__0");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_7(), "rule__GSSScenarioUpperLevel__Group_7__0");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_8(), "rule__GSSScenarioUpperLevel__Group_8__0");
					put(grammarAccess.getGSSScenarioStructuredDataAccess().getGroup(), "rule__GSSScenarioStructuredData__Group__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup(), "rule__GSSScenarioPeriodicTCLevel2__Group__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_22(), "rule__GSSScenarioPeriodicTCLevel2__Group_22__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_27(), "rule__GSSScenarioPeriodicTCLevel2__Group_27__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_28(), "rule__GSSScenarioPeriodicTCLevel2__Group_28__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_29(), "rule__GSSScenarioPeriodicTCLevel2__Group_29__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_30(), "rule__GSSScenarioPeriodicTCLevel2__Group_30__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup(), "rule__GSSScenarioPeriodicTCLevel1__Group__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_22(), "rule__GSSScenarioPeriodicTCLevel1__Group_22__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_27(), "rule__GSSScenarioPeriodicTCLevel1__Group_27__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_28(), "rule__GSSScenarioPeriodicTCLevel1__Group_28__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGroup(), "rule__GSSScenarioPeriodicTCLevel0__Group__0");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGroup_22(), "rule__GSSScenarioPeriodicTCLevel0__Group_22__0");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getGroup(), "rule__GSSScenarioGlobalVar__Group__0");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getGroup(), "rule__GSSScenarioReferenceField__Group__0");
					put(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGroup(), "rule__GSSScenarioReferencePeriodicTC__Group__0");
					put(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGroup(), "rule__GSSScenarioReferenceSpecialPacket__Group__0");
					put(grammarAccess.getGSSScenarioPlotAccess().getGroup(), "rule__GSSScenarioPlot__Group__0");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getGroup(), "rule__GSSScenarioAlarmMsg__Group__0");
					put(grammarAccess.getGSSScenarioModifyAccess().getGroup(), "rule__GSSScenarioModify__Group__0");
					put(grammarAccess.getGSSScenarioAlarmValAccess().getGroup(), "rule__GSSScenarioAlarmVal__Group__0");
					put(grammarAccess.getGSSScenarioGVFilteredAccess().getGroup(), "rule__GSSScenarioGVFiltered__Group__0");
					put(grammarAccess.getGSSScenarioGVFilteredAccess().getGroup_6(), "rule__GSSScenarioGVFiltered__Group_6__0");
					put(grammarAccess.getGSSScenarioGVPeriodicAccess().getGroup(), "rule__GSSScenarioGVPeriodic__Group__0");
					put(grammarAccess.getGSSConfigTestsAccess().getGroup(), "rule__GSSConfigTests__Group__0");
					put(grammarAccess.getGSSConfigTestCaseAccess().getGroup(), "rule__GSSConfigTestCase__Group__0");
					put(grammarAccess.getGSSConfigTestCaseAccess().getGroup_10(), "rule__GSSConfigTestCase__Group_10__0");
					put(grammarAccess.getGSSConfigTestCaseAccess().getGroup_11(), "rule__GSSConfigTestCase__Group_11__0");
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
					put(grammarAccess.getGSSConfigGSSConfigAccess().getNameAssignment_1(), "rule__GSSConfigGSSConfig__NameAssignment_1");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getUriAssignment_3_2(), "rule__GSSConfigGSSConfig__UriAssignment_3_2");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getVersionAssignment_6(), "rule__GSSConfigGSSConfig__VersionAssignment_6");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioAssignment_8(), "rule__GSSConfigGSSConfig__ScenarioAssignment_8");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getTestsAssignment_9(), "rule__GSSConfigGSSConfig__TestsAssignment_9");
					put(grammarAccess.getGSSScenarioScenarioAccess().getNameAssignment_1(), "rule__GSSScenarioScenario__NameAssignment_1");
					put(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsAssignment_3(), "rule__GSSScenarioScenario__Gss_optionsAssignment_3");
					put(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsAssignment_4(), "rule__GSSScenarioScenario__ProtocolsAssignment_4");
					put(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesAssignment_5(), "rule__GSSScenarioScenario__InterfacesAssignment_5");
					put(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsAssignment_6(), "rule__GSSScenarioScenario__SpecialPacketsAssignment_6");
					put(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsAssignment_7(), "rule__GSSScenarioScenario__PeriodicTCsAssignment_7");
					put(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsAssignment_8_0(), "rule__GSSScenarioScenario__GlobalVarsAssignment_8_0");
					put(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsAssignment_8_1(), "rule__GSSScenarioScenario__MonitorsAssignment_8_1");
					put(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoAssignment_2(), "rule__GSSScenarioOptions__Gss_infoAssignment_2");
					put(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printAssignment_3(), "rule__GSSScenarioOptions__Gss_info_printAssignment_3");
					put(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printAssignment_4(), "rule__GSSScenarioOptions__Phy_header_printAssignment_4");
					put(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsAssignment_5(), "rule__GSSScenarioOptions__DiscardErrorFlagsAssignment_5");
					put(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolAssignment_3(), "rule__GSSScenarioProtocols__ProtocolAssignment_3");
					put(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileAssignment_2_2(), "rule__GSSScenarioInterfaces__ProtocolPacketsFileAssignment_2_2");
					put(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceAssignment_3(), "rule__GSSScenarioInterfaces__MainInterfaceAssignment_3");
					put(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceAssignment_4(), "rule__GSSScenarioInterfaces__InterfaceAssignment_4");
					put(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketAssignment_2(), "rule__GSSScenarioSpecialPackets__SpecialPacketAssignment_2");
					put(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0(), "rule__GSSScenarioPeriodicTCs__PeriodicTC_level_2Assignment_3_0");
					put(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1(), "rule__GSSScenarioPeriodicTCs__PeriodicTC_level_1Assignment_3_1");
					put(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2(), "rule__GSSScenarioPeriodicTCs__PeriodicTC_level_0Assignment_3_2");
					put(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarAssignment_2(), "rule__GSSScenarioGlobalVars__GlobalVarAssignment_2");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileAssignment_2_2(), "rule__GSSScenarioMonitors__ChartsFileAssignment_2_2");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getPlotAssignment_3_0(), "rule__GSSScenarioMonitors__PlotAssignment_3_0");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getAlarmMsgAssignment_3_1(), "rule__GSSScenarioMonitors__AlarmMsgAssignment_3_1");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getModifyAssignment_3_2(), "rule__GSSScenarioMonitors__ModifyAssignment_3_2");
					put(grammarAccess.getGSSScenarioMonitorsAccess().getAlarmValAssignment_3_3(), "rule__GSSScenarioMonitors__AlarmValAssignment_3_3");
					put(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignAssignment_4(), "rule__GSSScenarioGSSInfo__Test_campaignAssignment_4");
					put(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionAssignment_8(), "rule__GSSScenarioGSSInfo__VersionAssignment_8");
					put(grammarAccess.getGSSScenarioGSSInfoAccess().getDateAssignment_12(), "rule__GSSScenarioGSSInfo__DateAssignment_12");
					put(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlAssignment_14_2(), "rule__GSSScenarioGSSInfo__Version_control_urlAssignment_14_2");
					put(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogAssignment_4(), "rule__GSSScenarioGSSInfoPrint__MainLogAssignment_4");
					put(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsAssignment_8(), "rule__GSSScenarioGSSInfoPrint__PortLogsAssignment_8");
					put(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogAssignment_12(), "rule__GSSScenarioGSSInfoPrint__RawLogAssignment_12");
					put(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogAssignment_4(), "rule__GSSScenarioPhyHeaderPrint__MainLogAssignment_4");
					put(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsAssignment_8(), "rule__GSSScenarioPhyHeaderPrint__PortLogsAssignment_8");
					put(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogAssignment_12(), "rule__GSSScenarioPhyHeaderPrint__RawLogAssignment_12");
					put(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsAssignment_16(), "rule__GSSScenarioPhyHeaderPrint__GssTabsAssignment_16");
					put(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4(), "rule__GSSScenarioGSSDiscardErrorFlags__TxErrorsAssignment_4");
					put(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8(), "rule__GSSScenarioGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8");
					put(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12(), "rule__GSSScenarioGSSDiscardErrorFlags__FiltersKoAssignment_12");
					put(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16(), "rule__GSSScenarioGSSDiscardErrorFlags__ValidTimesKoAssignment_16");
					put(grammarAccess.getGSSScenarioProtocolAccess().getIdAssignment_4(), "rule__GSSScenarioProtocol__IdAssignment_4");
					put(grammarAccess.getGSSScenarioProtocolAccess().getNameAssignment_8(), "rule__GSSScenarioProtocol__NameAssignment_8");
					put(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelAssignment_12(), "rule__GSSScenarioProtocol__TypeLevelAssignment_12");
					put(grammarAccess.getGSSScenarioProtocolAccess().getTypeAssignment_14(), "rule__GSSScenarioProtocol__TypeAssignment_14");
					put(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeAssignment_15(), "rule__GSSScenarioProtocol__SubtypeAssignment_15");
					put(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameAssignment_4(), "rule__GSSScenarioProtocolType__NameAssignment_4");
					put(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetAssignment_8(), "rule__GSSScenarioProtocolType__OffsetAssignment_8");
					put(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameAssignment_4(), "rule__GSSScenarioProtocolSubtype__NameAssignment_4");
					put(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetAssignment_8(), "rule__GSSScenarioProtocolSubtype__OffsetAssignment_8");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdAssignment_4(), "rule__GSSScenarioMainInterface__IdAssignment_4");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameAssignment_8(), "rule__GSSScenarioMainInterface__NameAssignment_8");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeAssignment_12(), "rule__GSSScenarioMainInterface__IfTypeAssignment_12");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigAssignment_16(), "rule__GSSScenarioMainInterface__IfConfigAssignment_16");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeAssignment_20(), "rule__GSSScenarioMainInterface__IoTypeAssignment_20");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDAssignment_22_2(), "rule__GSSScenarioMainInterface__ProtocolIDAssignment_22_2");
					put(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutAssignment_23(), "rule__GSSScenarioMainInterface__LevelInOutAssignment_23");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getIdAssignment_4(), "rule__GSSScenarioInterface__IdAssignment_4");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getNameAssignment_8(), "rule__GSSScenarioInterface__NameAssignment_8");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeAssignment_12(), "rule__GSSScenarioInterface__IfTypeAssignment_12");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigAssignment_16(), "rule__GSSScenarioInterface__IfConfigAssignment_16");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeAssignment_20(), "rule__GSSScenarioInterface__IoTypeAssignment_20");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDAssignment_22_2(), "rule__GSSScenarioInterface__ProtocolIDAssignment_22_2");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutAssignment_23_0(), "rule__GSSScenarioInterface__LevelInOutAssignment_23_0");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInAssignment_23_1(), "rule__GSSScenarioInterface__LevelInAssignment_23_1");
					put(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutAssignment_23_2(), "rule__GSSScenarioInterface__LevelOutAssignment_23_2");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getIdAssignment_4(), "rule__GSSScenarioLevelInOut__IdAssignment_4");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getNameAssignment_8(), "rule__GSSScenarioLevelInOut__NameAssignment_8");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatAssignment_12(), "rule__GSSScenarioLevelInOut__TMformatAssignment_12");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatAssignment_16(), "rule__GSSScenarioLevelInOut__TCformatAssignment_16");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterAssignment_20(), "rule__GSSScenarioLevelInOut__InputFilterAssignment_20");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2(), "rule__GSSScenarioLevelInOut__Export_to_prev_LevelAssignment_22_2");
					put(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2(), "rule__GSSScenarioLevelInOut__Import_from_prev_LevelAssignment_23_2");
					put(grammarAccess.getGSSScenarioLevelInAccess().getIdAssignment_4(), "rule__GSSScenarioLevelIn__IdAssignment_4");
					put(grammarAccess.getGSSScenarioLevelInAccess().getNameAssignment_8(), "rule__GSSScenarioLevelIn__NameAssignment_8");
					put(grammarAccess.getGSSScenarioLevelInAccess().getTCformatAssignment_12(), "rule__GSSScenarioLevelIn__TCformatAssignment_12");
					put(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelAssignment_14_2(), "rule__GSSScenarioLevelIn__Export_to_prev_LevelAssignment_14_2");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getIdAssignment_4(), "rule__GSSScenarioLevelOut__IdAssignment_4");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getNameAssignment_8(), "rule__GSSScenarioLevelOut__NameAssignment_8");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatAssignment_12(), "rule__GSSScenarioLevelOut__TMformatAssignment_12");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterAssignment_16(), "rule__GSSScenarioLevelOut__InputFilterAssignment_16");
					put(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelAssignment_18_2(), "rule__GSSScenarioLevelOut__Import_from_prev_LevelAssignment_18_2");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusAssignment_4(), "rule__GSSScenarioSpecialPacket__StatusAssignment_4");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameAssignment_8(), "rule__GSSScenarioSpecialPacket__NameAssignment_8");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdAssignment_12(), "rule__GSSScenarioSpecialPacket__IdAssignment_12");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefAssignment_16(), "rule__GSSScenarioSpecialPacket__IfRefAssignment_16");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsAssignment_20(), "rule__GSSScenarioSpecialPacket__LevelsAssignment_20");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefAssignment_24(), "rule__GSSScenarioSpecialPacket__LevelRefAssignment_24");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterAssignment_28(), "rule__GSSScenarioSpecialPacket__InputFilterAssignment_28");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsAssignment_30(), "rule__GSSScenarioSpecialPacket__UpperLevelsAssignment_30");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataAssignment_31(), "rule__GSSScenarioSpecialPacket__PrintingDataAssignment_31");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodAssignment_32_0(), "rule__GSSScenarioSpecialPacket__PeriodAssignment_32_0");
					put(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeAssignment_32_1(), "rule__GSSScenarioSpecialPacket__IntervalRangeAssignment_32_1");
					put(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelAssignment_2(), "rule__GSSScenarioUpperLevels__UpperLevelAssignment_2");
					put(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusAssignment_4(), "rule__GSSScenarioPrintingData__PrintStatusAssignment_4");
					put(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataAssignment_6(), "rule__GSSScenarioPrintingData__StructuredDataAssignment_6");
					put(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueAssignment_4(), "rule__GSSScenarioPeriod__Min_valueAssignment_4");
					put(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitAssignment_8(), "rule__GSSScenarioPeriod__Min_unitAssignment_8");
					put(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueAssignment_12(), "rule__GSSScenarioPeriod__Max_valueAssignment_12");
					put(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitAssignment_16(), "rule__GSSScenarioPeriod__Max_unitAssignment_16");
					put(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinAssignment_4(), "rule__GSSScenarioIntervalRange__MinAssignment_4");
					put(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxAssignment_8(), "rule__GSSScenarioIntervalRange__MaxAssignment_8");
					put(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueAssignment_12(), "rule__GSSScenarioIntervalRange__Interval_valueAssignment_12");
					put(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitAssignment_16(), "rule__GSSScenarioIntervalRange__Interval_unitAssignment_16");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelAssignment_4(), "rule__GSSScenarioUpperLevel__LevelAssignment_4");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatAssignment_6_2(), "rule__GSSScenarioUpperLevel__TMformatAssignment_6_2");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterAssignment_7_2(), "rule__GSSScenarioUpperLevel__InputFilterAssignment_7_2");
					put(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2(), "rule__GSSScenarioUpperLevel__Import_from_prev_LevelAssignment_8_2");
					put(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefAssignment_4(), "rule__GSSScenarioStructuredData__LevelRefAssignment_4");
					put(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldAssignment_8(), "rule__GSSScenarioStructuredData__FirstFieldAssignment_8");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameAssignment_4(), "rule__GSSScenarioPeriodicTCLevel2__NameAssignment_4");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdAssignment_8(), "rule__GSSScenarioPeriodicTCLevel2__IdAssignment_8");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefAssignment_12(), "rule__GSSScenarioPeriodicTCLevel2__IfRefAssignment_12");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueAssignment_16(), "rule__GSSScenarioPeriodicTCLevel2__Period_valueAssignment_16");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitAssignment_20(), "rule__GSSScenarioPeriodicTCLevel2__Period_unitAssignment_20");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Assignment_22_2(), "rule__GSSScenarioPeriodicTCLevel2__Level2Assignment_22_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Assignment_25(), "rule__GSSScenarioPeriodicTCLevel2__App_to_level2Assignment_25");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Assignment_27_2(), "rule__GSSScenarioPeriodicTCLevel2__Level1Assignment_27_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2(), "rule__GSSScenarioPeriodicTCLevel2__Level2_to_level1Assignment_28_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Assignment_29_2(), "rule__GSSScenarioPeriodicTCLevel2__Level0Assignment_29_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2(), "rule__GSSScenarioPeriodicTCLevel2__Level1_to_level0Assignment_30_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameAssignment_4(), "rule__GSSScenarioPeriodicTCLevel1__NameAssignment_4");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdAssignment_8(), "rule__GSSScenarioPeriodicTCLevel1__IdAssignment_8");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefAssignment_12(), "rule__GSSScenarioPeriodicTCLevel1__IfRefAssignment_12");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueAssignment_16(), "rule__GSSScenarioPeriodicTCLevel1__Period_valueAssignment_16");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitAssignment_20(), "rule__GSSScenarioPeriodicTCLevel1__Period_unitAssignment_20");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Assignment_22_2(), "rule__GSSScenarioPeriodicTCLevel1__Level1Assignment_22_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Assignment_25(), "rule__GSSScenarioPeriodicTCLevel1__App_to_level1Assignment_25");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Assignment_27_2(), "rule__GSSScenarioPeriodicTCLevel1__Level0Assignment_27_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2(), "rule__GSSScenarioPeriodicTCLevel1__Level1_to_level0Assignment_28_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameAssignment_4(), "rule__GSSScenarioPeriodicTCLevel0__NameAssignment_4");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdAssignment_8(), "rule__GSSScenarioPeriodicTCLevel0__IdAssignment_8");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefAssignment_12(), "rule__GSSScenarioPeriodicTCLevel0__IfRefAssignment_12");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueAssignment_16(), "rule__GSSScenarioPeriodicTCLevel0__Period_valueAssignment_16");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitAssignment_20(), "rule__GSSScenarioPeriodicTCLevel0__Period_unitAssignment_20");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Assignment_22_2(), "rule__GSSScenarioPeriodicTCLevel0__Level0Assignment_22_2");
					put(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Assignment_25(), "rule__GSSScenarioPeriodicTCLevel0__App_to_level0Assignment_25");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getNameAssignment_4(), "rule__GSSScenarioGlobalVar__NameAssignment_4");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getIdAssignment_8(), "rule__GSSScenarioGlobalVar__IdAssignment_8");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeAssignment_12(), "rule__GSSScenarioGlobalVar__TypeAssignment_12");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueAssignment_16(), "rule__GSSScenarioGlobalVar__Initial_valueAssignment_16");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceFieldAssignment_18_0(), "rule__GSSScenarioGlobalVar__ReferenceFieldAssignment_18_0");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getReferencePeriodicTCAssignment_18_1(), "rule__GSSScenarioGlobalVar__ReferencePeriodicTCAssignment_18_1");
					put(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2(), "rule__GSSScenarioGlobalVar__ReferenceSpecialPacketAssignment_18_2");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeAssignment_4(), "rule__GSSScenarioReferenceField__TypeAssignment_4");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefAssignment_8(), "rule__GSSScenarioReferenceField__IfRefAssignment_8");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelAssignment_12(), "rule__GSSScenarioReferenceField__LevelAssignment_12");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefAssignment_16(), "rule__GSSScenarioReferenceField__FieldRefAssignment_16");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetAssignment_20(), "rule__GSSScenarioReferenceField__OffsetAssignment_20");
					put(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeAssignment_24(), "rule__GSSScenarioReferenceField__SizeAssignment_24");
					put(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefAssignment_4(), "rule__GSSScenarioReferencePeriodicTC__IdRefAssignment_4");
					put(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelAssignment_8(), "rule__GSSScenarioReferencePeriodicTC__LevelAssignment_8");
					put(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefAssignment_12(), "rule__GSSScenarioReferencePeriodicTC__FieldRefAssignment_12");
					put(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetAssignment_16(), "rule__GSSScenarioReferencePeriodicTC__OffsetAssignment_16");
					put(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeAssignment_20(), "rule__GSSScenarioReferencePeriodicTC__SizeAssignment_20");
					put(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefAssignment_4(), "rule__GSSScenarioReferenceSpecialPacket__IdRefAssignment_4");
					put(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelAssignment_8(), "rule__GSSScenarioReferenceSpecialPacket__LevelAssignment_8");
					put(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefAssignment_12(), "rule__GSSScenarioReferenceSpecialPacket__FieldRefAssignment_12");
					put(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetAssignment_16(), "rule__GSSScenarioReferenceSpecialPacket__OffsetAssignment_16");
					put(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeAssignment_20(), "rule__GSSScenarioReferenceSpecialPacket__SizeAssignment_20");
					put(grammarAccess.getGSSScenarioPlotAccess().getNameAssignment_4(), "rule__GSSScenarioPlot__NameAssignment_4");
					put(grammarAccess.getGSSScenarioPlotAccess().getChartRefAssignment_8(), "rule__GSSScenarioPlot__ChartRefAssignment_8");
					put(grammarAccess.getGSSScenarioPlotAccess().getGVFilteredAssignment_10_0(), "rule__GSSScenarioPlot__GVFilteredAssignment_10_0");
					put(grammarAccess.getGSSScenarioPlotAccess().getGVPeriodicAssignment_10_1(), "rule__GSSScenarioPlot__GVPeriodicAssignment_10_1");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameAssignment_4(), "rule__GSSScenarioAlarmMsg__NameAssignment_4");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeAssignment_8(), "rule__GSSScenarioAlarmMsg__TypeAssignment_8");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextAssignment_12(), "rule__GSSScenarioAlarmMsg__TextAssignment_12");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVFilteredAssignment_14_0(), "rule__GSSScenarioAlarmMsg__GVFilteredAssignment_14_0");
					put(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVPeriodicAssignment_14_1(), "rule__GSSScenarioAlarmMsg__GVPeriodicAssignment_14_1");
					put(grammarAccess.getGSSScenarioModifyAccess().getNameAssignment_4(), "rule__GSSScenarioModify__NameAssignment_4");
					put(grammarAccess.getGSSScenarioModifyAccess().getTypeAssignment_8(), "rule__GSSScenarioModify__TypeAssignment_8");
					put(grammarAccess.getGSSScenarioModifyAccess().getValueAssignment_12(), "rule__GSSScenarioModify__ValueAssignment_12");
					put(grammarAccess.getGSSScenarioModifyAccess().getGVFilteredAssignment_14_0(), "rule__GSSScenarioModify__GVFilteredAssignment_14_0");
					put(grammarAccess.getGSSScenarioModifyAccess().getGVPeriodicAssignment_14_1(), "rule__GSSScenarioModify__GVPeriodicAssignment_14_1");
					put(grammarAccess.getGSSScenarioAlarmValAccess().getNameAssignment_4(), "rule__GSSScenarioAlarmVal__NameAssignment_4");
					put(grammarAccess.getGSSScenarioAlarmValAccess().getTypeAssignment_8(), "rule__GSSScenarioAlarmVal__TypeAssignment_8");
					put(grammarAccess.getGSSScenarioAlarmValAccess().getGVFilteredAssignment_10_0(), "rule__GSSScenarioAlarmVal__GVFilteredAssignment_10_0");
					put(grammarAccess.getGSSScenarioAlarmValAccess().getGVPeriodicAssignment_10_1(), "rule__GSSScenarioAlarmVal__GVPeriodicAssignment_10_1");
					put(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefAssignment_4(), "rule__GSSScenarioGVFiltered__GlobalVarRefAssignment_4");
					put(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterAssignment_6_2(), "rule__GSSScenarioGVFiltered__FilterAssignment_6_2");
					put(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefAssignment_4(), "rule__GSSScenarioGVPeriodic__GlobalVarRefAssignment_4");
					put(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueAssignment_8(), "rule__GSSScenarioGVPeriodic__Period_valueAssignment_8");
					put(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitAssignment_12(), "rule__GSSScenarioGVPeriodic__Period_unitAssignment_12");
					put(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_2(), "rule__GSSConfigTests__TestCaseAssignment_2");
					put(grammarAccess.getGSSConfigTestCaseAccess().getNameAssignment_4(), "rule__GSSConfigTestCase__NameAssignment_4");
					put(grammarAccess.getGSSConfigTestCaseAccess().getProcedureAssignment_8(), "rule__GSSConfigTestCase__ProcedureAssignment_8");
					put(grammarAccess.getGSSConfigTestCaseAccess().getReqAssignment_10_1(), "rule__GSSConfigTestCase__ReqAssignment_10_1");
					put(grammarAccess.getGSSConfigTestCaseAccess().getReqActionAssignment_11_1(), "rule__GSSConfigTestCase__ReqActionAssignment_11_1");
					put(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), "rule__GSSScenarioScenario__UnorderedGroup_8");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalCONFIGParser typedParser = (InternalCONFIGParser) parser;
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

	public CONFIGGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CONFIGGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
