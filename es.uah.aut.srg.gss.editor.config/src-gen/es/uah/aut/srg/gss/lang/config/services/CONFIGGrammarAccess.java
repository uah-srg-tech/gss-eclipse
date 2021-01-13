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
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cUriKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cUriAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cUriQualifiedNameParserRuleCall_3_2_0 = (RuleCall)cUriAssignment_3_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Keyword cVersionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cVersionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cVersionVersionParserRuleCall_6_0 = (RuleCall)cVersionAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cScenarioAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cScenarioGSSScenarioScenarioParserRuleCall_8_0 = (RuleCall)cScenarioAssignment_8.eContents().get(0);
		private final Assignment cTestsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cTestsGSSTestListTestListParserRuleCall_9_0 = (RuleCall)cTestsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSConfigGSSConfig:
		//	'GSSConfigGSSConfig'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';')
		//	'version' ':=' version=Version ';'
		//	scenario=GSSScenarioScenario
		//	Tests=GSSTestListTestList
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSConfig' name=ID '{' ('uri' ':=' uri=QualifiedName ';') 'version' ':=' version=Version ';'
		//scenario=GSSScenarioScenario Tests=GSSTestListTestList '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigGSSConfig'
		public Keyword getGSSConfigGSSConfigKeyword_0() { return cGSSConfigGSSConfigKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';')
		public Group getGroup_3() { return cGroup_3; }
		
		//'uri'
		public Keyword getUriKeyword_3_0() { return cUriKeyword_3_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1() { return cColonEqualsSignKeyword_3_1; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_3_2() { return cUriAssignment_3_2; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_3_2_0() { return cUriQualifiedNameParserRuleCall_3_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_3() { return cSemicolonKeyword_3_3; }
		
		//'version'
		public Keyword getVersionKeyword_4() { return cVersionKeyword_4; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_5() { return cColonEqualsSignKeyword_5; }
		
		//version=Version
		public Assignment getVersionAssignment_6() { return cVersionAssignment_6; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_6_0() { return cVersionVersionParserRuleCall_6_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
		
		//scenario=GSSScenarioScenario
		public Assignment getScenarioAssignment_8() { return cScenarioAssignment_8; }
		
		//GSSScenarioScenario
		public RuleCall getScenarioGSSScenarioScenarioParserRuleCall_8_0() { return cScenarioGSSScenarioScenarioParserRuleCall_8_0; }
		
		//Tests=GSSTestListTestList
		public Assignment getTestsAssignment_9() { return cTestsAssignment_9; }
		
		//GSSTestListTestList
		public RuleCall getTestsGSSTestListTestListParserRuleCall_9_0() { return cTestsGSSTestListTestListParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSScenarioScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioScenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGss_optionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGss_optionsGSSScenarioOptionsParserRuleCall_3_0 = (RuleCall)cGss_optionsAssignment_3.eContents().get(0);
		private final Assignment cProtocolsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProtocolsGSSScenarioProtocolsParserRuleCall_4_0 = (RuleCall)cProtocolsAssignment_4.eContents().get(0);
		private final Assignment cInterfacesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInterfacesGSSScenarioInterfacesParserRuleCall_5_0 = (RuleCall)cInterfacesAssignment_5.eContents().get(0);
		private final Assignment cSpecialPacketsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0 = (RuleCall)cSpecialPacketsAssignment_6.eContents().get(0);
		private final Assignment cPeriodicTCsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0 = (RuleCall)cPeriodicTCsAssignment_7.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_8 = (UnorderedGroup)cGroup.eContents().get(8);
		private final Assignment cGlobalVarsAssignment_8_0 = (Assignment)cUnorderedGroup_8.eContents().get(0);
		private final RuleCall cGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0 = (RuleCall)cGlobalVarsAssignment_8_0.eContents().get(0);
		private final Assignment cMonitorsAssignment_8_1 = (Assignment)cUnorderedGroup_8.eContents().get(1);
		private final RuleCall cMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0 = (RuleCall)cMonitorsAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//GSSScenarioScenario scenario::GSSScenarioScenario:
		//	'GSSScenarioScenario'
		//	name=STRING
		//	'{'
		//	gss_options=GSSScenarioOptions
		//	Protocols=GSSScenarioProtocols
		//	Interfaces=GSSScenarioInterfaces
		//	SpecialPackets=GSSScenarioSpecialPackets?
		//	PeriodicTCs=GSSScenarioPeriodicTCs? (GlobalVars=GSSScenarioGlobalVars & Monitors=GSSScenarioMonitors)?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioScenario' name=STRING '{' gss_options=GSSScenarioOptions Protocols=GSSScenarioProtocols
		//Interfaces=GSSScenarioInterfaces SpecialPackets=GSSScenarioSpecialPackets? PeriodicTCs=GSSScenarioPeriodicTCs?
		//(GlobalVars=GSSScenarioGlobalVars & Monitors=GSSScenarioMonitors)? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioScenario'
		public Keyword getGSSScenarioScenarioKeyword_0() { return cGSSScenarioScenarioKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//gss_options=GSSScenarioOptions
		public Assignment getGss_optionsAssignment_3() { return cGss_optionsAssignment_3; }
		
		//GSSScenarioOptions
		public RuleCall getGss_optionsGSSScenarioOptionsParserRuleCall_3_0() { return cGss_optionsGSSScenarioOptionsParserRuleCall_3_0; }
		
		//Protocols=GSSScenarioProtocols
		public Assignment getProtocolsAssignment_4() { return cProtocolsAssignment_4; }
		
		//GSSScenarioProtocols
		public RuleCall getProtocolsGSSScenarioProtocolsParserRuleCall_4_0() { return cProtocolsGSSScenarioProtocolsParserRuleCall_4_0; }
		
		//Interfaces=GSSScenarioInterfaces
		public Assignment getInterfacesAssignment_5() { return cInterfacesAssignment_5; }
		
		//GSSScenarioInterfaces
		public RuleCall getInterfacesGSSScenarioInterfacesParserRuleCall_5_0() { return cInterfacesGSSScenarioInterfacesParserRuleCall_5_0; }
		
		//SpecialPackets=GSSScenarioSpecialPackets?
		public Assignment getSpecialPacketsAssignment_6() { return cSpecialPacketsAssignment_6; }
		
		//GSSScenarioSpecialPackets
		public RuleCall getSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0() { return cSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0; }
		
		//PeriodicTCs=GSSScenarioPeriodicTCs?
		public Assignment getPeriodicTCsAssignment_7() { return cPeriodicTCsAssignment_7; }
		
		//GSSScenarioPeriodicTCs
		public RuleCall getPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0() { return cPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0; }
		
		//(GlobalVars=GSSScenarioGlobalVars & Monitors=GSSScenarioMonitors)?
		public UnorderedGroup getUnorderedGroup_8() { return cUnorderedGroup_8; }
		
		//GlobalVars=GSSScenarioGlobalVars
		public Assignment getGlobalVarsAssignment_8_0() { return cGlobalVarsAssignment_8_0; }
		
		//GSSScenarioGlobalVars
		public RuleCall getGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0() { return cGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0; }
		
		//Monitors=GSSScenarioMonitors
		public Assignment getMonitorsAssignment_8_1() { return cMonitorsAssignment_8_1; }
		
		//GSSScenarioMonitors
		public RuleCall getMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0() { return cMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class GSSScenarioOptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioOptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioOptionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGss_infoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGss_infoGSSScenarioGSSInfoParserRuleCall_2_0 = (RuleCall)cGss_infoAssignment_2.eContents().get(0);
		private final Assignment cGss_info_printAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0 = (RuleCall)cGss_info_printAssignment_3.eContents().get(0);
		private final Assignment cPhy_header_printAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0 = (RuleCall)cPhy_header_printAssignment_4.eContents().get(0);
		private final Assignment cDiscardErrorFlagsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0 = (RuleCall)cDiscardErrorFlagsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSScenarioOptions scenario::GSSScenarioOptions:
		//	'GSSScenarioOptions' '{'
		//	gss_info=GSSScenarioGSSInfo
		//	gss_info_print=GSSScenarioGSSInfoPrint
		//	phy_header_print=GSSScenarioPhyHeaderPrint
		//	discardErrorFlags=GSSScenarioGSSDiscardErrorFlags
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioOptions' '{' gss_info=GSSScenarioGSSInfo gss_info_print=GSSScenarioGSSInfoPrint
		//phy_header_print=GSSScenarioPhyHeaderPrint discardErrorFlags=GSSScenarioGSSDiscardErrorFlags '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioOptions'
		public Keyword getGSSScenarioOptionsKeyword_0() { return cGSSScenarioOptionsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//gss_info=GSSScenarioGSSInfo
		public Assignment getGss_infoAssignment_2() { return cGss_infoAssignment_2; }
		
		//GSSScenarioGSSInfo
		public RuleCall getGss_infoGSSScenarioGSSInfoParserRuleCall_2_0() { return cGss_infoGSSScenarioGSSInfoParserRuleCall_2_0; }
		
		//gss_info_print=GSSScenarioGSSInfoPrint
		public Assignment getGss_info_printAssignment_3() { return cGss_info_printAssignment_3; }
		
		//GSSScenarioGSSInfoPrint
		public RuleCall getGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0() { return cGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0; }
		
		//phy_header_print=GSSScenarioPhyHeaderPrint
		public Assignment getPhy_header_printAssignment_4() { return cPhy_header_printAssignment_4; }
		
		//GSSScenarioPhyHeaderPrint
		public RuleCall getPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0() { return cPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0; }
		
		//discardErrorFlags=GSSScenarioGSSDiscardErrorFlags
		public Assignment getDiscardErrorFlagsAssignment_5() { return cDiscardErrorFlagsAssignment_5; }
		
		//GSSScenarioGSSDiscardErrorFlags
		public RuleCall getDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0() { return cDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSScenarioProtocolsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioProtocols");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSScenarioProtocolsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSScenarioProtocolsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProtocolAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProtocolGSSScenarioProtocolParserRuleCall_3_0 = (RuleCall)cProtocolAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSScenarioProtocols scenario::GSSScenarioProtocols:
		//	{scenario::GSSScenarioProtocols}
		//	'GSSScenarioProtocols' '{'
		//	Protocol+=GSSScenarioProtocol*
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//{scenario::GSSScenarioProtocols} 'GSSScenarioProtocols' '{' Protocol+=GSSScenarioProtocol* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{scenario::GSSScenarioProtocols}
		public Action getGSSScenarioProtocolsAction_0() { return cGSSScenarioProtocolsAction_0; }
		
		//'GSSScenarioProtocols'
		public Keyword getGSSScenarioProtocolsKeyword_1() { return cGSSScenarioProtocolsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//Protocol+=GSSScenarioProtocol*
		public Assignment getProtocolAssignment_3() { return cProtocolAssignment_3; }
		
		//GSSScenarioProtocol
		public RuleCall getProtocolGSSScenarioProtocolParserRuleCall_3_0() { return cProtocolGSSScenarioProtocolParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSScenarioInterfacesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioInterfaces");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioInterfacesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cProtocolPacketsFileKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cProtocolPacketsFileAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0 = (CrossReference)cProtocolPacketsFileAssignment_2_2.eContents().get(0);
		private final RuleCall cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1 = (RuleCall)cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cMainInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0 = (RuleCall)cMainInterfaceAssignment_3.eContents().get(0);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInterfaceGSSScenarioInterfaceParserRuleCall_4_0 = (RuleCall)cInterfaceAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSScenarioInterfaces scenario::GSSScenarioInterfaces:
		//	'GSSScenarioInterfaces' '{' ('ProtocolPacketsFile' ':='
		//	ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		//	MainInterface=GSSScenarioMainInterface
		//	Interface+=GSSScenarioInterface*
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioInterfaces' '{' ('ProtocolPacketsFile' ':='
		//ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		//MainInterface=GSSScenarioMainInterface Interface+=GSSScenarioInterface* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioInterfaces'
		public Keyword getGSSScenarioInterfacesKeyword_0() { return cGSSScenarioInterfacesKeyword_0; }
		
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
		
		//MainInterface=GSSScenarioMainInterface
		public Assignment getMainInterfaceAssignment_3() { return cMainInterfaceAssignment_3; }
		
		//GSSScenarioMainInterface
		public RuleCall getMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0() { return cMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0; }
		
		//Interface+=GSSScenarioInterface*
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//GSSScenarioInterface
		public RuleCall getInterfaceGSSScenarioInterfaceParserRuleCall_4_0() { return cInterfaceGSSScenarioInterfaceParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class GSSScenarioSpecialPacketsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioSpecialPackets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioSpecialPacketsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpecialPacketAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0 = (RuleCall)cSpecialPacketAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSScenarioSpecialPackets scenario::GSSScenarioSpecialPackets:
		//	'GSSScenarioSpecialPackets' '{'
		//	SpecialPacket+=GSSScenarioSpecialPacket+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioSpecialPackets' '{' SpecialPacket+=GSSScenarioSpecialPacket+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioSpecialPackets'
		public Keyword getGSSScenarioSpecialPacketsKeyword_0() { return cGSSScenarioSpecialPacketsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//SpecialPacket+=GSSScenarioSpecialPacket+
		public Assignment getSpecialPacketAssignment_2() { return cSpecialPacketAssignment_2; }
		
		//GSSScenarioSpecialPacket
		public RuleCall getSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0() { return cSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSScenarioPeriodicTCsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPeriodicTCs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSScenarioPeriodicTCsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSScenarioPeriodicTCsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPeriodicTCAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0 = (RuleCall)cPeriodicTCAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSScenarioPeriodicTCs scenario::GSSScenarioPeriodicTCs:
		//	{scenario::GSSScenarioPeriodicTCs}
		//	'GSSScenarioPeriodicTCs' '{'
		//	PeriodicTC+=GSSScenarioPeriodicTC*
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//{scenario::GSSScenarioPeriodicTCs} 'GSSScenarioPeriodicTCs' '{' PeriodicTC+=GSSScenarioPeriodicTC* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{scenario::GSSScenarioPeriodicTCs}
		public Action getGSSScenarioPeriodicTCsAction_0() { return cGSSScenarioPeriodicTCsAction_0; }
		
		//'GSSScenarioPeriodicTCs'
		public Keyword getGSSScenarioPeriodicTCsKeyword_1() { return cGSSScenarioPeriodicTCsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//PeriodicTC+=GSSScenarioPeriodicTC*
		public Assignment getPeriodicTCAssignment_3() { return cPeriodicTCAssignment_3; }
		
		//GSSScenarioPeriodicTC
		public RuleCall getPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0() { return cPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSScenarioGlobalVarsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGlobalVars");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioGlobalVarsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGlobalVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0 = (RuleCall)cGlobalVarAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSScenarioGlobalVars scenario::GSSScenarioGlobalVars:
		//	'GSSScenarioGlobalVars' '{'
		//	GlobalVar+=GSSScenarioGlobalVar+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioGlobalVars' '{' GlobalVar+=GSSScenarioGlobalVar+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioGlobalVars'
		public Keyword getGSSScenarioGlobalVarsKeyword_0() { return cGSSScenarioGlobalVarsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//GlobalVar+=GSSScenarioGlobalVar+
		public Assignment getGlobalVarAssignment_2() { return cGlobalVarAssignment_2; }
		
		//GSSScenarioGlobalVar
		public RuleCall getGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0() { return cGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSScenarioMonitorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioMonitors");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioMonitorsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cChartsFileKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cChartsFileAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cChartsFileGSSChartsChartsCrossReference_2_2_0 = (CrossReference)cChartsFileAssignment_2_2.eContents().get(0);
		private final RuleCall cChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1 = (RuleCall)cChartsFileGSSChartsChartsCrossReference_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cMonitorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMonitorGSSScenarioMonitorParserRuleCall_3_0 = (RuleCall)cMonitorAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSScenarioMonitors scenario::GSSScenarioMonitors:
		//	'GSSScenarioMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		//	monitor+=GSSScenarioMonitor+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		//monitor+=GSSScenarioMonitor+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioMonitors'
		public Keyword getGSSScenarioMonitorsKeyword_0() { return cGSSScenarioMonitorsKeyword_0; }
		
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
		
		//monitor+=GSSScenarioMonitor+
		public Assignment getMonitorAssignment_3() { return cMonitorAssignment_3; }
		
		//GSSScenarioMonitor
		public RuleCall getMonitorGSSScenarioMonitorParserRuleCall_3_0() { return cMonitorGSSScenarioMonitorParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSScenarioGSSInfoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGSSInfo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioInfoKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		
		//GSSScenarioGSSInfo scenario::GSSScenarioInfo:
		//	'GSSScenarioInfo' '{'
		//	'test_campaign' ':=' test_campaign=STRING ';'
		//	'version' ':=' version=Version ';'
		//	'date' ':=' date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioInfo' '{' 'test_campaign' ':=' test_campaign=STRING ';' 'version' ':=' version=Version ';' 'date' ':='
		//date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioInfo'
		public Keyword getGSSScenarioInfoKeyword_0() { return cGSSScenarioInfoKeyword_0; }
		
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
	public class GSSScenarioGSSInfoPrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGSSInfoPrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioInfoPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainLogKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMainLogAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMainLogGSSScenarioEnableDisableEnumRuleCall_4_0 = (RuleCall)cMainLogAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortLogsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortLogsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0 = (RuleCall)cPortLogsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRawLogKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRawLogAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRawLogGSSScenarioEnableDisableEnumRuleCall_12_0 = (RuleCall)cRawLogAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSScenarioGSSInfoPrint scenario::GSSScenarioInfoPrint:
		//	'GSSScenarioInfoPrint'
		//	'{'
		//	'mainLog' ':=' mainLog=GSSScenarioEnableDisable ';'
		//	'portLogs' ':=' portLogs=GSSScenarioEnableDisable ';'
		//	'rawLog' ':=' rawLog=GSSScenarioEnableDisable ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioInfoPrint' '{' 'mainLog' ':=' mainLog=GSSScenarioEnableDisable ';' 'portLogs' ':='
		//portLogs=GSSScenarioEnableDisable ';' 'rawLog' ':=' rawLog=GSSScenarioEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioInfoPrint'
		public Keyword getGSSScenarioInfoPrintKeyword_0() { return cGSSScenarioInfoPrintKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'mainLog'
		public Keyword getMainLogKeyword_2() { return cMainLogKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//mainLog=GSSScenarioEnableDisable
		public Assignment getMainLogAssignment_4() { return cMainLogAssignment_4; }
		
		//GSSScenarioEnableDisable
		public RuleCall getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0() { return cMainLogGSSScenarioEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portLogs'
		public Keyword getPortLogsKeyword_6() { return cPortLogsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portLogs=GSSScenarioEnableDisable
		public Assignment getPortLogsAssignment_8() { return cPortLogsAssignment_8; }
		
		//GSSScenarioEnableDisable
		public RuleCall getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0() { return cPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'rawLog'
		public Keyword getRawLogKeyword_10() { return cRawLogKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//rawLog=GSSScenarioEnableDisable
		public Assignment getRawLogAssignment_12() { return cRawLogAssignment_12; }
		
		//GSSScenarioEnableDisable
		public RuleCall getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0() { return cRawLogGSSScenarioEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSScenarioPhyHeaderPrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPhyHeaderPrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPhyHeaderPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainLogKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMainLogAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMainLogGSSScenarioEnableDisableEnumRuleCall_4_0 = (RuleCall)cMainLogAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortLogsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortLogsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0 = (RuleCall)cPortLogsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRawLogKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRawLogAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRawLogGSSScenarioEnableDisableEnumRuleCall_12_0 = (RuleCall)cRawLogAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cGssTabsKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cGssTabsAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0 = (RuleCall)cGssTabsAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSScenarioPhyHeaderPrint scenario::GSSScenarioPhyHeaderPrint:
		//	'GSSScenarioPhyHeaderPrint' '{'
		//	'mainLog' ':=' mainLog=GSSScenarioEnableDisable ';'
		//	'portLogs' ':=' portLogs=GSSScenarioEnableDisable ';'
		//	'rawLog' ':=' rawLog=GSSScenarioEnableDisable ';'
		//	'gssTabs' ':=' gssTabs=GSSScenarioEnableDisable ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPhyHeaderPrint' '{' 'mainLog' ':=' mainLog=GSSScenarioEnableDisable ';' 'portLogs' ':='
		//portLogs=GSSScenarioEnableDisable ';' 'rawLog' ':=' rawLog=GSSScenarioEnableDisable ';' 'gssTabs' ':='
		//gssTabs=GSSScenarioEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPhyHeaderPrint'
		public Keyword getGSSScenarioPhyHeaderPrintKeyword_0() { return cGSSScenarioPhyHeaderPrintKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'mainLog'
		public Keyword getMainLogKeyword_2() { return cMainLogKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//mainLog=GSSScenarioEnableDisable
		public Assignment getMainLogAssignment_4() { return cMainLogAssignment_4; }
		
		//GSSScenarioEnableDisable
		public RuleCall getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0() { return cMainLogGSSScenarioEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portLogs'
		public Keyword getPortLogsKeyword_6() { return cPortLogsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portLogs=GSSScenarioEnableDisable
		public Assignment getPortLogsAssignment_8() { return cPortLogsAssignment_8; }
		
		//GSSScenarioEnableDisable
		public RuleCall getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0() { return cPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'rawLog'
		public Keyword getRawLogKeyword_10() { return cRawLogKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//rawLog=GSSScenarioEnableDisable
		public Assignment getRawLogAssignment_12() { return cRawLogAssignment_12; }
		
		//GSSScenarioEnableDisable
		public RuleCall getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0() { return cRawLogGSSScenarioEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'gssTabs'
		public Keyword getGssTabsKeyword_14() { return cGssTabsKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//gssTabs=GSSScenarioEnableDisable
		public Assignment getGssTabsAssignment_16() { return cGssTabsAssignment_16; }
		
		//GSSScenarioEnableDisable
		public RuleCall getGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0() { return cGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSScenarioGSSDiscardErrorFlagsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGSSDiscardErrorFlags");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioDiscardErrorFlagsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTxErrorsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTxErrorsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0 = (RuleCall)cTxErrorsAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNotExpectedPacketsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNotExpectedPacketsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0 = (RuleCall)cNotExpectedPacketsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFiltersKoKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFiltersKoAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0 = (RuleCall)cFiltersKoAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cValidTimesKoKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cValidTimesKoAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0 = (RuleCall)cValidTimesKoAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSScenarioGSSDiscardErrorFlags scenario::GSSScenarioDiscardErrorFlags:
		//	'GSSScenarioDiscardErrorFlags' '{'
		//	'txErrors' ':=' txErrors=GSSScenarioEnableDisable ';'
		//	'notExpectedPackets' ':=' notExpectedPackets=GSSScenarioEnableDisable ';'
		//	'filtersKo' ':=' filtersKo=GSSScenarioEnableDisable ';'
		//	'validTimesKo' ':=' validTimesKo=GSSScenarioEnableDisable ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioDiscardErrorFlags' '{' 'txErrors' ':=' txErrors=GSSScenarioEnableDisable ';' 'notExpectedPackets' ':='
		//notExpectedPackets=GSSScenarioEnableDisable ';' 'filtersKo' ':=' filtersKo=GSSScenarioEnableDisable ';' 'validTimesKo'
		//':=' validTimesKo=GSSScenarioEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioDiscardErrorFlags'
		public Keyword getGSSScenarioDiscardErrorFlagsKeyword_0() { return cGSSScenarioDiscardErrorFlagsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'txErrors'
		public Keyword getTxErrorsKeyword_2() { return cTxErrorsKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//txErrors=GSSScenarioEnableDisable
		public Assignment getTxErrorsAssignment_4() { return cTxErrorsAssignment_4; }
		
		//GSSScenarioEnableDisable
		public RuleCall getTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0() { return cTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'notExpectedPackets'
		public Keyword getNotExpectedPacketsKeyword_6() { return cNotExpectedPacketsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//notExpectedPackets=GSSScenarioEnableDisable
		public Assignment getNotExpectedPacketsAssignment_8() { return cNotExpectedPacketsAssignment_8; }
		
		//GSSScenarioEnableDisable
		public RuleCall getNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0() { return cNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'filtersKo'
		public Keyword getFiltersKoKeyword_10() { return cFiltersKoKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//filtersKo=GSSScenarioEnableDisable
		public Assignment getFiltersKoAssignment_12() { return cFiltersKoAssignment_12; }
		
		//GSSScenarioEnableDisable
		public RuleCall getFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0() { return cFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'validTimesKo'
		public Keyword getValidTimesKoKeyword_14() { return cValidTimesKoKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//validTimesKo=GSSScenarioEnableDisable
		public Assignment getValidTimesKoAssignment_16() { return cValidTimesKoAssignment_16; }
		
		//GSSScenarioEnableDisable
		public RuleCall getValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0() { return cValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSScenarioProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioProtocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Assignment cTypeAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cTypeGSSScenarioProtocolTypeParserRuleCall_14_0 = (RuleCall)cTypeAssignment_14.eContents().get(0);
		private final Assignment cSubtypeAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0 = (RuleCall)cSubtypeAssignment_15.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//GSSScenarioProtocol scenario::GSSScenarioProtocol:
		//	'GSSScenarioProtocol' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'typeLevel' ':=' typeLevel=INTEGER ';'
		//	type=GSSScenarioProtocolType
		//	subtype=GSSScenarioProtocolSubtype?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioProtocol' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'typeLevel' ':=' typeLevel=INTEGER ';'
		//type=GSSScenarioProtocolType subtype=GSSScenarioProtocolSubtype? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioProtocol'
		public Keyword getGSSScenarioProtocolKeyword_0() { return cGSSScenarioProtocolKeyword_0; }
		
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
		
		//type=GSSScenarioProtocolType
		public Assignment getTypeAssignment_14() { return cTypeAssignment_14; }
		
		//GSSScenarioProtocolType
		public RuleCall getTypeGSSScenarioProtocolTypeParserRuleCall_14_0() { return cTypeGSSScenarioProtocolTypeParserRuleCall_14_0; }
		
		//subtype=GSSScenarioProtocolSubtype?
		public Assignment getSubtypeAssignment_15() { return cSubtypeAssignment_15; }
		
		//GSSScenarioProtocolSubtype
		public RuleCall getSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0() { return cSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
	}
	public class GSSScenarioProtocolTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioProtocolType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioProtocolTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cOffsetKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cOffsetAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOffsetINTEGERParserRuleCall_8_0 = (RuleCall)cOffsetAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSScenarioProtocolType scenario::GSSScenarioProtocolType:
		//	'GSSScenarioProtocolType' '{'
		//	'name' ':=' name=STRING ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioProtocolType' '{' 'name' ':=' name=STRING ';' 'offset' ':=' offset=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioProtocolType'
		public Keyword getGSSScenarioProtocolTypeKeyword_0() { return cGSSScenarioProtocolTypeKeyword_0; }
		
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
		
		//'offset'
		public Keyword getOffsetKeyword_6() { return cOffsetKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_8() { return cOffsetAssignment_8; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_8_0() { return cOffsetINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSScenarioProtocolSubtypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioProtocolSubtype");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioProtocolSubtypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cOffsetKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cOffsetAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOffsetINTEGERParserRuleCall_8_0 = (RuleCall)cOffsetAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSScenarioProtocolSubtype scenario::GSSScenarioProtocolType:
		//	'GSSScenarioProtocolSubtype' '{'
		//	'name' ':=' name=STRING ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioProtocolSubtype' '{' 'name' ':=' name=STRING ';' 'offset' ':=' offset=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioProtocolSubtype'
		public Keyword getGSSScenarioProtocolSubtypeKeyword_0() { return cGSSScenarioProtocolSubtypeKeyword_0; }
		
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
		
		//'offset'
		public Keyword getOffsetKeyword_6() { return cOffsetKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_8() { return cOffsetAssignment_8; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_8_0() { return cOffsetINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSScenarioMainInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioMainInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioMainInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0 = (RuleCall)cIfTypeAssignment_12.eContents().get(0);
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
		private final RuleCall cIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0 = (RuleCall)cIoTypeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cProtocolIDKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cProtocolIDAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cProtocolIDGSSScenarioProtocolCrossReference_22_2_0 = (CrossReference)cProtocolIDAssignment_22_2.eContents().get(0);
		private final RuleCall cProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1 = (RuleCall)cProtocolIDGSSScenarioProtocolCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Assignment cLevelInOutAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0 = (RuleCall)cLevelInOutAssignment_23.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSScenarioMainInterface scenario::GSSScenarioInterface:
		//	'GSSScenarioMainInterface' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'ifType' ':=' ifType=GSSScenarioInterfaceType ';'
		//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//	'ioType' ':=' ioType=GSSScenarioInterfaceIOType ';' ('protocolID' ':='
		//	protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')?
		//	LevelInOut+=GSSScenarioLevelInOut+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioMainInterface' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'ifType' ':='
		//ifType=GSSScenarioInterfaceType ';' 'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//'ioType' ':=' ioType=GSSScenarioInterfaceIOType ';' ('protocolID' ':='
		//protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')? LevelInOut+=GSSScenarioLevelInOut+
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioMainInterface'
		public Keyword getGSSScenarioMainInterfaceKeyword_0() { return cGSSScenarioMainInterfaceKeyword_0; }
		
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
		
		//ifType=GSSScenarioInterfaceType
		public Assignment getIfTypeAssignment_12() { return cIfTypeAssignment_12; }
		
		//GSSScenarioInterfaceType
		public RuleCall getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0() { return cIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0; }
		
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
		
		//ioType=GSSScenarioInterfaceIOType
		public Assignment getIoTypeAssignment_20() { return cIoTypeAssignment_20; }
		
		//GSSScenarioInterfaceIOType
		public RuleCall getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0() { return cIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('protocolID' ':=' protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'protocolID'
		public Keyword getProtocolIDKeyword_22_0() { return cProtocolIDKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName]
		public Assignment getProtocolIDAssignment_22_2() { return cProtocolIDAssignment_22_2; }
		
		//[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName]
		public CrossReference getProtocolIDGSSScenarioProtocolCrossReference_22_2_0() { return cProtocolIDGSSScenarioProtocolCrossReference_22_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1() { return cProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//LevelInOut+=GSSScenarioLevelInOut+
		public Assignment getLevelInOutAssignment_23() { return cLevelInOutAssignment_23; }
		
		//GSSScenarioLevelInOut
		public RuleCall getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0() { return cLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSScenarioInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0 = (RuleCall)cIfTypeAssignment_12.eContents().get(0);
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
		private final RuleCall cIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0 = (RuleCall)cIoTypeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cProtocolIDKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cProtocolIDAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cProtocolIDGSSScenarioProtocolCrossReference_22_2_0 = (CrossReference)cProtocolIDAssignment_22_2.eContents().get(0);
		private final RuleCall cProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1 = (RuleCall)cProtocolIDGSSScenarioProtocolCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Alternatives cAlternatives_23 = (Alternatives)cGroup.eContents().get(23);
		private final Assignment cLevelInOutAssignment_23_0 = (Assignment)cAlternatives_23.eContents().get(0);
		private final RuleCall cLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0 = (RuleCall)cLevelInOutAssignment_23_0.eContents().get(0);
		private final Assignment cLevelInAssignment_23_1 = (Assignment)cAlternatives_23.eContents().get(1);
		private final RuleCall cLevelInGSSScenarioLevelInParserRuleCall_23_1_0 = (RuleCall)cLevelInAssignment_23_1.eContents().get(0);
		private final Assignment cLevelOutAssignment_23_2 = (Assignment)cAlternatives_23.eContents().get(2);
		private final RuleCall cLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0 = (RuleCall)cLevelOutAssignment_23_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSScenarioInterface scenario::GSSScenarioInterface:
		//	'GSSScenarioInterface' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'ifType' ':=' ifType=GSSScenarioInterfaceType ';'
		//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//	'ioType' ':=' ioType=GSSScenarioInterfaceIOType ';' ('protocolID' ':='
		//	protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSScenarioLevelInOut |
		//	LevelIn+=GSSScenarioLevelIn | LevelOut+=GSSScenarioLevelOut)+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioInterface' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'ifType' ':='
		//ifType=GSSScenarioInterfaceType ';' 'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//'ioType' ':=' ioType=GSSScenarioInterfaceIOType ';' ('protocolID' ':='
		//protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSScenarioLevelInOut |
		//LevelIn+=GSSScenarioLevelIn | LevelOut+=GSSScenarioLevelOut)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioInterface'
		public Keyword getGSSScenarioInterfaceKeyword_0() { return cGSSScenarioInterfaceKeyword_0; }
		
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
		
		//ifType=GSSScenarioInterfaceType
		public Assignment getIfTypeAssignment_12() { return cIfTypeAssignment_12; }
		
		//GSSScenarioInterfaceType
		public RuleCall getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0() { return cIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0; }
		
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
		
		//ioType=GSSScenarioInterfaceIOType
		public Assignment getIoTypeAssignment_20() { return cIoTypeAssignment_20; }
		
		//GSSScenarioInterfaceIOType
		public RuleCall getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0() { return cIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('protocolID' ':=' protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'protocolID'
		public Keyword getProtocolIDKeyword_22_0() { return cProtocolIDKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName]
		public Assignment getProtocolIDAssignment_22_2() { return cProtocolIDAssignment_22_2; }
		
		//[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName]
		public CrossReference getProtocolIDGSSScenarioProtocolCrossReference_22_2_0() { return cProtocolIDGSSScenarioProtocolCrossReference_22_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1() { return cProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//(LevelInOut+=GSSScenarioLevelInOut | LevelIn+=GSSScenarioLevelIn | LevelOut+=GSSScenarioLevelOut)+
		public Alternatives getAlternatives_23() { return cAlternatives_23; }
		
		//LevelInOut+=GSSScenarioLevelInOut
		public Assignment getLevelInOutAssignment_23_0() { return cLevelInOutAssignment_23_0; }
		
		//GSSScenarioLevelInOut
		public RuleCall getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0() { return cLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0; }
		
		//LevelIn+=GSSScenarioLevelIn
		public Assignment getLevelInAssignment_23_1() { return cLevelInAssignment_23_1; }
		
		//GSSScenarioLevelIn
		public RuleCall getLevelInGSSScenarioLevelInParserRuleCall_23_1_0() { return cLevelInGSSScenarioLevelInParserRuleCall_23_1_0; }
		
		//LevelOut+=GSSScenarioLevelOut
		public Assignment getLevelOutAssignment_23_2() { return cLevelOutAssignment_23_2; }
		
		//GSSScenarioLevelOut
		public RuleCall getLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0() { return cLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSScenarioLevelInOutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioLevelInOut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioLevelInOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final CrossReference cTMformatGSSFormatFormatCrossReference_12_0 = (CrossReference)cTMformatAssignment_12.eContents().get(0);
		private final RuleCall cTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTMformatGSSFormatFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cTCformatKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cTCformatAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cTCformatGSSFormatFormatCrossReference_16_0 = (CrossReference)cTCformatAssignment_16.eContents().get(0);
		private final RuleCall cTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cTCformatGSSFormatFormatCrossReference_16_0.eContents().get(1);
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
		
		//GSSScenarioLevelInOut scenario::GSSScenarioLevelInOut:
		//	'GSSScenarioLevelInOut' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TMformat' ':=' TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';'
		//	'TCformat' ':=' TCformat=[format::GSSFormatFormat|VersionedQualifiedName] ';'
		//	'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//	export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioLevelInOut' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TMformat' ':='
		//TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';' 'TCformat' ':='
		//TCformat=[format::GSSFormatFormat|VersionedQualifiedName] ';' 'inputFilter' ':='
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioLevelInOut'
		public Keyword getGSSScenarioLevelInOutKeyword_0() { return cGSSScenarioLevelInOutKeyword_0; }
		
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
		
		//TMformat=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_12() { return cTMformatAssignment_12; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getTMformatGSSFormatFormatCrossReference_12_0() { return cTMformatGSSFormatFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'TCformat'
		public Keyword getTCformatKeyword_14() { return cTCformatKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//TCformat=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getTCformatAssignment_16() { return cTCformatAssignment_16; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getTCformatGSSFormatFormatCrossReference_16_0() { return cTCformatGSSFormatFormatCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1() { return cTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_18() { return cInputFilterKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_20() { return cInputFilterAssignment_20; }
		
		//[filter::GSSFilterFilter|VersionedQualifiedName]
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
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_23_0() { return cImport_from_prev_LevelKeyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_23_2() { return cImport_from_prev_LevelAssignment_23_2; }
		
		//[import_::GSSImportImport|VersionedQualifiedName]
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
	public class GSSScenarioLevelInElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioLevelIn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioLevelInKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final CrossReference cTCformatGSSFormatFormatCrossReference_12_0 = (CrossReference)cTCformatAssignment_12.eContents().get(0);
		private final RuleCall cTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTCformatGSSFormatFormatCrossReference_12_0.eContents().get(1);
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
		
		//GSSScenarioLevelIn scenario::GSSScenarioLevelIn:
		//	'GSSScenarioLevelIn' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TCformat' ':=' TCformat=[format::GSSFormatFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//	export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioLevelIn' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TCformat' ':='
		//TCformat=[format::GSSFormatFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioLevelIn'
		public Keyword getGSSScenarioLevelInKeyword_0() { return cGSSScenarioLevelInKeyword_0; }
		
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
		
		//TCformat=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getTCformatAssignment_12() { return cTCformatAssignment_12; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getTCformatGSSFormatFormatCrossReference_12_0() { return cTCformatGSSFormatFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
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
	public class GSSScenarioLevelOutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioLevelOut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioLevelOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final CrossReference cTMformatGSSFormatFormatCrossReference_12_0 = (CrossReference)cTMformatAssignment_12.eContents().get(0);
		private final RuleCall cTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTMformatGSSFormatFormatCrossReference_12_0.eContents().get(1);
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
		
		//GSSScenarioLevelOut scenario::GSSScenarioLevelOut:
		//	'GSSScenarioLevelOut' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TMformat' ':=' TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';'
		//	'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioLevelOut' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TMformat' ':='
		//TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';' 'inputFilter' ':='
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
		//import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioLevelOut'
		public Keyword getGSSScenarioLevelOutKeyword_0() { return cGSSScenarioLevelOutKeyword_0; }
		
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
		
		//TMformat=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_12() { return cTMformatAssignment_12; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getTMformatGSSFormatFormatCrossReference_12_0() { return cTMformatGSSFormatFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_14() { return cInputFilterKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_16() { return cInputFilterAssignment_16; }
		
		//[filter::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_16_0() { return cInputFilterGSSFilterFilterCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_18_0() { return cImport_from_prev_LevelKeyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_18_2() { return cImport_from_prev_LevelAssignment_18_2; }
		
		//[import_::GSSImportImport|VersionedQualifiedName]
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
	public class GSSScenarioSpecialPacketElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioSpecialPacket");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioSpecialPacketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cStatusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatusGSSScenarioEnableDisableEnumRuleCall_4_0 = (RuleCall)cStatusAssignment_4.eContents().get(0);
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
		private final RuleCall cUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0 = (RuleCall)cUpperLevelsAssignment_30.eContents().get(0);
		private final Assignment cPrintingDataAssignment_31 = (Assignment)cGroup.eContents().get(31);
		private final RuleCall cPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0 = (RuleCall)cPrintingDataAssignment_31.eContents().get(0);
		private final Alternatives cAlternatives_32 = (Alternatives)cGroup.eContents().get(32);
		private final Assignment cPeriodAssignment_32_0 = (Assignment)cAlternatives_32.eContents().get(0);
		private final RuleCall cPeriodGSSScenarioPeriodParserRuleCall_32_0_0 = (RuleCall)cPeriodAssignment_32_0.eContents().get(0);
		private final Assignment cIntervalRangeAssignment_32_1 = (Assignment)cAlternatives_32.eContents().get(1);
		private final RuleCall cIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0 = (RuleCall)cIntervalRangeAssignment_32_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_33 = (Keyword)cGroup.eContents().get(33);
		private final Keyword cSemicolonKeyword_34 = (Keyword)cGroup.eContents().get(34);
		
		//GSSScenarioSpecialPacket scenario::GSSScenarioSpecialPacket:
		//	'GSSScenarioSpecialPacket' '{'
		//	'status' ':=' status=GSSScenarioEnableDisable ';'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'levels' ':=' levels=INTEGER ';'
		//	'levelRef' ':=' levelRef=INTEGER ';'
		//	'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';'
		//	UpperLevels+=GSSScenarioUpperLevels?
		//	printingData=GSSScenarioPrintingData (period=GSSScenarioPeriod | intervalRange=GSSScenarioIntervalRange)?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioSpecialPacket' '{' 'status' ':=' status=GSSScenarioEnableDisable ';' 'name' ':=' name=STRING ';' 'id' ':='
		//id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';' 'levels' ':=' levels=INTEGER ';' 'levelRef' ':=' levelRef=INTEGER ';'
		//'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';'
		//UpperLevels+=GSSScenarioUpperLevels? printingData=GSSScenarioPrintingData (period=GSSScenarioPeriod |
		//intervalRange=GSSScenarioIntervalRange)? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioSpecialPacket'
		public Keyword getGSSScenarioSpecialPacketKeyword_0() { return cGSSScenarioSpecialPacketKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'status'
		public Keyword getStatusKeyword_2() { return cStatusKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//status=GSSScenarioEnableDisable
		public Assignment getStatusAssignment_4() { return cStatusAssignment_4; }
		
		//GSSScenarioEnableDisable
		public RuleCall getStatusGSSScenarioEnableDisableEnumRuleCall_4_0() { return cStatusGSSScenarioEnableDisableEnumRuleCall_4_0; }
		
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
		
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_28() { return cInputFilterAssignment_28; }
		
		//[filter::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_28_0() { return cInputFilterGSSFilterFilterCrossReference_28_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_29() { return cSemicolonKeyword_29; }
		
		//UpperLevels+=GSSScenarioUpperLevels?
		public Assignment getUpperLevelsAssignment_30() { return cUpperLevelsAssignment_30; }
		
		//GSSScenarioUpperLevels
		public RuleCall getUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0() { return cUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0; }
		
		//printingData=GSSScenarioPrintingData
		public Assignment getPrintingDataAssignment_31() { return cPrintingDataAssignment_31; }
		
		//GSSScenarioPrintingData
		public RuleCall getPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0() { return cPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0; }
		
		//(period=GSSScenarioPeriod | intervalRange=GSSScenarioIntervalRange)?
		public Alternatives getAlternatives_32() { return cAlternatives_32; }
		
		//period=GSSScenarioPeriod
		public Assignment getPeriodAssignment_32_0() { return cPeriodAssignment_32_0; }
		
		//GSSScenarioPeriod
		public RuleCall getPeriodGSSScenarioPeriodParserRuleCall_32_0_0() { return cPeriodGSSScenarioPeriodParserRuleCall_32_0_0; }
		
		//intervalRange=GSSScenarioIntervalRange
		public Assignment getIntervalRangeAssignment_32_1() { return cIntervalRangeAssignment_32_1; }
		
		//GSSScenarioIntervalRange
		public RuleCall getIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0() { return cIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_33() { return cRightCurlyBracketKeyword_33; }
		
		//';'
		public Keyword getSemicolonKeyword_34() { return cSemicolonKeyword_34; }
	}
	public class GSSScenarioUpperLevelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioUpperLevels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioUpperLevelsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUpperLevelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0 = (RuleCall)cUpperLevelAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSScenarioUpperLevels scenario::GSSScenarioUpperLevels:
		//	'GSSScenarioUpperLevels' '{'
		//	UpperLevel+=GSSScenarioUpperLevel+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioUpperLevels' '{' UpperLevel+=GSSScenarioUpperLevel+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioUpperLevels'
		public Keyword getGSSScenarioUpperLevelsKeyword_0() { return cGSSScenarioUpperLevelsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//UpperLevel+=GSSScenarioUpperLevel+
		public Assignment getUpperLevelAssignment_2() { return cUpperLevelAssignment_2; }
		
		//GSSScenarioUpperLevel
		public RuleCall getUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0() { return cUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSScenarioPrintingDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPrintingData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPrintingDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPrintStatusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPrintStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0 = (RuleCall)cPrintStatusAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStructuredDataAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0 = (RuleCall)cStructuredDataAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSScenarioPrintingData scenario::GSSScenarioPrintingData:
		//	'GSSScenarioPrintingData' '{'
		//	'printStatus' ':=' printStatus=GSSScenarioEnableDisable ';'
		//	structuredData=GSSScenarioStructuredData?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPrintingData' '{' 'printStatus' ':=' printStatus=GSSScenarioEnableDisable ';'
		//structuredData=GSSScenarioStructuredData? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPrintingData'
		public Keyword getGSSScenarioPrintingDataKeyword_0() { return cGSSScenarioPrintingDataKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'printStatus'
		public Keyword getPrintStatusKeyword_2() { return cPrintStatusKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//printStatus=GSSScenarioEnableDisable
		public Assignment getPrintStatusAssignment_4() { return cPrintStatusAssignment_4; }
		
		//GSSScenarioEnableDisable
		public RuleCall getPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0() { return cPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//structuredData=GSSScenarioStructuredData?
		public Assignment getStructuredDataAssignment_6() { return cStructuredDataAssignment_6; }
		
		//GSSScenarioStructuredData
		public RuleCall getStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0() { return cStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSScenarioPeriodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPeriod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPeriodKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMin_valueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMin_valueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMin_valueINTEGERParserRuleCall_4_0 = (RuleCall)cMin_valueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMin_unitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMin_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMin_unitGSSScenarioUnitEnumRuleCall_8_0 = (RuleCall)cMin_unitAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cMax_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cMax_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cMax_valueINTEGERParserRuleCall_12_0 = (RuleCall)cMax_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cMax_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cMax_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cMax_unitGSSScenarioUnitEnumRuleCall_16_0 = (RuleCall)cMax_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSScenarioPeriod scenario::GSSScenarioPeriod:
		//	'GSSScenarioPeriod' '{'
		//	'min_value' ':=' min_value=INTEGER ';'
		//	'min_unit' ':=' min_unit=GSSScenarioUnit ';'
		//	'max_value' ':=' max_value=INTEGER ';'
		//	'max_unit' ':=' max_unit=GSSScenarioUnit ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPeriod' '{' 'min_value' ':=' min_value=INTEGER ';' 'min_unit' ':=' min_unit=GSSScenarioUnit ';' 'max_value'
		//':=' max_value=INTEGER ';' 'max_unit' ':=' max_unit=GSSScenarioUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPeriod'
		public Keyword getGSSScenarioPeriodKeyword_0() { return cGSSScenarioPeriodKeyword_0; }
		
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
		
		//min_unit=GSSScenarioUnit
		public Assignment getMin_unitAssignment_8() { return cMin_unitAssignment_8; }
		
		//GSSScenarioUnit
		public RuleCall getMin_unitGSSScenarioUnitEnumRuleCall_8_0() { return cMin_unitGSSScenarioUnitEnumRuleCall_8_0; }
		
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
		
		//max_unit=GSSScenarioUnit
		public Assignment getMax_unitAssignment_16() { return cMax_unitAssignment_16; }
		
		//GSSScenarioUnit
		public RuleCall getMax_unitGSSScenarioUnitEnumRuleCall_16_0() { return cMax_unitGSSScenarioUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSScenarioIntervalRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioIntervalRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioIntervalRangeKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cInterval_unitGSSScenarioUnitEnumRuleCall_16_0 = (RuleCall)cInterval_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSScenarioIntervalRange scenario::GSSScenarioIntervalRange:
		//	'GSSScenarioIntervalRange' '{'
		//	'min' ':=' min=INTEGER ';'
		//	'max' ':=' max=INTEGER ';'
		//	'interval_value' ':=' interval_value=INTEGER ';'
		//	'interval_unit' ':=' interval_unit=GSSScenarioUnit ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioIntervalRange' '{' 'min' ':=' min=INTEGER ';' 'max' ':=' max=INTEGER ';' 'interval_value' ':='
		//interval_value=INTEGER ';' 'interval_unit' ':=' interval_unit=GSSScenarioUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioIntervalRange'
		public Keyword getGSSScenarioIntervalRangeKeyword_0() { return cGSSScenarioIntervalRangeKeyword_0; }
		
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
		
		//interval_unit=GSSScenarioUnit
		public Assignment getInterval_unitAssignment_16() { return cInterval_unitAssignment_16; }
		
		//GSSScenarioUnit
		public RuleCall getInterval_unitGSSScenarioUnitEnumRuleCall_16_0() { return cInterval_unitGSSScenarioUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSScenarioUpperLevelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioUpperLevel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioUpperLevelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLevelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLevelAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0 = (RuleCall)cLevelAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTMformatKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cTMformatAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cTMformatGSSFormatFormatCrossReference_6_2_0 = (CrossReference)cTMformatAssignment_6_2.eContents().get(0);
		private final RuleCall cTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cTMformatGSSFormatFormatCrossReference_6_2_0.eContents().get(1);
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
		
		//GSSScenarioUpperLevel scenario::GSSScenarioUpperLevel:
		//	'GSSScenarioUpperLevel' '{'
		//	'level' ':=' level=GSSScenarioUpperLevelLevel ';' ('TMformat' ':='
		//	TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
		//	inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioUpperLevel' '{' 'level' ':=' level=GSSScenarioUpperLevelLevel ';' ('TMformat' ':='
		//TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioUpperLevel'
		public Keyword getGSSScenarioUpperLevelKeyword_0() { return cGSSScenarioUpperLevelKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'level'
		public Keyword getLevelKeyword_2() { return cLevelKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//level=GSSScenarioUpperLevelLevel
		public Assignment getLevelAssignment_4() { return cLevelAssignment_4; }
		
		//GSSScenarioUpperLevelLevel
		public RuleCall getLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0() { return cLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('TMformat' ':=' TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'TMformat'
		public Keyword getTMformatKeyword_6_0() { return cTMformatKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//TMformat=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_6_2() { return cTMformatAssignment_6_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getTMformatGSSFormatFormatCrossReference_6_2_0() { return cTMformatGSSFormatFormatCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//('inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_7_0() { return cInputFilterKeyword_7_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7_1() { return cColonEqualsSignKeyword_7_1; }
		
		//inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_7_2() { return cInputFilterAssignment_7_2; }
		
		//[filter::GSSFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterGSSFilterFilterCrossReference_7_2_0() { return cInputFilterGSSFilterFilterCrossReference_7_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1() { return cInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_7_3() { return cSemicolonKeyword_7_3; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_8_0() { return cImport_from_prev_LevelKeyword_8_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_8_1() { return cColonEqualsSignKeyword_8_1; }
		
		//import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_8_2() { return cImport_from_prev_LevelAssignment_8_2; }
		
		//[import_::GSSImportImport|VersionedQualifiedName]
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
	public class GSSScenarioStructuredDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioStructuredData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioStructuredDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		
		//GSSScenarioStructuredData scenario::GSSScenarioStructuredData:
		//	'GSSScenarioStructuredData' '{'
		//	'levelRef' ':=' levelRef=INTEGER ';'
		//	'firstField' ':=' firstField=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioStructuredData' '{' 'levelRef' ':=' levelRef=INTEGER ';' 'firstField' ':=' firstField=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioStructuredData'
		public Keyword getGSSScenarioStructuredDataKeyword_0() { return cGSSScenarioStructuredDataKeyword_0; }
		
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
	public class GSSScenarioPeriodicTCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPeriodicTC");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSScenarioPeriodicTCLevel2ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSScenarioPeriodicTCLevel1ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSScenarioPeriodicTCLevel0ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//GSSScenarioPeriodicTC scenario::GSSScenarioPeriodicTC:
		//	GSSScenarioPeriodicTCLevel2 | GSSScenarioPeriodicTCLevel1 | GSSScenarioPeriodicTCLevel0
		@Override public ParserRule getRule() { return rule; }
		
		//GSSScenarioPeriodicTCLevel2 | GSSScenarioPeriodicTCLevel1 | GSSScenarioPeriodicTCLevel0
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSScenarioPeriodicTCLevel2
		public RuleCall getGSSScenarioPeriodicTCLevel2ParserRuleCall_0() { return cGSSScenarioPeriodicTCLevel2ParserRuleCall_0; }
		
		//GSSScenarioPeriodicTCLevel1
		public RuleCall getGSSScenarioPeriodicTCLevel1ParserRuleCall_1() { return cGSSScenarioPeriodicTCLevel1ParserRuleCall_1; }
		
		//GSSScenarioPeriodicTCLevel0
		public RuleCall getGSSScenarioPeriodicTCLevel0ParserRuleCall_2() { return cGSSScenarioPeriodicTCLevel0ParserRuleCall_2; }
	}
	public class GSSScenarioPeriodicTCLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPeriodicTCLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPeriodicTCLevel2Keyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPeriod_unitGSSScenarioUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel2Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel2Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel2GSSFormatFormatCrossReference_22_2_0 = (CrossReference)cLevel2Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel2GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel2GSSFormatFormatCrossReference_22_2_0.eContents().get(1);
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
		private final CrossReference cLevel1GSSFormatFormatCrossReference_27_2_0 = (CrossReference)cLevel1Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel1GSSFormatFormatCrossReference_27_2_0.eContents().get(1);
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
		private final CrossReference cLevel0GSSFormatFormatCrossReference_29_2_0 = (CrossReference)cLevel0Assignment_29_2.eContents().get(0);
		private final RuleCall cLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1 = (RuleCall)cLevel0GSSFormatFormatCrossReference_29_2_0.eContents().get(1);
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
		
		//GSSScenarioPeriodicTCLevel2 scenario::GSSScenarioPeriodicTCLevel2:
		//	'GSSScenarioPeriodicTCLevel2' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level2' ':='
		//	level2=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level2' ':=' app_to_level2=[export::GSSExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//	level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//	level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//	level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPeriodicTCLevel2' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level2' ':='
		//level2=[format::GSSFormatFormat|VersionedQualifiedName] ';')? 'app_to_level2' ':='
		//app_to_level2=[export::GSSExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPeriodicTCLevel2'
		public Keyword getGSSScenarioPeriodicTCLevel2Keyword_0() { return cGSSScenarioPeriodicTCLevel2Keyword_0; }
		
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
		
		//period_unit=GSSScenarioUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSScenarioUnit
		public RuleCall getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0() { return cPeriod_unitGSSScenarioUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level2' ':=' level2=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level2'
		public Keyword getLevel2Keyword_22_0() { return cLevel2Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level2=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_22_2() { return cLevel2Assignment_22_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel2GSSFormatFormatCrossReference_22_2_0() { return cLevel2GSSFormatFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel2GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
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
		
		//('level1' ':=' level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level1'
		public Keyword getLevel1Keyword_27_0() { return cLevel1Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level1=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_27_2() { return cLevel1Assignment_27_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1GSSFormatFormatCrossReference_27_2_0() { return cLevel1GSSFormatFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
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
		
		//('level0' ':=' level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_29() { return cGroup_29; }
		
		//'level0'
		public Keyword getLevel0Keyword_29_0() { return cLevel0Keyword_29_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_29_1() { return cColonEqualsSignKeyword_29_1; }
		
		//level0=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_29_2() { return cLevel0Assignment_29_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0GSSFormatFormatCrossReference_29_2_0() { return cLevel0GSSFormatFormatCrossReference_29_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1() { return cLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1; }
		
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
	public class GSSScenarioPeriodicTCLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPeriodicTCLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPeriodicTCLevel1Keyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPeriod_unitGSSScenarioUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel1Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel1Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel1GSSFormatFormatCrossReference_22_2_0 = (CrossReference)cLevel1Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel1GSSFormatFormatCrossReference_22_2_0.eContents().get(1);
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
		private final CrossReference cLevel0GSSFormatFormatCrossReference_27_2_0 = (CrossReference)cLevel0Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel0GSSFormatFormatCrossReference_27_2_0.eContents().get(1);
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
		
		//GSSScenarioPeriodicTCLevel1 scenario::GSSScenarioPeriodicTCLevel1:
		//	'GSSScenarioPeriodicTCLevel1' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level1' ':='
		//	level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level1' ':=' app_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//	level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPeriodicTCLevel1' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level1' ':='
		//level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')? 'app_to_level1' ':='
		//app_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPeriodicTCLevel1'
		public Keyword getGSSScenarioPeriodicTCLevel1Keyword_0() { return cGSSScenarioPeriodicTCLevel1Keyword_0; }
		
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
		
		//period_unit=GSSScenarioUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSScenarioUnit
		public RuleCall getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0() { return cPeriod_unitGSSScenarioUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level1' ':=' level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level1'
		public Keyword getLevel1Keyword_22_0() { return cLevel1Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level1=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_22_2() { return cLevel1Assignment_22_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1GSSFormatFormatCrossReference_22_2_0() { return cLevel1GSSFormatFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
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
		
		//('level0' ':=' level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level0'
		public Keyword getLevel0Keyword_27_0() { return cLevel0Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level0=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_27_2() { return cLevel0Assignment_27_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0GSSFormatFormatCrossReference_27_2_0() { return cLevel0GSSFormatFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
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
	public class GSSScenarioPeriodicTCLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPeriodicTCLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPeriodicTCLevel0Keyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPeriod_unitGSSScenarioUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel0Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel0Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel0GSSFormatFormatCrossReference_22_2_0 = (CrossReference)cLevel0Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel0GSSFormatFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level0Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level0Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level0GSSExportExportCrossReference_25_0 = (CrossReference)cApp_to_level0Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level0GSSExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Keyword cRightCurlyBracketKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Keyword cSemicolonKeyword_28 = (Keyword)cGroup.eContents().get(28);
		
		//GSSScenarioPeriodicTCLevel0 scenario::GSSScenarioPeriodicTCLevel0:
		//	'GSSScenarioPeriodicTCLevel0' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level0' ':='
		//	level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level0' ':=' app_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPeriodicTCLevel0' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level0' ':='
		//level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? 'app_to_level0' ':='
		//app_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPeriodicTCLevel0'
		public Keyword getGSSScenarioPeriodicTCLevel0Keyword_0() { return cGSSScenarioPeriodicTCLevel0Keyword_0; }
		
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
		
		//period_unit=GSSScenarioUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSScenarioUnit
		public RuleCall getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0() { return cPeriod_unitGSSScenarioUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level0' ':=' level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level0'
		public Keyword getLevel0Keyword_22_0() { return cLevel0Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level0=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_22_2() { return cLevel0Assignment_22_2; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0GSSFormatFormatCrossReference_22_2_0() { return cLevel0GSSFormatFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
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
	public class GSSScenarioGlobalVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGlobalVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioGlobalVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0 = (RuleCall)cTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cInitial_valueKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInitial_valueAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cInitial_valueINTEGERParserRuleCall_16_0 = (RuleCall)cInitial_valueAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cReferenceAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cReferenceGSSScenarioReferenceParserRuleCall_18_0 = (RuleCall)cReferenceAssignment_18.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cSemicolonKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//GSSScenarioGlobalVar scenario::GSSScenarioGlobalVar:
		//	'GSSScenarioGlobalVar' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'type' ':=' type=GSSScenarioGlobalVarType ';'
		//	'initial_value' ':=' initial_value=INTEGER ';'
		//	reference=GSSScenarioReference
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioGlobalVar' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'type' ':='
		//type=GSSScenarioGlobalVarType ';' 'initial_value' ':=' initial_value=INTEGER ';' reference=GSSScenarioReference '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioGlobalVar'
		public Keyword getGSSScenarioGlobalVarKeyword_0() { return cGSSScenarioGlobalVarKeyword_0; }
		
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
		
		//type=GSSScenarioGlobalVarType
		public Assignment getTypeAssignment_12() { return cTypeAssignment_12; }
		
		//GSSScenarioGlobalVarType
		public RuleCall getTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0() { return cTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0; }
		
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
		
		//reference=GSSScenarioReference
		public Assignment getReferenceAssignment_18() { return cReferenceAssignment_18; }
		
		//GSSScenarioReference
		public RuleCall getReferenceGSSScenarioReferenceParserRuleCall_18_0() { return cReferenceGSSScenarioReferenceParserRuleCall_18_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
		
		//';'
		public Keyword getSemicolonKeyword_20() { return cSemicolonKeyword_20; }
	}
	public class GSSScenarioReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioReference");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSScenarioReferenceFieldParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSScenarioReferencePeriodicTCParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSScenarioReferenceSpecialPacketParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//GSSScenarioReference scenario::GSSScenarioReference:
		//	GSSScenarioReferenceField | GSSScenarioReferencePeriodicTC | GSSScenarioReferenceSpecialPacket
		@Override public ParserRule getRule() { return rule; }
		
		//GSSScenarioReferenceField | GSSScenarioReferencePeriodicTC | GSSScenarioReferenceSpecialPacket
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSScenarioReferenceField
		public RuleCall getGSSScenarioReferenceFieldParserRuleCall_0() { return cGSSScenarioReferenceFieldParserRuleCall_0; }
		
		//GSSScenarioReferencePeriodicTC
		public RuleCall getGSSScenarioReferencePeriodicTCParserRuleCall_1() { return cGSSScenarioReferencePeriodicTCParserRuleCall_1; }
		
		//GSSScenarioReferenceSpecialPacket
		public RuleCall getGSSScenarioReferenceSpecialPacketParserRuleCall_2() { return cGSSScenarioReferenceSpecialPacketParserRuleCall_2; }
	}
	public class GSSScenarioReferenceFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioReferenceField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioReferenceFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
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
		
		//GSSScenarioReferenceField scenario::GSSScenarioReferenceField:
		//	'GSSScenarioReferenceField' '{'
		//	'type' ':=' type=GSSScenarioReferenceFieldType ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioReferenceField' '{' 'type' ':=' type=GSSScenarioReferenceFieldType ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'level' ':=' level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':='
		//size=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioReferenceField'
		public Keyword getGSSScenarioReferenceFieldKeyword_0() { return cGSSScenarioReferenceFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//type=GSSScenarioReferenceFieldType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//GSSScenarioReferenceFieldType
		public RuleCall getTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0() { return cTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0; }
		
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
	public class GSSScenarioReferencePeriodicTCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioReferencePeriodicTC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioReferencePeriodicTCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cIdRefGSSScenarioPeriodicTCCrossReference_4_0 = (CrossReference)cIdRefAssignment_4.eContents().get(0);
		private final RuleCall cIdRefGSSScenarioPeriodicTCSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cIdRefGSSScenarioPeriodicTCCrossReference_4_0.eContents().get(1);
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
		
		//GSSScenarioReferencePeriodicTC scenario::GSSScenarioReferencePeriodicTC:
		//	'GSSScenarioReferencePeriodicTC' '{'
		//	'idRef' ':=' idRef=[scenario::GSSScenarioPeriodicTC|STRING] ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioReferencePeriodicTC' '{' 'idRef' ':=' idRef=[scenario::GSSScenarioPeriodicTC|STRING] ';' 'level' ':='
		//level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER ';'
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioReferencePeriodicTC'
		public Keyword getGSSScenarioReferencePeriodicTCKeyword_0() { return cGSSScenarioReferencePeriodicTCKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=[scenario::GSSScenarioPeriodicTC|STRING]
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//[scenario::GSSScenarioPeriodicTC|STRING]
		public CrossReference getIdRefGSSScenarioPeriodicTCCrossReference_4_0() { return cIdRefGSSScenarioPeriodicTCCrossReference_4_0; }
		
		//STRING
		public RuleCall getIdRefGSSScenarioPeriodicTCSTRINGTerminalRuleCall_4_0_1() { return cIdRefGSSScenarioPeriodicTCSTRINGTerminalRuleCall_4_0_1; }
		
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
	public class GSSScenarioReferenceSpecialPacketElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioReferenceSpecialPacket");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioReferenceSpecialPacketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cIdRefGSSScenarioSpecialPacketCrossReference_4_0 = (CrossReference)cIdRefAssignment_4.eContents().get(0);
		private final RuleCall cIdRefGSSScenarioSpecialPacketSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cIdRefGSSScenarioSpecialPacketCrossReference_4_0.eContents().get(1);
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
		
		//GSSScenarioReferenceSpecialPacket scenario::GSSScenarioReferenceSpecialPacket:
		//	'GSSScenarioReferenceSpecialPacket' '{'
		//	'idRef' ':=' idRef=[scenario::GSSScenarioSpecialPacket|STRING] ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioReferenceSpecialPacket' '{' 'idRef' ':=' idRef=[scenario::GSSScenarioSpecialPacket|STRING] ';' 'level' ':='
		//level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER ';'
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioReferenceSpecialPacket'
		public Keyword getGSSScenarioReferenceSpecialPacketKeyword_0() { return cGSSScenarioReferenceSpecialPacketKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=[scenario::GSSScenarioSpecialPacket|STRING]
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//[scenario::GSSScenarioSpecialPacket|STRING]
		public CrossReference getIdRefGSSScenarioSpecialPacketCrossReference_4_0() { return cIdRefGSSScenarioSpecialPacketCrossReference_4_0; }
		
		//STRING
		public RuleCall getIdRefGSSScenarioSpecialPacketSTRINGTerminalRuleCall_4_0_1() { return cIdRefGSSScenarioSpecialPacketSTRINGTerminalRuleCall_4_0_1; }
		
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
	public class GSSScenarioMonitorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioMonitor");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSScenarioPlotParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSScenarioAlarmMsgParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSScenarioModifyParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSScenarioAlarmValParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//GSSScenarioMonitor scenario::GSSScenarioMonitor:
		//	GSSScenarioPlot | GSSScenarioAlarmMsg | GSSScenarioModify | GSSScenarioAlarmVal
		@Override public ParserRule getRule() { return rule; }
		
		//GSSScenarioPlot | GSSScenarioAlarmMsg | GSSScenarioModify | GSSScenarioAlarmVal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSScenarioPlot
		public RuleCall getGSSScenarioPlotParserRuleCall_0() { return cGSSScenarioPlotParserRuleCall_0; }
		
		//GSSScenarioAlarmMsg
		public RuleCall getGSSScenarioAlarmMsgParserRuleCall_1() { return cGSSScenarioAlarmMsgParserRuleCall_1; }
		
		//GSSScenarioModify
		public RuleCall getGSSScenarioModifyParserRuleCall_2() { return cGSSScenarioModifyParserRuleCall_2; }
		
		//GSSScenarioAlarmVal
		public RuleCall getGSSScenarioAlarmValParserRuleCall_3() { return cGSSScenarioAlarmValParserRuleCall_3; }
	}
	public class GSSScenarioPlotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioPlot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioPlotKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cChartRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cChartRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cChartRefGSSChartsChartCrossReference_8_0 = (CrossReference)cChartRefAssignment_8.eContents().get(0);
		private final RuleCall cChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cChartRefGSSChartsChartCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cGVRefAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cGVRefGSSScenarioGVRefParserRuleCall_10_0 = (RuleCall)cGVRefAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSScenarioPlot scenario::GSSScenarioPlot:
		//	'GSSScenarioPlot' '{'
		//	'name' ':=' name=STRING ';'
		//	'chartRef' ':=' chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName] ';'
		//	GVRef=GSSScenarioGVRef
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioPlot' '{' 'name' ':=' name=STRING ';' 'chartRef' ':='
		//chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName] ';' GVRef=GSSScenarioGVRef '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioPlot'
		public Keyword getGSSScenarioPlotKeyword_0() { return cGSSScenarioPlotKeyword_0; }
		
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
		
		//'chartRef'
		public Keyword getChartRefKeyword_6() { return cChartRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName]
		public Assignment getChartRefAssignment_8() { return cChartRefAssignment_8; }
		
		//[charts::GSSChartsChart|VersionedQualifiedReferenceName]
		public CrossReference getChartRefGSSChartsChartCrossReference_8_0() { return cChartRefGSSChartsChartCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//GVRef=GSSScenarioGVRef
		public Assignment getGVRefAssignment_10() { return cGVRefAssignment_10; }
		
		//GSSScenarioGVRef
		public RuleCall getGVRefGSSScenarioGVRefParserRuleCall_10_0() { return cGVRefGSSScenarioGVRefParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSScenarioAlarmMsgElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioAlarmMsg");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioAlarmMsgKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTextKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTextAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTextSTRINGTerminalRuleCall_12_0 = (RuleCall)cTextAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cGVRefAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cGVRefGSSScenarioGVRefParserRuleCall_14_0 = (RuleCall)cGVRefAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSScenarioAlarmMsg scenario::GSSScenarioAlarmMsg:
		//	'GSSScenarioAlarmMsg' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSScenarioAlarmMsgType ';'
		//	'text' ':=' text=STRING ';'
		//	GVRef=GSSScenarioGVRef
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioAlarmMsg' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSScenarioAlarmMsgType ';' 'text' ':='
		//text=STRING ';' GVRef=GSSScenarioGVRef '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioAlarmMsg'
		public Keyword getGSSScenarioAlarmMsgKeyword_0() { return cGSSScenarioAlarmMsgKeyword_0; }
		
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
		
		//type=GSSScenarioAlarmMsgType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSScenarioAlarmMsgType
		public RuleCall getTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0() { return cTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'text'
		public Keyword getTextKeyword_10() { return cTextKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//text=STRING
		public Assignment getTextAssignment_12() { return cTextAssignment_12; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_12_0() { return cTextSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//GVRef=GSSScenarioGVRef
		public Assignment getGVRefAssignment_14() { return cGVRefAssignment_14; }
		
		//GSSScenarioGVRef
		public RuleCall getGVRefGSSScenarioGVRefParserRuleCall_14_0() { return cGVRefGSSScenarioGVRefParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSScenarioModifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioModify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioModifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSScenarioModifyTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cValueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cValueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cValueINTEGERParserRuleCall_12_0 = (RuleCall)cValueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cGVRefAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cGVRefGSSScenarioGVRefParserRuleCall_14_0 = (RuleCall)cGVRefAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSScenarioModify scenario::GSSScenarioModify:
		//	'GSSScenarioModify' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSScenarioModifyType ';'
		//	'value' ':=' value=INTEGER ';'
		//	GVRef=GSSScenarioGVRef
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioModify' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSScenarioModifyType ';' 'value' ':='
		//value=INTEGER ';' GVRef=GSSScenarioGVRef '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioModify'
		public Keyword getGSSScenarioModifyKeyword_0() { return cGSSScenarioModifyKeyword_0; }
		
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
		
		//type=GSSScenarioModifyType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSScenarioModifyType
		public RuleCall getTypeGSSScenarioModifyTypeEnumRuleCall_8_0() { return cTypeGSSScenarioModifyTypeEnumRuleCall_8_0; }
		
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
		
		//GVRef=GSSScenarioGVRef
		public Assignment getGVRefAssignment_14() { return cGVRefAssignment_14; }
		
		//GSSScenarioGVRef
		public RuleCall getGVRefGSSScenarioGVRefParserRuleCall_14_0() { return cGVRefGSSScenarioGVRefParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSScenarioAlarmValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioAlarmVal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioAlarmValKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cGVRefAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cGVRefGSSScenarioGVRefParserRuleCall_10_0 = (RuleCall)cGVRefAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSScenarioAlarmVal scenario::GSSScenarioAlarmVal:
		//	'GSSScenarioAlarmVal' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSScenarioAlarmValType ';'
		//	GVRef=GSSScenarioGVRef
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioAlarmVal' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSScenarioAlarmValType ';'
		//GVRef=GSSScenarioGVRef '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioAlarmVal'
		public Keyword getGSSScenarioAlarmValKeyword_0() { return cGSSScenarioAlarmValKeyword_0; }
		
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
		
		//type=GSSScenarioAlarmValType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSScenarioAlarmValType
		public RuleCall getTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0() { return cTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//GVRef=GSSScenarioGVRef
		public Assignment getGVRefAssignment_10() { return cGVRefAssignment_10; }
		
		//GSSScenarioGVRef
		public RuleCall getGVRefGSSScenarioGVRefParserRuleCall_10_0() { return cGVRefGSSScenarioGVRefParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSScenarioGVRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGVRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSScenarioGVFilteredParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSScenarioGVPeriodicParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//GSSScenarioGVRef scenario::GSSScenarioGVRef:
		//	GSSScenarioGVFiltered | GSSScenarioGVPeriodic
		@Override public ParserRule getRule() { return rule; }
		
		//GSSScenarioGVFiltered | GSSScenarioGVPeriodic
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSScenarioGVFiltered
		public RuleCall getGSSScenarioGVFilteredParserRuleCall_0() { return cGSSScenarioGVFilteredParserRuleCall_0; }
		
		//GSSScenarioGVPeriodic
		public RuleCall getGSSScenarioGVPeriodicParserRuleCall_1() { return cGSSScenarioGVPeriodicParserRuleCall_1; }
	}
	public class GSSScenarioGVFilteredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGVFiltered");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioGVFilteredKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cGlobalVarRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGlobalVarRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0 = (CrossReference)cGlobalVarRefAssignment_4.eContents().get(0);
		private final RuleCall cGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0.eContents().get(1);
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
		
		//GSSScenarioGVFiltered scenario::GSSScenarioGVFiltered:
		//	'GSSScenarioGVFiltered' '{'
		//	'GlobalVarRef' ':=' GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING] ';' ('filter' ':='
		//	filter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioGVFiltered' '{' 'GlobalVarRef' ':=' GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING] ';' ('filter' ':='
		//filter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioGVFiltered'
		public Keyword getGSSScenarioGVFilteredKeyword_0() { return cGSSScenarioGVFilteredKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'GlobalVarRef'
		public Keyword getGlobalVarRefKeyword_2() { return cGlobalVarRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING]
		public Assignment getGlobalVarRefAssignment_4() { return cGlobalVarRefAssignment_4; }
		
		//[scenario::GSSScenarioGlobalVar|STRING]
		public CrossReference getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0() { return cGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0; }
		
		//STRING
		public RuleCall getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1() { return cGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('filter' ':=' filter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'filter'
		public Keyword getFilterKeyword_6_0() { return cFilterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//filter=[filter::GSSFilterFilter|VersionedQualifiedName]
		public Assignment getFilterAssignment_6_2() { return cFilterAssignment_6_2; }
		
		//[filter::GSSFilterFilter|VersionedQualifiedName]
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
	public class GSSScenarioGVPeriodicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGVPeriodic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSScenarioGVPeriodicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cGlobalVarRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGlobalVarRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0 = (CrossReference)cGlobalVarRefAssignment_4.eContents().get(0);
		private final RuleCall cGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPeriod_valueKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPeriod_valueAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPeriod_valueINTEGERParserRuleCall_8_0 = (RuleCall)cPeriod_valueAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cPeriod_unitKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cPeriod_unitAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cPeriod_unitGSSScenarioUnitEnumRuleCall_12_0 = (RuleCall)cPeriod_unitAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSScenarioGVPeriodic scenario::GSSScenarioGVPeriodic:
		//	'GSSScenarioGVPeriodic' '{'
		//	'GlobalVarRef' ':=' GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING] ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSScenarioUnit ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSScenarioGVPeriodic' '{' 'GlobalVarRef' ':=' GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING] ';' 'period_value'
		//':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSScenarioUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSScenarioGVPeriodic'
		public Keyword getGSSScenarioGVPeriodicKeyword_0() { return cGSSScenarioGVPeriodicKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'GlobalVarRef'
		public Keyword getGlobalVarRefKeyword_2() { return cGlobalVarRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING]
		public Assignment getGlobalVarRefAssignment_4() { return cGlobalVarRefAssignment_4; }
		
		//[scenario::GSSScenarioGlobalVar|STRING]
		public CrossReference getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0() { return cGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0; }
		
		//STRING
		public RuleCall getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1() { return cGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'period_value'
		public Keyword getPeriod_valueKeyword_6() { return cPeriod_valueKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//period_value=INTEGER
		public Assignment getPeriod_valueAssignment_8() { return cPeriod_valueAssignment_8; }
		
		//INTEGER
		public RuleCall getPeriod_valueINTEGERParserRuleCall_8_0() { return cPeriod_valueINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'period_unit'
		public Keyword getPeriod_unitKeyword_10() { return cPeriod_unitKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//period_unit=GSSScenarioUnit
		public Assignment getPeriod_unitAssignment_12() { return cPeriod_unitAssignment_12; }
		
		//GSSScenarioUnit
		public RuleCall getPeriod_unitGSSScenarioUnitEnumRuleCall_12_0() { return cPeriod_unitGSSScenarioUnitEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSTestListTestListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSTestListTestList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestListTestListKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestCaseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTestCaseGSSTestListTestCaseParserRuleCall_2_0 = (RuleCall)cTestCaseAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSTestListTestList test_list::GSSTestListTestList:
		//	'GSSTestListTestList' '{'
		//	TestCase+=GSSTestListTestCase+
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestListTestList' '{' TestCase+=GSSTestListTestCase+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestListTestList'
		public Keyword getGSSTestListTestListKeyword_0() { return cGSSTestListTestListKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//TestCase+=GSSTestListTestCase+
		public Assignment getTestCaseAssignment_2() { return cTestCaseAssignment_2; }
		
		//GSSTestListTestCase
		public RuleCall getTestCaseGSSTestListTestCaseParserRuleCall_2_0() { return cTestCaseGSSTestListTestCaseParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSTestListTestCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSTestListTestCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestListTestCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cPrevMsgKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cPrevMsgAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cPrevMsgIDTerminalRuleCall_10_1_0 = (RuleCall)cPrevMsgAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cPrevActionKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cPrevActionAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0 = (RuleCall)cPrevActionAssignment_11_1.eContents().get(0);
		private final Group cGroup_11_2 = (Group)cGroup_11.eContents().get(2);
		private final Keyword cPrevActionParamKeyword_11_2_0 = (Keyword)cGroup_11_2.eContents().get(0);
		private final Assignment cPrevActionParamAssignment_11_2_1 = (Assignment)cGroup_11_2.eContents().get(1);
		private final RuleCall cPrevActionParamSTRINGTerminalRuleCall_11_2_1_0 = (RuleCall)cPrevActionParamAssignment_11_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//GSSTestListTestCase test_list::GSSTestListTestCase:
		//	'GSSTestListTestCase' '{'
		//	'name' ':=' name=STRING ';'
		//	'procedure' ':=' procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName] ';' ('prevMsg' prevMsg=ID)?
		//	('prevAction' prevAction=GSSTestListPrevAction ('prevActionParam' prevActionParam=STRING)?)?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestListTestCase' '{' 'name' ':=' name=STRING ';' 'procedure' ':='
		//procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName] ';' ('prevMsg' prevMsg=ID)? ('prevAction'
		//prevAction=GSSTestListPrevAction ('prevActionParam' prevActionParam=STRING)?)? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestListTestCase'
		public Keyword getGSSTestListTestCaseKeyword_0() { return cGSSTestListTestCaseKeyword_0; }
		
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
		
		//('prevMsg' prevMsg=ID)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'prevMsg'
		public Keyword getPrevMsgKeyword_10_0() { return cPrevMsgKeyword_10_0; }
		
		//prevMsg=ID
		public Assignment getPrevMsgAssignment_10_1() { return cPrevMsgAssignment_10_1; }
		
		//ID
		public RuleCall getPrevMsgIDTerminalRuleCall_10_1_0() { return cPrevMsgIDTerminalRuleCall_10_1_0; }
		
		//('prevAction' prevAction=GSSTestListPrevAction ('prevActionParam' prevActionParam=STRING)?)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'prevAction'
		public Keyword getPrevActionKeyword_11_0() { return cPrevActionKeyword_11_0; }
		
		//prevAction=GSSTestListPrevAction
		public Assignment getPrevActionAssignment_11_1() { return cPrevActionAssignment_11_1; }
		
		//GSSTestListPrevAction
		public RuleCall getPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0() { return cPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0; }
		
		//('prevActionParam' prevActionParam=STRING)?
		public Group getGroup_11_2() { return cGroup_11_2; }
		
		//'prevActionParam'
		public Keyword getPrevActionParamKeyword_11_2_0() { return cPrevActionParamKeyword_11_2_0; }
		
		//prevActionParam=STRING
		public Assignment getPrevActionParamAssignment_11_2_1() { return cPrevActionParamAssignment_11_2_1; }
		
		//STRING
		public RuleCall getPrevActionParamSTRINGTerminalRuleCall_11_2_1_0() { return cPrevActionParamSTRINGTerminalRuleCall_11_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
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
	
	public class GSSScenarioEnableDisableElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioEnableDisable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDisabledEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDisabledDisabledKeyword_0_0 = (Keyword)cDisabledEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEnabledEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEnabledEnabledKeyword_1_0 = (Keyword)cEnabledEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSScenarioEnableDisable returns scenario::GSSScenarioEnableDisable:
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
	public class GSSScenarioInterfaceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioInterfaceType");
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
		
		//enum GSSScenarioInterfaceType returns scenario::GSSScenarioInterfaceType:
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
	public class GSSScenarioInterfaceIOTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioInterfaceIOType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIn_outEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIn_outIn_outKeyword_0_0 = (Keyword)cIn_outEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInInKeyword_1_0 = (Keyword)cInEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cOutEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cOutOutKeyword_2_0 = (Keyword)cOutEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSScenarioInterfaceIOType returns scenario::GSSScenarioInterfaceIOType:
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
	public class GSSScenarioUpperLevelLevelElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioUpperLevelLevel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_1_1Keyword_0_0 = (Keyword)c_1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_2_2Keyword_1_0 = (Keyword)c_2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration c_3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword c_3_3Keyword_2_0 = (Keyword)c_3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSScenarioUpperLevelLevel returns scenario::GSSScenarioUpperLevelLevel:
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
	public class GSSScenarioUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMilisecondsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMilisecondsMilisecondsKeyword_0_0 = (Keyword)cMilisecondsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSecondsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSecondsSecondsKeyword_1_0 = (Keyword)cSecondsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSScenarioUnit returns scenario::GSSScenarioUnit:
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
	public class GSSScenarioGlobalVarTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioGlobalVarType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUintEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUintUintKeyword_0_0 = (Keyword)cUintEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFormulaEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFormulaFormulaKeyword_1_0 = (Keyword)cFormulaEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSScenarioGlobalVarType returns scenario::GSSScenarioGlobalVarType:
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
	public class GSSScenarioReferenceFieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioReferenceFieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTmEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTmTmKeyword_0_0 = (Keyword)cTmEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTcEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTcTcKeyword_1_0 = (Keyword)cTcEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSScenarioReferenceFieldType returns scenario::GSSScenarioReferenceFieldType:
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
	public class GSSScenarioAlarmMsgTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioAlarmMsgType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAlarm1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAlarm1Alarm1Keyword_0_0 = (Keyword)cAlarm1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAlarm2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAlarm2Alarm2Keyword_1_0 = (Keyword)cAlarm2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAlarm3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAlarm3Alarm3Keyword_2_0 = (Keyword)cAlarm3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSScenarioAlarmMsgType returns scenario::GSSScenarioAlarmMsgType:
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
	public class GSSScenarioModifyTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioModifyType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIncrementEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIncrementIncrementKeyword_0_0 = (Keyword)cIncrementEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIncrement1wrapEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIncrement1wrapIncrement1wrapKeyword_1_0 = (Keyword)cIncrement1wrapEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSScenarioModifyType returns scenario::GSSScenarioModifyType:
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
	public class GSSScenarioAlarmValTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSScenarioAlarmValType");
		private final EnumLiteralDeclaration cAlarm1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cAlarm1Alarm1Keyword_0 = (Keyword)cAlarm1EnumLiteralDeclaration.eContents().get(0);
		
		//enum GSSScenarioAlarmValType returns scenario::GSSScenarioAlarmValType:
		//	alarm1;
		public EnumRule getRule() { return rule; }
		
		//alarm1
		public EnumLiteralDeclaration getAlarm1EnumLiteralDeclaration() { return cAlarm1EnumLiteralDeclaration; }
		
		//'alarm1'
		public Keyword getAlarm1Alarm1Keyword_0() { return cAlarm1Alarm1Keyword_0; }
	}
	public class GSSTestListPrevActionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSTestListPrevAction");
		private final EnumLiteralDeclaration cResetEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cReset1Keyword_0 = (Keyword)cResetEnumLiteralDeclaration.eContents().get(0);
		
		//enum GSSTestListPrevAction returns test_list::GSSTestListPrevAction:
		//	reset='1';
		public EnumRule getRule() { return rule; }
		
		//reset='1'
		public EnumLiteralDeclaration getResetEnumLiteralDeclaration() { return cResetEnumLiteralDeclaration; }
		
		//'1'
		public Keyword getReset1Keyword_0() { return cReset1Keyword_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSConfigGSSConfigElements pGSSConfigGSSConfig;
	private final GSSScenarioScenarioElements pGSSScenarioScenario;
	private final GSSScenarioOptionsElements pGSSScenarioOptions;
	private final GSSScenarioProtocolsElements pGSSScenarioProtocols;
	private final GSSScenarioInterfacesElements pGSSScenarioInterfaces;
	private final GSSScenarioSpecialPacketsElements pGSSScenarioSpecialPackets;
	private final GSSScenarioPeriodicTCsElements pGSSScenarioPeriodicTCs;
	private final GSSScenarioGlobalVarsElements pGSSScenarioGlobalVars;
	private final GSSScenarioMonitorsElements pGSSScenarioMonitors;
	private final GSSScenarioGSSInfoElements pGSSScenarioGSSInfo;
	private final GSSScenarioGSSInfoPrintElements pGSSScenarioGSSInfoPrint;
	private final GSSScenarioPhyHeaderPrintElements pGSSScenarioPhyHeaderPrint;
	private final GSSScenarioGSSDiscardErrorFlagsElements pGSSScenarioGSSDiscardErrorFlags;
	private final GSSScenarioEnableDisableElements eGSSScenarioEnableDisable;
	private final GSSScenarioProtocolElements pGSSScenarioProtocol;
	private final GSSScenarioProtocolTypeElements pGSSScenarioProtocolType;
	private final GSSScenarioProtocolSubtypeElements pGSSScenarioProtocolSubtype;
	private final GSSScenarioMainInterfaceElements pGSSScenarioMainInterface;
	private final GSSScenarioInterfaceElements pGSSScenarioInterface;
	private final GSSScenarioLevelInOutElements pGSSScenarioLevelInOut;
	private final GSSScenarioLevelInElements pGSSScenarioLevelIn;
	private final GSSScenarioLevelOutElements pGSSScenarioLevelOut;
	private final GSSScenarioInterfaceTypeElements eGSSScenarioInterfaceType;
	private final GSSScenarioInterfaceIOTypeElements eGSSScenarioInterfaceIOType;
	private final GSSScenarioSpecialPacketElements pGSSScenarioSpecialPacket;
	private final GSSScenarioUpperLevelsElements pGSSScenarioUpperLevels;
	private final GSSScenarioPrintingDataElements pGSSScenarioPrintingData;
	private final GSSScenarioPeriodElements pGSSScenarioPeriod;
	private final GSSScenarioIntervalRangeElements pGSSScenarioIntervalRange;
	private final GSSScenarioUpperLevelElements pGSSScenarioUpperLevel;
	private final GSSScenarioUpperLevelLevelElements eGSSScenarioUpperLevelLevel;
	private final GSSScenarioStructuredDataElements pGSSScenarioStructuredData;
	private final GSSScenarioUnitElements eGSSScenarioUnit;
	private final GSSScenarioPeriodicTCElements pGSSScenarioPeriodicTC;
	private final GSSScenarioPeriodicTCLevel2Elements pGSSScenarioPeriodicTCLevel2;
	private final GSSScenarioPeriodicTCLevel1Elements pGSSScenarioPeriodicTCLevel1;
	private final GSSScenarioPeriodicTCLevel0Elements pGSSScenarioPeriodicTCLevel0;
	private final GSSScenarioGlobalVarElements pGSSScenarioGlobalVar;
	private final GSSScenarioReferenceElements pGSSScenarioReference;
	private final GSSScenarioGlobalVarTypeElements eGSSScenarioGlobalVarType;
	private final GSSScenarioReferenceFieldElements pGSSScenarioReferenceField;
	private final GSSScenarioReferencePeriodicTCElements pGSSScenarioReferencePeriodicTC;
	private final GSSScenarioReferenceSpecialPacketElements pGSSScenarioReferenceSpecialPacket;
	private final GSSScenarioReferenceFieldTypeElements eGSSScenarioReferenceFieldType;
	private final GSSScenarioMonitorElements pGSSScenarioMonitor;
	private final GSSScenarioPlotElements pGSSScenarioPlot;
	private final GSSScenarioAlarmMsgElements pGSSScenarioAlarmMsg;
	private final GSSScenarioModifyElements pGSSScenarioModify;
	private final GSSScenarioAlarmValElements pGSSScenarioAlarmVal;
	private final GSSScenarioGVRefElements pGSSScenarioGVRef;
	private final GSSScenarioGVFilteredElements pGSSScenarioGVFiltered;
	private final GSSScenarioGVPeriodicElements pGSSScenarioGVPeriodic;
	private final GSSScenarioAlarmMsgTypeElements eGSSScenarioAlarmMsgType;
	private final GSSScenarioModifyTypeElements eGSSScenarioModifyType;
	private final GSSScenarioAlarmValTypeElements eGSSScenarioAlarmValType;
	private final GSSTestListTestListElements pGSSTestListTestList;
	private final GSSTestListTestCaseElements pGSSTestListTestCase;
	private final GSSTestListPrevActionElements eGSSTestListPrevAction;
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
		this.pGSSScenarioScenario = new GSSScenarioScenarioElements();
		this.pGSSScenarioOptions = new GSSScenarioOptionsElements();
		this.pGSSScenarioProtocols = new GSSScenarioProtocolsElements();
		this.pGSSScenarioInterfaces = new GSSScenarioInterfacesElements();
		this.pGSSScenarioSpecialPackets = new GSSScenarioSpecialPacketsElements();
		this.pGSSScenarioPeriodicTCs = new GSSScenarioPeriodicTCsElements();
		this.pGSSScenarioGlobalVars = new GSSScenarioGlobalVarsElements();
		this.pGSSScenarioMonitors = new GSSScenarioMonitorsElements();
		this.pGSSScenarioGSSInfo = new GSSScenarioGSSInfoElements();
		this.pGSSScenarioGSSInfoPrint = new GSSScenarioGSSInfoPrintElements();
		this.pGSSScenarioPhyHeaderPrint = new GSSScenarioPhyHeaderPrintElements();
		this.pGSSScenarioGSSDiscardErrorFlags = new GSSScenarioGSSDiscardErrorFlagsElements();
		this.eGSSScenarioEnableDisable = new GSSScenarioEnableDisableElements();
		this.pGSSScenarioProtocol = new GSSScenarioProtocolElements();
		this.pGSSScenarioProtocolType = new GSSScenarioProtocolTypeElements();
		this.pGSSScenarioProtocolSubtype = new GSSScenarioProtocolSubtypeElements();
		this.pGSSScenarioMainInterface = new GSSScenarioMainInterfaceElements();
		this.pGSSScenarioInterface = new GSSScenarioInterfaceElements();
		this.pGSSScenarioLevelInOut = new GSSScenarioLevelInOutElements();
		this.pGSSScenarioLevelIn = new GSSScenarioLevelInElements();
		this.pGSSScenarioLevelOut = new GSSScenarioLevelOutElements();
		this.eGSSScenarioInterfaceType = new GSSScenarioInterfaceTypeElements();
		this.eGSSScenarioInterfaceIOType = new GSSScenarioInterfaceIOTypeElements();
		this.pGSSScenarioSpecialPacket = new GSSScenarioSpecialPacketElements();
		this.pGSSScenarioUpperLevels = new GSSScenarioUpperLevelsElements();
		this.pGSSScenarioPrintingData = new GSSScenarioPrintingDataElements();
		this.pGSSScenarioPeriod = new GSSScenarioPeriodElements();
		this.pGSSScenarioIntervalRange = new GSSScenarioIntervalRangeElements();
		this.pGSSScenarioUpperLevel = new GSSScenarioUpperLevelElements();
		this.eGSSScenarioUpperLevelLevel = new GSSScenarioUpperLevelLevelElements();
		this.pGSSScenarioStructuredData = new GSSScenarioStructuredDataElements();
		this.eGSSScenarioUnit = new GSSScenarioUnitElements();
		this.pGSSScenarioPeriodicTC = new GSSScenarioPeriodicTCElements();
		this.pGSSScenarioPeriodicTCLevel2 = new GSSScenarioPeriodicTCLevel2Elements();
		this.pGSSScenarioPeriodicTCLevel1 = new GSSScenarioPeriodicTCLevel1Elements();
		this.pGSSScenarioPeriodicTCLevel0 = new GSSScenarioPeriodicTCLevel0Elements();
		this.pGSSScenarioGlobalVar = new GSSScenarioGlobalVarElements();
		this.pGSSScenarioReference = new GSSScenarioReferenceElements();
		this.eGSSScenarioGlobalVarType = new GSSScenarioGlobalVarTypeElements();
		this.pGSSScenarioReferenceField = new GSSScenarioReferenceFieldElements();
		this.pGSSScenarioReferencePeriodicTC = new GSSScenarioReferencePeriodicTCElements();
		this.pGSSScenarioReferenceSpecialPacket = new GSSScenarioReferenceSpecialPacketElements();
		this.eGSSScenarioReferenceFieldType = new GSSScenarioReferenceFieldTypeElements();
		this.pGSSScenarioMonitor = new GSSScenarioMonitorElements();
		this.pGSSScenarioPlot = new GSSScenarioPlotElements();
		this.pGSSScenarioAlarmMsg = new GSSScenarioAlarmMsgElements();
		this.pGSSScenarioModify = new GSSScenarioModifyElements();
		this.pGSSScenarioAlarmVal = new GSSScenarioAlarmValElements();
		this.pGSSScenarioGVRef = new GSSScenarioGVRefElements();
		this.pGSSScenarioGVFiltered = new GSSScenarioGVFilteredElements();
		this.pGSSScenarioGVPeriodic = new GSSScenarioGVPeriodicElements();
		this.eGSSScenarioAlarmMsgType = new GSSScenarioAlarmMsgTypeElements();
		this.eGSSScenarioModifyType = new GSSScenarioModifyTypeElements();
		this.eGSSScenarioAlarmValType = new GSSScenarioAlarmValTypeElements();
		this.pGSSTestListTestList = new GSSTestListTestListElements();
		this.pGSSTestListTestCase = new GSSTestListTestCaseElements();
		this.eGSSTestListPrevAction = new GSSTestListPrevActionElements();
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
	//	'{' ('uri' ':=' uri=QualifiedName ';')
	//	'version' ':=' version=Version ';'
	//	scenario=GSSScenarioScenario
	//	Tests=GSSTestListTestList
	//	'}' ';';
	public GSSConfigGSSConfigElements getGSSConfigGSSConfigAccess() {
		return pGSSConfigGSSConfig;
	}
	
	public ParserRule getGSSConfigGSSConfigRule() {
		return getGSSConfigGSSConfigAccess().getRule();
	}
	
	//GSSScenarioScenario scenario::GSSScenarioScenario:
	//	'GSSScenarioScenario'
	//	name=STRING
	//	'{'
	//	gss_options=GSSScenarioOptions
	//	Protocols=GSSScenarioProtocols
	//	Interfaces=GSSScenarioInterfaces
	//	SpecialPackets=GSSScenarioSpecialPackets?
	//	PeriodicTCs=GSSScenarioPeriodicTCs? (GlobalVars=GSSScenarioGlobalVars & Monitors=GSSScenarioMonitors)?
	//	'}' ';'
	public GSSScenarioScenarioElements getGSSScenarioScenarioAccess() {
		return pGSSScenarioScenario;
	}
	
	public ParserRule getGSSScenarioScenarioRule() {
		return getGSSScenarioScenarioAccess().getRule();
	}
	
	//GSSScenarioOptions scenario::GSSScenarioOptions:
	//	'GSSScenarioOptions' '{'
	//	gss_info=GSSScenarioGSSInfo
	//	gss_info_print=GSSScenarioGSSInfoPrint
	//	phy_header_print=GSSScenarioPhyHeaderPrint
	//	discardErrorFlags=GSSScenarioGSSDiscardErrorFlags
	//	'}' ';'
	public GSSScenarioOptionsElements getGSSScenarioOptionsAccess() {
		return pGSSScenarioOptions;
	}
	
	public ParserRule getGSSScenarioOptionsRule() {
		return getGSSScenarioOptionsAccess().getRule();
	}
	
	//GSSScenarioProtocols scenario::GSSScenarioProtocols:
	//	{scenario::GSSScenarioProtocols}
	//	'GSSScenarioProtocols' '{'
	//	Protocol+=GSSScenarioProtocol*
	//	'}' ';'
	public GSSScenarioProtocolsElements getGSSScenarioProtocolsAccess() {
		return pGSSScenarioProtocols;
	}
	
	public ParserRule getGSSScenarioProtocolsRule() {
		return getGSSScenarioProtocolsAccess().getRule();
	}
	
	//GSSScenarioInterfaces scenario::GSSScenarioInterfaces:
	//	'GSSScenarioInterfaces' '{' ('ProtocolPacketsFile' ':='
	//	ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
	//	MainInterface=GSSScenarioMainInterface
	//	Interface+=GSSScenarioInterface*
	//	'}' ';'
	public GSSScenarioInterfacesElements getGSSScenarioInterfacesAccess() {
		return pGSSScenarioInterfaces;
	}
	
	public ParserRule getGSSScenarioInterfacesRule() {
		return getGSSScenarioInterfacesAccess().getRule();
	}
	
	//GSSScenarioSpecialPackets scenario::GSSScenarioSpecialPackets:
	//	'GSSScenarioSpecialPackets' '{'
	//	SpecialPacket+=GSSScenarioSpecialPacket+
	//	'}' ';'
	public GSSScenarioSpecialPacketsElements getGSSScenarioSpecialPacketsAccess() {
		return pGSSScenarioSpecialPackets;
	}
	
	public ParserRule getGSSScenarioSpecialPacketsRule() {
		return getGSSScenarioSpecialPacketsAccess().getRule();
	}
	
	//GSSScenarioPeriodicTCs scenario::GSSScenarioPeriodicTCs:
	//	{scenario::GSSScenarioPeriodicTCs}
	//	'GSSScenarioPeriodicTCs' '{'
	//	PeriodicTC+=GSSScenarioPeriodicTC*
	//	'}' ';'
	public GSSScenarioPeriodicTCsElements getGSSScenarioPeriodicTCsAccess() {
		return pGSSScenarioPeriodicTCs;
	}
	
	public ParserRule getGSSScenarioPeriodicTCsRule() {
		return getGSSScenarioPeriodicTCsAccess().getRule();
	}
	
	//GSSScenarioGlobalVars scenario::GSSScenarioGlobalVars:
	//	'GSSScenarioGlobalVars' '{'
	//	GlobalVar+=GSSScenarioGlobalVar+
	//	'}' ';'
	public GSSScenarioGlobalVarsElements getGSSScenarioGlobalVarsAccess() {
		return pGSSScenarioGlobalVars;
	}
	
	public ParserRule getGSSScenarioGlobalVarsRule() {
		return getGSSScenarioGlobalVarsAccess().getRule();
	}
	
	//GSSScenarioMonitors scenario::GSSScenarioMonitors:
	//	'GSSScenarioMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
	//	monitor+=GSSScenarioMonitor+
	//	'}' ';'
	public GSSScenarioMonitorsElements getGSSScenarioMonitorsAccess() {
		return pGSSScenarioMonitors;
	}
	
	public ParserRule getGSSScenarioMonitorsRule() {
		return getGSSScenarioMonitorsAccess().getRule();
	}
	
	//GSSScenarioGSSInfo scenario::GSSScenarioInfo:
	//	'GSSScenarioInfo' '{'
	//	'test_campaign' ':=' test_campaign=STRING ';'
	//	'version' ':=' version=Version ';'
	//	'date' ':=' date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')?
	//	'}' ';'
	public GSSScenarioGSSInfoElements getGSSScenarioGSSInfoAccess() {
		return pGSSScenarioGSSInfo;
	}
	
	public ParserRule getGSSScenarioGSSInfoRule() {
		return getGSSScenarioGSSInfoAccess().getRule();
	}
	
	//GSSScenarioGSSInfoPrint scenario::GSSScenarioInfoPrint:
	//	'GSSScenarioInfoPrint'
	//	'{'
	//	'mainLog' ':=' mainLog=GSSScenarioEnableDisable ';'
	//	'portLogs' ':=' portLogs=GSSScenarioEnableDisable ';'
	//	'rawLog' ':=' rawLog=GSSScenarioEnableDisable ';'
	//	'}' ';'
	public GSSScenarioGSSInfoPrintElements getGSSScenarioGSSInfoPrintAccess() {
		return pGSSScenarioGSSInfoPrint;
	}
	
	public ParserRule getGSSScenarioGSSInfoPrintRule() {
		return getGSSScenarioGSSInfoPrintAccess().getRule();
	}
	
	//GSSScenarioPhyHeaderPrint scenario::GSSScenarioPhyHeaderPrint:
	//	'GSSScenarioPhyHeaderPrint' '{'
	//	'mainLog' ':=' mainLog=GSSScenarioEnableDisable ';'
	//	'portLogs' ':=' portLogs=GSSScenarioEnableDisable ';'
	//	'rawLog' ':=' rawLog=GSSScenarioEnableDisable ';'
	//	'gssTabs' ':=' gssTabs=GSSScenarioEnableDisable ';'
	//	'}' ';'
	public GSSScenarioPhyHeaderPrintElements getGSSScenarioPhyHeaderPrintAccess() {
		return pGSSScenarioPhyHeaderPrint;
	}
	
	public ParserRule getGSSScenarioPhyHeaderPrintRule() {
		return getGSSScenarioPhyHeaderPrintAccess().getRule();
	}
	
	//GSSScenarioGSSDiscardErrorFlags scenario::GSSScenarioDiscardErrorFlags:
	//	'GSSScenarioDiscardErrorFlags' '{'
	//	'txErrors' ':=' txErrors=GSSScenarioEnableDisable ';'
	//	'notExpectedPackets' ':=' notExpectedPackets=GSSScenarioEnableDisable ';'
	//	'filtersKo' ':=' filtersKo=GSSScenarioEnableDisable ';'
	//	'validTimesKo' ':=' validTimesKo=GSSScenarioEnableDisable ';'
	//	'}' ';'
	public GSSScenarioGSSDiscardErrorFlagsElements getGSSScenarioGSSDiscardErrorFlagsAccess() {
		return pGSSScenarioGSSDiscardErrorFlags;
	}
	
	public ParserRule getGSSScenarioGSSDiscardErrorFlagsRule() {
		return getGSSScenarioGSSDiscardErrorFlagsAccess().getRule();
	}
	
	//enum GSSScenarioEnableDisable returns scenario::GSSScenarioEnableDisable:
	//	disabled | enabled;
	public GSSScenarioEnableDisableElements getGSSScenarioEnableDisableAccess() {
		return eGSSScenarioEnableDisable;
	}
	
	public EnumRule getGSSScenarioEnableDisableRule() {
		return getGSSScenarioEnableDisableAccess().getRule();
	}
	
	//GSSScenarioProtocol scenario::GSSScenarioProtocol:
	//	'GSSScenarioProtocol' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'typeLevel' ':=' typeLevel=INTEGER ';'
	//	type=GSSScenarioProtocolType
	//	subtype=GSSScenarioProtocolSubtype?
	//	'}' ';'
	public GSSScenarioProtocolElements getGSSScenarioProtocolAccess() {
		return pGSSScenarioProtocol;
	}
	
	public ParserRule getGSSScenarioProtocolRule() {
		return getGSSScenarioProtocolAccess().getRule();
	}
	
	//GSSScenarioProtocolType scenario::GSSScenarioProtocolType:
	//	'GSSScenarioProtocolType' '{'
	//	'name' ':=' name=STRING ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'}' ';'
	public GSSScenarioProtocolTypeElements getGSSScenarioProtocolTypeAccess() {
		return pGSSScenarioProtocolType;
	}
	
	public ParserRule getGSSScenarioProtocolTypeRule() {
		return getGSSScenarioProtocolTypeAccess().getRule();
	}
	
	//GSSScenarioProtocolSubtype scenario::GSSScenarioProtocolType:
	//	'GSSScenarioProtocolSubtype' '{'
	//	'name' ':=' name=STRING ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'}' ';'
	public GSSScenarioProtocolSubtypeElements getGSSScenarioProtocolSubtypeAccess() {
		return pGSSScenarioProtocolSubtype;
	}
	
	public ParserRule getGSSScenarioProtocolSubtypeRule() {
		return getGSSScenarioProtocolSubtypeAccess().getRule();
	}
	
	//GSSScenarioMainInterface scenario::GSSScenarioInterface:
	//	'GSSScenarioMainInterface' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'ifType' ':=' ifType=GSSScenarioInterfaceType ';'
	//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
	//	'ioType' ':=' ioType=GSSScenarioInterfaceIOType ';' ('protocolID' ':='
	//	protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')?
	//	LevelInOut+=GSSScenarioLevelInOut+
	//	'}' ';'
	public GSSScenarioMainInterfaceElements getGSSScenarioMainInterfaceAccess() {
		return pGSSScenarioMainInterface;
	}
	
	public ParserRule getGSSScenarioMainInterfaceRule() {
		return getGSSScenarioMainInterfaceAccess().getRule();
	}
	
	//GSSScenarioInterface scenario::GSSScenarioInterface:
	//	'GSSScenarioInterface' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'ifType' ':=' ifType=GSSScenarioInterfaceType ';'
	//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
	//	'ioType' ':=' ioType=GSSScenarioInterfaceIOType ';' ('protocolID' ':='
	//	protocolID=[scenario::GSSScenarioProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSScenarioLevelInOut |
	//	LevelIn+=GSSScenarioLevelIn | LevelOut+=GSSScenarioLevelOut)+
	//	'}' ';'
	public GSSScenarioInterfaceElements getGSSScenarioInterfaceAccess() {
		return pGSSScenarioInterface;
	}
	
	public ParserRule getGSSScenarioInterfaceRule() {
		return getGSSScenarioInterfaceAccess().getRule();
	}
	
	//GSSScenarioLevelInOut scenario::GSSScenarioLevelInOut:
	//	'GSSScenarioLevelInOut' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TMformat' ':=' TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';'
	//	'TCformat' ':=' TCformat=[format::GSSFormatFormat|VersionedQualifiedName] ';'
	//	'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
	//	export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioLevelInOutElements getGSSScenarioLevelInOutAccess() {
		return pGSSScenarioLevelInOut;
	}
	
	public ParserRule getGSSScenarioLevelInOutRule() {
		return getGSSScenarioLevelInOutAccess().getRule();
	}
	
	//GSSScenarioLevelIn scenario::GSSScenarioLevelIn:
	//	'GSSScenarioLevelIn' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TCformat' ':=' TCformat=[format::GSSFormatFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
	//	export_to_prev_Level=[export::GSSExportExport|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioLevelInElements getGSSScenarioLevelInAccess() {
		return pGSSScenarioLevelIn;
	}
	
	public ParserRule getGSSScenarioLevelInRule() {
		return getGSSScenarioLevelInAccess().getRule();
	}
	
	//GSSScenarioLevelOut scenario::GSSScenarioLevelOut:
	//	'GSSScenarioLevelOut' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TMformat' ':=' TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';'
	//	'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioLevelOutElements getGSSScenarioLevelOutAccess() {
		return pGSSScenarioLevelOut;
	}
	
	public ParserRule getGSSScenarioLevelOutRule() {
		return getGSSScenarioLevelOutAccess().getRule();
	}
	
	//enum GSSScenarioInterfaceType returns scenario::GSSScenarioInterfaceType:
	//	SpW | SpW_TC | SpW_Error |
	//	uart | dummy;
	public GSSScenarioInterfaceTypeElements getGSSScenarioInterfaceTypeAccess() {
		return eGSSScenarioInterfaceType;
	}
	
	public EnumRule getGSSScenarioInterfaceTypeRule() {
		return getGSSScenarioInterfaceTypeAccess().getRule();
	}
	
	//enum GSSScenarioInterfaceIOType returns scenario::GSSScenarioInterfaceIOType:
	//	in_out | in | out;
	public GSSScenarioInterfaceIOTypeElements getGSSScenarioInterfaceIOTypeAccess() {
		return eGSSScenarioInterfaceIOType;
	}
	
	public EnumRule getGSSScenarioInterfaceIOTypeRule() {
		return getGSSScenarioInterfaceIOTypeAccess().getRule();
	}
	
	//GSSScenarioSpecialPacket scenario::GSSScenarioSpecialPacket:
	//	'GSSScenarioSpecialPacket' '{'
	//	'status' ':=' status=GSSScenarioEnableDisable ';'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'levels' ':=' levels=INTEGER ';'
	//	'levelRef' ':=' levelRef=INTEGER ';'
	//	'inputFilter' ':=' inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';'
	//	UpperLevels+=GSSScenarioUpperLevels?
	//	printingData=GSSScenarioPrintingData (period=GSSScenarioPeriod | intervalRange=GSSScenarioIntervalRange)?
	//	'}' ';'
	public GSSScenarioSpecialPacketElements getGSSScenarioSpecialPacketAccess() {
		return pGSSScenarioSpecialPacket;
	}
	
	public ParserRule getGSSScenarioSpecialPacketRule() {
		return getGSSScenarioSpecialPacketAccess().getRule();
	}
	
	//GSSScenarioUpperLevels scenario::GSSScenarioUpperLevels:
	//	'GSSScenarioUpperLevels' '{'
	//	UpperLevel+=GSSScenarioUpperLevel+
	//	'}' ';'
	public GSSScenarioUpperLevelsElements getGSSScenarioUpperLevelsAccess() {
		return pGSSScenarioUpperLevels;
	}
	
	public ParserRule getGSSScenarioUpperLevelsRule() {
		return getGSSScenarioUpperLevelsAccess().getRule();
	}
	
	//GSSScenarioPrintingData scenario::GSSScenarioPrintingData:
	//	'GSSScenarioPrintingData' '{'
	//	'printStatus' ':=' printStatus=GSSScenarioEnableDisable ';'
	//	structuredData=GSSScenarioStructuredData?
	//	'}' ';'
	public GSSScenarioPrintingDataElements getGSSScenarioPrintingDataAccess() {
		return pGSSScenarioPrintingData;
	}
	
	public ParserRule getGSSScenarioPrintingDataRule() {
		return getGSSScenarioPrintingDataAccess().getRule();
	}
	
	//GSSScenarioPeriod scenario::GSSScenarioPeriod:
	//	'GSSScenarioPeriod' '{'
	//	'min_value' ':=' min_value=INTEGER ';'
	//	'min_unit' ':=' min_unit=GSSScenarioUnit ';'
	//	'max_value' ':=' max_value=INTEGER ';'
	//	'max_unit' ':=' max_unit=GSSScenarioUnit ';'
	//	'}' ';'
	public GSSScenarioPeriodElements getGSSScenarioPeriodAccess() {
		return pGSSScenarioPeriod;
	}
	
	public ParserRule getGSSScenarioPeriodRule() {
		return getGSSScenarioPeriodAccess().getRule();
	}
	
	//GSSScenarioIntervalRange scenario::GSSScenarioIntervalRange:
	//	'GSSScenarioIntervalRange' '{'
	//	'min' ':=' min=INTEGER ';'
	//	'max' ':=' max=INTEGER ';'
	//	'interval_value' ':=' interval_value=INTEGER ';'
	//	'interval_unit' ':=' interval_unit=GSSScenarioUnit ';'
	//	'}' ';'
	public GSSScenarioIntervalRangeElements getGSSScenarioIntervalRangeAccess() {
		return pGSSScenarioIntervalRange;
	}
	
	public ParserRule getGSSScenarioIntervalRangeRule() {
		return getGSSScenarioIntervalRangeAccess().getRule();
	}
	
	//GSSScenarioUpperLevel scenario::GSSScenarioUpperLevel:
	//	'GSSScenarioUpperLevel' '{'
	//	'level' ':=' level=GSSScenarioUpperLevelLevel ';' ('TMformat' ':='
	//	TMformat=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
	//	inputFilter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[import_::GSSImportImport|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioUpperLevelElements getGSSScenarioUpperLevelAccess() {
		return pGSSScenarioUpperLevel;
	}
	
	public ParserRule getGSSScenarioUpperLevelRule() {
		return getGSSScenarioUpperLevelAccess().getRule();
	}
	
	//enum GSSScenarioUpperLevelLevel returns scenario::GSSScenarioUpperLevelLevel:
	//	_1 | _2 | _3;
	public GSSScenarioUpperLevelLevelElements getGSSScenarioUpperLevelLevelAccess() {
		return eGSSScenarioUpperLevelLevel;
	}
	
	public EnumRule getGSSScenarioUpperLevelLevelRule() {
		return getGSSScenarioUpperLevelLevelAccess().getRule();
	}
	
	//GSSScenarioStructuredData scenario::GSSScenarioStructuredData:
	//	'GSSScenarioStructuredData' '{'
	//	'levelRef' ':=' levelRef=INTEGER ';'
	//	'firstField' ':=' firstField=INTEGER ';'
	//	'}' ';'
	public GSSScenarioStructuredDataElements getGSSScenarioStructuredDataAccess() {
		return pGSSScenarioStructuredData;
	}
	
	public ParserRule getGSSScenarioStructuredDataRule() {
		return getGSSScenarioStructuredDataAccess().getRule();
	}
	
	//enum GSSScenarioUnit returns scenario::GSSScenarioUnit:
	//	miliseconds | seconds;
	public GSSScenarioUnitElements getGSSScenarioUnitAccess() {
		return eGSSScenarioUnit;
	}
	
	public EnumRule getGSSScenarioUnitRule() {
		return getGSSScenarioUnitAccess().getRule();
	}
	
	//GSSScenarioPeriodicTC scenario::GSSScenarioPeriodicTC:
	//	GSSScenarioPeriodicTCLevel2 | GSSScenarioPeriodicTCLevel1 | GSSScenarioPeriodicTCLevel0
	public GSSScenarioPeriodicTCElements getGSSScenarioPeriodicTCAccess() {
		return pGSSScenarioPeriodicTC;
	}
	
	public ParserRule getGSSScenarioPeriodicTCRule() {
		return getGSSScenarioPeriodicTCAccess().getRule();
	}
	
	//GSSScenarioPeriodicTCLevel2 scenario::GSSScenarioPeriodicTCLevel2:
	//	'GSSScenarioPeriodicTCLevel2' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level2' ':='
	//	level2=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level2' ':=' app_to_level2=[export::GSSExportExport|VersionedQualifiedName] ';' ('level1' ':='
	//	level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
	//	level2_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';')? ('level0' ':='
	//	level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioPeriodicTCLevel2Elements getGSSScenarioPeriodicTCLevel2Access() {
		return pGSSScenarioPeriodicTCLevel2;
	}
	
	public ParserRule getGSSScenarioPeriodicTCLevel2Rule() {
		return getGSSScenarioPeriodicTCLevel2Access().getRule();
	}
	
	//GSSScenarioPeriodicTCLevel1 scenario::GSSScenarioPeriodicTCLevel1:
	//	'GSSScenarioPeriodicTCLevel1' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level1' ':='
	//	level1=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level1' ':=' app_to_level1=[export::GSSExportExport|VersionedQualifiedName] ';' ('level0' ':='
	//	level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioPeriodicTCLevel1Elements getGSSScenarioPeriodicTCLevel1Access() {
		return pGSSScenarioPeriodicTCLevel1;
	}
	
	public ParserRule getGSSScenarioPeriodicTCLevel1Rule() {
		return getGSSScenarioPeriodicTCLevel1Access().getRule();
	}
	
	//GSSScenarioPeriodicTCLevel0 scenario::GSSScenarioPeriodicTCLevel0:
	//	'GSSScenarioPeriodicTCLevel0' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSScenarioUnit ';' ('level0' ':='
	//	level0=[format::GSSFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level0' ':=' app_to_level0=[export::GSSExportExport|VersionedQualifiedName] ';'
	//	'}' ';'
	public GSSScenarioPeriodicTCLevel0Elements getGSSScenarioPeriodicTCLevel0Access() {
		return pGSSScenarioPeriodicTCLevel0;
	}
	
	public ParserRule getGSSScenarioPeriodicTCLevel0Rule() {
		return getGSSScenarioPeriodicTCLevel0Access().getRule();
	}
	
	//GSSScenarioGlobalVar scenario::GSSScenarioGlobalVar:
	//	'GSSScenarioGlobalVar' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'type' ':=' type=GSSScenarioGlobalVarType ';'
	//	'initial_value' ':=' initial_value=INTEGER ';'
	//	reference=GSSScenarioReference
	//	'}' ';'
	public GSSScenarioGlobalVarElements getGSSScenarioGlobalVarAccess() {
		return pGSSScenarioGlobalVar;
	}
	
	public ParserRule getGSSScenarioGlobalVarRule() {
		return getGSSScenarioGlobalVarAccess().getRule();
	}
	
	//GSSScenarioReference scenario::GSSScenarioReference:
	//	GSSScenarioReferenceField | GSSScenarioReferencePeriodicTC | GSSScenarioReferenceSpecialPacket
	public GSSScenarioReferenceElements getGSSScenarioReferenceAccess() {
		return pGSSScenarioReference;
	}
	
	public ParserRule getGSSScenarioReferenceRule() {
		return getGSSScenarioReferenceAccess().getRule();
	}
	
	//enum GSSScenarioGlobalVarType returns scenario::GSSScenarioGlobalVarType:
	//	uint | formula;
	public GSSScenarioGlobalVarTypeElements getGSSScenarioGlobalVarTypeAccess() {
		return eGSSScenarioGlobalVarType;
	}
	
	public EnumRule getGSSScenarioGlobalVarTypeRule() {
		return getGSSScenarioGlobalVarTypeAccess().getRule();
	}
	
	//GSSScenarioReferenceField scenario::GSSScenarioReferenceField:
	//	'GSSScenarioReferenceField' '{'
	//	'type' ':=' type=GSSScenarioReferenceFieldType ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';'
	public GSSScenarioReferenceFieldElements getGSSScenarioReferenceFieldAccess() {
		return pGSSScenarioReferenceField;
	}
	
	public ParserRule getGSSScenarioReferenceFieldRule() {
		return getGSSScenarioReferenceFieldAccess().getRule();
	}
	
	//GSSScenarioReferencePeriodicTC scenario::GSSScenarioReferencePeriodicTC:
	//	'GSSScenarioReferencePeriodicTC' '{'
	//	'idRef' ':=' idRef=[scenario::GSSScenarioPeriodicTC|STRING] ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';'
	public GSSScenarioReferencePeriodicTCElements getGSSScenarioReferencePeriodicTCAccess() {
		return pGSSScenarioReferencePeriodicTC;
	}
	
	public ParserRule getGSSScenarioReferencePeriodicTCRule() {
		return getGSSScenarioReferencePeriodicTCAccess().getRule();
	}
	
	//GSSScenarioReferenceSpecialPacket scenario::GSSScenarioReferenceSpecialPacket:
	//	'GSSScenarioReferenceSpecialPacket' '{'
	//	'idRef' ':=' idRef=[scenario::GSSScenarioSpecialPacket|STRING] ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';'
	public GSSScenarioReferenceSpecialPacketElements getGSSScenarioReferenceSpecialPacketAccess() {
		return pGSSScenarioReferenceSpecialPacket;
	}
	
	public ParserRule getGSSScenarioReferenceSpecialPacketRule() {
		return getGSSScenarioReferenceSpecialPacketAccess().getRule();
	}
	
	//enum GSSScenarioReferenceFieldType returns scenario::GSSScenarioReferenceFieldType:
	//	tm | tc;
	public GSSScenarioReferenceFieldTypeElements getGSSScenarioReferenceFieldTypeAccess() {
		return eGSSScenarioReferenceFieldType;
	}
	
	public EnumRule getGSSScenarioReferenceFieldTypeRule() {
		return getGSSScenarioReferenceFieldTypeAccess().getRule();
	}
	
	//GSSScenarioMonitor scenario::GSSScenarioMonitor:
	//	GSSScenarioPlot | GSSScenarioAlarmMsg | GSSScenarioModify | GSSScenarioAlarmVal
	public GSSScenarioMonitorElements getGSSScenarioMonitorAccess() {
		return pGSSScenarioMonitor;
	}
	
	public ParserRule getGSSScenarioMonitorRule() {
		return getGSSScenarioMonitorAccess().getRule();
	}
	
	//GSSScenarioPlot scenario::GSSScenarioPlot:
	//	'GSSScenarioPlot' '{'
	//	'name' ':=' name=STRING ';'
	//	'chartRef' ':=' chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName] ';'
	//	GVRef=GSSScenarioGVRef
	//	'}' ';'
	public GSSScenarioPlotElements getGSSScenarioPlotAccess() {
		return pGSSScenarioPlot;
	}
	
	public ParserRule getGSSScenarioPlotRule() {
		return getGSSScenarioPlotAccess().getRule();
	}
	
	//GSSScenarioAlarmMsg scenario::GSSScenarioAlarmMsg:
	//	'GSSScenarioAlarmMsg' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSScenarioAlarmMsgType ';'
	//	'text' ':=' text=STRING ';'
	//	GVRef=GSSScenarioGVRef
	//	'}' ';'
	public GSSScenarioAlarmMsgElements getGSSScenarioAlarmMsgAccess() {
		return pGSSScenarioAlarmMsg;
	}
	
	public ParserRule getGSSScenarioAlarmMsgRule() {
		return getGSSScenarioAlarmMsgAccess().getRule();
	}
	
	//GSSScenarioModify scenario::GSSScenarioModify:
	//	'GSSScenarioModify' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSScenarioModifyType ';'
	//	'value' ':=' value=INTEGER ';'
	//	GVRef=GSSScenarioGVRef
	//	'}' ';'
	public GSSScenarioModifyElements getGSSScenarioModifyAccess() {
		return pGSSScenarioModify;
	}
	
	public ParserRule getGSSScenarioModifyRule() {
		return getGSSScenarioModifyAccess().getRule();
	}
	
	//GSSScenarioAlarmVal scenario::GSSScenarioAlarmVal:
	//	'GSSScenarioAlarmVal' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSScenarioAlarmValType ';'
	//	GVRef=GSSScenarioGVRef
	//	'}' ';'
	public GSSScenarioAlarmValElements getGSSScenarioAlarmValAccess() {
		return pGSSScenarioAlarmVal;
	}
	
	public ParserRule getGSSScenarioAlarmValRule() {
		return getGSSScenarioAlarmValAccess().getRule();
	}
	
	//GSSScenarioGVRef scenario::GSSScenarioGVRef:
	//	GSSScenarioGVFiltered | GSSScenarioGVPeriodic
	public GSSScenarioGVRefElements getGSSScenarioGVRefAccess() {
		return pGSSScenarioGVRef;
	}
	
	public ParserRule getGSSScenarioGVRefRule() {
		return getGSSScenarioGVRefAccess().getRule();
	}
	
	//GSSScenarioGVFiltered scenario::GSSScenarioGVFiltered:
	//	'GSSScenarioGVFiltered' '{'
	//	'GlobalVarRef' ':=' GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING] ';' ('filter' ':='
	//	filter=[filter::GSSFilterFilter|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSScenarioGVFilteredElements getGSSScenarioGVFilteredAccess() {
		return pGSSScenarioGVFiltered;
	}
	
	public ParserRule getGSSScenarioGVFilteredRule() {
		return getGSSScenarioGVFilteredAccess().getRule();
	}
	
	//GSSScenarioGVPeriodic scenario::GSSScenarioGVPeriodic:
	//	'GSSScenarioGVPeriodic' '{'
	//	'GlobalVarRef' ':=' GlobalVarRef=[scenario::GSSScenarioGlobalVar|STRING] ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSScenarioUnit ';'
	//	'}' ';'
	public GSSScenarioGVPeriodicElements getGSSScenarioGVPeriodicAccess() {
		return pGSSScenarioGVPeriodic;
	}
	
	public ParserRule getGSSScenarioGVPeriodicRule() {
		return getGSSScenarioGVPeriodicAccess().getRule();
	}
	
	//enum GSSScenarioAlarmMsgType returns scenario::GSSScenarioAlarmMsgType:
	//	alarm1 | alarm2 | alarm3;
	public GSSScenarioAlarmMsgTypeElements getGSSScenarioAlarmMsgTypeAccess() {
		return eGSSScenarioAlarmMsgType;
	}
	
	public EnumRule getGSSScenarioAlarmMsgTypeRule() {
		return getGSSScenarioAlarmMsgTypeAccess().getRule();
	}
	
	//enum GSSScenarioModifyType returns scenario::GSSScenarioModifyType:
	//	increment | increment1wrap;
	public GSSScenarioModifyTypeElements getGSSScenarioModifyTypeAccess() {
		return eGSSScenarioModifyType;
	}
	
	public EnumRule getGSSScenarioModifyTypeRule() {
		return getGSSScenarioModifyTypeAccess().getRule();
	}
	
	//enum GSSScenarioAlarmValType returns scenario::GSSScenarioAlarmValType:
	//	alarm1;
	public GSSScenarioAlarmValTypeElements getGSSScenarioAlarmValTypeAccess() {
		return eGSSScenarioAlarmValType;
	}
	
	public EnumRule getGSSScenarioAlarmValTypeRule() {
		return getGSSScenarioAlarmValTypeAccess().getRule();
	}
	
	//GSSTestListTestList test_list::GSSTestListTestList:
	//	'GSSTestListTestList' '{'
	//	TestCase+=GSSTestListTestCase+
	//	'}' ';'
	public GSSTestListTestListElements getGSSTestListTestListAccess() {
		return pGSSTestListTestList;
	}
	
	public ParserRule getGSSTestListTestListRule() {
		return getGSSTestListTestListAccess().getRule();
	}
	
	//GSSTestListTestCase test_list::GSSTestListTestCase:
	//	'GSSTestListTestCase' '{'
	//	'name' ':=' name=STRING ';'
	//	'procedure' ':=' procedure=[test_proc::GSSTestProcTestProc|VersionedQualifiedName] ';' ('prevMsg' prevMsg=ID)?
	//	('prevAction' prevAction=GSSTestListPrevAction ('prevActionParam' prevActionParam=STRING)?)?
	//	'}' ';'
	public GSSTestListTestCaseElements getGSSTestListTestCaseAccess() {
		return pGSSTestListTestCase;
	}
	
	public ParserRule getGSSTestListTestCaseRule() {
		return getGSSTestListTestCaseAccess().getRule();
	}
	
	//enum GSSTestListPrevAction returns test_list::GSSTestListPrevAction:
	//	reset='1';
	public GSSTestListPrevActionElements getGSSTestListPrevActionAccess() {
		return eGSSTestListPrevAction;
	}
	
	public EnumRule getGSSTestListPrevActionRule() {
		return getGSSTestListPrevActionAccess().getRule();
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
