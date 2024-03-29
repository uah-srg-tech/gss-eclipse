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
package es.uah.aut.srg.gss.lang.campaign.services;

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
public class CAMPAIGNGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSCampaignCampaignParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSCampaignCampaign
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSCampaignCampaign
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSCampaignCampaign
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSCampaignCampaign
		public RuleCall getElementGSSCampaignCampaignParserRuleCall_1_0() { return cElementGSSCampaignCampaignParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSModelFileImport");
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
	public class GSSCampaignCampaignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSCampaignCampaign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSCampaignCampaignKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cScenarioGSSCampaignScenarioParserRuleCall_8_0 = (RuleCall)cScenarioAssignment_8.eContents().get(0);
		private final Assignment cTestsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cTestsGSSTestListTestListParserRuleCall_9_0 = (RuleCall)cTestsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSCampaignCampaign:
		//	'GSSCampaignCampaign'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';')
		//	'version' ':=' version=Version ';'
		//	Scenario=GSSCampaignScenario
		//	Tests=GSSTestListTestList
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSCampaignCampaign' name=ID '{' ('uri' ':=' uri=QualifiedName ';') 'version' ':=' version=Version ';'
		//Scenario=GSSCampaignScenario Tests=GSSTestListTestList '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSCampaignCampaign'
		public Keyword getGSSCampaignCampaignKeyword_0() { return cGSSCampaignCampaignKeyword_0; }
		
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
		
		//Scenario=GSSCampaignScenario
		public Assignment getScenarioAssignment_8() { return cScenarioAssignment_8; }
		
		//GSSCampaignScenario
		public RuleCall getScenarioGSSCampaignScenarioParserRuleCall_8_0() { return cScenarioGSSCampaignScenarioParserRuleCall_8_0; }
		
		//Tests=GSSTestListTestList
		public Assignment getTestsAssignment_9() { return cTestsAssignment_9; }
		
		//GSSTestListTestList
		public RuleCall getTestsGSSTestListTestListParserRuleCall_9_0() { return cTestsGSSTestListTestListParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSCampaignScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSCampaignScenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSCampaignScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEnvironmentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEnvironmentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0 = (CrossReference)cEnvironmentAssignment_4.eContents().get(0);
		private final RuleCall cEnvironmentGSSEnvironmentEnvironmentVersionedQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cScenarioRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cScenarioRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cScenarioRefGSSScenarioScenarioCrossReference_8_0 = (CrossReference)cScenarioRefAssignment_8.eContents().get(0);
		private final RuleCall cScenarioRefGSSScenarioScenarioSTRINGTerminalRuleCall_8_0_1 = (RuleCall)cScenarioRefGSSScenarioScenarioCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSCampaignScenario:
		//	'GSSCampaignScenario' '{'
		//	'environment' ':=' environment=[environment::GSSEnvironmentEnvironment|VersionedQualifiedName] ';'
		//	'scenarioRef' ':=' scenarioRef=[scenario::GSSScenarioScenario|STRING] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSCampaignScenario' '{' 'environment' ':=' environment=[environment::GSSEnvironmentEnvironment|VersionedQualifiedName]
		//';' 'scenarioRef' ':=' scenarioRef=[scenario::GSSScenarioScenario|STRING] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSCampaignScenario'
		public Keyword getGSSCampaignScenarioKeyword_0() { return cGSSCampaignScenarioKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'environment'
		public Keyword getEnvironmentKeyword_2() { return cEnvironmentKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//environment=[environment::GSSEnvironmentEnvironment|VersionedQualifiedName]
		public Assignment getEnvironmentAssignment_4() { return cEnvironmentAssignment_4; }
		
		//[environment::GSSEnvironmentEnvironment|VersionedQualifiedName]
		public CrossReference getEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0() { return cEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0; }
		
		//VersionedQualifiedName
		public RuleCall getEnvironmentGSSEnvironmentEnvironmentVersionedQualifiedNameParserRuleCall_4_0_1() { return cEnvironmentGSSEnvironmentEnvironmentVersionedQualifiedNameParserRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'scenarioRef'
		public Keyword getScenarioRefKeyword_6() { return cScenarioRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//scenarioRef=[scenario::GSSScenarioScenario|STRING]
		public Assignment getScenarioRefAssignment_8() { return cScenarioRefAssignment_8; }
		
		//[scenario::GSSScenarioScenario|STRING]
		public CrossReference getScenarioRefGSSScenarioScenarioCrossReference_8_0() { return cScenarioRefGSSScenarioScenarioCrossReference_8_0; }
		
		//STRING
		public RuleCall getScenarioRefGSSScenarioScenarioSTRINGTerminalRuleCall_8_0_1() { return cScenarioRefGSSScenarioScenarioSTRINGTerminalRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTestListTestListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListTestList");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListTestCase");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.VersionedQualifiedName");
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
	
	public class GSSTestListPrevActionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListPrevAction");
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
	private final GSSCampaignCampaignElements pGSSCampaignCampaign;
	private final GSSCampaignScenarioElements pGSSCampaignScenario;
	private final GSSTestListTestListElements pGSSTestListTestList;
	private final GSSTestListTestCaseElements pGSSTestListTestCase;
	private final GSSTestListPrevActionElements eGSSTestListPrevAction;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CAMPAIGNGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSCampaignCampaign = new GSSCampaignCampaignElements();
		this.pGSSCampaignScenario = new GSSCampaignScenarioElements();
		this.pGSSTestListTestList = new GSSTestListTestListElements();
		this.pGSSTestListTestCase = new GSSTestListTestCaseElements();
		this.eGSSTestListPrevAction = new GSSTestListPrevActionElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.campaign.CAMPAIGN".equals(grammar.getName())) {
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
	//	element=GSSCampaignCampaign
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
	
	//GSSCampaignCampaign:
	//	'GSSCampaignCampaign'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';')
	//	'version' ':=' version=Version ';'
	//	Scenario=GSSCampaignScenario
	//	Tests=GSSTestListTestList
	//	'}' ';';
	public GSSCampaignCampaignElements getGSSCampaignCampaignAccess() {
		return pGSSCampaignCampaign;
	}
	
	public ParserRule getGSSCampaignCampaignRule() {
		return getGSSCampaignCampaignAccess().getRule();
	}
	
	//GSSCampaignScenario:
	//	'GSSCampaignScenario' '{'
	//	'environment' ':=' environment=[environment::GSSEnvironmentEnvironment|VersionedQualifiedName] ';'
	//	'scenarioRef' ':=' scenarioRef=[scenario::GSSScenarioScenario|STRING] ';'
	//	'}' ';';
	public GSSCampaignScenarioElements getGSSCampaignScenarioAccess() {
		return pGSSCampaignScenario;
	}
	
	public ParserRule getGSSCampaignScenarioRule() {
		return getGSSCampaignScenarioAccess().getRule();
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
