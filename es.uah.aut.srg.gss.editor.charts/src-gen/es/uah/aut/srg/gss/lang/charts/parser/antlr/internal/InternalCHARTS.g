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
grammar InternalCHARTS;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.charts.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.charts.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.charts.services.CHARTSGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private CHARTSGrammarAccess grammarAccess;

    public InternalCHARTSParser(TokenStream input, CHARTSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected CHARTSGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.charts.CHARTS.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSChartsChartsParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSChartsCharts
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.charts.CHARTS.GSSChartsCharts");
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

// Entry rule entryRuleGSSChartsCharts
entryRuleGSSChartsCharts returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSChartsChartsRule()); }
	iv_ruleGSSChartsCharts=ruleGSSChartsCharts
	{ $current=$iv_ruleGSSChartsCharts.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSChartsCharts
ruleGSSChartsCharts returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSChartsCharts'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSChartsChartsAccess().getGSSChartsChartsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSChartsChartsAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSChartsChartsRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSChartsChartsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSChartsChartsAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSChartsChartsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSChartsChartsRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.charts.CHARTS.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSChartsChartsAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSChartsChartsAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSChartsChartsRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.charts.CHARTS.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSChartsChartsAccess().getChartGSSChartsChartParserRuleCall_4_0());
				}
				lv_Chart_12_0=ruleGSSChartsChart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSChartsChartsRule());
					}
					add(
						$current,
						"Chart",
						lv_Chart_12_0,
						"es.uah.aut.srg.gss.lang.charts.CHARTS.GSSChartsChart");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSChartsChartsAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSChartsChart
entryRuleGSSChartsChart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSChartsChartRule()); }
	iv_ruleGSSChartsChart=ruleGSSChartsChart
	{ $current=$iv_ruleGSSChartsChart.current; }
	EOF;

// Rule GSSChartsChart
ruleGSSChartsChart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSChartsChart'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSChartsChartAccess().getGSSChartsChartKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSChartsChartAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSChartsChartAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSChartsChartAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSChartsChartRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.charts.CHARTS.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSChartsChartAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_STRING
				{
					newLeafNode(lv_name_8_0, grammarAccess.getGSSChartsChartAccess().getNameSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSChartsChartRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_9());
		}
		otherlv_10='y_units'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSChartsChartAccess().getY_unitsKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSChartsChartAccess().getY_unitsGSSChartsYUnitsEnumRuleCall_12_0());
				}
				lv_y_units_12_0=ruleGSSChartsYUnits
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSChartsChartRule());
					}
					set(
						$current,
						"y_units",
						lv_y_units_12_0,
						"es.uah.aut.srg.gss.lang.charts.CHARTS.GSSChartsYUnits");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_13());
		}
		otherlv_14='y_max'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSChartsChartAccess().getY_maxKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSChartsChartAccess().getY_maxINTEGERParserRuleCall_16_0());
				}
				lv_y_max_16_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSChartsChartRule());
					}
					set(
						$current,
						"y_max",
						lv_y_max_16_0,
						"es.uah.aut.srg.gss.lang.charts.CHARTS.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_17());
		}
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSChartsChartAccess().getRightCurlyBracketKeyword_18());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_19());
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

// Rule GSSChartsYUnits
ruleGSSChartsYUnits returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='volts'
			{
				$current = grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='amps'
			{
				$current = grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1());
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
