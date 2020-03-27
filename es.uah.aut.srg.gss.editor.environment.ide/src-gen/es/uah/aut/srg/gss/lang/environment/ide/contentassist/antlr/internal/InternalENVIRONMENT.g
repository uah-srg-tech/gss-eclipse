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

// Entry rule entryRuleGSSEnvironmentEnvironment
entryRuleGSSEnvironmentEnvironment
:
{ before(grammarAccess.getGSSEnvironmentEnvironmentRule()); }
	 ruleGSSEnvironmentEnvironment
{ after(grammarAccess.getGSSEnvironmentEnvironmentRule()); } 
	 EOF 
;

// Rule GSSEnvironmentEnvironment
ruleGSSEnvironmentEnvironment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getGroup()); }
		(rule__GSSEnvironmentEnvironment__Group__0)
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioScenario
entryRuleGSSScenarioScenario
:
{ before(grammarAccess.getGSSScenarioScenarioRule()); }
	 ruleGSSScenarioScenario
{ after(grammarAccess.getGSSScenarioScenarioRule()); } 
	 EOF 
;

// Rule GSSScenarioScenario
ruleGSSScenarioScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getGroup()); }
		(rule__GSSScenarioScenario__Group__0)
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioOptions
entryRuleGSSScenarioOptions
:
{ before(grammarAccess.getGSSScenarioOptionsRule()); }
	 ruleGSSScenarioOptions
{ after(grammarAccess.getGSSScenarioOptionsRule()); } 
	 EOF 
;

// Rule GSSScenarioOptions
ruleGSSScenarioOptions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioOptionsAccess().getGroup()); }
		(rule__GSSScenarioOptions__Group__0)
		{ after(grammarAccess.getGSSScenarioOptionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioProtocols
entryRuleGSSScenarioProtocols
:
{ before(grammarAccess.getGSSScenarioProtocolsRule()); }
	 ruleGSSScenarioProtocols
{ after(grammarAccess.getGSSScenarioProtocolsRule()); } 
	 EOF 
;

// Rule GSSScenarioProtocols
ruleGSSScenarioProtocols 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioProtocolsAccess().getGroup()); }
		(rule__GSSScenarioProtocols__Group__0)
		{ after(grammarAccess.getGSSScenarioProtocolsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioInterfaces
entryRuleGSSScenarioInterfaces
:
{ before(grammarAccess.getGSSScenarioInterfacesRule()); }
	 ruleGSSScenarioInterfaces
{ after(grammarAccess.getGSSScenarioInterfacesRule()); } 
	 EOF 
;

// Rule GSSScenarioInterfaces
ruleGSSScenarioInterfaces 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioInterfacesAccess().getGroup()); }
		(rule__GSSScenarioInterfaces__Group__0)
		{ after(grammarAccess.getGSSScenarioInterfacesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioSpecialPackets
entryRuleGSSScenarioSpecialPackets
:
{ before(grammarAccess.getGSSScenarioSpecialPacketsRule()); }
	 ruleGSSScenarioSpecialPackets
{ after(grammarAccess.getGSSScenarioSpecialPacketsRule()); } 
	 EOF 
;

// Rule GSSScenarioSpecialPackets
ruleGSSScenarioSpecialPackets 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getGroup()); }
		(rule__GSSScenarioSpecialPackets__Group__0)
		{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPeriodicTCs
entryRuleGSSScenarioPeriodicTCs
:
{ before(grammarAccess.getGSSScenarioPeriodicTCsRule()); }
	 ruleGSSScenarioPeriodicTCs
{ after(grammarAccess.getGSSScenarioPeriodicTCsRule()); } 
	 EOF 
;

// Rule GSSScenarioPeriodicTCs
ruleGSSScenarioPeriodicTCs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGroup()); }
		(rule__GSSScenarioPeriodicTCs__Group__0)
		{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGlobalVars
entryRuleGSSScenarioGlobalVars
:
{ before(grammarAccess.getGSSScenarioGlobalVarsRule()); }
	 ruleGSSScenarioGlobalVars
{ after(grammarAccess.getGSSScenarioGlobalVarsRule()); } 
	 EOF 
;

// Rule GSSScenarioGlobalVars
ruleGSSScenarioGlobalVars 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getGroup()); }
		(rule__GSSScenarioGlobalVars__Group__0)
		{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioMonitors
entryRuleGSSScenarioMonitors
:
{ before(grammarAccess.getGSSScenarioMonitorsRule()); }
	 ruleGSSScenarioMonitors
{ after(grammarAccess.getGSSScenarioMonitorsRule()); } 
	 EOF 
;

// Rule GSSScenarioMonitors
ruleGSSScenarioMonitors 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioMonitorsAccess().getGroup()); }
		(rule__GSSScenarioMonitors__Group__0)
		{ after(grammarAccess.getGSSScenarioMonitorsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGSSInfo
entryRuleGSSScenarioGSSInfo
:
{ before(grammarAccess.getGSSScenarioGSSInfoRule()); }
	 ruleGSSScenarioGSSInfo
{ after(grammarAccess.getGSSScenarioGSSInfoRule()); } 
	 EOF 
;

// Rule GSSScenarioGSSInfo
ruleGSSScenarioGSSInfo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getGroup()); }
		(rule__GSSScenarioGSSInfo__Group__0)
		{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGSSInfoPrint
entryRuleGSSScenarioGSSInfoPrint
:
{ before(grammarAccess.getGSSScenarioGSSInfoPrintRule()); }
	 ruleGSSScenarioGSSInfoPrint
{ after(grammarAccess.getGSSScenarioGSSInfoPrintRule()); } 
	 EOF 
;

// Rule GSSScenarioGSSInfoPrint
ruleGSSScenarioGSSInfoPrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGroup()); }
		(rule__GSSScenarioGSSInfoPrint__Group__0)
		{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPhyHeaderPrint
entryRuleGSSScenarioPhyHeaderPrint
:
{ before(grammarAccess.getGSSScenarioPhyHeaderPrintRule()); }
	 ruleGSSScenarioPhyHeaderPrint
{ after(grammarAccess.getGSSScenarioPhyHeaderPrintRule()); } 
	 EOF 
;

// Rule GSSScenarioPhyHeaderPrint
ruleGSSScenarioPhyHeaderPrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGroup()); }
		(rule__GSSScenarioPhyHeaderPrint__Group__0)
		{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGSSDiscardErrorFlags
entryRuleGSSScenarioGSSDiscardErrorFlags
:
{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule()); }
	 ruleGSSScenarioGSSDiscardErrorFlags
{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule()); } 
	 EOF 
;

// Rule GSSScenarioGSSDiscardErrorFlags
ruleGSSScenarioGSSDiscardErrorFlags 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGroup()); }
		(rule__GSSScenarioGSSDiscardErrorFlags__Group__0)
		{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioProtocol
entryRuleGSSScenarioProtocol
:
{ before(grammarAccess.getGSSScenarioProtocolRule()); }
	 ruleGSSScenarioProtocol
{ after(grammarAccess.getGSSScenarioProtocolRule()); } 
	 EOF 
;

// Rule GSSScenarioProtocol
ruleGSSScenarioProtocol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioProtocolAccess().getGroup()); }
		(rule__GSSScenarioProtocol__Group__0)
		{ after(grammarAccess.getGSSScenarioProtocolAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioProtocolType
entryRuleGSSScenarioProtocolType
:
{ before(grammarAccess.getGSSScenarioProtocolTypeRule()); }
	 ruleGSSScenarioProtocolType
{ after(grammarAccess.getGSSScenarioProtocolTypeRule()); } 
	 EOF 
;

// Rule GSSScenarioProtocolType
ruleGSSScenarioProtocolType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getGroup()); }
		(rule__GSSScenarioProtocolType__Group__0)
		{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioProtocolSubtype
entryRuleGSSScenarioProtocolSubtype
:
{ before(grammarAccess.getGSSScenarioProtocolSubtypeRule()); }
	 ruleGSSScenarioProtocolSubtype
{ after(grammarAccess.getGSSScenarioProtocolSubtypeRule()); } 
	 EOF 
;

// Rule GSSScenarioProtocolSubtype
ruleGSSScenarioProtocolSubtype 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGroup()); }
		(rule__GSSScenarioProtocolSubtype__Group__0)
		{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioMainInterface
entryRuleGSSScenarioMainInterface
:
{ before(grammarAccess.getGSSScenarioMainInterfaceRule()); }
	 ruleGSSScenarioMainInterface
{ after(grammarAccess.getGSSScenarioMainInterfaceRule()); } 
	 EOF 
;

// Rule GSSScenarioMainInterface
ruleGSSScenarioMainInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getGroup()); }
		(rule__GSSScenarioMainInterface__Group__0)
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioInterface
entryRuleGSSScenarioInterface
:
{ before(grammarAccess.getGSSScenarioInterfaceRule()); }
	 ruleGSSScenarioInterface
{ after(grammarAccess.getGSSScenarioInterfaceRule()); } 
	 EOF 
;

// Rule GSSScenarioInterface
ruleGSSScenarioInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getGroup()); }
		(rule__GSSScenarioInterface__Group__0)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioLevelInOut
entryRuleGSSScenarioLevelInOut
:
{ before(grammarAccess.getGSSScenarioLevelInOutRule()); }
	 ruleGSSScenarioLevelInOut
{ after(grammarAccess.getGSSScenarioLevelInOutRule()); } 
	 EOF 
;

// Rule GSSScenarioLevelInOut
ruleGSSScenarioLevelInOut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup()); }
		(rule__GSSScenarioLevelInOut__Group__0)
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioLevelIn
entryRuleGSSScenarioLevelIn
:
{ before(grammarAccess.getGSSScenarioLevelInRule()); }
	 ruleGSSScenarioLevelIn
{ after(grammarAccess.getGSSScenarioLevelInRule()); } 
	 EOF 
;

// Rule GSSScenarioLevelIn
ruleGSSScenarioLevelIn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioLevelInAccess().getGroup()); }
		(rule__GSSScenarioLevelIn__Group__0)
		{ after(grammarAccess.getGSSScenarioLevelInAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioLevelOut
entryRuleGSSScenarioLevelOut
:
{ before(grammarAccess.getGSSScenarioLevelOutRule()); }
	 ruleGSSScenarioLevelOut
{ after(grammarAccess.getGSSScenarioLevelOutRule()); } 
	 EOF 
;

// Rule GSSScenarioLevelOut
ruleGSSScenarioLevelOut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioLevelOutAccess().getGroup()); }
		(rule__GSSScenarioLevelOut__Group__0)
		{ after(grammarAccess.getGSSScenarioLevelOutAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioSpecialPacket
entryRuleGSSScenarioSpecialPacket
:
{ before(grammarAccess.getGSSScenarioSpecialPacketRule()); }
	 ruleGSSScenarioSpecialPacket
{ after(grammarAccess.getGSSScenarioSpecialPacketRule()); } 
	 EOF 
;

// Rule GSSScenarioSpecialPacket
ruleGSSScenarioSpecialPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getGroup()); }
		(rule__GSSScenarioSpecialPacket__Group__0)
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioUpperLevels
entryRuleGSSScenarioUpperLevels
:
{ before(grammarAccess.getGSSScenarioUpperLevelsRule()); }
	 ruleGSSScenarioUpperLevels
{ after(grammarAccess.getGSSScenarioUpperLevelsRule()); } 
	 EOF 
;

// Rule GSSScenarioUpperLevels
ruleGSSScenarioUpperLevels 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getGroup()); }
		(rule__GSSScenarioUpperLevels__Group__0)
		{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPrintingData
entryRuleGSSScenarioPrintingData
:
{ before(grammarAccess.getGSSScenarioPrintingDataRule()); }
	 ruleGSSScenarioPrintingData
{ after(grammarAccess.getGSSScenarioPrintingDataRule()); } 
	 EOF 
;

// Rule GSSScenarioPrintingData
ruleGSSScenarioPrintingData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getGroup()); }
		(rule__GSSScenarioPrintingData__Group__0)
		{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPeriod
entryRuleGSSScenarioPeriod
:
{ before(grammarAccess.getGSSScenarioPeriodRule()); }
	 ruleGSSScenarioPeriod
{ after(grammarAccess.getGSSScenarioPeriodRule()); } 
	 EOF 
;

// Rule GSSScenarioPeriod
ruleGSSScenarioPeriod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPeriodAccess().getGroup()); }
		(rule__GSSScenarioPeriod__Group__0)
		{ after(grammarAccess.getGSSScenarioPeriodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioIntervalRange
entryRuleGSSScenarioIntervalRange
:
{ before(grammarAccess.getGSSScenarioIntervalRangeRule()); }
	 ruleGSSScenarioIntervalRange
{ after(grammarAccess.getGSSScenarioIntervalRangeRule()); } 
	 EOF 
;

// Rule GSSScenarioIntervalRange
ruleGSSScenarioIntervalRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getGroup()); }
		(rule__GSSScenarioIntervalRange__Group__0)
		{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioUpperLevel
entryRuleGSSScenarioUpperLevel
:
{ before(grammarAccess.getGSSScenarioUpperLevelRule()); }
	 ruleGSSScenarioUpperLevel
{ after(grammarAccess.getGSSScenarioUpperLevelRule()); } 
	 EOF 
;

// Rule GSSScenarioUpperLevel
ruleGSSScenarioUpperLevel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup()); }
		(rule__GSSScenarioUpperLevel__Group__0)
		{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioStructuredData
entryRuleGSSScenarioStructuredData
:
{ before(grammarAccess.getGSSScenarioStructuredDataRule()); }
	 ruleGSSScenarioStructuredData
{ after(grammarAccess.getGSSScenarioStructuredDataRule()); } 
	 EOF 
;

// Rule GSSScenarioStructuredData
ruleGSSScenarioStructuredData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getGroup()); }
		(rule__GSSScenarioStructuredData__Group__0)
		{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPeriodicTC
entryRuleGSSScenarioPeriodicTC
:
{ before(grammarAccess.getGSSScenarioPeriodicTCRule()); }
	 ruleGSSScenarioPeriodicTC
{ after(grammarAccess.getGSSScenarioPeriodicTCRule()); } 
	 EOF 
;

// Rule GSSScenarioPeriodicTC
ruleGSSScenarioPeriodicTC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCAccess().getAlternatives()); }
		(rule__GSSScenarioPeriodicTC__Alternatives)
		{ after(grammarAccess.getGSSScenarioPeriodicTCAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPeriodicTCLevel2
entryRuleGSSScenarioPeriodicTCLevel2
:
{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule()); }
	 ruleGSSScenarioPeriodicTCLevel2
{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule()); } 
	 EOF 
