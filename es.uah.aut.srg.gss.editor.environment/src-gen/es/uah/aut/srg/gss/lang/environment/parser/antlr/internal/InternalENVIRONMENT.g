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
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentEnvironmentParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSEnvironmentEnvironment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnvironment");
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

// Entry rule entryRuleGSSEnvironmentEnvironment
entryRuleGSSEnvironmentEnvironment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentRule()); }
	iv_ruleGSSEnvironmentEnvironment=ruleGSSEnvironmentEnvironment
	{ $current=$iv_ruleGSSEnvironmentEnvironment.current; }
	EOF;

// Rule GSSEnvironmentEnvironment
ruleGSSEnvironmentEnvironment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSEnvironmentEnvironment'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSEnvironmentEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSEnvironmentEnvironmentRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentEnvironmentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='uri'
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriKeyword_3_0());
			}
			otherlv_4=':='
			{
				newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0());
					}
					lv_uri_5_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSEnvironmentEnvironmentRule());
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
				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_3_3());
			}
		)
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionKeyword_4());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionVersionParserRuleCall_6_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentEnvironmentRule());
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
			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioGSSScenarioScenarioParserRuleCall_8_0());
				}
				lv_scenario_11_0=ruleGSSScenarioScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSEnvironmentEnvironmentRule());
					}
					add(
						$current,
						"scenario",
						lv_scenario_11_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioScenario");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentEnvironmentAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleGSSScenarioScenario
entryRuleGSSScenarioScenario returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSScenarioScenarioRule()); }
	iv_ruleGSSScenarioScenario=ruleGSSScenarioScenario
	{ $current=$iv_ruleGSSScenarioScenario.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSScenarioScenario
ruleGSSScenarioScenario returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioScenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioScenarioAccess().getGSSScenarioScenarioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSScenarioScenarioAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioScenarioRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioScenarioAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsGSSScenarioOptionsParserRuleCall_3_0());
				}
				lv_gss_options_3_0=ruleGSSScenarioOptions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
					}
					set(
						$current,
						"gss_options",
						lv_gss_options_3_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioOptions");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsGSSScenarioProtocolsParserRuleCall_4_0());
				}
				lv_Protocols_4_0=ruleGSSScenarioProtocols
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
					}
					set(
						$current,
						"Protocols",
						lv_Protocols_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocols");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesGSSScenarioInterfacesParserRuleCall_5_0());
				}
				lv_Interfaces_5_0=ruleGSSScenarioInterfaces
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
					}
					set(
						$current,
						"Interfaces",
						lv_Interfaces_5_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaces");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0());
				}
				lv_SpecialPackets_6_0=ruleGSSScenarioSpecialPackets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
					}
					set(
						$current,
						"SpecialPackets",
						lv_SpecialPackets_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioSpecialPackets");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0());
				}
				lv_PeriodicTCs_7_0=ruleGSSScenarioPeriodicTCs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
					}
					set(
						$current,
						"PeriodicTCs",
						lv_PeriodicTCs_7_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPeriodicTCs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0());
									}
									lv_GlobalVars_9_0=ruleGSSScenarioGlobalVars
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
										}
										set(
											$current,
											"GlobalVars",
											lv_GlobalVars_9_0,
											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGlobalVars");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0());
									}
									lv_Monitors_10_0=ruleGSSScenarioMonitors
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
										}
										set(
											$current,
											"Monitors",
											lv_Monitors_10_0,
											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioMonitors");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
				}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioScenarioAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSScenarioScenarioAccess().getSemicolonKeyword_10());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSScenarioOptions
entryRuleGSSScenarioOptions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioOptionsRule()); }
	iv_ruleGSSScenarioOptions=ruleGSSScenarioOptions
	{ $current=$iv_ruleGSSScenarioOptions.current; }
	EOF;

// Rule GSSScenarioOptions
ruleGSSScenarioOptions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioOptions'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioOptionsAccess().getGSSScenarioOptionsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioOptionsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoGSSScenarioGSSInfoParserRuleCall_2_0());
				}
				lv_gss_info_2_0=ruleGSSScenarioGSSInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
					}
					set(
						$current,
						"gss_info",
						lv_gss_info_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGSSInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0());
				}
				lv_gss_info_print_3_0=ruleGSSScenarioGSSInfoPrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
					}
					set(
						$current,
						"gss_info_print",
						lv_gss_info_print_3_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGSSInfoPrint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0());
				}
				lv_phy_header_print_4_0=ruleGSSScenarioPhyHeaderPrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
					}
					set(
						$current,
						"phy_header_print",
						lv_phy_header_print_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPhyHeaderPrint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0());
				}
				lv_discardErrorFlags_5_0=ruleGSSScenarioGSSDiscardErrorFlags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
					}
					set(
						$current,
						"discardErrorFlags",
						lv_discardErrorFlags_5_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGSSDiscardErrorFlags");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioOptionsAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioOptionsAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSScenarioProtocols
entryRuleGSSScenarioProtocols returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioProtocolsRule()); }
	iv_ruleGSSScenarioProtocols=ruleGSSScenarioProtocols
	{ $current=$iv_ruleGSSScenarioProtocols.current; }
	EOF;

// Rule GSSScenarioProtocols
ruleGSSScenarioProtocols returns [EObject current=null]
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
					grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSScenarioProtocols'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolGSSScenarioProtocolParserRuleCall_3_0());
				}
				lv_Protocol_3_0=ruleGSSScenarioProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolsRule());
					}
					add(
						$current,
						"Protocol",
						lv_Protocol_3_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocol");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioProtocolsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSScenarioInterfaces
entryRuleGSSScenarioInterfaces returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioInterfacesRule()); }
	iv_ruleGSSScenarioInterfaces=ruleGSSScenarioInterfaces
	{ $current=$iv_ruleGSSScenarioInterfaces.current; }
	EOF;

