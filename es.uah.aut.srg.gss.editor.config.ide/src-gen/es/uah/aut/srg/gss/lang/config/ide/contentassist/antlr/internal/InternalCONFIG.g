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
grammar InternalCONFIG;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.config.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.config.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;

}
@parser::members {
	private CONFIGGrammarAccess grammarAccess;

	public void setGrammarAccess(CONFIGGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSConfigGSSConfig
entryRuleGSSConfigGSSConfig
:
{ before(grammarAccess.getGSSConfigGSSConfigRule()); }
	 ruleGSSConfigGSSConfig
{ after(grammarAccess.getGSSConfigGSSConfigRule()); } 
	 EOF 
;

// Rule GSSConfigGSSConfig
ruleGSSConfigGSSConfig 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGroup()); }
		(rule__GSSConfigGSSConfig__Group__0)
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGSSOptions
entryRuleGSSConfigGSSOptions
:
{ before(grammarAccess.getGSSConfigGSSOptionsRule()); }
	 ruleGSSConfigGSSOptions
{ after(grammarAccess.getGSSConfigGSSOptionsRule()); } 
	 EOF 
;

// Rule GSSConfigGSSOptions
ruleGSSConfigGSSOptions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getGroup()); }
		(rule__GSSConfigGSSOptions__Group__0)
		{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigProtocols
entryRuleGSSConfigProtocols
:
{ before(grammarAccess.getGSSConfigProtocolsRule()); }
	 ruleGSSConfigProtocols
{ after(grammarAccess.getGSSConfigProtocolsRule()); } 
	 EOF 
;

// Rule GSSConfigProtocols
ruleGSSConfigProtocols 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigProtocolsAccess().getGroup()); }
		(rule__GSSConfigProtocols__Group__0)
		{ after(grammarAccess.getGSSConfigProtocolsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigInterfaces
entryRuleGSSConfigInterfaces
:
{ before(grammarAccess.getGSSConfigInterfacesRule()); }
	 ruleGSSConfigInterfaces
{ after(grammarAccess.getGSSConfigInterfacesRule()); } 
	 EOF 
;

// Rule GSSConfigInterfaces
ruleGSSConfigInterfaces 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigInterfacesAccess().getGroup()); }
		(rule__GSSConfigInterfaces__Group__0)
		{ after(grammarAccess.getGSSConfigInterfacesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigSpecialPackets
entryRuleGSSConfigSpecialPackets
:
{ before(grammarAccess.getGSSConfigSpecialPacketsRule()); }
	 ruleGSSConfigSpecialPackets
{ after(grammarAccess.getGSSConfigSpecialPacketsRule()); } 
	 EOF 
;

// Rule GSSConfigSpecialPackets
ruleGSSConfigSpecialPackets 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getGroup()); }
		(rule__GSSConfigSpecialPackets__Group__0)
		{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPeriodicTCs
entryRuleGSSConfigPeriodicTCs
:
{ before(grammarAccess.getGSSConfigPeriodicTCsRule()); }
	 ruleGSSConfigPeriodicTCs
{ after(grammarAccess.getGSSConfigPeriodicTCsRule()); } 
	 EOF 
;

// Rule GSSConfigPeriodicTCs
ruleGSSConfigPeriodicTCs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getGroup()); }
		(rule__GSSConfigPeriodicTCs__Group__0)
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGlobalVars
entryRuleGSSConfigGlobalVars
:
{ before(grammarAccess.getGSSConfigGlobalVarsRule()); }
	 ruleGSSConfigGlobalVars
{ after(grammarAccess.getGSSConfigGlobalVarsRule()); } 
	 EOF 
;

// Rule GSSConfigGlobalVars
ruleGSSConfigGlobalVars 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getGroup()); }
		(rule__GSSConfigGlobalVars__Group__0)
		{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigMonitors
entryRuleGSSConfigMonitors
:
{ before(grammarAccess.getGSSConfigMonitorsRule()); }
	 ruleGSSConfigMonitors
{ after(grammarAccess.getGSSConfigMonitorsRule()); } 
	 EOF 
;

// Rule GSSConfigMonitors
ruleGSSConfigMonitors 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getGroup()); }
		(rule__GSSConfigMonitors__Group__0)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigTests
entryRuleGSSConfigTests
:
{ before(grammarAccess.getGSSConfigTestsRule()); }
	 ruleGSSConfigTests
{ after(grammarAccess.getGSSConfigTestsRule()); } 
	 EOF 
;

// Rule GSSConfigTests
ruleGSSConfigTests 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getGroup()); }
		(rule__GSSConfigTests__Group__0)
		{ after(grammarAccess.getGSSConfigTestsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGSSInfo
entryRuleGSSConfigGSSInfo
:
{ before(grammarAccess.getGSSConfigGSSInfoRule()); }
	 ruleGSSConfigGSSInfo
{ after(grammarAccess.getGSSConfigGSSInfoRule()); } 
	 EOF 
;

// Rule GSSConfigGSSInfo
ruleGSSConfigGSSInfo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoAccess().getGroup()); }
		(rule__GSSConfigGSSInfo__Group__0)
		{ after(grammarAccess.getGSSConfigGSSInfoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGSSInfoPrint
entryRuleGSSConfigGSSInfoPrint
:
{ before(grammarAccess.getGSSConfigGSSInfoPrintRule()); }
	 ruleGSSConfigGSSInfoPrint
{ after(grammarAccess.getGSSConfigGSSInfoPrintRule()); } 
	 EOF 
;

// Rule GSSConfigGSSInfoPrint
ruleGSSConfigGSSInfoPrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getGroup()); }
		(rule__GSSConfigGSSInfoPrint__Group__0)
		{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPhyHeaderPrint
entryRuleGSSConfigPhyHeaderPrint
:
{ before(grammarAccess.getGSSConfigPhyHeaderPrintRule()); }
	 ruleGSSConfigPhyHeaderPrint
{ after(grammarAccess.getGSSConfigPhyHeaderPrintRule()); } 
	 EOF 
;

// Rule GSSConfigPhyHeaderPrint
ruleGSSConfigPhyHeaderPrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGroup()); }
		(rule__GSSConfigPhyHeaderPrint__Group__0)
		{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGSSDiscardErrorFlags
entryRuleGSSConfigGSSDiscardErrorFlags
:
{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule()); }
	 ruleGSSConfigGSSDiscardErrorFlags
{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule()); } 
	 EOF 
;

// Rule GSSConfigGSSDiscardErrorFlags
ruleGSSConfigGSSDiscardErrorFlags 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGroup()); }
		(rule__GSSConfigGSSDiscardErrorFlags__Group__0)
		{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigProtocol
entryRuleGSSConfigProtocol
:
{ before(grammarAccess.getGSSConfigProtocolRule()); }
	 ruleGSSConfigProtocol
{ after(grammarAccess.getGSSConfigProtocolRule()); } 
	 EOF 
;

// Rule GSSConfigProtocol
ruleGSSConfigProtocol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigProtocolAccess().getGroup()); }
		(rule__GSSConfigProtocol__Group__0)
		{ after(grammarAccess.getGSSConfigProtocolAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigMainInterface
entryRuleGSSConfigMainInterface
:
{ before(grammarAccess.getGSSConfigMainInterfaceRule()); }
	 ruleGSSConfigMainInterface
{ after(grammarAccess.getGSSConfigMainInterfaceRule()); } 
	 EOF 
;

// Rule GSSConfigMainInterface
ruleGSSConfigMainInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getGroup()); }
		(rule__GSSConfigMainInterface__Group__0)
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigInterface
entryRuleGSSConfigInterface
:
{ before(grammarAccess.getGSSConfigInterfaceRule()); }
	 ruleGSSConfigInterface
{ after(grammarAccess.getGSSConfigInterfaceRule()); } 
	 EOF 
;

// Rule GSSConfigInterface
ruleGSSConfigInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getGroup()); }
		(rule__GSSConfigInterface__Group__0)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigLevelInOut
entryRuleGSSConfigLevelInOut
:
{ before(grammarAccess.getGSSConfigLevelInOutRule()); }
	 ruleGSSConfigLevelInOut
{ after(grammarAccess.getGSSConfigLevelInOutRule()); } 
	 EOF 
;

// Rule GSSConfigLevelInOut
ruleGSSConfigLevelInOut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getGroup()); }
		(rule__GSSConfigLevelInOut__Group__0)
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigLevelIn
entryRuleGSSConfigLevelIn
:
{ before(grammarAccess.getGSSConfigLevelInRule()); }
	 ruleGSSConfigLevelIn
{ after(grammarAccess.getGSSConfigLevelInRule()); } 
	 EOF 
;

// Rule GSSConfigLevelIn
ruleGSSConfigLevelIn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigLevelInAccess().getGroup()); }
		(rule__GSSConfigLevelIn__Group__0)
		{ after(grammarAccess.getGSSConfigLevelInAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigLevelOut
entryRuleGSSConfigLevelOut
:
{ before(grammarAccess.getGSSConfigLevelOutRule()); }
	 ruleGSSConfigLevelOut
{ after(grammarAccess.getGSSConfigLevelOutRule()); } 
	 EOF 
;

// Rule GSSConfigLevelOut
ruleGSSConfigLevelOut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigLevelOutAccess().getGroup()); }
		(rule__GSSConfigLevelOut__Group__0)
		{ after(grammarAccess.getGSSConfigLevelOutAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigSpecialPacket
entryRuleGSSConfigSpecialPacket
:
{ before(grammarAccess.getGSSConfigSpecialPacketRule()); }
	 ruleGSSConfigSpecialPacket
{ after(grammarAccess.getGSSConfigSpecialPacketRule()); } 
	 EOF 
;

// Rule GSSConfigSpecialPacket
ruleGSSConfigSpecialPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getGroup()); }
		(rule__GSSConfigSpecialPacket__Group__0)
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigUpperLevels
entryRuleGSSConfigUpperLevels
:
{ before(grammarAccess.getGSSConfigUpperLevelsRule()); }
	 ruleGSSConfigUpperLevels
{ after(grammarAccess.getGSSConfigUpperLevelsRule()); } 
	 EOF 
;

// Rule GSSConfigUpperLevels
ruleGSSConfigUpperLevels 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getGroup()); }
		(rule__GSSConfigUpperLevels__Group__0)
		{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPrintingData
entryRuleGSSConfigPrintingData
:
{ before(grammarAccess.getGSSConfigPrintingDataRule()); }
	 ruleGSSConfigPrintingData
{ after(grammarAccess.getGSSConfigPrintingDataRule()); } 
	 EOF 
;

// Rule GSSConfigPrintingData
ruleGSSConfigPrintingData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPrintingDataAccess().getGroup()); }
		(rule__GSSConfigPrintingData__Group__0)
		{ after(grammarAccess.getGSSConfigPrintingDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPeriod
entryRuleGSSConfigPeriod
:
{ before(grammarAccess.getGSSConfigPeriodRule()); }
	 ruleGSSConfigPeriod
{ after(grammarAccess.getGSSConfigPeriodRule()); } 
	 EOF 
;

// Rule GSSConfigPeriod
ruleGSSConfigPeriod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPeriodAccess().getGroup()); }
		(rule__GSSConfigPeriod__Group__0)
		{ after(grammarAccess.getGSSConfigPeriodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigIntervalRange
entryRuleGSSConfigIntervalRange
:
{ before(grammarAccess.getGSSConfigIntervalRangeRule()); }
	 ruleGSSConfigIntervalRange
{ after(grammarAccess.getGSSConfigIntervalRangeRule()); } 
	 EOF 
;

// Rule GSSConfigIntervalRange
ruleGSSConfigIntervalRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getGroup()); }
		(rule__GSSConfigIntervalRange__Group__0)
		{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigUpperLevel
entryRuleGSSConfigUpperLevel
:
{ before(grammarAccess.getGSSConfigUpperLevelRule()); }
	 ruleGSSConfigUpperLevel
{ after(grammarAccess.getGSSConfigUpperLevelRule()); } 
	 EOF 
;

// Rule GSSConfigUpperLevel
ruleGSSConfigUpperLevel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelAccess().getGroup()); }
		(rule__GSSConfigUpperLevel__Group__0)
		{ after(grammarAccess.getGSSConfigUpperLevelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigStructuredData
entryRuleGSSConfigStructuredData
:
{ before(grammarAccess.getGSSConfigStructuredDataRule()); }
	 ruleGSSConfigStructuredData
{ after(grammarAccess.getGSSConfigStructuredDataRule()); } 
	 EOF 
;

// Rule GSSConfigStructuredData
ruleGSSConfigStructuredData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigStructuredDataAccess().getGroup()); }
		(rule__GSSConfigStructuredData__Group__0)
		{ after(grammarAccess.getGSSConfigStructuredDataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPeriodicTCLevel2
entryRuleGSSConfigPeriodicTCLevel2
:
{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Rule()); }
	 ruleGSSConfigPeriodicTCLevel2
{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Rule()); } 
	 EOF 
;

// Rule GSSConfigPeriodicTCLevel2
ruleGSSConfigPeriodicTCLevel2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup()); }
		(rule__GSSConfigPeriodicTCLevel2__Group__0)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPeriodicTCLevel1
entryRuleGSSConfigPeriodicTCLevel1
:
{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Rule()); }
	 ruleGSSConfigPeriodicTCLevel1
{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Rule()); } 
	 EOF 
;

// Rule GSSConfigPeriodicTCLevel1
ruleGSSConfigPeriodicTCLevel1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup()); }
		(rule__GSSConfigPeriodicTCLevel1__Group__0)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPeriodicTCLevel0
entryRuleGSSConfigPeriodicTCLevel0
:
{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Rule()); }
	 ruleGSSConfigPeriodicTCLevel0
{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Rule()); } 
	 EOF 
;

// Rule GSSConfigPeriodicTCLevel0
ruleGSSConfigPeriodicTCLevel0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGroup()); }
		(rule__GSSConfigPeriodicTCLevel0__Group__0)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGlobalVar
entryRuleGSSConfigGlobalVar
:
{ before(grammarAccess.getGSSConfigGlobalVarRule()); }
	 ruleGSSConfigGlobalVar
{ after(grammarAccess.getGSSConfigGlobalVarRule()); } 
	 EOF 
