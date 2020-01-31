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
grammar InternalTCHEADER;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tcheader.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tcheader.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import es.uah.aut.srg.gss.lang.tcheader.services.TCHEADERGrammarAccess;

}
@parser::members {
	private TCHEADERGrammarAccess grammarAccess;

	public void setGrammarAccess(TCHEADERGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGSSTCHeader
entryRuleGSSTCHeader
:
{ before(grammarAccess.getGSSTCHeaderRule()); }
	 ruleGSSTCHeader
{ after(grammarAccess.getGSSTCHeaderRule()); } 
	 EOF 
;

// Rule GSSTCHeader
ruleGSSTCHeader 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTCHeaderAccess().getGroup()); }
		(rule__GSSTCHeader__Group__0)
		{ after(grammarAccess.getGSSTCHeaderAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTCHeaderField
entryRuleGSSTCHeaderField
:
{ before(grammarAccess.getGSSTCHeaderFieldRule()); }
	 ruleGSSTCHeaderField
{ after(grammarAccess.getGSSTCHeaderFieldRule()); } 
	 EOF 
;

// Rule GSSTCHeaderField
ruleGSSTCHeaderField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGroup()); }
		(rule__GSSTCHeaderField__Group__0)
		{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFieldValueRaw
entryRuleTMTCIFFieldValueRaw
:
{ before(grammarAccess.getTMTCIFFieldValueRawRule()); }
	 ruleTMTCIFFieldValueRaw
{ after(grammarAccess.getTMTCIFFieldValueRawRule()); } 
	 EOF 
;

// Rule TMTCIFFieldValueRaw
ruleTMTCIFFieldValueRaw 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); }
		(rule__TMTCIFFieldValueRaw__Group__0)
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGroup_5_0()); }
		(rule__GSSTCHeaderField__Group_5_0__0)
		{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTCHeaderFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); }
		'/>'
		{ after(grammarAccess.getGSSTCHeaderFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); }
		RULE_HEX_STRING
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__0__Impl
	rule__GSSTCHeader__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getGSSTCHeaderKeyword_0()); }
	'<GSSTCHeader'
	{ after(grammarAccess.getGSSTCHeaderAccess().getGSSTCHeaderKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__1__Impl
	rule__GSSTCHeader__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTCHeaderAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__2__Impl
	rule__GSSTCHeader__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getNameAssignment_2()); }
	(rule__GSSTCHeader__NameAssignment_2)
	{ after(grammarAccess.getGSSTCHeaderAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__3__Impl
	rule__GSSTCHeader__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getGSSTCHeaderAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__4__Impl
	rule__GSSTCHeader__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getFormatKeyword_4()); }
	'<format'
	{ after(grammarAccess.getGSSTCHeaderAccess().getFormatKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__5__Impl
	rule__GSSTCHeader__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getFileKeyword_5()); }
	'file='
	{ after(grammarAccess.getGSSTCHeaderAccess().getFileKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__6__Impl
	rule__GSSTCHeader__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getFormatAssignment_6()); }
	(rule__GSSTCHeader__FormatAssignment_6)
	{ after(grammarAccess.getGSSTCHeaderAccess().getFormatAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__7__Impl
	rule__GSSTCHeader__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getGSSTCHeaderAccess().getSolidusGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__8__Impl
	rule__GSSTCHeader__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getGroup_8()); }
	(rule__GSSTCHeader__Group_8__0)?
	{ after(grammarAccess.getGSSTCHeaderAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getGSSTCHeaderKeyword_9()); }
	'</GSSTCHeader>'
	{ after(grammarAccess.getGSSTCHeaderAccess().getGSSTCHeaderKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCHeader__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group_8__0__Impl
	rule__GSSTCHeader__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getFieldsKeyword_8_0()); }
	'<fields>'
	{ after(grammarAccess.getGSSTCHeaderAccess().getFieldsKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group_8__1__Impl
	rule__GSSTCHeader__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
		(rule__GSSTCHeader__GssHeaderFieldsAssignment_8_1)
		{ after(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
	)
	(
		{ before(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
		(rule__GSSTCHeader__GssHeaderFieldsAssignment_8_1)*
		{ after(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeader__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderAccess().getFieldsKeyword_8_2()); }
	'</fields>'
	{ after(grammarAccess.getGSSTCHeaderAccess().getFieldsKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCHeaderField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group__0__Impl
	rule__GSSTCHeaderField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getHeaderFieldKeyword_0()); }
	'<HeaderField'
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getHeaderFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group__1__Impl
	rule__GSSTCHeaderField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group__2__Impl
	rule__GSSTCHeaderField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getNameAssignment_2()); }
	(rule__GSSTCHeaderField__NameAssignment_2)
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group__3__Impl
	rule__GSSTCHeaderField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldKeyword_3()); }
	'gssHeaderField='
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group__4__Impl
	rule__GSSTCHeaderField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldAssignment_4()); }
	(rule__GSSTCHeaderField__GssHeaderFieldAssignment_4)
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getAlternatives_5()); }
	(rule__GSSTCHeaderField__Alternatives_5)
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCHeaderField__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group_5_0__0__Impl
	rule__GSSTCHeaderField__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGreaterThanSignKeyword_5_0_0()); }
	'>'
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGreaterThanSignKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group_5_0__1__Impl
	rule__GSSTCHeaderField__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getFieldValueAssignment_5_0_1()); }
	(rule__GSSTCHeaderField__FieldValueAssignment_5_0_1)
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getFieldValueAssignment_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCHeaderField__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCHeaderFieldAccess().getHeaderFieldKeyword_5_0_2()); }
	'</HeaderField>'
	{ after(grammarAccess.getGSSTCHeaderFieldAccess().getHeaderFieldKeyword_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFieldValueRaw__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__0__Impl
	rule__TMTCIFFieldValueRaw__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); }
	'<FieldValueRaw'
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__1__Impl
	rule__TMTCIFFieldValueRaw__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); }
	'value='
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__2__Impl
	rule__TMTCIFFieldValueRaw__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); }
	(rule__TMTCIFFieldValueRaw__ValueAssignment_2)
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); }
	'/>'
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCHeader__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTCHeaderAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__FormatAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderAccess().getFormatGSSFormatFormatCrossReference_6_0()); }
		(
			{ before(grammarAccess.getGSSTCHeaderAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCHeaderAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getGSSTCHeaderAccess().getFormatGSSFormatFormatCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeader__GssHeaderFieldsAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsGSSTCHeaderFieldParserRuleCall_8_1_0()); }
		ruleGSSTCHeaderField
		{ after(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsGSSTCHeaderFieldParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTCHeaderFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__GssHeaderFieldAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCHeaderField__FieldValueAssignment_5_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCHeaderFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); }
		ruleTMTCIFFieldValueRaw
		{ after(grammarAccess.getGSSTCHeaderFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); }
		(rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0)
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_HEX_STRING : '"0x' ('0'..'9'|'a'..'f'|'A'..'F')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
