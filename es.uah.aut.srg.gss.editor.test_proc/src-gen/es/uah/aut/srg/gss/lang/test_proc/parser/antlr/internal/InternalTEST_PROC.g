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
grammar InternalTEST_PROC;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.test_proc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.test_proc.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.test_proc.services.TEST_PROCGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TEST_PROCGrammarAccess grammarAccess;

    public InternalTEST_PROCParser(TokenStream input, TEST_PROCGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "GSSModelFile";
   	}

   	@Override
   	protected TEST_PROCGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSTestProcTestProcParserRuleCall_1_0());
				}
				lv_element_1_0=ruleGSSTestProcTestProc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTestProc");
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
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSModelFileImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleGSSTestProcTestProc
entryRuleGSSTestProcTestProc returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getGSSTestProcTestProcRule()); }
	iv_ruleGSSTestProcTestProc=ruleGSSTestProcTestProc
	{ $current=$iv_ruleGSSTestProcTestProc.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule GSSTestProcTestProc
ruleGSSTestProcTestProc returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcTestProc'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcTestProcAccess().getGSSTestProcTestProcKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGSSTestProcTestProcAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcTestProcRule());
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
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcTestProcAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getGSSTestProcTestProcAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getGSSTestProcTestProcAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSTestProcTestProcAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSTestProcTestProcRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getGSSTestProcTestProcAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getGSSTestProcTestProcAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getGSSTestProcTestProcAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getGSSTestProcTestProcRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcTestProcAccess().getStepGSSTestProcStepParserRuleCall_4_0());
				}
				lv_step_12_0=ruleGSSTestProcStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcTestProcRule());
					}
					add(
						$current,
						"step",
						lv_step_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcStep");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcTestProcAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_14=';'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleGSSTestProcStep
entryRuleGSSTestProcStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcStepRule()); }
	iv_ruleGSSTestProcStep=ruleGSSTestProcStep
	{ $current=$iv_ruleGSSTestProcStep.current; }
	EOF;

// Rule GSSTestProcStep
ruleGSSTestProcStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcStep'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcStepAccess().getGSSTestProcStepKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcStepAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcStepAccess().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcStepAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcStepRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcStepAccess().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='prev_step_idref'
			{
				newLeafNode(otherlv_10, grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcStepRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefGSSTestProcStepCrossReference_10_2_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_10_3());
			}
			otherlv_14='output_idref_from_prev_step'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepKeyword_10_4());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_10_5());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcStepRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_10_6_0());
					}
					ruleVersionedQualifiedReferenceName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_10_7());
			}
		)?
		otherlv_18='mode'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTestProcStepAccess().getModeKeyword_11());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getModeGSSTestProcModeEnumRuleCall_13_0());
				}
				lv_mode_20_0=ruleGSSTestProcMode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
					}
					set(
						$current,
						"mode",
						lv_mode_20_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcMode");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_14());
		}
		(
			otherlv_22='replays'
			{
				newLeafNode(otherlv_22, grammarAccess.getGSSTestProcStepAccess().getReplaysKeyword_15_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getReplaysINTEGERParserRuleCall_15_2_0());
					}
					lv_replays_24_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
						}
						set(
							$current,
							"replays",
							lv_replays_24_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getInputsGSSTestProcAbstractInputsParserRuleCall_16_0());
				}
				lv_inputs_26_0=ruleGSSTestProcAbstractInputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
					}
					set(
						$current,
						"inputs",
						lv_inputs_26_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcAbstractInputs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getOutputsGSSTestProcOutputsParserRuleCall_17_0());
				}
				lv_outputs_27_0=ruleGSSTestProcOutputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
					}
					set(
						$current,
						"outputs",
						lv_outputs_27_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutputs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getSpecialPacketsGSSTestProcSpecialPacketsParserRuleCall_18_0());
				}
				lv_specialPackets_28_0=ruleGSSTestProcSpecialPackets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
					}
					set(
						$current,
						"specialPackets",
						lv_specialPackets_28_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcSpecialPackets");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcStepAccess().getConcurrent_stepsGSSTestProcConcurrentStepsParserRuleCall_19_0());
				}
				lv_concurrent_steps_29_0=ruleGSSTestProcConcurrentSteps
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcStepRule());
					}
					set(
						$current,
						"concurrent_steps",
						lv_concurrent_steps_29_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcConcurrentSteps");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_30='}'
		{
			newLeafNode(otherlv_30, grammarAccess.getGSSTestProcStepAccess().getRightCurlyBracketKeyword_20());
		}
		otherlv_31=';'
		{
			newLeafNode(otherlv_31, grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_21());
		}
	)
;

// Entry rule entryRuleGSSTestProcAbstractInputs
entryRuleGSSTestProcAbstractInputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcAbstractInputsRule()); }
	iv_ruleGSSTestProcAbstractInputs=ruleGSSTestProcAbstractInputs
	{ $current=$iv_ruleGSSTestProcAbstractInputs.current; }
	EOF;

// Rule GSSTestProcAbstractInputs
ruleGSSTestProcAbstractInputs returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getGSSTestProcAbstractInputsAccess().getGSSTestProcInputsParserRuleCall_0());
		}
		this_GSSTestProcInputs_0=ruleGSSTestProcInputs
		{
			$current = $this_GSSTestProcInputs_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcAbstractInputsAccess().getGSSTestProcActionParserRuleCall_1());
		}
		this_GSSTestProcAction_1=ruleGSSTestProcAction
		{
			$current = $this_GSSTestProcAction_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSTestProcAction
entryRuleGSSTestProcAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcActionRule()); }
	iv_ruleGSSTestProcAction=ruleGSSTestProcAction
	{ $current=$iv_ruleGSSTestProcAction.current; }
	EOF;

