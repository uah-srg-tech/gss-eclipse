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
grammar InternalEXPORT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.export.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.export.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.export.services.EXPORTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private EXPORTGrammarAccess grammarAccess;

    public InternalEXPORTParser(TokenStream input, EXPORTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected EXPORTGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSExportExportParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSExportExport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportExport");
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

// Entry rule entryRuleGSSExportExport
entryRuleGSSExportExport returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSExportExportRule()); }
	iv_ruleGSSExportExport=ruleGSSExportExport
	{ $current=$iv_ruleGSSExportExport.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSExportExport
ruleGSSExportExport returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportExport'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportExportAccess().getGSSExportExportKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSExportExportAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportExportRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSExportExportAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSExportExportAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.export.EXPORT.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSExportExportAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.export.EXPORT.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='from'
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSExportExportAccess().getFromKeyword_4());
		}
		otherlv_13=':='
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportExportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportExportAccess().getFromGSSTmTcFormatTmTcFormatCrossReference_6_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_7());
		}
		otherlv_16='to'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSExportExportAccess().getToKeyword_8());
		}
		otherlv_17=':='
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_9());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportExportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportExportAccess().getToGSSTmTcFormatTmTcFormatCrossReference_10_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportExportAccess().getSizesGSSExportSizesParserRuleCall_12_0());
				}
				lv_Sizes_20_0=ruleGSSExportSizes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
					}
					set(
						$current,
						"Sizes",
						lv_Sizes_20_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizes");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportExportAccess().getSettingsGSSExportSettingsParserRuleCall_13_0());
				}
				lv_settings_21_0=ruleGSSExportSettings
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
					}
					set(
						$current,
						"settings",
						lv_settings_21_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettings");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportExportAccess().getActivateDICsGSSExportActivateDICsParserRuleCall_14_0());
				}
				lv_activateDICs_22_0=ruleGSSExportActivateDICs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
					}
					set(
						$current,
						"activateDICs",
						lv_activateDICs_22_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportActivateDICs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSExportExportAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_24=';'
		{
			newLeafNode(otherlv_24, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_16());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSExportSizes
entryRuleGSSExportSizes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSizesRule()); }
	iv_ruleGSSExportSizes=ruleGSSExportSizes
	{ $current=$iv_ruleGSSExportSizes.current; }
	EOF;

// Rule GSSExportSizes
ruleGSSExportSizes returns [EObject current=null]
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
					grammarAccess.getGSSExportSizesAccess().getGSSExportSizesAction_0(),
					$current);
			}
		)
		otherlv_1='GSSExportSizes'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizesAccess().getGSSExportSizesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizesAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLengthGSSExportSizeFromFileLengthParserRuleCall_3_0_0());
					}
					lv_sizeFromFileLength_3_0=ruleGSSExportSizeFromFileLength
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizesRule());
						}
						add(
							$current,
							"sizeFromFileLength",
							lv_sizeFromFileLength_3_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizeFromFileLength");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLineGSSExportSizeFromFileLineParserRuleCall_3_1_0());
					}
					lv_sizeFromFileLine_4_0=ruleGSSExportSizeFromFileLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizesRule());
						}
						add(
							$current,
							"sizeFromFileLine",
							lv_sizeFromFileLine_4_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizeFromFileLine");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizesAccess().getSizeInBitsGSSExportSizeInBitsParserRuleCall_3_2_0());
					}
					lv_sizeInBits_5_0=ruleGSSExportSizeInBits
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizesRule());
						}
						add(
							$current,
							"sizeInBits",
							lv_sizeInBits_5_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizeInBits");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizesAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizesAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSExportSizeFromFileLength
entryRuleGSSExportSizeFromFileLength returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthRule()); }
	iv_ruleGSSExportSizeFromFileLength=ruleGSSExportSizeFromFileLength
	{ $current=$iv_ruleGSSExportSizeFromFileLength.current; }
	EOF;

