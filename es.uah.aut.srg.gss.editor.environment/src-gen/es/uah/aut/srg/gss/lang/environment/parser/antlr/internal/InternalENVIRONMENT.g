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
grammar InternalENVIRONMENT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.environment.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.environment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private ENVIRONMENTGrammarAccess grammarAccess;

    public InternalENVIRONMENTParser(TokenStream input, ENVIRONMENTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected ENVIRONMENTGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSEnvironmentGSSEnvironment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSEnvironment");
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

// Entry rule entryRuleGSSEnvironmentGSSEnvironment
entryRuleGSSEnvironmentGSSEnvironment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentRule()); }
	iv_ruleGSSEnvironmentGSSEnvironment=ruleGSSEnvironmentGSSEnvironment
	{ $current=$iv_ruleGSSEnvironmentGSSEnvironment.current; }
	EOF;

// Rule GSSEnvironmentGSSEnvironment
ruleGSSEnvironmentGSSEnvironment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentEnvironment'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='uri'
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriKeyword_3_0());
			}
			otherlv_4=':='
			{
				newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0());
					}
					lv_uri_5_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
						}
						set(
							$current,
							"uri",
							lv_uri_5_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_3_3());
			}
		)
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionKeyword_4());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionVersionParserRuleCall_6_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
					}
					set(
						$current,
						"version",
						lv_version_9_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioGSSEnvironmentScenarioParserRuleCall_8_0());
				}
				lv_scenario_11_0=ruleGSSEnvironmentScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
					}
					add(
						$current,
						"scenario",
						lv_scenario_11_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentScenario");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentScenario
entryRuleGSSEnvironmentScenario returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentScenarioRule()); }
	iv_ruleGSSEnvironmentScenario=ruleGSSEnvironmentScenario
	{ $current=$iv_ruleGSSEnvironmentScenario.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSEnvironmentScenario
ruleGSSEnvironmentScenario returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentScenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentScenarioAccess().getGSSEnvironmentScenarioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSEnvironmentScenarioAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentScenarioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentScenarioAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsGSSEnvironmentOptionsParserRuleCall_3_0());
				}
				lv_gss_options_3_0=ruleGSSEnvironmentOptions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
					}
					set(
						$current,
						"gss_options",
						lv_gss_options_3_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentOptions");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsGSSEnvironmentProtocolsParserRuleCall_4_0());
				}
				lv_Protocols_4_0=ruleGSSEnvironmentProtocols
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
					}
					set(
						$current,
						"Protocols",
						lv_Protocols_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentProtocols");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesGSSEnvironmentInterfacesParserRuleCall_5_0());
				}
				lv_Interfaces_5_0=ruleGSSEnvironmentInterfaces
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
					}
					set(
						$current,
						"Interfaces",
						lv_Interfaces_5_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaces");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_6_0());
				}
				lv_SpecialPackets_6_0=ruleGSSEnvironmentSpecialPackets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
					}
					set(
						$current,
						"SpecialPackets",
						lv_SpecialPackets_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentSpecialPackets");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_7_0());
				}
				lv_PeriodicTCs_7_0=ruleGSSEnvironmentPeriodicTCs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
					}
					set(
						$current,
						"PeriodicTCs",
						lv_PeriodicTCs_7_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_8_0_0());
									}
									lv_GlobalVars_9_0=ruleGSSEnvironmentGlobalVars
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
										}
										set(
											$current,
											"GlobalVars",
											lv_GlobalVars_9_0,
											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVars");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsGSSEnvironmentMonitorsParserRuleCall_8_1_0());
									}
									lv_Monitors_10_0=ruleGSSEnvironmentMonitors
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
										}
										set(
											$current,
											"Monitors",
											lv_Monitors_10_0,
											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentMonitors");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());
				}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentScenarioAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentScenarioAccess().getSemicolonKeyword_10());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSEnvironmentOptions
entryRuleGSSEnvironmentOptions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentOptionsRule()); }
	iv_ruleGSSEnvironmentOptions=ruleGSSEnvironmentOptions
	{ $current=$iv_ruleGSSEnvironmentOptions.current; }
	EOF;

// Rule GSSEnvironmentOptions
ruleGSSEnvironmentOptions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentOptions'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentOptionsAccess().getGSSEnvironmentOptionsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentOptionsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0());
				}
				lv_gss_info_2_0=ruleGSSEnvironmentGSSInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
					}
					set(
						$current,
						"gss_info",
						lv_gss_info_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0());
				}
				lv_gss_info_print_3_0=ruleGSSEnvironmentGSSInfoPrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
					}
					set(
						$current,
						"gss_info_print",
						lv_gss_info_print_3_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSInfoPrint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0());
				}
				lv_phy_header_print_4_0=ruleGSSEnvironmentPhyHeaderPrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
					}
					set(
						$current,
						"phy_header_print",
						lv_phy_header_print_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPhyHeaderPrint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0());
				}
				lv_discardErrorFlags_5_0=ruleGSSEnvironmentGSSDiscardErrorFlags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
					}
					set(
						$current,
						"discardErrorFlags",
						lv_discardErrorFlags_5_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSDiscardErrorFlags");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentOptionsAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentOptionsAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentProtocols
entryRuleGSSEnvironmentProtocols returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentProtocolsRule()); }
	iv_ruleGSSEnvironmentProtocols=ruleGSSEnvironmentProtocols
	{ $current=$iv_ruleGSSEnvironmentProtocols.current; }
	EOF;

