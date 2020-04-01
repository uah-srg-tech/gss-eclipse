/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
grammar InternalTM;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tm.services.TMGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TMGrammarAccess grammarAccess;

    public InternalTMParser(TokenStream input, TMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSTM";
   	}

   	@Override
   	protected TMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGSSTM
entryRuleGSSTM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMRule()); }
	iv_ruleGSSTM=ruleGSSTM
	{ $current=$iv_ruleGSSTM.current; }
	EOF;

// Rule GSSTM
ruleGSSTM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<GSSTM'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMAccess().getGSSTMKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMRule());
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
			newLeafNode(otherlv_3, grammarAccess.getGSSTMAccess().getTypeKeyword_3());
		}
		(
			(
				lv_type_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_type_4_0, grammarAccess.getGSSTMAccess().getTypeUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.tm.TM.UINT_STRING");
				}
			)
		)
		otherlv_5='subtype='
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTMAccess().getSubtypeKeyword_5());
		}
		(
			(
				lv_subtype_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_subtype_6_0, grammarAccess.getGSSTMAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMRule());
					}
					setWithLastConsumed(
						$current,
						"subtype",
						lv_subtype_6_0,
						"es.uah.aut.srg.gss.lang.tm.TM.UINT_STRING");
				}
			)
		)
		otherlv_7='levels='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTMAccess().getLevelsKeyword_7());
		}
		(
			(
				lv_levels_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_levels_8_0, grammarAccess.getGSSTMAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMRule());
					}
					setWithLastConsumed(
						$current,
						"levels",
						lv_levels_8_0,
						"es.uah.aut.srg.gss.lang.tm.TM.UINT_STRING");
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTMAccess().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<level3_format'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTMAccess().getLevel3_formatKeyword_10_0());
			}
			otherlv_11='file='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSTMAccess().getFileKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		(
			otherlv_14='<level3_filter'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTMAccess().getLevel3_filterKeyword_11_0());
			}
			otherlv_15='file='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTMAccess().getFileKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_16=RULE_STRING
					{
						newLeafNode(otherlv_16, grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0());
					}
				)
			)
			otherlv_17='/>'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_18='<from_level2_import'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTMAccess().getFrom_level2_importKeyword_12_0());
			}
			otherlv_19='file='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTMAccess().getFileKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_20=RULE_STRING
					{
						newLeafNode(otherlv_20, grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0());
					}
				)
			)
			otherlv_21='/>'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			otherlv_22='<level2_format'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSTMAccess().getLevel2_formatKeyword_13_0());
			}
			otherlv_23='file='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTMAccess().getFileKeyword_13_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_24=RULE_STRING
					{
						newLeafNode(otherlv_24, grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0());
					}
				)
			)
			otherlv_25='/>'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_13_3());
			}
		)?
		(
			otherlv_26='<level2_filter'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTMAccess().getLevel2_filterKeyword_14_0());
			}
			otherlv_27='file='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTMAccess().getFileKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_28=RULE_STRING
					{
						newLeafNode(otherlv_28, grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0());
					}
				)
			)
			otherlv_29='/>'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_30='<from_level1_import'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTMAccess().getFrom_level1_importKeyword_15_0());
			}
			otherlv_31='file='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTMAccess().getFileKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_32=RULE_STRING
					{
						newLeafNode(otherlv_32, grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0());
					}
				)
			)
			otherlv_33='/>'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_34='<level1_format'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSTMAccess().getLevel1_formatKeyword_16_0());
			}
			otherlv_35='file='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTMAccess().getFileKeyword_16_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_36=RULE_STRING
					{
						newLeafNode(otherlv_36, grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0());
					}
				)
			)
			otherlv_37='/>'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		(
			otherlv_38='<level1_filter'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSTMAccess().getLevel1_filterKeyword_17_0());
			}
			otherlv_39='file='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTMAccess().getFileKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_40=RULE_STRING
					{
						newLeafNode(otherlv_40, grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0());
					}
				)
			)
			otherlv_41='/>'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_42='<from_level0_import'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSTMAccess().getFrom_level0_importKeyword_18_0());
			}
			otherlv_43='file='
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSTMAccess().getFileKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_44=RULE_STRING
					{
						newLeafNode(otherlv_44, grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0());
					}
				)
			)
			otherlv_45='/>'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_18_3());
			}
		)?
		(
			otherlv_46='<level0_format'
			{
				newLeafNode(otherlv_46, grammarAccess.getGSSTMAccess().getLevel0_formatKeyword_19_0());
			}
			otherlv_47='file='
			{
				newLeafNode(otherlv_47, grammarAccess.getGSSTMAccess().getFileKeyword_19_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_48=RULE_STRING
					{
						newLeafNode(otherlv_48, grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0());
					}
				)
			)
			otherlv_49='/>'
			{
				newLeafNode(otherlv_49, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_19_3());
			}
		)?
		(
			otherlv_50='<level0_filter'
			{
				newLeafNode(otherlv_50, grammarAccess.getGSSTMAccess().getLevel0_filterKeyword_20_0());
			}
			otherlv_51='file='
			{
				newLeafNode(otherlv_51, grammarAccess.getGSSTMAccess().getFileKeyword_20_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMRule());
						}
					}
					otherlv_52=RULE_STRING
					{
						newLeafNode(otherlv_52, grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0());
					}
				)
			)
			otherlv_53='/>'
			{
				newLeafNode(otherlv_53, grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_20_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTMAccess().getGssPi1GSSTMPi1ParserRuleCall_21_0());
				}
				lv_gssPi1_54_0=ruleGSSTMPi1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTMRule());
					}
					set(
						$current,
						"gssPi1",
						lv_gssPi1_54_0,
						"es.uah.aut.srg.gss.lang.tm.TM.GSSTMPi1");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_55='<fields>'
			{
				newLeafNode(otherlv_55, grammarAccess.getGSSTMAccess().getFieldsKeyword_22_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTMAccess().getGssFieldsGSSTMFieldParserRuleCall_22_1_0());
					}
					lv_gssFields_56_0=ruleGSSTMField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTMRule());
						}
						add(
							$current,
							"gssFields",
							lv_gssFields_56_0,
							"es.uah.aut.srg.gss.lang.tm.TM.GSSTMField");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_57='</fields>'
			{
				newLeafNode(otherlv_57, grammarAccess.getGSSTMAccess().getFieldsKeyword_22_2());
			}
		)?
		otherlv_58='</GSSTM>'
		{
			newLeafNode(otherlv_58, grammarAccess.getGSSTMAccess().getGSSTMKeyword_23());
		}
	)
