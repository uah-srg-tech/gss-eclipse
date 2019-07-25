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
grammar InternalENVIRONMENT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.environment.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.environment.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;

}
@parser::members {
	private ENVIRONMENTGrammarAccess grammarAccess;

	public void setGrammarAccess(ENVIRONMENTGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSEnvironmentGSSEnvironment
entryRuleGSSEnvironmentGSSEnvironment
:
{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentRule()); }
	 ruleGSSEnvironmentGSSEnvironment
{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGSSEnvironment
ruleGSSEnvironmentGSSEnvironment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGroup()); }
		(rule__GSSEnvironmentGSSEnvironment__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentScenario
entryRuleGSSEnvironmentScenario
:
{ before(grammarAccess.getGSSEnvironmentScenarioRule()); }
	 ruleGSSEnvironmentScenario
{ after(grammarAccess.getGSSEnvironmentScenarioRule()); } 
	 EOF 
;

// Rule GSSEnvironmentScenario
ruleGSSEnvironmentScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getGroup()); }
		(rule__GSSEnvironmentScenario__Group__0)
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentOptions
entryRuleGSSEnvironmentOptions
:
{ before(grammarAccess.getGSSEnvironmentOptionsRule()); }
	 ruleGSSEnvironmentOptions
{ after(grammarAccess.getGSSEnvironmentOptionsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentOptions
ruleGSSEnvironmentOptions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getGroup()); }
		(rule__GSSEnvironmentOptions__Group__0)
		{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentProtocols
entryRuleGSSEnvironmentProtocols
:
{ before(grammarAccess.getGSSEnvironmentProtocolsRule()); }
	 ruleGSSEnvironmentProtocols
{ after(grammarAccess.getGSSEnvironmentProtocolsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentProtocols
ruleGSSEnvironmentProtocols 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getGroup()); }
		(rule__GSSEnvironmentProtocols__Group__0)
		{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentInterfaces
entryRuleGSSEnvironmentInterfaces
:
{ before(grammarAccess.getGSSEnvironmentInterfacesRule()); }
	 ruleGSSEnvironmentInterfaces
{ after(grammarAccess.getGSSEnvironmentInterfacesRule()); } 
	 EOF 
;

// Rule GSSEnvironmentInterfaces
ruleGSSEnvironmentInterfaces 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getGroup()); }
		(rule__GSSEnvironmentInterfaces__Group__0)
		{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentSpecialPackets
entryRuleGSSEnvironmentSpecialPackets
:
{ before(grammarAccess.getGSSEnvironmentSpecialPacketsRule()); }
	 ruleGSSEnvironmentSpecialPackets
{ after(grammarAccess.getGSSEnvironmentSpecialPacketsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentSpecialPackets
ruleGSSEnvironmentSpecialPackets 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGroup()); }
		(rule__GSSEnvironmentSpecialPackets__Group__0)
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPeriodicTCs
entryRuleGSSEnvironmentPeriodicTCs
:
{ before(grammarAccess.getGSSEnvironmentPeriodicTCsRule()); }
	 ruleGSSEnvironmentPeriodicTCs
{ after(grammarAccess.getGSSEnvironmentPeriodicTCsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentPeriodicTCs
ruleGSSEnvironmentPeriodicTCs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGroup()); }
		(rule__GSSEnvironmentPeriodicTCs__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGlobalVars
entryRuleGSSEnvironmentGlobalVars
:
{ before(grammarAccess.getGSSEnvironmentGlobalVarsRule()); }
	 ruleGSSEnvironmentGlobalVars
{ after(grammarAccess.getGSSEnvironmentGlobalVarsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGlobalVars
ruleGSSEnvironmentGlobalVars 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGroup()); }
		(rule__GSSEnvironmentGlobalVars__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentMonitors
entryRuleGSSEnvironmentMonitors
:
{ before(grammarAccess.getGSSEnvironmentMonitorsRule()); }
	 ruleGSSEnvironmentMonitors
{ after(grammarAccess.getGSSEnvironmentMonitorsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentMonitors
ruleGSSEnvironmentMonitors 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getGroup()); }
		(rule__GSSEnvironmentMonitors__Group__0)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGSSInfo
entryRuleGSSEnvironmentGSSInfo
:
{ before(grammarAccess.getGSSEnvironmentGSSInfoRule()); }
	 ruleGSSEnvironmentGSSInfo
{ after(grammarAccess.getGSSEnvironmentGSSInfoRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGSSInfo
ruleGSSEnvironmentGSSInfo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGroup()); }
		(rule__GSSEnvironmentGSSInfo__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGSSInfoPrint
entryRuleGSSEnvironmentGSSInfoPrint
:
{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintRule()); }
	 ruleGSSEnvironmentGSSInfoPrint
{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGSSInfoPrint
ruleGSSEnvironmentGSSInfoPrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGroup()); }
		(rule__GSSEnvironmentGSSInfoPrint__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPhyHeaderPrint
entryRuleGSSEnvironmentPhyHeaderPrint
:
{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule()); }
	 ruleGSSEnvironmentPhyHeaderPrint
{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule()); } 
	 EOF 
;

// Rule GSSEnvironmentPhyHeaderPrint
ruleGSSEnvironmentPhyHeaderPrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGroup()); }
		(rule__GSSEnvironmentPhyHeaderPrint__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGSSDiscardErrorFlags
entryRuleGSSEnvironmentGSSDiscardErrorFlags
:
{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule()); }
	 ruleGSSEnvironmentGSSDiscardErrorFlags
{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGSSDiscardErrorFlags
ruleGSSEnvironmentGSSDiscardErrorFlags 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGroup()); }
		(rule__GSSEnvironmentGSSDiscardErrorFlags__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentProtocol
entryRuleGSSEnvironmentProtocol
:
{ before(grammarAccess.getGSSEnvironmentProtocolRule()); }
	 ruleGSSEnvironmentProtocol
{ after(grammarAccess.getGSSEnvironmentProtocolRule()); } 
	 EOF 
;

// Rule GSSEnvironmentProtocol
ruleGSSEnvironmentProtocol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getGroup()); }
		(rule__GSSEnvironmentProtocol__Group__0)
		{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentMainInterface
entryRuleGSSEnvironmentMainInterface
:
{ before(grammarAccess.getGSSEnvironmentMainInterfaceRule()); }
	 ruleGSSEnvironmentMainInterface
{ after(grammarAccess.getGSSEnvironmentMainInterfaceRule()); } 
	 EOF 
;

// Rule GSSEnvironmentMainInterface
ruleGSSEnvironmentMainInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup()); }
		(rule__GSSEnvironmentMainInterface__Group__0)
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentInterface
entryRuleGSSEnvironmentInterface
:
{ before(grammarAccess.getGSSEnvironmentInterfaceRule()); }
	 ruleGSSEnvironmentInterface
{ after(grammarAccess.getGSSEnvironmentInterfaceRule()); } 
	 EOF 
;

// Rule GSSEnvironmentInterface
ruleGSSEnvironmentInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getGroup()); }
		(rule__GSSEnvironmentInterface__Group__0)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentLevelInOut
entryRuleGSSEnvironmentLevelInOut
:
{ before(grammarAccess.getGSSEnvironmentLevelInOutRule()); }
	 ruleGSSEnvironmentLevelInOut
{ after(grammarAccess.getGSSEnvironmentLevelInOutRule()); } 
	 EOF 
;

// Rule GSSEnvironmentLevelInOut
ruleGSSEnvironmentLevelInOut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup()); }
		(rule__GSSEnvironmentLevelInOut__Group__0)
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentLevelIn
entryRuleGSSEnvironmentLevelIn
:
{ before(grammarAccess.getGSSEnvironmentLevelInRule()); }
	 ruleGSSEnvironmentLevelIn
{ after(grammarAccess.getGSSEnvironmentLevelInRule()); } 
	 EOF 
;

// Rule GSSEnvironmentLevelIn
ruleGSSEnvironmentLevelIn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getGroup()); }
		(rule__GSSEnvironmentLevelIn__Group__0)
		{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentLevelOut
entryRuleGSSEnvironmentLevelOut
:
{ before(grammarAccess.getGSSEnvironmentLevelOutRule()); }
	 ruleGSSEnvironmentLevelOut
{ after(grammarAccess.getGSSEnvironmentLevelOutRule()); } 
	 EOF 
;

// Rule GSSEnvironmentLevelOut
ruleGSSEnvironmentLevelOut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getGroup()); }
		(rule__GSSEnvironmentLevelOut__Group__0)
		{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentSpecialPacket
entryRuleGSSEnvironmentSpecialPacket
:
{ before(grammarAccess.getGSSEnvironmentSpecialPacketRule()); }
	 ruleGSSEnvironmentSpecialPacket
{ after(grammarAccess.getGSSEnvironmentSpecialPacketRule()); } 
	 EOF 
;

// Rule GSSEnvironmentSpecialPacket
ruleGSSEnvironmentSpecialPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGroup()); }
		(rule__GSSEnvironmentSpecialPacket__Group__0)
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentUpperLevels
entryRuleGSSEnvironmentUpperLevels
:
{ before(grammarAccess.getGSSEnvironmentUpperLevelsRule()); }
	 ruleGSSEnvironmentUpperLevels
{ after(grammarAccess.getGSSEnvironmentUpperLevelsRule()); } 
	 EOF 
;

// Rule GSSEnvironmentUpperLevels
ruleGSSEnvironmentUpperLevels 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGroup()); }
		(rule__GSSEnvironmentUpperLevels__Group__0)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPrintingData
entryRuleGSSEnvironmentPrintingData
:
{ before(grammarAccess.getGSSEnvironmentPrintingDataRule()); }
	 ruleGSSEnvironmentPrintingData
{ after(grammarAccess.getGSSEnvironmentPrintingDataRule()); } 
	 EOF 
;

// Rule GSSEnvironmentPrintingData
ruleGSSEnvironmentPrintingData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getGroup()); }
		(rule__GSSEnvironmentPrintingData__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPeriod
entryRuleGSSEnvironmentPeriod
:
{ before(grammarAccess.getGSSEnvironmentPeriodRule()); }
	 ruleGSSEnvironmentPeriod
{ after(grammarAccess.getGSSEnvironmentPeriodRule()); } 
	 EOF 
;

// Rule GSSEnvironmentPeriod
ruleGSSEnvironmentPeriod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getGroup()); }
		(rule__GSSEnvironmentPeriod__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentIntervalRange
entryRuleGSSEnvironmentIntervalRange
:
{ before(grammarAccess.getGSSEnvironmentIntervalRangeRule()); }
	 ruleGSSEnvironmentIntervalRange
{ after(grammarAccess.getGSSEnvironmentIntervalRangeRule()); } 
	 EOF 
;

// Rule GSSEnvironmentIntervalRange
ruleGSSEnvironmentIntervalRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGroup()); }
		(rule__GSSEnvironmentIntervalRange__Group__0)
		{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentUpperLevel
entryRuleGSSEnvironmentUpperLevel
:
{ before(grammarAccess.getGSSEnvironmentUpperLevelRule()); }
	 ruleGSSEnvironmentUpperLevel
{ after(grammarAccess.getGSSEnvironmentUpperLevelRule()); } 
	 EOF 
;

// Rule GSSEnvironmentUpperLevel
ruleGSSEnvironmentUpperLevel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup()); }
		(rule__GSSEnvironmentUpperLevel__Group__0)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentStructuredData
entryRuleGSSEnvironmentStructuredData
:
{ before(grammarAccess.getGSSEnvironmentStructuredDataRule()); }
	 ruleGSSEnvironmentStructuredData
{ after(grammarAccess.getGSSEnvironmentStructuredDataRule()); } 
	 EOF 
;

// Rule GSSEnvironmentStructuredData
ruleGSSEnvironmentStructuredData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getGroup()); }
		(rule__GSSEnvironmentStructuredData__Group__0)
		{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPeriodicTCLevel2
entryRuleGSSEnvironmentPeriodicTCLevel2
:
{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule()); }
	 ruleGSSEnvironmentPeriodicTCLevel2
{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule()); } 
	 EOF 
;

// Rule GSSEnvironmentPeriodicTCLevel2
ruleGSSEnvironmentPeriodicTCLevel2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup()); }
		(rule__GSSEnvironmentPeriodicTCLevel2__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPeriodicTCLevel1
entryRuleGSSEnvironmentPeriodicTCLevel1
:
{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule()); }
	 ruleGSSEnvironmentPeriodicTCLevel1
{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule()); } 
	 EOF 
;