// Rule GSSEnvironmentProtocols
ruleGSSEnvironmentProtocols returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentProtocols'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentProtocolsAccess().getGSSEnvironmentProtocolsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentProtocolsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolGSSEnvironmentProtocolParserRuleCall_2_0());
				}
				lv_Protocol_2_0=ruleGSSEnvironmentProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolsRule());
					}
					add(
						$current,
						"Protocol",
						lv_Protocol_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentProtocol");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentProtocolsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentProtocolsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentInterfaces
entryRuleGSSEnvironmentInterfaces returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesRule()); }
	iv_ruleGSSEnvironmentInterfaces=ruleGSSEnvironmentInterfaces
	{ $current=$iv_ruleGSSEnvironmentInterfaces.current; }
	EOF;

// Rule GSSEnvironmentInterfaces
ruleGSSEnvironmentInterfaces returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentInterfaces'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentInterfacesAccess().getGSSEnvironmentInterfacesKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentInterfacesAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='ProtocolPacketsFile'
			{
				newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentInterfacesAccess().getProtocolPacketsFileKeyword_2_0());
			}
			otherlv_3=':='
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentInterfacesAccess().getColonEqualsSignKeyword_2_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentInterfacesRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentInterfacesAccess().getSemicolonKeyword_2_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_3_0());
				}
				lv_MainInterface_6_0=ruleGSSEnvironmentMainInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfacesRule());
					}
					set(
						$current,
						"MainInterface",
						lv_MainInterface_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentMainInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceGSSEnvironmentInterfaceParserRuleCall_4_0());
				}
				lv_Interface_7_0=ruleGSSEnvironmentInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfacesRule());
					}
					add(
						$current,
						"Interface",
						lv_Interface_7_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentInterfacesAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentInterfacesAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentSpecialPackets
entryRuleGSSEnvironmentSpecialPackets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketsRule()); }
	iv_ruleGSSEnvironmentSpecialPackets=ruleGSSEnvironmentSpecialPackets
	{ $current=$iv_ruleGSSEnvironmentSpecialPackets.current; }
	EOF;

// Rule GSSEnvironmentSpecialPackets
ruleGSSEnvironmentSpecialPackets returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentSpecialPackets'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGSSEnvironmentSpecialPacketsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0());
				}
				lv_SpecialPacket_2_0=ruleGSSEnvironmentSpecialPacket
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketsRule());
					}
					add(
						$current,
						"SpecialPacket",
						lv_SpecialPacket_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentSpecialPacket");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPeriodicTCs
entryRuleGSSEnvironmentPeriodicTCs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsRule()); }
	iv_ruleGSSEnvironmentPeriodicTCs=ruleGSSEnvironmentPeriodicTCs
	{ $current=$iv_ruleGSSEnvironmentPeriodicTCs.current; }
	EOF;

// Rule GSSEnvironmentPeriodicTCs
ruleGSSEnvironmentPeriodicTCs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSEnvironmentPeriodicTCs'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0());
					}
					lv_PeriodicTC_level_2_3_0=ruleGSSEnvironmentPeriodicTCLevel2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCsRule());
						}
						add(
							$current,
							"PeriodicTC_level_2",
							lv_PeriodicTC_level_2_3_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel2");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0());
					}
					lv_PeriodicTC_level_1_4_0=ruleGSSEnvironmentPeriodicTCLevel1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCsRule());
						}
						add(
							$current,
							"PeriodicTC_level_1",
							lv_PeriodicTC_level_1_4_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel1");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0());
					}
					lv_PeriodicTC_level_0_5_0=ruleGSSEnvironmentPeriodicTCLevel0
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCsRule());
						}
						add(
							$current,
							"PeriodicTC_level_0",
							lv_PeriodicTC_level_0_5_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel0");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGlobalVars
entryRuleGSSEnvironmentGlobalVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarsRule()); }
	iv_ruleGSSEnvironmentGlobalVars=ruleGSSEnvironmentGlobalVars
	{ $current=$iv_ruleGSSEnvironmentGlobalVars.current; }
	EOF;

// Rule GSSEnvironmentGlobalVars
ruleGSSEnvironmentGlobalVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentGlobalVars'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGSSEnvironmentGlobalVarsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0());
				}
				lv_GlobalVar_2_0=ruleGSSEnvironmentGlobalVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarsRule());
					}
					add(
						$current,
						"GlobalVar",
						lv_GlobalVar_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVar");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentMonitors
entryRuleGSSEnvironmentMonitors returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsRule()); }
	iv_ruleGSSEnvironmentMonitors=ruleGSSEnvironmentMonitors
	{ $current=$iv_ruleGSSEnvironmentMonitors.current; }
	EOF;

// Rule GSSEnvironmentMonitors
ruleGSSEnvironmentMonitors returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentMonitors'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentMonitorsAccess().getGSSEnvironmentMonitorsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentMonitorsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='ChartsFile'
			{
				newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileKeyword_2_0());
			}
			otherlv_3=':='
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentMonitorsAccess().getColonEqualsSignKeyword_2_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentMonitorsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_2_3());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotGSSEnvironmentPlotParserRuleCall_3_0_0());
					}
					lv_plot_6_0=ruleGSSEnvironmentPlot
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
						}
						add(
							$current,
							"plot",
							lv_plot_6_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPlot");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0());
					}
					lv_alarmMsg_7_0=ruleGSSEnvironmentAlarmMsg
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
						}
						add(
							$current,
							"alarmMsg",
							lv_alarmMsg_7_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmMsg");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyGSSEnvironmentModifyParserRuleCall_3_2_0());
					}
					lv_modify_8_0=ruleGSSEnvironmentModify
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
						}
						add(
							$current,
							"modify",
							lv_modify_8_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentModify");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0());
					}
					lv_alarmVal_9_0=ruleGSSEnvironmentAlarmVal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
						}
						add(
							$current,
							"alarmVal",
							lv_alarmVal_9_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmVal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentMonitorsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGSSInfo
entryRuleGSSEnvironmentGSSInfo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoRule()); }
	iv_ruleGSSEnvironmentGSSInfo=ruleGSSEnvironmentGSSInfo
	{ $current=$iv_ruleGSSEnvironmentGSSInfo.current; }
	EOF;

