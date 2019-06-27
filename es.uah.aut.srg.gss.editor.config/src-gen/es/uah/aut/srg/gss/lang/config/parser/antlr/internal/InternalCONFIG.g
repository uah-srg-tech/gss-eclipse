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
grammar InternalCONFIG;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.config.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.config.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private CONFIGGrammarAccess grammarAccess;

    public InternalCONFIGParser(TokenStream input, CONFIGGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected CONFIGGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSConfigGSSConfig
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSConfig");
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

// Entry rule entryRuleGSSConfigGSSConfig
entryRuleGSSConfigGSSConfig returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSConfigGSSConfigRule()); }
	iv_ruleGSSConfigGSSConfig=ruleGSSConfigGSSConfig
	{ $current=$iv_ruleGSSConfigGSSConfig.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSConfigGSSConfig
ruleGSSConfigGSSConfig returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGSSConfig'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigGSSConfigRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='uri'
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0());
			}
			otherlv_4=':='
			{
				newLeafNode(otherlv_4, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0());
					}
					lv_uri_5_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
						}
						set(
							$current,
							"uri",
							lv_uri_5_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_3());
			}
		)
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_4());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"version",
						lv_version_9_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsGSSConfigGSSOptionsParserRuleCall_8_0());
				}
				lv_gss_options_11_0=ruleGSSConfigGSSOptions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"gss_options",
						lv_gss_options_11_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSOptions");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsGSSConfigProtocolsParserRuleCall_9_0());
				}
				lv_Protocols_12_0=ruleGSSConfigProtocols
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"Protocols",
						lv_Protocols_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigProtocols");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesGSSConfigInterfacesParserRuleCall_10_0());
				}
				lv_Interfaces_13_0=ruleGSSConfigInterfaces
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"Interfaces",
						lv_Interfaces_13_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaces");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_11_0());
				}
				lv_SpecialPackets_14_0=ruleGSSConfigSpecialPackets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"SpecialPackets",
						lv_SpecialPackets_14_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigSpecialPackets");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_12_0());
				}
				lv_PeriodicTCs_15_0=ruleGSSConfigPeriodicTCs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"PeriodicTCs",
						lv_PeriodicTCs_15_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsGSSConfigGlobalVarsParserRuleCall_13_0_0());
									}
									lv_GlobalVars_17_0=ruleGSSConfigGlobalVars
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
										}
										set(
											$current,
											"GlobalVars",
											lv_GlobalVars_17_0,
											"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVars");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsGSSConfigMonitorsParserRuleCall_13_1_0());
									}
									lv_Monitors_18_0=ruleGSSConfigMonitors
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
										}
										set(
											$current,
											"Monitors",
											lv_Monitors_18_0,
											"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMonitors");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
				}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_14_0());
				}
				lv_Tests_19_0=ruleGSSConfigTests
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"Tests",
						lv_Tests_19_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTests");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_16());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSConfigGSSOptions
entryRuleGSSConfigGSSOptions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGSSOptionsRule()); }
	iv_ruleGSSConfigGSSOptions=ruleGSSConfigGSSOptions
	{ $current=$iv_ruleGSSConfigGSSOptions.current; }
	EOF;

// Rule GSSConfigGSSOptions
ruleGSSConfigGSSOptions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGSSOptions'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSOptionsAccess().getGSSConfigGSSOptionsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSOptionsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoGSSConfigGSSInfoParserRuleCall_2_0());
				}
				lv_gss_info_2_0=ruleGSSConfigGSSInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
					}
					set(
						$current,
						"gss_info",
						lv_gss_info_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0());
				}
				lv_gss_info_print_3_0=ruleGSSConfigGSSInfoPrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
					}
					set(
						$current,
						"gss_info_print",
						lv_gss_info_print_3_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSInfoPrint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0());
				}
				lv_phy_header_print_4_0=ruleGSSConfigPhyHeaderPrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
					}
					set(
						$current,
						"phy_header_print",
						lv_phy_header_print_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPhyHeaderPrint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0());
				}
				lv_discardErrorFlags_5_0=ruleGSSConfigGSSDiscardErrorFlags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
					}
					set(
						$current,
						"discardErrorFlags",
						lv_discardErrorFlags_5_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSDiscardErrorFlags");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSOptionsAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSOptionsAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSConfigProtocols
entryRuleGSSConfigProtocols returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigProtocolsRule()); }
	iv_ruleGSSConfigProtocols=ruleGSSConfigProtocols
	{ $current=$iv_ruleGSSConfigProtocols.current; }
	EOF;

// Rule GSSConfigProtocols
ruleGSSConfigProtocols returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigProtocols'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigProtocolsAccess().getGSSConfigProtocolsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigProtocolsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigProtocolsAccess().getProtocolGSSConfigProtocolParserRuleCall_2_0());
				}
				lv_Protocol_2_0=ruleGSSConfigProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigProtocolsRule());
					}
					add(
						$current,
						"Protocol",
						lv_Protocol_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigProtocol");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigProtocolsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigProtocolsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSConfigInterfaces
entryRuleGSSConfigInterfaces returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigInterfacesRule()); }
	iv_ruleGSSConfigInterfaces=ruleGSSConfigInterfaces
	{ $current=$iv_ruleGSSConfigInterfaces.current; }
	EOF;

// Rule GSSConfigInterfaces
ruleGSSConfigInterfaces returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigInterfaces'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigInterfacesAccess().getGSSConfigInterfacesKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigInterfacesAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0());
				}
				lv_MainInterface_2_0=ruleGSSConfigMainInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigInterfacesRule());
					}
					set(
						$current,
						"MainInterface",
						lv_MainInterface_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceGSSConfigInterfaceParserRuleCall_3_0());
				}
				lv_Interface_3_0=ruleGSSConfigInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigInterfacesRule());
					}
					add(
						$current,
						"Interface",
						lv_Interface_3_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigInterfacesAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigInterfacesAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSConfigSpecialPackets
entryRuleGSSConfigSpecialPackets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigSpecialPacketsRule()); }
	iv_ruleGSSConfigSpecialPackets=ruleGSSConfigSpecialPackets
	{ $current=$iv_ruleGSSConfigSpecialPackets.current; }
	EOF;

