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
grammar InternalIFACE;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.iface.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.iface.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private IFACEGrammarAccess grammarAccess;

    public InternalIFACEParser(TokenStream input, IFACEGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected IFACEGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSIfacePortConfigParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSIfacePortConfig
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortConfig");
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
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSModelFileImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleGSSIfacePortConfig
entryRuleGSSIfacePortConfig returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSIfacePortConfigRule()); }
	iv_ruleGSSIfacePortConfig=ruleGSSIfacePortConfig
	{ $current=$iv_ruleGSSIfacePortConfig.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSIfacePortConfig
ruleGSSIfacePortConfig returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='portConfig'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSIfacePortConfigAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSIfacePortConfigRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.iface.IFACE.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.iface.IFACE.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigGSSIfacePortParserRuleCall_4_0());
				}
				lv_portConfig_12_0=ruleGSSIfacePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
					}
					set(
						$current,
						"portConfig",
						lv_portConfig_12_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePort");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSIfacePort
entryRuleGSSIfacePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfacePortRule()); }
	iv_ruleGSSIfacePort=ruleGSSIfacePort
	{ $current=$iv_ruleGSSIfacePort.current; }
	EOF;

// Rule GSSIfacePort
ruleGSSIfacePort returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWPortParserRuleCall_0());
		}
		this_GSSIfaceSpWPort_0=ruleGSSIfaceSpWPort
		{
			$current = $this_GSSIfaceSpWPort_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceUartPortParserRuleCall_1());
		}
		this_GSSIfaceUartPort_1=ruleGSSIfaceUartPort
		{
			$current = $this_GSSIfaceUartPort_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_2());
		}
		this_GSSIfaceSpWTCPort_2=ruleGSSIfaceSpWTCPort
		{
			$current = $this_GSSIfaceSpWTCPort_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_3());
		}
		this_GSSIfaceDummyPort_3=ruleGSSIfaceDummyPort
		{
			$current = $this_GSSIfaceDummyPort_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSIfaceSpWPort
entryRuleGSSIfaceSpWPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceSpWPortRule()); }
	iv_ruleGSSIfaceSpWPort=ruleGSSIfaceSpWPort
	{ $current=$iv_ruleGSSIfaceSpWPort.current; }
	EOF;

// Rule GSSIfaceSpWPort
ruleGSSIfaceSpWPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='spwPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleGSSIfaceSpWPortType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWPortType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5());
		}
		otherlv_6='link'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_8_0());
				}
				lv_link_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
					}
					set(
						$current,
						"link",
						lv_link_8_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9());
		}
		otherlv_10='writingPort'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_12_0());
				}
				lv_writingPort_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
					}
					set(
						$current,
						"writingPort",
						lv_writingPort_12_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_14_0());
				}
				lv_readingPort_14_0=ruleGSSIfaceReadingPort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
					}
					add(
						$current,
						"readingPort",
						lv_readingPort_14_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceReadingPort");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSIfaceReadingPort
entryRuleGSSIfaceReadingPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceReadingPortRule()); }
	iv_ruleGSSIfaceReadingPort=ruleGSSIfaceReadingPort
	{ $current=$iv_ruleGSSIfaceReadingPort.current; }
	EOF;

// Rule GSSIfaceReadingPort
ruleGSSIfaceReadingPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='readingPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='port'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_4_0());
				}
				lv_port_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceReadingPortRule());
					}
					set(
						$current,
						"port",
						lv_port_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSIfaceUartPort
entryRuleGSSIfaceUartPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceUartPortRule()); }
	iv_ruleGSSIfaceUartPort=ruleGSSIfaceUartPort
	{ $current=$iv_ruleGSSIfaceUartPort.current; }
	EOF;

// Rule GSSIfaceUartPort
ruleGSSIfaceUartPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='uartPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='number'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_4_0());
				}
				lv_number_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"number",
						lv_number_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5());
		}
		otherlv_6='baudRate'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0());
				}
				lv_baudRate_8_0=ruleGSSIfaceUartPortBaudRate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"baudRate",
						lv_baudRate_8_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortBaudRate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9());
		}
		otherlv_10='parity'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_12_0());
				}
				lv_parity_12_0=ruleGSSIfaceUartPortParity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"parity",
						lv_parity_12_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortParity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13());
		}
		otherlv_14='dataBits'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0());
				}
				lv_dataBits_16_0=ruleGSSIfaceUartPortDataBits
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"dataBits",
						lv_dataBits_16_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortDataBits");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17());
		}
		otherlv_18='stopBits'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0());
				}
				lv_stopBits_20_0=ruleGSSIfaceUartPortStopBits
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"stopBits",
						lv_stopBits_20_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortStopBits");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21());
		}
		otherlv_22='inputQueueSize'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_24_0());
				}
				lv_inputQueueSize_24_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"inputQueueSize",
						lv_inputQueueSize_24_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25());
		}
		otherlv_26='outputQueueSize'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_26());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_27());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_28_0());
				}
				lv_outputQueueSize_28_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"outputQueueSize",
						lv_outputQueueSize_28_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_29());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_30_0());
				}
				lv_uartProtocol_30_0=ruleGSSIfaceUartProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
					}
					set(
						$current,
						"uartProtocol",
						lv_uartProtocol_30_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocol");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_31='}'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_31());
		}
		otherlv_32=';'
		{
			newLeafNode(otherlv_32, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleGSSIfaceUartProtocol
entryRuleGSSIfaceUartProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceUartProtocolRule()); }
	iv_ruleGSSIfaceUartProtocol=ruleGSSIfaceUartProtocol
	{ $current=$iv_ruleGSSIfaceUartProtocol.current; }
	EOF;