// Rule GSSEnvironmentPeriodicTCLevel1
ruleGSSEnvironmentPeriodicTCLevel1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup()); }
		(rule__GSSEnvironmentPeriodicTCLevel1__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPeriodicTCLevel0
entryRuleGSSEnvironmentPeriodicTCLevel0
:
{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule()); }
	 ruleGSSEnvironmentPeriodicTCLevel0
{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule()); } 
	 EOF 
;

// Rule GSSEnvironmentPeriodicTCLevel0
ruleGSSEnvironmentPeriodicTCLevel0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGroup()); }
		(rule__GSSEnvironmentPeriodicTCLevel0__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGlobalVar
entryRuleGSSEnvironmentGlobalVar
:
{ before(grammarAccess.getGSSEnvironmentGlobalVarRule()); }
	 ruleGSSEnvironmentGlobalVar
{ after(grammarAccess.getGSSEnvironmentGlobalVarRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGlobalVar
ruleGSSEnvironmentGlobalVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getGroup()); }
		(rule__GSSEnvironmentGlobalVar__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentReferenceField
entryRuleGSSEnvironmentReferenceField
:
{ before(grammarAccess.getGSSEnvironmentReferenceFieldRule()); }
	 ruleGSSEnvironmentReferenceField
{ after(grammarAccess.getGSSEnvironmentReferenceFieldRule()); } 
	 EOF 
;

// Rule GSSEnvironmentReferenceField
ruleGSSEnvironmentReferenceField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGroup()); }
		(rule__GSSEnvironmentReferenceField__Group__0)
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentReferencePeriodicTC
entryRuleGSSEnvironmentReferencePeriodicTC
:
{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule()); }
	 ruleGSSEnvironmentReferencePeriodicTC
{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule()); } 
	 EOF 
;

// Rule GSSEnvironmentReferencePeriodicTC
ruleGSSEnvironmentReferencePeriodicTC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGroup()); }
		(rule__GSSEnvironmentReferencePeriodicTC__Group__0)
		{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentReferenceSpecialPacket
entryRuleGSSEnvironmentReferenceSpecialPacket
:
{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule()); }
	 ruleGSSEnvironmentReferenceSpecialPacket
{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule()); } 
	 EOF 
;

// Rule GSSEnvironmentReferenceSpecialPacket
ruleGSSEnvironmentReferenceSpecialPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGroup()); }
		(rule__GSSEnvironmentReferenceSpecialPacket__Group__0)
		{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentPlot
entryRuleGSSEnvironmentPlot
:
{ before(grammarAccess.getGSSEnvironmentPlotRule()); }
	 ruleGSSEnvironmentPlot
{ after(grammarAccess.getGSSEnvironmentPlotRule()); } 
	 EOF 
;

// Rule GSSEnvironmentPlot
ruleGSSEnvironmentPlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getGroup()); }
		(rule__GSSEnvironmentPlot__Group__0)
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentAlarmMsg
entryRuleGSSEnvironmentAlarmMsg
:
{ before(grammarAccess.getGSSEnvironmentAlarmMsgRule()); }
	 ruleGSSEnvironmentAlarmMsg
{ after(grammarAccess.getGSSEnvironmentAlarmMsgRule()); } 
	 EOF 
;

// Rule GSSEnvironmentAlarmMsg
ruleGSSEnvironmentAlarmMsg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGroup()); }
		(rule__GSSEnvironmentAlarmMsg__Group__0)
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentModify
entryRuleGSSEnvironmentModify
:
{ before(grammarAccess.getGSSEnvironmentModifyRule()); }
	 ruleGSSEnvironmentModify
{ after(grammarAccess.getGSSEnvironmentModifyRule()); } 
	 EOF 
;

// Rule GSSEnvironmentModify
ruleGSSEnvironmentModify 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getGroup()); }
		(rule__GSSEnvironmentModify__Group__0)
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentAlarmVal
entryRuleGSSEnvironmentAlarmVal
:
{ before(grammarAccess.getGSSEnvironmentAlarmValRule()); }
	 ruleGSSEnvironmentAlarmVal
{ after(grammarAccess.getGSSEnvironmentAlarmValRule()); } 
	 EOF 
;

// Rule GSSEnvironmentAlarmVal
ruleGSSEnvironmentAlarmVal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getGroup()); }
		(rule__GSSEnvironmentAlarmVal__Group__0)
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGVFiltered
entryRuleGSSEnvironmentGVFiltered
:
{ before(grammarAccess.getGSSEnvironmentGVFilteredRule()); }
	 ruleGSSEnvironmentGVFiltered
{ after(grammarAccess.getGSSEnvironmentGVFilteredRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGVFiltered
ruleGSSEnvironmentGVFiltered 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGroup()); }
		(rule__GSSEnvironmentGVFiltered__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSEnvironmentGVPeriodic
entryRuleGSSEnvironmentGVPeriodic
:
{ before(grammarAccess.getGSSEnvironmentGVPeriodicRule()); }
	 ruleGSSEnvironmentGVPeriodic
{ after(grammarAccess.getGSSEnvironmentGVPeriodicRule()); } 
	 EOF 
;

// Rule GSSEnvironmentGVPeriodic
ruleGSSEnvironmentGVPeriodic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGroup()); }
		(rule__GSSEnvironmentGVPeriodic__Group__0)
		{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGroup()); }
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

// Entry rule entryRuleDATE
entryRuleDATE
:
{ before(grammarAccess.getDATERule()); }
	 ruleDATE
{ after(grammarAccess.getDATERule()); } 
	 EOF 
;

// Rule DATE
ruleDATE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDATEAccess().getGroup()); }
		(rule__DATE__Group__0)
		{ after(grammarAccess.getDATEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleURL
entryRuleURL
:
{ before(grammarAccess.getURLRule()); }
	 ruleURL
{ after(grammarAccess.getURLRule()); } 
	 EOF 
;

// Rule URL
ruleURL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getURLAccess().getGroup()); }
		(rule__URL__Group__0)
		{ after(grammarAccess.getURLAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentEnableDisable
ruleGSSEnvironmentEnableDisable
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentEnableDisableAccess().getAlternatives()); }
		(rule__GSSEnvironmentEnableDisable__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentEnableDisableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentInterfaceType
ruleGSSEnvironmentInterfaceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getAlternatives()); }
		(rule__GSSEnvironmentInterfaceType__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentInterfaceIOType
ruleGSSEnvironmentInterfaceIOType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getAlternatives()); }
		(rule__GSSEnvironmentInterfaceIOType__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentUpperLevelLevel
ruleGSSEnvironmentUpperLevelLevel
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().getAlternatives()); }
		(rule__GSSEnvironmentUpperLevelLevel__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentUnit
ruleGSSEnvironmentUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUnitAccess().getAlternatives()); }
		(rule__GSSEnvironmentUnit__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentGlobalVarType
ruleGSSEnvironmentGlobalVarType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getAlternatives()); }
		(rule__GSSEnvironmentGlobalVarType__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentReferenceFieldType
ruleGSSEnvironmentReferenceFieldType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getAlternatives()); }
		(rule__GSSEnvironmentReferenceFieldType__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentAlarmMsgType
ruleGSSEnvironmentAlarmMsgType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlternatives()); }
		(rule__GSSEnvironmentAlarmMsgType__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentModifyType
ruleGSSEnvironmentModifyType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyTypeAccess().getAlternatives()); }
		(rule__GSSEnvironmentModifyType__Alternatives)
		{ after(grammarAccess.getGSSEnvironmentModifyTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSEnvironmentAlarmValType
ruleGSSEnvironmentAlarmValType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration()); }
		('alarm1')
		{ after(grammarAccess.getGSSEnvironmentAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0()); }
		(rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_2Assignment_3_0)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1()); }
		(rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_1Assignment_3_1)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2()); }
		(rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_0Assignment_3_2)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotAssignment_3_0()); }
		(rule__GSSEnvironmentMonitors__PlotAssignment_3_0)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgAssignment_3_1()); }
		(rule__GSSEnvironmentMonitors__AlarmMsgAssignment_3_1)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyAssignment_3_2()); }
		(rule__GSSEnvironmentMonitors__ModifyAssignment_3_2)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyAssignment_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValAssignment_3_3()); }
		(rule__GSSEnvironmentMonitors__AlarmValAssignment_3_3)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValAssignment_3_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Alternatives_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutAssignment_23_0()); }
		(rule__GSSEnvironmentInterface__LevelInOutAssignment_23_0)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutAssignment_23_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInAssignment_23_1()); }
		(rule__GSSEnvironmentInterface__LevelInAssignment_23_1)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInAssignment_23_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutAssignment_23_2()); }
		(rule__GSSEnvironmentInterface__LevelOutAssignment_23_2)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutAssignment_23_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Alternatives_32
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodAssignment_32_0()); }
		(rule__GSSEnvironmentSpecialPacket__PeriodAssignment_32_0)
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodAssignment_32_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeAssignment_32_1()); }
		(rule__GSSEnvironmentSpecialPacket__IntervalRangeAssignment_32_1)
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeAssignment_32_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Alternatives_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldAssignment_18_0()); }
		(rule__GSSEnvironmentGlobalVar__ReferenceFieldAssignment_18_0)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldAssignment_18_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCAssignment_18_1()); }
		(rule__GSSEnvironmentGlobalVar__ReferencePeriodicTCAssignment_18_1)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCAssignment_18_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2()); }
		(rule__GSSEnvironmentGlobalVar__ReferenceSpecialPacketAssignment_18_2)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Alternatives_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredAssignment_10_0()); }
		(rule__GSSEnvironmentPlot__GVFilteredAssignment_10_0)
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredAssignment_10_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicAssignment_10_1()); }
		(rule__GSSEnvironmentPlot__GVPeriodicAssignment_10_1)
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicAssignment_10_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Alternatives_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredAssignment_14_0()); }
		(rule__GSSEnvironmentAlarmMsg__GVFilteredAssignment_14_0)
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredAssignment_14_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicAssignment_14_1()); }
		(rule__GSSEnvironmentAlarmMsg__GVPeriodicAssignment_14_1)
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicAssignment_14_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Alternatives_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredAssignment_14_0()); }
		(rule__GSSEnvironmentModify__GVFilteredAssignment_14_0)
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredAssignment_14_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicAssignment_14_1()); }
		(rule__GSSEnvironmentModify__GVPeriodicAssignment_14_1)
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicAssignment_14_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Alternatives_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredAssignment_10_0()); }
		(rule__GSSEnvironmentAlarmVal__GVFilteredAssignment_10_0)
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredAssignment_10_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicAssignment_10_1()); }
		(rule__GSSEnvironmentAlarmVal__GVPeriodicAssignment_10_1)
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicAssignment_10_1()); }
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

rule__GSSEnvironmentEnableDisable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
		('disabled')
		{ after(grammarAccess.getGSSEnvironmentEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
		('enabled')
		{ after(grammarAccess.getGSSEnvironmentEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
		('SpW')
		{ after(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1()); }
		('SpW_TC')
		{ after(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2()); }
		('SpW_Error')
		{ after(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getUartEnumLiteralDeclaration_3()); }
		('uart')
		{ after(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getUartEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4()); }
		('dummy')
		{ after(grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaceIOType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0()); }
		('in_out')
		{ after(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1()); }
		('in')
		{ after(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2()); }
		('out')
		{ after(grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevelLevel__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0()); }
		('_1')
		{ after(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1()); }
		('_2')
		{ after(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2()); }
		('_3')
		{ after(grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
		('miliseconds')
		{ after(grammarAccess.getGSSEnvironmentUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
		('seconds')
		{ after(grammarAccess.getGSSEnvironmentUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVarType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0()); }
		('uint')
		{ after(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1()); }
		('formula')
		{ after(grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceFieldType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0()); }
		('tm')
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1()); }
		('tc')
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsgType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0()); }
		('alarm1')
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1()); }
		('alarm2')
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2()); }
		('alarm3')
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModifyType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrementEnumLiteralDeclaration_0()); }
		('increment')
		{ after(grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrementEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1()); }
		('increment1wrap')
		{ after(grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1()); }
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


