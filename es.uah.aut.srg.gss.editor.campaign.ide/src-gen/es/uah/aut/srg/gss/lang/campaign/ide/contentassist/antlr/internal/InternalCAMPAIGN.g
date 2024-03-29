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

// Entry rule entryRuleGSSCampaignScenario
entryRuleGSSCampaignScenario
:
{ before(grammarAccess.getGSSCampaignScenarioRule()); }
	 ruleGSSCampaignScenario
{ after(grammarAccess.getGSSCampaignScenarioRule()); } 
	 EOF 
;

// Rule GSSCampaignScenario
ruleGSSCampaignScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSCampaignScenarioAccess().getGroup()); }
		(rule__GSSCampaignScenario__Group__0)
		{ after(grammarAccess.getGSSCampaignScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestListTestList
entryRuleGSSTestListTestList
:
{ before(grammarAccess.getGSSTestListTestListRule()); }
	 ruleGSSTestListTestList
{ after(grammarAccess.getGSSTestListTestListRule()); } 
	 EOF 
;

// Rule GSSTestListTestList
ruleGSSTestListTestList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestListTestListAccess().getGroup()); }
		(rule__GSSTestListTestList__Group__0)
		{ after(grammarAccess.getGSSTestListTestListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestListTestCase
entryRuleGSSTestListTestCase
:
{ before(grammarAccess.getGSSTestListTestCaseRule()); }
	 ruleGSSTestListTestCase
{ after(grammarAccess.getGSSTestListTestCaseRule()); } 
	 EOF 
;

// Rule GSSTestListTestCase
ruleGSSTestListTestCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestListTestCaseAccess().getGroup()); }
		(rule__GSSTestListTestCase__Group__0)
		{ after(grammarAccess.getGSSTestListTestCaseAccess().getGroup()); }
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

// Rule GSSTestListPrevAction
ruleGSSTestListPrevAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListPrevActionAccess().getResetEnumLiteralDeclaration()); }
		('1')
		{ after(grammarAccess.getGSSTestListPrevActionAccess().getResetEnumLiteralDeclaration()); }
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
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getScenarioAssignment_8()); }
	(rule__GSSCampaignCampaign__ScenarioAssignment_8)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getScenarioAssignment_8()); }
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
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getTestsAssignment_9()); }
	(rule__GSSCampaignCampaign__TestsAssignment_9)
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getTestsAssignment_9()); }
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
	{ before(grammarAccess.getGSSCampaignCampaignAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSCampaignCampaignAccess().getRightCurlyBracketKeyword_10()); }
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


