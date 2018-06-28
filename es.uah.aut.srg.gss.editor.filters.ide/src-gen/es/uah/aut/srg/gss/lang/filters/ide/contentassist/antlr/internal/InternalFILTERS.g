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
grammar InternalFILTERS;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.filters.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.filters.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.filters.services.FILTERSGrammarAccess;

}
@parser::members {
	private FILTERSGrammarAccess grammarAccess;

	public void setGrammarAccess(FILTERSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSFilterFilter
entryRuleGSSFilterFilter
:
{ before(grammarAccess.getGSSFilterFilterRule()); }
	 ruleGSSFilterFilter
{ after(grammarAccess.getGSSFilterFilterRule()); } 
	 EOF 
;

// Rule GSSFilterFilter
ruleGSSFilterFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterFilterAccess().getAlternatives()); }
		(rule__GSSFilterFilter__Alternatives)
		{ after(grammarAccess.getGSSFilterFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterMaxtermFilter
entryRuleGSSFilterMaxtermFilter
:
{ before(grammarAccess.getGSSFilterMaxtermFilterRule()); }
	 ruleGSSFilterMaxtermFilter
{ after(grammarAccess.getGSSFilterMaxtermFilterRule()); } 
	 EOF 
;

// Rule GSSFilterMaxtermFilter
ruleGSSFilterMaxtermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup()); }
		(rule__GSSFilterMaxtermFilter__Group__0)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterMintermFilter
entryRuleGSSFilterMintermFilter
:
{ before(grammarAccess.getGSSFilterMintermFilterRule()); }
	 ruleGSSFilterMintermFilter
{ after(grammarAccess.getGSSFilterMintermFilterRule()); } 
	 EOF 
;

// Rule GSSFilterMintermFilter
ruleGSSFilterMintermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getGroup()); }
		(rule__GSSFilterMintermFilter__Group__0)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterBoolVar
entryRuleGSSFilterBoolVar
:
{ before(grammarAccess.getGSSFilterBoolVarRule()); }
	 ruleGSSFilterBoolVar
{ after(grammarAccess.getGSSFilterBoolVarRule()); } 
	 EOF 
;

// Rule GSSFilterBoolVar
ruleGSSFilterBoolVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getGroup()); }
		(rule__GSSFilterBoolVar__Group__0)
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterBoolVarFromArrayItem
entryRuleGSSFilterBoolVarFromArrayItem
:
{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemRule()); }
	 ruleGSSFilterBoolVarFromArrayItem
{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemRule()); } 
	 EOF 
;

// Rule GSSFilterBoolVarFromArrayItem
ruleGSSFilterBoolVarFromArrayItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGroup()); }
		(rule__GSSFilterBoolVarFromArrayItem__Group__0)
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterBoolVarFromGroupedArrayItem
entryRuleGSSFilterBoolVarFromGroupedArrayItem
:
{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule()); }
	 ruleGSSFilterBoolVarFromGroupedArrayItem
{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule()); } 
	 EOF 
;

// Rule GSSFilterBoolVarFromGroupedArrayItem
ruleGSSFilterBoolVarFromGroupedArrayItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroup()); }
		(rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0)
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterBoolVarFDIC
entryRuleGSSFilterBoolVarFDIC
:
{ before(grammarAccess.getGSSFilterBoolVarFDICRule()); }
	 ruleGSSFilterBoolVarFDIC
{ after(grammarAccess.getGSSFilterBoolVarFDICRule()); } 
	 EOF 
;

// Rule GSSFilterBoolVarFDIC
ruleGSSFilterBoolVarFDIC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getGroup()); }
		(rule__GSSFilterBoolVarFDIC__Group__0)
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterFieldRef
entryRuleGSSFilterFieldRef
:
{ before(grammarAccess.getGSSFilterFieldRefRule()); }
	 ruleGSSFilterFieldRef
{ after(grammarAccess.getGSSFilterFieldRefRule()); } 
	 EOF 
;

