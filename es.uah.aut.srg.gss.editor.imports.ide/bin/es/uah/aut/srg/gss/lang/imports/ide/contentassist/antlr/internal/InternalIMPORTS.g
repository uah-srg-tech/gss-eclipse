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
grammar InternalIMPORTS;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.imports.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.imports.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.imports.services.IMPORTSGrammarAccess;

}
@parser::members {
	private IMPORTSGrammarAccess grammarAccess;

	public void setGrammarAccess(IMPORTSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSModelFile
entryRuleGSSModelFile
:
{ before(grammarAccess.getGSSModelFileRule()); }
	 ruleGSSModelFile
{ after(grammarAccess.getGSSModelFileRule()); } 
	 EOF 
;

// Rule GSSModelFile
ruleGSSModelFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSModelFileAccess().getGroup()); }
		(rule__GSSModelFile__Group__0)
		{ after(grammarAccess.getGSSModelFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSModelFileImport
entryRuleGSSModelFileImport
:
{ before(grammarAccess.getGSSModelFileImportRule()); }
	 ruleGSSModelFileImport
{ after(grammarAccess.getGSSModelFileImportRule()); } 
	 EOF 
;

// Rule GSSModelFileImport
ruleGSSModelFileImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSModelFileImportAccess().getGroup()); }
		(rule__GSSModelFileImport__Group__0)
		{ after(grammarAccess.getGSSModelFileImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSImportImport
entryRuleGSSImportImport
:
{ before(grammarAccess.getGSSImportImportRule()); }
	 ruleGSSImportImport
{ after(grammarAccess.getGSSImportImportRule()); } 
	 EOF 
;

// Rule GSSImportImport
ruleGSSImportImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getGroup()); }
		(rule__GSSImportImport__Group__0)
		{ after(grammarAccess.getGSSImportImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSImportDataSource
entryRuleGSSImportDataSource
:
{ before(grammarAccess.getGSSImportDataSourceRule()); }
	 ruleGSSImportDataSource
{ after(grammarAccess.getGSSImportDataSourceRule()); } 
	 EOF 
;

// Rule GSSImportDataSource
ruleGSSImportDataSource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSImportDataSourceAccess().getGroup()); }
		(rule__GSSImportDataSource__Group__0)
		{ after(grammarAccess.getGSSImportDataSourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSImportVirtualSize
entryRuleGSSImportVirtualSize
:
{ before(grammarAccess.getGSSImportVirtualSizeRule()); }
	 ruleGSSImportVirtualSize
{ after(grammarAccess.getGSSImportVirtualSizeRule()); } 
	 EOF 
;

// Rule GSSImportVirtualSize
ruleGSSImportVirtualSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSImportVirtualSizeAccess().getGroup()); }
		(rule__GSSImportVirtualSize__Group__0)
		{ after(grammarAccess.getGSSImportVirtualSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersion
entryRuleVersion
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionAccess().getGroup()); }
		(rule__Version__Group__0)
		{ after(grammarAccess.getVersionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName
:
{ before(grammarAccess.getVersionedQualifiedNameRule()); }
	 ruleVersionedQualifiedName
{ after(grammarAccess.getVersionedQualifiedNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
		(rule__VersionedQualifiedName__Group__0)
		{ after(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINTEGER
entryRuleINTEGER
:
{ before(grammarAccess.getINTEGERRule()); }
	 ruleINTEGER
{ after(grammarAccess.getINTEGERRule()); } 
	 EOF 
;

// Rule INTEGER
ruleINTEGER 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINTEGERAccess().getAlternatives()); }
		(rule__INTEGER__Alternatives)
		{ after(grammarAccess.getINTEGERAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSImportUnit
ruleGSSImportUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportUnitAccess().getAlternatives()); }
		(rule__GSSImportUnit__Alternatives)
		{ after(grammarAccess.getGSSImportUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getVersionAccess().getGroup_0_1()); }
		(rule__Version__Group_0_1__0)
		{ after(grammarAccess.getVersionAccess().getGroup_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
		(rule__Version__Group_1_1_1__0)
		{ after(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getINTEGERAccess().getGroup_0()); }
		(rule__INTEGER__Group_0__0)
		{ after(grammarAccess.getINTEGERAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
		('bits')
		{ after(grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
		('bytes')
		{ after(grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSModelFile__Group__0__Impl
	rule__GSSModelFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); }
	(rule__GSSModelFile__ImportsAssignment_0)*
	{ after(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSModelFile__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); }
	(rule__GSSModelFile__ElementAssignment_1)
	{ after(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSModelFileImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSModelFileImport__Group__0__Impl
	rule__GSSModelFileImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSModelFileImport__Group__1__Impl
	rule__GSSModelFileImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); }
	':='
	{ after(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSModelFileImport__Group__2__Impl
	rule__GSSModelFileImport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); }
	(rule__GSSModelFileImport__ImportURIAssignment_2)
	{ after(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSModelFileImport__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__0__Impl
	rule__GSSImportImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getGSSImportImportKeyword_0()); }
	'GSSImportImport'
	{ after(grammarAccess.getGSSImportImportAccess().getGSSImportImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__1__Impl
	rule__GSSImportImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getNameAssignment_1()); }
	(rule__GSSImportImport__NameAssignment_1)
	{ after(grammarAccess.getGSSImportImportAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__2__Impl
	rule__GSSImportImport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSImportImportAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__3__Impl
	rule__GSSImportImport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()); }
	(rule__GSSImportImport__UnorderedGroup_3)
	{ after(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__4__Impl
	rule__GSSImportImport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getFromKeyword_4()); }
	'from'
	{ after(grammarAccess.getGSSImportImportAccess().getFromKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__5__Impl
	rule__GSSImportImport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__6__Impl
	rule__GSSImportImport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getFromAssignment_6()); }
	(rule__GSSImportImport__FromAssignment_6)
	{ after(grammarAccess.getGSSImportImportAccess().getFromAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__7__Impl
	rule__GSSImportImport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__8__Impl
	rule__GSSImportImport__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getToKeyword_8()); }
	'to'
	{ after(grammarAccess.getGSSImportImportAccess().getToKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__9__Impl
	rule__GSSImportImport__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_9()); }
	':='
	{ after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__10__Impl
	rule__GSSImportImport__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getToAssignment_10()); }
	(rule__GSSImportImport__ToAssignment_10)
	{ after(grammarAccess.getGSSImportImportAccess().getToAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__11__Impl
	rule__GSSImportImport__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__12__Impl
	rule__GSSImportImport__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); }
		(rule__GSSImportImport__DataSourceAssignment_12)
		{ after(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); }
	)
	(
		{ before(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); }
		(rule__GSSImportImport__DataSourceAssignment_12)*
		{ after(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__13__Impl
	rule__GSSImportImport__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getVirtualSizeAssignment_13()); }
	(rule__GSSImportImport__VirtualSizeAssignment_13)?
	{ after(grammarAccess.getGSSImportImportAccess().getVirtualSizeAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__14__Impl
	rule__GSSImportImport__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSImportImportAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportImport__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_0__0__Impl
	rule__GSSImportImport__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSImportImportAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_0__1__Impl
	rule__GSSImportImport__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_0__2__Impl
	rule__GSSImportImport__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getUriAssignment_3_0_2()); }
	(rule__GSSImportImport__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSImportImportAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportImport__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_1__0__Impl
	rule__GSSImportImport__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSImportImportAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_1__1__Impl
	rule__GSSImportImport__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_1__2__Impl
	rule__GSSImportImport__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSImportImport__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSImportImportAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportDataSource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__0__Impl
	rule__GSSImportDataSource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getGSSImportDataSourceKeyword_0()); }
	'GSSImportDataSource'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getGSSImportDataSourceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__1__Impl
	rule__GSSImportDataSource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__2__Impl
	rule__GSSImportDataSource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefKeyword_2()); }
	'FieldRef'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__3__Impl
	rule__GSSImportDataSource__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__4__Impl
	rule__GSSImportDataSource__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefAssignment_4()); }
	(rule__GSSImportDataSource__FieldRefAssignment_4)
	{ after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__5__Impl
	rule__GSSImportDataSource__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__6__Impl
	rule__GSSImportDataSource__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimKeyword_6()); }
	'leftTrim'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__7__Impl
	rule__GSSImportDataSource__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__8__Impl
	rule__GSSImportDataSource__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimAssignment_8()); }
	(rule__GSSImportDataSource__LeftTrimAssignment_8)
	{ after(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__9__Impl
	rule__GSSImportDataSource__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__10__Impl
	rule__GSSImportDataSource__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getRightTrimKeyword_10()); }
	'rightTrim'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getRightTrimKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__11__Impl
	rule__GSSImportDataSource__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__12__Impl
	rule__GSSImportDataSource__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getRightTrimAssignment_12()); }
	(rule__GSSImportDataSource__RightTrimAssignment_12)
	{ after(grammarAccess.getGSSImportDataSourceAccess().getRightTrimAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__13__Impl
	rule__GSSImportDataSource__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__14__Impl
	rule__GSSImportDataSource__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportDataSource__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportVirtualSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__0__Impl
	rule__GSSImportVirtualSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getGSSImportVirtualSizeKeyword_0()); }
	'GSSImportVirtualSize'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getGSSImportVirtualSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__1__Impl
	rule__GSSImportVirtualSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__2__Impl
	rule__GSSImportVirtualSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefKeyword_2()); }
	'FieldRef'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__3__Impl
	rule__GSSImportVirtualSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__4__Impl
	rule__GSSImportVirtualSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefAssignment_4()); }
	(rule__GSSImportVirtualSize__FieldRefAssignment_4)
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__5__Impl
	rule__GSSImportVirtualSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__6__Impl
	rule__GSSImportVirtualSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getToKeyword_6()); }
	'to'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getToKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__7__Impl
	rule__GSSImportVirtualSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__8__Impl
	rule__GSSImportVirtualSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getToAssignment_8()); }
	(rule__GSSImportVirtualSize__ToAssignment_8)
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getToAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__9__Impl
	rule__GSSImportVirtualSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__10__Impl
	rule__GSSImportVirtualSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_10()); }
	(rule__GSSImportVirtualSize__Group_10__0)?
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__11__Impl
	rule__GSSImportVirtualSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_11()); }
	(rule__GSSImportVirtualSize__Group_11__0)?
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__12__Impl
	rule__GSSImportVirtualSize__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportVirtualSize__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_10__0__Impl
	rule__GSSImportVirtualSize__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeKeyword_10_0()); }
	'addSize'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_10__1__Impl
	rule__GSSImportVirtualSize__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_10__2__Impl
	rule__GSSImportVirtualSize__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeAssignment_10_2()); }
	(rule__GSSImportVirtualSize__AddSizeAssignment_10_2)
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportVirtualSize__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_11__0__Impl
	rule__GSSImportVirtualSize__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getUnitKeyword_11_0()); }
	'unit'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getUnitKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_11__1__Impl
	rule__GSSImportVirtualSize__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_11__2__Impl
	rule__GSSImportVirtualSize__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getUnitAssignment_11_2()); }
	(rule__GSSImportVirtualSize__UnitAssignment_11_2)
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getUnitAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportVirtualSize__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__0__Impl
	rule__Version__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getAlternatives_0()); }
	(rule__Version__Alternatives_0)
	{ after(grammarAccess.getVersionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getGroup_1()); }
	(rule__Version__Group_1__0)*
	{ after(grammarAccess.getVersionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_0_1__0__Impl
	rule__Version__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1__0__Impl
	rule__Version__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
	(rule__Version__Alternatives_1_1)
	{ after(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1_1_1__0__Impl
	rule__Version__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__0__Impl
	rule__VersionedQualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__1__Impl
	rule__VersionedQualifiedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__2__Impl
	rule__VersionedQualifiedName__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
	ruleVersion
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__INTEGER__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INTEGER__Group_0__0__Impl
	rule__INTEGER__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); }
	('-')?
	{ after(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INTEGER__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); }
	RULE_INT
	{ after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSImportImport__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
	}
:
	rule__GSSImportImport__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSImportImport__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSImportImportAccess().getGroup_3_0()); }
					(rule__GSSImportImport__Group_3_0__0)
					{ after(grammarAccess.getGSSImportImportAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSImportImportAccess().getGroup_3_1()); }
					(rule__GSSImportImport__Group_3_1__0)
					{ after(grammarAccess.getGSSImportImportAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSImportImport__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__UnorderedGroup_3__Impl
	rule__GSSImportImport__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSImportImport__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSModelFile__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSModelFileAccess().getImportsGSSModelFileImportParserRuleCall_0_0()); }
		ruleGSSModelFileImport
		{ after(grammarAccess.getGSSModelFileAccess().getImportsGSSModelFileImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFile__ElementAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSImportImportParserRuleCall_1_0()); }
		ruleGSSImportImport
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSImportImportParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__ImportURIAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getGSSImportImportAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__FromAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getFromGSSTmTcFormatTmTcFormatCrossReference_6_0()); }
		(
			{ before(grammarAccess.getGSSImportImportAccess().getFromGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_6_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSImportImportAccess().getFromGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getGSSImportImportAccess().getFromGSSTmTcFormatTmTcFormatCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__ToAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getToGSSTmTcFormatTmTcFormatCrossReference_10_0()); }
		(
			{ before(grammarAccess.getGSSImportImportAccess().getToGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_10_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSImportImportAccess().getToGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_10_0_1()); }
		)
		{ after(grammarAccess.getGSSImportImportAccess().getToGSSTmTcFormatTmTcFormatCrossReference_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__DataSourceAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getDataSourceGSSImportDataSourceParserRuleCall_12_0()); }
		ruleGSSImportDataSource
		{ after(grammarAccess.getGSSImportImportAccess().getDataSourceGSSImportDataSourceParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportImport__VirtualSizeAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportImportAccess().getVirtualSizeGSSImportVirtualSizeParserRuleCall_13_0()); }
		ruleGSSImportVirtualSize
		{ after(grammarAccess.getGSSImportImportAccess().getVirtualSizeGSSImportVirtualSizeParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__FieldRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSTmTcFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSTmTcFormatFieldVersionedQualifiedNameParserRuleCall_4_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSTmTcFormatFieldVersionedQualifiedNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSTmTcFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__LeftTrimAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportDataSource__RightTrimAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__FieldRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__ToAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportVirtualSizeAccess().getToIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSImportVirtualSizeAccess().getToIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__AddSizeAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSImportVirtualSize__UnitAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSImportVirtualSizeAccess().getUnitGSSImportUnitEnumRuleCall_11_2_0()); }
		ruleGSSImportUnit
		{ after(grammarAccess.getGSSImportVirtualSizeAccess().getUnitGSSImportUnitEnumRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
