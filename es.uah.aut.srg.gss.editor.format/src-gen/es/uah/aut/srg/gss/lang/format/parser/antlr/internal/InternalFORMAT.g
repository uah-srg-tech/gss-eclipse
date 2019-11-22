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
grammar InternalFORMAT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.format.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.format.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.format.services.FORMATGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private FORMATGrammarAccess grammarAccess;

    public InternalFORMATParser(TokenStream input, FORMATGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected FORMATGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSFormatFormatParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSFormatFormat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormat");
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

// Entry rule entryRuleGSSFormatFormat
entryRuleGSSFormatFormat returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSFormatFormatRule()); }
	iv_ruleGSSFormatFormat=ruleGSSFormatFormat
	{ $current=$iv_ruleGSSFormatFormat.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSFormatFormat
ruleGSSFormatFormat returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatFormat'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFormatAccess().getGSSFormatFormatKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSFormatFormatAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatFormatRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFormatAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSFormatFormatAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.format.FORMAT.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSFormatFormatAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.format.FORMAT.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_12='protocol'
								{
									newLeafNode(otherlv_12, grammarAccess.getGSSFormatFormatAccess().getProtocolKeyword_3_2_0());
								}
								otherlv_13=':='
								{
									newLeafNode(otherlv_13, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_2_1());
								}
								(
									(
										lv_protocol_14_0=RULE_ID
										{
											newLeafNode(lv_protocol_14_0, grammarAccess.getGSSFormatFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getGSSFormatFormatRule());
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
									newLeafNode(otherlv_15, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_2_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>((
									otherlv_16='type'
									{
										newLeafNode(otherlv_16, grammarAccess.getGSSFormatFormatAccess().getTypeKeyword_3_3_0_0());
									}
									otherlv_17=':='
									{
										newLeafNode(otherlv_17, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_3_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getTypeGSSFormatFormatTypeEnumRuleCall_3_3_0_2_0());
											}
											lv_type_18_0=ruleGSSFormatFormatType
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												set(
													$current,
													"type",
													lv_type_18_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormatType");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_19=';'
									{
										newLeafNode(otherlv_19, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_3_0_3());
									}
								)
								(
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getCSFieldGSSFormatCSFieldParserRuleCall_3_3_1_0_0());
											}
											lv_CSField_20_0=ruleGSSFormatCSField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"CSField",
													lv_CSField_20_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCSField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getCSFormulaFieldGSSFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
											}
											lv_CSFormulaField_21_0=ruleGSSFormatCSFormulaField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"CSFormulaField",
													lv_CSFormulaField_21_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCSFormulaField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVSFieldGSSFormatVSFieldParserRuleCall_3_3_1_2_0());
											}
											lv_VSField_22_0=ruleGSSFormatVSField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"VSField",
													lv_VSField_22_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVSField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getFDICFieldGSSFormatFDICFieldParserRuleCall_3_3_1_3_0());
											}
											lv_FDICField_23_0=ruleGSSFormatFDICField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"FDICField",
													lv_FDICField_23_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFDICField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVRFieldSizeGSSFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
											}
											lv_VRFieldSize_24_0=ruleGSSFormatVRFieldSize
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"VRFieldSize",
													lv_VRFieldSize_24_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVRFieldSize");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getAFieldGSSFormatAFieldParserRuleCall_3_3_1_5_0());
											}
											lv_AField_25_0=ruleGSSFormatAField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"AField",
													lv_AField_25_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatAField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getAIFieldGSSFormatAIFieldParserRuleCall_3_3_1_6_0());
											}
											lv_AIField_26_0=ruleGSSFormatAIField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
												}
												add(
													$current,
													"AIField",
													lv_AIField_26_0,
													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatAIField");
												afterParserOrEnumRuleCall();
											}
										)
									)
								)*
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
				}
		)
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatFormatAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_28=';'
		{
			newLeafNode(otherlv_28, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_5());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSFormatCSField
entryRuleGSSFormatCSField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatCSFieldRule()); }
	iv_ruleGSSFormatCSField=ruleGSSFormatCSField
	{ $current=$iv_ruleGSSFormatCSField.current; }
	EOF;

// Rule GSSFormatCSField
ruleGSSFormatCSField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatCSField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatCSFieldAccess().getGSSFormatCSFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatCSFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatCSFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatCSFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatCSFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFormatCSFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFormatCSFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFormatCSFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFormatCSFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSFormatCSFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleGSSFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_32='}'
		{
			newLeafNode(otherlv_32, grammarAccess.getGSSFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
		}
		otherlv_33=';'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleGSSFormatCSFormulaField
entryRuleGSSFormatCSFormulaField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldRule()); }
	iv_ruleGSSFormatCSFormulaField=ruleGSSFormatCSFormulaField
	{ $current=$iv_ruleGSSFormatCSFormulaField.current; }
	EOF;

