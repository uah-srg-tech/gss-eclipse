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
grammar InternalFORMAT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.format.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.format.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.format.services.FORMATGrammarAccess;

}
@parser::members {
	private FORMATGrammarAccess grammarAccess;

	public void setGrammarAccess(FORMATGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSFormatFormat
entryRuleGSSFormatFormat
:
{ before(grammarAccess.getGSSFormatFormatRule()); }
	 ruleGSSFormatFormat
{ after(grammarAccess.getGSSFormatFormatRule()); } 
	 EOF 
;

// Rule GSSFormatFormat
ruleGSSFormatFormat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getGroup()); }
		(rule__GSSFormatFormat__Group__0)
		{ after(grammarAccess.getGSSFormatFormatAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatField
entryRuleGSSFormatField
:
{ before(grammarAccess.getGSSFormatFieldRule()); }
	 ruleGSSFormatField
{ after(grammarAccess.getGSSFormatFieldRule()); } 
	 EOF 
;

// Rule GSSFormatField
ruleGSSFormatField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getAlternatives()); }
		(rule__GSSFormatField__Alternatives)
		{ after(grammarAccess.getGSSFormatFieldAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatCSField
entryRuleGSSFormatCSField
:
{ before(grammarAccess.getGSSFormatCSFieldRule()); }
	 ruleGSSFormatCSField
{ after(grammarAccess.getGSSFormatCSFieldRule()); } 
	 EOF 
;

// Rule GSSFormatCSField
ruleGSSFormatCSField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getGroup()); }
		(rule__GSSFormatCSField__Group__0)
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatCSFormulaField
entryRuleGSSFormatCSFormulaField
:
{ before(grammarAccess.getGSSFormatCSFormulaFieldRule()); }
	 ruleGSSFormatCSFormulaField
{ after(grammarAccess.getGSSFormatCSFormulaFieldRule()); } 
	 EOF 
;

// Rule GSSFormatCSFormulaField
ruleGSSFormatCSFormulaField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGroup()); }
		(rule__GSSFormatCSFormulaField__Group__0)
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatVSField
entryRuleGSSFormatVSField
:
{ before(grammarAccess.getGSSFormatVSFieldRule()); }
	 ruleGSSFormatVSField
{ after(grammarAccess.getGSSFormatVSFieldRule()); } 
	 EOF 
;

// Rule GSSFormatVSField
ruleGSSFormatVSField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getGroup()); }
		(rule__GSSFormatVSField__Group__0)
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatVRFieldSize
entryRuleGSSFormatVRFieldSize
:
{ before(grammarAccess.getGSSFormatVRFieldSizeRule()); }
	 ruleGSSFormatVRFieldSize
{ after(grammarAccess.getGSSFormatVRFieldSizeRule()); } 
	 EOF 
;

// Rule GSSFormatVRFieldSize
ruleGSSFormatVRFieldSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getGroup()); }
		(rule__GSSFormatVRFieldSize__Group__0)
		{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatFDICField
entryRuleGSSFormatFDICField
:
{ before(grammarAccess.getGSSFormatFDICFieldRule()); }
	 ruleGSSFormatFDICField
{ after(grammarAccess.getGSSFormatFDICFieldRule()); } 
	 EOF 
;

// Rule GSSFormatFDICField
ruleGSSFormatFDICField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getGroup()); }
		(rule__GSSFormatFDICField__Group__0)
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatAField
entryRuleGSSFormatAField
:
{ before(grammarAccess.getGSSFormatAFieldRule()); }
	 ruleGSSFormatAField
{ after(grammarAccess.getGSSFormatAFieldRule()); } 
	 EOF 
;

// Rule GSSFormatAField
ruleGSSFormatAField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getGroup()); }
		(rule__GSSFormatAField__Group__0)
		{ after(grammarAccess.getGSSFormatAFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatAIField
entryRuleGSSFormatAIField
:
{ before(grammarAccess.getGSSFormatAIFieldRule()); }
	 ruleGSSFormatAIField
{ after(grammarAccess.getGSSFormatAIFieldRule()); } 
	 EOF 
;

// Rule GSSFormatAIField
ruleGSSFormatAIField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getGroup()); }
		(rule__GSSFormatAIField__Group__0)
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatSize
entryRuleGSSFormatSize
:
{ before(grammarAccess.getGSSFormatSizeRule()); }
	 ruleGSSFormatSize
{ after(grammarAccess.getGSSFormatSizeRule()); } 
	 EOF 
;