;

// Rule GSSScenarioPeriodicTCLevel2
ruleGSSScenarioPeriodicTCLevel2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup()); }
		(rule__GSSScenarioPeriodicTCLevel2__Group__0)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPeriodicTCLevel1
entryRuleGSSScenarioPeriodicTCLevel1
:
{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule()); }
	 ruleGSSScenarioPeriodicTCLevel1
{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule()); } 
	 EOF 
;

// Rule GSSScenarioPeriodicTCLevel1
ruleGSSScenarioPeriodicTCLevel1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup()); }
		(rule__GSSScenarioPeriodicTCLevel1__Group__0)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPeriodicTCLevel0
entryRuleGSSScenarioPeriodicTCLevel0
:
{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule()); }
	 ruleGSSScenarioPeriodicTCLevel0
{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule()); } 
	 EOF 
;

// Rule GSSScenarioPeriodicTCLevel0
ruleGSSScenarioPeriodicTCLevel0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGroup()); }
		(rule__GSSScenarioPeriodicTCLevel0__Group__0)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGlobalVar
entryRuleGSSScenarioGlobalVar
:
{ before(grammarAccess.getGSSScenarioGlobalVarRule()); }
	 ruleGSSScenarioGlobalVar
{ after(grammarAccess.getGSSScenarioGlobalVarRule()); } 
	 EOF 
;

// Rule GSSScenarioGlobalVar
ruleGSSScenarioGlobalVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getGroup()); }
		(rule__GSSScenarioGlobalVar__Group__0)
		{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioReference
entryRuleGSSScenarioReference
:
{ before(grammarAccess.getGSSScenarioReferenceRule()); }
	 ruleGSSScenarioReference
{ after(grammarAccess.getGSSScenarioReferenceRule()); } 
	 EOF 
;

// Rule GSSScenarioReference
ruleGSSScenarioReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioReferenceAccess().getAlternatives()); }
		(rule__GSSScenarioReference__Alternatives)
		{ after(grammarAccess.getGSSScenarioReferenceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioReferenceField
entryRuleGSSScenarioReferenceField
:
{ before(grammarAccess.getGSSScenarioReferenceFieldRule()); }
	 ruleGSSScenarioReferenceField
{ after(grammarAccess.getGSSScenarioReferenceFieldRule()); } 
	 EOF 
;

// Rule GSSScenarioReferenceField
ruleGSSScenarioReferenceField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getGroup()); }
		(rule__GSSScenarioReferenceField__Group__0)
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioReferencePeriodicTC
entryRuleGSSScenarioReferencePeriodicTC
:
{ before(grammarAccess.getGSSScenarioReferencePeriodicTCRule()); }
	 ruleGSSScenarioReferencePeriodicTC
{ after(grammarAccess.getGSSScenarioReferencePeriodicTCRule()); } 
	 EOF 
;

// Rule GSSScenarioReferencePeriodicTC
ruleGSSScenarioReferencePeriodicTC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGroup()); }
		(rule__GSSScenarioReferencePeriodicTC__Group__0)
		{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioReferenceSpecialPacket
entryRuleGSSScenarioReferenceSpecialPacket
:
{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketRule()); }
	 ruleGSSScenarioReferenceSpecialPacket
{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketRule()); } 
	 EOF 
;

// Rule GSSScenarioReferenceSpecialPacket
ruleGSSScenarioReferenceSpecialPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGroup()); }
		(rule__GSSScenarioReferenceSpecialPacket__Group__0)
		{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioMonitor
entryRuleGSSScenarioMonitor
:
{ before(grammarAccess.getGSSScenarioMonitorRule()); }
	 ruleGSSScenarioMonitor
{ after(grammarAccess.getGSSScenarioMonitorRule()); } 
	 EOF 
;

// Rule GSSScenarioMonitor
ruleGSSScenarioMonitor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioMonitorAccess().getAlternatives()); }
		(rule__GSSScenarioMonitor__Alternatives)
		{ after(grammarAccess.getGSSScenarioMonitorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioPlot
entryRuleGSSScenarioPlot
:
{ before(grammarAccess.getGSSScenarioPlotRule()); }
	 ruleGSSScenarioPlot
{ after(grammarAccess.getGSSScenarioPlotRule()); } 
	 EOF 
;

// Rule GSSScenarioPlot
ruleGSSScenarioPlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioPlotAccess().getGroup()); }
		(rule__GSSScenarioPlot__Group__0)
		{ after(grammarAccess.getGSSScenarioPlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioAlarmMsg
entryRuleGSSScenarioAlarmMsg
:
{ before(grammarAccess.getGSSScenarioAlarmMsgRule()); }
	 ruleGSSScenarioAlarmMsg
{ after(grammarAccess.getGSSScenarioAlarmMsgRule()); } 
	 EOF 
;

// Rule GSSScenarioAlarmMsg
ruleGSSScenarioAlarmMsg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getGroup()); }
		(rule__GSSScenarioAlarmMsg__Group__0)
		{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioModify
entryRuleGSSScenarioModify
:
{ before(grammarAccess.getGSSScenarioModifyRule()); }
	 ruleGSSScenarioModify
{ after(grammarAccess.getGSSScenarioModifyRule()); } 
	 EOF 
;

// Rule GSSScenarioModify
ruleGSSScenarioModify 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioModifyAccess().getGroup()); }
		(rule__GSSScenarioModify__Group__0)
		{ after(grammarAccess.getGSSScenarioModifyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioAlarmVal
entryRuleGSSScenarioAlarmVal
:
{ before(grammarAccess.getGSSScenarioAlarmValRule()); }
	 ruleGSSScenarioAlarmVal
{ after(grammarAccess.getGSSScenarioAlarmValRule()); } 
	 EOF 
;

// Rule GSSScenarioAlarmVal
ruleGSSScenarioAlarmVal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioAlarmValAccess().getGroup()); }
		(rule__GSSScenarioAlarmVal__Group__0)
		{ after(grammarAccess.getGSSScenarioAlarmValAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGV
entryRuleGSSScenarioGV
:
{ before(grammarAccess.getGSSScenarioGVRule()); }
	 ruleGSSScenarioGV
{ after(grammarAccess.getGSSScenarioGVRule()); } 
	 EOF 
;

// Rule GSSScenarioGV
ruleGSSScenarioGV 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGVAccess().getAlternatives()); }
		(rule__GSSScenarioGV__Alternatives)
		{ after(grammarAccess.getGSSScenarioGVAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGVFiltered
entryRuleGSSScenarioGVFiltered
:
{ before(grammarAccess.getGSSScenarioGVFilteredRule()); }
	 ruleGSSScenarioGVFiltered
{ after(grammarAccess.getGSSScenarioGVFilteredRule()); } 
	 EOF 
;

// Rule GSSScenarioGVFiltered
ruleGSSScenarioGVFiltered 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGroup()); }
		(rule__GSSScenarioGVFiltered__Group__0)
		{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSScenarioGVPeriodic
entryRuleGSSScenarioGVPeriodic
:
{ before(grammarAccess.getGSSScenarioGVPeriodicRule()); }
	 ruleGSSScenarioGVPeriodic
{ after(grammarAccess.getGSSScenarioGVPeriodicRule()); } 
	 EOF 
;

// Rule GSSScenarioGVPeriodic
ruleGSSScenarioGVPeriodic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getGroup()); }
		(rule__GSSScenarioGVPeriodic__Group__0)
		{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getGroup()); }
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

// Rule GSSScenarioEnableDisable
ruleGSSScenarioEnableDisable
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioEnableDisableAccess().getAlternatives()); }
		(rule__GSSScenarioEnableDisable__Alternatives)
		{ after(grammarAccess.getGSSScenarioEnableDisableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioInterfaceType
ruleGSSScenarioInterfaceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceTypeAccess().getAlternatives()); }
		(rule__GSSScenarioInterfaceType__Alternatives)
		{ after(grammarAccess.getGSSScenarioInterfaceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioInterfaceIOType
ruleGSSScenarioInterfaceIOType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getAlternatives()); }
		(rule__GSSScenarioInterfaceIOType__Alternatives)
		{ after(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioUpperLevelLevel
ruleGSSScenarioUpperLevelLevel
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelLevelAccess().getAlternatives()); }
		(rule__GSSScenarioUpperLevelLevel__Alternatives)
		{ after(grammarAccess.getGSSScenarioUpperLevelLevelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioUnit
ruleGSSScenarioUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUnitAccess().getAlternatives()); }
		(rule__GSSScenarioUnit__Alternatives)
		{ after(grammarAccess.getGSSScenarioUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioGlobalVarType
ruleGSSScenarioGlobalVarType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getAlternatives()); }
		(rule__GSSScenarioGlobalVarType__Alternatives)
		{ after(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioReferenceFieldType
ruleGSSScenarioReferenceFieldType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getAlternatives()); }
		(rule__GSSScenarioReferenceFieldType__Alternatives)
		{ after(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioAlarmMsgType
ruleGSSScenarioAlarmMsgType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlternatives()); }
		(rule__GSSScenarioAlarmMsgType__Alternatives)
		{ after(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioModifyType
ruleGSSScenarioModifyType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioModifyTypeAccess().getAlternatives()); }
		(rule__GSSScenarioModifyType__Alternatives)
		{ after(grammarAccess.getGSSScenarioModifyTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSScenarioAlarmValType
ruleGSSScenarioAlarmValType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration()); }
		('alarm1')
		{ after(grammarAccess.getGSSScenarioAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Alternatives_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutAssignment_23_0()); }
		(rule__GSSScenarioInterface__LevelInOutAssignment_23_0)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutAssignment_23_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInAssignment_23_1()); }
		(rule__GSSScenarioInterface__LevelInAssignment_23_1)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInAssignment_23_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutAssignment_23_2()); }
		(rule__GSSScenarioInterface__LevelOutAssignment_23_2)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutAssignment_23_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Alternatives_32
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodAssignment_32_0()); }
		(rule__GSSScenarioSpecialPacket__PeriodAssignment_32_0)
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodAssignment_32_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeAssignment_32_1()); }
		(rule__GSSScenarioSpecialPacket__IntervalRangeAssignment_32_1)
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeAssignment_32_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTC__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel2ParserRuleCall_0()); }
		ruleGSSScenarioPeriodicTCLevel2
		{ after(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel2ParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel1ParserRuleCall_1()); }
		ruleGSSScenarioPeriodicTCLevel1
		{ after(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel1ParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel0ParserRuleCall_2()); }
		ruleGSSScenarioPeriodicTCLevel0
		{ after(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel0ParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReference__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceFieldParserRuleCall_0()); }
		ruleGSSScenarioReferenceField
		{ after(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceFieldParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferencePeriodicTCParserRuleCall_1()); }
		ruleGSSScenarioReferencePeriodicTC
		{ after(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferencePeriodicTCParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceSpecialPacketParserRuleCall_2()); }
		ruleGSSScenarioReferenceSpecialPacket
		{ after(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceSpecialPacketParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitor__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioPlotParserRuleCall_0()); }
		ruleGSSScenarioPlot
		{ after(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioPlotParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmMsgParserRuleCall_1()); }
		ruleGSSScenarioAlarmMsg
		{ after(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmMsgParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioModifyParserRuleCall_2()); }
		ruleGSSScenarioModify
		{ after(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioModifyParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmValParserRuleCall_3()); }
		ruleGSSScenarioAlarmVal
		{ after(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmValParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGV__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGVAccess().getGSSScenarioGVFilteredParserRuleCall_0()); }
		ruleGSSScenarioGVFiltered
		{ after(grammarAccess.getGSSScenarioGVAccess().getGSSScenarioGVFilteredParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioGVAccess().getGSSScenarioGVPeriodicParserRuleCall_1()); }
		ruleGSSScenarioGVPeriodic
		{ after(grammarAccess.getGSSScenarioGVAccess().getGSSScenarioGVPeriodicParserRuleCall_1()); }
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

