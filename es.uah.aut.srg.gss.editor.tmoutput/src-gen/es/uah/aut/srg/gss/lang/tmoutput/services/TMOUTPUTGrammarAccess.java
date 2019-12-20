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
package es.uah.aut.srg.gss.lang.tmoutput.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TMOUTPUTGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSTMOutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutput");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTMOutputKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cSubtypeKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSubtypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSubtypeUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cSubtypeAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cPi1_valKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cPi1_valAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cPi1_valUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cPi1_valAssignment_7_1.eContents().get(0);
		private final Keyword cLevelsKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cLevelsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cLevelsUINT_STRINGTerminalRuleCall_9_0 = (RuleCall)cLevelsAssignment_9.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cLevel3_formatKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cFileKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cLevel3_formatAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cLevel3_formatGSSFormatFormatCrossReference_11_2_0 = (CrossReference)cLevel3_formatAssignment_11_2.eContents().get(0);
		private final RuleCall cLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cLevel3_formatGSSFormatFormatCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cLevel3_filterKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cFileKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cLevel3_filterAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cLevel3_filterGSSFilterFilterCrossReference_12_2_0 = (CrossReference)cLevel3_filterAssignment_12_2.eContents().get(0);
		private final RuleCall cLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cLevel3_filterGSSFilterFilterCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cFrom_level2_importKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Keyword cFileKeyword_13_1 = (Keyword)cGroup_13.eContents().get(1);
		private final Assignment cFrom_level2_importAssignment_13_2 = (Assignment)cGroup_13.eContents().get(2);
		private final CrossReference cFrom_level2_importGSSImportImportCrossReference_13_2_0 = (CrossReference)cFrom_level2_importAssignment_13_2.eContents().get(0);
		private final RuleCall cFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1 = (RuleCall)cFrom_level2_importGSSImportImportCrossReference_13_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_13_3 = (Keyword)cGroup_13.eContents().get(3);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cLevel2_formatKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cFileKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cLevel2_formatAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cLevel2_formatGSSFormatFormatCrossReference_14_2_0 = (CrossReference)cLevel2_formatAssignment_14_2.eContents().get(0);
		private final RuleCall cLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1 = (RuleCall)cLevel2_formatGSSFormatFormatCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel2_filterKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cFileKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel2_filterAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel2_filterGSSFilterFilterCrossReference_15_2_0 = (CrossReference)cLevel2_filterAssignment_15_2.eContents().get(0);
		private final RuleCall cLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel2_filterGSSFilterFilterCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cFrom_level1_importKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cFileKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cFrom_level1_importAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final CrossReference cFrom_level1_importGSSImportImportCrossReference_16_2_0 = (CrossReference)cFrom_level1_importAssignment_16_2.eContents().get(0);
		private final RuleCall cFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1 = (RuleCall)cFrom_level1_importGSSImportImportCrossReference_16_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel1_formatKeyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cFileKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel1_formatAssignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel1_formatGSSFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel1_formatAssignment_17_2.eContents().get(0);
		private final RuleCall cLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1 = (RuleCall)cLevel1_formatGSSFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel1_filterKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cFileKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel1_filterAssignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel1_filterGSSFilterFilterCrossReference_18_2_0 = (CrossReference)cLevel1_filterAssignment_18_2.eContents().get(0);
		private final RuleCall cLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1 = (RuleCall)cLevel1_filterGSSFilterFilterCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Group cGroup_19 = (Group)cGroup.eContents().get(19);
		private final Keyword cFrom_level0_importKeyword_19_0 = (Keyword)cGroup_19.eContents().get(0);
		private final Keyword cFileKeyword_19_1 = (Keyword)cGroup_19.eContents().get(1);
		private final Assignment cFrom_level0_importAssignment_19_2 = (Assignment)cGroup_19.eContents().get(2);
		private final CrossReference cFrom_level0_importGSSImportImportCrossReference_19_2_0 = (CrossReference)cFrom_level0_importAssignment_19_2.eContents().get(0);
		private final RuleCall cFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1 = (RuleCall)cFrom_level0_importGSSImportImportCrossReference_19_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_19_3 = (Keyword)cGroup_19.eContents().get(3);
		private final Group cGroup_20 = (Group)cGroup.eContents().get(20);
		private final Keyword cLevel0_formatKeyword_20_0 = (Keyword)cGroup_20.eContents().get(0);
		private final Keyword cFileKeyword_20_1 = (Keyword)cGroup_20.eContents().get(1);
		private final Assignment cLevel0_formatAssignment_20_2 = (Assignment)cGroup_20.eContents().get(2);
		private final CrossReference cLevel0_formatGSSFormatFormatCrossReference_20_2_0 = (CrossReference)cLevel0_formatAssignment_20_2.eContents().get(0);
		private final RuleCall cLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1 = (RuleCall)cLevel0_formatGSSFormatFormatCrossReference_20_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_20_3 = (Keyword)cGroup_20.eContents().get(3);
		private final Group cGroup_21 = (Group)cGroup.eContents().get(21);
		private final Keyword cLevel0_filterKeyword_21_0 = (Keyword)cGroup_21.eContents().get(0);
		private final Keyword cFileKeyword_21_1 = (Keyword)cGroup_21.eContents().get(1);
		private final Assignment cLevel0_filterAssignment_21_2 = (Assignment)cGroup_21.eContents().get(2);
		private final CrossReference cLevel0_filterGSSFilterFilterCrossReference_21_2_0 = (CrossReference)cLevel0_filterAssignment_21_2.eContents().get(0);
		private final RuleCall cLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1 = (RuleCall)cLevel0_filterGSSFilterFilterCrossReference_21_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_21_3 = (Keyword)cGroup_21.eContents().get(3);
		private final Group cGroup_22 = (Group)cGroup.eContents().get(22);
		private final Keyword cFieldsKeyword_22_0 = (Keyword)cGroup_22.eContents().get(0);
		private final Assignment cGssFieldsAssignment_22_1 = (Assignment)cGroup_22.eContents().get(1);
		private final RuleCall cGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0 = (RuleCall)cGssFieldsAssignment_22_1.eContents().get(0);
		private final Keyword cFieldsKeyword_22_2 = (Keyword)cGroup_22.eContents().get(2);
		private final Keyword cGSSTMOutputKeyword_23 = (Keyword)cGroup.eContents().get(23);
		
		//GSSTMOutput:
		//	'<GSSTMOutput'
		//	'name=' name=STRING
		//	'type=' type=UINT_STRING
		//	'subtype=' subtype=UINT_STRING ('pi1_val=' pi1_val=UINT_STRING)?
		//	'levels=' levels=UINT_STRING
		//	'>' ('<level3_format' 'file=' level3_format=[format::GSSFormatFormat|STRING] '/>')? ('<level3_filter' 'file='
		//	level3_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level2_import' 'file='
		//	from_level2_import=[import_::GSSImportImport|STRING] '/>')? ('<level2_format' 'file='
		//	level2_format=[format::GSSFormatFormat|STRING] '/>')? ('<level2_filter' 'file='
		//	level2_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level1_import' 'file='
		//	from_level1_import=[import_::GSSImportImport|STRING] '/>')? ('<level1_format' 'file='
		//	level1_format=[format::GSSFormatFormat|STRING] '/>')? ('<level1_filter' 'file='
		//	level1_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level0_import' 'file='
		//	from_level0_import=[import_::GSSImportImport|STRING] '/>')? ('<level0_format' 'file='
		//	level0_format=[format::GSSFormatFormat|STRING] '/>')? ('<level0_filter' 'file='
		//	level0_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<fields>' gssFields+=GSSTMOutputField+ '</fields>')?
		//	'</GSSTMOutput>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<GSSTMOutput' 'name=' name=STRING 'type=' type=UINT_STRING 'subtype=' subtype=UINT_STRING ('pi1_val='
		//pi1_val=UINT_STRING)? 'levels=' levels=UINT_STRING '>' ('<level3_format' 'file='
		//level3_format=[format::GSSFormatFormat|STRING] '/>')? ('<level3_filter' 'file='
		//level3_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level2_import' 'file='
		//from_level2_import=[import_::GSSImportImport|STRING] '/>')? ('<level2_format' 'file='
		//level2_format=[format::GSSFormatFormat|STRING] '/>')? ('<level2_filter' 'file='
		//level2_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level1_import' 'file='
		//from_level1_import=[import_::GSSImportImport|STRING] '/>')? ('<level1_format' 'file='
		//level1_format=[format::GSSFormatFormat|STRING] '/>')? ('<level1_filter' 'file='
		//level1_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level0_import' 'file='
		//from_level0_import=[import_::GSSImportImport|STRING] '/>')? ('<level0_format' 'file='
		//level0_format=[format::GSSFormatFormat|STRING] '/>')? ('<level0_filter' 'file='
		//level0_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<fields>' gssFields+=GSSTMOutputField+ '</fields>')?
		//'</GSSTMOutput>'
		public Group getGroup() { return cGroup; }
		
		//'<GSSTMOutput'
		public Keyword getGSSTMOutputKeyword_0() { return cGSSTMOutputKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'type='
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//type=UINT_STRING
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//UINT_STRING
		public RuleCall getTypeUINT_STRINGTerminalRuleCall_4_0() { return cTypeUINT_STRINGTerminalRuleCall_4_0; }
		
		//'subtype='
		public Keyword getSubtypeKeyword_5() { return cSubtypeKeyword_5; }
		
		//subtype=UINT_STRING
		public Assignment getSubtypeAssignment_6() { return cSubtypeAssignment_6; }
		
		//UINT_STRING
		public RuleCall getSubtypeUINT_STRINGTerminalRuleCall_6_0() { return cSubtypeUINT_STRINGTerminalRuleCall_6_0; }
		
		//('pi1_val=' pi1_val=UINT_STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'pi1_val='
		public Keyword getPi1_valKeyword_7_0() { return cPi1_valKeyword_7_0; }
		
		//pi1_val=UINT_STRING
		public Assignment getPi1_valAssignment_7_1() { return cPi1_valAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getPi1_valUINT_STRINGTerminalRuleCall_7_1_0() { return cPi1_valUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//'levels='
		public Keyword getLevelsKeyword_8() { return cLevelsKeyword_8; }
		
		//levels=UINT_STRING
		public Assignment getLevelsAssignment_9() { return cLevelsAssignment_9; }
		
		//UINT_STRING
		public RuleCall getLevelsUINT_STRINGTerminalRuleCall_9_0() { return cLevelsUINT_STRINGTerminalRuleCall_9_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_10() { return cGreaterThanSignKeyword_10; }
		
		//('<level3_format' 'file=' level3_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'<level3_format'
		public Keyword getLevel3_formatKeyword_11_0() { return cLevel3_formatKeyword_11_0; }
		
		//'file='
		public Keyword getFileKeyword_11_1() { return cFileKeyword_11_1; }
		
		//level3_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel3_formatAssignment_11_2() { return cLevel3_formatAssignment_11_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel3_formatGSSFormatFormatCrossReference_11_2_0() { return cLevel3_formatGSSFormatFormatCrossReference_11_2_0; }
		
		//STRING
		public RuleCall getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1() { return cLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_11_3() { return cSolidusGreaterThanSignKeyword_11_3; }
		
		//('<level3_filter' 'file=' level3_filter=[filter::GSSFilterFilter|STRING] '/>')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'<level3_filter'
		public Keyword getLevel3_filterKeyword_12_0() { return cLevel3_filterKeyword_12_0; }
		
		//'file='
		public Keyword getFileKeyword_12_1() { return cFileKeyword_12_1; }
		
		//level3_filter=[filter::GSSFilterFilter|STRING]
		public Assignment getLevel3_filterAssignment_12_2() { return cLevel3_filterAssignment_12_2; }
		
		//[filter::GSSFilterFilter|STRING]
		public CrossReference getLevel3_filterGSSFilterFilterCrossReference_12_2_0() { return cLevel3_filterGSSFilterFilterCrossReference_12_2_0; }
		
		//STRING
		public RuleCall getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1() { return cLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12_3() { return cSolidusGreaterThanSignKeyword_12_3; }
		
		//('<from_level2_import' 'file=' from_level2_import=[import_::GSSImportImport|STRING] '/>')?
		public Group getGroup_13() { return cGroup_13; }
		
		//'<from_level2_import'
		public Keyword getFrom_level2_importKeyword_13_0() { return cFrom_level2_importKeyword_13_0; }
		
		//'file='
		public Keyword getFileKeyword_13_1() { return cFileKeyword_13_1; }
		
		//from_level2_import=[import_::GSSImportImport|STRING]
		public Assignment getFrom_level2_importAssignment_13_2() { return cFrom_level2_importAssignment_13_2; }
		
		//[import_::GSSImportImport|STRING]
		public CrossReference getFrom_level2_importGSSImportImportCrossReference_13_2_0() { return cFrom_level2_importGSSImportImportCrossReference_13_2_0; }
		
		//STRING
		public RuleCall getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1() { return cFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_13_3() { return cSolidusGreaterThanSignKeyword_13_3; }
		
		//('<level2_format' 'file=' level2_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'<level2_format'
		public Keyword getLevel2_formatKeyword_14_0() { return cLevel2_formatKeyword_14_0; }
		
		//'file='
		public Keyword getFileKeyword_14_1() { return cFileKeyword_14_1; }
		
		//level2_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel2_formatAssignment_14_2() { return cLevel2_formatAssignment_14_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel2_formatGSSFormatFormatCrossReference_14_2_0() { return cLevel2_formatGSSFormatFormatCrossReference_14_2_0; }
		
		//STRING
		public RuleCall getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1() { return cLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14_3() { return cSolidusGreaterThanSignKeyword_14_3; }
		
		//('<level2_filter' 'file=' level2_filter=[filter::GSSFilterFilter|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level2_filter'
		public Keyword getLevel2_filterKeyword_15_0() { return cLevel2_filterKeyword_15_0; }
		
		//'file='
		public Keyword getFileKeyword_15_1() { return cFileKeyword_15_1; }
		
		//level2_filter=[filter::GSSFilterFilter|STRING]
		public Assignment getLevel2_filterAssignment_15_2() { return cLevel2_filterAssignment_15_2; }
		
		//[filter::GSSFilterFilter|STRING]
		public CrossReference getLevel2_filterGSSFilterFilterCrossReference_15_2_0() { return cLevel2_filterGSSFilterFilterCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1() { return cLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//('<from_level1_import' 'file=' from_level1_import=[import_::GSSImportImport|STRING] '/>')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'<from_level1_import'
		public Keyword getFrom_level1_importKeyword_16_0() { return cFrom_level1_importKeyword_16_0; }
		
		//'file='
		public Keyword getFileKeyword_16_1() { return cFileKeyword_16_1; }
		
		//from_level1_import=[import_::GSSImportImport|STRING]
		public Assignment getFrom_level1_importAssignment_16_2() { return cFrom_level1_importAssignment_16_2; }
		
		//[import_::GSSImportImport|STRING]
		public CrossReference getFrom_level1_importGSSImportImportCrossReference_16_2_0() { return cFrom_level1_importGSSImportImportCrossReference_16_2_0; }
		
		//STRING
		public RuleCall getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1() { return cFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_16_3() { return cSolidusGreaterThanSignKeyword_16_3; }
		
		//('<level1_format' 'file=' level1_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'<level1_format'
		public Keyword getLevel1_formatKeyword_17_0() { return cLevel1_formatKeyword_17_0; }
		
		//'file='
		public Keyword getFileKeyword_17_1() { return cFileKeyword_17_1; }
		
		//level1_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel1_formatAssignment_17_2() { return cLevel1_formatAssignment_17_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel1_formatGSSFormatFormatCrossReference_17_2_0() { return cLevel1_formatGSSFormatFormatCrossReference_17_2_0; }
		
		//STRING
		public RuleCall getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1() { return cLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_17_3() { return cSolidusGreaterThanSignKeyword_17_3; }
		
		//('<level1_filter' 'file=' level1_filter=[filter::GSSFilterFilter|STRING] '/>')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'<level1_filter'
		public Keyword getLevel1_filterKeyword_18_0() { return cLevel1_filterKeyword_18_0; }
		
		//'file='
		public Keyword getFileKeyword_18_1() { return cFileKeyword_18_1; }
		
		//level1_filter=[filter::GSSFilterFilter|STRING]
		public Assignment getLevel1_filterAssignment_18_2() { return cLevel1_filterAssignment_18_2; }
		
		//[filter::GSSFilterFilter|STRING]
		public CrossReference getLevel1_filterGSSFilterFilterCrossReference_18_2_0() { return cLevel1_filterGSSFilterFilterCrossReference_18_2_0; }
		
		//STRING
		public RuleCall getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1() { return cLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_18_3() { return cSolidusGreaterThanSignKeyword_18_3; }
		
		//('<from_level0_import' 'file=' from_level0_import=[import_::GSSImportImport|STRING] '/>')?
		public Group getGroup_19() { return cGroup_19; }
		
		//'<from_level0_import'
		public Keyword getFrom_level0_importKeyword_19_0() { return cFrom_level0_importKeyword_19_0; }
		
		//'file='
		public Keyword getFileKeyword_19_1() { return cFileKeyword_19_1; }
		
		//from_level0_import=[import_::GSSImportImport|STRING]
		public Assignment getFrom_level0_importAssignment_19_2() { return cFrom_level0_importAssignment_19_2; }
		
		//[import_::GSSImportImport|STRING]
		public CrossReference getFrom_level0_importGSSImportImportCrossReference_19_2_0() { return cFrom_level0_importGSSImportImportCrossReference_19_2_0; }
		
		//STRING
		public RuleCall getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1() { return cFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_19_3() { return cSolidusGreaterThanSignKeyword_19_3; }
		
		//('<level0_format' 'file=' level0_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_20() { return cGroup_20; }
		
		//'<level0_format'
		public Keyword getLevel0_formatKeyword_20_0() { return cLevel0_formatKeyword_20_0; }
		
		//'file='
		public Keyword getFileKeyword_20_1() { return cFileKeyword_20_1; }
		
		//level0_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel0_formatAssignment_20_2() { return cLevel0_formatAssignment_20_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel0_formatGSSFormatFormatCrossReference_20_2_0() { return cLevel0_formatGSSFormatFormatCrossReference_20_2_0; }
		
		//STRING
		public RuleCall getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1() { return cLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_20_3() { return cSolidusGreaterThanSignKeyword_20_3; }
		
		//('<level0_filter' 'file=' level0_filter=[filter::GSSFilterFilter|STRING] '/>')?
		public Group getGroup_21() { return cGroup_21; }
		
		//'<level0_filter'
		public Keyword getLevel0_filterKeyword_21_0() { return cLevel0_filterKeyword_21_0; }
		
		//'file='
		public Keyword getFileKeyword_21_1() { return cFileKeyword_21_1; }
		
		//level0_filter=[filter::GSSFilterFilter|STRING]
		public Assignment getLevel0_filterAssignment_21_2() { return cLevel0_filterAssignment_21_2; }
		
		//[filter::GSSFilterFilter|STRING]
		public CrossReference getLevel0_filterGSSFilterFilterCrossReference_21_2_0() { return cLevel0_filterGSSFilterFilterCrossReference_21_2_0; }
		
		//STRING
		public RuleCall getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1() { return cLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_21_3() { return cSolidusGreaterThanSignKeyword_21_3; }
		
		//('<fields>' gssFields+=GSSTMOutputField+ '</fields>')?
		public Group getGroup_22() { return cGroup_22; }
		
		//'<fields>'
		public Keyword getFieldsKeyword_22_0() { return cFieldsKeyword_22_0; }
		
		//gssFields+=GSSTMOutputField+
		public Assignment getGssFieldsAssignment_22_1() { return cGssFieldsAssignment_22_1; }
		
		//GSSTMOutputField
		public RuleCall getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0() { return cGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0; }
		
		//'</fields>'
		public Keyword getFieldsKeyword_22_2() { return cFieldsKeyword_22_2; }
		
		//'</GSSTMOutput>'
		public Keyword getGSSTMOutputKeyword_23() { return cGSSTMOutputKeyword_23; }
	}
	public class GSSTMOutputFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutputField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutputFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGssFieldKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGssFieldAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGssFieldGSSFormatFieldCrossReference_4_0 = (CrossReference)cGssFieldAssignment_4.eContents().get(0);
		private final RuleCall cGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGssFieldGSSFormatFieldCrossReference_4_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSTMOutputField:
		//	'<OutputField'
		//	'name=' name=STRING
		//	'gssField=' gssField=[format::GSSFormatField|STRING]
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<OutputField' 'name=' name=STRING 'gssField=' gssField=[format::GSSFormatField|STRING] '/>'
		public Group getGroup() { return cGroup; }
		
		//'<OutputField'
		public Keyword getOutputFieldKeyword_0() { return cOutputFieldKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'gssField='
		public Keyword getGssFieldKeyword_3() { return cGssFieldKeyword_3; }
		
		//gssField=[format::GSSFormatField|STRING]
		public Assignment getGssFieldAssignment_4() { return cGssFieldAssignment_4; }
		
		//[format::GSSFormatField|STRING]
		public CrossReference getGssFieldGSSFormatFieldCrossReference_4_0() { return cGssFieldGSSFormatFieldCrossReference_4_0; }
		
		//STRING
		public RuleCall getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1() { return cGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	
	
	private final GSSTMOutputElements pGSSTMOutput;
	private final GSSTMOutputFieldElements pGSSTMOutputField;
	private final TerminalRule tUINT_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TMOUTPUTGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSTMOutput = new GSSTMOutputElements();
		this.pGSSTMOutputField = new GSSTMOutputFieldElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT".equals(grammar.getName())) {
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

	
	//GSSTMOutput:
	//	'<GSSTMOutput'
	//	'name=' name=STRING
	//	'type=' type=UINT_STRING
	//	'subtype=' subtype=UINT_STRING ('pi1_val=' pi1_val=UINT_STRING)?
	//	'levels=' levels=UINT_STRING
	//	'>' ('<level3_format' 'file=' level3_format=[format::GSSFormatFormat|STRING] '/>')? ('<level3_filter' 'file='
	//	level3_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level2_import' 'file='
	//	from_level2_import=[import_::GSSImportImport|STRING] '/>')? ('<level2_format' 'file='
	//	level2_format=[format::GSSFormatFormat|STRING] '/>')? ('<level2_filter' 'file='
	//	level2_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level1_import' 'file='
	//	from_level1_import=[import_::GSSImportImport|STRING] '/>')? ('<level1_format' 'file='
	//	level1_format=[format::GSSFormatFormat|STRING] '/>')? ('<level1_filter' 'file='
	//	level1_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<from_level0_import' 'file='
	//	from_level0_import=[import_::GSSImportImport|STRING] '/>')? ('<level0_format' 'file='
	//	level0_format=[format::GSSFormatFormat|STRING] '/>')? ('<level0_filter' 'file='
	//	level0_filter=[filter::GSSFilterFilter|STRING] '/>')? ('<fields>' gssFields+=GSSTMOutputField+ '</fields>')?
	//	'</GSSTMOutput>';
	public GSSTMOutputElements getGSSTMOutputAccess() {
		return pGSSTMOutput;
	}
	
	public ParserRule getGSSTMOutputRule() {
		return getGSSTMOutputAccess().getRule();
	}
	
	//GSSTMOutputField:
	//	'<OutputField'
	//	'name=' name=STRING
	//	'gssField=' gssField=[format::GSSFormatField|STRING]
	//	'/>';
	public GSSTMOutputFieldElements getGSSTMOutputFieldAccess() {
		return pGSSTMOutputField;
	}
	
	public ParserRule getGSSTMOutputFieldRule() {
		return getGSSTMOutputFieldAccess().getRule();
	}
	
	//terminal UINT_STRING:
	//	'"' '0'..'9'+ '"';
	public TerminalRule getUINT_STRINGRule() {
		return tUINT_STRING;
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