// Rule GSSFilterFieldRef
ruleGSSFilterFieldRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterFieldRefAccess().getGroup()); }
		(rule__GSSFilterFieldRef__Group__0)
		{ after(grammarAccess.getGSSFilterFieldRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterFieldOp
entryRuleGSSFilterFieldOp
:
{ before(grammarAccess.getGSSFilterFieldOpRule()); }
	 ruleGSSFilterFieldOp
{ after(grammarAccess.getGSSFilterFieldOpRule()); } 
	 EOF 
;

// Rule GSSFilterFieldOp
ruleGSSFilterFieldOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterFieldOpAccess().getGroup()); }
		(rule__GSSFilterFieldOp__Group__0)
		{ after(grammarAccess.getGSSFilterFieldOpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterConstant
entryRuleGSSFilterConstant
:
{ before(grammarAccess.getGSSFilterConstantRule()); }
	 ruleGSSFilterConstant
{ after(grammarAccess.getGSSFilterConstantRule()); } 
	 EOF 
;

// Rule GSSFilterConstant
ruleGSSFilterConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterConstantAccess().getGroup()); }
		(rule__GSSFilterConstant__Group__0)
		{ after(grammarAccess.getGSSFilterConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterSelect
entryRuleGSSFilterSelect
:
{ before(grammarAccess.getGSSFilterSelectRule()); }
	 ruleGSSFilterSelect
{ after(grammarAccess.getGSSFilterSelectRule()); } 
	 EOF 
;

// Rule GSSFilterSelect
ruleGSSFilterSelect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterSelectAccess().getGroup()); }
		(rule__GSSFilterSelect__Group__0)
		{ after(grammarAccess.getGSSFilterSelectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterSelectLine
entryRuleGSSFilterSelectLine
:
{ before(grammarAccess.getGSSFilterSelectLineRule()); }
	 ruleGSSFilterSelectLine
{ after(grammarAccess.getGSSFilterSelectLineRule()); } 
	 EOF 
;

// Rule GSSFilterSelectLine
ruleGSSFilterSelectLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterSelectLineAccess().getGroup()); }
		(rule__GSSFilterSelectLine__Group__0)
		{ after(grammarAccess.getGSSFilterSelectLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterAIFieldRef
entryRuleGSSFilterAIFieldRef
:
{ before(grammarAccess.getGSSFilterAIFieldRefRule()); }
	 ruleGSSFilterAIFieldRef
{ after(grammarAccess.getGSSFilterAIFieldRefRule()); } 
	 EOF 
;

// Rule GSSFilterAIFieldRef
ruleGSSFilterAIFieldRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getGroup()); }
		(rule__GSSFilterAIFieldRef__Group__0)
		{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterAIFieldRefs
entryRuleGSSFilterAIFieldRefs
:
{ before(grammarAccess.getGSSFilterAIFieldRefsRule()); }
	 ruleGSSFilterAIFieldRefs
{ after(grammarAccess.getGSSFilterAIFieldRefsRule()); } 
	 EOF 
;

// Rule GSSFilterAIFieldRefs
ruleGSSFilterAIFieldRefs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getGroup()); }
		(rule__GSSFilterAIFieldRefs__Group__0)
		{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterMaxterm
entryRuleGSSFilterMaxterm
:
{ before(grammarAccess.getGSSFilterMaxtermRule()); }
	 ruleGSSFilterMaxterm
{ after(grammarAccess.getGSSFilterMaxtermRule()); } 
	 EOF 
;

// Rule GSSFilterMaxterm
ruleGSSFilterMaxterm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterMaxtermAccess().getGroup()); }
		(rule__GSSFilterMaxterm__Group__0)
		{ after(grammarAccess.getGSSFilterMaxtermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterMinterm
entryRuleGSSFilterMinterm
:
{ before(grammarAccess.getGSSFilterMintermRule()); }
	 ruleGSSFilterMinterm
{ after(grammarAccess.getGSSFilterMintermRule()); } 
	 EOF 
;

// Rule GSSFilterMinterm
ruleGSSFilterMinterm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getGroup()); }
		(rule__GSSFilterMinterm__Group__0)
		{ after(grammarAccess.getGSSFilterMintermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSFilterBoolVarRef
entryRuleGSSFilterBoolVarRef
:
{ before(grammarAccess.getGSSFilterBoolVarRefRule()); }
	 ruleGSSFilterBoolVarRef
{ after(grammarAccess.getGSSFilterBoolVarRefRule()); } 
	 EOF 
;

// Rule GSSFilterBoolVarRef
ruleGSSFilterBoolVarRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getGroup()); }
		(rule__GSSFilterBoolVarRef__Group__0)
		{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getGroup()); }
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

