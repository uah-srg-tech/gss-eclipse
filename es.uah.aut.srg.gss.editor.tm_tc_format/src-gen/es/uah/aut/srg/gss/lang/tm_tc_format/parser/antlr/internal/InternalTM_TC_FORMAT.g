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
grammar InternalTM_TC_FORMAT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tm_tc_format.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tm_tc_format.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tm_tc_format.services.TM_TC_FORMATGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TM_TC_FORMATGrammarAccess grammarAccess;

    public InternalTM_TC_FORMATParser(TokenStream input, TM_TC_FORMATGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected TM_TC_FORMATGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSTmTcFormatTmTCFormatParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSTmTcFormatTmTCFormat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTCFormat");
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
				lv_importURI_1_0=RULE_ID
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSModelFileImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatTmTCFormat
entryRuleGSSTmTcFormatTmTCFormat returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatRule()); }
	iv_ruleGSSTmTcFormatTmTCFormat=ruleGSSTmTcFormatTmTCFormat
	{ $current=$iv_ruleGSSTmTcFormatTmTCFormat.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSTmTcFormatTmTCFormat
ruleGSSTmTcFormatTmTCFormat returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatTmTCFormat'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGSSTmTcFormatTmTCFormatKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_12='protocol'
								{
									newLeafNode(otherlv_12, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolKeyword_3_2_0());
								}
								otherlv_13=':='
								{
									newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_2_1());
								}
								(
									(
										lv_protocol_14_0=RULE_ID
										{
											newLeafNode(lv_protocol_14_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
											}
											setWithLastConsumed(
												$current,
												"protocol",
												lv_protocol_14_0,
												"org.eclipse.xtext.common.Terminals.ID");
										}
									)
								)
								otherlv_15=';'
								{
									newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_2_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>((
									otherlv_16='type'
									{
										newLeafNode(otherlv_16, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeKeyword_3_3_0_0());
									}
									otherlv_17=':='
									{
										newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_3_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeGSSTmTcFormatTmTCFormatTypeEnumRuleCall_3_3_0_2_0());
											}
											lv_type_18_0=ruleGSSTmTcFormatTmTCFormatType
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												set(
													$current,
													"type",
													lv_type_18_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTCFormatType");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_19=';'
									{
										newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_3_0_3());
									}
								)
								(
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0());
											}
											lv_CSField_20_0=ruleGSSTmTcFormatCSField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"CSField",
													lv_CSField_20_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
											}
											lv_CSFormulaField_21_0=ruleGSSTmTcFormatCSFormulaField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"CSFormulaField",
													lv_CSFormulaField_21_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSFormulaField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0());
											}
											lv_VSField_22_0=ruleGSSTmTcFormatVSField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"VSField",
													lv_VSField_22_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVSField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0());
											}
											lv_FDICField_23_0=ruleGSSTmTcFormatFDICField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"FDICField",
													lv_FDICField_23_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFDICField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
											}
											lv_VRFieldSize_24_0=ruleGSSTmTcFormatVRFieldSize
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"VRFieldSize",
													lv_VRFieldSize_24_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVRFieldSize");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0());
											}
											lv_AField_25_0=ruleGSSTmTcFormatAField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"AField",
													lv_AField_25_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0());
											}
											lv_AIField_26_0=ruleGSSTmTcFormatAIField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
												}
												add(
													$current,
													"AIField",
													lv_AIField_26_0,
													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAIField");
												afterParserOrEnumRuleCall();
											}
										)
									)
								)*
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
				}
		)
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_28=';'
		{
			newLeafNode(otherlv_28, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_5());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSTmTcFormatCSField
entryRuleGSSTmTcFormatCSField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldRule()); }
	iv_ruleGSSTmTcFormatCSField=ruleGSSTmTcFormatCSField
	{ $current=$iv_ruleGSSTmTcFormatCSField.current; }
	EOF;

// Rule GSSTmTcFormatCSField
ruleGSSTmTcFormatCSField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatCSField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getGSSTmTcFormatCSFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_ID
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTmTcFormatCSFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSTmTcFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSTmTcFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_32='}'
		{
			newLeafNode(otherlv_32, grammarAccess.getGSSTmTcFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
		}
		otherlv_33=';'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatCSFormulaField
entryRuleGSSTmTcFormatCSFormulaField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule()); }
	iv_ruleGSSTmTcFormatCSFormulaField=ruleGSSTmTcFormatCSFormulaField
	{ $current=$iv_ruleGSSTmTcFormatCSFormulaField.current; }
	EOF;