// Rule GSSExportSizeFromFileLength
ruleGSSExportSizeFromFileLength returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSizeFromFileLength'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSizeFromFileLengthAccess().getGSSExportSizeFromFileLengthKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLengthRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_5());
		}
		otherlv_6='fromFile'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_fromFile_8_0=RULE_ID
				{
					newLeafNode(lv_fromFile_8_0, grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSizeFromFileLengthRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='addSize'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
					}
					lv_addSize_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLengthRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_12_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='unit'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0());
					}
					lv_unit_16_0=ruleGSSExportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLengthRule());
						}
						set(
							$current,
							"unit",
							lv_unit_16_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleGSSExportSizeFromFileLine
entryRuleGSSExportSizeFromFileLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineRule()); }
	iv_ruleGSSExportSizeFromFileLine=ruleGSSExportSizeFromFileLine
	{ $current=$iv_ruleGSSExportSizeFromFileLine.current; }
	EOF;

// Rule GSSExportSizeFromFileLine
ruleGSSExportSizeFromFileLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSizeFromFileLine'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSizeFromFileLineAccess().getGSSExportSizeFromFileLineKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizeFromFileLineAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_5());
		}
		otherlv_6='fromFile'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_fromFile_8_0=RULE_ID
				{
					newLeafNode(lv_fromFile_8_0, grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSizeFromFileLineRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_9());
		}
		otherlv_10='line'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSizeFromFileLineAccess().getLineKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0());
				}
				lv_line_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
					}
					set(
						$current,
						"line",
						lv_line_12_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='addSize'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0());
					}
					lv_addSize_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_16_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='unit'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitKeyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitGSSExportUnitEnumRuleCall_15_2_0());
					}
					lv_unit_20_0=ruleGSSExportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
						}
						set(
							$current,
							"unit",
							lv_unit_20_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_15_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_17());
		}
	)
;

// Entry rule entryRuleGSSExportSizeInBits
entryRuleGSSExportSizeInBits returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSizeInBitsRule()); }
	iv_ruleGSSExportSizeInBits=ruleGSSExportSizeInBits
	{ $current=$iv_ruleGSSExportSizeInBits.current; }
	EOF;

// Rule GSSExportSizeInBits
ruleGSSExportSizeInBits returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSizeInBits'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSizeInBitsAccess().getGSSExportSizeInBitsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizeInBitsAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSizeInBitsRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_5());
		}
		otherlv_6='from'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizeInBitsAccess().getFromKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_from_8_0=RULE_ID
				{
					newLeafNode(lv_from_8_0, grammarAccess.getGSSExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSizeInBitsRule());
					}
					setWithLastConsumed(
						$current,
						"from",
						lv_from_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='addSize'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
					}
					lv_addSize_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizeInBitsRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_12_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='unit'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSExportSizeInBitsAccess().getUnitKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSizeInBitsAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0());
					}
					lv_unit_16_0=ruleGSSExportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSizeInBitsRule());
						}
						set(
							$current,
							"unit",
							lv_unit_16_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_11_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSExportSizeInBitsAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleGSSExportSettings
entryRuleGSSExportSettings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingsRule()); }
	iv_ruleGSSExportSettings=ruleGSSExportSettings
	{ $current=$iv_ruleGSSExportSettings.current; }
	EOF;