// Rule GSSFilterConstantType
ruleGSSFilterConstantType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterConstantTypeAccess().getAlternatives()); }
		(rule__GSSFilterConstantType__Alternatives)
		{ after(grammarAccess.getGSSFilterConstantTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFilterOPType
ruleGSSFilterOPType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getAlternatives()); }
		(rule__GSSFilterOPType__Alternatives)
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSFilterSelectType
ruleGSSFilterSelectType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectTypeAccess().getAlternatives()); }
		(rule__GSSFilterSelectType__Alternatives)
		{ after(grammarAccess.getGSSFilterSelectTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMaxtermFilterParserRuleCall_0()); }
		ruleGSSFilterMaxtermFilter
		{ after(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMaxtermFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMintermFilterParserRuleCall_1()); }
		ruleGSSFilterMintermFilter
		{ after(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMintermFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Alternatives_3_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
		(rule__GSSFilterMaxtermFilter__BoolVarAssignment_3_1_5_0)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
		(rule__GSSFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
		(rule__GSSFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
		(rule__GSSFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Alternatives_3_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
		(rule__GSSFilterMintermFilter__BoolVarAssignment_3_1_5_0)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
		(rule__GSSFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
		(rule__GSSFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
		(rule__GSSFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Alternatives_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getConstantAssignment_16_0()); }
		(rule__GSSFilterBoolVar__ConstantAssignment_16_0)
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getConstantAssignment_16_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getSelectAssignment_16_1()); }
		(rule__GSSFilterBoolVar__SelectAssignment_16_1)
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getSelectAssignment_16_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineAssignment_16_2()); }
		(rule__GSSFilterBoolVar__SelectLineAssignment_16_2)
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineAssignment_16_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Alternatives_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantAssignment_16_0()); }
		(rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_16_0)
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantAssignment_16_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectAssignment_16_1()); }
		(rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_16_1)
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectAssignment_16_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_16_2()); }
		(rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_16_2)
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_16_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_20_0()); }
		(rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_20_0)
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_20_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_20_1()); }
		(rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_20_1)
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_20_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_20_2()); }
		(rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_20_2)
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_20_2()); }
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

rule__GSSFilterConstantType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); }
		('decimal')
		{ after(grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); }
		('hex')
		{ after(grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); }
		('binary')
		{ after(grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); }
		('char')
		{ after(grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); }
		('string')
		{ after(grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterOPType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); }
		('equal')
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); }
		('different')
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); }
		('bigger_than')
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); }
		('smaller_than')
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); }
		('bigger_or_equal')
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); }
		('smaller_or_equal')
		{ after(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); }
		('data')
		{ after(grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); }
		('size')
		{ after(grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); }
		('crc')
		{ after(grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); }
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