rule__GSSScenarioEnableDisable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
		('disabled')
		{ after(grammarAccess.getGSSScenarioEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
		('enabled')
		{ after(grammarAccess.getGSSScenarioEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
		('SpW')
		{ after(grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1()); }
		('SpW_TC')
		{ after(grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2()); }
		('SpW_Error')
		{ after(grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceTypeAccess().getUartEnumLiteralDeclaration_3()); }
		('uart')
		{ after(grammarAccess.getGSSScenarioInterfaceTypeAccess().getUartEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4()); }
		('dummy')
		{ after(grammarAccess.getGSSScenarioInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaceIOType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0()); }
		('in_out')
		{ after(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1()); }
		('in')
		{ after(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2()); }
		('out')
		{ after(grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevelLevel__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0()); }
		('_1')
		{ after(grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1()); }
		('_2')
		{ after(grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2()); }
		('_3')
		{ after(grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
		('miliseconds')
		{ after(grammarAccess.getGSSScenarioUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
		('seconds')
		{ after(grammarAccess.getGSSScenarioUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVarType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0()); }
		('uint')
		{ after(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1()); }
		('formula')
		{ after(grammarAccess.getGSSScenarioGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceFieldType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0()); }
		('tm')
		{ after(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1()); }
		('tc')
		{ after(grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsgType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0()); }
		('alarm1')
		{ after(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1()); }
		('alarm2')
		{ after(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2()); }
		('alarm3')
		{ after(grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModifyType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioModifyTypeAccess().getIncrementEnumLiteralDeclaration_0()); }
		('increment')
		{ after(grammarAccess.getGSSScenarioModifyTypeAccess().getIncrementEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSScenarioModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1()); }
		('increment1wrap')
		{ after(grammarAccess.getGSSScenarioModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1()); }
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


rule__GSSEnvironmentEnvironment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__0__Impl
	rule__GSSEnvironmentEnvironment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0()); }
	'GSSEnvironmentEnvironment'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__1__Impl
	rule__GSSEnvironmentEnvironment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getNameAssignment_1()); }
	(rule__GSSEnvironmentEnvironment__NameAssignment_1)
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__2__Impl
	rule__GSSEnvironmentEnvironment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__3__Impl
	rule__GSSEnvironmentEnvironment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getGroup_3()); }
	(rule__GSSEnvironmentEnvironment__Group_3__0)
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__4__Impl
	rule__GSSEnvironmentEnvironment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionKeyword_4()); }
	'version'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__5__Impl
	rule__GSSEnvironmentEnvironment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__6__Impl
	rule__GSSEnvironmentEnvironment__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionAssignment_6()); }
	(rule__GSSEnvironmentEnvironment__VersionAssignment_6)
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__7__Impl
	rule__GSSEnvironmentEnvironment__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__8__Impl
	rule__GSSEnvironmentEnvironment__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioAssignment_8()); }
		(rule__GSSEnvironmentEnvironment__ScenarioAssignment_8)
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioAssignment_8()); }
	)
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioAssignment_8()); }
		(rule__GSSEnvironmentEnvironment__ScenarioAssignment_8)*
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioAssignment_8()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__9__Impl
	rule__GSSEnvironmentEnvironment__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSEnvironmentEnvironment__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group_3__0__Impl
	rule__GSSEnvironmentEnvironment__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriKeyword_3_0()); }
	'uri'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group_3__1__Impl
	rule__GSSEnvironmentEnvironment__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_3_1()); }
	':='
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group_3__2__Impl
	rule__GSSEnvironmentEnvironment__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriAssignment_3_2()); }
	(rule__GSSEnvironmentEnvironment__UriAssignment_3_2)
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSEnvironmentEnvironment__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_3_3()); }
	';'
	{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioScenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__0__Impl
	rule__GSSScenarioScenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getGSSScenarioScenarioKeyword_0()); }
	'GSSScenarioScenario'
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getGSSScenarioScenarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__1__Impl
	rule__GSSScenarioScenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getNameAssignment_1()); }
	(rule__GSSScenarioScenario__NameAssignment_1)
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__2__Impl
	rule__GSSScenarioScenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__3__Impl
	rule__GSSScenarioScenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsAssignment_3()); }
	(rule__GSSScenarioScenario__Gss_optionsAssignment_3)
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__4__Impl
	rule__GSSScenarioScenario__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsAssignment_4()); }
	(rule__GSSScenarioScenario__ProtocolsAssignment_4)
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__5__Impl
	rule__GSSScenarioScenario__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesAssignment_5()); }
	(rule__GSSScenarioScenario__InterfacesAssignment_5)
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__6__Impl
	rule__GSSScenarioScenario__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsAssignment_6()); }
	(rule__GSSScenarioScenario__SpecialPacketsAssignment_6)?
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__7__Impl
	rule__GSSScenarioScenario__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsAssignment_7()); }
	(rule__GSSScenarioScenario__PeriodicTCsAssignment_7)?
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__8__Impl
	rule__GSSScenarioScenario__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()); }
	(rule__GSSScenarioScenario__UnorderedGroup_8)?
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__9__Impl
	rule__GSSScenarioScenario__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioScenarioAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSScenarioScenarioAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioOptions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__0__Impl
	rule__GSSScenarioOptions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getGSSScenarioOptionsKeyword_0()); }
	'GSSScenarioOptions'
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getGSSScenarioOptionsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__1__Impl
	rule__GSSScenarioOptions__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__2__Impl
	rule__GSSScenarioOptions__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoAssignment_2()); }
	(rule__GSSScenarioOptions__Gss_infoAssignment_2)
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__3__Impl
	rule__GSSScenarioOptions__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printAssignment_3()); }
	(rule__GSSScenarioOptions__Gss_info_printAssignment_3)
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__4__Impl
	rule__GSSScenarioOptions__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printAssignment_4()); }
	(rule__GSSScenarioOptions__Phy_header_printAssignment_4)
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__5__Impl
	rule__GSSScenarioOptions__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsAssignment_5()); }
	(rule__GSSScenarioOptions__DiscardErrorFlagsAssignment_5)
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__6__Impl
	rule__GSSScenarioOptions__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioOptions__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioOptionsAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSScenarioOptionsAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioProtocols__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocols__Group__0__Impl
	rule__GSSScenarioProtocols__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsAction_0()); }
	()
	{ after(grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocols__Group__1__Impl
	rule__GSSScenarioProtocols__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsKeyword_1()); }
	'GSSScenarioProtocols'
	{ after(grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocols__Group__2__Impl
	rule__GSSScenarioProtocols__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSScenarioProtocolsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocols__Group__3__Impl
	rule__GSSScenarioProtocols__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolAssignment_3()); }
	(rule__GSSScenarioProtocols__ProtocolAssignment_3)*
	{ after(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocols__Group__4__Impl
	rule__GSSScenarioProtocols__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSScenarioProtocolsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocols__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioInterfaces__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__0__Impl
	rule__GSSScenarioInterfaces__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getGSSScenarioInterfacesKeyword_0()); }
	'GSSScenarioInterfaces'
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getGSSScenarioInterfacesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__1__Impl
	rule__GSSScenarioInterfaces__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__2__Impl
	rule__GSSScenarioInterfaces__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getGroup_2()); }
	(rule__GSSScenarioInterfaces__Group_2__0)?
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__3__Impl
	rule__GSSScenarioInterfaces__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceAssignment_3()); }
	(rule__GSSScenarioInterfaces__MainInterfaceAssignment_3)
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__4__Impl
	rule__GSSScenarioInterfaces__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceAssignment_4()); }
	(rule__GSSScenarioInterfaces__InterfaceAssignment_4)*
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__5__Impl
	rule__GSSScenarioInterfaces__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioInterfaces__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group_2__0__Impl
	rule__GSSScenarioInterfaces__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileKeyword_2_0()); }
	'ProtocolPacketsFile'
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group_2__1__Impl
	rule__GSSScenarioInterfaces__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group_2__2__Impl
	rule__GSSScenarioInterfaces__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileAssignment_2_2()); }
	(rule__GSSScenarioInterfaces__ProtocolPacketsFileAssignment_2_2)
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterfaces__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioSpecialPackets__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPackets__Group__0__Impl
	rule__GSSScenarioSpecialPackets__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getGSSScenarioSpecialPacketsKeyword_0()); }
	'GSSScenarioSpecialPackets'
	{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getGSSScenarioSpecialPacketsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPackets__Group__1__Impl
	rule__GSSScenarioSpecialPackets__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPackets__Group__2__Impl
	rule__GSSScenarioSpecialPackets__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
		(rule__GSSScenarioSpecialPackets__SpecialPacketAssignment_2)
		{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
		(rule__GSSScenarioSpecialPackets__SpecialPacketAssignment_2)*
		{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPackets__Group__3__Impl
	rule__GSSScenarioSpecialPackets__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPackets__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCs__Group__0__Impl
	rule__GSSScenarioPeriodicTCs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsAction_0()); }
	()
	{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCs__Group__1__Impl
	rule__GSSScenarioPeriodicTCs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsKeyword_1()); }
	'GSSScenarioPeriodicTCs'
	{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCs__Group__2__Impl
	rule__GSSScenarioPeriodicTCs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCs__Group__3__Impl
	rule__GSSScenarioPeriodicTCs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTCAssignment_3()); }
	(rule__GSSScenarioPeriodicTCs__PeriodicTCAssignment_3)*
	{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTCAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCs__Group__4__Impl
	rule__GSSScenarioPeriodicTCs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGlobalVars__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVars__Group__0__Impl
	rule__GSSScenarioGlobalVars__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getGSSScenarioGlobalVarsKeyword_0()); }
	'GSSScenarioGlobalVars'
	{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getGSSScenarioGlobalVarsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVars__Group__1__Impl
	rule__GSSScenarioGlobalVars__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVars__Group__2__Impl
	rule__GSSScenarioGlobalVars__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarAssignment_2()); }
		(rule__GSSScenarioGlobalVars__GlobalVarAssignment_2)
		{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarAssignment_2()); }
		(rule__GSSScenarioGlobalVars__GlobalVarAssignment_2)*
		{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVars__Group__3__Impl
	rule__GSSScenarioGlobalVars__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVars__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioMonitors__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group__0__Impl
	rule__GSSScenarioMonitors__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getGSSScenarioMonitorsKeyword_0()); }
	'GSSScenarioMonitors'
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getGSSScenarioMonitorsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group__1__Impl
	rule__GSSScenarioMonitors__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group__2__Impl
	rule__GSSScenarioMonitors__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getGroup_2()); }
	(rule__GSSScenarioMonitors__Group_2__0)?
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group__3__Impl
	rule__GSSScenarioMonitors__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorAssignment_3()); }
		(rule__GSSScenarioMonitors__MonitorAssignment_3)
		{ after(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorAssignment_3()); }
	)
	(
		{ before(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorAssignment_3()); }
		(rule__GSSScenarioMonitors__MonitorAssignment_3)*
		{ after(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group__4__Impl
	rule__GSSScenarioMonitors__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioMonitors__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group_2__0__Impl
	rule__GSSScenarioMonitors__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileKeyword_2_0()); }
	'ChartsFile'
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group_2__1__Impl
	rule__GSSScenarioMonitors__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group_2__2__Impl
	rule__GSSScenarioMonitors__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileAssignment_2_2()); }
	(rule__GSSScenarioMonitors__ChartsFileAssignment_2_2)
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMonitors__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGSSInfo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__0__Impl
	rule__GSSScenarioGSSInfo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getGSSScenarioInfoKeyword_0()); }
	'GSSScenarioInfo'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getGSSScenarioInfoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__1__Impl
	rule__GSSScenarioGSSInfo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__2__Impl
	rule__GSSScenarioGSSInfo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignKeyword_2()); }
	'test_campaign'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__3__Impl
	rule__GSSScenarioGSSInfo__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__4__Impl
	rule__GSSScenarioGSSInfo__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignAssignment_4()); }
	(rule__GSSScenarioGSSInfo__Test_campaignAssignment_4)
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__5__Impl
	rule__GSSScenarioGSSInfo__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__6__Impl
	rule__GSSScenarioGSSInfo__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionKeyword_6()); }
	'version'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__7__Impl
	rule__GSSScenarioGSSInfo__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__8__Impl
	rule__GSSScenarioGSSInfo__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionAssignment_8()); }
	(rule__GSSScenarioGSSInfo__VersionAssignment_8)
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__9__Impl
	rule__GSSScenarioGSSInfo__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__10__Impl
	rule__GSSScenarioGSSInfo__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getDateKeyword_10()); }
	'date'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getDateKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__11__Impl
	rule__GSSScenarioGSSInfo__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__12__Impl
	rule__GSSScenarioGSSInfo__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getDateAssignment_12()); }
	(rule__GSSScenarioGSSInfo__DateAssignment_12)
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getDateAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__13__Impl
	rule__GSSScenarioGSSInfo__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__14__Impl
	rule__GSSScenarioGSSInfo__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getGroup_14()); }
	(rule__GSSScenarioGSSInfo__Group_14__0)?
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__15__Impl
	rule__GSSScenarioGSSInfo__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGSSInfo__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group_14__0__Impl
	rule__GSSScenarioGSSInfo__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlKeyword_14_0()); }
	'version_control_url'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group_14__1__Impl
	rule__GSSScenarioGSSInfo__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group_14__2__Impl
	rule__GSSScenarioGSSInfo__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlAssignment_14_2()); }
	(rule__GSSScenarioGSSInfo__Version_control_urlAssignment_14_2)
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfo__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGSSInfoPrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__0__Impl
	rule__GSSScenarioGSSInfoPrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGSSScenarioInfoPrintKeyword_0()); }
	'GSSScenarioInfoPrint'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGSSScenarioInfoPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__1__Impl
	rule__GSSScenarioGSSInfoPrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__2__Impl
	rule__GSSScenarioGSSInfoPrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogKeyword_2()); }
	'mainLog'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__3__Impl
	rule__GSSScenarioGSSInfoPrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__4__Impl
	rule__GSSScenarioGSSInfoPrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogAssignment_4()); }
	(rule__GSSScenarioGSSInfoPrint__MainLogAssignment_4)
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__5__Impl
	rule__GSSScenarioGSSInfoPrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__6__Impl
	rule__GSSScenarioGSSInfoPrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsKeyword_6()); }
	'portLogs'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__7__Impl
	rule__GSSScenarioGSSInfoPrint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__8__Impl
	rule__GSSScenarioGSSInfoPrint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsAssignment_8()); }
	(rule__GSSScenarioGSSInfoPrint__PortLogsAssignment_8)
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__9__Impl
	rule__GSSScenarioGSSInfoPrint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__10__Impl
	rule__GSSScenarioGSSInfoPrint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogKeyword_10()); }
	'rawLog'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__11__Impl
	rule__GSSScenarioGSSInfoPrint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__12__Impl
	rule__GSSScenarioGSSInfoPrint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogAssignment_12()); }
	(rule__GSSScenarioGSSInfoPrint__RawLogAssignment_12)
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__13__Impl
	rule__GSSScenarioGSSInfoPrint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__14__Impl
	rule__GSSScenarioGSSInfoPrint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSInfoPrint__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPhyHeaderPrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__0__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGSSScenarioPhyHeaderPrintKeyword_0()); }
	'GSSScenarioPhyHeaderPrint'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGSSScenarioPhyHeaderPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__1__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__2__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogKeyword_2()); }
	'mainLog'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__3__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__4__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogAssignment_4()); }
	(rule__GSSScenarioPhyHeaderPrint__MainLogAssignment_4)
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__5__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__6__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsKeyword_6()); }
	'portLogs'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__7__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__8__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsAssignment_8()); }
	(rule__GSSScenarioPhyHeaderPrint__PortLogsAssignment_8)
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__9__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__10__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogKeyword_10()); }
	'rawLog'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__11__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__12__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogAssignment_12()); }
	(rule__GSSScenarioPhyHeaderPrint__RawLogAssignment_12)
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__13__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__14__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsKeyword_14()); }
	'gssTabs'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__15__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__16__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsAssignment_16()); }
	(rule__GSSScenarioPhyHeaderPrint__GssTabsAssignment_16)
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__17__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__18__Impl
	rule__GSSScenarioPhyHeaderPrint__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPhyHeaderPrint__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGSSDiscardErrorFlags__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__0__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGSSScenarioDiscardErrorFlagsKeyword_0()); }
	'GSSScenarioDiscardErrorFlags'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGSSScenarioDiscardErrorFlagsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__1__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__2__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2()); }
	'txErrors'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__3__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__4__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4()); }
	(rule__GSSScenarioGSSDiscardErrorFlags__TxErrorsAssignment_4)
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__5__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__6__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6()); }
	'notExpectedPackets'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__7__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__8__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8()); }
	(rule__GSSScenarioGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8)
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__9__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__10__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10()); }
	'filtersKo'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__11__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__12__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12()); }
	(rule__GSSScenarioGSSDiscardErrorFlags__FiltersKoAssignment_12)
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__13__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__14__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14()); }
	'validTimesKo'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__15__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__16__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16()); }
	(rule__GSSScenarioGSSDiscardErrorFlags__ValidTimesKoAssignment_16)
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__17__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__18__Impl
	rule__GSSScenarioGSSDiscardErrorFlags__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGSSDiscardErrorFlags__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioProtocol__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__0__Impl
	rule__GSSScenarioProtocol__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getGSSScenarioProtocolKeyword_0()); }
	'GSSScenarioProtocol'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getGSSScenarioProtocolKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__1__Impl
	rule__GSSScenarioProtocol__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__2__Impl
	rule__GSSScenarioProtocol__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__3__Impl
	rule__GSSScenarioProtocol__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__4__Impl
	rule__GSSScenarioProtocol__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getIdAssignment_4()); }
	(rule__GSSScenarioProtocol__IdAssignment_4)
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__5__Impl
	rule__GSSScenarioProtocol__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__6__Impl
	rule__GSSScenarioProtocol__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__7__Impl
	rule__GSSScenarioProtocol__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__8__Impl
	rule__GSSScenarioProtocol__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getNameAssignment_8()); }
	(rule__GSSScenarioProtocol__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__9__Impl
	rule__GSSScenarioProtocol__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__10__Impl
	rule__GSSScenarioProtocol__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelKeyword_10()); }
	'typeLevel'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__11__Impl
	rule__GSSScenarioProtocol__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__12__Impl
	rule__GSSScenarioProtocol__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelAssignment_12()); }
	(rule__GSSScenarioProtocol__TypeLevelAssignment_12)
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__13__Impl
	rule__GSSScenarioProtocol__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__14__Impl
	rule__GSSScenarioProtocol__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getTypeAssignment_14()); }
	(rule__GSSScenarioProtocol__TypeAssignment_14)
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getTypeAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__15__Impl
	rule__GSSScenarioProtocol__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeAssignment_15()); }
	(rule__GSSScenarioProtocol__SubtypeAssignment_15)?
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__16__Impl
	rule__GSSScenarioProtocol__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getRightCurlyBracketKeyword_16()); }
	'}'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getRightCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocol__Group__17__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioProtocolType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__0__Impl
	rule__GSSScenarioProtocolType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getGSSScenarioProtocolTypeKeyword_0()); }
	'GSSScenarioProtocolType'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getGSSScenarioProtocolTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__1__Impl
	rule__GSSScenarioProtocolType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__2__Impl
	rule__GSSScenarioProtocolType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__3__Impl
	rule__GSSScenarioProtocolType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__4__Impl
	rule__GSSScenarioProtocolType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameAssignment_4()); }
	(rule__GSSScenarioProtocolType__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__5__Impl
	rule__GSSScenarioProtocolType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__6__Impl
	rule__GSSScenarioProtocolType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetKeyword_6()); }
	'offset'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__7__Impl
	rule__GSSScenarioProtocolType__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__8__Impl
	rule__GSSScenarioProtocolType__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetAssignment_8()); }
	(rule__GSSScenarioProtocolType__OffsetAssignment_8)
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__9__Impl
	rule__GSSScenarioProtocolType__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__10__Impl
	rule__GSSScenarioProtocolType__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolType__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioProtocolSubtype__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__0__Impl
	rule__GSSScenarioProtocolSubtype__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGSSScenarioProtocolSubtypeKeyword_0()); }
	'GSSScenarioProtocolSubtype'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGSSScenarioProtocolSubtypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__1__Impl
	rule__GSSScenarioProtocolSubtype__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__2__Impl
	rule__GSSScenarioProtocolSubtype__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__3__Impl
	rule__GSSScenarioProtocolSubtype__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__4__Impl
	rule__GSSScenarioProtocolSubtype__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameAssignment_4()); }
	(rule__GSSScenarioProtocolSubtype__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__5__Impl
	rule__GSSScenarioProtocolSubtype__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__6__Impl
	rule__GSSScenarioProtocolSubtype__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetKeyword_6()); }
	'offset'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__7__Impl
	rule__GSSScenarioProtocolSubtype__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__8__Impl
	rule__GSSScenarioProtocolSubtype__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetAssignment_8()); }
	(rule__GSSScenarioProtocolSubtype__OffsetAssignment_8)
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__9__Impl
	rule__GSSScenarioProtocolSubtype__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__10__Impl
	rule__GSSScenarioProtocolSubtype__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioProtocolSubtype__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioMainInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__0__Impl
	rule__GSSScenarioMainInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getGSSScenarioMainInterfaceKeyword_0()); }
	'GSSScenarioMainInterface'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getGSSScenarioMainInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__1__Impl
	rule__GSSScenarioMainInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__2__Impl
	rule__GSSScenarioMainInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__3__Impl
	rule__GSSScenarioMainInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__4__Impl
	rule__GSSScenarioMainInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdAssignment_4()); }
	(rule__GSSScenarioMainInterface__IdAssignment_4)
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__5__Impl
	rule__GSSScenarioMainInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__6__Impl
	rule__GSSScenarioMainInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__7__Impl
	rule__GSSScenarioMainInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__8__Impl
	rule__GSSScenarioMainInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameAssignment_8()); }
	(rule__GSSScenarioMainInterface__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__9__Impl
	rule__GSSScenarioMainInterface__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__10__Impl
	rule__GSSScenarioMainInterface__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeKeyword_10()); }
	'ifType'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__11__Impl
	rule__GSSScenarioMainInterface__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__12__Impl
	rule__GSSScenarioMainInterface__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeAssignment_12()); }
	(rule__GSSScenarioMainInterface__IfTypeAssignment_12)
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__13__Impl
	rule__GSSScenarioMainInterface__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__14__Impl
	rule__GSSScenarioMainInterface__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigKeyword_14()); }
	'ifConfig'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__15__Impl
	rule__GSSScenarioMainInterface__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__16__Impl
	rule__GSSScenarioMainInterface__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigAssignment_16()); }
	(rule__GSSScenarioMainInterface__IfConfigAssignment_16)
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__17__Impl
	rule__GSSScenarioMainInterface__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__18__Impl
	rule__GSSScenarioMainInterface__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeKeyword_18()); }
	'ioType'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__19__Impl
	rule__GSSScenarioMainInterface__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__20__Impl
	rule__GSSScenarioMainInterface__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeAssignment_20()); }
	(rule__GSSScenarioMainInterface__IoTypeAssignment_20)
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__21__Impl
	rule__GSSScenarioMainInterface__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__22__Impl
	rule__GSSScenarioMainInterface__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getGroup_22()); }
	(rule__GSSScenarioMainInterface__Group_22__0)?
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__23__Impl
	rule__GSSScenarioMainInterface__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutAssignment_23()); }
		(rule__GSSScenarioMainInterface__LevelInOutAssignment_23)
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutAssignment_23()); }
	)
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutAssignment_23()); }
		(rule__GSSScenarioMainInterface__LevelInOutAssignment_23)*
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutAssignment_23()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__24__Impl
	rule__GSSScenarioMainInterface__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioMainInterface__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group_22__0__Impl
	rule__GSSScenarioMainInterface__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDKeyword_22_0()); }
	'protocolID'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group_22__1__Impl
	rule__GSSScenarioMainInterface__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group_22__2__Impl
	rule__GSSScenarioMainInterface__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDAssignment_22_2()); }
	(rule__GSSScenarioMainInterface__ProtocolIDAssignment_22_2)
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioMainInterface__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__0__Impl
	rule__GSSScenarioInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getGSSScenarioInterfaceKeyword_0()); }
	'GSSScenarioInterface'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getGSSScenarioInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__1__Impl
	rule__GSSScenarioInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__2__Impl
	rule__GSSScenarioInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__3__Impl
	rule__GSSScenarioInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__4__Impl
	rule__GSSScenarioInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIdAssignment_4()); }
	(rule__GSSScenarioInterface__IdAssignment_4)
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__5__Impl
	rule__GSSScenarioInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__6__Impl
	rule__GSSScenarioInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__7__Impl
	rule__GSSScenarioInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__8__Impl
	rule__GSSScenarioInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getNameAssignment_8()); }
	(rule__GSSScenarioInterface__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__9__Impl
	rule__GSSScenarioInterface__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__10__Impl
	rule__GSSScenarioInterface__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeKeyword_10()); }
	'ifType'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__11__Impl
	rule__GSSScenarioInterface__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__12__Impl
	rule__GSSScenarioInterface__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeAssignment_12()); }
	(rule__GSSScenarioInterface__IfTypeAssignment_12)
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__13__Impl
	rule__GSSScenarioInterface__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__14__Impl
	rule__GSSScenarioInterface__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigKeyword_14()); }
	'ifConfig'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__15__Impl
	rule__GSSScenarioInterface__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__16__Impl
	rule__GSSScenarioInterface__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigAssignment_16()); }
	(rule__GSSScenarioInterface__IfConfigAssignment_16)
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__17__Impl
	rule__GSSScenarioInterface__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__18__Impl
	rule__GSSScenarioInterface__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeKeyword_18()); }
	'ioType'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__19__Impl
	rule__GSSScenarioInterface__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__20__Impl
	rule__GSSScenarioInterface__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeAssignment_20()); }
	(rule__GSSScenarioInterface__IoTypeAssignment_20)
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__21__Impl
	rule__GSSScenarioInterface__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__22__Impl
	rule__GSSScenarioInterface__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getGroup_22()); }
	(rule__GSSScenarioInterface__Group_22__0)?
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__23__Impl
	rule__GSSScenarioInterface__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getAlternatives_23()); }
		(rule__GSSScenarioInterface__Alternatives_23)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getAlternatives_23()); }
	)
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getAlternatives_23()); }
		(rule__GSSScenarioInterface__Alternatives_23)*
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getAlternatives_23()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__24__Impl
	rule__GSSScenarioInterface__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioInterface__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group_22__0__Impl
	rule__GSSScenarioInterface__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDKeyword_22_0()); }
	'protocolID'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group_22__1__Impl
	rule__GSSScenarioInterface__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group_22__2__Impl
	rule__GSSScenarioInterface__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDAssignment_22_2()); }
	(rule__GSSScenarioInterface__ProtocolIDAssignment_22_2)
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioInterface__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelInOut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__0__Impl
	rule__GSSScenarioLevelInOut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getGSSScenarioLevelInOutKeyword_0()); }
	'GSSScenarioLevelInOut'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getGSSScenarioLevelInOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__1__Impl
	rule__GSSScenarioLevelInOut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__2__Impl
	rule__GSSScenarioLevelInOut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__3__Impl
	rule__GSSScenarioLevelInOut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__4__Impl
	rule__GSSScenarioLevelInOut__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getIdAssignment_4()); }
	(rule__GSSScenarioLevelInOut__IdAssignment_4)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__5__Impl
	rule__GSSScenarioLevelInOut__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__6__Impl
	rule__GSSScenarioLevelInOut__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__7__Impl
	rule__GSSScenarioLevelInOut__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__8__Impl
	rule__GSSScenarioLevelInOut__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getNameAssignment_8()); }
	(rule__GSSScenarioLevelInOut__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__9__Impl
	rule__GSSScenarioLevelInOut__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__10__Impl
	rule__GSSScenarioLevelInOut__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatKeyword_10()); }
	'TMformat'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__11__Impl
	rule__GSSScenarioLevelInOut__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__12__Impl
	rule__GSSScenarioLevelInOut__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatAssignment_12()); }
	(rule__GSSScenarioLevelInOut__TMformatAssignment_12)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__13__Impl
	rule__GSSScenarioLevelInOut__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__14__Impl
	rule__GSSScenarioLevelInOut__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatKeyword_14()); }
	'TCformat'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__15__Impl
	rule__GSSScenarioLevelInOut__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__16__Impl
	rule__GSSScenarioLevelInOut__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatAssignment_16()); }
	(rule__GSSScenarioLevelInOut__TCformatAssignment_16)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__17__Impl
	rule__GSSScenarioLevelInOut__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__18__Impl
	rule__GSSScenarioLevelInOut__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterKeyword_18()); }
	'inputFilter'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__19__Impl
	rule__GSSScenarioLevelInOut__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__20__Impl
	rule__GSSScenarioLevelInOut__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterAssignment_20()); }
	(rule__GSSScenarioLevelInOut__InputFilterAssignment_20)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__21__Impl
	rule__GSSScenarioLevelInOut__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__22__Impl
	rule__GSSScenarioLevelInOut__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup_22()); }
	(rule__GSSScenarioLevelInOut__Group_22__0)?
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__23__Impl
	rule__GSSScenarioLevelInOut__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup_23()); }
	(rule__GSSScenarioLevelInOut__Group_23__0)?
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__24__Impl
	rule__GSSScenarioLevelInOut__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelInOut__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_22__0__Impl
	rule__GSSScenarioLevelInOut__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0()); }
	'export_to_prev_Level'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_22__1__Impl
	rule__GSSScenarioLevelInOut__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_22__2__Impl
	rule__GSSScenarioLevelInOut__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2()); }
	(rule__GSSScenarioLevelInOut__Export_to_prev_LevelAssignment_22_2)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelInOut__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_23__0__Impl
	rule__GSSScenarioLevelInOut__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_23__1__Impl
	rule__GSSScenarioLevelInOut__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_23__2__Impl
	rule__GSSScenarioLevelInOut__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2()); }
	(rule__GSSScenarioLevelInOut__Import_from_prev_LevelAssignment_23_2)
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelInOut__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelIn__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__0__Impl
	rule__GSSScenarioLevelIn__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getGSSScenarioLevelInKeyword_0()); }
	'GSSScenarioLevelIn'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getGSSScenarioLevelInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__1__Impl
	rule__GSSScenarioLevelIn__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__2__Impl
	rule__GSSScenarioLevelIn__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__3__Impl
	rule__GSSScenarioLevelIn__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__4__Impl
	rule__GSSScenarioLevelIn__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getIdAssignment_4()); }
	(rule__GSSScenarioLevelIn__IdAssignment_4)
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__5__Impl
	rule__GSSScenarioLevelIn__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__6__Impl
	rule__GSSScenarioLevelIn__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__7__Impl
	rule__GSSScenarioLevelIn__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__8__Impl
	rule__GSSScenarioLevelIn__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getNameAssignment_8()); }
	(rule__GSSScenarioLevelIn__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__9__Impl
	rule__GSSScenarioLevelIn__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__10__Impl
	rule__GSSScenarioLevelIn__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getTCformatKeyword_10()); }
	'TCformat'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getTCformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__11__Impl
	rule__GSSScenarioLevelIn__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__12__Impl
	rule__GSSScenarioLevelIn__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getTCformatAssignment_12()); }
	(rule__GSSScenarioLevelIn__TCformatAssignment_12)
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getTCformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__13__Impl
	rule__GSSScenarioLevelIn__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__14__Impl
	rule__GSSScenarioLevelIn__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getGroup_14()); }
	(rule__GSSScenarioLevelIn__Group_14__0)?
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__15__Impl
	rule__GSSScenarioLevelIn__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelIn__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group_14__0__Impl
	rule__GSSScenarioLevelIn__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelKeyword_14_0()); }
	'export_to_prev_Level'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group_14__1__Impl
	rule__GSSScenarioLevelIn__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group_14__2__Impl
	rule__GSSScenarioLevelIn__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelAssignment_14_2()); }
	(rule__GSSScenarioLevelIn__Export_to_prev_LevelAssignment_14_2)
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelIn__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelOut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__0__Impl
	rule__GSSScenarioLevelOut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getGSSScenarioLevelOutKeyword_0()); }
	'GSSScenarioLevelOut'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getGSSScenarioLevelOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__1__Impl
	rule__GSSScenarioLevelOut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__2__Impl
	rule__GSSScenarioLevelOut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__3__Impl
	rule__GSSScenarioLevelOut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__4__Impl
	rule__GSSScenarioLevelOut__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getIdAssignment_4()); }
	(rule__GSSScenarioLevelOut__IdAssignment_4)
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__5__Impl
	rule__GSSScenarioLevelOut__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__6__Impl
	rule__GSSScenarioLevelOut__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__7__Impl
	rule__GSSScenarioLevelOut__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__8__Impl
	rule__GSSScenarioLevelOut__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getNameAssignment_8()); }
	(rule__GSSScenarioLevelOut__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__9__Impl
	rule__GSSScenarioLevelOut__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__10__Impl
	rule__GSSScenarioLevelOut__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatKeyword_10()); }
	'TMformat'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__11__Impl
	rule__GSSScenarioLevelOut__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__12__Impl
	rule__GSSScenarioLevelOut__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatAssignment_12()); }
	(rule__GSSScenarioLevelOut__TMformatAssignment_12)
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__13__Impl
	rule__GSSScenarioLevelOut__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__14__Impl
	rule__GSSScenarioLevelOut__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterKeyword_14()); }
	'inputFilter'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__15__Impl
	rule__GSSScenarioLevelOut__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__16__Impl
	rule__GSSScenarioLevelOut__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterAssignment_16()); }
	(rule__GSSScenarioLevelOut__InputFilterAssignment_16)
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__17__Impl
	rule__GSSScenarioLevelOut__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__18__Impl
	rule__GSSScenarioLevelOut__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getGroup_18()); }
	(rule__GSSScenarioLevelOut__Group_18__0)?
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__19__Impl
	rule__GSSScenarioLevelOut__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioLevelOut__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group_18__0__Impl
	rule__GSSScenarioLevelOut__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelKeyword_18_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group_18__1__Impl
	rule__GSSScenarioLevelOut__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group_18__2__Impl
	rule__GSSScenarioLevelOut__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelAssignment_18_2()); }
	(rule__GSSScenarioLevelOut__Import_from_prev_LevelAssignment_18_2)
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioLevelOut__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioSpecialPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__0__Impl
	rule__GSSScenarioSpecialPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getGSSScenarioSpecialPacketKeyword_0()); }
	'GSSScenarioSpecialPacket'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getGSSScenarioSpecialPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__1__Impl
	rule__GSSScenarioSpecialPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__2__Impl
	rule__GSSScenarioSpecialPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusKeyword_2()); }
	'status'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__3__Impl
	rule__GSSScenarioSpecialPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__4__Impl
	rule__GSSScenarioSpecialPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusAssignment_4()); }
	(rule__GSSScenarioSpecialPacket__StatusAssignment_4)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__5__Impl
	rule__GSSScenarioSpecialPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__6__Impl
	rule__GSSScenarioSpecialPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__7__Impl
	rule__GSSScenarioSpecialPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__8__Impl
	rule__GSSScenarioSpecialPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameAssignment_8()); }
	(rule__GSSScenarioSpecialPacket__NameAssignment_8)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__9__Impl
	rule__GSSScenarioSpecialPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__10__Impl
	rule__GSSScenarioSpecialPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdKeyword_10()); }
	'id'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__11__Impl
	rule__GSSScenarioSpecialPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__12__Impl
	rule__GSSScenarioSpecialPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdAssignment_12()); }
	(rule__GSSScenarioSpecialPacket__IdAssignment_12)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__13__Impl
	rule__GSSScenarioSpecialPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__14__Impl
	rule__GSSScenarioSpecialPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefKeyword_14()); }
	'ifRef'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__15__Impl
	rule__GSSScenarioSpecialPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__16__Impl
	rule__GSSScenarioSpecialPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefAssignment_16()); }
	(rule__GSSScenarioSpecialPacket__IfRefAssignment_16)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__17__Impl
	rule__GSSScenarioSpecialPacket__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__18__Impl
	rule__GSSScenarioSpecialPacket__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsKeyword_18()); }
	'levels'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__19__Impl
	rule__GSSScenarioSpecialPacket__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__20__Impl
	rule__GSSScenarioSpecialPacket__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsAssignment_20()); }
	(rule__GSSScenarioSpecialPacket__LevelsAssignment_20)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__21__Impl
	rule__GSSScenarioSpecialPacket__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__22__Impl
	rule__GSSScenarioSpecialPacket__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefKeyword_22()); }
	'levelRef'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__23__Impl
	rule__GSSScenarioSpecialPacket__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__24__Impl
	rule__GSSScenarioSpecialPacket__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefAssignment_24()); }
	(rule__GSSScenarioSpecialPacket__LevelRefAssignment_24)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__25__Impl
	rule__GSSScenarioSpecialPacket__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__26__Impl
	rule__GSSScenarioSpecialPacket__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterKeyword_26()); }
	'inputFilter'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__27__Impl
	rule__GSSScenarioSpecialPacket__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_27()); }
	':='
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__28__Impl
	rule__GSSScenarioSpecialPacket__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterAssignment_28()); }
	(rule__GSSScenarioSpecialPacket__InputFilterAssignment_28)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__29__Impl
	rule__GSSScenarioSpecialPacket__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_29()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__30__Impl
	rule__GSSScenarioSpecialPacket__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsAssignment_30()); }
	(rule__GSSScenarioSpecialPacket__UpperLevelsAssignment_30)?
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsAssignment_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__31__Impl
	rule__GSSScenarioSpecialPacket__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataAssignment_31()); }
	(rule__GSSScenarioSpecialPacket__PrintingDataAssignment_31)
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataAssignment_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__32__Impl
	rule__GSSScenarioSpecialPacket__Group__33
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getAlternatives_32()); }
	(rule__GSSScenarioSpecialPacket__Alternatives_32)?
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getAlternatives_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__33
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__33__Impl
	rule__GSSScenarioSpecialPacket__Group__34
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__33__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getRightCurlyBracketKeyword_33()); }
	'}'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getRightCurlyBracketKeyword_33()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__34
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioSpecialPacket__Group__34__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__Group__34__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_34()); }
	';'
	{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_34()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioUpperLevels__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevels__Group__0__Impl
	rule__GSSScenarioUpperLevels__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getGSSScenarioUpperLevelsKeyword_0()); }
	'GSSScenarioUpperLevels'
	{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getGSSScenarioUpperLevelsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevels__Group__1__Impl
	rule__GSSScenarioUpperLevels__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevels__Group__2__Impl
	rule__GSSScenarioUpperLevels__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelAssignment_2()); }
		(rule__GSSScenarioUpperLevels__UpperLevelAssignment_2)
		{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelAssignment_2()); }
		(rule__GSSScenarioUpperLevels__UpperLevelAssignment_2)*
		{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevels__Group__3__Impl
	rule__GSSScenarioUpperLevels__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevels__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPrintingData__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__0__Impl
	rule__GSSScenarioPrintingData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getGSSScenarioPrintingDataKeyword_0()); }
	'GSSScenarioPrintingData'
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getGSSScenarioPrintingDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__1__Impl
	rule__GSSScenarioPrintingData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__2__Impl
	rule__GSSScenarioPrintingData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusKeyword_2()); }
	'printStatus'
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__3__Impl
	rule__GSSScenarioPrintingData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__4__Impl
	rule__GSSScenarioPrintingData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusAssignment_4()); }
	(rule__GSSScenarioPrintingData__PrintStatusAssignment_4)
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__5__Impl
	rule__GSSScenarioPrintingData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__6__Impl
	rule__GSSScenarioPrintingData__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataAssignment_6()); }
	(rule__GSSScenarioPrintingData__StructuredDataAssignment_6)?
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__7__Impl
	rule__GSSScenarioPrintingData__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPrintingData__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriod__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__0__Impl
	rule__GSSScenarioPeriod__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getGSSScenarioPeriodKeyword_0()); }
	'GSSScenarioPeriod'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getGSSScenarioPeriodKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__1__Impl
	rule__GSSScenarioPeriod__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__2__Impl
	rule__GSSScenarioPeriod__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueKeyword_2()); }
	'min_value'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__3__Impl
	rule__GSSScenarioPeriod__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__4__Impl
	rule__GSSScenarioPeriod__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueAssignment_4()); }
	(rule__GSSScenarioPeriod__Min_valueAssignment_4)
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__5__Impl
	rule__GSSScenarioPeriod__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__6__Impl
	rule__GSSScenarioPeriod__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitKeyword_6()); }
	'min_unit'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__7__Impl
	rule__GSSScenarioPeriod__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__8__Impl
	rule__GSSScenarioPeriod__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitAssignment_8()); }
	(rule__GSSScenarioPeriod__Min_unitAssignment_8)
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__9__Impl
	rule__GSSScenarioPeriod__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__10__Impl
	rule__GSSScenarioPeriod__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueKeyword_10()); }
	'max_value'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__11__Impl
	rule__GSSScenarioPeriod__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__12__Impl
	rule__GSSScenarioPeriod__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueAssignment_12()); }
	(rule__GSSScenarioPeriod__Max_valueAssignment_12)
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__13__Impl
	rule__GSSScenarioPeriod__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__14__Impl
	rule__GSSScenarioPeriod__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitKeyword_14()); }
	'max_unit'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__15__Impl
	rule__GSSScenarioPeriod__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__16__Impl
	rule__GSSScenarioPeriod__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitAssignment_16()); }
	(rule__GSSScenarioPeriod__Max_unitAssignment_16)
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__17__Impl
	rule__GSSScenarioPeriod__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__18__Impl
	rule__GSSScenarioPeriod__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriod__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioIntervalRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__0__Impl
	rule__GSSScenarioIntervalRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getGSSScenarioIntervalRangeKeyword_0()); }
	'GSSScenarioIntervalRange'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getGSSScenarioIntervalRangeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__1__Impl
	rule__GSSScenarioIntervalRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__2__Impl
	rule__GSSScenarioIntervalRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinKeyword_2()); }
	'min'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__3__Impl
	rule__GSSScenarioIntervalRange__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__4__Impl
	rule__GSSScenarioIntervalRange__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinAssignment_4()); }
	(rule__GSSScenarioIntervalRange__MinAssignment_4)
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__5__Impl
	rule__GSSScenarioIntervalRange__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__6__Impl
	rule__GSSScenarioIntervalRange__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxKeyword_6()); }
	'max'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__7__Impl
	rule__GSSScenarioIntervalRange__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__8__Impl
	rule__GSSScenarioIntervalRange__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxAssignment_8()); }
	(rule__GSSScenarioIntervalRange__MaxAssignment_8)
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__9__Impl
	rule__GSSScenarioIntervalRange__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__10__Impl
	rule__GSSScenarioIntervalRange__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueKeyword_10()); }
	'interval_value'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__11__Impl
	rule__GSSScenarioIntervalRange__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__12__Impl
	rule__GSSScenarioIntervalRange__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueAssignment_12()); }
	(rule__GSSScenarioIntervalRange__Interval_valueAssignment_12)
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__13__Impl
	rule__GSSScenarioIntervalRange__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__14__Impl
	rule__GSSScenarioIntervalRange__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitKeyword_14()); }
	'interval_unit'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__15__Impl
	rule__GSSScenarioIntervalRange__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__16__Impl
	rule__GSSScenarioIntervalRange__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitAssignment_16()); }
	(rule__GSSScenarioIntervalRange__Interval_unitAssignment_16)
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__17__Impl
	rule__GSSScenarioIntervalRange__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__18__Impl
	rule__GSSScenarioIntervalRange__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioIntervalRange__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioUpperLevel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__0__Impl
	rule__GSSScenarioUpperLevel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getGSSScenarioUpperLevelKeyword_0()); }
	'GSSScenarioUpperLevel'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getGSSScenarioUpperLevelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__1__Impl
	rule__GSSScenarioUpperLevel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__2__Impl
	rule__GSSScenarioUpperLevel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelKeyword_2()); }
	'level'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__3__Impl
	rule__GSSScenarioUpperLevel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__4__Impl
	rule__GSSScenarioUpperLevel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelAssignment_4()); }
	(rule__GSSScenarioUpperLevel__LevelAssignment_4)
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__5__Impl
	rule__GSSScenarioUpperLevel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__6__Impl
	rule__GSSScenarioUpperLevel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_6()); }
	(rule__GSSScenarioUpperLevel__Group_6__0)?
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__7__Impl
	rule__GSSScenarioUpperLevel__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_7()); }
	(rule__GSSScenarioUpperLevel__Group_7__0)?
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__8__Impl
	rule__GSSScenarioUpperLevel__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_8()); }
	(rule__GSSScenarioUpperLevel__Group_8__0)?
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__9__Impl
	rule__GSSScenarioUpperLevel__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioUpperLevel__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_6__0__Impl
	rule__GSSScenarioUpperLevel__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatKeyword_6_0()); }
	'TMformat'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_6__1__Impl
	rule__GSSScenarioUpperLevel__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_6__2__Impl
	rule__GSSScenarioUpperLevel__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatAssignment_6_2()); }
	(rule__GSSScenarioUpperLevel__TMformatAssignment_6_2)
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioUpperLevel__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_7__0__Impl
	rule__GSSScenarioUpperLevel__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterKeyword_7_0()); }
	'inputFilter'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_7__1__Impl
	rule__GSSScenarioUpperLevel__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_7_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_7__2__Impl
	rule__GSSScenarioUpperLevel__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterAssignment_7_2()); }
	(rule__GSSScenarioUpperLevel__InputFilterAssignment_7_2)
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_7_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioUpperLevel__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_8__0__Impl
	rule__GSSScenarioUpperLevel__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_8__1__Impl
	rule__GSSScenarioUpperLevel__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_8_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_8__2__Impl
	rule__GSSScenarioUpperLevel__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2()); }
	(rule__GSSScenarioUpperLevel__Import_from_prev_LevelAssignment_8_2)
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioUpperLevel__Group_8__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_8_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioStructuredData__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__0__Impl
	rule__GSSScenarioStructuredData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getGSSScenarioStructuredDataKeyword_0()); }
	'GSSScenarioStructuredData'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getGSSScenarioStructuredDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__1__Impl
	rule__GSSScenarioStructuredData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__2__Impl
	rule__GSSScenarioStructuredData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefKeyword_2()); }
	'levelRef'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__3__Impl
	rule__GSSScenarioStructuredData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__4__Impl
	rule__GSSScenarioStructuredData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefAssignment_4()); }
	(rule__GSSScenarioStructuredData__LevelRefAssignment_4)
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__5__Impl
	rule__GSSScenarioStructuredData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__6__Impl
	rule__GSSScenarioStructuredData__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldKeyword_6()); }
	'firstField'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__7__Impl
	rule__GSSScenarioStructuredData__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__8__Impl
	rule__GSSScenarioStructuredData__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldAssignment_8()); }
	(rule__GSSScenarioStructuredData__FirstFieldAssignment_8)
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__9__Impl
	rule__GSSScenarioStructuredData__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__10__Impl
	rule__GSSScenarioStructuredData__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioStructuredData__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__0__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGSSScenarioPeriodicTCLevel2Keyword_0()); }
	'GSSScenarioPeriodicTCLevel2'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGSSScenarioPeriodicTCLevel2Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__1__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__2__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__3__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__4__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameAssignment_4()); }
	(rule__GSSScenarioPeriodicTCLevel2__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__5__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__6__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__7__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__8__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdAssignment_8()); }
	(rule__GSSScenarioPeriodicTCLevel2__IdAssignment_8)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__9__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__10__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__11__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__12__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefAssignment_12()); }
	(rule__GSSScenarioPeriodicTCLevel2__IfRefAssignment_12)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__13__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__14__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__15__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__16__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueAssignment_16()); }
	(rule__GSSScenarioPeriodicTCLevel2__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__17__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__18__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__19__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__20__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitAssignment_20()); }
	(rule__GSSScenarioPeriodicTCLevel2__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__21__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__22__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_22()); }
	(rule__GSSScenarioPeriodicTCLevel2__Group_22__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__23__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Keyword_23()); }
	'app_to_level2'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__24__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__25__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Assignment_25()); }
	(rule__GSSScenarioPeriodicTCLevel2__App_to_level2Assignment_25)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__26__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__27__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_27()); }
	(rule__GSSScenarioPeriodicTCLevel2__Group_27__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__28__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_28()); }
	(rule__GSSScenarioPeriodicTCLevel2__Group_28__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__29__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_29()); }
	(rule__GSSScenarioPeriodicTCLevel2__Group_29__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__30__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_30()); }
	(rule__GSSScenarioPeriodicTCLevel2__Group_30__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGroup_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__31__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group__32__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_32()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel2__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_22__0__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Keyword_22_0()); }
	'level2'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_22__1__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_22__2__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Assignment_22_2()); }
	(rule__GSSScenarioPeriodicTCLevel2__Level2Assignment_22_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel2__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_27__0__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Keyword_27_0()); }
	'level1'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_27__1__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_27__2__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Assignment_27_2()); }
	(rule__GSSScenarioPeriodicTCLevel2__Level1Assignment_27_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel2__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_28__0__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0()); }
	'level2_to_level1'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_28__1__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_28__2__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2()); }
	(rule__GSSScenarioPeriodicTCLevel2__Level2_to_level1Assignment_28_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel2__Group_29__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_29__0__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_29__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Keyword_29_0()); }
	'level0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Keyword_29_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_29__1__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_29__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_29__2__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_29__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Assignment_29_2()); }
	(rule__GSSScenarioPeriodicTCLevel2__Level0Assignment_29_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Assignment_29_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_29__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_29__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_29_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_29_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel2__Group_30__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_30__0__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_30__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_30__1__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_30__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_30__2__Impl
	rule__GSSScenarioPeriodicTCLevel2__Group_30__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2()); }
	(rule__GSSScenarioPeriodicTCLevel2__Level1_to_level0Assignment_30_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel2__Group_30__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Group_30__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_30_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_30_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__0__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGSSScenarioPeriodicTCLevel1Keyword_0()); }
	'GSSScenarioPeriodicTCLevel1'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGSSScenarioPeriodicTCLevel1Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__1__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__2__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__3__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__4__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameAssignment_4()); }
	(rule__GSSScenarioPeriodicTCLevel1__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__5__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__6__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__7__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__8__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdAssignment_8()); }
	(rule__GSSScenarioPeriodicTCLevel1__IdAssignment_8)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__9__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__10__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__11__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__12__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefAssignment_12()); }
	(rule__GSSScenarioPeriodicTCLevel1__IfRefAssignment_12)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__13__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__14__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__15__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__16__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueAssignment_16()); }
	(rule__GSSScenarioPeriodicTCLevel1__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__17__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__18__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__19__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__20__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitAssignment_20()); }
	(rule__GSSScenarioPeriodicTCLevel1__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__21__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__22__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_22()); }
	(rule__GSSScenarioPeriodicTCLevel1__Group_22__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__23__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Keyword_23()); }
	'app_to_level1'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__24__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__25__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Assignment_25()); }
	(rule__GSSScenarioPeriodicTCLevel1__App_to_level1Assignment_25)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__26__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__27__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_27()); }
	(rule__GSSScenarioPeriodicTCLevel1__Group_27__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__28__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_28()); }
	(rule__GSSScenarioPeriodicTCLevel1__Group_28__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__29__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel1__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_22__0__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Keyword_22_0()); }
	'level1'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_22__1__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_22__2__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Assignment_22_2()); }
	(rule__GSSScenarioPeriodicTCLevel1__Level1Assignment_22_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel1__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_27__0__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Keyword_27_0()); }
	'level0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_27__1__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_27__2__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Assignment_27_2()); }
	(rule__GSSScenarioPeriodicTCLevel1__Level0Assignment_27_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel1__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_28__0__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_28__1__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_28__2__Impl
	rule__GSSScenarioPeriodicTCLevel1__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2()); }
	(rule__GSSScenarioPeriodicTCLevel1__Level1_to_level0Assignment_28_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel1__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__0__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGSSScenarioPeriodicTCLevel0Keyword_0()); }
	'GSSScenarioPeriodicTCLevel0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGSSScenarioPeriodicTCLevel0Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__1__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__2__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__3__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__4__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameAssignment_4()); }
	(rule__GSSScenarioPeriodicTCLevel0__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__5__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__6__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__7__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__8__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdAssignment_8()); }
	(rule__GSSScenarioPeriodicTCLevel0__IdAssignment_8)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__9__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__10__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__11__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__12__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefAssignment_12()); }
	(rule__GSSScenarioPeriodicTCLevel0__IfRefAssignment_12)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__13__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__14__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__15__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__16__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueAssignment_16()); }
	(rule__GSSScenarioPeriodicTCLevel0__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__17__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__18__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__19__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__20__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitAssignment_20()); }
	(rule__GSSScenarioPeriodicTCLevel0__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__21__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__22__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGroup_22()); }
	(rule__GSSScenarioPeriodicTCLevel0__Group_22__0)?
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__23__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Keyword_23()); }
	'app_to_level0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__24__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__25__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Assignment_25()); }
	(rule__GSSScenarioPeriodicTCLevel0__App_to_level0Assignment_25)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__26__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__27__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group__28__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_28()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPeriodicTCLevel0__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group_22__0__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Keyword_22_0()); }
	'level0'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group_22__1__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group_22__2__Impl
	rule__GSSScenarioPeriodicTCLevel0__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Assignment_22_2()); }
	(rule__GSSScenarioPeriodicTCLevel0__Level0Assignment_22_2)
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPeriodicTCLevel0__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGlobalVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__0__Impl
	rule__GSSScenarioGlobalVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getGSSScenarioGlobalVarKeyword_0()); }
	'GSSScenarioGlobalVar'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getGSSScenarioGlobalVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__1__Impl
	rule__GSSScenarioGlobalVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__2__Impl
	rule__GSSScenarioGlobalVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__3__Impl
	rule__GSSScenarioGlobalVar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__4__Impl
	rule__GSSScenarioGlobalVar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getNameAssignment_4()); }
	(rule__GSSScenarioGlobalVar__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__5__Impl
	rule__GSSScenarioGlobalVar__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__6__Impl
	rule__GSSScenarioGlobalVar__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__7__Impl
	rule__GSSScenarioGlobalVar__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__8__Impl
	rule__GSSScenarioGlobalVar__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getIdAssignment_8()); }
	(rule__GSSScenarioGlobalVar__IdAssignment_8)
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__9__Impl
	rule__GSSScenarioGlobalVar__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__10__Impl
	rule__GSSScenarioGlobalVar__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeKeyword_10()); }
	'type'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__11__Impl
	rule__GSSScenarioGlobalVar__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__12__Impl
	rule__GSSScenarioGlobalVar__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeAssignment_12()); }
	(rule__GSSScenarioGlobalVar__TypeAssignment_12)
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__13__Impl
	rule__GSSScenarioGlobalVar__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__14__Impl
	rule__GSSScenarioGlobalVar__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueKeyword_14()); }
	'initial_value'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__15__Impl
	rule__GSSScenarioGlobalVar__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__16__Impl
	rule__GSSScenarioGlobalVar__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueAssignment_16()); }
	(rule__GSSScenarioGlobalVar__Initial_valueAssignment_16)
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__17__Impl
	rule__GSSScenarioGlobalVar__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__18__Impl
	rule__GSSScenarioGlobalVar__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceAssignment_18()); }
	(rule__GSSScenarioGlobalVar__ReferenceAssignment_18)
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__19__Impl
	rule__GSSScenarioGlobalVar__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGlobalVar__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioReferenceField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__0__Impl
	rule__GSSScenarioReferenceField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getGSSScenarioReferenceFieldKeyword_0()); }
	'GSSScenarioReferenceField'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getGSSScenarioReferenceFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__1__Impl
	rule__GSSScenarioReferenceField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__2__Impl
	rule__GSSScenarioReferenceField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__3__Impl
	rule__GSSScenarioReferenceField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__4__Impl
	rule__GSSScenarioReferenceField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeAssignment_4()); }
	(rule__GSSScenarioReferenceField__TypeAssignment_4)
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__5__Impl
	rule__GSSScenarioReferenceField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__6__Impl
	rule__GSSScenarioReferenceField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__7__Impl
	rule__GSSScenarioReferenceField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__8__Impl
	rule__GSSScenarioReferenceField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefAssignment_8()); }
	(rule__GSSScenarioReferenceField__IfRefAssignment_8)
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__9__Impl
	rule__GSSScenarioReferenceField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__10__Impl
	rule__GSSScenarioReferenceField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelKeyword_10()); }
	'level'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__11__Impl
	rule__GSSScenarioReferenceField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__12__Impl
	rule__GSSScenarioReferenceField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelAssignment_12()); }
	(rule__GSSScenarioReferenceField__LevelAssignment_12)
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__13__Impl
	rule__GSSScenarioReferenceField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__14__Impl
	rule__GSSScenarioReferenceField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefKeyword_14()); }
	'fieldRef'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__15__Impl
	rule__GSSScenarioReferenceField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__16__Impl
	rule__GSSScenarioReferenceField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefAssignment_16()); }
	(rule__GSSScenarioReferenceField__FieldRefAssignment_16)
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__17__Impl
	rule__GSSScenarioReferenceField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__18__Impl
	rule__GSSScenarioReferenceField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetKeyword_18()); }
	'offset'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__19__Impl
	rule__GSSScenarioReferenceField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__20__Impl
	rule__GSSScenarioReferenceField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetAssignment_20()); }
	(rule__GSSScenarioReferenceField__OffsetAssignment_20)
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__21__Impl
	rule__GSSScenarioReferenceField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__22__Impl
	rule__GSSScenarioReferenceField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeKeyword_22()); }
	'size'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__23__Impl
	rule__GSSScenarioReferenceField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__24__Impl
	rule__GSSScenarioReferenceField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeAssignment_24()); }
	(rule__GSSScenarioReferenceField__SizeAssignment_24)
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__25__Impl
	rule__GSSScenarioReferenceField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__26__Impl
	rule__GSSScenarioReferenceField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getRightCurlyBracketKeyword_26()); }
	'}'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getRightCurlyBracketKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceField__Group__27__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_27()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioReferencePeriodicTC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__0__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGSSScenarioReferencePeriodicTCKeyword_0()); }
	'GSSScenarioReferencePeriodicTC'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGSSScenarioReferencePeriodicTCKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__1__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__2__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__3__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__4__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefAssignment_4()); }
	(rule__GSSScenarioReferencePeriodicTC__IdRefAssignment_4)
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__5__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__6__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelKeyword_6()); }
	'level'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__7__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__8__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelAssignment_8()); }
	(rule__GSSScenarioReferencePeriodicTC__LevelAssignment_8)
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__9__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__10__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefKeyword_10()); }
	'fieldRef'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__11__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__12__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefAssignment_12()); }
	(rule__GSSScenarioReferencePeriodicTC__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__13__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__14__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetKeyword_14()); }
	'offset'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__15__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__16__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetAssignment_16()); }
	(rule__GSSScenarioReferencePeriodicTC__OffsetAssignment_16)
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__17__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__18__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeKeyword_18()); }
	'size'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__19__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__20__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeAssignment_20()); }
	(rule__GSSScenarioReferencePeriodicTC__SizeAssignment_20)
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__21__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__22__Impl
	rule__GSSScenarioReferencePeriodicTC__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferencePeriodicTC__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_23()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioReferenceSpecialPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__0__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGSSScenarioReferenceSpecialPacketKeyword_0()); }
	'GSSScenarioReferenceSpecialPacket'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGSSScenarioReferenceSpecialPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__1__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__2__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__3__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__4__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefAssignment_4()); }
	(rule__GSSScenarioReferenceSpecialPacket__IdRefAssignment_4)
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__5__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__6__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelKeyword_6()); }
	'level'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__7__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__8__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelAssignment_8()); }
	(rule__GSSScenarioReferenceSpecialPacket__LevelAssignment_8)
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__9__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__10__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefKeyword_10()); }
	'fieldRef'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__11__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__12__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefAssignment_12()); }
	(rule__GSSScenarioReferenceSpecialPacket__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__13__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__14__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetKeyword_14()); }
	'offset'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__15__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__16__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetAssignment_16()); }
	(rule__GSSScenarioReferenceSpecialPacket__OffsetAssignment_16)
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__17__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__18__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeKeyword_18()); }
	'size'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__19__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__20__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeAssignment_20()); }
	(rule__GSSScenarioReferenceSpecialPacket__SizeAssignment_20)
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__21__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__22__Impl
	rule__GSSScenarioReferenceSpecialPacket__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioReferenceSpecialPacket__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_23()); }
	';'
	{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioPlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__0__Impl
	rule__GSSScenarioPlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getGSSScenarioPlotKeyword_0()); }
	'GSSScenarioPlot'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getGSSScenarioPlotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__1__Impl
	rule__GSSScenarioPlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__2__Impl
	rule__GSSScenarioPlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__3__Impl
	rule__GSSScenarioPlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__4__Impl
	rule__GSSScenarioPlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getNameAssignment_4()); }
	(rule__GSSScenarioPlot__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioPlotAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__5__Impl
	rule__GSSScenarioPlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__6__Impl
	rule__GSSScenarioPlot__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getChartRefKeyword_6()); }
	'chartRef'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getChartRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__7__Impl
	rule__GSSScenarioPlot__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__8__Impl
	rule__GSSScenarioPlot__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getChartRefAssignment_8()); }
	(rule__GSSScenarioPlot__ChartRefAssignment_8)
	{ after(grammarAccess.getGSSScenarioPlotAccess().getChartRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__9__Impl
	rule__GSSScenarioPlot__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__10__Impl
	rule__GSSScenarioPlot__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getGVAssignment_10()); }
	(rule__GSSScenarioPlot__GVAssignment_10)
	{ after(grammarAccess.getGSSScenarioPlotAccess().getGVAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__11__Impl
	rule__GSSScenarioPlot__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioPlot__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioAlarmMsg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__0__Impl
	rule__GSSScenarioAlarmMsg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getGSSScenarioAlarmMsgKeyword_0()); }
	'GSSScenarioAlarmMsg'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getGSSScenarioAlarmMsgKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__1__Impl
	rule__GSSScenarioAlarmMsg__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__2__Impl
	rule__GSSScenarioAlarmMsg__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__3__Impl
	rule__GSSScenarioAlarmMsg__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__4__Impl
	rule__GSSScenarioAlarmMsg__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameAssignment_4()); }
	(rule__GSSScenarioAlarmMsg__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__5__Impl
	rule__GSSScenarioAlarmMsg__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__6__Impl
	rule__GSSScenarioAlarmMsg__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__7__Impl
	rule__GSSScenarioAlarmMsg__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__8__Impl
	rule__GSSScenarioAlarmMsg__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeAssignment_8()); }
	(rule__GSSScenarioAlarmMsg__TypeAssignment_8)
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__9__Impl
	rule__GSSScenarioAlarmMsg__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__10__Impl
	rule__GSSScenarioAlarmMsg__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextKeyword_10()); }
	'text'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__11__Impl
	rule__GSSScenarioAlarmMsg__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__12__Impl
	rule__GSSScenarioAlarmMsg__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextAssignment_12()); }
	(rule__GSSScenarioAlarmMsg__TextAssignment_12)
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__13__Impl
	rule__GSSScenarioAlarmMsg__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__14__Impl
	rule__GSSScenarioAlarmMsg__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVAssignment_14()); }
	(rule__GSSScenarioAlarmMsg__GVAssignment_14)
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__15__Impl
	rule__GSSScenarioAlarmMsg__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmMsg__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioModify__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__0__Impl
	rule__GSSScenarioModify__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getGSSScenarioModifyKeyword_0()); }
	'GSSScenarioModify'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getGSSScenarioModifyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__1__Impl
	rule__GSSScenarioModify__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__2__Impl
	rule__GSSScenarioModify__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__3__Impl
	rule__GSSScenarioModify__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__4__Impl
	rule__GSSScenarioModify__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getNameAssignment_4()); }
	(rule__GSSScenarioModify__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioModifyAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__5__Impl
	rule__GSSScenarioModify__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__6__Impl
	rule__GSSScenarioModify__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__7__Impl
	rule__GSSScenarioModify__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__8__Impl
	rule__GSSScenarioModify__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getTypeAssignment_8()); }
	(rule__GSSScenarioModify__TypeAssignment_8)
	{ after(grammarAccess.getGSSScenarioModifyAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__9__Impl
	rule__GSSScenarioModify__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__10__Impl
	rule__GSSScenarioModify__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getValueKeyword_10()); }
	'value'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getValueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__11__Impl
	rule__GSSScenarioModify__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__12__Impl
	rule__GSSScenarioModify__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getValueAssignment_12()); }
	(rule__GSSScenarioModify__ValueAssignment_12)
	{ after(grammarAccess.getGSSScenarioModifyAccess().getValueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__13__Impl
	rule__GSSScenarioModify__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__14__Impl
	rule__GSSScenarioModify__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getGVAssignment_14()); }
	(rule__GSSScenarioModify__GVAssignment_14)
	{ after(grammarAccess.getGSSScenarioModifyAccess().getGVAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__15__Impl
	rule__GSSScenarioModify__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioModify__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioAlarmVal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__0__Impl
	rule__GSSScenarioAlarmVal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getGSSScenarioAlarmValKeyword_0()); }
	'GSSScenarioAlarmVal'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getGSSScenarioAlarmValKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__1__Impl
	rule__GSSScenarioAlarmVal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__2__Impl
	rule__GSSScenarioAlarmVal__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__3__Impl
	rule__GSSScenarioAlarmVal__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__4__Impl
	rule__GSSScenarioAlarmVal__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getNameAssignment_4()); }
	(rule__GSSScenarioAlarmVal__NameAssignment_4)
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__5__Impl
	rule__GSSScenarioAlarmVal__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__6__Impl
	rule__GSSScenarioAlarmVal__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__7__Impl
	rule__GSSScenarioAlarmVal__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__8__Impl
	rule__GSSScenarioAlarmVal__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getTypeAssignment_8()); }
	(rule__GSSScenarioAlarmVal__TypeAssignment_8)
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__9__Impl
	rule__GSSScenarioAlarmVal__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__10__Impl
	rule__GSSScenarioAlarmVal__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getGVAssignment_10()); }
	(rule__GSSScenarioAlarmVal__GVAssignment_10)
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getGVAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__11__Impl
	rule__GSSScenarioAlarmVal__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioAlarmVal__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGVFiltered__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__0__Impl
	rule__GSSScenarioGVFiltered__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGSSScenarioGVFilteredKeyword_0()); }
	'GSSScenarioGVFiltered'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGSSScenarioGVFilteredKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__1__Impl
	rule__GSSScenarioGVFiltered__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__2__Impl
	rule__GSSScenarioGVFiltered__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefKeyword_2()); }
	'GlobalVarRef'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__3__Impl
	rule__GSSScenarioGVFiltered__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__4__Impl
	rule__GSSScenarioGVFiltered__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefAssignment_4()); }
	(rule__GSSScenarioGVFiltered__GlobalVarRefAssignment_4)
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__5__Impl
	rule__GSSScenarioGVFiltered__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__6__Impl
	rule__GSSScenarioGVFiltered__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGroup_6()); }
	(rule__GSSScenarioGVFiltered__Group_6__0)?
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__7__Impl
	rule__GSSScenarioGVFiltered__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGVFiltered__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group_6__0__Impl
	rule__GSSScenarioGVFiltered__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterKeyword_6_0()); }
	'filter'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group_6__1__Impl
	rule__GSSScenarioGVFiltered__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group_6__2__Impl
	rule__GSSScenarioGVFiltered__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterAssignment_6_2()); }
	(rule__GSSScenarioGVFiltered__FilterAssignment_6_2)
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVFiltered__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSScenarioGVPeriodic__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__0__Impl
	rule__GSSScenarioGVPeriodic__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getGSSScenarioGVPeriodicKeyword_0()); }
	'GSSScenarioGVPeriodic'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getGSSScenarioGVPeriodicKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__1__Impl
	rule__GSSScenarioGVPeriodic__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__2__Impl
	rule__GSSScenarioGVPeriodic__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefKeyword_2()); }
	'GlobalVarRef'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__3__Impl
	rule__GSSScenarioGVPeriodic__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__4__Impl
	rule__GSSScenarioGVPeriodic__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefAssignment_4()); }
	(rule__GSSScenarioGVPeriodic__GlobalVarRefAssignment_4)
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__5__Impl
	rule__GSSScenarioGVPeriodic__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__6__Impl
	rule__GSSScenarioGVPeriodic__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueKeyword_6()); }
	'period_value'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__7__Impl
	rule__GSSScenarioGVPeriodic__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__8__Impl
	rule__GSSScenarioGVPeriodic__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueAssignment_8()); }
	(rule__GSSScenarioGVPeriodic__Period_valueAssignment_8)
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__9__Impl
	rule__GSSScenarioGVPeriodic__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__10__Impl
	rule__GSSScenarioGVPeriodic__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitKeyword_10()); }
	'period_unit'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__11__Impl
	rule__GSSScenarioGVPeriodic__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__12__Impl
	rule__GSSScenarioGVPeriodic__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitAssignment_12()); }
	(rule__GSSScenarioGVPeriodic__Period_unitAssignment_12)
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__13__Impl
	rule__GSSScenarioGVPeriodic__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__14__Impl
	rule__GSSScenarioGVPeriodic__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioGVPeriodic__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_15()); }
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