// Rule GSSConfigSpecialPackets
ruleGSSConfigSpecialPackets returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigSpecialPackets'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigSpecialPacketsAccess().getGSSConfigSpecialPacketsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigSpecialPacketsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0());
				}
				lv_SpecialPacket_2_0=ruleGSSConfigSpecialPacket
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketsRule());
					}
					add(
						$current,
						"SpecialPacket",
						lv_SpecialPacket_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigSpecialPacket");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigSpecialPacketsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigSpecialPacketsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSConfigPeriodicTCs
entryRuleGSSConfigPeriodicTCs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsRule()); }
	iv_ruleGSSConfigPeriodicTCs=ruleGSSConfigPeriodicTCs
	{ $current=$iv_ruleGSSConfigPeriodicTCs.current; }
	EOF;

// Rule GSSConfigPeriodicTCs
ruleGSSConfigPeriodicTCs returns [EObject current=null]
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
					grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSConfigPeriodicTCs'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0());
					}
					lv_PeriodicTC_level_2_3_0=ruleGSSConfigPeriodicTCLevel2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCsRule());
						}
						add(
							$current,
							"PeriodicTC_level_2",
							lv_PeriodicTC_level_2_3_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel2");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0());
					}
					lv_PeriodicTC_level_1_4_0=ruleGSSConfigPeriodicTCLevel1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCsRule());
						}
						add(
							$current,
							"PeriodicTC_level_1",
							lv_PeriodicTC_level_1_4_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel1");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0());
					}
					lv_PeriodicTC_level_0_5_0=ruleGSSConfigPeriodicTCLevel0
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCsRule());
						}
						add(
							$current,
							"PeriodicTC_level_0",
							lv_PeriodicTC_level_0_5_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel0");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSConfigGlobalVars
entryRuleGSSConfigGlobalVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGlobalVarsRule()); }
	iv_ruleGSSConfigGlobalVars=ruleGSSConfigGlobalVars
	{ $current=$iv_ruleGSSConfigGlobalVars.current; }
	EOF;

// Rule GSSConfigGlobalVars
ruleGSSConfigGlobalVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGlobalVars'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGlobalVarsAccess().getGSSConfigGlobalVarsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarGSSConfigGlobalVarParserRuleCall_2_0());
				}
				lv_GlobalVar_2_0=ruleGSSConfigGlobalVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarsRule());
					}
					add(
						$current,
						"GlobalVar",
						lv_GlobalVar_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVar");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGlobalVarsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigGlobalVarsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSConfigMonitors
entryRuleGSSConfigMonitors returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigMonitorsRule()); }
	iv_ruleGSSConfigMonitors=ruleGSSConfigMonitors
	{ $current=$iv_ruleGSSConfigMonitors.current; }
	EOF;

// Rule GSSConfigMonitors
ruleGSSConfigMonitors returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigMonitors'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigMonitorsAccess().getGSSConfigMonitorsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigMonitorsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='ChartsFile'
			{
				newLeafNode(otherlv_2, grammarAccess.getGSSConfigMonitorsAccess().getChartsFileKeyword_2_0());
			}
			otherlv_3=':='
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSConfigMonitorsAccess().getColonEqualsSignKeyword_2_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigMonitorsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_2_3());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getPlotGSSConfigPlotParserRuleCall_3_0_0());
					}
					lv_plot_6_0=ruleGSSConfigPlot
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
						}
						add(
							$current,
							"plot",
							lv_plot_6_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPlot");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0());
					}
					lv_alarmMsg_7_0=ruleGSSConfigAlarmMsg
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
						}
						add(
							$current,
							"alarmMsg",
							lv_alarmMsg_7_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmMsg");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getModifyGSSConfigModifyParserRuleCall_3_2_0());
					}
					lv_modify_8_0=ruleGSSConfigModify
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
						}
						add(
							$current,
							"modify",
							lv_modify_8_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigModify");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValGSSConfigAlarmValParserRuleCall_3_3_0());
					}
					lv_alarmVal_9_0=ruleGSSConfigAlarmVal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
						}
						add(
							$current,
							"alarmVal",
							lv_alarmVal_9_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmVal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigMonitorsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSConfigTests
entryRuleGSSConfigTests returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigTestsRule()); }
	iv_ruleGSSConfigTests=ruleGSSConfigTests
	{ $current=$iv_ruleGSSConfigTests.current; }
	EOF;

// Rule GSSConfigTests
ruleGSSConfigTests returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigTests'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='ProtocolPacketsFile'
			{
				newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileKeyword_2_0());
			}
			otherlv_3=':='
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestsAccess().getColonEqualsSignKeyword_2_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigTestsRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_2_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_3_0());
				}
				lv_TestCase_6_0=ruleGSSConfigTestCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigTestsRule());
					}
					add(
						$current,
						"TestCase",
						lv_TestCase_6_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTestCase");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSConfigGSSInfo
entryRuleGSSConfigGSSInfo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGSSInfoRule()); }
	iv_ruleGSSConfigGSSInfo=ruleGSSConfigGSSInfo
	{ $current=$iv_ruleGSSConfigGSSInfo.current; }
	EOF;

// Rule GSSConfigGSSInfo
ruleGSSConfigGSSInfo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGSSInfo'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSInfoAccess().getGSSConfigGSSInfoKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSInfoAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='test_campaign'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_test_campaign_4_0=RULE_STRING
				{
					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigGSSInfoRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_5());
		}
		otherlv_6='version'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSInfoAccess().getVersionKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSInfoAccess().getVersionVersionParserRuleCall_8_0());
				}
				lv_version_8_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoRule());
					}
					set(
						$current,
						"version",
						lv_version_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_9());
		}
		otherlv_10='date'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSInfoAccess().getDateKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSInfoAccess().getDateDATEParserRuleCall_12_0());
				}
				lv_date_12_0=ruleDATE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoRule());
					}
					set(
						$current,
						"date",
						lv_date_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.DATE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='version_control_url'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0());
					}
					lv_version_control_url_16_0=ruleURL
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoRule());
						}
						set(
							$current,
							"version_control_url",
							lv_version_control_url_16_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.URL");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigGSSInfoAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSConfigGSSInfoPrint
entryRuleGSSConfigGSSInfoPrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintRule()); }
	iv_ruleGSSConfigGSSInfoPrint=ruleGSSConfigGSSInfoPrint
	{ $current=$iv_ruleGSSConfigGSSInfoPrint.current; }
	EOF;

