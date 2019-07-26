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
package es.uah.aut.srg.gss.lang.environment.services;

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
public class ENVIRONMENTGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSEnvironmentGSSEnvironment
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSEnvironmentGSSEnvironment
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSEnvironmentGSSEnvironment
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSEnvironmentGSSEnvironment
		public RuleCall getElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0() { return cElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSModelFileImport");
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
	public class GSSEnvironmentGSSEnvironmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSEnvironment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentEnvironmentKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cScenarioGSSEnvironmentScenarioParserRuleCall_8_0 = (RuleCall)cScenarioAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//GSSEnvironmentGSSEnvironment GSSEnvironmentEnvironment:
		//	'GSSEnvironmentEnvironment'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';')
		//	'version' ':=' version=Version ';'
		//	scenario+=GSSEnvironmentScenario
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentEnvironment' name=ID '{' ('uri' ':=' uri=QualifiedName ';') 'version' ':=' version=Version ';'
		//scenario+=GSSEnvironmentScenario '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentEnvironment'
		public Keyword getGSSEnvironmentEnvironmentKeyword_0() { return cGSSEnvironmentEnvironmentKeyword_0; }
		
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
		
		//scenario+=GSSEnvironmentScenario
		public Assignment getScenarioAssignment_8() { return cScenarioAssignment_8; }
		
		//GSSEnvironmentScenario
		public RuleCall getScenarioGSSEnvironmentScenarioParserRuleCall_8_0() { return cScenarioGSSEnvironmentScenarioParserRuleCall_8_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class GSSEnvironmentScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentScenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGss_optionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGss_optionsGSSEnvironmentOptionsParserRuleCall_3_0 = (RuleCall)cGss_optionsAssignment_3.eContents().get(0);
		private final Assignment cProtocolsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProtocolsGSSEnvironmentProtocolsParserRuleCall_4_0 = (RuleCall)cProtocolsAssignment_4.eContents().get(0);
		private final Assignment cInterfacesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInterfacesGSSEnvironmentInterfacesParserRuleCall_5_0 = (RuleCall)cInterfacesAssignment_5.eContents().get(0);
		private final Assignment cSpecialPacketsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_6_0 = (RuleCall)cSpecialPacketsAssignment_6.eContents().get(0);
		private final Assignment cPeriodicTCsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_7_0 = (RuleCall)cPeriodicTCsAssignment_7.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_8 = (UnorderedGroup)cGroup.eContents().get(8);
		private final Assignment cGlobalVarsAssignment_8_0 = (Assignment)cUnorderedGroup_8.eContents().get(0);
		private final RuleCall cGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_8_0_0 = (RuleCall)cGlobalVarsAssignment_8_0.eContents().get(0);
		private final Assignment cMonitorsAssignment_8_1 = (Assignment)cUnorderedGroup_8.eContents().get(1);
		private final RuleCall cMonitorsGSSEnvironmentMonitorsParserRuleCall_8_1_0 = (RuleCall)cMonitorsAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//GSSEnvironmentScenario:
		//	'GSSEnvironmentScenario'
		//	name=ID
		//	'{'
		//	gss_options=GSSEnvironmentOptions
		//	Protocols=GSSEnvironmentProtocols
		//	Interfaces=GSSEnvironmentInterfaces
		//	SpecialPackets=GSSEnvironmentSpecialPackets?
		//	PeriodicTCs=GSSEnvironmentPeriodicTCs? (GlobalVars=GSSEnvironmentGlobalVars & Monitors=GSSEnvironmentMonitors)?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentScenario' name=ID '{' gss_options=GSSEnvironmentOptions Protocols=GSSEnvironmentProtocols
		//Interfaces=GSSEnvironmentInterfaces SpecialPackets=GSSEnvironmentSpecialPackets?
		//PeriodicTCs=GSSEnvironmentPeriodicTCs? (GlobalVars=GSSEnvironmentGlobalVars & Monitors=GSSEnvironmentMonitors)? '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentScenario'
		public Keyword getGSSEnvironmentScenarioKeyword_0() { return cGSSEnvironmentScenarioKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//gss_options=GSSEnvironmentOptions
		public Assignment getGss_optionsAssignment_3() { return cGss_optionsAssignment_3; }
		
		//GSSEnvironmentOptions
		public RuleCall getGss_optionsGSSEnvironmentOptionsParserRuleCall_3_0() { return cGss_optionsGSSEnvironmentOptionsParserRuleCall_3_0; }
		
		//Protocols=GSSEnvironmentProtocols
		public Assignment getProtocolsAssignment_4() { return cProtocolsAssignment_4; }
		
		//GSSEnvironmentProtocols
		public RuleCall getProtocolsGSSEnvironmentProtocolsParserRuleCall_4_0() { return cProtocolsGSSEnvironmentProtocolsParserRuleCall_4_0; }
		
		//Interfaces=GSSEnvironmentInterfaces
		public Assignment getInterfacesAssignment_5() { return cInterfacesAssignment_5; }
		
		//GSSEnvironmentInterfaces
		public RuleCall getInterfacesGSSEnvironmentInterfacesParserRuleCall_5_0() { return cInterfacesGSSEnvironmentInterfacesParserRuleCall_5_0; }
		
		//SpecialPackets=GSSEnvironmentSpecialPackets?
		public Assignment getSpecialPacketsAssignment_6() { return cSpecialPacketsAssignment_6; }
		
		//GSSEnvironmentSpecialPackets
		public RuleCall getSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_6_0() { return cSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_6_0; }
		
		//PeriodicTCs=GSSEnvironmentPeriodicTCs?
		public Assignment getPeriodicTCsAssignment_7() { return cPeriodicTCsAssignment_7; }
		
		//GSSEnvironmentPeriodicTCs
		public RuleCall getPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_7_0() { return cPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_7_0; }
		
		//(GlobalVars=GSSEnvironmentGlobalVars & Monitors=GSSEnvironmentMonitors)?
		public UnorderedGroup getUnorderedGroup_8() { return cUnorderedGroup_8; }
		
		//GlobalVars=GSSEnvironmentGlobalVars
		public Assignment getGlobalVarsAssignment_8_0() { return cGlobalVarsAssignment_8_0; }
		
		//GSSEnvironmentGlobalVars
		public RuleCall getGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_8_0_0() { return cGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_8_0_0; }
		
		//Monitors=GSSEnvironmentMonitors
		public Assignment getMonitorsAssignment_8_1() { return cMonitorsAssignment_8_1; }
		
		//GSSEnvironmentMonitors
		public RuleCall getMonitorsGSSEnvironmentMonitorsParserRuleCall_8_1_0() { return cMonitorsGSSEnvironmentMonitorsParserRuleCall_8_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class GSSEnvironmentOptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentOptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentOptionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGss_infoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0 = (RuleCall)cGss_infoAssignment_2.eContents().get(0);
		private final Assignment cGss_info_printAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0 = (RuleCall)cGss_info_printAssignment_3.eContents().get(0);
		private final Assignment cPhy_header_printAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0 = (RuleCall)cPhy_header_printAssignment_4.eContents().get(0);
		private final Assignment cDiscardErrorFlagsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0 = (RuleCall)cDiscardErrorFlagsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSEnvironmentOptions:
		//	'GSSEnvironmentOptions' '{'
		//	gss_info=GSSEnvironmentGSSInfo
		//	gss_info_print=GSSEnvironmentGSSInfoPrint
		//	phy_header_print=GSSEnvironmentPhyHeaderPrint
		//	discardErrorFlags=GSSEnvironmentGSSDiscardErrorFlags
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentOptions' '{' gss_info=GSSEnvironmentGSSInfo gss_info_print=GSSEnvironmentGSSInfoPrint
		//phy_header_print=GSSEnvironmentPhyHeaderPrint discardErrorFlags=GSSEnvironmentGSSDiscardErrorFlags '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentOptions'
		public Keyword getGSSEnvironmentOptionsKeyword_0() { return cGSSEnvironmentOptionsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//gss_info=GSSEnvironmentGSSInfo
		public Assignment getGss_infoAssignment_2() { return cGss_infoAssignment_2; }
		
		//GSSEnvironmentGSSInfo
		public RuleCall getGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0() { return cGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0; }
		
		//gss_info_print=GSSEnvironmentGSSInfoPrint
		public Assignment getGss_info_printAssignment_3() { return cGss_info_printAssignment_3; }
		
		//GSSEnvironmentGSSInfoPrint
		public RuleCall getGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0() { return cGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0; }
		
		//phy_header_print=GSSEnvironmentPhyHeaderPrint
		public Assignment getPhy_header_printAssignment_4() { return cPhy_header_printAssignment_4; }
		
		//GSSEnvironmentPhyHeaderPrint
		public RuleCall getPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0() { return cPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0; }
		
		//discardErrorFlags=GSSEnvironmentGSSDiscardErrorFlags
		public Assignment getDiscardErrorFlagsAssignment_5() { return cDiscardErrorFlagsAssignment_5; }
		
		//GSSEnvironmentGSSDiscardErrorFlags
		public RuleCall getDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0() { return cDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSEnvironmentProtocolsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentProtocols");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentProtocolsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProtocolAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProtocolGSSEnvironmentProtocolParserRuleCall_2_0 = (RuleCall)cProtocolAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSEnvironmentProtocols:
		//	'GSSEnvironmentProtocols' '{'
		//	Protocol+=GSSEnvironmentProtocol+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentProtocols' '{' Protocol+=GSSEnvironmentProtocol+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentProtocols'
		public Keyword getGSSEnvironmentProtocolsKeyword_0() { return cGSSEnvironmentProtocolsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//Protocol+=GSSEnvironmentProtocol+
		public Assignment getProtocolAssignment_2() { return cProtocolAssignment_2; }
		
		//GSSEnvironmentProtocol
		public RuleCall getProtocolGSSEnvironmentProtocolParserRuleCall_2_0() { return cProtocolGSSEnvironmentProtocolParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSEnvironmentInterfacesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaces");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentInterfacesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cProtocolPacketsFileKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cProtocolPacketsFileAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0 = (CrossReference)cProtocolPacketsFileAssignment_2_2.eContents().get(0);
		private final RuleCall cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1 = (RuleCall)cProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cMainInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_3_0 = (RuleCall)cMainInterfaceAssignment_3.eContents().get(0);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInterfaceGSSEnvironmentInterfaceParserRuleCall_4_0 = (RuleCall)cInterfaceAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSEnvironmentInterfaces:
		//	'GSSEnvironmentInterfaces' '{' ('ProtocolPacketsFile' ':='
		//	ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		//	MainInterface=GSSEnvironmentMainInterface
		//	Interface+=GSSEnvironmentInterface*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentInterfaces' '{' ('ProtocolPacketsFile' ':='
		//ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
		//MainInterface=GSSEnvironmentMainInterface Interface+=GSSEnvironmentInterface* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentInterfaces'
		public Keyword getGSSEnvironmentInterfacesKeyword_0() { return cGSSEnvironmentInterfacesKeyword_0; }
		
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
		
		//MainInterface=GSSEnvironmentMainInterface
		public Assignment getMainInterfaceAssignment_3() { return cMainInterfaceAssignment_3; }
		
		//GSSEnvironmentMainInterface
		public RuleCall getMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_3_0() { return cMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_3_0; }
		
		//Interface+=GSSEnvironmentInterface*
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//GSSEnvironmentInterface
		public RuleCall getInterfaceGSSEnvironmentInterfaceParserRuleCall_4_0() { return cInterfaceGSSEnvironmentInterfaceParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class GSSEnvironmentSpecialPacketsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentSpecialPackets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentSpecialPacketsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpecialPacketAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0 = (RuleCall)cSpecialPacketAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSEnvironmentSpecialPackets:
		//	'GSSEnvironmentSpecialPackets' '{'
		//	SpecialPacket+=GSSEnvironmentSpecialPacket '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentSpecialPackets' '{' SpecialPacket+=GSSEnvironmentSpecialPacket '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentSpecialPackets'
		public Keyword getGSSEnvironmentSpecialPacketsKeyword_0() { return cGSSEnvironmentSpecialPacketsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//SpecialPacket+=GSSEnvironmentSpecialPacket
		public Assignment getSpecialPacketAssignment_2() { return cSpecialPacketAssignment_2; }
		
		//GSSEnvironmentSpecialPacket
		public RuleCall getSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0() { return cSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSEnvironmentPeriodicTCsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSEnvironmentPeriodicTCsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSEnvironmentPeriodicTCsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cPeriodicTC_level_2Assignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0 = (RuleCall)cPeriodicTC_level_2Assignment_3_0.eContents().get(0);
		private final Assignment cPeriodicTC_level_1Assignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0 = (RuleCall)cPeriodicTC_level_1Assignment_3_1.eContents().get(0);
		private final Assignment cPeriodicTC_level_0Assignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0 = (RuleCall)cPeriodicTC_level_0Assignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSEnvironmentPeriodicTCs:
		//	{GSSEnvironmentPeriodicTCs}
		//	'GSSEnvironmentPeriodicTCs' '{' (PeriodicTC_level_2+=GSSEnvironmentPeriodicTCLevel2 |
		//	PeriodicTC_level_1+=GSSEnvironmentPeriodicTCLevel1 | PeriodicTC_level_0+=GSSEnvironmentPeriodicTCLevel0)*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSEnvironmentPeriodicTCs} 'GSSEnvironmentPeriodicTCs' '{' (PeriodicTC_level_2+=GSSEnvironmentPeriodicTCLevel2 |
		//PeriodicTC_level_1+=GSSEnvironmentPeriodicTCLevel1 | PeriodicTC_level_0+=GSSEnvironmentPeriodicTCLevel0)* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSEnvironmentPeriodicTCs}
		public Action getGSSEnvironmentPeriodicTCsAction_0() { return cGSSEnvironmentPeriodicTCsAction_0; }
		
		//'GSSEnvironmentPeriodicTCs'
		public Keyword getGSSEnvironmentPeriodicTCsKeyword_1() { return cGSSEnvironmentPeriodicTCsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(PeriodicTC_level_2+=GSSEnvironmentPeriodicTCLevel2 | PeriodicTC_level_1+=GSSEnvironmentPeriodicTCLevel1 |
		//PeriodicTC_level_0+=GSSEnvironmentPeriodicTCLevel0)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//PeriodicTC_level_2+=GSSEnvironmentPeriodicTCLevel2
		public Assignment getPeriodicTC_level_2Assignment_3_0() { return cPeriodicTC_level_2Assignment_3_0; }
		
		//GSSEnvironmentPeriodicTCLevel2
		public RuleCall getPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0() { return cPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0; }
		
		//PeriodicTC_level_1+=GSSEnvironmentPeriodicTCLevel1
		public Assignment getPeriodicTC_level_1Assignment_3_1() { return cPeriodicTC_level_1Assignment_3_1; }
		
		//GSSEnvironmentPeriodicTCLevel1
		public RuleCall getPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0() { return cPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0; }
		
		//PeriodicTC_level_0+=GSSEnvironmentPeriodicTCLevel0
		public Assignment getPeriodicTC_level_0Assignment_3_2() { return cPeriodicTC_level_0Assignment_3_2; }
		
		//GSSEnvironmentPeriodicTCLevel0
		public RuleCall getPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0() { return cPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSEnvironmentGlobalVarsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVars");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentGlobalVarsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGlobalVarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0 = (RuleCall)cGlobalVarAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSEnvironmentGlobalVars:
		//	'GSSEnvironmentGlobalVars' '{'
		//	GlobalVar+=GSSEnvironmentGlobalVar+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentGlobalVars' '{' GlobalVar+=GSSEnvironmentGlobalVar+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentGlobalVars'
		public Keyword getGSSEnvironmentGlobalVarsKeyword_0() { return cGSSEnvironmentGlobalVarsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//GlobalVar+=GSSEnvironmentGlobalVar+
		public Assignment getGlobalVarAssignment_2() { return cGlobalVarAssignment_2; }
		
		//GSSEnvironmentGlobalVar
		public RuleCall getGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0() { return cGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSEnvironmentMonitorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentMonitors");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentMonitorsKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPlotGSSEnvironmentPlotParserRuleCall_3_0_0 = (RuleCall)cPlotAssignment_3_0.eContents().get(0);
		private final Assignment cAlarmMsgAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0 = (RuleCall)cAlarmMsgAssignment_3_1.eContents().get(0);
		private final Assignment cModifyAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cModifyGSSEnvironmentModifyParserRuleCall_3_2_0 = (RuleCall)cModifyAssignment_3_2.eContents().get(0);
		private final Assignment cAlarmValAssignment_3_3 = (Assignment)cAlternatives_3.eContents().get(3);
		private final RuleCall cAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0 = (RuleCall)cAlarmValAssignment_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSEnvironmentMonitors:
		//	'GSSEnvironmentMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		//	(plot+=GSSEnvironmentPlot | alarmMsg+=GSSEnvironmentAlarmMsg | modify+=GSSEnvironmentModify |
		//	alarmVal+=GSSEnvironmentAlarmVal)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
		//(plot+=GSSEnvironmentPlot | alarmMsg+=GSSEnvironmentAlarmMsg | modify+=GSSEnvironmentModify |
		//alarmVal+=GSSEnvironmentAlarmVal)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentMonitors'
		public Keyword getGSSEnvironmentMonitorsKeyword_0() { return cGSSEnvironmentMonitorsKeyword_0; }
		
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
		
		//(plot+=GSSEnvironmentPlot | alarmMsg+=GSSEnvironmentAlarmMsg | modify+=GSSEnvironmentModify |
		//alarmVal+=GSSEnvironmentAlarmVal)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//plot+=GSSEnvironmentPlot
		public Assignment getPlotAssignment_3_0() { return cPlotAssignment_3_0; }
		
		//GSSEnvironmentPlot
		public RuleCall getPlotGSSEnvironmentPlotParserRuleCall_3_0_0() { return cPlotGSSEnvironmentPlotParserRuleCall_3_0_0; }
		
		//alarmMsg+=GSSEnvironmentAlarmMsg
		public Assignment getAlarmMsgAssignment_3_1() { return cAlarmMsgAssignment_3_1; }
		
		//GSSEnvironmentAlarmMsg
		public RuleCall getAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0() { return cAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0; }
		
		//modify+=GSSEnvironmentModify
		public Assignment getModifyAssignment_3_2() { return cModifyAssignment_3_2; }
		
		//GSSEnvironmentModify
		public RuleCall getModifyGSSEnvironmentModifyParserRuleCall_3_2_0() { return cModifyGSSEnvironmentModifyParserRuleCall_3_2_0; }
		
		//alarmVal+=GSSEnvironmentAlarmVal
		public Assignment getAlarmValAssignment_3_3() { return cAlarmValAssignment_3_3; }
		
		//GSSEnvironmentAlarmVal
		public RuleCall getAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0() { return cAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSEnvironmentGSSInfoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSInfo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentInfoKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		
		//GSSEnvironmentGSSInfo GSSEnvironmentInfo:
		//	'GSSEnvironmentInfo' '{'
		//	'test_campaign' ':=' test_campaign=STRING ';'
		//	'version' ':=' version=Version ';'
		//	'date' ':=' date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentInfo' '{' 'test_campaign' ':=' test_campaign=STRING ';' 'version' ':=' version=Version ';' 'date' ':='
		//date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentInfo'
		public Keyword getGSSEnvironmentInfoKeyword_0() { return cGSSEnvironmentInfoKeyword_0; }
		
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
	public class GSSEnvironmentGSSInfoPrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSInfoPrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentInfoPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainLogKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMainLogAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0 = (RuleCall)cMainLogAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortLogsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortLogsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0 = (RuleCall)cPortLogsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRawLogKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRawLogAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0 = (RuleCall)cRawLogAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSEnvironmentGSSInfoPrint GSSEnvironmentInfoPrint:
		//	'GSSEnvironmentInfoPrint'
		//	'{'
		//	'mainLog' ':=' mainLog=GSSEnvironmentEnableDisable ';'
		//	'portLogs' ':=' portLogs=GSSEnvironmentEnableDisable ';'
		//	'rawLog' ':=' rawLog=GSSEnvironmentEnableDisable ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentInfoPrint' '{' 'mainLog' ':=' mainLog=GSSEnvironmentEnableDisable ';' 'portLogs' ':='
		//portLogs=GSSEnvironmentEnableDisable ';' 'rawLog' ':=' rawLog=GSSEnvironmentEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentInfoPrint'
		public Keyword getGSSEnvironmentInfoPrintKeyword_0() { return cGSSEnvironmentInfoPrintKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'mainLog'
		public Keyword getMainLogKeyword_2() { return cMainLogKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//mainLog=GSSEnvironmentEnableDisable
		public Assignment getMainLogAssignment_4() { return cMainLogAssignment_4; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0() { return cMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portLogs'
		public Keyword getPortLogsKeyword_6() { return cPortLogsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portLogs=GSSEnvironmentEnableDisable
		public Assignment getPortLogsAssignment_8() { return cPortLogsAssignment_8; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0() { return cPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'rawLog'
		public Keyword getRawLogKeyword_10() { return cRawLogKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//rawLog=GSSEnvironmentEnableDisable
		public Assignment getRawLogAssignment_12() { return cRawLogAssignment_12; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0() { return cRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSEnvironmentPhyHeaderPrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPhyHeaderPrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPhyHeaderPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainLogKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMainLogAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0 = (RuleCall)cMainLogAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortLogsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortLogsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0 = (RuleCall)cPortLogsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRawLogKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRawLogAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0 = (RuleCall)cRawLogAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cGssTabsKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cGssTabsAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0 = (RuleCall)cGssTabsAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSEnvironmentPhyHeaderPrint:
		//	'GSSEnvironmentPhyHeaderPrint' '{'
		//	'mainLog' ':=' mainLog=GSSEnvironmentEnableDisable ';'
		//	'portLogs' ':=' portLogs=GSSEnvironmentEnableDisable ';'
		//	'rawLog' ':=' rawLog=GSSEnvironmentEnableDisable ';'
		//	'gssTabs' ':=' gssTabs=GSSEnvironmentEnableDisable ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPhyHeaderPrint' '{' 'mainLog' ':=' mainLog=GSSEnvironmentEnableDisable ';' 'portLogs' ':='
		//portLogs=GSSEnvironmentEnableDisable ';' 'rawLog' ':=' rawLog=GSSEnvironmentEnableDisable ';' 'gssTabs' ':='
		//gssTabs=GSSEnvironmentEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPhyHeaderPrint'
		public Keyword getGSSEnvironmentPhyHeaderPrintKeyword_0() { return cGSSEnvironmentPhyHeaderPrintKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'mainLog'
		public Keyword getMainLogKeyword_2() { return cMainLogKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//mainLog=GSSEnvironmentEnableDisable
		public Assignment getMainLogAssignment_4() { return cMainLogAssignment_4; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0() { return cMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portLogs'
		public Keyword getPortLogsKeyword_6() { return cPortLogsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portLogs=GSSEnvironmentEnableDisable
		public Assignment getPortLogsAssignment_8() { return cPortLogsAssignment_8; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0() { return cPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'rawLog'
		public Keyword getRawLogKeyword_10() { return cRawLogKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//rawLog=GSSEnvironmentEnableDisable
		public Assignment getRawLogAssignment_12() { return cRawLogAssignment_12; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0() { return cRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'gssTabs'
		public Keyword getGssTabsKeyword_14() { return cGssTabsKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//gssTabs=GSSEnvironmentEnableDisable
		public Assignment getGssTabsAssignment_16() { return cGssTabsAssignment_16; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0() { return cGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSEnvironmentGSSDiscardErrorFlagsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSDiscardErrorFlags");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentDiscardErrorFlagsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTxErrorsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTxErrorsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0 = (RuleCall)cTxErrorsAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNotExpectedPacketsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNotExpectedPacketsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0 = (RuleCall)cNotExpectedPacketsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFiltersKoKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFiltersKoAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0 = (RuleCall)cFiltersKoAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cValidTimesKoKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cValidTimesKoAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0 = (RuleCall)cValidTimesKoAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSEnvironmentGSSDiscardErrorFlags GSSEnvironmentDiscardErrorFlags:
		//	'GSSEnvironmentDiscardErrorFlags' '{'
		//	'txErrors' ':=' txErrors=GSSEnvironmentEnableDisable ';'
		//	'notExpectedPackets' ':=' notExpectedPackets=GSSEnvironmentEnableDisable ';'
		//	'filtersKo' ':=' filtersKo=GSSEnvironmentEnableDisable ';'
		//	'validTimesKo' ':=' validTimesKo=GSSEnvironmentEnableDisable ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentDiscardErrorFlags' '{' 'txErrors' ':=' txErrors=GSSEnvironmentEnableDisable ';' 'notExpectedPackets' ':='
		//notExpectedPackets=GSSEnvironmentEnableDisable ';' 'filtersKo' ':=' filtersKo=GSSEnvironmentEnableDisable ';'
		//'validTimesKo' ':=' validTimesKo=GSSEnvironmentEnableDisable ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentDiscardErrorFlags'
		public Keyword getGSSEnvironmentDiscardErrorFlagsKeyword_0() { return cGSSEnvironmentDiscardErrorFlagsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'txErrors'
		public Keyword getTxErrorsKeyword_2() { return cTxErrorsKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//txErrors=GSSEnvironmentEnableDisable
		public Assignment getTxErrorsAssignment_4() { return cTxErrorsAssignment_4; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0() { return cTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'notExpectedPackets'
		public Keyword getNotExpectedPacketsKeyword_6() { return cNotExpectedPacketsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//notExpectedPackets=GSSEnvironmentEnableDisable
		public Assignment getNotExpectedPacketsAssignment_8() { return cNotExpectedPacketsAssignment_8; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0() { return cNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'filtersKo'
		public Keyword getFiltersKoKeyword_10() { return cFiltersKoKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//filtersKo=GSSEnvironmentEnableDisable
		public Assignment getFiltersKoAssignment_12() { return cFiltersKoAssignment_12; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0() { return cFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'validTimesKo'
		public Keyword getValidTimesKoKeyword_14() { return cValidTimesKoKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//validTimesKo=GSSEnvironmentEnableDisable
		public Assignment getValidTimesKoAssignment_16() { return cValidTimesKoAssignment_16; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0() { return cValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSEnvironmentProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentProtocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		
		//GSSEnvironmentProtocol:
		//	'GSSEnvironmentProtocol' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'typeLevel' ':=' typeLevel=INTEGER ';'
		//	'typeOffset' ':=' typeOffset=INTEGER ';' ('subtypeOffset' ':=' subtypeOffset=INTEGER ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentProtocol' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'typeLevel' ':=' typeLevel=INTEGER ';'
		//'typeOffset' ':=' typeOffset=INTEGER ';' ('subtypeOffset' ':=' subtypeOffset=INTEGER ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentProtocol'
		public Keyword getGSSEnvironmentProtocolKeyword_0() { return cGSSEnvironmentProtocolKeyword_0; }
		
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
	public class GSSEnvironmentMainInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentMainInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentMainInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0 = (RuleCall)cIfTypeAssignment_12.eContents().get(0);
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
		private final RuleCall cIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0 = (RuleCall)cIoTypeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cProtocolIDKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cProtocolIDAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0 = (CrossReference)cProtocolIDAssignment_22_2.eContents().get(0);
		private final RuleCall cProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1 = (RuleCall)cProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Assignment cLevelInOutAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0 = (RuleCall)cLevelInOutAssignment_23.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSEnvironmentMainInterface:
		//	'GSSEnvironmentMainInterface' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'ifType' ':=' ifType=GSSEnvironmentInterfaceType ';'
		//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//	'ioType' ':=' ioType=GSSEnvironmentInterfaceIOType ';' ('protocolID' ':='
		//	protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')?
		//	LevelInOut+=GSSEnvironmentLevelInOut+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentMainInterface' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'ifType' ':='
		//ifType=GSSEnvironmentInterfaceType ';' 'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//'ioType' ':=' ioType=GSSEnvironmentInterfaceIOType ';' ('protocolID' ':='
		//protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')? LevelInOut+=GSSEnvironmentLevelInOut+ '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentMainInterface'
		public Keyword getGSSEnvironmentMainInterfaceKeyword_0() { return cGSSEnvironmentMainInterfaceKeyword_0; }
		
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
		
		//ifType=GSSEnvironmentInterfaceType
		public Assignment getIfTypeAssignment_12() { return cIfTypeAssignment_12; }
		
		//GSSEnvironmentInterfaceType
		public RuleCall getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0() { return cIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0; }
		
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
		
		//ioType=GSSEnvironmentInterfaceIOType
		public Assignment getIoTypeAssignment_20() { return cIoTypeAssignment_20; }
		
		//GSSEnvironmentInterfaceIOType
		public RuleCall getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0() { return cIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('protocolID' ':=' protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'protocolID'
		public Keyword getProtocolIDKeyword_22_0() { return cProtocolIDKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName]
		public Assignment getProtocolIDAssignment_22_2() { return cProtocolIDAssignment_22_2; }
		
		//[GSSEnvironmentProtocol|VersionedQualifiedReferenceName]
		public CrossReference getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0() { return cProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1() { return cProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//LevelInOut+=GSSEnvironmentLevelInOut+
		public Assignment getLevelInOutAssignment_23() { return cLevelInOutAssignment_23; }
		
		//GSSEnvironmentLevelInOut
		public RuleCall getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0() { return cLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSEnvironmentInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0 = (RuleCall)cIfTypeAssignment_12.eContents().get(0);
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
		private final RuleCall cIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0 = (RuleCall)cIoTypeAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cProtocolIDKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cProtocolIDAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0 = (CrossReference)cProtocolIDAssignment_22_2.eContents().get(0);
		private final RuleCall cProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1 = (RuleCall)cProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Alternatives cAlternatives_23 = (Alternatives)cGroup.eContents().get(23);
		private final Assignment cLevelInOutAssignment_23_0 = (Assignment)cAlternatives_23.eContents().get(0);
		private final RuleCall cLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0 = (RuleCall)cLevelInOutAssignment_23_0.eContents().get(0);
		private final Assignment cLevelInAssignment_23_1 = (Assignment)cAlternatives_23.eContents().get(1);
		private final RuleCall cLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0 = (RuleCall)cLevelInAssignment_23_1.eContents().get(0);
		private final Assignment cLevelOutAssignment_23_2 = (Assignment)cAlternatives_23.eContents().get(2);
		private final RuleCall cLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0 = (RuleCall)cLevelOutAssignment_23_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSEnvironmentInterface:
		//	'GSSEnvironmentInterface' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'ifType' ':=' ifType=GSSEnvironmentInterfaceType ';'
		//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//	'ioType' ':=' ioType=GSSEnvironmentInterfaceIOType ';' ('protocolID' ':='
		//	protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSEnvironmentLevelInOut |
		//	LevelIn+=GSSEnvironmentLevelIn | LevelOut+=GSSEnvironmentLevelOut)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentInterface' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'ifType' ':='
		//ifType=GSSEnvironmentInterfaceType ';' 'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
		//'ioType' ':=' ioType=GSSEnvironmentInterfaceIOType ';' ('protocolID' ':='
		//protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSEnvironmentLevelInOut |
		//LevelIn+=GSSEnvironmentLevelIn | LevelOut+=GSSEnvironmentLevelOut)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentInterface'
		public Keyword getGSSEnvironmentInterfaceKeyword_0() { return cGSSEnvironmentInterfaceKeyword_0; }
		
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
		
		//ifType=GSSEnvironmentInterfaceType
		public Assignment getIfTypeAssignment_12() { return cIfTypeAssignment_12; }
		
		//GSSEnvironmentInterfaceType
		public RuleCall getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0() { return cIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0; }
		
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
		
		//ioType=GSSEnvironmentInterfaceIOType
		public Assignment getIoTypeAssignment_20() { return cIoTypeAssignment_20; }
		
		//GSSEnvironmentInterfaceIOType
		public RuleCall getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0() { return cIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('protocolID' ':=' protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'protocolID'
		public Keyword getProtocolIDKeyword_22_0() { return cProtocolIDKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName]
		public Assignment getProtocolIDAssignment_22_2() { return cProtocolIDAssignment_22_2; }
		
		//[GSSEnvironmentProtocol|VersionedQualifiedReferenceName]
		public CrossReference getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0() { return cProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1() { return cProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//(LevelInOut+=GSSEnvironmentLevelInOut | LevelIn+=GSSEnvironmentLevelIn | LevelOut+=GSSEnvironmentLevelOut)+
		public Alternatives getAlternatives_23() { return cAlternatives_23; }
		
		//LevelInOut+=GSSEnvironmentLevelInOut
		public Assignment getLevelInOutAssignment_23_0() { return cLevelInOutAssignment_23_0; }
		
		//GSSEnvironmentLevelInOut
		public RuleCall getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0() { return cLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0; }
		
		//LevelIn+=GSSEnvironmentLevelIn
		public Assignment getLevelInAssignment_23_1() { return cLevelInAssignment_23_1; }
		
		//GSSEnvironmentLevelIn
		public RuleCall getLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0() { return cLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0; }
		
		//LevelOut+=GSSEnvironmentLevelOut
		public Assignment getLevelOutAssignment_23_2() { return cLevelOutAssignment_23_2; }
		
		//GSSEnvironmentLevelOut
		public RuleCall getLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0() { return cLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSEnvironmentLevelInOutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelInOut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentLevelInOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final CrossReference cTMformatTMTCIFFormatFormatCrossReference_12_0 = (CrossReference)cTMformatAssignment_12.eContents().get(0);
		private final RuleCall cTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTMformatTMTCIFFormatFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cTCformatKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cTCformatAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cTCformatTMTCIFFormatFormatCrossReference_16_0 = (CrossReference)cTCformatAssignment_16.eContents().get(0);
		private final RuleCall cTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cTCformatTMTCIFFormatFormatCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cInputFilterKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cInputFilterAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final CrossReference cInputFilterTMTCIFFilterFilterCrossReference_20_0 = (CrossReference)cInputFilterAssignment_20.eContents().get(0);
		private final RuleCall cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1 = (RuleCall)cInputFilterTMTCIFFilterFilterCrossReference_20_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cExport_to_prev_LevelKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cExport_to_prev_LevelAssignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0 = (CrossReference)cExport_to_prev_LevelAssignment_22_2.eContents().get(0);
		private final RuleCall cExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Group cGroup_23 = (Group)cGroup.eContents().get(23);
		private final Keyword cImport_from_prev_LevelKeyword_23_0 = (Keyword)cGroup_23.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_23_1 = (Keyword)cGroup_23.eContents().get(1);
		private final Assignment cImport_from_prev_LevelAssignment_23_2 = (Assignment)cGroup_23.eContents().get(2);
		private final CrossReference cImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0 = (CrossReference)cImport_from_prev_LevelAssignment_23_2.eContents().get(0);
		private final RuleCall cImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1 = (RuleCall)cImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_23_3 = (Keyword)cGroup_23.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSEnvironmentLevelInOut:
		//	'GSSEnvironmentLevelInOut' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TMformat' ':=' TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
		//	'TCformat' ':=' TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
		//	'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//	export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentLevelInOut' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TMformat' ':='
		//TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' 'TCformat' ':='
		//TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' 'inputFilter' ':='
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentLevelInOut'
		public Keyword getGSSEnvironmentLevelInOutKeyword_0() { return cGSSEnvironmentLevelInOutKeyword_0; }
		
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
		
		//TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_12() { return cTMformatAssignment_12; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getTMformatTMTCIFFormatFormatCrossReference_12_0() { return cTMformatTMTCIFFormatFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'TCformat'
		public Keyword getTCformatKeyword_14() { return cTCformatKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getTCformatAssignment_16() { return cTCformatAssignment_16; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getTCformatTMTCIFFormatFormatCrossReference_16_0() { return cTCformatTMTCIFFormatFormatCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1() { return cTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_18() { return cInputFilterKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_20() { return cInputFilterAssignment_20; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterTMTCIFFilterFilterCrossReference_20_0() { return cInputFilterTMTCIFFilterFilterCrossReference_20_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1() { return cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('export_to_prev_Level' ':=' export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'export_to_prev_Level'
		public Keyword getExport_to_prev_LevelKeyword_22_0() { return cExport_to_prev_LevelKeyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getExport_to_prev_LevelAssignment_22_2() { return cExport_to_prev_LevelAssignment_22_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0() { return cExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_23_0() { return cImport_from_prev_LevelKeyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_23_2() { return cImport_from_prev_LevelAssignment_23_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0() { return cImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1() { return cImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_23_3() { return cSemicolonKeyword_23_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSEnvironmentLevelInElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelIn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentLevelInKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final CrossReference cTCformatTMTCIFFormatFormatCrossReference_12_0 = (CrossReference)cTCformatAssignment_12.eContents().get(0);
		private final RuleCall cTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTCformatTMTCIFFormatFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cExport_to_prev_LevelKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cExport_to_prev_LevelAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0 = (CrossReference)cExport_to_prev_LevelAssignment_14_2.eContents().get(0);
		private final RuleCall cExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1 = (RuleCall)cExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSEnvironmentLevelIn:
		//	'GSSEnvironmentLevelIn' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TCformat' ':=' TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//	export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentLevelIn' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TCformat' ':='
		//TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
		//export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentLevelIn'
		public Keyword getGSSEnvironmentLevelInKeyword_0() { return cGSSEnvironmentLevelInKeyword_0; }
		
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
		
		//TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getTCformatAssignment_12() { return cTCformatAssignment_12; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getTCformatTMTCIFFormatFormatCrossReference_12_0() { return cTCformatTMTCIFFormatFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('export_to_prev_Level' ':=' export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'export_to_prev_Level'
		public Keyword getExport_to_prev_LevelKeyword_14_0() { return cExport_to_prev_LevelKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getExport_to_prev_LevelAssignment_14_2() { return cExport_to_prev_LevelAssignment_14_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0() { return cExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1() { return cExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSEnvironmentLevelOutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelOut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentLevelOutKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final CrossReference cTMformatTMTCIFFormatFormatCrossReference_12_0 = (CrossReference)cTMformatAssignment_12.eContents().get(0);
		private final RuleCall cTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1 = (RuleCall)cTMformatTMTCIFFormatFormatCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cInputFilterKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInputFilterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cInputFilterTMTCIFFilterFilterCrossReference_16_0 = (CrossReference)cInputFilterAssignment_16.eContents().get(0);
		private final RuleCall cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1 = (RuleCall)cInputFilterTMTCIFFilterFilterCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cImport_from_prev_LevelKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cImport_from_prev_LevelAssignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0 = (CrossReference)cImport_from_prev_LevelAssignment_18_2.eContents().get(0);
		private final RuleCall cImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cSemicolonKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//GSSEnvironmentLevelOut:
		//	'GSSEnvironmentLevelOut' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'TMformat' ':=' TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
		//	'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentLevelOut' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=STRING ';' 'TMformat' ':='
		//TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' 'inputFilter' ':='
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
		//import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentLevelOut'
		public Keyword getGSSEnvironmentLevelOutKeyword_0() { return cGSSEnvironmentLevelOutKeyword_0; }
		
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
		
		//TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_12() { return cTMformatAssignment_12; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getTMformatTMTCIFFormatFormatCrossReference_12_0() { return cTMformatTMTCIFFormatFormatCrossReference_12_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1() { return cTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_14() { return cInputFilterKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_16() { return cInputFilterAssignment_16; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterTMTCIFFilterFilterCrossReference_16_0() { return cInputFilterTMTCIFFilterFilterCrossReference_16_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1() { return cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_18_0() { return cImport_from_prev_LevelKeyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_18_2() { return cImport_from_prev_LevelAssignment_18_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0() { return cImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
		
		//';'
		public Keyword getSemicolonKeyword_20() { return cSemicolonKeyword_20; }
	}
	public class GSSEnvironmentSpecialPacketElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentSpecialPacket");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentSpecialPacketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cStatusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0 = (RuleCall)cStatusAssignment_4.eContents().get(0);
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
		private final CrossReference cInputFilterTMTCIFFilterFilterCrossReference_28_0 = (CrossReference)cInputFilterAssignment_28.eContents().get(0);
		private final RuleCall cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1 = (RuleCall)cInputFilterTMTCIFFilterFilterCrossReference_28_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Assignment cUpperLevelsAssignment_30 = (Assignment)cGroup.eContents().get(30);
		private final RuleCall cUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0 = (RuleCall)cUpperLevelsAssignment_30.eContents().get(0);
		private final Assignment cPrintingDataAssignment_31 = (Assignment)cGroup.eContents().get(31);
		private final RuleCall cPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0 = (RuleCall)cPrintingDataAssignment_31.eContents().get(0);
		private final Alternatives cAlternatives_32 = (Alternatives)cGroup.eContents().get(32);
		private final Assignment cPeriodAssignment_32_0 = (Assignment)cAlternatives_32.eContents().get(0);
		private final RuleCall cPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0 = (RuleCall)cPeriodAssignment_32_0.eContents().get(0);
		private final Assignment cIntervalRangeAssignment_32_1 = (Assignment)cAlternatives_32.eContents().get(1);
		private final RuleCall cIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0 = (RuleCall)cIntervalRangeAssignment_32_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_33 = (Keyword)cGroup.eContents().get(33);
		private final Keyword cSemicolonKeyword_34 = (Keyword)cGroup.eContents().get(34);
		
		//GSSEnvironmentSpecialPacket:
		//	'GSSEnvironmentSpecialPacket' '{'
		//	'status' ':=' status=GSSEnvironmentEnableDisable ';'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'levels' ':=' levels=INTEGER ';'
		//	'levelRef' ':=' levelRef=INTEGER ';'
		//	'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';'
		//	UpperLevels+=GSSEnvironmentUpperLevels?
		//	printingData=GSSEnvironmentPrintingData (period=GSSEnvironmentPeriod | intervalRange=GSSEnvironmentIntervalRange)?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentSpecialPacket' '{' 'status' ':=' status=GSSEnvironmentEnableDisable ';' 'name' ':=' name=STRING ';' 'id'
		//':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';' 'levels' ':=' levels=INTEGER ';' 'levelRef' ':=' levelRef=INTEGER
		//';' 'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';'
		//UpperLevels+=GSSEnvironmentUpperLevels? printingData=GSSEnvironmentPrintingData (period=GSSEnvironmentPeriod |
		//intervalRange=GSSEnvironmentIntervalRange)? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentSpecialPacket'
		public Keyword getGSSEnvironmentSpecialPacketKeyword_0() { return cGSSEnvironmentSpecialPacketKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'status'
		public Keyword getStatusKeyword_2() { return cStatusKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//status=GSSEnvironmentEnableDisable
		public Assignment getStatusAssignment_4() { return cStatusAssignment_4; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0() { return cStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0; }
		
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
		
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_28() { return cInputFilterAssignment_28; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterTMTCIFFilterFilterCrossReference_28_0() { return cInputFilterTMTCIFFilterFilterCrossReference_28_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1() { return cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_29() { return cSemicolonKeyword_29; }
		
		//UpperLevels+=GSSEnvironmentUpperLevels?
		public Assignment getUpperLevelsAssignment_30() { return cUpperLevelsAssignment_30; }
		
		//GSSEnvironmentUpperLevels
		public RuleCall getUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0() { return cUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0; }
		
		//printingData=GSSEnvironmentPrintingData
		public Assignment getPrintingDataAssignment_31() { return cPrintingDataAssignment_31; }
		
		//GSSEnvironmentPrintingData
		public RuleCall getPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0() { return cPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0; }
		
		//(period=GSSEnvironmentPeriod | intervalRange=GSSEnvironmentIntervalRange)?
		public Alternatives getAlternatives_32() { return cAlternatives_32; }
		
		//period=GSSEnvironmentPeriod
		public Assignment getPeriodAssignment_32_0() { return cPeriodAssignment_32_0; }
		
		//GSSEnvironmentPeriod
		public RuleCall getPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0() { return cPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0; }
		
		//intervalRange=GSSEnvironmentIntervalRange
		public Assignment getIntervalRangeAssignment_32_1() { return cIntervalRangeAssignment_32_1; }
		
		//GSSEnvironmentIntervalRange
		public RuleCall getIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0() { return cIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_33() { return cRightCurlyBracketKeyword_33; }
		
		//';'
		public Keyword getSemicolonKeyword_34() { return cSemicolonKeyword_34; }
	}
	public class GSSEnvironmentUpperLevelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentUpperLevelsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUpperLevelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0 = (RuleCall)cUpperLevelAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSEnvironmentUpperLevels:
		//	'GSSEnvironmentUpperLevels' '{'
		//	UpperLevel+=GSSEnvironmentUpperLevel+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentUpperLevels' '{' UpperLevel+=GSSEnvironmentUpperLevel+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentUpperLevels'
		public Keyword getGSSEnvironmentUpperLevelsKeyword_0() { return cGSSEnvironmentUpperLevelsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//UpperLevel+=GSSEnvironmentUpperLevel+
		public Assignment getUpperLevelAssignment_2() { return cUpperLevelAssignment_2; }
		
		//GSSEnvironmentUpperLevel
		public RuleCall getUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0() { return cUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSEnvironmentPrintingDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPrintingData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPrintingDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPrintStatusKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPrintStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0 = (RuleCall)cPrintStatusAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStructuredDataAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0 = (RuleCall)cStructuredDataAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSEnvironmentPrintingData:
		//	'GSSEnvironmentPrintingData' '{'
		//	'printStatus' ':=' printStatus=GSSEnvironmentEnableDisable ';'
		//	structuredData=GSSEnvironmentStructuredData?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPrintingData' '{' 'printStatus' ':=' printStatus=GSSEnvironmentEnableDisable ';'
		//structuredData=GSSEnvironmentStructuredData? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPrintingData'
		public Keyword getGSSEnvironmentPrintingDataKeyword_0() { return cGSSEnvironmentPrintingDataKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'printStatus'
		public Keyword getPrintStatusKeyword_2() { return cPrintStatusKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//printStatus=GSSEnvironmentEnableDisable
		public Assignment getPrintStatusAssignment_4() { return cPrintStatusAssignment_4; }
		
		//GSSEnvironmentEnableDisable
		public RuleCall getPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0() { return cPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//structuredData=GSSEnvironmentStructuredData?
		public Assignment getStructuredDataAssignment_6() { return cStructuredDataAssignment_6; }
		
		//GSSEnvironmentStructuredData
		public RuleCall getStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0() { return cStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSEnvironmentPeriodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPeriodKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMin_valueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMin_valueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMin_valueINTEGERParserRuleCall_4_0 = (RuleCall)cMin_valueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMin_unitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMin_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMin_unitGSSEnvironmentUnitEnumRuleCall_8_0 = (RuleCall)cMin_unitAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cMax_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cMax_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cMax_valueINTEGERParserRuleCall_12_0 = (RuleCall)cMax_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cMax_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cMax_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cMax_unitGSSEnvironmentUnitEnumRuleCall_16_0 = (RuleCall)cMax_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSEnvironmentPeriod:
		//	'GSSEnvironmentPeriod' '{'
		//	'min_value' ':=' min_value=INTEGER ';'
		//	'min_unit' ':=' min_unit=GSSEnvironmentUnit ';'
		//	'max_value' ':=' max_value=INTEGER ';'
		//	'max_unit' ':=' max_unit=GSSEnvironmentUnit ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPeriod' '{' 'min_value' ':=' min_value=INTEGER ';' 'min_unit' ':=' min_unit=GSSEnvironmentUnit ';'
		//'max_value' ':=' max_value=INTEGER ';' 'max_unit' ':=' max_unit=GSSEnvironmentUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPeriod'
		public Keyword getGSSEnvironmentPeriodKeyword_0() { return cGSSEnvironmentPeriodKeyword_0; }
		
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
		
		//min_unit=GSSEnvironmentUnit
		public Assignment getMin_unitAssignment_8() { return cMin_unitAssignment_8; }
		
		//GSSEnvironmentUnit
		public RuleCall getMin_unitGSSEnvironmentUnitEnumRuleCall_8_0() { return cMin_unitGSSEnvironmentUnitEnumRuleCall_8_0; }
		
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
		
		//max_unit=GSSEnvironmentUnit
		public Assignment getMax_unitAssignment_16() { return cMax_unitAssignment_16; }
		
		//GSSEnvironmentUnit
		public RuleCall getMax_unitGSSEnvironmentUnitEnumRuleCall_16_0() { return cMax_unitGSSEnvironmentUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSEnvironmentIntervalRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentIntervalRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentIntervalRangeKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0 = (RuleCall)cInterval_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSemicolonKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSEnvironmentIntervalRange:
		//	'GSSEnvironmentIntervalRange' '{'
		//	'min' ':=' min=INTEGER ';'
		//	'max' ':=' max=INTEGER ';'
		//	'interval_value' ':=' interval_value=INTEGER ';'
		//	'interval_unit' ':=' interval_unit=GSSEnvironmentUnit ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentIntervalRange' '{' 'min' ':=' min=INTEGER ';' 'max' ':=' max=INTEGER ';' 'interval_value' ':='
		//interval_value=INTEGER ';' 'interval_unit' ':=' interval_unit=GSSEnvironmentUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentIntervalRange'
		public Keyword getGSSEnvironmentIntervalRangeKeyword_0() { return cGSSEnvironmentIntervalRangeKeyword_0; }
		
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
		
		//interval_unit=GSSEnvironmentUnit
		public Assignment getInterval_unitAssignment_16() { return cInterval_unitAssignment_16; }
		
		//GSSEnvironmentUnit
		public RuleCall getInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0() { return cInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
		
		//';'
		public Keyword getSemicolonKeyword_19() { return cSemicolonKeyword_19; }
	}
	public class GSSEnvironmentUpperLevelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentUpperLevelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLevelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLevelAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0 = (RuleCall)cLevelAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTMformatKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cTMformatAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cTMformatTMTCIFFormatFormatCrossReference_6_2_0 = (CrossReference)cTMformatAssignment_6_2.eContents().get(0);
		private final RuleCall cTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cTMformatTMTCIFFormatFormatCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cInputFilterKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cInputFilterAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final CrossReference cInputFilterTMTCIFFilterFilterCrossReference_7_2_0 = (CrossReference)cInputFilterAssignment_7_2.eContents().get(0);
		private final RuleCall cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1 = (RuleCall)cInputFilterTMTCIFFilterFilterCrossReference_7_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7_3 = (Keyword)cGroup_7.eContents().get(3);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cImport_from_prev_LevelKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cImport_from_prev_LevelAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final CrossReference cImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0 = (CrossReference)cImport_from_prev_LevelAssignment_8_2.eContents().get(0);
		private final RuleCall cImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1 = (RuleCall)cImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_8_3 = (Keyword)cGroup_8.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//GSSEnvironmentUpperLevel:
		//	'GSSEnvironmentUpperLevel' '{'
		//	'level' ':=' level=GSSEnvironmentUpperLevelLevel ';' ('TMformat' ':='
		//	TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
		//	inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//	import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentUpperLevel' '{' 'level' ':=' level=GSSEnvironmentUpperLevelLevel ';' ('TMformat' ':='
		//TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
		//import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentUpperLevel'
		public Keyword getGSSEnvironmentUpperLevelKeyword_0() { return cGSSEnvironmentUpperLevelKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'level'
		public Keyword getLevelKeyword_2() { return cLevelKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//level=GSSEnvironmentUpperLevelLevel
		public Assignment getLevelAssignment_4() { return cLevelAssignment_4; }
		
		//GSSEnvironmentUpperLevelLevel
		public RuleCall getLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0() { return cLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('TMformat' ':=' TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'TMformat'
		public Keyword getTMformatKeyword_6_0() { return cTMformatKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getTMformatAssignment_6_2() { return cTMformatAssignment_6_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getTMformatTMTCIFFormatFormatCrossReference_6_2_0() { return cTMformatTMTCIFFormatFormatCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//('inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'inputFilter'
		public Keyword getInputFilterKeyword_7_0() { return cInputFilterKeyword_7_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7_1() { return cColonEqualsSignKeyword_7_1; }
		
		//inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getInputFilterAssignment_7_2() { return cInputFilterAssignment_7_2; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getInputFilterTMTCIFFilterFilterCrossReference_7_2_0() { return cInputFilterTMTCIFFilterFilterCrossReference_7_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1() { return cInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_7_3() { return cSemicolonKeyword_7_3; }
		
		//('import_from_prev_Level' ':=' import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'import_from_prev_Level'
		public Keyword getImport_from_prev_LevelKeyword_8_0() { return cImport_from_prev_LevelKeyword_8_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_8_1() { return cColonEqualsSignKeyword_8_1; }
		
		//import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getImport_from_prev_LevelAssignment_8_2() { return cImport_from_prev_LevelAssignment_8_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0() { return cImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1() { return cImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_8_3() { return cSemicolonKeyword_8_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}
	public class GSSEnvironmentStructuredDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentStructuredData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentStructuredDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		
		//GSSEnvironmentStructuredData:
		//	'GSSEnvironmentStructuredData' '{'
		//	'levelRef' ':=' levelRef=INTEGER ';'
		//	'firstField' ':=' firstField=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentStructuredData' '{' 'levelRef' ':=' levelRef=INTEGER ';' 'firstField' ':=' firstField=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentStructuredData'
		public Keyword getGSSEnvironmentStructuredDataKeyword_0() { return cGSSEnvironmentStructuredDataKeyword_0; }
		
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
	public class GSSEnvironmentPeriodicTCLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPeriodicTCLevel2Keyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel2Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel2Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_22_2_0 = (CrossReference)cLevel2Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level2Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level2Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level2TMTCIFExportExportCrossReference_25_0 = (CrossReference)cApp_to_level2Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level2TMTCIFExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Group cGroup_27 = (Group)cGroup.eContents().get(27);
		private final Keyword cLevel1Keyword_27_0 = (Keyword)cGroup_27.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_27_1 = (Keyword)cGroup_27.eContents().get(1);
		private final Assignment cLevel1Assignment_27_2 = (Assignment)cGroup_27.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_27_2_0 = (CrossReference)cLevel1Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_27_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_27_3 = (Keyword)cGroup_27.eContents().get(3);
		private final Group cGroup_28 = (Group)cGroup.eContents().get(28);
		private final Keyword cLevel2_to_level1Keyword_28_0 = (Keyword)cGroup_28.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_28_1 = (Keyword)cGroup_28.eContents().get(1);
		private final Assignment cLevel2_to_level1Assignment_28_2 = (Assignment)cGroup_28.eContents().get(2);
		private final CrossReference cLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0 = (CrossReference)cLevel2_to_level1Assignment_28_2.eContents().get(0);
		private final RuleCall cLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1 = (RuleCall)cLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_28_3 = (Keyword)cGroup_28.eContents().get(3);
		private final Group cGroup_29 = (Group)cGroup.eContents().get(29);
		private final Keyword cLevel0Keyword_29_0 = (Keyword)cGroup_29.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_29_1 = (Keyword)cGroup_29.eContents().get(1);
		private final Assignment cLevel0Assignment_29_2 = (Assignment)cGroup_29.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_29_2_0 = (CrossReference)cLevel0Assignment_29_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_29_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_29_3 = (Keyword)cGroup_29.eContents().get(3);
		private final Group cGroup_30 = (Group)cGroup.eContents().get(30);
		private final Keyword cLevel1_to_level0Keyword_30_0 = (Keyword)cGroup_30.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_30_1 = (Keyword)cGroup_30.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_30_2 = (Assignment)cGroup_30.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0 = (CrossReference)cLevel1_to_level0Assignment_30_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_30_3 = (Keyword)cGroup_30.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_31 = (Keyword)cGroup.eContents().get(31);
		private final Keyword cSemicolonKeyword_32 = (Keyword)cGroup.eContents().get(32);
		
		//GSSEnvironmentPeriodicTCLevel2:
		//	'GSSEnvironmentPeriodicTCLevel2' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level2' ':='
		//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level2' ':=' app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//	level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPeriodicTCLevel2' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level2' ':='
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level2' ':='
		//app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPeriodicTCLevel2'
		public Keyword getGSSEnvironmentPeriodicTCLevel2Keyword_0() { return cGSSEnvironmentPeriodicTCLevel2Keyword_0; }
		
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
		
		//period_unit=GSSEnvironmentUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSEnvironmentUnit
		public RuleCall getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0() { return cPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level2'
		public Keyword getLevel2Keyword_22_0() { return cLevel2Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_22_2() { return cLevel2Assignment_22_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_22_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//'app_to_level2'
		public Keyword getApp_to_level2Keyword_23() { return cApp_to_level2Keyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level2Assignment_25() { return cApp_to_level2Assignment_25; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level2TMTCIFExportExportCrossReference_25_0() { return cApp_to_level2TMTCIFExportExportCrossReference_25_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1() { return cApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level1'
		public Keyword getLevel1Keyword_27_0() { return cLevel1Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_27_2() { return cLevel1Assignment_27_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_27_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_27_3() { return cSemicolonKeyword_27_3; }
		
		//('level2_to_level1' ':=' level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_28() { return cGroup_28; }
		
		//'level2_to_level1'
		public Keyword getLevel2_to_level1Keyword_28_0() { return cLevel2_to_level1Keyword_28_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_28_1() { return cColonEqualsSignKeyword_28_1; }
		
		//level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel2_to_level1Assignment_28_2() { return cLevel2_to_level1Assignment_28_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0() { return cLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1() { return cLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_28_3() { return cSemicolonKeyword_28_3; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_29() { return cGroup_29; }
		
		//'level0'
		public Keyword getLevel0Keyword_29_0() { return cLevel0Keyword_29_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_29_1() { return cColonEqualsSignKeyword_29_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_29_2() { return cLevel0Assignment_29_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_29_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_29_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_29_3() { return cSemicolonKeyword_29_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_30() { return cGroup_30; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_30_0() { return cLevel1_to_level0Keyword_30_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_30_1() { return cColonEqualsSignKeyword_30_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_30_2() { return cLevel1_to_level0Assignment_30_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1() { return cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_30_3() { return cSemicolonKeyword_30_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_31() { return cRightCurlyBracketKeyword_31; }
		
		//';'
		public Keyword getSemicolonKeyword_32() { return cSemicolonKeyword_32; }
	}
	public class GSSEnvironmentPeriodicTCLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPeriodicTCLevel1Keyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel1Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel1Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_22_2_0 = (CrossReference)cLevel1Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level1Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level1Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level1TMTCIFExportExportCrossReference_25_0 = (CrossReference)cApp_to_level1Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level1TMTCIFExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Group cGroup_27 = (Group)cGroup.eContents().get(27);
		private final Keyword cLevel0Keyword_27_0 = (Keyword)cGroup_27.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_27_1 = (Keyword)cGroup_27.eContents().get(1);
		private final Assignment cLevel0Assignment_27_2 = (Assignment)cGroup_27.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_27_2_0 = (CrossReference)cLevel0Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_27_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_27_3 = (Keyword)cGroup_27.eContents().get(3);
		private final Group cGroup_28 = (Group)cGroup.eContents().get(28);
		private final Keyword cLevel1_to_level0Keyword_28_0 = (Keyword)cGroup_28.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_28_1 = (Keyword)cGroup_28.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_28_2 = (Assignment)cGroup_28.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0 = (CrossReference)cLevel1_to_level0Assignment_28_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_28_3 = (Keyword)cGroup_28.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Keyword cSemicolonKeyword_30 = (Keyword)cGroup.eContents().get(30);
		
		//GSSEnvironmentPeriodicTCLevel1:
		//	'GSSEnvironmentPeriodicTCLevel1' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level1' ':='
		//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level1' ':=' app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPeriodicTCLevel1' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level1' ':='
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level1' ':='
		//app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPeriodicTCLevel1'
		public Keyword getGSSEnvironmentPeriodicTCLevel1Keyword_0() { return cGSSEnvironmentPeriodicTCLevel1Keyword_0; }
		
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
		
		//period_unit=GSSEnvironmentUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSEnvironmentUnit
		public RuleCall getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0() { return cPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level1'
		public Keyword getLevel1Keyword_22_0() { return cLevel1Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_22_2() { return cLevel1Assignment_22_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_22_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//'app_to_level1'
		public Keyword getApp_to_level1Keyword_23() { return cApp_to_level1Keyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level1Assignment_25() { return cApp_to_level1Assignment_25; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level1TMTCIFExportExportCrossReference_25_0() { return cApp_to_level1TMTCIFExportExportCrossReference_25_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1() { return cApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level0'
		public Keyword getLevel0Keyword_27_0() { return cLevel0Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_27_2() { return cLevel0Assignment_27_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_27_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_27_3() { return cSemicolonKeyword_27_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_28() { return cGroup_28; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_28_0() { return cLevel1_to_level0Keyword_28_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_28_1() { return cColonEqualsSignKeyword_28_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_28_2() { return cLevel1_to_level0Assignment_28_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1() { return cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_28_3() { return cSemicolonKeyword_28_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_29() { return cRightCurlyBracketKeyword_29; }
		
		//';'
		public Keyword getSemicolonKeyword_30() { return cSemicolonKeyword_30; }
	}
	public class GSSEnvironmentPeriodicTCLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPeriodicTCLevel0Keyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0 = (RuleCall)cPeriod_unitAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cLevel0Keyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_22_1 = (Keyword)cGroup_22.eContents().get(1);
		private final Assignment cLevel0Assignment_22_2 = (Assignment)cGroup_22.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_22_2_0 = (CrossReference)cLevel0Assignment_22_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_22_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22_3 = (Keyword)cGroup_22.eContents().get(3);
		private final Keyword cApp_to_level0Keyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cApp_to_level0Assignment_25 = (Assignment)cGroup.eContents().get(25);
		private final CrossReference cApp_to_level0TMTCIFExportExportCrossReference_25_0 = (CrossReference)cApp_to_level0Assignment_25.eContents().get(0);
		private final RuleCall cApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1 = (RuleCall)cApp_to_level0TMTCIFExportExportCrossReference_25_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Keyword cRightCurlyBracketKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Keyword cSemicolonKeyword_28 = (Keyword)cGroup.eContents().get(28);
		
		//GSSEnvironmentPeriodicTCLevel0:
		//	'GSSEnvironmentPeriodicTCLevel0' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level0' ':=' app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPeriodicTCLevel0' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'period_value' ':=' period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level0' ':='
		//app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPeriodicTCLevel0'
		public Keyword getGSSEnvironmentPeriodicTCLevel0Keyword_0() { return cGSSEnvironmentPeriodicTCLevel0Keyword_0; }
		
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
		
		//period_unit=GSSEnvironmentUnit
		public Assignment getPeriod_unitAssignment_20() { return cPeriod_unitAssignment_20; }
		
		//GSSEnvironmentUnit
		public RuleCall getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0() { return cPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'level0'
		public Keyword getLevel0Keyword_22_0() { return cLevel0Keyword_22_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_22_1() { return cColonEqualsSignKeyword_22_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_22_2() { return cLevel0Assignment_22_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_22_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_22_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22_3() { return cSemicolonKeyword_22_3; }
		
		//'app_to_level0'
		public Keyword getApp_to_level0Keyword_23() { return cApp_to_level0Keyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level0Assignment_25() { return cApp_to_level0Assignment_25; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level0TMTCIFExportExportCrossReference_25_0() { return cApp_to_level0TMTCIFExportExportCrossReference_25_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1() { return cApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_27() { return cRightCurlyBracketKeyword_27; }
		
		//';'
		public Keyword getSemicolonKeyword_28() { return cSemicolonKeyword_28; }
	}
	public class GSSEnvironmentGlobalVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentGlobalVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0 = (RuleCall)cTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cInitial_valueKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInitial_valueAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cInitial_valueINTEGERParserRuleCall_16_0 = (RuleCall)cInitial_valueAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Alternatives cAlternatives_18 = (Alternatives)cGroup.eContents().get(18);
		private final Assignment cReferenceFieldAssignment_18_0 = (Assignment)cAlternatives_18.eContents().get(0);
		private final RuleCall cReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0 = (RuleCall)cReferenceFieldAssignment_18_0.eContents().get(0);
		private final Assignment cReferencePeriodicTCAssignment_18_1 = (Assignment)cAlternatives_18.eContents().get(1);
		private final RuleCall cReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0 = (RuleCall)cReferencePeriodicTCAssignment_18_1.eContents().get(0);
		private final Assignment cReferenceSpecialPacketAssignment_18_2 = (Assignment)cAlternatives_18.eContents().get(2);
		private final RuleCall cReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0 = (RuleCall)cReferenceSpecialPacketAssignment_18_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cSemicolonKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//GSSEnvironmentGlobalVar:
		//	'GSSEnvironmentGlobalVar' '{'
		//	'name' ':=' name=STRING ';'
		//	'id' ':=' id=INTEGER ';'
		//	'type' ':=' type=GSSEnvironmentGlobalVarType ';'
		//	'initial_value' ':=' initial_value=INTEGER ';' (referenceField=GSSEnvironmentReferenceField |
		//	referencePeriodicTC=GSSEnvironmentReferencePeriodicTC | referenceSpecialPacket=GSSEnvironmentReferenceSpecialPacket)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentGlobalVar' '{' 'name' ':=' name=STRING ';' 'id' ':=' id=INTEGER ';' 'type' ':='
		//type=GSSEnvironmentGlobalVarType ';' 'initial_value' ':=' initial_value=INTEGER ';'
		//(referenceField=GSSEnvironmentReferenceField | referencePeriodicTC=GSSEnvironmentReferencePeriodicTC |
		//referenceSpecialPacket=GSSEnvironmentReferenceSpecialPacket) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentGlobalVar'
		public Keyword getGSSEnvironmentGlobalVarKeyword_0() { return cGSSEnvironmentGlobalVarKeyword_0; }
		
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
		
		//type=GSSEnvironmentGlobalVarType
		public Assignment getTypeAssignment_12() { return cTypeAssignment_12; }
		
		//GSSEnvironmentGlobalVarType
		public RuleCall getTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0() { return cTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0; }
		
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
		
		//(referenceField=GSSEnvironmentReferenceField | referencePeriodicTC=GSSEnvironmentReferencePeriodicTC |
		//referenceSpecialPacket=GSSEnvironmentReferenceSpecialPacket)
		public Alternatives getAlternatives_18() { return cAlternatives_18; }
		
		//referenceField=GSSEnvironmentReferenceField
		public Assignment getReferenceFieldAssignment_18_0() { return cReferenceFieldAssignment_18_0; }
		
		//GSSEnvironmentReferenceField
		public RuleCall getReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0() { return cReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0; }
		
		//referencePeriodicTC=GSSEnvironmentReferencePeriodicTC
		public Assignment getReferencePeriodicTCAssignment_18_1() { return cReferencePeriodicTCAssignment_18_1; }
		
		//GSSEnvironmentReferencePeriodicTC
		public RuleCall getReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0() { return cReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0; }
		
		//referenceSpecialPacket=GSSEnvironmentReferenceSpecialPacket
		public Assignment getReferenceSpecialPacketAssignment_18_2() { return cReferenceSpecialPacketAssignment_18_2; }
		
		//GSSEnvironmentReferenceSpecialPacket
		public RuleCall getReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0() { return cReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
		
		//';'
		public Keyword getSemicolonKeyword_20() { return cSemicolonKeyword_20; }
	}
	public class GSSEnvironmentReferenceFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentReferenceFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
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
		
		//GSSEnvironmentReferenceField:
		//	'GSSEnvironmentReferenceField' '{'
		//	'type' ':=' type=GSSEnvironmentReferenceFieldType ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentReferenceField' '{' 'type' ':=' type=GSSEnvironmentReferenceFieldType ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//'level' ':=' level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':='
		//size=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentReferenceField'
		public Keyword getGSSEnvironmentReferenceFieldKeyword_0() { return cGSSEnvironmentReferenceFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//type=GSSEnvironmentReferenceFieldType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//GSSEnvironmentReferenceFieldType
		public RuleCall getTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0() { return cTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0; }
		
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
	public class GSSEnvironmentReferencePeriodicTCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferencePeriodicTC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentReferencePeriodicTCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cIdRefGSSEnvironmentPeriodicTCCrossReference_4_0 = (CrossReference)cIdRefAssignment_4.eContents().get(0);
		private final RuleCall cIdRefGSSEnvironmentPeriodicTCSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cIdRefGSSEnvironmentPeriodicTCCrossReference_4_0.eContents().get(1);
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
		
		//GSSEnvironmentReferencePeriodicTC:
		//	'GSSEnvironmentReferencePeriodicTC' '{'
		//	'idRef' ':=' idRef=[GSSEnvironmentPeriodicTC|STRING] ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentReferencePeriodicTC' '{' 'idRef' ':=' idRef=[GSSEnvironmentPeriodicTC|STRING] ';' 'level' ':='
		//level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER ';'
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentReferencePeriodicTC'
		public Keyword getGSSEnvironmentReferencePeriodicTCKeyword_0() { return cGSSEnvironmentReferencePeriodicTCKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=[GSSEnvironmentPeriodicTC|STRING]
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//[GSSEnvironmentPeriodicTC|STRING]
		public CrossReference getIdRefGSSEnvironmentPeriodicTCCrossReference_4_0() { return cIdRefGSSEnvironmentPeriodicTCCrossReference_4_0; }
		
		//STRING
		public RuleCall getIdRefGSSEnvironmentPeriodicTCSTRINGTerminalRuleCall_4_0_1() { return cIdRefGSSEnvironmentPeriodicTCSTRINGTerminalRuleCall_4_0_1; }
		
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
	public class GSSEnvironmentReferenceSpecialPacketElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceSpecialPacket");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentReferenceSpecialPacketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cIdRefGSSEnvironmentSpecialPacketCrossReference_4_0 = (CrossReference)cIdRefAssignment_4.eContents().get(0);
		private final RuleCall cIdRefGSSEnvironmentSpecialPacketSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cIdRefGSSEnvironmentSpecialPacketCrossReference_4_0.eContents().get(1);
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
		
		//GSSEnvironmentReferenceSpecialPacket:
		//	'GSSEnvironmentReferenceSpecialPacket' '{'
		//	'idRef' ':=' idRef=[GSSEnvironmentSpecialPacket|STRING] ';'
		//	'level' ':=' level=INTEGER ';'
		//	'fieldRef' ':=' fieldRef=INTEGER ';'
		//	'offset' ':=' offset=INTEGER ';'
		//	'size' ':=' size=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentReferenceSpecialPacket' '{' 'idRef' ':=' idRef=[GSSEnvironmentSpecialPacket|STRING] ';' 'level' ':='
		//level=INTEGER ';' 'fieldRef' ':=' fieldRef=INTEGER ';' 'offset' ':=' offset=INTEGER ';' 'size' ':=' size=INTEGER ';'
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentReferenceSpecialPacket'
		public Keyword getGSSEnvironmentReferenceSpecialPacketKeyword_0() { return cGSSEnvironmentReferenceSpecialPacketKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=[GSSEnvironmentSpecialPacket|STRING]
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//[GSSEnvironmentSpecialPacket|STRING]
		public CrossReference getIdRefGSSEnvironmentSpecialPacketCrossReference_4_0() { return cIdRefGSSEnvironmentSpecialPacketCrossReference_4_0; }
		
		//STRING
		public RuleCall getIdRefGSSEnvironmentSpecialPacketSTRINGTerminalRuleCall_4_0_1() { return cIdRefGSSEnvironmentSpecialPacketSTRINGTerminalRuleCall_4_0_1; }
		
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
	public class GSSEnvironmentPlotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPlot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentPlotKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Alternatives cAlternatives_10 = (Alternatives)cGroup.eContents().get(10);
		private final Assignment cGVFilteredAssignment_10_0 = (Assignment)cAlternatives_10.eContents().get(0);
		private final RuleCall cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0 = (RuleCall)cGVFilteredAssignment_10_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_10_1 = (Assignment)cAlternatives_10.eContents().get(1);
		private final RuleCall cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0 = (RuleCall)cGVPeriodicAssignment_10_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSEnvironmentPlot:
		//	'GSSEnvironmentPlot' '{'
		//	'name' ':=' name=STRING ';'
		//	'chartRef' ':=' chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName] ';'
		//	(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentPlot' '{' 'name' ':=' name=STRING ';' 'chartRef' ':='
		//chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName] ';' (GVFiltered=GSSEnvironmentGVFiltered |
		//GVPeriodic=GSSEnvironmentGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentPlot'
		public Keyword getGSSEnvironmentPlotKeyword_0() { return cGSSEnvironmentPlotKeyword_0; }
		
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
		
		//(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		public Alternatives getAlternatives_10() { return cAlternatives_10; }
		
		//GVFiltered=GSSEnvironmentGVFiltered
		public Assignment getGVFilteredAssignment_10_0() { return cGVFilteredAssignment_10_0; }
		
		//GSSEnvironmentGVFiltered
		public RuleCall getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0() { return cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0; }
		
		//GVPeriodic=GSSEnvironmentGVPeriodic
		public Assignment getGVPeriodicAssignment_10_1() { return cGVPeriodicAssignment_10_1; }
		
		//GSSEnvironmentGVPeriodic
		public RuleCall getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0() { return cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSEnvironmentAlarmMsgElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmMsg");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentAlarmMsgKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTextKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTextAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTextSTRINGTerminalRuleCall_12_0 = (RuleCall)cTextAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Alternatives cAlternatives_14 = (Alternatives)cGroup.eContents().get(14);
		private final Assignment cGVFilteredAssignment_14_0 = (Assignment)cAlternatives_14.eContents().get(0);
		private final RuleCall cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0 = (RuleCall)cGVFilteredAssignment_14_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_14_1 = (Assignment)cAlternatives_14.eContents().get(1);
		private final RuleCall cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0 = (RuleCall)cGVPeriodicAssignment_14_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSEnvironmentAlarmMsg:
		//	'GSSEnvironmentAlarmMsg' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSEnvironmentAlarmMsgType ';'
		//	'text' ':=' text=STRING ';' (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentAlarmMsg' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSEnvironmentAlarmMsgType ';' 'text' ':='
		//text=STRING ';' (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentAlarmMsg'
		public Keyword getGSSEnvironmentAlarmMsgKeyword_0() { return cGSSEnvironmentAlarmMsgKeyword_0; }
		
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
		
		//type=GSSEnvironmentAlarmMsgType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSEnvironmentAlarmMsgType
		public RuleCall getTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0() { return cTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0; }
		
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
		
		//(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		public Alternatives getAlternatives_14() { return cAlternatives_14; }
		
		//GVFiltered=GSSEnvironmentGVFiltered
		public Assignment getGVFilteredAssignment_14_0() { return cGVFilteredAssignment_14_0; }
		
		//GSSEnvironmentGVFiltered
		public RuleCall getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0() { return cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0; }
		
		//GVPeriodic=GSSEnvironmentGVPeriodic
		public Assignment getGVPeriodicAssignment_14_1() { return cGVPeriodicAssignment_14_1; }
		
		//GSSEnvironmentGVPeriodic
		public RuleCall getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0() { return cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSEnvironmentModifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentModify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentModifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cValueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cValueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cValueINTEGERParserRuleCall_12_0 = (RuleCall)cValueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Alternatives cAlternatives_14 = (Alternatives)cGroup.eContents().get(14);
		private final Assignment cGVFilteredAssignment_14_0 = (Assignment)cAlternatives_14.eContents().get(0);
		private final RuleCall cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0 = (RuleCall)cGVFilteredAssignment_14_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_14_1 = (Assignment)cAlternatives_14.eContents().get(1);
		private final RuleCall cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0 = (RuleCall)cGVPeriodicAssignment_14_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSEnvironmentModify:
		//	'GSSEnvironmentModify' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSEnvironmentModifyType ';'
		//	'value' ':=' value=INTEGER ';' (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentModify' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSEnvironmentModifyType ';' 'value' ':='
		//value=INTEGER ';' (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentModify'
		public Keyword getGSSEnvironmentModifyKeyword_0() { return cGSSEnvironmentModifyKeyword_0; }
		
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
		
		//type=GSSEnvironmentModifyType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSEnvironmentModifyType
		public RuleCall getTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0() { return cTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0; }
		
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
		
		//(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		public Alternatives getAlternatives_14() { return cAlternatives_14; }
		
		//GVFiltered=GSSEnvironmentGVFiltered
		public Assignment getGVFilteredAssignment_14_0() { return cGVFilteredAssignment_14_0; }
		
		//GSSEnvironmentGVFiltered
		public RuleCall getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0() { return cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0; }
		
		//GVPeriodic=GSSEnvironmentGVPeriodic
		public Assignment getGVPeriodicAssignment_14_1() { return cGVPeriodicAssignment_14_1; }
		
		//GSSEnvironmentGVPeriodic
		public RuleCall getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0() { return cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSEnvironmentAlarmValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmVal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentAlarmValKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Alternatives cAlternatives_10 = (Alternatives)cGroup.eContents().get(10);
		private final Assignment cGVFilteredAssignment_10_0 = (Assignment)cAlternatives_10.eContents().get(0);
		private final RuleCall cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0 = (RuleCall)cGVFilteredAssignment_10_0.eContents().get(0);
		private final Assignment cGVPeriodicAssignment_10_1 = (Assignment)cAlternatives_10.eContents().get(1);
		private final RuleCall cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0 = (RuleCall)cGVPeriodicAssignment_10_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSEnvironmentAlarmVal:
		//	'GSSEnvironmentAlarmVal' '{'
		//	'name' ':=' name=STRING ';'
		//	'type' ':=' type=GSSEnvironmentAlarmValType ';' (GVFiltered=GSSEnvironmentGVFiltered |
		//	GVPeriodic=GSSEnvironmentGVPeriodic)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentAlarmVal' '{' 'name' ':=' name=STRING ';' 'type' ':=' type=GSSEnvironmentAlarmValType ';'
		//(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentAlarmVal'
		public Keyword getGSSEnvironmentAlarmValKeyword_0() { return cGSSEnvironmentAlarmValKeyword_0; }
		
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
		
		//type=GSSEnvironmentAlarmValType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSEnvironmentAlarmValType
		public RuleCall getTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0() { return cTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
		public Alternatives getAlternatives_10() { return cAlternatives_10; }
		
		//GVFiltered=GSSEnvironmentGVFiltered
		public Assignment getGVFilteredAssignment_10_0() { return cGVFilteredAssignment_10_0; }
		
		//GSSEnvironmentGVFiltered
		public RuleCall getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0() { return cGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0; }
		
		//GVPeriodic=GSSEnvironmentGVPeriodic
		public Assignment getGVPeriodicAssignment_10_1() { return cGVPeriodicAssignment_10_1; }
		
		//GSSEnvironmentGVPeriodic
		public RuleCall getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0() { return cGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSEnvironmentGVFilteredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentGVFilteredKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cGlobalVarRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGlobalVarRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0 = (CrossReference)cGlobalVarRefAssignment_4.eContents().get(0);
		private final RuleCall cGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cFilterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cFilterAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cFilterTMTCIFFilterFilterCrossReference_6_2_0 = (CrossReference)cFilterAssignment_6_2.eContents().get(0);
		private final RuleCall cFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cFilterTMTCIFFilterFilterCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSEnvironmentGVFiltered:
		//	'GSSEnvironmentGVFiltered' '{'
		//	'GlobalVarRef' ':=' GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] ';' ('filter' ':='
		//	filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentGVFiltered' '{' 'GlobalVarRef' ':=' GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] ';' ('filter' ':='
		//filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentGVFiltered'
		public Keyword getGSSEnvironmentGVFilteredKeyword_0() { return cGSSEnvironmentGVFilteredKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'GlobalVarRef'
		public Keyword getGlobalVarRefKeyword_2() { return cGlobalVarRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//GlobalVarRef=[GSSEnvironmentGlobalVar|STRING]
		public Assignment getGlobalVarRefAssignment_4() { return cGlobalVarRefAssignment_4; }
		
		//[GSSEnvironmentGlobalVar|STRING]
		public CrossReference getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0() { return cGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0; }
		
		//STRING
		public RuleCall getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1() { return cGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('filter' ':=' filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'filter'
		public Keyword getFilterKeyword_6_0() { return cFilterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getFilterAssignment_6_2() { return cFilterAssignment_6_2; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getFilterTMTCIFFilterFilterCrossReference_6_2_0() { return cFilterTMTCIFFilterFilterCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSEnvironmentGVPeriodicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSEnvironmentGVPeriodicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cGlobalVarRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGlobalVarRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0 = (CrossReference)cGlobalVarRefAssignment_4.eContents().get(0);
		private final RuleCall cGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPeriod_valueKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPeriod_valueAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPeriod_valueINTEGERParserRuleCall_8_0 = (RuleCall)cPeriod_valueAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cPeriod_unitKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cPeriod_unitAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0 = (RuleCall)cPeriod_unitAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSEnvironmentGVPeriodic:
		//	'GSSEnvironmentGVPeriodic' '{'
		//	'GlobalVarRef' ':=' GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] ';'
		//	'period_value' ':=' period_value=INTEGER ';'
		//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSEnvironmentGVPeriodic' '{' 'GlobalVarRef' ':=' GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] ';' 'period_value' ':='
		//period_value=INTEGER ';' 'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSEnvironmentGVPeriodic'
		public Keyword getGSSEnvironmentGVPeriodicKeyword_0() { return cGSSEnvironmentGVPeriodicKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'GlobalVarRef'
		public Keyword getGlobalVarRefKeyword_2() { return cGlobalVarRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//GlobalVarRef=[GSSEnvironmentGlobalVar|STRING]
		public Assignment getGlobalVarRefAssignment_4() { return cGlobalVarRefAssignment_4; }
		
		//[GSSEnvironmentGlobalVar|STRING]
		public CrossReference getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0() { return cGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0; }
		
		//STRING
		public RuleCall getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1() { return cGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1; }
		
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
		
		//period_unit=GSSEnvironmentUnit
		public Assignment getPeriod_unitAssignment_12() { return cPeriod_unitAssignment_12; }
		
		//GSSEnvironmentUnit
		public RuleCall getPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0() { return cPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.EString");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.EBoolean");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.REAL");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.DATE");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.URL");
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
	
	public class GSSEnvironmentEnableDisableElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDisabledEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDisabledDisabledKeyword_0_0 = (Keyword)cDisabledEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEnabledEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEnabledEnabledKeyword_1_0 = (Keyword)cEnabledEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSEnvironmentEnableDisable:
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
	public class GSSEnvironmentInterfaceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceType");
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
		
		//enum GSSEnvironmentInterfaceType:
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
	public class GSSEnvironmentInterfaceIOTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceIOType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIn_outEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIn_outIn_outKeyword_0_0 = (Keyword)cIn_outEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInInKeyword_1_0 = (Keyword)cInEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cOutEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cOutOutKeyword_2_0 = (Keyword)cOutEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSEnvironmentInterfaceIOType:
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
	public class GSSEnvironmentUpperLevelLevelElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevelLevel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_1_1Keyword_0_0 = (Keyword)c_1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_2_2Keyword_1_0 = (Keyword)c_2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration c_3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword c_3_3Keyword_2_0 = (Keyword)c_3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSEnvironmentUpperLevelLevel:
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
	public class GSSEnvironmentUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMilisecondsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMilisecondsMilisecondsKeyword_0_0 = (Keyword)cMilisecondsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSecondsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSecondsSecondsKeyword_1_0 = (Keyword)cSecondsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSEnvironmentUnit:
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
	public class GSSEnvironmentGlobalVarTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVarType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUintEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUintUintKeyword_0_0 = (Keyword)cUintEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFormulaEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFormulaFormulaKeyword_1_0 = (Keyword)cFormulaEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSEnvironmentGlobalVarType:
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
	public class GSSEnvironmentReferenceFieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceFieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTmEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTmTmKeyword_0_0 = (Keyword)cTmEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTcEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTcTcKeyword_1_0 = (Keyword)cTcEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSEnvironmentReferenceFieldType:
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
	public class GSSEnvironmentAlarmMsgTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmMsgType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAlarm1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAlarm1Alarm1Keyword_0_0 = (Keyword)cAlarm1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAlarm2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAlarm2Alarm2Keyword_1_0 = (Keyword)cAlarm2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAlarm3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAlarm3Alarm3Keyword_2_0 = (Keyword)cAlarm3EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSEnvironmentAlarmMsgType:
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
	public class GSSEnvironmentModifyTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentModifyType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIncrementEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIncrementIncrementKeyword_0_0 = (Keyword)cIncrementEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIncrement1wrapEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIncrement1wrapIncrement1wrapKeyword_1_0 = (Keyword)cIncrement1wrapEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSEnvironmentModifyType:
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
	public class GSSEnvironmentAlarmValTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmValType");
		private final EnumLiteralDeclaration cAlarm1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cAlarm1Alarm1Keyword_0 = (Keyword)cAlarm1EnumLiteralDeclaration.eContents().get(0);
		
		//enum GSSEnvironmentAlarmValType:
		//	alarm1;
		public EnumRule getRule() { return rule; }
		
		//alarm1
		public EnumLiteralDeclaration getAlarm1EnumLiteralDeclaration() { return cAlarm1EnumLiteralDeclaration; }
		
		//'alarm1'
		public Keyword getAlarm1Alarm1Keyword_0() { return cAlarm1Alarm1Keyword_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSEnvironmentGSSEnvironmentElements pGSSEnvironmentGSSEnvironment;
	private final GSSEnvironmentScenarioElements pGSSEnvironmentScenario;
	private final GSSEnvironmentOptionsElements pGSSEnvironmentOptions;
	private final GSSEnvironmentProtocolsElements pGSSEnvironmentProtocols;
	private final GSSEnvironmentInterfacesElements pGSSEnvironmentInterfaces;
	private final GSSEnvironmentSpecialPacketsElements pGSSEnvironmentSpecialPackets;
	private final GSSEnvironmentPeriodicTCsElements pGSSEnvironmentPeriodicTCs;
	private final GSSEnvironmentGlobalVarsElements pGSSEnvironmentGlobalVars;
	private final GSSEnvironmentMonitorsElements pGSSEnvironmentMonitors;
	private final GSSEnvironmentGSSInfoElements pGSSEnvironmentGSSInfo;
	private final GSSEnvironmentGSSInfoPrintElements pGSSEnvironmentGSSInfoPrint;
	private final GSSEnvironmentPhyHeaderPrintElements pGSSEnvironmentPhyHeaderPrint;
	private final GSSEnvironmentGSSDiscardErrorFlagsElements pGSSEnvironmentGSSDiscardErrorFlags;
	private final GSSEnvironmentEnableDisableElements eGSSEnvironmentEnableDisable;
	private final GSSEnvironmentProtocolElements pGSSEnvironmentProtocol;
	private final GSSEnvironmentMainInterfaceElements pGSSEnvironmentMainInterface;
	private final GSSEnvironmentInterfaceElements pGSSEnvironmentInterface;
	private final GSSEnvironmentLevelInOutElements pGSSEnvironmentLevelInOut;
	private final GSSEnvironmentLevelInElements pGSSEnvironmentLevelIn;
	private final GSSEnvironmentLevelOutElements pGSSEnvironmentLevelOut;
	private final GSSEnvironmentInterfaceTypeElements eGSSEnvironmentInterfaceType;
	private final GSSEnvironmentInterfaceIOTypeElements eGSSEnvironmentInterfaceIOType;
	private final GSSEnvironmentSpecialPacketElements pGSSEnvironmentSpecialPacket;
	private final GSSEnvironmentUpperLevelsElements pGSSEnvironmentUpperLevels;
	private final GSSEnvironmentPrintingDataElements pGSSEnvironmentPrintingData;
	private final GSSEnvironmentPeriodElements pGSSEnvironmentPeriod;
	private final GSSEnvironmentIntervalRangeElements pGSSEnvironmentIntervalRange;
	private final GSSEnvironmentUpperLevelElements pGSSEnvironmentUpperLevel;
	private final GSSEnvironmentUpperLevelLevelElements eGSSEnvironmentUpperLevelLevel;
	private final GSSEnvironmentStructuredDataElements pGSSEnvironmentStructuredData;
	private final GSSEnvironmentUnitElements eGSSEnvironmentUnit;
	private final GSSEnvironmentPeriodicTCLevel2Elements pGSSEnvironmentPeriodicTCLevel2;
	private final GSSEnvironmentPeriodicTCLevel1Elements pGSSEnvironmentPeriodicTCLevel1;
	private final GSSEnvironmentPeriodicTCLevel0Elements pGSSEnvironmentPeriodicTCLevel0;
	private final GSSEnvironmentGlobalVarElements pGSSEnvironmentGlobalVar;
	private final GSSEnvironmentGlobalVarTypeElements eGSSEnvironmentGlobalVarType;
	private final GSSEnvironmentReferenceFieldElements pGSSEnvironmentReferenceField;
	private final GSSEnvironmentReferencePeriodicTCElements pGSSEnvironmentReferencePeriodicTC;
	private final GSSEnvironmentReferenceSpecialPacketElements pGSSEnvironmentReferenceSpecialPacket;
	private final GSSEnvironmentReferenceFieldTypeElements eGSSEnvironmentReferenceFieldType;
	private final GSSEnvironmentPlotElements pGSSEnvironmentPlot;
	private final GSSEnvironmentAlarmMsgElements pGSSEnvironmentAlarmMsg;
	private final GSSEnvironmentModifyElements pGSSEnvironmentModify;
	private final GSSEnvironmentAlarmValElements pGSSEnvironmentAlarmVal;
	private final GSSEnvironmentGVFilteredElements pGSSEnvironmentGVFiltered;
	private final GSSEnvironmentGVPeriodicElements pGSSEnvironmentGVPeriodic;
	private final GSSEnvironmentAlarmMsgTypeElements eGSSEnvironmentAlarmMsgType;
	private final GSSEnvironmentModifyTypeElements eGSSEnvironmentModifyType;
	private final GSSEnvironmentAlarmValTypeElements eGSSEnvironmentAlarmValType;
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
	public ENVIRONMENTGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSEnvironmentGSSEnvironment = new GSSEnvironmentGSSEnvironmentElements();
		this.pGSSEnvironmentScenario = new GSSEnvironmentScenarioElements();
		this.pGSSEnvironmentOptions = new GSSEnvironmentOptionsElements();
		this.pGSSEnvironmentProtocols = new GSSEnvironmentProtocolsElements();
		this.pGSSEnvironmentInterfaces = new GSSEnvironmentInterfacesElements();
		this.pGSSEnvironmentSpecialPackets = new GSSEnvironmentSpecialPacketsElements();
		this.pGSSEnvironmentPeriodicTCs = new GSSEnvironmentPeriodicTCsElements();
		this.pGSSEnvironmentGlobalVars = new GSSEnvironmentGlobalVarsElements();
		this.pGSSEnvironmentMonitors = new GSSEnvironmentMonitorsElements();
		this.pGSSEnvironmentGSSInfo = new GSSEnvironmentGSSInfoElements();
		this.pGSSEnvironmentGSSInfoPrint = new GSSEnvironmentGSSInfoPrintElements();
		this.pGSSEnvironmentPhyHeaderPrint = new GSSEnvironmentPhyHeaderPrintElements();
		this.pGSSEnvironmentGSSDiscardErrorFlags = new GSSEnvironmentGSSDiscardErrorFlagsElements();
		this.eGSSEnvironmentEnableDisable = new GSSEnvironmentEnableDisableElements();
		this.pGSSEnvironmentProtocol = new GSSEnvironmentProtocolElements();
		this.pGSSEnvironmentMainInterface = new GSSEnvironmentMainInterfaceElements();
		this.pGSSEnvironmentInterface = new GSSEnvironmentInterfaceElements();
		this.pGSSEnvironmentLevelInOut = new GSSEnvironmentLevelInOutElements();
		this.pGSSEnvironmentLevelIn = new GSSEnvironmentLevelInElements();
		this.pGSSEnvironmentLevelOut = new GSSEnvironmentLevelOutElements();
		this.eGSSEnvironmentInterfaceType = new GSSEnvironmentInterfaceTypeElements();
		this.eGSSEnvironmentInterfaceIOType = new GSSEnvironmentInterfaceIOTypeElements();
		this.pGSSEnvironmentSpecialPacket = new GSSEnvironmentSpecialPacketElements();
		this.pGSSEnvironmentUpperLevels = new GSSEnvironmentUpperLevelsElements();
		this.pGSSEnvironmentPrintingData = new GSSEnvironmentPrintingDataElements();
		this.pGSSEnvironmentPeriod = new GSSEnvironmentPeriodElements();
		this.pGSSEnvironmentIntervalRange = new GSSEnvironmentIntervalRangeElements();
		this.pGSSEnvironmentUpperLevel = new GSSEnvironmentUpperLevelElements();
		this.eGSSEnvironmentUpperLevelLevel = new GSSEnvironmentUpperLevelLevelElements();
		this.pGSSEnvironmentStructuredData = new GSSEnvironmentStructuredDataElements();
		this.eGSSEnvironmentUnit = new GSSEnvironmentUnitElements();
		this.pGSSEnvironmentPeriodicTCLevel2 = new GSSEnvironmentPeriodicTCLevel2Elements();
		this.pGSSEnvironmentPeriodicTCLevel1 = new GSSEnvironmentPeriodicTCLevel1Elements();
		this.pGSSEnvironmentPeriodicTCLevel0 = new GSSEnvironmentPeriodicTCLevel0Elements();
		this.pGSSEnvironmentGlobalVar = new GSSEnvironmentGlobalVarElements();
		this.eGSSEnvironmentGlobalVarType = new GSSEnvironmentGlobalVarTypeElements();
		this.pGSSEnvironmentReferenceField = new GSSEnvironmentReferenceFieldElements();
		this.pGSSEnvironmentReferencePeriodicTC = new GSSEnvironmentReferencePeriodicTCElements();
		this.pGSSEnvironmentReferenceSpecialPacket = new GSSEnvironmentReferenceSpecialPacketElements();
		this.eGSSEnvironmentReferenceFieldType = new GSSEnvironmentReferenceFieldTypeElements();
		this.pGSSEnvironmentPlot = new GSSEnvironmentPlotElements();
		this.pGSSEnvironmentAlarmMsg = new GSSEnvironmentAlarmMsgElements();
		this.pGSSEnvironmentModify = new GSSEnvironmentModifyElements();
		this.pGSSEnvironmentAlarmVal = new GSSEnvironmentAlarmValElements();
		this.pGSSEnvironmentGVFiltered = new GSSEnvironmentGVFilteredElements();
		this.pGSSEnvironmentGVPeriodic = new GSSEnvironmentGVPeriodicElements();
		this.eGSSEnvironmentAlarmMsgType = new GSSEnvironmentAlarmMsgTypeElements();
		this.eGSSEnvironmentModifyType = new GSSEnvironmentModifyTypeElements();
		this.eGSSEnvironmentAlarmValType = new GSSEnvironmentAlarmValTypeElements();
		this.pEString = new EStringElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
		this.pREAL = new REALElements();
		this.pDATE = new DATEElements();
		this.pURL = new URLElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.environment.ENVIRONMENT".equals(grammar.getName())) {
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
	//	element=GSSEnvironmentGSSEnvironment
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
	
	//GSSEnvironmentGSSEnvironment GSSEnvironmentEnvironment:
	//	'GSSEnvironmentEnvironment'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';')
	//	'version' ':=' version=Version ';'
	//	scenario+=GSSEnvironmentScenario
	//	'}' ';'
	public GSSEnvironmentGSSEnvironmentElements getGSSEnvironmentGSSEnvironmentAccess() {
		return pGSSEnvironmentGSSEnvironment;
	}
	
	public ParserRule getGSSEnvironmentGSSEnvironmentRule() {
		return getGSSEnvironmentGSSEnvironmentAccess().getRule();
	}
	
	//GSSEnvironmentScenario:
	//	'GSSEnvironmentScenario'
	//	name=ID
	//	'{'
	//	gss_options=GSSEnvironmentOptions
	//	Protocols=GSSEnvironmentProtocols
	//	Interfaces=GSSEnvironmentInterfaces
	//	SpecialPackets=GSSEnvironmentSpecialPackets?
	//	PeriodicTCs=GSSEnvironmentPeriodicTCs? (GlobalVars=GSSEnvironmentGlobalVars & Monitors=GSSEnvironmentMonitors)?
	//	'}' ';';
	public GSSEnvironmentScenarioElements getGSSEnvironmentScenarioAccess() {
		return pGSSEnvironmentScenario;
	}
	
	public ParserRule getGSSEnvironmentScenarioRule() {
		return getGSSEnvironmentScenarioAccess().getRule();
	}
	
	//GSSEnvironmentOptions:
	//	'GSSEnvironmentOptions' '{'
	//	gss_info=GSSEnvironmentGSSInfo
	//	gss_info_print=GSSEnvironmentGSSInfoPrint
	//	phy_header_print=GSSEnvironmentPhyHeaderPrint
	//	discardErrorFlags=GSSEnvironmentGSSDiscardErrorFlags
	//	'}' ';';
	public GSSEnvironmentOptionsElements getGSSEnvironmentOptionsAccess() {
		return pGSSEnvironmentOptions;
	}
	
	public ParserRule getGSSEnvironmentOptionsRule() {
		return getGSSEnvironmentOptionsAccess().getRule();
	}
	
	//GSSEnvironmentProtocols:
	//	'GSSEnvironmentProtocols' '{'
	//	Protocol+=GSSEnvironmentProtocol+
	//	'}' ';';
	public GSSEnvironmentProtocolsElements getGSSEnvironmentProtocolsAccess() {
		return pGSSEnvironmentProtocols;
	}
	
	public ParserRule getGSSEnvironmentProtocolsRule() {
		return getGSSEnvironmentProtocolsAccess().getRule();
	}
	
	//GSSEnvironmentInterfaces:
	//	'GSSEnvironmentInterfaces' '{' ('ProtocolPacketsFile' ':='
	//	ProtocolPacketsFile=[protocol_packets::GSSProtocolPacketsProtocolPackets|VersionedQualifiedName] ';')?
	//	MainInterface=GSSEnvironmentMainInterface
	//	Interface+=GSSEnvironmentInterface*
	//	'}' ';';
	public GSSEnvironmentInterfacesElements getGSSEnvironmentInterfacesAccess() {
		return pGSSEnvironmentInterfaces;
	}
	
	public ParserRule getGSSEnvironmentInterfacesRule() {
		return getGSSEnvironmentInterfacesAccess().getRule();
	}
	
	//GSSEnvironmentSpecialPackets:
	//	'GSSEnvironmentSpecialPackets' '{'
	//	SpecialPacket+=GSSEnvironmentSpecialPacket '}' ';';
	public GSSEnvironmentSpecialPacketsElements getGSSEnvironmentSpecialPacketsAccess() {
		return pGSSEnvironmentSpecialPackets;
	}
	
	public ParserRule getGSSEnvironmentSpecialPacketsRule() {
		return getGSSEnvironmentSpecialPacketsAccess().getRule();
	}
	
	//GSSEnvironmentPeriodicTCs:
	//	{GSSEnvironmentPeriodicTCs}
	//	'GSSEnvironmentPeriodicTCs' '{' (PeriodicTC_level_2+=GSSEnvironmentPeriodicTCLevel2 |
	//	PeriodicTC_level_1+=GSSEnvironmentPeriodicTCLevel1 | PeriodicTC_level_0+=GSSEnvironmentPeriodicTCLevel0)*
	//	'}' ';';
	public GSSEnvironmentPeriodicTCsElements getGSSEnvironmentPeriodicTCsAccess() {
		return pGSSEnvironmentPeriodicTCs;
	}
	
	public ParserRule getGSSEnvironmentPeriodicTCsRule() {
		return getGSSEnvironmentPeriodicTCsAccess().getRule();
	}
	
	//GSSEnvironmentGlobalVars:
	//	'GSSEnvironmentGlobalVars' '{'
	//	GlobalVar+=GSSEnvironmentGlobalVar+
	//	'}' ';';
	public GSSEnvironmentGlobalVarsElements getGSSEnvironmentGlobalVarsAccess() {
		return pGSSEnvironmentGlobalVars;
	}
	
	public ParserRule getGSSEnvironmentGlobalVarsRule() {
		return getGSSEnvironmentGlobalVarsAccess().getRule();
	}
	
	//GSSEnvironmentMonitors:
	//	'GSSEnvironmentMonitors' '{' ('ChartsFile' ':=' ChartsFile=[charts::GSSChartsCharts|VersionedQualifiedName] ';')?
	//	(plot+=GSSEnvironmentPlot | alarmMsg+=GSSEnvironmentAlarmMsg | modify+=GSSEnvironmentModify |
	//	alarmVal+=GSSEnvironmentAlarmVal)+
	//	'}' ';';
	public GSSEnvironmentMonitorsElements getGSSEnvironmentMonitorsAccess() {
		return pGSSEnvironmentMonitors;
	}
	
	public ParserRule getGSSEnvironmentMonitorsRule() {
		return getGSSEnvironmentMonitorsAccess().getRule();
	}
	
	//GSSEnvironmentGSSInfo GSSEnvironmentInfo:
	//	'GSSEnvironmentInfo' '{'
	//	'test_campaign' ':=' test_campaign=STRING ';'
	//	'version' ':=' version=Version ';'
	//	'date' ':=' date=DATE ';' ('version_control_url' ':=' version_control_url=URL ';')?
	//	'}' ';'
	public GSSEnvironmentGSSInfoElements getGSSEnvironmentGSSInfoAccess() {
		return pGSSEnvironmentGSSInfo;
	}
	
	public ParserRule getGSSEnvironmentGSSInfoRule() {
		return getGSSEnvironmentGSSInfoAccess().getRule();
	}
	
	//GSSEnvironmentGSSInfoPrint GSSEnvironmentInfoPrint:
	//	'GSSEnvironmentInfoPrint'
	//	'{'
	//	'mainLog' ':=' mainLog=GSSEnvironmentEnableDisable ';'
	//	'portLogs' ':=' portLogs=GSSEnvironmentEnableDisable ';'
	//	'rawLog' ':=' rawLog=GSSEnvironmentEnableDisable ';'
	//	'}' ';'
	public GSSEnvironmentGSSInfoPrintElements getGSSEnvironmentGSSInfoPrintAccess() {
		return pGSSEnvironmentGSSInfoPrint;
	}
	
	public ParserRule getGSSEnvironmentGSSInfoPrintRule() {
		return getGSSEnvironmentGSSInfoPrintAccess().getRule();
	}
	
	//GSSEnvironmentPhyHeaderPrint:
	//	'GSSEnvironmentPhyHeaderPrint' '{'
	//	'mainLog' ':=' mainLog=GSSEnvironmentEnableDisable ';'
	//	'portLogs' ':=' portLogs=GSSEnvironmentEnableDisable ';'
	//	'rawLog' ':=' rawLog=GSSEnvironmentEnableDisable ';'
	//	'gssTabs' ':=' gssTabs=GSSEnvironmentEnableDisable ';'
	//	'}' ';';
	public GSSEnvironmentPhyHeaderPrintElements getGSSEnvironmentPhyHeaderPrintAccess() {
		return pGSSEnvironmentPhyHeaderPrint;
	}
	
	public ParserRule getGSSEnvironmentPhyHeaderPrintRule() {
		return getGSSEnvironmentPhyHeaderPrintAccess().getRule();
	}
	
	//GSSEnvironmentGSSDiscardErrorFlags GSSEnvironmentDiscardErrorFlags:
	//	'GSSEnvironmentDiscardErrorFlags' '{'
	//	'txErrors' ':=' txErrors=GSSEnvironmentEnableDisable ';'
	//	'notExpectedPackets' ':=' notExpectedPackets=GSSEnvironmentEnableDisable ';'
	//	'filtersKo' ':=' filtersKo=GSSEnvironmentEnableDisable ';'
	//	'validTimesKo' ':=' validTimesKo=GSSEnvironmentEnableDisable ';'
	//	'}' ';'
	public GSSEnvironmentGSSDiscardErrorFlagsElements getGSSEnvironmentGSSDiscardErrorFlagsAccess() {
		return pGSSEnvironmentGSSDiscardErrorFlags;
	}
	
	public ParserRule getGSSEnvironmentGSSDiscardErrorFlagsRule() {
		return getGSSEnvironmentGSSDiscardErrorFlagsAccess().getRule();
	}
	
	//enum GSSEnvironmentEnableDisable:
	//	disabled | enabled;
	public GSSEnvironmentEnableDisableElements getGSSEnvironmentEnableDisableAccess() {
		return eGSSEnvironmentEnableDisable;
	}
	
	public EnumRule getGSSEnvironmentEnableDisableRule() {
		return getGSSEnvironmentEnableDisableAccess().getRule();
	}
	
	//GSSEnvironmentProtocol:
	//	'GSSEnvironmentProtocol' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'typeLevel' ':=' typeLevel=INTEGER ';'
	//	'typeOffset' ':=' typeOffset=INTEGER ';' ('subtypeOffset' ':=' subtypeOffset=INTEGER ';')?
	//	'}' ';';
	public GSSEnvironmentProtocolElements getGSSEnvironmentProtocolAccess() {
		return pGSSEnvironmentProtocol;
	}
	
	public ParserRule getGSSEnvironmentProtocolRule() {
		return getGSSEnvironmentProtocolAccess().getRule();
	}
	
	//GSSEnvironmentMainInterface:
	//	'GSSEnvironmentMainInterface' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'ifType' ':=' ifType=GSSEnvironmentInterfaceType ';'
	//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
	//	'ioType' ':=' ioType=GSSEnvironmentInterfaceIOType ';' ('protocolID' ':='
	//	protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')?
	//	LevelInOut+=GSSEnvironmentLevelInOut+
	//	'}' ';';
	public GSSEnvironmentMainInterfaceElements getGSSEnvironmentMainInterfaceAccess() {
		return pGSSEnvironmentMainInterface;
	}
	
	public ParserRule getGSSEnvironmentMainInterfaceRule() {
		return getGSSEnvironmentMainInterfaceAccess().getRule();
	}
	
	//GSSEnvironmentInterface:
	//	'GSSEnvironmentInterface' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'ifType' ':=' ifType=GSSEnvironmentInterfaceType ';'
	//	'ifConfig' ':=' ifConfig=[iface::GSSIfacePortConfig|VersionedQualifiedName] ';'
	//	'ioType' ':=' ioType=GSSEnvironmentInterfaceIOType ';' ('protocolID' ':='
	//	protocolID=[GSSEnvironmentProtocol|VersionedQualifiedReferenceName] ';')? (LevelInOut+=GSSEnvironmentLevelInOut |
	//	LevelIn+=GSSEnvironmentLevelIn | LevelOut+=GSSEnvironmentLevelOut)+
	//	'}' ';';
	public GSSEnvironmentInterfaceElements getGSSEnvironmentInterfaceAccess() {
		return pGSSEnvironmentInterface;
	}
	
	public ParserRule getGSSEnvironmentInterfaceRule() {
		return getGSSEnvironmentInterfaceAccess().getRule();
	}
	
	//GSSEnvironmentLevelInOut:
	//	'GSSEnvironmentLevelInOut' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TMformat' ':=' TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
	//	'TCformat' ':=' TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
	//	'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
	//	export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentLevelInOutElements getGSSEnvironmentLevelInOutAccess() {
		return pGSSEnvironmentLevelInOut;
	}
	
	public ParserRule getGSSEnvironmentLevelInOutRule() {
		return getGSSEnvironmentLevelInOutAccess().getRule();
	}
	
	//GSSEnvironmentLevelIn:
	//	'GSSEnvironmentLevelIn' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TCformat' ':=' TCformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' ('export_to_prev_Level' ':='
	//	export_to_prev_Level=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentLevelInElements getGSSEnvironmentLevelInAccess() {
		return pGSSEnvironmentLevelIn;
	}
	
	public ParserRule getGSSEnvironmentLevelInRule() {
		return getGSSEnvironmentLevelInAccess().getRule();
	}
	
	//GSSEnvironmentLevelOut:
	//	'GSSEnvironmentLevelOut' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'TMformat' ':=' TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
	//	'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';' ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentLevelOutElements getGSSEnvironmentLevelOutAccess() {
		return pGSSEnvironmentLevelOut;
	}
	
	public ParserRule getGSSEnvironmentLevelOutRule() {
		return getGSSEnvironmentLevelOutAccess().getRule();
	}
	
	//enum GSSEnvironmentInterfaceType:
	//	SpW | SpW_TC | SpW_Error |
	//	uart | dummy;
	public GSSEnvironmentInterfaceTypeElements getGSSEnvironmentInterfaceTypeAccess() {
		return eGSSEnvironmentInterfaceType;
	}
	
	public EnumRule getGSSEnvironmentInterfaceTypeRule() {
		return getGSSEnvironmentInterfaceTypeAccess().getRule();
	}
	
	//enum GSSEnvironmentInterfaceIOType:
	//	in_out | in | out;
	public GSSEnvironmentInterfaceIOTypeElements getGSSEnvironmentInterfaceIOTypeAccess() {
		return eGSSEnvironmentInterfaceIOType;
	}
	
	public EnumRule getGSSEnvironmentInterfaceIOTypeRule() {
		return getGSSEnvironmentInterfaceIOTypeAccess().getRule();
	}
	
	//GSSEnvironmentSpecialPacket:
	//	'GSSEnvironmentSpecialPacket' '{'
	//	'status' ':=' status=GSSEnvironmentEnableDisable ';'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'levels' ':=' levels=INTEGER ';'
	//	'levelRef' ':=' levelRef=INTEGER ';'
	//	'inputFilter' ':=' inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';'
	//	UpperLevels+=GSSEnvironmentUpperLevels?
	//	printingData=GSSEnvironmentPrintingData (period=GSSEnvironmentPeriod | intervalRange=GSSEnvironmentIntervalRange)?
	//	'}' ';';
	public GSSEnvironmentSpecialPacketElements getGSSEnvironmentSpecialPacketAccess() {
		return pGSSEnvironmentSpecialPacket;
	}
	
	public ParserRule getGSSEnvironmentSpecialPacketRule() {
		return getGSSEnvironmentSpecialPacketAccess().getRule();
	}
	
	//GSSEnvironmentUpperLevels:
	//	'GSSEnvironmentUpperLevels' '{'
	//	UpperLevel+=GSSEnvironmentUpperLevel+
	//	'}' ';';
	public GSSEnvironmentUpperLevelsElements getGSSEnvironmentUpperLevelsAccess() {
		return pGSSEnvironmentUpperLevels;
	}
	
	public ParserRule getGSSEnvironmentUpperLevelsRule() {
		return getGSSEnvironmentUpperLevelsAccess().getRule();
	}
	
	//GSSEnvironmentPrintingData:
	//	'GSSEnvironmentPrintingData' '{'
	//	'printStatus' ':=' printStatus=GSSEnvironmentEnableDisable ';'
	//	structuredData=GSSEnvironmentStructuredData?
	//	'}' ';';
	public GSSEnvironmentPrintingDataElements getGSSEnvironmentPrintingDataAccess() {
		return pGSSEnvironmentPrintingData;
	}
	
	public ParserRule getGSSEnvironmentPrintingDataRule() {
		return getGSSEnvironmentPrintingDataAccess().getRule();
	}
	
	//GSSEnvironmentPeriod:
	//	'GSSEnvironmentPeriod' '{'
	//	'min_value' ':=' min_value=INTEGER ';'
	//	'min_unit' ':=' min_unit=GSSEnvironmentUnit ';'
	//	'max_value' ':=' max_value=INTEGER ';'
	//	'max_unit' ':=' max_unit=GSSEnvironmentUnit ';'
	//	'}' ';';
	public GSSEnvironmentPeriodElements getGSSEnvironmentPeriodAccess() {
		return pGSSEnvironmentPeriod;
	}
	
	public ParserRule getGSSEnvironmentPeriodRule() {
		return getGSSEnvironmentPeriodAccess().getRule();
	}
	
	//GSSEnvironmentIntervalRange:
	//	'GSSEnvironmentIntervalRange' '{'
	//	'min' ':=' min=INTEGER ';'
	//	'max' ':=' max=INTEGER ';'
	//	'interval_value' ':=' interval_value=INTEGER ';'
	//	'interval_unit' ':=' interval_unit=GSSEnvironmentUnit ';'
	//	'}' ';';
	public GSSEnvironmentIntervalRangeElements getGSSEnvironmentIntervalRangeAccess() {
		return pGSSEnvironmentIntervalRange;
	}
	
	public ParserRule getGSSEnvironmentIntervalRangeRule() {
		return getGSSEnvironmentIntervalRangeAccess().getRule();
	}
	
	//GSSEnvironmentUpperLevel:
	//	'GSSEnvironmentUpperLevel' '{'
	//	'level' ':=' level=GSSEnvironmentUpperLevelLevel ';' ('TMformat' ':='
	//	TMformat=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('inputFilter' ':='
	//	inputFilter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? ('import_from_prev_Level' ':='
	//	import_from_prev_Level=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentUpperLevelElements getGSSEnvironmentUpperLevelAccess() {
		return pGSSEnvironmentUpperLevel;
	}
	
	public ParserRule getGSSEnvironmentUpperLevelRule() {
		return getGSSEnvironmentUpperLevelAccess().getRule();
	}
	
	//enum GSSEnvironmentUpperLevelLevel:
	//	_1 | _2 | _3;
	public GSSEnvironmentUpperLevelLevelElements getGSSEnvironmentUpperLevelLevelAccess() {
		return eGSSEnvironmentUpperLevelLevel;
	}
	
	public EnumRule getGSSEnvironmentUpperLevelLevelRule() {
		return getGSSEnvironmentUpperLevelLevelAccess().getRule();
	}
	
	//GSSEnvironmentStructuredData:
	//	'GSSEnvironmentStructuredData' '{'
	//	'levelRef' ':=' levelRef=INTEGER ';'
	//	'firstField' ':=' firstField=INTEGER ';'
	//	'}' ';';
	public GSSEnvironmentStructuredDataElements getGSSEnvironmentStructuredDataAccess() {
		return pGSSEnvironmentStructuredData;
	}
	
	public ParserRule getGSSEnvironmentStructuredDataRule() {
		return getGSSEnvironmentStructuredDataAccess().getRule();
	}
	
	//enum GSSEnvironmentUnit:
	//	miliseconds | seconds;
	public GSSEnvironmentUnitElements getGSSEnvironmentUnitAccess() {
		return eGSSEnvironmentUnit;
	}
	
	public EnumRule getGSSEnvironmentUnitRule() {
		return getGSSEnvironmentUnitAccess().getRule();
	}
	
	//GSSEnvironmentPeriodicTCLevel2:
	//	'GSSEnvironmentPeriodicTCLevel2' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level2' ':='
	//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level2' ':=' app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level1' ':='
	//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
	//	level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentPeriodicTCLevel2Elements getGSSEnvironmentPeriodicTCLevel2Access() {
		return pGSSEnvironmentPeriodicTCLevel2;
	}
	
	public ParserRule getGSSEnvironmentPeriodicTCLevel2Rule() {
		return getGSSEnvironmentPeriodicTCLevel2Access().getRule();
	}
	
	//GSSEnvironmentPeriodicTCLevel1:
	//	'GSSEnvironmentPeriodicTCLevel1' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level1' ':='
	//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level1' ':=' app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentPeriodicTCLevel1Elements getGSSEnvironmentPeriodicTCLevel1Access() {
		return pGSSEnvironmentPeriodicTCLevel1;
	}
	
	public ParserRule getGSSEnvironmentPeriodicTCLevel1Rule() {
		return getGSSEnvironmentPeriodicTCLevel1Access().getRule();
	}
	
	//GSSEnvironmentPeriodicTCLevel0:
	//	'GSSEnvironmentPeriodicTCLevel0' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';' ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level0' ':=' app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';'
	//	'}' ';';
	public GSSEnvironmentPeriodicTCLevel0Elements getGSSEnvironmentPeriodicTCLevel0Access() {
		return pGSSEnvironmentPeriodicTCLevel0;
	}
	
	public ParserRule getGSSEnvironmentPeriodicTCLevel0Rule() {
		return getGSSEnvironmentPeriodicTCLevel0Access().getRule();
	}
	
	//GSSEnvironmentGlobalVar:
	//	'GSSEnvironmentGlobalVar' '{'
	//	'name' ':=' name=STRING ';'
	//	'id' ':=' id=INTEGER ';'
	//	'type' ':=' type=GSSEnvironmentGlobalVarType ';'
	//	'initial_value' ':=' initial_value=INTEGER ';' (referenceField=GSSEnvironmentReferenceField |
	//	referencePeriodicTC=GSSEnvironmentReferencePeriodicTC | referenceSpecialPacket=GSSEnvironmentReferenceSpecialPacket)
	//	'}' ';';
	public GSSEnvironmentGlobalVarElements getGSSEnvironmentGlobalVarAccess() {
		return pGSSEnvironmentGlobalVar;
	}
	
	public ParserRule getGSSEnvironmentGlobalVarRule() {
		return getGSSEnvironmentGlobalVarAccess().getRule();
	}
	
	//enum GSSEnvironmentGlobalVarType:
	//	uint | formula;
	public GSSEnvironmentGlobalVarTypeElements getGSSEnvironmentGlobalVarTypeAccess() {
		return eGSSEnvironmentGlobalVarType;
	}
	
	public EnumRule getGSSEnvironmentGlobalVarTypeRule() {
		return getGSSEnvironmentGlobalVarTypeAccess().getRule();
	}
	
	//GSSEnvironmentReferenceField:
	//	'GSSEnvironmentReferenceField' '{'
	//	'type' ':=' type=GSSEnvironmentReferenceFieldType ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';';
	public GSSEnvironmentReferenceFieldElements getGSSEnvironmentReferenceFieldAccess() {
		return pGSSEnvironmentReferenceField;
	}
	
	public ParserRule getGSSEnvironmentReferenceFieldRule() {
		return getGSSEnvironmentReferenceFieldAccess().getRule();
	}
	
	//GSSEnvironmentReferencePeriodicTC:
	//	'GSSEnvironmentReferencePeriodicTC' '{'
	//	'idRef' ':=' idRef=[GSSEnvironmentPeriodicTC|STRING] ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';';
	public GSSEnvironmentReferencePeriodicTCElements getGSSEnvironmentReferencePeriodicTCAccess() {
		return pGSSEnvironmentReferencePeriodicTC;
	}
	
	public ParserRule getGSSEnvironmentReferencePeriodicTCRule() {
		return getGSSEnvironmentReferencePeriodicTCAccess().getRule();
	}
	
	//GSSEnvironmentReferenceSpecialPacket:
	//	'GSSEnvironmentReferenceSpecialPacket' '{'
	//	'idRef' ':=' idRef=[GSSEnvironmentSpecialPacket|STRING] ';'
	//	'level' ':=' level=INTEGER ';'
	//	'fieldRef' ':=' fieldRef=INTEGER ';'
	//	'offset' ':=' offset=INTEGER ';'
	//	'size' ':=' size=INTEGER ';'
	//	'}' ';';
	public GSSEnvironmentReferenceSpecialPacketElements getGSSEnvironmentReferenceSpecialPacketAccess() {
		return pGSSEnvironmentReferenceSpecialPacket;
	}
	
	public ParserRule getGSSEnvironmentReferenceSpecialPacketRule() {
		return getGSSEnvironmentReferenceSpecialPacketAccess().getRule();
	}
	
	//enum GSSEnvironmentReferenceFieldType:
	//	tm | tc;
	public GSSEnvironmentReferenceFieldTypeElements getGSSEnvironmentReferenceFieldTypeAccess() {
		return eGSSEnvironmentReferenceFieldType;
	}
	
	public EnumRule getGSSEnvironmentReferenceFieldTypeRule() {
		return getGSSEnvironmentReferenceFieldTypeAccess().getRule();
	}
	
	//GSSEnvironmentPlot:
	//	'GSSEnvironmentPlot' '{'
	//	'name' ':=' name=STRING ';'
	//	'chartRef' ':=' chartRef=[charts::GSSChartsChart|VersionedQualifiedReferenceName] ';'
	//	(GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
	//	'}' ';';
	public GSSEnvironmentPlotElements getGSSEnvironmentPlotAccess() {
		return pGSSEnvironmentPlot;
	}
	
	public ParserRule getGSSEnvironmentPlotRule() {
		return getGSSEnvironmentPlotAccess().getRule();
	}
	
	//GSSEnvironmentAlarmMsg:
	//	'GSSEnvironmentAlarmMsg' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSEnvironmentAlarmMsgType ';'
	//	'text' ':=' text=STRING ';' (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
	//	'}' ';';
	public GSSEnvironmentAlarmMsgElements getGSSEnvironmentAlarmMsgAccess() {
		return pGSSEnvironmentAlarmMsg;
	}
	
	public ParserRule getGSSEnvironmentAlarmMsgRule() {
		return getGSSEnvironmentAlarmMsgAccess().getRule();
	}
	
	//GSSEnvironmentModify:
	//	'GSSEnvironmentModify' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSEnvironmentModifyType ';'
	//	'value' ':=' value=INTEGER ';' (GVFiltered=GSSEnvironmentGVFiltered | GVPeriodic=GSSEnvironmentGVPeriodic)
	//	'}' ';';
	public GSSEnvironmentModifyElements getGSSEnvironmentModifyAccess() {
		return pGSSEnvironmentModify;
	}
	
	public ParserRule getGSSEnvironmentModifyRule() {
		return getGSSEnvironmentModifyAccess().getRule();
	}
	
	//GSSEnvironmentAlarmVal:
	//	'GSSEnvironmentAlarmVal' '{'
	//	'name' ':=' name=STRING ';'
	//	'type' ':=' type=GSSEnvironmentAlarmValType ';' (GVFiltered=GSSEnvironmentGVFiltered |
	//	GVPeriodic=GSSEnvironmentGVPeriodic)
	//	'}' ';';
	public GSSEnvironmentAlarmValElements getGSSEnvironmentAlarmValAccess() {
		return pGSSEnvironmentAlarmVal;
	}
	
	public ParserRule getGSSEnvironmentAlarmValRule() {
		return getGSSEnvironmentAlarmValAccess().getRule();
	}
	
	//GSSEnvironmentGVFiltered:
	//	'GSSEnvironmentGVFiltered' '{'
	//	'GlobalVarRef' ':=' GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] ';' ('filter' ':='
	//	filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSEnvironmentGVFilteredElements getGSSEnvironmentGVFilteredAccess() {
		return pGSSEnvironmentGVFiltered;
	}
	
	public ParserRule getGSSEnvironmentGVFilteredRule() {
		return getGSSEnvironmentGVFilteredAccess().getRule();
	}
	
	//GSSEnvironmentGVPeriodic:
	//	'GSSEnvironmentGVPeriodic' '{'
	//	'GlobalVarRef' ':=' GlobalVarRef=[GSSEnvironmentGlobalVar|STRING] ';'
	//	'period_value' ':=' period_value=INTEGER ';'
	//	'period_unit' ':=' period_unit=GSSEnvironmentUnit ';'
	//	'}' ';';
	public GSSEnvironmentGVPeriodicElements getGSSEnvironmentGVPeriodicAccess() {
		return pGSSEnvironmentGVPeriodic;
	}
	
	public ParserRule getGSSEnvironmentGVPeriodicRule() {
		return getGSSEnvironmentGVPeriodicAccess().getRule();
	}
	
	//enum GSSEnvironmentAlarmMsgType:
	//	alarm1 | alarm2 | alarm3;
	public GSSEnvironmentAlarmMsgTypeElements getGSSEnvironmentAlarmMsgTypeAccess() {
		return eGSSEnvironmentAlarmMsgType;
	}
	
	public EnumRule getGSSEnvironmentAlarmMsgTypeRule() {
		return getGSSEnvironmentAlarmMsgTypeAccess().getRule();
	}
	
	//enum GSSEnvironmentModifyType:
	//	increment | increment1wrap;
	public GSSEnvironmentModifyTypeElements getGSSEnvironmentModifyTypeAccess() {
		return eGSSEnvironmentModifyType;
	}
	
	public EnumRule getGSSEnvironmentModifyTypeRule() {
		return getGSSEnvironmentModifyTypeAccess().getRule();
	}
	
	//enum GSSEnvironmentAlarmValType:
	//	alarm1;
	public GSSEnvironmentAlarmValTypeElements getGSSEnvironmentAlarmValTypeAccess() {
		return eGSSEnvironmentAlarmValType;
	}
	
	public EnumRule getGSSEnvironmentAlarmValTypeRule() {
		return getGSSEnvironmentAlarmValTypeAccess().getRule();
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
