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
grammar InternalCAMPAIGN;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.campaign.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.campaign.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.campaign.services.CAMPAIGNGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private CAMPAIGNGrammarAccess grammarAccess;

    public InternalCAMPAIGNParser(TokenStream input, CAMPAIGNGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected CAMPAIGNGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGSSModelFile
entryRuleGSSModelFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSModelFileRule()); }
	iv_ruleGSSModelFile=ruleGSSModelFile
	{ $current=$iv_ruleGSSModelFile.current; }
	EOF;

// Rule GSSModelFile
ruleGSSModelFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getImportsGSSModelFileImportParserRuleCall_0_0());
				}
				lv_imports_0_0=ruleGSSModelFileImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					add(
						$current,
						"imports",
						lv_imports_0_0,
						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSCampaignCampaignParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSCampaignCampaign
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSCampaignCampaign");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleGSSModelFileImport
entryRuleGSSModelFileImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSModelFileImportRule()); }
	iv_ruleGSSModelFileImport=ruleGSSModelFileImport
	{ $current=$iv_ruleGSSModelFileImport.current; }
	EOF;

// Rule GSSModelFileImport
ruleGSSModelFileImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
		}
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				lv_importURI_2_0=RULE_STRING
				{
					newLeafNode(lv_importURI_2_0, grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSModelFileImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleGSSCampaignCampaign
entryRuleGSSCampaignCampaign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSCampaignCampaignRule()); }
	iv_ruleGSSCampaignCampaign=ruleGSSCampaignCampaign
	{ $current=$iv_ruleGSSCampaignCampaign.current; }
	EOF;

// Rule GSSCampaignCampaign
ruleGSSCampaignCampaign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSCampaignCampaign'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSCampaignCampaignAccess().getGSSCampaignCampaignKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSCampaignCampaignAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSCampaignCampaignRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSCampaignCampaignAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='uri'
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSCampaignCampaignAccess().getUriKeyword_3_0());
			}
			otherlv_4=':='
			{
				newLeafNode(otherlv_4, grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getUriQualifiedNameParserRuleCall_3_2_0());
					}
					lv_uri_5_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
						}
						set(
							$current,
							"uri",
							lv_uri_5_0,
							"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_3_3());
			}
		)
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSCampaignCampaignAccess().getVersionKeyword_4());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getVersionVersionParserRuleCall_6_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
					}
					set(
						$current,
						"version",
						lv_version_9_0,
						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSCampaignScenarioParserRuleCall_8_0());
				}
				lv_Scenario_11_0=ruleGSSCampaignScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
					}
					set(
						$current,
						"Scenario",
						lv_Scenario_11_0,
						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSCampaignScenario");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSTestListTestListParserRuleCall_9_0());
				}
				lv_Tests_12_0=ruleGSSTestListTestList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
					}
					set(
						$current,
						"Tests",
						lv_Tests_12_0,
						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListTestList");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSCampaignCampaignAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSCampaignScenario
entryRuleGSSCampaignScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSCampaignScenarioRule()); }
	iv_ruleGSSCampaignScenario=ruleGSSCampaignScenario
	{ $current=$iv_ruleGSSCampaignScenario.current; }
	EOF;

// Rule GSSCampaignScenario
ruleGSSCampaignScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSCampaignScenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSCampaignScenarioAccess().getGSSCampaignScenarioKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSCampaignScenarioAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='environment'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSCampaignScenarioRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_5());
		}
		otherlv_6='scenarioRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSCampaignScenarioRule());
					}
				}
				otherlv_8=RULE_STRING
				{
					newLeafNode(otherlv_8, grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefGSSScenarioScenarioCrossReference_8_0());
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSCampaignScenarioAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTestListTestList
entryRuleGSSTestListTestList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestListTestListRule()); }
	iv_ruleGSSTestListTestList=ruleGSSTestListTestList
	{ $current=$iv_ruleGSSTestListTestList.current; }
	EOF;

// Rule GSSTestListTestList
ruleGSSTestListTestList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestListTestList'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestListTestListAccess().getGSSTestListTestListKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestListTestListAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestListTestListAccess().getTestCaseGSSTestListTestCaseParserRuleCall_2_0());
				}
				lv_TestCase_2_0=ruleGSSTestListTestCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestListTestListRule());
					}
					add(
						$current,
						"TestCase",
						lv_TestCase_2_0,
						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListTestCase");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestListTestListAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSTestListTestListAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSTestListTestCase
entryRuleGSSTestListTestCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestListTestCaseRule()); }
	iv_ruleGSSTestListTestCase=ruleGSSTestListTestCase
	{ $current=$iv_ruleGSSTestListTestCase.current; }
	EOF;

// Rule GSSTestListTestCase
ruleGSSTestListTestCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestListTestCase'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestListTestCaseAccess().getGSSTestListTestCaseKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestListTestCaseAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestListTestCaseAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestListTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_5());
		}
		otherlv_6='procedure'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestListTestCaseAccess().getProcedureKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSTestListTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='prevMsg'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgKeyword_10_0());
			}
			(
				(
					lv_prevMsg_11_0=RULE_ID
					{
						newLeafNode(lv_prevMsg_11_0, grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgIDTerminalRuleCall_10_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
						}
						setWithLastConsumed(
							$current,
							"prevMsg",
							lv_prevMsg_11_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_12='prevAction'
			{
				newLeafNode(otherlv_12, grammarAccess.getGSSTestListTestCaseAccess().getPrevActionKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0());
					}
					lv_prevAction_13_0=ruleGSSTestListPrevAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestListTestCaseRule());
						}
						set(
							$current,
							"prevAction",
							lv_prevAction_13_0,
							"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListPrevAction");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14='prevActionParam'
				{
					newLeafNode(otherlv_14, grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamKeyword_11_2_0());
				}
				(
					(
						lv_prevActionParam_15_0=RULE_STRING
						{
							newLeafNode(lv_prevActionParam_15_0, grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamSTRINGTerminalRuleCall_11_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
							}
							setWithLastConsumed(
								$current,
								"prevActionParam",
								lv_prevActionParam_15_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)?
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSTestListTestCaseAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleVersion
entryRuleVersion returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionRule()); }
	iv_ruleVersion=ruleVersion
	{ $current=$iv_ruleVersion.current.getText(); }
	EOF;

// Rule Version
ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
			}
			    |
			(
				(
					this_INT_1=RULE_INT
					{
						$current.merge(this_INT_1);
					}
					{
						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
					}
				)?
				this_ID_2=RULE_ID
				{
					$current.merge(this_ID_2);
				}
				{
					newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
				}
			)
		)
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
			}
			(
				this_INT_4=RULE_INT
				{
					$current.merge(this_INT_4);
				}
				{
					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
				}
				    |
				(
					(
						this_INT_5=RULE_INT
						{
							$current.merge(this_INT_5);
						}
						{
							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
						}
					)?
					this_ID_6=RULE_ID
					{
						$current.merge(this_ID_6);
					}
					{
						newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); }
	iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName
	{ $current=$iv_ruleVersionedQualifiedName.current.getText(); }
	EOF;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
		}
		this_Version_2=ruleVersion
		{
			$current.merge(this_Version_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Rule GSSTestListPrevAction
ruleGSSTestListPrevAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='1'
		{
			$current = grammarAccess.getGSSTestListPrevActionAccess().getResetEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSTestListPrevActionAccess().getResetEnumLiteralDeclaration());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
