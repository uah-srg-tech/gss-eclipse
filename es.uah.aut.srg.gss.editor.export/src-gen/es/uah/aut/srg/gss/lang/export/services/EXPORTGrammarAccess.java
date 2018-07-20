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
package es.uah.aut.srg.gss.lang.export.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class EXPORTGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSExportExportParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSExportExport
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSExportExport
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSExportExport
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSExportExport
		public RuleCall getElementGSSExportExportParserRuleCall_1_0() { return cElementGSSExportExportParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSModelFileImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportURIAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportURISTRINGTerminalRuleCall_2_0 = (RuleCall)cImportURIAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GSSModelFileImport common::GSSModelFileImport:
		//	'import' ':=' importURI=STRING ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'import' ':=' importURI=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1() { return cColonEqualsSignKeyword_1; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_2() { return cImportURIAssignment_2; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_2_0() { return cImportURISTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class GSSExportExportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportExport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportExportKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cFromKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFromAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFromIDTerminalRuleCall_6_0 = (RuleCall)cFromAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cToKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cColonEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cToAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cToIDTerminalRuleCall_10_0 = (RuleCall)cToAssignment_10.eContents().get(0);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cSizesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSizesGSSExportSizesParserRuleCall_12_0 = (RuleCall)cSizesAssignment_12.eContents().get(0);
		private final Assignment cSettingsAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSettingsGSSExportSettingsParserRuleCall_13_0 = (RuleCall)cSettingsAssignment_13.eContents().get(0);
		private final Assignment cActivateDICsAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cActivateDICsGSSExportActivateDICsParserRuleCall_14_0 = (RuleCall)cActivateDICsAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSExportExport:
		//	'GSSExportExport'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		//	'from' ':=' from=ID ';'
		//	'to' ':=' to=ID ';'
		//	Sizes=GSSExportSizes?
		//	settings=GSSExportSettings
		//	activateDICs=GSSExportActivateDICs?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportExport' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') 'from' ':='
		//from=ID ';' 'to' ':=' to=ID ';' Sizes=GSSExportSizes? settings=GSSExportSettings activateDICs=GSSExportActivateDICs?
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportExport'
		public Keyword getGSSExportExportKeyword_0() { return cGSSExportExportKeyword_0; }
		
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
		
		//'from'
		public Keyword getFromKeyword_4() { return cFromKeyword_4; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_5() { return cColonEqualsSignKeyword_5; }
		
		//from=ID
		public Assignment getFromAssignment_6() { return cFromAssignment_6; }
		
		//ID
		public RuleCall getFromIDTerminalRuleCall_6_0() { return cFromIDTerminalRuleCall_6_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
		
		//'to'
		public Keyword getToKeyword_8() { return cToKeyword_8; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9() { return cColonEqualsSignKeyword_9; }
		
		//to=ID
		public Assignment getToAssignment_10() { return cToAssignment_10; }
		
		//ID
		public RuleCall getToIDTerminalRuleCall_10_0() { return cToIDTerminalRuleCall_10_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
		
		//Sizes=GSSExportSizes?
		public Assignment getSizesAssignment_12() { return cSizesAssignment_12; }
		
		//GSSExportSizes
		public RuleCall getSizesGSSExportSizesParserRuleCall_12_0() { return cSizesGSSExportSizesParserRuleCall_12_0; }
		
		//settings=GSSExportSettings
		public Assignment getSettingsAssignment_13() { return cSettingsAssignment_13; }
		
		//GSSExportSettings
		public RuleCall getSettingsGSSExportSettingsParserRuleCall_13_0() { return cSettingsGSSExportSettingsParserRuleCall_13_0; }
		
		//activateDICs=GSSExportActivateDICs?
		public Assignment getActivateDICsAssignment_14() { return cActivateDICsAssignment_14; }
		
		//GSSExportActivateDICs
		public RuleCall getActivateDICsGSSExportActivateDICsParserRuleCall_14_0() { return cActivateDICsGSSExportActivateDICsParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSExportSizesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSExportSizesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSExportSizesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cSizeFromFileLengthAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cSizeFromFileLengthGSSExportSizeFromFileLengthParserRuleCall_3_0_0 = (RuleCall)cSizeFromFileLengthAssignment_3_0.eContents().get(0);
		private final Assignment cSizeFromFileLineAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cSizeFromFileLineGSSExportSizeFromFileLineParserRuleCall_3_1_0 = (RuleCall)cSizeFromFileLineAssignment_3_1.eContents().get(0);
		private final Assignment cSizeInBitsAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cSizeInBitsGSSExportSizeInBitsParserRuleCall_3_2_0 = (RuleCall)cSizeInBitsAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSExportSizes:
		//	{GSSExportSizes}
		//	'GSSExportSizes' '{' (sizeFromFileLength+=GSSExportSizeFromFileLength | sizeFromFileLine+=GSSExportSizeFromFileLine |
		//	sizeInBits+=GSSExportSizeInBits)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSExportSizes} 'GSSExportSizes' '{' (sizeFromFileLength+=GSSExportSizeFromFileLength |
		//sizeFromFileLine+=GSSExportSizeFromFileLine | sizeInBits+=GSSExportSizeInBits)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSExportSizes}
		public Action getGSSExportSizesAction_0() { return cGSSExportSizesAction_0; }
		
		//'GSSExportSizes'
		public Keyword getGSSExportSizesKeyword_1() { return cGSSExportSizesKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(sizeFromFileLength+=GSSExportSizeFromFileLength | sizeFromFileLine+=GSSExportSizeFromFileLine |
		//sizeInBits+=GSSExportSizeInBits)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//sizeFromFileLength+=GSSExportSizeFromFileLength
		public Assignment getSizeFromFileLengthAssignment_3_0() { return cSizeFromFileLengthAssignment_3_0; }
		
		//GSSExportSizeFromFileLength
		public RuleCall getSizeFromFileLengthGSSExportSizeFromFileLengthParserRuleCall_3_0_0() { return cSizeFromFileLengthGSSExportSizeFromFileLengthParserRuleCall_3_0_0; }
		
		//sizeFromFileLine+=GSSExportSizeFromFileLine
		public Assignment getSizeFromFileLineAssignment_3_1() { return cSizeFromFileLineAssignment_3_1; }
		
		//GSSExportSizeFromFileLine
		public RuleCall getSizeFromFileLineGSSExportSizeFromFileLineParserRuleCall_3_1_0() { return cSizeFromFileLineGSSExportSizeFromFileLineParserRuleCall_3_1_0; }
		
		//sizeInBits+=GSSExportSizeInBits
		public Assignment getSizeInBitsAssignment_3_2() { return cSizeInBitsAssignment_3_2; }
		
		//GSSExportSizeInBits
		public RuleCall getSizeInBitsGSSExportSizeInBitsParserRuleCall_3_2_0() { return cSizeInBitsGSSExportSizeInBitsParserRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSExportSizeFromFileLengthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizeFromFileLength");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSizeFromFileLengthKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromFileKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFromFileAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFromFileIDTerminalRuleCall_8_0 = (RuleCall)cFromFileAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cAddSizeKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cAddSizeAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cAddSizeINTEGERParserRuleCall_10_2_0 = (RuleCall)cAddSizeAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cUnitKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cUnitAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cUnitGSSExportUnitEnumRuleCall_11_2_0 = (RuleCall)cUnitAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//GSSExportSizeFromFileLength:
		//	'GSSExportSizeFromFileLength' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'fromFile' ':=' fromFile=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSizeFromFileLength' '{' 'id' ':=' id=INTEGER ';' 'fromFile' ':=' fromFile=ID ';' ('addSize' ':='
		//addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSizeFromFileLength'
		public Keyword getGSSExportSizeFromFileLengthKeyword_0() { return cGSSExportSizeFromFileLengthKeyword_0; }
		
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
		
		//'fromFile'
		public Keyword getFromFileKeyword_6() { return cFromFileKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_8() { return cFromFileAssignment_8; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_8_0() { return cFromFileIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('addSize' ':=' addSize=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'addSize'
		public Keyword getAddSizeKeyword_10_0() { return cAddSizeKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//addSize=INTEGER
		public Assignment getAddSizeAssignment_10_2() { return cAddSizeAssignment_10_2; }
		
		//INTEGER
		public RuleCall getAddSizeINTEGERParserRuleCall_10_2_0() { return cAddSizeINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('unit' ':=' unit=GSSExportUnit ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'unit'
		public Keyword getUnitKeyword_11_0() { return cUnitKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//unit=GSSExportUnit
		public Assignment getUnitAssignment_11_2() { return cUnitAssignment_11_2; }
		
		//GSSExportUnit
		public RuleCall getUnitGSSExportUnitEnumRuleCall_11_2_0() { return cUnitGSSExportUnitEnumRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class GSSExportSizeFromFileLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizeFromFileLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSizeFromFileLineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromFileKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFromFileAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFromFileIDTerminalRuleCall_8_0 = (RuleCall)cFromFileAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cLineKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cLineAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cLineINTEGERParserRuleCall_12_0 = (RuleCall)cLineAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cAddSizeKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cAddSizeAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cAddSizeINTEGERParserRuleCall_14_2_0 = (RuleCall)cAddSizeAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cUnitKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cUnitAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final RuleCall cUnitGSSExportUnitEnumRuleCall_15_2_0 = (RuleCall)cUnitAssignment_15_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//GSSExportSizeFromFileLine:
		//	'GSSExportSizeFromFileLine' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'fromFile' ':=' fromFile=ID ';'
		//	'line' ':=' line=INTEGER ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSizeFromFileLine' '{' 'id' ':=' id=INTEGER ';' 'fromFile' ':=' fromFile=ID ';' 'line' ':=' line=INTEGER ';'
		//('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSizeFromFileLine'
		public Keyword getGSSExportSizeFromFileLineKeyword_0() { return cGSSExportSizeFromFileLineKeyword_0; }
		
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
		
		//'fromFile'
		public Keyword getFromFileKeyword_6() { return cFromFileKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_8() { return cFromFileAssignment_8; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_8_0() { return cFromFileIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'line'
		public Keyword getLineKeyword_10() { return cLineKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//line=INTEGER
		public Assignment getLineAssignment_12() { return cLineAssignment_12; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_12_0() { return cLineINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('addSize' ':=' addSize=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'addSize'
		public Keyword getAddSizeKeyword_14_0() { return cAddSizeKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//addSize=INTEGER
		public Assignment getAddSizeAssignment_14_2() { return cAddSizeAssignment_14_2; }
		
		//INTEGER
		public RuleCall getAddSizeINTEGERParserRuleCall_14_2_0() { return cAddSizeINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('unit' ':=' unit=GSSExportUnit ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'unit'
		public Keyword getUnitKeyword_15_0() { return cUnitKeyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//unit=GSSExportUnit
		public Assignment getUnitAssignment_15_2() { return cUnitAssignment_15_2; }
		
		//GSSExportUnit
		public RuleCall getUnitGSSExportUnitEnumRuleCall_15_2_0() { return cUnitGSSExportUnitEnumRuleCall_15_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
	}
	public class GSSExportSizeInBitsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizeInBits");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSizeInBitsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFromAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFromIDTerminalRuleCall_8_0 = (RuleCall)cFromAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cAddSizeKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cAddSizeAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cAddSizeINTEGERParserRuleCall_10_2_0 = (RuleCall)cAddSizeAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cUnitKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cUnitAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cUnitGSSExportUnitEnumRuleCall_11_2_0 = (RuleCall)cUnitAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//GSSExportSizeInBits:
		//	'GSSExportSizeInBits' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'from' ':=' from=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSizeInBits' '{' 'id' ':=' id=INTEGER ';' 'from' ':=' from=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit'
		//':=' unit=GSSExportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSizeInBits'
		public Keyword getGSSExportSizeInBitsKeyword_0() { return cGSSExportSizeInBitsKeyword_0; }
		
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
		
		//'from'
		public Keyword getFromKeyword_6() { return cFromKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//from=ID
		public Assignment getFromAssignment_8() { return cFromAssignment_8; }
		
		//ID
		public RuleCall getFromIDTerminalRuleCall_8_0() { return cFromIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('addSize' ':=' addSize=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'addSize'
		public Keyword getAddSizeKeyword_10_0() { return cAddSizeKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//addSize=INTEGER
		public Assignment getAddSizeAssignment_10_2() { return cAddSizeAssignment_10_2; }
		
		//INTEGER
		public RuleCall getAddSizeINTEGERParserRuleCall_10_2_0() { return cAddSizeINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('unit' ':=' unit=GSSExportUnit ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'unit'
		public Keyword getUnitKeyword_11_0() { return cUnitKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//unit=GSSExportUnit
		public Assignment getUnitAssignment_11_2() { return cUnitAssignment_11_2; }
		
		//GSSExportUnit
		public RuleCall getUnitGSSExportUnitEnumRuleCall_11_2_0() { return cUnitGSSExportUnitEnumRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class GSSExportSettingsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSExportSettingsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSExportSettingsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cSettingFromConstAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cSettingFromConstGSSExportSettingFromConstParserRuleCall_3_0_0 = (RuleCall)cSettingFromConstAssignment_3_0.eContents().get(0);
		private final Assignment cSettingFromSizeAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cSettingFromSizeGSSExportSettingFromSizeParserRuleCall_3_1_0 = (RuleCall)cSettingFromSizeAssignment_3_1.eContents().get(0);
		private final Assignment cSettingFromFileAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cSettingFromFileGSSExportSettingFromFileParserRuleCall_3_2_0 = (RuleCall)cSettingFromFileAssignment_3_2.eContents().get(0);
		private final Assignment cSettingFromFieldAssignment_3_3 = (Assignment)cAlternatives_3.eContents().get(3);
		private final RuleCall cSettingFromFieldGSSExportSettingFromFieldParserRuleCall_3_3_0 = (RuleCall)cSettingFromFieldAssignment_3_3.eContents().get(0);
		private final Assignment cSettingAIFromConstAssignment_3_4 = (Assignment)cAlternatives_3.eContents().get(4);
		private final RuleCall cSettingAIFromConstGSSExportSettingAIFromConstParserRuleCall_3_4_0 = (RuleCall)cSettingAIFromConstAssignment_3_4.eContents().get(0);
		private final Assignment cSettingAIFromFileAssignment_3_5 = (Assignment)cAlternatives_3.eContents().get(5);
		private final RuleCall cSettingAIFromFileGSSExportSettingAIFromFileParserRuleCall_3_5_0 = (RuleCall)cSettingAIFromFileAssignment_3_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSExportSettings:
		//	{GSSExportSettings}
		//	'GSSExportSettings' '{' (settingFromConst+=GSSExportSettingFromConst | settingFromSize+=GSSExportSettingFromSize |
		//	settingFromFile+=GSSExportSettingFromFile | settingFromField+=GSSExportSettingFromField |
		//	settingAIFromConst+=GSSExportSettingAIFromConst | settingAIFromFile+=GSSExportSettingAIFromFile)*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSExportSettings} 'GSSExportSettings' '{' (settingFromConst+=GSSExportSettingFromConst |
		//settingFromSize+=GSSExportSettingFromSize | settingFromFile+=GSSExportSettingFromFile |
		//settingFromField+=GSSExportSettingFromField | settingAIFromConst+=GSSExportSettingAIFromConst |
		//settingAIFromFile+=GSSExportSettingAIFromFile)* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSExportSettings}
		public Action getGSSExportSettingsAction_0() { return cGSSExportSettingsAction_0; }
		
		//'GSSExportSettings'
		public Keyword getGSSExportSettingsKeyword_1() { return cGSSExportSettingsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(settingFromConst+=GSSExportSettingFromConst | settingFromSize+=GSSExportSettingFromSize |
		//settingFromFile+=GSSExportSettingFromFile | settingFromField+=GSSExportSettingFromField |
		//settingAIFromConst+=GSSExportSettingAIFromConst | settingAIFromFile+=GSSExportSettingAIFromFile)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//settingFromConst+=GSSExportSettingFromConst
		public Assignment getSettingFromConstAssignment_3_0() { return cSettingFromConstAssignment_3_0; }
		
		//GSSExportSettingFromConst
		public RuleCall getSettingFromConstGSSExportSettingFromConstParserRuleCall_3_0_0() { return cSettingFromConstGSSExportSettingFromConstParserRuleCall_3_0_0; }
		
		//settingFromSize+=GSSExportSettingFromSize
		public Assignment getSettingFromSizeAssignment_3_1() { return cSettingFromSizeAssignment_3_1; }
		
		//GSSExportSettingFromSize
		public RuleCall getSettingFromSizeGSSExportSettingFromSizeParserRuleCall_3_1_0() { return cSettingFromSizeGSSExportSettingFromSizeParserRuleCall_3_1_0; }
		
		//settingFromFile+=GSSExportSettingFromFile
		public Assignment getSettingFromFileAssignment_3_2() { return cSettingFromFileAssignment_3_2; }
		
		//GSSExportSettingFromFile
		public RuleCall getSettingFromFileGSSExportSettingFromFileParserRuleCall_3_2_0() { return cSettingFromFileGSSExportSettingFromFileParserRuleCall_3_2_0; }
		
		//settingFromField+=GSSExportSettingFromField
		public Assignment getSettingFromFieldAssignment_3_3() { return cSettingFromFieldAssignment_3_3; }
		
		//GSSExportSettingFromField
		public RuleCall getSettingFromFieldGSSExportSettingFromFieldParserRuleCall_3_3_0() { return cSettingFromFieldGSSExportSettingFromFieldParserRuleCall_3_3_0; }
		
		//settingAIFromConst+=GSSExportSettingAIFromConst
		public Assignment getSettingAIFromConstAssignment_3_4() { return cSettingAIFromConstAssignment_3_4; }
		
		//GSSExportSettingAIFromConst
		public RuleCall getSettingAIFromConstGSSExportSettingAIFromConstParserRuleCall_3_4_0() { return cSettingAIFromConstGSSExportSettingAIFromConstParserRuleCall_3_4_0; }
		
		//settingAIFromFile+=GSSExportSettingAIFromFile
		public Assignment getSettingAIFromFileAssignment_3_5() { return cSettingAIFromFileAssignment_3_5; }
		
		//GSSExportSettingAIFromFile
		public RuleCall getSettingAIFromFileGSSExportSettingAIFromFileParserRuleCall_3_5_0() { return cSettingAIFromFileGSSExportSettingAIFromFileParserRuleCall_3_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSExportSettingFromConstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromConst");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSettingFromConstKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueINTEGERParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToFieldRefIDTerminalRuleCall_8_0 = (RuleCall)cToFieldRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSExportSettingFromConst:
		//	'GSSExportSettingFromConst' '{'
		//	'value' ':=' value=INTEGER ';'
		//	'toFieldRef' ':=' toFieldRef=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSettingFromConst' '{' 'value' ':=' value=INTEGER ';' 'toFieldRef' ':=' toFieldRef=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSettingFromConst'
		public Keyword getGSSExportSettingFromConstKeyword_0() { return cGSSExportSettingFromConstKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'value'
		public Keyword getValueKeyword_2() { return cValueKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//value=INTEGER
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_4_0() { return cValueINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=ID
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//ID
		public RuleCall getToFieldRefIDTerminalRuleCall_8_0() { return cToFieldRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSExportSettingFromSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSettingFromSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSizeRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSizeRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSizeRefINTEGERParserRuleCall_4_0 = (RuleCall)cSizeRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToFieldRefIDTerminalRuleCall_8_0 = (RuleCall)cToFieldRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSExportSettingFromSize:
		//	'GSSExportSettingFromSize' '{'
		//	'sizeRef' ':=' sizeRef=INTEGER ';'
		//	'toFieldRef' ':=' toFieldRef=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSettingFromSize' '{' 'sizeRef' ':=' sizeRef=INTEGER ';' 'toFieldRef' ':=' toFieldRef=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSettingFromSize'
		public Keyword getGSSExportSettingFromSizeKeyword_0() { return cGSSExportSettingFromSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sizeRef'
		public Keyword getSizeRefKeyword_2() { return cSizeRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//sizeRef=INTEGER
		public Assignment getSizeRefAssignment_4() { return cSizeRefAssignment_4; }
		
		//INTEGER
		public RuleCall getSizeRefINTEGERParserRuleCall_4_0() { return cSizeRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=ID
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//ID
		public RuleCall getToFieldRefIDTerminalRuleCall_8_0() { return cToFieldRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSExportSettingFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSettingFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFileIDTerminalRuleCall_4_0 = (RuleCall)cFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToFieldRefIDTerminalRuleCall_8_0 = (RuleCall)cToFieldRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cOffsetKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cOffsetAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cOffsetINTEGERParserRuleCall_10_2_0 = (RuleCall)cOffsetAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cSizeKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cSizeAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cSizeINTEGERParserRuleCall_11_2_0 = (RuleCall)cSizeAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cLineKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cLineAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cLineINTEGERParserRuleCall_12_2_0 = (RuleCall)cLineAssignment_12_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//GSSExportSettingFromFile:
		//	'GSSExportSettingFromFile' '{'
		//	'file' ':=' file=ID ';'
		//	'toFieldRef' ':=' toFieldRef=ID ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('line' ':='
		//	line=INTEGER ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSettingFromFile' '{' 'file' ':=' file=ID ';' 'toFieldRef' ':=' toFieldRef=ID ';' ('offset' ':=' offset=INTEGER
		//';')? ('size' ':=' size=INTEGER ';')? ('line' ':=' line=INTEGER ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSettingFromFile'
		public Keyword getGSSExportSettingFromFileKeyword_0() { return cGSSExportSettingFromFileKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'file'
		public Keyword getFileKeyword_2() { return cFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//file=ID
		public Assignment getFileAssignment_4() { return cFileAssignment_4; }
		
		//ID
		public RuleCall getFileIDTerminalRuleCall_4_0() { return cFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=ID
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//ID
		public RuleCall getToFieldRefIDTerminalRuleCall_8_0() { return cToFieldRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('offset' ':=' offset=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'offset'
		public Keyword getOffsetKeyword_10_0() { return cOffsetKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_10_2() { return cOffsetAssignment_10_2; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_10_2_0() { return cOffsetINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('size' ':=' size=INTEGER ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'size'
		public Keyword getSizeKeyword_11_0() { return cSizeKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_11_2() { return cSizeAssignment_11_2; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_11_2_0() { return cSizeINTEGERParserRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//('line' ':=' line=INTEGER ';')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'line'
		public Keyword getLineKeyword_12_0() { return cLineKeyword_12_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }
		
		//line=INTEGER
		public Assignment getLineAssignment_12_2() { return cLineAssignment_12_2; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_12_2_0() { return cLineINTEGERParserRuleCall_12_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class GSSExportSettingFromFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingFromField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSettingFromFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFieldRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldRefIDTerminalRuleCall_4_0 = (RuleCall)cFieldRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToFieldRefIDTerminalRuleCall_8_0 = (RuleCall)cToFieldRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSExportSettingFromField:
		//	'GSSExportSettingFromField' '{'
		//	'fieldRef' ':=' fieldRef=ID ';'
		//	'toFieldRef' ':=' toFieldRef=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSettingFromField' '{' 'fieldRef' ':=' fieldRef=ID ';' 'toFieldRef' ':=' toFieldRef=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSettingFromField'
		public Keyword getGSSExportSettingFromFieldKeyword_0() { return cGSSExportSettingFromFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fieldRef'
		public Keyword getFieldRefKeyword_2() { return cFieldRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fieldRef=ID
		public Assignment getFieldRefAssignment_4() { return cFieldRefAssignment_4; }
		
		//ID
		public RuleCall getFieldRefIDTerminalRuleCall_4_0() { return cFieldRefIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=ID
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//ID
		public RuleCall getToFieldRefIDTerminalRuleCall_8_0() { return cToFieldRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSExportSettingAIFromConstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingAIFromConst");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSettingAIFromConstKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueINTEGERParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToFieldRefIDTerminalRuleCall_8_0 = (RuleCall)cToFieldRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSExportSettingAIFromConst:
		//	'GSSExportSettingAIFromConst' '{'
		//	'value' ':=' value=INTEGER ';'
		//	'toFieldRef' ':=' toFieldRef=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSettingAIFromConst' '{' 'value' ':=' value=INTEGER ';' 'toFieldRef' ':=' toFieldRef=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSettingAIFromConst'
		public Keyword getGSSExportSettingAIFromConstKeyword_0() { return cGSSExportSettingAIFromConstKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'value'
		public Keyword getValueKeyword_2() { return cValueKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//value=INTEGER
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_4_0() { return cValueINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=ID
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//ID
		public RuleCall getToFieldRefIDTerminalRuleCall_8_0() { return cToFieldRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSExportSettingAIFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettingAIFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportSettingAIFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFileIDTerminalRuleCall_4_0 = (RuleCall)cFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToFieldRefIDTerminalRuleCall_8_0 = (RuleCall)cToFieldRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cToArrayIndexKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cToArrayIndexAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cToArrayIndexINTEGERParserRuleCall_12_0 = (RuleCall)cToArrayIndexAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cOffsetKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cOffsetAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cOffsetINTEGERParserRuleCall_14_2_0 = (RuleCall)cOffsetAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cSizeKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cSizeAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final RuleCall cSizeINTEGERParserRuleCall_15_2_0 = (RuleCall)cSizeAssignment_15_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cLineKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cLineAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final RuleCall cLineINTEGERParserRuleCall_16_2_0 = (RuleCall)cLineAssignment_16_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//GSSExportSettingAIFromFile:
		//	'GSSExportSettingAIFromFile' '{'
		//	'file' ':=' file=ID ';'
		//	'toFieldRef' ':=' toFieldRef=ID ';'
		//	'toArrayIndex' ':=' toArrayIndex=INTEGER ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')?
		//	('line' ':=' line=INTEGER ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportSettingAIFromFile' '{' 'file' ':=' file=ID ';' 'toFieldRef' ':=' toFieldRef=ID ';' 'toArrayIndex' ':='
		//toArrayIndex=INTEGER ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('line' ':=' line=INTEGER
		//';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportSettingAIFromFile'
		public Keyword getGSSExportSettingAIFromFileKeyword_0() { return cGSSExportSettingAIFromFileKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'file'
		public Keyword getFileKeyword_2() { return cFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//file=ID
		public Assignment getFileAssignment_4() { return cFileAssignment_4; }
		
		//ID
		public RuleCall getFileIDTerminalRuleCall_4_0() { return cFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=ID
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//ID
		public RuleCall getToFieldRefIDTerminalRuleCall_8_0() { return cToFieldRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'toArrayIndex'
		public Keyword getToArrayIndexKeyword_10() { return cToArrayIndexKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//toArrayIndex=INTEGER
		public Assignment getToArrayIndexAssignment_12() { return cToArrayIndexAssignment_12; }
		
		//INTEGER
		public RuleCall getToArrayIndexINTEGERParserRuleCall_12_0() { return cToArrayIndexINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('offset' ':=' offset=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'offset'
		public Keyword getOffsetKeyword_14_0() { return cOffsetKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_14_2() { return cOffsetAssignment_14_2; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_14_2_0() { return cOffsetINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('size' ':=' size=INTEGER ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'size'
		public Keyword getSizeKeyword_15_0() { return cSizeKeyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_15_2() { return cSizeAssignment_15_2; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_15_2_0() { return cSizeINTEGERParserRuleCall_15_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//('line' ':=' line=INTEGER ';')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'line'
		public Keyword getLineKeyword_16_0() { return cLineKeyword_16_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16_1() { return cColonEqualsSignKeyword_16_1; }
		
		//line=INTEGER
		public Assignment getLineAssignment_16_2() { return cLineAssignment_16_2; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_16_2_0() { return cLineINTEGERParserRuleCall_16_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_16_3() { return cSemicolonKeyword_16_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class GSSExportActivateDICsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportActivateDICs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSExportActivateDICsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSExportActivateDICsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDICAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDICGSSExportDICParserRuleCall_3_0 = (RuleCall)cDICAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSExportActivateDICs:
		//	{GSSExportActivateDICs}
		//	'GSSExportActivateDICs' '{'
		//	DIC+=GSSExportDIC+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSExportActivateDICs} 'GSSExportActivateDICs' '{' DIC+=GSSExportDIC+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSExportActivateDICs}
		public Action getGSSExportActivateDICsAction_0() { return cGSSExportActivateDICsAction_0; }
		
		//'GSSExportActivateDICs'
		public Keyword getGSSExportActivateDICsKeyword_1() { return cGSSExportActivateDICsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//DIC+=GSSExportDIC+
		public Assignment getDICAssignment_3() { return cDICAssignment_3; }
		
		//GSSExportDIC
		public RuleCall getDICGSSExportDICParserRuleCall_3_0() { return cDICGSSExportDICParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSExportDICElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportDIC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSExportDICKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cDICRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDICRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDICRefIDTerminalRuleCall_8_0 = (RuleCall)cDICRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSExportDIC:
		//	'GSSExportDIC' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'DICRef' ':=' DICRef=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSExportDIC' '{' 'id' ':=' id=INTEGER ';' 'DICRef' ':=' DICRef=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSExportDIC'
		public Keyword getGSSExportDICKeyword_0() { return cGSSExportDICKeyword_0; }
		
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
		
		//'DICRef'
		public Keyword getDICRefKeyword_6() { return cDICRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//DICRef=ID
		public Assignment getDICRefAssignment_8() { return cDICRefAssignment_8; }
		
		//ID
		public RuleCall getDICRefIDTerminalRuleCall_8_0() { return cDICRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.EString");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.EBoolean");
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
	
	public class GSSExportUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBitsBitsKeyword_0_0 = (Keyword)cBitsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBytesBytesKeyword_1_0 = (Keyword)cBytesEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSExportUnit:
		//	bits | bytes;
		public EnumRule getRule() { return rule; }
		
		//bits | bytes
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//bits
		public EnumLiteralDeclaration getBitsEnumLiteralDeclaration_0() { return cBitsEnumLiteralDeclaration_0; }
		
		//'bits'
		public Keyword getBitsBitsKeyword_0_0() { return cBitsBitsKeyword_0_0; }
		
		//bytes
		public EnumLiteralDeclaration getBytesEnumLiteralDeclaration_1() { return cBytesEnumLiteralDeclaration_1; }
		
		//'bytes'
		public Keyword getBytesBytesKeyword_1_0() { return cBytesBytesKeyword_1_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSExportExportElements pGSSExportExport;
	private final GSSExportSizesElements pGSSExportSizes;
	private final GSSExportUnitElements eGSSExportUnit;
	private final GSSExportSizeFromFileLengthElements pGSSExportSizeFromFileLength;
	private final GSSExportSizeFromFileLineElements pGSSExportSizeFromFileLine;
	private final GSSExportSizeInBitsElements pGSSExportSizeInBits;
	private final GSSExportSettingsElements pGSSExportSettings;
	private final GSSExportSettingFromConstElements pGSSExportSettingFromConst;
	private final GSSExportSettingFromSizeElements pGSSExportSettingFromSize;
	private final GSSExportSettingFromFileElements pGSSExportSettingFromFile;
	private final GSSExportSettingFromFieldElements pGSSExportSettingFromField;
	private final GSSExportSettingAIFromConstElements pGSSExportSettingAIFromConst;
	private final GSSExportSettingAIFromFileElements pGSSExportSettingAIFromFile;
	private final GSSExportActivateDICsElements pGSSExportActivateDICs;
	private final GSSExportDICElements pGSSExportDIC;
	private final EStringElements pEString;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final EBooleanElements pEBoolean;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EXPORTGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSExportExport = new GSSExportExportElements();
		this.pGSSExportSizes = new GSSExportSizesElements();
		this.eGSSExportUnit = new GSSExportUnitElements();
		this.pGSSExportSizeFromFileLength = new GSSExportSizeFromFileLengthElements();
		this.pGSSExportSizeFromFileLine = new GSSExportSizeFromFileLineElements();
		this.pGSSExportSizeInBits = new GSSExportSizeInBitsElements();
		this.pGSSExportSettings = new GSSExportSettingsElements();
		this.pGSSExportSettingFromConst = new GSSExportSettingFromConstElements();
		this.pGSSExportSettingFromSize = new GSSExportSettingFromSizeElements();
		this.pGSSExportSettingFromFile = new GSSExportSettingFromFileElements();
		this.pGSSExportSettingFromField = new GSSExportSettingFromFieldElements();
		this.pGSSExportSettingAIFromConst = new GSSExportSettingAIFromConstElements();
		this.pGSSExportSettingAIFromFile = new GSSExportSettingAIFromFileElements();
		this.pGSSExportActivateDICs = new GSSExportActivateDICsElements();
		this.pGSSExportDIC = new GSSExportDICElements();
		this.pEString = new EStringElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.export.EXPORT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.export.EXPORT".equals(grammar.getName())) {
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
	//	element=GSSExportExport
	public GSSModelFileElements getGSSModelFileAccess() {
		return pGSSModelFile;
	}
	
	public ParserRule getGSSModelFileRule() {
		return getGSSModelFileAccess().getRule();
	}
	
	//GSSModelFileImport common::GSSModelFileImport:
	//	'import' ':=' importURI=STRING ';'
	public GSSModelFileImportElements getGSSModelFileImportAccess() {
		return pGSSModelFileImport;
	}
	
	public ParserRule getGSSModelFileImportRule() {
		return getGSSModelFileImportAccess().getRule();
	}
	
	//GSSExportExport:
	//	'GSSExportExport'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
	//	'from' ':=' from=ID ';'
	//	'to' ':=' to=ID ';'
	//	Sizes=GSSExportSizes?
	//	settings=GSSExportSettings
	//	activateDICs=GSSExportActivateDICs?
	//	'}' ';';
	public GSSExportExportElements getGSSExportExportAccess() {
		return pGSSExportExport;
	}
	
	public ParserRule getGSSExportExportRule() {
		return getGSSExportExportAccess().getRule();
	}
	
	//GSSExportSizes:
	//	{GSSExportSizes}
	//	'GSSExportSizes' '{' (sizeFromFileLength+=GSSExportSizeFromFileLength | sizeFromFileLine+=GSSExportSizeFromFileLine |
	//	sizeInBits+=GSSExportSizeInBits)+
	//	'}' ';';
	public GSSExportSizesElements getGSSExportSizesAccess() {
		return pGSSExportSizes;
	}
	
	public ParserRule getGSSExportSizesRule() {
		return getGSSExportSizesAccess().getRule();
	}
	
	//enum GSSExportUnit:
	//	bits | bytes;
	public GSSExportUnitElements getGSSExportUnitAccess() {
		return eGSSExportUnit;
	}
	
	public EnumRule getGSSExportUnitRule() {
		return getGSSExportUnitAccess().getRule();
	}
	
	//GSSExportSizeFromFileLength:
	//	'GSSExportSizeFromFileLength' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'fromFile' ':=' fromFile=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')?
	//	'}' ';';
	public GSSExportSizeFromFileLengthElements getGSSExportSizeFromFileLengthAccess() {
		return pGSSExportSizeFromFileLength;
	}
	
	public ParserRule getGSSExportSizeFromFileLengthRule() {
		return getGSSExportSizeFromFileLengthAccess().getRule();
	}
	
	//GSSExportSizeFromFileLine:
	//	'GSSExportSizeFromFileLine' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'fromFile' ':=' fromFile=ID ';'
	//	'line' ':=' line=INTEGER ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')?
	//	'}' ';';
	public GSSExportSizeFromFileLineElements getGSSExportSizeFromFileLineAccess() {
		return pGSSExportSizeFromFileLine;
	}
	
	public ParserRule getGSSExportSizeFromFileLineRule() {
		return getGSSExportSizeFromFileLineAccess().getRule();
	}
	
	//GSSExportSizeInBits:
	//	'GSSExportSizeInBits' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'from' ':=' from=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=GSSExportUnit ';')?
	//	'}' ';';
	public GSSExportSizeInBitsElements getGSSExportSizeInBitsAccess() {
		return pGSSExportSizeInBits;
	}
	
	public ParserRule getGSSExportSizeInBitsRule() {
		return getGSSExportSizeInBitsAccess().getRule();
	}
	
	//GSSExportSettings:
	//	{GSSExportSettings}
	//	'GSSExportSettings' '{' (settingFromConst+=GSSExportSettingFromConst | settingFromSize+=GSSExportSettingFromSize |
	//	settingFromFile+=GSSExportSettingFromFile | settingFromField+=GSSExportSettingFromField |
	//	settingAIFromConst+=GSSExportSettingAIFromConst | settingAIFromFile+=GSSExportSettingAIFromFile)*
	//	'}' ';';
	public GSSExportSettingsElements getGSSExportSettingsAccess() {
		return pGSSExportSettings;
	}
	
	public ParserRule getGSSExportSettingsRule() {
		return getGSSExportSettingsAccess().getRule();
	}
	
	//GSSExportSettingFromConst:
	//	'GSSExportSettingFromConst' '{'
	//	'value' ':=' value=INTEGER ';'
	//	'toFieldRef' ':=' toFieldRef=ID ';'
	//	'}' ';';
	public GSSExportSettingFromConstElements getGSSExportSettingFromConstAccess() {
		return pGSSExportSettingFromConst;
	}
	
	public ParserRule getGSSExportSettingFromConstRule() {
		return getGSSExportSettingFromConstAccess().getRule();
	}
	
	//GSSExportSettingFromSize:
	//	'GSSExportSettingFromSize' '{'
	//	'sizeRef' ':=' sizeRef=INTEGER ';'
	//	'toFieldRef' ':=' toFieldRef=ID ';'
	//	'}' ';';
	public GSSExportSettingFromSizeElements getGSSExportSettingFromSizeAccess() {
		return pGSSExportSettingFromSize;
	}
	
	public ParserRule getGSSExportSettingFromSizeRule() {
		return getGSSExportSettingFromSizeAccess().getRule();
	}
	
	//GSSExportSettingFromFile:
	//	'GSSExportSettingFromFile' '{'
	//	'file' ':=' file=ID ';'
	//	'toFieldRef' ':=' toFieldRef=ID ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('line' ':='
	//	line=INTEGER ';')?
	//	'}' ';';
	public GSSExportSettingFromFileElements getGSSExportSettingFromFileAccess() {
		return pGSSExportSettingFromFile;
	}
	
	public ParserRule getGSSExportSettingFromFileRule() {
		return getGSSExportSettingFromFileAccess().getRule();
	}
	
	//GSSExportSettingFromField:
	//	'GSSExportSettingFromField' '{'
	//	'fieldRef' ':=' fieldRef=ID ';'
	//	'toFieldRef' ':=' toFieldRef=ID ';'
	//	'}' ';';
	public GSSExportSettingFromFieldElements getGSSExportSettingFromFieldAccess() {
		return pGSSExportSettingFromField;
	}
	
	public ParserRule getGSSExportSettingFromFieldRule() {
		return getGSSExportSettingFromFieldAccess().getRule();
	}
	
	//GSSExportSettingAIFromConst:
	//	'GSSExportSettingAIFromConst' '{'
	//	'value' ':=' value=INTEGER ';'
	//	'toFieldRef' ':=' toFieldRef=ID ';'
	//	'}' ';';
	public GSSExportSettingAIFromConstElements getGSSExportSettingAIFromConstAccess() {
		return pGSSExportSettingAIFromConst;
	}
	
	public ParserRule getGSSExportSettingAIFromConstRule() {
		return getGSSExportSettingAIFromConstAccess().getRule();
	}
	
	//GSSExportSettingAIFromFile:
	//	'GSSExportSettingAIFromFile' '{'
	//	'file' ':=' file=ID ';'
	//	'toFieldRef' ':=' toFieldRef=ID ';'
	//	'toArrayIndex' ':=' toArrayIndex=INTEGER ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')?
	//	('line' ':=' line=INTEGER ';')?
	//	'}' ';';
	public GSSExportSettingAIFromFileElements getGSSExportSettingAIFromFileAccess() {
		return pGSSExportSettingAIFromFile;
	}
	
	public ParserRule getGSSExportSettingAIFromFileRule() {
		return getGSSExportSettingAIFromFileAccess().getRule();
	}
	
	//GSSExportActivateDICs:
	//	{GSSExportActivateDICs}
	//	'GSSExportActivateDICs' '{'
	//	DIC+=GSSExportDIC+
	//	'}' ';';
	public GSSExportActivateDICsElements getGSSExportActivateDICsAccess() {
		return pGSSExportActivateDICs;
	}
	
	public ParserRule getGSSExportActivateDICsRule() {
		return getGSSExportActivateDICsAccess().getRule();
	}
	
	//GSSExportDIC:
	//	'GSSExportDIC' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'DICRef' ':=' DICRef=ID ';'
	//	'}' ';';
	public GSSExportDICElements getGSSExportDICAccess() {
		return pGSSExportDIC;
	}
	
	public ParserRule getGSSExportDICRule() {
		return getGSSExportDICAccess().getRule();
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