// Rule GSSFormatCSFormulaField
ruleGSSFormatCSFormulaField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatCSFormulaField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatCSFormulaFieldAccess().getGSSFormatCSFormulaFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFormatCSFormulaFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleGSSFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaGSSFormatFormulaParserRuleCall_29_0());
				}
				lv_formula_32_0=ruleGSSFormatFormula
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"formula",
						lv_formula_32_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormula");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSFormatVSField
entryRuleGSSFormatVSField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatVSFieldRule()); }
	iv_ruleGSSFormatVSField=ruleGSSFormatVSField
	{ $current=$iv_ruleGSSFormatVSField.current; }
	EOF;

// Rule GSSFormatVSField
ruleGSSFormatVSField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatVSField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatVSFieldAccess().getGSSFormatVSFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatVSFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatVSFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatVSFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatVSFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFormatVSFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFormatVSFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFormatVSFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFormatVSFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSFormatVSFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeGSSFormatConstSizeParserRuleCall_27_0());
				}
				lv_constSize_30_0=ruleGSSFormatConstSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"constSize",
						lv_constSize_30_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatConstSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeGSSFormatVariableSizeParserRuleCall_28_0());
				}
				lv_variableSize_31_0=ruleGSSFormatVariableSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"variableSize",
						lv_variableSize_31_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVariableSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeGSSFormatMaxSizeParserRuleCall_29_0());
				}
				lv_maxSize_32_0=ruleGSSFormatMaxSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"maxSize",
						lv_maxSize_32_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatMaxSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0());
				}
				lv_globalOffset_33_0=ruleGSSFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_33_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleGSSFormatVRFieldSize
entryRuleGSSFormatVRFieldSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatVRFieldSizeRule()); }
	iv_ruleGSSFormatVRFieldSize=ruleGSSFormatVRFieldSize
	{ $current=$iv_ruleGSSFormatVRFieldSize.current; }
	EOF;

// Rule GSSFormatVRFieldSize
ruleGSSFormatVRFieldSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatVRFieldSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatVRFieldSizeAccess().getGSSFormatVRFieldSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatVRFieldSizeAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVRFieldSizeRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVRFieldSizeRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatVRFieldSizeAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatVRFieldSizeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSFormatFDICField
entryRuleGSSFormatFDICField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatFDICFieldRule()); }
	iv_ruleGSSFormatFDICField=ruleGSSFormatFDICField
	{ $current=$iv_ruleGSSFormatFDICField.current; }
	EOF;

// Rule GSSFormatFDICField
ruleGSSFormatFDICField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatFDICField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFDICFieldAccess().getGSSFormatFDICFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFDICFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFDICFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatFDICFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatFDICFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFormatFDICFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='checkType'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0());
				}
				lv_checkType_20_0=ruleGSSFormatCheckType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"checkType",
						lv_checkType_20_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCheckType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleGSSFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0());
				}
				lv_floatingOffset_31_0=ruleGSSFormatFloatingOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"floatingOffset",
						lv_floatingOffset_31_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFloatingOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0());
				}
				lv_sortedFieldsToCheck_32_0=ruleGSSFormatSortedFieldsToCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
					}
					set(
						$current,
						"sortedFieldsToCheck",
						lv_sortedFieldsToCheck_32_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSortedFieldsToCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSFormatAField
entryRuleGSSFormatAField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatAFieldRule()); }
	iv_ruleGSSFormatAField=ruleGSSFormatAField
	{ $current=$iv_ruleGSSFormatAField.current; }
	EOF;

// Rule GSSFormatAField
ruleGSSFormatAField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatAField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatAFieldAccess().getGSSFormatAFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatAFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatAFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatAFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatAFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFormatAFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFormatAFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFormatAFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFormatAFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSFormatAFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0());
				}
				lv_arrayDimension_30_0=ruleGSSFormatArrayDimension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"arrayDimension",
						lv_arrayDimension_30_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatArrayDimension");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0());
				}
				lv_size_31_0=ruleGSSFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_31_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0());
				}
				lv_globalOffset_32_0=ruleGSSFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_32_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSFormatAFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSFormatAIField
entryRuleGSSFormatAIField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatAIFieldRule()); }
	iv_ruleGSSFormatAIField=ruleGSSFormatAIField
	{ $current=$iv_ruleGSSFormatAIField.current; }
	EOF;