rule__GSSEnvironmentGSSEnvironment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__0__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0()); }
	'GSSEnvironmentEnvironment'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__1__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameAssignment_1()); }
	(rule__GSSEnvironmentGSSEnvironment__NameAssignment_1)
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__2__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__3__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGroup_3()); }
	(rule__GSSEnvironmentGSSEnvironment__Group_3__0)
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__4__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionKeyword_4()); }
	'version'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__5__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__6__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionAssignment_6()); }
	(rule__GSSEnvironmentGSSEnvironment__VersionAssignment_6)
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__7__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__8__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioAssignment_8()); }
	(rule__GSSEnvironmentGSSEnvironment__ScenarioAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__9__Impl
	rule__GSSEnvironmentGSSEnvironment__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGSSEnvironment__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group_3__0__Impl
	rule__GSSEnvironmentGSSEnvironment__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriKeyword_3_0()); }
	'uri'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group_3__1__Impl
	rule__GSSEnvironmentGSSEnvironment__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_3_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group_3__2__Impl
	rule__GSSEnvironmentGSSEnvironment__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriAssignment_3_2()); }
	(rule__GSSEnvironmentGSSEnvironment__UriAssignment_3_2)
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSEnvironment__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_3_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentScenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__0__Impl
	rule__GSSEnvironmentScenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getGSSEnvironmentScenarioKeyword_0()); }
	'GSSEnvironmentScenario'
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getGSSEnvironmentScenarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__1__Impl
	rule__GSSEnvironmentScenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getNameAssignment_1()); }
	(rule__GSSEnvironmentScenario__NameAssignment_1)
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__2__Impl
	rule__GSSEnvironmentScenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__3__Impl
	rule__GSSEnvironmentScenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getIdKeyword_3()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__4__Impl
	rule__GSSEnvironmentScenario__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getColonEqualsSignKeyword_4()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getColonEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__5__Impl
	rule__GSSEnvironmentScenario__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getIdAssignment_5()); }
	(rule__GSSEnvironmentScenario__IdAssignment_5)
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getIdAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__6__Impl
	rule__GSSEnvironmentScenario__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__7__Impl
	rule__GSSEnvironmentScenario__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsAssignment_7()); }
	(rule__GSSEnvironmentScenario__Gss_optionsAssignment_7)
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__8__Impl
	rule__GSSEnvironmentScenario__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsAssignment_8()); }
	(rule__GSSEnvironmentScenario__ProtocolsAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__9__Impl
	rule__GSSEnvironmentScenario__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesAssignment_9()); }
	(rule__GSSEnvironmentScenario__InterfacesAssignment_9)
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__10__Impl
	rule__GSSEnvironmentScenario__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsAssignment_10()); }
	(rule__GSSEnvironmentScenario__SpecialPacketsAssignment_10)?
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__11__Impl
	rule__GSSEnvironmentScenario__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsAssignment_11()); }
	(rule__GSSEnvironmentScenario__PeriodicTCsAssignment_11)?
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__12__Impl
	rule__GSSEnvironmentScenario__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12()); }
	(rule__GSSEnvironmentScenario__UnorderedGroup_12)?
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__13__Impl
	rule__GSSEnvironmentScenario__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentOptions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__0__Impl
	rule__GSSEnvironmentOptions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getGSSEnvironmentOptionsKeyword_0()); }
	'GSSEnvironmentOptions'
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getGSSEnvironmentOptionsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__1__Impl
	rule__GSSEnvironmentOptions__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__2__Impl
	rule__GSSEnvironmentOptions__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoAssignment_2()); }
	(rule__GSSEnvironmentOptions__Gss_infoAssignment_2)
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__3__Impl
	rule__GSSEnvironmentOptions__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printAssignment_3()); }
	(rule__GSSEnvironmentOptions__Gss_info_printAssignment_3)
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__4__Impl
	rule__GSSEnvironmentOptions__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printAssignment_4()); }
	(rule__GSSEnvironmentOptions__Phy_header_printAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__5__Impl
	rule__GSSEnvironmentOptions__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsAssignment_5()); }
	(rule__GSSEnvironmentOptions__DiscardErrorFlagsAssignment_5)
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__6__Impl
	rule__GSSEnvironmentOptions__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentOptions__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentProtocols__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocols__Group__0__Impl
	rule__GSSEnvironmentProtocols__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getGSSEnvironmentProtocolsKeyword_0()); }
	'GSSEnvironmentProtocols'
	{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getGSSEnvironmentProtocolsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocols__Group__1__Impl
	rule__GSSEnvironmentProtocols__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocols__Group__2__Impl
	rule__GSSEnvironmentProtocols__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolAssignment_2()); }
		(rule__GSSEnvironmentProtocols__ProtocolAssignment_2)
		{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolAssignment_2()); }
		(rule__GSSEnvironmentProtocols__ProtocolAssignment_2)*
		{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocols__Group__3__Impl
	rule__GSSEnvironmentProtocols__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocols__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentInterfaces__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterfaces__Group__0__Impl
	rule__GSSEnvironmentInterfaces__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getGSSEnvironmentInterfacesKeyword_0()); }
	'GSSEnvironmentInterfaces'
	{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getGSSEnvironmentInterfacesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterfaces__Group__1__Impl
	rule__GSSEnvironmentInterfaces__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterfaces__Group__2__Impl
	rule__GSSEnvironmentInterfaces__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceAssignment_2()); }
	(rule__GSSEnvironmentInterfaces__MainInterfaceAssignment_2)
	{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterfaces__Group__3__Impl
	rule__GSSEnvironmentInterfaces__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceAssignment_3()); }
	(rule__GSSEnvironmentInterfaces__InterfaceAssignment_3)*
	{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterfaces__Group__4__Impl
	rule__GSSEnvironmentInterfaces__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterfaces__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentSpecialPackets__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPackets__Group__0__Impl
	rule__GSSEnvironmentSpecialPackets__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGSSEnvironmentSpecialPacketsKeyword_0()); }
	'GSSEnvironmentSpecialPackets'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGSSEnvironmentSpecialPacketsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPackets__Group__1__Impl
	rule__GSSEnvironmentSpecialPackets__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPackets__Group__2__Impl
	rule__GSSEnvironmentSpecialPackets__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
	(rule__GSSEnvironmentSpecialPackets__SpecialPacketAssignment_2)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPackets__Group__3__Impl
	rule__GSSEnvironmentSpecialPackets__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPackets__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCs__Group__0__Impl
	rule__GSSEnvironmentPeriodicTCs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsAction_0()); }
	()
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCs__Group__1__Impl
	rule__GSSEnvironmentPeriodicTCs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsKeyword_1()); }
	'GSSEnvironmentPeriodicTCs'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCs__Group__2__Impl
	rule__GSSEnvironmentPeriodicTCs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCs__Group__3__Impl
	rule__GSSEnvironmentPeriodicTCs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getAlternatives_3()); }
	(rule__GSSEnvironmentPeriodicTCs__Alternatives_3)*
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCs__Group__4__Impl
	rule__GSSEnvironmentPeriodicTCs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGlobalVars__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVars__Group__0__Impl
	rule__GSSEnvironmentGlobalVars__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGSSEnvironmentGlobalVarsKeyword_0()); }
	'GSSEnvironmentGlobalVars'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGSSEnvironmentGlobalVarsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVars__Group__1__Impl
	rule__GSSEnvironmentGlobalVars__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVars__Group__2__Impl
	rule__GSSEnvironmentGlobalVars__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarAssignment_2()); }
		(rule__GSSEnvironmentGlobalVars__GlobalVarAssignment_2)
		{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarAssignment_2()); }
		(rule__GSSEnvironmentGlobalVars__GlobalVarAssignment_2)*
		{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVars__Group__3__Impl
	rule__GSSEnvironmentGlobalVars__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVars__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentMonitors__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group__0__Impl
	rule__GSSEnvironmentMonitors__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getGSSEnvironmentMonitorsKeyword_0()); }
	'GSSEnvironmentMonitors'
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getGSSEnvironmentMonitorsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group__1__Impl
	rule__GSSEnvironmentMonitors__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group__2__Impl
	rule__GSSEnvironmentMonitors__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getGroup_2()); }
	(rule__GSSEnvironmentMonitors__Group_2__0)?
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group__3__Impl
	rule__GSSEnvironmentMonitors__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlternatives_3()); }
		(rule__GSSEnvironmentMonitors__Alternatives_3)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlternatives_3()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlternatives_3()); }
		(rule__GSSEnvironmentMonitors__Alternatives_3)*
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlternatives_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group__4__Impl
	rule__GSSEnvironmentMonitors__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentMonitors__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group_2__0__Impl
	rule__GSSEnvironmentMonitors__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileKeyword_2_0()); }
	'ChartsFile'
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group_2__1__Impl
	rule__GSSEnvironmentMonitors__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group_2__2__Impl
	rule__GSSEnvironmentMonitors__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileAssignment_2_2()); }
	(rule__GSSEnvironmentMonitors__ChartsFileAssignment_2_2)
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMonitors__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGSSInfo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__0__Impl
	rule__GSSEnvironmentGSSInfo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGSSEnvironmentInfoKeyword_0()); }
	'GSSEnvironmentInfo'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGSSEnvironmentInfoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__1__Impl
	rule__GSSEnvironmentGSSInfo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__2__Impl
	rule__GSSEnvironmentGSSInfo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignKeyword_2()); }
	'test_campaign'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__3__Impl
	rule__GSSEnvironmentGSSInfo__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__4__Impl
	rule__GSSEnvironmentGSSInfo__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignAssignment_4()); }
	(rule__GSSEnvironmentGSSInfo__Test_campaignAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__5__Impl
	rule__GSSEnvironmentGSSInfo__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__6__Impl
	rule__GSSEnvironmentGSSInfo__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionKeyword_6()); }
	'version'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__7__Impl
	rule__GSSEnvironmentGSSInfo__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__8__Impl
	rule__GSSEnvironmentGSSInfo__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionAssignment_8()); }
	(rule__GSSEnvironmentGSSInfo__VersionAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__9__Impl
	rule__GSSEnvironmentGSSInfo__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__10__Impl
	rule__GSSEnvironmentGSSInfo__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateKeyword_10()); }
	'date'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__11__Impl
	rule__GSSEnvironmentGSSInfo__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__12__Impl
	rule__GSSEnvironmentGSSInfo__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateAssignment_12()); }
	(rule__GSSEnvironmentGSSInfo__DateAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__13__Impl
	rule__GSSEnvironmentGSSInfo__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__14__Impl
	rule__GSSEnvironmentGSSInfo__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGroup_14()); }
	(rule__GSSEnvironmentGSSInfo__Group_14__0)?
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__15__Impl
	rule__GSSEnvironmentGSSInfo__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGSSInfo__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group_14__0__Impl
	rule__GSSEnvironmentGSSInfo__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlKeyword_14_0()); }
	'version_control_url'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group_14__1__Impl
	rule__GSSEnvironmentGSSInfo__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group_14__2__Impl
	rule__GSSEnvironmentGSSInfo__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlAssignment_14_2()); }
	(rule__GSSEnvironmentGSSInfo__Version_control_urlAssignment_14_2)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfo__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGSSInfoPrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__0__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGSSEnvironmentInfoPrintKeyword_0()); }
	'GSSEnvironmentInfoPrint'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGSSEnvironmentInfoPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__1__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__2__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogKeyword_2()); }
	'mainLog'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__3__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__4__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogAssignment_4()); }
	(rule__GSSEnvironmentGSSInfoPrint__MainLogAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__5__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__6__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsKeyword_6()); }
	'portLogs'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__7__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__8__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsAssignment_8()); }
	(rule__GSSEnvironmentGSSInfoPrint__PortLogsAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__9__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__10__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogKeyword_10()); }
	'rawLog'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__11__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__12__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogAssignment_12()); }
	(rule__GSSEnvironmentGSSInfoPrint__RawLogAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__13__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__14__Impl
	rule__GSSEnvironmentGSSInfoPrint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSInfoPrint__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPhyHeaderPrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__0__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGSSEnvironmentPhyHeaderPrintKeyword_0()); }
	'GSSEnvironmentPhyHeaderPrint'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGSSEnvironmentPhyHeaderPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__1__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__2__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogKeyword_2()); }
	'mainLog'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__3__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__4__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogAssignment_4()); }
	(rule__GSSEnvironmentPhyHeaderPrint__MainLogAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__5__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__6__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsKeyword_6()); }
	'portLogs'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__7__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__8__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsAssignment_8()); }
	(rule__GSSEnvironmentPhyHeaderPrint__PortLogsAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__9__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__10__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogKeyword_10()); }
	'rawLog'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__11__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__12__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogAssignment_12()); }
	(rule__GSSEnvironmentPhyHeaderPrint__RawLogAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__13__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__14__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsKeyword_14()); }
	'gssTabs'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__15__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__16__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsAssignment_16()); }
	(rule__GSSEnvironmentPhyHeaderPrint__GssTabsAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__17__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__18__Impl
	rule__GSSEnvironmentPhyHeaderPrint__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPhyHeaderPrint__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGSSDiscardErrorFlags__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__0__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGSSEnvironmentDiscardErrorFlagsKeyword_0()); }
	'GSSEnvironmentDiscardErrorFlags'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGSSEnvironmentDiscardErrorFlagsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__1__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__2__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2()); }
	'txErrors'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__3__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__4__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4()); }
	(rule__GSSEnvironmentGSSDiscardErrorFlags__TxErrorsAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__5__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__6__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6()); }
	'notExpectedPackets'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__7__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__8__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8()); }
	(rule__GSSEnvironmentGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__9__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__10__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10()); }
	'filtersKo'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__11__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__12__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12()); }
	(rule__GSSEnvironmentGSSDiscardErrorFlags__FiltersKoAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__13__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__14__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14()); }
	'validTimesKo'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__15__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__16__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16()); }
	(rule__GSSEnvironmentGSSDiscardErrorFlags__ValidTimesKoAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__17__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__18__Impl
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGSSDiscardErrorFlags__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentProtocol__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__0__Impl
	rule__GSSEnvironmentProtocol__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getGSSEnvironmentProtocolKeyword_0()); }
	'GSSEnvironmentProtocol'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getGSSEnvironmentProtocolKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__1__Impl
	rule__GSSEnvironmentProtocol__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__2__Impl
	rule__GSSEnvironmentProtocol__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__3__Impl
	rule__GSSEnvironmentProtocol__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__4__Impl
	rule__GSSEnvironmentProtocol__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getIdAssignment_4()); }
	(rule__GSSEnvironmentProtocol__IdAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__5__Impl
	rule__GSSEnvironmentProtocol__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__6__Impl
	rule__GSSEnvironmentProtocol__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__7__Impl
	rule__GSSEnvironmentProtocol__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__8__Impl
	rule__GSSEnvironmentProtocol__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentProtocol__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__9__Impl
	rule__GSSEnvironmentProtocol__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__10__Impl
	rule__GSSEnvironmentProtocol__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelKeyword_10()); }
	'typeLevel'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__11__Impl
	rule__GSSEnvironmentProtocol__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__12__Impl
	rule__GSSEnvironmentProtocol__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelAssignment_12()); }
	(rule__GSSEnvironmentProtocol__TypeLevelAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__13__Impl
	rule__GSSEnvironmentProtocol__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__14__Impl
	rule__GSSEnvironmentProtocol__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetKeyword_14()); }
	'typeOffset'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__15__Impl
	rule__GSSEnvironmentProtocol__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__16__Impl
	rule__GSSEnvironmentProtocol__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetAssignment_16()); }
	(rule__GSSEnvironmentProtocol__TypeOffsetAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__17__Impl
	rule__GSSEnvironmentProtocol__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__18__Impl
	rule__GSSEnvironmentProtocol__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getGroup_18()); }
	(rule__GSSEnvironmentProtocol__Group_18__0)?
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__19__Impl
	rule__GSSEnvironmentProtocol__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentProtocol__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group_18__0__Impl
	rule__GSSEnvironmentProtocol__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetKeyword_18_0()); }
	'subtypeOffset'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group_18__1__Impl
	rule__GSSEnvironmentProtocol__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group_18__2__Impl
	rule__GSSEnvironmentProtocol__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetAssignment_18_2()); }
	(rule__GSSEnvironmentProtocol__SubtypeOffsetAssignment_18_2)
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentProtocol__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentMainInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__0__Impl
	rule__GSSEnvironmentMainInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGSSEnvironmentMainInterfaceKeyword_0()); }
	'GSSEnvironmentMainInterface'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGSSEnvironmentMainInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__1__Impl
	rule__GSSEnvironmentMainInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__2__Impl
	rule__GSSEnvironmentMainInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__3__Impl
	rule__GSSEnvironmentMainInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__4__Impl
	rule__GSSEnvironmentMainInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdAssignment_4()); }
	(rule__GSSEnvironmentMainInterface__IdAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__5__Impl
	rule__GSSEnvironmentMainInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__6__Impl
	rule__GSSEnvironmentMainInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__7__Impl
	rule__GSSEnvironmentMainInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__8__Impl
	rule__GSSEnvironmentMainInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentMainInterface__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__9__Impl
	rule__GSSEnvironmentMainInterface__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__10__Impl
	rule__GSSEnvironmentMainInterface__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeKeyword_10()); }
	'ifType'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__11__Impl
	rule__GSSEnvironmentMainInterface__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__12__Impl
	rule__GSSEnvironmentMainInterface__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeAssignment_12()); }
	(rule__GSSEnvironmentMainInterface__IfTypeAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__13__Impl
	rule__GSSEnvironmentMainInterface__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__14__Impl
	rule__GSSEnvironmentMainInterface__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigKeyword_14()); }
	'ifConfig'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__15__Impl
	rule__GSSEnvironmentMainInterface__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__16__Impl
	rule__GSSEnvironmentMainInterface__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigAssignment_16()); }
	(rule__GSSEnvironmentMainInterface__IfConfigAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__17__Impl
	rule__GSSEnvironmentMainInterface__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__18__Impl
	rule__GSSEnvironmentMainInterface__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeKeyword_18()); }
	'ioType'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__19__Impl
	rule__GSSEnvironmentMainInterface__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__20__Impl
	rule__GSSEnvironmentMainInterface__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeAssignment_20()); }
	(rule__GSSEnvironmentMainInterface__IoTypeAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__21__Impl
	rule__GSSEnvironmentMainInterface__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__22__Impl
	rule__GSSEnvironmentMainInterface__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup_22()); }
	(rule__GSSEnvironmentMainInterface__Group_22__0)?
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__23__Impl
	rule__GSSEnvironmentMainInterface__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup_23()); }
	(rule__GSSEnvironmentMainInterface__Group_23__0)?
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__24__Impl
	rule__GSSEnvironmentMainInterface__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutAssignment_24()); }
		(rule__GSSEnvironmentMainInterface__LevelInOutAssignment_24)
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutAssignment_24()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutAssignment_24()); }
		(rule__GSSEnvironmentMainInterface__LevelInOutAssignment_24)*
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutAssignment_24()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__25__Impl
	rule__GSSEnvironmentMainInterface__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getRightCurlyBracketKeyword_25()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getRightCurlyBracketKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group__26__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentMainInterface__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_22__0__Impl
	rule__GSSEnvironmentMainInterface__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDKeyword_22_0()); }
	'protocolID'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_22__1__Impl
	rule__GSSEnvironmentMainInterface__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_22__2__Impl
	rule__GSSEnvironmentMainInterface__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDAssignment_22_2()); }
	(rule__GSSEnvironmentMainInterface__ProtocolIDAssignment_22_2)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentMainInterface__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_23__0__Impl
	rule__GSSEnvironmentMainInterface__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileKeyword_23_0()); }
	'ProtocolPacketsFile'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileKeyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_23__1__Impl
	rule__GSSEnvironmentMainInterface__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_23__2__Impl
	rule__GSSEnvironmentMainInterface__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileAssignment_23_2()); }
	(rule__GSSEnvironmentMainInterface__ProtocolPacketsFileAssignment_23_2)
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileAssignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentMainInterface__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__0__Impl
	rule__GSSEnvironmentInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getGSSEnvironmentInterfaceKeyword_0()); }
	'GSSEnvironmentInterface'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getGSSEnvironmentInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__1__Impl
	rule__GSSEnvironmentInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__2__Impl
	rule__GSSEnvironmentInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__3__Impl
	rule__GSSEnvironmentInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__4__Impl
	rule__GSSEnvironmentInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdAssignment_4()); }
	(rule__GSSEnvironmentInterface__IdAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__5__Impl
	rule__GSSEnvironmentInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__6__Impl
	rule__GSSEnvironmentInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__7__Impl
	rule__GSSEnvironmentInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__8__Impl
	rule__GSSEnvironmentInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentInterface__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__9__Impl
	rule__GSSEnvironmentInterface__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__10__Impl
	rule__GSSEnvironmentInterface__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeKeyword_10()); }
	'ifType'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__11__Impl
	rule__GSSEnvironmentInterface__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__12__Impl
	rule__GSSEnvironmentInterface__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeAssignment_12()); }
	(rule__GSSEnvironmentInterface__IfTypeAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__13__Impl
	rule__GSSEnvironmentInterface__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__14__Impl
	rule__GSSEnvironmentInterface__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigKeyword_14()); }
	'ifConfig'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__15__Impl
	rule__GSSEnvironmentInterface__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__16__Impl
	rule__GSSEnvironmentInterface__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigAssignment_16()); }
	(rule__GSSEnvironmentInterface__IfConfigAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__17__Impl
	rule__GSSEnvironmentInterface__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__18__Impl
	rule__GSSEnvironmentInterface__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeKeyword_18()); }
	'ioType'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__19__Impl
	rule__GSSEnvironmentInterface__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__20__Impl
	rule__GSSEnvironmentInterface__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeAssignment_20()); }
	(rule__GSSEnvironmentInterface__IoTypeAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__21__Impl
	rule__GSSEnvironmentInterface__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__22__Impl
	rule__GSSEnvironmentInterface__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getGroup_22()); }
	(rule__GSSEnvironmentInterface__Group_22__0)?
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__23__Impl
	rule__GSSEnvironmentInterface__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getAlternatives_23()); }
		(rule__GSSEnvironmentInterface__Alternatives_23)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getAlternatives_23()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getAlternatives_23()); }
		(rule__GSSEnvironmentInterface__Alternatives_23)*
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getAlternatives_23()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__24__Impl
	rule__GSSEnvironmentInterface__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentInterface__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group_22__0__Impl
	rule__GSSEnvironmentInterface__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDKeyword_22_0()); }
	'protocolID'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group_22__1__Impl
	rule__GSSEnvironmentInterface__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group_22__2__Impl
	rule__GSSEnvironmentInterface__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDAssignment_22_2()); }
	(rule__GSSEnvironmentInterface__ProtocolIDAssignment_22_2)
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentInterface__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelInOut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__0__Impl
	rule__GSSEnvironmentLevelInOut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGSSEnvironmentLevelInOutKeyword_0()); }
	'GSSEnvironmentLevelInOut'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGSSEnvironmentLevelInOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__1__Impl
	rule__GSSEnvironmentLevelInOut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__2__Impl
	rule__GSSEnvironmentLevelInOut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__3__Impl
	rule__GSSEnvironmentLevelInOut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__4__Impl
	rule__GSSEnvironmentLevelInOut__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdAssignment_4()); }
	(rule__GSSEnvironmentLevelInOut__IdAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__5__Impl
	rule__GSSEnvironmentLevelInOut__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__6__Impl
	rule__GSSEnvironmentLevelInOut__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__7__Impl
	rule__GSSEnvironmentLevelInOut__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__8__Impl
	rule__GSSEnvironmentLevelInOut__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentLevelInOut__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__9__Impl
	rule__GSSEnvironmentLevelInOut__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__10__Impl
	rule__GSSEnvironmentLevelInOut__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatKeyword_10()); }
	'TMformat'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__11__Impl
	rule__GSSEnvironmentLevelInOut__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__12__Impl
	rule__GSSEnvironmentLevelInOut__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatAssignment_12()); }
	(rule__GSSEnvironmentLevelInOut__TMformatAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__13__Impl
	rule__GSSEnvironmentLevelInOut__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__14__Impl
	rule__GSSEnvironmentLevelInOut__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatKeyword_14()); }
	'TCformat'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__15__Impl
	rule__GSSEnvironmentLevelInOut__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__16__Impl
	rule__GSSEnvironmentLevelInOut__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatAssignment_16()); }
	(rule__GSSEnvironmentLevelInOut__TCformatAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__17__Impl
	rule__GSSEnvironmentLevelInOut__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__18__Impl
	rule__GSSEnvironmentLevelInOut__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterKeyword_18()); }
	'inputFilter'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__19__Impl
	rule__GSSEnvironmentLevelInOut__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__20__Impl
	rule__GSSEnvironmentLevelInOut__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterAssignment_20()); }
	(rule__GSSEnvironmentLevelInOut__InputFilterAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__21__Impl
	rule__GSSEnvironmentLevelInOut__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__22__Impl
	rule__GSSEnvironmentLevelInOut__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup_22()); }
	(rule__GSSEnvironmentLevelInOut__Group_22__0)?
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__23__Impl
	rule__GSSEnvironmentLevelInOut__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup_23()); }
	(rule__GSSEnvironmentLevelInOut__Group_23__0)?
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__24__Impl
	rule__GSSEnvironmentLevelInOut__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelInOut__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_22__0__Impl
	rule__GSSEnvironmentLevelInOut__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0()); }
	'export_to_prev_Level'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_22__1__Impl
	rule__GSSEnvironmentLevelInOut__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_22__2__Impl
	rule__GSSEnvironmentLevelInOut__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2()); }
	(rule__GSSEnvironmentLevelInOut__Export_to_prev_LevelAssignment_22_2)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelInOut__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_23__0__Impl
	rule__GSSEnvironmentLevelInOut__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_23__1__Impl
	rule__GSSEnvironmentLevelInOut__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_23__2__Impl
	rule__GSSEnvironmentLevelInOut__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2()); }
	(rule__GSSEnvironmentLevelInOut__Import_from_prev_LevelAssignment_23_2)
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelInOut__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelIn__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__0__Impl
	rule__GSSEnvironmentLevelIn__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getGSSEnvironmentLevelInKeyword_0()); }
	'GSSEnvironmentLevelIn'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getGSSEnvironmentLevelInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__1__Impl
	rule__GSSEnvironmentLevelIn__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__2__Impl
	rule__GSSEnvironmentLevelIn__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__3__Impl
	rule__GSSEnvironmentLevelIn__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__4__Impl
	rule__GSSEnvironmentLevelIn__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getIdAssignment_4()); }
	(rule__GSSEnvironmentLevelIn__IdAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__5__Impl
	rule__GSSEnvironmentLevelIn__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__6__Impl
	rule__GSSEnvironmentLevelIn__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__7__Impl
	rule__GSSEnvironmentLevelIn__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__8__Impl
	rule__GSSEnvironmentLevelIn__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentLevelIn__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__9__Impl
	rule__GSSEnvironmentLevelIn__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__10__Impl
	rule__GSSEnvironmentLevelIn__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatKeyword_10()); }
	'TCformat'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__11__Impl
	rule__GSSEnvironmentLevelIn__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__12__Impl
	rule__GSSEnvironmentLevelIn__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatAssignment_12()); }
	(rule__GSSEnvironmentLevelIn__TCformatAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__13__Impl
	rule__GSSEnvironmentLevelIn__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__14__Impl
	rule__GSSEnvironmentLevelIn__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getGroup_14()); }
	(rule__GSSEnvironmentLevelIn__Group_14__0)?
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__15__Impl
	rule__GSSEnvironmentLevelIn__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelIn__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group_14__0__Impl
	rule__GSSEnvironmentLevelIn__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelKeyword_14_0()); }
	'export_to_prev_Level'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group_14__1__Impl
	rule__GSSEnvironmentLevelIn__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group_14__2__Impl
	rule__GSSEnvironmentLevelIn__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelAssignment_14_2()); }
	(rule__GSSEnvironmentLevelIn__Export_to_prev_LevelAssignment_14_2)
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelIn__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelOut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__0__Impl
	rule__GSSEnvironmentLevelOut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getGSSEnvironmentLevelOutKeyword_0()); }
	'GSSEnvironmentLevelOut'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getGSSEnvironmentLevelOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__1__Impl
	rule__GSSEnvironmentLevelOut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__2__Impl
	rule__GSSEnvironmentLevelOut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__3__Impl
	rule__GSSEnvironmentLevelOut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__4__Impl
	rule__GSSEnvironmentLevelOut__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdAssignment_4()); }
	(rule__GSSEnvironmentLevelOut__IdAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__5__Impl
	rule__GSSEnvironmentLevelOut__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__6__Impl
	rule__GSSEnvironmentLevelOut__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__7__Impl
	rule__GSSEnvironmentLevelOut__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__8__Impl
	rule__GSSEnvironmentLevelOut__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentLevelOut__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__9__Impl
	rule__GSSEnvironmentLevelOut__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__10__Impl
	rule__GSSEnvironmentLevelOut__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatKeyword_10()); }
	'TMformat'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__11__Impl
	rule__GSSEnvironmentLevelOut__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__12__Impl
	rule__GSSEnvironmentLevelOut__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatAssignment_12()); }
	(rule__GSSEnvironmentLevelOut__TMformatAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__13__Impl
	rule__GSSEnvironmentLevelOut__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__14__Impl
	rule__GSSEnvironmentLevelOut__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterKeyword_14()); }
	'inputFilter'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__15__Impl
	rule__GSSEnvironmentLevelOut__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__16__Impl
	rule__GSSEnvironmentLevelOut__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterAssignment_16()); }
	(rule__GSSEnvironmentLevelOut__InputFilterAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__17__Impl
	rule__GSSEnvironmentLevelOut__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__18__Impl
	rule__GSSEnvironmentLevelOut__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getGroup_18()); }
	(rule__GSSEnvironmentLevelOut__Group_18__0)?
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__19__Impl
	rule__GSSEnvironmentLevelOut__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentLevelOut__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group_18__0__Impl
	rule__GSSEnvironmentLevelOut__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelKeyword_18_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group_18__1__Impl
	rule__GSSEnvironmentLevelOut__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group_18__2__Impl
	rule__GSSEnvironmentLevelOut__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelAssignment_18_2()); }
	(rule__GSSEnvironmentLevelOut__Import_from_prev_LevelAssignment_18_2)
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentLevelOut__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentSpecialPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__0__Impl
	rule__GSSEnvironmentSpecialPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGSSEnvironmentSpecialPacketKeyword_0()); }
	'GSSEnvironmentSpecialPacket'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGSSEnvironmentSpecialPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__1__Impl
	rule__GSSEnvironmentSpecialPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__2__Impl
	rule__GSSEnvironmentSpecialPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusKeyword_2()); }
	'status'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__3__Impl
	rule__GSSEnvironmentSpecialPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__4__Impl
	rule__GSSEnvironmentSpecialPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusAssignment_4()); }
	(rule__GSSEnvironmentSpecialPacket__StatusAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__5__Impl
	rule__GSSEnvironmentSpecialPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__6__Impl
	rule__GSSEnvironmentSpecialPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__7__Impl
	rule__GSSEnvironmentSpecialPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__8__Impl
	rule__GSSEnvironmentSpecialPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameAssignment_8()); }
	(rule__GSSEnvironmentSpecialPacket__NameAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__9__Impl
	rule__GSSEnvironmentSpecialPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__10__Impl
	rule__GSSEnvironmentSpecialPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdKeyword_10()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__11__Impl
	rule__GSSEnvironmentSpecialPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__12__Impl
	rule__GSSEnvironmentSpecialPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdAssignment_12()); }
	(rule__GSSEnvironmentSpecialPacket__IdAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__13__Impl
	rule__GSSEnvironmentSpecialPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__14__Impl
	rule__GSSEnvironmentSpecialPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefKeyword_14()); }
	'ifRef'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__15__Impl
	rule__GSSEnvironmentSpecialPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__16__Impl
	rule__GSSEnvironmentSpecialPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefAssignment_16()); }
	(rule__GSSEnvironmentSpecialPacket__IfRefAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__17__Impl
	rule__GSSEnvironmentSpecialPacket__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__18__Impl
	rule__GSSEnvironmentSpecialPacket__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsKeyword_18()); }
	'levels'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__19__Impl
	rule__GSSEnvironmentSpecialPacket__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__20__Impl
	rule__GSSEnvironmentSpecialPacket__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsAssignment_20()); }
	(rule__GSSEnvironmentSpecialPacket__LevelsAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__21__Impl
	rule__GSSEnvironmentSpecialPacket__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__22__Impl
	rule__GSSEnvironmentSpecialPacket__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefKeyword_22()); }
	'levelRef'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__23__Impl
	rule__GSSEnvironmentSpecialPacket__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__24__Impl
	rule__GSSEnvironmentSpecialPacket__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefAssignment_24()); }
	(rule__GSSEnvironmentSpecialPacket__LevelRefAssignment_24)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__25__Impl
	rule__GSSEnvironmentSpecialPacket__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__26__Impl
	rule__GSSEnvironmentSpecialPacket__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterKeyword_26()); }
	'inputFilter'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__27__Impl
	rule__GSSEnvironmentSpecialPacket__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_27()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__28__Impl
	rule__GSSEnvironmentSpecialPacket__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterAssignment_28()); }
	(rule__GSSEnvironmentSpecialPacket__InputFilterAssignment_28)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__29__Impl
	rule__GSSEnvironmentSpecialPacket__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_29()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__30__Impl
	rule__GSSEnvironmentSpecialPacket__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsAssignment_30()); }
	(rule__GSSEnvironmentSpecialPacket__UpperLevelsAssignment_30)?
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsAssignment_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__31__Impl
	rule__GSSEnvironmentSpecialPacket__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataAssignment_31()); }
	(rule__GSSEnvironmentSpecialPacket__PrintingDataAssignment_31)
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataAssignment_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__32__Impl
	rule__GSSEnvironmentSpecialPacket__Group__33
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getAlternatives_32()); }
	(rule__GSSEnvironmentSpecialPacket__Alternatives_32)?
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getAlternatives_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__33
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__33__Impl
	rule__GSSEnvironmentSpecialPacket__Group__34
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__33__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getRightCurlyBracketKeyword_33()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getRightCurlyBracketKeyword_33()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__34
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentSpecialPacket__Group__34__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__Group__34__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_34()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_34()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentUpperLevels__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevels__Group__0__Impl
	rule__GSSEnvironmentUpperLevels__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGSSEnvironmentUpperLevelsKeyword_0()); }
	'GSSEnvironmentUpperLevels'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGSSEnvironmentUpperLevelsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevels__Group__1__Impl
	rule__GSSEnvironmentUpperLevels__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevels__Group__2__Impl
	rule__GSSEnvironmentUpperLevels__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelAssignment_2()); }
		(rule__GSSEnvironmentUpperLevels__UpperLevelAssignment_2)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelAssignment_2()); }
		(rule__GSSEnvironmentUpperLevels__UpperLevelAssignment_2)*
		{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevels__Group__3__Impl
	rule__GSSEnvironmentUpperLevels__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevels__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPrintingData__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__0__Impl
	rule__GSSEnvironmentPrintingData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getGSSEnvironmentPrintingDataKeyword_0()); }
	'GSSEnvironmentPrintingData'
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getGSSEnvironmentPrintingDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__1__Impl
	rule__GSSEnvironmentPrintingData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__2__Impl
	rule__GSSEnvironmentPrintingData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusKeyword_2()); }
	'printStatus'
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__3__Impl
	rule__GSSEnvironmentPrintingData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__4__Impl
	rule__GSSEnvironmentPrintingData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusAssignment_4()); }
	(rule__GSSEnvironmentPrintingData__PrintStatusAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__5__Impl
	rule__GSSEnvironmentPrintingData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__6__Impl
	rule__GSSEnvironmentPrintingData__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataAssignment_6()); }
	(rule__GSSEnvironmentPrintingData__StructuredDataAssignment_6)?
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__7__Impl
	rule__GSSEnvironmentPrintingData__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPrintingData__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriod__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__0__Impl
	rule__GSSEnvironmentPeriod__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getGSSEnvironmentPeriodKeyword_0()); }
	'GSSEnvironmentPeriod'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getGSSEnvironmentPeriodKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__1__Impl
	rule__GSSEnvironmentPeriod__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__2__Impl
	rule__GSSEnvironmentPeriod__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueKeyword_2()); }
	'min_value'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__3__Impl
	rule__GSSEnvironmentPeriod__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__4__Impl
	rule__GSSEnvironmentPeriod__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueAssignment_4()); }
	(rule__GSSEnvironmentPeriod__Min_valueAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__5__Impl
	rule__GSSEnvironmentPeriod__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__6__Impl
	rule__GSSEnvironmentPeriod__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitKeyword_6()); }
	'min_unit'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__7__Impl
	rule__GSSEnvironmentPeriod__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__8__Impl
	rule__GSSEnvironmentPeriod__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitAssignment_8()); }
	(rule__GSSEnvironmentPeriod__Min_unitAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__9__Impl
	rule__GSSEnvironmentPeriod__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__10__Impl
	rule__GSSEnvironmentPeriod__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueKeyword_10()); }
	'max_value'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__11__Impl
	rule__GSSEnvironmentPeriod__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__12__Impl
	rule__GSSEnvironmentPeriod__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueAssignment_12()); }
	(rule__GSSEnvironmentPeriod__Max_valueAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__13__Impl
	rule__GSSEnvironmentPeriod__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__14__Impl
	rule__GSSEnvironmentPeriod__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitKeyword_14()); }
	'max_unit'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__15__Impl
	rule__GSSEnvironmentPeriod__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__16__Impl
	rule__GSSEnvironmentPeriod__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitAssignment_16()); }
	(rule__GSSEnvironmentPeriod__Max_unitAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__17__Impl
	rule__GSSEnvironmentPeriod__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__18__Impl
	rule__GSSEnvironmentPeriod__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriod__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentIntervalRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__0__Impl
	rule__GSSEnvironmentIntervalRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGSSEnvironmentIntervalRangeKeyword_0()); }
	'GSSEnvironmentIntervalRange'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGSSEnvironmentIntervalRangeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__1__Impl
	rule__GSSEnvironmentIntervalRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__2__Impl
	rule__GSSEnvironmentIntervalRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinKeyword_2()); }
	'min'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__3__Impl
	rule__GSSEnvironmentIntervalRange__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__4__Impl
	rule__GSSEnvironmentIntervalRange__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinAssignment_4()); }
	(rule__GSSEnvironmentIntervalRange__MinAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__5__Impl
	rule__GSSEnvironmentIntervalRange__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__6__Impl
	rule__GSSEnvironmentIntervalRange__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxKeyword_6()); }
	'max'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__7__Impl
	rule__GSSEnvironmentIntervalRange__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__8__Impl
	rule__GSSEnvironmentIntervalRange__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxAssignment_8()); }
	(rule__GSSEnvironmentIntervalRange__MaxAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__9__Impl
	rule__GSSEnvironmentIntervalRange__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__10__Impl
	rule__GSSEnvironmentIntervalRange__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueKeyword_10()); }
	'interval_value'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__11__Impl
	rule__GSSEnvironmentIntervalRange__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__12__Impl
	rule__GSSEnvironmentIntervalRange__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueAssignment_12()); }
	(rule__GSSEnvironmentIntervalRange__Interval_valueAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__13__Impl
	rule__GSSEnvironmentIntervalRange__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__14__Impl
	rule__GSSEnvironmentIntervalRange__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitKeyword_14()); }
	'interval_unit'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__15__Impl
	rule__GSSEnvironmentIntervalRange__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__16__Impl
	rule__GSSEnvironmentIntervalRange__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitAssignment_16()); }
	(rule__GSSEnvironmentIntervalRange__Interval_unitAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__17__Impl
	rule__GSSEnvironmentIntervalRange__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__18__Impl
	rule__GSSEnvironmentIntervalRange__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentIntervalRange__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentUpperLevel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__0__Impl
	rule__GSSEnvironmentUpperLevel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGSSEnvironmentUpperLevelKeyword_0()); }
	'GSSEnvironmentUpperLevel'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGSSEnvironmentUpperLevelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__1__Impl
	rule__GSSEnvironmentUpperLevel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__2__Impl
	rule__GSSEnvironmentUpperLevel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelKeyword_2()); }
	'level'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__3__Impl
	rule__GSSEnvironmentUpperLevel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__4__Impl
	rule__GSSEnvironmentUpperLevel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelAssignment_4()); }
	(rule__GSSEnvironmentUpperLevel__LevelAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__5__Impl
	rule__GSSEnvironmentUpperLevel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__6__Impl
	rule__GSSEnvironmentUpperLevel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_6()); }
	(rule__GSSEnvironmentUpperLevel__Group_6__0)?
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__7__Impl
	rule__GSSEnvironmentUpperLevel__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_7()); }
	(rule__GSSEnvironmentUpperLevel__Group_7__0)?
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__8__Impl
	rule__GSSEnvironmentUpperLevel__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_8()); }
	(rule__GSSEnvironmentUpperLevel__Group_8__0)?
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__9__Impl
	rule__GSSEnvironmentUpperLevel__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentUpperLevel__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_6__0__Impl
	rule__GSSEnvironmentUpperLevel__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatKeyword_6_0()); }
	'TMformat'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_6__1__Impl
	rule__GSSEnvironmentUpperLevel__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_6__2__Impl
	rule__GSSEnvironmentUpperLevel__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatAssignment_6_2()); }
	(rule__GSSEnvironmentUpperLevel__TMformatAssignment_6_2)
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentUpperLevel__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_7__0__Impl
	rule__GSSEnvironmentUpperLevel__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterKeyword_7_0()); }
	'inputFilter'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_7__1__Impl
	rule__GSSEnvironmentUpperLevel__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_7_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_7__2__Impl
	rule__GSSEnvironmentUpperLevel__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterAssignment_7_2()); }
	(rule__GSSEnvironmentUpperLevel__InputFilterAssignment_7_2)
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_7_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentUpperLevel__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_8__0__Impl
	rule__GSSEnvironmentUpperLevel__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_8__1__Impl
	rule__GSSEnvironmentUpperLevel__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_8_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_8__2__Impl
	rule__GSSEnvironmentUpperLevel__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2()); }
	(rule__GSSEnvironmentUpperLevel__Import_from_prev_LevelAssignment_8_2)
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentUpperLevel__Group_8__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_8_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentStructuredData__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__0__Impl
	rule__GSSEnvironmentStructuredData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getGSSEnvironmentStructuredDataKeyword_0()); }
	'GSSEnvironmentStructuredData'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getGSSEnvironmentStructuredDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__1__Impl
	rule__GSSEnvironmentStructuredData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__2__Impl
	rule__GSSEnvironmentStructuredData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefKeyword_2()); }
	'levelRef'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__3__Impl
	rule__GSSEnvironmentStructuredData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__4__Impl
	rule__GSSEnvironmentStructuredData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefAssignment_4()); }
	(rule__GSSEnvironmentStructuredData__LevelRefAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__5__Impl
	rule__GSSEnvironmentStructuredData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__6__Impl
	rule__GSSEnvironmentStructuredData__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldKeyword_6()); }
	'firstField'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__7__Impl
	rule__GSSEnvironmentStructuredData__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__8__Impl
	rule__GSSEnvironmentStructuredData__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldAssignment_8()); }
	(rule__GSSEnvironmentStructuredData__FirstFieldAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__9__Impl
	rule__GSSEnvironmentStructuredData__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__10__Impl
	rule__GSSEnvironmentStructuredData__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentStructuredData__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGSSEnvironmentPeriodicTCLevel2Keyword_0()); }
	'GSSEnvironmentPeriodicTCLevel2'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGSSEnvironmentPeriodicTCLevel2Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__3__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__4__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameAssignment_4()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__5__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__6__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__7__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__8__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdAssignment_8()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__IdAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__9__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__10__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__11__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__12__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefAssignment_12()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__IfRefAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__13__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__14__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__15__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__16__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueAssignment_16()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__17__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__18__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__19__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__20__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitAssignment_20()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__21__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__22__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_22()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Group_22__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__23__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Keyword_23()); }
	'app_to_level2'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__24__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__25__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Assignment_25()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__App_to_level2Assignment_25)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__26__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__27__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_27()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Group_27__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__28__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_28()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Group_28__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__29__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_29()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Group_29__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__30__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_30()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Group_30__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGroup_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__31__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group__32__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_32()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel2__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Keyword_22_0()); }
	'level2'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Assignment_22_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Level2Assignment_22_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel2__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Keyword_27_0()); }
	'level1'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Assignment_27_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Level1Assignment_27_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel2__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0()); }
	'level2_to_level1'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Level2_to_level1Assignment_28_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel2__Group_29__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Keyword_29_0()); }
	'level0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Keyword_29_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Assignment_29_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Level0Assignment_29_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Assignment_29_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_29__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_29__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_29_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_29_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel2__Group_30__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel2__Level1_to_level0Assignment_30_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel2__Group_30__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Group_30__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_30_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_30_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGSSEnvironmentPeriodicTCLevel1Keyword_0()); }
	'GSSEnvironmentPeriodicTCLevel1'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGSSEnvironmentPeriodicTCLevel1Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__3__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__4__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameAssignment_4()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__5__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__6__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__7__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__8__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdAssignment_8()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__IdAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__9__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__10__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__11__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__12__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefAssignment_12()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__IfRefAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__13__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__14__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__15__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__16__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueAssignment_16()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__17__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__18__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__19__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__20__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitAssignment_20()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__21__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__22__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_22()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Group_22__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__23__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Keyword_23()); }
	'app_to_level1'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__24__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__25__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Assignment_25()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__App_to_level1Assignment_25)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__26__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__27__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_27()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Group_27__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__28__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_28()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Group_28__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__29__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel1__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Keyword_22_0()); }
	'level1'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Assignment_22_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Level1Assignment_22_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel1__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Keyword_27_0()); }
	'level0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Assignment_27_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Level0Assignment_27_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel1__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel1__Level1_to_level0Assignment_28_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel1__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGSSEnvironmentPeriodicTCLevel0Keyword_0()); }
	'GSSEnvironmentPeriodicTCLevel0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGSSEnvironmentPeriodicTCLevel0Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__3__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__4__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameAssignment_4()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__5__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__6__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__7__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__8__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdAssignment_8()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__IdAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__9__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__10__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__11__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__12__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefAssignment_12()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__IfRefAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__13__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__14__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__15__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__16__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueAssignment_16()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__17__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__18__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__19__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__20__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitAssignment_20()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__21__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__22__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGroup_22()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__Group_22__0)?
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__23__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Keyword_23()); }
	'app_to_level0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__24__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__25__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Assignment_25()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__App_to_level0Assignment_25)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__26__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__27__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group__28__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_28()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPeriodicTCLevel0__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__0__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Keyword_22_0()); }
	'level0'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__1__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__2__Impl
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Assignment_22_2()); }
	(rule__GSSEnvironmentPeriodicTCLevel0__Level0Assignment_22_2)
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPeriodicTCLevel0__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGlobalVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__0__Impl
	rule__GSSEnvironmentGlobalVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getGSSEnvironmentGlobalVarKeyword_0()); }
	'GSSEnvironmentGlobalVar'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getGSSEnvironmentGlobalVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__1__Impl
	rule__GSSEnvironmentGlobalVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__2__Impl
	rule__GSSEnvironmentGlobalVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__3__Impl
	rule__GSSEnvironmentGlobalVar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__4__Impl
	rule__GSSEnvironmentGlobalVar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameAssignment_4()); }
	(rule__GSSEnvironmentGlobalVar__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__5__Impl
	rule__GSSEnvironmentGlobalVar__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__6__Impl
	rule__GSSEnvironmentGlobalVar__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__7__Impl
	rule__GSSEnvironmentGlobalVar__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__8__Impl
	rule__GSSEnvironmentGlobalVar__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdAssignment_8()); }
	(rule__GSSEnvironmentGlobalVar__IdAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__9__Impl
	rule__GSSEnvironmentGlobalVar__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__10__Impl
	rule__GSSEnvironmentGlobalVar__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeKeyword_10()); }
	'type'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__11__Impl
	rule__GSSEnvironmentGlobalVar__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__12__Impl
	rule__GSSEnvironmentGlobalVar__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeAssignment_12()); }
	(rule__GSSEnvironmentGlobalVar__TypeAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__13__Impl
	rule__GSSEnvironmentGlobalVar__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__14__Impl
	rule__GSSEnvironmentGlobalVar__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueKeyword_14()); }
	'initial_value'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__15__Impl
	rule__GSSEnvironmentGlobalVar__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__16__Impl
	rule__GSSEnvironmentGlobalVar__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueAssignment_16()); }
	(rule__GSSEnvironmentGlobalVar__Initial_valueAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__17__Impl
	rule__GSSEnvironmentGlobalVar__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__18__Impl
	rule__GSSEnvironmentGlobalVar__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getAlternatives_18()); }
	(rule__GSSEnvironmentGlobalVar__Alternatives_18)
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getAlternatives_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__19__Impl
	rule__GSSEnvironmentGlobalVar__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGlobalVar__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentReferenceField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__0__Impl
	rule__GSSEnvironmentReferenceField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGSSEnvironmentReferenceFieldKeyword_0()); }
	'GSSEnvironmentReferenceField'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGSSEnvironmentReferenceFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__1__Impl
	rule__GSSEnvironmentReferenceField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__2__Impl
	rule__GSSEnvironmentReferenceField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__3__Impl
	rule__GSSEnvironmentReferenceField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__4__Impl
	rule__GSSEnvironmentReferenceField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeAssignment_4()); }
	(rule__GSSEnvironmentReferenceField__TypeAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__5__Impl
	rule__GSSEnvironmentReferenceField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__6__Impl
	rule__GSSEnvironmentReferenceField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__7__Impl
	rule__GSSEnvironmentReferenceField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__8__Impl
	rule__GSSEnvironmentReferenceField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefAssignment_8()); }
	(rule__GSSEnvironmentReferenceField__IfRefAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__9__Impl
	rule__GSSEnvironmentReferenceField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__10__Impl
	rule__GSSEnvironmentReferenceField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelKeyword_10()); }
	'level'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__11__Impl
	rule__GSSEnvironmentReferenceField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__12__Impl
	rule__GSSEnvironmentReferenceField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelAssignment_12()); }
	(rule__GSSEnvironmentReferenceField__LevelAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__13__Impl
	rule__GSSEnvironmentReferenceField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__14__Impl
	rule__GSSEnvironmentReferenceField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefKeyword_14()); }
	'fieldRef'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__15__Impl
	rule__GSSEnvironmentReferenceField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__16__Impl
	rule__GSSEnvironmentReferenceField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefAssignment_16()); }
	(rule__GSSEnvironmentReferenceField__FieldRefAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__17__Impl
	rule__GSSEnvironmentReferenceField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__18__Impl
	rule__GSSEnvironmentReferenceField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetKeyword_18()); }
	'offset'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__19__Impl
	rule__GSSEnvironmentReferenceField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__20__Impl
	rule__GSSEnvironmentReferenceField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetAssignment_20()); }
	(rule__GSSEnvironmentReferenceField__OffsetAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__21__Impl
	rule__GSSEnvironmentReferenceField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__22__Impl
	rule__GSSEnvironmentReferenceField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeKeyword_22()); }
	'size'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__23__Impl
	rule__GSSEnvironmentReferenceField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__24__Impl
	rule__GSSEnvironmentReferenceField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeAssignment_24()); }
	(rule__GSSEnvironmentReferenceField__SizeAssignment_24)
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__25__Impl
	rule__GSSEnvironmentReferenceField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__26__Impl
	rule__GSSEnvironmentReferenceField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getRightCurlyBracketKeyword_26()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getRightCurlyBracketKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceField__Group__27__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_27()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentReferencePeriodicTC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__0__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGSSEnvironmentReferencePeriodicTCKeyword_0()); }
	'GSSEnvironmentReferencePeriodicTC'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGSSEnvironmentReferencePeriodicTCKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__1__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__2__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__3__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__4__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefAssignment_4()); }
	(rule__GSSEnvironmentReferencePeriodicTC__IdRefAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__5__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__6__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelKeyword_6()); }
	'level'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__7__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__8__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelAssignment_8()); }
	(rule__GSSEnvironmentReferencePeriodicTC__LevelAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__9__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__10__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefKeyword_10()); }
	'fieldRef'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__11__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__12__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefAssignment_12()); }
	(rule__GSSEnvironmentReferencePeriodicTC__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__13__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__14__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetKeyword_14()); }
	'offset'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__15__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__16__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetAssignment_16()); }
	(rule__GSSEnvironmentReferencePeriodicTC__OffsetAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__17__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__18__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeKeyword_18()); }
	'size'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__19__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__20__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeAssignment_20()); }
	(rule__GSSEnvironmentReferencePeriodicTC__SizeAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__21__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__22__Impl
	rule__GSSEnvironmentReferencePeriodicTC__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferencePeriodicTC__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_23()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentReferenceSpecialPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__0__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGSSEnvironmentReferenceSpecialPacketKeyword_0()); }
	'GSSEnvironmentReferenceSpecialPacket'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGSSEnvironmentReferenceSpecialPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__1__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__2__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__3__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__4__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefAssignment_4()); }
	(rule__GSSEnvironmentReferenceSpecialPacket__IdRefAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__5__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__6__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelKeyword_6()); }
	'level'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__7__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__8__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelAssignment_8()); }
	(rule__GSSEnvironmentReferenceSpecialPacket__LevelAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__9__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__10__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefKeyword_10()); }
	'fieldRef'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__11__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__12__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefAssignment_12()); }
	(rule__GSSEnvironmentReferenceSpecialPacket__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__13__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__14__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetKeyword_14()); }
	'offset'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__15__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__16__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetAssignment_16()); }
	(rule__GSSEnvironmentReferenceSpecialPacket__OffsetAssignment_16)
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__17__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__18__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeKeyword_18()); }
	'size'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__19__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__20__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeAssignment_20()); }
	(rule__GSSEnvironmentReferenceSpecialPacket__SizeAssignment_20)
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__21__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__22__Impl
	rule__GSSEnvironmentReferenceSpecialPacket__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentReferenceSpecialPacket__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_23()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentPlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__0__Impl
	rule__GSSEnvironmentPlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getGSSEnvironmentPlotKeyword_0()); }
	'GSSEnvironmentPlot'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getGSSEnvironmentPlotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__1__Impl
	rule__GSSEnvironmentPlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__2__Impl
	rule__GSSEnvironmentPlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__3__Impl
	rule__GSSEnvironmentPlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__4__Impl
	rule__GSSEnvironmentPlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getNameAssignment_4()); }
	(rule__GSSEnvironmentPlot__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__5__Impl
	rule__GSSEnvironmentPlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__6__Impl
	rule__GSSEnvironmentPlot__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefKeyword_6()); }
	'chartRef'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__7__Impl
	rule__GSSEnvironmentPlot__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__8__Impl
	rule__GSSEnvironmentPlot__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefAssignment_8()); }
	(rule__GSSEnvironmentPlot__ChartRefAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__9__Impl
	rule__GSSEnvironmentPlot__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__10__Impl
	rule__GSSEnvironmentPlot__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getAlternatives_10()); }
	(rule__GSSEnvironmentPlot__Alternatives_10)
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getAlternatives_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__11__Impl
	rule__GSSEnvironmentPlot__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentPlot__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentAlarmMsg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__0__Impl
	rule__GSSEnvironmentAlarmMsg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGSSEnvironmentAlarmMsgKeyword_0()); }
	'GSSEnvironmentAlarmMsg'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGSSEnvironmentAlarmMsgKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__1__Impl
	rule__GSSEnvironmentAlarmMsg__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__2__Impl
	rule__GSSEnvironmentAlarmMsg__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__3__Impl
	rule__GSSEnvironmentAlarmMsg__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__4__Impl
	rule__GSSEnvironmentAlarmMsg__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameAssignment_4()); }
	(rule__GSSEnvironmentAlarmMsg__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__5__Impl
	rule__GSSEnvironmentAlarmMsg__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__6__Impl
	rule__GSSEnvironmentAlarmMsg__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__7__Impl
	rule__GSSEnvironmentAlarmMsg__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__8__Impl
	rule__GSSEnvironmentAlarmMsg__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeAssignment_8()); }
	(rule__GSSEnvironmentAlarmMsg__TypeAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__9__Impl
	rule__GSSEnvironmentAlarmMsg__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__10__Impl
	rule__GSSEnvironmentAlarmMsg__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextKeyword_10()); }
	'text'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__11__Impl
	rule__GSSEnvironmentAlarmMsg__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__12__Impl
	rule__GSSEnvironmentAlarmMsg__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextAssignment_12()); }
	(rule__GSSEnvironmentAlarmMsg__TextAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__13__Impl
	rule__GSSEnvironmentAlarmMsg__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__14__Impl
	rule__GSSEnvironmentAlarmMsg__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getAlternatives_14()); }
	(rule__GSSEnvironmentAlarmMsg__Alternatives_14)
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getAlternatives_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__15__Impl
	rule__GSSEnvironmentAlarmMsg__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmMsg__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentModify__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__0__Impl
	rule__GSSEnvironmentModify__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getGSSEnvironmentModifyKeyword_0()); }
	'GSSEnvironmentModify'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getGSSEnvironmentModifyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__1__Impl
	rule__GSSEnvironmentModify__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__2__Impl
	rule__GSSEnvironmentModify__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__3__Impl
	rule__GSSEnvironmentModify__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__4__Impl
	rule__GSSEnvironmentModify__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getNameAssignment_4()); }
	(rule__GSSEnvironmentModify__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__5__Impl
	rule__GSSEnvironmentModify__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__6__Impl
	rule__GSSEnvironmentModify__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__7__Impl
	rule__GSSEnvironmentModify__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__8__Impl
	rule__GSSEnvironmentModify__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getTypeAssignment_8()); }
	(rule__GSSEnvironmentModify__TypeAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__9__Impl
	rule__GSSEnvironmentModify__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__10__Impl
	rule__GSSEnvironmentModify__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getValueKeyword_10()); }
	'value'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getValueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__11__Impl
	rule__GSSEnvironmentModify__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__12__Impl
	rule__GSSEnvironmentModify__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getValueAssignment_12()); }
	(rule__GSSEnvironmentModify__ValueAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getValueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__13__Impl
	rule__GSSEnvironmentModify__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__14__Impl
	rule__GSSEnvironmentModify__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getAlternatives_14()); }
	(rule__GSSEnvironmentModify__Alternatives_14)
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getAlternatives_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__15__Impl
	rule__GSSEnvironmentModify__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentModify__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentAlarmVal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__0__Impl
	rule__GSSEnvironmentAlarmVal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getGSSEnvironmentAlarmValKeyword_0()); }
	'GSSEnvironmentAlarmVal'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getGSSEnvironmentAlarmValKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__1__Impl
	rule__GSSEnvironmentAlarmVal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__2__Impl
	rule__GSSEnvironmentAlarmVal__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__3__Impl
	rule__GSSEnvironmentAlarmVal__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__4__Impl
	rule__GSSEnvironmentAlarmVal__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameAssignment_4()); }
	(rule__GSSEnvironmentAlarmVal__NameAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__5__Impl
	rule__GSSEnvironmentAlarmVal__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__6__Impl
	rule__GSSEnvironmentAlarmVal__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__7__Impl
	rule__GSSEnvironmentAlarmVal__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__8__Impl
	rule__GSSEnvironmentAlarmVal__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeAssignment_8()); }
	(rule__GSSEnvironmentAlarmVal__TypeAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__9__Impl
	rule__GSSEnvironmentAlarmVal__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__10__Impl
	rule__GSSEnvironmentAlarmVal__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getAlternatives_10()); }
	(rule__GSSEnvironmentAlarmVal__Alternatives_10)
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getAlternatives_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__11__Impl
	rule__GSSEnvironmentAlarmVal__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentAlarmVal__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGVFiltered__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__0__Impl
	rule__GSSEnvironmentGVFiltered__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGSSEnvironmentGVFilteredKeyword_0()); }
	'GSSEnvironmentGVFiltered'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGSSEnvironmentGVFilteredKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__1__Impl
	rule__GSSEnvironmentGVFiltered__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__2__Impl
	rule__GSSEnvironmentGVFiltered__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefKeyword_2()); }
	'GlobalVarRef'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__3__Impl
	rule__GSSEnvironmentGVFiltered__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__4__Impl
	rule__GSSEnvironmentGVFiltered__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefAssignment_4()); }
	(rule__GSSEnvironmentGVFiltered__GlobalVarRefAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__5__Impl
	rule__GSSEnvironmentGVFiltered__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__6__Impl
	rule__GSSEnvironmentGVFiltered__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGroup_6()); }
	(rule__GSSEnvironmentGVFiltered__Group_6__0)?
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__7__Impl
	rule__GSSEnvironmentGVFiltered__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGVFiltered__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group_6__0__Impl
	rule__GSSEnvironmentGVFiltered__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterKeyword_6_0()); }
	'filter'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group_6__1__Impl
	rule__GSSEnvironmentGVFiltered__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group_6__2__Impl
	rule__GSSEnvironmentGVFiltered__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterAssignment_6_2()); }
	(rule__GSSEnvironmentGVFiltered__FilterAssignment_6_2)
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVFiltered__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentGVPeriodic__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__0__Impl
	rule__GSSEnvironmentGVPeriodic__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGSSEnvironmentGVPeriodicKeyword_0()); }
	'GSSEnvironmentGVPeriodic'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGSSEnvironmentGVPeriodicKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__1__Impl
	rule__GSSEnvironmentGVPeriodic__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__2__Impl
	rule__GSSEnvironmentGVPeriodic__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefKeyword_2()); }
	'GlobalVarRef'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__3__Impl
	rule__GSSEnvironmentGVPeriodic__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__4__Impl
	rule__GSSEnvironmentGVPeriodic__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefAssignment_4()); }
	(rule__GSSEnvironmentGVPeriodic__GlobalVarRefAssignment_4)
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__5__Impl
	rule__GSSEnvironmentGVPeriodic__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__6__Impl
	rule__GSSEnvironmentGVPeriodic__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueKeyword_6()); }
	'period_value'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__7__Impl
	rule__GSSEnvironmentGVPeriodic__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__8__Impl
	rule__GSSEnvironmentGVPeriodic__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueAssignment_8()); }
	(rule__GSSEnvironmentGVPeriodic__Period_valueAssignment_8)
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__9__Impl
	rule__GSSEnvironmentGVPeriodic__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__10__Impl
	rule__GSSEnvironmentGVPeriodic__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitKeyword_10()); }
	'period_unit'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__11__Impl
	rule__GSSEnvironmentGVPeriodic__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__12__Impl
	rule__GSSEnvironmentGVPeriodic__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitAssignment_12()); }
	(rule__GSSEnvironmentGVPeriodic__Period_unitAssignment_12)
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__13__Impl
	rule__GSSEnvironmentGVPeriodic__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__14__Impl
	rule__GSSEnvironmentGVPeriodic__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentGVPeriodic__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_15()); }
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