// Rule GSSFormatSize
ruleGSSFormatSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatSizeAccess().getGroup()); }
		(rule__GSSFormatSize__Group__0)
		{ after(grammarAccess.getGSSFormatSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatGlobalOffset
entryRuleGSSFormatGlobalOffset
:
{ before(grammarAccess.getGSSFormatGlobalOffsetRule()); }
	 ruleGSSFormatGlobalOffset
{ after(grammarAccess.getGSSFormatGlobalOffsetRule()); } 
	 EOF 
;

// Rule GSSFormatGlobalOffset
ruleGSSFormatGlobalOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getGroup()); }
		(rule__GSSFormatGlobalOffset__Group__0)
		{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatFormula
entryRuleGSSFormatFormula
:
{ before(grammarAccess.getGSSFormatFormulaRule()); }
	 ruleGSSFormatFormula
{ after(grammarAccess.getGSSFormatFormulaRule()); } 
	 EOF 
;

// Rule GSSFormatFormula
ruleGSSFormatFormula 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatFormulaAccess().getGroup()); }
		(rule__GSSFormatFormula__Group__0)
		{ after(grammarAccess.getGSSFormatFormulaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatConstSize
entryRuleGSSFormatConstSize
:
{ before(grammarAccess.getGSSFormatConstSizeRule()); }
	 ruleGSSFormatConstSize
{ after(grammarAccess.getGSSFormatConstSizeRule()); } 
	 EOF 
;

// Rule GSSFormatConstSize
ruleGSSFormatConstSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatConstSizeAccess().getGroup()); }
		(rule__GSSFormatConstSize__Group__0)
		{ after(grammarAccess.getGSSFormatConstSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatMaxSize
entryRuleGSSFormatMaxSize
:
{ before(grammarAccess.getGSSFormatMaxSizeRule()); }
	 ruleGSSFormatMaxSize
{ after(grammarAccess.getGSSFormatMaxSizeRule()); } 
	 EOF 
;

// Rule GSSFormatMaxSize
ruleGSSFormatMaxSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatMaxSizeAccess().getGroup()); }
		(rule__GSSFormatMaxSize__Group__0)
		{ after(grammarAccess.getGSSFormatMaxSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatVariableSize
entryRuleGSSFormatVariableSize
:
{ before(grammarAccess.getGSSFormatVariableSizeRule()); }
	 ruleGSSFormatVariableSize
{ after(grammarAccess.getGSSFormatVariableSizeRule()); } 
	 EOF 
;

// Rule GSSFormatVariableSize
ruleGSSFormatVariableSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatVariableSizeAccess().getGroup()); }
		(rule__GSSFormatVariableSize__Group__0)
		{ after(grammarAccess.getGSSFormatVariableSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatFloatingOffset
entryRuleGSSFormatFloatingOffset
:
{ before(grammarAccess.getGSSFormatFloatingOffsetRule()); }
	 ruleGSSFormatFloatingOffset
{ after(grammarAccess.getGSSFormatFloatingOffsetRule()); } 
	 EOF 
;

// Rule GSSFormatFloatingOffset
ruleGSSFormatFloatingOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getGroup()); }
		(rule__GSSFormatFloatingOffset__Group__0)
		{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatSortedFieldsToCheck
entryRuleGSSFormatSortedFieldsToCheck
:
{ before(grammarAccess.getGSSFormatSortedFieldsToCheckRule()); }
	 ruleGSSFormatSortedFieldsToCheck
{ after(grammarAccess.getGSSFormatSortedFieldsToCheckRule()); } 
	 EOF 
;

// Rule GSSFormatSortedFieldsToCheck
ruleGSSFormatSortedFieldsToCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGroup()); }
		(rule__GSSFormatSortedFieldsToCheck__Group__0)
		{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatFieldToCheck
entryRuleGSSFormatFieldToCheck
:
{ before(grammarAccess.getGSSFormatFieldToCheckRule()); }
	 ruleGSSFormatFieldToCheck
{ after(grammarAccess.getGSSFormatFieldToCheckRule()); } 
	 EOF 
;

// Rule GSSFormatFieldToCheck
ruleGSSFormatFieldToCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getGroup()); }
		(rule__GSSFormatFieldToCheck__Group__0)
		{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatArrayDimension
entryRuleGSSFormatArrayDimension
:
{ before(grammarAccess.getGSSFormatArrayDimensionRule()); }
	 ruleGSSFormatArrayDimension
{ after(grammarAccess.getGSSFormatArrayDimensionRule()); } 
	 EOF 
;

// Rule GSSFormatArrayDimension
ruleGSSFormatArrayDimension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getGroup()); }
		(rule__GSSFormatArrayDimension__Group__0)
		{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatLocalOffset
entryRuleGSSFormatLocalOffset
:
{ before(grammarAccess.getGSSFormatLocalOffsetRule()); }
	 ruleGSSFormatLocalOffset
{ after(grammarAccess.getGSSFormatLocalOffsetRule()); } 
	 EOF 
;

// Rule GSSFormatLocalOffset
ruleGSSFormatLocalOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getGroup()); }
		(rule__GSSFormatLocalOffset__Group__0)
		{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFormatArrayRef
entryRuleGSSFormatArrayRef
:
{ before(grammarAccess.getGSSFormatArrayRefRule()); }
	 ruleGSSFormatArrayRef
{ after(grammarAccess.getGSSFormatArrayRefRule()); } 
	 EOF 
;

// Rule GSSFormatArrayRef
ruleGSSFormatArrayRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFormatArrayRefAccess().getGroup()); }
		(rule__GSSFormatArrayRef__Group__0)
		{ after(grammarAccess.getGSSFormatArrayRefAccess().getGroup()); }
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

// Rule GSSFormatFormatType
ruleGSSFormatFormatType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatTypeAccess().getAlternatives()); }
		(rule__GSSFormatFormatType__Alternatives)
		{ after(grammarAccess.getGSSFormatFormatTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFormatFieldType
ruleGSSFormatFieldType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getAlternatives()); }
		(rule__GSSFormatFieldType__Alternatives)
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFormatFieldByteOrder
ruleGSSFormatFieldByteOrder
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFieldByteOrderAccess().getAlternatives()); }
		(rule__GSSFormatFieldByteOrder__Alternatives)
		{ after(grammarAccess.getGSSFormatFieldByteOrderAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFormatSFieldFirstBit
ruleGSSFormatSFieldFirstBit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatSFieldFirstBitAccess().getAlternatives()); }
		(rule__GSSFormatSFieldFirstBit__Alternatives)
		{ after(grammarAccess.getGSSFormatSFieldFirstBitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFormatUnit
ruleGSSFormatUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getAlternatives()); }
		(rule__GSSFormatUnit__Alternatives)
		{ after(grammarAccess.getGSSFormatUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFormatPower
ruleGSSFormatPower
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatPowerAccess().getAlternatives()); }
		(rule__GSSFormatPower__Alternatives)
		{ after(grammarAccess.getGSSFormatPowerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFormatCheckType
ruleGSSFormatCheckType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCheckTypeAccess().getAlternatives()); }
		(rule__GSSFormatCheckType__Alternatives)
		{ after(grammarAccess.getGSSFormatCheckTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatField__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatCSFieldParserRuleCall_0()); }
		ruleGSSFormatCSField
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatCSFieldParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatCSFormulaFieldParserRuleCall_1()); }
		ruleGSSFormatCSFormulaField
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatCSFormulaFieldParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatVSFieldParserRuleCall_2()); }
		ruleGSSFormatVSField
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatVSFieldParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatFDICFieldParserRuleCall_3()); }
		ruleGSSFormatFDICField
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatFDICFieldParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatVRFieldSizeParserRuleCall_4()); }
		ruleGSSFormatVRFieldSize
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatVRFieldSizeParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatAFieldParserRuleCall_5()); }
		ruleGSSFormatAField
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatAFieldParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldAccess().getGSSFormatAIFieldParserRuleCall_6()); }
		ruleGSSFormatAIField
		{ after(grammarAccess.getGSSFormatFieldAccess().getGSSFormatAIFieldParserRuleCall_6()); }
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