// Rule GSSFormatAIField
ruleGSSFormatAIField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatAIField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatAIFieldAccess().getGSSFormatAIFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatAIFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatAIFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatAIFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatAIFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFormatAIFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFormatAIFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFormatAIFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleGSSFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFormatAIFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSFormatAIFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefGSSFormatArrayRefParserRuleCall_27_0());
				}
				lv_arrayRef_30_0=ruleGSSFormatArrayRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"arrayRef",
						lv_arrayRef_30_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatArrayRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0());
				}
				lv_size_31_0=ruleGSSFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_31_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0());
				}
				lv_localOffset_32_0=ruleGSSFormatLocalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
					}
					set(
						$current,
						"localOffset",
						lv_localOffset_32_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatLocalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleGSSFormatSize
entryRuleGSSFormatSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatSizeRule()); }
	iv_ruleGSSFormatSize=ruleGSSFormatSize
	{ $current=$iv_ruleGSSFormatSize.current; }
	EOF;

// Rule GSSFormatSize
ruleGSSFormatSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatSizeAccess().getGSSFormatSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatGlobalOffset
entryRuleGSSFormatGlobalOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatGlobalOffsetRule()); }
	iv_ruleGSSFormatGlobalOffset=ruleGSSFormatGlobalOffset
	{ $current=$iv_ruleGSSFormatGlobalOffset.current; }
	EOF;

// Rule GSSFormatGlobalOffset
ruleGSSFormatGlobalOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatGlobalOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatGlobalOffsetAccess().getGSSFormatGlobalOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatGlobalOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatGlobalOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatFormula
entryRuleGSSFormatFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatFormulaRule()); }
	iv_ruleGSSFormatFormula=ruleGSSFormatFormula
	{ $current=$iv_ruleGSSFormatFormula.current; }
	EOF;

// Rule GSSFormatFormula
ruleGSSFormatFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatFormula'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFormulaAccess().getGSSFormatFormulaKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='slope'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFormulaAccess().getSlopeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_slope_4_0=RULE_STRING
				{
					newLeafNode(lv_slope_4_0, grammarAccess.getGSSFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatFormulaRule());
					}
					setWithLastConsumed(
						$current,
						"slope",
						lv_slope_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_5());
		}
		otherlv_6='intercept'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFormulaAccess().getInterceptKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_intercept_8_0=RULE_STRING
				{
					newLeafNode(lv_intercept_8_0, grammarAccess.getGSSFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFormatFormulaRule());
					}
					setWithLastConsumed(
						$current,
						"intercept",
						lv_intercept_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatFormulaAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatConstSize
entryRuleGSSFormatConstSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatConstSizeRule()); }
	iv_ruleGSSFormatConstSize=ruleGSSFormatConstSize
	{ $current=$iv_ruleGSSFormatConstSize.current; }
	EOF;

// Rule GSSFormatConstSize
ruleGSSFormatConstSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatConstSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatConstSizeAccess().getGSSFormatConstSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatConstSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatConstSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatConstSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatConstSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatMaxSize
entryRuleGSSFormatMaxSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatMaxSizeRule()); }
	iv_ruleGSSFormatMaxSize=ruleGSSFormatMaxSize
	{ $current=$iv_ruleGSSFormatMaxSize.current; }
	EOF;

// Rule GSSFormatMaxSize
ruleGSSFormatMaxSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatMaxSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatMaxSizeAccess().getGSSFormatMaxSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatMaxSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatMaxSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatMaxSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatMaxSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatVariableSize
entryRuleGSSFormatVariableSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatVariableSizeRule()); }
	iv_ruleGSSFormatVariableSize=ruleGSSFormatVariableSize
	{ $current=$iv_ruleGSSFormatVariableSize.current; }
	EOF;

// Rule GSSFormatVariableSize
ruleGSSFormatVariableSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatVariableSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatVariableSizeAccess().getGSSFormatVariableSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatVariableSizeAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVariableSizeRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='unit'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatVariableSizeAccess().getUnitKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatVariableSizeAccess().getUnitGSSFormatUnitEnumRuleCall_8_0());
				}
				lv_unit_8_0=ruleGSSFormatUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatVariableSizeRule());
					}
					set(
						$current,
						"unit",
						lv_unit_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='power'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSFormatVariableSizeAccess().getPowerKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSFormatVariableSizeAccess().getPowerGSSFormatPowerEnumRuleCall_10_2_0());
					}
					lv_power_12_0=ruleGSSFormatPower
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSFormatVariableSizeRule());
						}
						set(
							$current,
							"power",
							lv_power_12_0,
							"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatPower");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_10_3());
			}
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleGSSFormatFloatingOffset
entryRuleGSSFormatFloatingOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatFloatingOffsetRule()); }
	iv_ruleGSSFormatFloatingOffset=ruleGSSFormatFloatingOffset
	{ $current=$iv_ruleGSSFormatFloatingOffset.current; }
	EOF;

