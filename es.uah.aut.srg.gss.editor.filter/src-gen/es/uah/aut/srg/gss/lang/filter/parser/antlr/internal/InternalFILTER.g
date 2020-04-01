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
grammar InternalFILTER;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.filter.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.filter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.filter.services.FILTERGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private FILTERGrammarAccess grammarAccess;

    public InternalFILTERParser(TokenStream input, FILTERGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected FILTERGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSFilterFilterParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSFilterFilter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFilter");
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

// Entry rule entryRuleGSSFilterFilter
entryRuleGSSFilterFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterFilterRule()); }
	iv_ruleGSSFilterFilter=ruleGSSFilterFilter
	{ $current=$iv_ruleGSSFilterFilter.current; }
	EOF;

// Rule GSSFilterFilter
ruleGSSFilterFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMaxtermFilterParserRuleCall_0());
		}
		this_GSSFilterMaxtermFilter_0=ruleGSSFilterMaxtermFilter
		{
			$current = $this_GSSFilterMaxtermFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMintermFilterParserRuleCall_1());
		}
		this_GSSFilterMintermFilter_1=ruleGSSFilterMintermFilter
		{
			$current = $this_GSSFilterMintermFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSFilterMaxtermFilter
entryRuleGSSFilterMaxtermFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterRule()); }
	iv_ruleGSSFilterMaxtermFilter=ruleGSSFilterMaxtermFilter
	{ $current=$iv_ruleGSSFilterMaxtermFilter.current; }
	EOF;

// Rule GSSFilterMaxtermFilter
ruleGSSFilterMaxtermFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterMaxtermFilter'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterMaxtermFilterRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='uri'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3());
		}
		otherlv_4=':='
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_5_0());
				}
				lv_uri_5_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
					}
					set(
						$current,
						"uri",
						lv_uri_5_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6());
		}
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_7());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_9_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
					}
					set(
						$current,
						"version",
						lv_version_9_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_10());
		}
		otherlv_11='formatFile'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_11());
		}
		otherlv_12=':='
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_12());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterMaxtermFilterRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0());
				}
				lv_BoolVar_15_0=ruleGSSFilterAbstractBoolVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
					}
					add(
						$current,
						"BoolVar",
						lv_BoolVar_15_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterAbstractBoolVar");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_16_0());
				}
				lv_Maxterm_16_0=ruleGSSFilterMaxterm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
					}
					add(
						$current,
						"Maxterm",
						lv_Maxterm_16_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMaxterm");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_17());
		}
		otherlv_18=';'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_18());
		}
	)
;

// Entry rule entryRuleGSSFilterAbstractBoolVar
entryRuleGSSFilterAbstractBoolVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarRule()); }
	iv_ruleGSSFilterAbstractBoolVar=ruleGSSFilterAbstractBoolVar
	{ $current=$iv_ruleGSSFilterAbstractBoolVar.current; }
	EOF;

// Rule GSSFilterAbstractBoolVar
ruleGSSFilterAbstractBoolVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarParserRuleCall_0());
		}
		this_GSSFilterBoolVar_0=ruleGSSFilterBoolVar
		{
			$current = $this_GSSFilterBoolVar_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromArrayItemParserRuleCall_1());
		}
		this_GSSFilterBoolVarFromArrayItem_1=ruleGSSFilterBoolVarFromArrayItem
		{
			$current = $this_GSSFilterBoolVarFromArrayItem_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2());
		}
		this_GSSFilterBoolVarFromGroupedArrayItem_2=ruleGSSFilterBoolVarFromGroupedArrayItem
		{
			$current = $this_GSSFilterBoolVarFromGroupedArrayItem_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFDICParserRuleCall_3());
		}
		this_GSSFilterBoolVarFDIC_3=ruleGSSFilterBoolVarFDIC
		{
			$current = $this_GSSFilterBoolVarFDIC_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSFilterMintermFilter
entryRuleGSSFilterMintermFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterMintermFilterRule()); }
	iv_ruleGSSFilterMintermFilter=ruleGSSFilterMintermFilter
	{ $current=$iv_ruleGSSFilterMintermFilter.current; }
	EOF;

