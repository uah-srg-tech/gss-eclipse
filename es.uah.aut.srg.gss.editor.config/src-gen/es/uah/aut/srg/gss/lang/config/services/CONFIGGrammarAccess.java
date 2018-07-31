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
package es.uah.aut.srg.gss.lang.config.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CONFIGGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSConfigGSSConfigParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSConfigGSSConfig
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSConfigGSSConfig
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSConfigGSSConfig
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSConfigGSSConfig
		public RuleCall getElementGSSConfigGSSConfigParserRuleCall_1_0() { return cElementGSSConfigGSSConfigParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSModelFileImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportURIAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportURISTRINGTerminalRuleCall_2_0 = (RuleCall)cImportURIAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GSSModelFileImport common::GSSModelFileImport:
		//	'import' ':=' importURI=STRING ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'import' ':=' importURI=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1() { return cColonEqualsSignKeyword_1; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_2() { return cImportURIAssignment_2; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_2_0() { return cImportURISTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class GSSConfigGSSConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGSSConfigKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cUriKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cUriAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cUriQualifiedNameParserRuleCall_3_0_2_0 = (RuleCall)cUriAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cVersionKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_2_0 = (RuleCall)cVersionAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Assignment cGss_optionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGss_optionsGSSConfigGSSOptionsParserRuleCall_4_0 = (RuleCall)cGss_optionsAssignment_4.eContents().get(0);
		private final Assignment cProtocolsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cProtocolsGSSConfigProtocolsParserRuleCall_5_0 = (RuleCall)cProtocolsAssignment_5.eContents().get(0);
		private final Assignment cInterfacesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cInterfacesGSSConfigInterfacesParserRuleCall_6_0 = (RuleCall)cInterfacesAssignment_6.eContents().get(0);
		private final Assignment cSpecialPacketsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_7_0 = (RuleCall)cSpecialPacketsAssignment_7.eContents().get(0);
		private final Assignment cPeriodicTCsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_8_0 = (RuleCall)cPeriodicTCsAssignment_8.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_9 = (UnorderedGroup)cGroup.eContents().get(9);
		private final Assignment cGlobalVarsAssignment_9_0 = (Assignment)cUnorderedGroup_9.eContents().get(0);
		private final RuleCall cGlobalVarsGSSConfigGlobalVarsParserRuleCall_9_0_0 = (RuleCall)cGlobalVarsAssignment_9_0.eContents().get(0);
		private final Assignment cMonitorsAssignment_9_1 = (Assignment)cUnorderedGroup_9.eContents().get(1);
		private final RuleCall cMonitorsGSSConfigMonitorsParserRuleCall_9_1_0 = (RuleCall)cMonitorsAssignment_9_1.eContents().get(0);
		private final Assignment cTestsAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTestsGSSConfigTestsParserRuleCall_10_0 = (RuleCall)cTestsAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSConfigGSSConfig:
		//	'GSSConfigGSSConfig'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') gss_options=GSSConfigGSSOptions
		//	Protocols=GSSConfigProtocols
		//	Interfaces=GSSConfigInterfaces
		//	SpecialPackets=GSSConfigSpecialPackets?
		//	PeriodicTCs=GSSConfigPeriodicTCs? (GlobalVars=GSSConfigGlobalVars & Monitors=GSSConfigMonitors)?
		//	Tests=GSSConfigTests
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSConfig' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		//gss_options=GSSConfigGSSOptions Protocols=GSSConfigProtocols Interfaces=GSSConfigInterfaces
		//SpecialPackets=GSSConfigSpecialPackets? PeriodicTCs=GSSConfigPeriodicTCs? (GlobalVars=GSSConfigGlobalVars &
		//Monitors=GSSConfigMonitors)? Tests=GSSConfigTests '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGSSConfig'
		public Keyword getGSSConfigGSSConfigKeyword_0() { return cGSSConfigGSSConfigKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'uri' ':=' uri=QualifiedName ';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'uri'
		public Keyword getUriKeyword_3_0_0() { return cUriKeyword_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_3_0_2() { return cUriAssignment_3_0_2; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_3_0_2_0() { return cUriQualifiedNameParserRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//'version' ':=' version=Version ';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0() { return cVersionKeyword_3_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_2() { return cVersionAssignment_3_1_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_2_0() { return cVersionVersionParserRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//gss_options=GSSConfigGSSOptions
		public Assignment getGss_optionsAssignment_4() { return cGss_optionsAssignment_4; }
		
		//GSSConfigGSSOptions
		public RuleCall getGss_optionsGSSConfigGSSOptionsParserRuleCall_4_0() { return cGss_optionsGSSConfigGSSOptionsParserRuleCall_4_0; }
		
		//Protocols=GSSConfigProtocols
		public Assignment getProtocolsAssignment_5() { return cProtocolsAssignment_5; }
		
		//GSSConfigProtocols
		public RuleCall getProtocolsGSSConfigProtocolsParserRuleCall_5_0() { return cProtocolsGSSConfigProtocolsParserRuleCall_5_0; }
		
		//Interfaces=GSSConfigInterfaces
		public Assignment getInterfacesAssignment_6() { return cInterfacesAssignment_6; }
		
		//GSSConfigInterfaces
		public RuleCall getInterfacesGSSConfigInterfacesParserRuleCall_6_0() { return cInterfacesGSSConfigInterfacesParserRuleCall_6_0; }
		
		//SpecialPackets=GSSConfigSpecialPackets?
		public Assignment getSpecialPacketsAssignment_7() { return cSpecialPacketsAssignment_7; }
		
		//GSSConfigSpecialPackets
		public RuleCall getSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_7_0() { return cSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_7_0; }
		
		//PeriodicTCs=GSSConfigPeriodicTCs?
		public Assignment getPeriodicTCsAssignment_8() { return cPeriodicTCsAssignment_8; }
		
		//GSSConfigPeriodicTCs
		public RuleCall getPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_8_0() { return cPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_8_0; }
		
		//(GlobalVars=GSSConfigGlobalVars & Monitors=GSSConfigMonitors)?
		public UnorderedGroup getUnorderedGroup_9() { return cUnorderedGroup_9; }
		
		//GlobalVars=GSSConfigGlobalVars
		public Assignment getGlobalVarsAssignment_9_0() { return cGlobalVarsAssignment_9_0; }
		
		//GSSConfigGlobalVars
		public RuleCall getGlobalVarsGSSConfigGlobalVarsParserRuleCall_9_0_0() { return cGlobalVarsGSSConfigGlobalVarsParserRuleCall_9_0_0; }
		
		//Monitors=GSSConfigMonitors
		public Assignment getMonitorsAssignment_9_1() { return cMonitorsAssignment_9_1; }
		
		//GSSConfigMonitors
		public RuleCall getMonitorsGSSConfigMonitorsParserRuleCall_9_1_0() { return cMonitorsGSSConfigMonitorsParserRuleCall_9_1_0; }
		
		//Tests=GSSConfigTests
		public Assignment getTestsAssignment_10() { return cTestsAssignment_10; }
		
		//GSSConfigTests
		public RuleCall getTestsGSSConfigTestsParserRuleCall_10_0() { return cTestsGSSConfigTestsParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSConfigGSSOptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSOptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGSSOptionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGss_infoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGss_infoGSSConfigGSSInfoParserRuleCall_2_0 = (RuleCall)cGss_infoAssignment_2.eContents().get(0);
		private final Assignment cGss_info_printAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0 = (RuleCall)cGss_info_printAssignment_3.eContents().get(0);
		private final Assignment cPhy_header_printAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0 = (RuleCall)cPhy_header_printAssignment_4.eContents().get(0);
		private final Assignment cDiscardErrorFlagsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0 = (RuleCall)cDiscardErrorFlagsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSConfigGSSOptions:
		//	'GSSConfigGSSOptions' '{'
		//	gss_info=GSSConfigGSSInfo
		//	gss_info_print=GSSConfigGSSInfoPrint
		//	phy_header_print=GSSConfigPhyHeaderPrint
		//	discardErrorFlags=GSSConfigGSSDiscardErrorFlags
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSOptions' '{' gss_info=GSSConfigGSSInfo gss_info_print=GSSConfigGSSInfoPrint
		//phy_header_print=GSSConfigPhyHeaderPrint discardErrorFlags=GSSConfigGSSDiscardErrorFlags '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGSSOptions'
		public Keyword getGSSConfigGSSOptionsKeyword_0() { return cGSSConfigGSSOptionsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//gss_info=GSSConfigGSSInfo
		public Assignment getGss_infoAssignment_2() { return cGss_infoAssignment_2; }
		
		//GSSConfigGSSInfo
		public RuleCall getGss_infoGSSConfigGSSInfoParserRuleCall_2_0() { return cGss_infoGSSConfigGSSInfoParserRuleCall_2_0; }
		
		//gss_info_print=GSSConfigGSSInfoPrint
		public Assignment getGss_info_printAssignment_3() { return cGss_info_printAssignment_3; }
		
		//GSSConfigGSSInfoPrint
		public RuleCall getGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0() { return cGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0; }
		
		//phy_header_print=GSSConfigPhyHeaderPrint
		public Assignment getPhy_header_printAssignment_4() { return cPhy_header_printAssignment_4; }
		
		//GSSConfigPhyHeaderPrint
		public RuleCall getPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0() { return cPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0; }
		
		//discardErrorFlags=GSSConfigGSSDiscardErrorFlags
		public Assignment getDiscardErrorFlagsAssignment_5() { return cDiscardErrorFlagsAssignment_5; }
		
		//GSSConfigGSSDiscardErrorFlags
		public RuleCall getDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0() { return cDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSConfigProtocolsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigProtocols");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigProtocolsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProtocolAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProtocolGSSConfigProtocolParserRuleCall_2_0 = (RuleCall)cProtocolAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSConfigProtocols:
		//	'GSSConfigProtocols' '{'
		//	Protocol+=GSSConfigProtocol+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigProtocols' '{' Protocol+=GSSConfigProtocol+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigProtocols'
		public Keyword getGSSConfigProtocolsKeyword_0() { return cGSSConfigProtocolsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//Protocol+=GSSConfigProtocol+
		public Assignment getProtocolAssignment_2() { return cProtocolAssignment_2; }
		
		//GSSConfigProtocol
		public RuleCall getProtocolGSSConfigProtocolParserRuleCall_2_0() { return cProtocolGSSConfigProtocolParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSConfigInterfacesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaces");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigInterfacesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMainInterfaceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0 = (RuleCall)cMainInterfaceAssignment_2.eContents().get(0);
		private final Assignment cInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInterfaceGSSConfigInterfaceParserRuleCall_3_0 = (RuleCall)cInterfaceAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSConfigInterfaces:
		//	'GSSConfigInterfaces' '{'
		//	MainInterface=GSSConfigMainInterface
		//	Interface+=GSSConfigInterface*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigInterfaces' '{' MainInterface=GSSConfigMainInterface Interface+=GSSConfigInterface* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigInterfaces'
		public Keyword getGSSConfigInterfacesKeyword_0() { return cGSSConfigInterfacesKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//MainInterface=GSSConfigMainInterface
		public Assignment getMainInterfaceAssignment_2() { return cMainInterfaceAssignment_2; }
		
		//GSSConfigMainInterface
		public RuleCall getMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0() { return cMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0; }
		
		//Interface+=GSSConfigInterface*
		public Assignment getInterfaceAssignment_3() { return cInterfaceAssignment_3; }
		
		//GSSConfigInterface
		public RuleCall getInterfaceGSSConfigInterfaceParserRuleCall_3_0() { return cInterfaceGSSConfigInterfaceParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSConfigSpecialPacketsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigSpecialPackets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigSpecialPacketsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpecialPacketAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0 = (RuleCall)cSpecialPacketAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSConfigSpecialPackets:
		//	'GSSConfigSpecialPackets' '{'
		//	SpecialPacket+=GSSConfigSpecialPacket '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigSpecialPackets' '{' SpecialPacket+=GSSConfigSpecialPacket '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigSpecialPackets'
		public Keyword getGSSConfigSpecialPacketsKeyword_0() { return cGSSConfigSpecialPacketsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//SpecialPacket+=GSSConfigSpecialPacket
		public Assignment getSpecialPacketAssignment_2() { return cSpecialPacketAssignment_2; }
		
		//GSSConfigSpecialPacket
		public RuleCall getSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0() { return cSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSConfigPeriodicTCsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSConfigPeriodicTCsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSConfigPeriodicTCsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cPeriodicTC_level_2Assignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0 = (RuleCall)cPeriodicTC_level_2Assignment_3_0.eContents().get(0);
		private final Assignment cPeriodicTC_level_1Assignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0 = (RuleCall)cPeriodicTC_level_1Assignment_3_1.eContents().get(0);
		private final Assignment cPeriodicTC_level_0Assignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0 = (RuleCall)cPeriodicTC_level_0Assignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSConfigPeriodicTCs:
		//	{GSSConfigPeriodicTCs}
		//	'GSSConfigPeriodicTCs' '{' (PeriodicTC_level_2+=GSSConfigPeriodicTCLevel2 |
		//	PeriodicTC_level_1+=GSSConfigPeriodicTCLevel1 | PeriodicTC_level_0+=GSSConfigPeriodicTCLevel0)*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSConfigPeriodicTCs} 'GSSConfigPeriodicTCs' '{' (PeriodicTC_level_2+=GSSConfigPeriodicTCLevel2 |
		//PeriodicTC_level_1+=GSSConfigPeriodicTCLevel1 | PeriodicTC_level_0+=GSSConfigPeriodicTCLevel0)* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSConfigPeriodicTCs}
		public Action getGSSConfigPeriodicTCsAction_0() { return cGSSConfigPeriodicTCsAction_0; }
		
		//'GSSConfigPeriodicTCs'
		public Keyword getGSSConfigPeriodicTCsKeyword_1() { return cGSSConfigPeriodicTCsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(PeriodicTC_level_2+=GSSConfigPeriodicTCLevel2 | PeriodicTC_level_1+=GSSConfigPeriodicTCLevel1 |
		//PeriodicTC_level_0+=GSSConfigPeriodicTCLevel0)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//PeriodicTC_level_2+=GSSConfigPeriodicTCLevel2
		public Assignment getPeriodicTC_level_2Assignment_3_0() { return cPeriodicTC_level_2Assignment_3_0; }
		
		//GSSConfigPeriodicTCLevel2
		public RuleCall getPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0() { return cPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0; }
		
		//PeriodicTC_level_1+=GSSConfigPeriodicTCLevel1
		public Assignment getPeriodicTC_level_1Assignment_3_1() { return cPeriodicTC_level_1Assignment_3_1; }
		
		//GSSConfigPeriodicTCLevel1
		public RuleCall getPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0() { return cPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0; }
		
		//PeriodicTC_level_0+=GSSConfigPeriodicTCLevel0
		public Assignment getPeriodicTC_level_0Assignment_3_2() { return cPeriodicTC_level_0Assignment_3_2; }
		
		//GSSConfigPeriodicTCLevel0
		public RuleCall getPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0() { return cPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSConfigGlobalVarsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVars");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGlobalVarsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGlobalVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGlobalVarGSSConfigGlobalVarParserRuleCall_2_0 = (RuleCall)cGlobalVarAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSConfigGlobalVars:
		//	'GSSConfigGlobalVars' '{'
		//	GlobalVar+=GSSConfigGlobalVar+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGlobalVars' '{' GlobalVar+=GSSConfigGlobalVar+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGlobalVars'
		public Keyword getGSSConfigGlobalVarsKeyword_0() { return cGSSConfigGlobalVarsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//GlobalVar+=GSSConfigGlobalVar+
		public Assignment getGlobalVarAssignment_2() { return cGlobalVarAssignment_2; }
		
		//GSSConfigGlobalVar
		public RuleCall getGlobalVarGSSConfigGlobalVarParserRuleCall_2_0() { return cGlobalVarGSSConfigGlobalVarParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSConfigMonitorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMonitors");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigMonitorsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cChartsFileKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cChartsFileAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cChartsFileGSSChartsChartsCrossReference_2_2_0 = (CrossReference)cChartsFileAssignment_2_2.eContents().get(0);
		private final RuleCall cChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1 = (RuleCall)cChartsFileGSSChartsChartsCrossReference_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cPlotAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cPlotGSSConfigPlotParserRuleCall_3_0_0 = (RuleCall)cPlotAssignment_3_0.eContents().get(0);
		private final Assignment cAlarmMsgAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0 = (RuleCall)cAlarmMsgAssignment_3_1.eContents().get(0);
		private final Assignment cModifyAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cModifyGSSConfigModifyParserRuleCall_3_2_0 = (RuleCall)cModifyAssignment_3_2.eContents().get(0);
		private final Assignment cAlarmValAssignment_3_3 = (Assignment)cAlternatives_3.eContents().get(3);
		private final RuleCall cAlarmValGSSConfigAlarmValParserRuleCall_3_3_0 = (RuleCall)cAlarmValAssignment_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSConfigMonitors:
		//	'GSSConfigMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		//	(plot+=GSSConfigPlot | alarmMsg+=GSSConfigAlarmMsg | modify+=GSSConfigModify | alarmVal+=GSSConfigAlarmVal)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		//(plot+=GSSConfigPlot | alarmMsg+=GSSConfigAlarmMsg | modify+=GSSConfigModify | alarmVal+=GSSConfigAlarmVal)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigMonitors'
		public Keyword getGSSConfigMonitorsKeyword_0() { return cGSSConfigMonitorsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'ChartsFile'
		public Keyword getChartsFileKeyword_2_0() { return cChartsFileKeyword_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1() { return cColonEqualsSignKeyword_2_1; }
		
		//ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName]
		public Assignment getChartsFileAssignment_2_2() { return cChartsFileAssignment_2_2; }
		
		//[charts::GSSChartsCharts|VersionedQualifiedName]
		public CrossReference getChartsFileGSSChartsChartsCrossReference_2_2_0() { return cChartsFileGSSChartsChartsCrossReference_2_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1() { return cChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//(plot+=GSSConfigPlot | alarmMsg+=GSSConfigAlarmMsg | modify+=GSSConfigModify | alarmVal+=GSSConfigAlarmVal)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//plot+=GSSConfigPlot
		public Assignment getPlotAssignment_3_0() { return cPlotAssignment_3_0; }
		
		//GSSConfigPlot
		public RuleCall getPlotGSSConfigPlotParserRuleCall_3_0_0() { return cPlotGSSConfigPlotParserRuleCall_3_0_0; }
		
		//alarmMsg+=GSSConfigAlarmMsg
		public Assignment getAlarmMsgAssignment_3_1() { return cAlarmMsgAssignment_3_1; }
		
		//GSSConfigAlarmMsg
		public RuleCall getAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0() { return cAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0; }
		
		//modify+=GSSConfigModify
		public Assignment getModifyAssignment_3_2() { return cModifyAssignment_3_2; }
		
		//GSSConfigModify
		public RuleCall getModifyGSSConfigModifyParserRuleCall_3_2_0() { return cModifyGSSConfigModifyParserRuleCall_3_2_0; }
		
		//alarmVal+=GSSConfigAlarmVal
		public Assignment getAlarmValAssignment_3_3() { return cAlarmValAssignment_3_3; }
		
		//GSSConfigAlarmVal
		public RuleCall getAlarmValGSSConfigAlarmValParserRuleCall_3_3_0() { return cAlarmValGSSConfigAlarmValParserRuleCall_3_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSConfigTestsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTests");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigTestsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cProtocolPacketsFileKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cProtocolPacketsFileAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0 = (CrossReference)cProtocolPacketsFileAssignment_2_2.eContents().get(0);
		private final RuleCall cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1 = (RuleCall)cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cTestCaseAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTestCaseGSSConfigTestCaseParserRuleCall_3_0 = (RuleCall)cTestCaseAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSConfigTests:
		//	'GSSConfigTests' '{' ('ProtocolPacketsFile' ':='
		//	ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		//	TestCase+=GSSConfigTestCase+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigTests' '{' ('ProtocolPacketsFile' ':='
		//ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		//TestCase+=GSSConfigTestCase+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigTests'
		public Keyword getGSSConfigTestsKeyword_0() { return cGSSConfigTestsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('ProtocolPacketsFile' ':='
		//ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'ProtocolPacketsFile'
		public Keyword getProtocolPacketsFileKeyword_2_0() { return cProtocolPacketsFileKeyword_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1() { return cColonEqualsSignKeyword_2_1; }
		
		//ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName]
		public Assignment getProtocolPacketsFileAssignment_2_2() { return cProtocolPacketsFileAssignment_2_2; }
		
		//[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName]
		public CrossReference getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0() { return cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1() { return cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//TestCase+=GSSConfigTestCase+
		public Assignment getTestCaseAssignment_3() { return cTestCaseAssignment_3; }
		
		//GSSConfigTestCase
		public RuleCall getTestCaseGSSConfigTestCaseParserRuleCall_3_0() { return cTestCaseGSSConfigTestCaseParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSConfigGSSInfoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSInfo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGSSInfoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTest_campaignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTest_campaignAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTest_campaignSTRINGTerminalRuleCall_4_0 = (RuleCall)cTest_campaignAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cVersionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cVersionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cVersionVersionParserRuleCall_8_0 = (RuleCall)cVersionAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDateKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDateAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDateDATEParserRuleCall_12_0 = (RuleCall)cDateAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cVersion_control_urlKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cVersion_control_urlAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cVersion_control_urlURLParserRuleCall_14_2_0 = (RuleCall)cVersion_control_urlAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSConfigGSSInfo:
		//	'GSSConfigGSSInfo' '{'
		//	'test_campaign' ':=' test_campaign=STRING ';'
		//	'version' ':=' version=Version ';'
		//	'date' ':=' date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSInfo' '{' 'test_campaign' ':=' test_campaign=STRING ';' 'version' ':=' version=Version ';' 'date' ':='
		//date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGSSInfo'
		public Keyword getGSSConfigGSSInfoKeyword_0() { return cGSSConfigGSSInfoKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'test_campaign'
		public Keyword getTest_campaignKeyword_2() { return cTest_campaignKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//test_campaign=STRING
		public Assignment getTest_campaignAssignment_4() { return cTest_campaignAssignment_4; }
		
		//STRING
		public RuleCall getTest_campaignSTRINGTerminalRuleCall_4_0() { return cTest_campaignSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'version'
		public Keyword getVersionKeyword_6() { return cVersionKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//version=Version
		public Assignment getVersionAssignment_8() { return cVersionAssignment_8; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_8_0() { return cVersionVersionParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'date'
		public Keyword getDateKeyword_10() { return cDateKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//date=DATE
		public Assignment getDateAssignment_12() { return cDateAssignment_12; }
		
		//DATE
		public RuleCall getDateDATEParserRuleCall_12_0() { return cDateDATEParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('version_control_url' ':=' version_control_url=URL ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'version_control_url'
		public Keyword getVersion_control_urlKeyword_14_0() { return cVersion_control_urlKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//version_control_url=URL
		public Assignment getVersion_control_urlAssignment_14_2() { return cVersion_control_urlAssignment_14_2; }
		
		//URL
		public RuleCall getVersion_control_urlURLParserRuleCall_14_2_0() { return cVersion_control_urlURLParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSConfigGSSInfoPrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSInfoPrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGSSInfoPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainLogKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMainLogAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMainLogGSSConfigEnableDisableEnumRuleCall_4_0 = (RuleCall)cMainLogAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortLogsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortLogsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortLogsGSSConfigEnableDisableEnumRuleCall_8_0 = (RuleCall)cPortLogsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDebugLogKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDebugLogAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDebugLogGSSConfigEnableDisableEnumRuleCall_12_0 = (RuleCall)cDebugLogAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSConfigGSSInfoPrint:
		//	'GSSConfigGSSInfoPrint'
		//	'{'
		//	'mainLog' ':=' mainLog=GSSConfigEnableDisable ';'
		//	'portLogs' ':=' portLogs=GSSConfigEnableDisable ';'
		//	'debugLog' ':=' debugLog=GSSConfigEnableDisable ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSInfoPrint' '{' 'mainLog' ':=' mainLog=GSSConfigEnableDisable ';' 'portLogs' ':='
		//portLogs=GSSConfigEnableDisable ';' 'debugLog' ':=' debugLog=GSSConfigEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGSSInfoPrint'
		public Keyword getGSSConfigGSSInfoPrintKeyword_0() { return cGSSConfigGSSInfoPrintKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'mainLog'
		public Keyword getMainLogKeyword_2() { return cMainLogKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//mainLog=GSSConfigEnableDisable
		public Assignment getMainLogAssignment_4() { return cMainLogAssignment_4; }
		
		//GSSConfigEnableDisable
		public RuleCall getMainLogGSSConfigEnableDisableEnumRuleCall_4_0() { return cMainLogGSSConfigEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portLogs'
		public Keyword getPortLogsKeyword_6() { return cPortLogsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portLogs=GSSConfigEnableDisable
		public Assignment getPortLogsAssignment_8() { return cPortLogsAssignment_8; }
		
		//GSSConfigEnableDisable
		public RuleCall getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0() { return cPortLogsGSSConfigEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'debugLog'
		public Keyword getDebugLogKeyword_10() { return cDebugLogKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//debugLog=GSSConfigEnableDisable
		public Assignment getDebugLogAssignment_12() { return cDebugLogAssignment_12; }
		
		//GSSConfigEnableDisable
		public RuleCall getDebugLogGSSConfigEnableDisableEnumRuleCall_12_0() { return cDebugLogGSSConfigEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSConfigPhyHeaderPrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPhyHeaderPrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPhyHeaderPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainLogKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMainLogAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMainLogGSSConfigEnableDisableEnumRuleCall_4_0 = (RuleCall)cMainLogAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortLogsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortLogsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortLogsGSSConfigEnableDisableEnumRuleCall_8_0 = (RuleCall)cPortLogsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDebugLogKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDebugLogAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDebugLogGSSConfigEnableDisableEnumRuleCall_12_0 = (RuleCall)cDebugLogAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cGssTabsKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cGssTabsAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGssTabsGSSConfigEnableDisableEnumRuleCall_16_0 = (RuleCall)cGssTabsAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSConfigPhyHeaderPrint:
		//	'GSSConfigPhyHeaderPrint' '{'
		//	'mainLog' ':=' mainLog=GSSConfigEnableDisable ';'
		//	'portLogs' ':=' portLogs=GSSConfigEnableDisable ';'
		//	'debugLog' ':=' debugLog=GSSConfigEnableDisable ';'
		//	'gssTabs' ':=' gssTabs=GSSConfigEnableDisable ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPhyHeaderPrint' '{' 'mainLog' ':=' mainLog=GSSConfigEnableDisable ';' 'portLogs' ':='
		//portLogs=GSSConfigEnableDisable ';' 'debugLog' ':=' debugLog=GSSConfigEnableDisable ';' 'gssTabs' ':='
		//gssTabs=GSSConfigEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPhyHeaderPrint'
		public Keyword getGSSConfigPhyHeaderPrintKeyword_0() { return cGSSConfigPhyHeaderPrintKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'mainLog'
		public Keyword getMainLogKeyword_2() { return cMainLogKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//mainLog=GSSConfigEnableDisable
		public Assignment getMainLogAssignment_4() { return cMainLogAssignment_4; }
		
		//GSSConfigEnableDisable
		public RuleCall getMainLogGSSConfigEnableDisableEnumRuleCall_4_0() { return cMainLogGSSConfigEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portLogs'
		public Keyword getPortLogsKeyword_6() { return cPortLogsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portLogs=GSSConfigEnableDisable
		public Assignment getPortLogsAssignment_8() { return cPortLogsAssignment_8; }
		
		//GSSConfigEnableDisable
		public RuleCall getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0() { return cPortLogsGSSConfigEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'debugLog'
		public Keyword getDebugLogKeyword_10() { return cDebugLogKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//debugLog=GSSConfigEnableDisable
		public Assignment getDebugLogAssignment_12() { return cDebugLogAssignment_12; }
		
		//GSSConfigEnableDisable
		public RuleCall getDebugLogGSSConfigEnableDisableEnumRuleCall_12_0() { return cDebugLogGSSConfigEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'gssTabs'
		public Keyword getGssTabsKeyword_14() { return cGssTabsKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//gssTabs=GSSConfigEnableDisable
		public Assignment getGssTabsAssignment_16() { return cGssTabsAssignment_16; }
		
		//GSSConfigEnableDisable
		public RuleCall getGssTabsGSSConfigEnableDisableEnumRuleCall_16_0() { return cGssTabsGSSConfigEnableDisableEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSConfigGSSDiscardErrorFlagsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSDiscardErrorFlags");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGSSDiscardErrorFlagsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTxErrorsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTxErrorsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0 = (RuleCall)cTxErrorsAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNotExpectedPacketsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNotExpectedPacketsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0 = (RuleCall)cNotExpectedPacketsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFiltersKoKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFiltersKoAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0 = (RuleCall)cFiltersKoAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cValidTimesKoKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cValidTimesKoAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0 = (RuleCall)cValidTimesKoAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSConfigGSSDiscardErrorFlags:
		//	'GSSConfigGSSDiscardErrorFlags' '{'
		//	'txErrors' ':=' txErrors=GSSConfigEnableDisable ';'
		//	'notExpectedPackets' ':=' notExpectedPackets=GSSConfigEnableDisable ';'
		//	'filtersKo' ':=' filtersKo=GSSConfigEnableDisable ';'
		//	'validTimesKo' ':=' validTimesKo=GSSConfigEnableDisable ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSDiscardErrorFlags' '{' 'txErrors' ':=' txErrors=GSSConfigEnableDisable ';' 'notExpectedPackets' ':='
		//notExpectedPackets=GSSConfigEnableDisable ';' 'filtersKo' ':=' filtersKo=GSSConfigEnableDisable ';' 'validTimesKo'
		//':=' validTimesKo=GSSConfigEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGSSDiscardErrorFlags'
		public Keyword getGSSConfigGSSDiscardErrorFlagsKeyword_0() { return cGSSConfigGSSDiscardErrorFlagsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'txErrors'
		public Keyword getTxErrorsKeyword_2() { return cTxErrorsKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//txErrors=GSSConfigEnableDisable
		public Assignment getTxErrorsAssignment_4() { return cTxErrorsAssignment_4; }
		
		//GSSConfigEnableDisable
		public RuleCall getTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0() { return cTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'notExpectedPackets'
		public Keyword getNotExpectedPacketsKeyword_6() { return cNotExpectedPacketsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//notExpectedPackets=GSSConfigEnableDisable
		public Assignment getNotExpectedPacketsAssignment_8() { return cNotExpectedPacketsAssignment_8; }
		
		//GSSConfigEnableDisable
		public RuleCall getNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0() { return cNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'filtersKo'
		public Keyword getFiltersKoKeyword_10() { return cFiltersKoKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//filtersKo=GSSConfigEnableDisable
		public Assignment getFiltersKoAssignment_12() { return cFiltersKoAssignment_12; }
		
		//GSSConfigEnableDisable
		public RuleCall getFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0() { return cFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'validTimesKo'
		public Keyword getValidTimesKoKeyword_14() { return cValidTimesKoKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//validTimesKo=GSSConfigEnableDisable
		public Assignment getValidTimesKoAssignment_16() { return cValidTimesKoAssignment_16; }
		
		//GSSConfigEnableDisable
		public RuleCall getValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0() { return cValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSConfigProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigProtocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTypeLevelKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTypeLevelAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTypeLevelINTEGERParserRuleCall_12_0 = (RuleCall)cTypeLevelAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cTypeOffsetKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cTypeOffsetAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cTypeOffsetINTEGERParserRuleCall_16_0 = (RuleCall)cTypeOffsetAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cSubtypeOffsetKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cSubtypeOffsetAssignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final RuleCall cSubtypeOffsetINTEGERParserRuleCall_18_2_0 = (RuleCall)cSubtypeOffsetAssignment_18_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cSemicolonKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//GSSConfigProtocol:
		//	'GSSConfigProtocol' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'typeLevel' ':=' typeLevel=INTEGER ';'
		//	'typeOffset' ':=' typeOffset=INTEGER ';' ('subtypeOffset' ':=' subtypeOffset=INTEGER ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigProtocol' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'typeLevel' ':=' typeLevel=INTEGER ';'
		//'typeOffset' ':=' typeOffset=INTEGER ';' ('subtypeOffset' ':=' subtypeOffset=INTEGER ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigProtocol'
		public Keyword getGSSConfigProtocolKeyword_0() { return cGSSConfigProtocolKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'typeLevel'
		public Keyword getTypeLevelKeyword_10() { return cTypeLevelKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//typeLevel=INTEGER
		public Assignment getTypeLevelAssignment_12() { return cTypeLevelAssignment_12; }
		
		//INTEGER
		public RuleCall getTypeLevelINTEGERParserRuleCall_12_0() { return cTypeLevelINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'typeOffset'
		public Keyword getTypeOffsetKeyword_14() { return cTypeOffsetKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//typeOffset=INTEGER
		public Assignment getTypeOffsetAssignment_16() { return cTypeOffsetAssignment_16; }
		
		//INTEGER
		public RuleCall getTypeOffsetINTEGERParserRuleCall_16_0() { return cTypeOffsetINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('subtypeOffset' ':=' subtypeOffset=INTEGER ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'subtypeOffset'
		public Keyword getSubtypeOffsetKeyword_18_0() { return cSubtypeOffsetKeyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//subtypeOffset=INTEGER
		public Assignment getSubtypeOffsetAssignment_18_2() { return cSubtypeOffsetAssignment_18_2; }
		
		//INTEGER
		public RuleCall getSubtypeOffsetINTEGERParserRuleCall_18_2_0() { return cSubtypeOffsetINTEGERParserRuleCall_18_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
		
		//';'
		public Keyword getSemicolonKeyword_20() { return cSemicolonKeyword_20; }
	}
	public class GSSConfigMainInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigMainInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0 = (RuleCall)cIfTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cIfConfigKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cIfConfigAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cIfConfigGSSIfacePortConfigCrossReference_16_0 = (CrossReference)cIfConfigAssignment_16.eContents().get(0);
		private final RuleCall cIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cIfConfigGSSIfacePortConfigCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cIoTypeKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cIoTypeAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0 = (RuleCall)cIoTypeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cProtocolIDKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cProtocolIDAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cProtocolIDGSSConfigProtocolCrossReference_22_2_0 = (CrossReference)cProtocolIDAssignment_22_2.eContents().get(0);
		private final RuleCall cProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1 = (RuleCall)cProtocolIDGSSConfigProtocolCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Assignment cLevelInOutAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cLevelInOutGSSConfigLevelInOutParserRuleCall_23_0 = (RuleCall)cLevelInOutAssignment_23.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSConfigMainInterface:
		//	'GSSConfigMainInterface' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'ifType' ':=' ifType=GSSConfigMainInterfaceType ';'
		//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//	'ioType' ':=' ioType=GSSConfigMainInterfaceIOType ';' ('protocolID' ':='
		//	protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')?
		//	LevelInOut+=GSSConfigLevelInOut+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigMainInterface' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'ifType' ':='
		//ifType=GSSConfigMainInterfaceType ';' 'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//'ioType' ':=' ioType=GSSConfigMainInterfaceIOType ';' ('protocolID' ':='
		//protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')? LevelInOut+=GSSConfigLevelInOut+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigMainInterface'
		public Keyword getGSSConfigMainInterfaceKeyword_0() { return cGSSConfigMainInterfaceKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=STRING
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_0() { return cNameSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifType'
		public Keyword getIfTypeKeyword_10() { return cIfTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifType=GSSConfigMainInterfaceType
		public Assignment getIfTypeAssignment_12() { return cIfTypeAssignment_12; }
		
		//GSSConfigMainInterfaceType
		public RuleCall getIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0() { return cIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'ifConfig'
		public Keyword getIfConfigKeyword_14() { return cIfConfigKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName]
		public Assignment getIfConfigAssignment_16() { return cIfConfigAssignment_16; }
		
		//[iface::GSSIfacePortConfig|VersionedQualifiedName]
		public CrossReference getIfConfigGSSIfacePortConfigCrossReference_16_0() { return cIfConfigGSSIfacePortConfigCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1() { return cIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'ioType'
		public Keyword getIoTypeKeyword_18() { return cIoTypeKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//ioType=GSSConfigMainInterfaceIOType
		public Assignment getIoTypeAssignment_20() { return cIoTypeAssignment_20; }
		
		//GSSConfigMainInterfaceIOType
		public RuleCall getIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0() { return cIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('protocolID' ':=' protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'protocolID'
		public Keyword getProtocolIDKeyword_22_0() { return cProtocolIDKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName]
		public Assignment getProtocolIDAssignment_22_2() { return cProtocolIDAssignment_22_2; }
		
		//[GSSConfigProtocol|VersionedQualifiedReferenceName]
		public CrossReference getProtocolIDGSSConfigProtocolCrossReference_22_2_0() { return cProtocolIDGSSConfigProtocolCrossReference_22_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1() { return cProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//LevelInOut+=GSSConfigLevelInOut+
		public Assignment getLevelInOutAssignment_23() { return cLevelInOutAssignment_23; }
		
		//GSSConfigLevelInOut
		public RuleCall getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0() { return cLevelInOutGSSConfigLevelInOutParserRuleCall_23_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSConfigInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0 = (RuleCall)cIfTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cIfConfigKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cIfConfigAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cIfConfigGSSIfacePortConfigCrossReference_16_0 = (CrossReference)cIfConfigAssignment_16.eContents().get(0);
		private final RuleCall cIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cIfConfigGSSIfacePortConfigCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cIoTypeKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cIoTypeAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0 = (RuleCall)cIoTypeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cProtocolIDKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cProtocolIDAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cProtocolIDGSSConfigProtocolCrossReference_22_2_0 = (CrossReference)cProtocolIDAssignment_22_2.eContents().get(0);
		private final RuleCall cProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1 = (RuleCall)cProtocolIDGSSConfigProtocolCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Alternatives cAlternatives_23 = (Alternatives)cGroup.eContents().get(23);
		private final Assignment cLevelInOutAssignment_23_0 = (Assignment)cAlternatives_23.eContents().get(0);
		private final RuleCall cLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0 = (RuleCall)cLevelInOutAssignment_23_0.eContents().get(0);
		private final Assignment cLevelInAssignment_23_1 = (Assignment)cAlternatives_23.eContents().get(1);
		private final RuleCall cLevelInGSSConfigLevelInParserRuleCall_23_1_0 = (RuleCall)cLevelInAssignment_23_1.eContents().get(0);
		private final Assignment cLevelOutAssignment_23_2 = (Assignment)cAlternatives_23.eContents().get(2);
		private final RuleCall cLevelOutGSSConfigLevelOutParserRuleCall_23_2_0 = (RuleCall)cLevelOutAssignment_23_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSConfigInterface:
		//	'GSSConfigInterface' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'ifType' ':=' ifType=GSSConfigInterfaceType ';'
		//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//	'ioType' ':=' ioType=GSSConfigInterfaceIOType ';' ('protocolID' ':='
		//	protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSConfigLevelInOut |
		//	LevelIn+=GSSConfigLevelIn | LevelOut+=GSSConfigLevelOut)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigInterface' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'ifType' ':='
		//ifType=GSSConfigInterfaceType ';' 'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//'ioType' ':=' ioType=GSSConfigInterfaceIOType ';' ('protocolID' ':='
		//protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSConfigLevelInOut |
		//LevelIn+=GSSConfigLevelIn | LevelOut+=GSSConfigLevelOut)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigInterface'
		public Keyword getGSSConfigInterfaceKeyword_0() { return cGSSConfigInterfaceKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=STRING
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_0() { return cNameSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifType'
		public Keyword getIfTypeKeyword_10() { return cIfTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifType=GSSConfigInterfaceType
		public Assignment getIfTypeAssignment_12() { return cIfTypeAssignment_12; }
		
		//GSSConfigInterfaceType
		public RuleCall getIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0() { return cIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'ifConfig'
		public Keyword getIfConfigKeyword_14() { return cIfConfigKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName]
		public Assignment getIfConfigAssignment_16() { return cIfConfigAssignment_16; }
		
		//[iface::GSSIfacePortConfig|VersionedQualifiedName]
		public CrossReference getIfConfigGSSIfacePortConfigCrossReference_16_0() { return cIfConfigGSSIfacePortConfigCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1() { return cIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'ioType'
		public Keyword getIoTypeKeyword_18() { return cIoTypeKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//ioType=GSSConfigInterfaceIOType
		public Assignment getIoTypeAssignment_20() { return cIoTypeAssignment_20; }
		
		//GSSConfigInterfaceIOType
		public RuleCall getIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0() { return cIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('protocolID' ':=' protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'protocolID'
		public Keyword getProtocolIDKeyword_22_0() { return cProtocolIDKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName]
		public Assignment getProtocolIDAssignment_22_2() { return cProtocolIDAssignment_22_2; }
		
		//[GSSConfigProtocol|VersionedQualifiedReferenceName]
		public CrossReference getProtocolIDGSSConfigProtocolCrossReference_22_2_0() { return cProtocolIDGSSConfigProtocolCrossReference_22_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1() { return cProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//(LevelInOut+=GSSConfigLevelInOut | LevelIn+=GSSConfigLevelIn | LevelOut+=GSSConfigLevelOut)+
		public Alternatives getAlternatives_23() { return cAlternatives_23; }
		
		//LevelInOut+=GSSConfigLevelInOut
		public Assignment getLevelInOutAssignment_23_0() { return cLevelInOutAssignment_23_0; }
		
		//GSSConfigLevelInOut
		public RuleCall getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0() { return cLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0; }
		
		//LevelIn+=GSSConfigLevelIn
		public Assignment getLevelInAssignment_23_1() { return cLevelInAssignment_23_1; }
		
		//GSSConfigLevelIn
		public RuleCall getLevelInGSSConfigLevelInParserRuleCall_23_1_0() { return cLevelInGSSConfigLevelInParserRuleCall_23_1_0; }
		
		//LevelOut+=GSSConfigLevelOut
		public Assignment getLevelOutAssignment_23_2() { return cLevelOutAssignment_23_2; }
		
		//GSSConfigLevelOut
		public RuleCall getLevelOutGSSConfigLevelOutParserRuleCall_23_2_0() { return cLevelOutGSSConfigLevelOutParserRuleCall_23_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSConfigLevelInOutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelInOut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigLevelInOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTMformatKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTMformatAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0 = (CrossReference)cTMformatAssignment_12.eContents().get(0);
		private final RuleCall cTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cTCformatKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cTCformatAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cTCformatGSSTmTcFormatTmTCFormatCrossReference_16_0 = (CrossReference)cTCformatAssignment_16.eContents().get(0);
		private final RuleCall cTCformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cTCformatGSSTmTcFormatTmTCFormatCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cInputFilterKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cInputFilterAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final CrossReference cInputFilterGSSFilterFilterCrossReference_20_0 = (CrossReference)cInputFilterAssignment_20.eContents().get(0);
		private final RuleCall cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1 = (RuleCall)cInputFilterGSSFilterFilterCrossReference_20_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cExport_to_prev_LevelKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cExport_to_prev_LevelAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cExport_to_prev_LevelGSSExportExportCrossReference_22_2_0 = (CrossReference)cExport_to_prev_LevelAssignment_22_2.eContents().get(0);
		private final RuleCall cExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cExport_to_prev_LevelGSSExportExportCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Group cGroup_23 = (Group)cGroup.eContents().get(23);
		private final Keyword cImport_from_prev_LevelKeyword_23_0 = (Keyword)cGroup_23.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_23_1 = (Keyword)cGroup_23.eContents().get(1);
		private final Assignment cImport_from_prev_LevelAssignment_23_2 = (Assignment)cGroup_23.eContents().get(2);
		private final CrossReference cImport_from_prev_LevelGSSImportImportCrossReference_23_2_0 = (CrossReference)cImport_from_prev_LevelAssignment_23_2.eContents().get(0);
		private final RuleCall cImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1 = (RuleCall)cImport_from_prev_LevelGSSImportImportCrossReference_23_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_23_3 = (Keyword)cGroup_23.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSConfigLevelInOut:
		//	'GSSConfigLevelInOut' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TMformat' ':=' TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';'
		//	'TCformat' ':=' TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';'
		//	'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//	export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigLevelInOut' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TMformat' ':='
		//TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';' 'TCformat' ':='
		//TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';' 'inputFilter' ':='
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigLevelInOut'
		public Keyword getGSSConfigLevelInOutKeyword_0() { return cGSSConfigLevelInOutKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=STRING
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_0() { return cNameSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'TMformat'
		public Keyword getTMformatKeyword_10() { return cTMformatKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_12() { return cTMformatAssignment_12; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0() { return cTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'TCformat'
		public Keyword getTCformatKeyword_14() { return cTCformatKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getTCformatAssignment_16() { return cTCformatAssignment_16; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getTCformatGSSTmTcFormatTmTCFormatCrossReference_16_0() { return cTCformatGSSTmTcFormatTmTCFormatCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getTCformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_16_0_1() { return cTCformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_18() { return cInputFilterKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_20() { return cInputFilterAssignment_20; }
		
		//[filters::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_20_0() { return cInputFilterGSSFilterFilterCrossReference_20_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('export_to_prev_Level' ':=' export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'export_to_prev_Level'
		public Keyword getExport_to_prev_LevelKeyword_22_0() { return cExport_to_prev_LevelKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getExport_to_prev_LevelAssignment_22_2() { return cExport_to_prev_LevelAssignment_22_2; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0() { return cExport_to_prev_LevelGSSExportExportCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_23_0() { return cImport_from_prev_LevelKeyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_23_2() { return cImport_from_prev_LevelAssignment_23_2; }
		
		//[imports::GSSImportImport|VersionedQualifiedName]
		public CrossReference getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0() { return cImport_from_prev_LevelGSSImportImportCrossReference_23_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1() { return cImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_23_3() { return cSemicolonKeyword_23_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSConfigLevelInElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelIn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigLevelInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTCformatKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTCformatAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cTCformatGSSTmTcFormatTmTCFormatCrossReference_12_0 = (CrossReference)cTCformatAssignment_12.eContents().get(0);
		private final RuleCall cTCformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTCformatGSSTmTcFormatTmTCFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cExport_to_prev_LevelKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cExport_to_prev_LevelAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cExport_to_prev_LevelGSSExportExportCrossReference_14_2_0 = (CrossReference)cExport_to_prev_LevelAssignment_14_2.eContents().get(0);
		private final RuleCall cExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1 = (RuleCall)cExport_to_prev_LevelGSSExportExportCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSConfigLevelIn:
		//	'GSSConfigLevelIn' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TCformat' ':=' TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';' ('export_to_prev_Level'
		//	':=' export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigLevelIn' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TCformat' ':='
		//TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigLevelIn'
		public Keyword getGSSConfigLevelInKeyword_0() { return cGSSConfigLevelInKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=STRING
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_0() { return cNameSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'TCformat'
		public Keyword getTCformatKeyword_10() { return cTCformatKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getTCformatAssignment_12() { return cTCformatAssignment_12; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getTCformatGSSTmTcFormatTmTCFormatCrossReference_12_0() { return cTCformatGSSTmTcFormatTmTCFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTCformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTCformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('export_to_prev_Level' ':=' export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'export_to_prev_Level'
		public Keyword getExport_to_prev_LevelKeyword_14_0() { return cExport_to_prev_LevelKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getExport_to_prev_LevelAssignment_14_2() { return cExport_to_prev_LevelAssignment_14_2; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0() { return cExport_to_prev_LevelGSSExportExportCrossReference_14_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1() { return cExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSConfigLevelOutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelOut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigLevelOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTMformatKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTMformatAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0 = (CrossReference)cTMformatAssignment_12.eContents().get(0);
		private final RuleCall cTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cInputFilterKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInputFilterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cInputFilterGSSFilterFilterCrossReference_16_0 = (CrossReference)cInputFilterAssignment_16.eContents().get(0);
		private final RuleCall cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cInputFilterGSSFilterFilterCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cImport_from_prev_LevelKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cImport_from_prev_LevelAssignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cImport_from_prev_LevelGSSImportImportCrossReference_18_2_0 = (CrossReference)cImport_from_prev_LevelAssignment_18_2.eContents().get(0);
		private final RuleCall cImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cImport_from_prev_LevelGSSImportImportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cSemicolonKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//GSSConfigLevelOut:
		//	'GSSConfigLevelOut' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TMformat' ':=' TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';'
		//	'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigLevelOut' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TMformat' ':='
		//TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';' 'inputFilter' ':='
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
		//import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigLevelOut'
		public Keyword getGSSConfigLevelOutKeyword_0() { return cGSSConfigLevelOutKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=STRING
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_0() { return cNameSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'TMformat'
		public Keyword getTMformatKeyword_10() { return cTMformatKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_12() { return cTMformatAssignment_12; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0() { return cTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_14() { return cInputFilterKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_16() { return cInputFilterAssignment_16; }
		
		//[filters::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_16_0() { return cInputFilterGSSFilterFilterCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_18_0() { return cImport_from_prev_LevelKeyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_18_2() { return cImport_from_prev_LevelAssignment_18_2; }
		
		//[imports::GSSImportImport|VersionedQualifiedName]
		public CrossReference getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0() { return cImport_from_prev_LevelGSSImportImportCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
		
		//';'
		public Keyword getSemicolonKeyword_20() { return cSemicolonKeyword_20; }
	}
	public class GSSConfigSpecialPacketElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigSpecialPacket");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigSpecialPacketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cStatusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatusGSSConfigEnableDisableEnumRuleCall_4_0 = (RuleCall)cStatusAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIdKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIdAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIdINTEGERParserRuleCall_12_0 = (RuleCall)cIdAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cIfRefKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cIfRefAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cIfRefINTEGERParserRuleCall_16_0 = (RuleCall)cIfRefAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cLevelsKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cLevelsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cLevelsINTEGERParserRuleCall_20_0 = (RuleCall)cLevelsAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cLevelRefKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cColonEqualsSignKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Assignment cLevelRefAssignment_24 = (Assignment)cGroup.eContents().get(24);
		private final RuleCall cLevelRefINTEGERParserRuleCall_24_0 = (RuleCall)cLevelRefAssignment_24.eContents().get(0);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		private final Keyword cInputFilterKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Keyword cColonEqualsSignKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Assignment cInputFilterAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final CrossReference cInputFilterGSSFilterFilterCrossReference_28_0 = (CrossReference)cInputFilterAssignment_28.eContents().get(0);
		private final RuleCall cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1 = (RuleCall)cInputFilterGSSFilterFilterCrossReference_28_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Assignment cUpperLevelsAssignment_30 = (Assignment)cGroup.eContents().get(30);
		private final RuleCall cUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0 = (RuleCall)cUpperLevelsAssignment_30.eContents().get(0);
		private final Assignment cPrintingDataAssignment_31 = (Assignment)cGroup.eContents().get(31);
		private final RuleCall cPrintingDataGSSConfigPrintingDataParserRuleCall_31_0 = (RuleCall)cPrintingDataAssignment_31.eContents().get(0);
		private final Alternatives cAlternatives_32 = (Alternatives)cGroup.eContents().get(32);
		private final Assignment cPeriodAssignment_32_0 = (Assignment)cAlternatives_32.eContents().get(0);
		private final RuleCall cPeriodGSSConfigPeriodParserRuleCall_32_0_0 = (RuleCall)cPeriodAssignment_32_0.eContents().get(0);
		private final Assignment cIntervalRangeAssignment_32_1 = (Assignment)cAlternatives_32.eContents().get(1);
		private final RuleCall cIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0 = (RuleCall)cIntervalRangeAssignment_32_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_33 = (Keyword)cGroup.eContents().get(33);
		private final Keyword cSemicolonKeyword_34 = (Keyword)cGroup.eContents().get(34);
		
		//GSSConfigSpecialPacket:
		//	'GSSConfigSpecialPacket' '{'
		//	'status' ':=' status=GSSConfigEnableDisable ';'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'levels' ':=' levels=INTEGER ';'
		//	'levelRef' ':=' levelRef=INTEGER ';'
		//	'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';'
		//	UpperLevels+=GSSConfigUpperLevels?
		//	printingData=GSSConfigPrintingData (period=GSSConfigPeriod | intervalRange=GSSConfigIntervalRange)?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigSpecialPacket' '{' 'status' ':=' status=GSSConfigEnableDisable ';' 'name' ':=' name=STRING ';' 'id' ':='
		//id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';' 'levels' ':=' levels=INTEGER ';' 'levelRef' ':=' levelRef=INTEGER ';'
		//'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';'
		//UpperLevels+=GSSConfigUpperLevels? printingData=GSSConfigPrintingData (period=GSSConfigPeriod |
		//intervalRange=GSSConfigIntervalRange)? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigSpecialPacket'
		public Keyword getGSSConfigSpecialPacketKeyword_0() { return cGSSConfigSpecialPacketKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'status'
		public Keyword getStatusKeyword_2() { return cStatusKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//status=GSSConfigEnableDisable
		public Assignment getStatusAssignment_4() { return cStatusAssignment_4; }
		
		//GSSConfigEnableDisable
		public RuleCall getStatusGSSConfigEnableDisableEnumRuleCall_4_0() { return cStatusGSSConfigEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=STRING
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_0() { return cNameSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'id'
		public Keyword getIdKeyword_10() { return cIdKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//id=INTEGER
		public Assignment getIdAssignment_12() { return cIdAssignment_12; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_12_0() { return cIdINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_14() { return cIfRefKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_16() { return cIfRefAssignment_16; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_16_0() { return cIfRefINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'levels'
		public Keyword getLevelsKeyword_18() { return cLevelsKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//levels=INTEGER
		public Assignment getLevelsAssignment_20() { return cLevelsAssignment_20; }
		
		//INTEGER
		public RuleCall getLevelsINTEGERParserRuleCall_20_0() { return cLevelsINTEGERParserRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//'levelRef'
		public Keyword getLevelRefKeyword_22() { return cLevelRefKeyword_22; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23() { return cColonEqualsSignKeyword_23; }
		
		//levelRef=INTEGER
		public Assignment getLevelRefAssignment_24() { return cLevelRefAssignment_24; }
		
		//INTEGER
		public RuleCall getLevelRefINTEGERParserRuleCall_24_0() { return cLevelRefINTEGERParserRuleCall_24_0; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_26() { return cInputFilterKeyword_26; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27() { return cColonEqualsSignKeyword_27; }
		
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_28() { return cInputFilterAssignment_28; }
		
		//[filters::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_28_0() { return cInputFilterGSSFilterFilterCrossReference_28_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_29() { return cSemicolonKeyword_29; }
		
		//UpperLevels+=GSSConfigUpperLevels?
		public Assignment getUpperLevelsAssignment_30() { return cUpperLevelsAssignment_30; }
		
		//GSSConfigUpperLevels
		public RuleCall getUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0() { return cUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0; }
		
		//printingData=GSSConfigPrintingData
		public Assignment getPrintingDataAssignment_31() { return cPrintingDataAssignment_31; }
		
		//GSSConfigPrintingData
		public RuleCall getPrintingDataGSSConfigPrintingDataParserRuleCall_31_0() { return cPrintingDataGSSConfigPrintingDataParserRuleCall_31_0; }
		
		//(period=GSSConfigPeriod | intervalRange=GSSConfigIntervalRange)?
		public Alternatives getAlternatives_32() { return cAlternatives_32; }
		
		//period=GSSConfigPeriod
		public Assignment getPeriodAssignment_32_0() { return cPeriodAssignment_32_0; }
		
		//GSSConfigPeriod
		public RuleCall getPeriodGSSConfigPeriodParserRuleCall_32_0_0() { return cPeriodGSSConfigPeriodParserRuleCall_32_0_0; }
		
		//intervalRange=GSSConfigIntervalRange
		public Assignment getIntervalRangeAssignment_32_1() { return cIntervalRangeAssignment_32_1; }
		
		//GSSConfigIntervalRange
		public RuleCall getIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0() { return cIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_33() { return cRightCurlyBracketKeyword_33; }
		
		//';'
		public Keyword getSemicolonKeyword_34() { return cSemicolonKeyword_34; }
	}
	public class GSSConfigUpperLevelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigUpperLevelsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUpperLevelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUpperLevelGSSConfigUpperLevelParserRuleCall_2_0 = (RuleCall)cUpperLevelAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSConfigUpperLevels:
		//	'GSSConfigUpperLevels' '{'
		//	UpperLevel+=GSSConfigUpperLevel+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigUpperLevels' '{' UpperLevel+=GSSConfigUpperLevel+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigUpperLevels'
		public Keyword getGSSConfigUpperLevelsKeyword_0() { return cGSSConfigUpperLevelsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//UpperLevel+=GSSConfigUpperLevel+
		public Assignment getUpperLevelAssignment_2() { return cUpperLevelAssignment_2; }
		
		//GSSConfigUpperLevel
		public RuleCall getUpperLevelGSSConfigUpperLevelParserRuleCall_2_0() { return cUpperLevelGSSConfigUpperLevelParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSConfigPrintingDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPrintingData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPrintingDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPrintStatusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPrintStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0 = (RuleCall)cPrintStatusAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStructuredDataAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStructuredDataGSSConfigStructuredDataParserRuleCall_6_0 = (RuleCall)cStructuredDataAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSConfigPrintingData:
		//	'GSSConfigPrintingData' '{'
		//	'printStatus' ':=' printStatus=GSSConfigEnableDisable ';'
		//	structuredData=GSSConfigStructuredData?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPrintingData' '{' 'printStatus' ':=' printStatus=GSSConfigEnableDisable ';'
		//structuredData=GSSConfigStructuredData? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPrintingData'
		public Keyword getGSSConfigPrintingDataKeyword_0() { return cGSSConfigPrintingDataKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'printStatus'
		public Keyword getPrintStatusKeyword_2() { return cPrintStatusKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//printStatus=GSSConfigEnableDisable
		public Assignment getPrintStatusAssignment_4() { return cPrintStatusAssignment_4; }
		
		//GSSConfigEnableDisable
		public RuleCall getPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0() { return cPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//structuredData=GSSConfigStructuredData?
		public Assignment getStructuredDataAssignment_6() { return cStructuredDataAssignment_6; }
		
		//GSSConfigStructuredData
		public RuleCall getStructuredDataGSSConfigStructuredDataParserRuleCall_6_0() { return cStructuredDataGSSConfigStructuredDataParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSConfigPeriodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPeriodKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMin_valueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMin_valueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMin_valueINTEGERParserRuleCall_4_0 = (RuleCall)cMin_valueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMin_unitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMin_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMin_unitGSSConfigUnitEnumRuleCall_8_0 = (RuleCall)cMin_unitAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cMax_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cMax_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cMax_valueINTEGERParserRuleCall_12_0 = (RuleCall)cMax_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cMax_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cMax_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cMax_unitGSSConfigUnitEnumRuleCall_16_0 = (RuleCall)cMax_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSConfigPeriod:
		//	'GSSConfigPeriod' '{'
		//	'min_value' ':=' min_value=INTEGER ';'
		//	'min_unit' ':=' min_unit=GSSConfigUnit ';'
		//	'max_value' ':=' max_value=INTEGER ';'
		//	'max_unit' ':=' max_unit=GSSConfigUnit ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPeriod' '{' 'min_value' ':=' min_value=INTEGER ';' 'min_unit' ':=' min_unit=GSSConfigUnit ';' 'max_value' ':='
		//max_value=INTEGER ';' 'max_unit' ':=' max_unit=GSSConfigUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPeriod'
		public Keyword getGSSConfigPeriodKeyword_0() { return cGSSConfigPeriodKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'min_value'
		public Keyword getMin_valueKeyword_2() { return cMin_valueKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//min_value=INTEGER
		public Assignment getMin_valueAssignment_4() { return cMin_valueAssignment_4; }
		
		//INTEGER
		public RuleCall getMin_valueINTEGERParserRuleCall_4_0() { return cMin_valueINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'min_unit'
		public Keyword getMin_unitKeyword_6() { return cMin_unitKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//min_unit=GSSConfigUnit
		public Assignment getMin_unitAssignment_8() { return cMin_unitAssignment_8; }
		
		//GSSConfigUnit
		public RuleCall getMin_unitGSSConfigUnitEnumRuleCall_8_0() { return cMin_unitGSSConfigUnitEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'max_value'
		public Keyword getMax_valueKeyword_10() { return cMax_valueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//max_value=INTEGER
		public Assignment getMax_valueAssignment_12() { return cMax_valueAssignment_12; }
		
		//INTEGER
		public RuleCall getMax_valueINTEGERParserRuleCall_12_0() { return cMax_valueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'max_unit'
		public Keyword getMax_unitKeyword_14() { return cMax_unitKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//max_unit=GSSConfigUnit
		public Assignment getMax_unitAssignment_16() { return cMax_unitAssignment_16; }
		
		//GSSConfigUnit
		public RuleCall getMax_unitGSSConfigUnitEnumRuleCall_16_0() { return cMax_unitGSSConfigUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSConfigIntervalRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigIntervalRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigIntervalRangeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMinKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMinAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMinINTEGERParserRuleCall_4_0 = (RuleCall)cMinAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMaxKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMaxAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMaxINTEGERParserRuleCall_8_0 = (RuleCall)cMaxAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cInterval_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cInterval_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cInterval_valueINTEGERParserRuleCall_12_0 = (RuleCall)cInterval_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cInterval_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInterval_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cInterval_unitGSSConfigUnitEnumRuleCall_16_0 = (RuleCall)cInterval_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSConfigIntervalRange:
		//	'GSSConfigIntervalRange' '{'
		//	'min' ':=' min=INTEGER ';'
		//	'max' ':=' max=INTEGER ';'
		//	'interval_value' ':=' interval_value=INTEGER ';'
		//	'interval_unit' ':=' interval_unit=GSSConfigUnit ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigIntervalRange' '{' 'min' ':=' min=INTEGER ';' 'max' ':=' max=INTEGER ';' 'interval_value' ':='
		//interval_value=INTEGER ';' 'interval_unit' ':=' interval_unit=GSSConfigUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigIntervalRange'
		public Keyword getGSSConfigIntervalRangeKeyword_0() { return cGSSConfigIntervalRangeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'min'
		public Keyword getMinKeyword_2() { return cMinKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//min=INTEGER
		public Assignment getMinAssignment_4() { return cMinAssignment_4; }
		
		//INTEGER
		public RuleCall getMinINTEGERParserRuleCall_4_0() { return cMinINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'max'
		public Keyword getMaxKeyword_6() { return cMaxKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//max=INTEGER
		public Assignment getMaxAssignment_8() { return cMaxAssignment_8; }
		
		//INTEGER
		public RuleCall getMaxINTEGERParserRuleCall_8_0() { return cMaxINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'interval_value'
		public Keyword getInterval_valueKeyword_10() { return cInterval_valueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//interval_value=INTEGER
		public Assignment getInterval_valueAssignment_12() { return cInterval_valueAssignment_12; }
		
		//INTEGER
		public RuleCall getInterval_valueINTEGERParserRuleCall_12_0() { return cInterval_valueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'interval_unit'
		public Keyword getInterval_unitKeyword_14() { return cInterval_unitKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//interval_unit=GSSConfigUnit
		public Assignment getInterval_unitAssignment_16() { return cInterval_unitAssignment_16; }
		
		//GSSConfigUnit
		public RuleCall getInterval_unitGSSConfigUnitEnumRuleCall_16_0() { return cInterval_unitGSSConfigUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSConfigUpperLevelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigUpperLevelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLevelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLevelAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0 = (RuleCall)cLevelAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTMformatKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cTMformatAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cTMformatGSSTmTcFormatTmTCFormatCrossReference_6_2_0 = (CrossReference)cTMformatAssignment_6_2.eContents().get(0);
		private final RuleCall cTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cTMformatGSSTmTcFormatTmTCFormatCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cInputFilterKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cInputFilterAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final CrossReference cInputFilterGSSFilterFilterCrossReference_7_2_0 = (CrossReference)cInputFilterAssignment_7_2.eContents().get(0);
		private final RuleCall cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1 = (RuleCall)cInputFilterGSSFilterFilterCrossReference_7_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7_3 = (Keyword)cGroup_7.eContents().get(3);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cImport_from_prev_LevelKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cImport_from_prev_LevelAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final CrossReference cImport_from_prev_LevelGSSImportImportCrossReference_8_2_0 = (CrossReference)cImport_from_prev_LevelAssignment_8_2.eContents().get(0);
		private final RuleCall cImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1 = (RuleCall)cImport_from_prev_LevelGSSImportImportCrossReference_8_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_8_3 = (Keyword)cGroup_8.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//GSSConfigUpperLevel:
		//	'GSSConfigUpperLevel' '{'
		//	'level' ':=' level=GSSConfigUpperLevelLevel ';' ('TMformat' ':='
		//	TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
		//	inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigUpperLevel' '{' 'level' ':=' level=GSSConfigUpperLevelLevel ';' ('TMformat' ':='
		//TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigUpperLevel'
		public Keyword getGSSConfigUpperLevelKeyword_0() { return cGSSConfigUpperLevelKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'level'
		public Keyword getLevelKeyword_2() { return cLevelKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//level=GSSConfigUpperLevelLevel
		public Assignment getLevelAssignment_4() { return cLevelAssignment_4; }
		
		//GSSConfigUpperLevelLevel
		public RuleCall getLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0() { return cLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('TMformat' ':=' TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'TMformat'
		public Keyword getTMformatKeyword_6_0() { return cTMformatKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_6_2() { return cTMformatAssignment_6_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getTMformatGSSTmTcFormatTmTCFormatCrossReference_6_2_0() { return cTMformatGSSTmTcFormatTmTCFormatCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cTMformatGSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//('inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_7_0() { return cInputFilterKeyword_7_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7_1() { return cColonEqualsSignKeyword_7_1; }
		
		//inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_7_2() { return cInputFilterAssignment_7_2; }
		
		//[filters::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_7_2_0() { return cInputFilterGSSFilterFilterCrossReference_7_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_7_3() { return cSemicolonKeyword_7_3; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_8_0() { return cImport_from_prev_LevelKeyword_8_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_8_1() { return cColonEqualsSignKeyword_8_1; }
		
		//import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_8_2() { return cImport_from_prev_LevelAssignment_8_2; }
		
		//[imports::GSSImportImport|VersionedQualifiedName]
		public CrossReference getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0() { return cImport_from_prev_LevelGSSImportImportCrossReference_8_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1() { return cImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_8_3() { return cSemicolonKeyword_8_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class GSSConfigStructuredDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigStructuredData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigStructuredDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLevelRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLevelRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLevelRefINTEGERParserRuleCall_4_0 = (RuleCall)cLevelRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFirstFieldKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFirstFieldAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFirstFieldINTEGERParserRuleCall_8_0 = (RuleCall)cFirstFieldAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSConfigStructuredData:
		//	'GSSConfigStructuredData' '{'
		//	'levelRef' ':=' levelRef=INTEGER ';'
		//	'firstField' ':=' firstField=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigStructuredData' '{' 'levelRef' ':=' levelRef=INTEGER ';' 'firstField' ':=' firstField=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigStructuredData'
		public Keyword getGSSConfigStructuredDataKeyword_0() { return cGSSConfigStructuredDataKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'levelRef'
		public Keyword getLevelRefKeyword_2() { return cLevelRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//levelRef=INTEGER
		public Assignment getLevelRefAssignment_4() { return cLevelRefAssignment_4; }
		
		//INTEGER
		public RuleCall getLevelRefINTEGERParserRuleCall_4_0() { return cLevelRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'firstField'
		public Keyword getFirstFieldKeyword_6() { return cFirstFieldKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//firstField=INTEGER
		public Assignment getFirstFieldAssignment_8() { return cFirstFieldAssignment_8; }
		
		//INTEGER
		public RuleCall getFirstFieldINTEGERParserRuleCall_8_0() { return cFirstFieldINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSConfigPeriodicTCLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPeriodicTCLevel2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cPeriod_valueKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cPeriod_valueAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cPeriod_valueINTEGERParserRuleCall_16_0 = (RuleCall)cPeriod_valueAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cPeriod_unitKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cPeriod_unitAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cPeriod_unitGSSConfigUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel2Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel2Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel2GSSTmTcFormatTmTCFormatCrossReference_22_2_0 = (CrossReference)cLevel2Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel2GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel2GSSTmTcFormatTmTCFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level2Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level2Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level2GSSExportExportCrossReference_25_0 = (CrossReference)cApp_to_level2Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level2GSSExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Group cGroup_27 = (Group)cGroup.eContents().get(27);
		private final Keyword cLevel1Keyword_27_0 = (Keyword)cGroup_27.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_27_1 = (Keyword)cGroup_27.eContents().get(1);
		private final Assignment cLevel1Assignment_27_2 = (Assignment)cGroup_27.eContents().get(2);
		private final CrossReference cLevel1GSSTmTcFormatTmTCFormatCrossReference_27_2_0 = (CrossReference)cLevel1Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel1GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel1GSSTmTcFormatTmTCFormatCrossReference_27_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_27_3 = (Keyword)cGroup_27.eContents().get(3);
		private final Group cGroup_28 = (Group)cGroup.eContents().get(28);
		private final Keyword cLevel2_to_level1Keyword_28_0 = (Keyword)cGroup_28.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_28_1 = (Keyword)cGroup_28.eContents().get(1);
		private final Assignment cLevel2_to_level1Assignment_28_2 = (Assignment)cGroup_28.eContents().get(2);
		private final CrossReference cLevel2_to_level1GSSExportExportCrossReference_28_2_0 = (CrossReference)cLevel2_to_level1Assignment_28_2.eContents().get(0);
		private final RuleCall cLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1 = (RuleCall)cLevel2_to_level1GSSExportExportCrossReference_28_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_28_3 = (Keyword)cGroup_28.eContents().get(3);
		private final Group cGroup_29 = (Group)cGroup.eContents().get(29);
		private final Keyword cLevel0Keyword_29_0 = (Keyword)cGroup_29.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_29_1 = (Keyword)cGroup_29.eContents().get(1);
		private final Assignment cLevel0Assignment_29_2 = (Assignment)cGroup_29.eContents().get(2);
		private final CrossReference cLevel0GSSTmTcFormatTmTCFormatCrossReference_29_2_0 = (CrossReference)cLevel0Assignment_29_2.eContents().get(0);
		private final RuleCall cLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_29_2_0_1 = (RuleCall)cLevel0GSSTmTcFormatTmTCFormatCrossReference_29_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_29_3 = (Keyword)cGroup_29.eContents().get(3);
		private final Group cGroup_30 = (Group)cGroup.eContents().get(30);
		private final Keyword cLevel1_to_level0Keyword_30_0 = (Keyword)cGroup_30.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_30_1 = (Keyword)cGroup_30.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_30_2 = (Assignment)cGroup_30.eContents().get(2);
		private final CrossReference cLevel1_to_level0GSSExportExportCrossReference_30_2_0 = (CrossReference)cLevel1_to_level0Assignment_30_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1 = (RuleCall)cLevel1_to_level0GSSExportExportCrossReference_30_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_30_3 = (Keyword)cGroup_30.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_31 = (Keyword)cGroup.eContents().get(31);
		private final Keyword cSemicolonKeyword_32 = (Keyword)cGroup.eContents().get(32);
		
		//GSSConfigPeriodicTCLevel2:
		//	'GSSConfigPeriodicTCLevel2' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level2' ':='
		//	level2=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		//	'app_to_level2' ':=' app_to_level2=[export::GSSExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//	level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//	level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//	level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPeriodicTCLevel2' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level2' ':='
		//level2=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? 'app_to_level2' ':='
		//app_to_level2=[export::GSSExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPeriodicTCLevel2'
		public Keyword getGSSConfigPeriodicTCLevel2Keyword_0() { return cGSSConfigPeriodicTCLevel2Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'period_value'
		public Keyword getPeriod_valueKeyword_14() { return cPeriod_valueKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//period_value=INTEGER
		public Assignment getPeriod_valueAssignment_16() { return cPeriod_valueAssignment_16; }
		
		//INTEGER
		public RuleCall getPeriod_valueINTEGERParserRuleCall_16_0() { return cPeriod_valueINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'period_unit'
		public Keyword getPeriod_unitKeyword_18() { return cPeriod_unitKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//period_unit=GSSConfigUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSConfigUnit
		public RuleCall getPeriod_unitGSSConfigUnitEnumRuleCall_20_0() { return cPeriod_unitGSSConfigUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level2' ':=' level2=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level2'
		public Keyword getLevel2Keyword_22_0() { return cLevel2Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level2=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_22_2() { return cLevel2Assignment_22_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getLevel2GSSTmTcFormatTmTCFormatCrossReference_22_2_0() { return cLevel2GSSTmTcFormatTmTCFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel2GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//'app_to_level2'
		public Keyword getApp_to_level2Keyword_23() { return cApp_to_level2Keyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//app_to_level2=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level2Assignment_25() { return cApp_to_level2Assignment_25; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level2GSSExportExportCrossReference_25_0() { return cApp_to_level2GSSExportExportCrossReference_25_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1() { return cApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//('level1' ':=' level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level1'
		public Keyword getLevel1Keyword_27_0() { return cLevel1Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_27_2() { return cLevel1Assignment_27_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getLevel1GSSTmTcFormatTmTCFormatCrossReference_27_2_0() { return cLevel1GSSTmTcFormatTmTCFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel1GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_27_3() { return cSemicolonKeyword_27_3; }
		
		//('level2_to_level1' ':=' level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_28() { return cGroup_28; }
		
		//'level2_to_level1'
		public Keyword getLevel2_to_level1Keyword_28_0() { return cLevel2_to_level1Keyword_28_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_28_1() { return cColonEqualsSignKeyword_28_1; }
		
		//level2_to_level1=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getLevel2_to_level1Assignment_28_2() { return cLevel2_to_level1Assignment_28_2; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getLevel2_to_level1GSSExportExportCrossReference_28_2_0() { return cLevel2_to_level1GSSExportExportCrossReference_28_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1() { return cLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_28_3() { return cSemicolonKeyword_28_3; }
		
		//('level0' ':=' level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_29() { return cGroup_29; }
		
		//'level0'
		public Keyword getLevel0Keyword_29_0() { return cLevel0Keyword_29_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_29_1() { return cColonEqualsSignKeyword_29_1; }
		
		//level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_29_2() { return cLevel0Assignment_29_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getLevel0GSSTmTcFormatTmTCFormatCrossReference_29_2_0() { return cLevel0GSSTmTcFormatTmTCFormatCrossReference_29_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_29_2_0_1() { return cLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_29_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_29_3() { return cSemicolonKeyword_29_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_30() { return cGroup_30; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_30_0() { return cLevel1_to_level0Keyword_30_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_30_1() { return cColonEqualsSignKeyword_30_1; }
		
		//level1_to_level0=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_30_2() { return cLevel1_to_level0Assignment_30_2; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0GSSExportExportCrossReference_30_2_0() { return cLevel1_to_level0GSSExportExportCrossReference_30_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1() { return cLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_30_3() { return cSemicolonKeyword_30_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_31() { return cRightCurlyBracketKeyword_31; }
		
		//';'
		public Keyword getSemicolonKeyword_32() { return cSemicolonKeyword_32; }
	}
	public class GSSConfigPeriodicTCLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPeriodicTCLevel1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cPeriod_valueKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cPeriod_valueAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cPeriod_valueINTEGERParserRuleCall_16_0 = (RuleCall)cPeriod_valueAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cPeriod_unitKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cPeriod_unitAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cPeriod_unitGSSConfigUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel1Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel1Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel1GSSTmTcFormatTmTCFormatCrossReference_22_2_0 = (CrossReference)cLevel1Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel1GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel1GSSTmTcFormatTmTCFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level1Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level1Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level1GSSExportExportCrossReference_25_0 = (CrossReference)cApp_to_level1Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level1GSSExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Group cGroup_27 = (Group)cGroup.eContents().get(27);
		private final Keyword cLevel0Keyword_27_0 = (Keyword)cGroup_27.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_27_1 = (Keyword)cGroup_27.eContents().get(1);
		private final Assignment cLevel0Assignment_27_2 = (Assignment)cGroup_27.eContents().get(2);
		private final CrossReference cLevel0GSSTmTcFormatTmTCFormatCrossReference_27_2_0 = (CrossReference)cLevel0Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel0GSSTmTcFormatTmTCFormatCrossReference_27_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_27_3 = (Keyword)cGroup_27.eContents().get(3);
		private final Group cGroup_28 = (Group)cGroup.eContents().get(28);
		private final Keyword cLevel1_to_level0Keyword_28_0 = (Keyword)cGroup_28.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_28_1 = (Keyword)cGroup_28.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_28_2 = (Assignment)cGroup_28.eContents().get(2);
		private final CrossReference cLevel1_to_level0GSSExportExportCrossReference_28_2_0 = (CrossReference)cLevel1_to_level0Assignment_28_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1 = (RuleCall)cLevel1_to_level0GSSExportExportCrossReference_28_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_28_3 = (Keyword)cGroup_28.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Keyword cSemicolonKeyword_30 = (Keyword)cGroup.eContents().get(30);
		
		//GSSConfigPeriodicTCLevel1:
		//	'GSSConfigPeriodicTCLevel1' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level1' ':='
		//	level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		//	'app_to_level1' ':=' app_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//	level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPeriodicTCLevel1' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level1' ':='
		//level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? 'app_to_level1' ':='
		//app_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPeriodicTCLevel1'
		public Keyword getGSSConfigPeriodicTCLevel1Keyword_0() { return cGSSConfigPeriodicTCLevel1Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'period_value'
		public Keyword getPeriod_valueKeyword_14() { return cPeriod_valueKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//period_value=INTEGER
		public Assignment getPeriod_valueAssignment_16() { return cPeriod_valueAssignment_16; }
		
		//INTEGER
		public RuleCall getPeriod_valueINTEGERParserRuleCall_16_0() { return cPeriod_valueINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'period_unit'
		public Keyword getPeriod_unitKeyword_18() { return cPeriod_unitKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//period_unit=GSSConfigUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSConfigUnit
		public RuleCall getPeriod_unitGSSConfigUnitEnumRuleCall_20_0() { return cPeriod_unitGSSConfigUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level1' ':=' level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level1'
		public Keyword getLevel1Keyword_22_0() { return cLevel1Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_22_2() { return cLevel1Assignment_22_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getLevel1GSSTmTcFormatTmTCFormatCrossReference_22_2_0() { return cLevel1GSSTmTcFormatTmTCFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel1GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//'app_to_level1'
		public Keyword getApp_to_level1Keyword_23() { return cApp_to_level1Keyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//app_to_level1=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level1Assignment_25() { return cApp_to_level1Assignment_25; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level1GSSExportExportCrossReference_25_0() { return cApp_to_level1GSSExportExportCrossReference_25_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1() { return cApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//('level0' ':=' level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level0'
		public Keyword getLevel0Keyword_27_0() { return cLevel0Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_27_2() { return cLevel0Assignment_27_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getLevel0GSSTmTcFormatTmTCFormatCrossReference_27_2_0() { return cLevel0GSSTmTcFormatTmTCFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_27_3() { return cSemicolonKeyword_27_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_28() { return cGroup_28; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_28_0() { return cLevel1_to_level0Keyword_28_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_28_1() { return cColonEqualsSignKeyword_28_1; }
		
		//level1_to_level0=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_28_2() { return cLevel1_to_level0Assignment_28_2; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0GSSExportExportCrossReference_28_2_0() { return cLevel1_to_level0GSSExportExportCrossReference_28_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1() { return cLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_28_3() { return cSemicolonKeyword_28_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_29() { return cRightCurlyBracketKeyword_29; }
		
		//';'
		public Keyword getSemicolonKeyword_30() { return cSemicolonKeyword_30; }
	}
	public class GSSConfigPeriodicTCLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPeriodicTCLevel0Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cPeriod_valueKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cPeriod_valueAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cPeriod_valueINTEGERParserRuleCall_16_0 = (RuleCall)cPeriod_valueAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cPeriod_unitKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cPeriod_unitAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cPeriod_unitGSSConfigUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel0Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel0Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel0GSSTmTcFormatTmTCFormatCrossReference_22_2_0 = (CrossReference)cLevel0Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel0GSSTmTcFormatTmTCFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level0Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level0Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level0GSSExportExportCrossReference_25_0 = (CrossReference)cApp_to_level0Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level0GSSExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Keyword cRightCurlyBracketKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Keyword cSemicolonKeyword_28 = (Keyword)cGroup.eContents().get(28);
		
		//GSSConfigPeriodicTCLevel0:
		//	'GSSConfigPeriodicTCLevel0' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level0' ':='
		//	level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		//	'app_to_level0' ':=' app_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPeriodicTCLevel0' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level0' ':='
		//level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? 'app_to_level0' ':='
		//app_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPeriodicTCLevel0'
		public Keyword getGSSConfigPeriodicTCLevel0Keyword_0() { return cGSSConfigPeriodicTCLevel0Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'period_value'
		public Keyword getPeriod_valueKeyword_14() { return cPeriod_valueKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//period_value=INTEGER
		public Assignment getPeriod_valueAssignment_16() { return cPeriod_valueAssignment_16; }
		
		//INTEGER
		public RuleCall getPeriod_valueINTEGERParserRuleCall_16_0() { return cPeriod_valueINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'period_unit'
		public Keyword getPeriod_unitKeyword_18() { return cPeriod_unitKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//period_unit=GSSConfigUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSConfigUnit
		public RuleCall getPeriod_unitGSSConfigUnitEnumRuleCall_20_0() { return cPeriod_unitGSSConfigUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level0' ':=' level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level0'
		public Keyword getLevel0Keyword_22_0() { return cLevel0Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_22_2() { return cLevel0Assignment_22_2; }
		
		//[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName]
		public CrossReference getLevel0GSSTmTcFormatTmTCFormatCrossReference_22_2_0() { return cLevel0GSSTmTcFormatTmTCFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel0GSSTmTcFormatTmTCFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//'app_to_level0'
		public Keyword getApp_to_level0Keyword_23() { return cApp_to_level0Keyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//app_to_level0=[export::GSSExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level0Assignment_25() { return cApp_to_level0Assignment_25; }
		
		//[export::GSSExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level0GSSExportExportCrossReference_25_0() { return cApp_to_level0GSSExportExportCrossReference_25_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1() { return cApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_27() { return cRightCurlyBracketKeyword_27; }
		
		//';'
		public Keyword getSemicolonKeyword_28() { return cSemicolonKeyword_28; }
	}
	public class GSSConfigGlobalVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGlobalVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0 = (RuleCall)cTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cInitial_valueKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInitial_valueAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cInitial_valueINTEGERParserRuleCall_16_0 = (RuleCall)cInitial_valueAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Alternatives cAlternatives_18 = (Alternatives)cGroup.eContents().get(18);
		private final Assignment cReferenceFieldAssignment_18_0 = (Assignment)cAlternatives_18.eContents().get(0);
		private final RuleCall cReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0 = (RuleCall)cReferenceFieldAssignment_18_0.eContents().get(0);
		private final Assignment cReferencePeriodicTCAssignment_18_1 = (Assignment)cAlternatives_18.eContents().get(1);
		private final RuleCall cReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0 = (RuleCall)cReferencePeriodicTCAssignment_18_1.eContents().get(0);
		private final Assignment cReferenceSpecialPacketAssignment_18_2 = (Assignment)cAlternatives_18.eContents().get(2);
		private final RuleCall cReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0 = (RuleCall)cReferenceSpecialPacketAssignment_18_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cSemicolonKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//GSSConfigGlobalVar:
		//	'GSSConfigGlobalVar' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'type' ':=' type=GSSConfigGlobalVarType ';'
		//	'initial_value' ':=' initial_value=INTEGER ';' (referenceField=GSSConfigReferenceField |
		//	referencePeriodicTC=GSSConfigReferencePeriodicTC | referenceSpecialPacket=GSSConfigReferenceSpecialPacket)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGlobalVar' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'type' ':=' type=GSSConfigGlobalVarType
		//';' 'initial_value' ':=' initial_value=INTEGER ';' (referenceField=GSSConfigReferenceField |
		//referencePeriodicTC=GSSConfigReferencePeriodicTC | referenceSpecialPacket=GSSConfigReferenceSpecialPacket) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGlobalVar'
		public Keyword getGSSConfigGlobalVarKeyword_0() { return cGSSConfigGlobalVarKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'type'
		public Keyword getTypeKeyword_10() { return cTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//type=GSSConfigGlobalVarType
		public Assignment getTypeAssignment_12() { return cTypeAssignment_12; }
		
		//GSSConfigGlobalVarType
		public RuleCall getTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0() { return cTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'initial_value'
		public Keyword getInitial_valueKeyword_14() { return cInitial_valueKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//initial_value=INTEGER
		public Assignment getInitial_valueAssignment_16() { return cInitial_valueAssignment_16; }
		
		//INTEGER
		public RuleCall getInitial_valueINTEGERParserRuleCall_16_0() { return cInitial_valueINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//(referenceField=GSSConfigReferenceField | referencePeriodicTC=GSSConfigReferencePeriodicTC |
		//referenceSpecialPacket=GSSConfigReferenceSpecialPacket)
		public Alternatives getAlternatives_18() { return cAlternatives_18; }
		
		//referenceField=GSSConfigReferenceField
		public Assignment getReferenceFieldAssignment_18_0() { return cReferenceFieldAssignment_18_0; }
		
		//GSSConfigReferenceField
		public RuleCall getReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0() { return cReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0; }
		
		//referencePeriodicTC=GSSConfigReferencePeriodicTC
		public Assignment getReferencePeriodicTCAssignment_18_1() { return cReferencePeriodicTCAssignment_18_1; }
		
		//GSSConfigReferencePeriodicTC
		public RuleCall getReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0() { return cReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0; }
		
		//referenceSpecialPacket=GSSConfigReferenceSpecialPacket
		public Assignment getReferenceSpecialPacketAssignment_18_2() { return cReferenceSpecialPacketAssignment_18_2; }
		
		//GSSConfigReferenceSpecialPacket
		public RuleCall getReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0() { return cReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
		
		//';'
		public Keyword getSemicolonKeyword_20() { return cSemicolonKeyword_20; }
	}
	public class GSSConfigReferenceFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigReferenceFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIfRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIfRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIfRefINTEGERParserRuleCall_8_0 = (RuleCall)cIfRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cLevelKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cLevelAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cLevelINTEGERParserRuleCall_12_0 = (RuleCall)cLevelAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cFieldRefKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cFieldRefAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cFieldRefINTEGERParserRuleCall_16_0 = (RuleCall)cFieldRefAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cOffsetKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cOffsetAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cOffsetINTEGERParserRuleCall_20_0 = (RuleCall)cOffsetAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cSizeKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cColonEqualsSignKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Assignment cSizeAssignment_24 = (Assignment)cGroup.eContents().get(24);
		private final RuleCall cSizeINTEGERParserRuleCall_24_0 = (RuleCall)cSizeAssignment_24.eContents().get(0);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		private final Keyword cRightCurlyBracketKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Keyword cSemicolonKeyword_27 = (Keyword)cGroup.eContents().get(27);
		
		//GSSConfigReferenceField:
		//	'GSSConfigReferenceField' '{'
		//	'type' ':=' type=GSSConfigReferenceFieldType ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigReferenceField' '{' 'type' ':=' type=GSSConfigReferenceFieldType ';' 'ifRef' ':=' ifRef=INTEGER ';' 'level'
		//':=' level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER
		//';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigReferenceField'
		public Keyword getGSSConfigReferenceFieldKeyword_0() { return cGSSConfigReferenceFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//type=GSSConfigReferenceFieldType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//GSSConfigReferenceFieldType
		public RuleCall getTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0() { return cTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_6() { return cIfRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_8() { return cIfRefAssignment_8; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_8_0() { return cIfRefINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'level'
		public Keyword getLevelKeyword_10() { return cLevelKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//level=INTEGER
		public Assignment getLevelAssignment_12() { return cLevelAssignment_12; }
		
		//INTEGER
		public RuleCall getLevelINTEGERParserRuleCall_12_0() { return cLevelINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'fieldRef'
		public Keyword getFieldRefKeyword_14() { return cFieldRefKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//fieldRef=INTEGER
		public Assignment getFieldRefAssignment_16() { return cFieldRefAssignment_16; }
		
		//INTEGER
		public RuleCall getFieldRefINTEGERParserRuleCall_16_0() { return cFieldRefINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'offset'
		public Keyword getOffsetKeyword_18() { return cOffsetKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_20() { return cOffsetAssignment_20; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_20_0() { return cOffsetINTEGERParserRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//'size'
		public Keyword getSizeKeyword_22() { return cSizeKeyword_22; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23() { return cColonEqualsSignKeyword_23; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_24() { return cSizeAssignment_24; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_24_0() { return cSizeINTEGERParserRuleCall_24_0; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_26() { return cRightCurlyBracketKeyword_26; }
		
		//';'
		public Keyword getSemicolonKeyword_27() { return cSemicolonKeyword_27; }
	}
	public class GSSConfigReferencePeriodicTCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferencePeriodicTC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigReferencePeriodicTCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdRefINTEGERParserRuleCall_4_0 = (RuleCall)cIdRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLevelKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLevelAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLevelINTEGERParserRuleCall_8_0 = (RuleCall)cLevelAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFieldRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFieldRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cFieldRefINTEGERParserRuleCall_12_0 = (RuleCall)cFieldRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cOffsetKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cOffsetAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cOffsetINTEGERParserRuleCall_16_0 = (RuleCall)cOffsetAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSizeKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cSizeAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cSizeINTEGERParserRuleCall_20_0 = (RuleCall)cSizeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cRightCurlyBracketKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cSemicolonKeyword_23 = (Keyword)cGroup.eContents().get(23);
		
		//GSSConfigReferencePeriodicTC:
		//	'GSSConfigReferencePeriodicTC' '{'
		//	'idRef' ':=' idRef=INTEGER ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigReferencePeriodicTC' '{' 'idRef' ':=' idRef=INTEGER ';' 'level' ':=' level=INTEGER ';' 'fieldRef' ':='
		//fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigReferencePeriodicTC'
		public Keyword getGSSConfigReferencePeriodicTCKeyword_0() { return cGSSConfigReferencePeriodicTCKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=INTEGER
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//INTEGER
		public RuleCall getIdRefINTEGERParserRuleCall_4_0() { return cIdRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'level'
		public Keyword getLevelKeyword_6() { return cLevelKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//level=INTEGER
		public Assignment getLevelAssignment_8() { return cLevelAssignment_8; }
		
		//INTEGER
		public RuleCall getLevelINTEGERParserRuleCall_8_0() { return cLevelINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'fieldRef'
		public Keyword getFieldRefKeyword_10() { return cFieldRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//fieldRef=INTEGER
		public Assignment getFieldRefAssignment_12() { return cFieldRefAssignment_12; }
		
		//INTEGER
		public RuleCall getFieldRefINTEGERParserRuleCall_12_0() { return cFieldRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'offset'
		public Keyword getOffsetKeyword_14() { return cOffsetKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_16() { return cOffsetAssignment_16; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_16_0() { return cOffsetINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'size'
		public Keyword getSizeKeyword_18() { return cSizeKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_20() { return cSizeAssignment_20; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_20_0() { return cSizeINTEGERParserRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_22() { return cRightCurlyBracketKeyword_22; }
		
		//';'
		public Keyword getSemicolonKeyword_23() { return cSemicolonKeyword_23; }
	}
	public class GSSConfigReferenceSpecialPacketElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceSpecialPacket");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigReferenceSpecialPacketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdRefINTEGERParserRuleCall_4_0 = (RuleCall)cIdRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLevelKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLevelAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLevelINTEGERParserRuleCall_8_0 = (RuleCall)cLevelAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFieldRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFieldRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cFieldRefINTEGERParserRuleCall_12_0 = (RuleCall)cFieldRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cOffsetKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cOffsetAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cOffsetINTEGERParserRuleCall_16_0 = (RuleCall)cOffsetAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSizeKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cSizeAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cSizeINTEGERParserRuleCall_20_0 = (RuleCall)cSizeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cRightCurlyBracketKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cSemicolonKeyword_23 = (Keyword)cGroup.eContents().get(23);
		
		//GSSConfigReferenceSpecialPacket:
		//	'GSSConfigReferenceSpecialPacket' '{'
		//	'idRef' ':=' idRef=INTEGER ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigReferenceSpecialPacket' '{' 'idRef' ':=' idRef=INTEGER ';' 'level' ':=' level=INTEGER ';' 'fieldRef' ':='
		//fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigReferenceSpecialPacket'
		public Keyword getGSSConfigReferenceSpecialPacketKeyword_0() { return cGSSConfigReferenceSpecialPacketKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=INTEGER
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//INTEGER
		public RuleCall getIdRefINTEGERParserRuleCall_4_0() { return cIdRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'level'
		public Keyword getLevelKeyword_6() { return cLevelKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//level=INTEGER
		public Assignment getLevelAssignment_8() { return cLevelAssignment_8; }
		
		//INTEGER
		public RuleCall getLevelINTEGERParserRuleCall_8_0() { return cLevelINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'fieldRef'
		public Keyword getFieldRefKeyword_10() { return cFieldRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//fieldRef=INTEGER
		public Assignment getFieldRefAssignment_12() { return cFieldRefAssignment_12; }
		
		//INTEGER
		public RuleCall getFieldRefINTEGERParserRuleCall_12_0() { return cFieldRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'offset'
		public Keyword getOffsetKeyword_14() { return cOffsetKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_16() { return cOffsetAssignment_16; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_16_0() { return cOffsetINTEGERParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'size'
		public Keyword getSizeKeyword_18() { return cSizeKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_20() { return cSizeAssignment_20; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_20_0() { return cSizeINTEGERParserRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_22() { return cRightCurlyBracketKeyword_22; }
		
		//';'
		public Keyword getSemicolonKeyword_23() { return cSemicolonKeyword_23; }
	}
	public class GSSConfigPlotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPlot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigPlotKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Assignment cGVFilteredAssignment_6_0 = (Assignment)cAlternatives_6.eContents().get(0);
		private final RuleCall cGVFilteredGSSConfigGVFilteredParserRuleCall_6_0_0 = (RuleCall)cGVFilteredAssignment_6_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_6_1 = (Assignment)cAlternatives_6.eContents().get(1);
		private final RuleCall cGVPeriodicGSSConfigGVPeriodicParserRuleCall_6_1_0 = (RuleCall)cGVPeriodicAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSConfigPlot:
		//	'GSSConfigPlot' '{'
		//	'name' ':=' name=STRING ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigPlot' '{' 'name' ':=' name=STRING ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic) '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigPlot'
		public Keyword getGSSConfigPlotKeyword_0() { return cGSSConfigPlotKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//(GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//GVFiltered=GSSConfigGVFiltered
		public Assignment getGVFilteredAssignment_6_0() { return cGVFilteredAssignment_6_0; }
		
		//GSSConfigGVFiltered
		public RuleCall getGVFilteredGSSConfigGVFilteredParserRuleCall_6_0_0() { return cGVFilteredGSSConfigGVFilteredParserRuleCall_6_0_0; }
		
		//GVPeriodic=GSSConfigGVPeriodic
		public Assignment getGVPeriodicAssignment_6_1() { return cGVPeriodicAssignment_6_1; }
		
		//GSSConfigGVPeriodic
		public RuleCall getGVPeriodicGSSConfigGVPeriodicParserRuleCall_6_1_0() { return cGVPeriodicGSSConfigGVPeriodicParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSConfigAlarmMsgElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmMsg");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigAlarmMsgKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTextKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTextAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTextIDTerminalRuleCall_12_0 = (RuleCall)cTextAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Alternatives cAlternatives_14 = (Alternatives)cGroup.eContents().get(14);
		private final Assignment cGVFilteredAssignment_14_0 = (Assignment)cAlternatives_14.eContents().get(0);
		private final RuleCall cGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0 = (RuleCall)cGVFilteredAssignment_14_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_14_1 = (Assignment)cAlternatives_14.eContents().get(1);
		private final RuleCall cGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0 = (RuleCall)cGVPeriodicAssignment_14_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSConfigAlarmMsg:
		//	'GSSConfigAlarmMsg' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSConfigAlarmMsgType ';'
		//	'text' ':=' text=ID ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigAlarmMsg' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSConfigAlarmMsgType ';' 'text' ':=' text=ID ';'
		//(GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigAlarmMsg'
		public Keyword getGSSConfigAlarmMsgKeyword_0() { return cGSSConfigAlarmMsgKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'type'
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//type=GSSConfigAlarmMsgType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSConfigAlarmMsgType
		public RuleCall getTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0() { return cTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'text'
		public Keyword getTextKeyword_10() { return cTextKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//text=ID
		public Assignment getTextAssignment_12() { return cTextAssignment_12; }
		
		//ID
		public RuleCall getTextIDTerminalRuleCall_12_0() { return cTextIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//(GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		public Alternatives getAlternatives_14() { return cAlternatives_14; }
		
		//GVFiltered=GSSConfigGVFiltered
		public Assignment getGVFilteredAssignment_14_0() { return cGVFilteredAssignment_14_0; }
		
		//GSSConfigGVFiltered
		public RuleCall getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0() { return cGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0; }
		
		//GVPeriodic=GSSConfigGVPeriodic
		public Assignment getGVPeriodicAssignment_14_1() { return cGVPeriodicAssignment_14_1; }
		
		//GSSConfigGVPeriodic
		public RuleCall getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0() { return cGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSConfigModifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigModify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigModifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSConfigModifyTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cValueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cValueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cValueINTEGERParserRuleCall_12_0 = (RuleCall)cValueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Alternatives cAlternatives_14 = (Alternatives)cGroup.eContents().get(14);
		private final Assignment cGVFilteredAssignment_14_0 = (Assignment)cAlternatives_14.eContents().get(0);
		private final RuleCall cGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0 = (RuleCall)cGVFilteredAssignment_14_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_14_1 = (Assignment)cAlternatives_14.eContents().get(1);
		private final RuleCall cGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0 = (RuleCall)cGVPeriodicAssignment_14_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSConfigModify:
		//	'GSSConfigModify' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSConfigModifyType ';'
		//	'value' ':=' value=INTEGER ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigModify' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSConfigModifyType ';' 'value' ':=' value=INTEGER
		//';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigModify'
		public Keyword getGSSConfigModifyKeyword_0() { return cGSSConfigModifyKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'type'
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//type=GSSConfigModifyType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSConfigModifyType
		public RuleCall getTypeGSSConfigModifyTypeEnumRuleCall_8_0() { return cTypeGSSConfigModifyTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'value'
		public Keyword getValueKeyword_10() { return cValueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//value=INTEGER
		public Assignment getValueAssignment_12() { return cValueAssignment_12; }
		
		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_12_0() { return cValueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//(GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		public Alternatives getAlternatives_14() { return cAlternatives_14; }
		
		//GVFiltered=GSSConfigGVFiltered
		public Assignment getGVFilteredAssignment_14_0() { return cGVFilteredAssignment_14_0; }
		
		//GSSConfigGVFiltered
		public RuleCall getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0() { return cGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0; }
		
		//GVPeriodic=GSSConfigGVPeriodic
		public Assignment getGVPeriodicAssignment_14_1() { return cGVPeriodicAssignment_14_1; }
		
		//GSSConfigGVPeriodic
		public RuleCall getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0() { return cGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSConfigAlarmValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmVal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigAlarmValKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSConfigAlarmValTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Alternatives cAlternatives_10 = (Alternatives)cGroup.eContents().get(10);
		private final Assignment cGVFilteredAssignment_10_0 = (Assignment)cAlternatives_10.eContents().get(0);
		private final RuleCall cGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0 = (RuleCall)cGVFilteredAssignment_10_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_10_1 = (Assignment)cAlternatives_10.eContents().get(1);
		private final RuleCall cGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0 = (RuleCall)cGVPeriodicAssignment_10_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSConfigAlarmVal:
		//	'GSSConfigAlarmVal' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSConfigAlarmValType ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigAlarmVal' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSConfigAlarmValType ';'
		//(GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigAlarmVal'
		public Keyword getGSSConfigAlarmValKeyword_0() { return cGSSConfigAlarmValKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'type'
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//type=GSSConfigAlarmValType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSConfigAlarmValType
		public RuleCall getTypeGSSConfigAlarmValTypeEnumRuleCall_8_0() { return cTypeGSSConfigAlarmValTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//(GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
		public Alternatives getAlternatives_10() { return cAlternatives_10; }
		
		//GVFiltered=GSSConfigGVFiltered
		public Assignment getGVFilteredAssignment_10_0() { return cGVFilteredAssignment_10_0; }
		
		//GSSConfigGVFiltered
		public RuleCall getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0() { return cGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0; }
		
		//GVPeriodic=GSSConfigGVPeriodic
		public Assignment getGVPeriodicAssignment_10_1() { return cGVPeriodicAssignment_10_1; }
		
		//GSSConfigGVPeriodic
		public RuleCall getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0() { return cGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSConfigGVFilteredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGVFilteredKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cGlobalVarRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGlobalVarRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGlobalVarRefINTEGERParserRuleCall_4_0 = (RuleCall)cGlobalVarRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cFilterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cFilterAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cFilterGSSFilterFilterCrossReference_6_2_0 = (CrossReference)cFilterAssignment_6_2.eContents().get(0);
		private final RuleCall cFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cFilterGSSFilterFilterCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSConfigGVFiltered:
		//	'GSSConfigGVFiltered' '{'
		//	'GlobalVarRef' ':=' GlobalVarRef=INTEGER ';' ('filter' ':=' filter=[filters::GSSFilterFilter|VersionedQualifiedName]
		//	';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGVFiltered' '{' 'GlobalVarRef' ':=' GlobalVarRef=INTEGER ';' ('filter' ':='
		//filter=[filters::GSSFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGVFiltered'
		public Keyword getGSSConfigGVFilteredKeyword_0() { return cGSSConfigGVFilteredKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'GlobalVarRef'
		public Keyword getGlobalVarRefKeyword_2() { return cGlobalVarRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//GlobalVarRef=INTEGER
		public Assignment getGlobalVarRefAssignment_4() { return cGlobalVarRefAssignment_4; }
		
		//INTEGER
		public RuleCall getGlobalVarRefINTEGERParserRuleCall_4_0() { return cGlobalVarRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('filter' ':=' filter=[filters::GSSFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'filter'
		public Keyword getFilterKeyword_6_0() { return cFilterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//filter=[filters::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getFilterAssignment_6_2() { return cFilterAssignment_6_2; }
		
		//[filters::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getFilterGSSFilterFilterCrossReference_6_2_0() { return cFilterGSSFilterFilterCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSConfigGVPeriodicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigGVPeriodicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cGlobalVarRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGlobalVarRefAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGlobalVarRefINTEGERParserRuleCall_5_0 = (RuleCall)cGlobalVarRefAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cPeriod_valueKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cPeriod_valueAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cPeriod_valueINTEGERParserRuleCall_9_0 = (RuleCall)cPeriod_valueAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cPeriod_unitKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cColonEqualsSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cPeriod_unitAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cPeriod_unitGSSConfigUnitEnumRuleCall_13_0 = (RuleCall)cPeriod_unitAssignment_13.eContents().get(0);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSConfigGVPeriodic:
		//	'GSSConfigGVPeriodic' '{'
		//	'GlobalVarRef' ':=' ':=' GlobalVarRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSConfigUnit ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGVPeriodic' '{' 'GlobalVarRef' ':=' ':=' GlobalVarRef=INTEGER ';' 'period_value' ':=' period_value=INTEGER ';'
		//'period_unit' ':=' period_unit=GSSConfigUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGVPeriodic'
		public Keyword getGSSConfigGVPeriodicKeyword_0() { return cGSSConfigGVPeriodicKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'GlobalVarRef'
		public Keyword getGlobalVarRefKeyword_2() { return cGlobalVarRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }
		
		//GlobalVarRef=INTEGER
		public Assignment getGlobalVarRefAssignment_5() { return cGlobalVarRefAssignment_5; }
		
		//INTEGER
		public RuleCall getGlobalVarRefINTEGERParserRuleCall_5_0() { return cGlobalVarRefINTEGERParserRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//'period_value'
		public Keyword getPeriod_valueKeyword_7() { return cPeriod_valueKeyword_7; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_8() { return cColonEqualsSignKeyword_8; }
		
		//period_value=INTEGER
		public Assignment getPeriod_valueAssignment_9() { return cPeriod_valueAssignment_9; }
		
		//INTEGER
		public RuleCall getPeriod_valueINTEGERParserRuleCall_9_0() { return cPeriod_valueINTEGERParserRuleCall_9_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
		
		//'period_unit'
		public Keyword getPeriod_unitKeyword_11() { return cPeriod_unitKeyword_11; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12() { return cColonEqualsSignKeyword_12; }
		
		//period_unit=GSSConfigUnit
		public Assignment getPeriod_unitAssignment_13() { return cPeriod_unitAssignment_13; }
		
		//GSSConfigUnit
		public RuleCall getPeriod_unitGSSConfigUnitEnumRuleCall_13_0() { return cPeriod_unitGSSConfigUnitEnumRuleCall_13_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSConfigTestCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTestCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigTestCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cProcedureKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cProcedureAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cProcedureGSSTestProcTestProcCrossReference_8_0 = (CrossReference)cProcedureAssignment_8.eContents().get(0);
		private final RuleCall cProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1 = (RuleCall)cProcedureGSSTestProcTestProcCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cReqKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cReqAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cReqIDTerminalRuleCall_10_1_0 = (RuleCall)cReqAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cReqActionKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cReqActionAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cReqActionGSSConfigReqActionEnumRuleCall_11_1_0 = (RuleCall)cReqActionAssignment_11_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//GSSConfigTestCase:
		//	'GSSConfigTestCase' '{'
		//	'name' ':=' name=STRING ';'
		//	'procedure' ':=' procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName] ';' ('req' req=ID)? ('reqAction'
		//	reqAction=GSSConfigReqAction)?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigTestCase' '{' 'name' ':=' name=STRING ';' 'procedure' ':='
		//procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName] ';' ('req' req=ID)? ('reqAction'
		//reqAction=GSSConfigReqAction)? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigTestCase'
		public Keyword getGSSConfigTestCaseKeyword_0() { return cGSSConfigTestCaseKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'procedure'
		public Keyword getProcedureKeyword_6() { return cProcedureKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName]
		public Assignment getProcedureAssignment_8() { return cProcedureAssignment_8; }
		
		//[test_proc::GSSTestProcTestProc|VersionedQualifiedName]
		public CrossReference getProcedureGSSTestProcTestProcCrossReference_8_0() { return cProcedureGSSTestProcTestProcCrossReference_8_0; }
		
		//VersionedQualifiedName
		public RuleCall getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1() { return cProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('req' req=ID)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'req'
		public Keyword getReqKeyword_10_0() { return cReqKeyword_10_0; }
		
		//req=ID
		public Assignment getReqAssignment_10_1() { return cReqAssignment_10_1; }
		
		//ID
		public RuleCall getReqIDTerminalRuleCall_10_1_0() { return cReqIDTerminalRuleCall_10_1_0; }
		
		//('reqAction' reqAction=GSSConfigReqAction)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'reqAction'
		public Keyword getReqActionKeyword_11_0() { return cReqActionKeyword_11_0; }
		
		//reqAction=GSSConfigReqAction
		public Assignment getReqActionAssignment_11_1() { return cReqActionAssignment_11_1; }
		
		//GSSConfigReqAction
		public RuleCall getReqActionGSSConfigReqActionEnumRuleCall_11_1_0() { return cReqActionGSSConfigReqActionEnumRuleCall_11_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }
		
		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }
		
		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}
	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false'
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//REAL:
		//	'-'? (INT '.' ':=' INT) ('e' '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? (INT '.' ':=' INT) ('e' '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//(INT '.' ':=' INT)
		public Group getGroup_1() { return cGroup_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_2() { return cColonEqualsSignKeyword_1_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_3() { return cINTTerminalRuleCall_1_3; }
		
		//('e' '-'? INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'e'
		public Keyword getEKeyword_2_0() { return cEKeyword_2_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}
	public class DATEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.DATE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSolidusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cSolidusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cINTTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//DATE:
		//	INT '/' INT '/' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT '/' INT '/' INT
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1() { return cSolidusKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
		
		//'/'
		public Keyword getSolidusKeyword_3() { return cSolidusKeyword_3; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4() { return cINTTerminalRuleCall_4; }
	}
	public class URLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.URL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cPlusSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cColonSolidusSolidusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cIDTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Keyword cFullStopKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSolidusKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Keyword cSolidusKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//URL:
		//	ID ('+' ID)? '://' (ID '.'?)+ ('/' ID)* '/'?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('+' ID)? '://' (ID '.'?)+ ('/' ID)* '/'?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('+' ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0() { return cPlusSignKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
		
		//'://'
		public Keyword getColonSolidusSolidusKeyword_2() { return cColonSolidusSolidusKeyword_2; }
		
		//(ID '.'?)+
		public Group getGroup_3() { return cGroup_3; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3_0() { return cIDTerminalRuleCall_3_0; }
		
		//'.'?
		public Keyword getFullStopKeyword_3_1() { return cFullStopKeyword_3_1; }
		
		//('/' ID)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'/'
		public Keyword getSolidusKeyword_4_0() { return cSolidusKeyword_4_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_4_1() { return cIDTerminalRuleCall_4_1; }
		
		//'/'?
		public Keyword getSolidusKeyword_5() { return cSolidusKeyword_5; }
	}
	
	public class GSSConfigEnableDisableElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDisabledEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDisabledDisabledKeyword_0_0 = (Keyword)cDisabledEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEnabledEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEnabledEnabledKeyword_1_0 = (Keyword)cEnabledEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSConfigEnableDisable:
		//	disabled | enabled;
		public EnumRule getRule() { return rule; }
		
		//disabled | enabled
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//disabled
		public EnumLiteralDeclaration getDisabledEnumLiteralDeclaration_0() { return cDisabledEnumLiteralDeclaration_0; }
		
		//'disabled'
		public Keyword getDisabledDisabledKeyword_0_0() { return cDisabledDisabledKeyword_0_0; }
		
		//enabled
		public EnumLiteralDeclaration getEnabledEnumLiteralDeclaration_1() { return cEnabledEnumLiteralDeclaration_1; }
		
		//'enabled'
		public Keyword getEnabledEnabledKeyword_1_0() { return cEnabledEnabledKeyword_1_0; }
	}
	public class GSSConfigMainInterfaceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterfaceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSpWEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSpWSpWKeyword_0_0 = (Keyword)cSpWEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cUartEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cUartUartKeyword_1_0 = (Keyword)cUartEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDummyEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDummyDummyKeyword_2_0 = (Keyword)cDummyEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSConfigMainInterfaceType:
		//	SpW | uart | dummy;
		public EnumRule getRule() { return rule; }
		
		//SpW | uart | dummy
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SpW
		public EnumLiteralDeclaration getSpWEnumLiteralDeclaration_0() { return cSpWEnumLiteralDeclaration_0; }
		
		//'SpW'
		public Keyword getSpWSpWKeyword_0_0() { return cSpWSpWKeyword_0_0; }
		
		//uart
		public EnumLiteralDeclaration getUartEnumLiteralDeclaration_1() { return cUartEnumLiteralDeclaration_1; }
		
		//'uart'
		public Keyword getUartUartKeyword_1_0() { return cUartUartKeyword_1_0; }
		
		//dummy
		public EnumLiteralDeclaration getDummyEnumLiteralDeclaration_2() { return cDummyEnumLiteralDeclaration_2; }
		
		//'dummy'
		public Keyword getDummyDummyKeyword_2_0() { return cDummyDummyKeyword_2_0; }
	}
	public class GSSConfigMainInterfaceIOTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterfaceIOType");
		private final EnumLiteralDeclaration cIn_outEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cIn_outIn_outKeyword_0 = (Keyword)cIn_outEnumLiteralDeclaration.eContents().get(0);
		
		//enum GSSConfigMainInterfaceIOType:
		//	in_out;
		public EnumRule getRule() { return rule; }
		
		//in_out
		public EnumLiteralDeclaration getIn_outEnumLiteralDeclaration() { return cIn_outEnumLiteralDeclaration; }
		
		//'in_out'
		public Keyword getIn_outIn_outKeyword_0() { return cIn_outIn_outKeyword_0; }
	}
	public class GSSConfigInterfaceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSpWEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSpWSpWKeyword_0_0 = (Keyword)cSpWEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSpW_TCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSpW_TCSpW_TCKeyword_1_0 = (Keyword)cSpW_TCEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSpW_ErrorEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSpW_ErrorSpW_ErrorKeyword_2_0 = (Keyword)cSpW_ErrorEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cUartEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cUartUartKeyword_3_0 = (Keyword)cUartEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cDummyEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cDummyDummyKeyword_4_0 = (Keyword)cDummyEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum GSSConfigInterfaceType:
		//	SpW | SpW_TC | SpW_Error |
		//	uart | dummy;
		public EnumRule getRule() { return rule; }
		
		//SpW | SpW_TC | SpW_Error | uart | dummy
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SpW
		public EnumLiteralDeclaration getSpWEnumLiteralDeclaration_0() { return cSpWEnumLiteralDeclaration_0; }
		
		//'SpW'
		public Keyword getSpWSpWKeyword_0_0() { return cSpWSpWKeyword_0_0; }
		
		//SpW_TC
		public EnumLiteralDeclaration getSpW_TCEnumLiteralDeclaration_1() { return cSpW_TCEnumLiteralDeclaration_1; }
		
		//'SpW_TC'
		public Keyword getSpW_TCSpW_TCKeyword_1_0() { return cSpW_TCSpW_TCKeyword_1_0; }
		
		//SpW_Error
		public EnumLiteralDeclaration getSpW_ErrorEnumLiteralDeclaration_2() { return cSpW_ErrorEnumLiteralDeclaration_2; }
		
		//'SpW_Error'
		public Keyword getSpW_ErrorSpW_ErrorKeyword_2_0() { return cSpW_ErrorSpW_ErrorKeyword_2_0; }
		
		//uart
		public EnumLiteralDeclaration getUartEnumLiteralDeclaration_3() { return cUartEnumLiteralDeclaration_3; }
		
		//'uart'
		public Keyword getUartUartKeyword_3_0() { return cUartUartKeyword_3_0; }
		
		//dummy
		public EnumLiteralDeclaration getDummyEnumLiteralDeclaration_4() { return cDummyEnumLiteralDeclaration_4; }
		
		//'dummy'
		public Keyword getDummyDummyKeyword_4_0() { return cDummyDummyKeyword_4_0; }
	}
	public class GSSConfigInterfaceIOTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaceIOType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIn_outEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIn_outIn_outKeyword_0_0 = (Keyword)cIn_outEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInInKeyword_1_0 = (Keyword)cInEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cOutEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cOutOutKeyword_2_0 = (Keyword)cOutEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSConfigInterfaceIOType:
		//	in_out | in | out;
		public EnumRule getRule() { return rule; }
		
		//in_out | in | out
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//in_out
		public EnumLiteralDeclaration getIn_outEnumLiteralDeclaration_0() { return cIn_outEnumLiteralDeclaration_0; }
		
		//'in_out'
		public Keyword getIn_outIn_outKeyword_0_0() { return cIn_outIn_outKeyword_0_0; }
		
		//in
		public EnumLiteralDeclaration getInEnumLiteralDeclaration_1() { return cInEnumLiteralDeclaration_1; }
		
		//'in'
		public Keyword getInInKeyword_1_0() { return cInInKeyword_1_0; }
		
		//out
		public EnumLiteralDeclaration getOutEnumLiteralDeclaration_2() { return cOutEnumLiteralDeclaration_2; }
		
		//'out'
		public Keyword getOutOutKeyword_2_0() { return cOutOutKeyword_2_0; }
	}
	public class GSSConfigUpperLevelLevelElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevelLevel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_1_1Keyword_0_0 = (Keyword)c_1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_2_2Keyword_1_0 = (Keyword)c_2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration c_3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword c_3_3Keyword_2_0 = (Keyword)c_3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSConfigUpperLevelLevel:
		//	_1 | _2 | _3;
		public EnumRule getRule() { return rule; }
		
		//_1 | _2 | _3
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_1
		public EnumLiteralDeclaration get_1EnumLiteralDeclaration_0() { return c_1EnumLiteralDeclaration_0; }
		
		//'_1'
		public Keyword get_1_1Keyword_0_0() { return c_1_1Keyword_0_0; }
		
		//_2
		public EnumLiteralDeclaration get_2EnumLiteralDeclaration_1() { return c_2EnumLiteralDeclaration_1; }
		
		//'_2'
		public Keyword get_2_2Keyword_1_0() { return c_2_2Keyword_1_0; }
		
		//_3
		public EnumLiteralDeclaration get_3EnumLiteralDeclaration_2() { return c_3EnumLiteralDeclaration_2; }
		
		//'_3'
		public Keyword get_3_3Keyword_2_0() { return c_3_3Keyword_2_0; }
	}
	public class GSSConfigUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMilisecondsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMilisecondsMilisecondsKeyword_0_0 = (Keyword)cMilisecondsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSecondsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSecondsSecondsKeyword_1_0 = (Keyword)cSecondsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSConfigUnit:
		//	miliseconds | seconds;
		public EnumRule getRule() { return rule; }
		
		//miliseconds | seconds
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//miliseconds
		public EnumLiteralDeclaration getMilisecondsEnumLiteralDeclaration_0() { return cMilisecondsEnumLiteralDeclaration_0; }
		
		//'miliseconds'
		public Keyword getMilisecondsMilisecondsKeyword_0_0() { return cMilisecondsMilisecondsKeyword_0_0; }
		
		//seconds
		public EnumLiteralDeclaration getSecondsEnumLiteralDeclaration_1() { return cSecondsEnumLiteralDeclaration_1; }
		
		//'seconds'
		public Keyword getSecondsSecondsKeyword_1_0() { return cSecondsSecondsKeyword_1_0; }
	}
	public class GSSConfigGlobalVarTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVarType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUintEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUintUintKeyword_0_0 = (Keyword)cUintEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFormulaEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFormulaFormulaKeyword_1_0 = (Keyword)cFormulaEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSConfigGlobalVarType:
		//	uint | formula;
		public EnumRule getRule() { return rule; }
		
		//uint | formula
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//uint
		public EnumLiteralDeclaration getUintEnumLiteralDeclaration_0() { return cUintEnumLiteralDeclaration_0; }
		
		//'uint'
		public Keyword getUintUintKeyword_0_0() { return cUintUintKeyword_0_0; }
		
		//formula
		public EnumLiteralDeclaration getFormulaEnumLiteralDeclaration_1() { return cFormulaEnumLiteralDeclaration_1; }
		
		//'formula'
		public Keyword getFormulaFormulaKeyword_1_0() { return cFormulaFormulaKeyword_1_0; }
	}
	public class GSSConfigReferenceFieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceFieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTmEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTmTmKeyword_0_0 = (Keyword)cTmEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTcEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTcTcKeyword_1_0 = (Keyword)cTcEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSConfigReferenceFieldType:
		//	tm | tc;
		public EnumRule getRule() { return rule; }
		
		//tm | tc
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//tm
		public EnumLiteralDeclaration getTmEnumLiteralDeclaration_0() { return cTmEnumLiteralDeclaration_0; }
		
		//'tm'
		public Keyword getTmTmKeyword_0_0() { return cTmTmKeyword_0_0; }
		
		//tc
		public EnumLiteralDeclaration getTcEnumLiteralDeclaration_1() { return cTcEnumLiteralDeclaration_1; }
		
		//'tc'
		public Keyword getTcTcKeyword_1_0() { return cTcTcKeyword_1_0; }
	}
	public class GSSConfigAlarmMsgTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmMsgType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAlarm1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAlarm1Alarm1Keyword_0_0 = (Keyword)cAlarm1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAlarm2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAlarm2Alarm2Keyword_1_0 = (Keyword)cAlarm2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAlarm3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAlarm3Alarm3Keyword_2_0 = (Keyword)cAlarm3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSConfigAlarmMsgType:
		//	alarm1 | alarm2 | alarm3;
		public EnumRule getRule() { return rule; }
		
		//alarm1 | alarm2 | alarm3
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//alarm1
		public EnumLiteralDeclaration getAlarm1EnumLiteralDeclaration_0() { return cAlarm1EnumLiteralDeclaration_0; }
		
		//'alarm1'
		public Keyword getAlarm1Alarm1Keyword_0_0() { return cAlarm1Alarm1Keyword_0_0; }
		
		//alarm2
		public EnumLiteralDeclaration getAlarm2EnumLiteralDeclaration_1() { return cAlarm2EnumLiteralDeclaration_1; }
		
		//'alarm2'
		public Keyword getAlarm2Alarm2Keyword_1_0() { return cAlarm2Alarm2Keyword_1_0; }
		
		//alarm3
		public EnumLiteralDeclaration getAlarm3EnumLiteralDeclaration_2() { return cAlarm3EnumLiteralDeclaration_2; }
		
		//'alarm3'
		public Keyword getAlarm3Alarm3Keyword_2_0() { return cAlarm3Alarm3Keyword_2_0; }
	}
	public class GSSConfigModifyTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigModifyType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIncrementEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIncrementIncrementKeyword_0_0 = (Keyword)cIncrementEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIncrement1wrapEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIncrement1wrapIncrement1wrapKeyword_1_0 = (Keyword)cIncrement1wrapEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSConfigModifyType:
		//	increment | increment1wrap;
		public EnumRule getRule() { return rule; }
		
		//increment | increment1wrap
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//increment
		public EnumLiteralDeclaration getIncrementEnumLiteralDeclaration_0() { return cIncrementEnumLiteralDeclaration_0; }
		
		//'increment'
		public Keyword getIncrementIncrementKeyword_0_0() { return cIncrementIncrementKeyword_0_0; }
		
		//increment1wrap
		public EnumLiteralDeclaration getIncrement1wrapEnumLiteralDeclaration_1() { return cIncrement1wrapEnumLiteralDeclaration_1; }
		
		//'increment1wrap'
		public Keyword getIncrement1wrapIncrement1wrapKeyword_1_0() { return cIncrement1wrapIncrement1wrapKeyword_1_0; }
	}
	public class GSSConfigAlarmValTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmValType");
		private final EnumLiteralDeclaration cAlarm1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cAlarm1Alarm1Keyword_0 = (Keyword)cAlarm1EnumLiteralDeclaration.eContents().get(0);
		
		//enum GSSConfigAlarmValType:
		//	alarm1;
		public EnumRule getRule() { return rule; }
		
		//alarm1
		public EnumLiteralDeclaration getAlarm1EnumLiteralDeclaration() { return cAlarm1EnumLiteralDeclaration; }
		
		//'alarm1'
		public Keyword getAlarm1Alarm1Keyword_0() { return cAlarm1Alarm1Keyword_0; }
	}
	public class GSSConfigReqActionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReqAction");
		private final EnumLiteralDeclaration c_1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword c_1_1Keyword_0 = (Keyword)c_1EnumLiteralDeclaration.eContents().get(0);
		
		//enum GSSConfigReqAction:
		//	_1;
		public EnumRule getRule() { return rule; }
		
		//_1
		public EnumLiteralDeclaration get_1EnumLiteralDeclaration() { return c_1EnumLiteralDeclaration; }
		
		//'_1'
		public Keyword get_1_1Keyword_0() { return c_1_1Keyword_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSConfigGSSConfigElements pGSSConfigGSSConfig;
	private final GSSConfigGSSOptionsElements pGSSConfigGSSOptions;
	private final GSSConfigProtocolsElements pGSSConfigProtocols;
	private final GSSConfigInterfacesElements pGSSConfigInterfaces;
	private final GSSConfigSpecialPacketsElements pGSSConfigSpecialPackets;
	private final GSSConfigPeriodicTCsElements pGSSConfigPeriodicTCs;
	private final GSSConfigGlobalVarsElements pGSSConfigGlobalVars;
	private final GSSConfigMonitorsElements pGSSConfigMonitors;
	private final GSSConfigTestsElements pGSSConfigTests;
	private final GSSConfigGSSInfoElements pGSSConfigGSSInfo;
	private final GSSConfigGSSInfoPrintElements pGSSConfigGSSInfoPrint;
	private final GSSConfigPhyHeaderPrintElements pGSSConfigPhyHeaderPrint;
	private final GSSConfigGSSDiscardErrorFlagsElements pGSSConfigGSSDiscardErrorFlags;
	private final GSSConfigEnableDisableElements eGSSConfigEnableDisable;
	private final GSSConfigProtocolElements pGSSConfigProtocol;
	private final GSSConfigMainInterfaceElements pGSSConfigMainInterface;
	private final GSSConfigInterfaceElements pGSSConfigInterface;
	private final GSSConfigMainInterfaceTypeElements eGSSConfigMainInterfaceType;
	private final GSSConfigMainInterfaceIOTypeElements eGSSConfigMainInterfaceIOType;
	private final GSSConfigLevelInOutElements pGSSConfigLevelInOut;
	private final GSSConfigLevelInElements pGSSConfigLevelIn;
	private final GSSConfigLevelOutElements pGSSConfigLevelOut;
	private final GSSConfigInterfaceTypeElements eGSSConfigInterfaceType;
	private final GSSConfigInterfaceIOTypeElements eGSSConfigInterfaceIOType;
	private final GSSConfigSpecialPacketElements pGSSConfigSpecialPacket;
	private final GSSConfigUpperLevelsElements pGSSConfigUpperLevels;
	private final GSSConfigPrintingDataElements pGSSConfigPrintingData;
	private final GSSConfigPeriodElements pGSSConfigPeriod;
	private final GSSConfigIntervalRangeElements pGSSConfigIntervalRange;
	private final GSSConfigUpperLevelElements pGSSConfigUpperLevel;
	private final GSSConfigUpperLevelLevelElements eGSSConfigUpperLevelLevel;
	private final GSSConfigStructuredDataElements pGSSConfigStructuredData;
	private final GSSConfigUnitElements eGSSConfigUnit;
	private final GSSConfigPeriodicTCLevel2Elements pGSSConfigPeriodicTCLevel2;
	private final GSSConfigPeriodicTCLevel1Elements pGSSConfigPeriodicTCLevel1;
	private final GSSConfigPeriodicTCLevel0Elements pGSSConfigPeriodicTCLevel0;
	private final GSSConfigGlobalVarElements pGSSConfigGlobalVar;
	private final GSSConfigGlobalVarTypeElements eGSSConfigGlobalVarType;
	private final GSSConfigReferenceFieldElements pGSSConfigReferenceField;
	private final GSSConfigReferencePeriodicTCElements pGSSConfigReferencePeriodicTC;
	private final GSSConfigReferenceSpecialPacketElements pGSSConfigReferenceSpecialPacket;
	private final GSSConfigReferenceFieldTypeElements eGSSConfigReferenceFieldType;
	private final GSSConfigPlotElements pGSSConfigPlot;
	private final GSSConfigAlarmMsgElements pGSSConfigAlarmMsg;
	private final GSSConfigModifyElements pGSSConfigModify;
	private final GSSConfigAlarmValElements pGSSConfigAlarmVal;
	private final GSSConfigGVFilteredElements pGSSConfigGVFiltered;
	private final GSSConfigGVPeriodicElements pGSSConfigGVPeriodic;
	private final GSSConfigAlarmMsgTypeElements eGSSConfigAlarmMsgType;
	private final GSSConfigModifyTypeElements eGSSConfigModifyType;
	private final GSSConfigAlarmValTypeElements eGSSConfigAlarmValType;
	private final GSSConfigTestCaseElements pGSSConfigTestCase;
	private final GSSConfigReqActionElements eGSSConfigReqAction;
	private final EStringElements pEString;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final EBooleanElements pEBoolean;
	private final REALElements pREAL;
	private final DATEElements pDATE;
	private final URLElements pURL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CONFIGGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSConfigGSSConfig = new GSSConfigGSSConfigElements();
		this.pGSSConfigGSSOptions = new GSSConfigGSSOptionsElements();
		this.pGSSConfigProtocols = new GSSConfigProtocolsElements();
		this.pGSSConfigInterfaces = new GSSConfigInterfacesElements();
		this.pGSSConfigSpecialPackets = new GSSConfigSpecialPacketsElements();
		this.pGSSConfigPeriodicTCs = new GSSConfigPeriodicTCsElements();
		this.pGSSConfigGlobalVars = new GSSConfigGlobalVarsElements();
		this.pGSSConfigMonitors = new GSSConfigMonitorsElements();
		this.pGSSConfigTests = new GSSConfigTestsElements();
		this.pGSSConfigGSSInfo = new GSSConfigGSSInfoElements();
		this.pGSSConfigGSSInfoPrint = new GSSConfigGSSInfoPrintElements();
		this.pGSSConfigPhyHeaderPrint = new GSSConfigPhyHeaderPrintElements();
		this.pGSSConfigGSSDiscardErrorFlags = new GSSConfigGSSDiscardErrorFlagsElements();
		this.eGSSConfigEnableDisable = new GSSConfigEnableDisableElements();
		this.pGSSConfigProtocol = new GSSConfigProtocolElements();
		this.pGSSConfigMainInterface = new GSSConfigMainInterfaceElements();
		this.pGSSConfigInterface = new GSSConfigInterfaceElements();
		this.eGSSConfigMainInterfaceType = new GSSConfigMainInterfaceTypeElements();
		this.eGSSConfigMainInterfaceIOType = new GSSConfigMainInterfaceIOTypeElements();
		this.pGSSConfigLevelInOut = new GSSConfigLevelInOutElements();
		this.pGSSConfigLevelIn = new GSSConfigLevelInElements();
		this.pGSSConfigLevelOut = new GSSConfigLevelOutElements();
		this.eGSSConfigInterfaceType = new GSSConfigInterfaceTypeElements();
		this.eGSSConfigInterfaceIOType = new GSSConfigInterfaceIOTypeElements();
		this.pGSSConfigSpecialPacket = new GSSConfigSpecialPacketElements();
		this.pGSSConfigUpperLevels = new GSSConfigUpperLevelsElements();
		this.pGSSConfigPrintingData = new GSSConfigPrintingDataElements();
		this.pGSSConfigPeriod = new GSSConfigPeriodElements();
		this.pGSSConfigIntervalRange = new GSSConfigIntervalRangeElements();
		this.pGSSConfigUpperLevel = new GSSConfigUpperLevelElements();
		this.eGSSConfigUpperLevelLevel = new GSSConfigUpperLevelLevelElements();
		this.pGSSConfigStructuredData = new GSSConfigStructuredDataElements();
		this.eGSSConfigUnit = new GSSConfigUnitElements();
		this.pGSSConfigPeriodicTCLevel2 = new GSSConfigPeriodicTCLevel2Elements();
		this.pGSSConfigPeriodicTCLevel1 = new GSSConfigPeriodicTCLevel1Elements();
		this.pGSSConfigPeriodicTCLevel0 = new GSSConfigPeriodicTCLevel0Elements();
		this.pGSSConfigGlobalVar = new GSSConfigGlobalVarElements();
		this.eGSSConfigGlobalVarType = new GSSConfigGlobalVarTypeElements();
		this.pGSSConfigReferenceField = new GSSConfigReferenceFieldElements();
		this.pGSSConfigReferencePeriodicTC = new GSSConfigReferencePeriodicTCElements();
		this.pGSSConfigReferenceSpecialPacket = new GSSConfigReferenceSpecialPacketElements();
		this.eGSSConfigReferenceFieldType = new GSSConfigReferenceFieldTypeElements();
		this.pGSSConfigPlot = new GSSConfigPlotElements();
		this.pGSSConfigAlarmMsg = new GSSConfigAlarmMsgElements();
		this.pGSSConfigModify = new GSSConfigModifyElements();
		this.pGSSConfigAlarmVal = new GSSConfigAlarmValElements();
		this.pGSSConfigGVFiltered = new GSSConfigGVFilteredElements();
		this.pGSSConfigGVPeriodic = new GSSConfigGVPeriodicElements();
		this.eGSSConfigAlarmMsgType = new GSSConfigAlarmMsgTypeElements();
		this.eGSSConfigModifyType = new GSSConfigModifyTypeElements();
		this.eGSSConfigAlarmValType = new GSSConfigAlarmValTypeElements();
		this.pGSSConfigTestCase = new GSSConfigTestCaseElements();
		this.eGSSConfigReqAction = new GSSConfigReqActionElements();
		this.pEString = new EStringElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
		this.pREAL = new REALElements();
		this.pDATE = new DATEElements();
		this.pURL = new URLElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.config.CONFIG".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GSSModelFile common::GSSModelFile:
	//	imports+=GSSModelFileImport*
	//	element=GSSConfigGSSConfig
	public GSSModelFileElements getGSSModelFileAccess() {
		return pGSSModelFile;
	}
	
	public ParserRule getGSSModelFileRule() {
		return getGSSModelFileAccess().getRule();
	}
	
	//GSSModelFileImport common::GSSModelFileImport:
	//	'import' ':=' importURI=STRING ';'
	public GSSModelFileImportElements getGSSModelFileImportAccess() {
		return pGSSModelFileImport;
	}
	
	public ParserRule getGSSModelFileImportRule() {
		return getGSSModelFileImportAccess().getRule();
	}
	
	//GSSConfigGSSConfig:
	//	'GSSConfigGSSConfig'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') gss_options=GSSConfigGSSOptions
	//	Protocols=GSSConfigProtocols
	//	Interfaces=GSSConfigInterfaces
	//	SpecialPackets=GSSConfigSpecialPackets?
	//	PeriodicTCs=GSSConfigPeriodicTCs? (GlobalVars=GSSConfigGlobalVars & Monitors=GSSConfigMonitors)?
	//	Tests=GSSConfigTests
	//	'}' ';';
	public GSSConfigGSSConfigElements getGSSConfigGSSConfigAccess() {
		return pGSSConfigGSSConfig;
	}
	
	public ParserRule getGSSConfigGSSConfigRule() {
		return getGSSConfigGSSConfigAccess().getRule();
	}
	
	//GSSConfigGSSOptions:
	//	'GSSConfigGSSOptions' '{'
	//	gss_info=GSSConfigGSSInfo
	//	gss_info_print=GSSConfigGSSInfoPrint
	//	phy_header_print=GSSConfigPhyHeaderPrint
	//	discardErrorFlags=GSSConfigGSSDiscardErrorFlags
	//	'}' ';';
	public GSSConfigGSSOptionsElements getGSSConfigGSSOptionsAccess() {
		return pGSSConfigGSSOptions;
	}
	
	public ParserRule getGSSConfigGSSOptionsRule() {
		return getGSSConfigGSSOptionsAccess().getRule();
	}
	
	//GSSConfigProtocols:
	//	'GSSConfigProtocols' '{'
	//	Protocol+=GSSConfigProtocol+
	//	'}' ';';
	public GSSConfigProtocolsElements getGSSConfigProtocolsAccess() {
		return pGSSConfigProtocols;
	}
	
	public ParserRule getGSSConfigProtocolsRule() {
		return getGSSConfigProtocolsAccess().getRule();
	}
	
	//GSSConfigInterfaces:
	//	'GSSConfigInterfaces' '{'
	//	MainInterface=GSSConfigMainInterface
	//	Interface+=GSSConfigInterface*
	//	'}' ';';
	public GSSConfigInterfacesElements getGSSConfigInterfacesAccess() {
		return pGSSConfigInterfaces;
	}
	
	public ParserRule getGSSConfigInterfacesRule() {
		return getGSSConfigInterfacesAccess().getRule();
	}
	
	//GSSConfigSpecialPackets:
	//	'GSSConfigSpecialPackets' '{'
	//	SpecialPacket+=GSSConfigSpecialPacket '}' ';';
	public GSSConfigSpecialPacketsElements getGSSConfigSpecialPacketsAccess() {
		return pGSSConfigSpecialPackets;
	}
	
	public ParserRule getGSSConfigSpecialPacketsRule() {
		return getGSSConfigSpecialPacketsAccess().getRule();
	}
	
	//GSSConfigPeriodicTCs:
	//	{GSSConfigPeriodicTCs}
	//	'GSSConfigPeriodicTCs' '{' (PeriodicTC_level_2+=GSSConfigPeriodicTCLevel2 |
	//	PeriodicTC_level_1+=GSSConfigPeriodicTCLevel1 | PeriodicTC_level_0+=GSSConfigPeriodicTCLevel0)*
	//	'}' ';';
	public GSSConfigPeriodicTCsElements getGSSConfigPeriodicTCsAccess() {
		return pGSSConfigPeriodicTCs;
	}
	
	public ParserRule getGSSConfigPeriodicTCsRule() {
		return getGSSConfigPeriodicTCsAccess().getRule();
	}
	
	//GSSConfigGlobalVars:
	//	'GSSConfigGlobalVars' '{'
	//	GlobalVar+=GSSConfigGlobalVar+
	//	'}' ';';
	public GSSConfigGlobalVarsElements getGSSConfigGlobalVarsAccess() {
		return pGSSConfigGlobalVars;
	}
	
	public ParserRule getGSSConfigGlobalVarsRule() {
		return getGSSConfigGlobalVarsAccess().getRule();
	}
	
	//GSSConfigMonitors:
	//	'GSSConfigMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
	//	(plot+=GSSConfigPlot | alarmMsg+=GSSConfigAlarmMsg | modify+=GSSConfigModify | alarmVal+=GSSConfigAlarmVal)+
	//	'}' ';';
	public GSSConfigMonitorsElements getGSSConfigMonitorsAccess() {
		return pGSSConfigMonitors;
	}
	
	public ParserRule getGSSConfigMonitorsRule() {
		return getGSSConfigMonitorsAccess().getRule();
	}
	
	//GSSConfigTests:
	//	'GSSConfigTests' '{' ('ProtocolPacketsFile' ':='
	//	ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
	//	TestCase+=GSSConfigTestCase+
	//	'}' ';';
	public GSSConfigTestsElements getGSSConfigTestsAccess() {
		return pGSSConfigTests;
	}
	
	public ParserRule getGSSConfigTestsRule() {
		return getGSSConfigTestsAccess().getRule();
	}
	
	//GSSConfigGSSInfo:
	//	'GSSConfigGSSInfo' '{'
	//	'test_campaign' ':=' test_campaign=STRING ';'
	//	'version' ':=' version=Version ';'
	//	'date' ':=' date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')?
	//	'}' ';';
	public GSSConfigGSSInfoElements getGSSConfigGSSInfoAccess() {
		return pGSSConfigGSSInfo;
	}
	
	public ParserRule getGSSConfigGSSInfoRule() {
		return getGSSConfigGSSInfoAccess().getRule();
	}
	
	//GSSConfigGSSInfoPrint:
	//	'GSSConfigGSSInfoPrint'
	//	'{'
	//	'mainLog' ':=' mainLog=GSSConfigEnableDisable ';'
	//	'portLogs' ':=' portLogs=GSSConfigEnableDisable ';'
	//	'debugLog' ':=' debugLog=GSSConfigEnableDisable ';'
	//	'}' ';';
	public GSSConfigGSSInfoPrintElements getGSSConfigGSSInfoPrintAccess() {
		return pGSSConfigGSSInfoPrint;
	}
	
	public ParserRule getGSSConfigGSSInfoPrintRule() {
		return getGSSConfigGSSInfoPrintAccess().getRule();
	}
	
	//GSSConfigPhyHeaderPrint:
	//	'GSSConfigPhyHeaderPrint' '{'
	//	'mainLog' ':=' mainLog=GSSConfigEnableDisable ';'
	//	'portLogs' ':=' portLogs=GSSConfigEnableDisable ';'
	//	'debugLog' ':=' debugLog=GSSConfigEnableDisable ';'
	//	'gssTabs' ':=' gssTabs=GSSConfigEnableDisable ';'
	//	'}' ';';
	public GSSConfigPhyHeaderPrintElements getGSSConfigPhyHeaderPrintAccess() {
		return pGSSConfigPhyHeaderPrint;
	}
	
	public ParserRule getGSSConfigPhyHeaderPrintRule() {
		return getGSSConfigPhyHeaderPrintAccess().getRule();
	}
	
	//GSSConfigGSSDiscardErrorFlags:
	//	'GSSConfigGSSDiscardErrorFlags' '{'
	//	'txErrors' ':=' txErrors=GSSConfigEnableDisable ';'
	//	'notExpectedPackets' ':=' notExpectedPackets=GSSConfigEnableDisable ';'
	//	'filtersKo' ':=' filtersKo=GSSConfigEnableDisable ';'
	//	'validTimesKo' ':=' validTimesKo=GSSConfigEnableDisable ';'
	//	'}' ';';
	public GSSConfigGSSDiscardErrorFlagsElements getGSSConfigGSSDiscardErrorFlagsAccess() {
		return pGSSConfigGSSDiscardErrorFlags;
	}
	
	public ParserRule getGSSConfigGSSDiscardErrorFlagsRule() {
		return getGSSConfigGSSDiscardErrorFlagsAccess().getRule();
	}
	
	//enum GSSConfigEnableDisable:
	//	disabled | enabled;
	public GSSConfigEnableDisableElements getGSSConfigEnableDisableAccess() {
		return eGSSConfigEnableDisable;
	}
	
	public EnumRule getGSSConfigEnableDisableRule() {
		return getGSSConfigEnableDisableAccess().getRule();
	}
	
	//GSSConfigProtocol:
	//	'GSSConfigProtocol' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'typeLevel' ':=' typeLevel=INTEGER ';'
	//	'typeOffset' ':=' typeOffset=INTEGER ';' ('subtypeOffset' ':=' subtypeOffset=INTEGER ';')?
	//	'}' ';';
	public GSSConfigProtocolElements getGSSConfigProtocolAccess() {
		return pGSSConfigProtocol;
	}
	
	public ParserRule getGSSConfigProtocolRule() {
		return getGSSConfigProtocolAccess().getRule();
	}
	
	//GSSConfigMainInterface:
	//	'GSSConfigMainInterface' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'ifType' ':=' ifType=GSSConfigMainInterfaceType ';'
	//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
	//	'ioType' ':=' ioType=GSSConfigMainInterfaceIOType ';' ('protocolID' ':='
	//	protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')?
	//	LevelInOut+=GSSConfigLevelInOut+
	//	'}' ';';
	public GSSConfigMainInterfaceElements getGSSConfigMainInterfaceAccess() {
		return pGSSConfigMainInterface;
	}
	
	public ParserRule getGSSConfigMainInterfaceRule() {
		return getGSSConfigMainInterfaceAccess().getRule();
	}
	
	//GSSConfigInterface:
	//	'GSSConfigInterface' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'ifType' ':=' ifType=GSSConfigInterfaceType ';'
	//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
	//	'ioType' ':=' ioType=GSSConfigInterfaceIOType ';' ('protocolID' ':='
	//	protocolID=[GSSConfigProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSConfigLevelInOut |
	//	LevelIn+=GSSConfigLevelIn | LevelOut+=GSSConfigLevelOut)+
	//	'}' ';';
	public GSSConfigInterfaceElements getGSSConfigInterfaceAccess() {
		return pGSSConfigInterface;
	}
	
	public ParserRule getGSSConfigInterfaceRule() {
		return getGSSConfigInterfaceAccess().getRule();
	}
	
	//enum GSSConfigMainInterfaceType:
	//	SpW | uart | dummy;
	public GSSConfigMainInterfaceTypeElements getGSSConfigMainInterfaceTypeAccess() {
		return eGSSConfigMainInterfaceType;
	}
	
	public EnumRule getGSSConfigMainInterfaceTypeRule() {
		return getGSSConfigMainInterfaceTypeAccess().getRule();
	}
	
	//enum GSSConfigMainInterfaceIOType:
	//	in_out;
	public GSSConfigMainInterfaceIOTypeElements getGSSConfigMainInterfaceIOTypeAccess() {
		return eGSSConfigMainInterfaceIOType;
	}
	
	public EnumRule getGSSConfigMainInterfaceIOTypeRule() {
		return getGSSConfigMainInterfaceIOTypeAccess().getRule();
	}
	
	//GSSConfigLevelInOut:
	//	'GSSConfigLevelInOut' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TMformat' ':=' TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';'
	//	'TCformat' ':=' TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';'
	//	'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
	//	export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSConfigLevelInOutElements getGSSConfigLevelInOutAccess() {
		return pGSSConfigLevelInOut;
	}
	
	public ParserRule getGSSConfigLevelInOutRule() {
		return getGSSConfigLevelInOutAccess().getRule();
	}
	
	//GSSConfigLevelIn:
	//	'GSSConfigLevelIn' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TCformat' ':=' TCformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';' ('export_to_prev_Level'
	//	':=' export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSConfigLevelInElements getGSSConfigLevelInAccess() {
		return pGSSConfigLevelIn;
	}
	
	public ParserRule getGSSConfigLevelInRule() {
		return getGSSConfigLevelInAccess().getRule();
	}
	
	//GSSConfigLevelOut:
	//	'GSSConfigLevelOut' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TMformat' ':=' TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';'
	//	'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSConfigLevelOutElements getGSSConfigLevelOutAccess() {
		return pGSSConfigLevelOut;
	}
	
	public ParserRule getGSSConfigLevelOutRule() {
		return getGSSConfigLevelOutAccess().getRule();
	}
	
	//enum GSSConfigInterfaceType:
	//	SpW | SpW_TC | SpW_Error |
	//	uart | dummy;
	public GSSConfigInterfaceTypeElements getGSSConfigInterfaceTypeAccess() {
		return eGSSConfigInterfaceType;
	}
	
	public EnumRule getGSSConfigInterfaceTypeRule() {
		return getGSSConfigInterfaceTypeAccess().getRule();
	}
	
	//enum GSSConfigInterfaceIOType:
	//	in_out | in | out;
	public GSSConfigInterfaceIOTypeElements getGSSConfigInterfaceIOTypeAccess() {
		return eGSSConfigInterfaceIOType;
	}
	
	public EnumRule getGSSConfigInterfaceIOTypeRule() {
		return getGSSConfigInterfaceIOTypeAccess().getRule();
	}
	
	//GSSConfigSpecialPacket:
	//	'GSSConfigSpecialPacket' '{'
	//	'status' ':=' status=GSSConfigEnableDisable ';'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'levels' ':=' levels=INTEGER ';'
	//	'levelRef' ':=' levelRef=INTEGER ';'
	//	'inputFilter' ':=' inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';'
	//	UpperLevels+=GSSConfigUpperLevels?
	//	printingData=GSSConfigPrintingData (period=GSSConfigPeriod | intervalRange=GSSConfigIntervalRange)?
	//	'}' ';';
	public GSSConfigSpecialPacketElements getGSSConfigSpecialPacketAccess() {
		return pGSSConfigSpecialPacket;
	}
	
	public ParserRule getGSSConfigSpecialPacketRule() {
		return getGSSConfigSpecialPacketAccess().getRule();
	}
	
	//GSSConfigUpperLevels:
	//	'GSSConfigUpperLevels' '{'
	//	UpperLevel+=GSSConfigUpperLevel+
	//	'}' ';';
	public GSSConfigUpperLevelsElements getGSSConfigUpperLevelsAccess() {
		return pGSSConfigUpperLevels;
	}
	
	public ParserRule getGSSConfigUpperLevelsRule() {
		return getGSSConfigUpperLevelsAccess().getRule();
	}
	
	//GSSConfigPrintingData:
	//	'GSSConfigPrintingData' '{'
	//	'printStatus' ':=' printStatus=GSSConfigEnableDisable ';'
	//	structuredData=GSSConfigStructuredData?
	//	'}' ';';
	public GSSConfigPrintingDataElements getGSSConfigPrintingDataAccess() {
		return pGSSConfigPrintingData;
	}
	
	public ParserRule getGSSConfigPrintingDataRule() {
		return getGSSConfigPrintingDataAccess().getRule();
	}
	
	//GSSConfigPeriod:
	//	'GSSConfigPeriod' '{'
	//	'min_value' ':=' min_value=INTEGER ';'
	//	'min_unit' ':=' min_unit=GSSConfigUnit ';'
	//	'max_value' ':=' max_value=INTEGER ';'
	//	'max_unit' ':=' max_unit=GSSConfigUnit ';'
	//	'}' ';';
	public GSSConfigPeriodElements getGSSConfigPeriodAccess() {
		return pGSSConfigPeriod;
	}
	
	public ParserRule getGSSConfigPeriodRule() {
		return getGSSConfigPeriodAccess().getRule();
	}
	
	//GSSConfigIntervalRange:
	//	'GSSConfigIntervalRange' '{'
	//	'min' ':=' min=INTEGER ';'
	//	'max' ':=' max=INTEGER ';'
	//	'interval_value' ':=' interval_value=INTEGER ';'
	//	'interval_unit' ':=' interval_unit=GSSConfigUnit ';'
	//	'}' ';';
	public GSSConfigIntervalRangeElements getGSSConfigIntervalRangeAccess() {
		return pGSSConfigIntervalRange;
	}
	
	public ParserRule getGSSConfigIntervalRangeRule() {
		return getGSSConfigIntervalRangeAccess().getRule();
	}
	
	//GSSConfigUpperLevel:
	//	'GSSConfigUpperLevel' '{'
	//	'level' ':=' level=GSSConfigUpperLevelLevel ';' ('TMformat' ':='
	//	TMformat=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
	//	inputFilter=[filters::GSSFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[imports::GSSImportImport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSConfigUpperLevelElements getGSSConfigUpperLevelAccess() {
		return pGSSConfigUpperLevel;
	}
	
	public ParserRule getGSSConfigUpperLevelRule() {
		return getGSSConfigUpperLevelAccess().getRule();
	}
	
	//enum GSSConfigUpperLevelLevel:
	//	_1 | _2 | _3;
	public GSSConfigUpperLevelLevelElements getGSSConfigUpperLevelLevelAccess() {
		return eGSSConfigUpperLevelLevel;
	}
	
	public EnumRule getGSSConfigUpperLevelLevelRule() {
		return getGSSConfigUpperLevelLevelAccess().getRule();
	}
	
	//GSSConfigStructuredData:
	//	'GSSConfigStructuredData' '{'
	//	'levelRef' ':=' levelRef=INTEGER ';'
	//	'firstField' ':=' firstField=INTEGER ';'
	//	'}' ';';
	public GSSConfigStructuredDataElements getGSSConfigStructuredDataAccess() {
		return pGSSConfigStructuredData;
	}
	
	public ParserRule getGSSConfigStructuredDataRule() {
		return getGSSConfigStructuredDataAccess().getRule();
	}
	
	//enum GSSConfigUnit:
	//	miliseconds | seconds;
	public GSSConfigUnitElements getGSSConfigUnitAccess() {
		return eGSSConfigUnit;
	}
	
	public EnumRule getGSSConfigUnitRule() {
		return getGSSConfigUnitAccess().getRule();
	}
	
	//GSSConfigPeriodicTCLevel2:
	//	'GSSConfigPeriodicTCLevel2' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level2' ':='
	//	level2=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
	//	'app_to_level2' ':=' app_to_level2=[export::GSSExportExport|VersionedQualifiedName] ';' ('level1' ':='
	//	level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
	//	level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')? ('level0' ':='
	//	level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSConfigPeriodicTCLevel2Elements getGSSConfigPeriodicTCLevel2Access() {
		return pGSSConfigPeriodicTCLevel2;
	}
	
	public ParserRule getGSSConfigPeriodicTCLevel2Rule() {
		return getGSSConfigPeriodicTCLevel2Access().getRule();
	}
	
	//GSSConfigPeriodicTCLevel1:
	//	'GSSConfigPeriodicTCLevel1' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level1' ':='
	//	level1=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
	//	'app_to_level1' ':=' app_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';' ('level0' ':='
	//	level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSConfigPeriodicTCLevel1Elements getGSSConfigPeriodicTCLevel1Access() {
		return pGSSConfigPeriodicTCLevel1;
	}
	
	public ParserRule getGSSConfigPeriodicTCLevel1Rule() {
		return getGSSConfigPeriodicTCLevel1Access().getRule();
	}
	
	//GSSConfigPeriodicTCLevel0:
	//	'GSSConfigPeriodicTCLevel0' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSConfigUnit ';' ('level0' ':='
	//	level0=[tm_tc_format::GSSTmTcFormatTmTCFormat|VersionedQualifiedName] ';')?
	//	'app_to_level0' ':=' app_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';'
	//	'}' ';';
	public GSSConfigPeriodicTCLevel0Elements getGSSConfigPeriodicTCLevel0Access() {
		return pGSSConfigPeriodicTCLevel0;
	}
	
	public ParserRule getGSSConfigPeriodicTCLevel0Rule() {
		return getGSSConfigPeriodicTCLevel0Access().getRule();
	}
	
	//GSSConfigGlobalVar:
	//	'GSSConfigGlobalVar' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'type' ':=' type=GSSConfigGlobalVarType ';'
	//	'initial_value' ':=' initial_value=INTEGER ';' (referenceField=GSSConfigReferenceField |
	//	referencePeriodicTC=GSSConfigReferencePeriodicTC | referenceSpecialPacket=GSSConfigReferenceSpecialPacket)
	//	'}' ';';
	public GSSConfigGlobalVarElements getGSSConfigGlobalVarAccess() {
		return pGSSConfigGlobalVar;
	}
	
	public ParserRule getGSSConfigGlobalVarRule() {
		return getGSSConfigGlobalVarAccess().getRule();
	}
	
	//enum GSSConfigGlobalVarType:
	//	uint | formula;
	public GSSConfigGlobalVarTypeElements getGSSConfigGlobalVarTypeAccess() {
		return eGSSConfigGlobalVarType;
	}
	
	public EnumRule getGSSConfigGlobalVarTypeRule() {
		return getGSSConfigGlobalVarTypeAccess().getRule();
	}
	
	//GSSConfigReferenceField:
	//	'GSSConfigReferenceField' '{'
	//	'type' ':=' type=GSSConfigReferenceFieldType ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';';
	public GSSConfigReferenceFieldElements getGSSConfigReferenceFieldAccess() {
		return pGSSConfigReferenceField;
	}
	
	public ParserRule getGSSConfigReferenceFieldRule() {
		return getGSSConfigReferenceFieldAccess().getRule();
	}
	
	//GSSConfigReferencePeriodicTC:
	//	'GSSConfigReferencePeriodicTC' '{'
	//	'idRef' ':=' idRef=INTEGER ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';';
	public GSSConfigReferencePeriodicTCElements getGSSConfigReferencePeriodicTCAccess() {
		return pGSSConfigReferencePeriodicTC;
	}
	
	public ParserRule getGSSConfigReferencePeriodicTCRule() {
		return getGSSConfigReferencePeriodicTCAccess().getRule();
	}
	
	//GSSConfigReferenceSpecialPacket:
	//	'GSSConfigReferenceSpecialPacket' '{'
	//	'idRef' ':=' idRef=INTEGER ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';';
	public GSSConfigReferenceSpecialPacketElements getGSSConfigReferenceSpecialPacketAccess() {
		return pGSSConfigReferenceSpecialPacket;
	}
	
	public ParserRule getGSSConfigReferenceSpecialPacketRule() {
		return getGSSConfigReferenceSpecialPacketAccess().getRule();
	}
	
	//enum GSSConfigReferenceFieldType:
	//	tm | tc;
	public GSSConfigReferenceFieldTypeElements getGSSConfigReferenceFieldTypeAccess() {
		return eGSSConfigReferenceFieldType;
	}
	
	public EnumRule getGSSConfigReferenceFieldTypeRule() {
		return getGSSConfigReferenceFieldTypeAccess().getRule();
	}
	
	//GSSConfigPlot:
	//	'GSSConfigPlot' '{'
	//	'name' ':=' name=STRING ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
	//	'}' ';';
	public GSSConfigPlotElements getGSSConfigPlotAccess() {
		return pGSSConfigPlot;
	}
	
	public ParserRule getGSSConfigPlotRule() {
		return getGSSConfigPlotAccess().getRule();
	}
	
	//GSSConfigAlarmMsg:
	//	'GSSConfigAlarmMsg' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSConfigAlarmMsgType ';'
	//	'text' ':=' text=ID ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
	//	'}' ';';
	public GSSConfigAlarmMsgElements getGSSConfigAlarmMsgAccess() {
		return pGSSConfigAlarmMsg;
	}
	
	public ParserRule getGSSConfigAlarmMsgRule() {
		return getGSSConfigAlarmMsgAccess().getRule();
	}
	
	//GSSConfigModify:
	//	'GSSConfigModify' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSConfigModifyType ';'
	//	'value' ':=' value=INTEGER ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
	//	'}' ';';
	public GSSConfigModifyElements getGSSConfigModifyAccess() {
		return pGSSConfigModify;
	}
	
	public ParserRule getGSSConfigModifyRule() {
		return getGSSConfigModifyAccess().getRule();
	}
	
	//GSSConfigAlarmVal:
	//	'GSSConfigAlarmVal' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSConfigAlarmValType ';' (GVFiltered=GSSConfigGVFiltered | GVPeriodic=GSSConfigGVPeriodic)
	//	'}' ';';
	public GSSConfigAlarmValElements getGSSConfigAlarmValAccess() {
		return pGSSConfigAlarmVal;
	}
	
	public ParserRule getGSSConfigAlarmValRule() {
		return getGSSConfigAlarmValAccess().getRule();
	}
	
	//GSSConfigGVFiltered:
	//	'GSSConfigGVFiltered' '{'
	//	'GlobalVarRef' ':=' GlobalVarRef=INTEGER ';' ('filter' ':=' filter=[filters::GSSFilterFilter|VersionedQualifiedName]
	//	';')?
	//	'}' ';';
	public GSSConfigGVFilteredElements getGSSConfigGVFilteredAccess() {
		return pGSSConfigGVFiltered;
	}
	
	public ParserRule getGSSConfigGVFilteredRule() {
		return getGSSConfigGVFilteredAccess().getRule();
	}
	
	//GSSConfigGVPeriodic:
	//	'GSSConfigGVPeriodic' '{'
	//	'GlobalVarRef' ':=' ':=' GlobalVarRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSConfigUnit ';'
	//	'}' ';';
	public GSSConfigGVPeriodicElements getGSSConfigGVPeriodicAccess() {
		return pGSSConfigGVPeriodic;
	}
	
	public ParserRule getGSSConfigGVPeriodicRule() {
		return getGSSConfigGVPeriodicAccess().getRule();
	}
	
	//enum GSSConfigAlarmMsgType:
	//	alarm1 | alarm2 | alarm3;
	public GSSConfigAlarmMsgTypeElements getGSSConfigAlarmMsgTypeAccess() {
		return eGSSConfigAlarmMsgType;
	}
	
	public EnumRule getGSSConfigAlarmMsgTypeRule() {
		return getGSSConfigAlarmMsgTypeAccess().getRule();
	}
	
	//enum GSSConfigModifyType:
	//	increment | increment1wrap;
	public GSSConfigModifyTypeElements getGSSConfigModifyTypeAccess() {
		return eGSSConfigModifyType;
	}
	
	public EnumRule getGSSConfigModifyTypeRule() {
		return getGSSConfigModifyTypeAccess().getRule();
	}
	
	//enum GSSConfigAlarmValType:
	//	alarm1;
	public GSSConfigAlarmValTypeElements getGSSConfigAlarmValTypeAccess() {
		return eGSSConfigAlarmValType;
	}
	
	public EnumRule getGSSConfigAlarmValTypeRule() {
		return getGSSConfigAlarmValTypeAccess().getRule();
	}
	
	//GSSConfigTestCase:
	//	'GSSConfigTestCase' '{'
	//	'name' ':=' name=STRING ';'
	//	'procedure' ':=' procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName] ';' ('req' req=ID)? ('reqAction'
	//	reqAction=GSSConfigReqAction)?
	//	'}' ';';
	public GSSConfigTestCaseElements getGSSConfigTestCaseAccess() {
		return pGSSConfigTestCase;
	}
	
	public ParserRule getGSSConfigTestCaseRule() {
		return getGSSConfigTestCaseAccess().getRule();
	}
	
	//enum GSSConfigReqAction:
	//	_1;
	public GSSConfigReqActionElements getGSSConfigReqActionAccess() {
		return eGSSConfigReqAction;
	}
	
	public EnumRule getGSSConfigReqActionRule() {
		return getGSSConfigReqActionAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}
	
	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//REAL:
	//	'-'? (INT '.' ':=' INT) ('e' '-'? INT)?;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//DATE:
	//	INT '/' INT '/' INT;
	public DATEElements getDATEAccess() {
		return pDATE;
	}
	
	public ParserRule getDATERule() {
		return getDATEAccess().getRule();
	}
	
	//URL:
	//	ID ('+' ID)? '://' (ID '.'?)+ ('/' ID)* '/'?;
	public URLElements getURLAccess() {
		return pURL;
	}
	
	public ParserRule getURLRule() {
		return getURLAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