// Rule GSSTmTcFormatCSFormulaField
ruleGSSTmTcFormatCSFormulaField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatCSFormulaField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGSSTmTcFormatCSFormulaFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_ID
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSTmTcFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSTmTcFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaGSSTmTcFormatFormulaParserRuleCall_29_0());
				}
				lv_formula_32_0=ruleGSSTmTcFormatFormula
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"formula",
						lv_formula_32_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFormula");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatVSField
entryRuleGSSTmTcFormatVSField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldRule()); }
	iv_ruleGSSTmTcFormatVSField=ruleGSSTmTcFormatVSField
	{ $current=$iv_ruleGSSTmTcFormatVSField.current; }
	EOF;

// Rule GSSTmTcFormatVSField
ruleGSSTmTcFormatVSField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatVSField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getGSSTmTcFormatVSFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_ID
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTmTcFormatVSFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSTmTcFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0());
				}
				lv_constSize_30_0=ruleGSSTmTcFormatConstSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"constSize",
						lv_constSize_30_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatConstSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_29_0());
				}
				lv_maxSize_32_0=ruleGSSTmTcFormatMaxSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"maxSize",
						lv_maxSize_32_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatMaxSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_30_0());
				}
				lv_variableSize_33_0=ruleGSSTmTcFormatVariableSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
					}
					set(
						$current,
						"variableSize",
						lv_variableSize_33_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVariableSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatFDICField
entryRuleGSSTmTcFormatFDICField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldRule()); }
	iv_ruleGSSTmTcFormatFDICField=ruleGSSTmTcFormatFDICField
	{ $current=$iv_ruleGSSTmTcFormatFDICField.current; }
	EOF;

// Rule GSSTmTcFormatFDICField
ruleGSSTmTcFormatFDICField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatFDICField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGSSTmTcFormatFDICFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_ID
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTmTcFormatFDICFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='checkType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0());
				}
				lv_checkType_20_0=ruleGSSTmTcFormatCheckType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"checkType",
						lv_checkType_20_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCheckType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSTmTcFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0());
				}
				lv_floatingOffset_31_0=ruleGSSTmTcFormatFloatingOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"floatingOffset",
						lv_floatingOffset_31_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFloatingOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0());
				}
				lv_sortedFieldsToCheck_32_0=ruleGSSTmTcFormatSortedFieldsToCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
					}
					set(
						$current,
						"sortedFieldsToCheck",
						lv_sortedFieldsToCheck_32_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSortedFieldsToCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatVRFieldSize
entryRuleGSSTmTcFormatVRFieldSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeRule()); }
	iv_ruleGSSTmTcFormatVRFieldSize=ruleGSSTmTcFormatVRFieldSize
	{ $current=$iv_ruleGSSTmTcFormatVRFieldSize.current; }
	EOF;

// Rule GSSTmTcFormatVRFieldSize
ruleGSSTmTcFormatVRFieldSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatVRFieldSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGSSTmTcFormatVRFieldSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatAField
entryRuleGSSTmTcFormatAField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldRule()); }
	iv_ruleGSSTmTcFormatAField=ruleGSSTmTcFormatAField
	{ $current=$iv_ruleGSSTmTcFormatAField.current; }
	EOF;

// Rule GSSTmTcFormatAField
ruleGSSTmTcFormatAField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatAField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getGSSTmTcFormatAFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatAFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatAFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_ID
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTmTcFormatAFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSTmTcFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSTmTcFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0());
				}
				lv_arrayDimension_32_0=ruleGSSTmTcFormatArrayDimension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
					}
					set(
						$current,
						"arrayDimension",
						lv_arrayDimension_32_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatArrayDimension");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatAFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatAIField
entryRuleGSSTmTcFormatAIField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldRule()); }
	iv_ruleGSSTmTcFormatAIField=ruleGSSTmTcFormatAIField
	{ $current=$iv_ruleGSSTmTcFormatAIField.current; }
	EOF;

// Rule GSSTmTcFormatAIField
ruleGSSTmTcFormatAIField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatAIField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getGSSTmTcFormatAIFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_ID
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameIDTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_ID
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTmTcFormatAIFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSTmTcFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSTmTcFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0());
				}
				lv_localOffset_31_0=ruleGSSTmTcFormatLocalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"localOffset",
						lv_localOffset_31_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatLocalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0());
				}
				lv_arrayRef_32_0=ruleGSSTmTcFormatArrayRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
					}
					set(
						$current,
						"arrayRef",
						lv_arrayRef_32_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatArrayRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatSize
entryRuleGSSTmTcFormatSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatSizeRule()); }
	iv_ruleGSSTmTcFormatSize=ruleGSSTmTcFormatSize
	{ $current=$iv_ruleGSSTmTcFormatSize.current; }
	EOF;

