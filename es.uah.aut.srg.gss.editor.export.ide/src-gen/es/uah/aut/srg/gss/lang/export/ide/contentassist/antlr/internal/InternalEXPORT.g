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
grammar InternalEXPORT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.export.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.export.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.export.services.EXPORTGrammarAccess;

}
@parser::members {
	private EXPORTGrammarAccess grammarAccess;

	public void setGrammarAccess(EXPORTGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSExportExport
entryRuleGSSExportExport
:
{ before(grammarAccess.getGSSExportExportRule()); }
	 ruleGSSExportExport
{ after(grammarAccess.getGSSExportExportRule()); } 
	 EOF 
;

// Rule GSSExportExport
ruleGSSExportExport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getGroup()); }
		(rule__GSSExportExport__Group__0)
		{ after(grammarAccess.getGSSExportExportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSizes
entryRuleGSSExportSizes
:
{ before(grammarAccess.getGSSExportSizesRule()); }
	 ruleGSSExportSizes
{ after(grammarAccess.getGSSExportSizesRule()); } 
	 EOF 
;

// Rule GSSExportSizes
ruleGSSExportSizes 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getGroup()); }
		(rule__GSSExportSizes__Group__0)
		{ after(grammarAccess.getGSSExportSizesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSizeFromFileLength
entryRuleGSSExportSizeFromFileLength
:
{ before(grammarAccess.getGSSExportSizeFromFileLengthRule()); }
	 ruleGSSExportSizeFromFileLength
{ after(grammarAccess.getGSSExportSizeFromFileLengthRule()); } 
	 EOF 
;

// Rule GSSExportSizeFromFileLength
ruleGSSExportSizeFromFileLength 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup()); }
		(rule__GSSExportSizeFromFileLength__Group__0)
		{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSizeFromFileLine
entryRuleGSSExportSizeFromFileLine
:
{ before(grammarAccess.getGSSExportSizeFromFileLineRule()); }
	 ruleGSSExportSizeFromFileLine
{ after(grammarAccess.getGSSExportSizeFromFileLineRule()); } 
	 EOF 
;

// Rule GSSExportSizeFromFileLine
ruleGSSExportSizeFromFileLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup()); }
		(rule__GSSExportSizeFromFileLine__Group__0)
		{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSizeInBits
entryRuleGSSExportSizeInBits
:
{ before(grammarAccess.getGSSExportSizeInBitsRule()); }
	 ruleGSSExportSizeInBits
{ after(grammarAccess.getGSSExportSizeInBitsRule()); } 
	 EOF 
;

// Rule GSSExportSizeInBits
ruleGSSExportSizeInBits 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSizeInBitsAccess().getGroup()); }
		(rule__GSSExportSizeInBits__Group__0)
		{ after(grammarAccess.getGSSExportSizeInBitsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettings
entryRuleGSSExportSettings
:
{ before(grammarAccess.getGSSExportSettingsRule()); }
	 ruleGSSExportSettings
{ after(grammarAccess.getGSSExportSettingsRule()); } 
	 EOF 
;

// Rule GSSExportSettings
ruleGSSExportSettings 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getGroup()); }
		(rule__GSSExportSettings__Group__0)
		{ after(grammarAccess.getGSSExportSettingsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettingFromConst
entryRuleGSSExportSettingFromConst
:
{ before(grammarAccess.getGSSExportSettingFromConstRule()); }
	 ruleGSSExportSettingFromConst
{ after(grammarAccess.getGSSExportSettingFromConstRule()); } 
	 EOF 
;

// Rule GSSExportSettingFromConst
ruleGSSExportSettingFromConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingFromConstAccess().getGroup()); }
		(rule__GSSExportSettingFromConst__Group__0)
		{ after(grammarAccess.getGSSExportSettingFromConstAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettingFromSize
entryRuleGSSExportSettingFromSize
:
{ before(grammarAccess.getGSSExportSettingFromSizeRule()); }
	 ruleGSSExportSettingFromSize
{ after(grammarAccess.getGSSExportSettingFromSizeRule()); } 
	 EOF 
;

// Rule GSSExportSettingFromSize
ruleGSSExportSettingFromSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getGroup()); }
		(rule__GSSExportSettingFromSize__Group__0)
		{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettingFromFile
entryRuleGSSExportSettingFromFile
:
{ before(grammarAccess.getGSSExportSettingFromFileRule()); }
	 ruleGSSExportSettingFromFile
{ after(grammarAccess.getGSSExportSettingFromFileRule()); } 
	 EOF 
;

// Rule GSSExportSettingFromFile
ruleGSSExportSettingFromFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingFromFileAccess().getGroup()); }
		(rule__GSSExportSettingFromFile__Group__0)
		{ after(grammarAccess.getGSSExportSettingFromFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettingFromField
entryRuleGSSExportSettingFromField
:
{ before(grammarAccess.getGSSExportSettingFromFieldRule()); }
	 ruleGSSExportSettingFromField
{ after(grammarAccess.getGSSExportSettingFromFieldRule()); } 
	 EOF 
;

// Rule GSSExportSettingFromField
ruleGSSExportSettingFromField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getGroup()); }
		(rule__GSSExportSettingFromField__Group__0)
		{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettingAIFromConst
entryRuleGSSExportSettingAIFromConst
:
{ before(grammarAccess.getGSSExportSettingAIFromConstRule()); }
	 ruleGSSExportSettingAIFromConst
{ after(grammarAccess.getGSSExportSettingAIFromConstRule()); } 
	 EOF 
;

// Rule GSSExportSettingAIFromConst
ruleGSSExportSettingAIFromConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getGroup()); }
		(rule__GSSExportSettingAIFromConst__Group__0)
		{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportSettingAIFromFile
entryRuleGSSExportSettingAIFromFile
:
{ before(grammarAccess.getGSSExportSettingAIFromFileRule()); }
	 ruleGSSExportSettingAIFromFile
{ after(grammarAccess.getGSSExportSettingAIFromFileRule()); } 
	 EOF 
;

// Rule GSSExportSettingAIFromFile
ruleGSSExportSettingAIFromFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup()); }
		(rule__GSSExportSettingAIFromFile__Group__0)
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportActivateDICs
entryRuleGSSExportActivateDICs
:
{ before(grammarAccess.getGSSExportActivateDICsRule()); }
	 ruleGSSExportActivateDICs
{ after(grammarAccess.getGSSExportActivateDICsRule()); } 
	 EOF 