// Rule GSSScenarioInterfaces
ruleGSSScenarioInterfaces returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioInterfaces'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioInterfacesAccess().getGSSScenarioInterfacesKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioInterfacesAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='ProtocolPacketsFile'
			{
				newLeafNode(otherlv_2, grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileKeyword_2_0());
			}
			otherlv_3=':='
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSScenarioInterfacesAccess().getColonEqualsSignKeyword_2_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioInterfacesRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_2_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0());
				}
				lv_MainInterface_6_0=ruleGSSScenarioMainInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfacesRule());
					}
					set(
						$current,
						"MainInterface",
						lv_MainInterface_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioMainInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceGSSScenarioInterfaceParserRuleCall_4_0());
				}
				lv_Interface_7_0=ruleGSSScenarioInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfacesRule());
					}
					add(
						$current,
						"Interface",
						lv_Interface_7_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSScenarioInterfacesAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleGSSScenarioSpecialPackets
entryRuleGSSScenarioSpecialPackets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketsRule()); }
	iv_ruleGSSScenarioSpecialPackets=ruleGSSScenarioSpecialPackets
	{ $current=$iv_ruleGSSScenarioSpecialPackets.current; }
	EOF;

// Rule GSSScenarioSpecialPackets
ruleGSSScenarioSpecialPackets returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioSpecialPackets'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioSpecialPacketsAccess().getGSSScenarioSpecialPacketsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioSpecialPacketsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0());
				}
				lv_SpecialPacket_2_0=ruleGSSScenarioSpecialPacket
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketsRule());
					}
					add(
						$current,
						"SpecialPacket",
						lv_SpecialPacket_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioSpecialPacket");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioSpecialPacketsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioSpecialPacketsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSScenarioPeriodicTCs
entryRuleGSSScenarioPeriodicTCs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCsRule()); }
	iv_ruleGSSScenarioPeriodicTCs=ruleGSSScenarioPeriodicTCs
	{ $current=$iv_ruleGSSScenarioPeriodicTCs.current; }
	EOF;

// Rule GSSScenarioPeriodicTCs
ruleGSSScenarioPeriodicTCs returns [EObject current=null]
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
					grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSScenarioPeriodicTCs'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0());
				}
				lv_PeriodicTC_3_0=ruleGSSScenarioPeriodicTC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCsRule());
					}
					add(
						$current,
						"PeriodicTC",
						lv_PeriodicTC_3_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPeriodicTC");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioPeriodicTCsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSScenarioGlobalVars
entryRuleGSSScenarioGlobalVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGlobalVarsRule()); }
	iv_ruleGSSScenarioGlobalVars=ruleGSSScenarioGlobalVars
	{ $current=$iv_ruleGSSScenarioGlobalVars.current; }
	EOF;

// Rule GSSScenarioGlobalVars
ruleGSSScenarioGlobalVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioGlobalVars'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGlobalVarsAccess().getGSSScenarioGlobalVarsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0());
				}
				lv_GlobalVar_2_0=ruleGSSScenarioGlobalVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarsRule());
					}
					add(
						$current,
						"GlobalVar",
						lv_GlobalVar_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGlobalVar");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGlobalVarsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioGlobalVarsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSScenarioMonitors
entryRuleGSSScenarioMonitors returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioMonitorsRule()); }
	iv_ruleGSSScenarioMonitors=ruleGSSScenarioMonitors
	{ $current=$iv_ruleGSSScenarioMonitors.current; }
	EOF;

// Rule GSSScenarioMonitors
ruleGSSScenarioMonitors returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioMonitors'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioMonitorsAccess().getGSSScenarioMonitorsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioMonitorsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='ChartsFile'
			{
				newLeafNode(otherlv_2, grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileKeyword_2_0());
			}
			otherlv_3=':='
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSScenarioMonitorsAccess().getColonEqualsSignKeyword_2_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioMonitorsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_2_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorGSSScenarioMonitorParserRuleCall_3_0());
				}
				lv_monitor_6_0=ruleGSSScenarioMonitor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioMonitorsRule());
					}
					add(
						$current,
						"monitor",
						lv_monitor_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioMonitor");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioMonitorsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSScenarioGSSInfo
entryRuleGSSScenarioGSSInfo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGSSInfoRule()); }
	iv_ruleGSSScenarioGSSInfo=ruleGSSScenarioGSSInfo
	{ $current=$iv_ruleGSSScenarioGSSInfo.current; }
	EOF;

// Rule GSSScenarioGSSInfo
ruleGSSScenarioGSSInfo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioInfo'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGSSInfoAccess().getGSSScenarioInfoKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGSSInfoAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='test_campaign'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_test_campaign_4_0=RULE_STRING
				{
					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioGSSInfoRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_5());
		}
		otherlv_6='version'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGSSInfoAccess().getVersionKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionVersionParserRuleCall_8_0());
				}
				lv_version_8_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_9());
		}
		otherlv_10='date'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGSSInfoAccess().getDateKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoAccess().getDateDATEParserRuleCall_12_0());
				}
				lv_date_12_0=ruleDATE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='version_control_url'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0());
					}
					lv_version_control_url_16_0=ruleURL
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoRule());
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
				newLeafNode(otherlv_17, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioGSSInfoAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSScenarioGSSInfoPrint
entryRuleGSSScenarioGSSInfoPrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintRule()); }
	iv_ruleGSSScenarioGSSInfoPrint=ruleGSSScenarioGSSInfoPrint
	{ $current=$iv_ruleGSSScenarioGSSInfoPrint.current; }
	EOF;

