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
package es.uah.aut.srg.gss.lang.filter.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FILTERGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSFilterFilterParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSFilterFilter
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSFilterFilter
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSFilterFilter
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSFilterFilter
		public RuleCall getElementGSSFilterFilterParserRuleCall_1_0() { return cElementGSSFilterFilterParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSModelFileImport");
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
	public class GSSFilterFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSFilterMaxtermFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSFilterMintermFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//GSSFilterFilter:
		//	GSSFilterMaxtermFilter | GSSFilterMintermFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSFilterMaxtermFilter | GSSFilterMintermFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSFilterMaxtermFilter
		public RuleCall getGSSFilterMaxtermFilterParserRuleCall_0() { return cGSSFilterMaxtermFilterParserRuleCall_0; }
		
		//GSSFilterMintermFilter
		public RuleCall getGSSFilterMintermFilterParserRuleCall_1() { return cGSSFilterMintermFilterParserRuleCall_1; }
	}
	public class GSSFilterMaxtermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMaxtermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMaxtermFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cFormatFileKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cColonEqualsSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cFormatFileAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final CrossReference cFormatFileGSSFormatFormatCrossReference_13_0 = (CrossReference)cFormatFileAssignment_13.eContents().get(0);
		private final RuleCall cFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1 = (RuleCall)cFormatFileGSSFormatFormatCrossReference_13_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cBoolVarAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0 = (RuleCall)cBoolVarAssignment_15.eContents().get(0);
		private final Assignment cMaxtermAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cMaxtermGSSFilterMaxtermParserRuleCall_16_0 = (RuleCall)cMaxtermAssignment_16.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//GSSFilterMaxtermFilter:
		//	'GSSFilterMaxtermFilter'
		//	name=ID
		//	'{'
		//	'uri' ':=' uri=QualifiedName ';'
		//	'version' ':=' version=Version ';'
		//	'formatFile' ':=' formatFile=[format::GSSFormatFormat|VersionedQualifiedName] ';'
		//	BoolVar+=GSSFilterAbstractBoolVar+
		//	Maxterm+=GSSFilterMaxterm+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMaxtermFilter' name=ID '{' 'uri' ':=' uri=QualifiedName ';' 'version' ':=' version=Version ';' 'formatFile'
		//':=' formatFile=[format::GSSFormatFormat|VersionedQualifiedName] ';' BoolVar+=GSSFilterAbstractBoolVar+
		//Maxterm+=GSSFilterMaxterm+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterMaxtermFilter'
		public Keyword getGSSFilterMaxtermFilterKeyword_0() { return cGSSFilterMaxtermFilterKeyword_0; }
		
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
		
		//'formatFile'
		public Keyword getFormatFileKeyword_11() { return cFormatFileKeyword_11; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12() { return cColonEqualsSignKeyword_12; }
		
		//formatFile=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getFormatFileAssignment_13() { return cFormatFileAssignment_13; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getFormatFileGSSFormatFormatCrossReference_13_0() { return cFormatFileGSSFormatFormatCrossReference_13_0; }
		
		//VersionedQualifiedName
		public RuleCall getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1() { return cFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
		
		//BoolVar+=GSSFilterAbstractBoolVar+
		public Assignment getBoolVarAssignment_15() { return cBoolVarAssignment_15; }
		
		//GSSFilterAbstractBoolVar
		public RuleCall getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0() { return cBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0; }
		
		//Maxterm+=GSSFilterMaxterm+
		public Assignment getMaxtermAssignment_16() { return cMaxtermAssignment_16; }
		
		//GSSFilterMaxterm
		public RuleCall getMaxtermGSSFilterMaxtermParserRuleCall_16_0() { return cMaxtermGSSFilterMaxtermParserRuleCall_16_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class GSSFilterAbstractBoolVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterAbstractBoolVar");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSFilterBoolVarParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSFilterBoolVarFromArrayItemParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSFilterBoolVarFDICParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//GSSFilterAbstractBoolVar:
		//	GSSFilterBoolVar | GSSFilterBoolVarFromArrayItem | GSSFilterBoolVarFromGroupedArrayItem | GSSFilterBoolVarFDIC;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSFilterBoolVar | GSSFilterBoolVarFromArrayItem | GSSFilterBoolVarFromGroupedArrayItem | GSSFilterBoolVarFDIC
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSFilterBoolVar
		public RuleCall getGSSFilterBoolVarParserRuleCall_0() { return cGSSFilterBoolVarParserRuleCall_0; }
		
		//GSSFilterBoolVarFromArrayItem
		public RuleCall getGSSFilterBoolVarFromArrayItemParserRuleCall_1() { return cGSSFilterBoolVarFromArrayItemParserRuleCall_1; }
		
		//GSSFilterBoolVarFromGroupedArrayItem
		public RuleCall getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2() { return cGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2; }
		
		//GSSFilterBoolVarFDIC
		public RuleCall getGSSFilterBoolVarFDICParserRuleCall_3() { return cGSSFilterBoolVarFDICParserRuleCall_3; }
	}
	public class GSSFilterMintermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMintermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMintermFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cFormatFileKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cColonEqualsSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cFormatFileAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final CrossReference cFormatFileGSSFormatFormatCrossReference_13_0 = (CrossReference)cFormatFileAssignment_13.eContents().get(0);
		private final RuleCall cFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1 = (RuleCall)cFormatFileGSSFormatFormatCrossReference_13_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cBoolVarAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0 = (RuleCall)cBoolVarAssignment_15.eContents().get(0);
		private final Assignment cMintermAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cMintermGSSFilterMintermParserRuleCall_16_0 = (RuleCall)cMintermAssignment_16.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//GSSFilterMintermFilter:
		//	'GSSFilterMintermFilter'
		//	name=ID
		//	'{'
		//	'uri' ':=' uri=QualifiedName ';'
		//	'version' ':=' version=Version ';'
		//	'formatFile' ':=' formatFile=[format::GSSFormatFormat|VersionedQualifiedName] ';'
		//	BoolVar+=GSSFilterAbstractBoolVar+
		//	Minterm+=GSSFilterMinterm+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMintermFilter' name=ID '{' 'uri' ':=' uri=QualifiedName ';' 'version' ':=' version=Version ';' 'formatFile'
		//':=' formatFile=[format::GSSFormatFormat|VersionedQualifiedName] ';' BoolVar+=GSSFilterAbstractBoolVar+
		//Minterm+=GSSFilterMinterm+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterMintermFilter'
		public Keyword getGSSFilterMintermFilterKeyword_0() { return cGSSFilterMintermFilterKeyword_0; }
		
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
		
		//'formatFile'
		public Keyword getFormatFileKeyword_11() { return cFormatFileKeyword_11; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12() { return cColonEqualsSignKeyword_12; }
		
		//formatFile=[format::GSSFormatFormat|VersionedQualifiedName]
		public Assignment getFormatFileAssignment_13() { return cFormatFileAssignment_13; }
		
		//[format::GSSFormatFormat|VersionedQualifiedName]
		public CrossReference getFormatFileGSSFormatFormatCrossReference_13_0() { return cFormatFileGSSFormatFormatCrossReference_13_0; }
		
		//VersionedQualifiedName
		public RuleCall getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1() { return cFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
		
		//BoolVar+=GSSFilterAbstractBoolVar+
		public Assignment getBoolVarAssignment_15() { return cBoolVarAssignment_15; }
		
		//GSSFilterAbstractBoolVar
		public RuleCall getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0() { return cBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0; }
		
		//Minterm+=GSSFilterMinterm+
		public Assignment getMintermAssignment_16() { return cMintermAssignment_16; }
		
		//GSSFilterMinterm
		public RuleCall getMintermGSSFilterMintermParserRuleCall_16_0() { return cMintermGSSFilterMintermParserRuleCall_16_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class GSSFilterBoolVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterBoolVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstantTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cConstantTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0 = (RuleCall)cConstantTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cFieldRefKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cFieldRefAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cFieldRefGSSFormatFieldCrossReference_16_0 = (CrossReference)cFieldRefAssignment_16.eContents().get(0);
		private final RuleCall cFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1 = (RuleCall)cFieldRefGSSFormatFieldCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cOpAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_18_0 = (RuleCall)cOpAssignment_18.eContents().get(0);
		private final Assignment cValueAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cValueGSSFilterValueParserRuleCall_19_0 = (RuleCall)cValueAssignment_19.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//GSSFilterBoolVar:
		//	'GSSFilterBoolVar' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=GSSFilterConstantType ';'
		//	'FieldRef' ':=' FieldRef=[format::GSSFormatField|VersionedQualifiedReferenceName] ';'
		//	Op=GSSFilterFieldOp
		//	Value=GSSFilterValue '}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVar' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=GSSFilterConstantType ';' 'FieldRef' ':='
		//FieldRef=[format::GSSFormatField|VersionedQualifiedReferenceName] ';' Op=GSSFilterFieldOp Value=GSSFilterValue '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterBoolVar'
		public Keyword getGSSFilterBoolVarKeyword_0() { return cGSSFilterBoolVarKeyword_0; }
		
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
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'constantType'
		public Keyword getConstantTypeKeyword_10() { return cConstantTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//constantType=GSSFilterConstantType
		public Assignment getConstantTypeAssignment_12() { return cConstantTypeAssignment_12; }
		
		//GSSFilterConstantType
		public RuleCall getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0() { return cConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'FieldRef'
		public Keyword getFieldRefKeyword_14() { return cFieldRefKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//FieldRef=[format::GSSFormatField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_16() { return cFieldRefAssignment_16; }
		
		//[format::GSSFormatField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefGSSFormatFieldCrossReference_16_0() { return cFieldRefGSSFormatFieldCrossReference_16_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1() { return cFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_18() { return cOpAssignment_18; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_18_0() { return cOpGSSFilterFieldOpParserRuleCall_18_0; }
		
		//Value=GSSFilterValue
		public Assignment getValueAssignment_19() { return cValueAssignment_19; }
		
		//GSSFilterValue
		public RuleCall getValueGSSFilterValueParserRuleCall_19_0() { return cValueGSSFilterValueParserRuleCall_19_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
	}
	public class GSSFilterBoolVarFromArrayItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFromArrayItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterBoolVarFromArrayItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstantTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cConstantTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0 = (RuleCall)cConstantTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cAIFieldRefKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cAIFieldRefAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cAIFieldRefGSSFormatAIFieldCrossReference_16_0 = (CrossReference)cAIFieldRefAssignment_16.eContents().get(0);
		private final RuleCall cAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1 = (RuleCall)cAIFieldRefGSSFormatAIFieldCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cOpAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_18_0 = (RuleCall)cOpAssignment_18.eContents().get(0);
		private final Alternatives cAlternatives_19 = (Alternatives)cGroup.eContents().get(19);
		private final Assignment cConstantAssignment_19_0 = (Assignment)cAlternatives_19.eContents().get(0);
		private final RuleCall cConstantGSSFilterConstantParserRuleCall_19_0_0 = (RuleCall)cConstantAssignment_19_0.eContents().get(0);
		private final Assignment cSelectAssignment_19_1 = (Assignment)cAlternatives_19.eContents().get(1);
		private final RuleCall cSelectGSSFilterSelectParserRuleCall_19_1_0 = (RuleCall)cSelectAssignment_19_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_19_2 = (Assignment)cAlternatives_19.eContents().get(2);
		private final RuleCall cSelectLineGSSFilterSelectLineParserRuleCall_19_2_0 = (RuleCall)cSelectLineAssignment_19_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//GSSFilterBoolVarFromArrayItem:
		//	'GSSFilterBoolVarFromArrayItem' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=GSSFilterConstantType ';'
		//	'AIFieldRef' ':=' AIFieldRef=[format::GSSFormatAIField|VersionedQualifiedReferenceName] ';'
		//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarFromArrayItem' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=GSSFilterConstantType ';' 'AIFieldRef' ':='
		//AIFieldRef=[format::GSSFormatAIField|VersionedQualifiedReferenceName] ';' Op=GSSFilterFieldOp
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterBoolVarFromArrayItem'
		public Keyword getGSSFilterBoolVarFromArrayItemKeyword_0() { return cGSSFilterBoolVarFromArrayItemKeyword_0; }
		
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
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'constantType'
		public Keyword getConstantTypeKeyword_10() { return cConstantTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//constantType=GSSFilterConstantType
		public Assignment getConstantTypeAssignment_12() { return cConstantTypeAssignment_12; }
		
		//GSSFilterConstantType
		public RuleCall getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0() { return cConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'AIFieldRef'
		public Keyword getAIFieldRefKeyword_14() { return cAIFieldRefKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//AIFieldRef=[format::GSSFormatAIField|VersionedQualifiedReferenceName]
		public Assignment getAIFieldRefAssignment_16() { return cAIFieldRefAssignment_16; }
		
		//[format::GSSFormatAIField|VersionedQualifiedReferenceName]
		public CrossReference getAIFieldRefGSSFormatAIFieldCrossReference_16_0() { return cAIFieldRefGSSFormatAIFieldCrossReference_16_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1() { return cAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_18() { return cOpAssignment_18; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_18_0() { return cOpGSSFilterFieldOpParserRuleCall_18_0; }
		
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		public Alternatives getAlternatives_19() { return cAlternatives_19; }
		
		//Constant=GSSFilterConstant
		public Assignment getConstantAssignment_19_0() { return cConstantAssignment_19_0; }
		
		//GSSFilterConstant
		public RuleCall getConstantGSSFilterConstantParserRuleCall_19_0_0() { return cConstantGSSFilterConstantParserRuleCall_19_0_0; }
		
		//Select=GSSFilterSelect
		public Assignment getSelectAssignment_19_1() { return cSelectAssignment_19_1; }
		
		//GSSFilterSelect
		public RuleCall getSelectGSSFilterSelectParserRuleCall_19_1_0() { return cSelectGSSFilterSelectParserRuleCall_19_1_0; }
		
		//SelectLine=GSSFilterSelectLine
		public Assignment getSelectLineAssignment_19_2() { return cSelectLineAssignment_19_2; }
		
		//GSSFilterSelectLine
		public RuleCall getSelectLineGSSFilterSelectLineParserRuleCall_19_2_0() { return cSelectLineGSSFilterSelectLineParserRuleCall_19_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
	}
	public class GSSFilterBoolVarFromGroupedArrayItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFromGroupedArrayItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterBoolVarFromGroupedArrayItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstantTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cConstantTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0 = (RuleCall)cConstantTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cGroupKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cGroupAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGroupIDTerminalRuleCall_16_0 = (RuleCall)cGroupAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cAIFieldRefsKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cAIFieldRefsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final CrossReference cAIFieldRefsGSSFormatAFieldCrossReference_20_0 = (CrossReference)cAIFieldRefsAssignment_20.eContents().get(0);
		private final RuleCall cAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1 = (RuleCall)cAIFieldRefsGSSFormatAFieldCrossReference_20_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Assignment cOpAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_22_0 = (RuleCall)cOpAssignment_22.eContents().get(0);
		private final Alternatives cAlternatives_23 = (Alternatives)cGroup.eContents().get(23);
		private final Assignment cConstantAssignment_23_0 = (Assignment)cAlternatives_23.eContents().get(0);
		private final RuleCall cConstantGSSFilterConstantParserRuleCall_23_0_0 = (RuleCall)cConstantAssignment_23_0.eContents().get(0);
		private final Assignment cSelectAssignment_23_1 = (Assignment)cAlternatives_23.eContents().get(1);
		private final RuleCall cSelectGSSFilterSelectParserRuleCall_23_1_0 = (RuleCall)cSelectAssignment_23_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_23_2 = (Assignment)cAlternatives_23.eContents().get(2);
		private final RuleCall cSelectLineGSSFilterSelectLineParserRuleCall_23_2_0 = (RuleCall)cSelectLineAssignment_23_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//GSSFilterBoolVarFromGroupedArrayItem:
		//	'GSSFilterBoolVarFromGroupedArrayItem' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=GSSFilterConstantType ';'
		//	'group' ':=' group=ID ';'
		//	'AIFieldRefs' ':=' AIFieldRefs=[format::GSSFormatAField|VersionedQualifiedReferenceName] ';'
		//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarFromGroupedArrayItem' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=GSSFilterConstantType ';' 'group' ':=' group=ID ';' 'AIFieldRefs' ':='
		//AIFieldRefs=[format::GSSFormatAField|VersionedQualifiedReferenceName] ';' Op=GSSFilterFieldOp
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterBoolVarFromGroupedArrayItem'
		public Keyword getGSSFilterBoolVarFromGroupedArrayItemKeyword_0() { return cGSSFilterBoolVarFromGroupedArrayItemKeyword_0; }
		
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
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'constantType'
		public Keyword getConstantTypeKeyword_10() { return cConstantTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//constantType=GSSFilterConstantType
		public Assignment getConstantTypeAssignment_12() { return cConstantTypeAssignment_12; }
		
		//GSSFilterConstantType
		public RuleCall getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0() { return cConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'group'
		public Keyword getGroupKeyword_14() { return cGroupKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//group=ID
		public Assignment getGroupAssignment_16() { return cGroupAssignment_16; }
		
		//ID
		public RuleCall getGroupIDTerminalRuleCall_16_0() { return cGroupIDTerminalRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'AIFieldRefs'
		public Keyword getAIFieldRefsKeyword_18() { return cAIFieldRefsKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//AIFieldRefs=[format::GSSFormatAField|VersionedQualifiedReferenceName]
		public Assignment getAIFieldRefsAssignment_20() { return cAIFieldRefsAssignment_20; }
		
		//[format::GSSFormatAField|VersionedQualifiedReferenceName]
		public CrossReference getAIFieldRefsGSSFormatAFieldCrossReference_20_0() { return cAIFieldRefsGSSFormatAFieldCrossReference_20_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1() { return cAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_22() { return cOpAssignment_22; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_22_0() { return cOpGSSFilterFieldOpParserRuleCall_22_0; }
		
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		public Alternatives getAlternatives_23() { return cAlternatives_23; }
		
		//Constant=GSSFilterConstant
		public Assignment getConstantAssignment_23_0() { return cConstantAssignment_23_0; }
		
		//GSSFilterConstant
		public RuleCall getConstantGSSFilterConstantParserRuleCall_23_0_0() { return cConstantGSSFilterConstantParserRuleCall_23_0_0; }
		
		//Select=GSSFilterSelect
		public Assignment getSelectAssignment_23_1() { return cSelectAssignment_23_1; }
		
		//GSSFilterSelect
		public RuleCall getSelectGSSFilterSelectParserRuleCall_23_1_0() { return cSelectGSSFilterSelectParserRuleCall_23_1_0; }
		
		//SelectLine=GSSFilterSelectLine
		public Assignment getSelectLineAssignment_23_2() { return cSelectLineAssignment_23_2; }
		
		//GSSFilterSelectLine
		public RuleCall getSelectLineGSSFilterSelectLineParserRuleCall_23_2_0() { return cSelectLineGSSFilterSelectLineParserRuleCall_23_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class GSSFilterBoolVarFDICElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFDIC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterBoolVarFDICKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFieldRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFieldRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cFieldRefGSSFormatFDICFieldCrossReference_12_0 = (CrossReference)cFieldRefAssignment_12.eContents().get(0);
		private final RuleCall cFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1 = (RuleCall)cFieldRefGSSFormatFDICFieldCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cOpAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_14_0 = (RuleCall)cOpAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//GSSFilterBoolVarFDIC:
		//	'GSSFilterBoolVarFDIC' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'FieldRef' ':=' FieldRef=[format::GSSFormatFDICField|VersionedQualifiedReferenceName] ';'
		//	Op=GSSFilterFieldOp
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarFDIC' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'FieldRef' ':='
		//FieldRef=[format::GSSFormatFDICField|VersionedQualifiedReferenceName] ';' Op=GSSFilterFieldOp '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterBoolVarFDIC'
		public Keyword getGSSFilterBoolVarFDICKeyword_0() { return cGSSFilterBoolVarFDICKeyword_0; }
		
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
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'FieldRef'
		public Keyword getFieldRefKeyword_10() { return cFieldRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//FieldRef=[format::GSSFormatFDICField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_12() { return cFieldRefAssignment_12; }
		
		//[format::GSSFormatFDICField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefGSSFormatFDICFieldCrossReference_12_0() { return cFieldRefGSSFormatFDICFieldCrossReference_12_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1() { return cFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_14() { return cOpAssignment_14; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_14_0() { return cOpGSSFilterFieldOpParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class GSSFilterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSFilterConstantParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSFilterSelectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSFilterSelectLineParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//GSSFilterValue:
		//	GSSFilterConstant | GSSFilterSelect | GSSFilterSelectLine;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSFilterConstant | GSSFilterSelect | GSSFilterSelectLine
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSFilterConstant
		public RuleCall getGSSFilterConstantParserRuleCall_0() { return cGSSFilterConstantParserRuleCall_0; }
		
		//GSSFilterSelect
		public RuleCall getGSSFilterSelectParserRuleCall_1() { return cGSSFilterSelectParserRuleCall_1; }
		
		//GSSFilterSelectLine
		public RuleCall getGSSFilterSelectLineParserRuleCall_2() { return cGSSFilterSelectLineParserRuleCall_2; }
	}
	public class GSSFilterFieldOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterFieldOpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeGSSFilterOPTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFilterFieldOp:
		//	'GSSFilterFieldOp' '{'
		//	'type' ':=' type=GSSFilterOPType ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterFieldOp' '{' 'type' ':=' type=GSSFilterOPType ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterFieldOp'
		public Keyword getGSSFilterFieldOpKeyword_0() { return cGSSFilterFieldOpKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//type=GSSFilterOPType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//GSSFilterOPType
		public RuleCall getTypeGSSFilterOPTypeEnumRuleCall_4_0() { return cTypeGSSFilterOPTypeEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFilterConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterConstantKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueINTEGERParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cMaskKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cMaskAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cMaskHEXADECIMALTerminalRuleCall_6_2_0 = (RuleCall)cMaskAssignment_6_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSFilterConstant:
		//	'GSSFilterConstant' '{'
		//	'value' ':=' value=INTEGER ';' ('mask' ':=' mask=HEXADECIMAL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterConstant' '{' 'value' ':=' value=INTEGER ';' ('mask' ':=' mask=HEXADECIMAL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterConstant'
		public Keyword getGSSFilterConstantKeyword_0() { return cGSSFilterConstantKeyword_0; }
		
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
		
		//('mask' ':=' mask=HEXADECIMAL ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'mask'
		public Keyword getMaskKeyword_6_0() { return cMaskKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//mask=HEXADECIMAL
		public Assignment getMaskAssignment_6_2() { return cMaskAssignment_6_2; }
		
		//HEXADECIMAL
		public RuleCall getMaskHEXADECIMALTerminalRuleCall_6_2_0() { return cMaskHEXADECIMALTerminalRuleCall_6_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSFilterSelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFromFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFromFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFromFileIDTerminalRuleCall_4_0 = (RuleCall)cFromFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeGSSFilterSelectTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
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
		private final Keyword cMaskKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cMaskAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cMaskHEXADECIMALTerminalRuleCall_12_2_0 = (RuleCall)cMaskAssignment_12_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//GSSFilterSelect:
		//	'GSSFilterSelect' '{'
		//	'fromFile' ':=' fromFile=ID ';'
		//	'type' ':=' type=GSSFilterSelectType ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('mask'
		//	':=' mask=HEXADECIMAL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterSelect' '{' 'fromFile' ':=' fromFile=ID ';' 'type' ':=' type=GSSFilterSelectType ';' ('offset' ':='
		//offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('mask' ':=' mask=HEXADECIMAL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterSelect'
		public Keyword getGSSFilterSelectKeyword_0() { return cGSSFilterSelectKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fromFile'
		public Keyword getFromFileKeyword_2() { return cFromFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_4() { return cFromFileAssignment_4; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_4_0() { return cFromFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'type'
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//type=GSSFilterSelectType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//GSSFilterSelectType
		public RuleCall getTypeGSSFilterSelectTypeEnumRuleCall_8_0() { return cTypeGSSFilterSelectTypeEnumRuleCall_8_0; }
		
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
		
		//('mask' ':=' mask=HEXADECIMAL ';')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'mask'
		public Keyword getMaskKeyword_12_0() { return cMaskKeyword_12_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }
		
		//mask=HEXADECIMAL
		public Assignment getMaskAssignment_12_2() { return cMaskAssignment_12_2; }
		
		//HEXADECIMAL
		public RuleCall getMaskHEXADECIMALTerminalRuleCall_12_2_0() { return cMaskHEXADECIMALTerminalRuleCall_12_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class GSSFilterSelectLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterSelectLineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFromFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFromFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFromFileIDTerminalRuleCall_4_0 = (RuleCall)cFromFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLineKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLineAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLineINTEGERParserRuleCall_8_0 = (RuleCall)cLineAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLeftTrimKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cLeftTrimAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cLeftTrimINTEGERParserRuleCall_10_2_0 = (RuleCall)cLeftTrimAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cRightTrimKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cRightTrimAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cRightTrimINTEGERParserRuleCall_11_2_0 = (RuleCall)cRightTrimAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cMaskKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cMaskAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cMaskHEXADECIMALTerminalRuleCall_12_2_0 = (RuleCall)cMaskAssignment_12_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//GSSFilterSelectLine:
		//	'GSSFilterSelectLine'
		//	'{'
		//	'fromFile' ':=' fromFile=ID ';'
		//	'line' ':=' line=INTEGER ';' ('leftTrim' ':=' leftTrim=INTEGER ';')? ('rightTrim' ':=' rightTrim=INTEGER ';')?
		//	('mask' ':=' mask=HEXADECIMAL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterSelectLine' '{' 'fromFile' ':=' fromFile=ID ';' 'line' ':=' line=INTEGER ';' ('leftTrim' ':=' leftTrim=INTEGER
		//';')? ('rightTrim' ':=' rightTrim=INTEGER ';')? ('mask' ':=' mask=HEXADECIMAL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterSelectLine'
		public Keyword getGSSFilterSelectLineKeyword_0() { return cGSSFilterSelectLineKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fromFile'
		public Keyword getFromFileKeyword_2() { return cFromFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_4() { return cFromFileAssignment_4; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_4_0() { return cFromFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'line'
		public Keyword getLineKeyword_6() { return cLineKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//line=INTEGER
		public Assignment getLineAssignment_8() { return cLineAssignment_8; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_8_0() { return cLineINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('leftTrim' ':=' leftTrim=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'leftTrim'
		public Keyword getLeftTrimKeyword_10_0() { return cLeftTrimKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//leftTrim=INTEGER
		public Assignment getLeftTrimAssignment_10_2() { return cLeftTrimAssignment_10_2; }
		
		//INTEGER
		public RuleCall getLeftTrimINTEGERParserRuleCall_10_2_0() { return cLeftTrimINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('rightTrim' ':=' rightTrim=INTEGER ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'rightTrim'
		public Keyword getRightTrimKeyword_11_0() { return cRightTrimKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//rightTrim=INTEGER
		public Assignment getRightTrimAssignment_11_2() { return cRightTrimAssignment_11_2; }
		
		//INTEGER
		public RuleCall getRightTrimINTEGERParserRuleCall_11_2_0() { return cRightTrimINTEGERParserRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//('mask' ':=' mask=HEXADECIMAL ';')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'mask'
		public Keyword getMaskKeyword_12_0() { return cMaskKeyword_12_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }
		
		//mask=HEXADECIMAL
		public Assignment getMaskAssignment_12_2() { return cMaskAssignment_12_2; }
		
		//HEXADECIMAL
		public RuleCall getMaskHEXADECIMALTerminalRuleCall_12_2_0() { return cMaskHEXADECIMALTerminalRuleCall_12_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class GSSFilterMaxtermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMaxterm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMaxtermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBoolVarRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0 = (RuleCall)cBoolVarRefAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSFilterMaxterm:
		//	'GSSFilterMaxterm' '{'
		//	'id' ':=' id=INTEGER ';'
		//	BoolVarRef+=GSSFilterBoolVarRef+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMaxterm' '{' 'id' ':=' id=INTEGER ';' BoolVarRef+=GSSFilterBoolVarRef+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterMaxterm'
		public Keyword getGSSFilterMaxtermKeyword_0() { return cGSSFilterMaxtermKeyword_0; }
		
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
		
		//BoolVarRef+=GSSFilterBoolVarRef+
		public Assignment getBoolVarRefAssignment_6() { return cBoolVarRefAssignment_6; }
		
		//GSSFilterBoolVarRef
		public RuleCall getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0() { return cBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSFilterMintermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMinterm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMintermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBoolVarRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0 = (RuleCall)cBoolVarRefAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//GSSFilterMinterm:
		//	'GSSFilterMinterm' '{'
		//	'id' ':=' id=INTEGER ';'
		//	BoolVarRef+=GSSFilterBoolVarRef+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMinterm' '{' 'id' ':=' id=INTEGER ';' BoolVarRef+=GSSFilterBoolVarRef+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterMinterm'
		public Keyword getGSSFilterMintermKeyword_0() { return cGSSFilterMintermKeyword_0; }
		
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
		
		//BoolVarRef+=GSSFilterBoolVarRef+
		public Assignment getBoolVarRefAssignment_6() { return cBoolVarRefAssignment_6; }
		
		//GSSFilterBoolVarRef
		public RuleCall getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0() { return cBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class GSSFilterBoolVarRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterBoolVarRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdRefINTEGERParserRuleCall_4_0 = (RuleCall)cIdRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFilterBoolVarRef:
		//	'GSSFilterBoolVarRef' '{'
		//	'idRef' ':=' idRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarRef' '{' 'idRef' ':=' idRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterBoolVarRef'
		public Keyword getGSSFilterBoolVarRefKeyword_0() { return cGSSFilterBoolVarRefKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=INTEGER
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//INTEGER
		public RuleCall getIdRefINTEGERParserRuleCall_4_0() { return cIdRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
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
	
	public class GSSFilterConstantTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDecimalEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDecimalDecimalKeyword_0_0 = (Keyword)cDecimalEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cHexEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cHexHexKeyword_1_0 = (Keyword)cHexEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBinaryEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBinaryBinaryKeyword_2_0 = (Keyword)cBinaryEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCharEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCharCharKeyword_3_0 = (Keyword)cCharEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cStringStringKeyword_4_0 = (Keyword)cStringEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum GSSFilterConstantType:
		//	decimal | hex |
		//	binary | char | string;
		public EnumRule getRule() { return rule; }
		
		//decimal | hex | binary | char | string
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//decimal
		public EnumLiteralDeclaration getDecimalEnumLiteralDeclaration_0() { return cDecimalEnumLiteralDeclaration_0; }
		
		//'decimal'
		public Keyword getDecimalDecimalKeyword_0_0() { return cDecimalDecimalKeyword_0_0; }
		
		//hex
		public EnumLiteralDeclaration getHexEnumLiteralDeclaration_1() { return cHexEnumLiteralDeclaration_1; }
		
		//'hex'
		public Keyword getHexHexKeyword_1_0() { return cHexHexKeyword_1_0; }
		
		//binary
		public EnumLiteralDeclaration getBinaryEnumLiteralDeclaration_2() { return cBinaryEnumLiteralDeclaration_2; }
		
		//'binary'
		public Keyword getBinaryBinaryKeyword_2_0() { return cBinaryBinaryKeyword_2_0; }
		
		//char
		public EnumLiteralDeclaration getCharEnumLiteralDeclaration_3() { return cCharEnumLiteralDeclaration_3; }
		
		//'char'
		public Keyword getCharCharKeyword_3_0() { return cCharCharKeyword_3_0; }
		
		//string
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_4() { return cStringEnumLiteralDeclaration_4; }
		
		//'string'
		public Keyword getStringStringKeyword_4_0() { return cStringStringKeyword_4_0; }
	}
	public class GSSFilterOPTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterOPType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEqualEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEqualEqualKeyword_0_0 = (Keyword)cEqualEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDifferentEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDifferentDifferentKeyword_1_0 = (Keyword)cDifferentEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBigger_thanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBigger_thanBigger_thanKeyword_2_0 = (Keyword)cBigger_thanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSmaller_thanEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSmaller_thanSmaller_thanKeyword_3_0 = (Keyword)cSmaller_thanEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBigger_or_equalEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBigger_or_equalBigger_or_equalKeyword_4_0 = (Keyword)cBigger_or_equalEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cSmaller_or_equalEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cSmaller_or_equalSmaller_or_equalKeyword_5_0 = (Keyword)cSmaller_or_equalEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum GSSFilterOPType:
		//	equal | different |
		//	bigger_than |
		//	smaller_than |
		//	bigger_or_equal |
		//	smaller_or_equal;
		public EnumRule getRule() { return rule; }
		
		//equal | different | bigger_than | smaller_than | bigger_or_equal | smaller_or_equal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//equal
		public EnumLiteralDeclaration getEqualEnumLiteralDeclaration_0() { return cEqualEnumLiteralDeclaration_0; }
		
		//'equal'
		public Keyword getEqualEqualKeyword_0_0() { return cEqualEqualKeyword_0_0; }
		
		//different
		public EnumLiteralDeclaration getDifferentEnumLiteralDeclaration_1() { return cDifferentEnumLiteralDeclaration_1; }
		
		//'different'
		public Keyword getDifferentDifferentKeyword_1_0() { return cDifferentDifferentKeyword_1_0; }
		
		//bigger_than
		public EnumLiteralDeclaration getBigger_thanEnumLiteralDeclaration_2() { return cBigger_thanEnumLiteralDeclaration_2; }
		
		//'bigger_than'
		public Keyword getBigger_thanBigger_thanKeyword_2_0() { return cBigger_thanBigger_thanKeyword_2_0; }
		
		//smaller_than
		public EnumLiteralDeclaration getSmaller_thanEnumLiteralDeclaration_3() { return cSmaller_thanEnumLiteralDeclaration_3; }
		
		//'smaller_than'
		public Keyword getSmaller_thanSmaller_thanKeyword_3_0() { return cSmaller_thanSmaller_thanKeyword_3_0; }
		
		//bigger_or_equal
		public EnumLiteralDeclaration getBigger_or_equalEnumLiteralDeclaration_4() { return cBigger_or_equalEnumLiteralDeclaration_4; }
		
		//'bigger_or_equal'
		public Keyword getBigger_or_equalBigger_or_equalKeyword_4_0() { return cBigger_or_equalBigger_or_equalKeyword_4_0; }
		
		//smaller_or_equal
		public EnumLiteralDeclaration getSmaller_or_equalEnumLiteralDeclaration_5() { return cSmaller_or_equalEnumLiteralDeclaration_5; }
		
		//'smaller_or_equal'
		public Keyword getSmaller_or_equalSmaller_or_equalKeyword_5_0() { return cSmaller_or_equalSmaller_or_equalKeyword_5_0; }
	}
	public class GSSFilterSelectTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDataEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDataDataKeyword_0_0 = (Keyword)cDataEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSizeEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSizeSizeKeyword_1_0 = (Keyword)cSizeEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCrcEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCrcCrcKeyword_2_0 = (Keyword)cCrcEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSFilterSelectType:
		//	data | size | crc;
		public EnumRule getRule() { return rule; }
		
		//data | size | crc
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//data
		public EnumLiteralDeclaration getDataEnumLiteralDeclaration_0() { return cDataEnumLiteralDeclaration_0; }
		
		//'data'
		public Keyword getDataDataKeyword_0_0() { return cDataDataKeyword_0_0; }
		
		//size
		public EnumLiteralDeclaration getSizeEnumLiteralDeclaration_1() { return cSizeEnumLiteralDeclaration_1; }
		
		//'size'
		public Keyword getSizeSizeKeyword_1_0() { return cSizeSizeKeyword_1_0; }
		
		//crc
		public EnumLiteralDeclaration getCrcEnumLiteralDeclaration_2() { return cCrcEnumLiteralDeclaration_2; }
		
		//'crc'
		public Keyword getCrcCrcKeyword_2_0() { return cCrcCrcKeyword_2_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSFilterFilterElements pGSSFilterFilter;
	private final GSSFilterMaxtermFilterElements pGSSFilterMaxtermFilter;
	private final GSSFilterAbstractBoolVarElements pGSSFilterAbstractBoolVar;
	private final GSSFilterMintermFilterElements pGSSFilterMintermFilter;
	private final GSSFilterBoolVarElements pGSSFilterBoolVar;
	private final GSSFilterBoolVarFromArrayItemElements pGSSFilterBoolVarFromArrayItem;
	private final GSSFilterBoolVarFromGroupedArrayItemElements pGSSFilterBoolVarFromGroupedArrayItem;
	private final GSSFilterBoolVarFDICElements pGSSFilterBoolVarFDIC;
	private final GSSFilterValueElements pGSSFilterValue;
	private final GSSFilterConstantTypeElements eGSSFilterConstantType;
	private final GSSFilterFieldOpElements pGSSFilterFieldOp;
	private final GSSFilterConstantElements pGSSFilterConstant;
	private final GSSFilterSelectElements pGSSFilterSelect;
	private final GSSFilterSelectLineElements pGSSFilterSelectLine;
	private final GSSFilterOPTypeElements eGSSFilterOPType;
	private final GSSFilterSelectTypeElements eGSSFilterSelectType;
	private final GSSFilterMaxtermElements pGSSFilterMaxterm;
	private final GSSFilterMintermElements pGSSFilterMinterm;
	private final GSSFilterBoolVarRefElements pGSSFilterBoolVarRef;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FILTERGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSFilterFilter = new GSSFilterFilterElements();
		this.pGSSFilterMaxtermFilter = new GSSFilterMaxtermFilterElements();
		this.pGSSFilterAbstractBoolVar = new GSSFilterAbstractBoolVarElements();
		this.pGSSFilterMintermFilter = new GSSFilterMintermFilterElements();
		this.pGSSFilterBoolVar = new GSSFilterBoolVarElements();
		this.pGSSFilterBoolVarFromArrayItem = new GSSFilterBoolVarFromArrayItemElements();
		this.pGSSFilterBoolVarFromGroupedArrayItem = new GSSFilterBoolVarFromGroupedArrayItemElements();
		this.pGSSFilterBoolVarFDIC = new GSSFilterBoolVarFDICElements();
		this.pGSSFilterValue = new GSSFilterValueElements();
		this.eGSSFilterConstantType = new GSSFilterConstantTypeElements();
		this.pGSSFilterFieldOp = new GSSFilterFieldOpElements();
		this.pGSSFilterConstant = new GSSFilterConstantElements();
		this.pGSSFilterSelect = new GSSFilterSelectElements();
		this.pGSSFilterSelectLine = new GSSFilterSelectLineElements();
		this.eGSSFilterOPType = new GSSFilterOPTypeElements();
		this.eGSSFilterSelectType = new GSSFilterSelectTypeElements();
		this.pGSSFilterMaxterm = new GSSFilterMaxtermElements();
		this.pGSSFilterMinterm = new GSSFilterMintermElements();
		this.pGSSFilterBoolVarRef = new GSSFilterBoolVarRefElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.filter.FILTER".equals(grammar.getName())) {
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
	//	element=GSSFilterFilter
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
	
	//GSSFilterFilter:
	//	GSSFilterMaxtermFilter | GSSFilterMintermFilter;
	public GSSFilterFilterElements getGSSFilterFilterAccess() {
		return pGSSFilterFilter;
	}
	
	public ParserRule getGSSFilterFilterRule() {
		return getGSSFilterFilterAccess().getRule();
	}
	
	//GSSFilterMaxtermFilter:
	//	'GSSFilterMaxtermFilter'
	//	name=ID
	//	'{'
	//	'uri' ':=' uri=QualifiedName ';'
	//	'version' ':=' version=Version ';'
	//	'formatFile' ':=' formatFile=[format::GSSFormatFormat|VersionedQualifiedName] ';'
	//	BoolVar+=GSSFilterAbstractBoolVar+
	//	Maxterm+=GSSFilterMaxterm+
	//	'}' ';';
	public GSSFilterMaxtermFilterElements getGSSFilterMaxtermFilterAccess() {
		return pGSSFilterMaxtermFilter;
	}
	
	public ParserRule getGSSFilterMaxtermFilterRule() {
		return getGSSFilterMaxtermFilterAccess().getRule();
	}
	
	//GSSFilterAbstractBoolVar:
	//	GSSFilterBoolVar | GSSFilterBoolVarFromArrayItem | GSSFilterBoolVarFromGroupedArrayItem | GSSFilterBoolVarFDIC;
	public GSSFilterAbstractBoolVarElements getGSSFilterAbstractBoolVarAccess() {
		return pGSSFilterAbstractBoolVar;
	}
	
	public ParserRule getGSSFilterAbstractBoolVarRule() {
		return getGSSFilterAbstractBoolVarAccess().getRule();
	}
	
	//GSSFilterMintermFilter:
	//	'GSSFilterMintermFilter'
	//	name=ID
	//	'{'
	//	'uri' ':=' uri=QualifiedName ';'
	//	'version' ':=' version=Version ';'
	//	'formatFile' ':=' formatFile=[format::GSSFormatFormat|VersionedQualifiedName] ';'
	//	BoolVar+=GSSFilterAbstractBoolVar+
	//	Minterm+=GSSFilterMinterm+
	//	'}' ';';
	public GSSFilterMintermFilterElements getGSSFilterMintermFilterAccess() {
		return pGSSFilterMintermFilter;
	}
	
	public ParserRule getGSSFilterMintermFilterRule() {
		return getGSSFilterMintermFilterAccess().getRule();
	}
	
	//GSSFilterBoolVar:
	//	'GSSFilterBoolVar' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'constantType' ':=' constantType=GSSFilterConstantType ';'
	//	'FieldRef' ':=' FieldRef=[format::GSSFormatField|VersionedQualifiedReferenceName] ';'
	//	Op=GSSFilterFieldOp
	//	Value=GSSFilterValue '}' ';';
	public GSSFilterBoolVarElements getGSSFilterBoolVarAccess() {
		return pGSSFilterBoolVar;
	}
	
	public ParserRule getGSSFilterBoolVarRule() {
		return getGSSFilterBoolVarAccess().getRule();
	}
	
	//GSSFilterBoolVarFromArrayItem:
	//	'GSSFilterBoolVarFromArrayItem' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'constantType' ':=' constantType=GSSFilterConstantType ';'
	//	'AIFieldRef' ':=' AIFieldRef=[format::GSSFormatAIField|VersionedQualifiedReferenceName] ';'
	//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
	//	'}' ';';
	public GSSFilterBoolVarFromArrayItemElements getGSSFilterBoolVarFromArrayItemAccess() {
		return pGSSFilterBoolVarFromArrayItem;
	}
	
	public ParserRule getGSSFilterBoolVarFromArrayItemRule() {
		return getGSSFilterBoolVarFromArrayItemAccess().getRule();
	}
	
	//GSSFilterBoolVarFromGroupedArrayItem:
	//	'GSSFilterBoolVarFromGroupedArrayItem' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'constantType' ':=' constantType=GSSFilterConstantType ';'
	//	'group' ':=' group=ID ';'
	//	'AIFieldRefs' ':=' AIFieldRefs=[format::GSSFormatAField|VersionedQualifiedReferenceName] ';'
	//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
	//	'}' ';';
	public GSSFilterBoolVarFromGroupedArrayItemElements getGSSFilterBoolVarFromGroupedArrayItemAccess() {
		return pGSSFilterBoolVarFromGroupedArrayItem;
	}
	
	public ParserRule getGSSFilterBoolVarFromGroupedArrayItemRule() {
		return getGSSFilterBoolVarFromGroupedArrayItemAccess().getRule();
	}
	
	//GSSFilterBoolVarFDIC:
	//	'GSSFilterBoolVarFDIC' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'FieldRef' ':=' FieldRef=[format::GSSFormatFDICField|VersionedQualifiedReferenceName] ';'
	//	Op=GSSFilterFieldOp
	//	'}' ';';
	public GSSFilterBoolVarFDICElements getGSSFilterBoolVarFDICAccess() {
		return pGSSFilterBoolVarFDIC;
	}
	
	public ParserRule getGSSFilterBoolVarFDICRule() {
		return getGSSFilterBoolVarFDICAccess().getRule();
	}
	
	//GSSFilterValue:
	//	GSSFilterConstant | GSSFilterSelect | GSSFilterSelectLine;
	public GSSFilterValueElements getGSSFilterValueAccess() {
		return pGSSFilterValue;
	}
	
	public ParserRule getGSSFilterValueRule() {
		return getGSSFilterValueAccess().getRule();
	}
	
	//enum GSSFilterConstantType:
	//	decimal | hex |
	//	binary | char | string;
	public GSSFilterConstantTypeElements getGSSFilterConstantTypeAccess() {
		return eGSSFilterConstantType;
	}
	
	public EnumRule getGSSFilterConstantTypeRule() {
		return getGSSFilterConstantTypeAccess().getRule();
	}
	
	//GSSFilterFieldOp:
	//	'GSSFilterFieldOp' '{'
	//	'type' ':=' type=GSSFilterOPType ';'
	//	'}' ';';
	public GSSFilterFieldOpElements getGSSFilterFieldOpAccess() {
		return pGSSFilterFieldOp;
	}
	
	public ParserRule getGSSFilterFieldOpRule() {
		return getGSSFilterFieldOpAccess().getRule();
	}
	
	//GSSFilterConstant:
	//	'GSSFilterConstant' '{'
	//	'value' ':=' value=INTEGER ';' ('mask' ':=' mask=HEXADECIMAL ';')?
	//	'}' ';';
	public GSSFilterConstantElements getGSSFilterConstantAccess() {
		return pGSSFilterConstant;
	}
	
	public ParserRule getGSSFilterConstantRule() {
		return getGSSFilterConstantAccess().getRule();
	}
	
	//GSSFilterSelect:
	//	'GSSFilterSelect' '{'
	//	'fromFile' ':=' fromFile=ID ';'
	//	'type' ':=' type=GSSFilterSelectType ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('mask'
	//	':=' mask=HEXADECIMAL ';')?
	//	'}' ';';
	public GSSFilterSelectElements getGSSFilterSelectAccess() {
		return pGSSFilterSelect;
	}
	
	public ParserRule getGSSFilterSelectRule() {
		return getGSSFilterSelectAccess().getRule();
	}
	
	//GSSFilterSelectLine:
	//	'GSSFilterSelectLine'
	//	'{'
	//	'fromFile' ':=' fromFile=ID ';'
	//	'line' ':=' line=INTEGER ';' ('leftTrim' ':=' leftTrim=INTEGER ';')? ('rightTrim' ':=' rightTrim=INTEGER ';')?
	//	('mask' ':=' mask=HEXADECIMAL ';')?
	//	'}' ';';
	public GSSFilterSelectLineElements getGSSFilterSelectLineAccess() {
		return pGSSFilterSelectLine;
	}
	
	public ParserRule getGSSFilterSelectLineRule() {
		return getGSSFilterSelectLineAccess().getRule();
	}
	
	//enum GSSFilterOPType:
	//	equal | different |
	//	bigger_than |
	//	smaller_than |
	//	bigger_or_equal |
	//	smaller_or_equal;
	public GSSFilterOPTypeElements getGSSFilterOPTypeAccess() {
		return eGSSFilterOPType;
	}
	
	public EnumRule getGSSFilterOPTypeRule() {
		return getGSSFilterOPTypeAccess().getRule();
	}
	
	//enum GSSFilterSelectType:
	//	data | size | crc;
	public GSSFilterSelectTypeElements getGSSFilterSelectTypeAccess() {
		return eGSSFilterSelectType;
	}
	
	public EnumRule getGSSFilterSelectTypeRule() {
		return getGSSFilterSelectTypeAccess().getRule();
	}
	
	//GSSFilterMaxterm:
	//	'GSSFilterMaxterm' '{'
	//	'id' ':=' id=INTEGER ';'
	//	BoolVarRef+=GSSFilterBoolVarRef+
	//	'}' ';';
	public GSSFilterMaxtermElements getGSSFilterMaxtermAccess() {
		return pGSSFilterMaxterm;
	}
	
	public ParserRule getGSSFilterMaxtermRule() {
		return getGSSFilterMaxtermAccess().getRule();
	}
	
	//GSSFilterMinterm:
	//	'GSSFilterMinterm' '{'
	//	'id' ':=' id=INTEGER ';'
	//	BoolVarRef+=GSSFilterBoolVarRef+
	//	'}' ';';
	public GSSFilterMintermElements getGSSFilterMintermAccess() {
		return pGSSFilterMinterm;
	}
	
	public ParserRule getGSSFilterMintermRule() {
		return getGSSFilterMintermAccess().getRule();
	}
	
	//GSSFilterBoolVarRef:
	//	'GSSFilterBoolVarRef' '{'
	//	'idRef' ':=' idRef=INTEGER ';'
	//	'}' ';';
	public GSSFilterBoolVarRefElements getGSSFilterBoolVarRefAccess() {
		return pGSSFilterBoolVarRef;
	}
	
	public ParserRule getGSSFilterBoolVarRefRule() {
		return getGSSFilterBoolVarRefAccess().getRule();
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