// Rule GSSExportSettings
ruleGSSExportSettings returns [EObject current=null]
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
					grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSExportSettings'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingFromConstGSSExportSettingFromConstParserRuleCall_3_0_0());
					}
					lv_settingFromConst_3_0=ruleGSSExportSettingFromConst
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
						}
						add(
							$current,
							"settingFromConst",
							lv_settingFromConst_3_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromConst");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingFromSizeGSSExportSettingFromSizeParserRuleCall_3_1_0());
					}
					lv_settingFromSize_4_0=ruleGSSExportSettingFromSize
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
						}
						add(
							$current,
							"settingFromSize",
							lv_settingFromSize_4_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromSize");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingFromFileGSSExportSettingFromFileParserRuleCall_3_2_0());
					}
					lv_settingFromFile_5_0=ruleGSSExportSettingFromFile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
						}
						add(
							$current,
							"settingFromFile",
							lv_settingFromFile_5_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromFile");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingFromFieldGSSExportSettingFromFieldParserRuleCall_3_3_0());
					}
					lv_settingFromField_6_0=ruleGSSExportSettingFromField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
						}
						add(
							$current,
							"settingFromField",
							lv_settingFromField_6_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromField");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromConstGSSExportSettingAIFromConstParserRuleCall_3_4_0());
					}
					lv_settingAIFromConst_7_0=ruleGSSExportSettingAIFromConst
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
						}
						add(
							$current,
							"settingAIFromConst",
							lv_settingAIFromConst_7_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingAIFromConst");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromFileGSSExportSettingAIFromFileParserRuleCall_3_5_0());
					}
					lv_settingAIFromFile_8_0=ruleGSSExportSettingAIFromFile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
						}
						add(
							$current,
							"settingAIFromFile",
							lv_settingAIFromFile_8_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingAIFromFile");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSExportSettingFromConst
entryRuleGSSExportSettingFromConst returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingFromConstRule()); }
	iv_ruleGSSExportSettingFromConst=ruleGSSExportSettingFromConst
	{ $current=$iv_ruleGSSExportSettingFromConst.current; }
	EOF;

// Rule GSSExportSettingFromConst
ruleGSSExportSettingFromConst returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSettingFromConst'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromConstAccess().getGSSExportSettingFromConstKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromConstAccess().getValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0());
				}
				lv_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSettingFromConstRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingFromConstRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromConstAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSExportSettingFromSize
entryRuleGSSExportSettingFromSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingFromSizeRule()); }
	iv_ruleGSSExportSettingFromSize=ruleGSSExportSettingFromSize
	{ $current=$iv_ruleGSSExportSettingFromSize.current; }
	EOF;

// Rule GSSExportSettingFromSize
ruleGSSExportSettingFromSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSettingFromSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromSizeAccess().getGSSExportSettingFromSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sizeRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0());
				}
				lv_sizeRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSettingFromSizeRule());
					}
					set(
						$current,
						"sizeRef",
						lv_sizeRef_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingFromSizeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSExportSettingFromFile
entryRuleGSSExportSettingFromFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingFromFileRule()); }
	iv_ruleGSSExportSettingFromFile=ruleGSSExportSettingFromFile
	{ $current=$iv_ruleGSSExportSettingFromFile.current; }
	EOF;

// Rule GSSExportSettingFromFile
ruleGSSExportSettingFromFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSettingFromFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromFileAccess().getGSSExportSettingFromFileKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='file'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromFileAccess().getFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_file_4_0=RULE_ID
				{
					newLeafNode(lv_file_4_0, grammarAccess.getGSSExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"file",
						lv_file_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingFromFileRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='offset'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromFileAccess().getOffsetKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0());
					}
					lv_offset_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingFromFileRule());
						}
						set(
							$current,
							"offset",
							lv_offset_12_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='size'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSExportSettingFromFileAccess().getSizeKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0());
					}
					lv_size_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingFromFileRule());
						}
						set(
							$current,
							"size",
							lv_size_16_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_11_3());
			}
		)?
		(
			otherlv_18='line'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSExportSettingFromFileAccess().getLineKeyword_12_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0());
					}
					lv_line_20_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingFromFileRule());
						}
						set(
							$current,
							"line",
							lv_line_20_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_12_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSExportSettingFromFileAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleGSSExportSettingFromField
entryRuleGSSExportSettingFromField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingFromFieldRule()); }
	iv_ruleGSSExportSettingFromField=ruleGSSExportSettingFromField
	{ $current=$iv_ruleGSSExportSettingFromField.current; }
	EOF;