// Rule GSSTmTcFormatSize
ruleGSSTmTcFormatSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatSizeAccess().getGSSTmTcFormatSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatGlobalOffset
entryRuleGSSTmTcFormatGlobalOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetRule()); }
	iv_ruleGSSTmTcFormatGlobalOffset=ruleGSSTmTcFormatGlobalOffset
	{ $current=$iv_ruleGSSTmTcFormatGlobalOffset.current; }
	EOF;

// Rule GSSTmTcFormatGlobalOffset
ruleGSSTmTcFormatGlobalOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatGlobalOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGSSTmTcFormatGlobalOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatGlobalOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatGlobalOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatFormula
entryRuleGSSTmTcFormatFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatFormulaRule()); }
	iv_ruleGSSTmTcFormatFormula=ruleGSSTmTcFormatFormula
	{ $current=$iv_ruleGSSTmTcFormatFormula.current; }
	EOF;

// Rule GSSTmTcFormatFormula
ruleGSSTmTcFormatFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatFormula'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFormulaAccess().getGSSTmTcFormatFormulaKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='slope'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeREALParserRuleCall_4_0());
				}
				lv_slope_4_0=ruleREAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFormulaRule());
					}
					set(
						$current,
						"slope",
						lv_slope_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.REAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_5());
		}
		otherlv_6='intercept'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptREALParserRuleCall_8_0());
				}
				lv_intercept_8_0=ruleREAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFormulaRule());
					}
					set(
						$current,
						"intercept",
						lv_intercept_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.REAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatFormulaAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatConstSize
entryRuleGSSTmTcFormatConstSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeRule()); }
	iv_ruleGSSTmTcFormatConstSize=ruleGSSTmTcFormatConstSize
	{ $current=$iv_ruleGSSTmTcFormatConstSize.current; }
	EOF;

// Rule GSSTmTcFormatConstSize
ruleGSSTmTcFormatConstSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatConstSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatConstSizeAccess().getGSSTmTcFormatConstSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatConstSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatConstSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatMaxSize
entryRuleGSSTmTcFormatMaxSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeRule()); }
	iv_ruleGSSTmTcFormatMaxSize=ruleGSSTmTcFormatMaxSize
	{ $current=$iv_ruleGSSTmTcFormatMaxSize.current; }
	EOF;

// Rule GSSTmTcFormatMaxSize
ruleGSSTmTcFormatMaxSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatMaxSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGSSTmTcFormatMaxSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatMaxSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatMaxSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatVariableSize
entryRuleGSSTmTcFormatVariableSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeRule()); }
	iv_ruleGSSTmTcFormatVariableSize=ruleGSSTmTcFormatVariableSize
	{ $current=$iv_ruleGSSTmTcFormatVariableSize.current; }
	EOF;

// Rule GSSTmTcFormatVariableSize
ruleGSSTmTcFormatVariableSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatVariableSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGSSTmTcFormatVariableSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVariableSizeRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='unit'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitGSSTmTcFormatUnitEnumRuleCall_8_0());
				}
				lv_unit_8_0=ruleGSSTmTcFormatUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVariableSizeRule());
					}
					set(
						$current,
						"unit",
						lv_unit_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='power'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0());
					}
					lv_power_12_0=ruleGSSTmTcFormatPower
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVariableSizeRule());
						}
						set(
							$current,
							"power",
							lv_power_12_0,
							"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatPower");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_10_3());
			}
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatFloatingOffset
entryRuleGSSTmTcFormatFloatingOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatFloatingOffsetRule()); }
	iv_ruleGSSTmTcFormatFloatingOffset=ruleGSSTmTcFormatFloatingOffset
	{ $current=$iv_ruleGSSTmTcFormatFloatingOffset.current; }
	EOF;

// Rule GSSTmTcFormatFloatingOffset
ruleGSSTmTcFormatFloatingOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatFloatingOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGSSTmTcFormatFloatingOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFloatingOffsetRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatSortedFieldsToCheck
entryRuleGSSTmTcFormatSortedFieldsToCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckRule()); }
	iv_ruleGSSTmTcFormatSortedFieldsToCheck=ruleGSSTmTcFormatSortedFieldsToCheck
	{ $current=$iv_ruleGSSTmTcFormatSortedFieldsToCheck.current; }
	EOF;

