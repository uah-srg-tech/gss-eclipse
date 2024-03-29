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
grammar InternalFILTER;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.filter.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.filter.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.filter.services.FILTERGrammarAccess;

}
@parser::members {
	private FILTERGrammarAccess grammarAccess;

	public void setGrammarAccess(FILTERGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSFilterAbstractBoolVar
entryRuleGSSFilterAbstractBoolVar
:
{ before(grammarAccess.getGSSFilterAbstractBoolVarRule()); }
	 ruleGSSFilterAbstractBoolVar
{ after(grammarAccess.getGSSFilterAbstractBoolVarRule()); } 
	 EOF 
;

// Rule GSSFilterAbstractBoolVar
ruleGSSFilterAbstractBoolVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getAlternatives()); }
		(rule__GSSFilterAbstractBoolVar__Alternatives)
		{ after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getAlternatives()); }
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

// Entry rule entryRuleGSSFilterValue
entryRuleGSSFilterValue
:
{ before(grammarAccess.getGSSFilterValueRule()); }
	 ruleGSSFilterValue
{ after(grammarAccess.getGSSFilterValueRule()); } 
	 EOF 
;

// Rule GSSFilterValue
ruleGSSFilterValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSFilterValueAccess().getAlternatives()); }
		(rule__GSSFilterValue__Alternatives)
		{ after(grammarAccess.getGSSFilterValueAccess().getAlternatives()); }
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

rule__GSSFilterAbstractBoolVar__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarParserRuleCall_0()); }
		ruleGSSFilterBoolVar
		{ after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromArrayItemParserRuleCall_1()); }
		ruleGSSFilterBoolVarFromArrayItem
		{ after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromArrayItemParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2()); }
		ruleGSSFilterBoolVarFromGroupedArrayItem
		{ after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFDICParserRuleCall_3()); }
		ruleGSSFilterBoolVarFDIC
		{ after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFDICParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterValueAccess().getGSSFilterConstantParserRuleCall_0()); }
		ruleGSSFilterConstant
		{ after(grammarAccess.getGSSFilterValueAccess().getGSSFilterConstantParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectParserRuleCall_1()); }
		ruleGSSFilterSelect
		{ after(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectLineParserRuleCall_2()); }
		ruleGSSFilterSelectLine
		{ after(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectLineParserRuleCall_2()); }
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
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3()); }
	'uri'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3()); }
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
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_4()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_4()); }
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
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_5()); }
	(rule__GSSFilterMaxtermFilter__UriAssignment_5)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_5()); }
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
	rule__GSSFilterMaxtermFilter__Group__7
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

rule__GSSFilterMaxtermFilter__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__7__Impl
	rule__GSSFilterMaxtermFilter__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_7()); }
	'version'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__8__Impl
	rule__GSSFilterMaxtermFilter__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_8()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__9__Impl
	rule__GSSFilterMaxtermFilter__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_9()); }
	(rule__GSSFilterMaxtermFilter__VersionAssignment_9)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__10__Impl
	rule__GSSFilterMaxtermFilter__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__11__Impl
	rule__GSSFilterMaxtermFilter__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_11()); }
	'formatFile'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__12__Impl
	rule__GSSFilterMaxtermFilter__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_12()); }
	':='
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__13__Impl
	rule__GSSFilterMaxtermFilter__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_13()); }
	(rule__GSSFilterMaxtermFilter__FormatFileAssignment_13)
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__14__Impl
	rule__GSSFilterMaxtermFilter__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__15__Impl
	rule__GSSFilterMaxtermFilter__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); }
		(rule__GSSFilterMaxtermFilter__BoolVarAssignment_15)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); }
		(rule__GSSFilterMaxtermFilter__BoolVarAssignment_15)*
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__16__Impl
	rule__GSSFilterMaxtermFilter__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); }
		(rule__GSSFilterMaxtermFilter__MaxtermAssignment_16)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); }
		(rule__GSSFilterMaxtermFilter__MaxtermAssignment_16)*
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__17__Impl
	rule__GSSFilterMaxtermFilter__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMaxtermFilter__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_18()); }
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
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3()); }
	'uri'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3()); }
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
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_4()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_4()); }
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
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_5()); }
	(rule__GSSFilterMintermFilter__UriAssignment_5)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_5()); }
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
	rule__GSSFilterMintermFilter__Group__7
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