;

// Rule GSSExportActivateDICs
ruleGSSExportActivateDICs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportActivateDICsAccess().getGroup()); }
		(rule__GSSExportActivateDICs__Group__0)
		{ after(grammarAccess.getGSSExportActivateDICsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSExportDIC
entryRuleGSSExportDIC
:
{ before(grammarAccess.getGSSExportDICRule()); }
	 ruleGSSExportDIC
{ after(grammarAccess.getGSSExportDICRule()); } 
	 EOF 
;

// Rule GSSExportDIC
ruleGSSExportDIC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSExportDICAccess().getGroup()); }
		(rule__GSSExportDIC__Group__0)
		{ after(grammarAccess.getGSSExportDICAccess().getGroup()); }
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

// Rule GSSExportUnit
ruleGSSExportUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportUnitAccess().getAlternatives()); }
		(rule__GSSExportUnit__Alternatives)
		{ after(grammarAccess.getGSSExportUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getNULLKeyword_6_0()); }
		'NULL'
		{ after(grammarAccess.getGSSExportExportAccess().getNULLKeyword_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportExportAccess().getFromAssignment_6_1()); }
		(rule__GSSExportExport__FromAssignment_6_1)
		{ after(grammarAccess.getGSSExportExportAccess().getFromAssignment_6_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLengthAssignment_3_0()); }
		(rule__GSSExportSizes__SizeFromFileLengthAssignment_3_0)
		{ after(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLengthAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLineAssignment_3_1()); }
		(rule__GSSExportSizes__SizeFromFileLineAssignment_3_1)
		{ after(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLineAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getSizeInBitsAssignment_3_2()); }
		(rule__GSSExportSizes__SizeInBitsAssignment_3_2)
		{ after(grammarAccess.getGSSExportSizesAccess().getSizeInBitsAssignment_3_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromConstAssignment_3_0()); }
		(rule__GSSExportSettings__SettingFromConstAssignment_3_0)
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromConstAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromSizeAssignment_3_1()); }
		(rule__GSSExportSettings__SettingFromSizeAssignment_3_1)
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromSizeAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromFileAssignment_3_2()); }
		(rule__GSSExportSettings__SettingFromFileAssignment_3_2)
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromFileAssignment_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromFieldAssignment_3_3()); }
		(rule__GSSExportSettings__SettingFromFieldAssignment_3_3)
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromFieldAssignment_3_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromConstAssignment_3_4()); }
		(rule__GSSExportSettings__SettingAIFromConstAssignment_3_4)
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromConstAssignment_3_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromFileAssignment_3_5()); }
		(rule__GSSExportSettings__SettingAIFromFileAssignment_3_5)
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromFileAssignment_3_5()); }
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