;

// Entry rule entryRuleGSSTMPi1
entryRuleGSSTMPi1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMPi1Rule()); }
	iv_ruleGSSTMPi1=ruleGSSTMPi1
	{ $current=$iv_ruleGSSTMPi1.current; }
	EOF;

// Rule GSSTMPi1
ruleGSSTMPi1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<PI1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMPi1Access().getPI1Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMPi1Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMPi1Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMPi1Rule());
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
			newLeafNode(otherlv_3, grammarAccess.getGSSTMPi1Access().getValKeyword_3());
		}
		(
			(
				lv_val_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_val_4_0, grammarAccess.getGSSTMPi1Access().getValUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMPi1Rule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_4_0,
						"es.uah.aut.srg.gss.lang.tm.TM.UINT_STRING");
				}
			)
		)
		otherlv_5='gssField='
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTMPi1Access().getGssFieldKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMPi1Rule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0());
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTMPi1Access().getSolidusGreaterThanSignKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSTMField
entryRuleGSSTMField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMFieldRule()); }
	iv_ruleGSSTMField=ruleGSSTMField
	{ $current=$iv_ruleGSSTMField.current; }
	EOF;

// Rule GSSTMField
ruleGSSTMField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Field'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMFieldAccess().getFieldKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMFieldAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMFieldRule());
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
			newLeafNode(otherlv_3, grammarAccess.getGSSTMFieldAccess().getGssFieldKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMFieldRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5='enumRef='
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSTMFieldAccess().getEnumRefKeyword_5_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTMFieldRule());
						}
					}
					otherlv_6=RULE_STRING
					{
						newLeafNode(otherlv_6, grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0());
					}
				)
			)
		)?
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTMFieldAccess().getSolidusGreaterThanSignKeyword_6());
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