// Rule GSSScenarioGSSInfoPrint
ruleGSSScenarioGSSInfoPrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioInfoPrint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGSSScenarioInfoPrintKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='mainLog'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0());
				}
				lv_mainLog_4_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoPrintRule());
					}
					set(
						$current,
						"mainLog",
						lv_mainLog_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_5());
		}
		otherlv_6='portLogs'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0());
				}
				lv_portLogs_8_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoPrintRule());
					}
					set(
						$current,
						"portLogs",
						lv_portLogs_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rawLog'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0());
				}
				lv_rawLog_12_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoPrintRule());
					}
					set(
						$current,
						"rawLog",
						lv_rawLog_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSScenarioPhyHeaderPrint
entryRuleGSSScenarioPhyHeaderPrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintRule()); }
	iv_ruleGSSScenarioPhyHeaderPrint=ruleGSSScenarioPhyHeaderPrint
	{ $current=$iv_ruleGSSScenarioPhyHeaderPrint.current; }
	EOF;

// Rule GSSScenarioPhyHeaderPrint
ruleGSSScenarioPhyHeaderPrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPhyHeaderPrint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGSSScenarioPhyHeaderPrintKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='mainLog'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0());
				}
				lv_mainLog_4_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
					}
					set(
						$current,
						"mainLog",
						lv_mainLog_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_5());
		}
		otherlv_6='portLogs'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0());
				}
				lv_portLogs_8_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
					}
					set(
						$current,
						"portLogs",
						lv_portLogs_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rawLog'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0());
				}
				lv_rawLog_12_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
					}
					set(
						$current,
						"rawLog",
						lv_rawLog_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_13());
		}
		otherlv_14='gssTabs'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0());
				}
				lv_gssTabs_16_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
					}
					set(
						$current,
						"gssTabs",
						lv_gssTabs_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSScenarioGSSDiscardErrorFlags
entryRuleGSSScenarioGSSDiscardErrorFlags returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule()); }
	iv_ruleGSSScenarioGSSDiscardErrorFlags=ruleGSSScenarioGSSDiscardErrorFlags
	{ $current=$iv_ruleGSSScenarioGSSDiscardErrorFlags.current; }
	EOF;

// Rule GSSScenarioGSSDiscardErrorFlags
ruleGSSScenarioGSSDiscardErrorFlags returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioDiscardErrorFlags'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGSSScenarioDiscardErrorFlagsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='txErrors'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0());
				}
				lv_txErrors_4_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"txErrors",
						lv_txErrors_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
		}
		otherlv_6='notExpectedPackets'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0());
				}
				lv_notExpectedPackets_8_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"notExpectedPackets",
						lv_notExpectedPackets_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
		}
		otherlv_10='filtersKo'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0());
				}
				lv_filtersKo_12_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"filtersKo",
						lv_filtersKo_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
		}
		otherlv_14='validTimesKo'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0());
				}
				lv_validTimesKo_16_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"validTimesKo",
						lv_validTimesKo_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSScenarioProtocol
entryRuleGSSScenarioProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioProtocolRule()); }
	iv_ruleGSSScenarioProtocol=ruleGSSScenarioProtocol
	{ $current=$iv_ruleGSSScenarioProtocol.current; }
	EOF;

// Rule GSSScenarioProtocol
ruleGSSScenarioProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioProtocol'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioProtocolAccess().getGSSScenarioProtocolKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioProtocolAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioProtocolAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioProtocolRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_9());
		}
		otherlv_10='typeLevel'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0());
				}
				lv_typeLevel_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getTypeGSSScenarioProtocolTypeParserRuleCall_14_0());
				}
				lv_type_14_0=ruleGSSScenarioProtocolType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
					}
					set(
						$current,
						"type",
						lv_type_14_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocolType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0());
				}
				lv_subtype_15_0=ruleGSSScenarioProtocolSubtype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
					}
					set(
						$current,
						"subtype",
						lv_subtype_15_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocolSubtype");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSScenarioProtocolAccess().getRightCurlyBracketKeyword_16());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_17());
		}
	)
;

// Entry rule entryRuleGSSScenarioProtocolType
entryRuleGSSScenarioProtocolType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioProtocolTypeRule()); }
	iv_ruleGSSScenarioProtocolType=ruleGSSScenarioProtocolType
	{ $current=$iv_ruleGSSScenarioProtocolType.current; }
	EOF;

// Rule GSSScenarioProtocolType
ruleGSSScenarioProtocolType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioProtocolType'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioProtocolTypeAccess().getGSSScenarioProtocolTypeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolTypeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolTypeAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioProtocolTypeAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioProtocolTypeRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='offset'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetINTEGERParserRuleCall_8_0());
				}
				lv_offset_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolTypeRule());
					}
					set(
						$current,
						"offset",
						lv_offset_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioProtocolTypeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSScenarioProtocolSubtype
entryRuleGSSScenarioProtocolSubtype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioProtocolSubtypeRule()); }
	iv_ruleGSSScenarioProtocolSubtype=ruleGSSScenarioProtocolSubtype
	{ $current=$iv_ruleGSSScenarioProtocolSubtype.current; }
	EOF;

// Rule GSSScenarioProtocolSubtype
ruleGSSScenarioProtocolSubtype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioProtocolSubtype'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGSSScenarioProtocolSubtypeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioProtocolSubtypeRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='offset'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetINTEGERParserRuleCall_8_0());
				}
				lv_offset_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolSubtypeRule());
					}
					set(
						$current,
						"offset",
						lv_offset_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSScenarioMainInterface
entryRuleGSSScenarioMainInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceRule()); }
	iv_ruleGSSScenarioMainInterface=ruleGSSScenarioMainInterface
	{ $current=$iv_ruleGSSScenarioMainInterface.current; }
	EOF;

