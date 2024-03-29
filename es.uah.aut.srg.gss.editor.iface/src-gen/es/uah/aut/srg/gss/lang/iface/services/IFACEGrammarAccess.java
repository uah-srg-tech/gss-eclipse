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
package es.uah.aut.srg.gss.lang.iface.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class IFACEGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSIfacePortConfigParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSIfacePortConfig
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSIfacePortConfig
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSIfacePortConfig
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSIfacePortConfig
		public RuleCall getElementGSSIfacePortConfigParserRuleCall_1_0() { return cElementGSSIfacePortConfigParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSModelFileImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//GSSModelFileImport common::GSSModelFileImport:
		//	'import' importURI=STRING ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importURI=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class GSSIfacePortConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPortConfigKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Assignment cPortConfigAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPortConfigGSSIfacePortParserRuleCall_4_0 = (RuleCall)cPortConfigAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSIfacePortConfig:
		//	'portConfig'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') portConfig=GSSIfacePort
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'portConfig' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') portConfig=GSSIfacePort
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'portConfig'
		public Keyword getPortConfigKeyword_0() { return cPortConfigKeyword_0; }
		
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
		
		//portConfig=GSSIfacePort
		public Assignment getPortConfigAssignment_4() { return cPortConfigAssignment_4; }
		
		//GSSIfacePort
		public RuleCall getPortConfigGSSIfacePortParserRuleCall_4_0() { return cPortConfigGSSIfacePortParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class GSSIfacePortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePort");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSIfaceSpWPortParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSIfaceUartPortParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSIfaceSocketSrvPortParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSIfaceSocketCliPortParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cGSSIfaceSpWTCPortParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cGSSIfaceDummyPortParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//GSSIfacePort:
		//	GSSIfaceSpWPort | GSSIfaceUartPort | GSSIfaceSocketSrvPort | GSSIfaceSocketCliPort | GSSIfaceSpWTCPort |
		//	GSSIfaceDummyPort;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSIfaceSpWPort | GSSIfaceUartPort | GSSIfaceSocketSrvPort | GSSIfaceSocketCliPort | GSSIfaceSpWTCPort |
		//GSSIfaceDummyPort
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSIfaceSpWPort
		public RuleCall getGSSIfaceSpWPortParserRuleCall_0() { return cGSSIfaceSpWPortParserRuleCall_0; }
		
		//GSSIfaceUartPort
		public RuleCall getGSSIfaceUartPortParserRuleCall_1() { return cGSSIfaceUartPortParserRuleCall_1; }
		
		//GSSIfaceSocketSrvPort
		public RuleCall getGSSIfaceSocketSrvPortParserRuleCall_2() { return cGSSIfaceSocketSrvPortParserRuleCall_2; }
		
		//GSSIfaceSocketCliPort
		public RuleCall getGSSIfaceSocketCliPortParserRuleCall_3() { return cGSSIfaceSocketCliPortParserRuleCall_3; }
		
		//GSSIfaceSpWTCPort
		public RuleCall getGSSIfaceSpWTCPortParserRuleCall_4() { return cGSSIfaceSpWTCPortParserRuleCall_4; }
		
		//GSSIfaceDummyPort
		public RuleCall getGSSIfaceDummyPortParserRuleCall_5() { return cGSSIfaceDummyPortParserRuleCall_5; }
	}
	public class GSSIfaceSpWPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpwPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLinkKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLinkAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLinkINTEGERParserRuleCall_8_0 = (RuleCall)cLinkAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cWritingPortKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cWritingPortAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cWritingPortINTEGERParserRuleCall_12_0 = (RuleCall)cWritingPortAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cReadingPortAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cReadingPortGSSIfaceReadingPortParserRuleCall_14_0 = (RuleCall)cReadingPortAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSIfaceSpWPort:
		//	'spwPort' '{'
		//	'type' ':=' type=GSSIfaceSpWPortType ';'
		//	'link' ':=' link=INTEGER ';'
		//	'writingPort' ':=' writingPort=INTEGER ';'
		//	readingPort+=GSSIfaceReadingPort+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'spwPort' '{' 'type' ':=' type=GSSIfaceSpWPortType ';' 'link' ':=' link=INTEGER ';' 'writingPort' ':='
		//writingPort=INTEGER ';' readingPort+=GSSIfaceReadingPort+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'spwPort'
		public Keyword getSpwPortKeyword_0() { return cSpwPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//type=GSSIfaceSpWPortType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//GSSIfaceSpWPortType
		public RuleCall getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0() { return cTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'link'
		public Keyword getLinkKeyword_6() { return cLinkKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//link=INTEGER
		public Assignment getLinkAssignment_8() { return cLinkAssignment_8; }
		
		//INTEGER
		public RuleCall getLinkINTEGERParserRuleCall_8_0() { return cLinkINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'writingPort'
		public Keyword getWritingPortKeyword_10() { return cWritingPortKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//writingPort=INTEGER
		public Assignment getWritingPortAssignment_12() { return cWritingPortAssignment_12; }
		
		//INTEGER
		public RuleCall getWritingPortINTEGERParserRuleCall_12_0() { return cWritingPortINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//readingPort+=GSSIfaceReadingPort+
		public Assignment getReadingPortAssignment_14() { return cReadingPortAssignment_14; }
		
		//GSSIfaceReadingPort
		public RuleCall getReadingPortGSSIfaceReadingPortParserRuleCall_14_0() { return cReadingPortGSSIfaceReadingPortParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSIfaceReadingPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceReadingPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadingPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPortKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPortINTEGERParserRuleCall_4_0 = (RuleCall)cPortAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSIfaceReadingPort:
		//	'readingPort' '{'
		//	'port' ':=' port=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'readingPort' '{' 'port' ':=' port=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'readingPort'
		public Keyword getReadingPortKeyword_0() { return cReadingPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'port'
		public Keyword getPortKeyword_2() { return cPortKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//port=INTEGER
		public Assignment getPortAssignment_4() { return cPortAssignment_4; }
		
		//INTEGER
		public RuleCall getPortINTEGERParserRuleCall_4_0() { return cPortINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSIfaceUartPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUartPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNumberKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNumberAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNumberINTEGERParserRuleCall_4_0 = (RuleCall)cNumberAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBaudRateKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBaudRateAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0 = (RuleCall)cBaudRateAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cParityKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cParityAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cParityGSSIfaceUartPortParityEnumRuleCall_12_0 = (RuleCall)cParityAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cDataBitsKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cDataBitsAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0 = (RuleCall)cDataBitsAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cStopBitsKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cStopBitsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0 = (RuleCall)cStopBitsAssignment_20.eContents().get(0);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cFlowControlKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cColonEqualsSignKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Assignment cFlowControlAssignment_24 = (Assignment)cGroup.eContents().get(24);
		private final RuleCall cFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0 = (RuleCall)cFlowControlAssignment_24.eContents().get(0);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		private final Assignment cPortProtocolAssignment_26 = (Assignment)cGroup.eContents().get(26);
		private final RuleCall cPortProtocolGSSIfacePortProtocolParserRuleCall_26_0 = (RuleCall)cPortProtocolAssignment_26.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Keyword cSemicolonKeyword_28 = (Keyword)cGroup.eContents().get(28);
		
		//GSSIfaceUartPort:
		//	'uartPort' '{'
		//	'number' ':=' number=INTEGER ';'
		//	'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';'
		//	'parity' ':=' parity=GSSIfaceUartPortParity ';'
		//	'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';'
		//	'stopBits' ':=' stopBits=GSSIfaceUartPortStopBits ';'
		//	'flowControl' ':=' flowControl=GSSIfaceUartPortFlowControl ';'
		//	portProtocol=GSSIfacePortProtocol
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'uartPort' '{' 'number' ':=' number=INTEGER ';' 'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';' 'parity' ':='
		//parity=GSSIfaceUartPortParity ';' 'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';' 'stopBits' ':='
		//stopBits=GSSIfaceUartPortStopBits ';' 'flowControl' ':=' flowControl=GSSIfaceUartPortFlowControl ';'
		//portProtocol=GSSIfacePortProtocol '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'uartPort'
		public Keyword getUartPortKeyword_0() { return cUartPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'number'
		public Keyword getNumberKeyword_2() { return cNumberKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//number=INTEGER
		public Assignment getNumberAssignment_4() { return cNumberAssignment_4; }
		
		//INTEGER
		public RuleCall getNumberINTEGERParserRuleCall_4_0() { return cNumberINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'baudRate'
		public Keyword getBaudRateKeyword_6() { return cBaudRateKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//baudRate=GSSIfaceUartPortBaudRate
		public Assignment getBaudRateAssignment_8() { return cBaudRateAssignment_8; }
		
		//GSSIfaceUartPortBaudRate
		public RuleCall getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0() { return cBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'parity'
		public Keyword getParityKeyword_10() { return cParityKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//parity=GSSIfaceUartPortParity
		public Assignment getParityAssignment_12() { return cParityAssignment_12; }
		
		//GSSIfaceUartPortParity
		public RuleCall getParityGSSIfaceUartPortParityEnumRuleCall_12_0() { return cParityGSSIfaceUartPortParityEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'dataBits'
		public Keyword getDataBitsKeyword_14() { return cDataBitsKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//dataBits=GSSIfaceUartPortDataBits
		public Assignment getDataBitsAssignment_16() { return cDataBitsAssignment_16; }
		
		//GSSIfaceUartPortDataBits
		public RuleCall getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0() { return cDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'stopBits'
		public Keyword getStopBitsKeyword_18() { return cStopBitsKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//stopBits=GSSIfaceUartPortStopBits
		public Assignment getStopBitsAssignment_20() { return cStopBitsAssignment_20; }
		
		//GSSIfaceUartPortStopBits
		public RuleCall getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0() { return cStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//'flowControl'
		public Keyword getFlowControlKeyword_22() { return cFlowControlKeyword_22; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23() { return cColonEqualsSignKeyword_23; }
		
		//flowControl=GSSIfaceUartPortFlowControl
		public Assignment getFlowControlAssignment_24() { return cFlowControlAssignment_24; }
		
		//GSSIfaceUartPortFlowControl
		public RuleCall getFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0() { return cFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
		
		//portProtocol=GSSIfacePortProtocol
		public Assignment getPortProtocolAssignment_26() { return cPortProtocolAssignment_26; }
		
		//GSSIfacePortProtocol
		public RuleCall getPortProtocolGSSIfacePortProtocolParserRuleCall_26_0() { return cPortProtocolGSSIfacePortProtocolParserRuleCall_26_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_27() { return cRightCurlyBracketKeyword_27; }
		
		//';'
		public Keyword getSemicolonKeyword_28() { return cSemicolonKeyword_28; }
	}
	public class GSSIfaceSocketSrvPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSocketSrvPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSocketSrvPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPortNumberKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPortNumberAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPortNumberINTEGERParserRuleCall_4_0 = (RuleCall)cPortNumberAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cPortProtocolAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPortProtocolGSSIfacePortProtocolParserRuleCall_6_0 = (RuleCall)cPortProtocolAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSIfaceSocketSrvPort:
		//	'socketSrvPort' '{'
		//	'portNumber' ':=' portNumber=INTEGER ';'
		//	portProtocol=GSSIfacePortProtocol
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'socketSrvPort' '{' 'portNumber' ':=' portNumber=INTEGER ';' portProtocol=GSSIfacePortProtocol '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'socketSrvPort'
		public Keyword getSocketSrvPortKeyword_0() { return cSocketSrvPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'portNumber'
		public Keyword getPortNumberKeyword_2() { return cPortNumberKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//portNumber=INTEGER
		public Assignment getPortNumberAssignment_4() { return cPortNumberAssignment_4; }
		
		//INTEGER
		public RuleCall getPortNumberINTEGERParserRuleCall_4_0() { return cPortNumberINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//portProtocol=GSSIfacePortProtocol
		public Assignment getPortProtocolAssignment_6() { return cPortProtocolAssignment_6; }
		
		//GSSIfacePortProtocol
		public RuleCall getPortProtocolGSSIfacePortProtocolParserRuleCall_6_0() { return cPortProtocolGSSIfacePortProtocolParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSIfaceSocketCliPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSocketCliPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSocketCliPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIpAddressKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIpAddressAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIpAddressSTRINGTerminalRuleCall_4_0 = (RuleCall)cIpAddressAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPortNumberKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPortNumberAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPortNumberINTEGERParserRuleCall_8_0 = (RuleCall)cPortNumberAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cPortProtocolAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cPortProtocolGSSIfacePortProtocolParserRuleCall_10_0 = (RuleCall)cPortProtocolAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSIfaceSocketCliPort:
		//	'socketCliPort' '{'
		//	'ipAddress' ':=' ipAddress=STRING ';'
		//	'portNumber' ':=' portNumber=INTEGER ';'
		//	portProtocol=GSSIfacePortProtocol
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'socketCliPort' '{' 'ipAddress' ':=' ipAddress=STRING ';' 'portNumber' ':=' portNumber=INTEGER ';'
		//portProtocol=GSSIfacePortProtocol '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'socketCliPort'
		public Keyword getSocketCliPortKeyword_0() { return cSocketCliPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'ipAddress'
		public Keyword getIpAddressKeyword_2() { return cIpAddressKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//ipAddress=STRING
		public Assignment getIpAddressAssignment_4() { return cIpAddressAssignment_4; }
		
		//STRING
		public RuleCall getIpAddressSTRINGTerminalRuleCall_4_0() { return cIpAddressSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'portNumber'
		public Keyword getPortNumberKeyword_6() { return cPortNumberKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//portNumber=INTEGER
		public Assignment getPortNumberAssignment_8() { return cPortNumberAssignment_8; }
		
		//INTEGER
		public RuleCall getPortNumberINTEGERParserRuleCall_8_0() { return cPortNumberINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//portProtocol=GSSIfacePortProtocol
		public Assignment getPortProtocolAssignment_10() { return cPortProtocolAssignment_10; }
		
		//GSSIfacePortProtocol
		public RuleCall getPortProtocolGSSIfacePortProtocolParserRuleCall_10_0() { return cPortProtocolGSSIfacePortProtocolParserRuleCall_10_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSIfacePortProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPortProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cUnitKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUnitAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0 = (RuleCall)cUnitAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPowerKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPowerAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0 = (RuleCall)cPowerAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cConstSizeAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cConstSizeGSSIfaceConstSizeParserRuleCall_10_0 = (RuleCall)cConstSizeAssignment_10.eContents().get(0);
		private final Assignment cSizeFieldOffsetAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0 = (RuleCall)cSizeFieldOffsetAssignment_11.eContents().get(0);
		private final Assignment cSizeFieldTrimAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0 = (RuleCall)cSizeFieldTrimAssignment_12.eContents().get(0);
		private final Assignment cSyncPatternAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0 = (RuleCall)cSyncPatternAssignment_13.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSIfacePortProtocol:
		//	'portProtocol' '{'
		//	'unit' ':=' unit=GSSIfacePortProtocolUnit ';'
		//	'power' ':=' power=GSSIfacePortProtocolPower ';'
		//	constSize=GSSIfaceConstSize
		//	sizeFieldOffset=GSSIfaceSizeFieldOffset
		//	sizeFieldTrim=GSSIfaceSizeFieldTrim
		//	syncPattern=GSSIfaceSyncPattern?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'portProtocol' '{' 'unit' ':=' unit=GSSIfacePortProtocolUnit ';' 'power' ':=' power=GSSIfacePortProtocolPower ';'
		//constSize=GSSIfaceConstSize sizeFieldOffset=GSSIfaceSizeFieldOffset sizeFieldTrim=GSSIfaceSizeFieldTrim
		//syncPattern=GSSIfaceSyncPattern? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'portProtocol'
		public Keyword getPortProtocolKeyword_0() { return cPortProtocolKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'unit'
		public Keyword getUnitKeyword_2() { return cUnitKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//unit=GSSIfacePortProtocolUnit
		public Assignment getUnitAssignment_4() { return cUnitAssignment_4; }
		
		//GSSIfacePortProtocolUnit
		public RuleCall getUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0() { return cUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'power'
		public Keyword getPowerKeyword_6() { return cPowerKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//power=GSSIfacePortProtocolPower
		public Assignment getPowerAssignment_8() { return cPowerAssignment_8; }
		
		//GSSIfacePortProtocolPower
		public RuleCall getPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0() { return cPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//constSize=GSSIfaceConstSize
		public Assignment getConstSizeAssignment_10() { return cConstSizeAssignment_10; }
		
		//GSSIfaceConstSize
		public RuleCall getConstSizeGSSIfaceConstSizeParserRuleCall_10_0() { return cConstSizeGSSIfaceConstSizeParserRuleCall_10_0; }
		
		//sizeFieldOffset=GSSIfaceSizeFieldOffset
		public Assignment getSizeFieldOffsetAssignment_11() { return cSizeFieldOffsetAssignment_11; }
		
		//GSSIfaceSizeFieldOffset
		public RuleCall getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0() { return cSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0; }
		
		//sizeFieldTrim=GSSIfaceSizeFieldTrim
		public Assignment getSizeFieldTrimAssignment_12() { return cSizeFieldTrimAssignment_12; }
		
		//GSSIfaceSizeFieldTrim
		public RuleCall getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0() { return cSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0; }
		
		//syncPattern=GSSIfaceSyncPattern?
		public Assignment getSyncPatternAssignment_13() { return cSyncPatternAssignment_13; }
		
		//GSSIfaceSyncPattern
		public RuleCall getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0() { return cSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSIfaceConstSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceConstSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConstSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSIfaceConstSize GSSIfaceSize:
		//	'constSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'constSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'constSize'
		public Keyword getConstSizeKeyword_0() { return cConstSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSIfaceSizeFieldOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSizeFieldOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSIfaceSizeFieldOffset GSSIfaceSize:
		//	'sizeFieldOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'sizeFieldOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'sizeFieldOffset'
		public Keyword getSizeFieldOffsetKeyword_0() { return cSizeFieldOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSIfaceSizeFieldTrimElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldTrim");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSizeFieldTrimKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSIfaceSizeFieldTrim GSSIfaceSize:
		//	'sizeFieldTrim' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'sizeFieldTrim' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'sizeFieldTrim'
		public Keyword getSizeFieldTrimKeyword_0() { return cSizeFieldTrimKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSIfaceSyncPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSyncPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSyncPatternKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cHexValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cHexValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHexValueHEXADECIMALTerminalRuleCall_4_0 = (RuleCall)cHexValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSIfaceSyncPattern:
		//	'syncPattern' '{'
		//	'hexValue' ':=' hexValue=HEXADECIMAL ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'syncPattern' '{' 'hexValue' ':=' hexValue=HEXADECIMAL ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'syncPattern'
		public Keyword getSyncPatternKeyword_0() { return cSyncPatternKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'hexValue'
		public Keyword getHexValueKeyword_2() { return cHexValueKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//hexValue=HEXADECIMAL
		public Assignment getHexValueAssignment_4() { return cHexValueAssignment_4; }
		
		//HEXADECIMAL
		public RuleCall getHexValueHEXADECIMALTerminalRuleCall_4_0() { return cHexValueHEXADECIMALTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSIfaceSpWTCPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWTCPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpwTCPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSpwPortRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSpwPortRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSpwPortRefINTEGERParserRuleCall_4_0 = (RuleCall)cSpwPortRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSIfaceSpWTCPort:
		//	'spwTCPort' '{'
		//	'spwPortRef' ':=' spwPortRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'spwTCPort' '{' 'spwPortRef' ':=' spwPortRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'spwTCPort'
		public Keyword getSpwTCPortKeyword_0() { return cSpwTCPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'spwPortRef'
		public Keyword getSpwPortRefKeyword_2() { return cSpwPortRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//spwPortRef=INTEGER
		public Assignment getSpwPortRefAssignment_4() { return cSpwPortRefAssignment_4; }
		
		//INTEGER
		public RuleCall getSpwPortRefINTEGERParserRuleCall_4_0() { return cSpwPortRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSIfaceDummyPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceDummyPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSIfaceDummyPortAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDummyPortKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceDummyPort:
		//	{GSSIfaceDummyPort}
		//	'dummyPort' '{'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSIfaceDummyPort} 'dummyPort' '{' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSIfaceDummyPort}
		public Action getGSSIfaceDummyPortAction_0() { return cGSSIfaceDummyPortAction_0; }
		
		//'dummyPort'
		public Keyword getDummyPortKeyword_1() { return cDummyPortKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.EBoolean");
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
	
	public class GSSIfaceSpWPortTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWPortType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUsbEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUsbUsbKeyword_0_0 = (Keyword)cUsbEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMk2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMk2Mk2Keyword_1_0 = (Keyword)cMk2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cPciEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cPciPciKeyword_2_0 = (Keyword)cPciEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSIfaceSpWPortType:
		//	usb | mk2 |
		//	pci;
		public EnumRule getRule() { return rule; }
		
		//usb | mk2 | pci
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//usb
		public EnumLiteralDeclaration getUsbEnumLiteralDeclaration_0() { return cUsbEnumLiteralDeclaration_0; }
		
		//'usb'
		public Keyword getUsbUsbKeyword_0_0() { return cUsbUsbKeyword_0_0; }
		
		//mk2
		public EnumLiteralDeclaration getMk2EnumLiteralDeclaration_1() { return cMk2EnumLiteralDeclaration_1; }
		
		//'mk2'
		public Keyword getMk2Mk2Keyword_1_0() { return cMk2Mk2Keyword_1_0; }
		
		//pci
		public EnumLiteralDeclaration getPciEnumLiteralDeclaration_2() { return cPciEnumLiteralDeclaration_2; }
		
		//'pci'
		public Keyword getPciPciKeyword_2_0() { return cPciPciKeyword_2_0; }
	}
	public class GSSIfaceUartPortBaudRateElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortBaudRate");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_38400EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_3840038400baudsKeyword_0_0 = (Keyword)c_38400EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_115200EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_115200115200baudsKeyword_1_0 = (Keyword)c_115200EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSIfaceUartPortBaudRate:
		//	_38400='38400bauds' | _115200='115200bauds';
		public EnumRule getRule() { return rule; }
		
		//_38400='38400bauds' | _115200='115200bauds'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_38400='38400bauds'
		public EnumLiteralDeclaration get_38400EnumLiteralDeclaration_0() { return c_38400EnumLiteralDeclaration_0; }
		
		//'38400bauds'
		public Keyword get_3840038400baudsKeyword_0_0() { return c_3840038400baudsKeyword_0_0; }
		
		//_115200='115200bauds'
		public EnumLiteralDeclaration get_115200EnumLiteralDeclaration_1() { return c_115200EnumLiteralDeclaration_1; }
		
		//'115200bauds'
		public Keyword get_115200115200baudsKeyword_1_0() { return c_115200115200baudsKeyword_1_0; }
	}
	public class GSSIfaceUartPortParityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortParity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNOEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNONOKeyword_0_0 = (Keyword)cNOEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cODDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cODDODDKeyword_1_0 = (Keyword)cODDEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEVENEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEVENEVENKeyword_2_0 = (Keyword)cEVENEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cMARKEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cMARKMARKKeyword_3_0 = (Keyword)cMARKEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cSPACEEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cSPACESPACEKeyword_4_0 = (Keyword)cSPACEEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum GSSIfaceUartPortParity:
		//	NO | ODD | EVEN |
		//	MARK | SPACE;
		public EnumRule getRule() { return rule; }
		
		//NO | ODD | EVEN | MARK | SPACE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NO
		public EnumLiteralDeclaration getNOEnumLiteralDeclaration_0() { return cNOEnumLiteralDeclaration_0; }
		
		//'NO'
		public Keyword getNONOKeyword_0_0() { return cNONOKeyword_0_0; }
		
		//ODD
		public EnumLiteralDeclaration getODDEnumLiteralDeclaration_1() { return cODDEnumLiteralDeclaration_1; }
		
		//'ODD'
		public Keyword getODDODDKeyword_1_0() { return cODDODDKeyword_1_0; }
		
		//EVEN
		public EnumLiteralDeclaration getEVENEnumLiteralDeclaration_2() { return cEVENEnumLiteralDeclaration_2; }
		
		//'EVEN'
		public Keyword getEVENEVENKeyword_2_0() { return cEVENEVENKeyword_2_0; }
		
		//MARK
		public EnumLiteralDeclaration getMARKEnumLiteralDeclaration_3() { return cMARKEnumLiteralDeclaration_3; }
		
		//'MARK'
		public Keyword getMARKMARKKeyword_3_0() { return cMARKMARKKeyword_3_0; }
		
		//SPACE
		public EnumLiteralDeclaration getSPACEEnumLiteralDeclaration_4() { return cSPACEEnumLiteralDeclaration_4; }
		
		//'SPACE'
		public Keyword getSPACESPACEKeyword_4_0() { return cSPACESPACEKeyword_4_0; }
	}
	public class GSSIfaceUartPortDataBitsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortDataBits");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_5EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_55bitsKeyword_0_0 = (Keyword)c_5EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_6EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_66bitsKeyword_1_0 = (Keyword)c_6EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration c_7EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword c_77bitsKeyword_2_0 = (Keyword)c_7EnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration c_8EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword c_88bitsKeyword_3_0 = (Keyword)c_8EnumLiteralDeclaration_3.eContents().get(0);
		
		//enum GSSIfaceUartPortDataBits:
		//	_5='5bits' | _6='6bits' |
		//	_7='7bits' | _8='8bits';
		public EnumRule getRule() { return rule; }
		
		//_5='5bits' | _6='6bits' | _7='7bits' | _8='8bits'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_5='5bits'
		public EnumLiteralDeclaration get_5EnumLiteralDeclaration_0() { return c_5EnumLiteralDeclaration_0; }
		
		//'5bits'
		public Keyword get_55bitsKeyword_0_0() { return c_55bitsKeyword_0_0; }
		
		//_6='6bits'
		public EnumLiteralDeclaration get_6EnumLiteralDeclaration_1() { return c_6EnumLiteralDeclaration_1; }
		
		//'6bits'
		public Keyword get_66bitsKeyword_1_0() { return c_66bitsKeyword_1_0; }
		
		//_7='7bits'
		public EnumLiteralDeclaration get_7EnumLiteralDeclaration_2() { return c_7EnumLiteralDeclaration_2; }
		
		//'7bits'
		public Keyword get_77bitsKeyword_2_0() { return c_77bitsKeyword_2_0; }
		
		//_8='8bits'
		public EnumLiteralDeclaration get_8EnumLiteralDeclaration_3() { return c_8EnumLiteralDeclaration_3; }
		
		//'8bits'
		public Keyword get_88bitsKeyword_3_0() { return c_88bitsKeyword_3_0; }
	}
	public class GSSIfaceUartPortStopBitsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortStopBits");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_11bitKeyword_0_0 = (Keyword)c_1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_22bitsKeyword_1_0 = (Keyword)c_2EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSIfaceUartPortStopBits:
		//	_1='1bit' | _2='2bits';
		public EnumRule getRule() { return rule; }
		
		//_1='1bit' | _2='2bits'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_1='1bit'
		public EnumLiteralDeclaration get_1EnumLiteralDeclaration_0() { return c_1EnumLiteralDeclaration_0; }
		
		//'1bit'
		public Keyword get_11bitKeyword_0_0() { return c_11bitKeyword_0_0; }
		
		//_2='2bits'
		public EnumLiteralDeclaration get_2EnumLiteralDeclaration_1() { return c_2EnumLiteralDeclaration_1; }
		
		//'2bits'
		public Keyword get_22bitsKeyword_1_0() { return c_22bitsKeyword_1_0; }
	}
	public class GSSIfaceUartPortFlowControlElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortFlowControl");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cRts_ctsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cRts_ctsRts_ctsKeyword_0_0 = (Keyword)cRts_ctsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cXon_xoffEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cXon_xoffXon_xoffKeyword_1_0 = (Keyword)cXon_xoffEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSIfaceUartPortFlowControl:
		//	rts_cts | xon_xoff;
		public EnumRule getRule() { return rule; }
		
		//rts_cts | xon_xoff
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//rts_cts
		public EnumLiteralDeclaration getRts_ctsEnumLiteralDeclaration_0() { return cRts_ctsEnumLiteralDeclaration_0; }
		
		//'rts_cts'
		public Keyword getRts_ctsRts_ctsKeyword_0_0() { return cRts_ctsRts_ctsKeyword_0_0; }
		
		//xon_xoff
		public EnumLiteralDeclaration getXon_xoffEnumLiteralDeclaration_1() { return cXon_xoffEnumLiteralDeclaration_1; }
		
		//'xon_xoff'
		public Keyword getXon_xoffXon_xoffKeyword_1_0() { return cXon_xoffXon_xoffKeyword_1_0; }
	}
	public class GSSIfacePortProtocolUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocolUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBytesBytesKeyword_0_0 = (Keyword)cBytesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBitsBitsKeyword_1_0 = (Keyword)cBitsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSIfacePortProtocolUnit:
		//	bytes | bits;
		public EnumRule getRule() { return rule; }
		
		//bytes | bits
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//bytes
		public EnumLiteralDeclaration getBytesEnumLiteralDeclaration_0() { return cBytesEnumLiteralDeclaration_0; }
		
		//'bytes'
		public Keyword getBytesBytesKeyword_0_0() { return cBytesBytesKeyword_0_0; }
		
		//bits
		public EnumLiteralDeclaration getBitsEnumLiteralDeclaration_1() { return cBitsEnumLiteralDeclaration_1; }
		
		//'bits'
		public Keyword getBitsBitsKeyword_1_0() { return cBitsBitsKeyword_1_0; }
	}
	public class GSSIfacePortProtocolPowerElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocolPower");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNoEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNoNoKeyword_0_0 = (Keyword)cNoEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_22bitsKeyword_1_0 = (Keyword)c_2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration c_2_with_0EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword c_2_with_02_with_0Keyword_2_0 = (Keyword)c_2_with_0EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSIfacePortProtocolPower:
		//	no | _2='2bits' | _2_with_0='2_with_0';
		public EnumRule getRule() { return rule; }
		
		//no | _2='2bits' | _2_with_0='2_with_0'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//no
		public EnumLiteralDeclaration getNoEnumLiteralDeclaration_0() { return cNoEnumLiteralDeclaration_0; }
		
		//'no'
		public Keyword getNoNoKeyword_0_0() { return cNoNoKeyword_0_0; }
		
		//_2='2bits'
		public EnumLiteralDeclaration get_2EnumLiteralDeclaration_1() { return c_2EnumLiteralDeclaration_1; }
		
		//'2bits'
		public Keyword get_22bitsKeyword_1_0() { return c_22bitsKeyword_1_0; }
		
		//_2_with_0='2_with_0'
		public EnumLiteralDeclaration get_2_with_0EnumLiteralDeclaration_2() { return c_2_with_0EnumLiteralDeclaration_2; }
		
		//'2_with_0'
		public Keyword get_2_with_02_with_0Keyword_2_0() { return c_2_with_02_with_0Keyword_2_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSIfacePortConfigElements pGSSIfacePortConfig;
	private final GSSIfacePortElements pGSSIfacePort;
	private final GSSIfaceSpWPortElements pGSSIfaceSpWPort;
	private final GSSIfaceReadingPortElements pGSSIfaceReadingPort;
	private final GSSIfaceSpWPortTypeElements eGSSIfaceSpWPortType;
	private final GSSIfaceUartPortElements pGSSIfaceUartPort;
	private final GSSIfaceUartPortBaudRateElements eGSSIfaceUartPortBaudRate;
	private final GSSIfaceUartPortParityElements eGSSIfaceUartPortParity;
	private final GSSIfaceUartPortDataBitsElements eGSSIfaceUartPortDataBits;
	private final GSSIfaceUartPortStopBitsElements eGSSIfaceUartPortStopBits;
	private final GSSIfaceSocketSrvPortElements pGSSIfaceSocketSrvPort;
	private final GSSIfaceSocketCliPortElements pGSSIfaceSocketCliPort;
	private final GSSIfaceUartPortFlowControlElements eGSSIfaceUartPortFlowControl;
	private final GSSIfacePortProtocolElements pGSSIfacePortProtocol;
	private final GSSIfaceConstSizeElements pGSSIfaceConstSize;
	private final GSSIfaceSizeFieldOffsetElements pGSSIfaceSizeFieldOffset;
	private final GSSIfaceSizeFieldTrimElements pGSSIfaceSizeFieldTrim;
	private final GSSIfaceSyncPatternElements pGSSIfaceSyncPattern;
	private final GSSIfacePortProtocolUnitElements eGSSIfacePortProtocolUnit;
	private final GSSIfacePortProtocolPowerElements eGSSIfacePortProtocolPower;
	private final GSSIfaceSpWTCPortElements pGSSIfaceSpWTCPort;
	private final GSSIfaceDummyPortElements pGSSIfaceDummyPort;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final EBooleanElements pEBoolean;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IFACEGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSIfacePortConfig = new GSSIfacePortConfigElements();
		this.pGSSIfacePort = new GSSIfacePortElements();
		this.pGSSIfaceSpWPort = new GSSIfaceSpWPortElements();
		this.pGSSIfaceReadingPort = new GSSIfaceReadingPortElements();
		this.eGSSIfaceSpWPortType = new GSSIfaceSpWPortTypeElements();
		this.pGSSIfaceUartPort = new GSSIfaceUartPortElements();
		this.eGSSIfaceUartPortBaudRate = new GSSIfaceUartPortBaudRateElements();
		this.eGSSIfaceUartPortParity = new GSSIfaceUartPortParityElements();
		this.eGSSIfaceUartPortDataBits = new GSSIfaceUartPortDataBitsElements();
		this.eGSSIfaceUartPortStopBits = new GSSIfaceUartPortStopBitsElements();
		this.pGSSIfaceSocketSrvPort = new GSSIfaceSocketSrvPortElements();
		this.pGSSIfaceSocketCliPort = new GSSIfaceSocketCliPortElements();
		this.eGSSIfaceUartPortFlowControl = new GSSIfaceUartPortFlowControlElements();
		this.pGSSIfacePortProtocol = new GSSIfacePortProtocolElements();
		this.pGSSIfaceConstSize = new GSSIfaceConstSizeElements();
		this.pGSSIfaceSizeFieldOffset = new GSSIfaceSizeFieldOffsetElements();
		this.pGSSIfaceSizeFieldTrim = new GSSIfaceSizeFieldTrimElements();
		this.pGSSIfaceSyncPattern = new GSSIfaceSyncPatternElements();
		this.eGSSIfacePortProtocolUnit = new GSSIfacePortProtocolUnitElements();
		this.eGSSIfacePortProtocolPower = new GSSIfacePortProtocolPowerElements();
		this.pGSSIfaceSpWTCPort = new GSSIfaceSpWTCPortElements();
		this.pGSSIfaceDummyPort = new GSSIfaceDummyPortElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.iface.IFACE".equals(grammar.getName())) {
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
	//	element=GSSIfacePortConfig
	public GSSModelFileElements getGSSModelFileAccess() {
		return pGSSModelFile;
	}
	
	public ParserRule getGSSModelFileRule() {
		return getGSSModelFileAccess().getRule();
	}
	
	//GSSModelFileImport common::GSSModelFileImport:
	//	'import' importURI=STRING ';'
	public GSSModelFileImportElements getGSSModelFileImportAccess() {
		return pGSSModelFileImport;
	}
	
	public ParserRule getGSSModelFileImportRule() {
		return getGSSModelFileImportAccess().getRule();
	}
	
	//GSSIfacePortConfig:
	//	'portConfig'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') portConfig=GSSIfacePort
	//	'}' ';';
	public GSSIfacePortConfigElements getGSSIfacePortConfigAccess() {
		return pGSSIfacePortConfig;
	}
	
	public ParserRule getGSSIfacePortConfigRule() {
		return getGSSIfacePortConfigAccess().getRule();
	}
	
	//GSSIfacePort:
	//	GSSIfaceSpWPort | GSSIfaceUartPort | GSSIfaceSocketSrvPort | GSSIfaceSocketCliPort | GSSIfaceSpWTCPort |
	//	GSSIfaceDummyPort;
	public GSSIfacePortElements getGSSIfacePortAccess() {
		return pGSSIfacePort;
	}
	
	public ParserRule getGSSIfacePortRule() {
		return getGSSIfacePortAccess().getRule();
	}
	
	//GSSIfaceSpWPort:
	//	'spwPort' '{'
	//	'type' ':=' type=GSSIfaceSpWPortType ';'
	//	'link' ':=' link=INTEGER ';'
	//	'writingPort' ':=' writingPort=INTEGER ';'
	//	readingPort+=GSSIfaceReadingPort+
	//	'}' ';';
	public GSSIfaceSpWPortElements getGSSIfaceSpWPortAccess() {
		return pGSSIfaceSpWPort;
	}
	
	public ParserRule getGSSIfaceSpWPortRule() {
		return getGSSIfaceSpWPortAccess().getRule();
	}
	
	//GSSIfaceReadingPort:
	//	'readingPort' '{'
	//	'port' ':=' port=INTEGER ';'
	//	'}' ';';
	public GSSIfaceReadingPortElements getGSSIfaceReadingPortAccess() {
		return pGSSIfaceReadingPort;
	}
	
	public ParserRule getGSSIfaceReadingPortRule() {
		return getGSSIfaceReadingPortAccess().getRule();
	}
	
	//enum GSSIfaceSpWPortType:
	//	usb | mk2 |
	//	pci;
	public GSSIfaceSpWPortTypeElements getGSSIfaceSpWPortTypeAccess() {
		return eGSSIfaceSpWPortType;
	}
	
	public EnumRule getGSSIfaceSpWPortTypeRule() {
		return getGSSIfaceSpWPortTypeAccess().getRule();
	}
	
	//GSSIfaceUartPort:
	//	'uartPort' '{'
	//	'number' ':=' number=INTEGER ';'
	//	'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';'
	//	'parity' ':=' parity=GSSIfaceUartPortParity ';'
	//	'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';'
	//	'stopBits' ':=' stopBits=GSSIfaceUartPortStopBits ';'
	//	'flowControl' ':=' flowControl=GSSIfaceUartPortFlowControl ';'
	//	portProtocol=GSSIfacePortProtocol
	//	'}' ';';
	public GSSIfaceUartPortElements getGSSIfaceUartPortAccess() {
		return pGSSIfaceUartPort;
	}
	
	public ParserRule getGSSIfaceUartPortRule() {
		return getGSSIfaceUartPortAccess().getRule();
	}
	
	//enum GSSIfaceUartPortBaudRate:
	//	_38400='38400bauds' | _115200='115200bauds';
	public GSSIfaceUartPortBaudRateElements getGSSIfaceUartPortBaudRateAccess() {
		return eGSSIfaceUartPortBaudRate;
	}
	
	public EnumRule getGSSIfaceUartPortBaudRateRule() {
		return getGSSIfaceUartPortBaudRateAccess().getRule();
	}
	
	//enum GSSIfaceUartPortParity:
	//	NO | ODD | EVEN |
	//	MARK | SPACE;
	public GSSIfaceUartPortParityElements getGSSIfaceUartPortParityAccess() {
		return eGSSIfaceUartPortParity;
	}
	
	public EnumRule getGSSIfaceUartPortParityRule() {
		return getGSSIfaceUartPortParityAccess().getRule();
	}
	
	//enum GSSIfaceUartPortDataBits:
	//	_5='5bits' | _6='6bits' |
	//	_7='7bits' | _8='8bits';
	public GSSIfaceUartPortDataBitsElements getGSSIfaceUartPortDataBitsAccess() {
		return eGSSIfaceUartPortDataBits;
	}
	
	public EnumRule getGSSIfaceUartPortDataBitsRule() {
		return getGSSIfaceUartPortDataBitsAccess().getRule();
	}
	
	//enum GSSIfaceUartPortStopBits:
	//	_1='1bit' | _2='2bits';
	public GSSIfaceUartPortStopBitsElements getGSSIfaceUartPortStopBitsAccess() {
		return eGSSIfaceUartPortStopBits;
	}
	
	public EnumRule getGSSIfaceUartPortStopBitsRule() {
		return getGSSIfaceUartPortStopBitsAccess().getRule();
	}
	
	//GSSIfaceSocketSrvPort:
	//	'socketSrvPort' '{'
	//	'portNumber' ':=' portNumber=INTEGER ';'
	//	portProtocol=GSSIfacePortProtocol
	//	'}' ';';
	public GSSIfaceSocketSrvPortElements getGSSIfaceSocketSrvPortAccess() {
		return pGSSIfaceSocketSrvPort;
	}
	
	public ParserRule getGSSIfaceSocketSrvPortRule() {
		return getGSSIfaceSocketSrvPortAccess().getRule();
	}
	
	//GSSIfaceSocketCliPort:
	//	'socketCliPort' '{'
	//	'ipAddress' ':=' ipAddress=STRING ';'
	//	'portNumber' ':=' portNumber=INTEGER ';'
	//	portProtocol=GSSIfacePortProtocol
	//	'}' ';';
	public GSSIfaceSocketCliPortElements getGSSIfaceSocketCliPortAccess() {
		return pGSSIfaceSocketCliPort;
	}
	
	public ParserRule getGSSIfaceSocketCliPortRule() {
		return getGSSIfaceSocketCliPortAccess().getRule();
	}
	
	//enum GSSIfaceUartPortFlowControl:
	//	rts_cts | xon_xoff;
	public GSSIfaceUartPortFlowControlElements getGSSIfaceUartPortFlowControlAccess() {
		return eGSSIfaceUartPortFlowControl;
	}
	
	public EnumRule getGSSIfaceUartPortFlowControlRule() {
		return getGSSIfaceUartPortFlowControlAccess().getRule();
	}
	
	//GSSIfacePortProtocol:
	//	'portProtocol' '{'
	//	'unit' ':=' unit=GSSIfacePortProtocolUnit ';'
	//	'power' ':=' power=GSSIfacePortProtocolPower ';'
	//	constSize=GSSIfaceConstSize
	//	sizeFieldOffset=GSSIfaceSizeFieldOffset
	//	sizeFieldTrim=GSSIfaceSizeFieldTrim
	//	syncPattern=GSSIfaceSyncPattern?
	//	'}' ';';
	public GSSIfacePortProtocolElements getGSSIfacePortProtocolAccess() {
		return pGSSIfacePortProtocol;
	}
	
	public ParserRule getGSSIfacePortProtocolRule() {
		return getGSSIfacePortProtocolAccess().getRule();
	}
	
	//GSSIfaceConstSize GSSIfaceSize:
	//	'constSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSIfaceConstSizeElements getGSSIfaceConstSizeAccess() {
		return pGSSIfaceConstSize;
	}
	
	public ParserRule getGSSIfaceConstSizeRule() {
		return getGSSIfaceConstSizeAccess().getRule();
	}
	
	//GSSIfaceSizeFieldOffset GSSIfaceSize:
	//	'sizeFieldOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSIfaceSizeFieldOffsetElements getGSSIfaceSizeFieldOffsetAccess() {
		return pGSSIfaceSizeFieldOffset;
	}
	
	public ParserRule getGSSIfaceSizeFieldOffsetRule() {
		return getGSSIfaceSizeFieldOffsetAccess().getRule();
	}
	
	//GSSIfaceSizeFieldTrim GSSIfaceSize:
	//	'sizeFieldTrim' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSIfaceSizeFieldTrimElements getGSSIfaceSizeFieldTrimAccess() {
		return pGSSIfaceSizeFieldTrim;
	}
	
	public ParserRule getGSSIfaceSizeFieldTrimRule() {
		return getGSSIfaceSizeFieldTrimAccess().getRule();
	}
	
	//GSSIfaceSyncPattern:
	//	'syncPattern' '{'
	//	'hexValue' ':=' hexValue=HEXADECIMAL ';'
	//	'}' ';';
	public GSSIfaceSyncPatternElements getGSSIfaceSyncPatternAccess() {
		return pGSSIfaceSyncPattern;
	}
	
	public ParserRule getGSSIfaceSyncPatternRule() {
		return getGSSIfaceSyncPatternAccess().getRule();
	}
	
	//enum GSSIfacePortProtocolUnit:
	//	bytes | bits;
	public GSSIfacePortProtocolUnitElements getGSSIfacePortProtocolUnitAccess() {
		return eGSSIfacePortProtocolUnit;
	}
	
	public EnumRule getGSSIfacePortProtocolUnitRule() {
		return getGSSIfacePortProtocolUnitAccess().getRule();
	}
	
	//enum GSSIfacePortProtocolPower:
	//	no | _2='2bits' | _2_with_0='2_with_0';
	public GSSIfacePortProtocolPowerElements getGSSIfacePortProtocolPowerAccess() {
		return eGSSIfacePortProtocolPower;
	}
	
	public EnumRule getGSSIfacePortProtocolPowerRule() {
		return getGSSIfacePortProtocolPowerAccess().getRule();
	}
	
	//GSSIfaceSpWTCPort:
	//	'spwTCPort' '{'
	//	'spwPortRef' ':=' spwPortRef=INTEGER ';'
	//	'}' ';';
	public GSSIfaceSpWTCPortElements getGSSIfaceSpWTCPortAccess() {
		return pGSSIfaceSpWTCPort;
	}
	
	public ParserRule getGSSIfaceSpWTCPortRule() {
		return getGSSIfaceSpWTCPortAccess().getRule();
	}
	
	//GSSIfaceDummyPort:
	//	{GSSIfaceDummyPort}
	//	'dummyPort' '{'
	//	'}' ';';
	public GSSIfaceDummyPortElements getGSSIfaceDummyPortAccess() {
		return pGSSIfaceDummyPort;
	}
	
	public ParserRule getGSSIfaceDummyPortRule() {
		return getGSSIfaceDummyPortAccess().getRule();
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
