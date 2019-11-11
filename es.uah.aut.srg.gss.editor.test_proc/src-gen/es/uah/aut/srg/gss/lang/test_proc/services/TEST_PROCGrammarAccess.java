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
package es.uah.aut.srg.gss.lang.test_proc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TEST_PROCGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSTestProcTestProcParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSTestProcTestProc
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSTestProcTestProc
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSTestProcTestProc
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSTestProcTestProc
		public RuleCall getElementGSSTestProcTestProcParserRuleCall_1_0() { return cElementGSSTestProcTestProcParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSModelFileImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//GSSModelFileImport common::GSSModelFileImport:
		//	'import' importURI=STRING ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importURI=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class GSSTestProcTestProcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcTestProc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcTestProcKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cUriKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cUriAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cUriQualifiedNameParserRuleCall_3_0_2_0 = (RuleCall)cUriAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cVersionKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_2_0 = (RuleCall)cVersionAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Assignment cStepAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStepGSSTestProcStepParserRuleCall_4_0 = (RuleCall)cStepAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSTestProcTestProc:
		//	'GSSTestProcTestProc'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') step+=GSSTestProcStep+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcTestProc' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		//step+=GSSTestProcStep+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcTestProc'
		public Keyword getGSSTestProcTestProcKeyword_0() { return cGSSTestProcTestProcKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'uri' ':=' uri=QualifiedName ';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'uri'
		public Keyword getUriKeyword_3_0_0() { return cUriKeyword_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_3_0_2() { return cUriAssignment_3_0_2; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_3_0_2_0() { return cUriQualifiedNameParserRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//'version' ':=' version=Version ';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0() { return cVersionKeyword_3_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_2() { return cVersionAssignment_3_1_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_2_0() { return cVersionVersionParserRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//step+=GSSTestProcStep+
		public Assignment getStepAssignment_4() { return cStepAssignment_4; }
		
		//GSSTestProcStep
		public RuleCall getStepGSSTestProcStepParserRuleCall_4_0() { return cStepGSSTestProcStepParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class GSSTestProcStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cPrev_step_idrefKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cPrev_step_idrefAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cPrev_step_idrefGSSTestProcStepCrossReference_10_2_0 = (CrossReference)cPrev_step_idrefAssignment_10_2.eContents().get(0);
		private final RuleCall cPrev_step_idrefGSSTestProcStepVersionedQualifiedReferenceNameParserRuleCall_10_2_0_1 = (RuleCall)cPrev_step_idrefGSSTestProcStepCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cOutput_idref_from_prev_stepKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cOutput_idref_from_prev_stepAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_11_2_0 = (CrossReference)cOutput_idref_from_prev_stepAssignment_11_2.eContents().get(0);
		private final RuleCall cOutput_idref_from_prev_stepGSSTestProcOutputVersionedQualifiedReferenceNameParserRuleCall_11_2_0_1 = (RuleCall)cOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cModeKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cColonEqualsSignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cModeAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cModeGSSTestProcModeEnumRuleCall_14_0 = (RuleCall)cModeAssignment_14.eContents().get(0);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cReplaysKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cReplaysAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final RuleCall cReplaysINTEGERParserRuleCall_16_2_0 = (RuleCall)cReplaysAssignment_16_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Assignment cInputsAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cInputsGSSTestProcInputsParserRuleCall_17_0 = (RuleCall)cInputsAssignment_17.eContents().get(0);
		private final Assignment cOutputsAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cOutputsGSSTestProcOutputsParserRuleCall_18_0 = (RuleCall)cOutputsAssignment_18.eContents().get(0);
		private final Assignment cSpecialPacketsAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cSpecialPacketsGSSTestProcSpecialPacketsParserRuleCall_19_0 = (RuleCall)cSpecialPacketsAssignment_19.eContents().get(0);
		private final Assignment cConcurrent_stepsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cConcurrent_stepsGSSTestProcConcurrentStepsParserRuleCall_20_0 = (RuleCall)cConcurrent_stepsAssignment_20.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		
		//GSSTestProcStep:
		//	'GSSTestProcStep' '{'
		//	'name' ':=' name=ID ';'
		//	'id' ':=' id=INTEGER ';' ('prev_step_idref' ':=' prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName]
		//	';')? ('output_idref_from_prev_step' ':='
		//	output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName] ';')?
		//	'mode' ':=' mode=GSSTestProcMode ';' ('replays' ':=' replays=INTEGER ';')?
		//	inputs=GSSTestProcInputs
		//	outputs=GSSTestProcOutputs?
		//	specialPackets=GSSTestProcSpecialPackets?
		//	concurrent_steps=GSSTestProcConcurrentSteps?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcStep' '{' 'name' ':=' name=ID ';' 'id' ':=' id=INTEGER ';' ('prev_step_idref' ':='
		//prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName] ';')? ('output_idref_from_prev_step' ':='
		//output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName] ';')? 'mode' ':=' mode=GSSTestProcMode
		//';' ('replays' ':=' replays=INTEGER ';')? inputs=GSSTestProcInputs outputs=GSSTestProcOutputs?
		//specialPackets=GSSTestProcSpecialPackets? concurrent_steps=GSSTestProcConcurrentSteps? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcStep'
		public Keyword getGSSTestProcStepKeyword_0() { return cGSSTestProcStepKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('prev_step_idref' ':=' prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName] ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'prev_step_idref'
		public Keyword getPrev_step_idrefKeyword_10_0() { return cPrev_step_idrefKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName]
		public Assignment getPrev_step_idrefAssignment_10_2() { return cPrev_step_idrefAssignment_10_2; }
		
		//[GSSTestProcStep|VersionedQualifiedReferenceName]
		public CrossReference getPrev_step_idrefGSSTestProcStepCrossReference_10_2_0() { return cPrev_step_idrefGSSTestProcStepCrossReference_10_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getPrev_step_idrefGSSTestProcStepVersionedQualifiedReferenceNameParserRuleCall_10_2_0_1() { return cPrev_step_idrefGSSTestProcStepVersionedQualifiedReferenceNameParserRuleCall_10_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('output_idref_from_prev_step' ':=' output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName]
		//';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'output_idref_from_prev_step'
		public Keyword getOutput_idref_from_prev_stepKeyword_11_0() { return cOutput_idref_from_prev_stepKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName]
		public Assignment getOutput_idref_from_prev_stepAssignment_11_2() { return cOutput_idref_from_prev_stepAssignment_11_2; }
		
		//[GSSTestProcOutput|VersionedQualifiedReferenceName]
		public CrossReference getOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_11_2_0() { return cOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_11_2_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getOutput_idref_from_prev_stepGSSTestProcOutputVersionedQualifiedReferenceNameParserRuleCall_11_2_0_1() { return cOutput_idref_from_prev_stepGSSTestProcOutputVersionedQualifiedReferenceNameParserRuleCall_11_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//'mode'
		public Keyword getModeKeyword_12() { return cModeKeyword_12; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_13() { return cColonEqualsSignKeyword_13; }
		
		//mode=GSSTestProcMode
		public Assignment getModeAssignment_14() { return cModeAssignment_14; }
		
		//GSSTestProcMode
		public RuleCall getModeGSSTestProcModeEnumRuleCall_14_0() { return cModeGSSTestProcModeEnumRuleCall_14_0; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
		
		//('replays' ':=' replays=INTEGER ';')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'replays'
		public Keyword getReplaysKeyword_16_0() { return cReplaysKeyword_16_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16_1() { return cColonEqualsSignKeyword_16_1; }
		
		//replays=INTEGER
		public Assignment getReplaysAssignment_16_2() { return cReplaysAssignment_16_2; }
		
		//INTEGER
		public RuleCall getReplaysINTEGERParserRuleCall_16_2_0() { return cReplaysINTEGERParserRuleCall_16_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_16_3() { return cSemicolonKeyword_16_3; }
		
		//inputs=GSSTestProcInputs
		public Assignment getInputsAssignment_17() { return cInputsAssignment_17; }
		
		//GSSTestProcInputs
		public RuleCall getInputsGSSTestProcInputsParserRuleCall_17_0() { return cInputsGSSTestProcInputsParserRuleCall_17_0; }
		
		//outputs=GSSTestProcOutputs?
		public Assignment getOutputsAssignment_18() { return cOutputsAssignment_18; }
		
		//GSSTestProcOutputs
		public RuleCall getOutputsGSSTestProcOutputsParserRuleCall_18_0() { return cOutputsGSSTestProcOutputsParserRuleCall_18_0; }
		
		//specialPackets=GSSTestProcSpecialPackets?
		public Assignment getSpecialPacketsAssignment_19() { return cSpecialPacketsAssignment_19; }
		
		//GSSTestProcSpecialPackets
		public RuleCall getSpecialPacketsGSSTestProcSpecialPacketsParserRuleCall_19_0() { return cSpecialPacketsGSSTestProcSpecialPacketsParserRuleCall_19_0; }
		
		//concurrent_steps=GSSTestProcConcurrentSteps?
		public Assignment getConcurrent_stepsAssignment_20() { return cConcurrent_stepsAssignment_20; }
		
		//GSSTestProcConcurrentSteps
		public RuleCall getConcurrent_stepsGSSTestProcConcurrentStepsParserRuleCall_20_0() { return cConcurrent_stepsGSSTestProcConcurrentStepsParserRuleCall_20_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_21() { return cRightCurlyBracketKeyword_21; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
	}
	public class GSSTestProcInputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInputs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSTestProcInputsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSTestProcInputsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInputGSSTestProcInputParserRuleCall_3_0 = (RuleCall)cInputAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSTestProcInputs:
		//	{GSSTestProcInputs}
		//	'GSSTestProcInputs' '{'
		//	input+=GSSTestProcInput+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSTestProcInputs} 'GSSTestProcInputs' '{' input+=GSSTestProcInput+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSTestProcInputs}
		public Action getGSSTestProcInputsAction_0() { return cGSSTestProcInputsAction_0; }
		
		//'GSSTestProcInputs'
		public Keyword getGSSTestProcInputsKeyword_1() { return cGSSTestProcInputsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//input+=GSSTestProcInput+
		public Assignment getInputAssignment_3() { return cInputAssignment_3; }
		
		//GSSTestProcInput
		public RuleCall getInputGSSTestProcInputParserRuleCall_3_0() { return cInputGSSTestProcInputParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSTestProcOutputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutputs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcOutputsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCheckmodeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCheckmodeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCheckmodeGSSTestProcCheckmodeEnumRuleCall_4_0 = (RuleCall)cCheckmodeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cValid_time_interval_valueKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cValid_time_interval_valueAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cValid_time_interval_valueINTEGERParserRuleCall_8_0 = (RuleCall)cValid_time_interval_valueAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cValid_time_interval_unitKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cValid_time_interval_unitAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cValid_time_interval_unitGSSTestProcUnitEnumRuleCall_12_0 = (RuleCall)cValid_time_interval_unitAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cOutputAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cOutputGSSTestProcOutputParserRuleCall_14_0 = (RuleCall)cOutputAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSTestProcOutputs:
		//	'GSSTestProcOutputs' '{'
		//	'checkmode' ':=' checkmode=GSSTestProcCheckmode ';'
		//	'valid_time_interval_value' ':=' valid_time_interval_value=INTEGER ';'
		//	'valid_time_interval_unit' ':=' valid_time_interval_unit=GSSTestProcUnit ';'
		//	output+=GSSTestProcOutput+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcOutputs' '{' 'checkmode' ':=' checkmode=GSSTestProcCheckmode ';' 'valid_time_interval_value' ':='
		//valid_time_interval_value=INTEGER ';' 'valid_time_interval_unit' ':=' valid_time_interval_unit=GSSTestProcUnit ';'
		//output+=GSSTestProcOutput+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcOutputs'
		public Keyword getGSSTestProcOutputsKeyword_0() { return cGSSTestProcOutputsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'checkmode'
		public Keyword getCheckmodeKeyword_2() { return cCheckmodeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//checkmode=GSSTestProcCheckmode
		public Assignment getCheckmodeAssignment_4() { return cCheckmodeAssignment_4; }
		
		//GSSTestProcCheckmode
		public RuleCall getCheckmodeGSSTestProcCheckmodeEnumRuleCall_4_0() { return cCheckmodeGSSTestProcCheckmodeEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'valid_time_interval_value'
		public Keyword getValid_time_interval_valueKeyword_6() { return cValid_time_interval_valueKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//valid_time_interval_value=INTEGER
		public Assignment getValid_time_interval_valueAssignment_8() { return cValid_time_interval_valueAssignment_8; }
		
		//INTEGER
		public RuleCall getValid_time_interval_valueINTEGERParserRuleCall_8_0() { return cValid_time_interval_valueINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'valid_time_interval_unit'
		public Keyword getValid_time_interval_unitKeyword_10() { return cValid_time_interval_unitKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//valid_time_interval_unit=GSSTestProcUnit
		public Assignment getValid_time_interval_unitAssignment_12() { return cValid_time_interval_unitAssignment_12; }
		
		//GSSTestProcUnit
		public RuleCall getValid_time_interval_unitGSSTestProcUnitEnumRuleCall_12_0() { return cValid_time_interval_unitGSSTestProcUnitEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//output+=GSSTestProcOutput+
		public Assignment getOutputAssignment_14() { return cOutputAssignment_14; }
		
		//GSSTestProcOutput
		public RuleCall getOutputGSSTestProcOutputParserRuleCall_14_0() { return cOutputGSSTestProcOutputParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSTestProcSpecialPacketsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcSpecialPackets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSTestProcSpecialPacketsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSTestProcSpecialPacketsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cEnableAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cEnableGSSTestProcEnableDisableParserRuleCall_3_0_0 = (RuleCall)cEnableAssignment_3_0.eContents().get(0);
		private final Assignment cDisableAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cDisableGSSTestProcEnableDisableParserRuleCall_3_1_0 = (RuleCall)cDisableAssignment_3_1.eContents().get(0);
		private final Assignment cEnable_printAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cEnable_printGSSTestProcEnableDisableParserRuleCall_3_2_0 = (RuleCall)cEnable_printAssignment_3_2.eContents().get(0);
		private final Assignment cDisable_printAssignment_3_3 = (Assignment)cAlternatives_3.eContents().get(3);
		private final RuleCall cDisable_printGSSTestProcEnableDisableParserRuleCall_3_3_0 = (RuleCall)cDisable_printAssignment_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSTestProcSpecialPackets:
		//	{GSSTestProcSpecialPackets}
		//	'GSSTestProcSpecialPackets' '{' (enable+=GSSTestProcEnableDisable | disable+=GSSTestProcEnableDisable |
		//	enable_print+=GSSTestProcEnableDisable | disable_print+=GSSTestProcEnableDisable)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSTestProcSpecialPackets} 'GSSTestProcSpecialPackets' '{' (enable+=GSSTestProcEnableDisable |
		//disable+=GSSTestProcEnableDisable | enable_print+=GSSTestProcEnableDisable | disable_print+=GSSTestProcEnableDisable)+
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSTestProcSpecialPackets}
		public Action getGSSTestProcSpecialPacketsAction_0() { return cGSSTestProcSpecialPacketsAction_0; }
		
		//'GSSTestProcSpecialPackets'
		public Keyword getGSSTestProcSpecialPacketsKeyword_1() { return cGSSTestProcSpecialPacketsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(enable+=GSSTestProcEnableDisable | disable+=GSSTestProcEnableDisable | enable_print+=GSSTestProcEnableDisable |
		//disable_print+=GSSTestProcEnableDisable)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//enable+=GSSTestProcEnableDisable
		public Assignment getEnableAssignment_3_0() { return cEnableAssignment_3_0; }
		
		//GSSTestProcEnableDisable
		public RuleCall getEnableGSSTestProcEnableDisableParserRuleCall_3_0_0() { return cEnableGSSTestProcEnableDisableParserRuleCall_3_0_0; }
		
		//disable+=GSSTestProcEnableDisable
		public Assignment getDisableAssignment_3_1() { return cDisableAssignment_3_1; }
		
		//GSSTestProcEnableDisable
		public RuleCall getDisableGSSTestProcEnableDisableParserRuleCall_3_1_0() { return cDisableGSSTestProcEnableDisableParserRuleCall_3_1_0; }
		
		//enable_print+=GSSTestProcEnableDisable
		public Assignment getEnable_printAssignment_3_2() { return cEnable_printAssignment_3_2; }
		
		//GSSTestProcEnableDisable
		public RuleCall getEnable_printGSSTestProcEnableDisableParserRuleCall_3_2_0() { return cEnable_printGSSTestProcEnableDisableParserRuleCall_3_2_0; }
		
		//disable_print+=GSSTestProcEnableDisable
		public Assignment getDisable_printAssignment_3_3() { return cDisable_printAssignment_3_3; }
		
		//GSSTestProcEnableDisable
		public RuleCall getDisable_printGSSTestProcEnableDisableParserRuleCall_3_3_0() { return cDisable_printGSSTestProcEnableDisableParserRuleCall_3_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSTestProcConcurrentStepsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcConcurrentSteps");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcConcurrentStepsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNextStepKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNextStepAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNextStepGSSTestProcNextStepParserRuleCall_4_0 = (RuleCall)cNextStepAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cConcurrent_stepAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cConcurrent_stepGSSTestProcConcurrentStepParserRuleCall_6_0 = (RuleCall)cConcurrent_stepAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSTestProcConcurrentSteps:
		//	'GSSTestProcConcurrentSteps' '{'
		//	'nextStep' ':=' nextStep=GSSTestProcNextStep ';'
		//	concurrent_step+=GSSTestProcConcurrentStep+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcConcurrentSteps' '{' 'nextStep' ':=' nextStep=GSSTestProcNextStep ';'
		//concurrent_step+=GSSTestProcConcurrentStep+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcConcurrentSteps'
		public Keyword getGSSTestProcConcurrentStepsKeyword_0() { return cGSSTestProcConcurrentStepsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'nextStep'
		public Keyword getNextStepKeyword_2() { return cNextStepKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//nextStep=GSSTestProcNextStep
		public Assignment getNextStepAssignment_4() { return cNextStepAssignment_4; }
		
		//GSSTestProcNextStep
		public RuleCall getNextStepGSSTestProcNextStepParserRuleCall_4_0() { return cNextStepGSSTestProcNextStepParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//concurrent_step+=GSSTestProcConcurrentStep+
		public Assignment getConcurrent_stepAssignment_6() { return cConcurrent_stepAssignment_6; }
		
		//GSSTestProcConcurrentStep
		public RuleCall getConcurrent_stepGSSTestProcConcurrentStepParserRuleCall_6_0() { return cConcurrent_stepGSSTestProcConcurrentStepParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSTestProcInputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInput");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSTestProcInputLevel3ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSTestProcInputLevel2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSTestProcInputLevel1ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSTestProcInputLevel0ParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//GSSTestProcInput:
		//	GSSTestProcInputLevel3 | GSSTestProcInputLevel2 | GSSTestProcInputLevel1 | GSSTestProcInputLevel0;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSTestProcInputLevel3 | GSSTestProcInputLevel2 | GSSTestProcInputLevel1 | GSSTestProcInputLevel0
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSTestProcInputLevel3
		public RuleCall getGSSTestProcInputLevel3ParserRuleCall_0() { return cGSSTestProcInputLevel3ParserRuleCall_0; }
		
		//GSSTestProcInputLevel2
		public RuleCall getGSSTestProcInputLevel2ParserRuleCall_1() { return cGSSTestProcInputLevel2ParserRuleCall_1; }
		
		//GSSTestProcInputLevel1
		public RuleCall getGSSTestProcInputLevel1ParserRuleCall_2() { return cGSSTestProcInputLevel1ParserRuleCall_2; }
		
		//GSSTestProcInputLevel0
		public RuleCall getGSSTestProcInputLevel0ParserRuleCall_3() { return cGSSTestProcInputLevel0ParserRuleCall_3; }
	}
	public class GSSTestProcInputLevel3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInputLevel3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcInputLevel3Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIfRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIfRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIfRefINTEGERParserRuleCall_8_0 = (RuleCall)cIfRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDelay_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDelay_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDelay_valueINTEGERParserRuleCall_12_0 = (RuleCall)cDelay_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cDelay_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cDelay_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDelay_unitGSSTestProcUnitEnumRuleCall_16_0 = (RuleCall)cDelay_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel3Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel3Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel3TMTCIFFormatFormatCrossReference_18_2_0 = (CrossReference)cLevel3Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel3TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel3TMTCIFFormatFormatCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cApp_to_level3Keyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cApp_to_level3Assignment_21 = (Assignment)cGroup.eContents().get(21);
		private final CrossReference cApp_to_level3TMTCIFExportExportCrossReference_21_0 = (CrossReference)cApp_to_level3Assignment_21.eContents().get(0);
		private final RuleCall cApp_to_level3TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1 = (RuleCall)cApp_to_level3TMTCIFExportExportCrossReference_21_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Group cGroup_23 = (Group)cGroup.eContents().get(23);
		private final Keyword cLevel2Keyword_23_0 = (Keyword)cGroup_23.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_23_1 = (Keyword)cGroup_23.eContents().get(1);
		private final Assignment cLevel2Assignment_23_2 = (Assignment)cGroup_23.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_23_2_0 = (CrossReference)cLevel2Assignment_23_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_23_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_23_3 = (Keyword)cGroup_23.eContents().get(3);
		private final Group cGroup_24 = (Group)cGroup.eContents().get(24);
		private final Keyword cLevel3_to_level2Keyword_24_0 = (Keyword)cGroup_24.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_24_1 = (Keyword)cGroup_24.eContents().get(1);
		private final Assignment cLevel3_to_level2Assignment_24_2 = (Assignment)cGroup_24.eContents().get(2);
		private final CrossReference cLevel3_to_level2TMTCIFExportExportCrossReference_24_2_0 = (CrossReference)cLevel3_to_level2Assignment_24_2.eContents().get(0);
		private final RuleCall cLevel3_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1 = (RuleCall)cLevel3_to_level2TMTCIFExportExportCrossReference_24_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_24_3 = (Keyword)cGroup_24.eContents().get(3);
		private final Group cGroup_25 = (Group)cGroup.eContents().get(25);
		private final Keyword cLevel1Keyword_25_0 = (Keyword)cGroup_25.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_25_1 = (Keyword)cGroup_25.eContents().get(1);
		private final Assignment cLevel1Assignment_25_2 = (Assignment)cGroup_25.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_25_2_0 = (CrossReference)cLevel1Assignment_25_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_25_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_25_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_25_3 = (Keyword)cGroup_25.eContents().get(3);
		private final Group cGroup_26 = (Group)cGroup.eContents().get(26);
		private final Keyword cLevel2_to_level1Keyword_26_0 = (Keyword)cGroup_26.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_26_1 = (Keyword)cGroup_26.eContents().get(1);
		private final Assignment cLevel2_to_level1Assignment_26_2 = (Assignment)cGroup_26.eContents().get(2);
		private final CrossReference cLevel2_to_level1TMTCIFExportExportCrossReference_26_2_0 = (CrossReference)cLevel2_to_level1Assignment_26_2.eContents().get(0);
		private final RuleCall cLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1 = (RuleCall)cLevel2_to_level1TMTCIFExportExportCrossReference_26_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26_3 = (Keyword)cGroup_26.eContents().get(3);
		private final Group cGroup_27 = (Group)cGroup.eContents().get(27);
		private final Keyword cLevel0Keyword_27_0 = (Keyword)cGroup_27.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_27_1 = (Keyword)cGroup_27.eContents().get(1);
		private final Assignment cLevel0Assignment_27_2 = (Assignment)cGroup_27.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_27_2_0 = (CrossReference)cLevel0Assignment_27_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_27_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_27_3 = (Keyword)cGroup_27.eContents().get(3);
		private final Group cGroup_28 = (Group)cGroup.eContents().get(28);
		private final Keyword cLevel1_to_level0Keyword_28_0 = (Keyword)cGroup_28.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_28_1 = (Keyword)cGroup_28.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_28_2 = (Assignment)cGroup_28.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0 = (CrossReference)cLevel1_to_level0Assignment_28_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_28_3 = (Keyword)cGroup_28.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Keyword cSemicolonKeyword_30 = (Keyword)cGroup.eContents().get(30);
		
		//GSSTestProcInputLevel3:
		//	'GSSTestProcInputLevel3' '{'
		//	'name' ':=' name=ID ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'delay_value' ':=' delay_value=INTEGER ';'
		//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level3' ':='
		//	level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level3' ':=' app_to_level3=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level2' ':='
		//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level3_to_level2' ':='
		//	level3_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level1' ':='
		//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//	level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcInputLevel3' '{' 'name' ':=' name=ID ';' 'ifRef' ':=' ifRef=INTEGER ';' 'delay_value' ':='
		//delay_value=INTEGER ';' 'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level3' ':='
		//level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level3' ':='
		//app_to_level3=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level2' ':='
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level3_to_level2' ':='
		//level3_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level1' ':='
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcInputLevel3'
		public Keyword getGSSTestProcInputLevel3Keyword_0() { return cGSSTestProcInputLevel3Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_6() { return cIfRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_8() { return cIfRefAssignment_8; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_8_0() { return cIfRefINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'delay_value'
		public Keyword getDelay_valueKeyword_10() { return cDelay_valueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//delay_value=INTEGER
		public Assignment getDelay_valueAssignment_12() { return cDelay_valueAssignment_12; }
		
		//INTEGER
		public RuleCall getDelay_valueINTEGERParserRuleCall_12_0() { return cDelay_valueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'delay_unit'
		public Keyword getDelay_unitKeyword_14() { return cDelay_unitKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//delay_unit=GSSTestProcUnit
		public Assignment getDelay_unitAssignment_16() { return cDelay_unitAssignment_16; }
		
		//GSSTestProcUnit
		public RuleCall getDelay_unitGSSTestProcUnitEnumRuleCall_16_0() { return cDelay_unitGSSTestProcUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('level3' ':=' level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level3'
		public Keyword getLevel3Keyword_18_0() { return cLevel3Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level3=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel3Assignment_18_2() { return cLevel3Assignment_18_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel3TMTCIFFormatFormatCrossReference_18_2_0() { return cLevel3TMTCIFFormatFormatCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel3TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel3TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'app_to_level3'
		public Keyword getApp_to_level3Keyword_19() { return cApp_to_level3Keyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//app_to_level3=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level3Assignment_21() { return cApp_to_level3Assignment_21; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level3TMTCIFExportExportCrossReference_21_0() { return cApp_to_level3TMTCIFExportExportCrossReference_21_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level3TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1() { return cApp_to_level3TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'level2'
		public Keyword getLevel2Keyword_23_0() { return cLevel2Keyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_23_2() { return cLevel2Assignment_23_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_23_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_23_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1() { return cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_23_3() { return cSemicolonKeyword_23_3; }
		
		//('level3_to_level2' ':=' level3_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_24() { return cGroup_24; }
		
		//'level3_to_level2'
		public Keyword getLevel3_to_level2Keyword_24_0() { return cLevel3_to_level2Keyword_24_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24_1() { return cColonEqualsSignKeyword_24_1; }
		
		//level3_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel3_to_level2Assignment_24_2() { return cLevel3_to_level2Assignment_24_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel3_to_level2TMTCIFExportExportCrossReference_24_2_0() { return cLevel3_to_level2TMTCIFExportExportCrossReference_24_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel3_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1() { return cLevel3_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_24_3() { return cSemicolonKeyword_24_3; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_25() { return cGroup_25; }
		
		//'level1'
		public Keyword getLevel1Keyword_25_0() { return cLevel1Keyword_25_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_25_1() { return cColonEqualsSignKeyword_25_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_25_2() { return cLevel1Assignment_25_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_25_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_25_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_25_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_25_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_25_3() { return cSemicolonKeyword_25_3; }
		
		//('level2_to_level1' ':=' level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_26() { return cGroup_26; }
		
		//'level2_to_level1'
		public Keyword getLevel2_to_level1Keyword_26_0() { return cLevel2_to_level1Keyword_26_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_26_1() { return cColonEqualsSignKeyword_26_1; }
		
		//level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel2_to_level1Assignment_26_2() { return cLevel2_to_level1Assignment_26_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel2_to_level1TMTCIFExportExportCrossReference_26_2_0() { return cLevel2_to_level1TMTCIFExportExportCrossReference_26_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1() { return cLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26_3() { return cSemicolonKeyword_26_3; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_27() { return cGroup_27; }
		
		//'level0'
		public Keyword getLevel0Keyword_27_0() { return cLevel0Keyword_27_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_27_1() { return cColonEqualsSignKeyword_27_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_27_2() { return cLevel0Assignment_27_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_27_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_27_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_27_3() { return cSemicolonKeyword_27_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_28() { return cGroup_28; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_28_0() { return cLevel1_to_level0Keyword_28_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_28_1() { return cColonEqualsSignKeyword_28_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_28_2() { return cLevel1_to_level0Assignment_28_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1() { return cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_28_3() { return cSemicolonKeyword_28_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_29() { return cRightCurlyBracketKeyword_29; }
		
		//';'
		public Keyword getSemicolonKeyword_30() { return cSemicolonKeyword_30; }
	}
	public class GSSTestProcInputLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInputLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcInputLevel2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIfRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIfRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIfRefINTEGERParserRuleCall_8_0 = (RuleCall)cIfRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDelay_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDelay_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDelay_valueINTEGERParserRuleCall_12_0 = (RuleCall)cDelay_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cDelay_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cDelay_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDelay_unitGSSTestProcUnitEnumRuleCall_16_0 = (RuleCall)cDelay_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel2Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel2Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_18_2_0 = (CrossReference)cLevel2Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cApp_to_level2Keyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cApp_to_level2Assignment_21 = (Assignment)cGroup.eContents().get(21);
		private final CrossReference cApp_to_level2TMTCIFExportExportCrossReference_21_0 = (CrossReference)cApp_to_level2Assignment_21.eContents().get(0);
		private final RuleCall cApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1 = (RuleCall)cApp_to_level2TMTCIFExportExportCrossReference_21_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Group cGroup_23 = (Group)cGroup.eContents().get(23);
		private final Keyword cLevel1Keyword_23_0 = (Keyword)cGroup_23.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_23_1 = (Keyword)cGroup_23.eContents().get(1);
		private final Assignment cLevel1Assignment_23_2 = (Assignment)cGroup_23.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_23_2_0 = (CrossReference)cLevel1Assignment_23_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_23_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_23_3 = (Keyword)cGroup_23.eContents().get(3);
		private final Group cGroup_24 = (Group)cGroup.eContents().get(24);
		private final Keyword cLevel2_to_level1Keyword_24_0 = (Keyword)cGroup_24.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_24_1 = (Keyword)cGroup_24.eContents().get(1);
		private final Assignment cLevel2_to_level1Assignment_24_2 = (Assignment)cGroup_24.eContents().get(2);
		private final CrossReference cLevel2_to_level1TMTCIFExportExportCrossReference_24_2_0 = (CrossReference)cLevel2_to_level1Assignment_24_2.eContents().get(0);
		private final RuleCall cLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1 = (RuleCall)cLevel2_to_level1TMTCIFExportExportCrossReference_24_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_24_3 = (Keyword)cGroup_24.eContents().get(3);
		private final Group cGroup_25 = (Group)cGroup.eContents().get(25);
		private final Keyword cLevel0Keyword_25_0 = (Keyword)cGroup_25.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_25_1 = (Keyword)cGroup_25.eContents().get(1);
		private final Assignment cLevel0Assignment_25_2 = (Assignment)cGroup_25.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_25_2_0 = (CrossReference)cLevel0Assignment_25_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_25_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_25_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_25_3 = (Keyword)cGroup_25.eContents().get(3);
		private final Group cGroup_26 = (Group)cGroup.eContents().get(26);
		private final Keyword cLevel1_to_level0Keyword_26_0 = (Keyword)cGroup_26.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_26_1 = (Keyword)cGroup_26.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_26_2 = (Assignment)cGroup_26.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_26_2_0 = (CrossReference)cLevel1_to_level0Assignment_26_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_26_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_26_3 = (Keyword)cGroup_26.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Keyword cSemicolonKeyword_28 = (Keyword)cGroup.eContents().get(28);
		
		//GSSTestProcInputLevel2:
		//	'GSSTestProcInputLevel2' '{'
		//	'name' ':=' name=ID ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'delay_value' ':=' delay_value=INTEGER ';'
		//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level2' ':='
		//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level2' ':=' app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//	level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcInputLevel2' '{' 'name' ':=' name=ID ';' 'ifRef' ':=' ifRef=INTEGER ';' 'delay_value' ':='
		//delay_value=INTEGER ';' 'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level2' ':='
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level2' ':='
		//app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level1' ':='
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
		//level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcInputLevel2'
		public Keyword getGSSTestProcInputLevel2Keyword_0() { return cGSSTestProcInputLevel2Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_6() { return cIfRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_8() { return cIfRefAssignment_8; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_8_0() { return cIfRefINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'delay_value'
		public Keyword getDelay_valueKeyword_10() { return cDelay_valueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//delay_value=INTEGER
		public Assignment getDelay_valueAssignment_12() { return cDelay_valueAssignment_12; }
		
		//INTEGER
		public RuleCall getDelay_valueINTEGERParserRuleCall_12_0() { return cDelay_valueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'delay_unit'
		public Keyword getDelay_unitKeyword_14() { return cDelay_unitKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//delay_unit=GSSTestProcUnit
		public Assignment getDelay_unitAssignment_16() { return cDelay_unitAssignment_16; }
		
		//GSSTestProcUnit
		public RuleCall getDelay_unitGSSTestProcUnitEnumRuleCall_16_0() { return cDelay_unitGSSTestProcUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level2'
		public Keyword getLevel2Keyword_18_0() { return cLevel2Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_18_2() { return cLevel2Assignment_18_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_18_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'app_to_level2'
		public Keyword getApp_to_level2Keyword_19() { return cApp_to_level2Keyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level2Assignment_21() { return cApp_to_level2Assignment_21; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level2TMTCIFExportExportCrossReference_21_0() { return cApp_to_level2TMTCIFExportExportCrossReference_21_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1() { return cApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'level1'
		public Keyword getLevel1Keyword_23_0() { return cLevel1Keyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_23_2() { return cLevel1Assignment_23_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_23_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_23_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_23_3() { return cSemicolonKeyword_23_3; }
		
		//('level2_to_level1' ':=' level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_24() { return cGroup_24; }
		
		//'level2_to_level1'
		public Keyword getLevel2_to_level1Keyword_24_0() { return cLevel2_to_level1Keyword_24_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24_1() { return cColonEqualsSignKeyword_24_1; }
		
		//level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel2_to_level1Assignment_24_2() { return cLevel2_to_level1Assignment_24_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel2_to_level1TMTCIFExportExportCrossReference_24_2_0() { return cLevel2_to_level1TMTCIFExportExportCrossReference_24_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1() { return cLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_24_3() { return cSemicolonKeyword_24_3; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_25() { return cGroup_25; }
		
		//'level0'
		public Keyword getLevel0Keyword_25_0() { return cLevel0Keyword_25_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_25_1() { return cColonEqualsSignKeyword_25_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_25_2() { return cLevel0Assignment_25_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_25_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_25_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_25_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_25_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_25_3() { return cSemicolonKeyword_25_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_26() { return cGroup_26; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_26_0() { return cLevel1_to_level0Keyword_26_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_26_1() { return cColonEqualsSignKeyword_26_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_26_2() { return cLevel1_to_level0Assignment_26_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_26_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_26_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1() { return cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_26_3() { return cSemicolonKeyword_26_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_27() { return cRightCurlyBracketKeyword_27; }
		
		//';'
		public Keyword getSemicolonKeyword_28() { return cSemicolonKeyword_28; }
	}
	public class GSSTestProcInputLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInputLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcInputLevel1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIfRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIfRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIfRefINTEGERParserRuleCall_8_0 = (RuleCall)cIfRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDelay_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDelay_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDelay_valueINTEGERParserRuleCall_12_0 = (RuleCall)cDelay_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cDelay_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cDelay_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDelay_unitGSSTestProcUnitEnumRuleCall_16_0 = (RuleCall)cDelay_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel1Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel1Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_18_2_0 = (CrossReference)cLevel1Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cApp_to_level1Keyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cApp_to_level1Assignment_21 = (Assignment)cGroup.eContents().get(21);
		private final CrossReference cApp_to_level1TMTCIFExportExportCrossReference_21_0 = (CrossReference)cApp_to_level1Assignment_21.eContents().get(0);
		private final RuleCall cApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1 = (RuleCall)cApp_to_level1TMTCIFExportExportCrossReference_21_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Group cGroup_23 = (Group)cGroup.eContents().get(23);
		private final Keyword cLevel0Keyword_23_0 = (Keyword)cGroup_23.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_23_1 = (Keyword)cGroup_23.eContents().get(1);
		private final Assignment cLevel0Assignment_23_2 = (Assignment)cGroup_23.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_23_2_0 = (CrossReference)cLevel0Assignment_23_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_23_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_23_3 = (Keyword)cGroup_23.eContents().get(3);
		private final Group cGroup_24 = (Group)cGroup.eContents().get(24);
		private final Keyword cLevel1_to_level0Keyword_24_0 = (Keyword)cGroup_24.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_24_1 = (Keyword)cGroup_24.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_24_2 = (Assignment)cGroup_24.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_24_2_0 = (CrossReference)cLevel1_to_level0Assignment_24_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_24_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_24_3 = (Keyword)cGroup_24.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_25 = (Keyword)cGroup.eContents().get(25);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		
		//GSSTestProcInputLevel1:
		//	'GSSTestProcInputLevel1' '{'
		//	'name' ':=' name=ID ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'delay_value' ':=' delay_value=INTEGER ';'
		//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level1' ':='
		//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level1' ':=' app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcInputLevel1' '{' 'name' ':=' name=ID ';' 'ifRef' ':=' ifRef=INTEGER ';' 'delay_value' ':='
		//delay_value=INTEGER ';' 'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level1' ':='
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level1' ':='
		//app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcInputLevel1'
		public Keyword getGSSTestProcInputLevel1Keyword_0() { return cGSSTestProcInputLevel1Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_6() { return cIfRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_8() { return cIfRefAssignment_8; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_8_0() { return cIfRefINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'delay_value'
		public Keyword getDelay_valueKeyword_10() { return cDelay_valueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//delay_value=INTEGER
		public Assignment getDelay_valueAssignment_12() { return cDelay_valueAssignment_12; }
		
		//INTEGER
		public RuleCall getDelay_valueINTEGERParserRuleCall_12_0() { return cDelay_valueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'delay_unit'
		public Keyword getDelay_unitKeyword_14() { return cDelay_unitKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//delay_unit=GSSTestProcUnit
		public Assignment getDelay_unitAssignment_16() { return cDelay_unitAssignment_16; }
		
		//GSSTestProcUnit
		public RuleCall getDelay_unitGSSTestProcUnitEnumRuleCall_16_0() { return cDelay_unitGSSTestProcUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level1'
		public Keyword getLevel1Keyword_18_0() { return cLevel1Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_18_2() { return cLevel1Assignment_18_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_18_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'app_to_level1'
		public Keyword getApp_to_level1Keyword_19() { return cApp_to_level1Keyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level1Assignment_21() { return cApp_to_level1Assignment_21; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level1TMTCIFExportExportCrossReference_21_0() { return cApp_to_level1TMTCIFExportExportCrossReference_21_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1() { return cApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'level0'
		public Keyword getLevel0Keyword_23_0() { return cLevel0Keyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_23_2() { return cLevel0Assignment_23_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_23_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_23_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_23_3() { return cSemicolonKeyword_23_3; }
		
		//('level1_to_level0' ':=' level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
		public Group getGroup_24() { return cGroup_24; }
		
		//'level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_24_0() { return cLevel1_to_level0Keyword_24_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24_1() { return cColonEqualsSignKeyword_24_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getLevel1_to_level0Assignment_24_2() { return cLevel1_to_level0Assignment_24_2; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_24_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_24_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1() { return cLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_24_3() { return cSemicolonKeyword_24_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_25() { return cRightCurlyBracketKeyword_25; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
	}
	public class GSSTestProcInputLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcInputLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcInputLevel0Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIfRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIfRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIfRefINTEGERParserRuleCall_8_0 = (RuleCall)cIfRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cDelay_valueKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDelay_valueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDelay_valueINTEGERParserRuleCall_12_0 = (RuleCall)cDelay_valueAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cDelay_unitKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cDelay_unitAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDelay_unitGSSTestProcUnitEnumRuleCall_16_0 = (RuleCall)cDelay_unitAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel0Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel0Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_18_2_0 = (CrossReference)cLevel0Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cApp_to_level0Keyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cApp_to_level0Assignment_21 = (Assignment)cGroup.eContents().get(21);
		private final CrossReference cApp_to_level0TMTCIFExportExportCrossReference_21_0 = (CrossReference)cApp_to_level0Assignment_21.eContents().get(0);
		private final RuleCall cApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1 = (RuleCall)cApp_to_level0TMTCIFExportExportCrossReference_21_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cRightCurlyBracketKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cSemicolonKeyword_24 = (Keyword)cGroup.eContents().get(24);
		
		//GSSTestProcInputLevel0:
		//	'GSSTestProcInputLevel0' '{'
		//	'name' ':=' name=ID ';'
		//	'ifRef' ':=' ifRef=INTEGER ';'
		//	'delay_value' ':=' delay_value=INTEGER ';'
		//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	'app_to_level0' ':=' app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcInputLevel0' '{' 'name' ':=' name=ID ';' 'ifRef' ':=' ifRef=INTEGER ';' 'delay_value' ':='
		//delay_value=INTEGER ';' 'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level0' ':='
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? 'app_to_level0' ':='
		//app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcInputLevel0'
		public Keyword getGSSTestProcInputLevel0Keyword_0() { return cGSSTestProcInputLevel0Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_6() { return cIfRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_8() { return cIfRefAssignment_8; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_8_0() { return cIfRefINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'delay_value'
		public Keyword getDelay_valueKeyword_10() { return cDelay_valueKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//delay_value=INTEGER
		public Assignment getDelay_valueAssignment_12() { return cDelay_valueAssignment_12; }
		
		//INTEGER
		public RuleCall getDelay_valueINTEGERParserRuleCall_12_0() { return cDelay_valueINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'delay_unit'
		public Keyword getDelay_unitKeyword_14() { return cDelay_unitKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//delay_unit=GSSTestProcUnit
		public Assignment getDelay_unitAssignment_16() { return cDelay_unitAssignment_16; }
		
		//GSSTestProcUnit
		public RuleCall getDelay_unitGSSTestProcUnitEnumRuleCall_16_0() { return cDelay_unitGSSTestProcUnitEnumRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level0'
		public Keyword getLevel0Keyword_18_0() { return cLevel0Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_18_2() { return cLevel0Assignment_18_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_18_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//'app_to_level0'
		public Keyword getApp_to_level0Keyword_19() { return cApp_to_level0Keyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName]
		public Assignment getApp_to_level0Assignment_21() { return cApp_to_level0Assignment_21; }
		
		//[export::TMTCIFExportExport|VersionedQualifiedName]
		public CrossReference getApp_to_level0TMTCIFExportExportCrossReference_21_0() { return cApp_to_level0TMTCIFExportExportCrossReference_21_0; }
		
		//VersionedQualifiedName
		public RuleCall getApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1() { return cApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_21_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_23() { return cRightCurlyBracketKeyword_23; }
		
		//';'
		public Keyword getSemicolonKeyword_24() { return cSemicolonKeyword_24; }
	}
	public class GSSTestProcOutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutput");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSTestProcOutputLevel3ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSTestProcOutputLevel2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSTestProcOutputLevel1ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSTestProcOutputLevel0ParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//GSSTestProcOutput:
		//	GSSTestProcOutputLevel3 | GSSTestProcOutputLevel2 | GSSTestProcOutputLevel1 | GSSTestProcOutputLevel0;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSTestProcOutputLevel3 | GSSTestProcOutputLevel2 | GSSTestProcOutputLevel1 | GSSTestProcOutputLevel0
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSTestProcOutputLevel3
		public RuleCall getGSSTestProcOutputLevel3ParserRuleCall_0() { return cGSSTestProcOutputLevel3ParserRuleCall_0; }
		
		//GSSTestProcOutputLevel2
		public RuleCall getGSSTestProcOutputLevel2ParserRuleCall_1() { return cGSSTestProcOutputLevel2ParserRuleCall_1; }
		
		//GSSTestProcOutputLevel1
		public RuleCall getGSSTestProcOutputLevel1ParserRuleCall_2() { return cGSSTestProcOutputLevel1ParserRuleCall_2; }
		
		//GSSTestProcOutputLevel0
		public RuleCall getGSSTestProcOutputLevel0ParserRuleCall_3() { return cGSSTestProcOutputLevel0ParserRuleCall_3; }
	}
	public class GSSTestProcOutputLevel3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutputLevel3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcOutputLevel3Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cOptionalKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cOptionalAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cOptionalINTEGERParserRuleCall_14_2_0 = (RuleCall)cOptionalAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel3Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel3Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel3TMTCIFFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel3Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel3TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1 = (RuleCall)cLevel3TMTCIFFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Assignment cLevel3_filterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cLevel3_filterGSSTestProcLevel3FilterParserRuleCall_16_0 = (RuleCall)cLevel3_filterAssignment_16.eContents().get(0);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel2Keyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel2Assignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel2Assignment_17_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel3_from_level2Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel3_from_level2Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel3_from_level2TMTCIFImportImportCrossReference_18_2_0 = (CrossReference)cLevel3_from_level2Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel3_from_level2TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel3_from_level2TMTCIFImportImportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Assignment cLevel2_filterAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cLevel2_filterGSSTestProcLevel2FilterParserRuleCall_19_0 = (RuleCall)cLevel2_filterAssignment_19.eContents().get(0);
		private final Group cGroup_20 = (Group)cGroup.eContents().get(20);
		private final Keyword cLevel1Keyword_20_0 = (Keyword)cGroup_20.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_20_1 = (Keyword)cGroup_20.eContents().get(1);
		private final Assignment cLevel1Assignment_20_2 = (Assignment)cGroup_20.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_20_2_0 = (CrossReference)cLevel1Assignment_20_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_20_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_20_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_20_3 = (Keyword)cGroup_20.eContents().get(3);
		private final Group cGroup_21 = (Group)cGroup.eContents().get(21);
		private final Keyword cLevel2_from_level1Keyword_21_0 = (Keyword)cGroup_21.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_21_1 = (Keyword)cGroup_21.eContents().get(1);
		private final Assignment cLevel2_from_level1Assignment_21_2 = (Assignment)cGroup_21.eContents().get(2);
		private final CrossReference cLevel2_from_level1TMTCIFImportImportCrossReference_21_2_0 = (CrossReference)cLevel2_from_level1Assignment_21_2.eContents().get(0);
		private final RuleCall cLevel2_from_level1TMTCIFImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1 = (RuleCall)cLevel2_from_level1TMTCIFImportImportCrossReference_21_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_21_3 = (Keyword)cGroup_21.eContents().get(3);
		private final Assignment cLevel1_filterAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cLevel1_filterGSSTestProcLevel1FilterParserRuleCall_22_0 = (RuleCall)cLevel1_filterAssignment_22.eContents().get(0);
		private final Group cGroup_23 = (Group)cGroup.eContents().get(23);
		private final Keyword cLevel0Keyword_23_0 = (Keyword)cGroup_23.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_23_1 = (Keyword)cGroup_23.eContents().get(1);
		private final Assignment cLevel0Assignment_23_2 = (Assignment)cGroup_23.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_23_2_0 = (CrossReference)cLevel0Assignment_23_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_23_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_23_3 = (Keyword)cGroup_23.eContents().get(3);
		private final Group cGroup_24 = (Group)cGroup.eContents().get(24);
		private final Keyword cLevel1_from_level0Keyword_24_0 = (Keyword)cGroup_24.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_24_1 = (Keyword)cGroup_24.eContents().get(1);
		private final Assignment cLevel1_from_level0Assignment_24_2 = (Assignment)cGroup_24.eContents().get(2);
		private final CrossReference cLevel1_from_level0TMTCIFImportImportCrossReference_24_2_0 = (CrossReference)cLevel1_from_level0Assignment_24_2.eContents().get(0);
		private final RuleCall cLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_24_2_0_1 = (RuleCall)cLevel1_from_level0TMTCIFImportImportCrossReference_24_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_24_3 = (Keyword)cGroup_24.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_25_0 = (RuleCall)cLevel0_filterAssignment_25.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Keyword cSemicolonKeyword_27 = (Keyword)cGroup.eContents().get(27);
		
		//GSSTestProcOutputLevel3:
		//	'GSSTestProcOutputLevel3' '{'
		//	'name' ':=' name=ID ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level3' ':='
		//	level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	level3_filter=GSSTestProcLevel3Filter ('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	('level3_from_level2' ':=' level3_from_level2=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	level2_filter=GSSTestProcLevel2Filter ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	level0_filter=GSSTestProcLevel0Filter
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcOutputLevel3' '{' 'name' ':=' name=ID ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//('optional' ':=' optional=INTEGER ';')? ('level3' ':=' level3=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? level3_filter=GSSTestProcLevel3Filter ('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? ('level3_from_level2' ':=' level3_from_level2=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//level2_filter=GSSTestProcLevel2Filter ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//level0_filter=GSSTestProcLevel0Filter '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcOutputLevel3'
		public Keyword getGSSTestProcOutputLevel3Keyword_0() { return cGSSTestProcOutputLevel3Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('optional' ':=' optional=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'optional'
		public Keyword getOptionalKeyword_14_0() { return cOptionalKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//optional=INTEGER
		public Assignment getOptionalAssignment_14_2() { return cOptionalAssignment_14_2; }
		
		//INTEGER
		public RuleCall getOptionalINTEGERParserRuleCall_14_2_0() { return cOptionalINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('level3' ':=' level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'level3'
		public Keyword getLevel3Keyword_15_0() { return cLevel3Keyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//level3=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel3Assignment_15_2() { return cLevel3Assignment_15_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel3TMTCIFFormatFormatCrossReference_15_2_0() { return cLevel3TMTCIFFormatFormatCrossReference_15_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel3TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1() { return cLevel3TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//level3_filter=GSSTestProcLevel3Filter
		public Assignment getLevel3_filterAssignment_16() { return cLevel3_filterAssignment_16; }
		
		//GSSTestProcLevel3Filter
		public RuleCall getLevel3_filterGSSTestProcLevel3FilterParserRuleCall_16_0() { return cLevel3_filterGSSTestProcLevel3FilterParserRuleCall_16_0; }
		
		//('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'level2'
		public Keyword getLevel2Keyword_17_0() { return cLevel2Keyword_17_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_17_1() { return cColonEqualsSignKeyword_17_1; }
		
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_17_2() { return cLevel2Assignment_17_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_17_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_17_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1() { return cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17_3() { return cSemicolonKeyword_17_3; }
		
		//('level3_from_level2' ':=' level3_from_level2=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level3_from_level2'
		public Keyword getLevel3_from_level2Keyword_18_0() { return cLevel3_from_level2Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level3_from_level2=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getLevel3_from_level2Assignment_18_2() { return cLevel3_from_level2Assignment_18_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getLevel3_from_level2TMTCIFImportImportCrossReference_18_2_0() { return cLevel3_from_level2TMTCIFImportImportCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel3_from_level2TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel3_from_level2TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//level2_filter=GSSTestProcLevel2Filter
		public Assignment getLevel2_filterAssignment_19() { return cLevel2_filterAssignment_19; }
		
		//GSSTestProcLevel2Filter
		public RuleCall getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_19_0() { return cLevel2_filterGSSTestProcLevel2FilterParserRuleCall_19_0; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_20() { return cGroup_20; }
		
		//'level1'
		public Keyword getLevel1Keyword_20_0() { return cLevel1Keyword_20_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20_1() { return cColonEqualsSignKeyword_20_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_20_2() { return cLevel1Assignment_20_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_20_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_20_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_20_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_20_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_20_3() { return cSemicolonKeyword_20_3; }
		
		//('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_21() { return cGroup_21; }
		
		//'level2_from_level1'
		public Keyword getLevel2_from_level1Keyword_21_0() { return cLevel2_from_level1Keyword_21_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_21_1() { return cColonEqualsSignKeyword_21_1; }
		
		//level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getLevel2_from_level1Assignment_21_2() { return cLevel2_from_level1Assignment_21_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getLevel2_from_level1TMTCIFImportImportCrossReference_21_2_0() { return cLevel2_from_level1TMTCIFImportImportCrossReference_21_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2_from_level1TMTCIFImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1() { return cLevel2_from_level1TMTCIFImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_21_3() { return cSemicolonKeyword_21_3; }
		
		//level1_filter=GSSTestProcLevel1Filter
		public Assignment getLevel1_filterAssignment_22() { return cLevel1_filterAssignment_22; }
		
		//GSSTestProcLevel1Filter
		public RuleCall getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_22_0() { return cLevel1_filterGSSTestProcLevel1FilterParserRuleCall_22_0; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_23() { return cGroup_23; }
		
		//'level0'
		public Keyword getLevel0Keyword_23_0() { return cLevel0Keyword_23_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_23_1() { return cColonEqualsSignKeyword_23_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_23_2() { return cLevel0Assignment_23_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_23_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_23_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_23_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_23_3() { return cSemicolonKeyword_23_3; }
		
		//('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_24() { return cGroup_24; }
		
		//'level1_from_level0'
		public Keyword getLevel1_from_level0Keyword_24_0() { return cLevel1_from_level0Keyword_24_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24_1() { return cColonEqualsSignKeyword_24_1; }
		
		//level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getLevel1_from_level0Assignment_24_2() { return cLevel1_from_level0Assignment_24_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getLevel1_from_level0TMTCIFImportImportCrossReference_24_2_0() { return cLevel1_from_level0TMTCIFImportImportCrossReference_24_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_24_2_0_1() { return cLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_24_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_24_3() { return cSemicolonKeyword_24_3; }
		
		//level0_filter=GSSTestProcLevel0Filter
		public Assignment getLevel0_filterAssignment_25() { return cLevel0_filterAssignment_25; }
		
		//GSSTestProcLevel0Filter
		public RuleCall getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_25_0() { return cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_25_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_26() { return cRightCurlyBracketKeyword_26; }
		
		//';'
		public Keyword getSemicolonKeyword_27() { return cSemicolonKeyword_27; }
	}
	public class GSSTestProcOutputLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutputLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcOutputLevel2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cOptionalKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cOptionalAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cOptionalINTEGERParserRuleCall_14_2_0 = (RuleCall)cOptionalAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel2Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel2Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel2Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Assignment cLevel2_filterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cLevel2_filterGSSTestProcLevel2FilterParserRuleCall_16_0 = (RuleCall)cLevel2_filterAssignment_16.eContents().get(0);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel1Keyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel1Assignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel1Assignment_17_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel2_from_level1Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel2_from_level1Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel2_from_level1TMTCIFImportImportCrossReference_18_2_0 = (CrossReference)cLevel2_from_level1Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel2_from_level1TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel2_from_level1TMTCIFImportImportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Assignment cLevel1_filterAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cLevel1_filterGSSTestProcLevel1FilterParserRuleCall_19_0 = (RuleCall)cLevel1_filterAssignment_19.eContents().get(0);
		private final Group cGroup_20 = (Group)cGroup.eContents().get(20);
		private final Keyword cLevel0Keyword_20_0 = (Keyword)cGroup_20.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_20_1 = (Keyword)cGroup_20.eContents().get(1);
		private final Assignment cLevel0Assignment_20_2 = (Assignment)cGroup_20.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_20_2_0 = (CrossReference)cLevel0Assignment_20_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_20_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_20_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_20_3 = (Keyword)cGroup_20.eContents().get(3);
		private final Group cGroup_21 = (Group)cGroup.eContents().get(21);
		private final Keyword cLevel1_from_level0Keyword_21_0 = (Keyword)cGroup_21.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_21_1 = (Keyword)cGroup_21.eContents().get(1);
		private final Assignment cLevel1_from_level0Assignment_21_2 = (Assignment)cGroup_21.eContents().get(2);
		private final CrossReference cLevel1_from_level0TMTCIFImportImportCrossReference_21_2_0 = (CrossReference)cLevel1_from_level0Assignment_21_2.eContents().get(0);
		private final RuleCall cLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1 = (RuleCall)cLevel1_from_level0TMTCIFImportImportCrossReference_21_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_21_3 = (Keyword)cGroup_21.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_22_0 = (RuleCall)cLevel0_filterAssignment_22.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cSemicolonKeyword_24 = (Keyword)cGroup.eContents().get(24);
		
		//GSSTestProcOutputLevel2:
		//	'GSSTestProcOutputLevel2' '{'
		//	'name' ':=' name=ID ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level2' ':='
		//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	level2_filter=GSSTestProcLevel2Filter ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	level0_filter=GSSTestProcLevel0Filter
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcOutputLevel2' '{' 'name' ':=' name=ID ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//('optional' ':=' optional=INTEGER ';')? ('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? level2_filter=GSSTestProcLevel2Filter ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? ('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//level0_filter=GSSTestProcLevel0Filter '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcOutputLevel2'
		public Keyword getGSSTestProcOutputLevel2Keyword_0() { return cGSSTestProcOutputLevel2Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('optional' ':=' optional=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'optional'
		public Keyword getOptionalKeyword_14_0() { return cOptionalKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//optional=INTEGER
		public Assignment getOptionalAssignment_14_2() { return cOptionalAssignment_14_2; }
		
		//INTEGER
		public RuleCall getOptionalINTEGERParserRuleCall_14_2_0() { return cOptionalINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'level2'
		public Keyword getLevel2Keyword_15_0() { return cLevel2Keyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//level2=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel2Assignment_15_2() { return cLevel2Assignment_15_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_15_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_15_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1() { return cLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//level2_filter=GSSTestProcLevel2Filter
		public Assignment getLevel2_filterAssignment_16() { return cLevel2_filterAssignment_16; }
		
		//GSSTestProcLevel2Filter
		public RuleCall getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_16_0() { return cLevel2_filterGSSTestProcLevel2FilterParserRuleCall_16_0; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'level1'
		public Keyword getLevel1Keyword_17_0() { return cLevel1Keyword_17_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_17_1() { return cColonEqualsSignKeyword_17_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_17_2() { return cLevel1Assignment_17_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_17_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_17_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17_3() { return cSemicolonKeyword_17_3; }
		
		//('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level2_from_level1'
		public Keyword getLevel2_from_level1Keyword_18_0() { return cLevel2_from_level1Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getLevel2_from_level1Assignment_18_2() { return cLevel2_from_level1Assignment_18_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getLevel2_from_level1TMTCIFImportImportCrossReference_18_2_0() { return cLevel2_from_level1TMTCIFImportImportCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel2_from_level1TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel2_from_level1TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//level1_filter=GSSTestProcLevel1Filter
		public Assignment getLevel1_filterAssignment_19() { return cLevel1_filterAssignment_19; }
		
		//GSSTestProcLevel1Filter
		public RuleCall getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_19_0() { return cLevel1_filterGSSTestProcLevel1FilterParserRuleCall_19_0; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_20() { return cGroup_20; }
		
		//'level0'
		public Keyword getLevel0Keyword_20_0() { return cLevel0Keyword_20_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20_1() { return cColonEqualsSignKeyword_20_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_20_2() { return cLevel0Assignment_20_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_20_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_20_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_20_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_20_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_20_3() { return cSemicolonKeyword_20_3; }
		
		//('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_21() { return cGroup_21; }
		
		//'level1_from_level0'
		public Keyword getLevel1_from_level0Keyword_21_0() { return cLevel1_from_level0Keyword_21_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_21_1() { return cColonEqualsSignKeyword_21_1; }
		
		//level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getLevel1_from_level0Assignment_21_2() { return cLevel1_from_level0Assignment_21_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getLevel1_from_level0TMTCIFImportImportCrossReference_21_2_0() { return cLevel1_from_level0TMTCIFImportImportCrossReference_21_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1() { return cLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_21_3() { return cSemicolonKeyword_21_3; }
		
		//level0_filter=GSSTestProcLevel0Filter
		public Assignment getLevel0_filterAssignment_22() { return cLevel0_filterAssignment_22; }
		
		//GSSTestProcLevel0Filter
		public RuleCall getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_22_0() { return cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_22_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_23() { return cRightCurlyBracketKeyword_23; }
		
		//';'
		public Keyword getSemicolonKeyword_24() { return cSemicolonKeyword_24; }
	}
	public class GSSTestProcOutputLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutputLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcOutputLevel1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cOptionalKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cOptionalAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cOptionalINTEGERParserRuleCall_14_2_0 = (RuleCall)cOptionalAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel1Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel1Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel1Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Assignment cLevel1_filterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cLevel1_filterGSSTestProcLevel1FilterParserRuleCall_16_0 = (RuleCall)cLevel1_filterAssignment_16.eContents().get(0);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel0Keyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel0Assignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel0Assignment_17_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel1_from_level0Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel1_from_level0Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0 = (CrossReference)cLevel1_from_level0Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1 = (RuleCall)cLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_19_0 = (RuleCall)cLevel0_filterAssignment_19.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//GSSTestProcOutputLevel1:
		//	'GSSTestProcOutputLevel1' '{'
		//	'name' ':=' name=ID ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level1' ':='
		//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//	level0_filter=GSSTestProcLevel0Filter
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcOutputLevel1' '{' 'name' ':=' name=ID ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//('optional' ':=' optional=INTEGER ';')? ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? ('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		//level0_filter=GSSTestProcLevel0Filter '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcOutputLevel1'
		public Keyword getGSSTestProcOutputLevel1Keyword_0() { return cGSSTestProcOutputLevel1Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('optional' ':=' optional=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'optional'
		public Keyword getOptionalKeyword_14_0() { return cOptionalKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//optional=INTEGER
		public Assignment getOptionalAssignment_14_2() { return cOptionalAssignment_14_2; }
		
		//INTEGER
		public RuleCall getOptionalINTEGERParserRuleCall_14_2_0() { return cOptionalINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'level1'
		public Keyword getLevel1Keyword_15_0() { return cLevel1Keyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//level1=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel1Assignment_15_2() { return cLevel1Assignment_15_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_15_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_15_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1() { return cLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//level1_filter=GSSTestProcLevel1Filter
		public Assignment getLevel1_filterAssignment_16() { return cLevel1_filterAssignment_16; }
		
		//GSSTestProcLevel1Filter
		public RuleCall getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_16_0() { return cLevel1_filterGSSTestProcLevel1FilterParserRuleCall_16_0; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'level0'
		public Keyword getLevel0Keyword_17_0() { return cLevel0Keyword_17_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_17_1() { return cColonEqualsSignKeyword_17_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_17_2() { return cLevel0Assignment_17_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_17_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_17_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_17_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17_3() { return cSemicolonKeyword_17_3; }
		
		//('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'level1_from_level0'
		public Keyword getLevel1_from_level0Keyword_18_0() { return cLevel1_from_level0Keyword_18_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_18_1() { return cColonEqualsSignKeyword_18_1; }
		
		//level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName]
		public Assignment getLevel1_from_level0Assignment_18_2() { return cLevel1_from_level0Assignment_18_2; }
		
		//[import_::TMTCIFImportImport|VersionedQualifiedName]
		public CrossReference getLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0() { return cLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1() { return cLevel1_from_level0TMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_18_3() { return cSemicolonKeyword_18_3; }
		
		//level0_filter=GSSTestProcLevel0Filter
		public Assignment getLevel0_filterAssignment_19() { return cLevel0_filterAssignment_19; }
		
		//GSSTestProcLevel0Filter
		public RuleCall getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_19_0() { return cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_19_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
	}
	public class GSSTestProcOutputLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcOutputLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcOutputLevel0Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIdAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIdINTEGERParserRuleCall_8_0 = (RuleCall)cIdAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cIfRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIfRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIfRefINTEGERParserRuleCall_12_0 = (RuleCall)cIfRefAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cOptionalKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cOptionalAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cOptionalINTEGERParserRuleCall_14_2_0 = (RuleCall)cOptionalAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel0Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel0Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel0Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_16_0 = (RuleCall)cLevel0_filterAssignment_16.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//GSSTestProcOutputLevel0:
		//	'GSSTestProcOutputLevel0' '{'
		//	'name' ':=' name=ID ';'
		//	'id' ':=' id=INTEGER ';'
		//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level0' ':='
		//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		//	level0_filter=GSSTestProcLevel0Filter
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcOutputLevel0' '{' 'name' ':=' name=ID ';' 'id' ':=' id=INTEGER ';' 'ifRef' ':=' ifRef=INTEGER ';'
		//('optional' ':=' optional=INTEGER ';')? ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';')? level0_filter=GSSTestProcLevel0Filter '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcOutputLevel0'
		public Keyword getGSSTestProcOutputLevel0Keyword_0() { return cGSSTestProcOutputLevel0Keyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'name'
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'id'
		public Keyword getIdKeyword_6() { return cIdKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//id=INTEGER
		public Assignment getIdAssignment_8() { return cIdAssignment_8; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_8_0() { return cIdINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'ifRef'
		public Keyword getIfRefKeyword_10() { return cIfRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//ifRef=INTEGER
		public Assignment getIfRefAssignment_12() { return cIfRefAssignment_12; }
		
		//INTEGER
		public RuleCall getIfRefINTEGERParserRuleCall_12_0() { return cIfRefINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('optional' ':=' optional=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'optional'
		public Keyword getOptionalKeyword_14_0() { return cOptionalKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//optional=INTEGER
		public Assignment getOptionalAssignment_14_2() { return cOptionalAssignment_14_2; }
		
		//INTEGER
		public RuleCall getOptionalINTEGERParserRuleCall_14_2_0() { return cOptionalINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'level0'
		public Keyword getLevel0Keyword_15_0() { return cLevel0Keyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//level0=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getLevel0Assignment_15_2() { return cLevel0Assignment_15_2; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_15_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_15_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1() { return cLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_15_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//level0_filter=GSSTestProcLevel0Filter
		public Assignment getLevel0_filterAssignment_16() { return cLevel0_filterAssignment_16; }
		
		//GSSTestProcLevel0Filter
		public RuleCall getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_16_0() { return cLevel0_filterGSSTestProcLevel0FilterParserRuleCall_16_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class GSSTestProcLevel3FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel3Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcLevel3FilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cApply_def_filterKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cApply_def_filterAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0 = (RuleCall)cApply_def_filterAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cExtra_filterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cExtra_filterAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0 = (CrossReference)cExtra_filterAssignment_6_2.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSTestProcLevel3Filter GSSTestProcFilter:
		//	'GSSTestProcLevel3Filter' '{'
		//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcLevel3Filter' '{' 'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcLevel3Filter'
		public Keyword getGSSTestProcLevel3FilterKeyword_0() { return cGSSTestProcLevel3FilterKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'apply_def_filter'
		public Keyword getApply_def_filterKeyword_2() { return cApply_def_filterKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//apply_def_filter=GSSTestProcYesNo
		public Assignment getApply_def_filterAssignment_4() { return cApply_def_filterAssignment_4; }
		
		//GSSTestProcYesNo
		public RuleCall getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0() { return cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('extra_filter' ':=' extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'extra_filter'
		public Keyword getExtra_filterKeyword_6_0() { return cExtra_filterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getExtra_filterAssignment_6_2() { return cExtra_filterAssignment_6_2; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_6_2_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSTestProcLevel2FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel2Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcLevel2FilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cApply_def_filterKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cApply_def_filterAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0 = (RuleCall)cApply_def_filterAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cExtra_filterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cExtra_filterAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0 = (CrossReference)cExtra_filterAssignment_6_2.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSTestProcLevel2Filter GSSTestProcFilter:
		//	'GSSTestProcLevel2Filter' '{'
		//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcLevel2Filter' '{' 'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcLevel2Filter'
		public Keyword getGSSTestProcLevel2FilterKeyword_0() { return cGSSTestProcLevel2FilterKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'apply_def_filter'
		public Keyword getApply_def_filterKeyword_2() { return cApply_def_filterKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//apply_def_filter=GSSTestProcYesNo
		public Assignment getApply_def_filterAssignment_4() { return cApply_def_filterAssignment_4; }
		
		//GSSTestProcYesNo
		public RuleCall getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0() { return cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('extra_filter' ':=' extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'extra_filter'
		public Keyword getExtra_filterKeyword_6_0() { return cExtra_filterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getExtra_filterAssignment_6_2() { return cExtra_filterAssignment_6_2; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_6_2_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSTestProcLevel1FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel1Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcLevel1FilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cApply_def_filterKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cApply_def_filterAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0 = (RuleCall)cApply_def_filterAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cExtra_filterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cExtra_filterAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0 = (CrossReference)cExtra_filterAssignment_6_2.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSTestProcLevel1Filter GSSTestProcFilter:
		//	'GSSTestProcLevel1Filter' '{'
		//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcLevel1Filter' '{' 'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcLevel1Filter'
		public Keyword getGSSTestProcLevel1FilterKeyword_0() { return cGSSTestProcLevel1FilterKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'apply_def_filter'
		public Keyword getApply_def_filterKeyword_2() { return cApply_def_filterKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//apply_def_filter=GSSTestProcYesNo
		public Assignment getApply_def_filterAssignment_4() { return cApply_def_filterAssignment_4; }
		
		//GSSTestProcYesNo
		public RuleCall getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0() { return cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('extra_filter' ':=' extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'extra_filter'
		public Keyword getExtra_filterKeyword_6_0() { return cExtra_filterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getExtra_filterAssignment_6_2() { return cExtra_filterAssignment_6_2; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_6_2_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSTestProcLevel0FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcLevel0Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcLevel0FilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cApply_def_filterKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cApply_def_filterAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0 = (RuleCall)cApply_def_filterAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cExtra_filterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cExtra_filterAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0 = (CrossReference)cExtra_filterAssignment_6_2.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSTestProcLevel0Filter GSSTestProcFilter:
		//	'GSSTestProcLevel0Filter' '{'
		//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcLevel0Filter' '{' 'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcLevel0Filter'
		public Keyword getGSSTestProcLevel0FilterKeyword_0() { return cGSSTestProcLevel0FilterKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'apply_def_filter'
		public Keyword getApply_def_filterKeyword_2() { return cApply_def_filterKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//apply_def_filter=GSSTestProcYesNo
		public Assignment getApply_def_filterAssignment_4() { return cApply_def_filterAssignment_4; }
		
		//GSSTestProcYesNo
		public RuleCall getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0() { return cApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('extra_filter' ':=' extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'extra_filter'
		public Keyword getExtra_filterKeyword_6_0() { return cExtra_filterKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public Assignment getExtra_filterAssignment_6_2() { return cExtra_filterAssignment_6_2; }
		
		//[filter::TMTCIFFilterFilter|VersionedQualifiedName]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_6_2_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_6_2_0; }
		
		//VersionedQualifiedName
		public RuleCall getExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1() { return cExtra_filterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSTestProcEnableDisableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcEnableDisable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcEnableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSTestProcEnableDisable:
		//	'GSSTestProcEnable' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcEnable' '{' 'id' ':=' id=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcEnable'
		public Keyword getGSSTestProcEnableKeyword_0() { return cGSSTestProcEnableKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSTestProcNextStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcNextStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcNextStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cIsConcurrentKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cIsConcurrentAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0 = (RuleCall)cIsConcurrentAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTestProcNextStep:
		//	'GSSTestProcNextStep' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'isConcurrent' ':=' isConcurrent=GSSTestProcYesNo ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcNextStep' '{' 'id' ':=' id=INTEGER ';' 'isConcurrent' ':=' isConcurrent=GSSTestProcYesNo ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcNextStep'
		public Keyword getGSSTestProcNextStepKeyword_0() { return cGSSTestProcNextStepKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'isConcurrent'
		public Keyword getIsConcurrentKeyword_6() { return cIsConcurrentKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//isConcurrent=GSSTestProcYesNo
		public Assignment getIsConcurrentAssignment_8() { return cIsConcurrentAssignment_8; }
		
		//GSSTestProcYesNo
		public RuleCall getIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0() { return cIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTestProcConcurrentStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcConcurrentStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTestProcConcurrentStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSTestProcConcurrentStep:
		//	'GSSTestProcConcurrentStep' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTestProcConcurrentStep' '{' 'id' ':=' id=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTestProcConcurrentStep'
		public Keyword getGSSTestProcConcurrentStepKeyword_0() { return cGSSTestProcConcurrentStepKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }
		
		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }
		
		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}
	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false'
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//REAL:
		//	'-'? (INT '.' ':=' INT) ('e' '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? (INT '.' ':=' INT) ('e' '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//(INT '.' ':=' INT)
		public Group getGroup_1() { return cGroup_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_2() { return cColonEqualsSignKeyword_1_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_3() { return cINTTerminalRuleCall_1_3; }
		
		//('e' '-'? INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'e'
		public Keyword getEKeyword_2_0() { return cEKeyword_2_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}
	
	public class GSSTestProcModeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcMode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cContinuousEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cContinuousContinuousKeyword_0_0 = (Keyword)cContinuousEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cManualEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cManualManualKeyword_1_0 = (Keyword)cManualEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cConcurrentEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cConcurrentConcurrentKeyword_2_0 = (Keyword)cConcurrentEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSTestProcMode:
		//	continuous | manual |
		//	concurrent;
		public EnumRule getRule() { return rule; }
		
		//continuous | manual | concurrent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//continuous
		public EnumLiteralDeclaration getContinuousEnumLiteralDeclaration_0() { return cContinuousEnumLiteralDeclaration_0; }
		
		//'continuous'
		public Keyword getContinuousContinuousKeyword_0_0() { return cContinuousContinuousKeyword_0_0; }
		
		//manual
		public EnumLiteralDeclaration getManualEnumLiteralDeclaration_1() { return cManualEnumLiteralDeclaration_1; }
		
		//'manual'
		public Keyword getManualManualKeyword_1_0() { return cManualManualKeyword_1_0; }
		
		//concurrent
		public EnumLiteralDeclaration getConcurrentEnumLiteralDeclaration_2() { return cConcurrentEnumLiteralDeclaration_2; }
		
		//'concurrent'
		public Keyword getConcurrentConcurrentKeyword_2_0() { return cConcurrentConcurrentKeyword_2_0; }
	}
	public class GSSTestProcUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMilisecondsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMilisecondsMilisecondsKeyword_0_0 = (Keyword)cMilisecondsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSecondsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSecondsSecondsKeyword_1_0 = (Keyword)cSecondsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSTestProcUnit:
		//	miliseconds | seconds;
		public EnumRule getRule() { return rule; }
		
		//miliseconds | seconds
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//miliseconds
		public EnumLiteralDeclaration getMilisecondsEnumLiteralDeclaration_0() { return cMilisecondsEnumLiteralDeclaration_0; }
		
		//'miliseconds'
		public Keyword getMilisecondsMilisecondsKeyword_0_0() { return cMilisecondsMilisecondsKeyword_0_0; }
		
		//seconds
		public EnumLiteralDeclaration getSecondsEnumLiteralDeclaration_1() { return cSecondsEnumLiteralDeclaration_1; }
		
		//'seconds'
		public Keyword getSecondsSecondsKeyword_1_0() { return cSecondsSecondsKeyword_1_0; }
	}
	public class GSSTestProcCheckmodeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcCheckmode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAllEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAllAllKeyword_0_0 = (Keyword)cAllEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAllunsortedEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAllunsortedAllunsortedKeyword_1_0 = (Keyword)cAllunsortedEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAnyEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAnyAnyKeyword_2_0 = (Keyword)cAnyEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSTestProcCheckmode:
		//	all | allunsorted | any;
		public EnumRule getRule() { return rule; }
		
		//all | allunsorted | any
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//all
		public EnumLiteralDeclaration getAllEnumLiteralDeclaration_0() { return cAllEnumLiteralDeclaration_0; }
		
		//'all'
		public Keyword getAllAllKeyword_0_0() { return cAllAllKeyword_0_0; }
		
		//allunsorted
		public EnumLiteralDeclaration getAllunsortedEnumLiteralDeclaration_1() { return cAllunsortedEnumLiteralDeclaration_1; }
		
		//'allunsorted'
		public Keyword getAllunsortedAllunsortedKeyword_1_0() { return cAllunsortedAllunsortedKeyword_1_0; }
		
		//any
		public EnumLiteralDeclaration getAnyEnumLiteralDeclaration_2() { return cAnyEnumLiteralDeclaration_2; }
		
		//'any'
		public Keyword getAnyAnyKeyword_2_0() { return cAnyAnyKeyword_2_0; }
	}
	public class GSSTestProcYesNoElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.GSSTestProcYesNo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cYesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cYesYesKeyword_0_0 = (Keyword)cYesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNoEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNoNoKeyword_1_0 = (Keyword)cNoEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSTestProcYesNo:
		//	yes | no;
		public EnumRule getRule() { return rule; }
		
		//yes | no
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//yes
		public EnumLiteralDeclaration getYesEnumLiteralDeclaration_0() { return cYesEnumLiteralDeclaration_0; }
		
		//'yes'
		public Keyword getYesYesKeyword_0_0() { return cYesYesKeyword_0_0; }
		
		//no
		public EnumLiteralDeclaration getNoEnumLiteralDeclaration_1() { return cNoEnumLiteralDeclaration_1; }
		
		//'no'
		public Keyword getNoNoKeyword_1_0() { return cNoNoKeyword_1_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSTestProcTestProcElements pGSSTestProcTestProc;
	private final GSSTestProcStepElements pGSSTestProcStep;
	private final GSSTestProcModeElements eGSSTestProcMode;
	private final GSSTestProcInputsElements pGSSTestProcInputs;
	private final GSSTestProcOutputsElements pGSSTestProcOutputs;
	private final GSSTestProcSpecialPacketsElements pGSSTestProcSpecialPackets;
	private final GSSTestProcConcurrentStepsElements pGSSTestProcConcurrentSteps;
	private final GSSTestProcInputElements pGSSTestProcInput;
	private final GSSTestProcInputLevel3Elements pGSSTestProcInputLevel3;
	private final GSSTestProcInputLevel2Elements pGSSTestProcInputLevel2;
	private final GSSTestProcInputLevel1Elements pGSSTestProcInputLevel1;
	private final GSSTestProcInputLevel0Elements pGSSTestProcInputLevel0;
	private final GSSTestProcUnitElements eGSSTestProcUnit;
	private final GSSTestProcCheckmodeElements eGSSTestProcCheckmode;
	private final GSSTestProcOutputElements pGSSTestProcOutput;
	private final GSSTestProcOutputLevel3Elements pGSSTestProcOutputLevel3;
	private final GSSTestProcOutputLevel2Elements pGSSTestProcOutputLevel2;
	private final GSSTestProcOutputLevel1Elements pGSSTestProcOutputLevel1;
	private final GSSTestProcOutputLevel0Elements pGSSTestProcOutputLevel0;
	private final GSSTestProcLevel3FilterElements pGSSTestProcLevel3Filter;
	private final GSSTestProcLevel2FilterElements pGSSTestProcLevel2Filter;
	private final GSSTestProcLevel1FilterElements pGSSTestProcLevel1Filter;
	private final GSSTestProcLevel0FilterElements pGSSTestProcLevel0Filter;
	private final GSSTestProcYesNoElements eGSSTestProcYesNo;
	private final GSSTestProcEnableDisableElements pGSSTestProcEnableDisable;
	private final GSSTestProcNextStepElements pGSSTestProcNextStep;
	private final GSSTestProcConcurrentStepElements pGSSTestProcConcurrentStep;
	private final EStringElements pEString;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final EBooleanElements pEBoolean;
	private final REALElements pREAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TEST_PROCGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSTestProcTestProc = new GSSTestProcTestProcElements();
		this.pGSSTestProcStep = new GSSTestProcStepElements();
		this.eGSSTestProcMode = new GSSTestProcModeElements();
		this.pGSSTestProcInputs = new GSSTestProcInputsElements();
		this.pGSSTestProcOutputs = new GSSTestProcOutputsElements();
		this.pGSSTestProcSpecialPackets = new GSSTestProcSpecialPacketsElements();
		this.pGSSTestProcConcurrentSteps = new GSSTestProcConcurrentStepsElements();
		this.pGSSTestProcInput = new GSSTestProcInputElements();
		this.pGSSTestProcInputLevel3 = new GSSTestProcInputLevel3Elements();
		this.pGSSTestProcInputLevel2 = new GSSTestProcInputLevel2Elements();
		this.pGSSTestProcInputLevel1 = new GSSTestProcInputLevel1Elements();
		this.pGSSTestProcInputLevel0 = new GSSTestProcInputLevel0Elements();
		this.eGSSTestProcUnit = new GSSTestProcUnitElements();
		this.eGSSTestProcCheckmode = new GSSTestProcCheckmodeElements();
		this.pGSSTestProcOutput = new GSSTestProcOutputElements();
		this.pGSSTestProcOutputLevel3 = new GSSTestProcOutputLevel3Elements();
		this.pGSSTestProcOutputLevel2 = new GSSTestProcOutputLevel2Elements();
		this.pGSSTestProcOutputLevel1 = new GSSTestProcOutputLevel1Elements();
		this.pGSSTestProcOutputLevel0 = new GSSTestProcOutputLevel0Elements();
		this.pGSSTestProcLevel3Filter = new GSSTestProcLevel3FilterElements();
		this.pGSSTestProcLevel2Filter = new GSSTestProcLevel2FilterElements();
		this.pGSSTestProcLevel1Filter = new GSSTestProcLevel1FilterElements();
		this.pGSSTestProcLevel0Filter = new GSSTestProcLevel0FilterElements();
		this.eGSSTestProcYesNo = new GSSTestProcYesNoElements();
		this.pGSSTestProcEnableDisable = new GSSTestProcEnableDisableElements();
		this.pGSSTestProcNextStep = new GSSTestProcNextStepElements();
		this.pGSSTestProcConcurrentStep = new GSSTestProcConcurrentStepElements();
		this.pEString = new EStringElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.test_proc.TEST_PROC.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.test_proc.TEST_PROC".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GSSModelFile common::GSSModelFile:
	//	imports+=GSSModelFileImport*
	//	element=GSSTestProcTestProc
	public GSSModelFileElements getGSSModelFileAccess() {
		return pGSSModelFile;
	}
	
	public ParserRule getGSSModelFileRule() {
		return getGSSModelFileAccess().getRule();
	}
	
	//GSSModelFileImport common::GSSModelFileImport:
	//	'import' importURI=STRING ';'
	public GSSModelFileImportElements getGSSModelFileImportAccess() {
		return pGSSModelFileImport;
	}
	
	public ParserRule getGSSModelFileImportRule() {
		return getGSSModelFileImportAccess().getRule();
	}
	
	//GSSTestProcTestProc:
	//	'GSSTestProcTestProc'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') step+=GSSTestProcStep+
	//	'}' ';';
	public GSSTestProcTestProcElements getGSSTestProcTestProcAccess() {
		return pGSSTestProcTestProc;
	}
	
	public ParserRule getGSSTestProcTestProcRule() {
		return getGSSTestProcTestProcAccess().getRule();
	}
	
	//GSSTestProcStep:
	//	'GSSTestProcStep' '{'
	//	'name' ':=' name=ID ';'
	//	'id' ':=' id=INTEGER ';' ('prev_step_idref' ':=' prev_step_idref=[GSSTestProcStep|VersionedQualifiedReferenceName]
	//	';')? ('output_idref_from_prev_step' ':='
	//	output_idref_from_prev_step=[GSSTestProcOutput|VersionedQualifiedReferenceName] ';')?
	//	'mode' ':=' mode=GSSTestProcMode ';' ('replays' ':=' replays=INTEGER ';')?
	//	inputs=GSSTestProcInputs
	//	outputs=GSSTestProcOutputs?
	//	specialPackets=GSSTestProcSpecialPackets?
	//	concurrent_steps=GSSTestProcConcurrentSteps?
	//	'}' ';';
	public GSSTestProcStepElements getGSSTestProcStepAccess() {
		return pGSSTestProcStep;
	}
	
	public ParserRule getGSSTestProcStepRule() {
		return getGSSTestProcStepAccess().getRule();
	}
	
	//enum GSSTestProcMode:
	//	continuous | manual |
	//	concurrent;
	public GSSTestProcModeElements getGSSTestProcModeAccess() {
		return eGSSTestProcMode;
	}
	
	public EnumRule getGSSTestProcModeRule() {
		return getGSSTestProcModeAccess().getRule();
	}
	
	//GSSTestProcInputs:
	//	{GSSTestProcInputs}
	//	'GSSTestProcInputs' '{'
	//	input+=GSSTestProcInput+
	//	'}' ';';
	public GSSTestProcInputsElements getGSSTestProcInputsAccess() {
		return pGSSTestProcInputs;
	}
	
	public ParserRule getGSSTestProcInputsRule() {
		return getGSSTestProcInputsAccess().getRule();
	}
	
	//GSSTestProcOutputs:
	//	'GSSTestProcOutputs' '{'
	//	'checkmode' ':=' checkmode=GSSTestProcCheckmode ';'
	//	'valid_time_interval_value' ':=' valid_time_interval_value=INTEGER ';'
	//	'valid_time_interval_unit' ':=' valid_time_interval_unit=GSSTestProcUnit ';'
	//	output+=GSSTestProcOutput+
	//	'}' ';';
	public GSSTestProcOutputsElements getGSSTestProcOutputsAccess() {
		return pGSSTestProcOutputs;
	}
	
	public ParserRule getGSSTestProcOutputsRule() {
		return getGSSTestProcOutputsAccess().getRule();
	}
	
	//GSSTestProcSpecialPackets:
	//	{GSSTestProcSpecialPackets}
	//	'GSSTestProcSpecialPackets' '{' (enable+=GSSTestProcEnableDisable | disable+=GSSTestProcEnableDisable |
	//	enable_print+=GSSTestProcEnableDisable | disable_print+=GSSTestProcEnableDisable)+
	//	'}' ';';
	public GSSTestProcSpecialPacketsElements getGSSTestProcSpecialPacketsAccess() {
		return pGSSTestProcSpecialPackets;
	}
	
	public ParserRule getGSSTestProcSpecialPacketsRule() {
		return getGSSTestProcSpecialPacketsAccess().getRule();
	}
	
	//GSSTestProcConcurrentSteps:
	//	'GSSTestProcConcurrentSteps' '{'
	//	'nextStep' ':=' nextStep=GSSTestProcNextStep ';'
	//	concurrent_step+=GSSTestProcConcurrentStep+
	//	'}' ';';
	public GSSTestProcConcurrentStepsElements getGSSTestProcConcurrentStepsAccess() {
		return pGSSTestProcConcurrentSteps;
	}
	
	public ParserRule getGSSTestProcConcurrentStepsRule() {
		return getGSSTestProcConcurrentStepsAccess().getRule();
	}
	
	//GSSTestProcInput:
	//	GSSTestProcInputLevel3 | GSSTestProcInputLevel2 | GSSTestProcInputLevel1 | GSSTestProcInputLevel0;
	public GSSTestProcInputElements getGSSTestProcInputAccess() {
		return pGSSTestProcInput;
	}
	
	public ParserRule getGSSTestProcInputRule() {
		return getGSSTestProcInputAccess().getRule();
	}
	
	//GSSTestProcInputLevel3:
	//	'GSSTestProcInputLevel3' '{'
	//	'name' ':=' name=ID ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'delay_value' ':=' delay_value=INTEGER ';'
	//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level3' ':='
	//	level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level3' ':=' app_to_level3=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level2' ':='
	//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level3_to_level2' ':='
	//	level3_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level1' ':='
	//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
	//	level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSTestProcInputLevel3Elements getGSSTestProcInputLevel3Access() {
		return pGSSTestProcInputLevel3;
	}
	
	public ParserRule getGSSTestProcInputLevel3Rule() {
		return getGSSTestProcInputLevel3Access().getRule();
	}
	
	//GSSTestProcInputLevel2:
	//	'GSSTestProcInputLevel2' '{'
	//	'name' ':=' name=ID ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'delay_value' ':=' delay_value=INTEGER ';'
	//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level2' ':='
	//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level2' ':=' app_to_level2=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level1' ':='
	//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level2_to_level1' ':='
	//	level2_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';')? ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSTestProcInputLevel2Elements getGSSTestProcInputLevel2Access() {
		return pGSSTestProcInputLevel2;
	}
	
	public ParserRule getGSSTestProcInputLevel2Rule() {
		return getGSSTestProcInputLevel2Access().getRule();
	}
	
	//GSSTestProcInputLevel1:
	//	'GSSTestProcInputLevel1' '{'
	//	'name' ':=' name=ID ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'delay_value' ':=' delay_value=INTEGER ';'
	//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level1' ':='
	//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level1' ':=' app_to_level1=[export::TMTCIFExportExport|VersionedQualifiedName] ';' ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')? ('level1_to_level0' ':='
	//	level1_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';')?
	//	'}' ';';
	public GSSTestProcInputLevel1Elements getGSSTestProcInputLevel1Access() {
		return pGSSTestProcInputLevel1;
	}
	
	public ParserRule getGSSTestProcInputLevel1Rule() {
		return getGSSTestProcInputLevel1Access().getRule();
	}
	
	//GSSTestProcInputLevel0:
	//	'GSSTestProcInputLevel0' '{'
	//	'name' ':=' name=ID ';'
	//	'ifRef' ':=' ifRef=INTEGER ';'
	//	'delay_value' ':=' delay_value=INTEGER ';'
	//	'delay_unit' ':=' delay_unit=GSSTestProcUnit ';' ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	'app_to_level0' ':=' app_to_level0=[export::TMTCIFExportExport|VersionedQualifiedName] ';'
	//	'}' ';';
	public GSSTestProcInputLevel0Elements getGSSTestProcInputLevel0Access() {
		return pGSSTestProcInputLevel0;
	}
	
	public ParserRule getGSSTestProcInputLevel0Rule() {
		return getGSSTestProcInputLevel0Access().getRule();
	}
	
	//enum GSSTestProcUnit:
	//	miliseconds | seconds;
	public GSSTestProcUnitElements getGSSTestProcUnitAccess() {
		return eGSSTestProcUnit;
	}
	
	public EnumRule getGSSTestProcUnitRule() {
		return getGSSTestProcUnitAccess().getRule();
	}
	
	//enum GSSTestProcCheckmode:
	//	all | allunsorted | any;
	public GSSTestProcCheckmodeElements getGSSTestProcCheckmodeAccess() {
		return eGSSTestProcCheckmode;
	}
	
	public EnumRule getGSSTestProcCheckmodeRule() {
		return getGSSTestProcCheckmodeAccess().getRule();
	}
	
	//GSSTestProcOutput:
	//	GSSTestProcOutputLevel3 | GSSTestProcOutputLevel2 | GSSTestProcOutputLevel1 | GSSTestProcOutputLevel0;
	public GSSTestProcOutputElements getGSSTestProcOutputAccess() {
		return pGSSTestProcOutput;
	}
	
	public ParserRule getGSSTestProcOutputRule() {
		return getGSSTestProcOutputAccess().getRule();
	}
	
	//GSSTestProcOutputLevel3:
	//	'GSSTestProcOutputLevel3' '{'
	//	'name' ':=' name=ID ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level3' ':='
	//	level3=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	level3_filter=GSSTestProcLevel3Filter ('level2' ':=' level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	('level3_from_level2' ':=' level3_from_level2=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	level2_filter=GSSTestProcLevel2Filter ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	level0_filter=GSSTestProcLevel0Filter
	//	'}' ';';
	public GSSTestProcOutputLevel3Elements getGSSTestProcOutputLevel3Access() {
		return pGSSTestProcOutputLevel3;
	}
	
	public ParserRule getGSSTestProcOutputLevel3Rule() {
		return getGSSTestProcOutputLevel3Access().getRule();
	}
	
	//GSSTestProcOutputLevel2:
	//	'GSSTestProcOutputLevel2' '{'
	//	'name' ':=' name=ID ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level2' ':='
	//	level2=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	level2_filter=GSSTestProcLevel2Filter ('level1' ':=' level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	('level2_from_level1' ':=' level2_from_level1=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	level0_filter=GSSTestProcLevel0Filter
	//	'}' ';';
	public GSSTestProcOutputLevel2Elements getGSSTestProcOutputLevel2Access() {
		return pGSSTestProcOutputLevel2;
	}
	
	public ParserRule getGSSTestProcOutputLevel2Rule() {
		return getGSSTestProcOutputLevel2Access().getRule();
	}
	
	//GSSTestProcOutputLevel1:
	//	'GSSTestProcOutputLevel1' '{'
	//	'name' ':=' name=ID ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level1' ':='
	//	level1=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	level1_filter=GSSTestProcLevel1Filter ('level0' ':=' level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	('level1_from_level0' ':=' level1_from_level0=[import_::TMTCIFImportImport|VersionedQualifiedName] ';')?
	//	level0_filter=GSSTestProcLevel0Filter
	//	'}' ';';
	public GSSTestProcOutputLevel1Elements getGSSTestProcOutputLevel1Access() {
		return pGSSTestProcOutputLevel1;
	}
	
	public ParserRule getGSSTestProcOutputLevel1Rule() {
		return getGSSTestProcOutputLevel1Access().getRule();
	}
	
	//GSSTestProcOutputLevel0:
	//	'GSSTestProcOutputLevel0' '{'
	//	'name' ':=' name=ID ';'
	//	'id' ':=' id=INTEGER ';'
	//	'ifRef' ':=' ifRef=INTEGER ';' ('optional' ':=' optional=INTEGER ';')? ('level0' ':='
	//	level0=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';')?
	//	level0_filter=GSSTestProcLevel0Filter
	//	'}' ';';
	public GSSTestProcOutputLevel0Elements getGSSTestProcOutputLevel0Access() {
		return pGSSTestProcOutputLevel0;
	}
	
	public ParserRule getGSSTestProcOutputLevel0Rule() {
		return getGSSTestProcOutputLevel0Access().getRule();
	}
	
	//GSSTestProcLevel3Filter GSSTestProcFilter:
	//	'GSSTestProcLevel3Filter' '{'
	//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
	//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSTestProcLevel3FilterElements getGSSTestProcLevel3FilterAccess() {
		return pGSSTestProcLevel3Filter;
	}
	
	public ParserRule getGSSTestProcLevel3FilterRule() {
		return getGSSTestProcLevel3FilterAccess().getRule();
	}
	
	//GSSTestProcLevel2Filter GSSTestProcFilter:
	//	'GSSTestProcLevel2Filter' '{'
	//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
	//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSTestProcLevel2FilterElements getGSSTestProcLevel2FilterAccess() {
		return pGSSTestProcLevel2Filter;
	}
	
	public ParserRule getGSSTestProcLevel2FilterRule() {
		return getGSSTestProcLevel2FilterAccess().getRule();
	}
	
	//GSSTestProcLevel1Filter GSSTestProcFilter:
	//	'GSSTestProcLevel1Filter' '{'
	//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
	//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSTestProcLevel1FilterElements getGSSTestProcLevel1FilterAccess() {
		return pGSSTestProcLevel1Filter;
	}
	
	public ParserRule getGSSTestProcLevel1FilterRule() {
		return getGSSTestProcLevel1FilterAccess().getRule();
	}
	
	//GSSTestProcLevel0Filter GSSTestProcFilter:
	//	'GSSTestProcLevel0Filter' '{'
	//	'apply_def_filter' ':=' apply_def_filter=GSSTestProcYesNo ';' ('extra_filter' ':='
	//	extra_filter=[filter::TMTCIFFilterFilter|VersionedQualifiedName] ';')?
	//	'}' ';'
	public GSSTestProcLevel0FilterElements getGSSTestProcLevel0FilterAccess() {
		return pGSSTestProcLevel0Filter;
	}
	
	public ParserRule getGSSTestProcLevel0FilterRule() {
		return getGSSTestProcLevel0FilterAccess().getRule();
	}
	
	//enum GSSTestProcYesNo:
	//	yes | no;
	public GSSTestProcYesNoElements getGSSTestProcYesNoAccess() {
		return eGSSTestProcYesNo;
	}
	
	public EnumRule getGSSTestProcYesNoRule() {
		return getGSSTestProcYesNoAccess().getRule();
	}
	
	//GSSTestProcEnableDisable:
	//	'GSSTestProcEnable' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'}' ';';
	public GSSTestProcEnableDisableElements getGSSTestProcEnableDisableAccess() {
		return pGSSTestProcEnableDisable;
	}
	
	public ParserRule getGSSTestProcEnableDisableRule() {
		return getGSSTestProcEnableDisableAccess().getRule();
	}
	
	//GSSTestProcNextStep:
	//	'GSSTestProcNextStep' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'isConcurrent' ':=' isConcurrent=GSSTestProcYesNo ';'
	//	'}' ';';
	public GSSTestProcNextStepElements getGSSTestProcNextStepAccess() {
		return pGSSTestProcNextStep;
	}
	
	public ParserRule getGSSTestProcNextStepRule() {
		return getGSSTestProcNextStepAccess().getRule();
	}
	
	//GSSTestProcConcurrentStep:
	//	'GSSTestProcConcurrentStep' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'}' ';';
	public GSSTestProcConcurrentStepElements getGSSTestProcConcurrentStepAccess() {
		return pGSSTestProcConcurrentStep;
	}
	
	public ParserRule getGSSTestProcConcurrentStepRule() {
		return getGSSTestProcConcurrentStepAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}
	
	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//REAL:
	//	'-'? (INT '.' ':=' INT) ('e' '-'? INT)?;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