// Rule GSSFilterMintermFilter
ruleGSSFilterMintermFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterMintermFilter'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterMintermFilterRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='uri'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3());
		}
		otherlv_4=':='
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_5_0());
				}
				lv_uri_5_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
					}
					set(
						$current,
						"uri",
						lv_uri_5_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6());
		}
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_7());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_9_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
					}
					set(
						$current,
						"version",
						lv_version_9_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_10());
		}
		otherlv_11='formatFile'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_11());
		}
		otherlv_12=':='
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_12());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterMintermFilterRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0());
				}
				lv_BoolVar_15_0=ruleGSSFilterAbstractBoolVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
					}
					add(
						$current,
						"BoolVar",
						lv_BoolVar_15_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterAbstractBoolVar");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_16_0());
				}
				lv_Minterm_16_0=ruleGSSFilterMinterm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
					}
					add(
						$current,
						"Minterm",
						lv_Minterm_16_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMinterm");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_17());
		}
		otherlv_18=';'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_18());
		}
	)
;

// Entry rule entryRuleGSSFilterBoolVar
entryRuleGSSFilterBoolVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterBoolVarRule()); }
	iv_ruleGSSFilterBoolVar=ruleGSSFilterBoolVar
	{ $current=$iv_ruleGSSFilterBoolVar.current; }
	EOF;

// Rule GSSFilterBoolVar
ruleGSSFilterBoolVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterBoolVar'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9());
		}
		otherlv_10='constantType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0());
				}
				lv_constantType_12_0=ruleGSSFilterConstantType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
					}
					set(
						$current,
						"constantType",
						lv_constantType_12_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13());
		}
		otherlv_14='FieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarAccess().getFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldCrossReference_16_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0());
				}
				lv_Op_18_0=ruleGSSFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
					}
					set(
						$current,
						"Op",
						lv_Op_18_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getValueGSSFilterValueParserRuleCall_19_0());
				}
				lv_value_19_0=ruleGSSFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
					}
					set(
						$current,
						"value",
						lv_value_19_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20());
		}
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21());
		}
	)
;

// Entry rule entryRuleGSSFilterBoolVarFromArrayItem
entryRuleGSSFilterBoolVarFromArrayItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemRule()); }
	iv_ruleGSSFilterBoolVarFromArrayItem=ruleGSSFilterBoolVarFromArrayItem
	{ $current=$iv_ruleGSSFilterBoolVarFromArrayItem.current; }
	EOF;

// Rule GSSFilterBoolVarFromArrayItem
ruleGSSFilterBoolVarFromArrayItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterBoolVarFromArrayItem'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9());
		}
		otherlv_10='constantType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0());
				}
				lv_constantType_12_0=ruleGSSFilterConstantType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"constantType",
						lv_constantType_12_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13());
		}
		otherlv_14='AIFieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldCrossReference_16_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0());
				}
				lv_Op_18_0=ruleGSSFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"Op",
						lv_Op_18_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getValueGSSFilterValueParserRuleCall_19_0());
				}
				lv_value_19_0=ruleGSSFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"value",
						lv_value_19_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20());
		}
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21());
		}
	)
;

// Entry rule entryRuleGSSFilterBoolVarFromGroupedArrayItem
entryRuleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule()); }
	iv_ruleGSSFilterBoolVarFromGroupedArrayItem=ruleGSSFilterBoolVarFromGroupedArrayItem
	{ $current=$iv_ruleGSSFilterBoolVarFromGroupedArrayItem.current; }
	EOF;

// Rule GSSFilterBoolVarFromGroupedArrayItem
ruleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterBoolVarFromGroupedArrayItem'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9());
		}
		otherlv_10='constantType'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0());
				}
				lv_constantType_12_0=ruleGSSFilterConstantType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"constantType",
						lv_constantType_12_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13());
		}
		otherlv_14='group'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				lv_group_16_0=RULE_ID
				{
					newLeafNode(lv_group_16_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
					setWithLastConsumed(
						$current,
						"group",
						lv_group_16_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17());
		}
		otherlv_18='AIFieldRefs'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldCrossReference_20_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0());
				}
				lv_Op_22_0=ruleGSSFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"Op",
						lv_Op_22_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getValueGSSFilterValueParserRuleCall_23_0());
				}
				lv_value_23_0=ruleGSSFilterValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"value",
						lv_value_23_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleGSSFilterBoolVarFDIC
