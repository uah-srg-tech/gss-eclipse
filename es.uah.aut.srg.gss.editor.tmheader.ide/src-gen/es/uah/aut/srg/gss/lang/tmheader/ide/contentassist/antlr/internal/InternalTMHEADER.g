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
grammar InternalTMHEADER;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tmheader.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tmheader.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tmheader.services.TMHEADERGrammarAccess;

}
@parser::members {
	private TMHEADERGrammarAccess grammarAccess;

	public void setGrammarAccess(TMHEADERGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSTMHeader
entryRuleGSSTMHeader
:
{ before(grammarAccess.getGSSTMHeaderRule()); }
	 ruleGSSTMHeader
{ after(grammarAccess.getGSSTMHeaderRule()); } 
	 EOF 
;

// Rule GSSTMHeader
ruleGSSTMHeader 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMHeaderAccess().getGroup()); }
		(rule__GSSTMHeader__Group__0)
		{ after(grammarAccess.getGSSTMHeaderAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTMHeaderField
entryRuleGSSTMHeaderField
:
{ before(grammarAccess.getGSSTMHeaderFieldRule()); }
	 ruleGSSTMHeaderField
{ after(grammarAccess.getGSSTMHeaderFieldRule()); } 
	 EOF 
;

// Rule GSSTMHeaderField
ruleGSSTMHeaderField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGroup()); }
		(rule__GSSTMHeaderField__Group__0)
		{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGroup()); }
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

rule__GSSTMHeaderField__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGroup_5_0()); }
		(rule__GSSTMHeaderField__Group_5_0__0)
		{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTMHeaderFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); }
		'/>'
		{ after(grammarAccess.getGSSTMHeaderFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); }
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

rule__GSSTMHeader__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__0__Impl
	rule__GSSTMHeader__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getGSSTMHeaderKeyword_0()); }
	'<GSSTMHeader'
	{ after(grammarAccess.getGSSTMHeaderAccess().getGSSTMHeaderKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__1__Impl
	rule__GSSTMHeader__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMHeaderAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__2__Impl
	rule__GSSTMHeader__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getNameAssignment_2()); }
	(rule__GSSTMHeader__NameAssignment_2)
	{ after(grammarAccess.getGSSTMHeaderAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__3__Impl
	rule__GSSTMHeader__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getGSSTMHeaderAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__4__Impl
	rule__GSSTMHeader__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getFormatKeyword_4()); }
	'<format'
	{ after(grammarAccess.getGSSTMHeaderAccess().getFormatKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__5__Impl
	rule__GSSTMHeader__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getFileKeyword_5()); }
	'file='
	{ after(grammarAccess.getGSSTMHeaderAccess().getFileKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__6__Impl
	rule__GSSTMHeader__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getFormatAssignment_6()); }
	(rule__GSSTMHeader__FormatAssignment_6)
	{ after(grammarAccess.getGSSTMHeaderAccess().getFormatAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__7__Impl
	rule__GSSTMHeader__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getGSSTMHeaderAccess().getSolidusGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__8__Impl
	rule__GSSTMHeader__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getGroup_8()); }
	(rule__GSSTMHeader__Group_8__0)?
	{ after(grammarAccess.getGSSTMHeaderAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getGSSTMHeaderKeyword_9()); }
	'</GSSTMHeader>'
	{ after(grammarAccess.getGSSTMHeaderAccess().getGSSTMHeaderKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMHeader__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group_8__0__Impl
	rule__GSSTMHeader__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getFieldsKeyword_8_0()); }
	'<fields>'
	{ after(grammarAccess.getGSSTMHeaderAccess().getFieldsKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group_8__1__Impl
	rule__GSSTMHeader__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTMHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
		(rule__GSSTMHeader__GssHeaderFieldsAssignment_8_1)
		{ after(grammarAccess.getGSSTMHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
	)
	(
		{ before(grammarAccess.getGSSTMHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
		(rule__GSSTMHeader__GssHeaderFieldsAssignment_8_1)*
		{ after(grammarAccess.getGSSTMHeaderAccess().getGssHeaderFieldsAssignment_8_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeader__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderAccess().getFieldsKeyword_8_2()); }
	'</fields>'
	{ after(grammarAccess.getGSSTMHeaderAccess().getFieldsKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMHeaderField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group__0__Impl
	rule__GSSTMHeaderField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getHeaderFieldKeyword_0()); }
	'<HeaderField'
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getHeaderFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group__1__Impl
	rule__GSSTMHeaderField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group__2__Impl
	rule__GSSTMHeaderField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getNameAssignment_2()); }
	(rule__GSSTMHeaderField__NameAssignment_2)
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group__3__Impl
	rule__GSSTMHeaderField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldKeyword_3()); }
	'gssHeaderField='
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group__4__Impl
	rule__GSSTMHeaderField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldAssignment_4()); }
	(rule__GSSTMHeaderField__GssHeaderFieldAssignment_4)
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getAlternatives_5()); }
	(rule__GSSTMHeaderField__Alternatives_5)
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMHeaderField__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group_5_0__0__Impl
	rule__GSSTMHeaderField__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGreaterThanSignKeyword_5_0_0()); }
	'>'
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGreaterThanSignKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group_5_0__1__Impl
	rule__GSSTMHeaderField__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getFieldValueAssignment_5_0_1()); }
	(rule__GSSTMHeaderField__FieldValueAssignment_5_0_1)
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getFieldValueAssignment_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMHeaderField__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMHeaderFieldAccess().getHeaderFieldKeyword_5_0_2()); }
	'</HeaderField>'
	{ after(grammarAccess.getGSSTMHeaderFieldAccess().getHeaderFieldKeyword_5_0_2()); }
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


rule__GSSTMHeader__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMHeaderAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__FormatAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderAccess().getFormatGSSFormatFormatCrossReference_6_0()); }
		(
			{ before(grammarAccess.getGSSTMHeaderAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMHeaderAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getGSSTMHeaderAccess().getFormatGSSFormatFormatCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeader__GssHeaderFieldsAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderAccess().getGssHeaderFieldsGSSTMHeaderFieldParserRuleCall_8_1_0()); }
		ruleGSSTMHeaderField
		{ after(grammarAccess.getGSSTMHeaderAccess().getGssHeaderFieldsGSSTMHeaderFieldParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMHeaderFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__GssHeaderFieldAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMHeaderField__FieldValueAssignment_5_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMHeaderFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); }
		ruleTMTCIFFieldValueRaw
		{ after(grammarAccess.getGSSTMHeaderFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); }
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
