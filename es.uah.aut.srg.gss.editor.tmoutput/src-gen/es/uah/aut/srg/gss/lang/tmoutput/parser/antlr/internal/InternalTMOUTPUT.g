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
grammar InternalTMOUTPUT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tmoutput.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tmoutput.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tmoutput.services.TMOUTPUTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TMOUTPUTGrammarAccess grammarAccess;

    public InternalTMOUTPUTParser(TokenStream input, TMOUTPUTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSTMOutput";
   	}

   	@Override
   	protected TMOUTPUTGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGSSTMOutput
entryRuleGSSTMOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMOutputRule()); }
	iv_ruleGSSTMOutput=ruleGSSTMOutput
	{ $current=$iv_ruleGSSTMOutput.current; }
	EOF;

// Rule GSSTMOutput
ruleGSSTMOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<GSSTMOutput'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMOutputAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='type='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTMOutputAccess().getTypeKeyword_3());
		}
		(
			(
				lv_type_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_type_4_0, grammarAccess.getGSSTMOutputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
				}
			)
		)
		otherlv_5='subtype='
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTMOutputAccess().getSubtypeKeyword_5());
		}
		(
			(
				lv_subtype_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_subtype_6_0, grammarAccess.getGSSTMOutputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputRule());
					}
					setWithLastConsumed(
						$current,
						"subtype",
						lv_subtype_6_0,
						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
				}
			)
		)
		otherlv_7='levels='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_7());
		}
		(
			(
				lv_levels_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_levels_8_0, grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputRule());
					}
					setWithLastConsumed(
						$current,
						"levels",
						lv_levels_8_0,
						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<level3_format'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_10_0());
			}
			otherlv_11='file='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSTMOutputAccess().getFileKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		(
			otherlv_14='<level3_filter'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_11_0());
			}
			otherlv_15='file='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_16=RULE_STRING
					{
						newLeafNode(otherlv_16, grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0());
					}
				)
			)
			otherlv_17='/>'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_18='<from_level2_import'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_12_0());
			}
			otherlv_19='file='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_20=RULE_STRING
					{
						newLeafNode(otherlv_20, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0());
					}
				)
			)
			otherlv_21='/>'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			otherlv_22='<level2_format'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_13_0());
			}
			otherlv_23='file='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_24=RULE_STRING
					{
						newLeafNode(otherlv_24, grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0());
					}
				)
			)
			otherlv_25='/>'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3());
			}
		)?
		(
			otherlv_26='<level2_filter'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_14_0());
			}
			otherlv_27='file='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_28=RULE_STRING
					{
						newLeafNode(otherlv_28, grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0());
					}
				)
			)
			otherlv_29='/>'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_30='<from_level1_import'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_15_0());
			}
			otherlv_31='file='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_32=RULE_STRING
					{
						newLeafNode(otherlv_32, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0());
					}
				)
			)
			otherlv_33='/>'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_34='<level1_format'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_16_0());
			}
			otherlv_35='file='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_36=RULE_STRING
					{
						newLeafNode(otherlv_36, grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0());
					}
				)
			)
			otherlv_37='/>'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		(
			otherlv_38='<level1_filter'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_17_0());
			}
			otherlv_39='file='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_40=RULE_STRING
					{
						newLeafNode(otherlv_40, grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0());
					}
				)
			)
			otherlv_41='/>'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_42='<from_level0_import'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_18_0());
			}
			otherlv_43='file='
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_44=RULE_STRING
					{
						newLeafNode(otherlv_44, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0());
					}
				)
			)
			otherlv_45='/>'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3());
			}
		)?
		(
			otherlv_46='<level0_format'
			{
				newLeafNode(otherlv_46, grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_19_0());
			}
			otherlv_47='file='
			{
				newLeafNode(otherlv_47, grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_48=RULE_STRING
					{
						newLeafNode(otherlv_48, grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0());
					}
				)
			)
			otherlv_49='/>'
			{
				newLeafNode(otherlv_49, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3());
			}
		)?
		(
			otherlv_50='<level0_filter'
			{
				newLeafNode(otherlv_50, grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_20_0());
			}
			otherlv_51='file='
			{
				newLeafNode(otherlv_51, grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
					}
					otherlv_52=RULE_STRING
					{
						newLeafNode(otherlv_52, grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0());
					}
				)
			)
			otherlv_53='/>'
			{
				newLeafNode(otherlv_53, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTMOutputAccess().getGssPi1GSSTMOutputPi1ParserRuleCall_21_0());
				}
				lv_gssPi1_54_0=ruleGSSTMOutputPi1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTMOutputRule());
					}
					set(
						$current,
						"gssPi1",
						lv_gssPi1_54_0,
						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutputPi1");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_55='<fields>'
			{
				newLeafNode(otherlv_55, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0());
					}
					lv_gssFields_56_0=ruleGSSTMOutputField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTMOutputRule());
						}
						add(
							$current,
							"gssFields",
							lv_gssFields_56_0,
							"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutputField");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_57='</fields>'
			{
				newLeafNode(otherlv_57, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2());
			}
		)?
		otherlv_58='</GSSTMOutput>'
		{
			newLeafNode(otherlv_58, grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSTMOutputPi1
entryRuleGSSTMOutputPi1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMOutputPi1Rule()); }
	iv_ruleGSSTMOutputPi1=ruleGSSTMOutputPi1
	{ $current=$iv_ruleGSSTMOutputPi1.current; }
	EOF;

// Rule GSSTMOutputPi1
ruleGSSTMOutputPi1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<OutputPI1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputPi1Access().getOutputPI1Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputPi1Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMOutputPi1Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputPi1Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='val='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTMOutputPi1Access().getValKeyword_3());
		}
		(
			(
				lv_val_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_val_4_0, grammarAccess.getGSSTMOutputPi1Access().getValUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputPi1Rule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_4_0,
						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
				}
			)
		)
		otherlv_5='gssField='
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTMOutputPi1Access().getGssFieldKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputPi1Rule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getGSSTMOutputPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0());
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTMOutputPi1Access().getSolidusGreaterThanSignKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSTMOutputField
entryRuleGSSTMOutputField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMOutputFieldRule()); }
	iv_ruleGSSTMOutputField=ruleGSSTMOutputField
	{ $current=$iv_ruleGSSTMOutputField.current; }
	EOF;

// Rule GSSTMOutputField
ruleGSSTMOutputField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<OutputField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='gssField='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTMOutputFieldAccess().getGssFieldKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputFieldRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0());
				}
			)
		)
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTMOutputFieldAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
