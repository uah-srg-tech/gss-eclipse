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
grammar InternalTEST_PROC;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.test_proc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.test_proc.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.test_proc.services.TEST_PROCGrammarAccess;

}
@parser::members {
	private TEST_PROCGrammarAccess grammarAccess;

	public void setGrammarAccess(TEST_PROCGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSTestProcTestProc
entryRuleGSSTestProcTestProc
:
{ before(grammarAccess.getGSSTestProcTestProcRule()); }
	 ruleGSSTestProcTestProc
{ after(grammarAccess.getGSSTestProcTestProcRule()); } 
	 EOF 
;

// Rule GSSTestProcTestProc
ruleGSSTestProcTestProc 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getGroup()); }
		(rule__GSSTestProcTestProc__Group__0)
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcStep
entryRuleGSSTestProcStep
:
{ before(grammarAccess.getGSSTestProcStepRule()); }
	 ruleGSSTestProcStep
{ after(grammarAccess.getGSSTestProcStepRule()); } 
	 EOF 
;

// Rule GSSTestProcStep
ruleGSSTestProcStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getGroup()); }
		(rule__GSSTestProcStep__Group__0)
		{ after(grammarAccess.getGSSTestProcStepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcInputs
entryRuleGSSTestProcInputs
:
{ before(grammarAccess.getGSSTestProcInputsRule()); }
	 ruleGSSTestProcInputs
{ after(grammarAccess.getGSSTestProcInputsRule()); } 
	 EOF 
;

// Rule GSSTestProcInputs
ruleGSSTestProcInputs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getGroup()); }
		(rule__GSSTestProcInputs__Group__0)
		{ after(grammarAccess.getGSSTestProcInputsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcOutputs
entryRuleGSSTestProcOutputs
:
{ before(grammarAccess.getGSSTestProcOutputsRule()); }
	 ruleGSSTestProcOutputs
{ after(grammarAccess.getGSSTestProcOutputsRule()); } 
	 EOF 
;

// Rule GSSTestProcOutputs
ruleGSSTestProcOutputs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getGroup()); }
		(rule__GSSTestProcOutputs__Group__0)
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcSpecialPackets
entryRuleGSSTestProcSpecialPackets
:
{ before(grammarAccess.getGSSTestProcSpecialPacketsRule()); }
	 ruleGSSTestProcSpecialPackets
{ after(grammarAccess.getGSSTestProcSpecialPacketsRule()); } 
	 EOF 
;

// Rule GSSTestProcSpecialPackets
ruleGSSTestProcSpecialPackets 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGroup()); }
		(rule__GSSTestProcSpecialPackets__Group__0)
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcConcurrentSteps
entryRuleGSSTestProcConcurrentSteps
:
{ before(grammarAccess.getGSSTestProcConcurrentStepsRule()); }
	 ruleGSSTestProcConcurrentSteps
{ after(grammarAccess.getGSSTestProcConcurrentStepsRule()); } 
	 EOF 
;

// Rule GSSTestProcConcurrentSteps
ruleGSSTestProcConcurrentSteps 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getGroup()); }
		(rule__GSSTestProcConcurrentSteps__Group__0)
		{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcInputLevel3
entryRuleGSSTestProcInputLevel3
:
{ before(grammarAccess.getGSSTestProcInputLevel3Rule()); }
	 ruleGSSTestProcInputLevel3
{ after(grammarAccess.getGSSTestProcInputLevel3Rule()); } 
	 EOF 
;

// Rule GSSTestProcInputLevel3
ruleGSSTestProcInputLevel3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup()); }
		(rule__GSSTestProcInputLevel3__Group__0)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcInputLevel2
entryRuleGSSTestProcInputLevel2
:
{ before(grammarAccess.getGSSTestProcInputLevel2Rule()); }
	 ruleGSSTestProcInputLevel2
{ after(grammarAccess.getGSSTestProcInputLevel2Rule()); } 
	 EOF 
;

// Rule GSSTestProcInputLevel2
ruleGSSTestProcInputLevel2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGroup()); }
		(rule__GSSTestProcInputLevel2__Group__0)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcInputLevel1
entryRuleGSSTestProcInputLevel1
:
{ before(grammarAccess.getGSSTestProcInputLevel1Rule()); }
	 ruleGSSTestProcInputLevel1
{ after(grammarAccess.getGSSTestProcInputLevel1Rule()); } 
	 EOF 
;

// Rule GSSTestProcInputLevel1
ruleGSSTestProcInputLevel1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getGroup()); }
		(rule__GSSTestProcInputLevel1__Group__0)
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcInputLevel0
entryRuleGSSTestProcInputLevel0
:
{ before(grammarAccess.getGSSTestProcInputLevel0Rule()); }
	 ruleGSSTestProcInputLevel0
{ after(grammarAccess.getGSSTestProcInputLevel0Rule()); } 
	 EOF 
;

// Rule GSSTestProcInputLevel0
ruleGSSTestProcInputLevel0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getGroup()); }
		(rule__GSSTestProcInputLevel0__Group__0)
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcOutputLevel3
entryRuleGSSTestProcOutputLevel3
:
{ before(grammarAccess.getGSSTestProcOutputLevel3Rule()); }
	 ruleGSSTestProcOutputLevel3
{ after(grammarAccess.getGSSTestProcOutputLevel3Rule()); } 
	 EOF 
;

// Rule GSSTestProcOutputLevel3
ruleGSSTestProcOutputLevel3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup()); }
		(rule__GSSTestProcOutputLevel3__Group__0)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcOutputLevel2
entryRuleGSSTestProcOutputLevel2
:
{ before(grammarAccess.getGSSTestProcOutputLevel2Rule()); }
	 ruleGSSTestProcOutputLevel2
{ after(grammarAccess.getGSSTestProcOutputLevel2Rule()); } 
	 EOF 
;

// Rule GSSTestProcOutputLevel2
ruleGSSTestProcOutputLevel2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup()); }
		(rule__GSSTestProcOutputLevel2__Group__0)
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcOutputLevel1
entryRuleGSSTestProcOutputLevel1
:
{ before(grammarAccess.getGSSTestProcOutputLevel1Rule()); }
	 ruleGSSTestProcOutputLevel1
{ after(grammarAccess.getGSSTestProcOutputLevel1Rule()); } 
	 EOF 
;

// Rule GSSTestProcOutputLevel1
ruleGSSTestProcOutputLevel1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup()); }
		(rule__GSSTestProcOutputLevel1__Group__0)
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcOutputLevel0
entryRuleGSSTestProcOutputLevel0
:
{ before(grammarAccess.getGSSTestProcOutputLevel0Rule()); }
	 ruleGSSTestProcOutputLevel0
{ after(grammarAccess.getGSSTestProcOutputLevel0Rule()); } 
	 EOF 
;

// Rule GSSTestProcOutputLevel0
ruleGSSTestProcOutputLevel0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup()); }
		(rule__GSSTestProcOutputLevel0__Group__0)
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcLevel3Filter
entryRuleGSSTestProcLevel3Filter
:
{ before(grammarAccess.getGSSTestProcLevel3FilterRule()); }
	 ruleGSSTestProcLevel3Filter
{ after(grammarAccess.getGSSTestProcLevel3FilterRule()); } 
	 EOF 
;

// Rule GSSTestProcLevel3Filter
ruleGSSTestProcLevel3Filter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getGroup()); }
		(rule__GSSTestProcLevel3Filter__Group__0)
		{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcLevel2Filter
entryRuleGSSTestProcLevel2Filter
:
{ before(grammarAccess.getGSSTestProcLevel2FilterRule()); }
	 ruleGSSTestProcLevel2Filter
{ after(grammarAccess.getGSSTestProcLevel2FilterRule()); } 
	 EOF 
;

// Rule GSSTestProcLevel2Filter
ruleGSSTestProcLevel2Filter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getGroup()); }
		(rule__GSSTestProcLevel2Filter__Group__0)
		{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcLevel1Filter
entryRuleGSSTestProcLevel1Filter
:
{ before(grammarAccess.getGSSTestProcLevel1FilterRule()); }
	 ruleGSSTestProcLevel1Filter
{ after(grammarAccess.getGSSTestProcLevel1FilterRule()); } 
	 EOF 
;

// Rule GSSTestProcLevel1Filter
ruleGSSTestProcLevel1Filter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getGroup()); }
		(rule__GSSTestProcLevel1Filter__Group__0)
		{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcLevel0Filter
entryRuleGSSTestProcLevel0Filter
:
{ before(grammarAccess.getGSSTestProcLevel0FilterRule()); }
	 ruleGSSTestProcLevel0Filter
{ after(grammarAccess.getGSSTestProcLevel0FilterRule()); } 
	 EOF 
;

// Rule GSSTestProcLevel0Filter
ruleGSSTestProcLevel0Filter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getGroup()); }
		(rule__GSSTestProcLevel0Filter__Group__0)
		{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcEnable
entryRuleGSSTestProcEnable
:
{ before(grammarAccess.getGSSTestProcEnableRule()); }
	 ruleGSSTestProcEnable
{ after(grammarAccess.getGSSTestProcEnableRule()); } 
	 EOF 
;

// Rule GSSTestProcEnable
ruleGSSTestProcEnable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcEnableAccess().getGroup()); }
		(rule__GSSTestProcEnable__Group__0)
		{ after(grammarAccess.getGSSTestProcEnableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcDisable
entryRuleGSSTestProcDisable
:
{ before(grammarAccess.getGSSTestProcDisableRule()); }
	 ruleGSSTestProcDisable
{ after(grammarAccess.getGSSTestProcDisableRule()); } 
	 EOF 
;

// Rule GSSTestProcDisable
ruleGSSTestProcDisable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcDisableAccess().getGroup()); }
		(rule__GSSTestProcDisable__Group__0)
		{ after(grammarAccess.getGSSTestProcDisableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcEnablePrint
entryRuleGSSTestProcEnablePrint
:
{ before(grammarAccess.getGSSTestProcEnablePrintRule()); }
	 ruleGSSTestProcEnablePrint
{ after(grammarAccess.getGSSTestProcEnablePrintRule()); } 
	 EOF 
;

// Rule GSSTestProcEnablePrint
ruleGSSTestProcEnablePrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getGroup()); }
		(rule__GSSTestProcEnablePrint__Group__0)
		{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcDisablePrint
entryRuleGSSTestProcDisablePrint
:
{ before(grammarAccess.getGSSTestProcDisablePrintRule()); }
	 ruleGSSTestProcDisablePrint
{ after(grammarAccess.getGSSTestProcDisablePrintRule()); } 
	 EOF 
;

// Rule GSSTestProcDisablePrint
ruleGSSTestProcDisablePrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getGroup()); }
		(rule__GSSTestProcDisablePrint__Group__0)
		{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcNextStep
entryRuleGSSTestProcNextStep
:
{ before(grammarAccess.getGSSTestProcNextStepRule()); }
	 ruleGSSTestProcNextStep
{ after(grammarAccess.getGSSTestProcNextStepRule()); } 
	 EOF 
;

// Rule GSSTestProcNextStep
ruleGSSTestProcNextStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcNextStepAccess().getGroup()); }
		(rule__GSSTestProcNextStep__Group__0)
		{ after(grammarAccess.getGSSTestProcNextStepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTestProcConcurrentStep
entryRuleGSSTestProcConcurrentStep
:
{ before(grammarAccess.getGSSTestProcConcurrentStepRule()); }
	 ruleGSSTestProcConcurrentStep
{ after(grammarAccess.getGSSTestProcConcurrentStepRule()); } 
	 EOF 
;

// Rule GSSTestProcConcurrentStep
ruleGSSTestProcConcurrentStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getGroup()); }
		(rule__GSSTestProcConcurrentStep__Group__0)
		{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getGroup()); }
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

