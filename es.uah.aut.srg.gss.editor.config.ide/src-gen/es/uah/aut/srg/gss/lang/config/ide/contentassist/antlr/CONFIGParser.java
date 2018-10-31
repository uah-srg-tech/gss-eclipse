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
					put(grammarAccess.getGSSConfigPeriodicTCsAccess().getAlternatives_3(), "rule__GSSConfigPeriodicTCs__Alternatives_3");
					put(grammarAccess.getGSSConfigMonitorsAccess().getAlternatives_3(), "rule__GSSConfigMonitors__Alternatives_3");
					put(grammarAccess.getGSSConfigInterfaceAccess().getAlternatives_23(), "rule__GSSConfigInterface__Alternatives_23");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getAlternatives_32(), "rule__GSSConfigSpecialPacket__Alternatives_32");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getAlternatives_18(), "rule__GSSConfigGlobalVar__Alternatives_18");
					put(grammarAccess.getGSSConfigPlotAccess().getAlternatives_6(), "rule__GSSConfigPlot__Alternatives_6");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getAlternatives_14(), "rule__GSSConfigAlarmMsg__Alternatives_14");
					put(grammarAccess.getGSSConfigModifyAccess().getAlternatives_14(), "rule__GSSConfigModify__Alternatives_14");
					put(grammarAccess.getGSSConfigAlarmValAccess().getAlternatives_10(), "rule__GSSConfigAlarmVal__Alternatives_10");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSConfigEnableDisableAccess().getAlternatives(), "rule__GSSConfigEnableDisable__Alternatives");
					put(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getAlternatives(), "rule__GSSConfigMainInterfaceType__Alternatives");
					put(grammarAccess.getGSSConfigInterfaceTypeAccess().getAlternatives(), "rule__GSSConfigInterfaceType__Alternatives");
					put(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getAlternatives(), "rule__GSSConfigInterfaceIOType__Alternatives");
					put(grammarAccess.getGSSConfigUpperLevelLevelAccess().getAlternatives(), "rule__GSSConfigUpperLevelLevel__Alternatives");
					put(grammarAccess.getGSSConfigUnitAccess().getAlternatives(), "rule__GSSConfigUnit__Alternatives");
					put(grammarAccess.getGSSConfigGlobalVarTypeAccess().getAlternatives(), "rule__GSSConfigGlobalVarType__Alternatives");
					put(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getAlternatives(), "rule__GSSConfigReferenceFieldType__Alternatives");
					put(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlternatives(), "rule__GSSConfigAlarmMsgType__Alternatives");
					put(grammarAccess.getGSSConfigModifyTypeAccess().getAlternatives(), "rule__GSSConfigModifyType__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getGroup(), "rule__GSSConfigGSSConfig__Group__0");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getGroup_3(), "rule__GSSConfigGSSConfig__Group_3__0");
					put(grammarAccess.getGSSConfigGSSOptionsAccess().getGroup(), "rule__GSSConfigGSSOptions__Group__0");
					put(grammarAccess.getGSSConfigProtocolsAccess().getGroup(), "rule__GSSConfigProtocols__Group__0");
					put(grammarAccess.getGSSConfigInterfacesAccess().getGroup(), "rule__GSSConfigInterfaces__Group__0");
					put(grammarAccess.getGSSConfigSpecialPacketsAccess().getGroup(), "rule__GSSConfigSpecialPackets__Group__0");
					put(grammarAccess.getGSSConfigPeriodicTCsAccess().getGroup(), "rule__GSSConfigPeriodicTCs__Group__0");
					put(grammarAccess.getGSSConfigGlobalVarsAccess().getGroup(), "rule__GSSConfigGlobalVars__Group__0");
					put(grammarAccess.getGSSConfigMonitorsAccess().getGroup(), "rule__GSSConfigMonitors__Group__0");
					put(grammarAccess.getGSSConfigMonitorsAccess().getGroup_2(), "rule__GSSConfigMonitors__Group_2__0");
					put(grammarAccess.getGSSConfigTestsAccess().getGroup(), "rule__GSSConfigTests__Group__0");
					put(grammarAccess.getGSSConfigTestsAccess().getGroup_2(), "rule__GSSConfigTests__Group_2__0");
					put(grammarAccess.getGSSConfigGSSInfoAccess().getGroup(), "rule__GSSConfigGSSInfo__Group__0");
					put(grammarAccess.getGSSConfigGSSInfoAccess().getGroup_14(), "rule__GSSConfigGSSInfo__Group_14__0");
					put(grammarAccess.getGSSConfigGSSInfoPrintAccess().getGroup(), "rule__GSSConfigGSSInfoPrint__Group__0");
					put(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGroup(), "rule__GSSConfigPhyHeaderPrint__Group__0");
					put(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGroup(), "rule__GSSConfigGSSDiscardErrorFlags__Group__0");
					put(grammarAccess.getGSSConfigProtocolAccess().getGroup(), "rule__GSSConfigProtocol__Group__0");
					put(grammarAccess.getGSSConfigProtocolAccess().getGroup_18(), "rule__GSSConfigProtocol__Group_18__0");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getGroup(), "rule__GSSConfigMainInterface__Group__0");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getGroup_22(), "rule__GSSConfigMainInterface__Group_22__0");
					put(grammarAccess.getGSSConfigInterfaceAccess().getGroup(), "rule__GSSConfigInterface__Group__0");
					put(grammarAccess.getGSSConfigInterfaceAccess().getGroup_22(), "rule__GSSConfigInterface__Group_22__0");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getGroup(), "rule__GSSConfigLevelInOut__Group__0");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getGroup_22(), "rule__GSSConfigLevelInOut__Group_22__0");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getGroup_23(), "rule__GSSConfigLevelInOut__Group_23__0");
					put(grammarAccess.getGSSConfigLevelInAccess().getGroup(), "rule__GSSConfigLevelIn__Group__0");
					put(grammarAccess.getGSSConfigLevelInAccess().getGroup_14(), "rule__GSSConfigLevelIn__Group_14__0");
					put(grammarAccess.getGSSConfigLevelOutAccess().getGroup(), "rule__GSSConfigLevelOut__Group__0");
					put(grammarAccess.getGSSConfigLevelOutAccess().getGroup_18(), "rule__GSSConfigLevelOut__Group_18__0");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getGroup(), "rule__GSSConfigSpecialPacket__Group__0");
					put(grammarAccess.getGSSConfigUpperLevelsAccess().getGroup(), "rule__GSSConfigUpperLevels__Group__0");
					put(grammarAccess.getGSSConfigPrintingDataAccess().getGroup(), "rule__GSSConfigPrintingData__Group__0");
					put(grammarAccess.getGSSConfigPeriodAccess().getGroup(), "rule__GSSConfigPeriod__Group__0");
					put(grammarAccess.getGSSConfigIntervalRangeAccess().getGroup(), "rule__GSSConfigIntervalRange__Group__0");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getGroup(), "rule__GSSConfigUpperLevel__Group__0");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_6(), "rule__GSSConfigUpperLevel__Group_6__0");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_7(), "rule__GSSConfigUpperLevel__Group_7__0");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_8(), "rule__GSSConfigUpperLevel__Group_8__0");
					put(grammarAccess.getGSSConfigStructuredDataAccess().getGroup(), "rule__GSSConfigStructuredData__Group__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup(), "rule__GSSConfigPeriodicTCLevel2__Group__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_22(), "rule__GSSConfigPeriodicTCLevel2__Group_22__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_27(), "rule__GSSConfigPeriodicTCLevel2__Group_27__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_28(), "rule__GSSConfigPeriodicTCLevel2__Group_28__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_29(), "rule__GSSConfigPeriodicTCLevel2__Group_29__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_30(), "rule__GSSConfigPeriodicTCLevel2__Group_30__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup(), "rule__GSSConfigPeriodicTCLevel1__Group__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_22(), "rule__GSSConfigPeriodicTCLevel1__Group_22__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_27(), "rule__GSSConfigPeriodicTCLevel1__Group_27__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_28(), "rule__GSSConfigPeriodicTCLevel1__Group_28__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGroup(), "rule__GSSConfigPeriodicTCLevel0__Group__0");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGroup_22(), "rule__GSSConfigPeriodicTCLevel0__Group_22__0");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getGroup(), "rule__GSSConfigGlobalVar__Group__0");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getGroup(), "rule__GSSConfigReferenceField__Group__0");
					put(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGroup(), "rule__GSSConfigReferencePeriodicTC__Group__0");
					put(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGroup(), "rule__GSSConfigReferenceSpecialPacket__Group__0");
					put(grammarAccess.getGSSConfigPlotAccess().getGroup(), "rule__GSSConfigPlot__Group__0");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getGroup(), "rule__GSSConfigAlarmMsg__Group__0");
					put(grammarAccess.getGSSConfigModifyAccess().getGroup(), "rule__GSSConfigModify__Group__0");
					put(grammarAccess.getGSSConfigAlarmValAccess().getGroup(), "rule__GSSConfigAlarmVal__Group__0");
					put(grammarAccess.getGSSConfigGVFilteredAccess().getGroup(), "rule__GSSConfigGVFiltered__Group__0");
					put(grammarAccess.getGSSConfigGVFilteredAccess().getGroup_6(), "rule__GSSConfigGVFiltered__Group_6__0");
					put(grammarAccess.getGSSConfigGVPeriodicAccess().getGroup(), "rule__GSSConfigGVPeriodic__Group__0");
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
					put(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsAssignment_8(), "rule__GSSConfigGSSConfig__Gss_optionsAssignment_8");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsAssignment_9(), "rule__GSSConfigGSSConfig__ProtocolsAssignment_9");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesAssignment_10(), "rule__GSSConfigGSSConfig__InterfacesAssignment_10");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsAssignment_11(), "rule__GSSConfigGSSConfig__SpecialPacketsAssignment_11");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsAssignment_12(), "rule__GSSConfigGSSConfig__PeriodicTCsAssignment_12");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsAssignment_13_0(), "rule__GSSConfigGSSConfig__GlobalVarsAssignment_13_0");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsAssignment_13_1(), "rule__GSSConfigGSSConfig__MonitorsAssignment_13_1");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getTestsAssignment_14(), "rule__GSSConfigGSSConfig__TestsAssignment_14");
					put(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoAssignment_2(), "rule__GSSConfigGSSOptions__Gss_infoAssignment_2");
					put(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printAssignment_3(), "rule__GSSConfigGSSOptions__Gss_info_printAssignment_3");
					put(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printAssignment_4(), "rule__GSSConfigGSSOptions__Phy_header_printAssignment_4");
					put(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsAssignment_5(), "rule__GSSConfigGSSOptions__DiscardErrorFlagsAssignment_5");
					put(grammarAccess.getGSSConfigProtocolsAccess().getProtocolAssignment_2(), "rule__GSSConfigProtocols__ProtocolAssignment_2");
					put(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceAssignment_2(), "rule__GSSConfigInterfaces__MainInterfaceAssignment_2");
					put(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceAssignment_3(), "rule__GSSConfigInterfaces__InterfaceAssignment_3");
					put(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketAssignment_2(), "rule__GSSConfigSpecialPackets__SpecialPacketAssignment_2");
					put(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0(), "rule__GSSConfigPeriodicTCs__PeriodicTC_level_2Assignment_3_0");
					put(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1(), "rule__GSSConfigPeriodicTCs__PeriodicTC_level_1Assignment_3_1");
					put(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2(), "rule__GSSConfigPeriodicTCs__PeriodicTC_level_0Assignment_3_2");
					put(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarAssignment_2(), "rule__GSSConfigGlobalVars__GlobalVarAssignment_2");
					put(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileAssignment_2_2(), "rule__GSSConfigMonitors__ChartsFileAssignment_2_2");
					put(grammarAccess.getGSSConfigMonitorsAccess().getPlotAssignment_3_0(), "rule__GSSConfigMonitors__PlotAssignment_3_0");
					put(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgAssignment_3_1(), "rule__GSSConfigMonitors__AlarmMsgAssignment_3_1");
					put(grammarAccess.getGSSConfigMonitorsAccess().getModifyAssignment_3_2(), "rule__GSSConfigMonitors__ModifyAssignment_3_2");
					put(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValAssignment_3_3(), "rule__GSSConfigMonitors__AlarmValAssignment_3_3");
					put(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileAssignment_2_2(), "rule__GSSConfigTests__ProtocolPacketsFileAssignment_2_2");
					put(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_3(), "rule__GSSConfigTests__TestCaseAssignment_3");
					put(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignAssignment_4(), "rule__GSSConfigGSSInfo__Test_campaignAssignment_4");
					put(grammarAccess.getGSSConfigGSSInfoAccess().getVersionAssignment_8(), "rule__GSSConfigGSSInfo__VersionAssignment_8");
					put(grammarAccess.getGSSConfigGSSInfoAccess().getDateAssignment_12(), "rule__GSSConfigGSSInfo__DateAssignment_12");
					put(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlAssignment_14_2(), "rule__GSSConfigGSSInfo__Version_control_urlAssignment_14_2");
					put(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogAssignment_4(), "rule__GSSConfigGSSInfoPrint__MainLogAssignment_4");
					put(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsAssignment_8(), "rule__GSSConfigGSSInfoPrint__PortLogsAssignment_8");
					put(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogAssignment_12(), "rule__GSSConfigGSSInfoPrint__RawLogAssignment_12");
					put(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogAssignment_4(), "rule__GSSConfigPhyHeaderPrint__MainLogAssignment_4");
					put(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsAssignment_8(), "rule__GSSConfigPhyHeaderPrint__PortLogsAssignment_8");
					put(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogAssignment_12(), "rule__GSSConfigPhyHeaderPrint__RawLogAssignment_12");
					put(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsAssignment_16(), "rule__GSSConfigPhyHeaderPrint__GssTabsAssignment_16");
					put(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4(), "rule__GSSConfigGSSDiscardErrorFlags__TxErrorsAssignment_4");
					put(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8(), "rule__GSSConfigGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8");
					put(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12(), "rule__GSSConfigGSSDiscardErrorFlags__FiltersKoAssignment_12");
					put(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16(), "rule__GSSConfigGSSDiscardErrorFlags__ValidTimesKoAssignment_16");
					put(grammarAccess.getGSSConfigProtocolAccess().getIdAssignment_4(), "rule__GSSConfigProtocol__IdAssignment_4");
					put(grammarAccess.getGSSConfigProtocolAccess().getNameAssignment_8(), "rule__GSSConfigProtocol__NameAssignment_8");
					put(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelAssignment_12(), "rule__GSSConfigProtocol__TypeLevelAssignment_12");
					put(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetAssignment_16(), "rule__GSSConfigProtocol__TypeOffsetAssignment_16");
					put(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetAssignment_18_2(), "rule__GSSConfigProtocol__SubtypeOffsetAssignment_18_2");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getIdAssignment_4(), "rule__GSSConfigMainInterface__IdAssignment_4");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getNameAssignment_8(), "rule__GSSConfigMainInterface__NameAssignment_8");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeAssignment_12(), "rule__GSSConfigMainInterface__IfTypeAssignment_12");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigAssignment_16(), "rule__GSSConfigMainInterface__IfConfigAssignment_16");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeAssignment_20(), "rule__GSSConfigMainInterface__IoTypeAssignment_20");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDAssignment_22_2(), "rule__GSSConfigMainInterface__ProtocolIDAssignment_22_2");
					put(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutAssignment_23(), "rule__GSSConfigMainInterface__LevelInOutAssignment_23");
					put(grammarAccess.getGSSConfigInterfaceAccess().getIdAssignment_4(), "rule__GSSConfigInterface__IdAssignment_4");
					put(grammarAccess.getGSSConfigInterfaceAccess().getNameAssignment_8(), "rule__GSSConfigInterface__NameAssignment_8");
					put(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeAssignment_12(), "rule__GSSConfigInterface__IfTypeAssignment_12");
					put(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigAssignment_16(), "rule__GSSConfigInterface__IfConfigAssignment_16");
					put(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeAssignment_20(), "rule__GSSConfigInterface__IoTypeAssignment_20");
					put(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDAssignment_22_2(), "rule__GSSConfigInterface__ProtocolIDAssignment_22_2");
					put(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutAssignment_23_0(), "rule__GSSConfigInterface__LevelInOutAssignment_23_0");
					put(grammarAccess.getGSSConfigInterfaceAccess().getLevelInAssignment_23_1(), "rule__GSSConfigInterface__LevelInAssignment_23_1");
					put(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutAssignment_23_2(), "rule__GSSConfigInterface__LevelOutAssignment_23_2");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getIdAssignment_4(), "rule__GSSConfigLevelInOut__IdAssignment_4");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getNameAssignment_8(), "rule__GSSConfigLevelInOut__NameAssignment_8");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatAssignment_12(), "rule__GSSConfigLevelInOut__TMformatAssignment_12");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatAssignment_16(), "rule__GSSConfigLevelInOut__TCformatAssignment_16");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterAssignment_20(), "rule__GSSConfigLevelInOut__InputFilterAssignment_20");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2(), "rule__GSSConfigLevelInOut__Export_to_prev_LevelAssignment_22_2");
					put(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2(), "rule__GSSConfigLevelInOut__Import_from_prev_LevelAssignment_23_2");
					put(grammarAccess.getGSSConfigLevelInAccess().getIdAssignment_4(), "rule__GSSConfigLevelIn__IdAssignment_4");
					put(grammarAccess.getGSSConfigLevelInAccess().getNameAssignment_8(), "rule__GSSConfigLevelIn__NameAssignment_8");
					put(grammarAccess.getGSSConfigLevelInAccess().getTCformatAssignment_12(), "rule__GSSConfigLevelIn__TCformatAssignment_12");
					put(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelAssignment_14_2(), "rule__GSSConfigLevelIn__Export_to_prev_LevelAssignment_14_2");
					put(grammarAccess.getGSSConfigLevelOutAccess().getIdAssignment_4(), "rule__GSSConfigLevelOut__IdAssignment_4");
					put(grammarAccess.getGSSConfigLevelOutAccess().getNameAssignment_8(), "rule__GSSConfigLevelOut__NameAssignment_8");
					put(grammarAccess.getGSSConfigLevelOutAccess().getTMformatAssignment_12(), "rule__GSSConfigLevelOut__TMformatAssignment_12");
					put(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterAssignment_16(), "rule__GSSConfigLevelOut__InputFilterAssignment_16");
					put(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelAssignment_18_2(), "rule__GSSConfigLevelOut__Import_from_prev_LevelAssignment_18_2");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusAssignment_4(), "rule__GSSConfigSpecialPacket__StatusAssignment_4");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getNameAssignment_8(), "rule__GSSConfigSpecialPacket__NameAssignment_8");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getIdAssignment_12(), "rule__GSSConfigSpecialPacket__IdAssignment_12");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefAssignment_16(), "rule__GSSConfigSpecialPacket__IfRefAssignment_16");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsAssignment_20(), "rule__GSSConfigSpecialPacket__LevelsAssignment_20");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefAssignment_24(), "rule__GSSConfigSpecialPacket__LevelRefAssignment_24");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterAssignment_28(), "rule__GSSConfigSpecialPacket__InputFilterAssignment_28");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsAssignment_30(), "rule__GSSConfigSpecialPacket__UpperLevelsAssignment_30");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataAssignment_31(), "rule__GSSConfigSpecialPacket__PrintingDataAssignment_31");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodAssignment_32_0(), "rule__GSSConfigSpecialPacket__PeriodAssignment_32_0");
					put(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeAssignment_32_1(), "rule__GSSConfigSpecialPacket__IntervalRangeAssignment_32_1");
					put(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelAssignment_2(), "rule__GSSConfigUpperLevels__UpperLevelAssignment_2");
					put(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusAssignment_4(), "rule__GSSConfigPrintingData__PrintStatusAssignment_4");
					put(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataAssignment_6(), "rule__GSSConfigPrintingData__StructuredDataAssignment_6");
					put(grammarAccess.getGSSConfigPeriodAccess().getMin_valueAssignment_4(), "rule__GSSConfigPeriod__Min_valueAssignment_4");
					put(grammarAccess.getGSSConfigPeriodAccess().getMin_unitAssignment_8(), "rule__GSSConfigPeriod__Min_unitAssignment_8");
					put(grammarAccess.getGSSConfigPeriodAccess().getMax_valueAssignment_12(), "rule__GSSConfigPeriod__Max_valueAssignment_12");
					put(grammarAccess.getGSSConfigPeriodAccess().getMax_unitAssignment_16(), "rule__GSSConfigPeriod__Max_unitAssignment_16");
					put(grammarAccess.getGSSConfigIntervalRangeAccess().getMinAssignment_4(), "rule__GSSConfigIntervalRange__MinAssignment_4");
					put(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxAssignment_8(), "rule__GSSConfigIntervalRange__MaxAssignment_8");
					put(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueAssignment_12(), "rule__GSSConfigIntervalRange__Interval_valueAssignment_12");
					put(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitAssignment_16(), "rule__GSSConfigIntervalRange__Interval_unitAssignment_16");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getLevelAssignment_4(), "rule__GSSConfigUpperLevel__LevelAssignment_4");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatAssignment_6_2(), "rule__GSSConfigUpperLevel__TMformatAssignment_6_2");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterAssignment_7_2(), "rule__GSSConfigUpperLevel__InputFilterAssignment_7_2");
					put(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2(), "rule__GSSConfigUpperLevel__Import_from_prev_LevelAssignment_8_2");
					put(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefAssignment_4(), "rule__GSSConfigStructuredData__LevelRefAssignment_4");
					put(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldAssignment_8(), "rule__GSSConfigStructuredData__FirstFieldAssignment_8");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameAssignment_4(), "rule__GSSConfigPeriodicTCLevel2__NameAssignment_4");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdAssignment_8(), "rule__GSSConfigPeriodicTCLevel2__IdAssignment_8");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefAssignment_12(), "rule__GSSConfigPeriodicTCLevel2__IfRefAssignment_12");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueAssignment_16(), "rule__GSSConfigPeriodicTCLevel2__Period_valueAssignment_16");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitAssignment_20(), "rule__GSSConfigPeriodicTCLevel2__Period_unitAssignment_20");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Assignment_22_2(), "rule__GSSConfigPeriodicTCLevel2__Level2Assignment_22_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Assignment_25(), "rule__GSSConfigPeriodicTCLevel2__App_to_level2Assignment_25");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Assignment_27_2(), "rule__GSSConfigPeriodicTCLevel2__Level1Assignment_27_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2(), "rule__GSSConfigPeriodicTCLevel2__Level2_to_level1Assignment_28_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Assignment_29_2(), "rule__GSSConfigPeriodicTCLevel2__Level0Assignment_29_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2(), "rule__GSSConfigPeriodicTCLevel2__Level1_to_level0Assignment_30_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameAssignment_4(), "rule__GSSConfigPeriodicTCLevel1__NameAssignment_4");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdAssignment_8(), "rule__GSSConfigPeriodicTCLevel1__IdAssignment_8");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefAssignment_12(), "rule__GSSConfigPeriodicTCLevel1__IfRefAssignment_12");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueAssignment_16(), "rule__GSSConfigPeriodicTCLevel1__Period_valueAssignment_16");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitAssignment_20(), "rule__GSSConfigPeriodicTCLevel1__Period_unitAssignment_20");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Assignment_22_2(), "rule__GSSConfigPeriodicTCLevel1__Level1Assignment_22_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Assignment_25(), "rule__GSSConfigPeriodicTCLevel1__App_to_level1Assignment_25");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Assignment_27_2(), "rule__GSSConfigPeriodicTCLevel1__Level0Assignment_27_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2(), "rule__GSSConfigPeriodicTCLevel1__Level1_to_level0Assignment_28_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameAssignment_4(), "rule__GSSConfigPeriodicTCLevel0__NameAssignment_4");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdAssignment_8(), "rule__GSSConfigPeriodicTCLevel0__IdAssignment_8");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefAssignment_12(), "rule__GSSConfigPeriodicTCLevel0__IfRefAssignment_12");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueAssignment_16(), "rule__GSSConfigPeriodicTCLevel0__Period_valueAssignment_16");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitAssignment_20(), "rule__GSSConfigPeriodicTCLevel0__Period_unitAssignment_20");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Assignment_22_2(), "rule__GSSConfigPeriodicTCLevel0__Level0Assignment_22_2");
					put(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Assignment_25(), "rule__GSSConfigPeriodicTCLevel0__App_to_level0Assignment_25");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getNameAssignment_4(), "rule__GSSConfigGlobalVar__NameAssignment_4");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getIdAssignment_8(), "rule__GSSConfigGlobalVar__IdAssignment_8");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getTypeAssignment_12(), "rule__GSSConfigGlobalVar__TypeAssignment_12");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueAssignment_16(), "rule__GSSConfigGlobalVar__Initial_valueAssignment_16");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldAssignment_18_0(), "rule__GSSConfigGlobalVar__ReferenceFieldAssignment_18_0");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCAssignment_18_1(), "rule__GSSConfigGlobalVar__ReferencePeriodicTCAssignment_18_1");
					put(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2(), "rule__GSSConfigGlobalVar__ReferenceSpecialPacketAssignment_18_2");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeAssignment_4(), "rule__GSSConfigReferenceField__TypeAssignment_4");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefAssignment_8(), "rule__GSSConfigReferenceField__IfRefAssignment_8");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelAssignment_12(), "rule__GSSConfigReferenceField__LevelAssignment_12");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefAssignment_16(), "rule__GSSConfigReferenceField__FieldRefAssignment_16");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetAssignment_20(), "rule__GSSConfigReferenceField__OffsetAssignment_20");
					put(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeAssignment_24(), "rule__GSSConfigReferenceField__SizeAssignment_24");
					put(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefAssignment_4(), "rule__GSSConfigReferencePeriodicTC__IdRefAssignment_4");
					put(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelAssignment_8(), "rule__GSSConfigReferencePeriodicTC__LevelAssignment_8");
					put(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefAssignment_12(), "rule__GSSConfigReferencePeriodicTC__FieldRefAssignment_12");
					put(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetAssignment_16(), "rule__GSSConfigReferencePeriodicTC__OffsetAssignment_16");
					put(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeAssignment_20(), "rule__GSSConfigReferencePeriodicTC__SizeAssignment_20");
					put(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefAssignment_4(), "rule__GSSConfigReferenceSpecialPacket__IdRefAssignment_4");
					put(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelAssignment_8(), "rule__GSSConfigReferenceSpecialPacket__LevelAssignment_8");
					put(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefAssignment_12(), "rule__GSSConfigReferenceSpecialPacket__FieldRefAssignment_12");
					put(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetAssignment_16(), "rule__GSSConfigReferenceSpecialPacket__OffsetAssignment_16");
					put(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeAssignment_20(), "rule__GSSConfigReferenceSpecialPacket__SizeAssignment_20");
					put(grammarAccess.getGSSConfigPlotAccess().getNameAssignment_4(), "rule__GSSConfigPlot__NameAssignment_4");
					put(grammarAccess.getGSSConfigPlotAccess().getGVFilteredAssignment_6_0(), "rule__GSSConfigPlot__GVFilteredAssignment_6_0");
					put(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicAssignment_6_1(), "rule__GSSConfigPlot__GVPeriodicAssignment_6_1");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getNameAssignment_4(), "rule__GSSConfigAlarmMsg__NameAssignment_4");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeAssignment_8(), "rule__GSSConfigAlarmMsg__TypeAssignment_8");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getTextAssignment_12(), "rule__GSSConfigAlarmMsg__TextAssignment_12");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredAssignment_14_0(), "rule__GSSConfigAlarmMsg__GVFilteredAssignment_14_0");
					put(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicAssignment_14_1(), "rule__GSSConfigAlarmMsg__GVPeriodicAssignment_14_1");
					put(grammarAccess.getGSSConfigModifyAccess().getNameAssignment_4(), "rule__GSSConfigModify__NameAssignment_4");
					put(grammarAccess.getGSSConfigModifyAccess().getTypeAssignment_8(), "rule__GSSConfigModify__TypeAssignment_8");
					put(grammarAccess.getGSSConfigModifyAccess().getValueAssignment_12(), "rule__GSSConfigModify__ValueAssignment_12");
					put(grammarAccess.getGSSConfigModifyAccess().getGVFilteredAssignment_14_0(), "rule__GSSConfigModify__GVFilteredAssignment_14_0");
					put(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicAssignment_14_1(), "rule__GSSConfigModify__GVPeriodicAssignment_14_1");
					put(grammarAccess.getGSSConfigAlarmValAccess().getNameAssignment_4(), "rule__GSSConfigAlarmVal__NameAssignment_4");
					put(grammarAccess.getGSSConfigAlarmValAccess().getTypeAssignment_8(), "rule__GSSConfigAlarmVal__TypeAssignment_8");
					put(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredAssignment_10_0(), "rule__GSSConfigAlarmVal__GVFilteredAssignment_10_0");
					put(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicAssignment_10_1(), "rule__GSSConfigAlarmVal__GVPeriodicAssignment_10_1");
					put(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefAssignment_4(), "rule__GSSConfigGVFiltered__GlobalVarRefAssignment_4");
					put(grammarAccess.getGSSConfigGVFilteredAccess().getFilterAssignment_6_2(), "rule__GSSConfigGVFiltered__FilterAssignment_6_2");
					put(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefAssignment_5(), "rule__GSSConfigGVPeriodic__GlobalVarRefAssignment_5");
					put(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueAssignment_9(), "rule__GSSConfigGVPeriodic__Period_valueAssignment_9");
					put(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitAssignment_13(), "rule__GSSConfigGVPeriodic__Period_unitAssignment_13");
					put(grammarAccess.getGSSConfigTestCaseAccess().getNameAssignment_4(), "rule__GSSConfigTestCase__NameAssignment_4");
					put(grammarAccess.getGSSConfigTestCaseAccess().getProcedureAssignment_8(), "rule__GSSConfigTestCase__ProcedureAssignment_8");
					put(grammarAccess.getGSSConfigTestCaseAccess().getReqAssignment_10_1(), "rule__GSSConfigTestCase__ReqAssignment_10_1");
					put(grammarAccess.getGSSConfigTestCaseAccess().getReqActionAssignment_11_1(), "rule__GSSConfigTestCase__ReqActionAssignment_11_1");
					put(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), "rule__GSSConfigGSSConfig__UnorderedGroup_13");
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