;

// Rule GSSConfigGlobalVar
ruleGSSConfigGlobalVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getGroup()); }
		(rule__GSSConfigGlobalVar__Group__0)
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigReferenceField
entryRuleGSSConfigReferenceField
:
{ before(grammarAccess.getGSSConfigReferenceFieldRule()); }
	 ruleGSSConfigReferenceField
{ after(grammarAccess.getGSSConfigReferenceFieldRule()); } 
	 EOF 
;

// Rule GSSConfigReferenceField
ruleGSSConfigReferenceField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getGroup()); }
		(rule__GSSConfigReferenceField__Group__0)
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigReferencePeriodicTC
entryRuleGSSConfigReferencePeriodicTC
:
{ before(grammarAccess.getGSSConfigReferencePeriodicTCRule()); }
	 ruleGSSConfigReferencePeriodicTC
{ after(grammarAccess.getGSSConfigReferencePeriodicTCRule()); } 
	 EOF 
;

// Rule GSSConfigReferencePeriodicTC
ruleGSSConfigReferencePeriodicTC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGroup()); }
		(rule__GSSConfigReferencePeriodicTC__Group__0)
		{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigReferenceSpecialPacket
entryRuleGSSConfigReferenceSpecialPacket
:
{ before(grammarAccess.getGSSConfigReferenceSpecialPacketRule()); }
	 ruleGSSConfigReferenceSpecialPacket
{ after(grammarAccess.getGSSConfigReferenceSpecialPacketRule()); } 
	 EOF 
;

// Rule GSSConfigReferenceSpecialPacket
ruleGSSConfigReferenceSpecialPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGroup()); }
		(rule__GSSConfigReferenceSpecialPacket__Group__0)
		{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigPlot
entryRuleGSSConfigPlot
:
{ before(grammarAccess.getGSSConfigPlotRule()); }
	 ruleGSSConfigPlot
{ after(grammarAccess.getGSSConfigPlotRule()); } 
	 EOF 
;

// Rule GSSConfigPlot
ruleGSSConfigPlot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getGroup()); }
		(rule__GSSConfigPlot__Group__0)
		{ after(grammarAccess.getGSSConfigPlotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigAlarmMsg
entryRuleGSSConfigAlarmMsg
:
{ before(grammarAccess.getGSSConfigAlarmMsgRule()); }
	 ruleGSSConfigAlarmMsg
{ after(grammarAccess.getGSSConfigAlarmMsgRule()); } 
	 EOF 
;

// Rule GSSConfigAlarmMsg
ruleGSSConfigAlarmMsg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getGroup()); }
		(rule__GSSConfigAlarmMsg__Group__0)
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigModify
entryRuleGSSConfigModify
:
{ before(grammarAccess.getGSSConfigModifyRule()); }
	 ruleGSSConfigModify
{ after(grammarAccess.getGSSConfigModifyRule()); } 
	 EOF 
;

// Rule GSSConfigModify
ruleGSSConfigModify 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getGroup()); }
		(rule__GSSConfigModify__Group__0)
		{ after(grammarAccess.getGSSConfigModifyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigAlarmVal
entryRuleGSSConfigAlarmVal
:
{ before(grammarAccess.getGSSConfigAlarmValRule()); }
	 ruleGSSConfigAlarmVal
{ after(grammarAccess.getGSSConfigAlarmValRule()); } 
	 EOF 
;

// Rule GSSConfigAlarmVal
ruleGSSConfigAlarmVal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getGroup()); }
		(rule__GSSConfigAlarmVal__Group__0)
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGVFiltered
entryRuleGSSConfigGVFiltered
:
{ before(grammarAccess.getGSSConfigGVFilteredRule()); }
	 ruleGSSConfigGVFiltered
{ after(grammarAccess.getGSSConfigGVFilteredRule()); } 
	 EOF 
;

// Rule GSSConfigGVFiltered
ruleGSSConfigGVFiltered 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGVFilteredAccess().getGroup()); }
		(rule__GSSConfigGVFiltered__Group__0)
		{ after(grammarAccess.getGSSConfigGVFilteredAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigGVPeriodic
entryRuleGSSConfigGVPeriodic
:
{ before(grammarAccess.getGSSConfigGVPeriodicRule()); }
	 ruleGSSConfigGVPeriodic
{ after(grammarAccess.getGSSConfigGVPeriodicRule()); } 
	 EOF 
;

// Rule GSSConfigGVPeriodic
ruleGSSConfigGVPeriodic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getGroup()); }
		(rule__GSSConfigGVPeriodic__Group__0)
		{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSConfigTestCase
entryRuleGSSConfigTestCase
:
{ before(grammarAccess.getGSSConfigTestCaseRule()); }
	 ruleGSSConfigTestCase
{ after(grammarAccess.getGSSConfigTestCaseRule()); } 
	 EOF 
;

// Rule GSSConfigTestCase
ruleGSSConfigTestCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getGroup()); }
		(rule__GSSConfigTestCase__Group__0)
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getGroup()); }
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

// Rule GSSConfigEnableDisable
ruleGSSConfigEnableDisable
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigEnableDisableAccess().getAlternatives()); }
		(rule__GSSConfigEnableDisable__Alternatives)
		{ after(grammarAccess.getGSSConfigEnableDisableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigMainInterfaceType
ruleGSSConfigMainInterfaceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getAlternatives()); }
		(rule__GSSConfigMainInterfaceType__Alternatives)
		{ after(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigMainInterfaceIOType
ruleGSSConfigMainInterfaceIOType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration()); }
		('in_out')
		{ after(grammarAccess.getGSSConfigMainInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigInterfaceType
ruleGSSConfigInterfaceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceTypeAccess().getAlternatives()); }
		(rule__GSSConfigInterfaceType__Alternatives)
		{ after(grammarAccess.getGSSConfigInterfaceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigInterfaceIOType
ruleGSSConfigInterfaceIOType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getAlternatives()); }
		(rule__GSSConfigInterfaceIOType__Alternatives)
		{ after(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigUpperLevelLevel
ruleGSSConfigUpperLevelLevel
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelLevelAccess().getAlternatives()); }
		(rule__GSSConfigUpperLevelLevel__Alternatives)
		{ after(grammarAccess.getGSSConfigUpperLevelLevelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigUnit
ruleGSSConfigUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUnitAccess().getAlternatives()); }
		(rule__GSSConfigUnit__Alternatives)
		{ after(grammarAccess.getGSSConfigUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigGlobalVarType
ruleGSSConfigGlobalVarType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarTypeAccess().getAlternatives()); }
		(rule__GSSConfigGlobalVarType__Alternatives)
		{ after(grammarAccess.getGSSConfigGlobalVarTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigReferenceFieldType
ruleGSSConfigReferenceFieldType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getAlternatives()); }
		(rule__GSSConfigReferenceFieldType__Alternatives)
		{ after(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigAlarmMsgType
ruleGSSConfigAlarmMsgType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlternatives()); }
		(rule__GSSConfigAlarmMsgType__Alternatives)
		{ after(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigModifyType
ruleGSSConfigModifyType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyTypeAccess().getAlternatives()); }
		(rule__GSSConfigModifyType__Alternatives)
		{ after(grammarAccess.getGSSConfigModifyTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigAlarmValType
ruleGSSConfigAlarmValType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration()); }
		('alarm1')
		{ after(grammarAccess.getGSSConfigAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSConfigReqAction
ruleGSSConfigReqAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration()); }
		('_1')
		{ after(grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0()); }
		(rule__GSSConfigPeriodicTCs__PeriodicTC_level_2Assignment_3_0)
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2Assignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1()); }
		(rule__GSSConfigPeriodicTCs__PeriodicTC_level_1Assignment_3_1)
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1Assignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2()); }
		(rule__GSSConfigPeriodicTCs__PeriodicTC_level_0Assignment_3_2)
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0Assignment_3_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getPlotAssignment_3_0()); }
		(rule__GSSConfigMonitors__PlotAssignment_3_0)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getPlotAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgAssignment_3_1()); }
		(rule__GSSConfigMonitors__AlarmMsgAssignment_3_1)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getModifyAssignment_3_2()); }
		(rule__GSSConfigMonitors__ModifyAssignment_3_2)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getModifyAssignment_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValAssignment_3_3()); }
		(rule__GSSConfigMonitors__AlarmValAssignment_3_3)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValAssignment_3_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Alternatives_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutAssignment_23_0()); }
		(rule__GSSConfigInterface__LevelInOutAssignment_23_0)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutAssignment_23_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getLevelInAssignment_23_1()); }
		(rule__GSSConfigInterface__LevelInAssignment_23_1)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getLevelInAssignment_23_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutAssignment_23_2()); }
		(rule__GSSConfigInterface__LevelOutAssignment_23_2)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutAssignment_23_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Alternatives_32
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodAssignment_32_0()); }
		(rule__GSSConfigSpecialPacket__PeriodAssignment_32_0)
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodAssignment_32_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeAssignment_32_1()); }
		(rule__GSSConfigSpecialPacket__IntervalRangeAssignment_32_1)
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeAssignment_32_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Alternatives_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldAssignment_18_0()); }
		(rule__GSSConfigGlobalVar__ReferenceFieldAssignment_18_0)
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldAssignment_18_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCAssignment_18_1()); }
		(rule__GSSConfigGlobalVar__ReferencePeriodicTCAssignment_18_1)
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCAssignment_18_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2()); }
		(rule__GSSConfigGlobalVar__ReferenceSpecialPacketAssignment_18_2)
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketAssignment_18_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Alternatives_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getGVFilteredAssignment_10_0()); }
		(rule__GSSConfigPlot__GVFilteredAssignment_10_0)
		{ after(grammarAccess.getGSSConfigPlotAccess().getGVFilteredAssignment_10_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicAssignment_10_1()); }
		(rule__GSSConfigPlot__GVPeriodicAssignment_10_1)
		{ after(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicAssignment_10_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Alternatives_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredAssignment_14_0()); }
		(rule__GSSConfigAlarmMsg__GVFilteredAssignment_14_0)
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredAssignment_14_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicAssignment_14_1()); }
		(rule__GSSConfigAlarmMsg__GVPeriodicAssignment_14_1)
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicAssignment_14_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Alternatives_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getGVFilteredAssignment_14_0()); }
		(rule__GSSConfigModify__GVFilteredAssignment_14_0)
		{ after(grammarAccess.getGSSConfigModifyAccess().getGVFilteredAssignment_14_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicAssignment_14_1()); }
		(rule__GSSConfigModify__GVPeriodicAssignment_14_1)
		{ after(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicAssignment_14_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Alternatives_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredAssignment_10_0()); }
		(rule__GSSConfigAlarmVal__GVFilteredAssignment_10_0)
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredAssignment_10_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicAssignment_10_1()); }
		(rule__GSSConfigAlarmVal__GVPeriodicAssignment_10_1)
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicAssignment_10_1()); }
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