// Rule GSSEnvironmentGSSInfo
ruleGSSEnvironmentGSSInfo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentInfo'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSInfoAccess().getGSSEnvironmentInfoKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGSSInfoAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='test_campaign'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_test_campaign_4_0=RULE_STRING
				{
					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentGSSInfoRule());
					}
					setWithLastConsumed(
						$current,
						"test_campaign",
						lv_test_campaign_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_5());
		}
		otherlv_6='version'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionVersionParserRuleCall_8_0());
				}
				lv_version_8_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoRule());
					}
					set(
						$current,
						"version",
						lv_version_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_9());
		}
		otherlv_10='date'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateDATEParserRuleCall_12_0());
				}
				lv_date_12_0=ruleDATE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoRule());
					}
					set(
						$current,
						"date",
						lv_date_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.DATE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='version_control_url'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0());
					}
					lv_version_control_url_16_0=ruleURL
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoRule());
						}
						set(
							$current,
							"version_control_url",
							lv_version_control_url_16_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.URL");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentGSSInfoAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGSSInfoPrint
entryRuleGSSEnvironmentGSSInfoPrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintRule()); }
	iv_ruleGSSEnvironmentGSSInfoPrint=ruleGSSEnvironmentGSSInfoPrint
	{ $current=$iv_ruleGSSEnvironmentGSSInfoPrint.current; }
	EOF;

// Rule GSSEnvironmentGSSInfoPrint
ruleGSSEnvironmentGSSInfoPrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentInfoPrint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGSSEnvironmentInfoPrintKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='mainLog'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0());
				}
				lv_mainLog_4_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoPrintRule());
					}
					set(
						$current,
						"mainLog",
						lv_mainLog_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_5());
		}
		otherlv_6='portLogs'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0());
				}
				lv_portLogs_8_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoPrintRule());
					}
					set(
						$current,
						"portLogs",
						lv_portLogs_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rawLog'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0());
				}
				lv_rawLog_12_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoPrintRule());
					}
					set(
						$current,
						"rawLog",
						lv_rawLog_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPhyHeaderPrint
entryRuleGSSEnvironmentPhyHeaderPrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule()); }
	iv_ruleGSSEnvironmentPhyHeaderPrint=ruleGSSEnvironmentPhyHeaderPrint
	{ $current=$iv_ruleGSSEnvironmentPhyHeaderPrint.current; }
	EOF;

// Rule GSSEnvironmentPhyHeaderPrint
ruleGSSEnvironmentPhyHeaderPrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPhyHeaderPrint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGSSEnvironmentPhyHeaderPrintKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='mainLog'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0());
				}
				lv_mainLog_4_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
					}
					set(
						$current,
						"mainLog",
						lv_mainLog_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_5());
		}
		otherlv_6='portLogs'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0());
				}
				lv_portLogs_8_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
					}
					set(
						$current,
						"portLogs",
						lv_portLogs_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rawLog'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0());
				}
				lv_rawLog_12_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
					}
					set(
						$current,
						"rawLog",
						lv_rawLog_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_13());
		}
		otherlv_14='gssTabs'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0());
				}
				lv_gssTabs_16_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
					}
					set(
						$current,
						"gssTabs",
						lv_gssTabs_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGSSDiscardErrorFlags
entryRuleGSSEnvironmentGSSDiscardErrorFlags returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule()); }
	iv_ruleGSSEnvironmentGSSDiscardErrorFlags=ruleGSSEnvironmentGSSDiscardErrorFlags
	{ $current=$iv_ruleGSSEnvironmentGSSDiscardErrorFlags.current; }
	EOF;

// Rule GSSEnvironmentGSSDiscardErrorFlags
ruleGSSEnvironmentGSSDiscardErrorFlags returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentDiscardErrorFlags'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGSSEnvironmentDiscardErrorFlagsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='txErrors'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0());
				}
				lv_txErrors_4_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"txErrors",
						lv_txErrors_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
		}
		otherlv_6='notExpectedPackets'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0());
				}
				lv_notExpectedPackets_8_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"notExpectedPackets",
						lv_notExpectedPackets_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
		}
		otherlv_10='filtersKo'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0());
				}
				lv_filtersKo_12_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"filtersKo",
						lv_filtersKo_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
		}
		otherlv_14='validTimesKo'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0());
				}
				lv_validTimesKo_16_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"validTimesKo",
						lv_validTimesKo_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentProtocol
entryRuleGSSEnvironmentProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentProtocolRule()); }
	iv_ruleGSSEnvironmentProtocol=ruleGSSEnvironmentProtocol
	{ $current=$iv_ruleGSSEnvironmentProtocol.current; }
	EOF;

// Rule GSSEnvironmentProtocol
ruleGSSEnvironmentProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentProtocol'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentProtocolAccess().getGSSEnvironmentProtocolKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentProtocolAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentProtocolAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentProtocolAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentProtocolAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentProtocolRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_9());
		}
		otherlv_10='typeLevel'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0());
				}
				lv_typeLevel_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
					}
					set(
						$current,
						"typeLevel",
						lv_typeLevel_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_13());
		}
		otherlv_14='typeOffset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0());
				}
				lv_typeOffset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
					}
					set(
						$current,
						"typeOffset",
						lv_typeOffset_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_17());
		}
		(
			otherlv_18='subtypeOffset'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetKeyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0());
					}
					lv_subtypeOffset_20_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
						}
						set(
							$current,
							"subtypeOffset",
							lv_subtypeOffset_20_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentProtocolAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentMainInterface
entryRuleGSSEnvironmentMainInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceRule()); }
	iv_ruleGSSEnvironmentMainInterface=ruleGSSEnvironmentMainInterface
	{ $current=$iv_ruleGSSEnvironmentMainInterface.current; }
	EOF;