rule__GSSFilterMintermFilter__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__7__Impl
	rule__GSSFilterMintermFilter__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_7()); }
	'version'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__8__Impl
	rule__GSSFilterMintermFilter__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_8()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__9__Impl
	rule__GSSFilterMintermFilter__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_9()); }
	(rule__GSSFilterMintermFilter__VersionAssignment_9)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__10__Impl
	rule__GSSFilterMintermFilter__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__11__Impl
	rule__GSSFilterMintermFilter__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_11()); }
	'formatFile'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__12__Impl
	rule__GSSFilterMintermFilter__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_12()); }
	':='
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__13__Impl
	rule__GSSFilterMintermFilter__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_13()); }
	(rule__GSSFilterMintermFilter__FormatFileAssignment_13)
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__14__Impl
	rule__GSSFilterMintermFilter__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__15__Impl
	rule__GSSFilterMintermFilter__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); }
		(rule__GSSFilterMintermFilter__BoolVarAssignment_15)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); }
		(rule__GSSFilterMintermFilter__BoolVarAssignment_15)*
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__16__Impl
	rule__GSSFilterMintermFilter__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); }
		(rule__GSSFilterMintermFilter__MintermAssignment_16)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); }
		(rule__GSSFilterMintermFilter__MintermAssignment_16)*
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__17__Impl
	rule__GSSFilterMintermFilter__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMintermFilter__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_18()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefKeyword_14()); }
	'FieldRef'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefKeyword_14()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_15()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_16()); }
	(rule__GSSFilterBoolVar__FieldRefAssignment_16)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_16()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17()); }
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
	rule__GSSFilterBoolVar__Group__19
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
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_18()); }
	(rule__GSSFilterBoolVar__OpAssignment_18)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__19__Impl
	rule__GSSFilterBoolVar__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getValueAssignment_19()); }
	(rule__GSSFilterBoolVar__ValueAssignment_19)
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getValueAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__20__Impl
	rule__GSSFilterBoolVar__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVar__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); }
	'AIFieldRef'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); }
	(rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); }
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
	rule__GSSFilterBoolVarFromArrayItem__Group__19
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
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); }
	(rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getValueAssignment_19()); }
	(rule__GSSFilterBoolVarFromArrayItem__ValueAssignment_19)
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getValueAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl
	rule__GSSFilterBoolVarFromArrayItem__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); }
	'AIFieldRefs'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); }
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
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23
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
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getValueAssignment_23()); }
	(rule__GSSFilterBoolVarFromGroupedArrayItem__ValueAssignment_23)
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getValueAssignment_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefKeyword_10()); }
	'FieldRef'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefKeyword_10()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); }
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
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_12()); }
	(rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_12()); }
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
	rule__GSSFilterBoolVarFDIC__Group__14
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

rule__GSSFilterBoolVarFDIC__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__14__Impl
	rule__GSSFilterBoolVarFDIC__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_14()); }
	(rule__GSSFilterBoolVarFDIC__OpAssignment_14)
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__15__Impl
	rule__GSSFilterBoolVarFDIC__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterBoolVarFDIC__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_16()); }
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
	{ before(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5()); }
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
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); }
		(rule__GSSFilterMinterm__BoolVarRefAssignment_6)
		{ after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); }
	)
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); }
		(rule__GSSFilterMinterm__BoolVarRefAssignment_6)*
		{ after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); }
	)
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
	rule__GSSFilterMinterm__Group__8
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
	{ before(grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSFilterMinterm__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMinterm__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_8()); }
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
		{ before(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); }
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

rule__GSSFilterMaxtermFilter__UriAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__VersionAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_9_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__FormatFileAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); }
		(
			{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); }
		)
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__BoolVarAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); }
		ruleGSSFilterAbstractBoolVar
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMaxtermFilter__MaxtermAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_16_0()); }
		ruleGSSFilterMaxterm
		{ after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_16_0()); }
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

rule__GSSFilterMintermFilter__UriAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__VersionAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_9_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__FormatFileAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); }
		(
			{ before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); }
		)
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__BoolVarAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); }
		ruleGSSFilterAbstractBoolVar
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterMintermFilter__MintermAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_16_0()); }
		ruleGSSFilterMinterm
		{ after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_16_0()); }
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

rule__GSSFilterBoolVar__FieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__OpAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVar__ValueAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarAccess().getValueGSSFilterValueParserRuleCall_19_0()); }
		ruleGSSFilterValue
		{ after(grammarAccess.getGSSFilterBoolVarAccess().getValueGSSFilterValueParserRuleCall_19_0()); }
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

rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromArrayItem__ValueAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getValueGSSFilterValueParserRuleCall_19_0()); }
		ruleGSSFilterValue
		{ after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getValueGSSFilterValueParserRuleCall_19_0()); }
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
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldCrossReference_20_0()); }
		(
			{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); }
		)
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldCrossReference_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFromGroupedArrayItem__ValueAssignment_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getValueGSSFilterValueParserRuleCall_23_0()); }
		ruleGSSFilterValue
		{ after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getValueGSSFilterValueParserRuleCall_23_0()); }
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

rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSFilterBoolVarFDIC__OpAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0()); }
		ruleGSSFilterFieldOp
		{ after(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0()); }
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

rule__GSSFilterMinterm__BoolVarRefAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); }
		ruleGSSFilterBoolVarRef
		{ after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); }
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