rule__GSSConfigEnableDisable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
		('disabled')
		{ after(grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
		('enabled')
		{ after(grammarAccess.getGSSConfigEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterfaceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
		('SpW')
		{ after(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1()); }
		('uart')
		{ after(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getDummyEnumLiteralDeclaration_2()); }
		('dummy')
		{ after(grammarAccess.getGSSConfigMainInterfaceTypeAccess().getDummyEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
		('SpW')
		{ after(grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1()); }
		('SpW_TC')
		{ after(grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2()); }
		('SpW_Error')
		{ after(grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3()); }
		('uart')
		{ after(grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4()); }
		('dummy')
		{ after(grammarAccess.getGSSConfigInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaceIOType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0()); }
		('in_out')
		{ after(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1()); }
		('in')
		{ after(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2()); }
		('out')
		{ after(grammarAccess.getGSSConfigInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevelLevel__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0()); }
		('_1')
		{ after(grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1()); }
		('_2')
		{ after(grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2()); }
		('_3')
		{ after(grammarAccess.getGSSConfigUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
		('miliseconds')
		{ after(grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
		('seconds')
		{ after(grammarAccess.getGSSConfigUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVarType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0()); }
		('uint')
		{ after(grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1()); }
		('formula')
		{ after(grammarAccess.getGSSConfigGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceFieldType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0()); }
		('tm')
		{ after(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1()); }
		('tc')
		{ after(grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsgType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0()); }
		('alarm1')
		{ after(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1()); }
		('alarm2')
		{ after(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2()); }
		('alarm3')
		{ after(grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModifyType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0()); }
		('increment')
		{ after(grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSConfigModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1()); }
		('increment1wrap')
		{ after(grammarAccess.getGSSConfigModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1()); }
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


rule__GSSConfigGSSConfig__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__0__Impl
	rule__GSSConfigGSSConfig__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0()); }
	'GSSConfigGSSConfig'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__1__Impl
	rule__GSSConfigGSSConfig__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getNameAssignment_1()); }
	(rule__GSSConfigGSSConfig__NameAssignment_1)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__2__Impl
	rule__GSSConfigGSSConfig__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__3__Impl
	rule__GSSConfigGSSConfig__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGroup_3()); }
	(rule__GSSConfigGSSConfig__Group_3__0)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__4__Impl
	rule__GSSConfigGSSConfig__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_4()); }
	'version'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__5__Impl
	rule__GSSConfigGSSConfig__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__6__Impl
	rule__GSSConfigGSSConfig__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getVersionAssignment_6()); }
	(rule__GSSConfigGSSConfig__VersionAssignment_6)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getVersionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__7__Impl
	rule__GSSConfigGSSConfig__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__8__Impl
	rule__GSSConfigGSSConfig__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsAssignment_8()); }
	(rule__GSSConfigGSSConfig__Gss_optionsAssignment_8)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__9__Impl
	rule__GSSConfigGSSConfig__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsAssignment_9()); }
	(rule__GSSConfigGSSConfig__ProtocolsAssignment_9)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__10__Impl
	rule__GSSConfigGSSConfig__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesAssignment_10()); }
	(rule__GSSConfigGSSConfig__InterfacesAssignment_10)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__11__Impl
	rule__GSSConfigGSSConfig__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsAssignment_11()); }
	(rule__GSSConfigGSSConfig__SpecialPacketsAssignment_11)?
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__12__Impl
	rule__GSSConfigGSSConfig__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsAssignment_12()); }
	(rule__GSSConfigGSSConfig__PeriodicTCsAssignment_12)?
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__13__Impl
	rule__GSSConfigGSSConfig__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13()); }
	(rule__GSSConfigGSSConfig__UnorderedGroup_13)?
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__14__Impl
	rule__GSSConfigGSSConfig__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getTestsAssignment_14()); }
	(rule__GSSConfigGSSConfig__TestsAssignment_14)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getTestsAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__15__Impl
	rule__GSSConfigGSSConfig__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSConfig__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__0__Impl
	rule__GSSConfigGSSConfig__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0()); }
	'uri'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__1__Impl
	rule__GSSConfigGSSConfig__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__2__Impl
	rule__GSSConfigGSSConfig__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUriAssignment_3_2()); }
	(rule__GSSConfigGSSConfig__UriAssignment_3_2)
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUriAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_3()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSOptions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__0__Impl
	rule__GSSConfigGSSOptions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getGSSConfigGSSOptionsKeyword_0()); }
	'GSSConfigGSSOptions'
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getGSSConfigGSSOptionsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__1__Impl
	rule__GSSConfigGSSOptions__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__2__Impl
	rule__GSSConfigGSSOptions__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoAssignment_2()); }
	(rule__GSSConfigGSSOptions__Gss_infoAssignment_2)
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__3__Impl
	rule__GSSConfigGSSOptions__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printAssignment_3()); }
	(rule__GSSConfigGSSOptions__Gss_info_printAssignment_3)
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__4__Impl
	rule__GSSConfigGSSOptions__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printAssignment_4()); }
	(rule__GSSConfigGSSOptions__Phy_header_printAssignment_4)
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__5__Impl
	rule__GSSConfigGSSOptions__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsAssignment_5()); }
	(rule__GSSConfigGSSOptions__DiscardErrorFlagsAssignment_5)
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__6__Impl
	rule__GSSConfigGSSOptions__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSOptions__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigProtocols__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocols__Group__0__Impl
	rule__GSSConfigProtocols__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolsAccess().getGSSConfigProtocolsKeyword_0()); }
	'GSSConfigProtocols'
	{ after(grammarAccess.getGSSConfigProtocolsAccess().getGSSConfigProtocolsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocols__Group__1__Impl
	rule__GSSConfigProtocols__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigProtocolsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocols__Group__2__Impl
	rule__GSSConfigProtocols__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigProtocolsAccess().getProtocolAssignment_2()); }
		(rule__GSSConfigProtocols__ProtocolAssignment_2)
		{ after(grammarAccess.getGSSConfigProtocolsAccess().getProtocolAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSConfigProtocolsAccess().getProtocolAssignment_2()); }
		(rule__GSSConfigProtocols__ProtocolAssignment_2)*
		{ after(grammarAccess.getGSSConfigProtocolsAccess().getProtocolAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocols__Group__3__Impl
	rule__GSSConfigProtocols__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSConfigProtocolsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocols__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigInterfaces__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterfaces__Group__0__Impl
	rule__GSSConfigInterfaces__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfacesAccess().getGSSConfigInterfacesKeyword_0()); }
	'GSSConfigInterfaces'
	{ after(grammarAccess.getGSSConfigInterfacesAccess().getGSSConfigInterfacesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterfaces__Group__1__Impl
	rule__GSSConfigInterfaces__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfacesAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigInterfacesAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterfaces__Group__2__Impl
	rule__GSSConfigInterfaces__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceAssignment_2()); }
	(rule__GSSConfigInterfaces__MainInterfaceAssignment_2)
	{ after(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterfaces__Group__3__Impl
	rule__GSSConfigInterfaces__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceAssignment_3()); }
	(rule__GSSConfigInterfaces__InterfaceAssignment_3)*
	{ after(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterfaces__Group__4__Impl
	rule__GSSConfigInterfaces__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfacesAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSConfigInterfacesAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterfaces__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfacesAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfacesAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigSpecialPackets__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPackets__Group__0__Impl
	rule__GSSConfigSpecialPackets__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getGSSConfigSpecialPacketsKeyword_0()); }
	'GSSConfigSpecialPackets'
	{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getGSSConfigSpecialPacketsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPackets__Group__1__Impl
	rule__GSSConfigSpecialPackets__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPackets__Group__2__Impl
	rule__GSSConfigSpecialPackets__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
	(rule__GSSConfigSpecialPackets__SpecialPacketAssignment_2)
	{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPackets__Group__3__Impl
	rule__GSSConfigSpecialPackets__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPackets__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCs__Group__0__Impl
	rule__GSSConfigPeriodicTCs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsAction_0()); }
	()
	{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCs__Group__1__Impl
	rule__GSSConfigPeriodicTCs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsKeyword_1()); }
	'GSSConfigPeriodicTCs'
	{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCs__Group__2__Impl
	rule__GSSConfigPeriodicTCs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCs__Group__3__Impl
	rule__GSSConfigPeriodicTCs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getAlternatives_3()); }
	(rule__GSSConfigPeriodicTCs__Alternatives_3)*
	{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCs__Group__4__Impl
	rule__GSSConfigPeriodicTCs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGlobalVars__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVars__Group__0__Impl
	rule__GSSConfigGlobalVars__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getGSSConfigGlobalVarsKeyword_0()); }
	'GSSConfigGlobalVars'
	{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getGSSConfigGlobalVarsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVars__Group__1__Impl
	rule__GSSConfigGlobalVars__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVars__Group__2__Impl
	rule__GSSConfigGlobalVars__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarAssignment_2()); }
		(rule__GSSConfigGlobalVars__GlobalVarAssignment_2)
		{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarAssignment_2()); }
		(rule__GSSConfigGlobalVars__GlobalVarAssignment_2)*
		{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVars__Group__3__Impl
	rule__GSSConfigGlobalVars__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVars__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigMonitors__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group__0__Impl
	rule__GSSConfigMonitors__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getGSSConfigMonitorsKeyword_0()); }
	'GSSConfigMonitors'
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getGSSConfigMonitorsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group__1__Impl
	rule__GSSConfigMonitors__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group__2__Impl
	rule__GSSConfigMonitors__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getGroup_2()); }
	(rule__GSSConfigMonitors__Group_2__0)?
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group__3__Impl
	rule__GSSConfigMonitors__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getAlternatives_3()); }
		(rule__GSSConfigMonitors__Alternatives_3)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getAlternatives_3()); }
	)
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getAlternatives_3()); }
		(rule__GSSConfigMonitors__Alternatives_3)*
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getAlternatives_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group__4__Impl
	rule__GSSConfigMonitors__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigMonitors__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group_2__0__Impl
	rule__GSSConfigMonitors__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileKeyword_2_0()); }
	'ChartsFile'
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group_2__1__Impl
	rule__GSSConfigMonitors__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group_2__2__Impl
	rule__GSSConfigMonitors__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileAssignment_2_2()); }
	(rule__GSSConfigMonitors__ChartsFileAssignment_2_2)
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMonitors__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTests__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__0__Impl
	rule__GSSConfigTests__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0()); }
	'GSSConfigTests'
	{ after(grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__1__Impl
	rule__GSSConfigTests__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__2__Impl
	rule__GSSConfigTests__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getGroup_2()); }
	(rule__GSSConfigTests__Group_2__0)?
	{ after(grammarAccess.getGSSConfigTestsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__3__Impl
	rule__GSSConfigTests__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_3()); }
		(rule__GSSConfigTests__TestCaseAssignment_3)
		{ after(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_3()); }
	)
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_3()); }
		(rule__GSSConfigTests__TestCaseAssignment_3)*
		{ after(grammarAccess.getGSSConfigTestsAccess().getTestCaseAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__4__Impl
	rule__GSSConfigTests__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTests__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group_2__0__Impl
	rule__GSSConfigTests__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileKeyword_2_0()); }
	'ProtocolPacketsFile'
	{ after(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group_2__1__Impl
	rule__GSSConfigTests__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSConfigTestsAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group_2__2__Impl
	rule__GSSConfigTests__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileAssignment_2_2()); }
	(rule__GSSConfigTests__ProtocolPacketsFileAssignment_2_2)
	{ after(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTests__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSInfo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__0__Impl
	rule__GSSConfigGSSInfo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getGSSConfigGSSInfoKeyword_0()); }
	'GSSConfigGSSInfo'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getGSSConfigGSSInfoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__1__Impl
	rule__GSSConfigGSSInfo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__2__Impl
	rule__GSSConfigGSSInfo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignKeyword_2()); }
	'test_campaign'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__3__Impl
	rule__GSSConfigGSSInfo__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__4__Impl
	rule__GSSConfigGSSInfo__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignAssignment_4()); }
	(rule__GSSConfigGSSInfo__Test_campaignAssignment_4)
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__5__Impl
	rule__GSSConfigGSSInfo__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__6__Impl
	rule__GSSConfigGSSInfo__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getVersionKeyword_6()); }
	'version'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getVersionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__7__Impl
	rule__GSSConfigGSSInfo__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__8__Impl
	rule__GSSConfigGSSInfo__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getVersionAssignment_8()); }
	(rule__GSSConfigGSSInfo__VersionAssignment_8)
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getVersionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__9__Impl
	rule__GSSConfigGSSInfo__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__10__Impl
	rule__GSSConfigGSSInfo__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getDateKeyword_10()); }
	'date'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getDateKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__11__Impl
	rule__GSSConfigGSSInfo__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__12__Impl
	rule__GSSConfigGSSInfo__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getDateAssignment_12()); }
	(rule__GSSConfigGSSInfo__DateAssignment_12)
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getDateAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__13__Impl
	rule__GSSConfigGSSInfo__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__14__Impl
	rule__GSSConfigGSSInfo__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getGroup_14()); }
	(rule__GSSConfigGSSInfo__Group_14__0)?
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__15__Impl
	rule__GSSConfigGSSInfo__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSInfo__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group_14__0__Impl
	rule__GSSConfigGSSInfo__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlKeyword_14_0()); }
	'version_control_url'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group_14__1__Impl
	rule__GSSConfigGSSInfo__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group_14__2__Impl
	rule__GSSConfigGSSInfo__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlAssignment_14_2()); }
	(rule__GSSConfigGSSInfo__Version_control_urlAssignment_14_2)
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfo__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSInfoPrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__0__Impl
	rule__GSSConfigGSSInfoPrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getGSSConfigGSSInfoPrintKeyword_0()); }
	'GSSConfigGSSInfoPrint'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getGSSConfigGSSInfoPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__1__Impl
	rule__GSSConfigGSSInfoPrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__2__Impl
	rule__GSSConfigGSSInfoPrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogKeyword_2()); }
	'mainLog'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__3__Impl
	rule__GSSConfigGSSInfoPrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__4__Impl
	rule__GSSConfigGSSInfoPrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogAssignment_4()); }
	(rule__GSSConfigGSSInfoPrint__MainLogAssignment_4)
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__5__Impl
	rule__GSSConfigGSSInfoPrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__6__Impl
	rule__GSSConfigGSSInfoPrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsKeyword_6()); }
	'portLogs'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__7__Impl
	rule__GSSConfigGSSInfoPrint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__8__Impl
	rule__GSSConfigGSSInfoPrint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsAssignment_8()); }
	(rule__GSSConfigGSSInfoPrint__PortLogsAssignment_8)
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__9__Impl
	rule__GSSConfigGSSInfoPrint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__10__Impl
	rule__GSSConfigGSSInfoPrint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogKeyword_10()); }
	'rawLog'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__11__Impl
	rule__GSSConfigGSSInfoPrint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__12__Impl
	rule__GSSConfigGSSInfoPrint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogAssignment_12()); }
	(rule__GSSConfigGSSInfoPrint__RawLogAssignment_12)
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__13__Impl
	rule__GSSConfigGSSInfoPrint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__14__Impl
	rule__GSSConfigGSSInfoPrint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSInfoPrint__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPhyHeaderPrint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__0__Impl
	rule__GSSConfigPhyHeaderPrint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGSSConfigPhyHeaderPrintKeyword_0()); }
	'GSSConfigPhyHeaderPrint'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGSSConfigPhyHeaderPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__1__Impl
	rule__GSSConfigPhyHeaderPrint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__2__Impl
	rule__GSSConfigPhyHeaderPrint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogKeyword_2()); }
	'mainLog'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__3__Impl
	rule__GSSConfigPhyHeaderPrint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__4__Impl
	rule__GSSConfigPhyHeaderPrint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogAssignment_4()); }
	(rule__GSSConfigPhyHeaderPrint__MainLogAssignment_4)
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__5__Impl
	rule__GSSConfigPhyHeaderPrint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__6__Impl
	rule__GSSConfigPhyHeaderPrint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsKeyword_6()); }
	'portLogs'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__7__Impl
	rule__GSSConfigPhyHeaderPrint__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__8__Impl
	rule__GSSConfigPhyHeaderPrint__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsAssignment_8()); }
	(rule__GSSConfigPhyHeaderPrint__PortLogsAssignment_8)
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__9__Impl
	rule__GSSConfigPhyHeaderPrint__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__10__Impl
	rule__GSSConfigPhyHeaderPrint__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogKeyword_10()); }
	'rawLog'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__11__Impl
	rule__GSSConfigPhyHeaderPrint__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__12__Impl
	rule__GSSConfigPhyHeaderPrint__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogAssignment_12()); }
	(rule__GSSConfigPhyHeaderPrint__RawLogAssignment_12)
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__13__Impl
	rule__GSSConfigPhyHeaderPrint__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__14__Impl
	rule__GSSConfigPhyHeaderPrint__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsKeyword_14()); }
	'gssTabs'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__15__Impl
	rule__GSSConfigPhyHeaderPrint__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__16__Impl
	rule__GSSConfigPhyHeaderPrint__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsAssignment_16()); }
	(rule__GSSConfigPhyHeaderPrint__GssTabsAssignment_16)
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__17__Impl
	rule__GSSConfigPhyHeaderPrint__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__18__Impl
	rule__GSSConfigPhyHeaderPrint__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPhyHeaderPrint__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGSSDiscardErrorFlags__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__0__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGSSConfigGSSDiscardErrorFlagsKeyword_0()); }
	'GSSConfigGSSDiscardErrorFlags'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGSSConfigGSSDiscardErrorFlagsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__1__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__2__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2()); }
	'txErrors'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__3__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__4__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4()); }
	(rule__GSSConfigGSSDiscardErrorFlags__TxErrorsAssignment_4)
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__5__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__6__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6()); }
	'notExpectedPackets'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__7__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__8__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8()); }
	(rule__GSSConfigGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8)
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__9__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__10__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10()); }
	'filtersKo'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__11__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__12__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12()); }
	(rule__GSSConfigGSSDiscardErrorFlags__FiltersKoAssignment_12)
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__13__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__14__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14()); }
	'validTimesKo'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__15__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__16__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16()); }
	(rule__GSSConfigGSSDiscardErrorFlags__ValidTimesKoAssignment_16)
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__17__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__18__Impl
	rule__GSSConfigGSSDiscardErrorFlags__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSDiscardErrorFlags__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigProtocol__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__0__Impl
	rule__GSSConfigProtocol__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getGSSConfigProtocolKeyword_0()); }
	'GSSConfigProtocol'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getGSSConfigProtocolKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__1__Impl
	rule__GSSConfigProtocol__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__2__Impl
	rule__GSSConfigProtocol__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__3__Impl
	rule__GSSConfigProtocol__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__4__Impl
	rule__GSSConfigProtocol__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getIdAssignment_4()); }
	(rule__GSSConfigProtocol__IdAssignment_4)
	{ after(grammarAccess.getGSSConfigProtocolAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__5__Impl
	rule__GSSConfigProtocol__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__6__Impl
	rule__GSSConfigProtocol__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__7__Impl
	rule__GSSConfigProtocol__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__8__Impl
	rule__GSSConfigProtocol__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getNameAssignment_8()); }
	(rule__GSSConfigProtocol__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigProtocolAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__9__Impl
	rule__GSSConfigProtocol__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__10__Impl
	rule__GSSConfigProtocol__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelKeyword_10()); }
	'typeLevel'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__11__Impl
	rule__GSSConfigProtocol__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__12__Impl
	rule__GSSConfigProtocol__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelAssignment_12()); }
	(rule__GSSConfigProtocol__TypeLevelAssignment_12)
	{ after(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__13__Impl
	rule__GSSConfigProtocol__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__14__Impl
	rule__GSSConfigProtocol__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetKeyword_14()); }
	'typeOffset'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__15__Impl
	rule__GSSConfigProtocol__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__16__Impl
	rule__GSSConfigProtocol__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetAssignment_16()); }
	(rule__GSSConfigProtocol__TypeOffsetAssignment_16)
	{ after(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__17__Impl
	rule__GSSConfigProtocol__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__18__Impl
	rule__GSSConfigProtocol__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getGroup_18()); }
	(rule__GSSConfigProtocol__Group_18__0)?
	{ after(grammarAccess.getGSSConfigProtocolAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__19__Impl
	rule__GSSConfigProtocol__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigProtocol__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group_18__0__Impl
	rule__GSSConfigProtocol__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetKeyword_18_0()); }
	'subtypeOffset'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group_18__1__Impl
	rule__GSSConfigProtocol__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group_18__2__Impl
	rule__GSSConfigProtocol__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetAssignment_18_2()); }
	(rule__GSSConfigProtocol__SubtypeOffsetAssignment_18_2)
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigProtocol__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigMainInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__0__Impl
	rule__GSSConfigMainInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getGSSConfigMainInterfaceKeyword_0()); }
	'GSSConfigMainInterface'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getGSSConfigMainInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__1__Impl
	rule__GSSConfigMainInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__2__Impl
	rule__GSSConfigMainInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__3__Impl
	rule__GSSConfigMainInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__4__Impl
	rule__GSSConfigMainInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIdAssignment_4()); }
	(rule__GSSConfigMainInterface__IdAssignment_4)
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__5__Impl
	rule__GSSConfigMainInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__6__Impl
	rule__GSSConfigMainInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__7__Impl
	rule__GSSConfigMainInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__8__Impl
	rule__GSSConfigMainInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getNameAssignment_8()); }
	(rule__GSSConfigMainInterface__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__9__Impl
	rule__GSSConfigMainInterface__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__10__Impl
	rule__GSSConfigMainInterface__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeKeyword_10()); }
	'ifType'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__11__Impl
	rule__GSSConfigMainInterface__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__12__Impl
	rule__GSSConfigMainInterface__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeAssignment_12()); }
	(rule__GSSConfigMainInterface__IfTypeAssignment_12)
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__13__Impl
	rule__GSSConfigMainInterface__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__14__Impl
	rule__GSSConfigMainInterface__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigKeyword_14()); }
	'ifConfig'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__15__Impl
	rule__GSSConfigMainInterface__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__16__Impl
	rule__GSSConfigMainInterface__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigAssignment_16()); }
	(rule__GSSConfigMainInterface__IfConfigAssignment_16)
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__17__Impl
	rule__GSSConfigMainInterface__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__18__Impl
	rule__GSSConfigMainInterface__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeKeyword_18()); }
	'ioType'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__19__Impl
	rule__GSSConfigMainInterface__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__20__Impl
	rule__GSSConfigMainInterface__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeAssignment_20()); }
	(rule__GSSConfigMainInterface__IoTypeAssignment_20)
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__21__Impl
	rule__GSSConfigMainInterface__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__22__Impl
	rule__GSSConfigMainInterface__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getGroup_22()); }
	(rule__GSSConfigMainInterface__Group_22__0)?
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__23__Impl
	rule__GSSConfigMainInterface__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutAssignment_23()); }
		(rule__GSSConfigMainInterface__LevelInOutAssignment_23)
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutAssignment_23()); }
	)
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutAssignment_23()); }
		(rule__GSSConfigMainInterface__LevelInOutAssignment_23)*
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutAssignment_23()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__24__Impl
	rule__GSSConfigMainInterface__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigMainInterface__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group_22__0__Impl
	rule__GSSConfigMainInterface__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDKeyword_22_0()); }
	'protocolID'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group_22__1__Impl
	rule__GSSConfigMainInterface__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group_22__2__Impl
	rule__GSSConfigMainInterface__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDAssignment_22_2()); }
	(rule__GSSConfigMainInterface__ProtocolIDAssignment_22_2)
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigMainInterface__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__0__Impl
	rule__GSSConfigInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getGSSConfigInterfaceKeyword_0()); }
	'GSSConfigInterface'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getGSSConfigInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__1__Impl
	rule__GSSConfigInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__2__Impl
	rule__GSSConfigInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__3__Impl
	rule__GSSConfigInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__4__Impl
	rule__GSSConfigInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIdAssignment_4()); }
	(rule__GSSConfigInterface__IdAssignment_4)
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__5__Impl
	rule__GSSConfigInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__6__Impl
	rule__GSSConfigInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__7__Impl
	rule__GSSConfigInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__8__Impl
	rule__GSSConfigInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getNameAssignment_8()); }
	(rule__GSSConfigInterface__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__9__Impl
	rule__GSSConfigInterface__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__10__Impl
	rule__GSSConfigInterface__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeKeyword_10()); }
	'ifType'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__11__Impl
	rule__GSSConfigInterface__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__12__Impl
	rule__GSSConfigInterface__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeAssignment_12()); }
	(rule__GSSConfigInterface__IfTypeAssignment_12)
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__13__Impl
	rule__GSSConfigInterface__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__14__Impl
	rule__GSSConfigInterface__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigKeyword_14()); }
	'ifConfig'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__15__Impl
	rule__GSSConfigInterface__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__16__Impl
	rule__GSSConfigInterface__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigAssignment_16()); }
	(rule__GSSConfigInterface__IfConfigAssignment_16)
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__17__Impl
	rule__GSSConfigInterface__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__18__Impl
	rule__GSSConfigInterface__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeKeyword_18()); }
	'ioType'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__19__Impl
	rule__GSSConfigInterface__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__20__Impl
	rule__GSSConfigInterface__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeAssignment_20()); }
	(rule__GSSConfigInterface__IoTypeAssignment_20)
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__21__Impl
	rule__GSSConfigInterface__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__22__Impl
	rule__GSSConfigInterface__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getGroup_22()); }
	(rule__GSSConfigInterface__Group_22__0)?
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__23__Impl
	rule__GSSConfigInterface__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getAlternatives_23()); }
		(rule__GSSConfigInterface__Alternatives_23)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getAlternatives_23()); }
	)
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getAlternatives_23()); }
		(rule__GSSConfigInterface__Alternatives_23)*
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getAlternatives_23()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__24__Impl
	rule__GSSConfigInterface__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigInterface__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group_22__0__Impl
	rule__GSSConfigInterface__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDKeyword_22_0()); }
	'protocolID'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group_22__1__Impl
	rule__GSSConfigInterface__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group_22__2__Impl
	rule__GSSConfigInterface__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDAssignment_22_2()); }
	(rule__GSSConfigInterface__ProtocolIDAssignment_22_2)
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigInterface__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelInOut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__0__Impl
	rule__GSSConfigLevelInOut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getGSSConfigLevelInOutKeyword_0()); }
	'GSSConfigLevelInOut'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getGSSConfigLevelInOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__1__Impl
	rule__GSSConfigLevelInOut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__2__Impl
	rule__GSSConfigLevelInOut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__3__Impl
	rule__GSSConfigLevelInOut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__4__Impl
	rule__GSSConfigLevelInOut__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getIdAssignment_4()); }
	(rule__GSSConfigLevelInOut__IdAssignment_4)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__5__Impl
	rule__GSSConfigLevelInOut__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__6__Impl
	rule__GSSConfigLevelInOut__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__7__Impl
	rule__GSSConfigLevelInOut__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__8__Impl
	rule__GSSConfigLevelInOut__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getNameAssignment_8()); }
	(rule__GSSConfigLevelInOut__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__9__Impl
	rule__GSSConfigLevelInOut__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__10__Impl
	rule__GSSConfigLevelInOut__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatKeyword_10()); }
	'TMformat'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__11__Impl
	rule__GSSConfigLevelInOut__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__12__Impl
	rule__GSSConfigLevelInOut__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatAssignment_12()); }
	(rule__GSSConfigLevelInOut__TMformatAssignment_12)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__13__Impl
	rule__GSSConfigLevelInOut__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__14__Impl
	rule__GSSConfigLevelInOut__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatKeyword_14()); }
	'TCformat'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__15__Impl
	rule__GSSConfigLevelInOut__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__16__Impl
	rule__GSSConfigLevelInOut__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatAssignment_16()); }
	(rule__GSSConfigLevelInOut__TCformatAssignment_16)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__17__Impl
	rule__GSSConfigLevelInOut__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__18__Impl
	rule__GSSConfigLevelInOut__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterKeyword_18()); }
	'inputFilter'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__19__Impl
	rule__GSSConfigLevelInOut__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__20__Impl
	rule__GSSConfigLevelInOut__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterAssignment_20()); }
	(rule__GSSConfigLevelInOut__InputFilterAssignment_20)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__21__Impl
	rule__GSSConfigLevelInOut__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__22__Impl
	rule__GSSConfigLevelInOut__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getGroup_22()); }
	(rule__GSSConfigLevelInOut__Group_22__0)?
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__23__Impl
	rule__GSSConfigLevelInOut__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getGroup_23()); }
	(rule__GSSConfigLevelInOut__Group_23__0)?
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getGroup_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__24__Impl
	rule__GSSConfigLevelInOut__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelInOut__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_22__0__Impl
	rule__GSSConfigLevelInOut__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0()); }
	'export_to_prev_Level'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_22__1__Impl
	rule__GSSConfigLevelInOut__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_22__2__Impl
	rule__GSSConfigLevelInOut__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2()); }
	(rule__GSSConfigLevelInOut__Export_to_prev_LevelAssignment_22_2)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelAssignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelInOut__Group_23__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_23__0__Impl
	rule__GSSConfigLevelInOut__Group_23__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_23__1__Impl
	rule__GSSConfigLevelInOut__Group_23__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_23_1()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_23_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_23__2__Impl
	rule__GSSConfigLevelInOut__Group_23__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2()); }
	(rule__GSSConfigLevelInOut__Import_from_prev_LevelAssignment_23_2)
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelAssignment_23_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelInOut__Group_23__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Group_23__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_23_3()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_23_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelIn__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__0__Impl
	rule__GSSConfigLevelIn__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getGSSConfigLevelInKeyword_0()); }
	'GSSConfigLevelIn'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getGSSConfigLevelInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__1__Impl
	rule__GSSConfigLevelIn__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__2__Impl
	rule__GSSConfigLevelIn__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__3__Impl
	rule__GSSConfigLevelIn__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__4__Impl
	rule__GSSConfigLevelIn__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getIdAssignment_4()); }
	(rule__GSSConfigLevelIn__IdAssignment_4)
	{ after(grammarAccess.getGSSConfigLevelInAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__5__Impl
	rule__GSSConfigLevelIn__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__6__Impl
	rule__GSSConfigLevelIn__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__7__Impl
	rule__GSSConfigLevelIn__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__8__Impl
	rule__GSSConfigLevelIn__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getNameAssignment_8()); }
	(rule__GSSConfigLevelIn__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigLevelInAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__9__Impl
	rule__GSSConfigLevelIn__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__10__Impl
	rule__GSSConfigLevelIn__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getTCformatKeyword_10()); }
	'TCformat'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getTCformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__11__Impl
	rule__GSSConfigLevelIn__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__12__Impl
	rule__GSSConfigLevelIn__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getTCformatAssignment_12()); }
	(rule__GSSConfigLevelIn__TCformatAssignment_12)
	{ after(grammarAccess.getGSSConfigLevelInAccess().getTCformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__13__Impl
	rule__GSSConfigLevelIn__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__14__Impl
	rule__GSSConfigLevelIn__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getGroup_14()); }
	(rule__GSSConfigLevelIn__Group_14__0)?
	{ after(grammarAccess.getGSSConfigLevelInAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__15__Impl
	rule__GSSConfigLevelIn__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelIn__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group_14__0__Impl
	rule__GSSConfigLevelIn__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelKeyword_14_0()); }
	'export_to_prev_Level'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group_14__1__Impl
	rule__GSSConfigLevelIn__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group_14__2__Impl
	rule__GSSConfigLevelIn__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelAssignment_14_2()); }
	(rule__GSSConfigLevelIn__Export_to_prev_LevelAssignment_14_2)
	{ after(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelIn__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelOut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__0__Impl
	rule__GSSConfigLevelOut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getGSSConfigLevelOutKeyword_0()); }
	'GSSConfigLevelOut'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getGSSConfigLevelOutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__1__Impl
	rule__GSSConfigLevelOut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__2__Impl
	rule__GSSConfigLevelOut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__3__Impl
	rule__GSSConfigLevelOut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__4__Impl
	rule__GSSConfigLevelOut__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getIdAssignment_4()); }
	(rule__GSSConfigLevelOut__IdAssignment_4)
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__5__Impl
	rule__GSSConfigLevelOut__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__6__Impl
	rule__GSSConfigLevelOut__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__7__Impl
	rule__GSSConfigLevelOut__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__8__Impl
	rule__GSSConfigLevelOut__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getNameAssignment_8()); }
	(rule__GSSConfigLevelOut__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__9__Impl
	rule__GSSConfigLevelOut__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__10__Impl
	rule__GSSConfigLevelOut__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getTMformatKeyword_10()); }
	'TMformat'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getTMformatKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__11__Impl
	rule__GSSConfigLevelOut__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__12__Impl
	rule__GSSConfigLevelOut__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getTMformatAssignment_12()); }
	(rule__GSSConfigLevelOut__TMformatAssignment_12)
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getTMformatAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__13__Impl
	rule__GSSConfigLevelOut__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__14__Impl
	rule__GSSConfigLevelOut__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterKeyword_14()); }
	'inputFilter'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__15__Impl
	rule__GSSConfigLevelOut__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__16__Impl
	rule__GSSConfigLevelOut__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterAssignment_16()); }
	(rule__GSSConfigLevelOut__InputFilterAssignment_16)
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__17__Impl
	rule__GSSConfigLevelOut__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__18__Impl
	rule__GSSConfigLevelOut__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getGroup_18()); }
	(rule__GSSConfigLevelOut__Group_18__0)?
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__19__Impl
	rule__GSSConfigLevelOut__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigLevelOut__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group_18__0__Impl
	rule__GSSConfigLevelOut__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelKeyword_18_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group_18__1__Impl
	rule__GSSConfigLevelOut__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_18_1()); }
	':='
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group_18__2__Impl
	rule__GSSConfigLevelOut__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelAssignment_18_2()); }
	(rule__GSSConfigLevelOut__Import_from_prev_LevelAssignment_18_2)
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigLevelOut__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_18_3()); }
	';'
	{ after(grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigSpecialPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__0__Impl
	rule__GSSConfigSpecialPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getGSSConfigSpecialPacketKeyword_0()); }
	'GSSConfigSpecialPacket'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getGSSConfigSpecialPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__1__Impl
	rule__GSSConfigSpecialPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__2__Impl
	rule__GSSConfigSpecialPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusKeyword_2()); }
	'status'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__3__Impl
	rule__GSSConfigSpecialPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__4__Impl
	rule__GSSConfigSpecialPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusAssignment_4()); }
	(rule__GSSConfigSpecialPacket__StatusAssignment_4)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__5__Impl
	rule__GSSConfigSpecialPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__6__Impl
	rule__GSSConfigSpecialPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__7__Impl
	rule__GSSConfigSpecialPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__8__Impl
	rule__GSSConfigSpecialPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getNameAssignment_8()); }
	(rule__GSSConfigSpecialPacket__NameAssignment_8)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__9__Impl
	rule__GSSConfigSpecialPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__10__Impl
	rule__GSSConfigSpecialPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIdKeyword_10()); }
	'id'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIdKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__11__Impl
	rule__GSSConfigSpecialPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__12__Impl
	rule__GSSConfigSpecialPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIdAssignment_12()); }
	(rule__GSSConfigSpecialPacket__IdAssignment_12)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIdAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__13__Impl
	rule__GSSConfigSpecialPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__14__Impl
	rule__GSSConfigSpecialPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefKeyword_14()); }
	'ifRef'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__15__Impl
	rule__GSSConfigSpecialPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__16__Impl
	rule__GSSConfigSpecialPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefAssignment_16()); }
	(rule__GSSConfigSpecialPacket__IfRefAssignment_16)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__17__Impl
	rule__GSSConfigSpecialPacket__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__18__Impl
	rule__GSSConfigSpecialPacket__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsKeyword_18()); }
	'levels'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__19__Impl
	rule__GSSConfigSpecialPacket__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__20__Impl
	rule__GSSConfigSpecialPacket__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsAssignment_20()); }
	(rule__GSSConfigSpecialPacket__LevelsAssignment_20)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__21__Impl
	rule__GSSConfigSpecialPacket__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__22__Impl
	rule__GSSConfigSpecialPacket__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefKeyword_22()); }
	'levelRef'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__23__Impl
	rule__GSSConfigSpecialPacket__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__24__Impl
	rule__GSSConfigSpecialPacket__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefAssignment_24()); }
	(rule__GSSConfigSpecialPacket__LevelRefAssignment_24)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__25__Impl
	rule__GSSConfigSpecialPacket__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__26__Impl
	rule__GSSConfigSpecialPacket__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterKeyword_26()); }
	'inputFilter'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__27__Impl
	rule__GSSConfigSpecialPacket__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_27()); }
	':='
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__28__Impl
	rule__GSSConfigSpecialPacket__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterAssignment_28()); }
	(rule__GSSConfigSpecialPacket__InputFilterAssignment_28)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__29__Impl
	rule__GSSConfigSpecialPacket__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_29()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__30__Impl
	rule__GSSConfigSpecialPacket__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsAssignment_30()); }
	(rule__GSSConfigSpecialPacket__UpperLevelsAssignment_30)?
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsAssignment_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__31__Impl
	rule__GSSConfigSpecialPacket__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataAssignment_31()); }
	(rule__GSSConfigSpecialPacket__PrintingDataAssignment_31)
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataAssignment_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__32__Impl
	rule__GSSConfigSpecialPacket__Group__33
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getAlternatives_32()); }
	(rule__GSSConfigSpecialPacket__Alternatives_32)?
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getAlternatives_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__33
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__33__Impl
	rule__GSSConfigSpecialPacket__Group__34
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__33__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getRightCurlyBracketKeyword_33()); }
	'}'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getRightCurlyBracketKeyword_33()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__34
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigSpecialPacket__Group__34__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__Group__34__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_34()); }
	';'
	{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_34()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigUpperLevels__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevels__Group__0__Impl
	rule__GSSConfigUpperLevels__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getGSSConfigUpperLevelsKeyword_0()); }
	'GSSConfigUpperLevels'
	{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getGSSConfigUpperLevelsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevels__Group__1__Impl
	rule__GSSConfigUpperLevels__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevels__Group__2__Impl
	rule__GSSConfigUpperLevels__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelAssignment_2()); }
		(rule__GSSConfigUpperLevels__UpperLevelAssignment_2)
		{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelAssignment_2()); }
	)
	(
		{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelAssignment_2()); }
		(rule__GSSConfigUpperLevels__UpperLevelAssignment_2)*
		{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevels__Group__3__Impl
	rule__GSSConfigUpperLevels__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevels__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPrintingData__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__0__Impl
	rule__GSSConfigPrintingData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getGSSConfigPrintingDataKeyword_0()); }
	'GSSConfigPrintingData'
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getGSSConfigPrintingDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__1__Impl
	rule__GSSConfigPrintingData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__2__Impl
	rule__GSSConfigPrintingData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusKeyword_2()); }
	'printStatus'
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__3__Impl
	rule__GSSConfigPrintingData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__4__Impl
	rule__GSSConfigPrintingData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusAssignment_4()); }
	(rule__GSSConfigPrintingData__PrintStatusAssignment_4)
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__5__Impl
	rule__GSSConfigPrintingData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__6__Impl
	rule__GSSConfigPrintingData__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataAssignment_6()); }
	(rule__GSSConfigPrintingData__StructuredDataAssignment_6)?
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__7__Impl
	rule__GSSConfigPrintingData__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPrintingData__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriod__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__0__Impl
	rule__GSSConfigPeriod__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getGSSConfigPeriodKeyword_0()); }
	'GSSConfigPeriod'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getGSSConfigPeriodKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__1__Impl
	rule__GSSConfigPeriod__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__2__Impl
	rule__GSSConfigPeriod__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMin_valueKeyword_2()); }
	'min_value'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMin_valueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__3__Impl
	rule__GSSConfigPeriod__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__4__Impl
	rule__GSSConfigPeriod__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMin_valueAssignment_4()); }
	(rule__GSSConfigPeriod__Min_valueAssignment_4)
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMin_valueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__5__Impl
	rule__GSSConfigPeriod__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__6__Impl
	rule__GSSConfigPeriod__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMin_unitKeyword_6()); }
	'min_unit'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMin_unitKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__7__Impl
	rule__GSSConfigPeriod__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__8__Impl
	rule__GSSConfigPeriod__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMin_unitAssignment_8()); }
	(rule__GSSConfigPeriod__Min_unitAssignment_8)
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMin_unitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__9__Impl
	rule__GSSConfigPeriod__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__10__Impl
	rule__GSSConfigPeriod__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMax_valueKeyword_10()); }
	'max_value'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMax_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__11__Impl
	rule__GSSConfigPeriod__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__12__Impl
	rule__GSSConfigPeriod__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMax_valueAssignment_12()); }
	(rule__GSSConfigPeriod__Max_valueAssignment_12)
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMax_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__13__Impl
	rule__GSSConfigPeriod__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__14__Impl
	rule__GSSConfigPeriod__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMax_unitKeyword_14()); }
	'max_unit'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMax_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__15__Impl
	rule__GSSConfigPeriod__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__16__Impl
	rule__GSSConfigPeriod__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getMax_unitAssignment_16()); }
	(rule__GSSConfigPeriod__Max_unitAssignment_16)
	{ after(grammarAccess.getGSSConfigPeriodAccess().getMax_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__17__Impl
	rule__GSSConfigPeriod__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__18__Impl
	rule__GSSConfigPeriod__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriod__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigIntervalRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__0__Impl
	rule__GSSConfigIntervalRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getGSSConfigIntervalRangeKeyword_0()); }
	'GSSConfigIntervalRange'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getGSSConfigIntervalRangeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__1__Impl
	rule__GSSConfigIntervalRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__2__Impl
	rule__GSSConfigIntervalRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getMinKeyword_2()); }
	'min'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getMinKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__3__Impl
	rule__GSSConfigIntervalRange__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__4__Impl
	rule__GSSConfigIntervalRange__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getMinAssignment_4()); }
	(rule__GSSConfigIntervalRange__MinAssignment_4)
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getMinAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__5__Impl
	rule__GSSConfigIntervalRange__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__6__Impl
	rule__GSSConfigIntervalRange__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxKeyword_6()); }
	'max'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__7__Impl
	rule__GSSConfigIntervalRange__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__8__Impl
	rule__GSSConfigIntervalRange__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxAssignment_8()); }
	(rule__GSSConfigIntervalRange__MaxAssignment_8)
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__9__Impl
	rule__GSSConfigIntervalRange__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__10__Impl
	rule__GSSConfigIntervalRange__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueKeyword_10()); }
	'interval_value'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__11__Impl
	rule__GSSConfigIntervalRange__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__12__Impl
	rule__GSSConfigIntervalRange__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueAssignment_12()); }
	(rule__GSSConfigIntervalRange__Interval_valueAssignment_12)
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__13__Impl
	rule__GSSConfigIntervalRange__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__14__Impl
	rule__GSSConfigIntervalRange__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitKeyword_14()); }
	'interval_unit'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__15__Impl
	rule__GSSConfigIntervalRange__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__16__Impl
	rule__GSSConfigIntervalRange__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitAssignment_16()); }
	(rule__GSSConfigIntervalRange__Interval_unitAssignment_16)
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__17__Impl
	rule__GSSConfigIntervalRange__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__18__Impl
	rule__GSSConfigIntervalRange__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigIntervalRange__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_19()); }
	';'
	{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigUpperLevel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__0__Impl
	rule__GSSConfigUpperLevel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getGSSConfigUpperLevelKeyword_0()); }
	'GSSConfigUpperLevel'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getGSSConfigUpperLevelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__1__Impl
	rule__GSSConfigUpperLevel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__2__Impl
	rule__GSSConfigUpperLevel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getLevelKeyword_2()); }
	'level'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getLevelKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__3__Impl
	rule__GSSConfigUpperLevel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__4__Impl
	rule__GSSConfigUpperLevel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getLevelAssignment_4()); }
	(rule__GSSConfigUpperLevel__LevelAssignment_4)
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getLevelAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__5__Impl
	rule__GSSConfigUpperLevel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__6__Impl
	rule__GSSConfigUpperLevel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_6()); }
	(rule__GSSConfigUpperLevel__Group_6__0)?
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__7__Impl
	rule__GSSConfigUpperLevel__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_7()); }
	(rule__GSSConfigUpperLevel__Group_7__0)?
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__8__Impl
	rule__GSSConfigUpperLevel__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_8()); }
	(rule__GSSConfigUpperLevel__Group_8__0)?
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__9__Impl
	rule__GSSConfigUpperLevel__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigUpperLevel__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_6__0__Impl
	rule__GSSConfigUpperLevel__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatKeyword_6_0()); }
	'TMformat'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_6__1__Impl
	rule__GSSConfigUpperLevel__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_6__2__Impl
	rule__GSSConfigUpperLevel__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatAssignment_6_2()); }
	(rule__GSSConfigUpperLevel__TMformatAssignment_6_2)
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigUpperLevel__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_7__0__Impl
	rule__GSSConfigUpperLevel__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterKeyword_7_0()); }
	'inputFilter'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_7__1__Impl
	rule__GSSConfigUpperLevel__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_7_1()); }
	':='
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_7__2__Impl
	rule__GSSConfigUpperLevel__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterAssignment_7_2()); }
	(rule__GSSConfigUpperLevel__InputFilterAssignment_7_2)
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_7_3()); }
	';'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigUpperLevel__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_8__0__Impl
	rule__GSSConfigUpperLevel__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0()); }
	'import_from_prev_Level'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_8__1__Impl
	rule__GSSConfigUpperLevel__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_8_1()); }
	':='
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_8__2__Impl
	rule__GSSConfigUpperLevel__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2()); }
	(rule__GSSConfigUpperLevel__Import_from_prev_LevelAssignment_8_2)
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigUpperLevel__Group_8__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_8_3()); }
	';'
	{ after(grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigStructuredData__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__0__Impl
	rule__GSSConfigStructuredData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getGSSConfigStructuredDataKeyword_0()); }
	'GSSConfigStructuredData'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getGSSConfigStructuredDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__1__Impl
	rule__GSSConfigStructuredData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__2__Impl
	rule__GSSConfigStructuredData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefKeyword_2()); }
	'levelRef'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__3__Impl
	rule__GSSConfigStructuredData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__4__Impl
	rule__GSSConfigStructuredData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefAssignment_4()); }
	(rule__GSSConfigStructuredData__LevelRefAssignment_4)
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__5__Impl
	rule__GSSConfigStructuredData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__6__Impl
	rule__GSSConfigStructuredData__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldKeyword_6()); }
	'firstField'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__7__Impl
	rule__GSSConfigStructuredData__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__8__Impl
	rule__GSSConfigStructuredData__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldAssignment_8()); }
	(rule__GSSConfigStructuredData__FirstFieldAssignment_8)
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__9__Impl
	rule__GSSConfigStructuredData__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__10__Impl
	rule__GSSConfigStructuredData__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigStructuredData__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__0__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGSSConfigPeriodicTCLevel2Keyword_0()); }
	'GSSConfigPeriodicTCLevel2'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGSSConfigPeriodicTCLevel2Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__1__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__2__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__3__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__4__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameAssignment_4()); }
	(rule__GSSConfigPeriodicTCLevel2__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__5__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__6__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__7__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__8__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdAssignment_8()); }
	(rule__GSSConfigPeriodicTCLevel2__IdAssignment_8)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__9__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__10__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__11__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__12__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefAssignment_12()); }
	(rule__GSSConfigPeriodicTCLevel2__IfRefAssignment_12)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__13__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__14__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__15__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__16__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueAssignment_16()); }
	(rule__GSSConfigPeriodicTCLevel2__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__17__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__18__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__19__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__20__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitAssignment_20()); }
	(rule__GSSConfigPeriodicTCLevel2__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__21__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__22__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_22()); }
	(rule__GSSConfigPeriodicTCLevel2__Group_22__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__23__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Keyword_23()); }
	'app_to_level2'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__24__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__25__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Assignment_25()); }
	(rule__GSSConfigPeriodicTCLevel2__App_to_level2Assignment_25)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__26__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__27__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_27()); }
	(rule__GSSConfigPeriodicTCLevel2__Group_27__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__28__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_28()); }
	(rule__GSSConfigPeriodicTCLevel2__Group_28__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__29__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_29()); }
	(rule__GSSConfigPeriodicTCLevel2__Group_29__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__30__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_30()); }
	(rule__GSSConfigPeriodicTCLevel2__Group_30__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGroup_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__31__Impl
	rule__GSSConfigPeriodicTCLevel2__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31()); }
	'}'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group__32__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_32()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel2__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_22__0__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Keyword_22_0()); }
	'level2'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_22__1__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_22__2__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Assignment_22_2()); }
	(rule__GSSConfigPeriodicTCLevel2__Level2Assignment_22_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel2__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_27__0__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Keyword_27_0()); }
	'level1'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_27__1__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_27__2__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Assignment_27_2()); }
	(rule__GSSConfigPeriodicTCLevel2__Level1Assignment_27_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel2__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_28__0__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0()); }
	'level2_to_level1'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_28__1__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_28__2__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2()); }
	(rule__GSSConfigPeriodicTCLevel2__Level2_to_level1Assignment_28_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel2__Group_29__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_29__0__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_29__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Keyword_29_0()); }
	'level0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Keyword_29_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_29__1__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_29__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_29__2__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_29__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Assignment_29_2()); }
	(rule__GSSConfigPeriodicTCLevel2__Level0Assignment_29_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Assignment_29_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_29__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_29__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_29_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_29_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel2__Group_30__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_30__0__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_30__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_30__1__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_30__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_30__2__Impl
	rule__GSSConfigPeriodicTCLevel2__Group_30__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2()); }
	(rule__GSSConfigPeriodicTCLevel2__Level1_to_level0Assignment_30_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Assignment_30_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel2__Group_30__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Group_30__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_30_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_30_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__0__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGSSConfigPeriodicTCLevel1Keyword_0()); }
	'GSSConfigPeriodicTCLevel1'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGSSConfigPeriodicTCLevel1Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__1__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__2__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__3__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__4__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameAssignment_4()); }
	(rule__GSSConfigPeriodicTCLevel1__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__5__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__6__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__7__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__8__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdAssignment_8()); }
	(rule__GSSConfigPeriodicTCLevel1__IdAssignment_8)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__9__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__10__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__11__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__12__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefAssignment_12()); }
	(rule__GSSConfigPeriodicTCLevel1__IfRefAssignment_12)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__13__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__14__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__15__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__16__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueAssignment_16()); }
	(rule__GSSConfigPeriodicTCLevel1__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__17__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__18__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__19__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__20__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitAssignment_20()); }
	(rule__GSSConfigPeriodicTCLevel1__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__21__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__22__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_22()); }
	(rule__GSSConfigPeriodicTCLevel1__Group_22__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__23__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Keyword_23()); }
	'app_to_level1'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__24__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__25__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Assignment_25()); }
	(rule__GSSConfigPeriodicTCLevel1__App_to_level1Assignment_25)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__26__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__27__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_27()); }
	(rule__GSSConfigPeriodicTCLevel1__Group_27__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__28__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_28()); }
	(rule__GSSConfigPeriodicTCLevel1__Group_28__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGroup_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__29__Impl
	rule__GSSConfigPeriodicTCLevel1__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel1__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_22__0__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Keyword_22_0()); }
	'level1'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_22__1__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_22__2__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Assignment_22_2()); }
	(rule__GSSConfigPeriodicTCLevel1__Level1Assignment_22_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel1__Group_27__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_27__0__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_27__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Keyword_27_0()); }
	'level0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Keyword_27_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_27__1__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_27__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_27__2__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_27__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Assignment_27_2()); }
	(rule__GSSConfigPeriodicTCLevel1__Level0Assignment_27_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Assignment_27_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_27__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_27__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_27_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_27_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel1__Group_28__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_28__0__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_28__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0()); }
	'level1_to_level0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_28__1__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_28__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_28__2__Impl
	rule__GSSConfigPeriodicTCLevel1__Group_28__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2()); }
	(rule__GSSConfigPeriodicTCLevel1__Level1_to_level0Assignment_28_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Assignment_28_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel1__Group_28__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Group_28__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_28_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_28_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__0__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGSSConfigPeriodicTCLevel0Keyword_0()); }
	'GSSConfigPeriodicTCLevel0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGSSConfigPeriodicTCLevel0Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__1__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__2__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__3__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__4__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameAssignment_4()); }
	(rule__GSSConfigPeriodicTCLevel0__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__5__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__6__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__7__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__8__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdAssignment_8()); }
	(rule__GSSConfigPeriodicTCLevel0__IdAssignment_8)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__9__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__10__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefKeyword_10()); }
	'ifRef'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__11__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__12__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefAssignment_12()); }
	(rule__GSSConfigPeriodicTCLevel0__IfRefAssignment_12)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__13__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__14__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueKeyword_14()); }
	'period_value'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__15__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__16__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueAssignment_16()); }
	(rule__GSSConfigPeriodicTCLevel0__Period_valueAssignment_16)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__17__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__18__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitKeyword_18()); }
	'period_unit'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__19__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__20__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitAssignment_20()); }
	(rule__GSSConfigPeriodicTCLevel0__Period_unitAssignment_20)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__21__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__22__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGroup_22()); }
	(rule__GSSConfigPeriodicTCLevel0__Group_22__0)?
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__23__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Keyword_23()); }
	'app_to_level0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Keyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__24__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__25__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Assignment_25()); }
	(rule__GSSConfigPeriodicTCLevel0__App_to_level0Assignment_25)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Assignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__26__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__27__Impl
	rule__GSSConfigPeriodicTCLevel0__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27()); }
	'}'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group__28__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_28()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPeriodicTCLevel0__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group_22__0__Impl
	rule__GSSConfigPeriodicTCLevel0__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Keyword_22_0()); }
	'level0'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Keyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group_22__1__Impl
	rule__GSSConfigPeriodicTCLevel0__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1()); }
	':='
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group_22__2__Impl
	rule__GSSConfigPeriodicTCLevel0__Group_22__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Assignment_22_2()); }
	(rule__GSSConfigPeriodicTCLevel0__Level0Assignment_22_2)
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Assignment_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPeriodicTCLevel0__Group_22__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Group_22__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_22_3()); }
	';'
	{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_22_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGlobalVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__0__Impl
	rule__GSSConfigGlobalVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getGSSConfigGlobalVarKeyword_0()); }
	'GSSConfigGlobalVar'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getGSSConfigGlobalVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__1__Impl
	rule__GSSConfigGlobalVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__2__Impl
	rule__GSSConfigGlobalVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__3__Impl
	rule__GSSConfigGlobalVar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__4__Impl
	rule__GSSConfigGlobalVar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getNameAssignment_4()); }
	(rule__GSSConfigGlobalVar__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__5__Impl
	rule__GSSConfigGlobalVar__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__6__Impl
	rule__GSSConfigGlobalVar__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getIdKeyword_6()); }
	'id'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getIdKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__7__Impl
	rule__GSSConfigGlobalVar__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__8__Impl
	rule__GSSConfigGlobalVar__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getIdAssignment_8()); }
	(rule__GSSConfigGlobalVar__IdAssignment_8)
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getIdAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__9__Impl
	rule__GSSConfigGlobalVar__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__10__Impl
	rule__GSSConfigGlobalVar__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getTypeKeyword_10()); }
	'type'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__11__Impl
	rule__GSSConfigGlobalVar__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__12__Impl
	rule__GSSConfigGlobalVar__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getTypeAssignment_12()); }
	(rule__GSSConfigGlobalVar__TypeAssignment_12)
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__13__Impl
	rule__GSSConfigGlobalVar__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__14__Impl
	rule__GSSConfigGlobalVar__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueKeyword_14()); }
	'initial_value'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__15__Impl
	rule__GSSConfigGlobalVar__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__16__Impl
	rule__GSSConfigGlobalVar__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueAssignment_16()); }
	(rule__GSSConfigGlobalVar__Initial_valueAssignment_16)
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__17__Impl
	rule__GSSConfigGlobalVar__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__18__Impl
	rule__GSSConfigGlobalVar__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getAlternatives_18()); }
	(rule__GSSConfigGlobalVar__Alternatives_18)
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getAlternatives_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__19__Impl
	rule__GSSConfigGlobalVar__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getRightCurlyBracketKeyword_19()); }
	'}'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getRightCurlyBracketKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGlobalVar__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_20()); }
	';'
	{ after(grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigReferenceField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__0__Impl
	rule__GSSConfigReferenceField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getGSSConfigReferenceFieldKeyword_0()); }
	'GSSConfigReferenceField'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getGSSConfigReferenceFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__1__Impl
	rule__GSSConfigReferenceField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__2__Impl
	rule__GSSConfigReferenceField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__3__Impl
	rule__GSSConfigReferenceField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__4__Impl
	rule__GSSConfigReferenceField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeAssignment_4()); }
	(rule__GSSConfigReferenceField__TypeAssignment_4)
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__5__Impl
	rule__GSSConfigReferenceField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__6__Impl
	rule__GSSConfigReferenceField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__7__Impl
	rule__GSSConfigReferenceField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__8__Impl
	rule__GSSConfigReferenceField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefAssignment_8()); }
	(rule__GSSConfigReferenceField__IfRefAssignment_8)
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__9__Impl
	rule__GSSConfigReferenceField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__10__Impl
	rule__GSSConfigReferenceField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelKeyword_10()); }
	'level'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__11__Impl
	rule__GSSConfigReferenceField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__12__Impl
	rule__GSSConfigReferenceField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelAssignment_12()); }
	(rule__GSSConfigReferenceField__LevelAssignment_12)
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__13__Impl
	rule__GSSConfigReferenceField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__14__Impl
	rule__GSSConfigReferenceField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefKeyword_14()); }
	'fieldRef'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__15__Impl
	rule__GSSConfigReferenceField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__16__Impl
	rule__GSSConfigReferenceField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefAssignment_16()); }
	(rule__GSSConfigReferenceField__FieldRefAssignment_16)
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__17__Impl
	rule__GSSConfigReferenceField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__18__Impl
	rule__GSSConfigReferenceField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetKeyword_18()); }
	'offset'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__19__Impl
	rule__GSSConfigReferenceField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__20__Impl
	rule__GSSConfigReferenceField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetAssignment_20()); }
	(rule__GSSConfigReferenceField__OffsetAssignment_20)
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__21__Impl
	rule__GSSConfigReferenceField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__22__Impl
	rule__GSSConfigReferenceField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeKeyword_22()); }
	'size'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__23__Impl
	rule__GSSConfigReferenceField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__24__Impl
	rule__GSSConfigReferenceField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeAssignment_24()); }
	(rule__GSSConfigReferenceField__SizeAssignment_24)
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__25__Impl
	rule__GSSConfigReferenceField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__26__Impl
	rule__GSSConfigReferenceField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getRightCurlyBracketKeyword_26()); }
	'}'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getRightCurlyBracketKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceField__Group__27__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_27()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigReferencePeriodicTC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__0__Impl
	rule__GSSConfigReferencePeriodicTC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGSSConfigReferencePeriodicTCKeyword_0()); }
	'GSSConfigReferencePeriodicTC'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGSSConfigReferencePeriodicTCKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__1__Impl
	rule__GSSConfigReferencePeriodicTC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__2__Impl
	rule__GSSConfigReferencePeriodicTC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__3__Impl
	rule__GSSConfigReferencePeriodicTC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__4__Impl
	rule__GSSConfigReferencePeriodicTC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefAssignment_4()); }
	(rule__GSSConfigReferencePeriodicTC__IdRefAssignment_4)
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__5__Impl
	rule__GSSConfigReferencePeriodicTC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__6__Impl
	rule__GSSConfigReferencePeriodicTC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelKeyword_6()); }
	'level'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__7__Impl
	rule__GSSConfigReferencePeriodicTC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__8__Impl
	rule__GSSConfigReferencePeriodicTC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelAssignment_8()); }
	(rule__GSSConfigReferencePeriodicTC__LevelAssignment_8)
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__9__Impl
	rule__GSSConfigReferencePeriodicTC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__10__Impl
	rule__GSSConfigReferencePeriodicTC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefKeyword_10()); }
	'fieldRef'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__11__Impl
	rule__GSSConfigReferencePeriodicTC__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__12__Impl
	rule__GSSConfigReferencePeriodicTC__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefAssignment_12()); }
	(rule__GSSConfigReferencePeriodicTC__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__13__Impl
	rule__GSSConfigReferencePeriodicTC__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__14__Impl
	rule__GSSConfigReferencePeriodicTC__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetKeyword_14()); }
	'offset'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__15__Impl
	rule__GSSConfigReferencePeriodicTC__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__16__Impl
	rule__GSSConfigReferencePeriodicTC__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetAssignment_16()); }
	(rule__GSSConfigReferencePeriodicTC__OffsetAssignment_16)
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__17__Impl
	rule__GSSConfigReferencePeriodicTC__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__18__Impl
	rule__GSSConfigReferencePeriodicTC__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeKeyword_18()); }
	'size'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__19__Impl
	rule__GSSConfigReferencePeriodicTC__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__20__Impl
	rule__GSSConfigReferencePeriodicTC__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeAssignment_20()); }
	(rule__GSSConfigReferencePeriodicTC__SizeAssignment_20)
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__21__Impl
	rule__GSSConfigReferencePeriodicTC__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__22__Impl
	rule__GSSConfigReferencePeriodicTC__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferencePeriodicTC__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_23()); }
	';'
	{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigReferenceSpecialPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__0__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGSSConfigReferenceSpecialPacketKeyword_0()); }
	'GSSConfigReferenceSpecialPacket'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGSSConfigReferenceSpecialPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__1__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__2__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__3__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__4__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefAssignment_4()); }
	(rule__GSSConfigReferenceSpecialPacket__IdRefAssignment_4)
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__5__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__6__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelKeyword_6()); }
	'level'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__7__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__8__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelAssignment_8()); }
	(rule__GSSConfigReferenceSpecialPacket__LevelAssignment_8)
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__9__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__10__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefKeyword_10()); }
	'fieldRef'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__11__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__12__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefAssignment_12()); }
	(rule__GSSConfigReferenceSpecialPacket__FieldRefAssignment_12)
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__13__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__14__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetKeyword_14()); }
	'offset'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__15__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__16__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetAssignment_16()); }
	(rule__GSSConfigReferenceSpecialPacket__OffsetAssignment_16)
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__17__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__18__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeKeyword_18()); }
	'size'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__19__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__20__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeAssignment_20()); }
	(rule__GSSConfigReferenceSpecialPacket__SizeAssignment_20)
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__21__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__22__Impl
	rule__GSSConfigReferenceSpecialPacket__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigReferenceSpecialPacket__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_23()); }
	';'
	{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigPlot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__0__Impl
	rule__GSSConfigPlot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getGSSConfigPlotKeyword_0()); }
	'GSSConfigPlot'
	{ after(grammarAccess.getGSSConfigPlotAccess().getGSSConfigPlotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__1__Impl
	rule__GSSConfigPlot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigPlotAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__2__Impl
	rule__GSSConfigPlot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigPlotAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__3__Impl
	rule__GSSConfigPlot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__4__Impl
	rule__GSSConfigPlot__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getNameAssignment_4()); }
	(rule__GSSConfigPlot__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigPlotAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__5__Impl
	rule__GSSConfigPlot__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__6__Impl
	rule__GSSConfigPlot__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getChartRefKeyword_6()); }
	'chartRef'
	{ after(grammarAccess.getGSSConfigPlotAccess().getChartRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__7__Impl
	rule__GSSConfigPlot__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__8__Impl
	rule__GSSConfigPlot__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getChartRefAssignment_8()); }
	(rule__GSSConfigPlot__ChartRefAssignment_8)
	{ after(grammarAccess.getGSSConfigPlotAccess().getChartRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__9__Impl
	rule__GSSConfigPlot__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__10__Impl
	rule__GSSConfigPlot__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getAlternatives_10()); }
	(rule__GSSConfigPlot__Alternatives_10)
	{ after(grammarAccess.getGSSConfigPlotAccess().getAlternatives_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__11__Impl
	rule__GSSConfigPlot__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSConfigPlotAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigPlot__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigAlarmMsg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__0__Impl
	rule__GSSConfigAlarmMsg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getGSSConfigAlarmMsgKeyword_0()); }
	'GSSConfigAlarmMsg'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getGSSConfigAlarmMsgKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__1__Impl
	rule__GSSConfigAlarmMsg__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__2__Impl
	rule__GSSConfigAlarmMsg__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__3__Impl
	rule__GSSConfigAlarmMsg__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__4__Impl
	rule__GSSConfigAlarmMsg__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getNameAssignment_4()); }
	(rule__GSSConfigAlarmMsg__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__5__Impl
	rule__GSSConfigAlarmMsg__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__6__Impl
	rule__GSSConfigAlarmMsg__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__7__Impl
	rule__GSSConfigAlarmMsg__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__8__Impl
	rule__GSSConfigAlarmMsg__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeAssignment_8()); }
	(rule__GSSConfigAlarmMsg__TypeAssignment_8)
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__9__Impl
	rule__GSSConfigAlarmMsg__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__10__Impl
	rule__GSSConfigAlarmMsg__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getTextKeyword_10()); }
	'text'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getTextKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__11__Impl
	rule__GSSConfigAlarmMsg__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__12__Impl
	rule__GSSConfigAlarmMsg__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getTextAssignment_12()); }
	(rule__GSSConfigAlarmMsg__TextAssignment_12)
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getTextAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__13__Impl
	rule__GSSConfigAlarmMsg__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__14__Impl
	rule__GSSConfigAlarmMsg__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getAlternatives_14()); }
	(rule__GSSConfigAlarmMsg__Alternatives_14)
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getAlternatives_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__15__Impl
	rule__GSSConfigAlarmMsg__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmMsg__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigModify__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__0__Impl
	rule__GSSConfigModify__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getGSSConfigModifyKeyword_0()); }
	'GSSConfigModify'
	{ after(grammarAccess.getGSSConfigModifyAccess().getGSSConfigModifyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__1__Impl
	rule__GSSConfigModify__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigModifyAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__2__Impl
	rule__GSSConfigModify__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigModifyAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__3__Impl
	rule__GSSConfigModify__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__4__Impl
	rule__GSSConfigModify__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getNameAssignment_4()); }
	(rule__GSSConfigModify__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigModifyAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__5__Impl
	rule__GSSConfigModify__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__6__Impl
	rule__GSSConfigModify__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSConfigModifyAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__7__Impl
	rule__GSSConfigModify__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__8__Impl
	rule__GSSConfigModify__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getTypeAssignment_8()); }
	(rule__GSSConfigModify__TypeAssignment_8)
	{ after(grammarAccess.getGSSConfigModifyAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__9__Impl
	rule__GSSConfigModify__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__10__Impl
	rule__GSSConfigModify__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getValueKeyword_10()); }
	'value'
	{ after(grammarAccess.getGSSConfigModifyAccess().getValueKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__11__Impl
	rule__GSSConfigModify__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__12__Impl
	rule__GSSConfigModify__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getValueAssignment_12()); }
	(rule__GSSConfigModify__ValueAssignment_12)
	{ after(grammarAccess.getGSSConfigModifyAccess().getValueAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__13__Impl
	rule__GSSConfigModify__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__14__Impl
	rule__GSSConfigModify__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getAlternatives_14()); }
	(rule__GSSConfigModify__Alternatives_14)
	{ after(grammarAccess.getGSSConfigModifyAccess().getAlternatives_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__15__Impl
	rule__GSSConfigModify__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSConfigModifyAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigModify__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigAlarmVal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__0__Impl
	rule__GSSConfigAlarmVal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getGSSConfigAlarmValKeyword_0()); }
	'GSSConfigAlarmVal'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getGSSConfigAlarmValKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__1__Impl
	rule__GSSConfigAlarmVal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__2__Impl
	rule__GSSConfigAlarmVal__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__3__Impl
	rule__GSSConfigAlarmVal__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__4__Impl
	rule__GSSConfigAlarmVal__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getNameAssignment_4()); }
	(rule__GSSConfigAlarmVal__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__5__Impl
	rule__GSSConfigAlarmVal__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__6__Impl
	rule__GSSConfigAlarmVal__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__7__Impl
	rule__GSSConfigAlarmVal__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__8__Impl
	rule__GSSConfigAlarmVal__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getTypeAssignment_8()); }
	(rule__GSSConfigAlarmVal__TypeAssignment_8)
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__9__Impl
	rule__GSSConfigAlarmVal__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__10__Impl
	rule__GSSConfigAlarmVal__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getAlternatives_10()); }
	(rule__GSSConfigAlarmVal__Alternatives_10)
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getAlternatives_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__11__Impl
	rule__GSSConfigAlarmVal__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigAlarmVal__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGVFiltered__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__0__Impl
	rule__GSSConfigGVFiltered__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getGSSConfigGVFilteredKeyword_0()); }
	'GSSConfigGVFiltered'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getGSSConfigGVFilteredKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__1__Impl
	rule__GSSConfigGVFiltered__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__2__Impl
	rule__GSSConfigGVFiltered__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefKeyword_2()); }
	'GlobalVarRef'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__3__Impl
	rule__GSSConfigGVFiltered__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__4__Impl
	rule__GSSConfigGVFiltered__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefAssignment_4()); }
	(rule__GSSConfigGVFiltered__GlobalVarRefAssignment_4)
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__5__Impl
	rule__GSSConfigGVFiltered__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__6__Impl
	rule__GSSConfigGVFiltered__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getGroup_6()); }
	(rule__GSSConfigGVFiltered__Group_6__0)?
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__7__Impl
	rule__GSSConfigGVFiltered__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGVFiltered__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group_6__0__Impl
	rule__GSSConfigGVFiltered__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getFilterKeyword_6_0()); }
	'filter'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getFilterKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group_6__1__Impl
	rule__GSSConfigGVFiltered__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group_6__2__Impl
	rule__GSSConfigGVFiltered__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getFilterAssignment_6_2()); }
	(rule__GSSConfigGVFiltered__FilterAssignment_6_2)
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getFilterAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVFiltered__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigGVPeriodic__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__0__Impl
	rule__GSSConfigGVPeriodic__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getGSSConfigGVPeriodicKeyword_0()); }
	'GSSConfigGVPeriodic'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getGSSConfigGVPeriodicKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__1__Impl
	rule__GSSConfigGVPeriodic__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__2__Impl
	rule__GSSConfigGVPeriodic__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefKeyword_2()); }
	'GlobalVarRef'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__3__Impl
	rule__GSSConfigGVPeriodic__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__4__Impl
	rule__GSSConfigGVPeriodic__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_4()); }
	':='
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__5__Impl
	rule__GSSConfigGVPeriodic__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefAssignment_5()); }
	(rule__GSSConfigGVPeriodic__GlobalVarRefAssignment_5)
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__6__Impl
	rule__GSSConfigGVPeriodic__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__7__Impl
	rule__GSSConfigGVPeriodic__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueKeyword_7()); }
	'period_value'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__8__Impl
	rule__GSSConfigGVPeriodic__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_8()); }
	':='
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__9__Impl
	rule__GSSConfigGVPeriodic__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueAssignment_9()); }
	(rule__GSSConfigGVPeriodic__Period_valueAssignment_9)
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__10__Impl
	rule__GSSConfigGVPeriodic__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__11__Impl
	rule__GSSConfigGVPeriodic__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitKeyword_11()); }
	'period_unit'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__12__Impl
	rule__GSSConfigGVPeriodic__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_12()); }
	':='
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__13__Impl
	rule__GSSConfigGVPeriodic__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitAssignment_13()); }
	(rule__GSSConfigGVPeriodic__Period_unitAssignment_13)
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__14__Impl
	rule__GSSConfigGVPeriodic__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__15__Impl
	rule__GSSConfigGVPeriodic__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGVPeriodic__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTestCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__0__Impl
	rule__GSSConfigTestCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0()); }
	'GSSConfigTestCase'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__1__Impl
	rule__GSSConfigTestCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__2__Impl
	rule__GSSConfigTestCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__3__Impl
	rule__GSSConfigTestCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__4__Impl
	rule__GSSConfigTestCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getNameAssignment_4()); }
	(rule__GSSConfigTestCase__NameAssignment_4)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__5__Impl
	rule__GSSConfigTestCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__6__Impl
	rule__GSSConfigTestCase__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6()); }
	'procedure'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__7__Impl
	rule__GSSConfigTestCase__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__8__Impl
	rule__GSSConfigTestCase__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureAssignment_8()); }
	(rule__GSSConfigTestCase__ProcedureAssignment_8)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__9__Impl
	rule__GSSConfigTestCase__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__10__Impl
	rule__GSSConfigTestCase__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getGroup_10()); }
	(rule__GSSConfigTestCase__Group_10__0)?
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__11__Impl
	rule__GSSConfigTestCase__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getGroup_11()); }
	(rule__GSSConfigTestCase__Group_11__0)?
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__12__Impl
	rule__GSSConfigTestCase__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTestCase__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_10__0__Impl
	rule__GSSConfigTestCase__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0()); }
	'req'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqAssignment_10_1()); }
	(rule__GSSConfigTestCase__ReqAssignment_10_1)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSConfigTestCase__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_11__0__Impl
	rule__GSSConfigTestCase__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0()); }
	'reqAction'
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigTestCase__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqActionAssignment_11_1()); }
	(rule__GSSConfigTestCase__ReqActionAssignment_11_1)
	{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqActionAssignment_11_1()); }
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


