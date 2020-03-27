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
package es.uah.aut.srg.gss.lang.format.services;

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
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FORMATGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSFormatFormatParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSFormatFormat
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSFormatFormat
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSFormatFormat
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSFormatFormat
		public RuleCall getElementGSSFormatFormatParserRuleCall_1_0() { return cElementGSSFormatFormatParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSModelFileImport");
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
	public class GSSFormatFormatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatFormatKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cUriKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUriAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUriQualifiedNameParserRuleCall_5_0 = (RuleCall)cUriAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cVersionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cVersionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cVersionVersionParserRuleCall_9_0 = (RuleCall)cVersionAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cProtocolKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cColonEqualsSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cProtocolAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cProtocolIDTerminalRuleCall_13_0 = (RuleCall)cProtocolAssignment_13.eContents().get(0);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSFormatFormatTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Assignment cFieldAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cFieldGSSFormatFieldParserRuleCall_19_0 = (RuleCall)cFieldAssignment_19.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//GSSFormatFormat:
		//	'GSSFormatFormat'
		//	name=ID
		//	'{'
		//	'uri' ':=' uri=QualifiedName ';'
		//	'version' ':=' version=Version ';'
		//	'protocol' ':=' protocol=ID ';'
		//	'type' ':=' type=GSSFormatFormatType ';'
		//	Field+=GSSFormatField*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatFormat' name=ID '{' 'uri' ':=' uri=QualifiedName ';' 'version' ':=' version=Version ';' 'protocol' ':='
		//protocol=ID ';' 'type' ':=' type=GSSFormatFormatType ';' Field+=GSSFormatField* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatFormat'
		public Keyword getGSSFormatFormatKeyword_0() { return cGSSFormatFormatKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'uri'
		public Keyword getUriKeyword_3() { return cUriKeyword_3; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_5() { return cUriAssignment_5; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_5_0() { return cUriQualifiedNameParserRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//'version'
		public Keyword getVersionKeyword_7() { return cVersionKeyword_7; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_8() { return cColonEqualsSignKeyword_8; }
		
		//version=Version
		public Assignment getVersionAssignment_9() { return cVersionAssignment_9; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_9_0() { return cVersionVersionParserRuleCall_9_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
		
		//'protocol'
		public Keyword getProtocolKeyword_11() { return cProtocolKeyword_11; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12() { return cColonEqualsSignKeyword_12; }
		
		//protocol=ID
		public Assignment getProtocolAssignment_13() { return cProtocolAssignment_13; }
		
		//ID
		public RuleCall getProtocolIDTerminalRuleCall_13_0() { return cProtocolIDTerminalRuleCall_13_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSFormatFormatType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSFormatFormatType
		public RuleCall getTypeGSSFormatFormatTypeEnumRuleCall_17_0() { return cTypeGSSFormatFormatTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//Field+=GSSFormatField*
		public Assignment getFieldAssignment_19() { return cFieldAssignment_19; }
		
		//GSSFormatField
		public RuleCall getFieldGSSFormatFieldParserRuleCall_19_0() { return cFieldGSSFormatFieldParserRuleCall_19_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
	}
	public class GSSFormatFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatField");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSFormatCSFieldParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSFormatCSFormulaFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSFormatVSFieldParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSFormatFDICFieldParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cGSSFormatVRFieldSizeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cGSSFormatAFieldParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cGSSFormatAIFieldParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//GSSFormatField:
		//	GSSFormatCSField | GSSFormatCSFormulaField | GSSFormatVSField | GSSFormatFDICField | GSSFormatVRFieldSize |
		//	GSSFormatAField | GSSFormatAIField;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSFormatCSField | GSSFormatCSFormulaField | GSSFormatVSField | GSSFormatFDICField | GSSFormatVRFieldSize |
		//GSSFormatAField | GSSFormatAIField
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSFormatCSField
		public RuleCall getGSSFormatCSFieldParserRuleCall_0() { return cGSSFormatCSFieldParserRuleCall_0; }
		
		//GSSFormatCSFormulaField
		public RuleCall getGSSFormatCSFormulaFieldParserRuleCall_1() { return cGSSFormatCSFormulaFieldParserRuleCall_1; }
		
		//GSSFormatVSField
		public RuleCall getGSSFormatVSFieldParserRuleCall_2() { return cGSSFormatVSFieldParserRuleCall_2; }
		
		//GSSFormatFDICField
		public RuleCall getGSSFormatFDICFieldParserRuleCall_3() { return cGSSFormatFDICFieldParserRuleCall_3; }
		
		//GSSFormatVRFieldSize
		public RuleCall getGSSFormatVRFieldSizeParserRuleCall_4() { return cGSSFormatVRFieldSizeParserRuleCall_4; }
		
		//GSSFormatAField
		public RuleCall getGSSFormatAFieldParserRuleCall_5() { return cGSSFormatAFieldParserRuleCall_5; }
		
		//GSSFormatAIField
		public RuleCall getGSSFormatAIFieldParserRuleCall_6() { return cGSSFormatAIFieldParserRuleCall_6; }
	}
	public class GSSFormatCSFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCSField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatCSFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Keyword cSemicolonKeyword_30 = (Keyword)cGroup.eContents().get(30);
		
		//GSSFormatCSField:
		//	'GSSFormatCSField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=GSSFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//	size=GSSFormatSize
		//	globalOffset=GSSFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatCSField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=GSSFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';' size=GSSFormatSize
		//globalOffset=GSSFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatCSField'
		public Keyword getGSSFormatCSFieldKeyword_0() { return cGSSFormatCSFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSFormatFieldType
		public RuleCall getTypeGSSFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSFormatFieldByteOrder
		public RuleCall getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSFormatSFieldFirstBit
		public RuleCall getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSFormatSize
		public RuleCall getSizeGSSFormatSizeParserRuleCall_27_0() { return cSizeGSSFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=GSSFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//GSSFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_29() { return cRightCurlyBracketKeyword_29; }
		
		//';'
		public Keyword getSemicolonKeyword_30() { return cSemicolonKeyword_30; }
	}
	public class GSSFormatCSFormulaFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCSFormulaField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatCSFormulaFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Assignment cFormulaAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cFormulaGSSFormatFormulaParserRuleCall_29_0 = (RuleCall)cFormulaAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSFormatCSFormulaField:
		//	'GSSFormatCSFormulaField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=GSSFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//	size=GSSFormatSize
		//	globalOffset=GSSFormatGlobalOffset
		//	formula=GSSFormatFormula
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatCSFormulaField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=GSSFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';' size=GSSFormatSize
		//globalOffset=GSSFormatGlobalOffset formula=GSSFormatFormula '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatCSFormulaField'
		public Keyword getGSSFormatCSFormulaFieldKeyword_0() { return cGSSFormatCSFormulaFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSFormatFieldType
		public RuleCall getTypeGSSFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSFormatFieldByteOrder
		public RuleCall getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSFormatSFieldFirstBit
		public RuleCall getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSFormatSize
		public RuleCall getSizeGSSFormatSizeParserRuleCall_27_0() { return cSizeGSSFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=GSSFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//GSSFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0; }
		
		//formula=GSSFormatFormula
		public Assignment getFormulaAssignment_29() { return cFormulaAssignment_29; }
		
		//GSSFormatFormula
		public RuleCall getFormulaGSSFormatFormulaParserRuleCall_29_0() { return cFormulaGSSFormatFormulaParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSFormatVSFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVSField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatVSFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cConstSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cConstSizeGSSFormatConstSizeParserRuleCall_27_0 = (RuleCall)cConstSizeAssignment_27.eContents().get(0);
		private final Assignment cVariableSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cVariableSizeGSSFormatVariableSizeParserRuleCall_28_0 = (RuleCall)cVariableSizeAssignment_28.eContents().get(0);
		private final Assignment cMaxSizeAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cMaxSizeGSSFormatMaxSizeParserRuleCall_29_0 = (RuleCall)cMaxSizeAssignment_29.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_30 = (Assignment)cGroup.eContents().get(30);
		private final RuleCall cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0 = (RuleCall)cGlobalOffsetAssignment_30.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_31 = (Keyword)cGroup.eContents().get(31);
		private final Keyword cSemicolonKeyword_32 = (Keyword)cGroup.eContents().get(32);
		
		//GSSFormatVSField:
		//	'GSSFormatVSField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=GSSFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//	constSize=GSSFormatConstSize
		//	variableSize=GSSFormatVariableSize
		//	maxSize=GSSFormatMaxSize
		//	globalOffset=GSSFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatVSField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=GSSFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//constSize=GSSFormatConstSize variableSize=GSSFormatVariableSize maxSize=GSSFormatMaxSize
		//globalOffset=GSSFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatVSField'
		public Keyword getGSSFormatVSFieldKeyword_0() { return cGSSFormatVSFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSFormatFieldType
		public RuleCall getTypeGSSFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSFormatFieldByteOrder
		public RuleCall getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSFormatSFieldFirstBit
		public RuleCall getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//constSize=GSSFormatConstSize
		public Assignment getConstSizeAssignment_27() { return cConstSizeAssignment_27; }
		
		//GSSFormatConstSize
		public RuleCall getConstSizeGSSFormatConstSizeParserRuleCall_27_0() { return cConstSizeGSSFormatConstSizeParserRuleCall_27_0; }
		
		//variableSize=GSSFormatVariableSize
		public Assignment getVariableSizeAssignment_28() { return cVariableSizeAssignment_28; }
		
		//GSSFormatVariableSize
		public RuleCall getVariableSizeGSSFormatVariableSizeParserRuleCall_28_0() { return cVariableSizeGSSFormatVariableSizeParserRuleCall_28_0; }
		
		//maxSize=GSSFormatMaxSize
		public Assignment getMaxSizeAssignment_29() { return cMaxSizeAssignment_29; }
		
		//GSSFormatMaxSize
		public RuleCall getMaxSizeGSSFormatMaxSizeParserRuleCall_29_0() { return cMaxSizeGSSFormatMaxSizeParserRuleCall_29_0; }
		
		//globalOffset=GSSFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_30() { return cGlobalOffsetAssignment_30; }
		
		//GSSFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0() { return cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_31() { return cRightCurlyBracketKeyword_31; }
		
		//';'
		public Keyword getSemicolonKeyword_32() { return cSemicolonKeyword_32; }
	}
	public class GSSFormatVRFieldSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVRFieldSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatVRFieldSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSFormatVRFieldSize:
		//	'GSSFormatVRFieldSize' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatVRFieldSize' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatVRFieldSize'
		public Keyword getGSSFormatVRFieldSizeKeyword_0() { return cGSSFormatVRFieldSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSFormatFDICFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFDICField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatFDICFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cCheckTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cCheckTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0 = (RuleCall)cCheckTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cFloatingOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0 = (RuleCall)cFloatingOffsetAssignment_28.eContents().get(0);
		private final Assignment cSortedFieldsToCheckAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0 = (RuleCall)cSortedFieldsToCheckAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSFormatFDICField:
		//	'GSSFormatFDICField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'checkType' ':=' checkType=GSSFormatCheckType ';'
		//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//	size=GSSFormatSize
		//	floatingOffset=GSSFormatFloatingOffset
		//	sortedFieldsToCheck=GSSFormatSortedFieldsToCheck
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatFDICField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'checkType' ':=' checkType=GSSFormatCheckType ';' 'byteOrder' ':='
		//byteOrder=GSSFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';' size=GSSFormatSize
		//floatingOffset=GSSFormatFloatingOffset sortedFieldsToCheck=GSSFormatSortedFieldsToCheck '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatFDICField'
		public Keyword getGSSFormatFDICFieldKeyword_0() { return cGSSFormatFDICFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'checkType'
		public Keyword getCheckTypeKeyword_15() { return cCheckTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//checkType=GSSFormatCheckType
		public Assignment getCheckTypeAssignment_17() { return cCheckTypeAssignment_17; }
		
		//GSSFormatCheckType
		public RuleCall getCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0() { return cCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSFormatFieldByteOrder
		public RuleCall getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSFormatSFieldFirstBit
		public RuleCall getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSFormatSize
		public RuleCall getSizeGSSFormatSizeParserRuleCall_27_0() { return cSizeGSSFormatSizeParserRuleCall_27_0; }
		
		//floatingOffset=GSSFormatFloatingOffset
		public Assignment getFloatingOffsetAssignment_28() { return cFloatingOffsetAssignment_28; }
		
		//GSSFormatFloatingOffset
		public RuleCall getFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0() { return cFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0; }
		
		//sortedFieldsToCheck=GSSFormatSortedFieldsToCheck
		public Assignment getSortedFieldsToCheckAssignment_29() { return cSortedFieldsToCheckAssignment_29; }
		
		//GSSFormatSortedFieldsToCheck
		public RuleCall getSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0() { return cSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSFormatAFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatAField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatAFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cArrayDimensionAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0 = (RuleCall)cArrayDimensionAssignment_27.eContents().get(0);
		private final Assignment cSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cSizeGSSFormatSizeParserRuleCall_28_0 = (RuleCall)cSizeAssignment_28.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0 = (RuleCall)cGlobalOffsetAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSFormatAField:
		//	'GSSFormatAField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=GSSFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//	arrayDimension=GSSFormatArrayDimension
		//	size=GSSFormatSize
		//	globalOffset=GSSFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatAField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';' ('description'
		//':=' description=STRING ';')? 'type' ':=' type=GSSFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//arrayDimension=GSSFormatArrayDimension size=GSSFormatSize globalOffset=GSSFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatAField'
		public Keyword getGSSFormatAFieldKeyword_0() { return cGSSFormatAFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSFormatFieldType
		public RuleCall getTypeGSSFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSFormatFieldByteOrder
		public RuleCall getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSFormatSFieldFirstBit
		public RuleCall getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//arrayDimension=GSSFormatArrayDimension
		public Assignment getArrayDimensionAssignment_27() { return cArrayDimensionAssignment_27; }
		
		//GSSFormatArrayDimension
		public RuleCall getArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0() { return cArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0; }
		
		//size=GSSFormatSize
		public Assignment getSizeAssignment_28() { return cSizeAssignment_28; }
		
		//GSSFormatSize
		public RuleCall getSizeGSSFormatSizeParserRuleCall_28_0() { return cSizeGSSFormatSizeParserRuleCall_28_0; }
		
		//globalOffset=GSSFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_29() { return cGlobalOffsetAssignment_29; }
		
		//GSSFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0() { return cGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSFormatAIFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatAIField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatAIFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cArrayRefAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cArrayRefGSSFormatArrayRefParserRuleCall_27_0 = (RuleCall)cArrayRefAssignment_27.eContents().get(0);
		private final Assignment cSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cSizeGSSFormatSizeParserRuleCall_28_0 = (RuleCall)cSizeAssignment_28.eContents().get(0);
		private final Assignment cLocalOffsetAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0 = (RuleCall)cLocalOffsetAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSFormatAIField:
		//	'GSSFormatAIField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=GSSFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
		//	arrayRef=GSSFormatArrayRef
		//	size=GSSFormatSize
		//	localOffset=GSSFormatLocalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatAIField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=GSSFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';' arrayRef=GSSFormatArrayRef
		//size=GSSFormatSize localOffset=GSSFormatLocalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatAIField'
		public Keyword getGSSFormatAIFieldKeyword_0() { return cGSSFormatAIFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSFormatFieldType
		public RuleCall getTypeGSSFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSFormatFieldByteOrder
		public RuleCall getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSFormatSFieldFirstBit
		public RuleCall getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//arrayRef=GSSFormatArrayRef
		public Assignment getArrayRefAssignment_27() { return cArrayRefAssignment_27; }
		
		//GSSFormatArrayRef
		public RuleCall getArrayRefGSSFormatArrayRefParserRuleCall_27_0() { return cArrayRefGSSFormatArrayRefParserRuleCall_27_0; }
		
		//size=GSSFormatSize
		public Assignment getSizeAssignment_28() { return cSizeAssignment_28; }
		
		//GSSFormatSize
		public RuleCall getSizeGSSFormatSizeParserRuleCall_28_0() { return cSizeGSSFormatSizeParserRuleCall_28_0; }
		
		//localOffset=GSSFormatLocalOffset
		public Assignment getLocalOffsetAssignment_29() { return cLocalOffsetAssignment_29; }
		
		//GSSFormatLocalOffset
		public RuleCall getLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0() { return cLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSFormatSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatSize GSSFormatBytesBits:
		//	'GSSFormatSize'
		//	'{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatSize'
		public Keyword getGSSFormatSizeKeyword_0() { return cGSSFormatSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatGlobalOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatGlobalOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatGlobalOffset GSSFormatBytesBits:
		//	'GSSFormatGlobalOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatGlobalOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatGlobalOffset'
		public Keyword getGSSFormatGlobalOffsetKeyword_0() { return cGSSFormatGlobalOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatFormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatFormulaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSlopeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSlopeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSlopeSTRINGTerminalRuleCall_4_0 = (RuleCall)cSlopeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cInterceptKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cInterceptAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cInterceptSTRINGTerminalRuleCall_8_0 = (RuleCall)cInterceptAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatFormula:
		//	'GSSFormatFormula' '{'
		//	'slope' ':=' slope=STRING ';'
		//	'intercept' ':=' intercept=STRING ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatFormula' '{' 'slope' ':=' slope=STRING ';' 'intercept' ':=' intercept=STRING ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatFormula'
		public Keyword getGSSFormatFormulaKeyword_0() { return cGSSFormatFormulaKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'slope'
		public Keyword getSlopeKeyword_2() { return cSlopeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//slope=STRING
		public Assignment getSlopeAssignment_4() { return cSlopeAssignment_4; }
		
		//STRING
		public RuleCall getSlopeSTRINGTerminalRuleCall_4_0() { return cSlopeSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'intercept'
		public Keyword getInterceptKeyword_6() { return cInterceptKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//intercept=STRING
		public Assignment getInterceptAssignment_8() { return cInterceptAssignment_8; }
		
		//STRING
		public RuleCall getInterceptSTRINGTerminalRuleCall_8_0() { return cInterceptSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatConstSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatConstSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatConstSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatConstSize GSSFormatBytesBits:
		//	'GSSFormatConstSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatConstSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatConstSize'
		public Keyword getGSSFormatConstSizeKeyword_0() { return cGSSFormatConstSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatMaxSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatMaxSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatMaxSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatMaxSize GSSFormatBytesBits:
		//	'GSSFormatMaxSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatMaxSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatMaxSize'
		public Keyword getGSSFormatMaxSizeKeyword_0() { return cGSSFormatMaxSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatVariableSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVariableSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatVariableSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cUnitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cUnitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cUnitGSSFormatUnitEnumRuleCall_8_0 = (RuleCall)cUnitAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cPowerKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cPowerAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cPowerGSSFormatPowerEnumRuleCall_10_2_0 = (RuleCall)cPowerAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSFormatVariableSize:
		//	'GSSFormatVariableSize' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'unit' ':=' unit=GSSFormatUnit ';' ('power' ':=' power=GSSFormatPower ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatVariableSize' '{' 'fidRef' ':=' fidRef=INTEGER ';' 'unit' ':=' unit=GSSFormatUnit ';' ('power' ':='
		//power=GSSFormatPower ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatVariableSize'
		public Keyword getGSSFormatVariableSizeKeyword_0() { return cGSSFormatVariableSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'unit'
		public Keyword getUnitKeyword_6() { return cUnitKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//unit=GSSFormatUnit
		public Assignment getUnitAssignment_8() { return cUnitAssignment_8; }
		
		//GSSFormatUnit
		public RuleCall getUnitGSSFormatUnitEnumRuleCall_8_0() { return cUnitGSSFormatUnitEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('power' ':=' power=GSSFormatPower ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'power'
		public Keyword getPowerKeyword_10_0() { return cPowerKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//power=GSSFormatPower
		public Assignment getPowerAssignment_10_2() { return cPowerAssignment_10_2; }
		
		//GSSFormatPower
		public RuleCall getPowerGSSFormatPowerEnumRuleCall_10_2_0() { return cPowerGSSFormatPowerEnumRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSFormatFloatingOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFloatingOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatFloatingOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFormatFloatingOffset:
		//	'GSSFormatFloatingOffset' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatFloatingOffset' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatFloatingOffset'
		public Keyword getGSSFormatFloatingOffsetKeyword_0() { return cGSSFormatFloatingOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFormatSortedFieldsToCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSortedFieldsToCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSFormatSortedFieldsToCheckAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSFormatSortedFieldsToCheckKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldToCheckAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0 = (RuleCall)cFieldToCheckAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSFormatSortedFieldsToCheck:
		//	{GSSFormatSortedFieldsToCheck}
		//	'GSSFormatSortedFieldsToCheck' '{'
		//	fieldToCheck+=GSSFormatFieldToCheck+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSFormatSortedFieldsToCheck} 'GSSFormatSortedFieldsToCheck' '{' fieldToCheck+=GSSFormatFieldToCheck+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{GSSFormatSortedFieldsToCheck}
		public Action getGSSFormatSortedFieldsToCheckAction_0() { return cGSSFormatSortedFieldsToCheckAction_0; }
		
		//'GSSFormatSortedFieldsToCheck'
		public Keyword getGSSFormatSortedFieldsToCheckKeyword_1() { return cGSSFormatSortedFieldsToCheckKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fieldToCheck+=GSSFormatFieldToCheck+
		public Assignment getFieldToCheckAssignment_3() { return cFieldToCheckAssignment_3; }
		
		//GSSFormatFieldToCheck
		public RuleCall getFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0() { return cFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSFormatFieldToCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldToCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatFieldToCheckKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFormatFieldToCheck:
		//	'GSSFormatFieldToCheck' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatFieldToCheck' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatFieldToCheck'
		public Keyword getGSSFormatFieldToCheckKeyword_0() { return cGSSFormatFieldToCheckKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFormatArrayDimensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatArrayDimension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatArrayDimensionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMaxItemsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMaxItemsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMaxItemsINTEGERParserRuleCall_8_0 = (RuleCall)cMaxItemsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatArrayDimension:
		//	'GSSFormatArrayDimension' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'maxItems' ':=' maxItems=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatArrayDimension' '{' 'fidRef' ':=' fidRef=INTEGER ';' 'maxItems' ':=' maxItems=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatArrayDimension'
		public Keyword getGSSFormatArrayDimensionKeyword_0() { return cGSSFormatArrayDimensionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'maxItems'
		public Keyword getMaxItemsKeyword_6() { return cMaxItemsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//maxItems=INTEGER
		public Assignment getMaxItemsAssignment_8() { return cMaxItemsAssignment_8; }
		
		//INTEGER
		public RuleCall getMaxItemsINTEGERParserRuleCall_8_0() { return cMaxItemsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatLocalOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatLocalOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatLocalOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSFormatLocalOffset GSSFormatBytesBits:
		//	'GSSFormatLocalOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatLocalOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatLocalOffset'
		public Keyword getGSSFormatLocalOffsetKeyword_0() { return cGSSFormatLocalOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSFormatArrayRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatArrayRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFormatArrayRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFormatArrayRef:
		//	'GSSFormatArrayRef' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFormatArrayRef' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFormatArrayRef'
		public Keyword getGSSFormatArrayRefKeyword_0() { return cGSSFormatArrayRefKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.Version");
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
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
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
	
	public class GSSFormatFormatTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormatType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTMEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTMTMKeyword_0_0 = (Keyword)cTMEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTCTCKeyword_1_0 = (Keyword)cTCEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSFormatFormatType:
		//	TM | TC;
		public EnumRule getRule() { return rule; }
		
		//TM | TC
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TM
		public EnumLiteralDeclaration getTMEnumLiteralDeclaration_0() { return cTMEnumLiteralDeclaration_0; }
		
		//'TM'
		public Keyword getTMTMKeyword_0_0() { return cTMTMKeyword_0_0; }
		
		//TC
		public EnumLiteralDeclaration getTCEnumLiteralDeclaration_1() { return cTCEnumLiteralDeclaration_1; }
		
		//'TC'
		public Keyword getTCTCKeyword_1_0() { return cTCTCKeyword_1_0; }
	}
	public class GSSFormatFieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStructuredEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStructuredStructuredKeyword_0_0 = (Keyword)cStructuredEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cUintEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cUintUintKeyword_1_0 = (Keyword)cUintEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFlagEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFlagFlagKeyword_2_0 = (Keyword)cFlagEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cEnumeratedEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cEnumeratedEnumeratedKeyword_3_0 = (Keyword)cEnumeratedEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBit_vectorEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBit_vectorBit_vectorKeyword_4_0 = (Keyword)cBit_vectorEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cByte_vectorEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cByte_vectorByte_vectorKeyword_5_0 = (Keyword)cByte_vectorEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cFloatFloatKeyword_6_0 = (Keyword)cFloatEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDeducedEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDeducedDeducedKeyword_7_0 = (Keyword)cDeducedEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum GSSFormatFieldType:
		//	structured | uint | flag |
		//	enumerated | bit_vector |
		//	byte_vector | float | deduced;
		public EnumRule getRule() { return rule; }
		
		//structured | uint | flag | enumerated | bit_vector | byte_vector | float | deduced
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//structured
		public EnumLiteralDeclaration getStructuredEnumLiteralDeclaration_0() { return cStructuredEnumLiteralDeclaration_0; }
		
		//'structured'
		public Keyword getStructuredStructuredKeyword_0_0() { return cStructuredStructuredKeyword_0_0; }
		
		//uint
		public EnumLiteralDeclaration getUintEnumLiteralDeclaration_1() { return cUintEnumLiteralDeclaration_1; }
		
		//'uint'
		public Keyword getUintUintKeyword_1_0() { return cUintUintKeyword_1_0; }
		
		//flag
		public EnumLiteralDeclaration getFlagEnumLiteralDeclaration_2() { return cFlagEnumLiteralDeclaration_2; }
		
		//'flag'
		public Keyword getFlagFlagKeyword_2_0() { return cFlagFlagKeyword_2_0; }
		
		//enumerated
		public EnumLiteralDeclaration getEnumeratedEnumLiteralDeclaration_3() { return cEnumeratedEnumLiteralDeclaration_3; }
		
		//'enumerated'
		public Keyword getEnumeratedEnumeratedKeyword_3_0() { return cEnumeratedEnumeratedKeyword_3_0; }
		
		//bit_vector
		public EnumLiteralDeclaration getBit_vectorEnumLiteralDeclaration_4() { return cBit_vectorEnumLiteralDeclaration_4; }
		
		//'bit_vector'
		public Keyword getBit_vectorBit_vectorKeyword_4_0() { return cBit_vectorBit_vectorKeyword_4_0; }
		
		//byte_vector
		public EnumLiteralDeclaration getByte_vectorEnumLiteralDeclaration_5() { return cByte_vectorEnumLiteralDeclaration_5; }
		
		//'byte_vector'
		public Keyword getByte_vectorByte_vectorKeyword_5_0() { return cByte_vectorByte_vectorKeyword_5_0; }
		
		//float
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_6() { return cFloatEnumLiteralDeclaration_6; }
		
		//'float'
		public Keyword getFloatFloatKeyword_6_0() { return cFloatFloatKeyword_6_0; }
		
		//deduced
		public EnumLiteralDeclaration getDeducedEnumLiteralDeclaration_7() { return cDeducedEnumLiteralDeclaration_7; }
		
		//'deduced'
		public Keyword getDeducedDeducedKeyword_7_0() { return cDeducedDeducedKeyword_7_0; }
	}
	public class GSSFormatFieldByteOrderElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBig_endianEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBig_endianBig_endianKeyword_0_0 = (Keyword)cBig_endianEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLittle_endianEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLittle_endianLittle_endianKeyword_1_0 = (Keyword)cLittle_endianEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNaEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNaNaKeyword_2_0 = (Keyword)cNaEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSFormatFieldByteOrder:
		//	big_endian | little_endian | na;
		public EnumRule getRule() { return rule; }
		
		//big_endian | little_endian | na
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//big_endian
		public EnumLiteralDeclaration getBig_endianEnumLiteralDeclaration_0() { return cBig_endianEnumLiteralDeclaration_0; }
		
		//'big_endian'
		public Keyword getBig_endianBig_endianKeyword_0_0() { return cBig_endianBig_endianKeyword_0_0; }
		
		//little_endian
		public EnumLiteralDeclaration getLittle_endianEnumLiteralDeclaration_1() { return cLittle_endianEnumLiteralDeclaration_1; }
		
		//'little_endian'
		public Keyword getLittle_endianLittle_endianKeyword_1_0() { return cLittle_endianLittle_endianKeyword_1_0; }
		
		//na
		public EnumLiteralDeclaration getNaEnumLiteralDeclaration_2() { return cNaEnumLiteralDeclaration_2; }
		
		//'na'
		public Keyword getNaNaKeyword_2_0() { return cNaNaKeyword_2_0; }
	}
	public class GSSFormatSFieldFirstBitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMSBEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMSBMSBKeyword_0_0 = (Keyword)cMSBEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLSBEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLSBLSBKeyword_1_0 = (Keyword)cLSBEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSFormatSFieldFirstBit:
		//	MSB | LSB;
		public EnumRule getRule() { return rule; }
		
		//MSB | LSB
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MSB
		public EnumLiteralDeclaration getMSBEnumLiteralDeclaration_0() { return cMSBEnumLiteralDeclaration_0; }
		
		//'MSB'
		public Keyword getMSBMSBKeyword_0_0() { return cMSBMSBKeyword_0_0; }
		
		//LSB
		public EnumLiteralDeclaration getLSBEnumLiteralDeclaration_1() { return cLSBEnumLiteralDeclaration_1; }
		
		//'LSB'
		public Keyword getLSBLSBKeyword_1_0() { return cLSBLSBKeyword_1_0; }
	}
	public class GSSFormatUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBytesBytesKeyword_0_0 = (Keyword)cBytesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBitsBitsKeyword_1_0 = (Keyword)cBitsEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cHalfwordEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cHalfwordHalfwordKeyword_2_0 = (Keyword)cHalfwordEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cString10EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cString10String10Keyword_3_0 = (Keyword)cString10EnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cString17EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cString17String17Keyword_4_0 = (Keyword)cString17EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cString69EnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cString69String69Keyword_5_0 = (Keyword)cString69EnumLiteralDeclaration_5.eContents().get(0);
		
		//enum GSSFormatUnit:
		//	bytes | bits |
		//	halfword | string10 |
		//	string17 | string69;
		public EnumRule getRule() { return rule; }
		
		//bytes | bits | halfword | string10 | string17 | string69
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//bytes
		public EnumLiteralDeclaration getBytesEnumLiteralDeclaration_0() { return cBytesEnumLiteralDeclaration_0; }
		
		//'bytes'
		public Keyword getBytesBytesKeyword_0_0() { return cBytesBytesKeyword_0_0; }
		
		//bits
		public EnumLiteralDeclaration getBitsEnumLiteralDeclaration_1() { return cBitsEnumLiteralDeclaration_1; }
		
		//'bits'
		public Keyword getBitsBitsKeyword_1_0() { return cBitsBitsKeyword_1_0; }
		
		//halfword
		public EnumLiteralDeclaration getHalfwordEnumLiteralDeclaration_2() { return cHalfwordEnumLiteralDeclaration_2; }
		
		//'halfword'
		public Keyword getHalfwordHalfwordKeyword_2_0() { return cHalfwordHalfwordKeyword_2_0; }
		
		//string10
		public EnumLiteralDeclaration getString10EnumLiteralDeclaration_3() { return cString10EnumLiteralDeclaration_3; }
		
		//'string10'
		public Keyword getString10String10Keyword_3_0() { return cString10String10Keyword_3_0; }
		
		//string17
		public EnumLiteralDeclaration getString17EnumLiteralDeclaration_4() { return cString17EnumLiteralDeclaration_4; }
		
		//'string17'
		public Keyword getString17String17Keyword_4_0() { return cString17String17Keyword_4_0; }
		
		//string69
		public EnumLiteralDeclaration getString69EnumLiteralDeclaration_5() { return cString69EnumLiteralDeclaration_5; }
		
		//'string69'
		public Keyword getString69String69Keyword_5_0() { return cString69String69Keyword_5_0; }
	}
	public class GSSFormatPowerElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatPower");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_22bitsKeyword_0_0 = (Keyword)c_2EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2_with_0EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_2_with_02bits_with_0Keyword_1_0 = (Keyword)c_2_with_0EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSFormatPower:
		//	_2='2bits' | _2_with_0='2bits_with_0';
		public EnumRule getRule() { return rule; }
		
		//_2='2bits' | _2_with_0='2bits_with_0'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_2='2bits'
		public EnumLiteralDeclaration get_2EnumLiteralDeclaration_0() { return c_2EnumLiteralDeclaration_0; }
		
		//'2bits'
		public Keyword get_22bitsKeyword_0_0() { return c_22bitsKeyword_0_0; }
		
		//_2_with_0='2bits_with_0'
		public EnumLiteralDeclaration get_2_with_0EnumLiteralDeclaration_1() { return c_2_with_0EnumLiteralDeclaration_1; }
		
		//'2bits_with_0'
		public Keyword get_2_with_02bits_with_0Keyword_1_0() { return c_2_with_02bits_with_0Keyword_1_0; }
	}
	public class GSSFormatCheckTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCheckType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCrc16EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCrc16Crc16Keyword_0_0 = (Keyword)cCrc16EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cChecksum16EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cChecksum16Checksum16Keyword_1_0 = (Keyword)cChecksum16EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSFormatCheckType:
		//	crc16 | checksum16;
		public EnumRule getRule() { return rule; }
		
		//crc16 | checksum16
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//crc16
		public EnumLiteralDeclaration getCrc16EnumLiteralDeclaration_0() { return cCrc16EnumLiteralDeclaration_0; }
		
		//'crc16'
		public Keyword getCrc16Crc16Keyword_0_0() { return cCrc16Crc16Keyword_0_0; }
		
		//checksum16
		public EnumLiteralDeclaration getChecksum16EnumLiteralDeclaration_1() { return cChecksum16EnumLiteralDeclaration_1; }
		
		//'checksum16'
		public Keyword getChecksum16Checksum16Keyword_1_0() { return cChecksum16Checksum16Keyword_1_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSFormatFormatElements pGSSFormatFormat;
	private final GSSFormatFormatTypeElements eGSSFormatFormatType;
	private final GSSFormatFieldElements pGSSFormatField;
	private final GSSFormatCSFieldElements pGSSFormatCSField;
	private final GSSFormatCSFormulaFieldElements pGSSFormatCSFormulaField;
	private final GSSFormatVSFieldElements pGSSFormatVSField;
	private final GSSFormatVRFieldSizeElements pGSSFormatVRFieldSize;
	private final GSSFormatFDICFieldElements pGSSFormatFDICField;
	private final GSSFormatAFieldElements pGSSFormatAField;
	private final GSSFormatAIFieldElements pGSSFormatAIField;
	private final GSSFormatFieldTypeElements eGSSFormatFieldType;
	private final GSSFormatFieldByteOrderElements eGSSFormatFieldByteOrder;
	private final GSSFormatSFieldFirstBitElements eGSSFormatSFieldFirstBit;
	private final GSSFormatSizeElements pGSSFormatSize;
	private final GSSFormatGlobalOffsetElements pGSSFormatGlobalOffset;
	private final GSSFormatFormulaElements pGSSFormatFormula;
	private final GSSFormatConstSizeElements pGSSFormatConstSize;
	private final GSSFormatMaxSizeElements pGSSFormatMaxSize;
	private final GSSFormatVariableSizeElements pGSSFormatVariableSize;
	private final GSSFormatUnitElements eGSSFormatUnit;
	private final GSSFormatPowerElements eGSSFormatPower;
	private final GSSFormatCheckTypeElements eGSSFormatCheckType;
	private final GSSFormatFloatingOffsetElements pGSSFormatFloatingOffset;
	private final GSSFormatSortedFieldsToCheckElements pGSSFormatSortedFieldsToCheck;
	private final GSSFormatFieldToCheckElements pGSSFormatFieldToCheck;
	private final GSSFormatArrayDimensionElements pGSSFormatArrayDimension;
	private final GSSFormatLocalOffsetElements pGSSFormatLocalOffset;
	private final GSSFormatArrayRefElements pGSSFormatArrayRef;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FORMATGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSFormatFormat = new GSSFormatFormatElements();
		this.eGSSFormatFormatType = new GSSFormatFormatTypeElements();
		this.pGSSFormatField = new GSSFormatFieldElements();
		this.pGSSFormatCSField = new GSSFormatCSFieldElements();
		this.pGSSFormatCSFormulaField = new GSSFormatCSFormulaFieldElements();
		this.pGSSFormatVSField = new GSSFormatVSFieldElements();
		this.pGSSFormatVRFieldSize = new GSSFormatVRFieldSizeElements();
		this.pGSSFormatFDICField = new GSSFormatFDICFieldElements();
		this.pGSSFormatAField = new GSSFormatAFieldElements();
		this.pGSSFormatAIField = new GSSFormatAIFieldElements();
		this.eGSSFormatFieldType = new GSSFormatFieldTypeElements();
		this.eGSSFormatFieldByteOrder = new GSSFormatFieldByteOrderElements();
		this.eGSSFormatSFieldFirstBit = new GSSFormatSFieldFirstBitElements();
		this.pGSSFormatSize = new GSSFormatSizeElements();
		this.pGSSFormatGlobalOffset = new GSSFormatGlobalOffsetElements();
		this.pGSSFormatFormula = new GSSFormatFormulaElements();
		this.pGSSFormatConstSize = new GSSFormatConstSizeElements();
		this.pGSSFormatMaxSize = new GSSFormatMaxSizeElements();
		this.pGSSFormatVariableSize = new GSSFormatVariableSizeElements();
		this.eGSSFormatUnit = new GSSFormatUnitElements();
		this.eGSSFormatPower = new GSSFormatPowerElements();
		this.eGSSFormatCheckType = new GSSFormatCheckTypeElements();
		this.pGSSFormatFloatingOffset = new GSSFormatFloatingOffsetElements();
		this.pGSSFormatSortedFieldsToCheck = new GSSFormatSortedFieldsToCheckElements();
		this.pGSSFormatFieldToCheck = new GSSFormatFieldToCheckElements();
		this.pGSSFormatArrayDimension = new GSSFormatArrayDimensionElements();
		this.pGSSFormatLocalOffset = new GSSFormatLocalOffsetElements();
		this.pGSSFormatArrayRef = new GSSFormatArrayRefElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.format.FORMAT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.format.FORMAT".equals(grammar.getName())) {
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
	//	element=GSSFormatFormat
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
	
	//GSSFormatFormat:
	//	'GSSFormatFormat'
	//	name=ID
	//	'{'
	//	'uri' ':=' uri=QualifiedName ';'
	//	'version' ':=' version=Version ';'
	//	'protocol' ':=' protocol=ID ';'
	//	'type' ':=' type=GSSFormatFormatType ';'
	//	Field+=GSSFormatField*
	//	'}' ';';
	public GSSFormatFormatElements getGSSFormatFormatAccess() {
		return pGSSFormatFormat;
	}
	
	public ParserRule getGSSFormatFormatRule() {
		return getGSSFormatFormatAccess().getRule();
	}
	
	//enum GSSFormatFormatType:
	//	TM | TC;
	public GSSFormatFormatTypeElements getGSSFormatFormatTypeAccess() {
		return eGSSFormatFormatType;
	}
	
	public EnumRule getGSSFormatFormatTypeRule() {
		return getGSSFormatFormatTypeAccess().getRule();
	}
	
	//GSSFormatField:
	//	GSSFormatCSField | GSSFormatCSFormulaField | GSSFormatVSField | GSSFormatFDICField | GSSFormatVRFieldSize |
	//	GSSFormatAField | GSSFormatAIField;
	public GSSFormatFieldElements getGSSFormatFieldAccess() {
		return pGSSFormatField;
	}
	
	public ParserRule getGSSFormatFieldRule() {
		return getGSSFormatFieldAccess().getRule();
	}
	
	//GSSFormatCSField:
	//	'GSSFormatCSField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=GSSFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
	//	size=GSSFormatSize
	//	globalOffset=GSSFormatGlobalOffset
	//	'}' ';';
	public GSSFormatCSFieldElements getGSSFormatCSFieldAccess() {
		return pGSSFormatCSField;
	}
	
	public ParserRule getGSSFormatCSFieldRule() {
		return getGSSFormatCSFieldAccess().getRule();
	}
	
	//GSSFormatCSFormulaField:
	//	'GSSFormatCSFormulaField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=GSSFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
	//	size=GSSFormatSize
	//	globalOffset=GSSFormatGlobalOffset
	//	formula=GSSFormatFormula
	//	'}' ';';
	public GSSFormatCSFormulaFieldElements getGSSFormatCSFormulaFieldAccess() {
		return pGSSFormatCSFormulaField;
	}
	
	public ParserRule getGSSFormatCSFormulaFieldRule() {
		return getGSSFormatCSFormulaFieldAccess().getRule();
	}
	
	//GSSFormatVSField:
	//	'GSSFormatVSField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=GSSFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
	//	constSize=GSSFormatConstSize
	//	variableSize=GSSFormatVariableSize
	//	maxSize=GSSFormatMaxSize
	//	globalOffset=GSSFormatGlobalOffset
	//	'}' ';';
	public GSSFormatVSFieldElements getGSSFormatVSFieldAccess() {
		return pGSSFormatVSField;
	}
	
	public ParserRule getGSSFormatVSFieldRule() {
		return getGSSFormatVSFieldAccess().getRule();
	}
	
	//GSSFormatVRFieldSize:
	//	'GSSFormatVRFieldSize' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'}' ';';
	public GSSFormatVRFieldSizeElements getGSSFormatVRFieldSizeAccess() {
		return pGSSFormatVRFieldSize;
	}
	
	public ParserRule getGSSFormatVRFieldSizeRule() {
		return getGSSFormatVRFieldSizeAccess().getRule();
	}
	
	//GSSFormatFDICField:
	//	'GSSFormatFDICField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'checkType' ':=' checkType=GSSFormatCheckType ';'
	//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
	//	size=GSSFormatSize
	//	floatingOffset=GSSFormatFloatingOffset
	//	sortedFieldsToCheck=GSSFormatSortedFieldsToCheck
	//	'}' ';';
	public GSSFormatFDICFieldElements getGSSFormatFDICFieldAccess() {
		return pGSSFormatFDICField;
	}
	
	public ParserRule getGSSFormatFDICFieldRule() {
		return getGSSFormatFDICFieldAccess().getRule();
	}
	
	//GSSFormatAField:
	//	'GSSFormatAField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=GSSFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
	//	arrayDimension=GSSFormatArrayDimension
	//	size=GSSFormatSize
	//	globalOffset=GSSFormatGlobalOffset
	//	'}' ';';
	public GSSFormatAFieldElements getGSSFormatAFieldAccess() {
		return pGSSFormatAField;
	}
	
	public ParserRule getGSSFormatAFieldRule() {
		return getGSSFormatAFieldAccess().getRule();
	}
	
	//GSSFormatAIField:
	//	'GSSFormatAIField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=GSSFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSFormatSFieldFirstBit ';'
	//	arrayRef=GSSFormatArrayRef
	//	size=GSSFormatSize
	//	localOffset=GSSFormatLocalOffset
	//	'}' ';';
	public GSSFormatAIFieldElements getGSSFormatAIFieldAccess() {
		return pGSSFormatAIField;
	}
	
	public ParserRule getGSSFormatAIFieldRule() {
		return getGSSFormatAIFieldAccess().getRule();
	}
	
	//enum GSSFormatFieldType:
	//	structured | uint | flag |
	//	enumerated | bit_vector |
	//	byte_vector | float | deduced;
	public GSSFormatFieldTypeElements getGSSFormatFieldTypeAccess() {
		return eGSSFormatFieldType;
	}
	
	public EnumRule getGSSFormatFieldTypeRule() {
		return getGSSFormatFieldTypeAccess().getRule();
	}
	
	//enum GSSFormatFieldByteOrder:
	//	big_endian | little_endian | na;
	public GSSFormatFieldByteOrderElements getGSSFormatFieldByteOrderAccess() {
		return eGSSFormatFieldByteOrder;
	}
	
	public EnumRule getGSSFormatFieldByteOrderRule() {
		return getGSSFormatFieldByteOrderAccess().getRule();
	}
	
	//enum GSSFormatSFieldFirstBit:
	//	MSB | LSB;
	public GSSFormatSFieldFirstBitElements getGSSFormatSFieldFirstBitAccess() {
		return eGSSFormatSFieldFirstBit;
	}
	
	public EnumRule getGSSFormatSFieldFirstBitRule() {
		return getGSSFormatSFieldFirstBitAccess().getRule();
	}
	
	//GSSFormatSize GSSFormatBytesBits:
	//	'GSSFormatSize'
	//	'{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSFormatSizeElements getGSSFormatSizeAccess() {
		return pGSSFormatSize;
	}
	
	public ParserRule getGSSFormatSizeRule() {
		return getGSSFormatSizeAccess().getRule();
	}
	
	//GSSFormatGlobalOffset GSSFormatBytesBits:
	//	'GSSFormatGlobalOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSFormatGlobalOffsetElements getGSSFormatGlobalOffsetAccess() {
		return pGSSFormatGlobalOffset;
	}
	
	public ParserRule getGSSFormatGlobalOffsetRule() {
		return getGSSFormatGlobalOffsetAccess().getRule();
	}
	
	//GSSFormatFormula:
	//	'GSSFormatFormula' '{'
	//	'slope' ':=' slope=STRING ';'
	//	'intercept' ':=' intercept=STRING ';'
	//	'}' ';';
	public GSSFormatFormulaElements getGSSFormatFormulaAccess() {
		return pGSSFormatFormula;
	}
	
	public ParserRule getGSSFormatFormulaRule() {
		return getGSSFormatFormulaAccess().getRule();
	}
	
	//GSSFormatConstSize GSSFormatBytesBits:
	//	'GSSFormatConstSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSFormatConstSizeElements getGSSFormatConstSizeAccess() {
		return pGSSFormatConstSize;
	}
	
	public ParserRule getGSSFormatConstSizeRule() {
		return getGSSFormatConstSizeAccess().getRule();
	}
	
	//GSSFormatMaxSize GSSFormatBytesBits:
	//	'GSSFormatMaxSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSFormatMaxSizeElements getGSSFormatMaxSizeAccess() {
		return pGSSFormatMaxSize;
	}
	
	public ParserRule getGSSFormatMaxSizeRule() {
		return getGSSFormatMaxSizeAccess().getRule();
	}
	
	//GSSFormatVariableSize:
	//	'GSSFormatVariableSize' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'unit' ':=' unit=GSSFormatUnit ';' ('power' ':=' power=GSSFormatPower ';')?
	//	'}' ';';
	public GSSFormatVariableSizeElements getGSSFormatVariableSizeAccess() {
		return pGSSFormatVariableSize;
	}
	
	public ParserRule getGSSFormatVariableSizeRule() {
		return getGSSFormatVariableSizeAccess().getRule();
	}
	
	//enum GSSFormatUnit:
	//	bytes | bits |
	//	halfword | string10 |
	//	string17 | string69;
	public GSSFormatUnitElements getGSSFormatUnitAccess() {
		return eGSSFormatUnit;
	}
	
	public EnumRule getGSSFormatUnitRule() {
		return getGSSFormatUnitAccess().getRule();
	}
	
	//enum GSSFormatPower:
	//	_2='2bits' | _2_with_0='2bits_with_0';
	public GSSFormatPowerElements getGSSFormatPowerAccess() {
		return eGSSFormatPower;
	}
	
	public EnumRule getGSSFormatPowerRule() {
		return getGSSFormatPowerAccess().getRule();
	}
	
	//enum GSSFormatCheckType:
	//	crc16 | checksum16;
	public GSSFormatCheckTypeElements getGSSFormatCheckTypeAccess() {
		return eGSSFormatCheckType;
	}
	
	public EnumRule getGSSFormatCheckTypeRule() {
		return getGSSFormatCheckTypeAccess().getRule();
	}
	
	//GSSFormatFloatingOffset:
	//	'GSSFormatFloatingOffset' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public GSSFormatFloatingOffsetElements getGSSFormatFloatingOffsetAccess() {
		return pGSSFormatFloatingOffset;
	}
	
	public ParserRule getGSSFormatFloatingOffsetRule() {
		return getGSSFormatFloatingOffsetAccess().getRule();
	}
	
	//GSSFormatSortedFieldsToCheck:
	//	{GSSFormatSortedFieldsToCheck}
	//	'GSSFormatSortedFieldsToCheck' '{'
	//	fieldToCheck+=GSSFormatFieldToCheck+
	//	'}' ';';
	public GSSFormatSortedFieldsToCheckElements getGSSFormatSortedFieldsToCheckAccess() {
		return pGSSFormatSortedFieldsToCheck;
	}
	
	public ParserRule getGSSFormatSortedFieldsToCheckRule() {
		return getGSSFormatSortedFieldsToCheckAccess().getRule();
	}
	
	//GSSFormatFieldToCheck:
	//	'GSSFormatFieldToCheck' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public GSSFormatFieldToCheckElements getGSSFormatFieldToCheckAccess() {
		return pGSSFormatFieldToCheck;
	}
	
	public ParserRule getGSSFormatFieldToCheckRule() {
		return getGSSFormatFieldToCheckAccess().getRule();
	}
	
	//GSSFormatArrayDimension:
	//	'GSSFormatArrayDimension' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'maxItems' ':=' maxItems=INTEGER ';'
	//	'}' ';';
	public GSSFormatArrayDimensionElements getGSSFormatArrayDimensionAccess() {
		return pGSSFormatArrayDimension;
	}
	
	public ParserRule getGSSFormatArrayDimensionRule() {
		return getGSSFormatArrayDimensionAccess().getRule();
	}
	
	//GSSFormatLocalOffset GSSFormatBytesBits:
	//	'GSSFormatLocalOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public GSSFormatLocalOffsetElements getGSSFormatLocalOffsetAccess() {
		return pGSSFormatLocalOffset;
	}
	
	public ParserRule getGSSFormatLocalOffsetRule() {
		return getGSSFormatLocalOffsetAccess().getRule();
	}
	
	//GSSFormatArrayRef:
	//	'GSSFormatArrayRef' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public GSSFormatArrayRefElements getGSSFormatArrayRefAccess() {
		return pGSSFormatArrayRef;
	}
	
	public ParserRule getGSSFormatArrayRefRule() {
		return getGSSFormatArrayRefAccess().getRule();
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