entryRuleGSSFilterBoolVarFDIC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICRule()); }
	iv_ruleGSSFilterBoolVarFDIC=ruleGSSFilterBoolVarFDIC
	{ $current=$iv_ruleGSSFilterBoolVarFDIC.current; }
	EOF;

// Rule GSSFilterBoolVarFDIC
ruleGSSFilterBoolVarFDIC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterBoolVarFDIC'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFDICRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarFDICAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFDICRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_9());
		}
		otherlv_10='FieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterBoolVarFDICRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldCrossReference_12_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0());
				}
				lv_Op_14_0=ruleGSSFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFDICRule());
					}
					set(
						$current,
						"Op",
						lv_Op_14_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSFilterValue
entryRuleGSSFilterValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterValueRule()); }
	iv_ruleGSSFilterValue=ruleGSSFilterValue
	{ $current=$iv_ruleGSSFilterValue.current; }
	EOF;

// Rule GSSFilterValue
ruleGSSFilterValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterValueAccess().getGSSFilterConstantParserRuleCall_0());
		}
		this_GSSFilterConstant_0=ruleGSSFilterConstant
		{
			$current = $this_GSSFilterConstant_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectParserRuleCall_1());
		}
		this_GSSFilterSelect_1=ruleGSSFilterSelect
		{
			$current = $this_GSSFilterSelect_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectLineParserRuleCall_2());
		}
		this_GSSFilterSelectLine_2=ruleGSSFilterSelectLine
		{
			$current = $this_GSSFilterSelectLine_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSFilterFieldOp
entryRuleGSSFilterFieldOp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterFieldOpRule()); }
	iv_ruleGSSFilterFieldOp=ruleGSSFilterFieldOp
	{ $current=$iv_ruleGSSFilterFieldOp.current; }
	EOF;

// Rule GSSFilterFieldOp
ruleGSSFilterFieldOp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterFieldOp'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleGSSFilterOPType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterFieldOpRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterOPType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterFieldOpAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSFilterConstant
entryRuleGSSFilterConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterConstantRule()); }
	iv_ruleGSSFilterConstant=ruleGSSFilterConstant
	{ $current=$iv_ruleGSSFilterConstant.current; }
	EOF;

// Rule GSSFilterConstant
ruleGSSFilterConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterConstant'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterConstantAccess().getValueINTEGERParserRuleCall_4_0());
				}
				lv_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterConstantRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='mask'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					lv_mask_8_0=RULE_HEXADECIMAL
					{
						newLeafNode(lv_mask_8_0, grammarAccess.getGSSFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFilterConstantRule());
						}
						setWithLastConsumed(
							$current,
							"mask",
							lv_mask_8_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSFilterConstantAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSFilterSelect
entryRuleGSSFilterSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterSelectRule()); }
	iv_ruleGSSFilterSelect=ruleGSSFilterSelect
	{ $current=$iv_ruleGSSFilterSelect.current; }
	EOF;