// Rule GSSTestProcMode
ruleGSSTestProcMode
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcModeAccess().getAlternatives()); }
		(rule__GSSTestProcMode__Alternatives)
		{ after(grammarAccess.getGSSTestProcModeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTestProcUnit
ruleGSSTestProcUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcUnitAccess().getAlternatives()); }
		(rule__GSSTestProcUnit__Alternatives)
		{ after(grammarAccess.getGSSTestProcUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTestProcCheckmode
ruleGSSTestProcCheckmode
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcCheckmodeAccess().getAlternatives()); }
		(rule__GSSTestProcCheckmode__Alternatives)
		{ after(grammarAccess.getGSSTestProcCheckmodeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSTestProcYesNo
ruleGSSTestProcYesNo
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcYesNoAccess().getAlternatives()); }
		(rule__GSSTestProcYesNo__Alternatives)
		{ after(grammarAccess.getGSSTestProcYesNoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_3Assignment_3_0()); }
		(rule__GSSTestProcInputs__Input_level_3Assignment_3_0)
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_3Assignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_2Assignment_3_1()); }
		(rule__GSSTestProcInputs__Input_level_2Assignment_3_1)
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_2Assignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_1Assignment_3_2()); }
		(rule__GSSTestProcInputs__Input_level_1Assignment_3_2)
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_1Assignment_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_0Assignment_3_3()); }
		(rule__GSSTestProcInputs__Input_level_0Assignment_3_3)
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_0Assignment_3_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Alternatives_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_3Assignment_14_0()); }
		(rule__GSSTestProcOutputs__Output_level_3Assignment_14_0)
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_3Assignment_14_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_2Assignment_14_1()); }
		(rule__GSSTestProcOutputs__Output_level_2Assignment_14_1)
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_2Assignment_14_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_1Assignment_14_2()); }
		(rule__GSSTestProcOutputs__Output_level_1Assignment_14_2)
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_1Assignment_14_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_0Assignment_14_3()); }
		(rule__GSSTestProcOutputs__Output_level_0Assignment_14_3)
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_0Assignment_14_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnableAssignment_3_0()); }
		(rule__GSSTestProcSpecialPackets__EnableAssignment_3_0)
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnableAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisableAssignment_3_1()); }
		(rule__GSSTestProcSpecialPackets__DisableAssignment_3_1)
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisableAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnable_printAssignment_3_2()); }
		(rule__GSSTestProcSpecialPackets__Enable_printAssignment_3_2)
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnable_printAssignment_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisable_printAssignment_3_3()); }
		(rule__GSSTestProcSpecialPackets__Disable_printAssignment_3_3)
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisable_printAssignment_3_3()); }
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