// Rule GSSConfigGSSInfoPrint
ruleGSSConfigGSSInfoPrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGSSInfoPrint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSInfoPrintAccess().getGSSConfigGSSInfoPrintKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='mainLog'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0());
				}
				lv_mainLog_4_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoPrintRule());
					}
					set(
						$current,
						"mainLog",
						lv_mainLog_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_5());
		}
		otherlv_6='portLogs'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0());
				}
				lv_portLogs_8_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoPrintRule());
					}
					set(
						$current,
						"portLogs",
						lv_portLogs_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rawLog'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogGSSConfigEnableDisableEnumRuleCall_12_0());
				}
				lv_rawLog_12_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoPrintRule());
					}
					set(
						$current,
						"rawLog",
						lv_rawLog_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSInfoPrintAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSConfigPhyHeaderPrint
entryRuleGSSConfigPhyHeaderPrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintRule()); }
	iv_ruleGSSConfigPhyHeaderPrint=ruleGSSConfigPhyHeaderPrint
	{ $current=$iv_ruleGSSConfigPhyHeaderPrint.current; }
	EOF;

// Rule GSSConfigPhyHeaderPrint
ruleGSSConfigPhyHeaderPrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPhyHeaderPrint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGSSConfigPhyHeaderPrintKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='mainLog'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0());
				}
				lv_mainLog_4_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
					}
					set(
						$current,
						"mainLog",
						lv_mainLog_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_5());
		}
		otherlv_6='portLogs'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0());
				}
				lv_portLogs_8_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
					}
					set(
						$current,
						"portLogs",
						lv_portLogs_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rawLog'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogGSSConfigEnableDisableEnumRuleCall_12_0());
				}
				lv_rawLog_12_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
					}
					set(
						$current,
						"rawLog",
						lv_rawLog_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_13());
		}
		otherlv_14='gssTabs'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsGSSConfigEnableDisableEnumRuleCall_16_0());
				}
				lv_gssTabs_16_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
					}
					set(
						$current,
						"gssTabs",
						lv_gssTabs_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSConfigGSSDiscardErrorFlags
entryRuleGSSConfigGSSDiscardErrorFlags returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule()); }
	iv_ruleGSSConfigGSSDiscardErrorFlags=ruleGSSConfigGSSDiscardErrorFlags
	{ $current=$iv_ruleGSSConfigGSSDiscardErrorFlags.current; }
	EOF;

// Rule GSSConfigGSSDiscardErrorFlags
ruleGSSConfigGSSDiscardErrorFlags returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGSSDiscardErrorFlags'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGSSConfigGSSDiscardErrorFlagsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='txErrors'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0());
				}
				lv_txErrors_4_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"txErrors",
						lv_txErrors_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
		}
		otherlv_6='notExpectedPackets'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0());
				}
				lv_notExpectedPackets_8_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"notExpectedPackets",
						lv_notExpectedPackets_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
		}
		otherlv_10='filtersKo'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0());
				}
				lv_filtersKo_12_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"filtersKo",
						lv_filtersKo_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
		}
		otherlv_14='validTimesKo'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0());
				}
				lv_validTimesKo_16_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
					}
					set(
						$current,
						"validTimesKo",
						lv_validTimesKo_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSConfigProtocol
entryRuleGSSConfigProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigProtocolRule()); }
	iv_ruleGSSConfigProtocol=ruleGSSConfigProtocol
	{ $current=$iv_ruleGSSConfigProtocol.current; }
	EOF;

// Rule GSSConfigProtocol
ruleGSSConfigProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigProtocol'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigProtocolAccess().getGSSConfigProtocolKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigProtocolAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigProtocolAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigProtocolAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigProtocolAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigProtocolRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_9());
		}
		otherlv_10='typeLevel'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigProtocolAccess().getTypeLevelKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0());
				}
				lv_typeLevel_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
					}
					set(
						$current,
						"typeLevel",
						lv_typeLevel_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_13());
		}
		otherlv_14='typeOffset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0());
				}
				lv_typeOffset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
					}
					set(
						$current,
						"typeOffset",
						lv_typeOffset_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_17());
		}
		(
			otherlv_18='subtypeOffset'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetKeyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0());
					}
					lv_subtypeOffset_20_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
						}
						set(
							$current,
							"subtypeOffset",
							lv_subtypeOffset_20_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigProtocolAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSConfigMainInterface
entryRuleGSSConfigMainInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigMainInterfaceRule()); }
	iv_ruleGSSConfigMainInterface=ruleGSSConfigMainInterface
	{ $current=$iv_ruleGSSConfigMainInterface.current; }
	EOF;