// Rule GSSScenarioMainInterface
ruleGSSScenarioMainInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioMainInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioMainInterfaceAccess().getGSSScenarioMainInterfaceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioMainInterfaceAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioMainInterfaceAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioMainInterfaceRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='ifType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0());
				}
				lv_ifType_12_0=ruleGSSScenarioInterfaceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
					}
					set(
						$current,
						"ifType",
						lv_ifType_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifConfig'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioMainInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_17());
		}
		otherlv_18='ioType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0());
				}
				lv_ioType_20_0=ruleGSSScenarioInterfaceIOType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
					}
					set(
						$current,
						"ioType",
						lv_ioType_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceIOType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='protocolID'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioMainInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0());
				}
				lv_LevelInOut_26_0=ruleGSSScenarioLevelInOut
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
					}
					add(
						$current,
						"LevelInOut",
						lv_LevelInOut_26_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelInOut");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioMainInterfaceAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_28=';'
		{
			newLeafNode(otherlv_28, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSScenarioInterface
entryRuleGSSScenarioInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioInterfaceRule()); }
	iv_ruleGSSScenarioInterface=ruleGSSScenarioInterface
	{ $current=$iv_ruleGSSScenarioInterface.current; }
	EOF;

// Rule GSSScenarioInterface
ruleGSSScenarioInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioInterfaceAccess().getGSSScenarioInterfaceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioInterfaceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioInterfaceAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioInterfaceAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioInterfaceRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='ifType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0());
				}
				lv_ifType_12_0=ruleGSSScenarioInterfaceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
					}
					set(
						$current,
						"ifType",
						lv_ifType_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifConfig'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_17());
		}
		otherlv_18='ioType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0());
				}
				lv_ioType_20_0=ruleGSSScenarioInterfaceIOType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
					}
					set(
						$current,
						"ioType",
						lv_ioType_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceIOType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='protocolID'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0());
					}
					lv_LevelInOut_26_0=ruleGSSScenarioLevelInOut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
						}
						add(
							$current,
							"LevelInOut",
							lv_LevelInOut_26_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelInOut");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInGSSScenarioLevelInParserRuleCall_23_1_0());
					}
					lv_LevelIn_27_0=ruleGSSScenarioLevelIn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
						}
						add(
							$current,
							"LevelIn",
							lv_LevelIn_27_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelIn");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0());
					}
					lv_LevelOut_28_0=ruleGSSScenarioLevelOut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
						}
						add(
							$current,
							"LevelOut",
							lv_LevelOut_28_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelOut");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_29='}'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioInterfaceAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_30=';'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSScenarioLevelInOut
entryRuleGSSScenarioLevelInOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioLevelInOutRule()); }
	iv_ruleGSSScenarioLevelInOut=ruleGSSScenarioLevelInOut
	{ $current=$iv_ruleGSSScenarioLevelInOut.current; }
	EOF;

// Rule GSSScenarioLevelInOut
ruleGSSScenarioLevelInOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioLevelInOut'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioLevelInOutAccess().getGSSScenarioLevelInOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioLevelInOutAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioLevelInOutAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioLevelInOutRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioLevelInOutAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TMformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatGSSFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_13());
		}
		otherlv_14='TCformat'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatGSSFormatFormatCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_17());
		}
		otherlv_18='inputFilter'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterGSSFilterFilterCrossReference_20_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='export_to_prev_Level'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			otherlv_26='import_from_prev_Level'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0());
			}
			otherlv_27=':='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_23_3());
			}
		)?
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSScenarioLevelInOutAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSScenarioLevelIn
entryRuleGSSScenarioLevelIn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioLevelInRule()); }
	iv_ruleGSSScenarioLevelIn=ruleGSSScenarioLevelIn
	{ $current=$iv_ruleGSSScenarioLevelIn.current; }
	EOF;

// Rule GSSScenarioLevelIn
ruleGSSScenarioLevelIn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioLevelIn'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioLevelInAccess().getGSSScenarioLevelInKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioLevelInAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioLevelInAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelInAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioLevelInRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioLevelInAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioLevelInAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelInRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TCformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioLevelInAccess().getTCformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelInRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelInAccess().getTCformatGSSFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='export_to_prev_Level'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioLevelInRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioLevelInAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSScenarioLevelOut
entryRuleGSSScenarioLevelOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioLevelOutRule()); }
	iv_ruleGSSScenarioLevelOut=ruleGSSScenarioLevelOut
	{ $current=$iv_ruleGSSScenarioLevelOut.current; }
	EOF;

// Rule GSSScenarioLevelOut
ruleGSSScenarioLevelOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioLevelOut'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioLevelOutAccess().getGSSScenarioLevelOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioLevelOutAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioLevelOutAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioLevelOutRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioLevelOutAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TMformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioLevelOutAccess().getTMformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatGSSFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_13());
		}
		otherlv_14='inputFilter'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterGSSFilterFilterCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_17());
		}
		(
			otherlv_18='import_from_prev_Level'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelKeyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioLevelOutAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSScenarioSpecialPacket
entryRuleGSSScenarioSpecialPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketRule()); }
	iv_ruleGSSScenarioSpecialPacket=ruleGSSScenarioSpecialPacket
	{ $current=$iv_ruleGSSScenarioSpecialPacket.current; }
	EOF;

// Rule GSSScenarioSpecialPacket
ruleGSSScenarioSpecialPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioSpecialPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioSpecialPacketAccess().getGSSScenarioSpecialPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='status'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusGSSScenarioEnableDisableEnumRuleCall_4_0());
				}
				lv_status_4_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
					}
					set(
						$current,
						"status",
						lv_status_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioSpecialPacketAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioSpecialPacketRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='id'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioSpecialPacketAccess().getIdKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0());
				}
				lv_id_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0());
				}
				lv_ifRef_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='levels'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0());
				}
				lv_levels_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
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
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='levelRef'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0());
				}
				lv_levelRef_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
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
			newLeafNode(otherlv_25, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_25());
		}
		otherlv_26='inputFilter'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterKeyword_26());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_27());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioSpecialPacketRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterGSSFilterFilterCrossReference_28_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_29());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0());
				}
				lv_UpperLevels_30_0=ruleGSSScenarioUpperLevels
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
					}
					add(
						$current,
						"UpperLevels",
						lv_UpperLevels_30_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUpperLevels");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0());
				}
				lv_printingData_31_0=ruleGSSScenarioPrintingData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
					}
					set(
						$current,
						"printingData",
						lv_printingData_31_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPrintingData");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodGSSScenarioPeriodParserRuleCall_32_0_0());
					}
					lv_period_32_0=ruleGSSScenarioPeriod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
						}
						set(
							$current,
							"period",
							lv_period_32_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPeriod");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0());
					}
					lv_intervalRange_33_0=ruleGSSScenarioIntervalRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
						}
						set(
							$current,
							"intervalRange",
							lv_intervalRange_33_0,
							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioIntervalRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSScenarioSpecialPacketAccess().getRightCurlyBracketKeyword_33());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_34());
		}
	)
