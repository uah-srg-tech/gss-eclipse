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
grammar InternalCAMPAIGN;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.campaign.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.campaign.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.campaign.services.CAMPAIGNGrammarAccess;

}
@parser::members {
	private CAMPAIGNGrammarAccess grammarAccess;

	public void setGrammarAccess(CAMPAIGNGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSCampaignCampaign
entryRuleGSSCampaignCampaign
:
{ before(grammarAccess.getGSSCampaignCampaignRule()); }
	 ruleGSSCampaignCampaign
{ after(grammarAccess.getGSSCampaignCampaignRule()); } 
	 EOF 
;

// Rule GSSCampaignCampaign
ruleGSSCampaignCampaign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getGroup()); }
		(rule__GSSCampaignCampaign__Group__0)
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSCampaignTests
entryRuleGSSCampaignTests
:
{ before(grammarAccess.getGSSCampaignTestsRule()); }
	 ruleGSSCampaignTests
{ after(grammarAccess.getGSSCampaignTestsRule()); } 
	 EOF 
;

// Rule GSSCampaignTests
ruleGSSCampaignTests 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSCampaignTestsAccess().getGroup()); }
		(rule__GSSCampaignTests__Group__0)
		{ after(grammarAccess.getGSSCampaignTestsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSCampaignTest
entryRuleGSSCampaignTest
:
{ before(grammarAccess.getGSSCampaignTestRule()); }
	 ruleGSSCampaignTest
{ after(grammarAccess.getGSSCampaignTestRule()); } 
	 EOF 
;

// Rule GSSCampaignTest
ruleGSSCampaignTest 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSCampaignTestAccess().getGroup()); }
		(rule__GSSCampaignTest__Group__0)
		{ after(grammarAccess.getGSSCampaignTestAccess().getGroup()); }
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

// Rule GSSCampaignTestReqAction
ruleGSSCampaignTestReqAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignTestReqActionAccess().get_1EnumLiteralDeclaration()); }
		('_1')
		{ after(grammarAccess.getGSSCampaignTestReqActionAccess().get_1EnumLiteralDeclaration()); }
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