rule__DATE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DATE__Group__0__Impl
	rule__DATE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DATE__Group__1__Impl
	rule__DATE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDATEAccess().getSolidusKeyword_1()); }
	'/'
	{ after(grammarAccess.getDATEAccess().getSolidusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DATE__Group__2__Impl
	rule__DATE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DATE__Group__3__Impl
	rule__DATE__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDATEAccess().getSolidusKeyword_3()); }
	'/'
	{ after(grammarAccess.getDATEAccess().getSolidusKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DATE__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DATE__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); }
	RULE_INT
	{ after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__URL__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group__0__Impl
	rule__URL__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getURLAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group__1__Impl
	rule__URL__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getGroup_1()); }
	(rule__URL__Group_1__0)?
	{ after(grammarAccess.getURLAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group__2__Impl
	rule__URL__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_2()); }
	'://'
	{ after(grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group__3__Impl
	rule__URL__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getURLAccess().getGroup_3()); }
		(rule__URL__Group_3__0)
		{ after(grammarAccess.getURLAccess().getGroup_3()); }
	)
	(
		{ before(grammarAccess.getURLAccess().getGroup_3()); }
		(rule__URL__Group_3__0)*
		{ after(grammarAccess.getURLAccess().getGroup_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group__4__Impl
	rule__URL__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getGroup_4()); }
	(rule__URL__Group_4__0)*
	{ after(grammarAccess.getURLAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getSolidusKeyword_5()); }
	('/')?
	{ after(grammarAccess.getURLAccess().getSolidusKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__URL__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group_1__0__Impl
	rule__URL__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getPlusSignKeyword_1_0()); }
	'+'
	{ after(grammarAccess.getURLAccess().getPlusSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getURLAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__URL__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group_3__0__Impl
	rule__URL__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0()); }
	RULE_ID
	{ after(grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getFullStopKeyword_3_1()); }
	('.')?
	{ after(grammarAccess.getURLAccess().getFullStopKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__URL__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group_4__0__Impl
	rule__URL__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getSolidusKeyword_4_0()); }
	'/'
	{ after(grammarAccess.getURLAccess().getSolidusKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__URL__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__URL__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1()); }
	RULE_ID
	{ after(grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentScenario__UnorderedGroup_12
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12());
	}
:
	rule__GSSEnvironmentScenario__UnorderedGroup_12__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12());
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__UnorderedGroup_12__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsAssignment_12_0()); }
					(rule__GSSEnvironmentScenario__GlobalVarsAssignment_12_0)
					{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsAssignment_12_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsAssignment_12_1()); }
					(rule__GSSEnvironmentScenario__MonitorsAssignment_12_1)
					{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsAssignment_12_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_12());
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__UnorderedGroup_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__UnorderedGroup_12__Impl
	rule__GSSEnvironmentScenario__UnorderedGroup_12__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__UnorderedGroup_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentScenario__UnorderedGroup_12__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0()); }
		ruleGSSEnvironmentGSSEnvironment
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0()); }
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

