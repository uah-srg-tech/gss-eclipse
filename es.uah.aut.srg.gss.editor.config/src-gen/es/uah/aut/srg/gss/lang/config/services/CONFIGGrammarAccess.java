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
		private final Keyword cScenarioKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cColonEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cScenarioAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cScenarioGSSEnvironmentScenarioCrossReference_10_0 = (CrossReference)cScenarioAssignment_10.eContents().get(0);
		private final RuleCall cScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1 = (RuleCall)cScenarioGSSEnvironmentScenarioCrossReference_10_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTestsAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTestsGSSConfigTestsParserRuleCall_12_0 = (RuleCall)cTestsAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//GSSConfigGSSConfig GSSConfigConfig:
		//	'GSSConfigGSSConfig'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';')
		//	'version' ':=' version=Version ';'
		//	'scenario' ':=' scenario=[environment::GSSEnvironmentScenario|VersionedQualifiedReferenceName] ';'
		//	Tests=GSSConfigTests
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigGSSConfig' name=ID '{' ('uri' ':=' uri=QualifiedName ';') 'version' ':=' version=Version ';' 'scenario' ':='
		//scenario=[environment::GSSEnvironmentScenario|VersionedQualifiedReferenceName] ';' Tests=GSSConfigTests '}' ';'
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
		
		//'scenario'
		public Keyword getScenarioKeyword_8() { return cScenarioKeyword_8; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9() { return cColonEqualsSignKeyword_9; }
		
		//scenario=[environment::GSSEnvironmentScenario|VersionedQualifiedReferenceName]
		public Assignment getScenarioAssignment_10() { return cScenarioAssignment_10; }
		
		//[environment::GSSEnvironmentScenario|VersionedQualifiedReferenceName]
		public CrossReference getScenarioGSSEnvironmentScenarioCrossReference_10_0() { return cScenarioGSSEnvironmentScenarioCrossReference_10_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1() { return cScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
		
		//Tests=GSSConfigTests
		public Assignment getTestsAssignment_12() { return cTestsAssignment_12; }
		
		//GSSConfigTests
		public RuleCall getTestsGSSConfigTestsParserRuleCall_12_0() { return cTestsGSSConfigTestsParserRuleCall_12_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class GSSConfigTestsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTests");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSConfigTestsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestCaseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTestCaseGSSConfigTestCaseParserRuleCall_2_0 = (RuleCall)cTestCaseAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GSSConfigTests:
		//	'GSSConfigTests' '{'
		//	TestCase+=GSSConfigTestCase+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSConfigTests' '{' TestCase+=GSSConfigTestCase+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSConfigTests'
		public Keyword getGSSConfigTestsKeyword_0() { return cGSSConfigTestsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//TestCase+=GSSConfigTestCase+
		public Assignment getTestCaseAssignment_2() { return cTestCaseAssignment_2; }
		
		//GSSConfigTestCase
		public RuleCall getTestCaseGSSConfigTestCaseParserRuleCall_2_0() { return cTestCaseGSSConfigTestCaseParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
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
	private final GSSConfigTestsElements pGSSConfigTests;
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
		this.pGSSConfigTests = new GSSConfigTestsElements();
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
	
	//GSSConfigGSSConfig GSSConfigConfig:
	//	'GSSConfigGSSConfig'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';')
	//	'version' ':=' version=Version ';'
	//	'scenario' ':=' scenario=[environment::GSSEnvironmentScenario|VersionedQualifiedReferenceName] ';'
	//	Tests=GSSConfigTests
	//	'}' ';'
	public GSSConfigGSSConfigElements getGSSConfigGSSConfigAccess() {
		return pGSSConfigGSSConfig;
	}
	
	public ParserRule getGSSConfigGSSConfigRule() {
		return getGSSConfigGSSConfigAccess().getRule();
	}
	
	//GSSConfigTests:
	//	'GSSConfigTests' '{'
	//	TestCase+=GSSConfigTestCase+
	//	'}' ';';
	public GSSConfigTestsElements getGSSConfigTestsAccess() {
		return pGSSConfigTests;
	}
	
	public ParserRule getGSSConfigTestsRule() {
		return getGSSConfigTestsAccess().getRule();
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