// Rule GSSFilterSelect
ruleGSSFilterSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterSelect'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fromFile'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_fromFile_4_0=RULE_ID
				{
					newLeafNode(lv_fromFile_4_0, grammarAccess.getGSSFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterSelectRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterSelectAccess().getTypeGSSFilterSelectTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleGSSFilterSelectType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterSelectRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='offset'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0());
					}
					lv_offset_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSFilterSelectRule());
						}
						set(
							$current,
							"offset",
							lv_offset_12_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='size'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0());
					}
					lv_size_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSFilterSelectRule());
						}
						set(
							$current,
							"size",
							lv_size_16_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3());
			}
		)?
		(
			otherlv_18='mask'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1());
			}
			(
				(
					lv_mask_20_0=RULE_HEXADECIMAL
					{
						newLeafNode(lv_mask_20_0, grammarAccess.getGSSFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFilterSelectRule());
						}
						setWithLastConsumed(
							$current,
							"mask",
							lv_mask_20_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_12_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFilterSelectAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleGSSFilterSelectLine
entryRuleGSSFilterSelectLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterSelectLineRule()); }
	iv_ruleGSSFilterSelectLine=ruleGSSFilterSelectLine
	{ $current=$iv_ruleGSSFilterSelectLine.current; }
	EOF;

// Rule GSSFilterSelectLine
ruleGSSFilterSelectLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterSelectLine'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fromFile'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_fromFile_4_0=RULE_ID
				{
					newLeafNode(lv_fromFile_4_0, grammarAccess.getGSSFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSFilterSelectLineRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5());
		}
		otherlv_6='line'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0());
				}
				lv_line_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterSelectLineRule());
					}
					set(
						$current,
						"line",
						lv_line_8_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='leftTrim'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0());
					}
					lv_leftTrim_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSFilterSelectLineRule());
						}
						set(
							$current,
							"leftTrim",
							lv_leftTrim_12_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='rightTrim'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0());
					}
					lv_rightTrim_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSFilterSelectLineRule());
						}
						set(
							$current,
							"rightTrim",
							lv_rightTrim_16_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3());
			}
		)?
		(
			otherlv_18='mask'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1());
			}
			(
				(
					lv_mask_20_0=RULE_HEXADECIMAL
					{
						newLeafNode(lv_mask_20_0, grammarAccess.getGSSFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSFilterSelectLineRule());
						}
						setWithLastConsumed(
							$current,
							"mask",
							lv_mask_20_0,
							"es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_12_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSFilterSelectLineAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleGSSFilterMaxterm
entryRuleGSSFilterMaxterm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterMaxtermRule()); }
	iv_ruleGSSFilterMaxterm=ruleGSSFilterMaxterm
	{ $current=$iv_ruleGSSFilterMaxterm.current; }
	EOF;

// Rule GSSFilterMaxterm
ruleGSSFilterMaxterm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterMaxterm'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
				}
				lv_BoolVarRef_6_0=ruleGSSFilterBoolVarRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermRule());
					}
					add(
						$current,
						"BoolVarRef",
						lv_BoolVarRef_6_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarRef");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMaxtermAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSFilterMinterm
entryRuleGSSFilterMinterm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterMintermRule()); }
	iv_ruleGSSFilterMinterm=ruleGSSFilterMinterm
	{ $current=$iv_ruleGSSFilterMinterm.current; }
	EOF;

// Rule GSSFilterMinterm
ruleGSSFilterMinterm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterMinterm'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMintermRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
				}
				lv_BoolVarRef_6_0=ruleGSSFilterBoolVarRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterMintermRule());
					}
					add(
						$current,
						"BoolVarRef",
						lv_BoolVarRef_6_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarRef");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSFilterBoolVarRef
entryRuleGSSFilterBoolVarRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSFilterBoolVarRefRule()); }
	iv_ruleGSSFilterBoolVarRef=ruleGSSFilterBoolVarRef
	{ $current=$iv_ruleGSSFilterBoolVarRef.current; }
	EOF;

// Rule GSSFilterBoolVarRef
ruleGSSFilterBoolVarRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSFilterBoolVarRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0());
				}
				lv_idRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRefRule());
					}
					set(
						$current,
						"idRef",
						lv_idRef_4_0,
						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_7());
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

// Rule GSSFilterConstantType
ruleGSSFilterConstantType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='decimal'
			{
				$current = grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='hex'
			{
				$current = grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='binary'
			{
				$current = grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='char'
			{
				$current = grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='string'
			{
				$current = grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule GSSFilterOPType
ruleGSSFilterOPType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='equal'
			{
				$current = grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='different'
			{
				$current = grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='bigger_than'
			{
				$current = grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='smaller_than'
			{
				$current = grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='bigger_or_equal'
			{
				$current = grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='smaller_or_equal'
			{
				$current = grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule GSSFilterSelectType
ruleGSSFilterSelectType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='data'
			{
				$current = grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='size'
			{
				$current = grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='crc'
			{
				$current = grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2());
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