// Rule GSSEnvironmentMainInterface
ruleGSSEnvironmentMainInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentMainInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGSSEnvironmentMainInterfaceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='ifType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0());
				}
				lv_ifType_12_0=ruleGSSEnvironmentInterfaceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
					}
					set(
						$current,
						"ifType",
						lv_ifType_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifConfig'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_17());
		}
		otherlv_18='ioType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0());
				}
				lv_ioType_20_0=ruleGSSEnvironmentInterfaceIOType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
					}
					set(
						$current,
						"ioType",
						lv_ioType_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceIOType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='protocolID'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0());
				}
				lv_LevelInOut_26_0=ruleGSSEnvironmentLevelInOut
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
					}
					add(
						$current,
						"LevelInOut",
						lv_LevelInOut_26_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelInOut");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_28=';'
		{
			newLeafNode(otherlv_28, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentInterface
entryRuleGSSEnvironmentInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceRule()); }
	iv_ruleGSSEnvironmentInterface=ruleGSSEnvironmentInterface
	{ $current=$iv_ruleGSSEnvironmentInterface.current; }
	EOF;

// Rule GSSEnvironmentInterface
ruleGSSEnvironmentInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentInterfaceAccess().getGSSEnvironmentInterfaceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentInterfaceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentInterfaceAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentInterfaceAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='ifType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0());
				}
				lv_ifType_12_0=ruleGSSEnvironmentInterfaceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
					}
					set(
						$current,
						"ifType",
						lv_ifType_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifConfig'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_17());
		}
		otherlv_18='ioType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0());
				}
				lv_ioType_20_0=ruleGSSEnvironmentInterfaceIOType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
					}
					set(
						$current,
						"ioType",
						lv_ioType_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceIOType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='protocolID'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0());
					}
					lv_LevelInOut_26_0=ruleGSSEnvironmentLevelInOut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
						}
						add(
							$current,
							"LevelInOut",
							lv_LevelInOut_26_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelInOut");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0());
					}
					lv_LevelIn_27_0=ruleGSSEnvironmentLevelIn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
						}
						add(
							$current,
							"LevelIn",
							lv_LevelIn_27_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelIn");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0());
					}
					lv_LevelOut_28_0=ruleGSSEnvironmentLevelOut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
						}
						add(
							$current,
							"LevelOut",
							lv_LevelOut_28_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelOut");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_29='}'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentInterfaceAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_30=';'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentLevelInOut
entryRuleGSSEnvironmentLevelInOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutRule()); }
	iv_ruleGSSEnvironmentLevelInOut=ruleGSSEnvironmentLevelInOut
	{ $current=$iv_ruleGSSEnvironmentLevelInOut.current; }
	EOF;

// Rule GSSEnvironmentLevelInOut
ruleGSSEnvironmentLevelInOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentLevelInOut'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentLevelInOutAccess().getGSSEnvironmentLevelInOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentLevelInOutAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentLevelInOutRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TMformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatGSSFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_13());
		}
		otherlv_14='TCformat'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatGSSFormatFormatCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_17());
		}
		otherlv_18='inputFilter'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterGSSFilterFilterCrossReference_20_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='export_to_prev_Level'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			otherlv_26='import_from_prev_Level'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0());
			}
			otherlv_27=':='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_23_3());
			}
		)?
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentLevelInOutAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentLevelIn
entryRuleGSSEnvironmentLevelIn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentLevelInRule()); }
	iv_ruleGSSEnvironmentLevelIn=ruleGSSEnvironmentLevelIn
	{ $current=$iv_ruleGSSEnvironmentLevelIn.current; }
	EOF;

// Rule GSSEnvironmentLevelIn
ruleGSSEnvironmentLevelIn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentLevelIn'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentLevelInAccess().getGSSEnvironmentLevelInKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentLevelInAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentLevelInAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentLevelInRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentLevelInAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentLevelInAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TCformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatGSSFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='export_to_prev_Level'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentLevelInRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentLevelInAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentLevelOut
entryRuleGSSEnvironmentLevelOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutRule()); }
	iv_ruleGSSEnvironmentLevelOut=ruleGSSEnvironmentLevelOut
	{ $current=$iv_ruleGSSEnvironmentLevelOut.current; }
	EOF;

// Rule GSSEnvironmentLevelOut
ruleGSSEnvironmentLevelOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentLevelOut'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentLevelOutAccess().getGSSEnvironmentLevelOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentLevelOutAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentLevelOutAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentLevelOutRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentLevelOutAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TMformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatGSSFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_13());
		}
		otherlv_14='inputFilter'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterGSSFilterFilterCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_17());
		}
		(
			otherlv_18='import_from_prev_Level'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelKeyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentLevelOutAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentSpecialPacket
entryRuleGSSEnvironmentSpecialPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketRule()); }
	iv_ruleGSSEnvironmentSpecialPacket=ruleGSSEnvironmentSpecialPacket
	{ $current=$iv_ruleGSSEnvironmentSpecialPacket.current; }
	EOF;

// Rule GSSEnvironmentSpecialPacket
ruleGSSEnvironmentSpecialPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentSpecialPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGSSEnvironmentSpecialPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='status'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0());
				}
				lv_status_4_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					set(
						$current,
						"status",
						lv_status_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='id'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0());
				}
				lv_id_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					set(
						$current,
						"id",
						lv_id_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0());
				}
				lv_ifRef_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='levels'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0());
				}
				lv_levels_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					set(
						$current,
						"levels",
						lv_levels_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='levelRef'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0());
				}
				lv_levelRef_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					set(
						$current,
						"levelRef",
						lv_levelRef_24_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_25());
		}
		otherlv_26='inputFilter'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterKeyword_26());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_27());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterGSSFilterFilterCrossReference_28_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_29());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0());
				}
				lv_UpperLevels_30_0=ruleGSSEnvironmentUpperLevels
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					add(
						$current,
						"UpperLevels",
						lv_UpperLevels_30_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevels");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0());
				}
				lv_printingData_31_0=ruleGSSEnvironmentPrintingData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
					}
					set(
						$current,
						"printingData",
						lv_printingData_31_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPrintingData");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0());
					}
					lv_period_32_0=ruleGSSEnvironmentPeriod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
						}
						set(
							$current,
							"period",
							lv_period_32_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriod");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0());
					}
					lv_intervalRange_33_0=ruleGSSEnvironmentIntervalRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
						}
						set(
							$current,
							"intervalRange",
							lv_intervalRange_33_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentIntervalRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getRightCurlyBracketKeyword_33());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_34());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentUpperLevels
entryRuleGSSEnvironmentUpperLevels returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelsRule()); }
	iv_ruleGSSEnvironmentUpperLevels=ruleGSSEnvironmentUpperLevels
	{ $current=$iv_ruleGSSEnvironmentUpperLevels.current; }
	EOF;

// Rule GSSEnvironmentUpperLevels
ruleGSSEnvironmentUpperLevels returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentUpperLevels'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGSSEnvironmentUpperLevelsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0());
				}
				lv_UpperLevel_2_0=ruleGSSEnvironmentUpperLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentUpperLevelsRule());
					}
					add(
						$current,
						"UpperLevel",
						lv_UpperLevel_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPrintingData
entryRuleGSSEnvironmentPrintingData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPrintingDataRule()); }
	iv_ruleGSSEnvironmentPrintingData=ruleGSSEnvironmentPrintingData
	{ $current=$iv_ruleGSSEnvironmentPrintingData.current; }
	EOF;

// Rule GSSEnvironmentPrintingData
ruleGSSEnvironmentPrintingData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPrintingData'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPrintingDataAccess().getGSSEnvironmentPrintingDataKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPrintingDataAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='printStatus'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPrintingDataAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0());
				}
				lv_printStatus_4_0=ruleGSSEnvironmentEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPrintingDataRule());
					}
					set(
						$current,
						"printStatus",
						lv_printStatus_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0());
				}
				lv_structuredData_6_0=ruleGSSEnvironmentStructuredData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPrintingDataRule());
					}
					set(
						$current,
						"structuredData",
						lv_structuredData_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentStructuredData");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPrintingDataAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPeriod
entryRuleGSSEnvironmentPeriod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPeriodRule()); }
	iv_ruleGSSEnvironmentPeriod=ruleGSSEnvironmentPeriod
	{ $current=$iv_ruleGSSEnvironmentPeriod.current; }
	EOF;

// Rule GSSEnvironmentPeriod
ruleGSSEnvironmentPeriod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPeriod'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodAccess().getGSSEnvironmentPeriodKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='min_value'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0());
				}
				lv_min_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
					}
					set(
						$current,
						"min_value",
						lv_min_value_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_5());
		}
		otherlv_6='min_unit'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitGSSEnvironmentUnitEnumRuleCall_8_0());
				}
				lv_min_unit_8_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
					}
					set(
						$current,
						"min_unit",
						lv_min_unit_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_9());
		}
		otherlv_10='max_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0());
				}
				lv_max_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
					}
					set(
						$current,
						"max_value",
						lv_max_value_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_13());
		}
		otherlv_14='max_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitGSSEnvironmentUnitEnumRuleCall_16_0());
				}
				lv_max_unit_16_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
					}
					set(
						$current,
						"max_unit",
						lv_max_unit_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentIntervalRange
entryRuleGSSEnvironmentIntervalRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeRule()); }
	iv_ruleGSSEnvironmentIntervalRange=ruleGSSEnvironmentIntervalRange
	{ $current=$iv_ruleGSSEnvironmentIntervalRange.current; }
	EOF;

// Rule GSSEnvironmentIntervalRange
ruleGSSEnvironmentIntervalRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentIntervalRange'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGSSEnvironmentIntervalRangeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='min'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0());
				}
				lv_min_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
					}
					set(
						$current,
						"min",
						lv_min_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='max'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0());
				}
				lv_max_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
					}
					set(
						$current,
						"max",
						lv_max_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='interval_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0());
				}
				lv_interval_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
					}
					set(
						$current,
						"interval_value",
						lv_interval_value_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_13());
		}
		otherlv_14='interval_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0());
				}
				lv_interval_unit_16_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
					}
					set(
						$current,
						"interval_unit",
						lv_interval_unit_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentUpperLevel
entryRuleGSSEnvironmentUpperLevel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelRule()); }
	iv_ruleGSSEnvironmentUpperLevel=ruleGSSEnvironmentUpperLevel
	{ $current=$iv_ruleGSSEnvironmentUpperLevel.current; }
	EOF;

// Rule GSSEnvironmentUpperLevel
ruleGSSEnvironmentUpperLevel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentUpperLevel'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentUpperLevelAccess().getGSSEnvironmentUpperLevelKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentUpperLevelAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='level'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0());
				}
				lv_level_4_0=ruleGSSEnvironmentUpperLevelLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentUpperLevelRule());
					}
					set(
						$current,
						"level",
						lv_level_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevelLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='TMformat'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatGSSFormatFormatCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_6_3());
			}
		)?
		(
			otherlv_10='inputFilter'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterKeyword_7_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_7_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterGSSFilterFilterCrossReference_7_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_7_3());
			}
		)?
		(
			otherlv_14='import_from_prev_Level'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_8_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_8_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentUpperLevelAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentStructuredData
entryRuleGSSEnvironmentStructuredData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentStructuredDataRule()); }
	iv_ruleGSSEnvironmentStructuredData=ruleGSSEnvironmentStructuredData
	{ $current=$iv_ruleGSSEnvironmentStructuredData.current; }
	EOF;