rule__GSSFormatFormatType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0()); }
		('TM')
		{ after(grammarAccess.getGSSFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1()); }
		('TC')
		{ after(grammarAccess.getGSSFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0()); }
		('structured')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1()); }
		('uint')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2()); }
		('flag')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3()); }
		('enumerated')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4()); }
		('bit_vector')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5()); }
		('byte_vector')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6()); }
		('float')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7()); }
		('deduced')
		{ after(grammarAccess.getGSSFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldByteOrder__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0()); }
		('big_endian')
		{ after(grammarAccess.getGSSFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1()); }
		('little_endian')
		{ after(grammarAccess.getGSSFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2()); }
		('na')
		{ after(grammarAccess.getGSSFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSFieldFirstBit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0()); }
		('MSB')
		{ after(grammarAccess.getGSSFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1()); }
		('LSB')
		{ after(grammarAccess.getGSSFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getBytesEnumLiteralDeclaration_0()); }
		('bytes')
		{ after(grammarAccess.getGSSFormatUnitAccess().getBytesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getBitsEnumLiteralDeclaration_1()); }
		('bits')
		{ after(grammarAccess.getGSSFormatUnitAccess().getBitsEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2()); }
		('halfword')
		{ after(grammarAccess.getGSSFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getString10EnumLiteralDeclaration_3()); }
		('string10')
		{ after(grammarAccess.getGSSFormatUnitAccess().getString10EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getString17EnumLiteralDeclaration_4()); }
		('string17')
		{ after(grammarAccess.getGSSFormatUnitAccess().getString17EnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatUnitAccess().getString69EnumLiteralDeclaration_5()); }
		('string69')
		{ after(grammarAccess.getGSSFormatUnitAccess().getString69EnumLiteralDeclaration_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatPower__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatPowerAccess().get_2EnumLiteralDeclaration_0()); }
		('2bits')
		{ after(grammarAccess.getGSSFormatPowerAccess().get_2EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1()); }
		('2bits_with_0')
		{ after(grammarAccess.getGSSFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCheckType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0()); }
		('crc16')
		{ after(grammarAccess.getGSSFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1()); }
		('checksum16')
		{ after(grammarAccess.getGSSFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1()); }
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


