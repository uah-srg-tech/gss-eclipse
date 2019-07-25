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
grammar InternalCONFIG;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.config.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.config.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private CONFIGGrammarAccess grammarAccess;

    public InternalCONFIGParser(TokenStream input, CONFIGGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected CONFIGGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSConfigGSSConfig
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSConfig");
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

// Entry rule entryRuleGSSConfigGSSConfig
entryRuleGSSConfigGSSConfig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigGSSConfigRule()); }
	iv_ruleGSSConfigGSSConfig=ruleGSSConfigGSSConfig
	{ $current=$iv_ruleGSSConfigGSSConfig.current; }
	EOF;

// Rule GSSConfigGSSConfig
ruleGSSConfigGSSConfig returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigGSSConfig'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigGSSConfigRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='uri'
			{
				newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0());
			}
			otherlv_4=':='
			{
				newLeafNode(otherlv_4, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0());
					}
					lv_uri_5_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
						}
						set(
							$current,
							"uri",
							lv_uri_5_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_3());
			}
		)
		otherlv_7='version'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_4());
		}
		otherlv_8=':='
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0());
				}
				lv_version_9_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"version",
						lv_version_9_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_7());
		}
		otherlv_11='scenario'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSConfigAccess().getScenarioKeyword_8());
		}
		otherlv_12=':='
		{
			newLeafNode(otherlv_12, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_9());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigGSSConfigRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioGSSEnvironmentScenarioCrossReference_10_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_12_0());
				}
				lv_Tests_15_0=ruleGSSConfigTests
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
					}
					set(
						$current,
						"Tests",
						lv_Tests_15_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTests");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleGSSConfigTests
entryRuleGSSConfigTests returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigTestsRule()); }
	iv_ruleGSSConfigTests=ruleGSSConfigTests
	{ $current=$iv_ruleGSSConfigTests.current; }
	EOF;

// Rule GSSConfigTests
ruleGSSConfigTests returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigTests'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_2_0());
				}
				lv_TestCase_2_0=ruleGSSConfigTestCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSConfigTestsRule());
					}
					add(
						$current,
						"TestCase",
						lv_TestCase_2_0,
						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTestCase");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleGSSConfigTestCase
entryRuleGSSConfigTestCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSConfigTestCaseRule()); }
	iv_ruleGSSConfigTestCase=ruleGSSConfigTestCase
	{ $current=$iv_ruleGSSConfigTestCase.current; }
	EOF;

// Rule GSSConfigTestCase
ruleGSSConfigTestCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSConfigTestCase'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5());
		}
		otherlv_6='procedure'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='req'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0());
			}
			(
				(
					lv_req_11_0=RULE_ID
					{
						newLeafNode(lv_req_11_0, grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
						}
						setWithLastConsumed(
							$current,
							"req",
							lv_req_11_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_12='reqAction'
			{
				newLeafNode(otherlv_12, grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0());
					}
					lv_reqAction_13_0=ruleGSSConfigReqAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSConfigTestCaseRule());
						}
						set(
							$current,
							"reqAction",
							lv_reqAction_13_0,
							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReqAction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13());
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

// Rule GSSConfigReqAction
ruleGSSConfigReqAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='_1'
		{
			$current = grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration());
		}
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