;

// Entry rule entryRuleGSSScenarioUpperLevels
entryRuleGSSScenarioUpperLevels returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioUpperLevelsRule()); }
	iv_ruleGSSScenarioUpperLevels=ruleGSSScenarioUpperLevels
	{ $current=$iv_ruleGSSScenarioUpperLevels.current; }
	EOF;

// Rule GSSScenarioUpperLevels
ruleGSSScenarioUpperLevels returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioUpperLevels'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioUpperLevelsAccess().getGSSScenarioUpperLevelsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0());
				}
				lv_UpperLevel_2_0=ruleGSSScenarioUpperLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioUpperLevelsRule());
					}
					add(
						$current,
						"UpperLevel",
						lv_UpperLevel_2_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUpperLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioUpperLevelsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioUpperLevelsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSScenarioPrintingData
entryRuleGSSScenarioPrintingData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPrintingDataRule()); }
	iv_ruleGSSScenarioPrintingData=ruleGSSScenarioPrintingData
	{ $current=$iv_ruleGSSScenarioPrintingData.current; }
	EOF;

// Rule GSSScenarioPrintingData
ruleGSSScenarioPrintingData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPrintingData'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPrintingDataAccess().getGSSScenarioPrintingDataKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPrintingDataAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='printStatus'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPrintingDataAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0());
				}
				lv_printStatus_4_0=ruleGSSScenarioEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPrintingDataRule());
					}
					set(
						$current,
						"printStatus",
						lv_printStatus_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0());
				}
				lv_structuredData_6_0=ruleGSSScenarioStructuredData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPrintingDataRule());
					}
					set(
						$current,
						"structuredData",
						lv_structuredData_6_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioStructuredData");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPrintingDataAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSScenarioPeriod
entryRuleGSSScenarioPeriod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPeriodRule()); }
	iv_ruleGSSScenarioPeriod=ruleGSSScenarioPeriod
	{ $current=$iv_ruleGSSScenarioPeriod.current; }
	EOF;

// Rule GSSScenarioPeriod
ruleGSSScenarioPeriod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPeriod'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodAccess().getGSSScenarioPeriodKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='min_value'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodAccess().getMin_valueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0());
				}
				lv_min_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_5());
		}
		otherlv_6='min_unit'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodAccess().getMin_unitKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitGSSScenarioUnitEnumRuleCall_8_0());
				}
				lv_min_unit_8_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
					}
					set(
						$current,
						"min_unit",
						lv_min_unit_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_9());
		}
		otherlv_10='max_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodAccess().getMax_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0());
				}
				lv_max_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_13());
		}
		otherlv_14='max_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodAccess().getMax_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitGSSScenarioUnitEnumRuleCall_16_0());
				}
				lv_max_unit_16_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
					}
					set(
						$current,
						"max_unit",
						lv_max_unit_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSScenarioIntervalRange
entryRuleGSSScenarioIntervalRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeRule()); }
	iv_ruleGSSScenarioIntervalRange=ruleGSSScenarioIntervalRange
	{ $current=$iv_ruleGSSScenarioIntervalRange.current; }
	EOF;

// Rule GSSScenarioIntervalRange
ruleGSSScenarioIntervalRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioIntervalRange'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioIntervalRangeAccess().getGSSScenarioIntervalRangeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='min'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioIntervalRangeAccess().getMinKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0());
				}
				lv_min_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='max'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0());
				}
				lv_max_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='interval_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0());
				}
				lv_interval_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_13());
		}
		otherlv_14='interval_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitGSSScenarioUnitEnumRuleCall_16_0());
				}
				lv_interval_unit_16_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
					}
					set(
						$current,
						"interval_unit",
						lv_interval_unit_16_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioIntervalRangeAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSScenarioUpperLevel
entryRuleGSSScenarioUpperLevel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioUpperLevelRule()); }
	iv_ruleGSSScenarioUpperLevel=ruleGSSScenarioUpperLevel
	{ $current=$iv_ruleGSSScenarioUpperLevel.current; }
	EOF;

// Rule GSSScenarioUpperLevel
ruleGSSScenarioUpperLevel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioUpperLevel'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioUpperLevelAccess().getGSSScenarioUpperLevelKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioUpperLevelAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='level'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioUpperLevelAccess().getLevelKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0());
				}
				lv_level_4_0=ruleGSSScenarioUpperLevelLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioUpperLevelRule());
					}
					set(
						$current,
						"level",
						lv_level_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUpperLevelLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='TMformat'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatGSSFormatFormatCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_6_3());
			}
		)?
		(
			otherlv_10='inputFilter'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterKeyword_7_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_7_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterGSSFilterFilterCrossReference_7_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_7_3());
			}
		)?
		(
			otherlv_14='import_from_prev_Level'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_8_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_8_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioUpperLevelAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleGSSScenarioStructuredData
entryRuleGSSScenarioStructuredData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioStructuredDataRule()); }
	iv_ruleGSSScenarioStructuredData=ruleGSSScenarioStructuredData
	{ $current=$iv_ruleGSSScenarioStructuredData.current; }
	EOF;

// Rule GSSScenarioStructuredData
ruleGSSScenarioStructuredData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioStructuredData'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioStructuredDataAccess().getGSSScenarioStructuredDataKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioStructuredDataAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='levelRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0());
				}
				lv_levelRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioStructuredDataRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_5());
		}
		otherlv_6='firstField'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0());
				}
				lv_firstField_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioStructuredDataRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioStructuredDataAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSScenarioPeriodicTC
