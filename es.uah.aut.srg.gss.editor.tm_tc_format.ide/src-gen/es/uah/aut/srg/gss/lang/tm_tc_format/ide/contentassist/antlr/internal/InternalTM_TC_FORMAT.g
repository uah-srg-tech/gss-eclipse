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
grammar InternalTM_TC_FORMAT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tm_tc_format.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tm_tc_format.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tm_tc_format.services.TM_TC_FORMATGrammarAccess;

}
@parser::members {
	private TM_TC_FORMATGrammarAccess grammarAccess;

	public void setGrammarAccess(TM_TC_FORMATGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSTmTcFormatTmTCFormat
entryRuleGSSTmTcFormatTmTCFormat
:
{ before(grammarAccess.getGSSTmTcFormatTmTCFormatRule()); }
	 ruleGSSTmTcFormatTmTCFormat
{ after(grammarAccess.getGSSTmTcFormatTmTCFormatRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatTmTCFormat
ruleGSSTmTcFormatTmTCFormat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup()); }
		(rule__GSSTmTcFormatTmTCFormat__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatCSField
entryRuleGSSTmTcFormatCSField
:
{ before(grammarAccess.getGSSTmTcFormatCSFieldRule()); }
	 ruleGSSTmTcFormatCSField
{ after(grammarAccess.getGSSTmTcFormatCSFieldRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatCSField
ruleGSSTmTcFormatCSField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGroup()); }
		(rule__GSSTmTcFormatCSField__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatCSFormulaField
entryRuleGSSTmTcFormatCSFormulaField
:
{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule()); }
	 ruleGSSTmTcFormatCSFormulaField
{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatCSFormulaField
ruleGSSTmTcFormatCSFormulaField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGroup()); }
		(rule__GSSTmTcFormatCSFormulaField__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatVSField
entryRuleGSSTmTcFormatVSField
:
{ before(grammarAccess.getGSSTmTcFormatVSFieldRule()); }
	 ruleGSSTmTcFormatVSField
{ after(grammarAccess.getGSSTmTcFormatVSFieldRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatVSField
ruleGSSTmTcFormatVSField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGroup()); }
		(rule__GSSTmTcFormatVSField__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatFDICField
entryRuleGSSTmTcFormatFDICField
:
{ before(grammarAccess.getGSSTmTcFormatFDICFieldRule()); }
	 ruleGSSTmTcFormatFDICField
{ after(grammarAccess.getGSSTmTcFormatFDICFieldRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatFDICField
ruleGSSTmTcFormatFDICField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGroup()); }
		(rule__GSSTmTcFormatFDICField__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatVRFieldSize
entryRuleGSSTmTcFormatVRFieldSize
:
{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeRule()); }
	 ruleGSSTmTcFormatVRFieldSize
{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatVRFieldSize
ruleGSSTmTcFormatVRFieldSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGroup()); }
		(rule__GSSTmTcFormatVRFieldSize__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatAField
entryRuleGSSTmTcFormatAField
:
{ before(grammarAccess.getGSSTmTcFormatAFieldRule()); }
	 ruleGSSTmTcFormatAField
{ after(grammarAccess.getGSSTmTcFormatAFieldRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatAField
ruleGSSTmTcFormatAField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getGroup()); }
		(rule__GSSTmTcFormatAField__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatAIField
entryRuleGSSTmTcFormatAIField
:
{ before(grammarAccess.getGSSTmTcFormatAIFieldRule()); }
	 ruleGSSTmTcFormatAIField
{ after(grammarAccess.getGSSTmTcFormatAIFieldRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatAIField
ruleGSSTmTcFormatAIField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGroup()); }
		(rule__GSSTmTcFormatAIField__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatSize
entryRuleGSSTmTcFormatSize
:
{ before(grammarAccess.getGSSTmTcFormatSizeRule()); }
	 ruleGSSTmTcFormatSize
{ after(grammarAccess.getGSSTmTcFormatSizeRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatSize
ruleGSSTmTcFormatSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getGroup()); }
		(rule__GSSTmTcFormatSize__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatGlobalOffset
entryRuleGSSTmTcFormatGlobalOffset
:
{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetRule()); }
	 ruleGSSTmTcFormatGlobalOffset
{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatGlobalOffset
ruleGSSTmTcFormatGlobalOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGroup()); }
		(rule__GSSTmTcFormatGlobalOffset__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatFormula
entryRuleGSSTmTcFormatFormula
:
{ before(grammarAccess.getGSSTmTcFormatFormulaRule()); }
	 ruleGSSTmTcFormatFormula
{ after(grammarAccess.getGSSTmTcFormatFormulaRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatFormula
ruleGSSTmTcFormatFormula 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getGroup()); }
		(rule__GSSTmTcFormatFormula__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatConstSize
entryRuleGSSTmTcFormatConstSize
:
{ before(grammarAccess.getGSSTmTcFormatConstSizeRule()); }
	 ruleGSSTmTcFormatConstSize
{ after(grammarAccess.getGSSTmTcFormatConstSizeRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatConstSize
ruleGSSTmTcFormatConstSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getGroup()); }
		(rule__GSSTmTcFormatConstSize__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatMaxSize
entryRuleGSSTmTcFormatMaxSize
:
{ before(grammarAccess.getGSSTmTcFormatMaxSizeRule()); }
	 ruleGSSTmTcFormatMaxSize
{ after(grammarAccess.getGSSTmTcFormatMaxSizeRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatMaxSize
ruleGSSTmTcFormatMaxSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGroup()); }
		(rule__GSSTmTcFormatMaxSize__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatVariableSize
entryRuleGSSTmTcFormatVariableSize
:
{ before(grammarAccess.getGSSTmTcFormatVariableSizeRule()); }
	 ruleGSSTmTcFormatVariableSize
{ after(grammarAccess.getGSSTmTcFormatVariableSizeRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatVariableSize
ruleGSSTmTcFormatVariableSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGroup()); }
		(rule__GSSTmTcFormatVariableSize__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatFloatingOffset
entryRuleGSSTmTcFormatFloatingOffset
:
{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetRule()); }
	 ruleGSSTmTcFormatFloatingOffset
{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatFloatingOffset
ruleGSSTmTcFormatFloatingOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGroup()); }
		(rule__GSSTmTcFormatFloatingOffset__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatSortedFieldsToCheck
entryRuleGSSTmTcFormatSortedFieldsToCheck
:
{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckRule()); }
	 ruleGSSTmTcFormatSortedFieldsToCheck
{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatSortedFieldsToCheck
ruleGSSTmTcFormatSortedFieldsToCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGroup()); }
		(rule__GSSTmTcFormatSortedFieldsToCheck__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatFieldToCheck
entryRuleGSSTmTcFormatFieldToCheck
:
{ before(grammarAccess.getGSSTmTcFormatFieldToCheckRule()); }
	 ruleGSSTmTcFormatFieldToCheck
{ after(grammarAccess.getGSSTmTcFormatFieldToCheckRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatFieldToCheck
ruleGSSTmTcFormatFieldToCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGroup()); }
		(rule__GSSTmTcFormatFieldToCheck__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatArrayDimension
entryRuleGSSTmTcFormatArrayDimension
:
{ before(grammarAccess.getGSSTmTcFormatArrayDimensionRule()); }
	 ruleGSSTmTcFormatArrayDimension
{ after(grammarAccess.getGSSTmTcFormatArrayDimensionRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatArrayDimension
ruleGSSTmTcFormatArrayDimension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGroup()); }
		(rule__GSSTmTcFormatArrayDimension__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatLocalOffset
entryRuleGSSTmTcFormatLocalOffset
:
{ before(grammarAccess.getGSSTmTcFormatLocalOffsetRule()); }
	 ruleGSSTmTcFormatLocalOffset
{ after(grammarAccess.getGSSTmTcFormatLocalOffsetRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatLocalOffset
ruleGSSTmTcFormatLocalOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGroup()); }
		(rule__GSSTmTcFormatLocalOffset__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTmTcFormatArrayRef
entryRuleGSSTmTcFormatArrayRef
:
{ before(grammarAccess.getGSSTmTcFormatArrayRefRule()); }
	 ruleGSSTmTcFormatArrayRef
{ after(grammarAccess.getGSSTmTcFormatArrayRefRule()); } 
	 EOF 
;

// Rule GSSTmTcFormatArrayRef
ruleGSSTmTcFormatArrayRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getGroup()); }
		(rule__GSSTmTcFormatArrayRef__Group__0)
		{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getGroup()); }
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

// Entry rule entryRuleREAL
entryRuleREAL
:
{ before(grammarAccess.getREALRule()); }
	 ruleREAL
{ after(grammarAccess.getREALRule()); } 
	 EOF 
;

// Rule REAL
ruleREAL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getREALAccess().getGroup()); }
		(rule__REAL__Group__0)
		{ after(grammarAccess.getREALAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatTmTCFormatType
ruleGSSTmTcFormatTmTCFormatType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getAlternatives()); }
		(rule__GSSTmTcFormatTmTCFormatType__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatFieldType
ruleGSSTmTcFormatFieldType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getAlternatives()); }
		(rule__GSSTmTcFormatFieldType__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatFieldByteOrder
ruleGSSTmTcFormatFieldByteOrder
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getAlternatives()); }
		(rule__GSSTmTcFormatFieldByteOrder__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatSFieldFirstBit
ruleGSSTmTcFormatSFieldFirstBit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getAlternatives()); }
		(rule__GSSTmTcFormatSFieldFirstBit__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatUnit
ruleGSSTmTcFormatUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getAlternatives()); }
		(rule__GSSTmTcFormatUnit__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatPower
ruleGSSTmTcFormatPower
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatPowerAccess().getAlternatives()); }
		(rule__GSSTmTcFormatPower__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatPowerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTmTcFormatCheckType
ruleGSSTmTcFormatCheckType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getAlternatives()); }
		(rule__GSSTmTcFormatCheckType__Alternatives)
		{ after(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Alternatives_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldAssignment_3_3_1_0()); }
		(rule__GSSTmTcFormatTmTCFormat__CSFieldAssignment_3_3_1_0)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldAssignment_3_3_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldAssignment_3_3_1_1()); }
		(rule__GSSTmTcFormatTmTCFormat__CSFormulaFieldAssignment_3_3_1_1)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldAssignment_3_3_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldAssignment_3_3_1_2()); }
		(rule__GSSTmTcFormatTmTCFormat__VSFieldAssignment_3_3_1_2)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldAssignment_3_3_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldAssignment_3_3_1_3()); }
		(rule__GSSTmTcFormatTmTCFormat__FDICFieldAssignment_3_3_1_3)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldAssignment_3_3_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeAssignment_3_3_1_4()); }
		(rule__GSSTmTcFormatTmTCFormat__VRFieldSizeAssignment_3_3_1_4)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeAssignment_3_3_1_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldAssignment_3_3_1_5()); }
		(rule__GSSTmTcFormatTmTCFormat__AFieldAssignment_3_3_1_5)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldAssignment_3_3_1_5()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldAssignment_3_3_1_6()); }
		(rule__GSSTmTcFormatTmTCFormat__AIFieldAssignment_3_3_1_6)
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldAssignment_3_3_1_6()); }
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

