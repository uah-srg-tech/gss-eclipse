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
package es.uah.aut.srg.gss.lang.tc.services;

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
public class TCGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSTCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tc.TC.GSSTC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cSubtypeKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSubtypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSubtypeUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cSubtypeAssignment_6.eContents().get(0);
		private final Keyword cLevelsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLevelsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLevelsUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cLevelsAssignment_8.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cTo_level3_exportKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cFileKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cTo_level3_exportAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cTo_level3_exportGSSExportExportCrossReference_10_2_0 = (CrossReference)cTo_level3_exportAssignment_10_2.eContents().get(0);
		private final RuleCall cTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1 = (RuleCall)cTo_level3_exportGSSExportExportCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cLevel3_formatKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cFileKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cLevel3_formatAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cLevel3_formatGSSFormatFormatCrossReference_11_2_0 = (CrossReference)cLevel3_formatAssignment_11_2.eContents().get(0);
		private final RuleCall cLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cLevel3_formatGSSFormatFormatCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cTo_level2_exportKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cFileKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cTo_level2_exportAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cTo_level2_exportGSSExportExportCrossReference_12_2_0 = (CrossReference)cTo_level2_exportAssignment_12_2.eContents().get(0);
		private final RuleCall cTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cTo_level2_exportGSSExportExportCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cLevel2_formatKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Keyword cFileKeyword_13_1 = (Keyword)cGroup_13.eContents().get(1);
		private final Assignment cLevel2_formatAssignment_13_2 = (Assignment)cGroup_13.eContents().get(2);
		private final CrossReference cLevel2_formatGSSFormatFormatCrossReference_13_2_0 = (CrossReference)cLevel2_formatAssignment_13_2.eContents().get(0);
		private final RuleCall cLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1 = (RuleCall)cLevel2_formatGSSFormatFormatCrossReference_13_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_13_3 = (Keyword)cGroup_13.eContents().get(3);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cTo_level1_exportKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cFileKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cTo_level1_exportAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cTo_level1_exportGSSExportExportCrossReference_14_2_0 = (CrossReference)cTo_level1_exportAssignment_14_2.eContents().get(0);
		private final RuleCall cTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1 = (RuleCall)cTo_level1_exportGSSExportExportCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel1_formatKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cFileKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel1_formatAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel1_formatGSSFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel1_formatAssignment_15_2.eContents().get(0);
		private final RuleCall cLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel1_formatGSSFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cTo_level0_exportKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cFileKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cTo_level0_exportAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final CrossReference cTo_level0_exportGSSExportExportCrossReference_16_2_0 = (CrossReference)cTo_level0_exportAssignment_16_2.eContents().get(0);
		private final RuleCall cTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1 = (RuleCall)cTo_level0_exportGSSExportExportCrossReference_16_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel0_formatKeyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cFileKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel0_formatAssignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel0_formatGSSFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel0_formatAssignment_17_2.eContents().get(0);
		private final RuleCall cLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1 = (RuleCall)cLevel0_formatGSSFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cFieldsKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Assignment cFieldsAssignment_18_1 = (Assignment)cGroup_18.eContents().get(1);
		private final RuleCall cFieldsGSSTCFieldParserRuleCall_18_1_0 = (RuleCall)cFieldsAssignment_18_1.eContents().get(0);
		private final Keyword cFieldsKeyword_18_2 = (Keyword)cGroup_18.eContents().get(2);
		private final Keyword cGSSTCKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//GSSTC:
		//	'<GSSTC'
		//	'name=' name=STRING
		//	'type=' type=UINT_STRING
		//	'subtype=' subtype=UINT_STRING
		//	'levels=' levels=UINT_STRING
		//	'>' ('<to_level3_export' 'file=' to_level3_export=[export::GSSExportExport|STRING] '/>')? ('<level3_format' 'file='
		//	level3_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level2_export' 'file='
		//	to_level2_export=[export::GSSExportExport|STRING] '/>')? ('<level2_format' 'file='
		//	level2_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level1_export' 'file='
		//	to_level1_export=[export::GSSExportExport|STRING] '/>')? ('<level1_format' 'file='
		//	level1_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level0_export' 'file='
		//	to_level0_export=[export::GSSExportExport|STRING] '/>')? ('<level0_format' 'file='
		//	level0_format=[format::GSSFormatFormat|STRING] '/>')? ('<fields>' fields+=GSSTCField+ '</fields>')?
		//	'</GSSTC>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<GSSTC' 'name=' name=STRING 'type=' type=UINT_STRING 'subtype=' subtype=UINT_STRING 'levels=' levels=UINT_STRING '>'
		//('<to_level3_export' 'file=' to_level3_export=[export::GSSExportExport|STRING] '/>')? ('<level3_format' 'file='
		//level3_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level2_export' 'file='
		//to_level2_export=[export::GSSExportExport|STRING] '/>')? ('<level2_format' 'file='
		//level2_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level1_export' 'file='
		//to_level1_export=[export::GSSExportExport|STRING] '/>')? ('<level1_format' 'file='
		//level1_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level0_export' 'file='
		//to_level0_export=[export::GSSExportExport|STRING] '/>')? ('<level0_format' 'file='
		//level0_format=[format::GSSFormatFormat|STRING] '/>')? ('<fields>' fields+=GSSTCField+ '</fields>')? '</GSSTC>'
		public Group getGroup() { return cGroup; }
		
		//'<GSSTC'
		public Keyword getGSSTCKeyword_0() { return cGSSTCKeyword_0; }
		
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
		
		//'levels='
		public Keyword getLevelsKeyword_7() { return cLevelsKeyword_7; }
		
		//levels=UINT_STRING
		public Assignment getLevelsAssignment_8() { return cLevelsAssignment_8; }
		
		//UINT_STRING
		public RuleCall getLevelsUINT_STRINGTerminalRuleCall_8_0() { return cLevelsUINT_STRINGTerminalRuleCall_8_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_9() { return cGreaterThanSignKeyword_9; }
		
		//('<to_level3_export' 'file=' to_level3_export=[export::GSSExportExport|STRING] '/>')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'<to_level3_export'
		public Keyword getTo_level3_exportKeyword_10_0() { return cTo_level3_exportKeyword_10_0; }
		
		//'file='
		public Keyword getFileKeyword_10_1() { return cFileKeyword_10_1; }
		
		//to_level3_export=[export::GSSExportExport|STRING]
		public Assignment getTo_level3_exportAssignment_10_2() { return cTo_level3_exportAssignment_10_2; }
		
		//[export::GSSExportExport|STRING]
		public CrossReference getTo_level3_exportGSSExportExportCrossReference_10_2_0() { return cTo_level3_exportGSSExportExportCrossReference_10_2_0; }
		
		//STRING
		public RuleCall getTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1() { return cTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10_3() { return cSolidusGreaterThanSignKeyword_10_3; }
		
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
		
		//('<to_level2_export' 'file=' to_level2_export=[export::GSSExportExport|STRING] '/>')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'<to_level2_export'
		public Keyword getTo_level2_exportKeyword_12_0() { return cTo_level2_exportKeyword_12_0; }
		
		//'file='
		public Keyword getFileKeyword_12_1() { return cFileKeyword_12_1; }
		
		//to_level2_export=[export::GSSExportExport|STRING]
		public Assignment getTo_level2_exportAssignment_12_2() { return cTo_level2_exportAssignment_12_2; }
		
		//[export::GSSExportExport|STRING]
		public CrossReference getTo_level2_exportGSSExportExportCrossReference_12_2_0() { return cTo_level2_exportGSSExportExportCrossReference_12_2_0; }
		
		//STRING
		public RuleCall getTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1() { return cTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12_3() { return cSolidusGreaterThanSignKeyword_12_3; }
		
		//('<level2_format' 'file=' level2_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_13() { return cGroup_13; }
		
		//'<level2_format'
		public Keyword getLevel2_formatKeyword_13_0() { return cLevel2_formatKeyword_13_0; }
		
		//'file='
		public Keyword getFileKeyword_13_1() { return cFileKeyword_13_1; }
		
		//level2_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel2_formatAssignment_13_2() { return cLevel2_formatAssignment_13_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel2_formatGSSFormatFormatCrossReference_13_2_0() { return cLevel2_formatGSSFormatFormatCrossReference_13_2_0; }
		
		//STRING
		public RuleCall getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1() { return cLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_13_3() { return cSolidusGreaterThanSignKeyword_13_3; }
		
		//('<to_level1_export' 'file=' to_level1_export=[export::GSSExportExport|STRING] '/>')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'<to_level1_export'
		public Keyword getTo_level1_exportKeyword_14_0() { return cTo_level1_exportKeyword_14_0; }
		
		//'file='
		public Keyword getFileKeyword_14_1() { return cFileKeyword_14_1; }
		
		//to_level1_export=[export::GSSExportExport|STRING]
		public Assignment getTo_level1_exportAssignment_14_2() { return cTo_level1_exportAssignment_14_2; }
		
		//[export::GSSExportExport|STRING]
		public CrossReference getTo_level1_exportGSSExportExportCrossReference_14_2_0() { return cTo_level1_exportGSSExportExportCrossReference_14_2_0; }
		
		//STRING
		public RuleCall getTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1() { return cTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14_3() { return cSolidusGreaterThanSignKeyword_14_3; }
		
		//('<level1_format' 'file=' level1_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level1_format'
		public Keyword getLevel1_formatKeyword_15_0() { return cLevel1_formatKeyword_15_0; }
		
		//'file='
		public Keyword getFileKeyword_15_1() { return cFileKeyword_15_1; }
		
		//level1_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel1_formatAssignment_15_2() { return cLevel1_formatAssignment_15_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel1_formatGSSFormatFormatCrossReference_15_2_0() { return cLevel1_formatGSSFormatFormatCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1() { return cLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//('<to_level0_export' 'file=' to_level0_export=[export::GSSExportExport|STRING] '/>')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'<to_level0_export'
		public Keyword getTo_level0_exportKeyword_16_0() { return cTo_level0_exportKeyword_16_0; }
		
		//'file='
		public Keyword getFileKeyword_16_1() { return cFileKeyword_16_1; }
		
		//to_level0_export=[export::GSSExportExport|STRING]
		public Assignment getTo_level0_exportAssignment_16_2() { return cTo_level0_exportAssignment_16_2; }
		
		//[export::GSSExportExport|STRING]
		public CrossReference getTo_level0_exportGSSExportExportCrossReference_16_2_0() { return cTo_level0_exportGSSExportExportCrossReference_16_2_0; }
		
		//STRING
		public RuleCall getTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1() { return cTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_16_3() { return cSolidusGreaterThanSignKeyword_16_3; }
		
		//('<level0_format' 'file=' level0_format=[format::GSSFormatFormat|STRING] '/>')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'<level0_format'
		public Keyword getLevel0_formatKeyword_17_0() { return cLevel0_formatKeyword_17_0; }
		
		//'file='
		public Keyword getFileKeyword_17_1() { return cFileKeyword_17_1; }
		
		//level0_format=[format::GSSFormatFormat|STRING]
		public Assignment getLevel0_formatAssignment_17_2() { return cLevel0_formatAssignment_17_2; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getLevel0_formatGSSFormatFormatCrossReference_17_2_0() { return cLevel0_formatGSSFormatFormatCrossReference_17_2_0; }
		
		//STRING
		public RuleCall getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1() { return cLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_17_3() { return cSolidusGreaterThanSignKeyword_17_3; }
		
		//('<fields>' fields+=GSSTCField+ '</fields>')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'<fields>'
		public Keyword getFieldsKeyword_18_0() { return cFieldsKeyword_18_0; }
		
		//fields+=GSSTCField+
		public Assignment getFieldsAssignment_18_1() { return cFieldsAssignment_18_1; }
		
		//GSSTCField
		public RuleCall getFieldsGSSTCFieldParserRuleCall_18_1_0() { return cFieldsGSSTCFieldParserRuleCall_18_1_0; }
		
		//'</fields>'
		public Keyword getFieldsKeyword_18_2() { return cFieldsKeyword_18_2; }
		
		//'</GSSTC>'
		public Keyword getGSSTCKeyword_19() { return cGSSTCKeyword_19; }
	}
	public class GSSTCFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tc.TC.GSSTCField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGssFieldKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGssFieldAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGssFieldGSSFormatFieldCrossReference_4_0 = (CrossReference)cGssFieldAssignment_4.eContents().get(0);
		private final RuleCall cGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGssFieldGSSFormatFieldCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEnumRefKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEnumRefAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cEnumRefTMTCIFEnumCrossReference_5_1_0 = (CrossReference)cEnumRefAssignment_5_1.eContents().get(0);
		private final RuleCall cEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1 = (RuleCall)cEnumRefTMTCIFEnumCrossReference_5_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSTCField:
		//	'<Field'
		//	'name=' name=STRING
		//	'gssField=' gssField=[format::GSSFormatField|STRING] ('enumRef=' enumRef=[enum_::TMTCIFEnum|STRING])?
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Field' 'name=' name=STRING 'gssField=' gssField=[format::GSSFormatField|STRING] ('enumRef='
		//enumRef=[enum_::TMTCIFEnum|STRING])? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<Field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
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
		
		//('enumRef=' enumRef=[enum_::TMTCIFEnum|STRING])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'enumRef='
		public Keyword getEnumRefKeyword_5_0() { return cEnumRefKeyword_5_0; }
		
		//enumRef=[enum_::TMTCIFEnum|STRING]
		public Assignment getEnumRefAssignment_5_1() { return cEnumRefAssignment_5_1; }
		
		//[enum_::TMTCIFEnum|STRING]
		public CrossReference getEnumRefTMTCIFEnumCrossReference_5_1_0() { return cEnumRefTMTCIFEnumCrossReference_5_1_0; }
		
		//STRING
		public RuleCall getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1() { return cEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_6() { return cSolidusGreaterThanSignKeyword_6; }
	}
	
	
	private final GSSTCElements pGSSTC;
	private final GSSTCFieldElements pGSSTCField;
	private final TerminalRule tUINT_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TCGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSTC = new GSSTCElements();
		this.pGSSTCField = new GSSTCFieldElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tc.TC.UINT_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.tc.TC".equals(grammar.getName())) {
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

	
	//GSSTC:
	//	'<GSSTC'
	//	'name=' name=STRING
	//	'type=' type=UINT_STRING
	//	'subtype=' subtype=UINT_STRING
	//	'levels=' levels=UINT_STRING
	//	'>' ('<to_level3_export' 'file=' to_level3_export=[export::GSSExportExport|STRING] '/>')? ('<level3_format' 'file='
	//	level3_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level2_export' 'file='
	//	to_level2_export=[export::GSSExportExport|STRING] '/>')? ('<level2_format' 'file='
	//	level2_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level1_export' 'file='
	//	to_level1_export=[export::GSSExportExport|STRING] '/>')? ('<level1_format' 'file='
	//	level1_format=[format::GSSFormatFormat|STRING] '/>')? ('<to_level0_export' 'file='
	//	to_level0_export=[export::GSSExportExport|STRING] '/>')? ('<level0_format' 'file='
	//	level0_format=[format::GSSFormatFormat|STRING] '/>')? ('<fields>' fields+=GSSTCField+ '</fields>')?
	//	'</GSSTC>';
	public GSSTCElements getGSSTCAccess() {
		return pGSSTC;
	}
	
	public ParserRule getGSSTCRule() {
		return getGSSTCAccess().getRule();
	}
	
	//GSSTCField:
	//	'<Field'
	//	'name=' name=STRING
	//	'gssField=' gssField=[format::GSSFormatField|STRING] ('enumRef=' enumRef=[enum_::TMTCIFEnum|STRING])?
	//	'/>';
	public GSSTCFieldElements getGSSTCFieldAccess() {
		return pGSSTCField;
	}
	
	public ParserRule getGSSTCFieldRule() {
		return getGSSTCFieldAccess().getRule();
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