// Rule GSSTestProcAction
ruleGSSTestProcAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcAction'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcActionAccess().getGSSTestProcActionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcActionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='message'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcActionAccess().getMessageKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcActionAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_message_4_0=RULE_STRING
				{
					newLeafNode(lv_message_4_0, grammarAccess.getGSSTestProcActionAccess().getMessageSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcActionRule());
					}
					setWithLastConsumed(
						$current,
						"message",
						lv_message_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_5());
		}
		otherlv_6='actionType'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcActionAccess().getActionTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcActionAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcActionAccess().getActionTypeGSSTestProcActionTypeEnumRuleCall_8_0());
				}
				lv_actionType_8_0=ruleGSSTestProcActionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcActionRule());
					}
					set(
						$current,
						"actionType",
						lv_actionType_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcActionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_9());
		}
		otherlv_10='delay_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcActionAccess().getDelay_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcActionAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcActionAccess().getDelay_valueINTEGERParserRuleCall_12_0());
				}
				lv_delay_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcActionRule());
					}
					set(
						$current,
						"delay_value",
						lv_delay_value_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_13());
		}
		otherlv_14='delay_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTestProcActionAccess().getDelay_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTestProcActionAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcActionAccess().getDelay_unitGSSTestProcTimeUnitEnumRuleCall_16_0());
				}
				lv_delay_unit_16_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcActionRule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_16_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_17());
		}
		otherlv_18='span_value'
		{
			newLeafNode(otherlv_18, grammarAccess.getGSSTestProcActionAccess().getSpan_valueKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getGSSTestProcActionAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcActionAccess().getSpan_valueINTEGERParserRuleCall_20_0());
				}
				lv_span_value_20_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcActionRule());
					}
					set(
						$current,
						"span_value",
						lv_span_value_20_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_21());
		}
		otherlv_22='span_unit'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTestProcActionAccess().getSpan_unitKeyword_22());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTestProcActionAccess().getColonEqualsSignKeyword_23());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcActionAccess().getSpan_unitGSSTestProcTimeUnitEnumRuleCall_24_0());
				}
				lv_span_unit_24_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcActionRule());
					}
					set(
						$current,
						"span_unit",
						lv_span_unit_24_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_25());
		}
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTestProcActionAccess().getRightCurlyBracketKeyword_26());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTestProcActionAccess().getSemicolonKeyword_27());
		}
	)
;

// Entry rule entryRuleGSSTestProcInputs
entryRuleGSSTestProcInputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcInputsRule()); }
	iv_ruleGSSTestProcInputs=ruleGSSTestProcInputs
	{ $current=$iv_ruleGSSTestProcInputs.current; }
	EOF;

// Rule GSSTestProcInputs
ruleGSSTestProcInputs returns [EObject current=null]
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
					grammarAccess.getGSSTestProcInputsAccess().getGSSTestProcInputsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSTestProcInputs'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcInputsAccess().getGSSTestProcInputsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcInputsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputsAccess().getInputGSSTestProcInputParserRuleCall_3_0());
				}
				lv_input_3_0=ruleGSSTestProcInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputsRule());
					}
					add(
						$current,
						"input",
						lv_input_3_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInput");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGSSTestProcInputsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcInputsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSTestProcOutputs
entryRuleGSSTestProcOutputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcOutputsRule()); }
	iv_ruleGSSTestProcOutputs=ruleGSSTestProcOutputs
	{ $current=$iv_ruleGSSTestProcOutputs.current; }
	EOF;

// Rule GSSTestProcOutputs
ruleGSSTestProcOutputs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcOutputs'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcOutputsAccess().getGSSTestProcOutputsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcOutputsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='checkmode'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeGSSTestProcCheckmodeEnumRuleCall_4_0());
				}
				lv_checkmode_4_0=ruleGSSTestProcCheckmode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputsRule());
					}
					set(
						$current,
						"checkmode",
						lv_checkmode_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcCheckmode");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_5());
		}
		otherlv_6='valid_time_interval_value'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueINTEGERParserRuleCall_8_0());
				}
				lv_valid_time_interval_value_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputsRule());
					}
					set(
						$current,
						"valid_time_interval_value",
						lv_valid_time_interval_value_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_9());
		}
		otherlv_10='valid_time_interval_unit'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitGSSTestProcTimeUnitEnumRuleCall_12_0());
				}
				lv_valid_time_interval_unit_12_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputsRule());
					}
					set(
						$current,
						"valid_time_interval_unit",
						lv_valid_time_interval_unit_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputsAccess().getOutputGSSTestProcOutputParserRuleCall_14_0());
				}
				lv_output_14_0=ruleGSSTestProcOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputsRule());
					}
					add(
						$current,
						"output",
						lv_output_14_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutput");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTestProcOutputsAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleGSSTestProcSpecialPackets
entryRuleGSSTestProcSpecialPackets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcSpecialPacketsRule()); }
	iv_ruleGSSTestProcSpecialPackets=ruleGSSTestProcSpecialPackets
	{ $current=$iv_ruleGSSTestProcSpecialPackets.current; }
	EOF;