rule__GSSCampaignScenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__0__Impl
	rule__GSSCampaignScenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getGSSCampaignScenarioKeyword_0()); }
	'GSSCampaignScenario'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getGSSCampaignScenarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__1__Impl
	rule__GSSCampaignScenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__2__Impl
	rule__GSSCampaignScenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentKeyword_2()); }
	'environment'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__3__Impl
	rule__GSSCampaignScenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__4__Impl
	rule__GSSCampaignScenario__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentAssignment_4()); }
	(rule__GSSCampaignScenario__EnvironmentAssignment_4)
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__5__Impl
	rule__GSSCampaignScenario__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__6__Impl
	rule__GSSCampaignScenario__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefKeyword_6()); }
	'scenarioRef'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__7__Impl
	rule__GSSCampaignScenario__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__8__Impl
	rule__GSSCampaignScenario__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefAssignment_8()); }
	(rule__GSSCampaignScenario__ScenarioRefAssignment_8)
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__9__Impl
	rule__GSSCampaignScenario__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__10__Impl
	rule__GSSCampaignScenario__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSCampaignScenario__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestListTestList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestList__Group__0__Impl
	rule__GSSTestListTestList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestListAccess().getGSSTestListTestListKeyword_0()); }
	'GSSTestListTestList'
	{ after(grammarAccess.getGSSTestListTestListAccess().getGSSTestListTestListKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestList__Group__1__Impl
	rule__GSSTestListTestList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestListAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestListTestListAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestList__Group__2__Impl
	rule__GSSTestListTestList__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTestListTestListAccess().getTestCaseAssignment_2()); }
		(rule__GSSTestListTestList__TestCaseAssignment_2)
		{ after(grammarAccess.getGSSTestListTestListAccess().getTestCaseAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSTestListTestListAccess().getTestCaseAssignment_2()); }
		(rule__GSSTestListTestList__TestCaseAssignment_2)*
		{ after(grammarAccess.getGSSTestListTestListAccess().getTestCaseAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestList__Group__3__Impl
	rule__GSSTestListTestList__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestListAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSTestListTestListAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestList__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestListAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSTestListTestListAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestListTestCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__0__Impl
	rule__GSSTestListTestCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getGSSTestListTestCaseKeyword_0()); }
	'GSSTestListTestCase'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getGSSTestListTestCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__1__Impl
	rule__GSSTestListTestCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__2__Impl
	rule__GSSTestListTestCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__3__Impl
	rule__GSSTestListTestCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__4__Impl
	rule__GSSTestListTestCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getNameAssignment_4()); }
	(rule__GSSTestListTestCase__NameAssignment_4)
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__5__Impl
	rule__GSSTestListTestCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__6__Impl
	rule__GSSTestListTestCase__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getProcedureKeyword_6()); }
	'procedure'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getProcedureKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__7__Impl
	rule__GSSTestListTestCase__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__8__Impl
	rule__GSSTestListTestCase__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getProcedureAssignment_8()); }
	(rule__GSSTestListTestCase__ProcedureAssignment_8)
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getProcedureAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__9__Impl
	rule__GSSTestListTestCase__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__10__Impl
	rule__GSSTestListTestCase__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getGroup_10()); }
	(rule__GSSTestListTestCase__Group_10__0)?
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__11__Impl
	rule__GSSTestListTestCase__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getGroup_11()); }
	(rule__GSSTestListTestCase__Group_11__0)?
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__12__Impl
	rule__GSSTestListTestCase__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestListTestCase__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_10__0__Impl
	rule__GSSTestListTestCase__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgKeyword_10_0()); }
	'prevMsg'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgAssignment_10_1()); }
	(rule__GSSTestListTestCase__PrevMsgAssignment_10_1)
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestListTestCase__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_11__0__Impl
	rule__GSSTestListTestCase__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionKeyword_11_0()); }
	'prevAction'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_11__1__Impl
	rule__GSSTestListTestCase__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionAssignment_11_1()); }
	(rule__GSSTestListTestCase__PrevActionAssignment_11_1)
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_11__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getGroup_11_2()); }
	(rule__GSSTestListTestCase__Group_11_2__0)?
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getGroup_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestListTestCase__Group_11_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_11_2__0__Impl
	rule__GSSTestListTestCase__Group_11_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamKeyword_11_2_0()); }
	'prevActionParam'
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamKeyword_11_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestListTestCase__Group_11_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__Group_11_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamAssignment_11_2_1()); }
	(rule__GSSTestListTestCase__PrevActionParamAssignment_11_2_1)
	{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamAssignment_11_2_1()); }
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

rule__GSSCampaignCampaign__ScenarioAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSCampaignScenarioParserRuleCall_8_0()); }
		ruleGSSCampaignScenario
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSCampaignScenarioParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignCampaign__TestsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSTestListTestListParserRuleCall_9_0()); }
		ruleGSSTestListTestList
		{ after(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSTestListTestListParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__EnvironmentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentVersionedQualifiedNameParserRuleCall_4_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentVersionedQualifiedNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSCampaignScenario__ScenarioRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefGSSScenarioScenarioCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefGSSScenarioScenarioSTRINGTerminalRuleCall_8_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefGSSScenarioScenarioSTRINGTerminalRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefGSSScenarioScenarioCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestList__TestCaseAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListTestListAccess().getTestCaseGSSTestListTestCaseParserRuleCall_2_0()); }
		ruleGSSTestListTestCase
		{ after(grammarAccess.getGSSTestListTestListAccess().getTestCaseGSSTestListTestCaseParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTestListTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__ProcedureAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSTestListTestCaseAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestListTestCaseAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSTestListTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__PrevMsgAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgIDTerminalRuleCall_10_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgIDTerminalRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__PrevActionAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0()); }
		ruleGSSTestListPrevAction
		{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestListTestCase__PrevActionParamAssignment_11_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamSTRINGTerminalRuleCall_11_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamSTRINGTerminalRuleCall_11_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