rule__GSSEnvironmentGSSEnvironment__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__UriAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__VersionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionVersionParserRuleCall_6_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionVersionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSEnvironment__ScenarioAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioGSSEnvironmentScenarioParserRuleCall_8_0()); }
		ruleGSSEnvironmentScenario
		{ after(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioGSSEnvironmentScenarioParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__IdAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getIdINTEGERParserRuleCall_5_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getIdINTEGERParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__Gss_optionsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsGSSEnvironmentOptionsParserRuleCall_7_0()); }
		ruleGSSEnvironmentOptions
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsGSSEnvironmentOptionsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__ProtocolsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsGSSEnvironmentProtocolsParserRuleCall_8_0()); }
		ruleGSSEnvironmentProtocols
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsGSSEnvironmentProtocolsParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__InterfacesAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesGSSEnvironmentInterfacesParserRuleCall_9_0()); }
		ruleGSSEnvironmentInterfaces
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesGSSEnvironmentInterfacesParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__SpecialPacketsAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_10_0()); }
		ruleGSSEnvironmentSpecialPackets
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__PeriodicTCsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_11_0()); }
		ruleGSSEnvironmentPeriodicTCs
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__GlobalVarsAssignment_12_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_12_0_0()); }
		ruleGSSEnvironmentGlobalVars
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_12_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentScenario__MonitorsAssignment_12_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsGSSEnvironmentMonitorsParserRuleCall_12_1_0()); }
		ruleGSSEnvironmentMonitors
		{ after(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsGSSEnvironmentMonitorsParserRuleCall_12_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Gss_infoAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0()); }
		ruleGSSEnvironmentGSSInfo
		{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Gss_info_printAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0()); }
		ruleGSSEnvironmentGSSInfoPrint
		{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__Phy_header_printAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0()); }
		ruleGSSEnvironmentPhyHeaderPrint
		{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentOptions__DiscardErrorFlagsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0()); }
		ruleGSSEnvironmentGSSDiscardErrorFlags
		{ after(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocols__ProtocolAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolGSSEnvironmentProtocolParserRuleCall_2_0()); }
		ruleGSSEnvironmentProtocol
		{ after(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolGSSEnvironmentProtocolParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__MainInterfaceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_2_0()); }
		ruleGSSEnvironmentMainInterface
		{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterfaces__InterfaceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceGSSEnvironmentInterfaceParserRuleCall_3_0()); }
		ruleGSSEnvironmentInterface
		{ after(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceGSSEnvironmentInterfaceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPackets__SpecialPacketAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0()); }
		ruleGSSEnvironmentSpecialPacket
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_2Assignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0()); }
		ruleGSSEnvironmentPeriodicTCLevel2
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_1Assignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0()); }
		ruleGSSEnvironmentPeriodicTCLevel1
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCs__PeriodicTC_level_0Assignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0()); }
		ruleGSSEnvironmentPeriodicTCLevel0
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVars__GlobalVarAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0()); }
		ruleGSSEnvironmentGlobalVar
		{ after(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__ChartsFileAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__PlotAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotGSSEnvironmentPlotParserRuleCall_3_0_0()); }
		ruleGSSEnvironmentPlot
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotGSSEnvironmentPlotParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__AlarmMsgAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0()); }
		ruleGSSEnvironmentAlarmMsg
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__ModifyAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyGSSEnvironmentModifyParserRuleCall_3_2_0()); }
		ruleGSSEnvironmentModify
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyGSSEnvironmentModifyParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMonitors__AlarmValAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0()); }
		ruleGSSEnvironmentAlarmVal
		{ after(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Test_campaignAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__VersionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionVersionParserRuleCall_8_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionVersionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__DateAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateDATEParserRuleCall_12_0()); }
		ruleDATE
		{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateDATEParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfo__Version_control_urlAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0()); }
		ruleURL
		{ after(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__MainLogAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__PortLogsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSInfoPrint__RawLogAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__MainLogAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__PortLogsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__RawLogAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPhyHeaderPrint__GssTabsAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__TxErrorsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__FiltersKoAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGSSDiscardErrorFlags__ValidTimesKoAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__TypeLevelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__TypeOffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentProtocol__SubtypeOffsetAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__IfTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0()); }
		ruleGSSEnvironmentInterfaceType
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__IfConfigAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__IoTypeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0()); }
		ruleGSSEnvironmentInterfaceIOType
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__ProtocolIDAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__ProtocolPacketsFileAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentMainInterface__LevelInOutAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_24_0()); }
		ruleGSSEnvironmentLevelInOut
		{ after(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__IfTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0()); }
		ruleGSSEnvironmentInterfaceType
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__IfConfigAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__IoTypeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0()); }
		ruleGSSEnvironmentInterfaceIOType
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__ProtocolIDAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDGSSEnvironmentProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__LevelInOutAssignment_23_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0()); }
		ruleGSSEnvironmentLevelInOut
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__LevelInAssignment_23_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0()); }
		ruleGSSEnvironmentLevelIn
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentInterface__LevelOutAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0()); }
		ruleGSSEnvironmentLevelOut
		{ after(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__TMformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__TCformatAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatTMTCIFFormatFormatCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatTMTCIFFormatFormatCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__InputFilterAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_20_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Export_to_prev_LevelAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelInOut__Import_from_prev_LevelAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__TCformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatTMTCIFFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatTMTCIFFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelIn__Export_to_prev_LevelAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__TMformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__InputFilterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentLevelOut__Import_from_prev_LevelAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__StatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__IdAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__IfRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__LevelsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__LevelRefAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__InputFilterAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterTMTCIFFilterFilterCrossReference_28_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterTMTCIFFilterFilterCrossReference_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__UpperLevelsAssignment_30
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0()); }
		ruleGSSEnvironmentUpperLevels
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__PrintingDataAssignment_31
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0()); }
		ruleGSSEnvironmentPrintingData
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__PeriodAssignment_32_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0()); }
		ruleGSSEnvironmentPeriod
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentSpecialPacket__IntervalRangeAssignment_32_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0()); }
		ruleGSSEnvironmentIntervalRange
		{ after(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevels__UpperLevelAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0()); }
		ruleGSSEnvironmentUpperLevel
		{ after(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__PrintStatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
		ruleGSSEnvironmentEnableDisable
		{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPrintingData__StructuredDataAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0()); }
		ruleGSSEnvironmentStructuredData
		{ after(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Min_valueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Min_unitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitGSSEnvironmentUnitEnumRuleCall_8_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitGSSEnvironmentUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Max_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriod__Max_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitGSSEnvironmentUnitEnumRuleCall_16_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitGSSEnvironmentUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__MinAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__MaxAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Interval_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentIntervalRange__Interval_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__LevelAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0()); }
		ruleGSSEnvironmentUpperLevelLevel
		{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__TMformatAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatTMTCIFFormatFormatCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatTMTCIFFormatFormatCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__InputFilterAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterTMTCIFFilterFilterCrossReference_7_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterTMTCIFFilterFilterCrossReference_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentUpperLevel__Import_from_prev_LevelAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__LevelRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentStructuredData__FirstFieldAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Level2Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__App_to_level2Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Level1Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Level2_to_level1Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Level0Assignment_29_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_29_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_29_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel2__Level1_to_level0Assignment_30_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Level1Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__App_to_level1Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Level0Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel1__Level1_to_level0Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__Level0Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPeriodicTCLevel0__App_to_level0Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__TypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0()); }
		ruleGSSEnvironmentGlobalVarType
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__Initial_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__ReferenceFieldAssignment_18_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0()); }
		ruleGSSEnvironmentReferenceField
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__ReferencePeriodicTCAssignment_18_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0()); }
		ruleGSSEnvironmentReferencePeriodicTC
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGlobalVar__ReferenceSpecialPacketAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0()); }
		ruleGSSEnvironmentReferenceSpecialPacket
		{ after(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0()); }
		ruleGSSEnvironmentReferenceFieldType
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__LevelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__FieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__OffsetAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceField__SizeAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__LevelAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__OffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferencePeriodicTC__SizeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__LevelAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__OffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentReferenceSpecialPacket__SizeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__ChartRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefGSSChartsChartCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefGSSChartsChartCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__GVFilteredAssignment_10_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0()); }
		ruleGSSEnvironmentGVFiltered
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentPlot__GVPeriodicAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0()); }
		ruleGSSEnvironmentGVPeriodic
		{ after(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0()); }
		ruleGSSEnvironmentAlarmMsgType
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__TextAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__GVFilteredAssignment_14_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0()); }
		ruleGSSEnvironmentGVFiltered
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmMsg__GVPeriodicAssignment_14_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0()); }
		ruleGSSEnvironmentGVPeriodic
		{ after(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0()); }
		ruleGSSEnvironmentModifyType
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__ValueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getValueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getValueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__GVFilteredAssignment_14_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0()); }
		ruleGSSEnvironmentGVFiltered
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentModify__GVPeriodicAssignment_14_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0()); }
		ruleGSSEnvironmentGVPeriodic
		{ after(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0()); }
		ruleGSSEnvironmentAlarmValType
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__GVFilteredAssignment_10_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0()); }
		ruleGSSEnvironmentGVFiltered
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentAlarmVal__GVPeriodicAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0()); }
		ruleGSSEnvironmentGVPeriodic
		{ after(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__GlobalVarRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVFiltered__FilterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterTMTCIFFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterTMTCIFFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__GlobalVarRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Period_valueAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentGVPeriodic__Period_unitAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0()); }
		ruleGSSEnvironmentUnit
		{ after(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0()); }
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