// Rule GSSTestProcSpecialPackets
ruleGSSTestProcSpecialPackets returns [EObject current=null]
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
					grammarAccess.getGSSTestProcSpecialPacketsAccess().getGSSTestProcSpecialPacketsAction_0(),
					$current);
			}
		)
		otherlv_1='GSSTestProcSpecialPackets'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcSpecialPacketsAccess().getGSSTestProcSpecialPacketsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcSpecialPacketsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnableGSSTestProcEnableDisableParserRuleCall_3_0_0());
					}
					lv_enable_3_0=ruleGSSTestProcEnableDisable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcSpecialPacketsRule());
						}
						add(
							$current,
							"enable",
							lv_enable_3_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcEnableDisable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisableGSSTestProcEnableDisableParserRuleCall_3_1_0());
					}
					lv_disable_4_0=ruleGSSTestProcEnableDisable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcSpecialPacketsRule());
						}
						add(
							$current,
							"disable",
							lv_disable_4_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcEnableDisable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnable_printGSSTestProcEnableDisableParserRuleCall_3_2_0());
					}
					lv_enable_print_5_0=ruleGSSTestProcEnableDisable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcSpecialPacketsRule());
						}
						add(
							$current,
							"enable_print",
							lv_enable_print_5_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcEnableDisable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisable_printGSSTestProcEnableDisableParserRuleCall_3_3_0());
					}
					lv_disable_print_6_0=ruleGSSTestProcEnableDisable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcSpecialPacketsRule());
						}
						add(
							$current,
							"disable_print",
							lv_disable_print_6_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcEnableDisable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcSpecialPacketsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSTestProcSpecialPacketsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleGSSTestProcConcurrentSteps
entryRuleGSSTestProcConcurrentSteps returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcConcurrentStepsRule()); }
	iv_ruleGSSTestProcConcurrentSteps=ruleGSSTestProcConcurrentSteps
	{ $current=$iv_ruleGSSTestProcConcurrentSteps.current; }
	EOF;

// Rule GSSTestProcConcurrentSteps
ruleGSSTestProcConcurrentSteps returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcConcurrentSteps'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcConcurrentStepsAccess().getGSSTestProcConcurrentStepsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcConcurrentStepsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='nextStep'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcConcurrentStepsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepGSSTestProcNextStepParserRuleCall_4_0());
				}
				lv_nextStep_4_0=ruleGSSTestProcNextStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcConcurrentStepsRule());
					}
					set(
						$current,
						"nextStep",
						lv_nextStep_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcNextStep");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcConcurrentStepsAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepGSSTestProcConcurrentStepParserRuleCall_6_0());
				}
				lv_concurrent_step_6_0=ruleGSSTestProcConcurrentStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcConcurrentStepsRule());
					}
					add(
						$current,
						"concurrent_step",
						lv_concurrent_step_6_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcConcurrentStep");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcConcurrentStepsAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getGSSTestProcConcurrentStepsAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSTestProcInput
entryRuleGSSTestProcInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcInputRule()); }
	iv_ruleGSSTestProcInput=ruleGSSTestProcInput
	{ $current=$iv_ruleGSSTestProcInput.current; }
	EOF;

// Rule GSSTestProcInput
ruleGSSTestProcInput returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getGSSTestProcInputAccess().getGSSTestProcInputLevel3ParserRuleCall_0());
		}
		this_GSSTestProcInputLevel3_0=ruleGSSTestProcInputLevel3
		{
			$current = $this_GSSTestProcInputLevel3_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcInputAccess().getGSSTestProcInputLevel2ParserRuleCall_1());
		}
		this_GSSTestProcInputLevel2_1=ruleGSSTestProcInputLevel2
		{
			$current = $this_GSSTestProcInputLevel2_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcInputAccess().getGSSTestProcInputLevel1ParserRuleCall_2());
		}
		this_GSSTestProcInputLevel1_2=ruleGSSTestProcInputLevel1
		{
			$current = $this_GSSTestProcInputLevel1_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcInputAccess().getGSSTestProcInputLevel0ParserRuleCall_3());
		}
		this_GSSTestProcInputLevel0_3=ruleGSSTestProcInputLevel0
		{
			$current = $this_GSSTestProcInputLevel0_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSTestProcInputLevel3
entryRuleGSSTestProcInputLevel3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Rule()); }
	iv_ruleGSSTestProcInputLevel3=ruleGSSTestProcInputLevel3
	{ $current=$iv_ruleGSSTestProcInputLevel3.current; }
	EOF;

