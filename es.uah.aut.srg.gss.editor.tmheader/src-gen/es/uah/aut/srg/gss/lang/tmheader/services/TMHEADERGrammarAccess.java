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
package es.uah.aut.srg.gss.lang.tmheader.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
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
public class TMHEADERGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSTMHeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmheader.TMHEADER.GSSTMHeader");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTMHeaderKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cFormatKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cFileKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFormatAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cFormatGSSFormatFormatCrossReference_6_0 = (CrossReference)cFormatAssignment_6.eContents().get(0);
		private final RuleCall cFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1 = (RuleCall)cFormatGSSFormatFormatCrossReference_6_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cFieldsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cGssHeaderFieldsAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cGssHeaderFieldsGSSTMHeaderFieldParserRuleCall_8_1_0 = (RuleCall)cGssHeaderFieldsAssignment_8_1.eContents().get(0);
		private final Keyword cFieldsKeyword_8_2 = (Keyword)cGroup_8.eContents().get(2);
		private final Keyword cGSSTMHeaderKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//GSSTMHeader:
		//	'<GSSTMHeader'
		//	'name=' name=STRING
		//	'>'
		//	'<format' 'file=' format=[format::GSSFormatFormat|STRING] '/>' ('<fields>' gssHeaderFields+=GSSTMHeaderField+
		//	'</fields>')?
		//	'</GSSTMHeader>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<GSSTMHeader' 'name=' name=STRING '>' '<format' 'file=' format=[format::GSSFormatFormat|STRING] '/>' ('<fields>'
		//gssHeaderFields+=GSSTMHeaderField+ '</fields>')? '</GSSTMHeader>'
		public Group getGroup() { return cGroup; }
		
		//'<GSSTMHeader'
		public Keyword getGSSTMHeaderKeyword_0() { return cGSSTMHeaderKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//'<format'
		public Keyword getFormatKeyword_4() { return cFormatKeyword_4; }
		
		//'file='
		public Keyword getFileKeyword_5() { return cFileKeyword_5; }
		
		//format=[format::GSSFormatFormat|STRING]
		public Assignment getFormatAssignment_6() { return cFormatAssignment_6; }
		
		//[format::GSSFormatFormat|STRING]
		public CrossReference getFormatGSSFormatFormatCrossReference_6_0() { return cFormatGSSFormatFormatCrossReference_6_0; }
		
		//STRING
		public RuleCall getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1() { return cFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_7() { return cSolidusGreaterThanSignKeyword_7; }
		
		//('<fields>' gssHeaderFields+=GSSTMHeaderField+ '</fields>')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'<fields>'
		public Keyword getFieldsKeyword_8_0() { return cFieldsKeyword_8_0; }
		
		//gssHeaderFields+=GSSTMHeaderField+
		public Assignment getGssHeaderFieldsAssignment_8_1() { return cGssHeaderFieldsAssignment_8_1; }
		
		//GSSTMHeaderField
		public RuleCall getGssHeaderFieldsGSSTMHeaderFieldParserRuleCall_8_1_0() { return cGssHeaderFieldsGSSTMHeaderFieldParserRuleCall_8_1_0; }
		
		//'</fields>'
		public Keyword getFieldsKeyword_8_2() { return cFieldsKeyword_8_2; }
		
		//'</GSSTMHeader>'
		public Keyword getGSSTMHeaderKeyword_9() { return cGSSTMHeaderKeyword_9; }
	}
	public class GSSTMHeaderFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmheader.TMHEADER.GSSTMHeaderField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHeaderFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGssHeaderFieldKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGssHeaderFieldAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cGssHeaderFieldGSSFormatFieldCrossReference_4_0 = (CrossReference)cGssHeaderFieldAssignment_4.eContents().get(0);
		private final RuleCall cGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cGssHeaderFieldGSSFormatFieldCrossReference_4_0.eContents().get(1);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cFieldValueAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final RuleCall cFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0 = (RuleCall)cFieldValueAssignment_5_0_1.eContents().get(0);
		private final Keyword cHeaderFieldKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Keyword cSolidusGreaterThanSignKeyword_5_1 = (Keyword)cAlternatives_5.eContents().get(1);
		
		//GSSTMHeaderField:
		//	'<HeaderField'
		//	'name=' name=STRING
		//	'gssHeaderField=' gssHeaderField=[format::GSSFormatField|STRING] ('>' fieldValue=TMTCIFFieldValueRaw '</HeaderField>'
		//	| '/>');
		@Override public ParserRule getRule() { return rule; }
		
		//'<HeaderField' 'name=' name=STRING 'gssHeaderField=' gssHeaderField=[format::GSSFormatField|STRING] ('>'
		//fieldValue=TMTCIFFieldValueRaw '</HeaderField>' | '/>')
		public Group getGroup() { return cGroup; }
		
		//'<HeaderField'
		public Keyword getHeaderFieldKeyword_0() { return cHeaderFieldKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'gssHeaderField='
		public Keyword getGssHeaderFieldKeyword_3() { return cGssHeaderFieldKeyword_3; }
		
		//gssHeaderField=[format::GSSFormatField|STRING]
		public Assignment getGssHeaderFieldAssignment_4() { return cGssHeaderFieldAssignment_4; }
		
		//[format::GSSFormatField|STRING]
		public CrossReference getGssHeaderFieldGSSFormatFieldCrossReference_4_0() { return cGssHeaderFieldGSSFormatFieldCrossReference_4_0; }
		
		//STRING
		public RuleCall getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1() { return cGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1; }
		
		//('>' fieldValue=TMTCIFFieldValueRaw '</HeaderField>' | '/>')
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'>' fieldValue=TMTCIFFieldValueRaw '</HeaderField>'
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5_0_0() { return cGreaterThanSignKeyword_5_0_0; }
		
		//fieldValue=TMTCIFFieldValueRaw
		public Assignment getFieldValueAssignment_5_0_1() { return cFieldValueAssignment_5_0_1; }
		
		//TMTCIFFieldValueRaw
		public RuleCall getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0() { return cFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0; }
		
		//'</HeaderField>'
		public Keyword getHeaderFieldKeyword_5_0_2() { return cHeaderFieldKeyword_5_0_2; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5_1() { return cSolidusGreaterThanSignKeyword_5_1; }
	}
	public class TMTCIFFieldValueRawElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmheader.TMHEADER.TMTCIFFieldValueRaw");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueRawKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cValueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cValueAlternatives_2_0 = (Alternatives)cValueAssignment_2.eContents().get(0);
		private final RuleCall cValueUINT_STRINGTerminalRuleCall_2_0_0 = (RuleCall)cValueAlternatives_2_0.eContents().get(0);
		private final RuleCall cValueHEX_STRINGTerminalRuleCall_2_0_1 = (RuleCall)cValueAlternatives_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TMTCIFFieldValueRaw fieldvalue::TMTCIFFieldValueRaw:
		//	'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueRaw'
		public Keyword getFieldValueRawKeyword_0() { return cFieldValueRawKeyword_0; }
		
		//'value='
		public Keyword getValueKeyword_1() { return cValueKeyword_1; }
		
		//value=(UINT_STRING | HEX_STRING)
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//(UINT_STRING | HEX_STRING)
		public Alternatives getValueAlternatives_2_0() { return cValueAlternatives_2_0; }
		
		//UINT_STRING
		public RuleCall getValueUINT_STRINGTerminalRuleCall_2_0_0() { return cValueUINT_STRINGTerminalRuleCall_2_0_0; }
		
		//HEX_STRING
		public RuleCall getValueHEX_STRINGTerminalRuleCall_2_0_1() { return cValueHEX_STRINGTerminalRuleCall_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	
	
	private final GSSTMHeaderElements pGSSTMHeader;
	private final GSSTMHeaderFieldElements pGSSTMHeaderField;
	private final TMTCIFFieldValueRawElements pTMTCIFFieldValueRaw;
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tHEX_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TMHEADERGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSTMHeader = new GSSTMHeaderElements();
		this.pGSSTMHeaderField = new GSSTMHeaderFieldElements();
		this.pTMTCIFFieldValueRaw = new TMTCIFFieldValueRawElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmheader.TMHEADER.UINT_STRING");
		this.tHEX_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tmheader.TMHEADER.HEX_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.tmheader.TMHEADER".equals(grammar.getName())) {
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

	
	//GSSTMHeader:
	//	'<GSSTMHeader'
	//	'name=' name=STRING
	//	'>'
	//	'<format' 'file=' format=[format::GSSFormatFormat|STRING] '/>' ('<fields>' gssHeaderFields+=GSSTMHeaderField+
	//	'</fields>')?
	//	'</GSSTMHeader>';
	public GSSTMHeaderElements getGSSTMHeaderAccess() {
		return pGSSTMHeader;
	}
	
	public ParserRule getGSSTMHeaderRule() {
		return getGSSTMHeaderAccess().getRule();
	}
	
	//GSSTMHeaderField:
	//	'<HeaderField'
	//	'name=' name=STRING
	//	'gssHeaderField=' gssHeaderField=[format::GSSFormatField|STRING] ('>' fieldValue=TMTCIFFieldValueRaw '</HeaderField>'
	//	| '/>');
	public GSSTMHeaderFieldElements getGSSTMHeaderFieldAccess() {
		return pGSSTMHeaderField;
	}
	
	public ParserRule getGSSTMHeaderFieldRule() {
		return getGSSTMHeaderFieldAccess().getRule();
	}
	
	//TMTCIFFieldValueRaw fieldvalue::TMTCIFFieldValueRaw:
	//	'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
	public TMTCIFFieldValueRawElements getTMTCIFFieldValueRawAccess() {
		return pTMTCIFFieldValueRaw;
	}
	
	public ParserRule getTMTCIFFieldValueRawRule() {
		return getTMTCIFFieldValueRawAccess().getRule();
	}
	
	//terminal UINT_STRING:
	//	'"' '0'..'9'+ '"';
	public TerminalRule getUINT_STRINGRule() {
		return tUINT_STRING;
	}
	
	//terminal HEX_STRING:
	//	'"0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+ '"';
	public TerminalRule getHEX_STRINGRule() {
		return tHEX_STRING;
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