entryRuleGSSScenarioPeriodicTC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCRule()); }
	iv_ruleGSSScenarioPeriodicTC=ruleGSSScenarioPeriodicTC
	{ $current=$iv_ruleGSSScenarioPeriodicTC.current; }
	EOF;

// Rule GSSScenarioPeriodicTC
ruleGSSScenarioPeriodicTC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel2ParserRuleCall_0());
		}
		this_GSSScenarioPeriodicTCLevel2_0=ruleGSSScenarioPeriodicTCLevel2
		{
			$current = $this_GSSScenarioPeriodicTCLevel2_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel1ParserRuleCall_1());
		}
		this_GSSScenarioPeriodicTCLevel1_1=ruleGSSScenarioPeriodicTCLevel1
		{
			$current = $this_GSSScenarioPeriodicTCLevel1_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel0ParserRuleCall_2());
		}
		this_GSSScenarioPeriodicTCLevel0_2=ruleGSSScenarioPeriodicTCLevel0
		{
			$current = $this_GSSScenarioPeriodicTCLevel0_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSScenarioPeriodicTCLevel2
entryRuleGSSScenarioPeriodicTCLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule()); }
	iv_ruleGSSScenarioPeriodicTCLevel2=ruleGSSScenarioPeriodicTCLevel2
	{ $current=$iv_ruleGSSScenarioPeriodicTCLevel2.current; }
	EOF;

// Rule GSSScenarioPeriodicTCLevel2
ruleGSSScenarioPeriodicTCLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPeriodicTCLevel2'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGSSScenarioPeriodicTCLevel2Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level2'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2GSSFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level2'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2GSSExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_26());
		}
		(
			otherlv_30='level1'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Keyword_27_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1GSSFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_34='level2_to_level1'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_28_3());
			}
		)?
		(
			otherlv_38='level0'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Keyword_29_0());
			}
			otherlv_39=':='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0GSSFormatFormatCrossReference_29_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_41=';'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_29_3());
			}
		)?
		(
			otherlv_42='level1_to_level0'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0());
			}
			otherlv_43=':='
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_30_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_45=';'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_30_3());
			}
		)?
		otherlv_46='}'
		{
			newLeafNode(otherlv_46, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31());
		}
		otherlv_47=';'
		{
			newLeafNode(otherlv_47, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleGSSScenarioPeriodicTCLevel1
entryRuleGSSScenarioPeriodicTCLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule()); }
	iv_ruleGSSScenarioPeriodicTCLevel1=ruleGSSScenarioPeriodicTCLevel1
	{ $current=$iv_ruleGSSScenarioPeriodicTCLevel1.current; }
	EOF;

// Rule GSSScenarioPeriodicTCLevel1
ruleGSSScenarioPeriodicTCLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPeriodicTCLevel1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGSSScenarioPeriodicTCLevel1Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level1'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1GSSFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level1'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1GSSExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_26());
		}
		(
			otherlv_30='level0'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Keyword_27_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0GSSFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_34='level1_to_level0'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_28_3());
			}
		)?
		otherlv_38='}'
		{
			newLeafNode(otherlv_38, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29());
		}
		otherlv_39=';'
		{
			newLeafNode(otherlv_39, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleGSSScenarioPeriodicTCLevel0
entryRuleGSSScenarioPeriodicTCLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule()); }
	iv_ruleGSSScenarioPeriodicTCLevel0=ruleGSSScenarioPeriodicTCLevel0
	{ $current=$iv_ruleGSSScenarioPeriodicTCLevel0.current; }
	EOF;

// Rule GSSScenarioPeriodicTCLevel0
ruleGSSScenarioPeriodicTCLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPeriodicTCLevel0'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGSSScenarioPeriodicTCLevel0Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level0'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0GSSFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level0'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0GSSExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_26());
		}
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_28());
		}
	)
;

// Entry rule entryRuleGSSScenarioGlobalVar
entryRuleGSSScenarioGlobalVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGlobalVarRule()); }
	iv_ruleGSSScenarioGlobalVar=ruleGSSScenarioGlobalVar
	{ $current=$iv_ruleGSSScenarioGlobalVar.current; }
	EOF;

// Rule GSSScenarioGlobalVar
ruleGSSScenarioGlobalVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioGlobalVar'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGlobalVarAccess().getGSSScenarioGlobalVarKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGlobalVarAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGlobalVarAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioGlobalVarRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGlobalVarAccess().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_9());
		}
		otherlv_10='type'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGlobalVarAccess().getTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0());
				}
				lv_type_12_0=ruleGSSScenarioGlobalVarType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
					}
					set(
						$current,
						"type",
						lv_type_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGlobalVarType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_13());
		}
		otherlv_14='initial_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0());
				}
				lv_initial_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_17());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceGSSScenarioReferenceParserRuleCall_18_0());
				}
				lv_reference_18_0=ruleGSSScenarioReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
					}
					set(
						$current,
						"reference",
						lv_reference_18_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19='}'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioGlobalVarAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_20=';'
		{
			newLeafNode(otherlv_20, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSScenarioReference
entryRuleGSSScenarioReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioReferenceRule()); }
	iv_ruleGSSScenarioReference=ruleGSSScenarioReference
	{ $current=$iv_ruleGSSScenarioReference.current; }
	EOF;

// Rule GSSScenarioReference
ruleGSSScenarioReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceFieldParserRuleCall_0());
		}
		this_GSSScenarioReferenceField_0=ruleGSSScenarioReferenceField
		{
			$current = $this_GSSScenarioReferenceField_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferencePeriodicTCParserRuleCall_1());
		}
		this_GSSScenarioReferencePeriodicTC_1=ruleGSSScenarioReferencePeriodicTC
		{
			$current = $this_GSSScenarioReferencePeriodicTC_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceSpecialPacketParserRuleCall_2());
		}
		this_GSSScenarioReferenceSpecialPacket_2=ruleGSSScenarioReferenceSpecialPacket
		{
			$current = $this_GSSScenarioReferenceSpecialPacket_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSScenarioReferenceField
entryRuleGSSScenarioReferenceField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldRule()); }
	iv_ruleGSSScenarioReferenceField=ruleGSSScenarioReferenceField
	{ $current=$iv_ruleGSSScenarioReferenceField.current; }
	EOF;