// Rule GSSTestProcInputLevel3
ruleGSSTestProcInputLevel3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcInputLevel3'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcInputLevel3Access().getGSSTestProcInputLevel3Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcInputLevel3Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcInputLevel3Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcInputLevel3Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcInputLevel3Access().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel3Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_9());
		}
		otherlv_10='delay_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueINTEGERParserRuleCall_12_0());
				}
				lv_delay_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel3Rule());
					}
					set(
						$current,
						"delay_value",
						lv_delay_value_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_13());
		}
		otherlv_14='delay_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitGSSTestProcTimeUnitEnumRuleCall_16_0());
				}
				lv_delay_unit_16_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel3Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_16_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_17());
		}
		(
			otherlv_18='level3'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcInputLevel3Access().getLevel3Keyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3GSSFormatFormatCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='app_to_level3'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3Keyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3GSSExportExportCrossReference_21_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_22());
		}
		(
			otherlv_26='level2'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTestProcInputLevel3Access().getLevel2Keyword_23_0());
			}
			otherlv_27=':='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2GSSFormatFormatCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_23_3());
			}
		)?
		(
			otherlv_30='level3_to_level2'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2Keyword_24_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_24_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2GSSExportExportCrossReference_24_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_24_3());
			}
		)?
		(
			otherlv_34='level1'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSTestProcInputLevel3Access().getLevel1Keyword_25_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_25_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1GSSFormatFormatCrossReference_25_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_25_3());
			}
		)?
		(
			otherlv_38='level2_to_level1'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1Keyword_26_0());
			}
			otherlv_39=':='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_26_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1GSSExportExportCrossReference_26_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_41=';'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_26_3());
			}
		)?
		(
			otherlv_42='level0'
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSTestProcInputLevel3Access().getLevel0Keyword_27_0());
			}
			otherlv_43=':='
			{
				newLeafNode(otherlv_43, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_27_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0GSSFormatFormatCrossReference_27_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_45=';'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_27_3());
			}
		)?
		(
			otherlv_46='level1_to_level0'
			{
				newLeafNode(otherlv_46, grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0Keyword_28_0());
			}
			otherlv_47=':='
			{
				newLeafNode(otherlv_47, grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_28_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_49=';'
			{
				newLeafNode(otherlv_49, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_28_3());
			}
		)?
		otherlv_50='}'
		{
			newLeafNode(otherlv_50, grammarAccess.getGSSTestProcInputLevel3Access().getRightCurlyBracketKeyword_29());
		}
		otherlv_51=';'
		{
			newLeafNode(otherlv_51, grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleGSSTestProcInputLevel2
entryRuleGSSTestProcInputLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Rule()); }
	iv_ruleGSSTestProcInputLevel2=ruleGSSTestProcInputLevel2
	{ $current=$iv_ruleGSSTestProcInputLevel2.current; }
	EOF;

// Rule GSSTestProcInputLevel2
ruleGSSTestProcInputLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcInputLevel2'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcInputLevel2Access().getGSSTestProcInputLevel2Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcInputLevel2Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcInputLevel2Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcInputLevel2Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcInputLevel2Access().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel2Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_9());
		}
		otherlv_10='delay_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueINTEGERParserRuleCall_12_0());
				}
				lv_delay_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel2Rule());
					}
					set(
						$current,
						"delay_value",
						lv_delay_value_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_13());
		}
		otherlv_14='delay_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitGSSTestProcTimeUnitEnumRuleCall_16_0());
				}
				lv_delay_unit_16_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel2Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_16_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_17());
		}
		(
			otherlv_18='level2'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcInputLevel2Access().getLevel2Keyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2GSSFormatFormatCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='app_to_level2'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2Keyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2GSSExportExportCrossReference_21_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_22());
		}
		(
			otherlv_26='level1'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTestProcInputLevel2Access().getLevel1Keyword_23_0());
			}
			otherlv_27=':='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1GSSFormatFormatCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_23_3());
			}
		)?
		(
			otherlv_30='level2_to_level1'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1Keyword_24_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_24_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_24_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_24_3());
			}
		)?
		(
			otherlv_34='level0'
			{
				newLeafNode(otherlv_34, grammarAccess.getGSSTestProcInputLevel2Access().getLevel0Keyword_25_0());
			}
			otherlv_35=':='
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_25_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0GSSFormatFormatCrossReference_25_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_37=';'
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_25_3());
			}
		)?
		(
			otherlv_38='level1_to_level0'
			{
				newLeafNode(otherlv_38, grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0Keyword_26_0());
			}
			otherlv_39=':='
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_26_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_26_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_41=';'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_26_3());
			}
		)?
		otherlv_42='}'
		{
			newLeafNode(otherlv_42, grammarAccess.getGSSTestProcInputLevel2Access().getRightCurlyBracketKeyword_27());
		}
		otherlv_43=';'
		{
			newLeafNode(otherlv_43, grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_28());
		}
	)
;

// Entry rule entryRuleGSSTestProcInputLevel1
entryRuleGSSTestProcInputLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Rule()); }
	iv_ruleGSSTestProcInputLevel1=ruleGSSTestProcInputLevel1
	{ $current=$iv_ruleGSSTestProcInputLevel1.current; }
	EOF;

// Rule GSSTestProcInputLevel1
ruleGSSTestProcInputLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcInputLevel1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcInputLevel1Access().getGSSTestProcInputLevel1Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcInputLevel1Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcInputLevel1Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcInputLevel1Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel1Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcInputLevel1Access().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel1Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_9());
		}
		otherlv_10='delay_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueINTEGERParserRuleCall_12_0());
				}
				lv_delay_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel1Rule());
					}
					set(
						$current,
						"delay_value",
						lv_delay_value_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_13());
		}
		otherlv_14='delay_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitGSSTestProcTimeUnitEnumRuleCall_16_0());
				}
				lv_delay_unit_16_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel1Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_16_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_17());
		}
		(
			otherlv_18='level1'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcInputLevel1Access().getLevel1Keyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1GSSFormatFormatCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='app_to_level1'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1Keyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel1Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1GSSExportExportCrossReference_21_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_22());
		}
		(
			otherlv_26='level0'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTestProcInputLevel1Access().getLevel0Keyword_23_0());
			}
			otherlv_27=':='
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0GSSFormatFormatCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_29=';'
			{
				newLeafNode(otherlv_29, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_23_3());
			}
		)?
		(
			otherlv_30='level1_to_level0'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0Keyword_24_0());
			}
			otherlv_31=':='
			{
				newLeafNode(otherlv_31, grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_24_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_24_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=';'
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_24_3());
			}
		)?
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getGSSTestProcInputLevel1Access().getRightCurlyBracketKeyword_25());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_26());
		}
	)