// Rule GSSEnvironmentStructuredData
ruleGSSEnvironmentStructuredData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentStructuredData'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentStructuredDataAccess().getGSSEnvironmentStructuredDataKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentStructuredDataAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='levelRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0());
				}
				lv_levelRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentStructuredDataRule());
					}
					set(
						$current,
						"levelRef",
						lv_levelRef_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_5());
		}
		otherlv_6='firstField'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0());
				}
				lv_firstField_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentStructuredDataRule());
					}
					set(
						$current,
						"firstField",
						lv_firstField_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentStructuredDataAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPeriodicTCLevel2
entryRuleGSSEnvironmentPeriodicTCLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule()); }
	iv_ruleGSSEnvironmentPeriodicTCLevel2=ruleGSSEnvironmentPeriodicTCLevel2
	{ $current=$iv_ruleGSSEnvironmentPeriodicTCLevel2.current; }
	EOF;

// Rule GSSEnvironmentPeriodicTCLevel2
ruleGSSEnvironmentPeriodicTCLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPeriodicTCLevel2'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGSSEnvironmentPeriodicTCLevel2Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level2'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2GSSFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level2'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2GSSExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_26());
		}
		(
			otherlv_30='level1'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Keyword_27_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1GSSFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_34='level2_to_level1'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_28_3());
			}
		)?
		(
			otherlv_38='level0'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Keyword_29_0());
			}
			otherlv_39=':='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0GSSFormatFormatCrossReference_29_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_41=';'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_29_3());
			}
		)?
		(
			otherlv_42='level1_to_level0'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0());
			}
			otherlv_43=':='
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_30_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_45=';'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_30_3());
			}
		)?
		otherlv_46='}'
		{
			newLeafNode(otherlv_46, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31());
		}
		otherlv_47=';'
		{
			newLeafNode(otherlv_47, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPeriodicTCLevel1
entryRuleGSSEnvironmentPeriodicTCLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule()); }
	iv_ruleGSSEnvironmentPeriodicTCLevel1=ruleGSSEnvironmentPeriodicTCLevel1
	{ $current=$iv_ruleGSSEnvironmentPeriodicTCLevel1.current; }
	EOF;

// Rule GSSEnvironmentPeriodicTCLevel1
ruleGSSEnvironmentPeriodicTCLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPeriodicTCLevel1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGSSEnvironmentPeriodicTCLevel1Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level1'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1GSSFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level1'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1GSSExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_26());
		}
		(
			otherlv_30='level0'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Keyword_27_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0GSSFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_34='level1_to_level0'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_28_3());
			}
		)?
		otherlv_38='}'
		{
			newLeafNode(otherlv_38, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29());
		}
		otherlv_39=';'
		{
			newLeafNode(otherlv_39, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPeriodicTCLevel0
entryRuleGSSEnvironmentPeriodicTCLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule()); }
	iv_ruleGSSEnvironmentPeriodicTCLevel0=ruleGSSEnvironmentPeriodicTCLevel0
	{ $current=$iv_ruleGSSEnvironmentPeriodicTCLevel0.current; }
	EOF;

// Rule GSSEnvironmentPeriodicTCLevel0
ruleGSSEnvironmentPeriodicTCLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPeriodicTCLevel0'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGSSEnvironmentPeriodicTCLevel0Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level0'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0GSSFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level0'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0GSSExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_26());
		}
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_28());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGlobalVar
entryRuleGSSEnvironmentGlobalVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarRule()); }
	iv_ruleGSSEnvironmentGlobalVar=ruleGSSEnvironmentGlobalVar
	{ $current=$iv_ruleGSSEnvironmentGlobalVar.current; }
	EOF;

// Rule GSSEnvironmentGlobalVar
ruleGSSEnvironmentGlobalVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentGlobalVar'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGlobalVarAccess().getGSSEnvironmentGlobalVarKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGlobalVarAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentGlobalVarRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_9());
		}
		otherlv_10='type'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0());
				}
				lv_type_12_0=ruleGSSEnvironmentGlobalVarType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
					}
					set(
						$current,
						"type",
						lv_type_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVarType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_13());
		}
		otherlv_14='initial_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0());
				}
				lv_initial_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
					}
					set(
						$current,
						"initial_value",
						lv_initial_value_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_17());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0());
					}
					lv_referenceField_18_0=ruleGSSEnvironmentReferenceField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
						}
						set(
							$current,
							"referenceField",
							lv_referenceField_18_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceField");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0());
					}
					lv_referencePeriodicTC_19_0=ruleGSSEnvironmentReferencePeriodicTC
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
						}
						set(
							$current,
							"referencePeriodicTC",
							lv_referencePeriodicTC_19_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferencePeriodicTC");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0());
					}
					lv_referenceSpecialPacket_20_0=ruleGSSEnvironmentReferenceSpecialPacket
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
						}
						set(
							$current,
							"referenceSpecialPacket",
							lv_referenceSpecialPacket_20_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceSpecialPacket");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentGlobalVarAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_22=';'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentReferenceField
entryRuleGSSEnvironmentReferenceField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldRule()); }
	iv_ruleGSSEnvironmentReferenceField=ruleGSSEnvironmentReferenceField
	{ $current=$iv_ruleGSSEnvironmentReferenceField.current; }
	EOF;