rule__GSSExportUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
		('bits')
		{ after(grammarAccess.getGSSExportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSExportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
		('bytes')
		{ after(grammarAccess.getGSSExportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
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


rule__GSSExportExport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__0__Impl
	rule__GSSExportExport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getGSSExportExportKeyword_0()); }
	'GSSExportExport'
	{ after(grammarAccess.getGSSExportExportAccess().getGSSExportExportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__1__Impl
	rule__GSSExportExport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getNameAssignment_1()); }
	(rule__GSSExportExport__NameAssignment_1)
	{ after(grammarAccess.getGSSExportExportAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__2__Impl
	rule__GSSExportExport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSExportExportAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__3__Impl
	rule__GSSExportExport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()); }
	(rule__GSSExportExport__UnorderedGroup_3)
	{ after(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__4__Impl
	rule__GSSExportExport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getFromKeyword_4()); }
	'from'
	{ after(grammarAccess.getGSSExportExportAccess().getFromKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__5__Impl
	rule__GSSExportExport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__6__Impl
	rule__GSSExportExport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getAlternatives_6()); }
	(rule__GSSExportExport__Alternatives_6)
	{ after(grammarAccess.getGSSExportExportAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__7__Impl
	rule__GSSExportExport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__8__Impl
	rule__GSSExportExport__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getToKeyword_8()); }
	'to'
	{ after(grammarAccess.getGSSExportExportAccess().getToKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__9__Impl
	rule__GSSExportExport__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_9()); }
	':='
	{ after(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__10__Impl
	rule__GSSExportExport__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getToAssignment_10()); }
	(rule__GSSExportExport__ToAssignment_10)
	{ after(grammarAccess.getGSSExportExportAccess().getToAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__11__Impl
	rule__GSSExportExport__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__12__Impl
	rule__GSSExportExport__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSizesAssignment_12()); }
	(rule__GSSExportExport__SizesAssignment_12)?
	{ after(grammarAccess.getGSSExportExportAccess().getSizesAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__13__Impl
	rule__GSSExportExport__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSettingsAssignment_13()); }
	(rule__GSSExportExport__SettingsAssignment_13)
	{ after(grammarAccess.getGSSExportExportAccess().getSettingsAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__14__Impl
	rule__GSSExportExport__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getActivateDICsAssignment_14()); }
	(rule__GSSExportExport__ActivateDICsAssignment_14)?
	{ after(grammarAccess.getGSSExportExportAccess().getActivateDICsAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__15__Impl
	rule__GSSExportExport__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSExportExportAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportExport__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_0__0__Impl
	rule__GSSExportExport__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSExportExportAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_0__1__Impl
	rule__GSSExportExport__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_0__2__Impl
	rule__GSSExportExport__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getUriAssignment_3_0_2()); }
	(rule__GSSExportExport__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSExportExportAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportExport__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_1__0__Impl
	rule__GSSExportExport__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSExportExportAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_1__1__Impl
	rule__GSSExportExport__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_1__2__Impl
	rule__GSSExportExport__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSExportExport__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSExportExportAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizes__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizes__Group__0__Impl
	rule__GSSExportSizes__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizesAccess().getGSSExportSizesAction_0()); }
	()
	{ after(grammarAccess.getGSSExportSizesAccess().getGSSExportSizesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizes__Group__1__Impl
	rule__GSSExportSizes__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizesAccess().getGSSExportSizesKeyword_1()); }
	'GSSExportSizes'
	{ after(grammarAccess.getGSSExportSizesAccess().getGSSExportSizesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizes__Group__2__Impl
	rule__GSSExportSizes__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizesAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSExportSizesAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizes__Group__3__Impl
	rule__GSSExportSizes__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getAlternatives_3()); }
		(rule__GSSExportSizes__Alternatives_3)
		{ after(grammarAccess.getGSSExportSizesAccess().getAlternatives_3()); }
	)
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getAlternatives_3()); }
		(rule__GSSExportSizes__Alternatives_3)*
		{ after(grammarAccess.getGSSExportSizesAccess().getAlternatives_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizes__Group__4__Impl
	rule__GSSExportSizes__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizesAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSExportSizesAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizes__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizesAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSizesAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeFromFileLength__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__0__Impl
	rule__GSSExportSizeFromFileLength__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGSSExportSizeFromFileLengthKeyword_0()); }
	'GSSExportSizeFromFileLength'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGSSExportSizeFromFileLengthKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__1__Impl
	rule__GSSExportSizeFromFileLength__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__2__Impl
	rule__GSSExportSizeFromFileLength__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__3__Impl
	rule__GSSExportSizeFromFileLength__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__4__Impl
	rule__GSSExportSizeFromFileLength__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdAssignment_4()); }
	(rule__GSSExportSizeFromFileLength__IdAssignment_4)
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__5__Impl
	rule__GSSExportSizeFromFileLength__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__6__Impl
	rule__GSSExportSizeFromFileLength__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileKeyword_6()); }
	'fromFile'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__7__Impl
	rule__GSSExportSizeFromFileLength__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__8__Impl
	rule__GSSExportSizeFromFileLength__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileAssignment_8()); }
	(rule__GSSExportSizeFromFileLength__FromFileAssignment_8)
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__9__Impl
	rule__GSSExportSizeFromFileLength__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__10__Impl
	rule__GSSExportSizeFromFileLength__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup_10()); }
	(rule__GSSExportSizeFromFileLength__Group_10__0)?
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__11__Impl
	rule__GSSExportSizeFromFileLength__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup_11()); }
	(rule__GSSExportSizeFromFileLength__Group_11__0)?
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__12__Impl
	rule__GSSExportSizeFromFileLength__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeFromFileLength__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_10__0__Impl
	rule__GSSExportSizeFromFileLength__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0()); }
	'addSize'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_10__1__Impl
	rule__GSSExportSizeFromFileLength__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_10__2__Impl
	rule__GSSExportSizeFromFileLength__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2()); }
	(rule__GSSExportSizeFromFileLength__AddSizeAssignment_10_2)
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeFromFileLength__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_11__0__Impl
	rule__GSSExportSizeFromFileLength__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitKeyword_11_0()); }
	'unit'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_11__1__Impl
	rule__GSSExportSizeFromFileLength__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_11__2__Impl
	rule__GSSExportSizeFromFileLength__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitAssignment_11_2()); }
	(rule__GSSExportSizeFromFileLength__UnitAssignment_11_2)
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLength__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeFromFileLine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__0__Impl
	rule__GSSExportSizeFromFileLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getGSSExportSizeFromFileLineKeyword_0()); }
	'GSSExportSizeFromFileLine'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getGSSExportSizeFromFileLineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__1__Impl
	rule__GSSExportSizeFromFileLine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__2__Impl
	rule__GSSExportSizeFromFileLine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__3__Impl
	rule__GSSExportSizeFromFileLine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__4__Impl
	rule__GSSExportSizeFromFileLine__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdAssignment_4()); }
	(rule__GSSExportSizeFromFileLine__IdAssignment_4)
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__5__Impl
	rule__GSSExportSizeFromFileLine__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__6__Impl
	rule__GSSExportSizeFromFileLine__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileKeyword_6()); }
	'fromFile'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__7__Impl
	rule__GSSExportSizeFromFileLine__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__8__Impl
	rule__GSSExportSizeFromFileLine__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileAssignment_8()); }
	(rule__GSSExportSizeFromFileLine__FromFileAssignment_8)
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__9__Impl
	rule__GSSExportSizeFromFileLine__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__10__Impl
	rule__GSSExportSizeFromFileLine__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineKeyword_10()); }
	'line'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__11__Impl
	rule__GSSExportSizeFromFileLine__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__12__Impl
	rule__GSSExportSizeFromFileLine__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineAssignment_12()); }
	(rule__GSSExportSizeFromFileLine__LineAssignment_12)
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__13__Impl
	rule__GSSExportSizeFromFileLine__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__14__Impl
	rule__GSSExportSizeFromFileLine__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup_14()); }
	(rule__GSSExportSizeFromFileLine__Group_14__0)?
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__15__Impl
	rule__GSSExportSizeFromFileLine__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup_15()); }
	(rule__GSSExportSizeFromFileLine__Group_15__0)?
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__16__Impl
	rule__GSSExportSizeFromFileLine__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16()); }
	'}'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group__17__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeFromFileLine__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_14__0__Impl
	rule__GSSExportSizeFromFileLine__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeKeyword_14_0()); }
	'addSize'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_14__1__Impl
	rule__GSSExportSizeFromFileLine__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_14__2__Impl
	rule__GSSExportSizeFromFileLine__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeAssignment_14_2()); }
	(rule__GSSExportSizeFromFileLine__AddSizeAssignment_14_2)
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeFromFileLine__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_15__0__Impl
	rule__GSSExportSizeFromFileLine__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitKeyword_15_0()); }
	'unit'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_15__1__Impl
	rule__GSSExportSizeFromFileLine__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_15__2__Impl
	rule__GSSExportSizeFromFileLine__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitAssignment_15_2()); }
	(rule__GSSExportSizeFromFileLine__UnitAssignment_15_2)
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeFromFileLine__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeInBits__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__0__Impl
	rule__GSSExportSizeInBits__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getGSSExportSizeInBitsKeyword_0()); }
	'GSSExportSizeInBits'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getGSSExportSizeInBitsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__1__Impl
	rule__GSSExportSizeInBits__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__2__Impl
	rule__GSSExportSizeInBits__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__3__Impl
	rule__GSSExportSizeInBits__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__4__Impl
	rule__GSSExportSizeInBits__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getIdAssignment_4()); }
	(rule__GSSExportSizeInBits__IdAssignment_4)
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__5__Impl
	rule__GSSExportSizeInBits__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__6__Impl
	rule__GSSExportSizeInBits__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getFromKeyword_6()); }
	'from'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getFromKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__7__Impl
	rule__GSSExportSizeInBits__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__8__Impl
	rule__GSSExportSizeInBits__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getFromAssignment_8()); }
	(rule__GSSExportSizeInBits__FromAssignment_8)
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getFromAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__9__Impl
	rule__GSSExportSizeInBits__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__10__Impl
	rule__GSSExportSizeInBits__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getGroup_10()); }
	(rule__GSSExportSizeInBits__Group_10__0)?
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__11__Impl
	rule__GSSExportSizeInBits__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getGroup_11()); }
	(rule__GSSExportSizeInBits__Group_11__0)?
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__12__Impl
	rule__GSSExportSizeInBits__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeInBits__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_10__0__Impl
	rule__GSSExportSizeInBits__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeKeyword_10_0()); }
	'addSize'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_10__1__Impl
	rule__GSSExportSizeInBits__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_10__2__Impl
	rule__GSSExportSizeInBits__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeAssignment_10_2()); }
	(rule__GSSExportSizeInBits__AddSizeAssignment_10_2)
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSizeInBits__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_11__0__Impl
	rule__GSSExportSizeInBits__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getUnitKeyword_11_0()); }
	'unit'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getUnitKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_11__1__Impl
	rule__GSSExportSizeInBits__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_11__2__Impl
	rule__GSSExportSizeInBits__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getUnitAssignment_11_2()); }
	(rule__GSSExportSizeInBits__UnitAssignment_11_2)
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getUnitAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSizeInBits__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettings__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettings__Group__0__Impl
	rule__GSSExportSettings__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsAction_0()); }
	()
	{ after(grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettings__Group__1__Impl
	rule__GSSExportSettings__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsKeyword_1()); }
	'GSSExportSettings'
	{ after(grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettings__Group__2__Impl
	rule__GSSExportSettings__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettings__Group__3__Impl
	rule__GSSExportSettings__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingsAccess().getAlternatives_3()); }
	(rule__GSSExportSettings__Alternatives_3)*
	{ after(grammarAccess.getGSSExportSettingsAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettings__Group__4__Impl
	rule__GSSExportSettings__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettings__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromConst__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__0__Impl
	rule__GSSExportSettingFromConst__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getGSSExportSettingFromConstKeyword_0()); }
	'GSSExportSettingFromConst'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getGSSExportSettingFromConstKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__1__Impl
	rule__GSSExportSettingFromConst__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__2__Impl
	rule__GSSExportSettingFromConst__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__3__Impl
	rule__GSSExportSettingFromConst__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__4__Impl
	rule__GSSExportSettingFromConst__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getValueAssignment_4()); }
	(rule__GSSExportSettingFromConst__ValueAssignment_4)
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__5__Impl
	rule__GSSExportSettingFromConst__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__6__Impl
	rule__GSSExportSettingFromConst__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__7__Impl
	rule__GSSExportSettingFromConst__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__8__Impl
	rule__GSSExportSettingFromConst__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefAssignment_8()); }
	(rule__GSSExportSettingFromConst__ToFieldRefAssignment_8)
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__9__Impl
	rule__GSSExportSettingFromConst__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__10__Impl
	rule__GSSExportSettingFromConst__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromConst__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__0__Impl
	rule__GSSExportSettingFromSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getGSSExportSettingFromSizeKeyword_0()); }
	'GSSExportSettingFromSize'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getGSSExportSettingFromSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__1__Impl
	rule__GSSExportSettingFromSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__2__Impl
	rule__GSSExportSettingFromSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefKeyword_2()); }
	'sizeRef'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__3__Impl
	rule__GSSExportSettingFromSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__4__Impl
	rule__GSSExportSettingFromSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefAssignment_4()); }
	(rule__GSSExportSettingFromSize__SizeRefAssignment_4)
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__5__Impl
	rule__GSSExportSettingFromSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__6__Impl
	rule__GSSExportSettingFromSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__7__Impl
	rule__GSSExportSettingFromSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__8__Impl
	rule__GSSExportSettingFromSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefAssignment_8()); }
	(rule__GSSExportSettingFromSize__ToFieldRefAssignment_8)
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__9__Impl
	rule__GSSExportSettingFromSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__10__Impl
	rule__GSSExportSettingFromSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__0__Impl
	rule__GSSExportSettingFromFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getGSSExportSettingFromFileKeyword_0()); }
	'GSSExportSettingFromFile'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getGSSExportSettingFromFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__1__Impl
	rule__GSSExportSettingFromFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__2__Impl
	rule__GSSExportSettingFromFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getFileKeyword_2()); }
	'file'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__3__Impl
	rule__GSSExportSettingFromFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__4__Impl
	rule__GSSExportSettingFromFile__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getFileAssignment_4()); }
	(rule__GSSExportSettingFromFile__FileAssignment_4)
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__5__Impl
	rule__GSSExportSettingFromFile__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__6__Impl
	rule__GSSExportSettingFromFile__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__7__Impl
	rule__GSSExportSettingFromFile__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__8__Impl
	rule__GSSExportSettingFromFile__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefAssignment_8()); }
	(rule__GSSExportSettingFromFile__ToFieldRefAssignment_8)
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__9__Impl
	rule__GSSExportSettingFromFile__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__10__Impl
	rule__GSSExportSettingFromFile__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_10()); }
	(rule__GSSExportSettingFromFile__Group_10__0)?
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__11__Impl
	rule__GSSExportSettingFromFile__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_11()); }
	(rule__GSSExportSettingFromFile__Group_11__0)?
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__12__Impl
	rule__GSSExportSettingFromFile__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_12()); }
	(rule__GSSExportSettingFromFile__Group_12__0)?
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__13__Impl
	rule__GSSExportSettingFromFile__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromFile__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_10__0__Impl
	rule__GSSExportSettingFromFile__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetKeyword_10_0()); }
	'offset'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_10__1__Impl
	rule__GSSExportSettingFromFile__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_10__2__Impl
	rule__GSSExportSettingFromFile__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetAssignment_10_2()); }
	(rule__GSSExportSettingFromFile__OffsetAssignment_10_2)
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromFile__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_11__0__Impl
	rule__GSSExportSettingFromFile__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSizeKeyword_11_0()); }
	'size'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSizeKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_11__1__Impl
	rule__GSSExportSettingFromFile__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_11__2__Impl
	rule__GSSExportSettingFromFile__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSizeAssignment_11_2()); }
	(rule__GSSExportSettingFromFile__SizeAssignment_11_2)
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSizeAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromFile__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_12__0__Impl
	rule__GSSExportSettingFromFile__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getLineKeyword_12_0()); }
	'line'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getLineKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_12__1__Impl
	rule__GSSExportSettingFromFile__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_12__2__Impl
	rule__GSSExportSettingFromFile__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getLineAssignment_12_2()); }
	(rule__GSSExportSettingFromFile__LineAssignment_12_2)
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getLineAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromFile__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_12_3()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingFromField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__0__Impl
	rule__GSSExportSettingFromField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getGSSExportSettingFromFieldKeyword_0()); }
	'GSSExportSettingFromField'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getGSSExportSettingFromFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__1__Impl
	rule__GSSExportSettingFromField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__2__Impl
	rule__GSSExportSettingFromField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefKeyword_2()); }
	'fieldRef'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__3__Impl
	rule__GSSExportSettingFromField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__4__Impl
	rule__GSSExportSettingFromField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefAssignment_4()); }
	(rule__GSSExportSettingFromField__FieldRefAssignment_4)
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__5__Impl
	rule__GSSExportSettingFromField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__6__Impl
	rule__GSSExportSettingFromField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__7__Impl
	rule__GSSExportSettingFromField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__8__Impl
	rule__GSSExportSettingFromField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefAssignment_8()); }
	(rule__GSSExportSettingFromField__ToFieldRefAssignment_8)
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__9__Impl
	rule__GSSExportSettingFromField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__10__Impl
	rule__GSSExportSettingFromField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingFromField__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingAIFromConst__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__0__Impl
	rule__GSSExportSettingAIFromConst__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getGSSExportSettingAIFromConstKeyword_0()); }
	'GSSExportSettingAIFromConst'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getGSSExportSettingAIFromConstKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__1__Impl
	rule__GSSExportSettingAIFromConst__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__2__Impl
	rule__GSSExportSettingAIFromConst__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__3__Impl
	rule__GSSExportSettingAIFromConst__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__4__Impl
	rule__GSSExportSettingAIFromConst__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueAssignment_4()); }
	(rule__GSSExportSettingAIFromConst__ValueAssignment_4)
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__5__Impl
	rule__GSSExportSettingAIFromConst__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__6__Impl
	rule__GSSExportSettingAIFromConst__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__7__Impl
	rule__GSSExportSettingAIFromConst__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__8__Impl
	rule__GSSExportSettingAIFromConst__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefAssignment_8()); }
	(rule__GSSExportSettingAIFromConst__ToFieldRefAssignment_8)
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__9__Impl
	rule__GSSExportSettingAIFromConst__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__10__Impl
	rule__GSSExportSettingAIFromConst__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromConst__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingAIFromFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__0__Impl
	rule__GSSExportSettingAIFromFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getGSSExportSettingAIFromFileKeyword_0()); }
	'GSSExportSettingAIFromFile'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getGSSExportSettingAIFromFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__1__Impl
	rule__GSSExportSettingAIFromFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__2__Impl
	rule__GSSExportSettingAIFromFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileKeyword_2()); }
	'file'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__3__Impl
	rule__GSSExportSettingAIFromFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__4__Impl
	rule__GSSExportSettingAIFromFile__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileAssignment_4()); }
	(rule__GSSExportSettingAIFromFile__FileAssignment_4)
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__5__Impl
	rule__GSSExportSettingAIFromFile__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__6__Impl
	rule__GSSExportSettingAIFromFile__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__7__Impl
	rule__GSSExportSettingAIFromFile__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__8__Impl
	rule__GSSExportSettingAIFromFile__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefAssignment_8()); }
	(rule__GSSExportSettingAIFromFile__ToFieldRefAssignment_8)
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__9__Impl
	rule__GSSExportSettingAIFromFile__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__10__Impl
	rule__GSSExportSettingAIFromFile__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexKeyword_10()); }
	'toArrayIndex'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__11__Impl
	rule__GSSExportSettingAIFromFile__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__12__Impl
	rule__GSSExportSettingAIFromFile__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexAssignment_12()); }
	(rule__GSSExportSettingAIFromFile__ToArrayIndexAssignment_12)
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__13__Impl
	rule__GSSExportSettingAIFromFile__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__14__Impl
	rule__GSSExportSettingAIFromFile__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_14()); }
	(rule__GSSExportSettingAIFromFile__Group_14__0)?
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__15__Impl
	rule__GSSExportSettingAIFromFile__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_15()); }
	(rule__GSSExportSettingAIFromFile__Group_15__0)?
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__16__Impl
	rule__GSSExportSettingAIFromFile__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_16()); }
	(rule__GSSExportSettingAIFromFile__Group_16__0)?
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__17__Impl
	rule__GSSExportSettingAIFromFile__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingAIFromFile__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_14__0__Impl
	rule__GSSExportSettingAIFromFile__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetKeyword_14_0()); }
	'offset'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_14__1__Impl
	rule__GSSExportSettingAIFromFile__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_14__2__Impl
	rule__GSSExportSettingAIFromFile__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetAssignment_14_2()); }
	(rule__GSSExportSettingAIFromFile__OffsetAssignment_14_2)
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingAIFromFile__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_15__0__Impl
	rule__GSSExportSettingAIFromFile__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeKeyword_15_0()); }
	'size'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_15__1__Impl
	rule__GSSExportSettingAIFromFile__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_15__2__Impl
	rule__GSSExportSettingAIFromFile__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeAssignment_15_2()); }
	(rule__GSSExportSettingAIFromFile__SizeAssignment_15_2)
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportSettingAIFromFile__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_16__0__Impl
	rule__GSSExportSettingAIFromFile__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineKeyword_16_0()); }
	'line'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_16__1__Impl
	rule__GSSExportSettingAIFromFile__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1()); }
	':='
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_16__2__Impl
	rule__GSSExportSettingAIFromFile__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineAssignment_16_2()); }
	(rule__GSSExportSettingAIFromFile__LineAssignment_16_2)
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportSettingAIFromFile__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_16_3()); }
	';'
	{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportActivateDICs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportActivateDICs__Group__0__Impl
	rule__GSSExportActivateDICs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsAction_0()); }
	()
	{ after(grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportActivateDICs__Group__1__Impl
	rule__GSSExportActivateDICs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsKeyword_1()); }
	'GSSExportActivateDICs'
	{ after(grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportActivateDICs__Group__2__Impl
	rule__GSSExportActivateDICs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportActivateDICsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSExportActivateDICsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportActivateDICs__Group__3__Impl
	rule__GSSExportActivateDICs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSExportActivateDICsAccess().getDICAssignment_3()); }
		(rule__GSSExportActivateDICs__DICAssignment_3)
		{ after(grammarAccess.getGSSExportActivateDICsAccess().getDICAssignment_3()); }
	)
	(
		{ before(grammarAccess.getGSSExportActivateDICsAccess().getDICAssignment_3()); }
		(rule__GSSExportActivateDICs__DICAssignment_3)*
		{ after(grammarAccess.getGSSExportActivateDICsAccess().getDICAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportActivateDICs__Group__4__Impl
	rule__GSSExportActivateDICs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportActivateDICsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSExportActivateDICsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportActivateDICs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportActivateDICsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportActivateDICsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSExportDIC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__0__Impl
	rule__GSSExportDIC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getGSSExportDICKeyword_0()); }
	'GSSExportDIC'
	{ after(grammarAccess.getGSSExportDICAccess().getGSSExportDICKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__1__Impl
	rule__GSSExportDIC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSExportDICAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__2__Impl
	rule__GSSExportDIC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSExportDICAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__3__Impl
	rule__GSSExportDIC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__4__Impl
	rule__GSSExportDIC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getIdAssignment_4()); }
	(rule__GSSExportDIC__IdAssignment_4)
	{ after(grammarAccess.getGSSExportDICAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__5__Impl
	rule__GSSExportDIC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__6__Impl
	rule__GSSExportDIC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getDICRefKeyword_6()); }
	'DICRef'
	{ after(grammarAccess.getGSSExportDICAccess().getDICRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__7__Impl
	rule__GSSExportDIC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__8__Impl
	rule__GSSExportDIC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getDICRefAssignment_8()); }
	(rule__GSSExportDIC__DICRefAssignment_8)
	{ after(grammarAccess.getGSSExportDICAccess().getDICRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__9__Impl
	rule__GSSExportDIC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__10__Impl
	rule__GSSExportDIC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSExportDICAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportDIC__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_11()); }
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


rule__GSSExportExport__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
	}