;

// Entry rule entryRuleGSSTestProcInputLevel0
entryRuleGSSTestProcInputLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcInputLevel0Rule()); }
	iv_ruleGSSTestProcInputLevel0=ruleGSSTestProcInputLevel0
	{ $current=$iv_ruleGSSTestProcInputLevel0.current; }
	EOF;

// Rule GSSTestProcInputLevel0
ruleGSSTestProcInputLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcInputLevel0'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcInputLevel0Access().getGSSTestProcInputLevel0Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcInputLevel0Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcInputLevel0Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcInputLevel0Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel0Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_5());
		}
		otherlv_6='ifRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcInputLevel0Access().getIfRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefINTEGERParserRuleCall_8_0());
				}
				lv_ifRef_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel0Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_9());
		}
		otherlv_10='delay_value'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueINTEGERParserRuleCall_12_0());
				}
				lv_delay_value_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel0Rule());
					}
					set(
						$current,
						"delay_value",
						lv_delay_value_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_13());
		}
		otherlv_14='delay_unit'
		{
			newLeafNode(otherlv_14, grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitGSSTestProcTimeUnitEnumRuleCall_16_0());
				}
				lv_delay_unit_16_0=ruleGSSTestProcTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcInputLevel0Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_16_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_17());
		}
		(
			otherlv_18='level0'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcInputLevel0Access().getLevel0Keyword_18_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcInputLevel0Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0GSSFormatFormatCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_18_3());
			}
		)?
		otherlv_22='app_to_level0'
		{
			newLeafNode(otherlv_22, grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0Keyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcInputLevel0Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0GSSExportExportCrossReference_21_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_22());
		}
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getGSSTestProcInputLevel0Access().getRightCurlyBracketKeyword_23());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_24());
		}
	)
;

// Entry rule entryRuleGSSTestProcOutput
entryRuleGSSTestProcOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcOutputRule()); }
	iv_ruleGSSTestProcOutput=ruleGSSTestProcOutput
	{ $current=$iv_ruleGSSTestProcOutput.current; }
	EOF;

// Rule GSSTestProcOutput
ruleGSSTestProcOutput returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getGSSTestProcOutputAccess().getGSSTestProcOutputLevel3ParserRuleCall_0());
		}
		this_GSSTestProcOutputLevel3_0=ruleGSSTestProcOutputLevel3
		{
			$current = $this_GSSTestProcOutputLevel3_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcOutputAccess().getGSSTestProcOutputLevel2ParserRuleCall_1());
		}
		this_GSSTestProcOutputLevel2_1=ruleGSSTestProcOutputLevel2
		{
			$current = $this_GSSTestProcOutputLevel2_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcOutputAccess().getGSSTestProcOutputLevel1ParserRuleCall_2());
		}
		this_GSSTestProcOutputLevel1_2=ruleGSSTestProcOutputLevel1
		{
			$current = $this_GSSTestProcOutputLevel1_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getGSSTestProcOutputAccess().getGSSTestProcOutputLevel0ParserRuleCall_3());
		}
		this_GSSTestProcOutputLevel0_3=ruleGSSTestProcOutputLevel0
		{
			$current = $this_GSSTestProcOutputLevel0_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGSSTestProcOutputLevel3
entryRuleGSSTestProcOutputLevel3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Rule()); }
	iv_ruleGSSTestProcOutputLevel3=ruleGSSTestProcOutputLevel3
	{ $current=$iv_ruleGSSTestProcOutputLevel3.current; }
	EOF;