rule__GSSTmTcFormatTmTCFormatType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTMEnumLiteralDeclaration_0()); }
		('TM')
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTMEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTCEnumLiteralDeclaration_1()); }
		('TC')
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTCEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0()); }
		('structured')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1()); }
		('uint')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2()); }
		('flag')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3()); }
		('enumerated')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4()); }
		('bit_vector')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5()); }
		('byte_vector')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6()); }
		('float')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7()); }
		('deduced')
		{ after(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldByteOrder__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0()); }
		('big_endian')
		{ after(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1()); }
		('little_endian')
		{ after(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2()); }
		('na')
		{ after(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSFieldFirstBit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0()); }
		('MSB')
		{ after(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1()); }
		('LSB')
		{ after(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getBytesEnumLiteralDeclaration_0()); }
		('bytes')
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getBytesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getBitsEnumLiteralDeclaration_1()); }
		('bits')
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getBitsEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2()); }
		('halfword')
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3()); }
		('string10')
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4()); }
		('string17')
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatUnitAccess().getString69EnumLiteralDeclaration_5()); }
		('string69')
		{ after(grammarAccess.getGSSTmTcFormatUnitAccess().getString69EnumLiteralDeclaration_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatPower__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0()); }
		('2bits')
		{ after(grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1()); }
		('2bits_with_0')
		{ after(grammarAccess.getGSSTmTcFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCheckType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0()); }
		('crc16')
		{ after(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1()); }
		('checksum16')
		{ after(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1()); }
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
	{ before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); }
	(rule__GSSModelFileImport__ImportURIAssignment_1)
	{ after(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); }
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
	{ before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group__0__Impl
	rule__GSSTmTcFormatTmTCFormat__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGSSTmTcFormatTmTCFormatKeyword_0()); }
	'GSSTmTcFormatTmTCFormat'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGSSTmTcFormatTmTCFormatKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group__1__Impl
	rule__GSSTmTcFormatTmTCFormat__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getNameAssignment_1()); }
	(rule__GSSTmTcFormatTmTCFormat__NameAssignment_1)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group__2__Impl
	rule__GSSTmTcFormatTmTCFormat__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group__3__Impl
	rule__GSSTmTcFormatTmTCFormat__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()); }
	(rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group__4__Impl
	rule__GSSTmTcFormatTmTCFormat__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__0__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__1__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__2__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriAssignment_3_0_2()); }
	(rule__GSSTmTcFormatTmTCFormat__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__0__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__1__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__2__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSTmTcFormatTmTCFormat__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__0__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolKeyword_3_2_0()); }
	'protocol'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__1__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_2_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__2__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolAssignment_3_2_2()); }
	(rule__GSSTmTcFormatTmTCFormat__ProtocolAssignment_3_2_2)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolAssignment_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_2_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_3__0__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_3_0()); }
	(rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__0)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAlternatives_3_3_1()); }
	(rule__GSSTmTcFormatTmTCFormat__Alternatives_3_3_1)*
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAlternatives_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__0__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeKeyword_3_3_0_0()); }
	'type'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeKeyword_3_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__1__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__2__Impl
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeAssignment_3_3_0_2()); }
	(rule__GSSTmTcFormatTmTCFormat__TypeAssignment_3_3_0_2)
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeAssignment_3_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__Group_3_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatCSField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__0__Impl
	rule__GSSTmTcFormatCSField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGSSTmTcFormatCSFieldKeyword_0()); }
	'GSSTmTcFormatCSField'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGSSTmTcFormatCSFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__1__Impl
	rule__GSSTmTcFormatCSField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__2__Impl
	rule__GSSTmTcFormatCSField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__3__Impl
	rule__GSSTmTcFormatCSField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__4__Impl
	rule__GSSTmTcFormatCSField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatCSField__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__5__Impl
	rule__GSSTmTcFormatCSField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__6__Impl
	rule__GSSTmTcFormatCSField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__7__Impl
	rule__GSSTmTcFormatCSField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__8__Impl
	rule__GSSTmTcFormatCSField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatCSField__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__9__Impl
	rule__GSSTmTcFormatCSField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__10__Impl
	rule__GSSTmTcFormatCSField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__11__Impl
	rule__GSSTmTcFormatCSField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__12__Impl
	rule__GSSTmTcFormatCSField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatCSField__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__13__Impl
	rule__GSSTmTcFormatCSField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__14__Impl
	rule__GSSTmTcFormatCSField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGroup_14()); }
	(rule__GSSTmTcFormatCSField__Group_14__0)?
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__15__Impl
	rule__GSSTmTcFormatCSField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__16__Impl
	rule__GSSTmTcFormatCSField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__17__Impl
	rule__GSSTmTcFormatCSField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeAssignment_17()); }
	(rule__GSSTmTcFormatCSField__TypeAssignment_17)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__18__Impl
	rule__GSSTmTcFormatCSField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__19__Impl
	rule__GSSTmTcFormatCSField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__20__Impl
	rule__GSSTmTcFormatCSField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__21__Impl
	rule__GSSTmTcFormatCSField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSTmTcFormatCSField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__22__Impl
	rule__GSSTmTcFormatCSField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__23__Impl
	rule__GSSTmTcFormatCSField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__24__Impl
	rule__GSSTmTcFormatCSField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__25__Impl
	rule__GSSTmTcFormatCSField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSTmTcFormatCSField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__26__Impl
	rule__GSSTmTcFormatCSField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__27__Impl
	rule__GSSTmTcFormatCSField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeAssignment_27()); }
	(rule__GSSTmTcFormatCSField__SizeAssignment_27)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__28__Impl
	rule__GSSTmTcFormatCSField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__GSSTmTcFormatCSField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__29__Impl
	rule__GSSTmTcFormatCSField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatCSField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group_14__0__Impl
	rule__GSSTmTcFormatCSField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group_14__1__Impl
	rule__GSSTmTcFormatCSField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group_14__2__Impl
	rule__GSSTmTcFormatCSField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSTmTcFormatCSField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatCSFormulaField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__0__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGSSTmTcFormatCSFormulaFieldKeyword_0()); }
	'GSSTmTcFormatCSFormulaField'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGSSTmTcFormatCSFormulaFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__1__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__2__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__3__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__4__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatCSFormulaField__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__5__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__6__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__7__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__8__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatCSFormulaField__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__9__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__10__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__11__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__12__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatCSFormulaField__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__13__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__14__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGroup_14()); }
	(rule__GSSTmTcFormatCSFormulaField__Group_14__0)?
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__15__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__16__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__17__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeAssignment_17()); }
	(rule__GSSTmTcFormatCSFormulaField__TypeAssignment_17)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__18__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__19__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__20__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__21__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSTmTcFormatCSFormulaField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__22__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__23__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__24__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__25__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSTmTcFormatCSFormulaField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__26__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__27__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeAssignment_27()); }
	(rule__GSSTmTcFormatCSFormulaField__SizeAssignment_27)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__28__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__GSSTmTcFormatCSFormulaField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__29__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaAssignment_29()); }
	(rule__GSSTmTcFormatCSFormulaField__FormulaAssignment_29)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__30__Impl
	rule__GSSTmTcFormatCSFormulaField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatCSFormulaField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group_14__0__Impl
	rule__GSSTmTcFormatCSFormulaField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group_14__1__Impl
	rule__GSSTmTcFormatCSFormulaField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group_14__2__Impl
	rule__GSSTmTcFormatCSFormulaField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSTmTcFormatCSFormulaField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatCSFormulaField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatVSField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__0__Impl
	rule__GSSTmTcFormatVSField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGSSTmTcFormatVSFieldKeyword_0()); }
	'GSSTmTcFormatVSField'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGSSTmTcFormatVSFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__1__Impl
	rule__GSSTmTcFormatVSField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__2__Impl
	rule__GSSTmTcFormatVSField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__3__Impl
	rule__GSSTmTcFormatVSField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__4__Impl
	rule__GSSTmTcFormatVSField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatVSField__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__5__Impl
	rule__GSSTmTcFormatVSField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__6__Impl
	rule__GSSTmTcFormatVSField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__7__Impl
	rule__GSSTmTcFormatVSField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__8__Impl
	rule__GSSTmTcFormatVSField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatVSField__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__9__Impl
	rule__GSSTmTcFormatVSField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__10__Impl
	rule__GSSTmTcFormatVSField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__11__Impl
	rule__GSSTmTcFormatVSField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__12__Impl
	rule__GSSTmTcFormatVSField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatVSField__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__13__Impl
	rule__GSSTmTcFormatVSField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__14__Impl
	rule__GSSTmTcFormatVSField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGroup_14()); }
	(rule__GSSTmTcFormatVSField__Group_14__0)?
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__15__Impl
	rule__GSSTmTcFormatVSField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__16__Impl
	rule__GSSTmTcFormatVSField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__17__Impl
	rule__GSSTmTcFormatVSField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeAssignment_17()); }
	(rule__GSSTmTcFormatVSField__TypeAssignment_17)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__18__Impl
	rule__GSSTmTcFormatVSField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__19__Impl
	rule__GSSTmTcFormatVSField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__20__Impl
	rule__GSSTmTcFormatVSField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__21__Impl
	rule__GSSTmTcFormatVSField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSTmTcFormatVSField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__22__Impl
	rule__GSSTmTcFormatVSField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__23__Impl
	rule__GSSTmTcFormatVSField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__24__Impl
	rule__GSSTmTcFormatVSField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__25__Impl
	rule__GSSTmTcFormatVSField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSTmTcFormatVSField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__26__Impl
	rule__GSSTmTcFormatVSField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__27__Impl
	rule__GSSTmTcFormatVSField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeAssignment_27()); }
	(rule__GSSTmTcFormatVSField__ConstSizeAssignment_27)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__28__Impl
	rule__GSSTmTcFormatVSField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__GSSTmTcFormatVSField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__29__Impl
	rule__GSSTmTcFormatVSField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeAssignment_29()); }
	(rule__GSSTmTcFormatVSField__MaxSizeAssignment_29)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__30__Impl
	rule__GSSTmTcFormatVSField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeAssignment_30()); }
	(rule__GSSTmTcFormatVSField__VariableSizeAssignment_30)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeAssignment_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__31__Impl
	rule__GSSTmTcFormatVSField__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getRightCurlyBracketKeyword_31()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getRightCurlyBracketKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group__32__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_32()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatVSField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group_14__0__Impl
	rule__GSSTmTcFormatVSField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group_14__1__Impl
	rule__GSSTmTcFormatVSField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group_14__2__Impl
	rule__GSSTmTcFormatVSField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSTmTcFormatVSField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVSField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatFDICField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__0__Impl
	rule__GSSTmTcFormatFDICField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGSSTmTcFormatFDICFieldKeyword_0()); }
	'GSSTmTcFormatFDICField'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGSSTmTcFormatFDICFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__1__Impl
	rule__GSSTmTcFormatFDICField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__2__Impl
	rule__GSSTmTcFormatFDICField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__3__Impl
	rule__GSSTmTcFormatFDICField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__4__Impl
	rule__GSSTmTcFormatFDICField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatFDICField__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__5__Impl
	rule__GSSTmTcFormatFDICField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__6__Impl
	rule__GSSTmTcFormatFDICField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__7__Impl
	rule__GSSTmTcFormatFDICField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__8__Impl
	rule__GSSTmTcFormatFDICField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatFDICField__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__9__Impl
	rule__GSSTmTcFormatFDICField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__10__Impl
	rule__GSSTmTcFormatFDICField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__11__Impl
	rule__GSSTmTcFormatFDICField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__12__Impl
	rule__GSSTmTcFormatFDICField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatFDICField__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__13__Impl
	rule__GSSTmTcFormatFDICField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__14__Impl
	rule__GSSTmTcFormatFDICField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGroup_14()); }
	(rule__GSSTmTcFormatFDICField__Group_14__0)?
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__15__Impl
	rule__GSSTmTcFormatFDICField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeKeyword_15()); }
	'checkType'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__16__Impl
	rule__GSSTmTcFormatFDICField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__17__Impl
	rule__GSSTmTcFormatFDICField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeAssignment_17()); }
	(rule__GSSTmTcFormatFDICField__CheckTypeAssignment_17)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__18__Impl
	rule__GSSTmTcFormatFDICField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__19__Impl
	rule__GSSTmTcFormatFDICField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__20__Impl
	rule__GSSTmTcFormatFDICField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__21__Impl
	rule__GSSTmTcFormatFDICField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSTmTcFormatFDICField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__22__Impl
	rule__GSSTmTcFormatFDICField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__23__Impl
	rule__GSSTmTcFormatFDICField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__24__Impl
	rule__GSSTmTcFormatFDICField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__25__Impl
	rule__GSSTmTcFormatFDICField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSTmTcFormatFDICField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__26__Impl
	rule__GSSTmTcFormatFDICField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__27__Impl
	rule__GSSTmTcFormatFDICField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeAssignment_27()); }
	(rule__GSSTmTcFormatFDICField__SizeAssignment_27)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__28__Impl
	rule__GSSTmTcFormatFDICField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetAssignment_28()); }
	(rule__GSSTmTcFormatFDICField__FloatingOffsetAssignment_28)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__29__Impl
	rule__GSSTmTcFormatFDICField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29()); }
	(rule__GSSTmTcFormatFDICField__SortedFieldsToCheckAssignment_29)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__30__Impl
	rule__GSSTmTcFormatFDICField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatFDICField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group_14__0__Impl
	rule__GSSTmTcFormatFDICField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group_14__1__Impl
	rule__GSSTmTcFormatFDICField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group_14__2__Impl
	rule__GSSTmTcFormatFDICField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSTmTcFormatFDICField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFDICField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatVRFieldSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__0__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGSSTmTcFormatVRFieldSizeKeyword_0()); }
	'GSSTmTcFormatVRFieldSize'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGSSTmTcFormatVRFieldSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__1__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__2__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__3__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__4__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatVRFieldSize__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__5__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__6__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__7__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__8__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatVRFieldSize__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__9__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__10__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__11__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__12__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatVRFieldSize__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__13__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__14__Impl
	rule__GSSTmTcFormatVRFieldSize__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVRFieldSize__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatAField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__0__Impl
	rule__GSSTmTcFormatAField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getGSSTmTcFormatAFieldKeyword_0()); }
	'GSSTmTcFormatAField'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getGSSTmTcFormatAFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__1__Impl
	rule__GSSTmTcFormatAField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__2__Impl
	rule__GSSTmTcFormatAField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__3__Impl
	rule__GSSTmTcFormatAField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__4__Impl
	rule__GSSTmTcFormatAField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatAField__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__5__Impl
	rule__GSSTmTcFormatAField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__6__Impl
	rule__GSSTmTcFormatAField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__7__Impl
	rule__GSSTmTcFormatAField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__8__Impl
	rule__GSSTmTcFormatAField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatAField__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__9__Impl
	rule__GSSTmTcFormatAField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__10__Impl
	rule__GSSTmTcFormatAField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__11__Impl
	rule__GSSTmTcFormatAField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__12__Impl
	rule__GSSTmTcFormatAField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatAField__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__13__Impl
	rule__GSSTmTcFormatAField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__14__Impl
	rule__GSSTmTcFormatAField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getGroup_14()); }
	(rule__GSSTmTcFormatAField__Group_14__0)?
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__15__Impl
	rule__GSSTmTcFormatAField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__16__Impl
	rule__GSSTmTcFormatAField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__17__Impl
	rule__GSSTmTcFormatAField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeAssignment_17()); }
	(rule__GSSTmTcFormatAField__TypeAssignment_17)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__18__Impl
	rule__GSSTmTcFormatAField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__19__Impl
	rule__GSSTmTcFormatAField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__20__Impl
	rule__GSSTmTcFormatAField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__21__Impl
	rule__GSSTmTcFormatAField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSTmTcFormatAField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__22__Impl
	rule__GSSTmTcFormatAField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__23__Impl
	rule__GSSTmTcFormatAField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__24__Impl
	rule__GSSTmTcFormatAField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__25__Impl
	rule__GSSTmTcFormatAField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSTmTcFormatAField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__26__Impl
	rule__GSSTmTcFormatAField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__27__Impl
	rule__GSSTmTcFormatAField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeAssignment_27()); }
	(rule__GSSTmTcFormatAField__SizeAssignment_27)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__28__Impl
	rule__GSSTmTcFormatAField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__GSSTmTcFormatAField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__29__Impl
	rule__GSSTmTcFormatAField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionAssignment_29()); }
	(rule__GSSTmTcFormatAField__ArrayDimensionAssignment_29)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__30__Impl
	rule__GSSTmTcFormatAField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatAField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group_14__0__Impl
	rule__GSSTmTcFormatAField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group_14__1__Impl
	rule__GSSTmTcFormatAField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group_14__2__Impl
	rule__GSSTmTcFormatAField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSTmTcFormatAField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatAIField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__0__Impl
	rule__GSSTmTcFormatAIField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGSSTmTcFormatAIFieldKeyword_0()); }
	'GSSTmTcFormatAIField'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGSSTmTcFormatAIFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__1__Impl
	rule__GSSTmTcFormatAIField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__2__Impl
	rule__GSSTmTcFormatAIField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__3__Impl
	rule__GSSTmTcFormatAIField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__4__Impl
	rule__GSSTmTcFormatAIField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidAssignment_4()); }
	(rule__GSSTmTcFormatAIField__FidAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__5__Impl
	rule__GSSTmTcFormatAIField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__6__Impl
	rule__GSSTmTcFormatAIField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__7__Impl
	rule__GSSTmTcFormatAIField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__8__Impl
	rule__GSSTmTcFormatAIField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidAssignment_8()); }
	(rule__GSSTmTcFormatAIField__PfidAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__9__Impl
	rule__GSSTmTcFormatAIField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__10__Impl
	rule__GSSTmTcFormatAIField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__11__Impl
	rule__GSSTmTcFormatAIField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__12__Impl
	rule__GSSTmTcFormatAIField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameAssignment_12()); }
	(rule__GSSTmTcFormatAIField__NameAssignment_12)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__13__Impl
	rule__GSSTmTcFormatAIField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__14__Impl
	rule__GSSTmTcFormatAIField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGroup_14()); }
	(rule__GSSTmTcFormatAIField__Group_14__0)?
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__15__Impl
	rule__GSSTmTcFormatAIField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__16__Impl
	rule__GSSTmTcFormatAIField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__17__Impl
	rule__GSSTmTcFormatAIField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeAssignment_17()); }
	(rule__GSSTmTcFormatAIField__TypeAssignment_17)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__18__Impl
	rule__GSSTmTcFormatAIField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__19__Impl
	rule__GSSTmTcFormatAIField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__20__Impl
	rule__GSSTmTcFormatAIField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__21__Impl
	rule__GSSTmTcFormatAIField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderAssignment_21()); }
	(rule__GSSTmTcFormatAIField__ByteOrderAssignment_21)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__22__Impl
	rule__GSSTmTcFormatAIField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__23__Impl
	rule__GSSTmTcFormatAIField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__24__Impl
	rule__GSSTmTcFormatAIField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__25__Impl
	rule__GSSTmTcFormatAIField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitAssignment_25()); }
	(rule__GSSTmTcFormatAIField__FirstBitAssignment_25)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__26__Impl
	rule__GSSTmTcFormatAIField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__27__Impl
	rule__GSSTmTcFormatAIField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeAssignment_27()); }
	(rule__GSSTmTcFormatAIField__SizeAssignment_27)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__28__Impl
	rule__GSSTmTcFormatAIField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetAssignment_28()); }
	(rule__GSSTmTcFormatAIField__LocalOffsetAssignment_28)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__29__Impl
	rule__GSSTmTcFormatAIField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefAssignment_29()); }
	(rule__GSSTmTcFormatAIField__ArrayRefAssignment_29)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__30__Impl
	rule__GSSTmTcFormatAIField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatAIField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group_14__0__Impl
	rule__GSSTmTcFormatAIField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group_14__1__Impl
	rule__GSSTmTcFormatAIField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group_14__2__Impl
	rule__GSSTmTcFormatAIField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__GSSTmTcFormatAIField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatAIField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__0__Impl
	rule__GSSTmTcFormatSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getGSSTmTcFormatSizeKeyword_0()); }
	'GSSTmTcFormatSize'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getGSSTmTcFormatSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__1__Impl
	rule__GSSTmTcFormatSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__2__Impl
	rule__GSSTmTcFormatSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__3__Impl
	rule__GSSTmTcFormatSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__4__Impl
	rule__GSSTmTcFormatSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesAssignment_4()); }
	(rule__GSSTmTcFormatSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__5__Impl
	rule__GSSTmTcFormatSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__6__Impl
	rule__GSSTmTcFormatSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__7__Impl
	rule__GSSTmTcFormatSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__8__Impl
	rule__GSSTmTcFormatSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsAssignment_8()); }
	(rule__GSSTmTcFormatSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__9__Impl
	rule__GSSTmTcFormatSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__10__Impl
	rule__GSSTmTcFormatSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatGlobalOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__0__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGSSTmTcFormatGlobalOffsetKeyword_0()); }
	'GSSTmTcFormatGlobalOffset'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGSSTmTcFormatGlobalOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__1__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__2__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__3__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__4__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesAssignment_4()); }
	(rule__GSSTmTcFormatGlobalOffset__BytesAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__5__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__6__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__7__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__8__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsAssignment_8()); }
	(rule__GSSTmTcFormatGlobalOffset__BitsAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__9__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__10__Impl
	rule__GSSTmTcFormatGlobalOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatGlobalOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatFormula__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__0__Impl
	rule__GSSTmTcFormatFormula__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getGSSTmTcFormatFormulaKeyword_0()); }
	'GSSTmTcFormatFormula'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getGSSTmTcFormatFormulaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__1__Impl
	rule__GSSTmTcFormatFormula__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__2__Impl
	rule__GSSTmTcFormatFormula__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeKeyword_2()); }
	'slope'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__3__Impl
	rule__GSSTmTcFormatFormula__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__4__Impl
	rule__GSSTmTcFormatFormula__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeAssignment_4()); }
	(rule__GSSTmTcFormatFormula__SlopeAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__5__Impl
	rule__GSSTmTcFormatFormula__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__6__Impl
	rule__GSSTmTcFormatFormula__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptKeyword_6()); }
	'intercept'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__7__Impl
	rule__GSSTmTcFormatFormula__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__8__Impl
	rule__GSSTmTcFormatFormula__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptAssignment_8()); }
	(rule__GSSTmTcFormatFormula__InterceptAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__9__Impl
	rule__GSSTmTcFormatFormula__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__10__Impl
	rule__GSSTmTcFormatFormula__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFormula__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatConstSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__0__Impl
	rule__GSSTmTcFormatConstSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getGSSTmTcFormatConstSizeKeyword_0()); }
	'GSSTmTcFormatConstSize'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getGSSTmTcFormatConstSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__1__Impl
	rule__GSSTmTcFormatConstSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__2__Impl
	rule__GSSTmTcFormatConstSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__3__Impl
	rule__GSSTmTcFormatConstSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__4__Impl
	rule__GSSTmTcFormatConstSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesAssignment_4()); }
	(rule__GSSTmTcFormatConstSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__5__Impl
	rule__GSSTmTcFormatConstSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__6__Impl
	rule__GSSTmTcFormatConstSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__7__Impl
	rule__GSSTmTcFormatConstSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__8__Impl
	rule__GSSTmTcFormatConstSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsAssignment_8()); }
	(rule__GSSTmTcFormatConstSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__9__Impl
	rule__GSSTmTcFormatConstSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__10__Impl
	rule__GSSTmTcFormatConstSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatConstSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatMaxSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__0__Impl
	rule__GSSTmTcFormatMaxSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGSSTmTcFormatMaxSizeKeyword_0()); }
	'GSSTmTcFormatMaxSize'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGSSTmTcFormatMaxSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__1__Impl
	rule__GSSTmTcFormatMaxSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__2__Impl
	rule__GSSTmTcFormatMaxSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__3__Impl
	rule__GSSTmTcFormatMaxSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__4__Impl
	rule__GSSTmTcFormatMaxSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesAssignment_4()); }
	(rule__GSSTmTcFormatMaxSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__5__Impl
	rule__GSSTmTcFormatMaxSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__6__Impl
	rule__GSSTmTcFormatMaxSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__7__Impl
	rule__GSSTmTcFormatMaxSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__8__Impl
	rule__GSSTmTcFormatMaxSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsAssignment_8()); }
	(rule__GSSTmTcFormatMaxSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__9__Impl
	rule__GSSTmTcFormatMaxSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__10__Impl
	rule__GSSTmTcFormatMaxSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatMaxSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatVariableSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__0__Impl
	rule__GSSTmTcFormatVariableSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGSSTmTcFormatVariableSizeKeyword_0()); }
	'GSSTmTcFormatVariableSize'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGSSTmTcFormatVariableSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__1__Impl
	rule__GSSTmTcFormatVariableSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__2__Impl
	rule__GSSTmTcFormatVariableSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__3__Impl
	rule__GSSTmTcFormatVariableSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__4__Impl
	rule__GSSTmTcFormatVariableSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefAssignment_4()); }
	(rule__GSSTmTcFormatVariableSize__FidRefAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__5__Impl
	rule__GSSTmTcFormatVariableSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__6__Impl
	rule__GSSTmTcFormatVariableSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitKeyword_6()); }
	'unit'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__7__Impl
	rule__GSSTmTcFormatVariableSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__8__Impl
	rule__GSSTmTcFormatVariableSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitAssignment_8()); }
	(rule__GSSTmTcFormatVariableSize__UnitAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__9__Impl
	rule__GSSTmTcFormatVariableSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__10__Impl
	rule__GSSTmTcFormatVariableSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGroup_10()); }
	(rule__GSSTmTcFormatVariableSize__Group_10__0)?
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__11__Impl
	rule__GSSTmTcFormatVariableSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatVariableSize__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group_10__0__Impl
	rule__GSSTmTcFormatVariableSize__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerKeyword_10_0()); }
	'power'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group_10__1__Impl
	rule__GSSTmTcFormatVariableSize__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group_10__2__Impl
	rule__GSSTmTcFormatVariableSize__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerAssignment_10_2()); }
	(rule__GSSTmTcFormatVariableSize__PowerAssignment_10_2)
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatVariableSize__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatFloatingOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__0__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGSSTmTcFormatFloatingOffsetKeyword_0()); }
	'GSSTmTcFormatFloatingOffset'
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGSSTmTcFormatFloatingOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__1__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__2__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__3__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__4__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefAssignment_4()); }
	(rule__GSSTmTcFormatFloatingOffset__FidRefAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__5__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__6__Impl
	rule__GSSTmTcFormatFloatingOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFloatingOffset__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatSortedFieldsToCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__0__Impl
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckAction_0()); }
	()
	{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__1__Impl
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckKeyword_1()); }
	'GSSTmTcFormatSortedFieldsToCheck'
	{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__2__Impl
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__3__Impl
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
		(rule__GSSTmTcFormatSortedFieldsToCheck__FieldToCheckAssignment_3)
		{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
	)
	(
		{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
		(rule__GSSTmTcFormatSortedFieldsToCheck__FieldToCheckAssignment_3)*
		{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__4__Impl
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatSortedFieldsToCheck__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatFieldToCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__0__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGSSTmTcFormatFieldToCheckKeyword_0()); }
	'GSSTmTcFormatFieldToCheck'
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGSSTmTcFormatFieldToCheckKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__1__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__2__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__3__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__4__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefAssignment_4()); }
	(rule__GSSTmTcFormatFieldToCheck__FidRefAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__5__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__6__Impl
	rule__GSSTmTcFormatFieldToCheck__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatFieldToCheck__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatArrayDimension__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__0__Impl
	rule__GSSTmTcFormatArrayDimension__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGSSTmTcFormatArrayDimensionKeyword_0()); }
	'GSSTmTcFormatArrayDimension'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGSSTmTcFormatArrayDimensionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__1__Impl
	rule__GSSTmTcFormatArrayDimension__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__2__Impl
	rule__GSSTmTcFormatArrayDimension__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__3__Impl
	rule__GSSTmTcFormatArrayDimension__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__4__Impl
	rule__GSSTmTcFormatArrayDimension__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefAssignment_4()); }
	(rule__GSSTmTcFormatArrayDimension__FidRefAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__5__Impl
	rule__GSSTmTcFormatArrayDimension__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__6__Impl
	rule__GSSTmTcFormatArrayDimension__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsKeyword_6()); }
	'maxItems'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__7__Impl
	rule__GSSTmTcFormatArrayDimension__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__8__Impl
	rule__GSSTmTcFormatArrayDimension__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsAssignment_8()); }
	(rule__GSSTmTcFormatArrayDimension__MaxItemsAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__9__Impl
	rule__GSSTmTcFormatArrayDimension__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__10__Impl
	rule__GSSTmTcFormatArrayDimension__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayDimension__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatLocalOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__0__Impl
	rule__GSSTmTcFormatLocalOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGSSTmTcFormatLocalOffsetKeyword_0()); }
	'GSSTmTcFormatLocalOffset'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGSSTmTcFormatLocalOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__1__Impl
	rule__GSSTmTcFormatLocalOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__2__Impl
	rule__GSSTmTcFormatLocalOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__3__Impl
	rule__GSSTmTcFormatLocalOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__4__Impl
	rule__GSSTmTcFormatLocalOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesAssignment_4()); }
	(rule__GSSTmTcFormatLocalOffset__BytesAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__5__Impl
	rule__GSSTmTcFormatLocalOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__6__Impl
	rule__GSSTmTcFormatLocalOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__7__Impl
	rule__GSSTmTcFormatLocalOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__8__Impl
	rule__GSSTmTcFormatLocalOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsAssignment_8()); }
	(rule__GSSTmTcFormatLocalOffset__BitsAssignment_8)
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__9__Impl
	rule__GSSTmTcFormatLocalOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__10__Impl
	rule__GSSTmTcFormatLocalOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatLocalOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatArrayRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__0__Impl
	rule__GSSTmTcFormatArrayRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getGSSTmTcFormatArrayRefKeyword_0()); }
	'GSSTmTcFormatArrayRef'
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getGSSTmTcFormatArrayRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__1__Impl
	rule__GSSTmTcFormatArrayRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__2__Impl
	rule__GSSTmTcFormatArrayRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__3__Impl
	rule__GSSTmTcFormatArrayRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__4__Impl
	rule__GSSTmTcFormatArrayRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefAssignment_4()); }
	(rule__GSSTmTcFormatArrayRef__FidRefAssignment_4)
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__5__Impl
	rule__GSSTmTcFormatArrayRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__6__Impl
	rule__GSSTmTcFormatArrayRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatArrayRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_7()); }
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