rule__GSSTestProcMode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcModeAccess().getContinuousEnumLiteralDeclaration_0()); }
		('continuous')
		{ after(grammarAccess.getGSSTestProcModeAccess().getContinuousEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcModeAccess().getManualEnumLiteralDeclaration_1()); }
		('manual')
		{ after(grammarAccess.getGSSTestProcModeAccess().getManualEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcModeAccess().getConcurrentEnumLiteralDeclaration_2()); }
		('concurrent')
		{ after(grammarAccess.getGSSTestProcModeAccess().getConcurrentEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
		('miliseconds')
		{ after(grammarAccess.getGSSTestProcUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
		('seconds')
		{ after(grammarAccess.getGSSTestProcUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcCheckmode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcCheckmodeAccess().getAllEnumLiteralDeclaration_0()); }
		('all')
		{ after(grammarAccess.getGSSTestProcCheckmodeAccess().getAllEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1()); }
		('allunsorted')
		{ after(grammarAccess.getGSSTestProcCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcCheckmodeAccess().getAnyEnumLiteralDeclaration_2()); }
		('any')
		{ after(grammarAccess.getGSSTestProcCheckmodeAccess().getAnyEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcYesNo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcYesNoAccess().getYesEnumLiteralDeclaration_0()); }
		('yes')
		{ after(grammarAccess.getGSSTestProcYesNoAccess().getYesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSTestProcYesNoAccess().getNoEnumLiteralDeclaration_1()); }
		('no')
		{ after(grammarAccess.getGSSTestProcYesNoAccess().getNoEnumLiteralDeclaration_1()); }
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


rule__GSSTestProcTestProc__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__0__Impl
	rule__GSSTestProcTestProc__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getGSSTestProcTestProcKeyword_0()); }
	'GSSTestProcTestProc'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getGSSTestProcTestProcKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__1__Impl
	rule__GSSTestProcTestProc__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getNameAssignment_1()); }
	(rule__GSSTestProcTestProc__NameAssignment_1)
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__2__Impl
	rule__GSSTestProcTestProc__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__3__Impl
	rule__GSSTestProcTestProc__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3()); }
	(rule__GSSTestProcTestProc__UnorderedGroup_3)
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__4__Impl
	rule__GSSTestProcTestProc__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getStepAssignment_4()); }
		(rule__GSSTestProcTestProc__StepAssignment_4)
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getStepAssignment_4()); }
	)
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getStepAssignment_4()); }
		(rule__GSSTestProcTestProc__StepAssignment_4)*
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getStepAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__5__Impl
	rule__GSSTestProcTestProc__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcTestProc__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_0__0__Impl
	rule__GSSTestProcTestProc__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_0__1__Impl
	rule__GSSTestProcTestProc__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_0__2__Impl
	rule__GSSTestProcTestProc__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getUriAssignment_3_0_2()); }
	(rule__GSSTestProcTestProc__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcTestProc__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_1__0__Impl
	rule__GSSTestProcTestProc__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_1__1__Impl
	rule__GSSTestProcTestProc__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_1__2__Impl
	rule__GSSTestProcTestProc__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSTestProcTestProc__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcTestProcAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcStep__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__0__Impl
	rule__GSSTestProcStep__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getGSSTestProcStepKeyword_0()); }
	'GSSTestProcStep'
	{ after(grammarAccess.getGSSTestProcStepAccess().getGSSTestProcStepKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__1__Impl
	rule__GSSTestProcStep__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcStepAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__2__Impl
	rule__GSSTestProcStep__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcStepAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__3__Impl
	rule__GSSTestProcStep__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__4__Impl
	rule__GSSTestProcStep__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getNameAssignment_4()); }
	(rule__GSSTestProcStep__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcStepAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__5__Impl
	rule__GSSTestProcStep__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__6__Impl
	rule__GSSTestProcStep__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSTestProcStepAccess().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__7__Impl
	rule__GSSTestProcStep__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__8__Impl
	rule__GSSTestProcStep__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getIdAssignment_8()); }
	(rule__GSSTestProcStep__IdAssignment_8)
	{ after(grammarAccess.getGSSTestProcStepAccess().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__9__Impl
	rule__GSSTestProcStep__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__10__Impl
	rule__GSSTestProcStep__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getGroup_10()); }
	(rule__GSSTestProcStep__Group_10__0)?
	{ after(grammarAccess.getGSSTestProcStepAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__11__Impl
	rule__GSSTestProcStep__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getGroup_11()); }
	(rule__GSSTestProcStep__Group_11__0)?
	{ after(grammarAccess.getGSSTestProcStepAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__12__Impl
	rule__GSSTestProcStep__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getModeKeyword_12()); }
	'mode'
	{ after(grammarAccess.getGSSTestProcStepAccess().getModeKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__13__Impl
	rule__GSSTestProcStep__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_13()); }
	':='
	{ after(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__14__Impl
	rule__GSSTestProcStep__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getModeAssignment_14()); }
	(rule__GSSTestProcStep__ModeAssignment_14)
	{ after(grammarAccess.getGSSTestProcStepAccess().getModeAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__15__Impl
	rule__GSSTestProcStep__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__16__Impl
	rule__GSSTestProcStep__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getGroup_16()); }
	(rule__GSSTestProcStep__Group_16__0)?
	{ after(grammarAccess.getGSSTestProcStepAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__17__Impl
	rule__GSSTestProcStep__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getInputsAssignment_17()); }
	(rule__GSSTestProcStep__InputsAssignment_17)
	{ after(grammarAccess.getGSSTestProcStepAccess().getInputsAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__18__Impl
	rule__GSSTestProcStep__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getOutputsAssignment_18()); }
	(rule__GSSTestProcStep__OutputsAssignment_18)?
	{ after(grammarAccess.getGSSTestProcStepAccess().getOutputsAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__19__Impl
	rule__GSSTestProcStep__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSpecialPacketsAssignment_19()); }
	(rule__GSSTestProcStep__SpecialPacketsAssignment_19)?
	{ after(grammarAccess.getGSSTestProcStepAccess().getSpecialPacketsAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__20__Impl
	rule__GSSTestProcStep__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getConcurrent_stepsAssignment_20()); }
	(rule__GSSTestProcStep__Concurrent_stepsAssignment_20)?
	{ after(grammarAccess.getGSSTestProcStepAccess().getConcurrent_stepsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__21__Impl
	rule__GSSTestProcStep__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getRightCurlyBracketKeyword_21()); }
	'}'
	{ after(grammarAccess.getGSSTestProcStepAccess().getRightCurlyBracketKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group__22__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcStep__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_10__0__Impl
	rule__GSSTestProcStep__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefKeyword_10_0()); }
	'prev_step_idref'
	{ after(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_10__1__Impl
	rule__GSSTestProcStep__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_10__2__Impl
	rule__GSSTestProcStep__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefAssignment_10_2()); }
	(rule__GSSTestProcStep__Prev_step_idrefAssignment_10_2)
	{ after(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcStep__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_11__0__Impl
	rule__GSSTestProcStep__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepKeyword_11_0()); }
	'output_idref_from_prev_step'
	{ after(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_11__1__Impl
	rule__GSSTestProcStep__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_11__2__Impl
	rule__GSSTestProcStep__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepAssignment_11_2()); }
	(rule__GSSTestProcStep__Output_idref_from_prev_stepAssignment_11_2)
	{ after(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcStep__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_16__0__Impl
	rule__GSSTestProcStep__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getReplaysKeyword_16_0()); }
	'replays'
	{ after(grammarAccess.getGSSTestProcStepAccess().getReplaysKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_16__1__Impl
	rule__GSSTestProcStep__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_16_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcStepAccess().getColonEqualsSignKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_16__2__Impl
	rule__GSSTestProcStep__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getReplaysAssignment_16_2()); }
	(rule__GSSTestProcStep__ReplaysAssignment_16_2)
	{ after(grammarAccess.getGSSTestProcStepAccess().getReplaysAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcStep__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_16_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcStepAccess().getSemicolonKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputs__Group__0__Impl
	rule__GSSTestProcInputs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputsAccess().getGSSTestProcInputsAction_0()); }
	()
	{ after(grammarAccess.getGSSTestProcInputsAccess().getGSSTestProcInputsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputs__Group__1__Impl
	rule__GSSTestProcInputs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputsAccess().getGSSTestProcInputsKeyword_1()); }
	'GSSTestProcInputs'
	{ after(grammarAccess.getGSSTestProcInputsAccess().getGSSTestProcInputsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputs__Group__2__Impl
	rule__GSSTestProcInputs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSTestProcInputsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputs__Group__3__Impl
	rule__GSSTestProcInputs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getAlternatives_3()); }
		(rule__GSSTestProcInputs__Alternatives_3)
		{ after(grammarAccess.getGSSTestProcInputsAccess().getAlternatives_3()); }
	)
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getAlternatives_3()); }
		(rule__GSSTestProcInputs__Alternatives_3)*
		{ after(grammarAccess.getGSSTestProcInputsAccess().getAlternatives_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputs__Group__4__Impl
	rule__GSSTestProcInputs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSTestProcInputsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__0__Impl
	rule__GSSTestProcOutputs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getGSSTestProcOutputsKeyword_0()); }
	'GSSTestProcOutputs'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getGSSTestProcOutputsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__1__Impl
	rule__GSSTestProcOutputs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__2__Impl
	rule__GSSTestProcOutputs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeKeyword_2()); }
	'checkmode'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__3__Impl
	rule__GSSTestProcOutputs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__4__Impl
	rule__GSSTestProcOutputs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeAssignment_4()); }
	(rule__GSSTestProcOutputs__CheckmodeAssignment_4)
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__5__Impl
	rule__GSSTestProcOutputs__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__6__Impl
	rule__GSSTestProcOutputs__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueKeyword_6()); }
	'valid_time_interval_value'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__7__Impl
	rule__GSSTestProcOutputs__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__8__Impl
	rule__GSSTestProcOutputs__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueAssignment_8()); }
	(rule__GSSTestProcOutputs__Valid_time_interval_valueAssignment_8)
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__9__Impl
	rule__GSSTestProcOutputs__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__10__Impl
	rule__GSSTestProcOutputs__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitKeyword_10()); }
	'valid_time_interval_unit'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__11__Impl
	rule__GSSTestProcOutputs__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__12__Impl
	rule__GSSTestProcOutputs__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitAssignment_12()); }
	(rule__GSSTestProcOutputs__Valid_time_interval_unitAssignment_12)
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__13__Impl
	rule__GSSTestProcOutputs__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__14__Impl
	rule__GSSTestProcOutputs__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getAlternatives_14()); }
		(rule__GSSTestProcOutputs__Alternatives_14)
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getAlternatives_14()); }
	)
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getAlternatives_14()); }
		(rule__GSSTestProcOutputs__Alternatives_14)*
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getAlternatives_14()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__15__Impl
	rule__GSSTestProcOutputs__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputs__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputsAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcSpecialPackets__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcSpecialPackets__Group__0__Impl
	rule__GSSTestProcSpecialPackets__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGSSTestProcSpecialPacketsAction_0()); }
	()
	{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGSSTestProcSpecialPacketsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcSpecialPackets__Group__1__Impl
	rule__GSSTestProcSpecialPackets__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGSSTestProcSpecialPacketsKeyword_1()); }
	'GSSTestProcSpecialPackets'
	{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getGSSTestProcSpecialPacketsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcSpecialPackets__Group__2__Impl
	rule__GSSTestProcSpecialPackets__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcSpecialPackets__Group__3__Impl
	rule__GSSTestProcSpecialPackets__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getAlternatives_3()); }
		(rule__GSSTestProcSpecialPackets__Alternatives_3)
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getAlternatives_3()); }
	)
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getAlternatives_3()); }
		(rule__GSSTestProcSpecialPackets__Alternatives_3)*
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getAlternatives_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcSpecialPackets__Group__4__Impl
	rule__GSSTestProcSpecialPackets__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcSpecialPackets__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcConcurrentSteps__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__0__Impl
	rule__GSSTestProcConcurrentSteps__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getGSSTestProcConcurrentStepsKeyword_0()); }
	'GSSTestProcConcurrentSteps'
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getGSSTestProcConcurrentStepsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__1__Impl
	rule__GSSTestProcConcurrentSteps__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__2__Impl
	rule__GSSTestProcConcurrentSteps__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepKeyword_2()); }
	'nextStep'
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__3__Impl
	rule__GSSTestProcConcurrentSteps__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__4__Impl
	rule__GSSTestProcConcurrentSteps__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepAssignment_4()); }
	(rule__GSSTestProcConcurrentSteps__NextStepAssignment_4)
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__5__Impl
	rule__GSSTestProcConcurrentSteps__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__6__Impl
	rule__GSSTestProcConcurrentSteps__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepAssignment_6()); }
		(rule__GSSTestProcConcurrentSteps__Concurrent_stepAssignment_6)
		{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepAssignment_6()); }
	)
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepAssignment_6()); }
		(rule__GSSTestProcConcurrentSteps__Concurrent_stepAssignment_6)*
		{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__7__Impl
	rule__GSSTestProcConcurrentSteps__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentSteps__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__0__Impl
	rule__GSSTestProcInputLevel3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGSSTestProcInputLevel3Keyword_0()); }
	'GSSTestProcInputLevel3'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGSSTestProcInputLevel3Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__1__Impl
	rule__GSSTestProcInputLevel3__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__2__Impl
	rule__GSSTestProcInputLevel3__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__3__Impl
	rule__GSSTestProcInputLevel3__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__4__Impl
	rule__GSSTestProcInputLevel3__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getNameAssignment_4()); }
	(rule__GSSTestProcInputLevel3__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__5__Impl
	rule__GSSTestProcInputLevel3__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__6__Impl
	rule__GSSTestProcInputLevel3__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__7__Impl
	rule__GSSTestProcInputLevel3__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__8__Impl
	rule__GSSTestProcInputLevel3__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefAssignment_8()); }
	(rule__GSSTestProcInputLevel3__IfRefAssignment_8)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__9__Impl
	rule__GSSTestProcInputLevel3__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__10__Impl
	rule__GSSTestProcInputLevel3__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueKeyword_10()); }
	'delay_value'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__11__Impl
	rule__GSSTestProcInputLevel3__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__12__Impl
	rule__GSSTestProcInputLevel3__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueAssignment_12()); }
	(rule__GSSTestProcInputLevel3__Delay_valueAssignment_12)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__13__Impl
	rule__GSSTestProcInputLevel3__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__14__Impl
	rule__GSSTestProcInputLevel3__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitKeyword_14()); }
	'delay_unit'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__15__Impl
	rule__GSSTestProcInputLevel3__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__16__Impl
	rule__GSSTestProcInputLevel3__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitAssignment_16()); }
	(rule__GSSTestProcInputLevel3__Delay_unitAssignment_16)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__17__Impl
	rule__GSSTestProcInputLevel3__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__18__Impl
	rule__GSSTestProcInputLevel3__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_18()); }
	(rule__GSSTestProcInputLevel3__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__19__Impl
	rule__GSSTestProcInputLevel3__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3Keyword_19()); }
	'app_to_level3'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3Keyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__20__Impl
	rule__GSSTestProcInputLevel3__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__21__Impl
	rule__GSSTestProcInputLevel3__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3Assignment_21()); }
	(rule__GSSTestProcInputLevel3__App_to_level3Assignment_21)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3Assignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__22__Impl
	rule__GSSTestProcInputLevel3__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__23__Impl
	rule__GSSTestProcInputLevel3__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_23()); }
	(rule__GSSTestProcInputLevel3__Group_23__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__24__Impl
	rule__GSSTestProcInputLevel3__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_24()); }
	(rule__GSSTestProcInputLevel3__Group_24__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__25__Impl
	rule__GSSTestProcInputLevel3__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_25()); }
	(rule__GSSTestProcInputLevel3__Group_25__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__26__Impl
	rule__GSSTestProcInputLevel3__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_26()); }
	(rule__GSSTestProcInputLevel3__Group_26__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__27__Impl
	rule__GSSTestProcInputLevel3__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_27()); }
	(rule__GSSTestProcInputLevel3__Group_27__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__28__Impl
	rule__GSSTestProcInputLevel3__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_28()); }
	(rule__GSSTestProcInputLevel3__Group_28__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__29__Impl
	rule__GSSTestProcInputLevel3__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_18__0__Impl
	rule__GSSTestProcInputLevel3__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3Keyword_18_0()); }
	'level3'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_18__1__Impl
	rule__GSSTestProcInputLevel3__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_18__2__Impl
	rule__GSSTestProcInputLevel3__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3Assignment_18_2()); }
	(rule__GSSTestProcInputLevel3__Level3Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_23__0__Impl
	rule__GSSTestProcInputLevel3__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2Keyword_23_0()); }
	'level2'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2Keyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_23__1__Impl
	rule__GSSTestProcInputLevel3__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_23__2__Impl
	rule__GSSTestProcInputLevel3__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2Assignment_23_2()); }
	(rule__GSSTestProcInputLevel3__Level2Assignment_23_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2Assignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_24__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_24__0__Impl
	rule__GSSTestProcInputLevel3__Group_24__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2Keyword_24_0()); }
	'level3_to_level2'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2Keyword_24_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_24__1__Impl
	rule__GSSTestProcInputLevel3__Group_24__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_24_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_24_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_24__2__Impl
	rule__GSSTestProcInputLevel3__Group_24__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2Assignment_24_2()); }
	(rule__GSSTestProcInputLevel3__Level3_to_level2Assignment_24_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2Assignment_24_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_24__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_24__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_24_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_24_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_25__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_25__0__Impl
	rule__GSSTestProcInputLevel3__Group_25__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1Keyword_25_0()); }
	'level1'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1Keyword_25_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_25__1__Impl
	rule__GSSTestProcInputLevel3__Group_25__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_25_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_25_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_25__2__Impl
	rule__GSSTestProcInputLevel3__Group_25__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1Assignment_25_2()); }
	(rule__GSSTestProcInputLevel3__Level1Assignment_25_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1Assignment_25_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_25__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_25__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_25_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_25_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_26__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_26__0__Impl
	rule__GSSTestProcInputLevel3__Group_26__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1Keyword_26_0()); }
	'level2_to_level1'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1Keyword_26_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_26__1__Impl
	rule__GSSTestProcInputLevel3__Group_26__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_26_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_26_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_26__2__Impl
	rule__GSSTestProcInputLevel3__Group_26__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1Assignment_26_2()); }
	(rule__GSSTestProcInputLevel3__Level2_to_level1Assignment_26_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1Assignment_26_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_26__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_26__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_26_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_26_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_27__0__Impl
	rule__GSSTestProcInputLevel3__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0Keyword_27_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_27__1__Impl
	rule__GSSTestProcInputLevel3__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_27__2__Impl
	rule__GSSTestProcInputLevel3__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0Assignment_27_2()); }
	(rule__GSSTestProcInputLevel3__Level0Assignment_27_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel3__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_28__0__Impl
	rule__GSSTestProcInputLevel3__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0Keyword_28_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_28__1__Impl
	rule__GSSTestProcInputLevel3__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_28__2__Impl
	rule__GSSTestProcInputLevel3__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0Assignment_28_2()); }
	(rule__GSSTestProcInputLevel3__Level1_to_level0Assignment_28_2)
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel3__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel3Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__0__Impl
	rule__GSSTestProcInputLevel2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGSSTestProcInputLevel2Keyword_0()); }
	'GSSTestProcInputLevel2'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGSSTestProcInputLevel2Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__1__Impl
	rule__GSSTestProcInputLevel2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__2__Impl
	rule__GSSTestProcInputLevel2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__3__Impl
	rule__GSSTestProcInputLevel2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__4__Impl
	rule__GSSTestProcInputLevel2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getNameAssignment_4()); }
	(rule__GSSTestProcInputLevel2__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__5__Impl
	rule__GSSTestProcInputLevel2__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__6__Impl
	rule__GSSTestProcInputLevel2__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__7__Impl
	rule__GSSTestProcInputLevel2__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__8__Impl
	rule__GSSTestProcInputLevel2__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefAssignment_8()); }
	(rule__GSSTestProcInputLevel2__IfRefAssignment_8)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__9__Impl
	rule__GSSTestProcInputLevel2__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__10__Impl
	rule__GSSTestProcInputLevel2__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueKeyword_10()); }
	'delay_value'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__11__Impl
	rule__GSSTestProcInputLevel2__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__12__Impl
	rule__GSSTestProcInputLevel2__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueAssignment_12()); }
	(rule__GSSTestProcInputLevel2__Delay_valueAssignment_12)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__13__Impl
	rule__GSSTestProcInputLevel2__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__14__Impl
	rule__GSSTestProcInputLevel2__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitKeyword_14()); }
	'delay_unit'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__15__Impl
	rule__GSSTestProcInputLevel2__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__16__Impl
	rule__GSSTestProcInputLevel2__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitAssignment_16()); }
	(rule__GSSTestProcInputLevel2__Delay_unitAssignment_16)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__17__Impl
	rule__GSSTestProcInputLevel2__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__18__Impl
	rule__GSSTestProcInputLevel2__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_18()); }
	(rule__GSSTestProcInputLevel2__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__19__Impl
	rule__GSSTestProcInputLevel2__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2Keyword_19()); }
	'app_to_level2'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2Keyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__20__Impl
	rule__GSSTestProcInputLevel2__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__21__Impl
	rule__GSSTestProcInputLevel2__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2Assignment_21()); }
	(rule__GSSTestProcInputLevel2__App_to_level2Assignment_21)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2Assignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__22__Impl
	rule__GSSTestProcInputLevel2__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__23__Impl
	rule__GSSTestProcInputLevel2__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_23()); }
	(rule__GSSTestProcInputLevel2__Group_23__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__24__Impl
	rule__GSSTestProcInputLevel2__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_24()); }
	(rule__GSSTestProcInputLevel2__Group_24__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__25__Impl
	rule__GSSTestProcInputLevel2__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_25()); }
	(rule__GSSTestProcInputLevel2__Group_25__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__26__Impl
	rule__GSSTestProcInputLevel2__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_26()); }
	(rule__GSSTestProcInputLevel2__Group_26__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getGroup_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__27__Impl
	rule__GSSTestProcInputLevel2__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getRightCurlyBracketKeyword_27()); }
	'}'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getRightCurlyBracketKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group__28__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_28()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel2__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_18__0__Impl
	rule__GSSTestProcInputLevel2__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2Keyword_18_0()); }
	'level2'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_18__1__Impl
	rule__GSSTestProcInputLevel2__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_18__2__Impl
	rule__GSSTestProcInputLevel2__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2Assignment_18_2()); }
	(rule__GSSTestProcInputLevel2__Level2Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel2__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_23__0__Impl
	rule__GSSTestProcInputLevel2__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1Keyword_23_0()); }
	'level1'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1Keyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_23__1__Impl
	rule__GSSTestProcInputLevel2__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_23__2__Impl
	rule__GSSTestProcInputLevel2__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1Assignment_23_2()); }
	(rule__GSSTestProcInputLevel2__Level1Assignment_23_2)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1Assignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel2__Group_24__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_24__0__Impl
	rule__GSSTestProcInputLevel2__Group_24__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1Keyword_24_0()); }
	'level2_to_level1'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1Keyword_24_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_24__1__Impl
	rule__GSSTestProcInputLevel2__Group_24__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_24_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_24_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_24__2__Impl
	rule__GSSTestProcInputLevel2__Group_24__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1Assignment_24_2()); }
	(rule__GSSTestProcInputLevel2__Level2_to_level1Assignment_24_2)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1Assignment_24_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_24__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_24__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_24_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_24_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel2__Group_25__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_25__0__Impl
	rule__GSSTestProcInputLevel2__Group_25__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0Keyword_25_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0Keyword_25_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_25__1__Impl
	rule__GSSTestProcInputLevel2__Group_25__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_25_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_25_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_25__2__Impl
	rule__GSSTestProcInputLevel2__Group_25__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0Assignment_25_2()); }
	(rule__GSSTestProcInputLevel2__Level0Assignment_25_2)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0Assignment_25_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_25__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_25__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_25_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_25_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel2__Group_26__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_26__0__Impl
	rule__GSSTestProcInputLevel2__Group_26__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0Keyword_26_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0Keyword_26_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_26__1__Impl
	rule__GSSTestProcInputLevel2__Group_26__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_26_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getColonEqualsSignKeyword_26_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_26__2__Impl
	rule__GSSTestProcInputLevel2__Group_26__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0Assignment_26_2()); }
	(rule__GSSTestProcInputLevel2__Level1_to_level0Assignment_26_2)
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0Assignment_26_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel2__Group_26__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Group_26__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_26_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel2Access().getSemicolonKeyword_26_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__0__Impl
	rule__GSSTestProcInputLevel1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getGSSTestProcInputLevel1Keyword_0()); }
	'GSSTestProcInputLevel1'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getGSSTestProcInputLevel1Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__1__Impl
	rule__GSSTestProcInputLevel1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__2__Impl
	rule__GSSTestProcInputLevel1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__3__Impl
	rule__GSSTestProcInputLevel1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__4__Impl
	rule__GSSTestProcInputLevel1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getNameAssignment_4()); }
	(rule__GSSTestProcInputLevel1__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__5__Impl
	rule__GSSTestProcInputLevel1__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__6__Impl
	rule__GSSTestProcInputLevel1__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__7__Impl
	rule__GSSTestProcInputLevel1__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__8__Impl
	rule__GSSTestProcInputLevel1__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefAssignment_8()); }
	(rule__GSSTestProcInputLevel1__IfRefAssignment_8)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__9__Impl
	rule__GSSTestProcInputLevel1__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__10__Impl
	rule__GSSTestProcInputLevel1__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueKeyword_10()); }
	'delay_value'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__11__Impl
	rule__GSSTestProcInputLevel1__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__12__Impl
	rule__GSSTestProcInputLevel1__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueAssignment_12()); }
	(rule__GSSTestProcInputLevel1__Delay_valueAssignment_12)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__13__Impl
	rule__GSSTestProcInputLevel1__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__14__Impl
	rule__GSSTestProcInputLevel1__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitKeyword_14()); }
	'delay_unit'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__15__Impl
	rule__GSSTestProcInputLevel1__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__16__Impl
	rule__GSSTestProcInputLevel1__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitAssignment_16()); }
	(rule__GSSTestProcInputLevel1__Delay_unitAssignment_16)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__17__Impl
	rule__GSSTestProcInputLevel1__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__18__Impl
	rule__GSSTestProcInputLevel1__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_18()); }
	(rule__GSSTestProcInputLevel1__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__19__Impl
	rule__GSSTestProcInputLevel1__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1Keyword_19()); }
	'app_to_level1'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1Keyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__20__Impl
	rule__GSSTestProcInputLevel1__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__21__Impl
	rule__GSSTestProcInputLevel1__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1Assignment_21()); }
	(rule__GSSTestProcInputLevel1__App_to_level1Assignment_21)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1Assignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__22__Impl
	rule__GSSTestProcInputLevel1__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__23__Impl
	rule__GSSTestProcInputLevel1__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_23()); }
	(rule__GSSTestProcInputLevel1__Group_23__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__24__Impl
	rule__GSSTestProcInputLevel1__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_24()); }
	(rule__GSSTestProcInputLevel1__Group_24__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getGroup_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__25__Impl
	rule__GSSTestProcInputLevel1__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getRightCurlyBracketKeyword_25()); }
	'}'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getRightCurlyBracketKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group__26__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel1__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_18__0__Impl
	rule__GSSTestProcInputLevel1__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1Keyword_18_0()); }
	'level1'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_18__1__Impl
	rule__GSSTestProcInputLevel1__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_18__2__Impl
	rule__GSSTestProcInputLevel1__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1Assignment_18_2()); }
	(rule__GSSTestProcInputLevel1__Level1Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel1__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_23__0__Impl
	rule__GSSTestProcInputLevel1__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0Keyword_23_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0Keyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_23__1__Impl
	rule__GSSTestProcInputLevel1__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_23__2__Impl
	rule__GSSTestProcInputLevel1__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0Assignment_23_2()); }
	(rule__GSSTestProcInputLevel1__Level0Assignment_23_2)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0Assignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel1__Group_24__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_24__0__Impl
	rule__GSSTestProcInputLevel1__Group_24__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0Keyword_24_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0Keyword_24_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_24__1__Impl
	rule__GSSTestProcInputLevel1__Group_24__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_24_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getColonEqualsSignKeyword_24_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_24__2__Impl
	rule__GSSTestProcInputLevel1__Group_24__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0Assignment_24_2()); }
	(rule__GSSTestProcInputLevel1__Level1_to_level0Assignment_24_2)
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0Assignment_24_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel1__Group_24__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Group_24__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_24_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel1Access().getSemicolonKeyword_24_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__0__Impl
	rule__GSSTestProcInputLevel0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getGSSTestProcInputLevel0Keyword_0()); }
	'GSSTestProcInputLevel0'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getGSSTestProcInputLevel0Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__1__Impl
	rule__GSSTestProcInputLevel0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__2__Impl
	rule__GSSTestProcInputLevel0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__3__Impl
	rule__GSSTestProcInputLevel0__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__4__Impl
	rule__GSSTestProcInputLevel0__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getNameAssignment_4()); }
	(rule__GSSTestProcInputLevel0__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__5__Impl
	rule__GSSTestProcInputLevel0__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__6__Impl
	rule__GSSTestProcInputLevel0__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__7__Impl
	rule__GSSTestProcInputLevel0__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__8__Impl
	rule__GSSTestProcInputLevel0__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefAssignment_8()); }
	(rule__GSSTestProcInputLevel0__IfRefAssignment_8)
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__9__Impl
	rule__GSSTestProcInputLevel0__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__10__Impl
	rule__GSSTestProcInputLevel0__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueKeyword_10()); }
	'delay_value'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__11__Impl
	rule__GSSTestProcInputLevel0__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__12__Impl
	rule__GSSTestProcInputLevel0__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueAssignment_12()); }
	(rule__GSSTestProcInputLevel0__Delay_valueAssignment_12)
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__13__Impl
	rule__GSSTestProcInputLevel0__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__14__Impl
	rule__GSSTestProcInputLevel0__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitKeyword_14()); }
	'delay_unit'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__15__Impl
	rule__GSSTestProcInputLevel0__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__16__Impl
	rule__GSSTestProcInputLevel0__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitAssignment_16()); }
	(rule__GSSTestProcInputLevel0__Delay_unitAssignment_16)
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__17__Impl
	rule__GSSTestProcInputLevel0__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__18__Impl
	rule__GSSTestProcInputLevel0__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getGroup_18()); }
	(rule__GSSTestProcInputLevel0__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__19__Impl
	rule__GSSTestProcInputLevel0__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0Keyword_19()); }
	'app_to_level0'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0Keyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__20__Impl
	rule__GSSTestProcInputLevel0__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__21__Impl
	rule__GSSTestProcInputLevel0__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0Assignment_21()); }
	(rule__GSSTestProcInputLevel0__App_to_level0Assignment_21)
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0Assignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__22__Impl
	rule__GSSTestProcInputLevel0__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__23__Impl
	rule__GSSTestProcInputLevel0__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getRightCurlyBracketKeyword_23()); }
	'}'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getRightCurlyBracketKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group__24__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_24()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcInputLevel0__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group_18__0__Impl
	rule__GSSTestProcInputLevel0__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0Keyword_18_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group_18__1__Impl
	rule__GSSTestProcInputLevel0__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group_18__2__Impl
	rule__GSSTestProcInputLevel0__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0Assignment_18_2()); }
	(rule__GSSTestProcInputLevel0__Level0Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcInputLevel0__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcInputLevel0Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__0__Impl
	rule__GSSTestProcOutputLevel3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGSSTestProcOutputLevel3Keyword_0()); }
	'GSSTestProcOutputLevel3'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGSSTestProcOutputLevel3Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__1__Impl
	rule__GSSTestProcOutputLevel3__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__2__Impl
	rule__GSSTestProcOutputLevel3__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__3__Impl
	rule__GSSTestProcOutputLevel3__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__4__Impl
	rule__GSSTestProcOutputLevel3__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getNameAssignment_4()); }
	(rule__GSSTestProcOutputLevel3__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__5__Impl
	rule__GSSTestProcOutputLevel3__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__6__Impl
	rule__GSSTestProcOutputLevel3__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__7__Impl
	rule__GSSTestProcOutputLevel3__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__8__Impl
	rule__GSSTestProcOutputLevel3__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getIdAssignment_8()); }
	(rule__GSSTestProcOutputLevel3__IdAssignment_8)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__9__Impl
	rule__GSSTestProcOutputLevel3__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__10__Impl
	rule__GSSTestProcOutputLevel3__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__11__Impl
	rule__GSSTestProcOutputLevel3__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__12__Impl
	rule__GSSTestProcOutputLevel3__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefAssignment_12()); }
	(rule__GSSTestProcOutputLevel3__IfRefAssignment_12)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__13__Impl
	rule__GSSTestProcOutputLevel3__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__14__Impl
	rule__GSSTestProcOutputLevel3__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_14()); }
	(rule__GSSTestProcOutputLevel3__Group_14__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__15__Impl
	rule__GSSTestProcOutputLevel3__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_15()); }
	(rule__GSSTestProcOutputLevel3__Group_15__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__16__Impl
	rule__GSSTestProcOutputLevel3__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_filterAssignment_16()); }
	(rule__GSSTestProcOutputLevel3__Level3_filterAssignment_16)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_filterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__17__Impl
	rule__GSSTestProcOutputLevel3__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_17()); }
	(rule__GSSTestProcOutputLevel3__Group_17__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__18__Impl
	rule__GSSTestProcOutputLevel3__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_18()); }
	(rule__GSSTestProcOutputLevel3__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__19__Impl
	rule__GSSTestProcOutputLevel3__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_filterAssignment_19()); }
	(rule__GSSTestProcOutputLevel3__Level2_filterAssignment_19)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_filterAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__20__Impl
	rule__GSSTestProcOutputLevel3__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_20()); }
	(rule__GSSTestProcOutputLevel3__Group_20__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__21__Impl
	rule__GSSTestProcOutputLevel3__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_21()); }
	(rule__GSSTestProcOutputLevel3__Group_21__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__22__Impl
	rule__GSSTestProcOutputLevel3__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_filterAssignment_22()); }
	(rule__GSSTestProcOutputLevel3__Level1_filterAssignment_22)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_filterAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__23__Impl
	rule__GSSTestProcOutputLevel3__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_23()); }
	(rule__GSSTestProcOutputLevel3__Group_23__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__24__Impl
	rule__GSSTestProcOutputLevel3__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_24()); }
	(rule__GSSTestProcOutputLevel3__Group_24__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getGroup_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__25__Impl
	rule__GSSTestProcOutputLevel3__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0_filterAssignment_25()); }
	(rule__GSSTestProcOutputLevel3__Level0_filterAssignment_25)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0_filterAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__26__Impl
	rule__GSSTestProcOutputLevel3__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getRightCurlyBracketKeyword_26()); }
	'}'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getRightCurlyBracketKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group__27__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_27()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_14__0__Impl
	rule__GSSTestProcOutputLevel3__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalKeyword_14_0()); }
	'optional'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_14__1__Impl
	rule__GSSTestProcOutputLevel3__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_14__2__Impl
	rule__GSSTestProcOutputLevel3__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalAssignment_14_2()); }
	(rule__GSSTestProcOutputLevel3__OptionalAssignment_14_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_15__0__Impl
	rule__GSSTestProcOutputLevel3__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3Keyword_15_0()); }
	'level3'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3Keyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_15__1__Impl
	rule__GSSTestProcOutputLevel3__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_15__2__Impl
	rule__GSSTestProcOutputLevel3__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3Assignment_15_2()); }
	(rule__GSSTestProcOutputLevel3__Level3Assignment_15_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3Assignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_17__0__Impl
	rule__GSSTestProcOutputLevel3__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2Keyword_17_0()); }
	'level2'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2Keyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_17__1__Impl
	rule__GSSTestProcOutputLevel3__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_17_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_17__2__Impl
	rule__GSSTestProcOutputLevel3__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2Assignment_17_2()); }
	(rule__GSSTestProcOutputLevel3__Level2Assignment_17_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2Assignment_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_17__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_17_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_18__0__Impl
	rule__GSSTestProcOutputLevel3__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2Keyword_18_0()); }
	'level3_from_level2'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_18__1__Impl
	rule__GSSTestProcOutputLevel3__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_18__2__Impl
	rule__GSSTestProcOutputLevel3__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2Assignment_18_2()); }
	(rule__GSSTestProcOutputLevel3__Level3_from_level2Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_20__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_20__0__Impl
	rule__GSSTestProcOutputLevel3__Group_20__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1Keyword_20_0()); }
	'level1'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1Keyword_20_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_20__1__Impl
	rule__GSSTestProcOutputLevel3__Group_20__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_20_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_20_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_20__2__Impl
	rule__GSSTestProcOutputLevel3__Group_20__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1Assignment_20_2()); }
	(rule__GSSTestProcOutputLevel3__Level1Assignment_20_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1Assignment_20_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_20__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_20__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_20_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_20_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_21__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_21__0__Impl
	rule__GSSTestProcOutputLevel3__Group_21__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1Keyword_21_0()); }
	'level2_from_level1'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1Keyword_21_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_21__1__Impl
	rule__GSSTestProcOutputLevel3__Group_21__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_21_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_21_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_21__2__Impl
	rule__GSSTestProcOutputLevel3__Group_21__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1Assignment_21_2()); }
	(rule__GSSTestProcOutputLevel3__Level2_from_level1Assignment_21_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1Assignment_21_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_21__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_21__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_21_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_21_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_23__0__Impl
	rule__GSSTestProcOutputLevel3__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0Keyword_23_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0Keyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_23__1__Impl
	rule__GSSTestProcOutputLevel3__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_23__2__Impl
	rule__GSSTestProcOutputLevel3__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0Assignment_23_2()); }
	(rule__GSSTestProcOutputLevel3__Level0Assignment_23_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0Assignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel3__Group_24__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_24__0__Impl
	rule__GSSTestProcOutputLevel3__Group_24__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0Keyword_24_0()); }
	'level1_from_level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0Keyword_24_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_24__1__Impl
	rule__GSSTestProcOutputLevel3__Group_24__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_24_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getColonEqualsSignKeyword_24_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_24__2__Impl
	rule__GSSTestProcOutputLevel3__Group_24__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0Assignment_24_2()); }
	(rule__GSSTestProcOutputLevel3__Level1_from_level0Assignment_24_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0Assignment_24_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel3__Group_24__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Group_24__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_24_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getSemicolonKeyword_24_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__0__Impl
	rule__GSSTestProcOutputLevel2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGSSTestProcOutputLevel2Keyword_0()); }
	'GSSTestProcOutputLevel2'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGSSTestProcOutputLevel2Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__1__Impl
	rule__GSSTestProcOutputLevel2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__2__Impl
	rule__GSSTestProcOutputLevel2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__3__Impl
	rule__GSSTestProcOutputLevel2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__4__Impl
	rule__GSSTestProcOutputLevel2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getNameAssignment_4()); }
	(rule__GSSTestProcOutputLevel2__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__5__Impl
	rule__GSSTestProcOutputLevel2__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__6__Impl
	rule__GSSTestProcOutputLevel2__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__7__Impl
	rule__GSSTestProcOutputLevel2__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__8__Impl
	rule__GSSTestProcOutputLevel2__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getIdAssignment_8()); }
	(rule__GSSTestProcOutputLevel2__IdAssignment_8)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__9__Impl
	rule__GSSTestProcOutputLevel2__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__10__Impl
	rule__GSSTestProcOutputLevel2__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__11__Impl
	rule__GSSTestProcOutputLevel2__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__12__Impl
	rule__GSSTestProcOutputLevel2__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefAssignment_12()); }
	(rule__GSSTestProcOutputLevel2__IfRefAssignment_12)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__13__Impl
	rule__GSSTestProcOutputLevel2__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__14__Impl
	rule__GSSTestProcOutputLevel2__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_14()); }
	(rule__GSSTestProcOutputLevel2__Group_14__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__15__Impl
	rule__GSSTestProcOutputLevel2__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_15()); }
	(rule__GSSTestProcOutputLevel2__Group_15__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__16__Impl
	rule__GSSTestProcOutputLevel2__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_filterAssignment_16()); }
	(rule__GSSTestProcOutputLevel2__Level2_filterAssignment_16)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_filterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__17__Impl
	rule__GSSTestProcOutputLevel2__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_17()); }
	(rule__GSSTestProcOutputLevel2__Group_17__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__18__Impl
	rule__GSSTestProcOutputLevel2__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_18()); }
	(rule__GSSTestProcOutputLevel2__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__19__Impl
	rule__GSSTestProcOutputLevel2__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_filterAssignment_19()); }
	(rule__GSSTestProcOutputLevel2__Level1_filterAssignment_19)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_filterAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__20__Impl
	rule__GSSTestProcOutputLevel2__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_20()); }
	(rule__GSSTestProcOutputLevel2__Group_20__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__21__Impl
	rule__GSSTestProcOutputLevel2__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_21()); }
	(rule__GSSTestProcOutputLevel2__Group_21__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getGroup_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__22__Impl
	rule__GSSTestProcOutputLevel2__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0_filterAssignment_22()); }
	(rule__GSSTestProcOutputLevel2__Level0_filterAssignment_22)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0_filterAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__23__Impl
	rule__GSSTestProcOutputLevel2__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getRightCurlyBracketKeyword_23()); }
	'}'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getRightCurlyBracketKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group__24__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_24()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_14__0__Impl
	rule__GSSTestProcOutputLevel2__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalKeyword_14_0()); }
	'optional'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_14__1__Impl
	rule__GSSTestProcOutputLevel2__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_14__2__Impl
	rule__GSSTestProcOutputLevel2__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalAssignment_14_2()); }
	(rule__GSSTestProcOutputLevel2__OptionalAssignment_14_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_15__0__Impl
	rule__GSSTestProcOutputLevel2__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2Keyword_15_0()); }
	'level2'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2Keyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_15__1__Impl
	rule__GSSTestProcOutputLevel2__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_15__2__Impl
	rule__GSSTestProcOutputLevel2__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2Assignment_15_2()); }
	(rule__GSSTestProcOutputLevel2__Level2Assignment_15_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2Assignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_17__0__Impl
	rule__GSSTestProcOutputLevel2__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1Keyword_17_0()); }
	'level1'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1Keyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_17__1__Impl
	rule__GSSTestProcOutputLevel2__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_17_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_17__2__Impl
	rule__GSSTestProcOutputLevel2__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1Assignment_17_2()); }
	(rule__GSSTestProcOutputLevel2__Level1Assignment_17_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1Assignment_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_17__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_17_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_18__0__Impl
	rule__GSSTestProcOutputLevel2__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1Keyword_18_0()); }
	'level2_from_level1'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_18__1__Impl
	rule__GSSTestProcOutputLevel2__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_18__2__Impl
	rule__GSSTestProcOutputLevel2__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1Assignment_18_2()); }
	(rule__GSSTestProcOutputLevel2__Level2_from_level1Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group_20__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_20__0__Impl
	rule__GSSTestProcOutputLevel2__Group_20__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0Keyword_20_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0Keyword_20_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_20__1__Impl
	rule__GSSTestProcOutputLevel2__Group_20__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_20_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_20_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_20__2__Impl
	rule__GSSTestProcOutputLevel2__Group_20__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0Assignment_20_2()); }
	(rule__GSSTestProcOutputLevel2__Level0Assignment_20_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0Assignment_20_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_20__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_20__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_20_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_20_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel2__Group_21__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_21__0__Impl
	rule__GSSTestProcOutputLevel2__Group_21__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0Keyword_21_0()); }
	'level1_from_level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0Keyword_21_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_21__1__Impl
	rule__GSSTestProcOutputLevel2__Group_21__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_21_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getColonEqualsSignKeyword_21_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_21__2__Impl
	rule__GSSTestProcOutputLevel2__Group_21__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0Assignment_21_2()); }
	(rule__GSSTestProcOutputLevel2__Level1_from_level0Assignment_21_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0Assignment_21_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel2__Group_21__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Group_21__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_21_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getSemicolonKeyword_21_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__0__Impl
	rule__GSSTestProcOutputLevel1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getGSSTestProcOutputLevel1Keyword_0()); }
	'GSSTestProcOutputLevel1'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getGSSTestProcOutputLevel1Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__1__Impl
	rule__GSSTestProcOutputLevel1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__2__Impl
	rule__GSSTestProcOutputLevel1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__3__Impl
	rule__GSSTestProcOutputLevel1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__4__Impl
	rule__GSSTestProcOutputLevel1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getNameAssignment_4()); }
	(rule__GSSTestProcOutputLevel1__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__5__Impl
	rule__GSSTestProcOutputLevel1__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__6__Impl
	rule__GSSTestProcOutputLevel1__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__7__Impl
	rule__GSSTestProcOutputLevel1__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__8__Impl
	rule__GSSTestProcOutputLevel1__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getIdAssignment_8()); }
	(rule__GSSTestProcOutputLevel1__IdAssignment_8)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__9__Impl
	rule__GSSTestProcOutputLevel1__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__10__Impl
	rule__GSSTestProcOutputLevel1__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__11__Impl
	rule__GSSTestProcOutputLevel1__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__12__Impl
	rule__GSSTestProcOutputLevel1__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefAssignment_12()); }
	(rule__GSSTestProcOutputLevel1__IfRefAssignment_12)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__13__Impl
	rule__GSSTestProcOutputLevel1__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__14__Impl
	rule__GSSTestProcOutputLevel1__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_14()); }
	(rule__GSSTestProcOutputLevel1__Group_14__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__15__Impl
	rule__GSSTestProcOutputLevel1__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_15()); }
	(rule__GSSTestProcOutputLevel1__Group_15__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__16__Impl
	rule__GSSTestProcOutputLevel1__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_filterAssignment_16()); }
	(rule__GSSTestProcOutputLevel1__Level1_filterAssignment_16)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_filterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__17__Impl
	rule__GSSTestProcOutputLevel1__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_17()); }
	(rule__GSSTestProcOutputLevel1__Group_17__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__18__Impl
	rule__GSSTestProcOutputLevel1__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_18()); }
	(rule__GSSTestProcOutputLevel1__Group_18__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__19__Impl
	rule__GSSTestProcOutputLevel1__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0_filterAssignment_19()); }
	(rule__GSSTestProcOutputLevel1__Level0_filterAssignment_19)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0_filterAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__20__Impl
	rule__GSSTestProcOutputLevel1__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getRightCurlyBracketKeyword_20()); }
	'}'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getRightCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel1__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_14__0__Impl
	rule__GSSTestProcOutputLevel1__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalKeyword_14_0()); }
	'optional'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_14__1__Impl
	rule__GSSTestProcOutputLevel1__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_14__2__Impl
	rule__GSSTestProcOutputLevel1__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalAssignment_14_2()); }
	(rule__GSSTestProcOutputLevel1__OptionalAssignment_14_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel1__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_15__0__Impl
	rule__GSSTestProcOutputLevel1__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1Keyword_15_0()); }
	'level1'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1Keyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_15__1__Impl
	rule__GSSTestProcOutputLevel1__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_15__2__Impl
	rule__GSSTestProcOutputLevel1__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1Assignment_15_2()); }
	(rule__GSSTestProcOutputLevel1__Level1Assignment_15_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1Assignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel1__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_17__0__Impl
	rule__GSSTestProcOutputLevel1__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0Keyword_17_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0Keyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_17__1__Impl
	rule__GSSTestProcOutputLevel1__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_17_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_17__2__Impl
	rule__GSSTestProcOutputLevel1__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0Assignment_17_2()); }
	(rule__GSSTestProcOutputLevel1__Level0Assignment_17_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0Assignment_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_17__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_17_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel1__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_18__0__Impl
	rule__GSSTestProcOutputLevel1__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0Keyword_18_0()); }
	'level1_from_level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0Keyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_18__1__Impl
	rule__GSSTestProcOutputLevel1__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_18__2__Impl
	rule__GSSTestProcOutputLevel1__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0Assignment_18_2()); }
	(rule__GSSTestProcOutputLevel1__Level1_from_level0Assignment_18_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0Assignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel1__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__0__Impl
	rule__GSSTestProcOutputLevel0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getGSSTestProcOutputLevel0Keyword_0()); }
	'GSSTestProcOutputLevel0'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getGSSTestProcOutputLevel0Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__1__Impl
	rule__GSSTestProcOutputLevel0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__2__Impl
	rule__GSSTestProcOutputLevel0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__3__Impl
	rule__GSSTestProcOutputLevel0__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__4__Impl
	rule__GSSTestProcOutputLevel0__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getNameAssignment_4()); }
	(rule__GSSTestProcOutputLevel0__NameAssignment_4)
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__5__Impl
	rule__GSSTestProcOutputLevel0__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__6__Impl
	rule__GSSTestProcOutputLevel0__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__7__Impl
	rule__GSSTestProcOutputLevel0__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__8__Impl
	rule__GSSTestProcOutputLevel0__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getIdAssignment_8()); }
	(rule__GSSTestProcOutputLevel0__IdAssignment_8)
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__9__Impl
	rule__GSSTestProcOutputLevel0__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__10__Impl
	rule__GSSTestProcOutputLevel0__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__11__Impl
	rule__GSSTestProcOutputLevel0__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__12__Impl
	rule__GSSTestProcOutputLevel0__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefAssignment_12()); }
	(rule__GSSTestProcOutputLevel0__IfRefAssignment_12)
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__13__Impl
	rule__GSSTestProcOutputLevel0__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__14__Impl
	rule__GSSTestProcOutputLevel0__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup_14()); }
	(rule__GSSTestProcOutputLevel0__Group_14__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__15__Impl
	rule__GSSTestProcOutputLevel0__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup_15()); }
	(rule__GSSTestProcOutputLevel0__Group_15__0)?
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__16__Impl
	rule__GSSTestProcOutputLevel0__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0_filterAssignment_16()); }
	(rule__GSSTestProcOutputLevel0__Level0_filterAssignment_16)
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0_filterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__17__Impl
	rule__GSSTestProcOutputLevel0__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel0__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_14__0__Impl
	rule__GSSTestProcOutputLevel0__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalKeyword_14_0()); }
	'optional'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_14__1__Impl
	rule__GSSTestProcOutputLevel0__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_14__2__Impl
	rule__GSSTestProcOutputLevel0__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalAssignment_14_2()); }
	(rule__GSSTestProcOutputLevel0__OptionalAssignment_14_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcOutputLevel0__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_15__0__Impl
	rule__GSSTestProcOutputLevel0__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0Keyword_15_0()); }
	'level0'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0Keyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_15__1__Impl
	rule__GSSTestProcOutputLevel0__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_15__2__Impl
	rule__GSSTestProcOutputLevel0__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0Assignment_15_2()); }
	(rule__GSSTestProcOutputLevel0__Level0Assignment_15_2)
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0Assignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcOutputLevel0__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel3Filter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__0__Impl
	rule__GSSTestProcLevel3Filter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getGSSTestProcLevel3FilterKeyword_0()); }
	'GSSTestProcLevel3Filter'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getGSSTestProcLevel3FilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__1__Impl
	rule__GSSTestProcLevel3Filter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__2__Impl
	rule__GSSTestProcLevel3Filter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterKeyword_2()); }
	'apply_def_filter'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__3__Impl
	rule__GSSTestProcLevel3Filter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__4__Impl
	rule__GSSTestProcLevel3Filter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterAssignment_4()); }
	(rule__GSSTestProcLevel3Filter__Apply_def_filterAssignment_4)
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__5__Impl
	rule__GSSTestProcLevel3Filter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__6__Impl
	rule__GSSTestProcLevel3Filter__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getGroup_6()); }
	(rule__GSSTestProcLevel3Filter__Group_6__0)?
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__7__Impl
	rule__GSSTestProcLevel3Filter__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel3Filter__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group_6__0__Impl
	rule__GSSTestProcLevel3Filter__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterKeyword_6_0()); }
	'extra_filter'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group_6__1__Impl
	rule__GSSTestProcLevel3Filter__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group_6__2__Impl
	rule__GSSTestProcLevel3Filter__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterAssignment_6_2()); }
	(rule__GSSTestProcLevel3Filter__Extra_filterAssignment_6_2)
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel3Filter__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel2Filter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__0__Impl
	rule__GSSTestProcLevel2Filter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getGSSTestProcLevel2FilterKeyword_0()); }
	'GSSTestProcLevel2Filter'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getGSSTestProcLevel2FilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__1__Impl
	rule__GSSTestProcLevel2Filter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__2__Impl
	rule__GSSTestProcLevel2Filter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterKeyword_2()); }
	'apply_def_filter'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__3__Impl
	rule__GSSTestProcLevel2Filter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__4__Impl
	rule__GSSTestProcLevel2Filter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterAssignment_4()); }
	(rule__GSSTestProcLevel2Filter__Apply_def_filterAssignment_4)
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__5__Impl
	rule__GSSTestProcLevel2Filter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__6__Impl
	rule__GSSTestProcLevel2Filter__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getGroup_6()); }
	(rule__GSSTestProcLevel2Filter__Group_6__0)?
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__7__Impl
	rule__GSSTestProcLevel2Filter__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel2Filter__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group_6__0__Impl
	rule__GSSTestProcLevel2Filter__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterKeyword_6_0()); }
	'extra_filter'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group_6__1__Impl
	rule__GSSTestProcLevel2Filter__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group_6__2__Impl
	rule__GSSTestProcLevel2Filter__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterAssignment_6_2()); }
	(rule__GSSTestProcLevel2Filter__Extra_filterAssignment_6_2)
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel2Filter__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel1Filter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__0__Impl
	rule__GSSTestProcLevel1Filter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getGSSTestProcLevel1FilterKeyword_0()); }
	'GSSTestProcLevel1Filter'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getGSSTestProcLevel1FilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__1__Impl
	rule__GSSTestProcLevel1Filter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__2__Impl
	rule__GSSTestProcLevel1Filter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterKeyword_2()); }
	'apply_def_filter'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__3__Impl
	rule__GSSTestProcLevel1Filter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__4__Impl
	rule__GSSTestProcLevel1Filter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterAssignment_4()); }
	(rule__GSSTestProcLevel1Filter__Apply_def_filterAssignment_4)
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__5__Impl
	rule__GSSTestProcLevel1Filter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__6__Impl
	rule__GSSTestProcLevel1Filter__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getGroup_6()); }
	(rule__GSSTestProcLevel1Filter__Group_6__0)?
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__7__Impl
	rule__GSSTestProcLevel1Filter__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel1Filter__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group_6__0__Impl
	rule__GSSTestProcLevel1Filter__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterKeyword_6_0()); }
	'extra_filter'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group_6__1__Impl
	rule__GSSTestProcLevel1Filter__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group_6__2__Impl
	rule__GSSTestProcLevel1Filter__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterAssignment_6_2()); }
	(rule__GSSTestProcLevel1Filter__Extra_filterAssignment_6_2)
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel1Filter__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel0Filter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__0__Impl
	rule__GSSTestProcLevel0Filter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getGSSTestProcLevel0FilterKeyword_0()); }
	'GSSTestProcLevel0Filter'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getGSSTestProcLevel0FilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__1__Impl
	rule__GSSTestProcLevel0Filter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__2__Impl
	rule__GSSTestProcLevel0Filter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterKeyword_2()); }
	'apply_def_filter'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__3__Impl
	rule__GSSTestProcLevel0Filter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__4__Impl
	rule__GSSTestProcLevel0Filter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterAssignment_4()); }
	(rule__GSSTestProcLevel0Filter__Apply_def_filterAssignment_4)
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__5__Impl
	rule__GSSTestProcLevel0Filter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__6__Impl
	rule__GSSTestProcLevel0Filter__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getGroup_6()); }
	(rule__GSSTestProcLevel0Filter__Group_6__0)?
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__7__Impl
	rule__GSSTestProcLevel0Filter__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcLevel0Filter__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group_6__0__Impl
	rule__GSSTestProcLevel0Filter__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterKeyword_6_0()); }
	'extra_filter'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group_6__1__Impl
	rule__GSSTestProcLevel0Filter__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group_6__2__Impl
	rule__GSSTestProcLevel0Filter__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterAssignment_6_2()); }
	(rule__GSSTestProcLevel0Filter__Extra_filterAssignment_6_2)
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcLevel0Filter__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcEnable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__0__Impl
	rule__GSSTestProcEnable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getGSSTestProcEnableKeyword_0()); }
	'GSSTestProcEnable'
	{ after(grammarAccess.getGSSTestProcEnableAccess().getGSSTestProcEnableKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__1__Impl
	rule__GSSTestProcEnable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcEnableAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__2__Impl
	rule__GSSTestProcEnable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSTestProcEnableAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__3__Impl
	rule__GSSTestProcEnable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcEnableAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__4__Impl
	rule__GSSTestProcEnable__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getIdAssignment_4()); }
	(rule__GSSTestProcEnable__IdAssignment_4)
	{ after(grammarAccess.getGSSTestProcEnableAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__5__Impl
	rule__GSSTestProcEnable__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcEnableAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__6__Impl
	rule__GSSTestProcEnable__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTestProcEnableAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnable__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnableAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTestProcEnableAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcDisable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__0__Impl
	rule__GSSTestProcDisable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getGSSTestProcDisableKeyword_0()); }
	'GSSTestProcDisable'
	{ after(grammarAccess.getGSSTestProcDisableAccess().getGSSTestProcDisableKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__1__Impl
	rule__GSSTestProcDisable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcDisableAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__2__Impl
	rule__GSSTestProcDisable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSTestProcDisableAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__3__Impl
	rule__GSSTestProcDisable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcDisableAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__4__Impl
	rule__GSSTestProcDisable__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getIdAssignment_4()); }
	(rule__GSSTestProcDisable__IdAssignment_4)
	{ after(grammarAccess.getGSSTestProcDisableAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__5__Impl
	rule__GSSTestProcDisable__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcDisableAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__6__Impl
	rule__GSSTestProcDisable__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTestProcDisableAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisable__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisableAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTestProcDisableAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcEnablePrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__0__Impl
	rule__GSSTestProcEnablePrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getGSSTestProcEnablePrintKeyword_0()); }
	'GSSTestProcEnablePrint'
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getGSSTestProcEnablePrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__1__Impl
	rule__GSSTestProcEnablePrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__2__Impl
	rule__GSSTestProcEnablePrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__3__Impl
	rule__GSSTestProcEnablePrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__4__Impl
	rule__GSSTestProcEnablePrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getIdAssignment_4()); }
	(rule__GSSTestProcEnablePrint__IdAssignment_4)
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__5__Impl
	rule__GSSTestProcEnablePrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__6__Impl
	rule__GSSTestProcEnablePrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcEnablePrint__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcDisablePrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__0__Impl
	rule__GSSTestProcDisablePrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getGSSTestProcDisablePrintKeyword_0()); }
	'GSSTestProcDisablePrint'
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getGSSTestProcDisablePrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__1__Impl
	rule__GSSTestProcDisablePrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__2__Impl
	rule__GSSTestProcDisablePrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__3__Impl
	rule__GSSTestProcDisablePrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__4__Impl
	rule__GSSTestProcDisablePrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getIdAssignment_4()); }
	(rule__GSSTestProcDisablePrint__IdAssignment_4)
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__5__Impl
	rule__GSSTestProcDisablePrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__6__Impl
	rule__GSSTestProcDisablePrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcDisablePrint__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcNextStep__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__0__Impl
	rule__GSSTestProcNextStep__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getGSSTestProcNextStepKeyword_0()); }
	'GSSTestProcNextStep'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getGSSTestProcNextStepKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__1__Impl
	rule__GSSTestProcNextStep__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__2__Impl
	rule__GSSTestProcNextStep__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__3__Impl
	rule__GSSTestProcNextStep__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__4__Impl
	rule__GSSTestProcNextStep__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getIdAssignment_4()); }
	(rule__GSSTestProcNextStep__IdAssignment_4)
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__5__Impl
	rule__GSSTestProcNextStep__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__6__Impl
	rule__GSSTestProcNextStep__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentKeyword_6()); }
	'isConcurrent'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__7__Impl
	rule__GSSTestProcNextStep__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__8__Impl
	rule__GSSTestProcNextStep__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentAssignment_8()); }
	(rule__GSSTestProcNextStep__IsConcurrentAssignment_8)
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__9__Impl
	rule__GSSTestProcNextStep__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__10__Impl
	rule__GSSTestProcNextStep__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcNextStep__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSTestProcNextStepAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTestProcConcurrentStep__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__0__Impl
	rule__GSSTestProcConcurrentStep__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getGSSTestProcConcurrentStepKeyword_0()); }
	'GSSTestProcConcurrentStep'
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getGSSTestProcConcurrentStepKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__1__Impl
	rule__GSSTestProcConcurrentStep__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__2__Impl
	rule__GSSTestProcConcurrentStep__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__3__Impl
	rule__GSSTestProcConcurrentStep__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__4__Impl
	rule__GSSTestProcConcurrentStep__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdAssignment_4()); }
	(rule__GSSTestProcConcurrentStep__IdAssignment_4)
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__5__Impl
	rule__GSSTestProcConcurrentStep__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__6__Impl
	rule__GSSTestProcConcurrentStep__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcConcurrentStep__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getSemicolonKeyword_7()); }
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