// Rule GSSTestProcOutputLevel3
ruleGSSTestProcOutputLevel3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcOutputLevel3'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcOutputLevel3Access().getGSSTestProcOutputLevel3Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcOutputLevel3Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcOutputLevel3Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcOutputLevel3Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcOutputLevel3Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_13());
		}
		(
			otherlv_14='optional'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalINTEGERParserRuleCall_14_2_0());
					}
					lv_optional_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
						set(
							$current,
							"optional",
							lv_optional_16_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='level3'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3Keyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3GSSFormatFormatCrossReference_15_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_filterGSSTestProcLevel3FilterParserRuleCall_16_0());
				}
				lv_level3_filter_22_0=ruleGSSTestProcLevel3Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					set(
						$current,
						"level3_filter",
						lv_level3_filter_22_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel3Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_23='level2'
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2Keyword_17_0());
			}
			otherlv_24=':='
			{
				newLeafNode(otherlv_24, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2GSSFormatFormatCrossReference_17_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_26=';'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_17_3());
			}
		)?
		(
			otherlv_27='level3_from_level2'
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2Keyword_18_0());
			}
			otherlv_28=':='
			{
				newLeafNode(otherlv_28, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2GSSImportImportCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_30=';'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_18_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_19_0());
				}
				lv_level2_filter_31_0=ruleGSSTestProcLevel2Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					set(
						$current,
						"level2_filter",
						lv_level2_filter_31_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel2Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_32='level1'
			{
				newLeafNode(otherlv_32, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1Keyword_20_0());
			}
			otherlv_33=':='
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_20_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1GSSFormatFormatCrossReference_20_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_35=';'
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_20_3());
			}
		)?
		(
			otherlv_36='level2_from_level1'
			{
				newLeafNode(otherlv_36, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1Keyword_21_0());
			}
			otherlv_37=':='
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_21_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1GSSImportImportCrossReference_21_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_39=';'
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_21_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_22_0());
				}
				lv_level1_filter_40_0=ruleGSSTestProcLevel1Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					set(
						$current,
						"level1_filter",
						lv_level1_filter_40_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel1Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_41='level0'
			{
				newLeafNode(otherlv_41, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0Keyword_23_0());
			}
			otherlv_42=':='
			{
				newLeafNode(otherlv_42, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_23_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0GSSFormatFormatCrossReference_23_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_44=';'
			{
				newLeafNode(otherlv_44, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_23_3());
			}
		)?
		(
			otherlv_45='level1_from_level0'
			{
				newLeafNode(otherlv_45, grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0Keyword_24_0());
			}
			otherlv_46=':='
			{
				newLeafNode(otherlv_46, grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_24_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel3Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0GSSImportImportCrossReference_24_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_48=';'
			{
				newLeafNode(otherlv_48, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_24_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_25_0());
				}
				lv_level0_filter_49_0=ruleGSSTestProcLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel3Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_49_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_50='}'
		{
			newLeafNode(otherlv_50, grammarAccess.getGSSTestProcOutputLevel3Access().getRightCurlyBracketKeyword_26());
		}
		otherlv_51=';'
		{
			newLeafNode(otherlv_51, grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_27());
		}
	)
;

// Entry rule entryRuleGSSTestProcOutputLevel2
entryRuleGSSTestProcOutputLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Rule()); }
	iv_ruleGSSTestProcOutputLevel2=ruleGSSTestProcOutputLevel2
	{ $current=$iv_ruleGSSTestProcOutputLevel2.current; }
	EOF;

// Rule GSSTestProcOutputLevel2
ruleGSSTestProcOutputLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcOutputLevel2'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcOutputLevel2Access().getGSSTestProcOutputLevel2Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcOutputLevel2Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcOutputLevel2Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcOutputLevel2Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel2Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcOutputLevel2Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel2Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel2Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_13());
		}
		(
			otherlv_14='optional'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalINTEGERParserRuleCall_14_2_0());
					}
					lv_optional_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel2Rule());
						}
						set(
							$current,
							"optional",
							lv_optional_16_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='level2'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2Keyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2GSSFormatFormatCrossReference_15_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_16_0());
				}
				lv_level2_filter_22_0=ruleGSSTestProcLevel2Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel2Rule());
					}
					set(
						$current,
						"level2_filter",
						lv_level2_filter_22_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel2Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_23='level1'
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1Keyword_17_0());
			}
			otherlv_24=':='
			{
				newLeafNode(otherlv_24, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1GSSFormatFormatCrossReference_17_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_26=';'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_17_3());
			}
		)?
		(
			otherlv_27='level2_from_level1'
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1Keyword_18_0());
			}
			otherlv_28=':='
			{
				newLeafNode(otherlv_28, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1GSSImportImportCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_30=';'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_18_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_19_0());
				}
				lv_level1_filter_31_0=ruleGSSTestProcLevel1Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel2Rule());
					}
					set(
						$current,
						"level1_filter",
						lv_level1_filter_31_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel1Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_32='level0'
			{
				newLeafNode(otherlv_32, grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0Keyword_20_0());
			}
			otherlv_33=':='
			{
				newLeafNode(otherlv_33, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_20_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0GSSFormatFormatCrossReference_20_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_35=';'
			{
				newLeafNode(otherlv_35, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_20_3());
			}
		)?
		(
			otherlv_36='level1_from_level0'
			{
				newLeafNode(otherlv_36, grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0Keyword_21_0());
			}
			otherlv_37=':='
			{
				newLeafNode(otherlv_37, grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_21_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel2Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0GSSImportImportCrossReference_21_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_39=';'
			{
				newLeafNode(otherlv_39, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_21_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_22_0());
				}
				lv_level0_filter_40_0=ruleGSSTestProcLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel2Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_40_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_41='}'
		{
			newLeafNode(otherlv_41, grammarAccess.getGSSTestProcOutputLevel2Access().getRightCurlyBracketKeyword_23());
		}
		otherlv_42=';'
		{
			newLeafNode(otherlv_42, grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_24());
		}
	)
;

// Entry rule entryRuleGSSTestProcOutputLevel1
entryRuleGSSTestProcOutputLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Rule()); }
	iv_ruleGSSTestProcOutputLevel1=ruleGSSTestProcOutputLevel1
	{ $current=$iv_ruleGSSTestProcOutputLevel1.current; }
	EOF;

// Rule GSSTestProcOutputLevel1
ruleGSSTestProcOutputLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcOutputLevel1'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcOutputLevel1Access().getGSSTestProcOutputLevel1Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcOutputLevel1Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcOutputLevel1Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcOutputLevel1Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel1Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcOutputLevel1Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel1Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel1Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_13());
		}
		(
			otherlv_14='optional'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalINTEGERParserRuleCall_14_2_0());
					}
					lv_optional_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel1Rule());
						}
						set(
							$current,
							"optional",
							lv_optional_16_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='level1'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1Keyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1GSSFormatFormatCrossReference_15_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_16_0());
				}
				lv_level1_filter_22_0=ruleGSSTestProcLevel1Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel1Rule());
					}
					set(
						$current,
						"level1_filter",
						lv_level1_filter_22_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel1Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_23='level0'
			{
				newLeafNode(otherlv_23, grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0Keyword_17_0());
			}
			otherlv_24=':='
			{
				newLeafNode(otherlv_24, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0GSSFormatFormatCrossReference_17_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_26=';'
			{
				newLeafNode(otherlv_26, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_17_3());
			}
		)?
		(
			otherlv_27='level1_from_level0'
			{
				newLeafNode(otherlv_27, grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0Keyword_18_0());
			}
			otherlv_28=':='
			{
				newLeafNode(otherlv_28, grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel1Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0GSSImportImportCrossReference_18_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_30=';'
			{
				newLeafNode(otherlv_30, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_18_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_19_0());
				}
				lv_level0_filter_31_0=ruleGSSTestProcLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel1Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_31_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_32='}'
		{
			newLeafNode(otherlv_32, grammarAccess.getGSSTestProcOutputLevel1Access().getRightCurlyBracketKeyword_20());
		}
		otherlv_33=';'
		{
			newLeafNode(otherlv_33, grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_21());
		}
	)
;

// Entry rule entryRuleGSSTestProcOutputLevel0
entryRuleGSSTestProcOutputLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcOutputLevel0Rule()); }
	iv_ruleGSSTestProcOutputLevel0=ruleGSSTestProcOutputLevel0
	{ $current=$iv_ruleGSSTestProcOutputLevel0.current; }
	EOF;

// Rule GSSTestProcOutputLevel0
ruleGSSTestProcOutputLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcOutputLevel0'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcOutputLevel0Access().getGSSTestProcOutputLevel0Keyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcOutputLevel0Access().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcOutputLevel0Access().getNameKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestProcOutputLevel0Access().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel0Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_5());
		}
		otherlv_6='id'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcOutputLevel0Access().getIdKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel0Access().getIdINTEGERParserRuleCall_8_0());
				}
				lv_id_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel0Rule());
					}
					set(
						$current,
						"id",
						lv_id_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_9());
		}
		otherlv_10='ifRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
				}
				lv_ifRef_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel0Rule());
					}
					set(
						$current,
						"ifRef",
						lv_ifRef_12_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_13());
		}
		(
			otherlv_14='optional'
			{
				newLeafNode(otherlv_14, grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalINTEGERParserRuleCall_14_2_0());
					}
					lv_optional_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel0Rule());
						}
						set(
							$current,
							"optional",
							lv_optional_16_0,
							"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='level0'
			{
				newLeafNode(otherlv_18, grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0Keyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcOutputLevel0Rule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0GSSFormatFormatCrossReference_15_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_16_0());
				}
				lv_level0_filter_22_0=ruleGSSTestProcLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcOutputLevel0Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_22_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getGSSTestProcOutputLevel0Access().getRightCurlyBracketKeyword_17());
		}
		otherlv_24=';'
		{
			newLeafNode(otherlv_24, grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_18());
		}
	)