// Rule GSSTmTcFormatSortedFieldsToCheck
ruleGSSTmTcFormatSortedFieldsToCheck returns [EObject current=null]
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
					grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckAction_0(),
					$current);
			}
		)
		otherlv_1='GSSTmTcFormatSortedFieldsToCheck'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0());
				}
				lv_fieldToCheck_3_0=ruleGSSTmTcFormatFieldToCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckRule());
					}
					add(
						$current,
						"fieldToCheck",
						lv_fieldToCheck_3_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldToCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatFieldToCheck
entryRuleGSSTmTcFormatFieldToCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatFieldToCheckRule()); }
	iv_ruleGSSTmTcFormatFieldToCheck=ruleGSSTmTcFormatFieldToCheck
	{ $current=$iv_ruleGSSTmTcFormatFieldToCheck.current; }
	EOF;

// Rule GSSTmTcFormatFieldToCheck
ruleGSSTmTcFormatFieldToCheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatFieldToCheck'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGSSTmTcFormatFieldToCheckKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFieldToCheckRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatArrayDimension
entryRuleGSSTmTcFormatArrayDimension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionRule()); }
	iv_ruleGSSTmTcFormatArrayDimension=ruleGSSTmTcFormatArrayDimension
	{ $current=$iv_ruleGSSTmTcFormatArrayDimension.current; }
	EOF;

// Rule GSSTmTcFormatArrayDimension
ruleGSSTmTcFormatArrayDimension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatArrayDimension'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGSSTmTcFormatArrayDimensionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatArrayDimensionRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_5());
		}
		otherlv_6='maxItems'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
				}
				lv_maxItems_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatArrayDimensionRule());
					}
					set(
						$current,
						"maxItems",
						lv_maxItems_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatLocalOffset
entryRuleGSSTmTcFormatLocalOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetRule()); }
	iv_ruleGSSTmTcFormatLocalOffset=ruleGSSTmTcFormatLocalOffset
	{ $current=$iv_ruleGSSTmTcFormatLocalOffset.current; }
	EOF;

// Rule GSSTmTcFormatLocalOffset
ruleGSSTmTcFormatLocalOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatLocalOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGSSTmTcFormatLocalOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatLocalOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatLocalOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTmTcFormatArrayRef
entryRuleGSSTmTcFormatArrayRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTmTcFormatArrayRefRule()); }
	iv_ruleGSSTmTcFormatArrayRef=ruleGSSTmTcFormatArrayRef
	{ $current=$iv_ruleGSSTmTcFormatArrayRef.current; }
	EOF;

// Rule GSSTmTcFormatArrayRef
ruleGSSTmTcFormatArrayRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTmTcFormatArrayRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatArrayRefAccess().getGSSTmTcFormatArrayRefKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatArrayRefAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTmTcFormatArrayRefRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_7());
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

// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getREALRule()); }
	iv_ruleREAL=ruleREAL
	{ $current=$iv_ruleREAL.current.getText(); }
	EOF;

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1());
			}
			this_INT_3=RULE_INT
			{
				$current.merge(this_INT_3);
			}
			{
				newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2());
			}
		)
		(
			kw='e'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0());
			}
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1());
				}
			)?
			this_INT_6=RULE_INT
			{
				$current.merge(this_INT_6);
			}
			{
				newLeafNode(this_INT_6, grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2());
			}
		)?
	)
;

// Rule GSSTmTcFormatTmTCFormatType
ruleGSSTmTcFormatTmTCFormatType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TM'
			{
				$current = grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTMEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TC'
			{
				$current = grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTCEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSTmTcFormatFieldType
ruleGSSTmTcFormatFieldType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='structured'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='uint'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='flag'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='enumerated'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='bit_vector'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='byte_vector'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='float'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='deduced'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule GSSTmTcFormatFieldByteOrder
ruleGSSTmTcFormatFieldByteOrder returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='big_endian'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='little_endian'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='na'
			{
				$current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSTmTcFormatSFieldFirstBit
ruleGSSTmTcFormatSFieldFirstBit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='MSB'
			{
				$current = grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LSB'
			{
				$current = grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSTmTcFormatUnit
ruleGSSTmTcFormatUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSTmTcFormatUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatUnitAccess().getBytesEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bits'
			{
				$current = grammarAccess.getGSSTmTcFormatUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatUnitAccess().getBitsEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='halfword'
			{
				$current = grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='string10'
			{
				$current = grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='string17'
			{
				$current = grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='string69'
			{
				$current = grammarAccess.getGSSTmTcFormatUnitAccess().getString69EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getGSSTmTcFormatUnitAccess().getString69EnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule GSSTmTcFormatPower
ruleGSSTmTcFormatPower returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='2bits'
			{
				$current = grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='2bits_with_0'
			{
				$current = grammarAccess.getGSSTmTcFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSTmTcFormatCheckType
ruleGSSTmTcFormatCheckType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='crc16'
			{
				$current = grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='checksum16'
			{
				$current = grammarAccess.getGSSTmTcFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1());
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