// Rule GSSEnvironmentReferenceField
ruleGSSEnvironmentReferenceField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentReferenceField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGSSEnvironmentReferenceFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleGSSEnvironmentReferenceFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='level'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0());
				}
				lv_level_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
					}
					set(
						$current,
						"level",
						lv_level_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_13());
		}
		otherlv_14='fieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0());
				}
				lv_fieldRef_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
					}
					set(
						$current,
						"fieldRef",
						lv_fieldRef_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_17());
		}
		otherlv_18='offset'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0());
				}
				lv_offset_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
					}
					set(
						$current,
						"offset",
						lv_offset_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_21());
		}
		otherlv_22='size'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0());
				}
				lv_size_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_24_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_25());
		}
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getRightCurlyBracketKeyword_26());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_27());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentReferencePeriodicTC
entryRuleGSSEnvironmentReferencePeriodicTC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule()); }
	iv_ruleGSSEnvironmentReferencePeriodicTC=ruleGSSEnvironmentReferencePeriodicTC
	{ $current=$iv_ruleGSSEnvironmentReferencePeriodicTC.current; }
	EOF;

// Rule GSSEnvironmentReferencePeriodicTC
ruleGSSEnvironmentReferencePeriodicTC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentReferencePeriodicTC'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGSSEnvironmentReferencePeriodicTCKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_5());
		}
		otherlv_6='level'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0());
				}
				lv_level_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
					}
					set(
						$current,
						"level",
						lv_level_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_9());
		}
		otherlv_10='fieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0());
				}
				lv_fieldRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
					}
					set(
						$current,
						"fieldRef",
						lv_fieldRef_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_13());
		}
		otherlv_14='offset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0());
				}
				lv_offset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
					}
					set(
						$current,
						"offset",
						lv_offset_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_17());
		}
		otherlv_18='size'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0());
				}
				lv_size_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
					}
					set(
						$current,
						"size",
						lv_size_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentReferenceSpecialPacket
entryRuleGSSEnvironmentReferenceSpecialPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule()); }
	iv_ruleGSSEnvironmentReferenceSpecialPacket=ruleGSSEnvironmentReferenceSpecialPacket
	{ $current=$iv_ruleGSSEnvironmentReferenceSpecialPacket.current; }
	EOF;

// Rule GSSEnvironmentReferenceSpecialPacket
ruleGSSEnvironmentReferenceSpecialPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentReferenceSpecialPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGSSEnvironmentReferenceSpecialPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='level'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0());
				}
				lv_level_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
					}
					set(
						$current,
						"level",
						lv_level_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='fieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0());
				}
				lv_fieldRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
					}
					set(
						$current,
						"fieldRef",
						lv_fieldRef_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='offset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0());
				}
				lv_offset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
					}
					set(
						$current,
						"offset",
						lv_offset_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='size'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0());
				}
				lv_size_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
					}
					set(
						$current,
						"size",
						lv_size_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentPlot
entryRuleGSSEnvironmentPlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentPlotRule()); }
	iv_ruleGSSEnvironmentPlot=ruleGSSEnvironmentPlot
	{ $current=$iv_ruleGSSEnvironmentPlot.current; }
	EOF;

// Rule GSSEnvironmentPlot
ruleGSSEnvironmentPlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentPlot'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPlotAccess().getGSSEnvironmentPlotKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPlotAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPlotAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPlotAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPlotRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_5());
		}
		otherlv_6='chartRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPlotAccess().getChartRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentPlotRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefGSSChartsChartCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_9());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0());
					}
					lv_GVFiltered_10_0=ruleGSSEnvironmentGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPlotRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_10_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0());
					}
					lv_GVPeriodic_11_0=ruleGSSEnvironmentGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentPlotRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_11_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentPlotAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentAlarmMsg
entryRuleGSSEnvironmentAlarmMsg returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgRule()); }
	iv_ruleGSSEnvironmentAlarmMsg=ruleGSSEnvironmentAlarmMsg
	{ $current=$iv_ruleGSSEnvironmentAlarmMsg.current; }
	EOF;

// Rule GSSEnvironmentAlarmMsg
ruleGSSEnvironmentAlarmMsg returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentAlarmMsg'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGSSEnvironmentAlarmMsgKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentAlarmMsgRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSEnvironmentAlarmMsgType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmMsgRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmMsgType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_9());
		}
		otherlv_10='text'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_text_12_0=RULE_STRING
				{
					newLeafNode(lv_text_12_0, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentAlarmMsgRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_13());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0());
					}
					lv_GVFiltered_14_0=ruleGSSEnvironmentGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmMsgRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_14_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0());
					}
					lv_GVPeriodic_15_0=ruleGSSEnvironmentGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmMsgRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_15_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentModify
entryRuleGSSEnvironmentModify returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentModifyRule()); }
	iv_ruleGSSEnvironmentModify=ruleGSSEnvironmentModify
	{ $current=$iv_ruleGSSEnvironmentModify.current; }
	EOF;

// Rule GSSEnvironmentModify
ruleGSSEnvironmentModify returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentModify'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentModifyAccess().getGSSEnvironmentModifyKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentModifyAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentModifyAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentModifyAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentModifyRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentModifyAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSEnvironmentModifyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentModifyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_9());
		}
		otherlv_10='value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentModifyAccess().getValueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getValueINTEGERParserRuleCall_12_0());
				}
				lv_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
					}
					set(
						$current,
						"value",
						lv_value_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_13());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0());
					}
					lv_GVFiltered_14_0=ruleGSSEnvironmentGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_14_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0());
					}
					lv_GVPeriodic_15_0=ruleGSSEnvironmentGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_15_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSEnvironmentModifyAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentAlarmVal
entryRuleGSSEnvironmentAlarmVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValRule()); }
	iv_ruleGSSEnvironmentAlarmVal=ruleGSSEnvironmentAlarmVal
	{ $current=$iv_ruleGSSEnvironmentAlarmVal.current; }
	EOF;

// Rule GSSEnvironmentAlarmVal
ruleGSSEnvironmentAlarmVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentAlarmVal'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentAlarmValAccess().getGSSEnvironmentAlarmValKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentAlarmValAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentAlarmValAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentAlarmValRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSEnvironmentAlarmValType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmValRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmValType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_9());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0());
					}
					lv_GVFiltered_10_0=ruleGSSEnvironmentGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmValRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_10_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0());
					}
					lv_GVPeriodic_11_0=ruleGSSEnvironmentGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmValRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_11_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentAlarmValAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGVFiltered
entryRuleGSSEnvironmentGVFiltered returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGVFilteredRule()); }
	iv_ruleGSSEnvironmentGVFiltered=ruleGSSEnvironmentGVFiltered
	{ $current=$iv_ruleGSSEnvironmentGVFiltered.current; }
	EOF;

// Rule GSSEnvironmentGVFiltered
ruleGSSEnvironmentGVFiltered returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentGVFiltered'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGVFilteredAccess().getGSSEnvironmentGVFilteredKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGVFilteredAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='GlobalVarRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentGVFilteredRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSEnvironmentGVFilteredRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterGSSFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGVFilteredAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSEnvironmentGVPeriodic
entryRuleGSSEnvironmentGVPeriodic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentGVPeriodicRule()); }
	iv_ruleGSSEnvironmentGVPeriodic=ruleGSSEnvironmentGVPeriodic
	{ $current=$iv_ruleGSSEnvironmentGVPeriodic.current; }
	EOF;

// Rule GSSEnvironmentGVPeriodic
ruleGSSEnvironmentGVPeriodic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentGVPeriodic'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGSSEnvironmentGVPeriodicKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='GlobalVarRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentGVPeriodicRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_5());
		}
		otherlv_6='period_value'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0());
				}
				lv_period_value_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGVPeriodicRule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_9());
		}
		otherlv_10='period_unit'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0());
				}
				lv_period_unit_12_0=ruleGSSEnvironmentUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentGVPeriodicRule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_15());
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

// Entry rule entryRuleVersionedQualifiedReferenceName
entryRuleVersionedQualifiedReferenceName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); }
	iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName
	{ $current=$iv_ruleVersionedQualifiedReferenceName.current.getText(); }
	EOF;

// Rule VersionedQualifiedReferenceName
ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
			}
			this_VersionedQualifiedName_0=ruleVersionedQualifiedName
			{
				$current.merge(this_VersionedQualifiedName_0);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
			}
		)?
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
		}
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
			}
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
			}
		)*
	)
;

// Entry rule entryRuleINTEGER
entryRuleINTEGER returns [String current=null]:
	{ newCompositeNode(grammarAccess.getINTEGERRule()); }
	iv_ruleINTEGER=ruleINTEGER
	{ $current=$iv_ruleINTEGER.current.getText(); }
	EOF;

// Rule INTEGER
ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0());
				}
			)?
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1());
			}
		)
		    |
		this_HEXADECIMAL_2=RULE_HEXADECIMAL
		{
			$current.merge(this_HEXADECIMAL_2);
		}
		{
			newLeafNode(this_HEXADECIMAL_2, grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleDATE
entryRuleDATE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDATERule()); }
	iv_ruleDATE=ruleDATE
	{ $current=$iv_ruleDATE.current.getText(); }
	EOF;

// Rule DATE
ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
		}
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
		}
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_3());
		}
		this_INT_4=RULE_INT
		{
			$current.merge(this_INT_4);
		}
		{
			newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleURL
entryRuleURL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getURLRule()); }
	iv_ruleURL=ruleURL
	{ $current=$iv_ruleURL.current.getText(); }
	EOF;

// Rule URL
ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getURLAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='+'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getURLAccess().getPlusSignKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getURLAccess().getIDTerminalRuleCall_1_1());
			}
		)?
		kw='://'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_2());
		}
		(
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0());
			}
			(
				kw='.'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getURLAccess().getFullStopKeyword_3_1());
				}
			)?
		)+
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_4_0());
			}
			this_ID_7=RULE_ID
			{
				$current.merge(this_ID_7);
			}
			{
				newLeafNode(this_ID_7, grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1());
			}
		)*
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_5());
			}
		)?
	)
;

// Rule GSSEnvironmentEnableDisable
ruleGSSEnvironmentEnableDisable returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='disabled'
			{
				$current = grammarAccess.getGSSEnvironmentEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='enabled'
			{
				$current = grammarAccess.getGSSEnvironmentEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSEnvironmentInterfaceType
ruleGSSEnvironmentInterfaceType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='SpW'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SpW_TC'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='SpW_Error'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='uart'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='dummy'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule GSSEnvironmentInterfaceIOType
ruleGSSEnvironmentInterfaceIOType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='in_out'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='in'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='out'
			{
				$current = grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSEnvironmentUpperLevelLevel
ruleGSSEnvironmentUpperLevelLevel returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='_1'
			{
				$current = grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='_2'
			{
				$current = grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='_3'
			{
				$current = grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSEnvironmentUnit
ruleGSSEnvironmentUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='miliseconds'
			{
				$current = grammarAccess.getGSSEnvironmentUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='seconds'
			{
				$current = grammarAccess.getGSSEnvironmentUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentUnitAccess().getSecondsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSEnvironmentGlobalVarType
ruleGSSEnvironmentGlobalVarType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='uint'
			{
				$current = grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='formula'
			{
				$current = grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSEnvironmentReferenceFieldType
ruleGSSEnvironmentReferenceFieldType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='tm'
			{
				$current = grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='tc'
			{
				$current = grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSEnvironmentAlarmMsgType
ruleGSSEnvironmentAlarmMsgType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='alarm1'
			{
				$current = grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='alarm2'
			{
				$current = grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='alarm3'
			{
				$current = grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSEnvironmentModifyType
ruleGSSEnvironmentModifyType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='increment'
			{
				$current = grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='increment1wrap'
			{
				$current = grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSEnvironmentAlarmValType
ruleGSSEnvironmentAlarmValType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='alarm1'
		{
			$current = grammarAccess.getGSSEnvironmentAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration());
		}
	)
;

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
