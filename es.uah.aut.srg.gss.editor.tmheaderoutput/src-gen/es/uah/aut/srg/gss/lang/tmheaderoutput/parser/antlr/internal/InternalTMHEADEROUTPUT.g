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
grammar InternalTMHEADEROUTPUT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tmheaderoutput.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tmheaderoutput.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tmheaderoutput.services.TMHEADEROUTPUTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TMHEADEROUTPUTGrammarAccess grammarAccess;

    public InternalTMHEADEROUTPUTParser(TokenStream input, TMHEADEROUTPUTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSTMHeaderOutput";
   	}

   	@Override
   	protected TMHEADEROUTPUTGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGSSTMHeaderOutput
entryRuleGSSTMHeaderOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMHeaderOutputRule()); }
	iv_ruleGSSTMHeaderOutput=ruleGSSTMHeaderOutput
	{ $current=$iv_ruleGSSTMHeaderOutput.current; }
	EOF;

// Rule GSSTMHeaderOutput
ruleGSSTMHeaderOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<GSSTMHeaderOutput'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMHeaderOutputAccess().getGSSTMHeaderOutputKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMHeaderOutputAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMHeaderOutputAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMHeaderOutputRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTMHeaderOutputAccess().getGreaterThanSignKeyword_3());
		}
		otherlv_4='<format'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSTMHeaderOutputAccess().getFormatKeyword_4());
		}
		otherlv_5='file='
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTMHeaderOutputAccess().getFileKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMHeaderOutputRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getGSSTMHeaderOutputAccess().getFormatGSSFormatFormatCrossReference_6_0());
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTMHeaderOutputAccess().getSolidusGreaterThanSignKeyword_7());
		}
		(
			otherlv_8='<fields>'
			{
				newLeafNode(otherlv_8, grammarAccess.getGSSTMHeaderOutputAccess().getFieldsKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsGSSTMHeaderOutputFieldParserRuleCall_8_1_0());
					}
					lv_gssHeaderFields_9_0=ruleGSSTMHeaderOutputField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTMHeaderOutputRule());
						}
						add(
							$current,
							"gssHeaderFields",
							lv_gssHeaderFields_9_0,
							"es.uah.aut.srg.gss.lang.tmheaderoutput.TMHEADEROUTPUT.GSSTMHeaderOutputField");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_10='</fields>'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTMHeaderOutputAccess().getFieldsKeyword_8_2());
			}
		)?
		otherlv_11='</GSSTMHeaderOutput>'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTMHeaderOutputAccess().getGSSTMHeaderOutputKeyword_9());
		}
	)
;

// Entry rule entryRuleGSSTMHeaderOutputField
entryRuleGSSTMHeaderOutputField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTMHeaderOutputFieldRule()); }
	iv_ruleGSSTMHeaderOutputField=ruleGSSTMHeaderOutputField
	{ $current=$iv_ruleGSSTMHeaderOutputField.current; }
	EOF;

// Rule GSSTMHeaderOutputField
ruleGSSTMHeaderOutputField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<HeaderField'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTMHeaderOutputFieldAccess().getHeaderFieldKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMHeaderOutputFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='gssHeaderField='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTMHeaderOutputFieldRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0());
				}
			)
		)
		(
			(
				otherlv_5='>'
				{
					newLeafNode(otherlv_5, grammarAccess.getGSSTMHeaderOutputFieldAccess().getGreaterThanSignKeyword_5_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getGSSTMHeaderOutputFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0());
						}
						lv_fieldValue_6_0=ruleTMTCIFFieldValueRaw
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getGSSTMHeaderOutputFieldRule());
							}
							set(
								$current,
								"fieldValue",
								lv_fieldValue_6_0,
								"es.uah.aut.srg.gss.lang.tmheaderoutput.TMHEADEROUTPUT.TMTCIFFieldValueRaw");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_7='</HeaderField>'
				{
					newLeafNode(otherlv_7, grammarAccess.getGSSTMHeaderOutputFieldAccess().getHeaderFieldKeyword_5_0_2());
				}
			)
			    |
			otherlv_8='/>'
			{
				newLeafNode(otherlv_8, grammarAccess.getGSSTMHeaderOutputFieldAccess().getSolidusGreaterThanSignKeyword_5_1());
			}
		)
	)
;

// Entry rule entryRuleTMTCIFFieldValueRaw
entryRuleTMTCIFFieldValueRaw returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueRawRule()); }
	iv_ruleTMTCIFFieldValueRaw=ruleTMTCIFFieldValueRaw
	{ $current=$iv_ruleTMTCIFFieldValueRaw.current; }
	EOF;

// Rule TMTCIFFieldValueRaw
ruleTMTCIFFieldValueRaw returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueRaw'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0());
		}
		otherlv_1='value='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1());
		}
		(
			(
				(
					lv_value_2_1=RULE_UINT_STRING
					{
						newLeafNode(lv_value_2_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_1,
							"es.uah.aut.srg.gss.lang.tmheaderoutput.TMHEADEROUTPUT.UINT_STRING");
					}
					    |
					lv_value_2_2=RULE_HEX_STRING
					{
						newLeafNode(lv_value_2_2, grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_2,
							"es.uah.aut.srg.gss.lang.tmheaderoutput.TMHEADEROUTPUT.HEX_STRING");
					}
				)
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_HEX_STRING : '"0x' ('0'..'9'|'a'..'f'|'A'..'F')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