rule__GSSFilterMaxtermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__0__Impl
	rule__GSSFilterMaxtermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0()); }
	'GSSFilterMaxtermFilter'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__1__Impl
	rule__GSSFilterMaxtermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameAssignment_1()); }
	(rule__GSSFilterMaxtermFilter__NameAssignment_1)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__2__Impl
	rule__GSSFilterMaxtermFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__3__Impl
	rule__GSSFilterMaxtermFilter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3()); }
	(rule__GSSFilterMaxtermFilter__UnorderedGroup_3)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__4__Impl
	rule__GSSFilterMaxtermFilter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
		(rule__GSSFilterMaxtermFilter__MaxtermAssignment_4)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
		(rule__GSSFilterMaxtermFilter__MaxtermAssignment_4)*
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__5__Impl
	rule__GSSFilterMaxtermFilter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMaxtermFilter__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_0__0__Impl
	rule__GSSFilterMaxtermFilter__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_0__1__Impl
	rule__GSSFilterMaxtermFilter__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_0__2__Impl
	rule__GSSFilterMaxtermFilter__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_3_0_2()); }
	(rule__GSSFilterMaxtermFilter__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMaxtermFilter__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1__0__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_1_0()); }
	(rule__GSSFilterMaxtermFilter__Group_3_1_0__0)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1__1__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1()); }
	'formatFile'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1__2__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1__3__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3()); }
	(rule__GSSFilterMaxtermFilter__FormatFileAssignment_3_1_3)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1__4__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
		(rule__GSSFilterMaxtermFilter__Alternatives_3_1_5)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
		(rule__GSSFilterMaxtermFilter__Alternatives_3_1_5)*
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMaxtermFilter__Group_3_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1_0__0__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0()); }
	'version'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1_0__1__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1_0__2__Impl
	rule__GSSFilterMaxtermFilter__Group_3_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2()); }
	(rule__GSSFilterMaxtermFilter__VersionAssignment_3_1_0_2)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group_3_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group_3_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMintermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__0__Impl
	rule__GSSFilterMintermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0()); }
	'GSSFilterMintermFilter'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__1__Impl
	rule__GSSFilterMintermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getNameAssignment_1()); }
	(rule__GSSFilterMintermFilter__NameAssignment_1)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__2__Impl
	rule__GSSFilterMintermFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__3__Impl
	rule__GSSFilterMintermFilter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3()); }
	(rule__GSSFilterMintermFilter__UnorderedGroup_3)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__4__Impl
	rule__GSSFilterMintermFilter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_4()); }
		(rule__GSSFilterMintermFilter__MintermAssignment_4)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_4()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_4()); }
		(rule__GSSFilterMintermFilter__MintermAssignment_4)*
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__5__Impl
	rule__GSSFilterMintermFilter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMintermFilter__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_0__0__Impl
	rule__GSSFilterMintermFilter__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_0__1__Impl
	rule__GSSFilterMintermFilter__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_0__2__Impl
	rule__GSSFilterMintermFilter__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_3_0_2()); }
	(rule__GSSFilterMintermFilter__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMintermFilter__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1__0__Impl
	rule__GSSFilterMintermFilter__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_1_0()); }
	(rule__GSSFilterMintermFilter__Group_3_1_0__0)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1__1__Impl
	rule__GSSFilterMintermFilter__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_3_1_1()); }
	'formatFile'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1__2__Impl
	rule__GSSFilterMintermFilter__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1__3__Impl
	rule__GSSFilterMintermFilter__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_3_1_3()); }
	(rule__GSSFilterMintermFilter__FormatFileAssignment_3_1_3)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1__4__Impl
	rule__GSSFilterMintermFilter__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_4()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getAlternatives_3_1_5()); }
		(rule__GSSFilterMintermFilter__Alternatives_3_1_5)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getAlternatives_3_1_5()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getAlternatives_3_1_5()); }
		(rule__GSSFilterMintermFilter__Alternatives_3_1_5)*
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getAlternatives_3_1_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMintermFilter__Group_3_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1_0__0__Impl
	rule__GSSFilterMintermFilter__Group_3_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_3_1_0_0()); }
	'version'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_3_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1_0__1__Impl
	rule__GSSFilterMintermFilter__Group_3_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1_0__2__Impl
	rule__GSSFilterMintermFilter__Group_3_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_3_1_0_2()); }
	(rule__GSSFilterMintermFilter__VersionAssignment_3_1_0_2)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_3_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group_3_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group_3_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterBoolVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__0__Impl
	rule__GSSFilterBoolVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0()); }
	'GSSFilterBoolVar'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__1__Impl
	rule__GSSFilterBoolVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__2__Impl
	rule__GSSFilterBoolVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__3__Impl
	rule__GSSFilterBoolVar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__4__Impl
	rule__GSSFilterBoolVar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getIdAssignment_4()); }
	(rule__GSSFilterBoolVar__IdAssignment_4)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__5__Impl
	rule__GSSFilterBoolVar__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__6__Impl
	rule__GSSFilterBoolVar__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__7__Impl
	rule__GSSFilterBoolVar__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__8__Impl
	rule__GSSFilterBoolVar__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getNameAssignment_8()); }
	(rule__GSSFilterBoolVar__NameAssignment_8)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__9__Impl
	rule__GSSFilterBoolVar__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__10__Impl
	rule__GSSFilterBoolVar__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10()); }
	'constantType'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__11__Impl
	rule__GSSFilterBoolVar__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__12__Impl
	rule__GSSFilterBoolVar__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeAssignment_12()); }
	(rule__GSSFilterBoolVar__ConstantTypeAssignment_12)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__13__Impl
	rule__GSSFilterBoolVar__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__14__Impl
	rule__GSSFilterBoolVar__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_14()); }
	(rule__GSSFilterBoolVar__FieldRefAssignment_14)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__15__Impl
	rule__GSSFilterBoolVar__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_15()); }
	(rule__GSSFilterBoolVar__OpAssignment_15)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__16__Impl
	rule__GSSFilterBoolVar__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getAlternatives_16()); }
	(rule__GSSFilterBoolVar__Alternatives_16)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getAlternatives_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__17__Impl
	rule__GSSFilterBoolVar__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterBoolVarFromArrayItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0()); }
	'GSSFilterBoolVarFromArrayItem'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); }
	(rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); }
	(rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); }
	'constantType'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); }
	(rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_14()); }
	(rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_14)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_15()); }
	(rule__GSSFilterBoolVarFromArrayItem__OpAssignment_15)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAlternatives_16()); }
	(rule__GSSFilterBoolVarFromArrayItem__Alternatives_16)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAlternatives_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0()); }
	'GSSFilterBoolVarFromGroupedArrayItem'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); }
	'constantType'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); }
	'group'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_18()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_18)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_19()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_19)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_20()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_20)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_21()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterBoolVarFDIC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__0__Impl
	rule__GSSFilterBoolVarFDIC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0()); }
	'GSSFilterBoolVarFDIC'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__1__Impl
	rule__GSSFilterBoolVarFDIC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__2__Impl
	rule__GSSFilterBoolVarFDIC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__3__Impl
	rule__GSSFilterBoolVarFDIC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__4__Impl
	rule__GSSFilterBoolVarFDIC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdAssignment_4()); }
	(rule__GSSFilterBoolVarFDIC__IdAssignment_4)
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__5__Impl
	rule__GSSFilterBoolVarFDIC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__6__Impl
	rule__GSSFilterBoolVarFDIC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__7__Impl
	rule__GSSFilterBoolVarFDIC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__8__Impl
	rule__GSSFilterBoolVarFDIC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameAssignment_8()); }
	(rule__GSSFilterBoolVarFDIC__NameAssignment_8)
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__9__Impl
	rule__GSSFilterBoolVarFDIC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__10__Impl
	rule__GSSFilterBoolVarFDIC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_10()); }
	(rule__GSSFilterBoolVarFDIC__FieldRefAssignment_10)
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__11__Impl
	rule__GSSFilterBoolVarFDIC__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_11()); }
	(rule__GSSFilterBoolVarFDIC__OpAssignment_11)
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__12__Impl
	rule__GSSFilterBoolVarFDIC__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterFieldRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__0__Impl
	rule__GSSFilterFieldRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getGSSFilterFieldRefKeyword_0()); }
	'GSSFilterFieldRef'
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getGSSFilterFieldRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__1__Impl
	rule__GSSFilterFieldRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__2__Impl
	rule__GSSFilterFieldRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__3__Impl
	rule__GSSFilterFieldRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__4__Impl
	rule__GSSFilterFieldRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getNameAssignment_4()); }
	(rule__GSSFilterFieldRef__NameAssignment_4)
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__5__Impl
	rule__GSSFilterFieldRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__6__Impl
	rule__GSSFilterFieldRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFilterFieldRefAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterFieldOp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__0__Impl
	rule__GSSFilterFieldOp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0()); }
	'GSSFilterFieldOp'
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__1__Impl
	rule__GSSFilterFieldOp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__2__Impl
	rule__GSSFilterFieldOp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__3__Impl
	rule__GSSFilterFieldOp__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__4__Impl
	rule__GSSFilterFieldOp__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getTypeAssignment_4()); }
	(rule__GSSFilterFieldOp__TypeAssignment_4)
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__5__Impl
	rule__GSSFilterFieldOp__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__6__Impl
	rule__GSSFilterFieldOp__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterFieldOp__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterConstant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__0__Impl
	rule__GSSFilterConstant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0()); }
	'GSSFilterConstant'
	{ after(grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__1__Impl
	rule__GSSFilterConstant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__2__Impl
	rule__GSSFilterConstant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__3__Impl
	rule__GSSFilterConstant__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__4__Impl
	rule__GSSFilterConstant__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getValueAssignment_4()); }
	(rule__GSSFilterConstant__ValueAssignment_4)
	{ after(grammarAccess.getGSSFilterConstantAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__5__Impl
	rule__GSSFilterConstant__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__6__Impl
	rule__GSSFilterConstant__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getGroup_6()); }
	(rule__GSSFilterConstant__Group_6__0)?
	{ after(grammarAccess.getGSSFilterConstantAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__7__Impl
	rule__GSSFilterConstant__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSFilterConstantAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterConstant__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group_6__0__Impl
	rule__GSSFilterConstant__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0()); }
	'mask'
	{ after(grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group_6__1__Impl
	rule__GSSFilterConstant__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group_6__2__Impl
	rule__GSSFilterConstant__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getMaskAssignment_6_2()); }
	(rule__GSSFilterConstant__MaskAssignment_6_2)
	{ after(grammarAccess.getGSSFilterConstantAccess().getMaskAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterConstant__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelect__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__0__Impl
	rule__GSSFilterSelect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0()); }
	'GSSFilterSelect'
	{ after(grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__1__Impl
	rule__GSSFilterSelect__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__2__Impl
	rule__GSSFilterSelect__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2()); }
	'fromFile'
	{ after(grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__3__Impl
	rule__GSSFilterSelect__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__4__Impl
	rule__GSSFilterSelect__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getFromFileAssignment_4()); }
	(rule__GSSFilterSelect__FromFileAssignment_4)
	{ after(grammarAccess.getGSSFilterSelectAccess().getFromFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__5__Impl
	rule__GSSFilterSelect__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__6__Impl
	rule__GSSFilterSelect__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__7__Impl
	rule__GSSFilterSelect__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__8__Impl
	rule__GSSFilterSelect__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getTypeAssignment_8()); }
	(rule__GSSFilterSelect__TypeAssignment_8)
	{ after(grammarAccess.getGSSFilterSelectAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__9__Impl
	rule__GSSFilterSelect__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__10__Impl
	rule__GSSFilterSelect__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getGroup_10()); }
	(rule__GSSFilterSelect__Group_10__0)?
	{ after(grammarAccess.getGSSFilterSelectAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__11__Impl
	rule__GSSFilterSelect__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getGroup_11()); }
	(rule__GSSFilterSelect__Group_11__0)?
	{ after(grammarAccess.getGSSFilterSelectAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__12__Impl
	rule__GSSFilterSelect__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getGroup_12()); }
	(rule__GSSFilterSelect__Group_12__0)?
	{ after(grammarAccess.getGSSFilterSelectAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__13__Impl
	rule__GSSFilterSelect__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getGSSFilterSelectAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelect__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_10__0__Impl
	rule__GSSFilterSelect__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0()); }
	'offset'
	{ after(grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_10__1__Impl
	rule__GSSFilterSelect__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_10__2__Impl
	rule__GSSFilterSelect__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getOffsetAssignment_10_2()); }
	(rule__GSSFilterSelect__OffsetAssignment_10_2)
	{ after(grammarAccess.getGSSFilterSelectAccess().getOffsetAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelect__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_11__0__Impl
	rule__GSSFilterSelect__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0()); }
	'size'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_11__1__Impl
	rule__GSSFilterSelect__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_11__2__Impl
	rule__GSSFilterSelect__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSizeAssignment_11_2()); }
	(rule__GSSFilterSelect__SizeAssignment_11_2)
	{ after(grammarAccess.getGSSFilterSelectAccess().getSizeAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelect__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_12__0__Impl
	rule__GSSFilterSelect__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0()); }
	'mask'
	{ after(grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_12__1__Impl
	rule__GSSFilterSelect__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_12__2__Impl
	rule__GSSFilterSelect__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getMaskAssignment_12_2()); }
	(rule__GSSFilterSelect__MaskAssignment_12_2)
	{ after(grammarAccess.getGSSFilterSelectAccess().getMaskAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelect__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_12_3()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelectLine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__0__Impl
	rule__GSSFilterSelectLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0()); }
	'GSSFilterSelectLine'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__1__Impl
	rule__GSSFilterSelectLine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__2__Impl
	rule__GSSFilterSelectLine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2()); }
	'fromFile'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__3__Impl
	rule__GSSFilterSelectLine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__4__Impl
	rule__GSSFilterSelectLine__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getFromFileAssignment_4()); }
	(rule__GSSFilterSelectLine__FromFileAssignment_4)
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getFromFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__5__Impl
	rule__GSSFilterSelectLine__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__6__Impl
	rule__GSSFilterSelectLine__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6()); }
	'line'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__7__Impl
	rule__GSSFilterSelectLine__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__8__Impl
	rule__GSSFilterSelectLine__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getLineAssignment_8()); }
	(rule__GSSFilterSelectLine__LineAssignment_8)
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getLineAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__9__Impl
	rule__GSSFilterSelectLine__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__10__Impl
	rule__GSSFilterSelectLine__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getGroup_10()); }
	(rule__GSSFilterSelectLine__Group_10__0)?
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__11__Impl
	rule__GSSFilterSelectLine__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getGroup_11()); }
	(rule__GSSFilterSelectLine__Group_11__0)?
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__12__Impl
	rule__GSSFilterSelectLine__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getGroup_12()); }
	(rule__GSSFilterSelectLine__Group_12__0)?
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__13__Impl
	rule__GSSFilterSelectLine__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelectLine__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_10__0__Impl
	rule__GSSFilterSelectLine__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0()); }
	'leftTrim'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_10__1__Impl
	rule__GSSFilterSelectLine__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_10__2__Impl
	rule__GSSFilterSelectLine__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimAssignment_10_2()); }
	(rule__GSSFilterSelectLine__LeftTrimAssignment_10_2)
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelectLine__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_11__0__Impl
	rule__GSSFilterSelectLine__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0()); }
	'rightTrim'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_11__1__Impl
	rule__GSSFilterSelectLine__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_11__2__Impl
	rule__GSSFilterSelectLine__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimAssignment_11_2()); }
	(rule__GSSFilterSelectLine__RightTrimAssignment_11_2)
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterSelectLine__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_12__0__Impl
	rule__GSSFilterSelectLine__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0()); }
	'mask'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_12__1__Impl
	rule__GSSFilterSelectLine__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); }
	':='
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_12__2__Impl
	rule__GSSFilterSelectLine__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getMaskAssignment_12_2()); }
	(rule__GSSFilterSelectLine__MaskAssignment_12_2)
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getMaskAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterSelectLine__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_12_3()); }
	';'
	{ after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterAIFieldRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__0__Impl
	rule__GSSFilterAIFieldRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getGSSFilterAIFieldRefKeyword_0()); }
	'GSSFilterAIFieldRef'
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getGSSFilterAIFieldRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__1__Impl
	rule__GSSFilterAIFieldRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__2__Impl
	rule__GSSFilterAIFieldRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexKeyword_2()); }
	'index'
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__3__Impl
	rule__GSSFilterAIFieldRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__4__Impl
	rule__GSSFilterAIFieldRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexAssignment_4()); }
	(rule__GSSFilterAIFieldRef__IndexAssignment_4)
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__5__Impl
	rule__GSSFilterAIFieldRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__6__Impl
	rule__GSSFilterAIFieldRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterAIFieldRefs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__0__Impl
	rule__GSSFilterAIFieldRefs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getGSSFilterAIFieldRefsKeyword_0()); }
	'GSSFilterAIFieldRefs'
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getGSSFilterAIFieldRefsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__1__Impl
	rule__GSSFilterAIFieldRefs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__2__Impl
	rule__GSSFilterAIFieldRefs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__3__Impl
	rule__GSSFilterAIFieldRefs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__4__Impl
	rule__GSSFilterAIFieldRefs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getNameAssignment_4()); }
	(rule__GSSFilterAIFieldRefs__NameAssignment_4)
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__5__Impl
	rule__GSSFilterAIFieldRefs__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__6__Impl
	rule__GSSFilterAIFieldRefs__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterAIFieldRefs__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMaxterm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__0__Impl
	rule__GSSFilterMaxterm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0()); }
	'GSSFilterMaxterm'
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__1__Impl
	rule__GSSFilterMaxterm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__2__Impl
	rule__GSSFilterMaxterm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__3__Impl
	rule__GSSFilterMaxterm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__4__Impl
	rule__GSSFilterMaxterm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getIdAssignment_4()); }
	(rule__GSSFilterMaxterm__IdAssignment_4)
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__5__Impl
	rule__GSSFilterMaxterm__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__6__Impl
	rule__GSSFilterMaxterm__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
		(rule__GSSFilterMaxterm__BoolVarRefAssignment_6)
		{ after(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
		(rule__GSSFilterMaxterm__BoolVarRefAssignment_6)*
		{ after(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__7__Impl
	rule__GSSFilterMaxterm__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxterm__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMinterm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__0__Impl
	rule__GSSFilterMinterm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0()); }
	'GSSFilterMinterm'
	{ after(grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__1__Impl
	rule__GSSFilterMinterm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__2__Impl
	rule__GSSFilterMinterm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__3__Impl
	rule__GSSFilterMinterm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__4__Impl
	rule__GSSFilterMinterm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getIdAssignment_4()); }
	(rule__GSSFilterMinterm__IdAssignment_4)
	{ after(grammarAccess.getGSSFilterMintermAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__5__Impl
	rule__GSSFilterMinterm__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_5()); }
		(rule__GSSFilterMinterm__BoolVarRefAssignment_5)
		{ after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_5()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_5()); }
		(rule__GSSFilterMinterm__BoolVarRefAssignment_5)*
		{ after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__6__Impl
	rule__GSSFilterMinterm__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterBoolVarRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__0__Impl
	rule__GSSFilterBoolVarRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0()); }
	'GSSFilterBoolVarRef'
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__1__Impl
	rule__GSSFilterBoolVarRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__2__Impl
	rule__GSSFilterBoolVarRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__3__Impl
	rule__GSSFilterBoolVarRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__4__Impl
	rule__GSSFilterBoolVarRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefAssignment_4()); }
	(rule__GSSFilterBoolVarRef__IdRefAssignment_4)
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__5__Impl
	rule__GSSFilterBoolVarRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__6__Impl
	rule__GSSFilterBoolVarRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_7()); }
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