// Rule GSSConfigMainInterface
ruleGSSConfigMainInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigMainInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigMainInterfaceAccess().getGSSConfigMainInterfaceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigMainInterfaceAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigMainInterfaceAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='ifType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0());
				}
				lv_ifType_12_0=ruleGSSConfigMainInterfaceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
					}
					set(
						$current,
						"ifType",
						lv_ifType_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterfaceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifConfig'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_17());
		}
		otherlv_18='ioType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0());
				}
				lv_ioType_20_0=ruleGSSConfigMainInterfaceIOType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
					}
					set(
						$current,
						"ioType",
						lv_ioType_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterfaceIOType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='protocolID'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0());
				}
				lv_LevelInOut_26_0=ruleGSSConfigLevelInOut
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
					}
					add(
						$current,
						"LevelInOut",
						lv_LevelInOut_26_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelInOut");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSConfigMainInterfaceAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_28=';'
		{
			newLeafNode(otherlv_28, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSConfigInterface
entryRuleGSSConfigInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigInterfaceRule()); }
	iv_ruleGSSConfigInterface=ruleGSSConfigInterface
	{ $current=$iv_ruleGSSConfigInterface.current; }
	EOF;

// Rule GSSConfigInterface
ruleGSSConfigInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigInterfaceAccess().getGSSConfigInterfaceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigInterfaceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigInterfaceAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigInterfaceAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='ifType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigInterfaceAccess().getIfTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0());
				}
				lv_ifType_12_0=ruleGSSConfigInterfaceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
					}
					set(
						$current,
						"ifType",
						lv_ifType_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifConfig'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigInterfaceAccess().getIfConfigKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_17());
		}
		otherlv_18='ioType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigInterfaceAccess().getIoTypeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0());
				}
				lv_ioType_20_0=ruleGSSConfigInterfaceIOType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
					}
					set(
						$current,
						"ioType",
						lv_ioType_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaceIOType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='protocolID'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0());
					}
					lv_LevelInOut_26_0=ruleGSSConfigLevelInOut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
						}
						add(
							$current,
							"LevelInOut",
							lv_LevelInOut_26_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelInOut");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelInGSSConfigLevelInParserRuleCall_23_1_0());
					}
					lv_LevelIn_27_0=ruleGSSConfigLevelIn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
						}
						add(
							$current,
							"LevelIn",
							lv_LevelIn_27_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelIn");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutGSSConfigLevelOutParserRuleCall_23_2_0());
					}
					lv_LevelOut_28_0=ruleGSSConfigLevelOut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
						}
						add(
							$current,
							"LevelOut",
							lv_LevelOut_28_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelOut");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_29='}'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSConfigInterfaceAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_30=';'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSConfigLevelInOut
entryRuleGSSConfigLevelInOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigLevelInOutRule()); }
	iv_ruleGSSConfigLevelInOut=ruleGSSConfigLevelInOut
	{ $current=$iv_ruleGSSConfigLevelInOut.current; }
	EOF;

// Rule GSSConfigLevelInOut
ruleGSSConfigLevelInOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigLevelInOut'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelInOutAccess().getGSSConfigLevelInOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelInOutAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelInOutAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelInOutAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TMformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigLevelInOutAccess().getTMformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_13());
		}
		otherlv_14='TCformat'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelInOutAccess().getTCformatKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatTMTCIFFormatFormatCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_17());
		}
		otherlv_18='inputFilter'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_20_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_21());
		}
		(
			otherlv_22='export_to_prev_Level'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_22_3());
			}
		)?
		(
			otherlv_26='import_from_prev_Level'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0());
			}
			otherlv_27=':='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_23_3());
			}
		)?
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSConfigLevelInOutAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSConfigLevelIn
entryRuleGSSConfigLevelIn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigLevelInRule()); }
	iv_ruleGSSConfigLevelIn=ruleGSSConfigLevelIn
	{ $current=$iv_ruleGSSConfigLevelIn.current; }
	EOF;

// Rule GSSConfigLevelIn
ruleGSSConfigLevelIn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigLevelIn'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelInAccess().getGSSConfigLevelInKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelInAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelInAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigLevelInRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelInAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelInAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TCformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigLevelInAccess().getTCformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getTCformatTMTCIFFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='export_to_prev_Level'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigLevelInAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSConfigLevelOut
entryRuleGSSConfigLevelOut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigLevelOutRule()); }
	iv_ruleGSSConfigLevelOut=ruleGSSConfigLevelOut
	{ $current=$iv_ruleGSSConfigLevelOut.current; }
	EOF;

// Rule GSSConfigLevelOut
ruleGSSConfigLevelOut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigLevelOut'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelOutAccess().getGSSConfigLevelOutKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelOutAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelOutAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigLevelOutRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelOutAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_9());
		}
		otherlv_10='TMformat'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigLevelOutAccess().getTMformatKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_13());
		}
		otherlv_14='inputFilter'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelOutAccess().getInputFilterKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_17());
		}
		(
			otherlv_18='import_from_prev_Level'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelKeyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigLevelOutAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSConfigSpecialPacket
entryRuleGSSConfigSpecialPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigSpecialPacketRule()); }
	iv_ruleGSSConfigSpecialPacket=ruleGSSConfigSpecialPacket
	{ $current=$iv_ruleGSSConfigSpecialPacket.current; }
	EOF;

// Rule GSSConfigSpecialPacket
ruleGSSConfigSpecialPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigSpecialPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigSpecialPacketAccess().getGSSConfigSpecialPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='status'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigSpecialPacketAccess().getStatusKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusGSSConfigEnableDisableEnumRuleCall_4_0());
				}
				lv_status_4_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					set(
						$current,
						"status",
						lv_status_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigSpecialPacketAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigSpecialPacketRule());
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
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='id'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigSpecialPacketAccess().getIdKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0());
				}
				lv_id_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					set(
						$current,
						"id",
						lv_id_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='ifRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0());
				}
				lv_ifRef_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='levels'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0());
				}
				lv_levels_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					set(
						$current,
						"levels",
						lv_levels_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='levelRef'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0());
				}
				lv_levelRef_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					set(
						$current,
						"levelRef",
						lv_levelRef_24_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_25());
		}
		otherlv_26='inputFilter'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterKeyword_26());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_27());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigSpecialPacketRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterTMTCIFFilterFilterCrossReference_28_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_29());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0());
				}
				lv_UpperLevels_30_0=ruleGSSConfigUpperLevels
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					add(
						$current,
						"UpperLevels",
						lv_UpperLevels_30_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevels");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataGSSConfigPrintingDataParserRuleCall_31_0());
				}
				lv_printingData_31_0=ruleGSSConfigPrintingData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
					}
					set(
						$current,
						"printingData",
						lv_printingData_31_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPrintingData");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodGSSConfigPeriodParserRuleCall_32_0_0());
					}
					lv_period_32_0=ruleGSSConfigPeriod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
						}
						set(
							$current,
							"period",
							lv_period_32_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriod");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0());
					}
					lv_intervalRange_33_0=ruleGSSConfigIntervalRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
						}
						set(
							$current,
							"intervalRange",
							lv_intervalRange_33_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigIntervalRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSConfigSpecialPacketAccess().getRightCurlyBracketKeyword_33());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_34());
		}
	)