// Rule GSSScenarioReferenceField
ruleGSSScenarioReferenceField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioReferenceField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioReferenceFieldAccess().getGSSScenarioReferenceFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleGSSScenarioReferenceFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioReferenceFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='level'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0());
				}
				lv_level_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_13());
		}
		otherlv_14='fieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0());
				}
				lv_fieldRef_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_17());
		}
		otherlv_18='offset'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0());
				}
				lv_offset_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
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
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_21());
		}
		otherlv_22='size'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0());
				}
				lv_size_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
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
			newLeafNode(otherlv_25, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_25());
		}
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioReferenceFieldAccess().getRightCurlyBracketKeyword_26());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_27());
		}
	)
;

// Entry rule entryRuleGSSScenarioReferencePeriodicTC
entryRuleGSSScenarioReferencePeriodicTC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCRule()); }
	iv_ruleGSSScenarioReferencePeriodicTC=ruleGSSScenarioReferencePeriodicTC
	{ $current=$iv_ruleGSSScenarioReferencePeriodicTC.current; }
	EOF;

// Rule GSSScenarioReferencePeriodicTC
ruleGSSScenarioReferencePeriodicTC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioReferencePeriodicTC'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGSSScenarioReferencePeriodicTCKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_5());
		}
		otherlv_6='level'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0());
				}
				lv_level_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_9());
		}
		otherlv_10='fieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0());
				}
				lv_fieldRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_13());
		}
		otherlv_14='offset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0());
				}
				lv_offset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_17());
		}
		otherlv_18='size'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0());
				}
				lv_size_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
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
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSScenarioReferenceSpecialPacket
entryRuleGSSScenarioReferenceSpecialPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketRule()); }
	iv_ruleGSSScenarioReferenceSpecialPacket=ruleGSSScenarioReferenceSpecialPacket
	{ $current=$iv_ruleGSSScenarioReferenceSpecialPacket.current; }
	EOF;

// Rule GSSScenarioReferenceSpecialPacket
ruleGSSScenarioReferenceSpecialPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioReferenceSpecialPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGSSScenarioReferenceSpecialPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='level'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0());
				}
				lv_level_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='fieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0());
				}
				lv_fieldRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='offset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0());
				}
				lv_offset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
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
			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='size'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0());
				}
				lv_size_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
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
			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSScenarioMonitor
entryRuleGSSScenarioMonitor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioMonitorRule()); }
	iv_ruleGSSScenarioMonitor=ruleGSSScenarioMonitor
	{ $current=$iv_ruleGSSScenarioMonitor.current; }
	EOF;

// Rule GSSScenarioMonitor
ruleGSSScenarioMonitor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioPlotParserRuleCall_0());
		}
		this_GSSScenarioPlot_0=ruleGSSScenarioPlot
		{
			$current = $this_GSSScenarioPlot_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmMsgParserRuleCall_1());
		}
		this_GSSScenarioAlarmMsg_1=ruleGSSScenarioAlarmMsg
		{
			$current = $this_GSSScenarioAlarmMsg_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioModifyParserRuleCall_2());
		}
		this_GSSScenarioModify_2=ruleGSSScenarioModify
		{
			$current = $this_GSSScenarioModify_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmValParserRuleCall_3());
		}
		this_GSSScenarioAlarmVal_3=ruleGSSScenarioAlarmVal
		{
			$current = $this_GSSScenarioAlarmVal_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSScenarioPlot
entryRuleGSSScenarioPlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioPlotRule()); }
	iv_ruleGSSScenarioPlot=ruleGSSScenarioPlot
	{ $current=$iv_ruleGSSScenarioPlot.current; }
	EOF;

// Rule GSSScenarioPlot
ruleGSSScenarioPlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioPlot'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPlotAccess().getGSSScenarioPlotKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPlotAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPlotAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPlotAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPlotRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_5());
		}
		otherlv_6='chartRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPlotAccess().getChartRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioPlotRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioPlotAccess().getGVRefGSSScenarioGVRefParserRuleCall_10_0());
				}
				lv_GVRef_10_0=ruleGSSScenarioGVRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioPlotRule());
					}
					set(
						$current,
						"GVRef",
						lv_GVRef_10_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPlotAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSScenarioAlarmMsg
entryRuleGSSScenarioAlarmMsg returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioAlarmMsgRule()); }
	iv_ruleGSSScenarioAlarmMsg=ruleGSSScenarioAlarmMsg
	{ $current=$iv_ruleGSSScenarioAlarmMsg.current; }
	EOF;

// Rule GSSScenarioAlarmMsg
ruleGSSScenarioAlarmMsg returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioAlarmMsg'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioAlarmMsgAccess().getGSSScenarioAlarmMsgKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioAlarmMsgAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioAlarmMsgRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSScenarioAlarmMsgType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmMsgRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioAlarmMsgType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_9());
		}
		otherlv_10='text'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioAlarmMsgAccess().getTextKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_text_12_0=RULE_STRING
				{
					newLeafNode(lv_text_12_0, grammarAccess.getGSSScenarioAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioAlarmMsgRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVRefGSSScenarioGVRefParserRuleCall_14_0());
				}
				lv_GVRef_14_0=ruleGSSScenarioGVRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmMsgRule());
					}
					set(
						$current,
						"GVRef",
						lv_GVRef_14_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioAlarmMsgAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSScenarioModify
entryRuleGSSScenarioModify returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioModifyRule()); }
	iv_ruleGSSScenarioModify=ruleGSSScenarioModify
	{ $current=$iv_ruleGSSScenarioModify.current; }
	EOF;

