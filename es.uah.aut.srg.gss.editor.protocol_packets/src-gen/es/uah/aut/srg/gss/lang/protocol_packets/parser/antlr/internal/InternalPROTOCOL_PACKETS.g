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
grammar InternalPROTOCOL_PACKETS;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.protocol_packets.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.protocol_packets.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private PROTOCOL_PACKETSGrammarAccess grammarAccess;

    public InternalPROTOCOL_PACKETSParser(TokenStream input, PROTOCOL_PACKETSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected PROTOCOL_PACKETSGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSProtocolPacketsProtocolPacketsParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSProtocolPacketsProtocolPackets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.GSSProtocolPacketsProtocolPackets");
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

// Entry rule entryRuleGSSProtocolPacketsProtocolPackets
entryRuleGSSProtocolPacketsProtocolPackets returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule()); }
	iv_ruleGSSProtocolPacketsProtocolPackets=ruleGSSProtocolPacketsProtocolPackets
	{ $current=$iv_ruleGSSProtocolPacketsProtocolPackets.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSProtocolPacketsProtocolPackets
ruleGSSProtocolPacketsProtocolPackets returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSProtocolPacketsProtocolPackets'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketGSSProtocolPacketsProtocolPacketParserRuleCall_4_0());
				}
				lv_ProtocolPacket_12_0=ruleGSSProtocolPacketsProtocolPacket
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
					}
					add(
						$current,
						"ProtocolPacket",
						lv_ProtocolPacket_12_0,
						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.GSSProtocolPacketsProtocolPacket");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSProtocolPacketsProtocolPacket
entryRuleGSSProtocolPacketsProtocolPacket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketRule()); }
	iv_ruleGSSProtocolPacketsProtocolPacket=ruleGSSProtocolPacketsProtocolPacket
	{ $current=$iv_ruleGSSProtocolPacketsProtocolPacket.current; }
	EOF;

// Rule GSSProtocolPacketsProtocolPacket
ruleGSSProtocolPacketsProtocolPacket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSProtocolPacketsProtocolPacket'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGSSProtocolPacketsProtocolPacketKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
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
			newLeafNode(otherlv_5, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9());
		}
		otherlv_10='levelRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0());
				}
				lv_levelRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
					}
					set(
						$current,
						"levelRef",
						lv_levelRef_12_0,
						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13());
		}
		otherlv_14='export'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSExportExportCrossReference_16_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17());
		}
		otherlv_18='format'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSFormatFormatCrossReference_20_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_21());
		}
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_22());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_23());
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

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