;

// Entry rule entryRuleGSSConfigUpperLevels
entryRuleGSSConfigUpperLevels returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigUpperLevelsRule()); }
	iv_ruleGSSConfigUpperLevels=ruleGSSConfigUpperLevels
	{ $current=$iv_ruleGSSConfigUpperLevels.current; }
	EOF;

// Rule GSSConfigUpperLevels
ruleGSSConfigUpperLevels returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigUpperLevels'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigUpperLevelsAccess().getGSSConfigUpperLevelsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelGSSConfigUpperLevelParserRuleCall_2_0());
				}
				lv_UpperLevel_2_0=ruleGSSConfigUpperLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelsRule());
					}
					add(
						$current,
						"UpperLevel",
						lv_UpperLevel_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigUpperLevelsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigUpperLevelsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSConfigPrintingData
entryRuleGSSConfigPrintingData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPrintingDataRule()); }
	iv_ruleGSSConfigPrintingData=ruleGSSConfigPrintingData
	{ $current=$iv_ruleGSSConfigPrintingData.current; }
	EOF;

// Rule GSSConfigPrintingData
ruleGSSConfigPrintingData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPrintingData'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPrintingDataAccess().getGSSConfigPrintingDataKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPrintingDataAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='printStatus'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPrintingDataAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0());
				}
				lv_printStatus_4_0=ruleGSSConfigEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPrintingDataRule());
					}
					set(
						$current,
						"printStatus",
						lv_printStatus_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataGSSConfigStructuredDataParserRuleCall_6_0());
				}
				lv_structuredData_6_0=ruleGSSConfigStructuredData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPrintingDataRule());
					}
					set(
						$current,
						"structuredData",
						lv_structuredData_6_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigStructuredData");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPrintingDataAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSConfigPeriod
entryRuleGSSConfigPeriod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPeriodRule()); }
	iv_ruleGSSConfigPeriod=ruleGSSConfigPeriod
	{ $current=$iv_ruleGSSConfigPeriod.current; }
	EOF;

// Rule GSSConfigPeriod
ruleGSSConfigPeriod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPeriod'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodAccess().getGSSConfigPeriodKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='min_value'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodAccess().getMin_valueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0());
				}
				lv_min_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
					}
					set(
						$current,
						"min_value",
						lv_min_value_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_5());
		}
		otherlv_6='min_unit'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodAccess().getMin_unitKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMin_unitGSSConfigUnitEnumRuleCall_8_0());
				}
				lv_min_unit_8_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
					}
					set(
						$current,
						"min_unit",
						lv_min_unit_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_9());
		}
		otherlv_10='max_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodAccess().getMax_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0());
				}
				lv_max_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
					}
					set(
						$current,
						"max_value",
						lv_max_value_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_13());
		}
		otherlv_14='max_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodAccess().getMax_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMax_unitGSSConfigUnitEnumRuleCall_16_0());
				}
				lv_max_unit_16_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
					}
					set(
						$current,
						"max_unit",
						lv_max_unit_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSConfigIntervalRange
entryRuleGSSConfigIntervalRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigIntervalRangeRule()); }
	iv_ruleGSSConfigIntervalRange=ruleGSSConfigIntervalRange
	{ $current=$iv_ruleGSSConfigIntervalRange.current; }
	EOF;

// Rule GSSConfigIntervalRange
ruleGSSConfigIntervalRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigIntervalRange'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigIntervalRangeAccess().getGSSConfigIntervalRangeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='min'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigIntervalRangeAccess().getMinKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0());
				}
				lv_min_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
					}
					set(
						$current,
						"min",
						lv_min_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='max'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigIntervalRangeAccess().getMaxKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0());
				}
				lv_max_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
					}
					set(
						$current,
						"max",
						lv_max_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='interval_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0());
				}
				lv_interval_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
					}
					set(
						$current,
						"interval_value",
						lv_interval_value_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_13());
		}
		otherlv_14='interval_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitGSSConfigUnitEnumRuleCall_16_0());
				}
				lv_interval_unit_16_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
					}
					set(
						$current,
						"interval_unit",
						lv_interval_unit_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigIntervalRangeAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSConfigUpperLevel
entryRuleGSSConfigUpperLevel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigUpperLevelRule()); }
	iv_ruleGSSConfigUpperLevel=ruleGSSConfigUpperLevel
	{ $current=$iv_ruleGSSConfigUpperLevel.current; }
	EOF;

// Rule GSSConfigUpperLevel
ruleGSSConfigUpperLevel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigUpperLevel'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigUpperLevelAccess().getGSSConfigUpperLevelKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigUpperLevelAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='level'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigUpperLevelAccess().getLevelKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0());
				}
				lv_level_4_0=ruleGSSConfigUpperLevelLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelRule());
					}
					set(
						$current,
						"level",
						lv_level_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevelLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='TMformat'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSConfigUpperLevelAccess().getTMformatKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatTMTCIFFormatFormatCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_6_3());
			}
		)?
		(
			otherlv_10='inputFilter'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterKeyword_7_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_7_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterTMTCIFFilterFilterCrossReference_7_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_7_3());
			}
		)?
		(
			otherlv_14='import_from_prev_Level'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_8_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigUpperLevelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_8_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigUpperLevelAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_10());
		}
	)
;

// Entry rule entryRuleGSSConfigStructuredData
entryRuleGSSConfigStructuredData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigStructuredDataRule()); }
	iv_ruleGSSConfigStructuredData=ruleGSSConfigStructuredData
	{ $current=$iv_ruleGSSConfigStructuredData.current; }
	EOF;