rule__GSSConfigGSSConfig__UnorderedGroup_13
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
	}
:
	rule__GSSConfigGSSConfig__UnorderedGroup_13__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__UnorderedGroup_13__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsAssignment_13_0()); }
					(rule__GSSConfigGSSConfig__GlobalVarsAssignment_13_0)
					{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsAssignment_13_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsAssignment_13_1()); }
					(rule__GSSConfigGSSConfig__MonitorsAssignment_13_1)
					{ after(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsAssignment_13_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_13());
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__UnorderedGroup_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__UnorderedGroup_13__Impl
	rule__GSSConfigGSSConfig__UnorderedGroup_13__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__UnorderedGroup_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSConfigGSSConfig__UnorderedGroup_13__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0()); }
		ruleGSSConfigGSSConfig
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0()); }
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

rule__GSSConfigGSSConfig__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__UriAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__VersionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__Gss_optionsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsGSSConfigGSSOptionsParserRuleCall_8_0()); }
		ruleGSSConfigGSSOptions
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsGSSConfigGSSOptionsParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__ProtocolsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsGSSConfigProtocolsParserRuleCall_9_0()); }
		ruleGSSConfigProtocols
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsGSSConfigProtocolsParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__InterfacesAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesGSSConfigInterfacesParserRuleCall_10_0()); }
		ruleGSSConfigInterfaces
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesGSSConfigInterfacesParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__SpecialPacketsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_11_0()); }
		ruleGSSConfigSpecialPackets
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__PeriodicTCsAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_12_0()); }
		ruleGSSConfigPeriodicTCs
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__GlobalVarsAssignment_13_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsGSSConfigGlobalVarsParserRuleCall_13_0_0()); }
		ruleGSSConfigGlobalVars
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsGSSConfigGlobalVarsParserRuleCall_13_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__MonitorsAssignment_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsGSSConfigMonitorsParserRuleCall_13_1_0()); }
		ruleGSSConfigMonitors
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsGSSConfigMonitorsParserRuleCall_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSConfig__TestsAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_14_0()); }
		ruleGSSConfigTests
		{ after(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Gss_infoAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoGSSConfigGSSInfoParserRuleCall_2_0()); }
		ruleGSSConfigGSSInfo
		{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoGSSConfigGSSInfoParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Gss_info_printAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0()); }
		ruleGSSConfigGSSInfoPrint
		{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__Phy_header_printAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0()); }
		ruleGSSConfigPhyHeaderPrint
		{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSOptions__DiscardErrorFlagsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0()); }
		ruleGSSConfigGSSDiscardErrorFlags
		{ after(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocols__ProtocolAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigProtocolsAccess().getProtocolGSSConfigProtocolParserRuleCall_2_0()); }
		ruleGSSConfigProtocol
		{ after(grammarAccess.getGSSConfigProtocolsAccess().getProtocolGSSConfigProtocolParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__MainInterfaceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0()); }
		ruleGSSConfigMainInterface
		{ after(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterfaces__InterfaceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceGSSConfigInterfaceParserRuleCall_3_0()); }
		ruleGSSConfigInterface
		{ after(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceGSSConfigInterfaceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPackets__SpecialPacketAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0()); }
		ruleGSSConfigSpecialPacket
		{ after(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__PeriodicTC_level_2Assignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0()); }
		ruleGSSConfigPeriodicTCLevel2
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__PeriodicTC_level_1Assignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0()); }
		ruleGSSConfigPeriodicTCLevel1
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCs__PeriodicTC_level_0Assignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0()); }
		ruleGSSConfigPeriodicTCLevel0
		{ after(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVars__GlobalVarAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarGSSConfigGlobalVarParserRuleCall_2_0()); }
		ruleGSSConfigGlobalVar
		{ after(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarGSSConfigGlobalVarParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__ChartsFileAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileGSSChartsChartsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__PlotAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getPlotGSSConfigPlotParserRuleCall_3_0_0()); }
		ruleGSSConfigPlot
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getPlotGSSConfigPlotParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__AlarmMsgAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0()); }
		ruleGSSConfigAlarmMsg
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__ModifyAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getModifyGSSConfigModifyParserRuleCall_3_2_0()); }
		ruleGSSConfigModify
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getModifyGSSConfigModifyParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMonitors__AlarmValAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValGSSConfigAlarmValParserRuleCall_3_3_0()); }
		ruleGSSConfigAlarmVal
		{ after(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValGSSConfigAlarmValParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__ProtocolPacketsFileAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsVersionedQualifiedNameParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTests__TestCaseAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_3_0()); }
		ruleGSSConfigTestCase
		{ after(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Test_campaignAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__VersionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoAccess().getVersionVersionParserRuleCall_8_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSConfigGSSInfoAccess().getVersionVersionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__DateAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoAccess().getDateDATEParserRuleCall_12_0()); }
		ruleDATE
		{ after(grammarAccess.getGSSConfigGSSInfoAccess().getDateDATEParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfo__Version_control_urlAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0()); }
		ruleURL
		{ after(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__MainLogAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__PortLogsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSInfoPrint__RawLogAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogGSSConfigEnableDisableEnumRuleCall_12_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSInfoPrintAccess().getRawLogGSSConfigEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__MainLogAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__PortLogsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__RawLogAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogGSSConfigEnableDisableEnumRuleCall_12_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRawLogGSSConfigEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPhyHeaderPrint__GssTabsAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsGSSConfigEnableDisableEnumRuleCall_16_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsGSSConfigEnableDisableEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__TxErrorsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__NotExpectedPacketsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__FiltersKoAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGSSDiscardErrorFlags__ValidTimesKoAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigProtocolAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigProtocolAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigProtocolAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSConfigProtocolAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__TypeLevelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__TypeOffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigProtocol__SubtypeOffsetAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__IfTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0()); }
		ruleGSSConfigMainInterfaceType
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__IfConfigAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__IoTypeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0()); }
		ruleGSSConfigMainInterfaceIOType
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__ProtocolIDAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigMainInterface__LevelInOutAssignment_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0()); }
		ruleGSSConfigLevelInOut
		{ after(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__IfTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0()); }
		ruleGSSConfigInterfaceType
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__IfConfigAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigGSSIfacePortConfigVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__IoTypeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0()); }
		ruleGSSConfigInterfaceIOType
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__ProtocolIDAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDGSSConfigProtocolVersionedQualifiedReferenceNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__LevelInOutAssignment_23_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0()); }
		ruleGSSConfigLevelInOut
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__LevelInAssignment_23_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getLevelInGSSConfigLevelInParserRuleCall_23_1_0()); }
		ruleGSSConfigLevelIn
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getLevelInGSSConfigLevelInParserRuleCall_23_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigInterface__LevelOutAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutGSSConfigLevelOutParserRuleCall_23_2_0()); }
		ruleGSSConfigLevelOut
		{ after(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutGSSConfigLevelOutParserRuleCall_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__TMformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__TCformatAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatTMTCIFFormatFormatCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatTMTCIFFormatFormatCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__InputFilterAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_20_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_20_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Export_to_prev_LevelAssignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelInOut__Import_from_prev_LevelAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_23_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigLevelInAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigLevelInAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__TCformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInAccess().getTCformatTMTCIFFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInAccess().getTCformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInAccess().getTCformatTMTCIFFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelIn__Export_to_prev_LevelAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportVersionedQualifiedNameParserRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelOutAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigLevelOutAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__TMformatAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelOutAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__InputFilterAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_16_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigLevelOut__Import_from_prev_LevelAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__StatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusGSSConfigEnableDisableEnumRuleCall_4_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusGSSConfigEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__IdAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__IfRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__LevelsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__LevelRefAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__InputFilterAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterTMTCIFFilterFilterCrossReference_28_0()); }
		(
			{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_28_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterTMTCIFFilterFilterCrossReference_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__UpperLevelsAssignment_30
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0()); }
		ruleGSSConfigUpperLevels
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__PrintingDataAssignment_31
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataGSSConfigPrintingDataParserRuleCall_31_0()); }
		ruleGSSConfigPrintingData
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataGSSConfigPrintingDataParserRuleCall_31_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__PeriodAssignment_32_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodGSSConfigPeriodParserRuleCall_32_0_0()); }
		ruleGSSConfigPeriod
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodGSSConfigPeriodParserRuleCall_32_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigSpecialPacket__IntervalRangeAssignment_32_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0()); }
		ruleGSSConfigIntervalRange
		{ after(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevels__UpperLevelAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelGSSConfigUpperLevelParserRuleCall_2_0()); }
		ruleGSSConfigUpperLevel
		{ after(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelGSSConfigUpperLevelParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__PrintStatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0()); }
		ruleGSSConfigEnableDisable
		{ after(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPrintingData__StructuredDataAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataGSSConfigStructuredDataParserRuleCall_6_0()); }
		ruleGSSConfigStructuredData
		{ after(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataGSSConfigStructuredDataParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Min_valueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Min_unitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodAccess().getMin_unitGSSConfigUnitEnumRuleCall_8_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigPeriodAccess().getMin_unitGSSConfigUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Max_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriod__Max_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodAccess().getMax_unitGSSConfigUnitEnumRuleCall_16_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigPeriodAccess().getMax_unitGSSConfigUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__MinAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__MaxAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Interval_valueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigIntervalRange__Interval_unitAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitGSSConfigUnitEnumRuleCall_16_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitGSSConfigUnitEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__LevelAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelAccess().getLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0()); }
		ruleGSSConfigUpperLevelLevel
		{ after(grammarAccess.getGSSConfigUpperLevelAccess().getLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__TMformatAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatTMTCIFFormatFormatCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatTMTCIFFormatFormatCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__InputFilterAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterTMTCIFFilterFilterCrossReference_7_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_7_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterTMTCIFFilterFilterCrossReference_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigUpperLevel__Import_from_prev_LevelAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportVersionedQualifiedNameParserRuleCall_8_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__LevelRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigStructuredData__FirstFieldAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Level2Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__App_to_level2Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Level1Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Level2_to_level1Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Level0Assignment_29_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_29_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_29_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_29_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel2__Level1_to_level0Assignment_30_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_30_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Level1Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__App_to_level1Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Level0Assignment_27_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_27_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_27_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_27_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel1__Level1_to_level0Assignment_28_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_28_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__IfRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Period_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Period_unitAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__Level0Assignment_22_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_22_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_22_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_22_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPeriodicTCLevel0__App_to_level0Assignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_25_0()); }
		(
			{ before(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportVersionedQualifiedNameParserRuleCall_25_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__IdAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getIdINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getIdINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__TypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0()); }
		ruleGSSConfigGlobalVarType
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__Initial_valueAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__ReferenceFieldAssignment_18_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0()); }
		ruleGSSConfigReferenceField
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__ReferencePeriodicTCAssignment_18_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0()); }
		ruleGSSConfigReferencePeriodicTC
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGlobalVar__ReferenceSpecialPacketAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0()); }
		ruleGSSConfigReferenceSpecialPacket
		{ after(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0()); }
		ruleGSSConfigReferenceFieldType
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__LevelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__FieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__OffsetAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceField__SizeAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__LevelAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__OffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferencePeriodicTC__SizeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__LevelAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__OffsetAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigReferenceSpecialPacket__SizeAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigPlotAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__ChartRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getChartRefGSSChartsChartCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSConfigPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getGSSConfigPlotAccess().getChartRefGSSChartsChartVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigPlotAccess().getChartRefGSSChartsChartCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__GVFilteredAssignment_10_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0()); }
		ruleGSSConfigGVFiltered
		{ after(grammarAccess.getGSSConfigPlotAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigPlot__GVPeriodicAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0()); }
		ruleGSSConfigGVPeriodic
		{ after(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0()); }
		ruleGSSConfigAlarmMsgType
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__TextAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__GVFilteredAssignment_14_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0()); }
		ruleGSSConfigGVFiltered
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmMsg__GVPeriodicAssignment_14_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0()); }
		ruleGSSConfigGVPeriodic
		{ after(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigModifyAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getTypeGSSConfigModifyTypeEnumRuleCall_8_0()); }
		ruleGSSConfigModifyType
		{ after(grammarAccess.getGSSConfigModifyAccess().getTypeGSSConfigModifyTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__ValueAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getValueINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigModifyAccess().getValueINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__GVFilteredAssignment_14_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0()); }
		ruleGSSConfigGVFiltered
		{ after(grammarAccess.getGSSConfigModifyAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigModify__GVPeriodicAssignment_14_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0()); }
		ruleGSSConfigGVPeriodic
		{ after(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getTypeGSSConfigAlarmValTypeEnumRuleCall_8_0()); }
		ruleGSSConfigAlarmValType
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getTypeGSSConfigAlarmValTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__GVFilteredAssignment_10_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0()); }
		ruleGSSConfigGVFiltered
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigAlarmVal__GVPeriodicAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0()); }
		ruleGSSConfigGVPeriodic
		{ after(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__GlobalVarRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVFiltered__FilterAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGVFilteredAccess().getFilterTMTCIFFilterFilterCrossReference_6_2_0()); }
		(
			{ before(grammarAccess.getGSSConfigGVFilteredAccess().getFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigGVFilteredAccess().getFilterTMTCIFFilterFilterVersionedQualifiedNameParserRuleCall_6_2_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigGVFilteredAccess().getFilterTMTCIFFilterFilterCrossReference_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__GlobalVarRefAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefINTEGERParserRuleCall_5_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefINTEGERParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Period_valueAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_9_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigGVPeriodic__Period_unitAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitGSSConfigUnitEnumRuleCall_13_0()); }
		ruleGSSConfigUnit
		{ after(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitGSSConfigUnitEnumRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__ProcedureAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
		(
			{ before(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcVersionedQualifiedNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__ReqAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSConfigTestCase__ReqActionAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0()); }
		ruleGSSConfigReqAction
		{ after(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0()); }
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