// Rule GSSFormatFloatingOffset
ruleGSSFormatFloatingOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatFloatingOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFloatingOffsetAccess().getGSSFormatFloatingOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFloatingOffsetRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSFormatSortedFieldsToCheck
entryRuleGSSFormatSortedFieldsToCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatSortedFieldsToCheckRule()); }
	iv_ruleGSSFormatSortedFieldsToCheck=ruleGSSFormatSortedFieldsToCheck
	{ $current=$iv_ruleGSSFormatSortedFieldsToCheck.current; }
	EOF;

// Rule GSSFormatSortedFieldsToCheck
ruleGSSFormatSortedFieldsToCheck returns [EObject current=null]
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
					grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckAction_0(),
					$current);
			}
		)
		otherlv_1='GSSFormatSortedFieldsToCheck'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0());
				}
				lv_fieldToCheck_3_0=ruleGSSFormatFieldToCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatSortedFieldsToCheckRule());
					}
					add(
						$current,
						"fieldToCheck",
						lv_fieldToCheck_3_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldToCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSFormatFieldToCheck
entryRuleGSSFormatFieldToCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatFieldToCheckRule()); }
	iv_ruleGSSFormatFieldToCheck=ruleGSSFormatFieldToCheck
	{ $current=$iv_ruleGSSFormatFieldToCheck.current; }
	EOF;

// Rule GSSFormatFieldToCheck
ruleGSSFormatFieldToCheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatFieldToCheck'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFieldToCheckAccess().getGSSFormatFieldToCheckKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatFieldToCheckRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSFormatArrayDimension
entryRuleGSSFormatArrayDimension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatArrayDimensionRule()); }
	iv_ruleGSSFormatArrayDimension=ruleGSSFormatArrayDimension
	{ $current=$iv_ruleGSSFormatArrayDimension.current; }
	EOF;

// Rule GSSFormatArrayDimension
ruleGSSFormatArrayDimension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatArrayDimension'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatArrayDimensionAccess().getGSSFormatArrayDimensionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatArrayDimensionRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_5());
		}
		otherlv_6='maxItems'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
				}
				lv_maxItems_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatArrayDimensionRule());
					}
					set(
						$current,
						"maxItems",
						lv_maxItems_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatLocalOffset
entryRuleGSSFormatLocalOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatLocalOffsetRule()); }
	iv_ruleGSSFormatLocalOffset=ruleGSSFormatLocalOffset
	{ $current=$iv_ruleGSSFormatLocalOffset.current; }
	EOF;

// Rule GSSFormatLocalOffset
ruleGSSFormatLocalOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatLocalOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatLocalOffsetAccess().getGSSFormatLocalOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatLocalOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatLocalOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatLocalOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatLocalOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSFormatArrayRef
entryRuleGSSFormatArrayRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFormatArrayRefRule()); }
	iv_ruleGSSFormatArrayRef=ruleGSSFormatArrayRef
	{ $current=$iv_ruleGSSFormatArrayRef.current; }
	EOF;

// Rule GSSFormatArrayRef
ruleGSSFormatArrayRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFormatArrayRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFormatArrayRefAccess().getGSSFormatArrayRefKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFormatArrayRefAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFormatArrayRefAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFormatArrayRefRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_7());
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

// Rule GSSFormatFormatType
ruleGSSFormatFormatType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TC'
			{
				$current = grammarAccess.getGSSFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSFormatFieldType
ruleGSSFormatFieldType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='uint'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='flag'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='enumerated'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='bit_vector'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='byte_vector'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getGSSFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='float'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getGSSFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='deduced'
			{
				$current = grammarAccess.getGSSFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getGSSFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule GSSFormatFieldByteOrder
ruleGSSFormatFieldByteOrder returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='little_endian'
			{
				$current = grammarAccess.getGSSFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='na'
			{
				$current = grammarAccess.getGSSFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSFormatSFieldFirstBit
ruleGSSFormatSFieldFirstBit returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LSB'
			{
				$current = grammarAccess.getGSSFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSFormatUnit
ruleGSSFormatUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatUnitAccess().getBytesEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bits'
			{
				$current = grammarAccess.getGSSFormatUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatUnitAccess().getBitsEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='halfword'
			{
				$current = grammarAccess.getGSSFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='string10'
			{
				$current = grammarAccess.getGSSFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSFormatUnitAccess().getString10EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='string17'
			{
				$current = grammarAccess.getGSSFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSFormatUnitAccess().getString17EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='string69'
			{
				$current = grammarAccess.getGSSFormatUnitAccess().getString69EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getGSSFormatUnitAccess().getString69EnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule GSSFormatPower
ruleGSSFormatPower returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatPowerAccess().get_2EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='2bits_with_0'
			{
				$current = grammarAccess.getGSSFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSFormatCheckType
ruleGSSFormatCheckType returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='checksum16'
			{
				$current = grammarAccess.getGSSFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1());
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