;

// Entry rule entryRuleGSSTestProcLevel3Filter
entryRuleGSSTestProcLevel3Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcLevel3FilterRule()); }
	iv_ruleGSSTestProcLevel3Filter=ruleGSSTestProcLevel3Filter
	{ $current=$iv_ruleGSSTestProcLevel3Filter.current; }
	EOF;

// Rule GSSTestProcLevel3Filter
ruleGSSTestProcLevel3Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcLevel3Filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcLevel3FilterAccess().getGSSTestProcLevel3FilterKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcLevel3FilterAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='apply_def_filter'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcLevel3FilterAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0());
				}
				lv_apply_def_filter_4_0=ruleGSSTestProcYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcLevel3FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='extra_filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSTestProcLevel3FilterAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcLevel3FilterRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcLevel3FilterAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSTestProcLevel2Filter
entryRuleGSSTestProcLevel2Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcLevel2FilterRule()); }
	iv_ruleGSSTestProcLevel2Filter=ruleGSSTestProcLevel2Filter
	{ $current=$iv_ruleGSSTestProcLevel2Filter.current; }
	EOF;

// Rule GSSTestProcLevel2Filter
ruleGSSTestProcLevel2Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcLevel2Filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcLevel2FilterAccess().getGSSTestProcLevel2FilterKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcLevel2FilterAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='apply_def_filter'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcLevel2FilterAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0());
				}
				lv_apply_def_filter_4_0=ruleGSSTestProcYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcLevel2FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='extra_filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSTestProcLevel2FilterAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcLevel2FilterRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcLevel2FilterAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSTestProcLevel1Filter
entryRuleGSSTestProcLevel1Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcLevel1FilterRule()); }
	iv_ruleGSSTestProcLevel1Filter=ruleGSSTestProcLevel1Filter
	{ $current=$iv_ruleGSSTestProcLevel1Filter.current; }
	EOF;

// Rule GSSTestProcLevel1Filter
ruleGSSTestProcLevel1Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcLevel1Filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcLevel1FilterAccess().getGSSTestProcLevel1FilterKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcLevel1FilterAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='apply_def_filter'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcLevel1FilterAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0());
				}
				lv_apply_def_filter_4_0=ruleGSSTestProcYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcLevel1FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='extra_filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSTestProcLevel1FilterAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcLevel1FilterRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcLevel1FilterAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSTestProcLevel0Filter
entryRuleGSSTestProcLevel0Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcLevel0FilterRule()); }
	iv_ruleGSSTestProcLevel0Filter=ruleGSSTestProcLevel0Filter
	{ $current=$iv_ruleGSSTestProcLevel0Filter.current; }
	EOF;

