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
grammar InternalCONFIG;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.config.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.config.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;

}
@parser::members {
	private CONFIGGrammarAccess grammarAccess;

	public void setGrammarAccess(CONFIGGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSConfigGSSConfig
entryRuleGSSConfigGSSConfig
:
{ before(grammarAccess.getGSSConfigGSSConfigRule()); }
	 ruleGSSConfigGSSConfig
{ after(grammarAccess.getGSSConfigGSSConfigRule()); } 
	 EOF 
;

// Rule GSSConfigGSSConfig
ruleGSSConfigGSSConfig 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGroup()); }
		(rule__GSSConfigGSSConfig__Group__0)
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigTests
entryRuleGSSConfigTests
:
{ before(grammarAccess.getGSSConfigTestsRule()); }
	 ruleGSSConfigTests
{ after(grammarAccess.getGSSConfigTestsRule()); } 
	 EOF 
;

// Rule GSSConfigTests
ruleGSSConfigTests 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getGroup()); }
		(rule__GSSConfigTests__Group__0)
		{ after(grammarAccess.getGSSConfigTestsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigTestCase
entryRuleGSSConfigTestCase
:
{ before(grammarAccess.getGSSConfigTestCaseRule()); }
	 ruleGSSConfigTestCase
{ after(grammarAccess.getGSSConfigTestCaseRule()); } 
	 EOF 
;

// Rule GSSConfigTestCase
ruleGSSConfigTestCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getGroup()); }
		(rule__GSSConfigTestCase__Group__0)
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getGroup()); }
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

// Entry rule entryRuleVersionedQualifiedReferenceName
entryRuleVersionedQualifiedReferenceName
:
{ before(grammarAccess.getVersionedQualifiedReferenceNameRule()); }
	 ruleVersionedQualifiedReferenceName
{ after(grammarAccess.getVersionedQualifiedReferenceNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedReferenceName
ruleVersionedQualifiedReferenceName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); }
		(rule__VersionedQualifiedReferenceName__Group__0)
		{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigReqAction
ruleGSSConfigReqAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration()); }
		('_1')
		{ after(grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration()); }
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


rule__GSSConfigGSSConfig__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__0__Impl
	rule__GSSConfigGSSConfig__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0()); }
	'GSSConfigGSSConfig'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__1__Impl
	rule__GSSConfigGSSConfig__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getNameAssignment_1()); }
	(rule__GSSConfigGSSConfig__NameAssignment_1)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__2__Impl
	rule__GSSConfigGSSConfig__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__3__Impl
	rule__GSSConfigGSSConfig__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGroup_3()); }
	(rule__GSSConfigGSSConfig__Group_3__0)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__4__Impl
	rule__GSSConfigGSSConfig__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_4()); }
	'version'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__5__Impl
	rule__GSSConfigGSSConfig__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__6__Impl
	rule__GSSConfigGSSConfig__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getVersionAssignment_6()); }
	(rule__GSSConfigGSSConfig__VersionAssignment_6)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getVersionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__7__Impl
	rule__GSSConfigGSSConfig__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__8__Impl
	rule__GSSConfigGSSConfig__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioKeyword_8()); }
	'scenario'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__9__Impl
	rule__GSSConfigGSSConfig__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_9()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__10__Impl
	rule__GSSConfigGSSConfig__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioAssignment_10()); }
	(rule__GSSConfigGSSConfig__ScenarioAssignment_10)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__11__Impl
	rule__GSSConfigGSSConfig__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__12__Impl
	rule__GSSConfigGSSConfig__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getTestsAssignment_12()); }
	(rule__GSSConfigGSSConfig__TestsAssignment_12)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getTestsAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__13__Impl
	rule__GSSConfigGSSConfig__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSConfig__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__0__Impl
	rule__GSSConfigGSSConfig__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0()); }
	'uri'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__1__Impl
	rule__GSSConfigGSSConfig__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__2__Impl
	rule__GSSConfigGSSConfig__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUriAssignment_3_2()); }
	(rule__GSSConfigGSSConfig__UriAssignment_3_2)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUriAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_3()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTests__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__0__Impl
	rule__GSSConfigTests__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0()); }
	'GSSConfigTests'
	{ after(grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__1__Impl
	rule__GSSConfigTests__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__2__Impl
	rule__GSSConfigTests__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_2()); }
		(rule__GSSConfigTests__TestCaseAssignment_2)
		{ after(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_2()); }
		(rule__GSSConfigTests__TestCaseAssignment_2)*
		{ after(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__3__Impl
	rule__GSSConfigTests__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTestCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__0__Impl
	rule__GSSConfigTestCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0()); }
	'GSSConfigTestCase'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__1__Impl
	rule__GSSConfigTestCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__2__Impl
	rule__GSSConfigTestCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__3__Impl
	rule__GSSConfigTestCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__4__Impl
	rule__GSSConfigTestCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getNameAssignment_4()); }
	(rule__GSSConfigTestCase__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__5__Impl
	rule__GSSConfigTestCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__6__Impl
	rule__GSSConfigTestCase__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6()); }
	'procedure'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__7__Impl
	rule__GSSConfigTestCase__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__8__Impl
	rule__GSSConfigTestCase__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureAssignment_8()); }
	(rule__GSSConfigTestCase__ProcedureAssignment_8)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__9__Impl
	rule__GSSConfigTestCase__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__10__Impl
	rule__GSSConfigTestCase__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getGroup_10()); }
	(rule__GSSConfigTestCase__Group_10__0)?
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__11__Impl
	rule__GSSConfigTestCase__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getGroup_11()); }
	(rule__GSSConfigTestCase__Group_11__0)?
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__12__Impl
	rule__GSSConfigTestCase__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTestCase__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_10__0__Impl
	rule__GSSConfigTestCase__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0()); }
	'req'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqAssignment_10_1()); }
	(rule__GSSConfigTestCase__ReqAssignment_10_1)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTestCase__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_11__0__Impl
	rule__GSSConfigTestCase__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0()); }
	'reqAction'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqActionAssignment_11_1()); }
	(rule__GSSConfigTestCase__ReqActionAssignment_11_1)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqActionAssignment_11_1()); }
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


rule__VersionedQualifiedReferenceName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group__0__Impl
	rule__VersionedQualifiedReferenceName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); }
	(rule__VersionedQualifiedReferenceName__Group_0__0)?
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group__1__Impl
	rule__VersionedQualifiedReferenceName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); }
	(rule__VersionedQualifiedReferenceName__Group_2__0)*
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_0__0__Impl
	rule__VersionedQualifiedReferenceName__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); }
	ruleVersionedQualifiedName
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); }
	'::'
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_2__0__Impl
	rule__VersionedQualifiedReferenceName__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); }
	'::'
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); }
)
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0()); }
		ruleGSSConfigGSSConfig
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0()); }
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

rule__GSSConfigGSSConfig__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__UriAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__VersionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__ScenarioAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioGSSEnvironmentScenarioCrossReference_10_0()); }
		(
			{ before(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getScenarioGSSEnvironmentScenarioCrossReference_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__TestsAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_12_0()); }
		ruleGSSConfigTests
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__TestCaseAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_2_0()); }
		ruleGSSConfigTestCase
		{ after(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__ProcedureAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__ReqAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__ReqActionAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0()); }
		ruleGSSConfigReqAction
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0()); }
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
