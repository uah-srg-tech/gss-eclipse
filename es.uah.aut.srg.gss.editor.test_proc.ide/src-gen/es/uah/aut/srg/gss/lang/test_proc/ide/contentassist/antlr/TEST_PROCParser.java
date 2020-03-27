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
package es.uah.aut.srg.gss.lang.test_proc.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.test_proc.ide.contentassist.antlr.internal.InternalTEST_PROCParser;
import es.uah.aut.srg.gss.lang.test_proc.services.TEST_PROCGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TEST_PROCParser extends AbstractContentAssistParser {

	@Inject
	private TEST_PROCGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTEST_PROCParser createParser() {
		InternalTEST_PROCParser result = new InternalTEST_PROCParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTestProcAbstractInputsAccess().getAlternatives(), "rule__GSSTestProcAbstractInputs__Alternatives");
					put(grammarAccess.getGSSTestProcSpecialPacketsAccess().getAlternatives_3(), "rule__GSSTestProcSpecialPackets__Alternatives_3");
					put(grammarAccess.getGSSTestProcInputAccess().getAlternatives(), "rule__GSSTestProcInput__Alternatives");
					put(grammarAccess.getGSSTestProcOutputAccess().getAlternatives(), "rule__GSSTestProcOutput__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSTestProcModeAccess().getAlternatives(), "rule__GSSTestProcMode__Alternatives");
					put(grammarAccess.getGSSTestProcActionTypeAccess().getAlternatives(), "rule__GSSTestProcActionType__Alternatives");
					put(grammarAccess.getGSSTestProcTimeUnitAccess().getAlternatives(), "rule__GSSTestProcTimeUnit__Alternatives");
					put(grammarAccess.getGSSTestProcCheckmodeAccess().getAlternatives(), "rule__GSSTestProcCheckmode__Alternatives");
					put(grammarAccess.getGSSTestProcYesNoAccess().getAlternatives(), "rule__GSSTestProcYesNo__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSTestProcTestProcAccess().getGroup(), "rule__GSSTestProcTestProc__Group__0");
					put(grammarAccess.getGSSTestProcTestProcAccess().getGroup_3_0(), "rule__GSSTestProcTestProc__Group_3_0__0");
					put(grammarAccess.getGSSTestProcTestProcAccess().getGroup_3_1(), "rule__GSSTestProcTestProc__Group_3_1__0");
					put(grammarAccess.getGSSTestProcStepAccess().getGroup(), "rule__GSSTestProcStep__Group__0");
					put(grammarAccess.getGSSTestProcStepAccess().getGroup_10(), "rule__GSSTestProcStep__Group_10__0");
					put(grammarAccess.getGSSTestProcStepAccess().getGroup_15(), "rule__GSSTestProcStep__Group_15__0");
					put(grammarAccess.getGSSTestProcActionAccess().getGroup(), "rule__GSSTestProcAction__Group__0");
					put(grammarAccess.getGSSTestProcInputsAccess().getGroup(), "rule__GSSTestProcInputs__Group__0");
					put(grammarAccess.getGSSTestProcOutputsAccess().getGroup(), "rule__GSSTestProcOutputs__Group__0");
					put(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGroup(), "rule__GSSTestProcSpecialPackets__Group__0");
					put(grammarAccess.getGSSTestProcConcurrentStepsAccess().getGroup(), "rule__GSSTestProcConcurrentSteps__Group__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup(), "rule__GSSTestProcInputLevel3__Group__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_18(), "rule__GSSTestProcInputLevel3__Group_18__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_23(), "rule__GSSTestProcInputLevel3__Group_23__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_24(), "rule__GSSTestProcInputLevel3__Group_24__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_25(), "rule__GSSTestProcInputLevel3__Group_25__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_26(), "rule__GSSTestProcInputLevel3__Group_26__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_27(), "rule__GSSTestProcInputLevel3__Group_27__0");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_28(), "rule__GSSTestProcInputLevel3__Group_28__0");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getGroup(), "rule__GSSTestProcInputLevel2__Group__0");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_18(), "rule__GSSTestProcInputLevel2__Group_18__0");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_23(), "rule__GSSTestProcInputLevel2__Group_23__0");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_24(), "rule__GSSTestProcInputLevel2__Group_24__0");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_25(), "rule__GSSTestProcInputLevel2__Group_25__0");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_26(), "rule__GSSTestProcInputLevel2__Group_26__0");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getGroup(), "rule__GSSTestProcInputLevel1__Group__0");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_18(), "rule__GSSTestProcInputLevel1__Group_18__0");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_23(), "rule__GSSTestProcInputLevel1__Group_23__0");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_24(), "rule__GSSTestProcInputLevel1__Group_24__0");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getGroup(), "rule__GSSTestProcInputLevel0__Group__0");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getGroup_18(), "rule__GSSTestProcInputLevel0__Group_18__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup(), "rule__GSSTestProcOutputLevel3__Group__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_14(), "rule__GSSTestProcOutputLevel3__Group_14__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_15(), "rule__GSSTestProcOutputLevel3__Group_15__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_17(), "rule__GSSTestProcOutputLevel3__Group_17__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_18(), "rule__GSSTestProcOutputLevel3__Group_18__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_20(), "rule__GSSTestProcOutputLevel3__Group_20__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_21(), "rule__GSSTestProcOutputLevel3__Group_21__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_23(), "rule__GSSTestProcOutputLevel3__Group_23__0");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_24(), "rule__GSSTestProcOutputLevel3__Group_24__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup(), "rule__GSSTestProcOutputLevel2__Group__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_14(), "rule__GSSTestProcOutputLevel2__Group_14__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_15(), "rule__GSSTestProcOutputLevel2__Group_15__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_17(), "rule__GSSTestProcOutputLevel2__Group_17__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_18(), "rule__GSSTestProcOutputLevel2__Group_18__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_20(), "rule__GSSTestProcOutputLevel2__Group_20__0");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_21(), "rule__GSSTestProcOutputLevel2__Group_21__0");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup(), "rule__GSSTestProcOutputLevel1__Group__0");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_14(), "rule__GSSTestProcOutputLevel1__Group_14__0");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_15(), "rule__GSSTestProcOutputLevel1__Group_15__0");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_17(), "rule__GSSTestProcOutputLevel1__Group_17__0");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_18(), "rule__GSSTestProcOutputLevel1__Group_18__0");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup(), "rule__GSSTestProcOutputLevel0__Group__0");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup_14(), "rule__GSSTestProcOutputLevel0__Group_14__0");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup_15(), "rule__GSSTestProcOutputLevel0__Group_15__0");
					put(grammarAccess.getGSSTestProcLevel3FilterAccess().getGroup(), "rule__GSSTestProcLevel3Filter__Group__0");
					put(grammarAccess.getGSSTestProcLevel3FilterAccess().getGroup_6(), "rule__GSSTestProcLevel3Filter__Group_6__0");
					put(grammarAccess.getGSSTestProcLevel2FilterAccess().getGroup(), "rule__GSSTestProcLevel2Filter__Group__0");
					put(grammarAccess.getGSSTestProcLevel2FilterAccess().getGroup_6(), "rule__GSSTestProcLevel2Filter__Group_6__0");
					put(grammarAccess.getGSSTestProcLevel1FilterAccess().getGroup(), "rule__GSSTestProcLevel1Filter__Group__0");
					put(grammarAccess.getGSSTestProcLevel1FilterAccess().getGroup_6(), "rule__GSSTestProcLevel1Filter__Group_6__0");
					put(grammarAccess.getGSSTestProcLevel0FilterAccess().getGroup(), "rule__GSSTestProcLevel0Filter__Group__0");
					put(grammarAccess.getGSSTestProcLevel0FilterAccess().getGroup_6(), "rule__GSSTestProcLevel0Filter__Group_6__0");
					put(grammarAccess.getGSSTestProcEnableDisableAccess().getGroup(), "rule__GSSTestProcEnableDisable__Group__0");
					put(grammarAccess.getGSSTestProcNextStepAccess().getGroup(), "rule__GSSTestProcNextStep__Group__0");
					put(grammarAccess.getGSSTestProcConcurrentStepAccess().getGroup(), "rule__GSSTestProcConcurrentStep__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0(), "rule__GSSModelFile__ImportsAssignment_0");
					put(grammarAccess.getGSSModelFileAccess().getElementAssignment_1(), "rule__GSSModelFile__ElementAssignment_1");
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1(), "rule__GSSModelFileImport__ImportURIAssignment_1");
					put(grammarAccess.getGSSTestProcTestProcAccess().getNameAssignment_1(), "rule__GSSTestProcTestProc__NameAssignment_1");
					put(grammarAccess.getGSSTestProcTestProcAccess().getUriAssignment_3_0_2(), "rule__GSSTestProcTestProc__UriAssignment_3_0_2");
					put(grammarAccess.getGSSTestProcTestProcAccess().getVersionAssignment_3_1_2(), "rule__GSSTestProcTestProc__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSTestProcTestProcAccess().getStepAssignment_4(), "rule__GSSTestProcTestProc__StepAssignment_4");
					put(grammarAccess.getGSSTestProcStepAccess().getNameAssignment_4(), "rule__GSSTestProcStep__NameAssignment_4");
					put(grammarAccess.getGSSTestProcStepAccess().getIdAssignment_8(), "rule__GSSTestProcStep__IdAssignment_8");
					put(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefAssignment_10_2(), "rule__GSSTestProcStep__Prev_step_idrefAssignment_10_2");
					put(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepAssignment_10_6(), "rule__GSSTestProcStep__Output_idref_from_prev_stepAssignment_10_6");
					put(grammarAccess.getGSSTestProcStepAccess().getModeAssignment_13(), "rule__GSSTestProcStep__ModeAssignment_13");
					put(grammarAccess.getGSSTestProcStepAccess().getReplaysAssignment_15_2(), "rule__GSSTestProcStep__ReplaysAssignment_15_2");
					put(grammarAccess.getGSSTestProcStepAccess().getInputsAssignment_16(), "rule__GSSTestProcStep__InputsAssignment_16");
					put(grammarAccess.getGSSTestProcStepAccess().getOutputsAssignment_17(), "rule__GSSTestProcStep__OutputsAssignment_17");
					put(grammarAccess.getGSSTestProcStepAccess().getSpecialPacketsAssignment_18(), "rule__GSSTestProcStep__SpecialPacketsAssignment_18");
					put(grammarAccess.getGSSTestProcStepAccess().getConcurrent_stepsAssignment_19(), "rule__GSSTestProcStep__Concurrent_stepsAssignment_19");
					put(grammarAccess.getGSSTestProcActionAccess().getMessageAssignment_4(), "rule__GSSTestProcAction__MessageAssignment_4");
					put(grammarAccess.getGSSTestProcActionAccess().getActionTypeAssignment_8(), "rule__GSSTestProcAction__ActionTypeAssignment_8");
					put(grammarAccess.getGSSTestProcActionAccess().getDelay_valueAssignment_12(), "rule__GSSTestProcAction__Delay_valueAssignment_12");
					put(grammarAccess.getGSSTestProcActionAccess().getDelay_unitAssignment_16(), "rule__GSSTestProcAction__Delay_unitAssignment_16");
					put(grammarAccess.getGSSTestProcActionAccess().getSpan_valueAssignment_20(), "rule__GSSTestProcAction__Span_valueAssignment_20");
					put(grammarAccess.getGSSTestProcActionAccess().getSpan_unitAssignment_24(), "rule__GSSTestProcAction__Span_unitAssignment_24");
					put(grammarAccess.getGSSTestProcInputsAccess().getInputAssignment_3(), "rule__GSSTestProcInputs__InputAssignment_3");
					put(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeAssignment_4(), "rule__GSSTestProcOutputs__CheckmodeAssignment_4");
					put(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueAssignment_8(), "rule__GSSTestProcOutputs__Valid_time_interval_valueAssignment_8");
					put(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitAssignment_12(), "rule__GSSTestProcOutputs__Valid_time_interval_unitAssignment_12");
					put(grammarAccess.getGSSTestProcOutputsAccess().getOutputAssignment_14(), "rule__GSSTestProcOutputs__OutputAssignment_14");
					put(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnableAssignment_3_0(), "rule__GSSTestProcSpecialPackets__EnableAssignment_3_0");
					put(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisableAssignment_3_1(), "rule__GSSTestProcSpecialPackets__DisableAssignment_3_1");
					put(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnable_printAssignment_3_2(), "rule__GSSTestProcSpecialPackets__Enable_printAssignment_3_2");
					put(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisable_printAssignment_3_3(), "rule__GSSTestProcSpecialPackets__Disable_printAssignment_3_3");
					put(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepAssignment_4(), "rule__GSSTestProcConcurrentSteps__NextStepAssignment_4");
					put(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepAssignment_6(), "rule__GSSTestProcConcurrentSteps__Concurrent_stepAssignment_6");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getNameAssignment_4(), "rule__GSSTestProcInputLevel3__NameAssignment_4");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefAssignment_8(), "rule__GSSTestProcInputLevel3__IfRefAssignment_8");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueAssignment_12(), "rule__GSSTestProcInputLevel3__Delay_valueAssignment_12");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitAssignment_16(), "rule__GSSTestProcInputLevel3__Delay_unitAssignment_16");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3Assignment_18_2(), "rule__GSSTestProcInputLevel3__Level3Assignment_18_2");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3Assignment_21(), "rule__GSSTestProcInputLevel3__App_to_level3Assignment_21");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2Assignment_23_2(), "rule__GSSTestProcInputLevel3__Level2Assignment_23_2");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2Assignment_24_2(), "rule__GSSTestProcInputLevel3__Level3_to_level2Assignment_24_2");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1Assignment_25_2(), "rule__GSSTestProcInputLevel3__Level1Assignment_25_2");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1Assignment_26_2(), "rule__GSSTestProcInputLevel3__Level2_to_level1Assignment_26_2");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0Assignment_27_2(), "rule__GSSTestProcInputLevel3__Level0Assignment_27_2");
					put(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0Assignment_28_2(), "rule__GSSTestProcInputLevel3__Level1_to_level0Assignment_28_2");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getNameAssignment_4(), "rule__GSSTestProcInputLevel2__NameAssignment_4");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefAssignment_8(), "rule__GSSTestProcInputLevel2__IfRefAssignment_8");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueAssignment_12(), "rule__GSSTestProcInputLevel2__Delay_valueAssignment_12");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitAssignment_16(), "rule__GSSTestProcInputLevel2__Delay_unitAssignment_16");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2Assignment_18_2(), "rule__GSSTestProcInputLevel2__Level2Assignment_18_2");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2Assignment_21(), "rule__GSSTestProcInputLevel2__App_to_level2Assignment_21");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1Assignment_23_2(), "rule__GSSTestProcInputLevel2__Level1Assignment_23_2");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1Assignment_24_2(), "rule__GSSTestProcInputLevel2__Level2_to_level1Assignment_24_2");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0Assignment_25_2(), "rule__GSSTestProcInputLevel2__Level0Assignment_25_2");
					put(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0Assignment_26_2(), "rule__GSSTestProcInputLevel2__Level1_to_level0Assignment_26_2");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getNameAssignment_4(), "rule__GSSTestProcInputLevel1__NameAssignment_4");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefAssignment_8(), "rule__GSSTestProcInputLevel1__IfRefAssignment_8");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueAssignment_12(), "rule__GSSTestProcInputLevel1__Delay_valueAssignment_12");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitAssignment_16(), "rule__GSSTestProcInputLevel1__Delay_unitAssignment_16");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1Assignment_18_2(), "rule__GSSTestProcInputLevel1__Level1Assignment_18_2");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1Assignment_21(), "rule__GSSTestProcInputLevel1__App_to_level1Assignment_21");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0Assignment_23_2(), "rule__GSSTestProcInputLevel1__Level0Assignment_23_2");
					put(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0Assignment_24_2(), "rule__GSSTestProcInputLevel1__Level1_to_level0Assignment_24_2");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getNameAssignment_4(), "rule__GSSTestProcInputLevel0__NameAssignment_4");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefAssignment_8(), "rule__GSSTestProcInputLevel0__IfRefAssignment_8");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueAssignment_12(), "rule__GSSTestProcInputLevel0__Delay_valueAssignment_12");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitAssignment_16(), "rule__GSSTestProcInputLevel0__Delay_unitAssignment_16");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0Assignment_18_2(), "rule__GSSTestProcInputLevel0__Level0Assignment_18_2");
					put(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0Assignment_21(), "rule__GSSTestProcInputLevel0__App_to_level0Assignment_21");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getNameAssignment_4(), "rule__GSSTestProcOutputLevel3__NameAssignment_4");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getIdAssignment_8(), "rule__GSSTestProcOutputLevel3__IdAssignment_8");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefAssignment_12(), "rule__GSSTestProcOutputLevel3__IfRefAssignment_12");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalAssignment_14_2(), "rule__GSSTestProcOutputLevel3__OptionalAssignment_14_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3Assignment_15_2(), "rule__GSSTestProcOutputLevel3__Level3Assignment_15_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_filterAssignment_16(), "rule__GSSTestProcOutputLevel3__Level3_filterAssignment_16");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2Assignment_17_2(), "rule__GSSTestProcOutputLevel3__Level2Assignment_17_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2Assignment_18_2(), "rule__GSSTestProcOutputLevel3__Level3_from_level2Assignment_18_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_filterAssignment_19(), "rule__GSSTestProcOutputLevel3__Level2_filterAssignment_19");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1Assignment_20_2(), "rule__GSSTestProcOutputLevel3__Level1Assignment_20_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1Assignment_21_2(), "rule__GSSTestProcOutputLevel3__Level2_from_level1Assignment_21_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_filterAssignment_22(), "rule__GSSTestProcOutputLevel3__Level1_filterAssignment_22");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0Assignment_23_2(), "rule__GSSTestProcOutputLevel3__Level0Assignment_23_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0Assignment_24_2(), "rule__GSSTestProcOutputLevel3__Level1_from_level0Assignment_24_2");
					put(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0_filterAssignment_25(), "rule__GSSTestProcOutputLevel3__Level0_filterAssignment_25");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getNameAssignment_4(), "rule__GSSTestProcOutputLevel2__NameAssignment_4");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getIdAssignment_8(), "rule__GSSTestProcOutputLevel2__IdAssignment_8");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefAssignment_12(), "rule__GSSTestProcOutputLevel2__IfRefAssignment_12");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalAssignment_14_2(), "rule__GSSTestProcOutputLevel2__OptionalAssignment_14_2");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2Assignment_15_2(), "rule__GSSTestProcOutputLevel2__Level2Assignment_15_2");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_filterAssignment_16(), "rule__GSSTestProcOutputLevel2__Level2_filterAssignment_16");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1Assignment_17_2(), "rule__GSSTestProcOutputLevel2__Level1Assignment_17_2");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1Assignment_18_2(), "rule__GSSTestProcOutputLevel2__Level2_from_level1Assignment_18_2");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_filterAssignment_19(), "rule__GSSTestProcOutputLevel2__Level1_filterAssignment_19");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0Assignment_20_2(), "rule__GSSTestProcOutputLevel2__Level0Assignment_20_2");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0Assignment_21_2(), "rule__GSSTestProcOutputLevel2__Level1_from_level0Assignment_21_2");
					put(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0_filterAssignment_22(), "rule__GSSTestProcOutputLevel2__Level0_filterAssignment_22");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getNameAssignment_4(), "rule__GSSTestProcOutputLevel1__NameAssignment_4");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getIdAssignment_8(), "rule__GSSTestProcOutputLevel1__IdAssignment_8");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefAssignment_12(), "rule__GSSTestProcOutputLevel1__IfRefAssignment_12");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalAssignment_14_2(), "rule__GSSTestProcOutputLevel1__OptionalAssignment_14_2");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1Assignment_15_2(), "rule__GSSTestProcOutputLevel1__Level1Assignment_15_2");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_filterAssignment_16(), "rule__GSSTestProcOutputLevel1__Level1_filterAssignment_16");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0Assignment_17_2(), "rule__GSSTestProcOutputLevel1__Level0Assignment_17_2");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0Assignment_18_2(), "rule__GSSTestProcOutputLevel1__Level1_from_level0Assignment_18_2");
					put(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0_filterAssignment_19(), "rule__GSSTestProcOutputLevel1__Level0_filterAssignment_19");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getNameAssignment_4(), "rule__GSSTestProcOutputLevel0__NameAssignment_4");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getIdAssignment_8(), "rule__GSSTestProcOutputLevel0__IdAssignment_8");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefAssignment_12(), "rule__GSSTestProcOutputLevel0__IfRefAssignment_12");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalAssignment_14_2(), "rule__GSSTestProcOutputLevel0__OptionalAssignment_14_2");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0Assignment_15_2(), "rule__GSSTestProcOutputLevel0__Level0Assignment_15_2");
					put(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0_filterAssignment_16(), "rule__GSSTestProcOutputLevel0__Level0_filterAssignment_16");
					put(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterAssignment_4(), "rule__GSSTestProcLevel3Filter__Apply_def_filterAssignment_4");
					put(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterAssignment_6_2(), "rule__GSSTestProcLevel3Filter__Extra_filterAssignment_6_2");
					put(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterAssignment_4(), "rule__GSSTestProcLevel2Filter__Apply_def_filterAssignment_4");
					put(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterAssignment_6_2(), "rule__GSSTestProcLevel2Filter__Extra_filterAssignment_6_2");
					put(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterAssignment_4(), "rule__GSSTestProcLevel1Filter__Apply_def_filterAssignment_4");
					put(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterAssignment_6_2(), "rule__GSSTestProcLevel1Filter__Extra_filterAssignment_6_2");
					put(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterAssignment_4(), "rule__GSSTestProcLevel0Filter__Apply_def_filterAssignment_4");
					put(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterAssignment_6_2(), "rule__GSSTestProcLevel0Filter__Extra_filterAssignment_6_2");
					put(grammarAccess.getGSSTestProcEnableDisableAccess().getIdAssignment_4(), "rule__GSSTestProcEnableDisable__IdAssignment_4");
					put(grammarAccess.getGSSTestProcNextStepAccess().getIdAssignment_4(), "rule__GSSTestProcNextStep__IdAssignment_4");
					put(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentAssignment_8(), "rule__GSSTestProcNextStep__IsConcurrentAssignment_8");
					put(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdAssignment_4(), "rule__GSSTestProcConcurrentStep__IdAssignment_4");
					put(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), "rule__GSSTestProcTestProc__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTEST_PROCParser typedParser = (InternalTEST_PROCParser) parser;
			typedParser.entryRuleGSSModelFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TEST_PROCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TEST_PROCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