rule__GSSCampaignCampaign__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__0__Impl
	rule__GSSCampaignCampaign__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getGSSCampaignCampaignKeyword_0()); }
	'GSSCampaignCampaign'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getGSSCampaignCampaignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__1__Impl
	rule__GSSCampaignCampaign__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getNameAssignment_1()); }
	(rule__GSSCampaignCampaign__NameAssignment_1)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__2__Impl
	rule__GSSCampaignCampaign__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__3__Impl
	rule__GSSCampaignCampaign__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getGroup_3()); }
	(rule__GSSCampaignCampaign__Group_3__0)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__4__Impl
	rule__GSSCampaignCampaign__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getVersionKeyword_4()); }
	'version'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getVersionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__5__Impl
	rule__GSSCampaignCampaign__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__6__Impl
	rule__GSSCampaignCampaign__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getVersionAssignment_6()); }
	(rule__GSSCampaignCampaign__VersionAssignment_6)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getVersionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__7__Impl
	rule__GSSCampaignCampaign__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__8__Impl
	rule__GSSCampaignCampaign__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getScenarioKeyword_8()); }
	'scenario'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getScenarioKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__9__Impl
	rule__GSSCampaignCampaign__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_9()); }
	':='
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__10__Impl
	rule__GSSCampaignCampaign__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getScenarioAssignment_10()); }
	(rule__GSSCampaignCampaign__ScenarioAssignment_10)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getScenarioAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__11__Impl
	rule__GSSCampaignCampaign__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__12__Impl
	rule__GSSCampaignCampaign__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getTestsAssignment_12()); }
	(rule__GSSCampaignCampaign__TestsAssignment_12)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getTestsAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__13__Impl
	rule__GSSCampaignCampaign__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSCampaignCampaign__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group_3__0__Impl
	rule__GSSCampaignCampaign__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getUriKeyword_3_0()); }
	'uri'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getUriKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group_3__1__Impl
	rule__GSSCampaignCampaign__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_3_1()); }
	':='
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group_3__2__Impl
	rule__GSSCampaignCampaign__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getUriAssignment_3_2()); }
	(rule__GSSCampaignCampaign__UriAssignment_3_2)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getUriAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignCampaign__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_3_3()); }
	';'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSCampaignTests__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTests__Group__0__Impl
	rule__GSSCampaignTests__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestsAccess().getGSSCampaignTestsKeyword_0()); }
	'GSSCampaignTests'
	{ after(grammarAccess.getGSSCampaignTestsAccess().getGSSCampaignTestsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTests__Group__1__Impl
	rule__GSSCampaignTests__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSCampaignTestsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTests__Group__2__Impl
	rule__GSSCampaignTests__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSCampaignTestsAccess().getTestAssignment_2()); }
		(rule__GSSCampaignTests__TestAssignment_2)
		{ after(grammarAccess.getGSSCampaignTestsAccess().getTestAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSCampaignTestsAccess().getTestAssignment_2()); }
		(rule__GSSCampaignTests__TestAssignment_2)*
		{ after(grammarAccess.getGSSCampaignTestsAccess().getTestAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTests__Group__3__Impl
	rule__GSSCampaignTests__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSCampaignTestsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTests__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSCampaignTestsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSCampaignTest__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__0__Impl
	rule__GSSCampaignTest__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getGSSCampaignTestKeyword_0()); }
	'GSSCampaignTest'
	{ after(grammarAccess.getGSSCampaignTestAccess().getGSSCampaignTestKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__1__Impl
	rule__GSSCampaignTest__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSCampaignTestAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__2__Impl
	rule__GSSCampaignTest__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSCampaignTestAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__3__Impl
	rule__GSSCampaignTest__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSCampaignTestAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__4__Impl
	rule__GSSCampaignTest__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getNameAssignment_4()); }
	(rule__GSSCampaignTest__NameAssignment_4)
	{ after(grammarAccess.getGSSCampaignTestAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__5__Impl
	rule__GSSCampaignTest__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSCampaignTestAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__6__Impl
	rule__GSSCampaignTest__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getProcedureKeyword_6()); }
	'procedure'
	{ after(grammarAccess.getGSSCampaignTestAccess().getProcedureKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__7__Impl
	rule__GSSCampaignTest__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSCampaignTestAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__8__Impl
	rule__GSSCampaignTest__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getProcedureAssignment_8()); }
	(rule__GSSCampaignTest__ProcedureAssignment_8)
	{ after(grammarAccess.getGSSCampaignTestAccess().getProcedureAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__9__Impl
	rule__GSSCampaignTest__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSCampaignTestAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__10__Impl
	rule__GSSCampaignTest__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getGroup_10()); }
	(rule__GSSCampaignTest__Group_10__0)?
	{ after(grammarAccess.getGSSCampaignTestAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__11__Impl
	rule__GSSCampaignTest__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getGroup_11()); }
	(rule__GSSCampaignTest__Group_11__0)?
	{ after(grammarAccess.getGSSCampaignTestAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__12__Impl
	rule__GSSCampaignTest__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSCampaignTestAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSCampaignTestAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSCampaignTest__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group_10__0__Impl
	rule__GSSCampaignTest__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getReqKeyword_10_0()); }
	'req'
	{ after(grammarAccess.getGSSCampaignTestAccess().getReqKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getReqAssignment_10_1()); }
	(rule__GSSCampaignTest__ReqAssignment_10_1)
	{ after(grammarAccess.getGSSCampaignTestAccess().getReqAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSCampaignTest__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group_11__0__Impl
	rule__GSSCampaignTest__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getReqActionKeyword_11_0()); }
	'reqAction'
	{ after(grammarAccess.getGSSCampaignTestAccess().getReqActionKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignTest__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignTestAccess().getReqActionAssignment_11_1()); }
	(rule__GSSCampaignTest__ReqActionAssignment_11_1)
	{ after(grammarAccess.getGSSCampaignTestAccess().getReqActionAssignment_11_1()); }
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSCampaignCampaignParserRuleCall_1_0()); }
		ruleGSSCampaignCampaign
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSCampaignCampaignParserRuleCall_1_0()); }
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

rule__GSSCampaignCampaign__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__UriAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__VersionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getVersionVersionParserRuleCall_6_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getVersionVersionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__ScenarioAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSEnvironmentScenarioCrossReference_10_0()); }
		(
			{ before(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSEnvironmentScenarioVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
		)
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSEnvironmentScenarioCrossReference_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__TestsAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSCampaignTestsParserRuleCall_12_0()); }
		ruleGSSCampaignTests
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSCampaignTestsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTests__TestAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignTestsAccess().getTestGSSCampaignTestParserRuleCall_2_0()); }
		ruleGSSCampaignTest
		{ after(grammarAccess.getGSSCampaignTestsAccess().getTestGSSCampaignTestParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignTestAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSCampaignTestAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__ProcedureAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignTestAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSCampaignTestAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSCampaignTestAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSCampaignTestAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__ReqAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignTestAccess().getReqIDTerminalRuleCall_10_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSCampaignTestAccess().getReqIDTerminalRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignTest__ReqActionAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignTestAccess().getReqActionGSSCampaignTestReqActionEnumRuleCall_11_1_0()); }
		ruleGSSCampaignTestReqAction
		{ after(grammarAccess.getGSSCampaignTestAccess().getReqActionGSSCampaignTestReqActionEnumRuleCall_11_1_0()); }
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