// Rule GSSConfigStructuredData
ruleGSSConfigStructuredData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigStructuredData'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigStructuredDataAccess().getGSSConfigStructuredDataKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigStructuredDataAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='levelRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0());
				}
				lv_levelRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigStructuredDataRule());
					}
					set(
						$current,
						"levelRef",
						lv_levelRef_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_5());
		}
		otherlv_6='firstField'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0());
				}
				lv_firstField_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigStructuredDataRule());
					}
					set(
						$current,
						"firstField",
						lv_firstField_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigStructuredDataAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSConfigPeriodicTCLevel2
entryRuleGSSConfigPeriodicTCLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Rule()); }
	iv_ruleGSSConfigPeriodicTCLevel2=ruleGSSConfigPeriodicTCLevel2
	{ $current=$iv_ruleGSSConfigPeriodicTCLevel2.current; }
	EOF;

// Rule GSSConfigPeriodicTCLevel2
ruleGSSConfigPeriodicTCLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPeriodicTCLevel2'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGSSConfigPeriodicTCLevel2Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level2'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level2'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_26());
		}
		(
			otherlv_30='level1'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Keyword_27_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_34='level2_to_level1'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_28_3());
			}
		)?
		(
			otherlv_38='level0'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Keyword_29_0());
			}
			otherlv_39=':='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_29_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_41=';'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_29_3());
			}
		)?
		(
			otherlv_42='level1_to_level0'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0());
			}
			otherlv_43=':='
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_45=';'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_30_3());
			}
		)?
		otherlv_46='}'
		{
			newLeafNode(otherlv_46, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31());
		}
		otherlv_47=';'
		{
			newLeafNode(otherlv_47, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleGSSConfigPeriodicTCLevel1
entryRuleGSSConfigPeriodicTCLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Rule()); }
	iv_ruleGSSConfigPeriodicTCLevel1=ruleGSSConfigPeriodicTCLevel1
	{ $current=$iv_ruleGSSConfigPeriodicTCLevel1.current; }
	EOF;

// Rule GSSConfigPeriodicTCLevel1
ruleGSSConfigPeriodicTCLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPeriodicTCLevel1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGSSConfigPeriodicTCLevel1Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level1'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level1'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_26());
		}
		(
			otherlv_30='level0'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Keyword_27_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_34='level1_to_level0'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_28_3());
			}
		)?
		otherlv_38='}'
		{
			newLeafNode(otherlv_38, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29());
		}
		otherlv_39=';'
		{
			newLeafNode(otherlv_39, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleGSSConfigPeriodicTCLevel0
entryRuleGSSConfigPeriodicTCLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Rule()); }
	iv_ruleGSSConfigPeriodicTCLevel0=ruleGSSConfigPeriodicTCLevel0
	{ $current=$iv_ruleGSSConfigPeriodicTCLevel0.current; }
	EOF;

// Rule GSSConfigPeriodicTCLevel0
ruleGSSConfigPeriodicTCLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPeriodicTCLevel0'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGSSConfigPeriodicTCLevel0Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_13());
		}
		otherlv_14='period_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0());
				}
				lv_period_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_17());
		}
		otherlv_18='period_unit'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0());
				}
				lv_period_unit_20_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_21());
		}
		(
			otherlv_22='level0'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Keyword_22_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_22_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_22_3());
			}
		)?
		otherlv_26='app_to_level0'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Keyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_25_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_26());
		}
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_28());
		}
	)
;

// Entry rule entryRuleGSSConfigGlobalVar
entryRuleGSSConfigGlobalVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGlobalVarRule()); }
	iv_ruleGSSConfigGlobalVar=ruleGSSConfigGlobalVar
	{ $current=$iv_ruleGSSConfigGlobalVar.current; }
	EOF;

// Rule GSSConfigGlobalVar
ruleGSSConfigGlobalVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGlobalVar'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGlobalVarAccess().getGSSConfigGlobalVarKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGlobalVarAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGlobalVarAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigGlobalVarRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGlobalVarAccess().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_9());
		}
		otherlv_10='type'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGlobalVarAccess().getTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0());
				}
				lv_type_12_0=ruleGSSConfigGlobalVarType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
					}
					set(
						$current,
						"type",
						lv_type_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVarType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_13());
		}
		otherlv_14='initial_value'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0());
				}
				lv_initial_value_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
					}
					set(
						$current,
						"initial_value",
						lv_initial_value_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_17());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0());
					}
					lv_referenceField_18_0=ruleGSSConfigReferenceField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
						}
						set(
							$current,
							"referenceField",
							lv_referenceField_18_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceField");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0());
					}
					lv_referencePeriodicTC_19_0=ruleGSSConfigReferencePeriodicTC
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
						}
						set(
							$current,
							"referencePeriodicTC",
							lv_referencePeriodicTC_19_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferencePeriodicTC");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0());
					}
					lv_referenceSpecialPacket_20_0=ruleGSSConfigReferenceSpecialPacket
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
						}
						set(
							$current,
							"referenceSpecialPacket",
							lv_referenceSpecialPacket_20_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceSpecialPacket");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigGlobalVarAccess().getRightCurlyBracketKeyword_19());
		}
		otherlv_22=';'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_20());
		}
	)
;

// Entry rule entryRuleGSSConfigReferenceField
entryRuleGSSConfigReferenceField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigReferenceFieldRule()); }
	iv_ruleGSSConfigReferenceField=ruleGSSConfigReferenceField
	{ $current=$iv_ruleGSSConfigReferenceField.current; }
	EOF;

// Rule GSSConfigReferenceField
ruleGSSConfigReferenceField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigReferenceField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferenceFieldAccess().getGSSConfigReferenceFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferenceFieldAccess().getTypeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleGSSConfigReferenceFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='level'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferenceFieldAccess().getLevelKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0());
				}
				lv_level_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
					}
					set(
						$current,
						"level",
						lv_level_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_13());
		}
		otherlv_14='fieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0());
				}
				lv_fieldRef_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
					}
					set(
						$current,
						"fieldRef",
						lv_fieldRef_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_17());
		}
		otherlv_18='offset'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0());
				}
				lv_offset_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
					}
					set(
						$current,
						"offset",
						lv_offset_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_21());
		}
		otherlv_22='size'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferenceFieldAccess().getSizeKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0());
				}
				lv_size_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_24_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_25());
		}
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSConfigReferenceFieldAccess().getRightCurlyBracketKeyword_26());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_27());
		}
	)
