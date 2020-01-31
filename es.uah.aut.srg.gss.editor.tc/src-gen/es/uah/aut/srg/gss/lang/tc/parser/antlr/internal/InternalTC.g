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
grammar InternalTC;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tc.services.TCGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TCGrammarAccess grammarAccess;

    public InternalTCParser(TokenStream input, TCGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSTC";
   	}

   	@Override
   	protected TCGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGSSTC
entryRuleGSSTC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTCRule()); }
	iv_ruleGSSTC=ruleGSSTC
	{ $current=$iv_ruleGSSTC.current; }
	EOF;

// Rule GSSTC
ruleGSSTC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<GSSTC'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTCAccess().getGSSTCKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTCAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTCAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTCRule());
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
			newLeafNode(otherlv_3, grammarAccess.getGSSTCAccess().getTypeKeyword_3());
		}
		(
			(
				lv_type_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_type_4_0, grammarAccess.getGSSTCAccess().getTypeUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTCRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.tc.TC.UINT_STRING");
				}
			)
		)
		otherlv_5='subtype='
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTCAccess().getSubtypeKeyword_5());
		}
		(
			(
				lv_subtype_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_subtype_6_0, grammarAccess.getGSSTCAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTCRule());
					}
					setWithLastConsumed(
						$current,
						"subtype",
						lv_subtype_6_0,
						"es.uah.aut.srg.gss.lang.tc.TC.UINT_STRING");
				}
			)
		)
		otherlv_7='levels='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTCAccess().getLevelsKeyword_7());
		}
		(
			(
				lv_levels_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_levels_8_0, grammarAccess.getGSSTCAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTCRule());
					}
					setWithLastConsumed(
						$current,
						"levels",
						lv_levels_8_0,
						"es.uah.aut.srg.gss.lang.tc.TC.UINT_STRING");
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTCAccess().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<to_level3_export'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTCAccess().getTo_level3_exportKeyword_10_0());
			}
			otherlv_11='file='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSTCAccess().getFileKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getGSSTCAccess().getTo_level3_exportGSSExportExportCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		(
			otherlv_14='<level3_format'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTCAccess().getLevel3_formatKeyword_11_0());
			}
			otherlv_15='file='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTCAccess().getFileKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_16=RULE_STRING
					{
						newLeafNode(otherlv_16, grammarAccess.getGSSTCAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0());
					}
				)
			)
			otherlv_17='/>'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_18='<to_level2_export'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTCAccess().getTo_level2_exportKeyword_12_0());
			}
			otherlv_19='file='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTCAccess().getFileKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_20=RULE_STRING
					{
						newLeafNode(otherlv_20, grammarAccess.getGSSTCAccess().getTo_level2_exportGSSExportExportCrossReference_12_2_0());
					}
				)
			)
			otherlv_21='/>'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			otherlv_22='<level2_format'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSTCAccess().getLevel2_formatKeyword_13_0());
			}
			otherlv_23='file='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTCAccess().getFileKeyword_13_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_24=RULE_STRING
					{
						newLeafNode(otherlv_24, grammarAccess.getGSSTCAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0());
					}
				)
			)
			otherlv_25='/>'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_13_3());
			}
		)?
		(
			otherlv_26='<to_level1_export'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTCAccess().getTo_level1_exportKeyword_14_0());
			}
			otherlv_27='file='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTCAccess().getFileKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_28=RULE_STRING
					{
						newLeafNode(otherlv_28, grammarAccess.getGSSTCAccess().getTo_level1_exportGSSExportExportCrossReference_14_2_0());
					}
				)
			)
			otherlv_29='/>'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_30='<level1_format'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTCAccess().getLevel1_formatKeyword_15_0());
			}
			otherlv_31='file='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTCAccess().getFileKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_32=RULE_STRING
					{
						newLeafNode(otherlv_32, grammarAccess.getGSSTCAccess().getLevel1_formatGSSFormatFormatCrossReference_15_2_0());
					}
				)
			)
			otherlv_33='/>'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_34='<to_level0_export'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSTCAccess().getTo_level0_exportKeyword_16_0());
			}
			otherlv_35='file='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTCAccess().getFileKeyword_16_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_36=RULE_STRING
					{
						newLeafNode(otherlv_36, grammarAccess.getGSSTCAccess().getTo_level0_exportGSSExportExportCrossReference_16_2_0());
					}
				)
			)
			otherlv_37='/>'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		(
			otherlv_38='<level0_format'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSTCAccess().getLevel0_formatKeyword_17_0());
			}
			otherlv_39='file='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTCAccess().getFileKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCRule());
						}
					}
					otherlv_40=RULE_STRING
					{
						newLeafNode(otherlv_40, grammarAccess.getGSSTCAccess().getLevel0_formatGSSFormatFormatCrossReference_17_2_0());
					}
				)
			)
			otherlv_41='/>'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_42='<fields>'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSTCAccess().getFieldsKeyword_18_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTCAccess().getGssFieldsGSSTCFieldParserRuleCall_18_1_0());
					}
					lv_gssFields_43_0=ruleGSSTCField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTCRule());
						}
						add(
							$current,
							"gssFields",
							lv_gssFields_43_0,
							"es.uah.aut.srg.gss.lang.tc.TC.GSSTCField");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_44='</fields>'
			{
				newLeafNode(otherlv_44, grammarAccess.getGSSTCAccess().getFieldsKeyword_18_2());
			}
		)?
		otherlv_45='</GSSTC>'
		{
			newLeafNode(otherlv_45, grammarAccess.getGSSTCAccess().getGSSTCKeyword_19());
		}
	)
;

// Entry rule entryRuleGSSTCField
entryRuleGSSTCField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTCFieldRule()); }
	iv_ruleGSSTCField=ruleGSSTCField
	{ $current=$iv_ruleGSSTCField.current; }
	EOF;

// Rule GSSTCField
ruleGSSTCField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Field'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTCFieldAccess().getFieldKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTCFieldAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTCFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTCFieldRule());
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
			newLeafNode(otherlv_3, grammarAccess.getGSSTCFieldAccess().getGssFieldKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTCFieldRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSTCFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5='enumRef='
			{
				newLeafNode(otherlv_5, grammarAccess.getGSSTCFieldAccess().getEnumRefKeyword_5_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTCFieldRule());
						}
					}
					otherlv_6=RULE_STRING
					{
						newLeafNode(otherlv_6, grammarAccess.getGSSTCFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0());
					}
				)
			)
		)?
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTCFieldAccess().getSolidusGreaterThanSignKeyword_6());
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