rule__GSSTestProcTestProc__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
	}
:
	rule__GSSTestProcTestProc__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSTestProcTestProcAccess().getGroup_3_0()); }
					(rule__GSSTestProcTestProc__Group_3_0__0)
					{ after(grammarAccess.getGSSTestProcTestProcAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSTestProcTestProcAccess().getGroup_3_1()); }
					(rule__GSSTestProcTestProc__Group_3_1__0)
					{ after(grammarAccess.getGSSTestProcTestProcAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTestProcTestProcAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__UnorderedGroup_3__Impl
	rule__GSSTestProcTestProc__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTestProcTestProc__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSTestProcTestProcParserRuleCall_1_0()); }
		ruleGSSTestProcTestProc
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSTestProcTestProcParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcTestProc__StepAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcTestProcAccess().getStepGSSTestProcStepParserRuleCall_4_0()); }
		ruleGSSTestProcStep
		{ after(grammarAccess.getGSSTestProcTestProcAccess().getStepGSSTestProcStepParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcStepAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcStepAccess().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Prev_step_idrefAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefGSSTestProcStepCrossReference_10_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefGSSTestProcStepVersionedQualifiedReferenceNameParserRuleCall_10_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefGSSTestProcStepVersionedQualifiedReferenceNameParserRuleCall_10_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcStepAccess().getPrev_step_idrefGSSTestProcStepCrossReference_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Output_idref_from_prev_stepAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_11_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepGSSTestProcOutputVersionedQualifiedReferenceNameParserRuleCall_11_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepGSSTestProcOutputVersionedQualifiedReferenceNameParserRuleCall_11_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcStepAccess().getOutput_idref_from_prev_stepGSSTestProcOutputCrossReference_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__ModeAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getModeGSSTestProcModeEnumRuleCall_14_0()); }
		ruleGSSTestProcMode
		{ after(grammarAccess.getGSSTestProcStepAccess().getModeGSSTestProcModeEnumRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__ReplaysAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getReplaysINTEGERParserRuleCall_16_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcStepAccess().getReplaysINTEGERParserRuleCall_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__InputsAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getInputsGSSTestProcInputsParserRuleCall_17_0()); }
		ruleGSSTestProcInputs
		{ after(grammarAccess.getGSSTestProcStepAccess().getInputsGSSTestProcInputsParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__OutputsAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getOutputsGSSTestProcOutputsParserRuleCall_18_0()); }
		ruleGSSTestProcOutputs
		{ after(grammarAccess.getGSSTestProcStepAccess().getOutputsGSSTestProcOutputsParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__SpecialPacketsAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getSpecialPacketsGSSTestProcSpecialPacketsParserRuleCall_19_0()); }
		ruleGSSTestProcSpecialPackets
		{ after(grammarAccess.getGSSTestProcStepAccess().getSpecialPacketsGSSTestProcSpecialPacketsParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcStep__Concurrent_stepsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcStepAccess().getConcurrent_stepsGSSTestProcConcurrentStepsParserRuleCall_20_0()); }
		ruleGSSTestProcConcurrentSteps
		{ after(grammarAccess.getGSSTestProcStepAccess().getConcurrent_stepsGSSTestProcConcurrentStepsParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Input_level_3Assignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_3GSSTestProcInputLevel3ParserRuleCall_3_0_0()); }
		ruleGSSTestProcInputLevel3
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_3GSSTestProcInputLevel3ParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Input_level_2Assignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_2GSSTestProcInputLevel2ParserRuleCall_3_1_0()); }
		ruleGSSTestProcInputLevel2
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_2GSSTestProcInputLevel2ParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Input_level_1Assignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_1GSSTestProcInputLevel1ParserRuleCall_3_2_0()); }
		ruleGSSTestProcInputLevel1
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_1GSSTestProcInputLevel1ParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputs__Input_level_0Assignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputsAccess().getInput_level_0GSSTestProcInputLevel0ParserRuleCall_3_3_0()); }
		ruleGSSTestProcInputLevel0
		{ after(grammarAccess.getGSSTestProcInputsAccess().getInput_level_0GSSTestProcInputLevel0ParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__CheckmodeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeGSSTestProcCheckmodeEnumRuleCall_4_0()); }
		ruleGSSTestProcCheckmode
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getCheckmodeGSSTestProcCheckmodeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Valid_time_interval_valueAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_valueINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Valid_time_interval_unitAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitGSSTestProcUnitEnumRuleCall_12_0()); }
		ruleGSSTestProcUnit
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getValid_time_interval_unitGSSTestProcUnitEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Output_level_3Assignment_14_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_3GSSTestProcOutputLevel3ParserRuleCall_14_0_0()); }
		ruleGSSTestProcOutputLevel3
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_3GSSTestProcOutputLevel3ParserRuleCall_14_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Output_level_2Assignment_14_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_2GSSTestProcOutputLevel2ParserRuleCall_14_1_0()); }
		ruleGSSTestProcOutputLevel2
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_2GSSTestProcOutputLevel2ParserRuleCall_14_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Output_level_1Assignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_1GSSTestProcOutputLevel1ParserRuleCall_14_2_0()); }
		ruleGSSTestProcOutputLevel1
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_1GSSTestProcOutputLevel1ParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputs__Output_level_0Assignment_14_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_0GSSTestProcOutputLevel0ParserRuleCall_14_3_0()); }
		ruleGSSTestProcOutputLevel0
		{ after(grammarAccess.getGSSTestProcOutputsAccess().getOutput_level_0GSSTestProcOutputLevel0ParserRuleCall_14_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__EnableAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnableGSSTestProcEnableParserRuleCall_3_0_0()); }
		ruleGSSTestProcEnable
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnableGSSTestProcEnableParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__DisableAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisableGSSTestProcDisableParserRuleCall_3_1_0()); }
		ruleGSSTestProcDisable
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisableGSSTestProcDisableParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Enable_printAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnable_printGSSTestProcEnablePrintParserRuleCall_3_2_0()); }
		ruleGSSTestProcEnablePrint
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getEnable_printGSSTestProcEnablePrintParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcSpecialPackets__Disable_printAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisable_printGSSTestProcDisablePrintParserRuleCall_3_3_0()); }
		ruleGSSTestProcDisablePrint
		{ after(grammarAccess.getGSSTestProcSpecialPacketsAccess().getDisable_printGSSTestProcDisablePrintParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__NextStepAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepGSSTestProcNextStepParserRuleCall_4_0()); }
		ruleGSSTestProcNextStep
		{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getNextStepGSSTestProcNextStepParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentSteps__Concurrent_stepAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepGSSTestProcConcurrentStepParserRuleCall_6_0()); }
		ruleGSSTestProcConcurrentStep
		{ after(grammarAccess.getGSSTestProcConcurrentStepsAccess().getConcurrent_stepGSSTestProcConcurrentStepParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Delay_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Delay_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
		ruleGSSTestProcUnit
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level3Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__App_to_level3Assignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3GSSExportExportCrossReference_21_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getApp_to_level3GSSExportExportCrossReference_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level2Assignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level3_to_level2Assignment_24_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2GSSExportExportCrossReference_24_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel3_to_level2GSSExportExportCrossReference_24_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level1Assignment_25_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_25_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_25_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_25_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_25_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level2_to_level1Assignment_26_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1GSSExportExportCrossReference_26_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel2_to_level1GSSExportExportCrossReference_26_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level0Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel3__Level1_to_level0Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel3Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Delay_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Delay_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
		ruleGSSTestProcUnit
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Level2Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__App_to_level2Assignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2GSSExportExportCrossReference_21_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getApp_to_level2GSSExportExportCrossReference_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Level1Assignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Level2_to_level1Assignment_24_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_24_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_24_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Level0Assignment_25_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_25_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_25_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_25_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_25_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel2__Level1_to_level0Assignment_26_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_26_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_26_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_26_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Delay_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Delay_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
		ruleGSSTestProcUnit
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Level1Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__App_to_level1Assignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1GSSExportExportCrossReference_21_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getApp_to_level1GSSExportExportCrossReference_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Level0Assignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel1__Level1_to_level0Assignment_24_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_24_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_24_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Delay_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Delay_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
		ruleGSSTestProcUnit
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getDelay_unitGSSTestProcUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__Level0Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcInputLevel0__App_to_level0Assignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0GSSExportExportCrossReference_21_0()); }
		(
			{ before(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_21_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcInputLevel0Access().getApp_to_level0GSSExportExportCrossReference_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__OptionalAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level3Assignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level3_filterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_filterGSSTestProcLevel3FilterParserRuleCall_16_0()); }
		ruleGSSTestProcLevel3Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_filterGSSTestProcLevel3FilterParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level2Assignment_17_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_17_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_17_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_17_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_17_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level3_from_level2Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2GSSImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2GSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2GSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel3_from_level2GSSImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level2_filterAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_19_0()); }
		ruleGSSTestProcLevel2Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level1Assignment_20_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_20_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_20_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_20_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_20_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level2_from_level1Assignment_21_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1GSSImportImportCrossReference_21_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1GSSImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1GSSImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel2_from_level1GSSImportImportCrossReference_21_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level1_filterAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_22_0()); }
		ruleGSSTestProcLevel1Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level0Assignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level1_from_level0Assignment_24_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0GSSImportImportCrossReference_24_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0GSSImportImportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0GSSImportImportVersionedQualifiedNameParserRuleCall_24_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel1_from_level0GSSImportImportCrossReference_24_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel3__Level0_filterAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_25_0()); }
		ruleGSSTestProcLevel0Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel3Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__OptionalAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level2Assignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level2_filterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_16_0()); }
		ruleGSSTestProcLevel2Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_filterGSSTestProcLevel2FilterParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level1Assignment_17_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_17_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_17_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_17_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_17_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level2_from_level1Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1GSSImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1GSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1GSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel2_from_level1GSSImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level1_filterAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_19_0()); }
		ruleGSSTestProcLevel1Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level0Assignment_20_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_20_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_20_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_20_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_20_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level1_from_level0Assignment_21_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0GSSImportImportCrossReference_21_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0GSSImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0GSSImportImportVersionedQualifiedNameParserRuleCall_21_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel1_from_level0GSSImportImportCrossReference_21_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel2__Level0_filterAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_22_0()); }
		ruleGSSTestProcLevel0Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel2Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__OptionalAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Level1Assignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Level1_filterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_16_0()); }
		ruleGSSTestProcLevel1Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_filterGSSTestProcLevel1FilterParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Level0Assignment_17_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_17_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_17_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_17_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_17_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Level1_from_level0Assignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0GSSImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0GSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0GSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel1_from_level0GSSImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel1__Level0_filterAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_19_0()); }
		ruleGSSTestProcLevel0Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel1Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__OptionalAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getOptionalINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Level0Assignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatVersionedQualifiedNameParserRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0GSSTmTcFormatTmTcFormatCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcOutputLevel0__Level0_filterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_16_0()); }
		ruleGSSTestProcLevel0Filter
		{ after(grammarAccess.getGSSTestProcOutputLevel0Access().getLevel0_filterGSSTestProcLevel0FilterParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Apply_def_filterAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
		ruleGSSTestProcYesNo
		{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel3Filter__Extra_filterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcLevel3FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Apply_def_filterAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
		ruleGSSTestProcYesNo
		{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel2Filter__Extra_filterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcLevel2FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Apply_def_filterAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
		ruleGSSTestProcYesNo
		{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel1Filter__Extra_filterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcLevel1FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Apply_def_filterAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
		ruleGSSTestProcYesNo
		{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getApply_def_filterGSSTestProcYesNoEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcLevel0Filter__Extra_filterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTestProcLevel0FilterAccess().getExtra_filterGSSFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnable__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcEnableAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcEnableAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisable__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcDisableAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcDisableAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcEnablePrint__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcEnablePrintAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcEnablePrintAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcDisablePrint__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcDisablePrintAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcDisablePrintAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcNextStepAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcNextStepAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcNextStep__IsConcurrentAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0()); }
		ruleGSSTestProcYesNo
		{ after(grammarAccess.getGSSTestProcNextStepAccess().getIsConcurrentGSSTestProcYesNoEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTestProcConcurrentStep__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSTestProcConcurrentStepAccess().getIdINTEGERParserRuleCall_4_0()); }
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