;

// Entry rule entryRuleGSSConfigReferencePeriodicTC
entryRuleGSSConfigReferencePeriodicTC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCRule()); }
	iv_ruleGSSConfigReferencePeriodicTC=ruleGSSConfigReferencePeriodicTC
	{ $current=$iv_ruleGSSConfigReferencePeriodicTC.current; }
	EOF;

// Rule GSSConfigReferencePeriodicTC
ruleGSSConfigReferencePeriodicTC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigReferencePeriodicTC'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGSSConfigReferencePeriodicTCKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefINTEGERParserRuleCall_4_0());
				}
				lv_idRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
					}
					set(
						$current,
						"idRef",
						lv_idRef_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_5());
		}
		otherlv_6='level'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0());
				}
				lv_level_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
					}
					set(
						$current,
						"level",
						lv_level_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_9());
		}
		otherlv_10='fieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0());
				}
				lv_fieldRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
					}
					set(
						$current,
						"fieldRef",
						lv_fieldRef_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_13());
		}
		otherlv_14='offset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0());
				}
				lv_offset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
					}
					set(
						$current,
						"offset",
						lv_offset_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_17());
		}
		otherlv_18='size'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0());
				}
				lv_size_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
					}
					set(
						$current,
						"size",
						lv_size_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSConfigReferenceSpecialPacket
entryRuleGSSConfigReferenceSpecialPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketRule()); }
	iv_ruleGSSConfigReferenceSpecialPacket=ruleGSSConfigReferenceSpecialPacket
	{ $current=$iv_ruleGSSConfigReferenceSpecialPacket.current; }
	EOF;

// Rule GSSConfigReferenceSpecialPacket
ruleGSSConfigReferenceSpecialPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigReferenceSpecialPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGSSConfigReferenceSpecialPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefINTEGERParserRuleCall_4_0());
				}
				lv_idRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
					}
					set(
						$current,
						"idRef",
						lv_idRef_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='level'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0());
				}
				lv_level_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
					}
					set(
						$current,
						"level",
						lv_level_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='fieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0());
				}
				lv_fieldRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
					}
					set(
						$current,
						"fieldRef",
						lv_fieldRef_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='offset'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0());
				}
				lv_offset_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
					}
					set(
						$current,
						"offset",
						lv_offset_16_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='size'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0());
				}
				lv_size_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
					}
					set(
						$current,
						"size",
						lv_size_20_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSConfigPlot
entryRuleGSSConfigPlot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigPlotRule()); }
	iv_ruleGSSConfigPlot=ruleGSSConfigPlot
	{ $current=$iv_ruleGSSConfigPlot.current; }
	EOF;

// Rule GSSConfigPlot
ruleGSSConfigPlot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigPlot'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPlotAccess().getGSSConfigPlotKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPlotAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPlotAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPlotAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPlotRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_5());
		}
		otherlv_6='chartRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPlotAccess().getChartRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigPlotRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigPlotAccess().getChartRefGSSChartsChartCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_9());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigPlotAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0());
					}
					lv_GVFiltered_10_0=ruleGSSConfigGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigPlotRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_10_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0());
					}
					lv_GVPeriodic_11_0=ruleGSSConfigGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigPlotRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_11_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSConfigPlotAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSConfigAlarmMsg
entryRuleGSSConfigAlarmMsg returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigAlarmMsgRule()); }
	iv_ruleGSSConfigAlarmMsg=ruleGSSConfigAlarmMsg
	{ $current=$iv_ruleGSSConfigAlarmMsg.current; }
	EOF;

// Rule GSSConfigAlarmMsg
ruleGSSConfigAlarmMsg returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigAlarmMsg'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAlarmMsgAccess().getGSSConfigAlarmMsgKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAlarmMsgAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigAlarmMsgRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAlarmMsgAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSConfigAlarmMsgType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigAlarmMsgRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmMsgType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_9());
		}
		otherlv_10='text'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigAlarmMsgAccess().getTextKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_text_12_0=RULE_STRING
				{
					newLeafNode(lv_text_12_0, grammarAccess.getGSSConfigAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigAlarmMsgRule());
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
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_13());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0());
					}
					lv_GVFiltered_14_0=ruleGSSConfigGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigAlarmMsgRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_14_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0());
					}
					lv_GVPeriodic_15_0=ruleGSSConfigGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigAlarmMsgRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_15_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSConfigAlarmMsgAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSConfigModify
entryRuleGSSConfigModify returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigModifyRule()); }
	iv_ruleGSSConfigModify=ruleGSSConfigModify
	{ $current=$iv_ruleGSSConfigModify.current; }
	EOF;

// Rule GSSConfigModify
ruleGSSConfigModify returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigModify'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigModifyAccess().getGSSConfigModifyKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigModifyAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigModifyAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigModifyAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigModifyRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigModifyAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getTypeGSSConfigModifyTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSConfigModifyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigModifyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_9());
		}
		otherlv_10='value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigModifyAccess().getValueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getValueINTEGERParserRuleCall_12_0());
				}
				lv_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
					}
					set(
						$current,
						"value",
						lv_value_12_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_13());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0());
					}
					lv_GVFiltered_14_0=ruleGSSConfigGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_14_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0());
					}
					lv_GVPeriodic_15_0=ruleGSSConfigGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_15_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSConfigModifyAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSConfigAlarmVal
entryRuleGSSConfigAlarmVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigAlarmValRule()); }
	iv_ruleGSSConfigAlarmVal=ruleGSSConfigAlarmVal
	{ $current=$iv_ruleGSSConfigAlarmVal.current; }
	EOF;