// Rule GSSExportSettingFromField
ruleGSSExportSettingFromField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSettingFromField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromFieldAccess().getGSSExportSettingFromFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fieldRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingFromFieldRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSTmTcFormatFieldCrossReference_4_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingFromFieldRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSExportSettingAIFromConst
entryRuleGSSExportSettingAIFromConst returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstRule()); }
	iv_ruleGSSExportSettingAIFromConst=ruleGSSExportSettingAIFromConst
	{ $current=$iv_ruleGSSExportSettingAIFromConst.current; }
	EOF;

// Rule GSSExportSettingAIFromConst
ruleGSSExportSettingAIFromConst returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSettingAIFromConst'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingAIFromConstAccess().getGSSExportSettingAIFromConstKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingAIFromConstAccess().getValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0());
				}
				lv_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromConstRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingAIFromConstRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSTmTcFormatAIFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSExportSettingAIFromFile
entryRuleGSSExportSettingAIFromFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileRule()); }
	iv_ruleGSSExportSettingAIFromFile=ruleGSSExportSettingAIFromFile
	{ $current=$iv_ruleGSSExportSettingAIFromFile.current; }
	EOF;

// Rule GSSExportSettingAIFromFile
ruleGSSExportSettingAIFromFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportSettingAIFromFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingAIFromFileAccess().getGSSExportSettingAIFromFileKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='file'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingAIFromFileAccess().getFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_file_4_0=RULE_ID
				{
					newLeafNode(lv_file_4_0, grammarAccess.getGSSExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingAIFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"file",
						lv_file_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportSettingAIFromFileRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefGSSTmTcFormatAIFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_9());
		}
		otherlv_10='toArrayIndex'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0());
				}
				lv_toArrayIndex_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
					}
					set(
						$current,
						"toArrayIndex",
						lv_toArrayIndex_12_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='offset'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0());
					}
					lv_offset_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
						}
						set(
							$current,
							"offset",
							lv_offset_16_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='size'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeKeyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0());
					}
					lv_size_20_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
						}
						set(
							$current,
							"size",
							lv_size_20_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_15_3());
			}
		)?
		(
			otherlv_22='line'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSExportSettingAIFromFileAccess().getLineKeyword_16_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0());
					}
					lv_line_24_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
						}
						set(
							$current,
							"line",
							lv_line_24_0,
							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_16_3());
			}
		)?
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_18());
		}
	)
;

// Entry rule entryRuleGSSExportActivateDICs
entryRuleGSSExportActivateDICs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportActivateDICsRule()); }
	iv_ruleGSSExportActivateDICs=ruleGSSExportActivateDICs
	{ $current=$iv_ruleGSSExportActivateDICs.current; }
	EOF;

// Rule GSSExportActivateDICs
ruleGSSExportActivateDICs returns [EObject current=null]
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
					grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSExportActivateDICs'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportActivateDICsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportActivateDICsAccess().getDICGSSExportDICParserRuleCall_3_0());
				}
				lv_DIC_3_0=ruleGSSExportDIC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportActivateDICsRule());
					}
					add(
						$current,
						"DIC",
						lv_DIC_3_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportDIC");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSExportActivateDICsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportActivateDICsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSExportDIC
entryRuleGSSExportDIC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSExportDICRule()); }
	iv_ruleGSSExportDIC=ruleGSSExportDIC
	{ $current=$iv_ruleGSSExportDIC.current; }
	EOF;

// Rule GSSExportDIC
ruleGSSExportDIC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSExportDIC'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSExportDICAccess().getGSSExportDICKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSExportDICAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSExportDICAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSExportDICAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSExportDICRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_5());
		}
		otherlv_6='DICRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSExportDICAccess().getDICRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_DICRef_8_0=RULE_ID
				{
					newLeafNode(lv_DICRef_8_0, grammarAccess.getGSSExportDICAccess().getDICRefIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSExportDICRule());
					}
					setWithLastConsumed(
						$current,
						"DICRef",
						lv_DICRef_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSExportDICAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_11());
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

// Rule GSSExportUnit
ruleGSSExportUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getGSSExportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSExportUnitAccess().getBitsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bytes'
			{
				$current = grammarAccess.getGSSExportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSExportUnitAccess().getBytesEnumLiteralDeclaration_1());
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