// Rule GSSIfaceUartProtocol
ruleGSSIfaceUartProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='uartProtocol'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='unit'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_4_0());
				}
				lv_unit_4_0=ruleGSSIfaceUartProtocolUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
					}
					set(
						$current,
						"unit",
						lv_unit_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_5());
		}
		otherlv_6='power'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_8_0());
				}
				lv_power_8_0=ruleGSSIfaceUartProtocolPower
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
					}
					set(
						$current,
						"power",
						lv_power_8_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolPower");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0());
				}
				lv_constSize_10_0=ruleGSSIfaceConstSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
					}
					set(
						$current,
						"constSize",
						lv_constSize_10_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceConstSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0());
				}
				lv_sizeFieldOffset_11_0=ruleGSSIfaceSizeFieldOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
					}
					set(
						$current,
						"sizeFieldOffset",
						lv_sizeFieldOffset_11_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0());
				}
				lv_sizeFieldTrim_12_0=ruleGSSIfaceSizeFieldTrim
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
					}
					set(
						$current,
						"sizeFieldTrim",
						lv_sizeFieldTrim_12_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldTrim");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0());
				}
				lv_syncPattern_13_0=ruleGSSIfaceSyncPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
					}
					set(
						$current,
						"syncPattern",
						lv_syncPattern_13_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSyncPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSIfaceConstSize
entryRuleGSSIfaceConstSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceConstSizeRule()); }
	iv_ruleGSSIfaceConstSize=ruleGSSIfaceConstSize
	{ $current=$iv_ruleGSSIfaceConstSize.current; }
	EOF;

// Rule GSSIfaceConstSize
ruleGSSIfaceConstSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceConstSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceConstSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSIfaceSizeFieldOffset
entryRuleGSSIfaceSizeFieldOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetRule()); }
	iv_ruleGSSIfaceSizeFieldOffset=ruleGSSIfaceSizeFieldOffset
	{ $current=$iv_ruleGSSIfaceSizeFieldOffset.current; }
	EOF;

// Rule GSSIfaceSizeFieldOffset
ruleGSSIfaceSizeFieldOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sizeFieldOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSIfaceSizeFieldTrim
entryRuleGSSIfaceSizeFieldTrim returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimRule()); }
	iv_ruleGSSIfaceSizeFieldTrim=ruleGSSIfaceSizeFieldTrim
	{ $current=$iv_ruleGSSIfaceSizeFieldTrim.current; }
	EOF;

// Rule GSSIfaceSizeFieldTrim
ruleGSSIfaceSizeFieldTrim returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sizeFieldTrim'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldTrimRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldTrimRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSIfaceSyncPattern
entryRuleGSSIfaceSyncPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceSyncPatternRule()); }
	iv_ruleGSSIfaceSyncPattern=ruleGSSIfaceSyncPattern
	{ $current=$iv_ruleGSSIfaceSyncPattern.current; }
	EOF;

// Rule GSSIfaceSyncPattern
ruleGSSIfaceSyncPattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='syncPattern'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='hexValue'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_hexValue_4_0=RULE_HEXADECIMAL
				{
					newLeafNode(lv_hexValue_4_0, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSIfaceSyncPatternRule());
					}
					setWithLastConsumed(
						$current,
						"hexValue",
						lv_hexValue_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.HEXADECIMAL");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSIfaceSpWTCPort
entryRuleGSSIfaceSpWTCPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceSpWTCPortRule()); }
	iv_ruleGSSIfaceSpWTCPort=ruleGSSIfaceSpWTCPort
	{ $current=$iv_ruleGSSIfaceSpWTCPort.current; }
	EOF;

// Rule GSSIfaceSpWTCPort
ruleGSSIfaceSpWTCPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='spwTCPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='spwPortRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_4_0());
				}
				lv_spwPortRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSIfaceSpWTCPortRule());
					}
					set(
						$current,
						"spwPortRef",
						lv_spwPortRef_4_0,
						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSIfaceDummyPort
entryRuleGSSIfaceDummyPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSIfaceDummyPortRule()); }
	iv_ruleGSSIfaceDummyPort=ruleGSSIfaceDummyPort
	{ $current=$iv_ruleGSSIfaceDummyPort.current; }
	EOF;

// Rule GSSIfaceDummyPort
ruleGSSIfaceDummyPort returns [EObject current=null]
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
					grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0(),
					$current);
			}
		)
		otherlv_1='dummyPort'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4());
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

// Rule GSSIfaceSpWPortType
ruleGSSIfaceSpWPortType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='usb'
			{
				$current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='mk2'
			{
				$current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='pci'
			{
				$current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSIfaceUartPortBaudRate
ruleGSSIfaceUartPortBaudRate returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='38400bauds'
			{
				$current = grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='115200bauds'
			{
				$current = grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSIfaceUartPortParity
ruleGSSIfaceUartPortParity returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NO'
			{
				$current = grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ODD'
			{
				$current = grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='EVEN'
			{
				$current = grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MARK'
			{
				$current = grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='SPACE'
			{
				$current = grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule GSSIfaceUartPortDataBits
ruleGSSIfaceUartPortDataBits returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='5bits'
			{
				$current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='6bits'
			{
				$current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='7bits'
			{
				$current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='8bits'
			{
				$current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule GSSIfaceUartPortStopBits
ruleGSSIfaceUartPortStopBits returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='1bit'
			{
				$current = grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='2bits'
			{
				$current = grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSIfaceUartProtocolUnit
ruleGSSIfaceUartProtocolUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='bytes'
			{
				$current = grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bits'
			{
				$current = grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSIfaceUartProtocolPower
ruleGSSIfaceUartProtocolPower returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='no'
			{
				$current = grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='2bits'
			{
				$current = grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='2_with_0'
			{
				$current = grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2());
			}
		)
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