// Rule GSSConfigAlarmVal
ruleGSSConfigAlarmVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigAlarmVal'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAlarmValAccess().getGSSConfigAlarmValKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAlarmValAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAlarmValAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigAlarmValRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAlarmValAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigAlarmValAccess().getTypeGSSConfigAlarmValTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSConfigAlarmValType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigAlarmValRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmValType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_9());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0());
					}
					lv_GVFiltered_10_0=ruleGSSConfigGVFiltered
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigAlarmValRule());
						}
						set(
							$current,
							"GVFiltered",
							lv_GVFiltered_10_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0());
					}
					lv_GVPeriodic_11_0=ruleGSSConfigGVPeriodic
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigAlarmValRule());
						}
						set(
							$current,
							"GVPeriodic",
							lv_GVPeriodic_11_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSConfigAlarmValAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSConfigGVFiltered
entryRuleGSSConfigGVFiltered returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGVFilteredRule()); }
	iv_ruleGSSConfigGVFiltered=ruleGSSConfigGVFiltered
	{ $current=$iv_ruleGSSConfigGVFiltered.current; }
	EOF;

// Rule GSSConfigGVFiltered
ruleGSSConfigGVFiltered returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGVFiltered'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGVFilteredAccess().getGSSConfigGVFilteredKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGVFilteredAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='GlobalVarRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefINTEGERParserRuleCall_4_0());
				}
				lv_GlobalVarRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGVFilteredRule());
					}
					set(
						$current,
						"GlobalVarRef",
						lv_GlobalVarRef_4_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSConfigGVFilteredAccess().getFilterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigGVFilteredRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSConfigGVFilteredAccess().getFilterTMTCIFFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGVFilteredAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSConfigGVPeriodic
entryRuleGSSConfigGVPeriodic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGVPeriodicRule()); }
	iv_ruleGSSConfigGVPeriodic=ruleGSSConfigGVPeriodic
	{ $current=$iv_ruleGSSConfigGVPeriodic.current; }
	EOF;

// Rule GSSConfigGVPeriodic
ruleGSSConfigGVPeriodic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGVPeriodic'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGVPeriodicAccess().getGSSConfigGVPeriodicKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='GlobalVarRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_3());
		}
		otherlv_4=':='
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefINTEGERParserRuleCall_5_0());
				}
				lv_GlobalVarRef_5_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGVPeriodicRule());
					}
					set(
						$current,
						"GlobalVarRef",
						lv_GlobalVarRef_5_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_6());
		}
		otherlv_7='period_value'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueKeyword_7());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_9_0());
				}
				lv_period_value_9_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGVPeriodicRule());
					}
					set(
						$current,
						"period_value",
						lv_period_value_9_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_10());
		}
		otherlv_11='period_unit'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitKeyword_11());
		}
		otherlv_12=':='
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitGSSConfigUnitEnumRuleCall_13_0());
				}
				lv_period_unit_13_0=ruleGSSConfigUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGVPeriodicRule());
					}
					set(
						$current,
						"period_unit",
						lv_period_unit_13_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_14());
		}
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGVPeriodicAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSConfigTestCase
entryRuleGSSConfigTestCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigTestCaseRule()); }
	iv_ruleGSSConfigTestCase=ruleGSSConfigTestCase
	{ $current=$iv_ruleGSSConfigTestCase.current; }
	EOF;

// Rule GSSConfigTestCase
ruleGSSConfigTestCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigTestCase'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5());
		}
		otherlv_6='procedure'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='req'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0());
			}
			(
				(
					lv_req_11_0=RULE_ID
					{
						newLeafNode(lv_req_11_0, grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
						}
						setWithLastConsumed(
							$current,
							"req",
							lv_req_11_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_12='reqAction'
			{
				newLeafNode(otherlv_12, grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0());
					}
					lv_reqAction_13_0=ruleGSSConfigReqAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigTestCaseRule());
						}
						set(
							$current,
							"reqAction",
							lv_reqAction_13_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReqAction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13());
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

// Rule GSSConfigEnableDisable
ruleGSSConfigEnableDisable returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='enabled'
			{
				$current = grammarAccess.getGSSConfigEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSConfigMainInterfaceType
ruleGSSConfigMainInterfaceType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='uart'
			{
				$current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='dummy'
			{
				$current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getDummyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getDummyEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSConfigMainInterfaceIOType
ruleGSSConfigMainInterfaceIOType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='in_out'
		{
			$current = grammarAccess.getGSSConfigMainInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigMainInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration());
		}
	)
;

// Rule GSSConfigInterfaceType
ruleGSSConfigInterfaceType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SpW_TC'
			{
				$current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='SpW_Error'
			{
				$current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='uart'
			{
				$current = grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='dummy'
			{
				$current = grammarAccess.getGSSConfigInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSConfigInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule GSSConfigInterfaceIOType
ruleGSSConfigInterfaceIOType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='in'
			{
				$current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='out'
			{
				$current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSConfigUpperLevelLevel
ruleGSSConfigUpperLevelLevel returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='_2'
			{
				$current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='_3'
			{
				$current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSConfigUnit
ruleGSSConfigUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='seconds'
			{
				$current = grammarAccess.getGSSConfigUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigUnitAccess().getSecondsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSConfigGlobalVarType
ruleGSSConfigGlobalVarType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='formula'
			{
				$current = grammarAccess.getGSSConfigGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSConfigReferenceFieldType
ruleGSSConfigReferenceFieldType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='tc'
			{
				$current = grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSConfigAlarmMsgType
ruleGSSConfigAlarmMsgType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='alarm2'
			{
				$current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='alarm3'
			{
				$current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSConfigModifyType
ruleGSSConfigModifyType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='increment1wrap'
			{
				$current = grammarAccess.getGSSConfigModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSConfigAlarmValType
ruleGSSConfigAlarmValType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='alarm1'
		{
			$current = grammarAccess.getGSSConfigAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration());
		}
	)
;

// Rule GSSConfigReqAction
ruleGSSConfigReqAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='_1'
		{
			$current = grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration());
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