// Rule GSSScenarioModify
ruleGSSScenarioModify returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioModify'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioModifyAccess().getGSSScenarioModifyKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioModifyAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioModifyAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioModifyAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioModifyRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioModifyAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioModifyAccess().getTypeGSSScenarioModifyTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSScenarioModifyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioModifyRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioModifyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_9());
		}
		otherlv_10='value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioModifyAccess().getValueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioModifyAccess().getValueINTEGERParserRuleCall_12_0());
				}
				lv_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioModifyRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioModifyAccess().getGVRefGSSScenarioGVRefParserRuleCall_14_0());
				}
				lv_GVRef_14_0=ruleGSSScenarioGVRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioModifyRule());
					}
					set(
						$current,
						"GVRef",
						lv_GVRef_14_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioModifyAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSScenarioAlarmVal
entryRuleGSSScenarioAlarmVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioAlarmValRule()); }
	iv_ruleGSSScenarioAlarmVal=ruleGSSScenarioAlarmVal
	{ $current=$iv_ruleGSSScenarioAlarmVal.current; }
	EOF;

// Rule GSSScenarioAlarmVal
ruleGSSScenarioAlarmVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioAlarmVal'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioAlarmValAccess().getGSSScenarioAlarmValKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioAlarmValAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioAlarmValAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioAlarmValRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioAlarmValAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioAlarmValAccess().getTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSScenarioAlarmValType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmValRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioAlarmValType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioAlarmValAccess().getGVRefGSSScenarioGVRefParserRuleCall_10_0());
				}
				lv_GVRef_10_0=ruleGSSScenarioGVRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmValRule());
					}
					set(
						$current,
						"GVRef",
						lv_GVRef_10_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioAlarmValAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSScenarioGVRef
entryRuleGSSScenarioGVRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGVRefRule()); }
	iv_ruleGSSScenarioGVRef=ruleGSSScenarioGVRef
	{ $current=$iv_ruleGSSScenarioGVRef.current; }
	EOF;

// Rule GSSScenarioGVRef
ruleGSSScenarioGVRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioGVRefAccess().getGSSScenarioGVFilteredParserRuleCall_0());
		}
		this_GSSScenarioGVFiltered_0=ruleGSSScenarioGVFiltered
		{
			$current = $this_GSSScenarioGVFiltered_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSScenarioGVRefAccess().getGSSScenarioGVPeriodicParserRuleCall_1());
		}
		this_GSSScenarioGVPeriodic_1=ruleGSSScenarioGVPeriodic
		{
			$current = $this_GSSScenarioGVPeriodic_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSScenarioGVFiltered
entryRuleGSSScenarioGVFiltered returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGVFilteredRule()); }
	iv_ruleGSSScenarioGVFiltered=ruleGSSScenarioGVFiltered
	{ $current=$iv_ruleGSSScenarioGVFiltered.current; }
	EOF;

// Rule GSSScenarioGVFiltered
ruleGSSScenarioGVFiltered returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioGVFiltered'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGVFilteredAccess().getGSSScenarioGVFilteredKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGVFilteredAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='GlobalVarRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioGVFilteredRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGVFilteredAccess().getFilterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSScenarioGVFilteredRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterGSSFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGVFilteredAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSScenarioGVPeriodic
entryRuleGSSScenarioGVPeriodic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSScenarioGVPeriodicRule()); }
	iv_ruleGSSScenarioGVPeriodic=ruleGSSScenarioGVPeriodic
	{ $current=$iv_ruleGSSScenarioGVPeriodic.current; }
	EOF;

// Rule GSSScenarioGVPeriodic
ruleGSSScenarioGVPeriodic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSScenarioGVPeriodic'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGVPeriodicAccess().getGSSScenarioGVPeriodicKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='GlobalVarRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSScenarioGVPeriodicRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_5());
		}
		otherlv_6='period_value'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0());
				}
				lv_period_value_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGVPeriodicRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_9());
		}
		otherlv_10='period_unit'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitGSSScenarioUnitEnumRuleCall_12_0());
				}
				lv_period_unit_12_0=ruleGSSScenarioUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSScenarioGVPeriodicRule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_12_0,
						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGVPeriodicAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_15());
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

// Rule GSSScenarioEnableDisable
ruleGSSScenarioEnableDisable returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='enabled'
			{
				$current = grammarAccess.getGSSScenarioEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSScenarioInterfaceType
ruleGSSScenarioInterfaceType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SpW_TC'
			{
				$current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='SpW_Error'
			{
				$current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='uart'
			{
				$current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSScenarioInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='dummy'
			{
				$current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSScenarioInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule GSSScenarioInterfaceIOType
ruleGSSScenarioInterfaceIOType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='in'
			{
				$current = grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='out'
			{
				$current = grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSScenarioUpperLevelLevel
ruleGSSScenarioUpperLevelLevel returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='_2'
			{
				$current = grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='_3'
			{
				$current = grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSScenarioUnit
ruleGSSScenarioUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='seconds'
			{
				$current = grammarAccess.getGSSScenarioUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioUnitAccess().getSecondsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSScenarioGlobalVarType
ruleGSSScenarioGlobalVarType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='formula'
			{
				$current = grammarAccess.getGSSScenarioGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSScenarioReferenceFieldType
ruleGSSScenarioReferenceFieldType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='tc'
			{
				$current = grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSScenarioAlarmMsgType
ruleGSSScenarioAlarmMsgType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='alarm2'
			{
				$current = grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='alarm3'
			{
				$current = grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSScenarioModifyType
ruleGSSScenarioModifyType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSScenarioModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='increment1wrap'
			{
				$current = grammarAccess.getGSSScenarioModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSScenarioAlarmValType
ruleGSSScenarioAlarmValType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='alarm1'
		{
			$current = grammarAccess.getGSSScenarioAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration());
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