// Rule GSSTestProcLevel0Filter
ruleGSSTestProcLevel0Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcLevel0Filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcLevel0FilterAccess().getGSSTestProcLevel0FilterKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcLevel0FilterAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='apply_def_filter'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcLevel0FilterAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0());
				}
				lv_apply_def_filter_4_0=ruleGSSTestProcYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcLevel0FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='extra_filter'
			{
				newLeafNode(otherlv_6, grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getGSSTestProcLevel0FilterAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGSSTestProcLevel0FilterRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcLevel0FilterAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleGSSTestProcEnableDisable
entryRuleGSSTestProcEnableDisable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcEnableDisableRule()); }
	iv_ruleGSSTestProcEnableDisable=ruleGSSTestProcEnableDisable
	{ $current=$iv_ruleGSSTestProcEnableDisable.current; }
	EOF;

// Rule GSSTestProcEnableDisable
ruleGSSTestProcEnableDisable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcEnable'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcEnableDisableAccess().getGSSTestProcEnableKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcEnableDisableAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcEnableDisableAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcEnableDisableAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcEnableDisableAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcEnableDisableRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcEnableDisableAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcEnableDisableAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcEnableDisableAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleGSSTestProcNextStep
entryRuleGSSTestProcNextStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcNextStepRule()); }
	iv_ruleGSSTestProcNextStep=ruleGSSTestProcNextStep
	{ $current=$iv_ruleGSSTestProcNextStep.current; }
	EOF;

// Rule GSSTestProcNextStep
ruleGSSTestProcNextStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcNextStep'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcNextStepAccess().getGSSTestProcNextStepKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcNextStepAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcNextStepAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcNextStepAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcNextStepAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcNextStepRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_5());
		}
		otherlv_6='isConcurrent'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcNextStepAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0());
				}
				lv_isConcurrent_8_0=ruleGSSTestProcYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcNextStepRule());
					}
					set(
						$current,
						"isConcurrent",
						lv_isConcurrent_8_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGSSTestProcNextStepAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleGSSTestProcConcurrentStep
entryRuleGSSTestProcConcurrentStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGSSTestProcConcurrentStepRule()); }
	iv_ruleGSSTestProcConcurrentStep=ruleGSSTestProcConcurrentStep
	{ $current=$iv_ruleGSSTestProcConcurrentStep.current; }
	EOF;

// Rule GSSTestProcConcurrentStep
ruleGSSTestProcConcurrentStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GSSTestProcConcurrentStep'
		{
			newLeafNode(otherlv_0, grammarAccess.getGSSTestProcConcurrentStepAccess().getGSSTestProcConcurrentStepKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGSSTestProcConcurrentStepAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getGSSTestProcConcurrentStepAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getGSSTestProcConcurrentStepAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGSSTestProcConcurrentStepRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getGSSTestProcConcurrentStepAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getGSSTestProcConcurrentStepAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getGSSTestProcConcurrentStepAccess().getSemicolonKeyword_7());
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

// Rule GSSTestProcMode
ruleGSSTestProcMode returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='continuous'
			{
				$current = grammarAccess.getGSSTestProcModeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTestProcModeAccess().getContinuousEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='manual'
			{
				$current = grammarAccess.getGSSTestProcModeAccess().getManualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTestProcModeAccess().getManualEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='concurrent'
			{
				$current = grammarAccess.getGSSTestProcModeAccess().getConcurrentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSTestProcModeAccess().getConcurrentEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='action'
			{
				$current = grammarAccess.getGSSTestProcModeAccess().getActionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getGSSTestProcModeAccess().getActionEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule GSSTestProcActionType
ruleGSSTestProcActionType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"instruction"'
			{
				$current = grammarAccess.getGSSTestProcActionTypeAccess().getInstructionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTestProcActionTypeAccess().getInstructionEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"TMTC checking"'
			{
				$current = grammarAccess.getGSSTestProcActionTypeAccess().getTmtc_checkingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTestProcActionTypeAccess().getTmtc_checkingEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"checking"'
			{
				$current = grammarAccess.getGSSTestProcActionTypeAccess().getCheckingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSTestProcActionTypeAccess().getCheckingEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSTestProcTimeUnit
ruleGSSTestProcTimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='miliseconds'
			{
				$current = grammarAccess.getGSSTestProcTimeUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTestProcTimeUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='seconds'
			{
				$current = grammarAccess.getGSSTestProcTimeUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTestProcTimeUnitAccess().getSecondsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GSSTestProcCheckmode
ruleGSSTestProcCheckmode returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='all'
			{
				$current = grammarAccess.getGSSTestProcCheckmodeAccess().getAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTestProcCheckmodeAccess().getAllEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='allunsorted'
			{
				$current = grammarAccess.getGSSTestProcCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTestProcCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='any'
			{
				$current = grammarAccess.getGSSTestProcCheckmodeAccess().getAnyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGSSTestProcCheckmodeAccess().getAnyEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GSSTestProcYesNo
ruleGSSTestProcYesNo returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='yes'
			{
				$current = grammarAccess.getGSSTestProcYesNoAccess().getYesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGSSTestProcYesNoAccess().getYesEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='no'
			{
				$current = grammarAccess.getGSSTestProcYesNoAccess().getNoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGSSTestProcYesNoAccess().getNoEnumLiteralDeclaration_1());
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