rule__GSSFormatFormat__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__0__Impl
	rule__GSSFormatFormat__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getGSSFormatFormatKeyword_0()); }
	'GSSFormatFormat'
	{ after(grammarAccess.getGSSFormatFormatAccess().getGSSFormatFormatKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__1__Impl
	rule__GSSFormatFormat__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getNameAssignment_1()); }
	(rule__GSSFormatFormat__NameAssignment_1)
	{ after(grammarAccess.getGSSFormatFormatAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__2__Impl
	rule__GSSFormatFormat__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSFormatFormatAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__3__Impl
	rule__GSSFormatFormat__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getUriKeyword_3()); }
	'uri'
	{ after(grammarAccess.getGSSFormatFormatAccess().getUriKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__4__Impl
	rule__GSSFormatFormat__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_4()); }
	':='
	{ after(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__5__Impl
	rule__GSSFormatFormat__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getUriAssignment_5()); }
	(rule__GSSFormatFormat__UriAssignment_5)
	{ after(grammarAccess.getGSSFormatFormatAccess().getUriAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__6__Impl
	rule__GSSFormatFormat__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__7__Impl
	rule__GSSFormatFormat__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getVersionKeyword_7()); }
	'version'
	{ after(grammarAccess.getGSSFormatFormatAccess().getVersionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__8__Impl
	rule__GSSFormatFormat__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_8()); }
	':='
	{ after(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__9__Impl
	rule__GSSFormatFormat__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getVersionAssignment_9()); }
	(rule__GSSFormatFormat__VersionAssignment_9)
	{ after(grammarAccess.getGSSFormatFormatAccess().getVersionAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__10__Impl
	rule__GSSFormatFormat__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__11__Impl
	rule__GSSFormatFormat__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getProtocolKeyword_11()); }
	'protocol'
	{ after(grammarAccess.getGSSFormatFormatAccess().getProtocolKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__12__Impl
	rule__GSSFormatFormat__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_12()); }
	':='
	{ after(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__13__Impl
	rule__GSSFormatFormat__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getProtocolAssignment_13()); }
	(rule__GSSFormatFormat__ProtocolAssignment_13)
	{ after(grammarAccess.getGSSFormatFormatAccess().getProtocolAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__14__Impl
	rule__GSSFormatFormat__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__15__Impl
	rule__GSSFormatFormat__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSFormatFormatAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__16__Impl
	rule__GSSFormatFormat__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__17__Impl
	rule__GSSFormatFormat__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getTypeAssignment_17()); }
	(rule__GSSFormatFormat__TypeAssignment_17)
	{ after(grammarAccess.getGSSFormatFormatAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__18__Impl
	rule__GSSFormatFormat__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__19__Impl
	rule__GSSFormatFormat__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getFieldAssignment_19()); }
	(rule__GSSFormatFormat__FieldAssignment_19)*
	{ after(grammarAccess.getGSSFormatFormatAccess().getFieldAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__20__Impl
	rule__GSSFormatFormat__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getRightCurlyBracketKeyword_20()); }
	'}'
	{ after(grammarAccess.getGSSFormatFormatAccess().getRightCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormat__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatCSField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__0__Impl
	rule__GSSFormatCSField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getGSSFormatCSFieldKeyword_0()); }
	'GSSFormatCSField'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getGSSFormatCSFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__1__Impl
	rule__GSSFormatCSField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__2__Impl
	rule__GSSFormatCSField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__3__Impl
	rule__GSSFormatCSField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__4__Impl
	rule__GSSFormatCSField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getFidAssignment_4()); }
	(rule__GSSFormatCSField__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__5__Impl
	rule__GSSFormatCSField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__6__Impl
	rule__GSSFormatCSField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__7__Impl
	rule__GSSFormatCSField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__8__Impl
	rule__GSSFormatCSField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getPfidAssignment_8()); }
	(rule__GSSFormatCSField__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__9__Impl
	rule__GSSFormatCSField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__10__Impl
	rule__GSSFormatCSField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__11__Impl
	rule__GSSFormatCSField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__12__Impl
	rule__GSSFormatCSField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getNameAssignment_12()); }
	(rule__GSSFormatCSField__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__13__Impl
	rule__GSSFormatCSField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__14__Impl
	rule__GSSFormatCSField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getGroup_14()); }
	(rule__GSSFormatCSField__Group_14__0)?
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__15__Impl
	rule__GSSFormatCSField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__16__Impl
	rule__GSSFormatCSField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__17__Impl
	rule__GSSFormatCSField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getTypeAssignment_17()); }
	(rule__GSSFormatCSField__TypeAssignment_17)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__18__Impl
	rule__GSSFormatCSField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__19__Impl
	rule__GSSFormatCSField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__20__Impl
	rule__GSSFormatCSField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__21__Impl
	rule__GSSFormatCSField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSFormatCSField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__22__Impl
	rule__GSSFormatCSField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__23__Impl
	rule__GSSFormatCSField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__24__Impl
	rule__GSSFormatCSField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__25__Impl
	rule__GSSFormatCSField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSFormatCSField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__26__Impl
	rule__GSSFormatCSField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__27__Impl
	rule__GSSFormatCSField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSizeAssignment_27()); }
	(rule__GSSFormatCSField__SizeAssignment_27)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__28__Impl
	rule__GSSFormatCSField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__GSSFormatCSField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__29__Impl
	rule__GSSFormatCSField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatCSField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group_14__0__Impl
	rule__GSSFormatCSField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group_14__1__Impl
	rule__GSSFormatCSField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group_14__2__Impl
	rule__GSSFormatCSField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSFormatCSField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatCSFormulaField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__0__Impl
	rule__GSSFormatCSFormulaField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGSSFormatCSFormulaFieldKeyword_0()); }
	'GSSFormatCSFormulaField'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGSSFormatCSFormulaFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__1__Impl
	rule__GSSFormatCSFormulaField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__2__Impl
	rule__GSSFormatCSFormulaField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__3__Impl
	rule__GSSFormatCSFormulaField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__4__Impl
	rule__GSSFormatCSFormulaField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidAssignment_4()); }
	(rule__GSSFormatCSFormulaField__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__5__Impl
	rule__GSSFormatCSFormulaField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__6__Impl
	rule__GSSFormatCSFormulaField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__7__Impl
	rule__GSSFormatCSFormulaField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__8__Impl
	rule__GSSFormatCSFormulaField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidAssignment_8()); }
	(rule__GSSFormatCSFormulaField__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__9__Impl
	rule__GSSFormatCSFormulaField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__10__Impl
	rule__GSSFormatCSFormulaField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__11__Impl
	rule__GSSFormatCSFormulaField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__12__Impl
	rule__GSSFormatCSFormulaField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameAssignment_12()); }
	(rule__GSSFormatCSFormulaField__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__13__Impl
	rule__GSSFormatCSFormulaField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__14__Impl
	rule__GSSFormatCSFormulaField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGroup_14()); }
	(rule__GSSFormatCSFormulaField__Group_14__0)?
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__15__Impl
	rule__GSSFormatCSFormulaField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__16__Impl
	rule__GSSFormatCSFormulaField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__17__Impl
	rule__GSSFormatCSFormulaField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeAssignment_17()); }
	(rule__GSSFormatCSFormulaField__TypeAssignment_17)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__18__Impl
	rule__GSSFormatCSFormulaField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__19__Impl
	rule__GSSFormatCSFormulaField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__20__Impl
	rule__GSSFormatCSFormulaField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__21__Impl
	rule__GSSFormatCSFormulaField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSFormatCSFormulaField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__22__Impl
	rule__GSSFormatCSFormulaField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__23__Impl
	rule__GSSFormatCSFormulaField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__24__Impl
	rule__GSSFormatCSFormulaField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__25__Impl
	rule__GSSFormatCSFormulaField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSFormatCSFormulaField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__26__Impl
	rule__GSSFormatCSFormulaField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__27__Impl
	rule__GSSFormatCSFormulaField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeAssignment_27()); }
	(rule__GSSFormatCSFormulaField__SizeAssignment_27)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__28__Impl
	rule__GSSFormatCSFormulaField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__GSSFormatCSFormulaField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__29__Impl
	rule__GSSFormatCSFormulaField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaAssignment_29()); }
	(rule__GSSFormatCSFormulaField__FormulaAssignment_29)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__30__Impl
	rule__GSSFormatCSFormulaField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatCSFormulaField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group_14__0__Impl
	rule__GSSFormatCSFormulaField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group_14__1__Impl
	rule__GSSFormatCSFormulaField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group_14__2__Impl
	rule__GSSFormatCSFormulaField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSFormatCSFormulaField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatCSFormulaField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatVSField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__0__Impl
	rule__GSSFormatVSField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getGSSFormatVSFieldKeyword_0()); }
	'GSSFormatVSField'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getGSSFormatVSFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__1__Impl
	rule__GSSFormatVSField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__2__Impl
	rule__GSSFormatVSField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__3__Impl
	rule__GSSFormatVSField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__4__Impl
	rule__GSSFormatVSField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getFidAssignment_4()); }
	(rule__GSSFormatVSField__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__5__Impl
	rule__GSSFormatVSField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__6__Impl
	rule__GSSFormatVSField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__7__Impl
	rule__GSSFormatVSField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__8__Impl
	rule__GSSFormatVSField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getPfidAssignment_8()); }
	(rule__GSSFormatVSField__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__9__Impl
	rule__GSSFormatVSField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__10__Impl
	rule__GSSFormatVSField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__11__Impl
	rule__GSSFormatVSField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__12__Impl
	rule__GSSFormatVSField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getNameAssignment_12()); }
	(rule__GSSFormatVSField__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__13__Impl
	rule__GSSFormatVSField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__14__Impl
	rule__GSSFormatVSField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getGroup_14()); }
	(rule__GSSFormatVSField__Group_14__0)?
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__15__Impl
	rule__GSSFormatVSField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__16__Impl
	rule__GSSFormatVSField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__17__Impl
	rule__GSSFormatVSField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getTypeAssignment_17()); }
	(rule__GSSFormatVSField__TypeAssignment_17)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__18__Impl
	rule__GSSFormatVSField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__19__Impl
	rule__GSSFormatVSField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__20__Impl
	rule__GSSFormatVSField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__21__Impl
	rule__GSSFormatVSField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSFormatVSField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__22__Impl
	rule__GSSFormatVSField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__23__Impl
	rule__GSSFormatVSField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__24__Impl
	rule__GSSFormatVSField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__25__Impl
	rule__GSSFormatVSField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSFormatVSField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__26__Impl
	rule__GSSFormatVSField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__27__Impl
	rule__GSSFormatVSField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeAssignment_27()); }
	(rule__GSSFormatVSField__ConstSizeAssignment_27)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__28__Impl
	rule__GSSFormatVSField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeAssignment_28()); }
	(rule__GSSFormatVSField__VariableSizeAssignment_28)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__29__Impl
	rule__GSSFormatVSField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeAssignment_29()); }
	(rule__GSSFormatVSField__MaxSizeAssignment_29)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__30__Impl
	rule__GSSFormatVSField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetAssignment_30()); }
	(rule__GSSFormatVSField__GlobalOffsetAssignment_30)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetAssignment_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__31__Impl
	rule__GSSFormatVSField__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getRightCurlyBracketKeyword_31()); }
	'}'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getRightCurlyBracketKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group__32__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_32()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatVSField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group_14__0__Impl
	rule__GSSFormatVSField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group_14__1__Impl
	rule__GSSFormatVSField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group_14__2__Impl
	rule__GSSFormatVSField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSFormatVSField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVSField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatVRFieldSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__0__Impl
	rule__GSSFormatVRFieldSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getGSSFormatVRFieldSizeKeyword_0()); }
	'GSSFormatVRFieldSize'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getGSSFormatVRFieldSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__1__Impl
	rule__GSSFormatVRFieldSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__2__Impl
	rule__GSSFormatVRFieldSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__3__Impl
	rule__GSSFormatVRFieldSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__4__Impl
	rule__GSSFormatVRFieldSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidAssignment_4()); }
	(rule__GSSFormatVRFieldSize__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__5__Impl
	rule__GSSFormatVRFieldSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__6__Impl
	rule__GSSFormatVRFieldSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__7__Impl
	rule__GSSFormatVRFieldSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__8__Impl
	rule__GSSFormatVRFieldSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidAssignment_8()); }
	(rule__GSSFormatVRFieldSize__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__9__Impl
	rule__GSSFormatVRFieldSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__10__Impl
	rule__GSSFormatVRFieldSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__11__Impl
	rule__GSSFormatVRFieldSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__12__Impl
	rule__GSSFormatVRFieldSize__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameAssignment_12()); }
	(rule__GSSFormatVRFieldSize__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__13__Impl
	rule__GSSFormatVRFieldSize__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__14__Impl
	rule__GSSFormatVRFieldSize__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVRFieldSize__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatFDICField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__0__Impl
	rule__GSSFormatFDICField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getGSSFormatFDICFieldKeyword_0()); }
	'GSSFormatFDICField'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getGSSFormatFDICFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__1__Impl
	rule__GSSFormatFDICField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__2__Impl
	rule__GSSFormatFDICField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__3__Impl
	rule__GSSFormatFDICField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__4__Impl
	rule__GSSFormatFDICField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFidAssignment_4()); }
	(rule__GSSFormatFDICField__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__5__Impl
	rule__GSSFormatFDICField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__6__Impl
	rule__GSSFormatFDICField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__7__Impl
	rule__GSSFormatFDICField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__8__Impl
	rule__GSSFormatFDICField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getPfidAssignment_8()); }
	(rule__GSSFormatFDICField__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__9__Impl
	rule__GSSFormatFDICField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__10__Impl
	rule__GSSFormatFDICField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__11__Impl
	rule__GSSFormatFDICField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__12__Impl
	rule__GSSFormatFDICField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getNameAssignment_12()); }
	(rule__GSSFormatFDICField__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__13__Impl
	rule__GSSFormatFDICField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__14__Impl
	rule__GSSFormatFDICField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getGroup_14()); }
	(rule__GSSFormatFDICField__Group_14__0)?
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__15__Impl
	rule__GSSFormatFDICField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeKeyword_15()); }
	'checkType'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__16__Impl
	rule__GSSFormatFDICField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__17__Impl
	rule__GSSFormatFDICField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeAssignment_17()); }
	(rule__GSSFormatFDICField__CheckTypeAssignment_17)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__18__Impl
	rule__GSSFormatFDICField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__19__Impl
	rule__GSSFormatFDICField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__20__Impl
	rule__GSSFormatFDICField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__21__Impl
	rule__GSSFormatFDICField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSFormatFDICField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__22__Impl
	rule__GSSFormatFDICField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__23__Impl
	rule__GSSFormatFDICField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__24__Impl
	rule__GSSFormatFDICField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__25__Impl
	rule__GSSFormatFDICField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSFormatFDICField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__26__Impl
	rule__GSSFormatFDICField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__27__Impl
	rule__GSSFormatFDICField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSizeAssignment_27()); }
	(rule__GSSFormatFDICField__SizeAssignment_27)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__28__Impl
	rule__GSSFormatFDICField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetAssignment_28()); }
	(rule__GSSFormatFDICField__FloatingOffsetAssignment_28)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__29__Impl
	rule__GSSFormatFDICField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29()); }
	(rule__GSSFormatFDICField__SortedFieldsToCheckAssignment_29)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__30__Impl
	rule__GSSFormatFDICField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatFDICField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group_14__0__Impl
	rule__GSSFormatFDICField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group_14__1__Impl
	rule__GSSFormatFDICField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group_14__2__Impl
	rule__GSSFormatFDICField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSFormatFDICField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFDICField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatAField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__0__Impl
	rule__GSSFormatAField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getGSSFormatAFieldKeyword_0()); }
	'GSSFormatAField'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getGSSFormatAFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__1__Impl
	rule__GSSFormatAField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__2__Impl
	rule__GSSFormatAField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__3__Impl
	rule__GSSFormatAField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__4__Impl
	rule__GSSFormatAField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getFidAssignment_4()); }
	(rule__GSSFormatAField__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__5__Impl
	rule__GSSFormatAField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__6__Impl
	rule__GSSFormatAField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__7__Impl
	rule__GSSFormatAField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__8__Impl
	rule__GSSFormatAField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getPfidAssignment_8()); }
	(rule__GSSFormatAField__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__9__Impl
	rule__GSSFormatAField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__10__Impl
	rule__GSSFormatAField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__11__Impl
	rule__GSSFormatAField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__12__Impl
	rule__GSSFormatAField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getNameAssignment_12()); }
	(rule__GSSFormatAField__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__13__Impl
	rule__GSSFormatAField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__14__Impl
	rule__GSSFormatAField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getGroup_14()); }
	(rule__GSSFormatAField__Group_14__0)?
	{ after(grammarAccess.getGSSFormatAFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__15__Impl
	rule__GSSFormatAField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__16__Impl
	rule__GSSFormatAField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__17__Impl
	rule__GSSFormatAField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getTypeAssignment_17()); }
	(rule__GSSFormatAField__TypeAssignment_17)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__18__Impl
	rule__GSSFormatAField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__19__Impl
	rule__GSSFormatAField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__20__Impl
	rule__GSSFormatAField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__21__Impl
	rule__GSSFormatAField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSFormatAField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__22__Impl
	rule__GSSFormatAField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__23__Impl
	rule__GSSFormatAField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__24__Impl
	rule__GSSFormatAField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__25__Impl
	rule__GSSFormatAField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSFormatAField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__26__Impl
	rule__GSSFormatAField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__27__Impl
	rule__GSSFormatAField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionAssignment_27()); }
	(rule__GSSFormatAField__ArrayDimensionAssignment_27)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__28__Impl
	rule__GSSFormatAField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSizeAssignment_28()); }
	(rule__GSSFormatAField__SizeAssignment_28)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSizeAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__29__Impl
	rule__GSSFormatAField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetAssignment_29()); }
	(rule__GSSFormatAField__GlobalOffsetAssignment_29)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__30__Impl
	rule__GSSFormatAField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatAField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group_14__0__Impl
	rule__GSSFormatAField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group_14__1__Impl
	rule__GSSFormatAField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group_14__2__Impl
	rule__GSSFormatAField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSFormatAField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSFormatAFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatAIField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__0__Impl
	rule__GSSFormatAIField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getGSSFormatAIFieldKeyword_0()); }
	'GSSFormatAIField'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getGSSFormatAIFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__1__Impl
	rule__GSSFormatAIField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__2__Impl
	rule__GSSFormatAIField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__3__Impl
	rule__GSSFormatAIField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__4__Impl
	rule__GSSFormatAIField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getFidAssignment_4()); }
	(rule__GSSFormatAIField__FidAssignment_4)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__5__Impl
	rule__GSSFormatAIField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__6__Impl
	rule__GSSFormatAIField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__7__Impl
	rule__GSSFormatAIField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__8__Impl
	rule__GSSFormatAIField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getPfidAssignment_8()); }
	(rule__GSSFormatAIField__PfidAssignment_8)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__9__Impl
	rule__GSSFormatAIField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__10__Impl
	rule__GSSFormatAIField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__11__Impl
	rule__GSSFormatAIField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__12__Impl
	rule__GSSFormatAIField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getNameAssignment_12()); }
	(rule__GSSFormatAIField__NameAssignment_12)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__13__Impl
	rule__GSSFormatAIField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__14__Impl
	rule__GSSFormatAIField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getGroup_14()); }
	(rule__GSSFormatAIField__Group_14__0)?
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__15__Impl
	rule__GSSFormatAIField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__16__Impl
	rule__GSSFormatAIField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__17__Impl
	rule__GSSFormatAIField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getTypeAssignment_17()); }
	(rule__GSSFormatAIField__TypeAssignment_17)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__18__Impl
	rule__GSSFormatAIField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__19__Impl
	rule__GSSFormatAIField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__20__Impl
	rule__GSSFormatAIField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__21__Impl
	rule__GSSFormatAIField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSFormatAIField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__22__Impl
	rule__GSSFormatAIField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__23__Impl
	rule__GSSFormatAIField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__24__Impl
	rule__GSSFormatAIField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__25__Impl
	rule__GSSFormatAIField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSFormatAIField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__26__Impl
	rule__GSSFormatAIField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__27__Impl
	rule__GSSFormatAIField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefAssignment_27()); }
	(rule__GSSFormatAIField__ArrayRefAssignment_27)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__28__Impl
	rule__GSSFormatAIField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSizeAssignment_28()); }
	(rule__GSSFormatAIField__SizeAssignment_28)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSizeAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__29__Impl
	rule__GSSFormatAIField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetAssignment_29()); }
	(rule__GSSFormatAIField__LocalOffsetAssignment_29)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__30__Impl
	rule__GSSFormatAIField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatAIField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group_14__0__Impl
	rule__GSSFormatAIField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group_14__1__Impl
	rule__GSSFormatAIField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group_14__2__Impl
	rule__GSSFormatAIField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSFormatAIField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatAIField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__0__Impl
	rule__GSSFormatSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getGSSFormatSizeKeyword_0()); }
	'GSSFormatSize'
	{ after(grammarAccess.getGSSFormatSizeAccess().getGSSFormatSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__1__Impl
	rule__GSSFormatSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__2__Impl
	rule__GSSFormatSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSFormatSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__3__Impl
	rule__GSSFormatSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__4__Impl
	rule__GSSFormatSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getBytesAssignment_4()); }
	(rule__GSSFormatSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSFormatSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__5__Impl
	rule__GSSFormatSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__6__Impl
	rule__GSSFormatSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSFormatSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__7__Impl
	rule__GSSFormatSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__8__Impl
	rule__GSSFormatSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getBitsAssignment_8()); }
	(rule__GSSFormatSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSFormatSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__9__Impl
	rule__GSSFormatSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__10__Impl
	rule__GSSFormatSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatGlobalOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__0__Impl
	rule__GSSFormatGlobalOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getGSSFormatGlobalOffsetKeyword_0()); }
	'GSSFormatGlobalOffset'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getGSSFormatGlobalOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__1__Impl
	rule__GSSFormatGlobalOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__2__Impl
	rule__GSSFormatGlobalOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__3__Impl
	rule__GSSFormatGlobalOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__4__Impl
	rule__GSSFormatGlobalOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesAssignment_4()); }
	(rule__GSSFormatGlobalOffset__BytesAssignment_4)
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__5__Impl
	rule__GSSFormatGlobalOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__6__Impl
	rule__GSSFormatGlobalOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__7__Impl
	rule__GSSFormatGlobalOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__8__Impl
	rule__GSSFormatGlobalOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsAssignment_8()); }
	(rule__GSSFormatGlobalOffset__BitsAssignment_8)
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__9__Impl
	rule__GSSFormatGlobalOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__10__Impl
	rule__GSSFormatGlobalOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatGlobalOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatFormula__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__0__Impl
	rule__GSSFormatFormula__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getGSSFormatFormulaKeyword_0()); }
	'GSSFormatFormula'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getGSSFormatFormulaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__1__Impl
	rule__GSSFormatFormula__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__2__Impl
	rule__GSSFormatFormula__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getSlopeKeyword_2()); }
	'slope'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getSlopeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__3__Impl
	rule__GSSFormatFormula__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__4__Impl
	rule__GSSFormatFormula__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getSlopeAssignment_4()); }
	(rule__GSSFormatFormula__SlopeAssignment_4)
	{ after(grammarAccess.getGSSFormatFormulaAccess().getSlopeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__5__Impl
	rule__GSSFormatFormula__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__6__Impl
	rule__GSSFormatFormula__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getInterceptKeyword_6()); }
	'intercept'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getInterceptKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__7__Impl
	rule__GSSFormatFormula__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__8__Impl
	rule__GSSFormatFormula__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getInterceptAssignment_8()); }
	(rule__GSSFormatFormula__InterceptAssignment_8)
	{ after(grammarAccess.getGSSFormatFormulaAccess().getInterceptAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__9__Impl
	rule__GSSFormatFormula__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__10__Impl
	rule__GSSFormatFormula__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFormula__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatConstSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__0__Impl
	rule__GSSFormatConstSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getGSSFormatConstSizeKeyword_0()); }
	'GSSFormatConstSize'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getGSSFormatConstSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__1__Impl
	rule__GSSFormatConstSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__2__Impl
	rule__GSSFormatConstSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__3__Impl
	rule__GSSFormatConstSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__4__Impl
	rule__GSSFormatConstSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getBytesAssignment_4()); }
	(rule__GSSFormatConstSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__5__Impl
	rule__GSSFormatConstSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__6__Impl
	rule__GSSFormatConstSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__7__Impl
	rule__GSSFormatConstSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__8__Impl
	rule__GSSFormatConstSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getBitsAssignment_8()); }
	(rule__GSSFormatConstSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__9__Impl
	rule__GSSFormatConstSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__10__Impl
	rule__GSSFormatConstSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatConstSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatMaxSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__0__Impl
	rule__GSSFormatMaxSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getGSSFormatMaxSizeKeyword_0()); }
	'GSSFormatMaxSize'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getGSSFormatMaxSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__1__Impl
	rule__GSSFormatMaxSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__2__Impl
	rule__GSSFormatMaxSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__3__Impl
	rule__GSSFormatMaxSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__4__Impl
	rule__GSSFormatMaxSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getBytesAssignment_4()); }
	(rule__GSSFormatMaxSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__5__Impl
	rule__GSSFormatMaxSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__6__Impl
	rule__GSSFormatMaxSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__7__Impl
	rule__GSSFormatMaxSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__8__Impl
	rule__GSSFormatMaxSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getBitsAssignment_8()); }
	(rule__GSSFormatMaxSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__9__Impl
	rule__GSSFormatMaxSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__10__Impl
	rule__GSSFormatMaxSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatMaxSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatVariableSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__0__Impl
	rule__GSSFormatVariableSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getGSSFormatVariableSizeKeyword_0()); }
	'GSSFormatVariableSize'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getGSSFormatVariableSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__1__Impl
	rule__GSSFormatVariableSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__2__Impl
	rule__GSSFormatVariableSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__3__Impl
	rule__GSSFormatVariableSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__4__Impl
	rule__GSSFormatVariableSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefAssignment_4()); }
	(rule__GSSFormatVariableSize__FidRefAssignment_4)
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__5__Impl
	rule__GSSFormatVariableSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__6__Impl
	rule__GSSFormatVariableSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getUnitKeyword_6()); }
	'unit'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getUnitKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__7__Impl
	rule__GSSFormatVariableSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__8__Impl
	rule__GSSFormatVariableSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getUnitAssignment_8()); }
	(rule__GSSFormatVariableSize__UnitAssignment_8)
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getUnitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__9__Impl
	rule__GSSFormatVariableSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__10__Impl
	rule__GSSFormatVariableSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getGroup_10()); }
	(rule__GSSFormatVariableSize__Group_10__0)?
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__11__Impl
	rule__GSSFormatVariableSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatVariableSize__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group_10__0__Impl
	rule__GSSFormatVariableSize__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getPowerKeyword_10_0()); }
	'power'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getPowerKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group_10__1__Impl
	rule__GSSFormatVariableSize__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group_10__2__Impl
	rule__GSSFormatVariableSize__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getPowerAssignment_10_2()); }
	(rule__GSSFormatVariableSize__PowerAssignment_10_2)
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getPowerAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatVariableSize__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatFloatingOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__0__Impl
	rule__GSSFormatFloatingOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getGSSFormatFloatingOffsetKeyword_0()); }
	'GSSFormatFloatingOffset'
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getGSSFormatFloatingOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__1__Impl
	rule__GSSFormatFloatingOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__2__Impl
	rule__GSSFormatFloatingOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__3__Impl
	rule__GSSFormatFloatingOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__4__Impl
	rule__GSSFormatFloatingOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefAssignment_4()); }
	(rule__GSSFormatFloatingOffset__FidRefAssignment_4)
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__5__Impl
	rule__GSSFormatFloatingOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__6__Impl
	rule__GSSFormatFloatingOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFloatingOffset__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatSortedFieldsToCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSortedFieldsToCheck__Group__0__Impl
	rule__GSSFormatSortedFieldsToCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckAction_0()); }
	()
	{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSortedFieldsToCheck__Group__1__Impl
	rule__GSSFormatSortedFieldsToCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckKeyword_1()); }
	'GSSFormatSortedFieldsToCheck'
	{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSortedFieldsToCheck__Group__2__Impl
	rule__GSSFormatSortedFieldsToCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSortedFieldsToCheck__Group__3__Impl
	rule__GSSFormatSortedFieldsToCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
		(rule__GSSFormatSortedFieldsToCheck__FieldToCheckAssignment_3)
		{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
	)
	(
		{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
		(rule__GSSFormatSortedFieldsToCheck__FieldToCheckAssignment_3)*
		{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSortedFieldsToCheck__Group__4__Impl
	rule__GSSFormatSortedFieldsToCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatSortedFieldsToCheck__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatFieldToCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__0__Impl
	rule__GSSFormatFieldToCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getGSSFormatFieldToCheckKeyword_0()); }
	'GSSFormatFieldToCheck'
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getGSSFormatFieldToCheckKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__1__Impl
	rule__GSSFormatFieldToCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__2__Impl
	rule__GSSFormatFieldToCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__3__Impl
	rule__GSSFormatFieldToCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__4__Impl
	rule__GSSFormatFieldToCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefAssignment_4()); }
	(rule__GSSFormatFieldToCheck__FidRefAssignment_4)
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__5__Impl
	rule__GSSFormatFieldToCheck__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__6__Impl
	rule__GSSFormatFieldToCheck__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatFieldToCheck__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatArrayDimension__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__0__Impl
	rule__GSSFormatArrayDimension__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getGSSFormatArrayDimensionKeyword_0()); }
	'GSSFormatArrayDimension'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getGSSFormatArrayDimensionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__1__Impl
	rule__GSSFormatArrayDimension__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__2__Impl
	rule__GSSFormatArrayDimension__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__3__Impl
	rule__GSSFormatArrayDimension__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__4__Impl
	rule__GSSFormatArrayDimension__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefAssignment_4()); }
	(rule__GSSFormatArrayDimension__FidRefAssignment_4)
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__5__Impl
	rule__GSSFormatArrayDimension__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__6__Impl
	rule__GSSFormatArrayDimension__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsKeyword_6()); }
	'maxItems'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__7__Impl
	rule__GSSFormatArrayDimension__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__8__Impl
	rule__GSSFormatArrayDimension__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsAssignment_8()); }
	(rule__GSSFormatArrayDimension__MaxItemsAssignment_8)
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__9__Impl
	rule__GSSFormatArrayDimension__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__10__Impl
	rule__GSSFormatArrayDimension__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayDimension__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatLocalOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__0__Impl
	rule__GSSFormatLocalOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getGSSFormatLocalOffsetKeyword_0()); }
	'GSSFormatLocalOffset'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getGSSFormatLocalOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__1__Impl
	rule__GSSFormatLocalOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__2__Impl
	rule__GSSFormatLocalOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__3__Impl
	rule__GSSFormatLocalOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__4__Impl
	rule__GSSFormatLocalOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesAssignment_4()); }
	(rule__GSSFormatLocalOffset__BytesAssignment_4)
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__5__Impl
	rule__GSSFormatLocalOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__6__Impl
	rule__GSSFormatLocalOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__7__Impl
	rule__GSSFormatLocalOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__8__Impl
	rule__GSSFormatLocalOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsAssignment_8()); }
	(rule__GSSFormatLocalOffset__BitsAssignment_8)
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__9__Impl
	rule__GSSFormatLocalOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__10__Impl
	rule__GSSFormatLocalOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatLocalOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFormatArrayRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__0__Impl
	rule__GSSFormatArrayRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getGSSFormatArrayRefKeyword_0()); }
	'GSSFormatArrayRef'
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getGSSFormatArrayRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__1__Impl
	rule__GSSFormatArrayRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__2__Impl
	rule__GSSFormatArrayRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__3__Impl
	rule__GSSFormatArrayRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__4__Impl
	rule__GSSFormatArrayRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getFidRefAssignment_4()); }
	(rule__GSSFormatArrayRef__FidRefAssignment_4)
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__5__Impl
	rule__GSSFormatArrayRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__6__Impl
	rule__GSSFormatArrayRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFormatArrayRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_7()); }
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSFormatFormatParserRuleCall_1_0()); }
		ruleGSSFormatFormat
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSFormatFormatParserRuleCall_1_0()); }
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