rule__GSSScenarioScenario__UnorderedGroup_8
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
	}
:
	rule__GSSScenarioScenario__UnorderedGroup_8__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__UnorderedGroup_8__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsAssignment_8_0()); }
					(rule__GSSScenarioScenario__GlobalVarsAssignment_8_0)
					{ after(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsAssignment_8_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsAssignment_8_1()); }
					(rule__GSSScenarioScenario__MonitorsAssignment_8_1)
					{ after(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsAssignment_8_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__UnorderedGroup_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__UnorderedGroup_8__Impl
	rule__GSSScenarioScenario__UnorderedGroup_8__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__UnorderedGroup_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSScenarioScenario__UnorderedGroup_8__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentEnvironmentParserRuleCall_1_0()); }
		ruleGSSEnvironmentEnvironment
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentEnvironmentParserRuleCall_1_0()); }
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

rule__GSSEnvironmentEnvironment__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__UriAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__VersionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionVersionParserRuleCall_6_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionVersionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSEnvironmentEnvironment__ScenarioAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioGSSScenarioScenarioParserRuleCall_8_0()); }
		ruleGSSScenarioScenario
		{ after(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioGSSScenarioScenarioParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__Gss_optionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsGSSScenarioOptionsParserRuleCall_3_0()); }
		ruleGSSScenarioOptions
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsGSSScenarioOptionsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__ProtocolsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsGSSScenarioProtocolsParserRuleCall_4_0()); }
		ruleGSSScenarioProtocols
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsGSSScenarioProtocolsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__InterfacesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesGSSScenarioInterfacesParserRuleCall_5_0()); }
		ruleGSSScenarioInterfaces
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesGSSScenarioInterfacesParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__SpecialPacketsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0()); }
		ruleGSSScenarioSpecialPackets
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__PeriodicTCsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0()); }
		ruleGSSScenarioPeriodicTCs
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__GlobalVarsAssignment_8_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0()); }
		ruleGSSScenarioGlobalVars
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioScenario__MonitorsAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0()); }
		ruleGSSScenarioMonitors
		{ after(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Gss_infoAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoGSSScenarioGSSInfoParserRuleCall_2_0()); }
		ruleGSSScenarioGSSInfo
		{ after(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoGSSScenarioGSSInfoParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Gss_info_printAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0()); }
		ruleGSSScenarioGSSInfoPrint
		{ after(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__Phy_header_printAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0()); }
		ruleGSSScenarioPhyHeaderPrint
		{ after(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioOptions__DiscardErrorFlagsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0()); }
		ruleGSSScenarioGSSDiscardErrorFlags
		{ after(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocols__ProtocolAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolGSSScenarioProtocolParserRuleCall_3_0()); }
		ruleGSSScenarioProtocol
		{ after(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolGSSScenarioProtocolParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__ProtocolPacketsFileAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__MainInterfaceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0()); }
		ruleGSSScenarioMainInterface
		{ after(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterfaces__InterfaceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceGSSScenarioInterfaceParserRuleCall_4_0()); }
		ruleGSSScenarioInterface
		{ after(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceGSSScenarioInterfaceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPackets__SpecialPacketAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0()); }
		ruleGSSScenarioSpecialPacket
		{ after(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCs__PeriodicTCAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0()); }
		ruleGSSScenarioPeriodicTC
		{ after(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVars__GlobalVarAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0()); }
		ruleGSSScenarioGlobalVar
		{ after(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__ChartsFileAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMonitors__MonitorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorGSSScenarioMonitorParserRuleCall_3_0()); }
		ruleGSSScenarioMonitor
		{ after(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorGSSScenarioMonitorParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Test_campaignAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__VersionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionVersionParserRuleCall_8_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionVersionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__DateAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getDateDATEParserRuleCall_12_0()); }
		ruleDATE
		{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getDateDATEParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfo__Version_control_urlAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0()); }
		ruleURL
		{ after(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__MainLogAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__PortLogsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSInfoPrint__RawLogAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__MainLogAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__PortLogsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__RawLogAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPhyHeaderPrint__GssTabsAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__TxErrorsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__FiltersKoAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGSSDiscardErrorFlags__ValidTimesKoAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioProtocolAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSScenarioProtocolAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__TypeLevelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__TypeAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolAccess().getTypeGSSScenarioProtocolTypeParserRuleCall_14_0()); }
		ruleGSSScenarioProtocolType
		{ after(grammarAccess.getGSSScenarioProtocolAccess().getTypeGSSScenarioProtocolTypeParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocol__SubtypeAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0()); }
		ruleGSSScenarioProtocolSubtype
		{ after(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolType__OffsetAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioProtocolSubtype__OffsetAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__IfTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0()); }
		ruleGSSScenarioInterfaceType
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__IfConfigAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__IoTypeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0()); }
		ruleGSSScenarioInterfaceIOType
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__ProtocolIDAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioMainInterface__LevelInOutAssignment_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0()); }
		ruleGSSScenarioLevelInOut
		{ after(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__IfTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0()); }
		ruleGSSScenarioInterfaceType
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__IfConfigAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__IoTypeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0()); }
		ruleGSSScenarioInterfaceIOType
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__ProtocolIDAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDGSSScenarioProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__LevelInOutAssignment_23_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0()); }
		ruleGSSScenarioLevelInOut
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__LevelInAssignment_23_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInGSSScenarioLevelInParserRuleCall_23_1_0()); }
		ruleGSSScenarioLevelIn
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInGSSScenarioLevelInParserRuleCall_23_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioInterface__LevelOutAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0()); }
		ruleGSSScenarioLevelOut
		{ after(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__TMformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatGSSFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatGSSFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__TCformatAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatGSSFormatFormatCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatGSSFormatFormatCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__InputFilterAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterGSSFilterFilterCrossReference_20_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterGSSFilterFilterCrossReference_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Export_to_prev_LevelAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelInOut__Import_from_prev_LevelAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioLevelInAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioLevelInAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__TCformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInAccess().getTCformatGSSFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInAccess().getTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInAccess().getTCformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInAccess().getTCformatGSSFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelIn__Export_to_prev_LevelAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelGSSExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelOutAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioLevelOutAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__TMformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatGSSFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatGSSFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__InputFilterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterGSSFilterFilterCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterGSSFilterFilterCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioLevelOut__Import_from_prev_LevelAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__StatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusGSSScenarioEnableDisableEnumRuleCall_4_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusGSSScenarioEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__IdAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__IfRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__LevelsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__LevelRefAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__InputFilterAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterGSSFilterFilterCrossReference_28_0()); }
		(
			{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterGSSFilterFilterCrossReference_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__UpperLevelsAssignment_30
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0()); }
		ruleGSSScenarioUpperLevels
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__PrintingDataAssignment_31
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0()); }
		ruleGSSScenarioPrintingData
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__PeriodAssignment_32_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodGSSScenarioPeriodParserRuleCall_32_0_0()); }
		ruleGSSScenarioPeriod
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodGSSScenarioPeriodParserRuleCall_32_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioSpecialPacket__IntervalRangeAssignment_32_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0()); }
		ruleGSSScenarioIntervalRange
		{ after(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevels__UpperLevelAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0()); }
		ruleGSSScenarioUpperLevel
		{ after(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__PrintStatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0()); }
		ruleGSSScenarioEnableDisable
		{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPrintingData__StructuredDataAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0()); }
		ruleGSSScenarioStructuredData
		{ after(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Min_valueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Min_unitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitGSSScenarioUnitEnumRuleCall_8_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitGSSScenarioUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Max_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriod__Max_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitGSSScenarioUnitEnumRuleCall_16_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitGSSScenarioUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__MinAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__MaxAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Interval_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioIntervalRange__Interval_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitGSSScenarioUnitEnumRuleCall_16_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitGSSScenarioUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__LevelAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0()); }
		ruleGSSScenarioUpperLevelLevel
		{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__TMformatAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatGSSFormatFormatCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatGSSFormatFormatCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__InputFilterAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterGSSFilterFilterCrossReference_7_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterGSSFilterFilterCrossReference_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioUpperLevel__Import_from_prev_LevelAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelGSSImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__LevelRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioStructuredData__FirstFieldAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Level2Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2GSSFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2GSSFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__App_to_level2Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2GSSExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2GSSExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Level1Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1GSSFormatFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1GSSFormatFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Level2_to_level1Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Level0Assignment_29_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0GSSFormatFormatCrossReference_29_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0GSSFormatFormatCrossReference_29_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel2__Level1_to_level0Assignment_30_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_30_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_30_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Level1Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1GSSFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1GSSFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__App_to_level1Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1GSSExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1GSSExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Level0Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0GSSFormatFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0GSSFormatFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel1__Level1_to_level0Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__Level0Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0GSSFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0GSSFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0GSSFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPeriodicTCLevel0__App_to_level0Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0GSSExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0GSSExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0GSSExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__TypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0()); }
		ruleGSSScenarioGlobalVarType
		{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__Initial_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGlobalVar__ReferenceAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceGSSScenarioReferenceParserRuleCall_18_0()); }
		ruleGSSScenarioReference
		{ after(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceGSSScenarioReferenceParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0()); }
		ruleGSSScenarioReferenceFieldType
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__LevelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__FieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__OffsetAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceField__SizeAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__LevelAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__OffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferencePeriodicTC__SizeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__LevelAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__OffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioReferenceSpecialPacket__SizeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPlotAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioPlotAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__ChartRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioPlot__GVAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioPlotAccess().getGVGSSScenarioGVParserRuleCall_10_0()); }
		ruleGSSScenarioGV
		{ after(grammarAccess.getGSSScenarioPlotAccess().getGVGSSScenarioGVParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0()); }
		ruleGSSScenarioAlarmMsgType
		{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__TextAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmMsg__GVAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVGSSScenarioGVParserRuleCall_14_0()); }
		ruleGSSScenarioGV
		{ after(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVGSSScenarioGVParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioModifyAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioModifyAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioModifyAccess().getTypeGSSScenarioModifyTypeEnumRuleCall_8_0()); }
		ruleGSSScenarioModifyType
		{ after(grammarAccess.getGSSScenarioModifyAccess().getTypeGSSScenarioModifyTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__ValueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioModifyAccess().getValueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioModifyAccess().getValueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioModify__GVAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioModifyAccess().getGVGSSScenarioGVParserRuleCall_14_0()); }
		ruleGSSScenarioGV
		{ after(grammarAccess.getGSSScenarioModifyAccess().getGVGSSScenarioGVParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSScenarioAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmValAccess().getTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0()); }
		ruleGSSScenarioAlarmValType
		{ after(grammarAccess.getGSSScenarioAlarmValAccess().getTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioAlarmVal__GVAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioAlarmValAccess().getGVGSSScenarioGVParserRuleCall_10_0()); }
		ruleGSSScenarioGV
		{ after(grammarAccess.getGSSScenarioAlarmValAccess().getGVGSSScenarioGVParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__GlobalVarRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVFiltered__FilterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterGSSFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterGSSFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterGSSFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__GlobalVarRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Period_valueAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSScenarioGVPeriodic__Period_unitAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitGSSScenarioUnitEnumRuleCall_12_0()); }
		ruleGSSScenarioUnit
		{ after(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitGSSScenarioUnitEnumRuleCall_12_0()); }
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
