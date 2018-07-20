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
package es.uah.aut.srg.gss.lang.filters.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class FILTERSGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSModelFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSModelFileImport");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFilter");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterMaxtermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMaxtermFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Group cGroup_3_1_0 = (Group)cGroup_3_1.eContents().get(0);
		private final Keyword cVersionKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_0_1 = (Keyword)cGroup_3_1_0.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_0_2 = (Assignment)cGroup_3_1_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_0_2_0 = (RuleCall)cVersionAssignment_3_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_0_3 = (Keyword)cGroup_3_1_0.eContents().get(3);
		private final Keyword cFormatFileKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Assignment cFormatFileAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final RuleCall cFormatFileIDTerminalRuleCall_3_1_3_0 = (RuleCall)cFormatFileAssignment_3_1_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Alternatives cAlternatives_3_1_5 = (Alternatives)cGroup_3_1.eContents().get(5);
		private final Assignment cBoolVarAssignment_3_1_5_0 = (Assignment)cAlternatives_3_1_5.eContents().get(0);
		private final RuleCall cBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0 = (RuleCall)cBoolVarAssignment_3_1_5_0.eContents().get(0);
		private final Assignment cBoolVarFromArrayItemAssignment_3_1_5_1 = (Assignment)cAlternatives_3_1_5.eContents().get(1);
		private final RuleCall cBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0 = (RuleCall)cBoolVarFromArrayItemAssignment_3_1_5_1.eContents().get(0);
		private final Assignment cBoolVarFromGroupedArrayItemAssignment_3_1_5_2 = (Assignment)cAlternatives_3_1_5.eContents().get(2);
		private final RuleCall cBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0 = (RuleCall)cBoolVarFromGroupedArrayItemAssignment_3_1_5_2.eContents().get(0);
		private final Assignment cBoolVarFDICAssignment_3_1_5_3 = (Assignment)cAlternatives_3_1_5.eContents().get(3);
		private final RuleCall cBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0 = (RuleCall)cBoolVarFDICAssignment_3_1_5_3.eContents().get(0);
		private final Assignment cMaxtermAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMaxtermGSSFilterMaxtermParserRuleCall_4_0 = (RuleCall)cMaxtermAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSFilterMaxtermFilter:
		//	'GSSFilterMaxtermFilter'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//	'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem
		//	| BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
		//	Maxterm+=GSSFilterMaxterm+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMaxtermFilter' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
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
		
		//('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';') 'formatFile' ':=' formatFile=ID ';'
		//(BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
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
		
		//('version' ':=' version=Version ';') 'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar |
		//BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//('version' ':=' version=Version ';')
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0_0() { return cVersionKeyword_3_1_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_0_1() { return cColonEqualsSignKeyword_3_1_0_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_0_2() { return cVersionAssignment_3_1_0_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_0_2_0() { return cVersionVersionParserRuleCall_3_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_0_3() { return cSemicolonKeyword_3_1_0_3; }
		
		//'formatFile'
		public Keyword getFormatFileKeyword_3_1_1() { return cFormatFileKeyword_3_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_2() { return cColonEqualsSignKeyword_3_1_2; }
		
		//formatFile=ID
		public Assignment getFormatFileAssignment_3_1_3() { return cFormatFileAssignment_3_1_3; }
		
		//ID
		public RuleCall getFormatFileIDTerminalRuleCall_3_1_3_0() { return cFormatFileIDTerminalRuleCall_3_1_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_4() { return cSemicolonKeyword_3_1_4; }
		
		//(BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+
		public Alternatives getAlternatives_3_1_5() { return cAlternatives_3_1_5; }
		
		//BoolVar+=GSSFilterBoolVar
		public Assignment getBoolVarAssignment_3_1_5_0() { return cBoolVarAssignment_3_1_5_0; }
		
		//GSSFilterBoolVar
		public RuleCall getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0() { return cBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0; }
		
		//BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem
		public Assignment getBoolVarFromArrayItemAssignment_3_1_5_1() { return cBoolVarFromArrayItemAssignment_3_1_5_1; }
		
		//GSSFilterBoolVarFromArrayItem
		public RuleCall getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0() { return cBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0; }
		
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem
		public Assignment getBoolVarFromGroupedArrayItemAssignment_3_1_5_2() { return cBoolVarFromGroupedArrayItemAssignment_3_1_5_2; }
		
		//GSSFilterBoolVarFromGroupedArrayItem
		public RuleCall getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0() { return cBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0; }
		
		//BoolVarFDIC+=GSSFilterBoolVarFDIC
		public Assignment getBoolVarFDICAssignment_3_1_5_3() { return cBoolVarFDICAssignment_3_1_5_3; }
		
		//GSSFilterBoolVarFDIC
		public RuleCall getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0() { return cBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0; }
		
		//Maxterm+=GSSFilterMaxterm+
		public Assignment getMaxtermAssignment_4() { return cMaxtermAssignment_4; }
		
		//GSSFilterMaxterm
		public RuleCall getMaxtermGSSFilterMaxtermParserRuleCall_4_0() { return cMaxtermGSSFilterMaxtermParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class GSSFilterMintermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterMintermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMintermFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Group cGroup_3_1_0 = (Group)cGroup_3_1.eContents().get(0);
		private final Keyword cVersionKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_0_1 = (Keyword)cGroup_3_1_0.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_0_2 = (Assignment)cGroup_3_1_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_0_2_0 = (RuleCall)cVersionAssignment_3_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_0_3 = (Keyword)cGroup_3_1_0.eContents().get(3);
		private final Keyword cFormatFileKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Assignment cFormatFileAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final RuleCall cFormatFileIDTerminalRuleCall_3_1_3_0 = (RuleCall)cFormatFileAssignment_3_1_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Alternatives cAlternatives_3_1_5 = (Alternatives)cGroup_3_1.eContents().get(5);
		private final Assignment cBoolVarAssignment_3_1_5_0 = (Assignment)cAlternatives_3_1_5.eContents().get(0);
		private final RuleCall cBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0 = (RuleCall)cBoolVarAssignment_3_1_5_0.eContents().get(0);
		private final Assignment cBoolVarFromArrayItemAssignment_3_1_5_1 = (Assignment)cAlternatives_3_1_5.eContents().get(1);
		private final RuleCall cBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0 = (RuleCall)cBoolVarFromArrayItemAssignment_3_1_5_1.eContents().get(0);
		private final Assignment cBoolVarFromGroupedArrayItemAssignment_3_1_5_2 = (Assignment)cAlternatives_3_1_5.eContents().get(2);
		private final RuleCall cBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0 = (RuleCall)cBoolVarFromGroupedArrayItemAssignment_3_1_5_2.eContents().get(0);
		private final Assignment cBoolVarFDICAssignment_3_1_5_3 = (Assignment)cAlternatives_3_1_5.eContents().get(3);
		private final RuleCall cBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0 = (RuleCall)cBoolVarFDICAssignment_3_1_5_3.eContents().get(0);
		private final Assignment cMintermAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMintermGSSFilterMintermParserRuleCall_4_0 = (RuleCall)cMintermAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//GSSFilterMintermFilter:
		//	'GSSFilterMintermFilter'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//	'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem
		//	| BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
		//	Minterm+=GSSFilterMinterm+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMintermFilter' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
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
		
		//('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';') 'formatFile' ':=' formatFile=ID ';'
		//(BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
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
		
		//('version' ':=' version=Version ';') 'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar |
		//BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//('version' ':=' version=Version ';')
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0_0() { return cVersionKeyword_3_1_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_0_1() { return cColonEqualsSignKeyword_3_1_0_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_0_2() { return cVersionAssignment_3_1_0_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_0_2_0() { return cVersionVersionParserRuleCall_3_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_0_3() { return cSemicolonKeyword_3_1_0_3; }
		
		//'formatFile'
		public Keyword getFormatFileKeyword_3_1_1() { return cFormatFileKeyword_3_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_2() { return cColonEqualsSignKeyword_3_1_2; }
		
		//formatFile=ID
		public Assignment getFormatFileAssignment_3_1_3() { return cFormatFileAssignment_3_1_3; }
		
		//ID
		public RuleCall getFormatFileIDTerminalRuleCall_3_1_3_0() { return cFormatFileIDTerminalRuleCall_3_1_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_4() { return cSemicolonKeyword_3_1_4; }
		
		//(BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+
		public Alternatives getAlternatives_3_1_5() { return cAlternatives_3_1_5; }
		
		//BoolVar+=GSSFilterBoolVar
		public Assignment getBoolVarAssignment_3_1_5_0() { return cBoolVarAssignment_3_1_5_0; }
		
		//GSSFilterBoolVar
		public RuleCall getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0() { return cBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0; }
		
		//BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem
		public Assignment getBoolVarFromArrayItemAssignment_3_1_5_1() { return cBoolVarFromArrayItemAssignment_3_1_5_1; }
		
		//GSSFilterBoolVarFromArrayItem
		public RuleCall getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0() { return cBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0; }
		
		//BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem
		public Assignment getBoolVarFromGroupedArrayItemAssignment_3_1_5_2() { return cBoolVarFromGroupedArrayItemAssignment_3_1_5_2; }
		
		//GSSFilterBoolVarFromGroupedArrayItem
		public RuleCall getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0() { return cBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0; }
		
		//BoolVarFDIC+=GSSFilterBoolVarFDIC
		public Assignment getBoolVarFDICAssignment_3_1_5_3() { return cBoolVarFDICAssignment_3_1_5_3; }
		
		//GSSFilterBoolVarFDIC
		public RuleCall getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0() { return cBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0; }
		
		//Minterm+=GSSFilterMinterm+
		public Assignment getMintermAssignment_4() { return cMintermAssignment_4; }
		
		//GSSFilterMinterm
		public RuleCall getMintermGSSFilterMintermParserRuleCall_4_0() { return cMintermGSSFilterMintermParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class GSSFilterBoolVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVar");
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
		private final Assignment cFieldRefAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cFieldRefGSSFilterFieldRefParserRuleCall_14_0 = (RuleCall)cFieldRefAssignment_14.eContents().get(0);
		private final Assignment cOpAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_15_0 = (RuleCall)cOpAssignment_15.eContents().get(0);
		private final Alternatives cAlternatives_16 = (Alternatives)cGroup.eContents().get(16);
		private final Assignment cConstantAssignment_16_0 = (Assignment)cAlternatives_16.eContents().get(0);
		private final RuleCall cConstantGSSFilterConstantParserRuleCall_16_0_0 = (RuleCall)cConstantAssignment_16_0.eContents().get(0);
		private final Assignment cSelectAssignment_16_1 = (Assignment)cAlternatives_16.eContents().get(1);
		private final RuleCall cSelectGSSFilterSelectParserRuleCall_16_1_0 = (RuleCall)cSelectAssignment_16_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_16_2 = (Assignment)cAlternatives_16.eContents().get(2);
		private final RuleCall cSelectLineGSSFilterSelectLineParserRuleCall_16_2_0 = (RuleCall)cSelectLineAssignment_16_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//GSSFilterBoolVar:
		//	'GSSFilterBoolVar' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=GSSFilterConstantType ';'
		//	FieldRef=GSSFilterFieldRef
		//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVar' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=GSSFilterConstantType ';' FieldRef=GSSFilterFieldRef Op=GSSFilterFieldOp (Constant=GSSFilterConstant |
		//Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine) '}' ';'
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
		
		//FieldRef=GSSFilterFieldRef
		public Assignment getFieldRefAssignment_14() { return cFieldRefAssignment_14; }
		
		//GSSFilterFieldRef
		public RuleCall getFieldRefGSSFilterFieldRefParserRuleCall_14_0() { return cFieldRefGSSFilterFieldRefParserRuleCall_14_0; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_15() { return cOpAssignment_15; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_15_0() { return cOpGSSFilterFieldOpParserRuleCall_15_0; }
		
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		public Alternatives getAlternatives_16() { return cAlternatives_16; }
		
		//Constant=GSSFilterConstant
		public Assignment getConstantAssignment_16_0() { return cConstantAssignment_16_0; }
		
		//GSSFilterConstant
		public RuleCall getConstantGSSFilterConstantParserRuleCall_16_0_0() { return cConstantGSSFilterConstantParserRuleCall_16_0_0; }
		
		//Select=GSSFilterSelect
		public Assignment getSelectAssignment_16_1() { return cSelectAssignment_16_1; }
		
		//GSSFilterSelect
		public RuleCall getSelectGSSFilterSelectParserRuleCall_16_1_0() { return cSelectGSSFilterSelectParserRuleCall_16_1_0; }
		
		//SelectLine=GSSFilterSelectLine
		public Assignment getSelectLineAssignment_16_2() { return cSelectLineAssignment_16_2; }
		
		//GSSFilterSelectLine
		public RuleCall getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0() { return cSelectLineGSSFilterSelectLineParserRuleCall_16_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class GSSFilterBoolVarFromArrayItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFromArrayItem");
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
		private final Assignment cAIFieldRefAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cAIFieldRefGSSFilterAIFieldRefParserRuleCall_14_0 = (RuleCall)cAIFieldRefAssignment_14.eContents().get(0);
		private final Assignment cOpAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_15_0 = (RuleCall)cOpAssignment_15.eContents().get(0);
		private final Alternatives cAlternatives_16 = (Alternatives)cGroup.eContents().get(16);
		private final Assignment cConstantAssignment_16_0 = (Assignment)cAlternatives_16.eContents().get(0);
		private final RuleCall cConstantGSSFilterConstantParserRuleCall_16_0_0 = (RuleCall)cConstantAssignment_16_0.eContents().get(0);
		private final Assignment cSelectAssignment_16_1 = (Assignment)cAlternatives_16.eContents().get(1);
		private final RuleCall cSelectGSSFilterSelectParserRuleCall_16_1_0 = (RuleCall)cSelectAssignment_16_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_16_2 = (Assignment)cAlternatives_16.eContents().get(2);
		private final RuleCall cSelectLineGSSFilterSelectLineParserRuleCall_16_2_0 = (RuleCall)cSelectLineAssignment_16_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//GSSFilterBoolVarFromArrayItem:
		//	'GSSFilterBoolVarFromArrayItem' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=GSSFilterConstantType ';'
		//	AIFieldRef=GSSFilterAIFieldRef
		//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarFromArrayItem' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=GSSFilterConstantType ';' AIFieldRef=GSSFilterAIFieldRef Op=GSSFilterFieldOp (Constant=GSSFilterConstant
		//| Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine) '}' ';'
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
		
		//AIFieldRef=GSSFilterAIFieldRef
		public Assignment getAIFieldRefAssignment_14() { return cAIFieldRefAssignment_14; }
		
		//GSSFilterAIFieldRef
		public RuleCall getAIFieldRefGSSFilterAIFieldRefParserRuleCall_14_0() { return cAIFieldRefGSSFilterAIFieldRefParserRuleCall_14_0; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_15() { return cOpAssignment_15; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_15_0() { return cOpGSSFilterFieldOpParserRuleCall_15_0; }
		
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		public Alternatives getAlternatives_16() { return cAlternatives_16; }
		
		//Constant=GSSFilterConstant
		public Assignment getConstantAssignment_16_0() { return cConstantAssignment_16_0; }
		
		//GSSFilterConstant
		public RuleCall getConstantGSSFilterConstantParserRuleCall_16_0_0() { return cConstantGSSFilterConstantParserRuleCall_16_0_0; }
		
		//Select=GSSFilterSelect
		public Assignment getSelectAssignment_16_1() { return cSelectAssignment_16_1; }
		
		//GSSFilterSelect
		public RuleCall getSelectGSSFilterSelectParserRuleCall_16_1_0() { return cSelectGSSFilterSelectParserRuleCall_16_1_0; }
		
		//SelectLine=GSSFilterSelectLine
		public Assignment getSelectLineAssignment_16_2() { return cSelectLineAssignment_16_2; }
		
		//GSSFilterSelectLine
		public RuleCall getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0() { return cSelectLineGSSFilterSelectLineParserRuleCall_16_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class GSSFilterBoolVarFromGroupedArrayItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFromGroupedArrayItem");
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
		private final RuleCall cGroupEStringParserRuleCall_16_0 = (RuleCall)cGroupAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cAIFieldRefsAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cAIFieldRefsGSSFilterAIFieldRefsParserRuleCall_18_0 = (RuleCall)cAIFieldRefsAssignment_18.eContents().get(0);
		private final Assignment cOpAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_19_0 = (RuleCall)cOpAssignment_19.eContents().get(0);
		private final Alternatives cAlternatives_20 = (Alternatives)cGroup.eContents().get(20);
		private final Assignment cConstantAssignment_20_0 = (Assignment)cAlternatives_20.eContents().get(0);
		private final RuleCall cConstantGSSFilterConstantParserRuleCall_20_0_0 = (RuleCall)cConstantAssignment_20_0.eContents().get(0);
		private final Assignment cSelectAssignment_20_1 = (Assignment)cAlternatives_20.eContents().get(1);
		private final RuleCall cSelectGSSFilterSelectParserRuleCall_20_1_0 = (RuleCall)cSelectAssignment_20_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_20_2 = (Assignment)cAlternatives_20.eContents().get(2);
		private final RuleCall cSelectLineGSSFilterSelectLineParserRuleCall_20_2_0 = (RuleCall)cSelectLineAssignment_20_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		
		//GSSFilterBoolVarFromGroupedArrayItem:
		//	'GSSFilterBoolVarFromGroupedArrayItem' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=GSSFilterConstantType ';'
		//	'group' ':=' group=EString ';'
		//	AIFieldRefs=GSSFilterAIFieldRefs
		//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarFromGroupedArrayItem' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=GSSFilterConstantType ';' 'group' ':=' group=EString ';' AIFieldRefs=GSSFilterAIFieldRefs
		//Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine) '}' ';'
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
		
		//group=EString
		public Assignment getGroupAssignment_16() { return cGroupAssignment_16; }
		
		//EString
		public RuleCall getGroupEStringParserRuleCall_16_0() { return cGroupEStringParserRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//AIFieldRefs=GSSFilterAIFieldRefs
		public Assignment getAIFieldRefsAssignment_18() { return cAIFieldRefsAssignment_18; }
		
		//GSSFilterAIFieldRefs
		public RuleCall getAIFieldRefsGSSFilterAIFieldRefsParserRuleCall_18_0() { return cAIFieldRefsGSSFilterAIFieldRefsParserRuleCall_18_0; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_19() { return cOpAssignment_19; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_19_0() { return cOpGSSFilterFieldOpParserRuleCall_19_0; }
		
		//(Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
		public Alternatives getAlternatives_20() { return cAlternatives_20; }
		
		//Constant=GSSFilterConstant
		public Assignment getConstantAssignment_20_0() { return cConstantAssignment_20_0; }
		
		//GSSFilterConstant
		public RuleCall getConstantGSSFilterConstantParserRuleCall_20_0_0() { return cConstantGSSFilterConstantParserRuleCall_20_0_0; }
		
		//Select=GSSFilterSelect
		public Assignment getSelectAssignment_20_1() { return cSelectAssignment_20_1; }
		
		//GSSFilterSelect
		public RuleCall getSelectGSSFilterSelectParserRuleCall_20_1_0() { return cSelectGSSFilterSelectParserRuleCall_20_1_0; }
		
		//SelectLine=GSSFilterSelectLine
		public Assignment getSelectLineAssignment_20_2() { return cSelectLineAssignment_20_2; }
		
		//GSSFilterSelectLine
		public RuleCall getSelectLineGSSFilterSelectLineParserRuleCall_20_2_0() { return cSelectLineGSSFilterSelectLineParserRuleCall_20_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_21() { return cRightCurlyBracketKeyword_21; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
	}
	public class GSSFilterBoolVarFDICElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFDIC");
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
		private final Assignment cFieldRefAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cFieldRefGSSFilterFieldRefParserRuleCall_10_0 = (RuleCall)cFieldRefAssignment_10.eContents().get(0);
		private final Assignment cOpAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOpGSSFilterFieldOpParserRuleCall_11_0 = (RuleCall)cOpAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//GSSFilterBoolVarFDIC:
		//	'GSSFilterBoolVarFDIC' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	FieldRef=GSSFilterFieldRef
		//	Op=GSSFilterFieldOp
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterBoolVarFDIC' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' FieldRef=GSSFilterFieldRef
		//Op=GSSFilterFieldOp '}' ';'
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
		
		//FieldRef=GSSFilterFieldRef
		public Assignment getFieldRefAssignment_10() { return cFieldRefAssignment_10; }
		
		//GSSFilterFieldRef
		public RuleCall getFieldRefGSSFilterFieldRefParserRuleCall_10_0() { return cFieldRefGSSFilterFieldRefParserRuleCall_10_0; }
		
		//Op=GSSFilterFieldOp
		public Assignment getOpAssignment_11() { return cOpAssignment_11; }
		
		//GSSFilterFieldOp
		public RuleCall getOpGSSFilterFieldOpParserRuleCall_11_0() { return cOpGSSFilterFieldOpParserRuleCall_11_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class GSSFilterFieldRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterFieldRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFilterFieldRef:
		//	'GSSFilterFieldRef' '{'
		//	'name' ':=' name=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterFieldRef' '{' 'name' ':=' name=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterFieldRef'
		public Keyword getGSSFilterFieldRefKeyword_0() { return cGSSFilterFieldRefKeyword_0; }
		
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
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFilterFieldOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldOp");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstant");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelect");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelectLine");
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
	public class GSSFilterAIFieldRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterAIFieldRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterAIFieldRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIndexKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIndexAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIndexINTEGERParserRuleCall_4_0 = (RuleCall)cIndexAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFilterAIFieldRef:
		//	'GSSFilterAIFieldRef' '{'
		//	'index' ':=' index=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterAIFieldRef' '{' 'index' ':=' index=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterAIFieldRef'
		public Keyword getGSSFilterAIFieldRefKeyword_0() { return cGSSFilterAIFieldRefKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'index'
		public Keyword getIndexKeyword_2() { return cIndexKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//index=INTEGER
		public Assignment getIndexAssignment_4() { return cIndexAssignment_4; }
		
		//INTEGER
		public RuleCall getIndexINTEGERParserRuleCall_4_0() { return cIndexINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFilterAIFieldRefsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterAIFieldRefs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterAIFieldRefsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFilterAIFieldRefs:
		//	'GSSFilterAIFieldRefs' '{'
		//	'name' ':=' name=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterAIFieldRefs' '{' 'name' ':=' name=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSFilterAIFieldRefs'
		public Keyword getGSSFilterAIFieldRefsKeyword_0() { return cGSSFilterAIFieldRefsKeyword_0; }
		
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
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFilterMaxtermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterMaxterm");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterMinterm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSFilterMintermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Assignment cBoolVarRefAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBoolVarRefGSSFilterBoolVarRefParserRuleCall_5_0 = (RuleCall)cBoolVarRefAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSFilterMinterm:
		//	'GSSFilterMinterm' '{'
		//	'id' ':=' id=INTEGER
		//	BoolVarRef+=GSSFilterBoolVarRef+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSFilterMinterm' '{' 'id' ':=' id=INTEGER BoolVarRef+=GSSFilterBoolVarRef+ '}' ';'
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
		
		//BoolVarRef+=GSSFilterBoolVarRef+
		public Assignment getBoolVarRefAssignment_5() { return cBoolVarRefAssignment_5; }
		
		//GSSFilterBoolVarRef
		public RuleCall getBoolVarRefGSSFilterBoolVarRefParserRuleCall_5_0() { return cBoolVarRefGSSFilterBoolVarRefParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSFilterBoolVarRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarRef");
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
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.EString");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.EBoolean");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.REAL");
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
	
	public class GSSFilterConstantTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstantType");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterOPType");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelectType");
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
	private final GSSFilterMintermFilterElements pGSSFilterMintermFilter;
	private final GSSFilterBoolVarElements pGSSFilterBoolVar;
	private final GSSFilterBoolVarFromArrayItemElements pGSSFilterBoolVarFromArrayItem;
	private final GSSFilterBoolVarFromGroupedArrayItemElements pGSSFilterBoolVarFromGroupedArrayItem;
	private final GSSFilterBoolVarFDICElements pGSSFilterBoolVarFDIC;
	private final GSSFilterConstantTypeElements eGSSFilterConstantType;
	private final GSSFilterFieldRefElements pGSSFilterFieldRef;
	private final GSSFilterFieldOpElements pGSSFilterFieldOp;
	private final GSSFilterConstantElements pGSSFilterConstant;
	private final GSSFilterSelectElements pGSSFilterSelect;
	private final GSSFilterSelectLineElements pGSSFilterSelectLine;
	private final GSSFilterOPTypeElements eGSSFilterOPType;
	private final GSSFilterSelectTypeElements eGSSFilterSelectType;
	private final GSSFilterAIFieldRefElements pGSSFilterAIFieldRef;
	private final GSSFilterAIFieldRefsElements pGSSFilterAIFieldRefs;
	private final GSSFilterMaxtermElements pGSSFilterMaxterm;
	private final GSSFilterMintermElements pGSSFilterMinterm;
	private final GSSFilterBoolVarRefElements pGSSFilterBoolVarRef;
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
	public FILTERSGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSFilterFilter = new GSSFilterFilterElements();
		this.pGSSFilterMaxtermFilter = new GSSFilterMaxtermFilterElements();
		this.pGSSFilterMintermFilter = new GSSFilterMintermFilterElements();
		this.pGSSFilterBoolVar = new GSSFilterBoolVarElements();
		this.pGSSFilterBoolVarFromArrayItem = new GSSFilterBoolVarFromArrayItemElements();
		this.pGSSFilterBoolVarFromGroupedArrayItem = new GSSFilterBoolVarFromGroupedArrayItemElements();
		this.pGSSFilterBoolVarFDIC = new GSSFilterBoolVarFDICElements();
		this.eGSSFilterConstantType = new GSSFilterConstantTypeElements();
		this.pGSSFilterFieldRef = new GSSFilterFieldRefElements();
		this.pGSSFilterFieldOp = new GSSFilterFieldOpElements();
		this.pGSSFilterConstant = new GSSFilterConstantElements();
		this.pGSSFilterSelect = new GSSFilterSelectElements();
		this.pGSSFilterSelectLine = new GSSFilterSelectLineElements();
		this.eGSSFilterOPType = new GSSFilterOPTypeElements();
		this.eGSSFilterSelectType = new GSSFilterSelectTypeElements();
		this.pGSSFilterAIFieldRef = new GSSFilterAIFieldRefElements();
		this.pGSSFilterAIFieldRefs = new GSSFilterAIFieldRefsElements();
		this.pGSSFilterMaxterm = new GSSFilterMaxtermElements();
		this.pGSSFilterMinterm = new GSSFilterMintermElements();
		this.pGSSFilterBoolVarRef = new GSSFilterBoolVarRefElements();
		this.pEString = new EStringElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.filters.FILTERS.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.filters.FILTERS".equals(grammar.getName())) {
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
	//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
	//	'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem
	//	| BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
	//	Maxterm+=GSSFilterMaxterm+
	//	'}' ';';
	public GSSFilterMaxtermFilterElements getGSSFilterMaxtermFilterAccess() {
		return pGSSFilterMaxtermFilter;
	}
	
	public ParserRule getGSSFilterMaxtermFilterRule() {
		return getGSSFilterMaxtermFilterAccess().getRule();
	}
	
	//GSSFilterMintermFilter:
	//	'GSSFilterMintermFilter'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
	//	'formatFile' ':=' formatFile=ID ';' (BoolVar+=GSSFilterBoolVar | BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem
	//	| BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=GSSFilterBoolVarFDIC)+)
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
	//	FieldRef=GSSFilterFieldRef
	//	Op=GSSFilterFieldOp (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
	//	'}' ';';
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
	//	AIFieldRef=GSSFilterAIFieldRef
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
	//	'group' ':=' group=EString ';'
	//	AIFieldRefs=GSSFilterAIFieldRefs
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
	//	FieldRef=GSSFilterFieldRef
	//	Op=GSSFilterFieldOp
	//	'}' ';';
	public GSSFilterBoolVarFDICElements getGSSFilterBoolVarFDICAccess() {
		return pGSSFilterBoolVarFDIC;
	}
	
	public ParserRule getGSSFilterBoolVarFDICRule() {
		return getGSSFilterBoolVarFDICAccess().getRule();
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
	
	//GSSFilterFieldRef:
	//	'GSSFilterFieldRef' '{'
	//	'name' ':=' name=ID ';'
	//	'}' ';';
	public GSSFilterFieldRefElements getGSSFilterFieldRefAccess() {
		return pGSSFilterFieldRef;
	}
	
	public ParserRule getGSSFilterFieldRefRule() {
		return getGSSFilterFieldRefAccess().getRule();
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
	
	//GSSFilterAIFieldRef:
	//	'GSSFilterAIFieldRef' '{'
	//	'index' ':=' index=INTEGER ';'
	//	'}' ';';
	public GSSFilterAIFieldRefElements getGSSFilterAIFieldRefAccess() {
		return pGSSFilterAIFieldRef;
	}
	
	public ParserRule getGSSFilterAIFieldRefRule() {
		return getGSSFilterAIFieldRefAccess().getRule();
	}
	
	//GSSFilterAIFieldRefs:
	//	'GSSFilterAIFieldRefs' '{'
	//	'name' ':=' name=ID ';'
	//	'}' ';';
	public GSSFilterAIFieldRefsElements getGSSFilterAIFieldRefsAccess() {
		return pGSSFilterAIFieldRefs;
	}
	
	public ParserRule getGSSFilterAIFieldRefsRule() {
		return getGSSFilterAIFieldRefsAccess().getRule();
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
	//	'id' ':=' id=INTEGER
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