rule__GSSFormatFormat__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFormatFormatAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__UriAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getUriQualifiedNameParserRuleCall_5_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSFormatFormatAccess().getUriQualifiedNameParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__VersionAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getVersionVersionParserRuleCall_9_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSFormatFormatAccess().getVersionVersionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__ProtocolAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getProtocolIDTerminalRuleCall_13_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFormatFormatAccess().getProtocolIDTerminalRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getTypeGSSFormatFormatTypeEnumRuleCall_17_0()); }
		ruleGSSFormatFormatType
		{ after(grammarAccess.getGSSFormatFormatAccess().getTypeGSSFormatFormatTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormat__FieldAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormatAccess().getFieldGSSFormatFieldParserRuleCall_19_0()); }
		ruleGSSFormatField
		{ after(grammarAccess.getGSSFormatFormatAccess().getFieldGSSFormatFieldParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSFormatFieldType
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSFormatFieldByteOrder
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSFormatSFieldFirstBit
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0()); }
		ruleGSSFormatSize
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleGSSFormatGlobalOffset
		{ after(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSFormatFieldType
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSFormatFieldByteOrder
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSFormatSFieldFirstBit
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0()); }
		ruleGSSFormatSize
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleGSSFormatGlobalOffset
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatCSFormulaField__FormulaAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaGSSFormatFormulaParserRuleCall_29_0()); }
		ruleGSSFormatFormula
		{ after(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaGSSFormatFormulaParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSFormatFieldType
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSFormatFieldByteOrder
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSFormatSFieldFirstBit
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__ConstSizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeGSSFormatConstSizeParserRuleCall_27_0()); }
		ruleGSSFormatConstSize
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeGSSFormatConstSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__VariableSizeAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeGSSFormatVariableSizeParserRuleCall_28_0()); }
		ruleGSSFormatVariableSize
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeGSSFormatVariableSizeParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__MaxSizeAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeGSSFormatMaxSizeParserRuleCall_29_0()); }
		ruleGSSFormatMaxSize
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeGSSFormatMaxSizeParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVSField__GlobalOffsetAssignment_30
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0()); }
		ruleGSSFormatGlobalOffset
		{ after(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVRFieldSize__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__CheckTypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0()); }
		ruleGSSFormatCheckType
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSFormatFieldByteOrder
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSFormatSFieldFirstBit
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0()); }
		ruleGSSFormatSize
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__FloatingOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0()); }
		ruleGSSFormatFloatingOffset
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFDICField__SortedFieldsToCheckAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0()); }
		ruleGSSFormatSortedFieldsToCheck
		{ after(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSFormatFieldType
		{ after(grammarAccess.getGSSFormatAFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSFormatFieldByteOrder
		{ after(grammarAccess.getGSSFormatAFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSFormatSFieldFirstBit
		{ after(grammarAccess.getGSSFormatAFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__ArrayDimensionAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0()); }
		ruleGSSFormatArrayDimension
		{ after(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__SizeAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0()); }
		ruleGSSFormatSize
		{ after(grammarAccess.getGSSFormatAFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAField__GlobalOffsetAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0()); }
		ruleGSSFormatGlobalOffset
		{ after(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSFormatFieldType
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSFormatFieldByteOrder
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSFormatSFieldFirstBit
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__ArrayRefAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefGSSFormatArrayRefParserRuleCall_27_0()); }
		ruleGSSFormatArrayRef
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefGSSFormatArrayRefParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__SizeAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0()); }
		ruleGSSFormatSize
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatAIField__LocalOffsetAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0()); }
		ruleGSSFormatLocalOffset
		{ after(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatGlobalOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__SlopeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFormula__InterceptAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatConstSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatMaxSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__UnitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVariableSizeAccess().getUnitGSSFormatUnitEnumRuleCall_8_0()); }
		ruleGSSFormatUnit
		{ after(grammarAccess.getGSSFormatVariableSizeAccess().getUnitGSSFormatUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatVariableSize__PowerAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatVariableSizeAccess().getPowerGSSFormatPowerEnumRuleCall_10_2_0()); }
		ruleGSSFormatPower
		{ after(grammarAccess.getGSSFormatVariableSizeAccess().getPowerGSSFormatPowerEnumRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFloatingOffset__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatSortedFieldsToCheck__FieldToCheckAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0()); }
		ruleGSSFormatFieldToCheck
		{ after(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatFieldToCheck__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayDimension__MaxItemsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatLocalOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFormatArrayRef__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0()); }
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