rule__GSSFilterMaxtermFilter__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());
	}
:
	rule__GSSFilterMaxtermFilter__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_0()); }
					(rule__GSSFilterMaxtermFilter__Group_3_0__0)
					{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_1()); }
					(rule__GSSFilterMaxtermFilter__Group_3_1__0)
					{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__UnorderedGroup_3__Impl
	rule__GSSFilterMaxtermFilter__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSFilterMintermFilter__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());
	}
:
	rule__GSSFilterMintermFilter__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_0()); }
					(rule__GSSFilterMintermFilter__Group_3_0__0)
					{ after(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_1()); }
					(rule__GSSFilterMintermFilter__Group_3_1__0)
					{ after(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__UnorderedGroup_3__Impl
	rule__GSSFilterMintermFilter__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSFilterFilterParserRuleCall_1_0()); }
		ruleGSSFilterFilter
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSFilterFilterParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__VersionAssignment_3_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__FormatFileAssignment_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileIDTerminalRuleCall_3_1_3_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileIDTerminalRuleCall_3_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__BoolVarAssignment_3_1_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0()); }
		ruleGSSFilterBoolVar
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
		ruleGSSFilterBoolVarFromArrayItem
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
		ruleGSSFilterBoolVarFromGroupedArrayItem
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
		ruleGSSFilterBoolVarFDIC
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__MaxtermAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_4_0()); }
		ruleGSSFilterMaxterm
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__VersionAssignment_3_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__FormatFileAssignment_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileIDTerminalRuleCall_3_1_3_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileIDTerminalRuleCall_3_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__BoolVarAssignment_3_1_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0()); }
		ruleGSSFilterBoolVar
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
		ruleGSSFilterBoolVarFromArrayItem
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
		ruleGSSFilterBoolVarFromGroupedArrayItem
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
		ruleGSSFilterBoolVarFDIC
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__MintermAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_4_0()); }
		ruleGSSFilterMinterm
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__ConstantTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); }
		ruleGSSFilterConstantType
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__FieldRefAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFilterFieldRefParserRuleCall_14_0()); }
		ruleGSSFilterFieldRef
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFilterFieldRefParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__OpAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_15_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__ConstantAssignment_16_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getConstantGSSFilterConstantParserRuleCall_16_0_0()); }
		ruleGSSFilterConstant
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getConstantGSSFilterConstantParserRuleCall_16_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__SelectAssignment_16_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getSelectGSSFilterSelectParserRuleCall_16_1_0()); }
		ruleGSSFilterSelect
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getSelectGSSFilterSelectParserRuleCall_16_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__SelectLineAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0()); }
		ruleGSSFilterSelectLine
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); }
		ruleGSSFilterConstantType
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFilterAIFieldRefParserRuleCall_14_0()); }
		ruleGSSFilterAIFieldRef
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFilterAIFieldRefParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__OpAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_15_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_16_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_16_0_0()); }
		ruleGSSFilterConstant
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_16_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_16_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_16_1_0()); }
		ruleGSSFilterSelect
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_16_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0()); }
		ruleGSSFilterSelectLine
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); }
		ruleGSSFilterConstantType
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupEStringParserRuleCall_16_0()); }
		ruleEString
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupEStringParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFilterAIFieldRefsParserRuleCall_18_0()); }
		ruleGSSFilterAIFieldRefs
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFilterAIFieldRefsParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_19_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_20_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_20_0_0()); }
		ruleGSSFilterConstant
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_20_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_20_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_20_1_0()); }
		ruleGSSFilterSelect
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_20_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_20_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_20_2_0()); }
		ruleGSSFilterSelectLine
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_20_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__FieldRefAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFilterFieldRefParserRuleCall_10_0()); }
		ruleGSSFilterFieldRef
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFilterFieldRefParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__OpAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_11_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldRef__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterFieldRefAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterFieldRefAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterFieldOp__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0()); }
		ruleGSSFilterOPType
		{ after(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterConstant__MaskAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getGSSFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__FromFileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectAccess().getTypeGSSFilterSelectTypeEnumRuleCall_8_0()); }
		ruleGSSFilterSelectType
		{ after(grammarAccess.getGSSFilterSelectAccess().getTypeGSSFilterSelectTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__OffsetAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__SizeAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelect__MaskAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getGSSFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__FromFileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__LineAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__LeftTrimAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__RightTrimAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterSelectLine__MaskAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getGSSFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRef__IndexAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterAIFieldRefs__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterAIFieldRefsAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterAIFieldRefsAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxterm__BoolVarRefAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); }
		ruleGSSFilterBoolVarRef
		{ after(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__BoolVarRefAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_5_0()); }
		ruleGSSFilterBoolVarRef
		{ after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarRef__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); }
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
