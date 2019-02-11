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
grammar InternalCHARTS;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.charts.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.charts.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.charts.services.CHARTSGrammarAccess;

}
@parser::members {
	private CHARTSGrammarAccess grammarAccess;

	public void setGrammarAccess(CHARTSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSChartsCharts
entryRuleGSSChartsCharts
:
{ before(grammarAccess.getGSSChartsChartsRule()); }
	 ruleGSSChartsCharts
{ after(grammarAccess.getGSSChartsChartsRule()); } 
	 EOF 
;

// Rule GSSChartsCharts
ruleGSSChartsCharts 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getGroup()); }
		(rule__GSSChartsCharts__Group__0)
		{ after(grammarAccess.getGSSChartsChartsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSChartsChart
entryRuleGSSChartsChart
:
{ before(grammarAccess.getGSSChartsChartRule()); }
	 ruleGSSChartsChart
{ after(grammarAccess.getGSSChartsChartRule()); } 
	 EOF 
;

// Rule GSSChartsChart
ruleGSSChartsChart 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSChartsChartAccess().getGroup()); }
		(rule__GSSChartsChart__Group__0)
		{ after(grammarAccess.getGSSChartsChartAccess().getGroup()); }
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

// Rule GSSChartsYUnits
ruleGSSChartsYUnits
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsYUnitsAccess().getAlternatives()); }
		(rule__GSSChartsYUnits__Alternatives)
		{ after(grammarAccess.getGSSChartsYUnitsAccess().getAlternatives()); }
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

rule__GSSChartsYUnits__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0()); }
		('volts')
		{ after(grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1()); }
		('amps')
		{ after(grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1()); }
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


rule__GSSChartsCharts__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__0__Impl
	rule__GSSChartsCharts__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getGSSChartsChartsKeyword_0()); }
	'GSSChartsCharts'
	{ after(grammarAccess.getGSSChartsChartsAccess().getGSSChartsChartsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__1__Impl
	rule__GSSChartsCharts__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getNameAssignment_1()); }
	(rule__GSSChartsCharts__NameAssignment_1)
	{ after(grammarAccess.getGSSChartsChartsAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__2__Impl
	rule__GSSChartsCharts__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSChartsChartsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__3__Impl
	rule__GSSChartsCharts__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()); }
	(rule__GSSChartsCharts__UnorderedGroup_3)
	{ after(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__4__Impl
	rule__GSSChartsCharts__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); }
		(rule__GSSChartsCharts__ChartAssignment_4)
		{ after(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); }
	)
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); }
		(rule__GSSChartsCharts__ChartAssignment_4)*
		{ after(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__5__Impl
	rule__GSSChartsCharts__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSChartsChartsAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSChartsCharts__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_0__0__Impl
	rule__GSSChartsCharts__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSChartsChartsAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_0__1__Impl
	rule__GSSChartsCharts__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_0__2__Impl
	rule__GSSChartsCharts__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getUriAssignment_3_0_2()); }
	(rule__GSSChartsCharts__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSChartsChartsAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSChartsCharts__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_1__0__Impl
	rule__GSSChartsCharts__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSChartsChartsAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_1__1__Impl
	rule__GSSChartsCharts__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_1__2__Impl
	rule__GSSChartsCharts__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSChartsCharts__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSChartsChartsAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSChartsChart__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__0__Impl
	rule__GSSChartsChart__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getGSSChartsChartKeyword_0()); }
	'GSSChartsChart'
	{ after(grammarAccess.getGSSChartsChartAccess().getGSSChartsChartKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__1__Impl
	rule__GSSChartsChart__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSChartsChartAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__2__Impl
	rule__GSSChartsChart__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSChartsChartAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__3__Impl
	rule__GSSChartsChart__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__4__Impl
	rule__GSSChartsChart__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getIdAssignment_4()); }
	(rule__GSSChartsChart__IdAssignment_4)
	{ after(grammarAccess.getGSSChartsChartAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__5__Impl
	rule__GSSChartsChart__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__6__Impl
	rule__GSSChartsChart__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSChartsChartAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__7__Impl
	rule__GSSChartsChart__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__8__Impl
	rule__GSSChartsChart__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getNameAssignment_8()); }
	(rule__GSSChartsChart__NameAssignment_8)
	{ after(grammarAccess.getGSSChartsChartAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__9__Impl
	rule__GSSChartsChart__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__10__Impl
	rule__GSSChartsChart__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getY_unitsKeyword_10()); }
	'y_units'
	{ after(grammarAccess.getGSSChartsChartAccess().getY_unitsKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__11__Impl
	rule__GSSChartsChart__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__12__Impl
	rule__GSSChartsChart__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getY_unitsAssignment_12()); }
	(rule__GSSChartsChart__Y_unitsAssignment_12)
	{ after(grammarAccess.getGSSChartsChartAccess().getY_unitsAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__13__Impl
	rule__GSSChartsChart__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__14__Impl
	rule__GSSChartsChart__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getY_maxKeyword_14()); }
	'y_max'
	{ after(grammarAccess.getGSSChartsChartAccess().getY_maxKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__15__Impl
	rule__GSSChartsChart__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__16__Impl
	rule__GSSChartsChart__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getY_maxAssignment_16()); }
	(rule__GSSChartsChart__Y_maxAssignment_16)
	{ after(grammarAccess.getGSSChartsChartAccess().getY_maxAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__17__Impl
	rule__GSSChartsChart__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__18__Impl
	rule__GSSChartsChart__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSChartsChartAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsChart__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_19()); }
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


rule__GSSChartsCharts__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
	}
:
	rule__GSSChartsCharts__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); }
					(rule__GSSChartsCharts__Group_3_0__0)
					{ after(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_1()); }
					(rule__GSSChartsCharts__Group_3_1__0)
					{ after(grammarAccess.getGSSChartsChartsAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__UnorderedGroup_3__Impl
	rule__GSSChartsCharts__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSChartsCharts__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSChartsChartsParserRuleCall_1_0()); }
		ruleGSSChartsCharts
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSChartsChartsParserRuleCall_1_0()); }
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

rule__GSSChartsCharts__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSChartsChartsAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSChartsChartsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSChartsChartsAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsCharts__ChartAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartsAccess().getChartGSSChartsChartParserRuleCall_4_0()); }
		ruleGSSChartsChart
		{ after(grammarAccess.getGSSChartsChartsAccess().getChartGSSChartsChartParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSChartsChartAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSChartsChartAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Y_unitsAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartAccess().getY_unitsGSSChartsYUnitsEnumRuleCall_12_0()); }
		ruleGSSChartsYUnits
		{ after(grammarAccess.getGSSChartsChartAccess().getY_unitsGSSChartsYUnitsEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSChartsChart__Y_maxAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSChartsChartAccess().getY_maxINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSChartsChartAccess().getY_maxINTEGERParserRuleCall_16_0()); }
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
