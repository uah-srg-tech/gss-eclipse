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
		(
			otherlv_7='pi1_val='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSTMOutputAccess().getPi1_valKeyword_7_0());
			}
			(
				(
					lv_pi1_val_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_pi1_val_8_0, grammarAccess.getGSSTMOutputAccess().getPi1_valUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMOutputRule());
						}
						setWithLastConsumed(
							$current,
							"pi1_val",
							lv_pi1_val_8_0,
							"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
					}
				)
			)
		)?
		otherlv_9='levels='
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_8());
		}
		(
			(
				lv_levels_10_0=RULE_UINT_STRING
				{
					newLeafNode(lv_levels_10_0, grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMOutputRule());
					}
					setWithLastConsumed(
						$current,
						"levels",
						lv_levels_10_0,
						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
				}
			)
		)
		otherlv_11='>'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_10());
		}
		(
			otherlv_12='<level3_format'
			{
				newLeafNode(otherlv_12, grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_11_0());
			}
			otherlv_13='file='
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1());
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
					otherlv_14=RULE_STRING
					{
						newLeafNode(otherlv_14, grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0());
					}
				)
			)
			otherlv_15='/>'
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_16='<level3_filter'
			{
				newLeafNode(otherlv_16, grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_12_0());
			}
			otherlv_17='file='
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1());
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
					otherlv_18=RULE_STRING
					{
						newLeafNode(otherlv_18, grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_12_2_0());
					}
				)
			)
			otherlv_19='/>'
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			otherlv_20='<from_level2_import'
			{
				newLeafNode(otherlv_20, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_13_0());
			}
			otherlv_21='file='
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1());
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
					otherlv_22=RULE_STRING
					{
						newLeafNode(otherlv_22, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_13_2_0());
					}
				)
			)
			otherlv_23='/>'
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3());
			}
		)?
		(
			otherlv_24='<level2_format'
			{
				newLeafNode(otherlv_24, grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_14_0());
			}
			otherlv_25='file='
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1());
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
					otherlv_26=RULE_STRING
					{
						newLeafNode(otherlv_26, grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_14_2_0());
					}
				)
			)
			otherlv_27='/>'
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_28='<level2_filter'
			{
				newLeafNode(otherlv_28, grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_15_0());
			}
			otherlv_29='file='
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1());
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
					otherlv_30=RULE_STRING
					{
						newLeafNode(otherlv_30, grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_15_2_0());
					}
				)
			)
			otherlv_31='/>'
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_32='<from_level1_import'
			{
				newLeafNode(otherlv_32, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_16_0());
			}
			otherlv_33='file='
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1());
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
					otherlv_34=RULE_STRING
					{
						newLeafNode(otherlv_34, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_16_2_0());
					}
				)
			)
			otherlv_35='/>'
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		(
			otherlv_36='<level1_format'
			{
				newLeafNode(otherlv_36, grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_17_0());
			}
			otherlv_37='file='
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1());
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
					otherlv_38=RULE_STRING
					{
						newLeafNode(otherlv_38, grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_17_2_0());
					}
				)
			)
			otherlv_39='/>'
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_40='<level1_filter'
			{
				newLeafNode(otherlv_40, grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_18_0());
			}
			otherlv_41='file='
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1());
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
					otherlv_42=RULE_STRING
					{
						newLeafNode(otherlv_42, grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_18_2_0());
					}
				)
			)
			otherlv_43='/>'
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3());
			}
		)?
		(
			otherlv_44='<from_level0_import'
			{
				newLeafNode(otherlv_44, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_19_0());
			}
			otherlv_45='file='
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1());
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
					otherlv_46=RULE_STRING
					{
						newLeafNode(otherlv_46, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_19_2_0());
					}
				)
			)
			otherlv_47='/>'
			{
				newLeafNode(otherlv_47, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3());
			}
		)?
		(
			otherlv_48='<level0_format'
			{
				newLeafNode(otherlv_48, grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_20_0());
			}
			otherlv_49='file='
			{
				newLeafNode(otherlv_49, grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1());
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
					otherlv_50=RULE_STRING
					{
						newLeafNode(otherlv_50, grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_20_2_0());
					}
				)
			)
			otherlv_51='/>'
			{
				newLeafNode(otherlv_51, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3());
			}
		)?
		(
			otherlv_52='<level0_filter'
			{
				newLeafNode(otherlv_52, grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_21_0());
			}
			otherlv_53='file='
			{
				newLeafNode(otherlv_53, grammarAccess.getGSSTMOutputAccess().getFileKeyword_21_1());
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
					otherlv_54=RULE_STRING
					{
						newLeafNode(otherlv_54, grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_21_2_0());
					}
				)
			)
			otherlv_55='/>'
			{
				newLeafNode(otherlv_55, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_21_3());
			}
		)?
		(
			otherlv_56='<fields>'
			{
				newLeafNode(otherlv_56, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0());
					}
					lv_gssFields_57_0=ruleGSSTMOutputField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTMOutputRule());
						}
						add(
							$current,
							"gssFields",
							lv_gssFields_57_0,
							"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutputField");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_58='</fields>'
			{
				newLeafNode(otherlv_58, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2());
			}
		)?
		otherlv_59='</GSSTMOutput>'
		{
			newLeafNode(otherlv_59, grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23());
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
