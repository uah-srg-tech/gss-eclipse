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
		private final Assignment cPortAssignment_3_2 = (Assignment)cUnorderedGroup_3.eContents().get(2);
		private final RuleCall cPortGSSIfacePortParserRuleCall_3_2_0 = (RuleCall)cPortAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSIfacePortConfig:
		//	'portConfig'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & port=GSSIfacePort)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'portConfig' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & port=GSSIfacePort) '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//'portConfig'
		public Keyword getPortConfigKeyword_0() { return cPortConfigKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & port=GSSIfacePort)
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
		
		//port=GSSIfacePort
		public Assignment getPortAssignment_3_2() { return cPortAssignment_3_2; }
		
		//GSSIfacePort
		public RuleCall getPortGSSIfacePortParserRuleCall_3_2_0() { return cPortGSSIfacePortParserRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSIfacePortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePort");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSIfaceSpWPortParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSIfaceUartPortParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSIfaceSpWTCPortParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSIfaceDummyPortParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//GSSIfacePort:
		//	GSSIfaceSpWPort | GSSIfaceUartPort | GSSIfaceSpWTCPort | GSSIfaceDummyPort;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSIfaceSpWPort | GSSIfaceUartPort | GSSIfaceSpWTCPort | GSSIfaceDummyPort
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSIfaceSpWPort
		public RuleCall getGSSIfaceSpWPortParserRuleCall_0() { return cGSSIfaceSpWPortParserRuleCall_0; }
		
		//GSSIfaceUartPort
		public RuleCall getGSSIfaceUartPortParserRuleCall_1() { return cGSSIfaceUartPortParserRuleCall_1; }
		
		//GSSIfaceSpWTCPort
		public RuleCall getGSSIfaceSpWTCPortParserRuleCall_2() { return cGSSIfaceSpWTCPortParserRuleCall_2; }
		
		//GSSIfaceDummyPort
		public RuleCall getGSSIfaceDummyPortParserRuleCall_3() { return cGSSIfaceDummyPortParserRuleCall_3; }
	}
	public class GSSIfaceSpWPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpwPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cTypeKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cTypeAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0 = (RuleCall)cTypeAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cLinkKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cLinkAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cLinkINTEGERParserRuleCall_2_1_2_0 = (RuleCall)cLinkAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Group cGroup_2_2 = (Group)cUnorderedGroup_2.eContents().get(2);
		private final Keyword cWritingPortKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_2_1 = (Keyword)cGroup_2_2.eContents().get(1);
		private final Assignment cWritingPortAssignment_2_2_2 = (Assignment)cGroup_2_2.eContents().get(2);
		private final RuleCall cWritingPortINTEGERParserRuleCall_2_2_2_0 = (RuleCall)cWritingPortAssignment_2_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_2_3 = (Keyword)cGroup_2_2.eContents().get(3);
		private final Assignment cReadingPortAssignment_2_3 = (Assignment)cUnorderedGroup_2.eContents().get(3);
		private final RuleCall cReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0 = (RuleCall)cReadingPortAssignment_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceSpWPort:
		//	'spwPort' '{' ('type' ':=' type=GSSIfaceSpWPortType ';' & 'link' ':=' link=INTEGER ';' & 'writingPort' ':='
		//	writingPort=INTEGER ';' & readingPort+=GSSIfaceReadingPort*)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'spwPort' '{' ('type' ':=' type=GSSIfaceSpWPortType ';' & 'link' ':=' link=INTEGER ';' & 'writingPort' ':='
		//writingPort=INTEGER ';' & readingPort+=GSSIfaceReadingPort*) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'spwPort'
		public Keyword getSpwPortKeyword_0() { return cSpwPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('type' ':=' type=GSSIfaceSpWPortType ';' & 'link' ':=' link=INTEGER ';' & 'writingPort' ':=' writingPort=INTEGER ';' &
		//readingPort+=GSSIfaceReadingPort*)
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'type' ':=' type=GSSIfaceSpWPortType ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'type'
		public Keyword getTypeKeyword_2_0_0() { return cTypeKeyword_2_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_0_1() { return cColonEqualsSignKeyword_2_0_1; }
		
		//type=GSSIfaceSpWPortType
		public Assignment getTypeAssignment_2_0_2() { return cTypeAssignment_2_0_2; }
		
		//GSSIfaceSpWPortType
		public RuleCall getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0() { return cTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'link' ':=' link=INTEGER ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'link'
		public Keyword getLinkKeyword_2_1_0() { return cLinkKeyword_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1_1() { return cColonEqualsSignKeyword_2_1_1; }
		
		//link=INTEGER
		public Assignment getLinkAssignment_2_1_2() { return cLinkAssignment_2_1_2; }
		
		//INTEGER
		public RuleCall getLinkINTEGERParserRuleCall_2_1_2_0() { return cLinkINTEGERParserRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//'writingPort' ':=' writingPort=INTEGER ';'
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//'writingPort'
		public Keyword getWritingPortKeyword_2_2_0() { return cWritingPortKeyword_2_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_2_1() { return cColonEqualsSignKeyword_2_2_1; }
		
		//writingPort=INTEGER
		public Assignment getWritingPortAssignment_2_2_2() { return cWritingPortAssignment_2_2_2; }
		
		//INTEGER
		public RuleCall getWritingPortINTEGERParserRuleCall_2_2_2_0() { return cWritingPortINTEGERParserRuleCall_2_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_2_3() { return cSemicolonKeyword_2_2_3; }
		
		//readingPort+=GSSIfaceReadingPort*
		public Assignment getReadingPortAssignment_2_3() { return cReadingPortAssignment_2_3; }
		
		//GSSIfaceReadingPort
		public RuleCall getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0() { return cReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceReadingPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceReadingPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadingPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cPortKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cPortAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cPortINTEGERParserRuleCall_2_2_0 = (RuleCall)cPortAssignment_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceReadingPort:
		//	'readingPort' '{' ('port' ':=' port=INTEGER ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'readingPort' '{' ('port' ':=' port=INTEGER ';') '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'readingPort'
		public Keyword getReadingPortKeyword_0() { return cReadingPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('port' ':=' port=INTEGER ';')
		public Group getGroup_2() { return cGroup_2; }
		
		//'port'
		public Keyword getPortKeyword_2_0() { return cPortKeyword_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1() { return cColonEqualsSignKeyword_2_1; }
		
		//port=INTEGER
		public Assignment getPortAssignment_2_2() { return cPortAssignment_2_2; }
		
		//INTEGER
		public RuleCall getPortINTEGERParserRuleCall_2_2_0() { return cPortINTEGERParserRuleCall_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceUartPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUartPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cNumberKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cNumberAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cNumberINTEGERParserRuleCall_2_0_2_0 = (RuleCall)cNumberAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cBaudRateKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cBaudRateAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0 = (RuleCall)cBaudRateAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Group cGroup_2_2 = (Group)cUnorderedGroup_2.eContents().get(2);
		private final Keyword cParityKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_2_1 = (Keyword)cGroup_2_2.eContents().get(1);
		private final Assignment cParityAssignment_2_2_2 = (Assignment)cGroup_2_2.eContents().get(2);
		private final RuleCall cParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0 = (RuleCall)cParityAssignment_2_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_2_3 = (Keyword)cGroup_2_2.eContents().get(3);
		private final Group cGroup_2_3 = (Group)cUnorderedGroup_2.eContents().get(3);
		private final Keyword cDataBitsKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_3_1 = (Keyword)cGroup_2_3.eContents().get(1);
		private final Assignment cDataBitsAssignment_2_3_2 = (Assignment)cGroup_2_3.eContents().get(2);
		private final RuleCall cDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0 = (RuleCall)cDataBitsAssignment_2_3_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3_3 = (Keyword)cGroup_2_3.eContents().get(3);
		private final Group cGroup_2_4 = (Group)cUnorderedGroup_2.eContents().get(4);
		private final Keyword cStopBitsKeyword_2_4_0 = (Keyword)cGroup_2_4.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_4_1 = (Keyword)cGroup_2_4.eContents().get(1);
		private final Assignment cStopBitsAssignment_2_4_2 = (Assignment)cGroup_2_4.eContents().get(2);
		private final RuleCall cStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0 = (RuleCall)cStopBitsAssignment_2_4_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_4_3 = (Keyword)cGroup_2_4.eContents().get(3);
		private final Group cGroup_2_5 = (Group)cUnorderedGroup_2.eContents().get(5);
		private final Keyword cInputQueueSizeKeyword_2_5_0 = (Keyword)cGroup_2_5.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_5_1 = (Keyword)cGroup_2_5.eContents().get(1);
		private final Assignment cInputQueueSizeAssignment_2_5_2 = (Assignment)cGroup_2_5.eContents().get(2);
		private final RuleCall cInputQueueSizeINTEGERParserRuleCall_2_5_2_0 = (RuleCall)cInputQueueSizeAssignment_2_5_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_5_3 = (Keyword)cGroup_2_5.eContents().get(3);
		private final Group cGroup_2_6 = (Group)cUnorderedGroup_2.eContents().get(6);
		private final Keyword cOutputQueueSizeKeyword_2_6_0 = (Keyword)cGroup_2_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_6_1 = (Keyword)cGroup_2_6.eContents().get(1);
		private final Assignment cOutputQueueSizeAssignment_2_6_2 = (Assignment)cGroup_2_6.eContents().get(2);
		private final RuleCall cOutputQueueSizeINTEGERParserRuleCall_2_6_2_0 = (RuleCall)cOutputQueueSizeAssignment_2_6_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_6_3 = (Keyword)cGroup_2_6.eContents().get(3);
		private final Assignment cUartProtocolAssignment_2_7 = (Assignment)cUnorderedGroup_2.eContents().get(7);
		private final RuleCall cUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0 = (RuleCall)cUartProtocolAssignment_2_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceUartPort:
		//	'uartPort' '{' ('number' ':=' number=INTEGER ';' & 'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';' & 'parity'
		//	':=' parity=GSSIfaceUartPortParity ';' & 'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';' & 'stopBits' ':='
		//	stopBits=GSSIfaceUartPortStopBits ';' & 'inputQueueSize' ':=' inputQueueSize=INTEGER ';' & 'outputQueueSize' ':='
		//	outputQueueSize=INTEGER ';' & uartProtocol=GSSIfaceUartProtocol)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'uartPort' '{' ('number' ':=' number=INTEGER ';' & 'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';' & 'parity' ':='
		//parity=GSSIfaceUartPortParity ';' & 'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';' & 'stopBits' ':='
		//stopBits=GSSIfaceUartPortStopBits ';' & 'inputQueueSize' ':=' inputQueueSize=INTEGER ';' & 'outputQueueSize' ':='
		//outputQueueSize=INTEGER ';' & uartProtocol=GSSIfaceUartProtocol) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'uartPort'
		public Keyword getUartPortKeyword_0() { return cUartPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('number' ':=' number=INTEGER ';' & 'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';' & 'parity' ':='
		//parity=GSSIfaceUartPortParity ';' & 'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';' & 'stopBits' ':='
		//stopBits=GSSIfaceUartPortStopBits ';' & 'inputQueueSize' ':=' inputQueueSize=INTEGER ';' & 'outputQueueSize' ':='
		//outputQueueSize=INTEGER ';' & uartProtocol=GSSIfaceUartProtocol)
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'number' ':=' number=INTEGER ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'number'
		public Keyword getNumberKeyword_2_0_0() { return cNumberKeyword_2_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_0_1() { return cColonEqualsSignKeyword_2_0_1; }
		
		//number=INTEGER
		public Assignment getNumberAssignment_2_0_2() { return cNumberAssignment_2_0_2; }
		
		//INTEGER
		public RuleCall getNumberINTEGERParserRuleCall_2_0_2_0() { return cNumberINTEGERParserRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'baudRate'
		public Keyword getBaudRateKeyword_2_1_0() { return cBaudRateKeyword_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1_1() { return cColonEqualsSignKeyword_2_1_1; }
		
		//baudRate=GSSIfaceUartPortBaudRate
		public Assignment getBaudRateAssignment_2_1_2() { return cBaudRateAssignment_2_1_2; }
		
		//GSSIfaceUartPortBaudRate
		public RuleCall getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0() { return cBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//'parity' ':=' parity=GSSIfaceUartPortParity ';'
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//'parity'
		public Keyword getParityKeyword_2_2_0() { return cParityKeyword_2_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_2_1() { return cColonEqualsSignKeyword_2_2_1; }
		
		//parity=GSSIfaceUartPortParity
		public Assignment getParityAssignment_2_2_2() { return cParityAssignment_2_2_2; }
		
		//GSSIfaceUartPortParity
		public RuleCall getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0() { return cParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_2_3() { return cSemicolonKeyword_2_2_3; }
		
		//'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';'
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//'dataBits'
		public Keyword getDataBitsKeyword_2_3_0() { return cDataBitsKeyword_2_3_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_3_1() { return cColonEqualsSignKeyword_2_3_1; }
		
		//dataBits=GSSIfaceUartPortDataBits
		public Assignment getDataBitsAssignment_2_3_2() { return cDataBitsAssignment_2_3_2; }
		
		//GSSIfaceUartPortDataBits
		public RuleCall getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0() { return cDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3_3() { return cSemicolonKeyword_2_3_3; }
		
		//'stopBits' ':=' stopBits=GSSIfaceUartPortStopBits ';'
		public Group getGroup_2_4() { return cGroup_2_4; }
		
		//'stopBits'
		public Keyword getStopBitsKeyword_2_4_0() { return cStopBitsKeyword_2_4_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_4_1() { return cColonEqualsSignKeyword_2_4_1; }
		
		//stopBits=GSSIfaceUartPortStopBits
		public Assignment getStopBitsAssignment_2_4_2() { return cStopBitsAssignment_2_4_2; }
		
		//GSSIfaceUartPortStopBits
		public RuleCall getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0() { return cStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_4_3() { return cSemicolonKeyword_2_4_3; }
		
		//'inputQueueSize' ':=' inputQueueSize=INTEGER ';'
		public Group getGroup_2_5() { return cGroup_2_5; }
		
		//'inputQueueSize'
		public Keyword getInputQueueSizeKeyword_2_5_0() { return cInputQueueSizeKeyword_2_5_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_5_1() { return cColonEqualsSignKeyword_2_5_1; }
		
		//inputQueueSize=INTEGER
		public Assignment getInputQueueSizeAssignment_2_5_2() { return cInputQueueSizeAssignment_2_5_2; }
		
		//INTEGER
		public RuleCall getInputQueueSizeINTEGERParserRuleCall_2_5_2_0() { return cInputQueueSizeINTEGERParserRuleCall_2_5_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_5_3() { return cSemicolonKeyword_2_5_3; }
		
		//'outputQueueSize' ':=' outputQueueSize=INTEGER ';'
		public Group getGroup_2_6() { return cGroup_2_6; }
		
		//'outputQueueSize'
		public Keyword getOutputQueueSizeKeyword_2_6_0() { return cOutputQueueSizeKeyword_2_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_6_1() { return cColonEqualsSignKeyword_2_6_1; }
		
		//outputQueueSize=INTEGER
		public Assignment getOutputQueueSizeAssignment_2_6_2() { return cOutputQueueSizeAssignment_2_6_2; }
		
		//INTEGER
		public RuleCall getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0() { return cOutputQueueSizeINTEGERParserRuleCall_2_6_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_6_3() { return cSemicolonKeyword_2_6_3; }
		
		//uartProtocol=GSSIfaceUartProtocol
		public Assignment getUartProtocolAssignment_2_7() { return cUartProtocolAssignment_2_7; }
		
		//GSSIfaceUartProtocol
		public RuleCall getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0() { return cUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceUartProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUartProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cUnitKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cUnitAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0 = (RuleCall)cUnitAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cPowerKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cPowerAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0 = (RuleCall)cPowerAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Assignment cConstSizeAssignment_2_2 = (Assignment)cUnorderedGroup_2.eContents().get(2);
		private final RuleCall cConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0 = (RuleCall)cConstSizeAssignment_2_2.eContents().get(0);
		private final Assignment cSizeFieldOffsetAssignment_2_3 = (Assignment)cUnorderedGroup_2.eContents().get(3);
		private final RuleCall cSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0 = (RuleCall)cSizeFieldOffsetAssignment_2_3.eContents().get(0);
		private final Assignment cSizeFieldTrimAssignment_2_4 = (Assignment)cUnorderedGroup_2.eContents().get(4);
		private final RuleCall cSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0 = (RuleCall)cSizeFieldTrimAssignment_2_4.eContents().get(0);
		private final Assignment cSyncPatternAssignment_2_5 = (Assignment)cUnorderedGroup_2.eContents().get(5);
		private final RuleCall cSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0 = (RuleCall)cSyncPatternAssignment_2_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceUartProtocol:
		//	'uartProtocol' '{' ('unit' ':=' unit=GSSIfaceUartProtocolUnit ';' & 'power' ':=' power=GSSIfaceUartProtocolPower ';'
		//	& constSize=GSSIfaceConstSize & sizeFieldOffset=GSSIfaceSizeFieldOffset & sizeFieldTrim=GSSIfaceSizeFieldTrim &
		//	syncPattern=GSSIfaceSyncPattern)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'uartProtocol' '{' ('unit' ':=' unit=GSSIfaceUartProtocolUnit ';' & 'power' ':=' power=GSSIfaceUartProtocolPower ';' &
		//constSize=GSSIfaceConstSize & sizeFieldOffset=GSSIfaceSizeFieldOffset & sizeFieldTrim=GSSIfaceSizeFieldTrim &
		//syncPattern=GSSIfaceSyncPattern) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'uartProtocol'
		public Keyword getUartProtocolKeyword_0() { return cUartProtocolKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('unit' ':=' unit=GSSIfaceUartProtocolUnit ';' & 'power' ':=' power=GSSIfaceUartProtocolPower ';' &
		//constSize=GSSIfaceConstSize & sizeFieldOffset=GSSIfaceSizeFieldOffset & sizeFieldTrim=GSSIfaceSizeFieldTrim &
		//syncPattern=GSSIfaceSyncPattern)
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'unit' ':=' unit=GSSIfaceUartProtocolUnit ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'unit'
		public Keyword getUnitKeyword_2_0_0() { return cUnitKeyword_2_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_0_1() { return cColonEqualsSignKeyword_2_0_1; }
		
		//unit=GSSIfaceUartProtocolUnit
		public Assignment getUnitAssignment_2_0_2() { return cUnitAssignment_2_0_2; }
		
		//GSSIfaceUartProtocolUnit
		public RuleCall getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0() { return cUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'power' ':=' power=GSSIfaceUartProtocolPower ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'power'
		public Keyword getPowerKeyword_2_1_0() { return cPowerKeyword_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1_1() { return cColonEqualsSignKeyword_2_1_1; }
		
		//power=GSSIfaceUartProtocolPower
		public Assignment getPowerAssignment_2_1_2() { return cPowerAssignment_2_1_2; }
		
		//GSSIfaceUartProtocolPower
		public RuleCall getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0() { return cPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//constSize=GSSIfaceConstSize
		public Assignment getConstSizeAssignment_2_2() { return cConstSizeAssignment_2_2; }
		
		//GSSIfaceConstSize
		public RuleCall getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0() { return cConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0; }
		
		//sizeFieldOffset=GSSIfaceSizeFieldOffset
		public Assignment getSizeFieldOffsetAssignment_2_3() { return cSizeFieldOffsetAssignment_2_3; }
		
		//GSSIfaceSizeFieldOffset
		public RuleCall getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0() { return cSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0; }
		
		//sizeFieldTrim=GSSIfaceSizeFieldTrim
		public Assignment getSizeFieldTrimAssignment_2_4() { return cSizeFieldTrimAssignment_2_4; }
		
		//GSSIfaceSizeFieldTrim
		public RuleCall getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0() { return cSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0; }
		
		//syncPattern=GSSIfaceSyncPattern
		public Assignment getSyncPatternAssignment_2_5() { return cSyncPatternAssignment_2_5; }
		
		//GSSIfaceSyncPattern
		public RuleCall getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0() { return cSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceConstSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceConstSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConstSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cBytesKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cBytesAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cBytesINTEGERParserRuleCall_2_0_2_0 = (RuleCall)cBytesAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cBitsKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cBitsAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cBitsINTEGERParserRuleCall_2_1_2_0 = (RuleCall)cBitsAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceConstSize:
		//	'constSize' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'constSize' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';') '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'constSize'
		public Keyword getConstSizeKeyword_0() { return cConstSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'bytes' ':=' bytes=INTEGER ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'bytes'
		public Keyword getBytesKeyword_2_0_0() { return cBytesKeyword_2_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_0_1() { return cColonEqualsSignKeyword_2_0_1; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_2_0_2() { return cBytesAssignment_2_0_2; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_2_0_2_0() { return cBytesINTEGERParserRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'bits' ':=' bits=INTEGER ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'bits'
		public Keyword getBitsKeyword_2_1_0() { return cBitsKeyword_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1_1() { return cColonEqualsSignKeyword_2_1_1; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_2_1_2() { return cBitsAssignment_2_1_2; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_2_1_2_0() { return cBitsINTEGERParserRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceSizeFieldOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSizeFieldOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cBytesKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cBytesAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cBytesINTEGERParserRuleCall_2_0_2_0 = (RuleCall)cBytesAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cBitsKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cBitsAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cBitsINTEGERParserRuleCall_2_1_2_0 = (RuleCall)cBitsAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceSizeFieldOffset:
		//	'sizeFieldOffset' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'sizeFieldOffset' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';') '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'sizeFieldOffset'
		public Keyword getSizeFieldOffsetKeyword_0() { return cSizeFieldOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'bytes' ':=' bytes=INTEGER ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'bytes'
		public Keyword getBytesKeyword_2_0_0() { return cBytesKeyword_2_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_0_1() { return cColonEqualsSignKeyword_2_0_1; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_2_0_2() { return cBytesAssignment_2_0_2; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_2_0_2_0() { return cBytesINTEGERParserRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'bits' ':=' bits=INTEGER ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'bits'
		public Keyword getBitsKeyword_2_1_0() { return cBitsKeyword_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1_1() { return cColonEqualsSignKeyword_2_1_1; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_2_1_2() { return cBitsAssignment_2_1_2; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_2_1_2_0() { return cBitsINTEGERParserRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceSizeFieldTrimElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldTrim");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSizeFieldTrimKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cBytesKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cBytesAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cBytesINTEGERParserRuleCall_2_0_2_0 = (RuleCall)cBytesAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cBitsKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cBitsAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cBitsINTEGERParserRuleCall_2_1_2_0 = (RuleCall)cBitsAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceSizeFieldTrim:
		//	'sizeFieldTrim' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'sizeFieldTrim' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';') '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'sizeFieldTrim'
		public Keyword getSizeFieldTrimKeyword_0() { return cSizeFieldTrimKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'bytes' ':=' bytes=INTEGER ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'bytes'
		public Keyword getBytesKeyword_2_0_0() { return cBytesKeyword_2_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_0_1() { return cColonEqualsSignKeyword_2_0_1; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_2_0_2() { return cBytesAssignment_2_0_2; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_2_0_2_0() { return cBytesINTEGERParserRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'bits' ':=' bits=INTEGER ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'bits'
		public Keyword getBitsKeyword_2_1_0() { return cBitsKeyword_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1_1() { return cColonEqualsSignKeyword_2_1_1; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_2_1_2() { return cBitsAssignment_2_1_2; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_2_1_2_0() { return cBitsINTEGERParserRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceSyncPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSyncPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSyncPatternKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHexValueKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cHexValueAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cHexValueHEXADECIMALTerminalRuleCall_2_2_0 = (RuleCall)cHexValueAssignment_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceSyncPattern:
		//	'syncPattern' '{' ('hexValue' ':=' hexValue=HEXADECIMAL ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'syncPattern' '{' ('hexValue' ':=' hexValue=HEXADECIMAL ';') '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'syncPattern'
		public Keyword getSyncPatternKeyword_0() { return cSyncPatternKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('hexValue' ':=' hexValue=HEXADECIMAL ';')
		public Group getGroup_2() { return cGroup_2; }
		
		//'hexValue'
		public Keyword getHexValueKeyword_2_0() { return cHexValueKeyword_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1() { return cColonEqualsSignKeyword_2_1; }
		
		//hexValue=HEXADECIMAL
		public Assignment getHexValueAssignment_2_2() { return cHexValueAssignment_2_2; }
		
		//HEXADECIMAL
		public RuleCall getHexValueHEXADECIMALTerminalRuleCall_2_2_0() { return cHexValueHEXADECIMALTerminalRuleCall_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class GSSIfaceSpWTCPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWTCPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpwTCPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSpwPortRefKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cSpwPortRefAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cSpwPortRefINTEGERParserRuleCall_2_2_0 = (RuleCall)cSpwPortRefAssignment_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSIfaceSpWTCPort:
		//	'spwTCPort' '{' ('spwPortRef' ':=' spwPortRef=INTEGER ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'spwTCPort' '{' ('spwPortRef' ':=' spwPortRef=INTEGER ';') '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'spwTCPort'
		public Keyword getSpwTCPortKeyword_0() { return cSpwTCPortKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('spwPortRef' ':=' spwPortRef=INTEGER ';')
		public Group getGroup_2() { return cGroup_2; }
		
		//'spwPortRef'
		public Keyword getSpwPortRefKeyword_2_0() { return cSpwPortRefKeyword_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_2_1() { return cColonEqualsSignKeyword_2_1; }
		
		//spwPortRef=INTEGER
		public Assignment getSpwPortRefAssignment_2_2() { return cSpwPortRefAssignment_2_2; }
		
		//INTEGER
		public RuleCall getSpwPortRefINTEGERParserRuleCall_2_2_0() { return cSpwPortRefINTEGERParserRuleCall_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
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
	public class GSSIfaceUartProtocolUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBytesBytesKeyword_0_0 = (Keyword)cBytesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBitsBitsKeyword_1_0 = (Keyword)cBitsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSIfaceUartProtocolUnit:
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
	public class GSSIfaceUartProtocolPowerElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolPower");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNoEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNoNoKeyword_0_0 = (Keyword)cNoEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_22bitsKeyword_1_0 = (Keyword)c_2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration c_2_with_0EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword c_2_with_02_with_0Keyword_2_0 = (Keyword)c_2_with_0EnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSIfaceUartProtocolPower:
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
	private final GSSIfaceUartProtocolElements pGSSIfaceUartProtocol;
	private final GSSIfaceConstSizeElements pGSSIfaceConstSize;
	private final GSSIfaceSizeFieldOffsetElements pGSSIfaceSizeFieldOffset;
	private final GSSIfaceSizeFieldTrimElements pGSSIfaceSizeFieldTrim;
	private final GSSIfaceSyncPatternElements pGSSIfaceSyncPattern;
	private final GSSIfaceUartProtocolUnitElements eGSSIfaceUartProtocolUnit;
	private final GSSIfaceUartProtocolPowerElements eGSSIfaceUartProtocolPower;
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
		this.pGSSIfaceUartProtocol = new GSSIfaceUartProtocolElements();
		this.pGSSIfaceConstSize = new GSSIfaceConstSizeElements();
		this.pGSSIfaceSizeFieldOffset = new GSSIfaceSizeFieldOffsetElements();
		this.pGSSIfaceSizeFieldTrim = new GSSIfaceSizeFieldTrimElements();
		this.pGSSIfaceSyncPattern = new GSSIfaceSyncPatternElements();
		this.eGSSIfaceUartProtocolUnit = new GSSIfaceUartProtocolUnitElements();
		this.eGSSIfaceUartProtocolPower = new GSSIfaceUartProtocolPowerElements();
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
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & port=GSSIfacePort)
	//	'}' ';';
	public GSSIfacePortConfigElements getGSSIfacePortConfigAccess() {
		return pGSSIfacePortConfig;
	}
	
	public ParserRule getGSSIfacePortConfigRule() {
		return getGSSIfacePortConfigAccess().getRule();
	}
	
	//GSSIfacePort:
	//	GSSIfaceSpWPort | GSSIfaceUartPort | GSSIfaceSpWTCPort | GSSIfaceDummyPort;
	public GSSIfacePortElements getGSSIfacePortAccess() {
		return pGSSIfacePort;
	}
	
	public ParserRule getGSSIfacePortRule() {
		return getGSSIfacePortAccess().getRule();
	}
	
	//GSSIfaceSpWPort:
	//	'spwPort' '{' ('type' ':=' type=GSSIfaceSpWPortType ';' & 'link' ':=' link=INTEGER ';' & 'writingPort' ':='
	//	writingPort=INTEGER ';' & readingPort+=GSSIfaceReadingPort*)
	//	'}' ';';
	public GSSIfaceSpWPortElements getGSSIfaceSpWPortAccess() {
		return pGSSIfaceSpWPort;
	}
	
	public ParserRule getGSSIfaceSpWPortRule() {
		return getGSSIfaceSpWPortAccess().getRule();
	}
	
	//GSSIfaceReadingPort:
	//	'readingPort' '{' ('port' ':=' port=INTEGER ';')
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
	//	'uartPort' '{' ('number' ':=' number=INTEGER ';' & 'baudRate' ':=' baudRate=GSSIfaceUartPortBaudRate ';' & 'parity'
	//	':=' parity=GSSIfaceUartPortParity ';' & 'dataBits' ':=' dataBits=GSSIfaceUartPortDataBits ';' & 'stopBits' ':='
	//	stopBits=GSSIfaceUartPortStopBits ';' & 'inputQueueSize' ':=' inputQueueSize=INTEGER ';' & 'outputQueueSize' ':='
	//	outputQueueSize=INTEGER ';' & uartProtocol=GSSIfaceUartProtocol)
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
	
	//GSSIfaceUartProtocol:
	//	'uartProtocol' '{' ('unit' ':=' unit=GSSIfaceUartProtocolUnit ';' & 'power' ':=' power=GSSIfaceUartProtocolPower ';'
	//	& constSize=GSSIfaceConstSize & sizeFieldOffset=GSSIfaceSizeFieldOffset & sizeFieldTrim=GSSIfaceSizeFieldTrim &
	//	syncPattern=GSSIfaceSyncPattern)
	//	'}' ';';
	public GSSIfaceUartProtocolElements getGSSIfaceUartProtocolAccess() {
		return pGSSIfaceUartProtocol;
	}
	
	public ParserRule getGSSIfaceUartProtocolRule() {
		return getGSSIfaceUartProtocolAccess().getRule();
	}
	
	//GSSIfaceConstSize:
	//	'constSize' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
	//	'}' ';';
	public GSSIfaceConstSizeElements getGSSIfaceConstSizeAccess() {
		return pGSSIfaceConstSize;
	}
	
	public ParserRule getGSSIfaceConstSizeRule() {
		return getGSSIfaceConstSizeAccess().getRule();
	}
	
	//GSSIfaceSizeFieldOffset:
	//	'sizeFieldOffset' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
	//	'}' ';';
	public GSSIfaceSizeFieldOffsetElements getGSSIfaceSizeFieldOffsetAccess() {
		return pGSSIfaceSizeFieldOffset;
	}
	
	public ParserRule getGSSIfaceSizeFieldOffsetRule() {
		return getGSSIfaceSizeFieldOffsetAccess().getRule();
	}
	
	//GSSIfaceSizeFieldTrim:
	//	'sizeFieldTrim' '{' ('bytes' ':=' bytes=INTEGER ';' & 'bits' ':=' bits=INTEGER ';')
	//	'}' ';';
	public GSSIfaceSizeFieldTrimElements getGSSIfaceSizeFieldTrimAccess() {
		return pGSSIfaceSizeFieldTrim;
	}
	
	public ParserRule getGSSIfaceSizeFieldTrimRule() {
		return getGSSIfaceSizeFieldTrimAccess().getRule();
	}
	
	//GSSIfaceSyncPattern:
	//	'syncPattern' '{' ('hexValue' ':=' hexValue=HEXADECIMAL ';')
	//	'}' ';';
	public GSSIfaceSyncPatternElements getGSSIfaceSyncPatternAccess() {
		return pGSSIfaceSyncPattern;
	}
	
	public ParserRule getGSSIfaceSyncPatternRule() {
		return getGSSIfaceSyncPatternAccess().getRule();
	}
	
	//enum GSSIfaceUartProtocolUnit:
	//	bytes | bits;
	public GSSIfaceUartProtocolUnitElements getGSSIfaceUartProtocolUnitAccess() {
		return eGSSIfaceUartProtocolUnit;
	}
	
	public EnumRule getGSSIfaceUartProtocolUnitRule() {
		return getGSSIfaceUartProtocolUnitAccess().getRule();
	}
	
	//enum GSSIfaceUartProtocolPower:
	//	no | _2='2bits' | _2_with_0='2_with_0';
	public GSSIfaceUartProtocolPowerElements getGSSIfaceUartProtocolPowerAccess() {
		return eGSSIfaceUartProtocolPower;
	}
	
	public EnumRule getGSSIfaceUartProtocolPowerRule() {
		return getGSSIfaceUartProtocolPowerAccess().getRule();
	}
	
	//GSSIfaceSpWTCPort:
	//	'spwTCPort' '{' ('spwPortRef' ':=' spwPortRef=INTEGER ';')
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