rule__REAL__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group__0__Impl
	rule__REAL__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group__1__Impl
	rule__REAL__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getGroup_1()); }
	(rule__REAL__Group_1__0)
	{ after(grammarAccess.getREALAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getGroup_2()); }
	(rule__REAL__Group_2__0)?
	{ after(grammarAccess.getREALAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group_1__0__Impl
	rule__REAL__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); }
	RULE_INT
	{ after(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group_1__1__Impl
	rule__REAL__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getFullStopKeyword_1_1()); }
	'.'
	{ after(grammarAccess.getREALAccess().getFullStopKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); }
	RULE_INT
	{ after(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group_2__0__Impl
	rule__REAL__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getEKeyword_2_0()); }
	'e'
	{ after(grammarAccess.getREALAccess().getEKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group_2__1__Impl
	rule__REAL__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); }
	('-')?
	{ after(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__REAL__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); }
	RULE_INT
	{ after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
	}
:
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_0()); }
					(rule__GSSTmTcFormatTmTCFormat__Group_3_0__0)
					{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_1()); }
					(rule__GSSTmTcFormatTmTCFormat__Group_3_1__0)
					{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_2()); }
					(rule__GSSTmTcFormatTmTCFormat__Group_3_2__0)
					{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_3()); }
					(rule__GSSTmTcFormatTmTCFormat__Group_3_3__0)
					{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGroup_3_3()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__Impl
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__Impl
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__Impl
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTmTcFormatTmTCFormat__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSTmTcFormatTmTCFormatParserRuleCall_1_0()); }
		ruleGSSTmTcFormatTmTCFormat
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSTmTcFormatTmTCFormatParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSModelFileImport__ImportURIAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__ProtocolAssignment_3_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__TypeAssignment_3_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeGSSTmTcFormatTmTCFormatTypeEnumRuleCall_3_3_0_2_0()); }
		ruleGSSTmTcFormatTmTCFormatType
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeGSSTmTcFormatTmTCFormatTypeEnumRuleCall_3_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__CSFieldAssignment_3_3_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0()); }
		ruleGSSTmTcFormatCSField
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__CSFormulaFieldAssignment_3_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0()); }
		ruleGSSTmTcFormatCSFormulaField
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__VSFieldAssignment_3_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0()); }
		ruleGSSTmTcFormatVSField
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__FDICFieldAssignment_3_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0()); }
		ruleGSSTmTcFormatFDICField
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__VRFieldSizeAssignment_3_3_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0()); }
		ruleGSSTmTcFormatVRFieldSize
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__AFieldAssignment_3_3_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0()); }
		ruleGSSTmTcFormatAField
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatTmTCFormat__AIFieldAssignment_3_3_1_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0()); }
		ruleGSSTmTcFormatAIField
		{ after(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSTmTcFormatFieldType
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSTmTcFormatFieldByteOrder
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSTmTcFormatSFieldFirstBit
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
		ruleGSSTmTcFormatSize
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleGSSTmTcFormatGlobalOffset
		{ after(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSTmTcFormatFieldType
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSTmTcFormatFieldByteOrder
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSTmTcFormatSFieldFirstBit
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
		ruleGSSTmTcFormatSize
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleGSSTmTcFormatGlobalOffset
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatCSFormulaField__FormulaAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaGSSTmTcFormatFormulaParserRuleCall_29_0()); }
		ruleGSSTmTcFormatFormula
		{ after(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaGSSTmTcFormatFormulaParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSTmTcFormatFieldType
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSTmTcFormatFieldByteOrder
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSTmTcFormatSFieldFirstBit
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__ConstSizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0()); }
		ruleGSSTmTcFormatConstSize
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleGSSTmTcFormatGlobalOffset
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__MaxSizeAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_29_0()); }
		ruleGSSTmTcFormatMaxSize
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVSField__VariableSizeAssignment_30
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_30_0()); }
		ruleGSSTmTcFormatVariableSize
		{ after(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_30_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__CheckTypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0()); }
		ruleGSSTmTcFormatCheckType
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSTmTcFormatFieldByteOrder
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSTmTcFormatSFieldFirstBit
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
		ruleGSSTmTcFormatSize
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__FloatingOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0()); }
		ruleGSSTmTcFormatFloatingOffset
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFDICField__SortedFieldsToCheckAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0()); }
		ruleGSSTmTcFormatSortedFieldsToCheck
		{ after(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVRFieldSize__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSTmTcFormatFieldType
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSTmTcFormatFieldByteOrder
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSTmTcFormatSFieldFirstBit
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
		ruleGSSTmTcFormatSize
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleGSSTmTcFormatGlobalOffset
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAField__ArrayDimensionAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0()); }
		ruleGSSTmTcFormatArrayDimension
		{ after(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameIDTerminalRuleCall_12_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameIDTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
		ruleGSSTmTcFormatFieldType
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleGSSTmTcFormatFieldByteOrder
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleGSSTmTcFormatSFieldFirstBit
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
		ruleGSSTmTcFormatSize
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__LocalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0()); }
		ruleGSSTmTcFormatLocalOffset
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatAIField__ArrayRefAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0()); }
		ruleGSSTmTcFormatArrayRef
		{ after(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatGlobalOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__SlopeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeREALParserRuleCall_4_0()); }
		ruleREAL
		{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeREALParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFormula__InterceptAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptREALParserRuleCall_8_0()); }
		ruleREAL
		{ after(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptREALParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatConstSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatMaxSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__UnitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitGSSTmTcFormatUnitEnumRuleCall_8_0()); }
		ruleGSSTmTcFormatUnit
		{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitGSSTmTcFormatUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatVariableSize__PowerAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0()); }
		ruleGSSTmTcFormatPower
		{ after(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFloatingOffset__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatSortedFieldsToCheck__FieldToCheckAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0()); }
		ruleGSSTmTcFormatFieldToCheck
		{ after(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatFieldToCheck__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayDimension__MaxItemsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatLocalOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTmTcFormatArrayRef__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0()); }
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