:
	rule__GSSExportExport__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSExportExport__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSExportExportAccess().getGroup_3_0()); }
					(rule__GSSExportExport__Group_3_0__0)
					{ after(grammarAccess.getGSSExportExportAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSExportExportAccess().getGroup_3_1()); }
					(rule__GSSExportExport__Group_3_1__0)
					{ after(grammarAccess.getGSSExportExportAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSExportExport__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__UnorderedGroup_3__Impl
	rule__GSSExportExport__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSExportExport__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSExportExportParserRuleCall_1_0()); }
		ruleGSSExportExport
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSExportExportParserRuleCall_1_0()); }
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

rule__GSSExportExport__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportExportAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__FromAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getFromGSSTmTcFormatTmTcFormatCrossReference_6_1_0()); }
		(
			{ before(grammarAccess.getGSSExportExportAccess().getFromGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSExportExportAccess().getFromGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
		)
		{ after(grammarAccess.getGSSExportExportAccess().getFromGSSTmTcFormatTmTcFormatCrossReference_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__ToAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getToGSSTmTcFormatTmTcFormatCrossReference_10_0()); }
		(
			{ before(grammarAccess.getGSSExportExportAccess().getToGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_10_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSExportExportAccess().getToGSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_10_0_1()); }
		)
		{ after(grammarAccess.getGSSExportExportAccess().getToGSSTmTcFormatTmTcFormatCrossReference_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__SizesAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getSizesGSSExportSizesParserRuleCall_12_0()); }
		ruleGSSExportSizes
		{ after(grammarAccess.getGSSExportExportAccess().getSizesGSSExportSizesParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__SettingsAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getSettingsGSSExportSettingsParserRuleCall_13_0()); }
		ruleGSSExportSettings
		{ after(grammarAccess.getGSSExportExportAccess().getSettingsGSSExportSettingsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportExport__ActivateDICsAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportExportAccess().getActivateDICsGSSExportActivateDICsParserRuleCall_14_0()); }
		ruleGSSExportActivateDICs
		{ after(grammarAccess.getGSSExportExportAccess().getActivateDICsGSSExportActivateDICsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__SizeFromFileLengthAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLengthGSSExportSizeFromFileLengthParserRuleCall_3_0_0()); }
		ruleGSSExportSizeFromFileLength
		{ after(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLengthGSSExportSizeFromFileLengthParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__SizeFromFileLineAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLineGSSExportSizeFromFileLineParserRuleCall_3_1_0()); }
		ruleGSSExportSizeFromFileLine
		{ after(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLineGSSExportSizeFromFileLineParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizes__SizeInBitsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizesAccess().getSizeInBitsGSSExportSizeInBitsParserRuleCall_3_2_0()); }
		ruleGSSExportSizeInBits
		{ after(grammarAccess.getGSSExportSizesAccess().getSizeInBitsGSSExportSizeInBitsParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__FromFileAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__AddSizeAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLength__UnitAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0()); }
		ruleGSSExportUnit
		{ after(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__FromFileAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__LineAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__AddSizeAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeFromFileLine__UnitAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitGSSExportUnitEnumRuleCall_15_2_0()); }
		ruleGSSExportUnit
		{ after(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitGSSExportUnitEnumRuleCall_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__FromAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__AddSizeAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSizeInBits__UnitAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSizeInBitsAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0()); }
		ruleGSSExportUnit
		{ after(grammarAccess.getGSSExportSizeInBitsAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__SettingFromConstAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromConstGSSExportSettingFromConstParserRuleCall_3_0_0()); }
		ruleGSSExportSettingFromConst
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromConstGSSExportSettingFromConstParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__SettingFromSizeAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromSizeGSSExportSettingFromSizeParserRuleCall_3_1_0()); }
		ruleGSSExportSettingFromSize
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromSizeGSSExportSettingFromSizeParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__SettingFromFileAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromFileGSSExportSettingFromFileParserRuleCall_3_2_0()); }
		ruleGSSExportSettingFromFile
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromFileGSSExportSettingFromFileParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__SettingFromFieldAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingFromFieldGSSExportSettingFromFieldParserRuleCall_3_3_0()); }
		ruleGSSExportSettingFromField
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingFromFieldGSSExportSettingFromFieldParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__SettingAIFromConstAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromConstGSSExportSettingAIFromConstParserRuleCall_3_4_0()); }
		ruleGSSExportSettingAIFromConst
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromConstGSSExportSettingAIFromConstParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettings__SettingAIFromFileAssignment_3_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromFileGSSExportSettingAIFromFileParserRuleCall_3_5_0()); }
		ruleGSSExportSettingAIFromFile
		{ after(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromFileGSSExportSettingAIFromFileParserRuleCall_3_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromConst__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__SizeRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromSize__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__FileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__OffsetAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__SizeAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromFile__LineAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__FieldRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSTmTcFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSTmTcFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingFromField__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSTmTcFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSTmTcFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromConst__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSTmTcFormatAIFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSTmTcFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSTmTcFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSTmTcFormatAIFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__FileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefGSSTmTcFormatAIFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefGSSTmTcFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefGSSTmTcFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefGSSTmTcFormatAIFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__ToArrayIndexAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__OffsetAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__SizeAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportSettingAIFromFile__LineAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportActivateDICs__DICAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportActivateDICsAccess().getDICGSSExportDICParserRuleCall_3_0()); }
		ruleGSSExportDIC
		{ after(grammarAccess.getGSSExportActivateDICsAccess().getDICGSSExportDICParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportDICAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSExportDICAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSExportDIC__DICRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSExportDICAccess().getDICRefIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSExportDICAccess().getDICRefIDTerminalRuleCall_8_0()); }
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
