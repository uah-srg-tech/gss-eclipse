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
grammar InternalIMPORTS;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.imports.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.imports.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.imports.services.IMPORTSGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private IMPORTSGrammarAccess grammarAccess;

    public InternalIMPORTSParser(TokenStream input, IMPORTSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected IMPORTSGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSImportImportParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSImportImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.GSSImportImport");
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

// Entry rule entryRuleGSSImportImport
entryRuleGSSImportImport returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSImportImportRule()); }
	iv_ruleGSSImportImport=ruleGSSImportImport
	{ $current=$iv_ruleGSSImportImport.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSImportImport
ruleGSSImportImport returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSImportImport'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSImportImportAccess().getGSSImportImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSImportImportAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSImportImportAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSImportImportAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.imports.IMPORTS.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSImportImportAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.imports.IMPORTS.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='from'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSImportImportAccess().getFromKeyword_4());
		}
		otherlv_13=':='
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSImportImportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSImportImportAccess().getFromGSSTmTcFormatTmTcFormatCrossReference_6_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_7());
		}
		otherlv_16='to'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSImportImportAccess().getToKeyword_8());
		}
		otherlv_17=':='
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_9());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSImportImportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSImportImportAccess().getToGSSTmTcFormatTmTcFormatCrossReference_10_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSImportImportAccess().getDataSourceGSSImportDataSourceParserRuleCall_12_0());
				}
				lv_dataSource_20_0=ruleGSSImportDataSource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
					}
					add(
						$current,
						"dataSource",
						lv_dataSource_20_0,
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.GSSImportDataSource");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSImportImportAccess().getVirtualSizeGSSImportVirtualSizeParserRuleCall_13_0());
				}
				lv_virtualSize_21_0=ruleGSSImportVirtualSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
					}
					set(
						$current,
						"virtualSize",
						lv_virtualSize_21_0,
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.GSSImportVirtualSize");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSImportImportAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_15());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSImportDataSource
entryRuleGSSImportDataSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSImportDataSourceRule()); }
	iv_ruleGSSImportDataSource=ruleGSSImportDataSource
	{ $current=$iv_ruleGSSImportDataSource.current; }
	EOF;

// Rule GSSImportDataSource
ruleGSSImportDataSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSImportDataSource'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSImportDataSourceAccess().getGSSImportDataSourceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSImportDataSourceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='FieldRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSImportDataSourceAccess().getFieldRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSImportDataSourceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSTmTcFormatFieldCrossReference_4_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='leftTrim'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSImportDataSourceAccess().getLeftTrimKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0());
				}
				lv_leftTrim_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSImportDataSourceRule());
					}
					set(
						$current,
						"leftTrim",
						lv_leftTrim_8_0,
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rightTrim'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSImportDataSourceAccess().getRightTrimKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0());
				}
				lv_rightTrim_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSImportDataSourceRule());
					}
					set(
						$current,
						"rightTrim",
						lv_rightTrim_12_0,
						"es.uah.aut.srg.gss.lang.imports.IMPORTS.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSImportDataSourceAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleGSSImportVirtualSize
entryRuleGSSImportVirtualSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSImportVirtualSizeRule()); }
	iv_ruleGSSImportVirtualSize=ruleGSSImportVirtualSize
	{ $current=$iv_ruleGSSImportVirtualSize.current; }
	EOF;

// Rule GSSImportVirtualSize
ruleGSSImportVirtualSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSImportVirtualSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSImportVirtualSizeAccess().getGSSImportVirtualSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='FieldRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_FieldRef_4_0=RULE_ID
				{
					newLeafNode(lv_FieldRef_4_0, grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSImportVirtualSizeRule());
					}
					setWithLastConsumed(
						$current,
						"FieldRef",
						lv_FieldRef_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='to'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSImportVirtualSizeAccess().getToKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_to_8_0=RULE_ID
				{
					newLeafNode(lv_to_8_0, grammarAccess.getGSSImportVirtualSizeAccess().getToIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSImportVirtualSizeRule());
					}
					setWithLastConsumed(
						$current,
						"to",
						lv_to_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='addSize'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
					}
					lv_addSize_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSImportVirtualSizeRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_12_0,
							"es.uah.aut.srg.gss.lang.imports.IMPORTS.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='unit'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSImportVirtualSizeAccess().getUnitKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSImportVirtualSizeAccess().getUnitGSSImportUnitEnumRuleCall_11_2_0());
					}
					lv_unit_16_0=ruleGSSImportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSImportVirtualSizeRule());
						}
						set(
							$current,
							"unit",
							lv_unit_16_0,
							"es.uah.aut.srg.gss.lang.imports.IMPORTS.GSSImportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_11_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSImportVirtualSizeAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
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

// Rule GSSImportUnit
ruleGSSImportUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='bits'
			{
				$current = grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bytes'
			{
				$current = grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1());
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
