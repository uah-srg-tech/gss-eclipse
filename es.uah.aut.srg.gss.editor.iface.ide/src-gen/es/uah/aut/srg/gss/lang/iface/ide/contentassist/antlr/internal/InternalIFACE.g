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
grammar InternalIFACE;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.iface.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.iface.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;

}
@parser::members {
	private IFACEGrammarAccess grammarAccess;

	public void setGrammarAccess(IFACEGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSIfacePortConfig
entryRuleGSSIfacePortConfig
:
{ before(grammarAccess.getGSSIfacePortConfigRule()); }
	 ruleGSSIfacePortConfig
{ after(grammarAccess.getGSSIfacePortConfigRule()); } 
	 EOF 
;

// Rule GSSIfacePortConfig
ruleGSSIfacePortConfig 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfacePortConfigAccess().getGroup()); }
		(rule__GSSIfacePortConfig__Group__0)
		{ after(grammarAccess.getGSSIfacePortConfigAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfacePort
entryRuleGSSIfacePort
:
{ before(grammarAccess.getGSSIfacePortRule()); }
	 ruleGSSIfacePort
{ after(grammarAccess.getGSSIfacePortRule()); } 
	 EOF 
;

// Rule GSSIfacePort
ruleGSSIfacePort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getAlternatives()); }
		(rule__GSSIfacePort__Alternatives)
		{ after(grammarAccess.getGSSIfacePortAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSpWPort
entryRuleGSSIfaceSpWPort
:
{ before(grammarAccess.getGSSIfaceSpWPortRule()); }
	 ruleGSSIfaceSpWPort
{ after(grammarAccess.getGSSIfaceSpWPortRule()); } 
	 EOF 
;

// Rule GSSIfaceSpWPort
ruleGSSIfaceSpWPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup()); }
		(rule__GSSIfaceSpWPort__Group__0)
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceReadingPort
entryRuleGSSIfaceReadingPort
:
{ before(grammarAccess.getGSSIfaceReadingPortRule()); }
	 ruleGSSIfaceReadingPort
{ after(grammarAccess.getGSSIfaceReadingPortRule()); } 
	 EOF 
;

// Rule GSSIfaceReadingPort
ruleGSSIfaceReadingPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceReadingPortAccess().getGroup()); }
		(rule__GSSIfaceReadingPort__Group__0)
		{ after(grammarAccess.getGSSIfaceReadingPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceUartPort
entryRuleGSSIfaceUartPort
:
{ before(grammarAccess.getGSSIfaceUartPortRule()); }
	 ruleGSSIfaceUartPort
{ after(grammarAccess.getGSSIfaceUartPortRule()); } 
	 EOF 
;

// Rule GSSIfaceUartPort
ruleGSSIfaceUartPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup()); }
		(rule__GSSIfaceUartPort__Group__0)
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSocketSrvPort
entryRuleGSSIfaceSocketSrvPort
:
{ before(grammarAccess.getGSSIfaceSocketSrvPortRule()); }
	 ruleGSSIfaceSocketSrvPort
{ after(grammarAccess.getGSSIfaceSocketSrvPortRule()); } 
	 EOF 
;

// Rule GSSIfaceSocketSrvPort
ruleGSSIfaceSocketSrvPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getGroup()); }
		(rule__GSSIfaceSocketSrvPort__Group__0)
		{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSocketCliPort
entryRuleGSSIfaceSocketCliPort
:
{ before(grammarAccess.getGSSIfaceSocketCliPortRule()); }
	 ruleGSSIfaceSocketCliPort
{ after(grammarAccess.getGSSIfaceSocketCliPortRule()); } 
	 EOF 
;

// Rule GSSIfaceSocketCliPort
ruleGSSIfaceSocketCliPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getGroup()); }
		(rule__GSSIfaceSocketCliPort__Group__0)
		{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfacePortProtocol
entryRuleGSSIfacePortProtocol
:
{ before(grammarAccess.getGSSIfacePortProtocolRule()); }
	 ruleGSSIfacePortProtocol
{ after(grammarAccess.getGSSIfacePortProtocolRule()); } 
	 EOF 
;

// Rule GSSIfacePortProtocol
ruleGSSIfacePortProtocol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getGroup()); }
		(rule__GSSIfacePortProtocol__Group__0)
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceConstSize
entryRuleGSSIfaceConstSize
:
{ before(grammarAccess.getGSSIfaceConstSizeRule()); }
	 ruleGSSIfaceConstSize
{ after(grammarAccess.getGSSIfaceConstSizeRule()); } 
	 EOF 
;

// Rule GSSIfaceConstSize
ruleGSSIfaceConstSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup()); }
		(rule__GSSIfaceConstSize__Group__0)
		{ after(grammarAccess.getGSSIfaceConstSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSizeFieldOffset
entryRuleGSSIfaceSizeFieldOffset
:
{ before(grammarAccess.getGSSIfaceSizeFieldOffsetRule()); }
	 ruleGSSIfaceSizeFieldOffset
{ after(grammarAccess.getGSSIfaceSizeFieldOffsetRule()); } 
	 EOF 
;

// Rule GSSIfaceSizeFieldOffset
ruleGSSIfaceSizeFieldOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup()); }
		(rule__GSSIfaceSizeFieldOffset__Group__0)
		{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSizeFieldTrim
entryRuleGSSIfaceSizeFieldTrim
:
{ before(grammarAccess.getGSSIfaceSizeFieldTrimRule()); }
	 ruleGSSIfaceSizeFieldTrim
{ after(grammarAccess.getGSSIfaceSizeFieldTrimRule()); } 
	 EOF 
;

// Rule GSSIfaceSizeFieldTrim
ruleGSSIfaceSizeFieldTrim 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup()); }
		(rule__GSSIfaceSizeFieldTrim__Group__0)
		{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSyncPattern
entryRuleGSSIfaceSyncPattern
:
{ before(grammarAccess.getGSSIfaceSyncPatternRule()); }
	 ruleGSSIfaceSyncPattern
{ after(grammarAccess.getGSSIfaceSyncPatternRule()); } 
	 EOF 
;

// Rule GSSIfaceSyncPattern
ruleGSSIfaceSyncPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup()); }
		(rule__GSSIfaceSyncPattern__Group__0)
		{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceSpWTCPort
entryRuleGSSIfaceSpWTCPort
:
{ before(grammarAccess.getGSSIfaceSpWTCPortRule()); }
	 ruleGSSIfaceSpWTCPort
{ after(grammarAccess.getGSSIfaceSpWTCPortRule()); } 
	 EOF 
;

// Rule GSSIfaceSpWTCPort
ruleGSSIfaceSpWTCPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup()); }
		(rule__GSSIfaceSpWTCPort__Group__0)
		{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSIfaceDummyPort
entryRuleGSSIfaceDummyPort
:
{ before(grammarAccess.getGSSIfaceDummyPortRule()); }
	 ruleGSSIfaceDummyPort
{ after(grammarAccess.getGSSIfaceDummyPortRule()); } 
	 EOF 
;

// Rule GSSIfaceDummyPort
ruleGSSIfaceDummyPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceDummyPortAccess().getGroup()); }
		(rule__GSSIfaceDummyPort__Group__0)
		{ after(grammarAccess.getGSSIfaceDummyPortAccess().getGroup()); }
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

// Rule GSSIfaceSpWPortType
ruleGSSIfaceSpWPortType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getAlternatives()); }
		(rule__GSSIfaceSpWPortType__Alternatives)
		{ after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfaceUartPortBaudRate
ruleGSSIfaceUartPortBaudRate
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().getAlternatives()); }
		(rule__GSSIfaceUartPortBaudRate__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartPortBaudRateAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfaceUartPortParity
ruleGSSIfaceUartPortParity
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortParityAccess().getAlternatives()); }
		(rule__GSSIfaceUartPortParity__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartPortParityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfaceUartPortDataBits
ruleGSSIfaceUartPortDataBits
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().getAlternatives()); }
		(rule__GSSIfaceUartPortDataBits__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfaceUartPortStopBits
ruleGSSIfaceUartPortStopBits
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().getAlternatives()); }
		(rule__GSSIfaceUartPortStopBits__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartPortStopBitsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfaceUartPortFlowControl
ruleGSSIfaceUartPortFlowControl
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getAlternatives()); }
		(rule__GSSIfaceUartPortFlowControl__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfacePortProtocolUnit
ruleGSSIfacePortProtocolUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolUnitAccess().getAlternatives()); }
		(rule__GSSIfacePortProtocolUnit__Alternatives)
		{ after(grammarAccess.getGSSIfacePortProtocolUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfacePortProtocolPower
ruleGSSIfacePortProtocolPower
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolPowerAccess().getAlternatives()); }
		(rule__GSSIfacePortProtocolPower__Alternatives)
		{ after(grammarAccess.getGSSIfacePortProtocolPowerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePort__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWPortParserRuleCall_0()); }
		ruleGSSIfaceSpWPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWPortParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceUartPortParserRuleCall_1()); }
		ruleGSSIfaceUartPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceUartPortParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketSrvPortParserRuleCall_2()); }
		ruleGSSIfaceSocketSrvPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketSrvPortParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketCliPortParserRuleCall_3()); }
		ruleGSSIfaceSocketCliPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketCliPortParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_4()); }
		ruleGSSIfaceSpWTCPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_5()); }
		ruleGSSIfaceDummyPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_5()); }
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

rule__GSSIfaceSpWPortType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0()); }
		('usb')
		{ after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1()); }
		('mk2')
		{ after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2()); }
		('pci')
		{ after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPortBaudRate__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0()); }
		('38400bauds')
		{ after(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1()); }
		('115200bauds')
		{ after(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPortParity__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0()); }
		('NO')
		{ after(grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1()); }
		('ODD')
		{ after(grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2()); }
		('EVEN')
		{ after(grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3()); }
		('MARK')
		{ after(grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4()); }
		('SPACE')
		{ after(grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPortDataBits__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0()); }
		('5bits')
		{ after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1()); }
		('6bits')
		{ after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2()); }
		('7bits')
		{ after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3()); }
		('8bits')
		{ after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPortStopBits__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0()); }
		('1bit')
		{ after(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1()); }
		('2bits')
		{ after(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPortFlowControl__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0()); }
		('rts_cts')
		{ after(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1()); }
		('xon_xoff')
		{ after(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocolUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); }
		('bytes')
		{ after(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); }
		('bits')
		{ after(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocolPower__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); }
		('no')
		{ after(grammarAccess.getGSSIfacePortProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); }
		('2bits')
		{ after(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); }
		('2_with_0')
		{ after(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); }
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


rule__GSSIfacePortConfig__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__0__Impl
	rule__GSSIfacePortConfig__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0()); }
	'portConfig'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__1__Impl
	rule__GSSIfacePortConfig__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1()); }
	(rule__GSSIfacePortConfig__NameAssignment_1)
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__2__Impl
	rule__GSSIfacePortConfig__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__3__Impl
	rule__GSSIfacePortConfig__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()); }
	(rule__GSSIfacePortConfig__UnorderedGroup_3)
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__4__Impl
	rule__GSSIfacePortConfig__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4()); }
	(rule__GSSIfacePortConfig__PortConfigAssignment_4)
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__5__Impl
	rule__GSSIfacePortConfig__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfacePortConfig__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_0__0__Impl
	rule__GSSIfacePortConfig__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_0__1__Impl
	rule__GSSIfacePortConfig__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_0__2__Impl
	rule__GSSIfacePortConfig__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); }
	(rule__GSSIfacePortConfig__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfacePortConfig__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_1__0__Impl
	rule__GSSIfacePortConfig__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_1__1__Impl
	rule__GSSIfacePortConfig__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_1__2__Impl
	rule__GSSIfacePortConfig__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSIfacePortConfig__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__0__Impl
	rule__GSSIfaceSpWPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0()); }
	'spwPort'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__1__Impl
	rule__GSSIfaceSpWPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__2__Impl
	rule__GSSIfaceSpWPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__3__Impl
	rule__GSSIfaceSpWPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__4__Impl
	rule__GSSIfaceSpWPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4()); }
	(rule__GSSIfaceSpWPort__TypeAssignment_4)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__5__Impl
	rule__GSSIfaceSpWPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__6__Impl
	rule__GSSIfaceSpWPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6()); }
	'link'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__7__Impl
	rule__GSSIfaceSpWPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__8__Impl
	rule__GSSIfaceSpWPort__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8()); }
	(rule__GSSIfaceSpWPort__LinkAssignment_8)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__9__Impl
	rule__GSSIfaceSpWPort__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__10__Impl
	rule__GSSIfaceSpWPort__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10()); }
	'writingPort'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__11__Impl
	rule__GSSIfaceSpWPort__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__12__Impl
	rule__GSSIfaceSpWPort__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12()); }
	(rule__GSSIfaceSpWPort__WritingPortAssignment_12)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__13__Impl
	rule__GSSIfaceSpWPort__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__14__Impl
	rule__GSSIfaceSpWPort__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); }
		(rule__GSSIfaceSpWPort__ReadingPortAssignment_14)
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); }
	)
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); }
		(rule__GSSIfaceSpWPort__ReadingPortAssignment_14)*
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__15__Impl
	rule__GSSIfaceSpWPort__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceReadingPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__0__Impl
	rule__GSSIfaceReadingPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0()); }
	'readingPort'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__1__Impl
	rule__GSSIfaceReadingPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__2__Impl
	rule__GSSIfaceReadingPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2()); }
	'port'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__3__Impl
	rule__GSSIfaceReadingPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__4__Impl
	rule__GSSIfaceReadingPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4()); }
	(rule__GSSIfaceReadingPort__PortAssignment_4)
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__5__Impl
	rule__GSSIfaceReadingPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__6__Impl
	rule__GSSIfaceReadingPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__0__Impl
	rule__GSSIfaceUartPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0()); }
	'uartPort'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__1__Impl
	rule__GSSIfaceUartPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__2__Impl
	rule__GSSIfaceUartPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2()); }
	'number'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__3__Impl
	rule__GSSIfaceUartPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__4__Impl
	rule__GSSIfaceUartPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4()); }
	(rule__GSSIfaceUartPort__NumberAssignment_4)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__5__Impl
	rule__GSSIfaceUartPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__6__Impl
	rule__GSSIfaceUartPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6()); }
	'baudRate'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__7__Impl
	rule__GSSIfaceUartPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__8__Impl
	rule__GSSIfaceUartPort__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8()); }
	(rule__GSSIfaceUartPort__BaudRateAssignment_8)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__9__Impl
	rule__GSSIfaceUartPort__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__10__Impl
	rule__GSSIfaceUartPort__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10()); }
	'parity'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__11__Impl
	rule__GSSIfaceUartPort__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__12__Impl
	rule__GSSIfaceUartPort__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12()); }
	(rule__GSSIfaceUartPort__ParityAssignment_12)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__13__Impl
	rule__GSSIfaceUartPort__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__14__Impl
	rule__GSSIfaceUartPort__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14()); }
	'dataBits'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__15__Impl
	rule__GSSIfaceUartPort__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__16__Impl
	rule__GSSIfaceUartPort__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16()); }
	(rule__GSSIfaceUartPort__DataBitsAssignment_16)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__17__Impl
	rule__GSSIfaceUartPort__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__18__Impl
	rule__GSSIfaceUartPort__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18()); }
	'stopBits'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__19__Impl
	rule__GSSIfaceUartPort__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__20__Impl
	rule__GSSIfaceUartPort__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20()); }
	(rule__GSSIfaceUartPort__StopBitsAssignment_20)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__21__Impl
	rule__GSSIfaceUartPort__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__22__Impl
	rule__GSSIfaceUartPort__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlKeyword_22()); }
	'flowControl'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__23__Impl
	rule__GSSIfaceUartPort__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__24__Impl
	rule__GSSIfaceUartPort__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlAssignment_24()); }
	(rule__GSSIfaceUartPort__FlowControlAssignment_24)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__25__Impl
	rule__GSSIfaceUartPort__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__26__Impl
	rule__GSSIfaceUartPort__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolAssignment_26()); }
	(rule__GSSIfaceUartPort__PortProtocolAssignment_26)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolAssignment_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__27__Impl
	rule__GSSIfaceUartPort__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_27()); }
	'}'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group__28__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_28()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSocketSrvPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__0__Impl
	rule__GSSIfaceSocketSrvPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSocketSrvPortKeyword_0()); }
	'socketSrvPort'
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSocketSrvPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__1__Impl
	rule__GSSIfaceSocketSrvPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__2__Impl
	rule__GSSIfaceSocketSrvPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberKeyword_2()); }
	'portNumber'
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__3__Impl
	rule__GSSIfaceSocketSrvPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__4__Impl
	rule__GSSIfaceSocketSrvPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberAssignment_4()); }
	(rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4)
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__5__Impl
	rule__GSSIfaceSocketSrvPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__6__Impl
	rule__GSSIfaceSocketSrvPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolAssignment_6()); }
	(rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6)
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__7__Impl
	rule__GSSIfaceSocketSrvPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketSrvPort__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSocketCliPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__0__Impl
	rule__GSSIfaceSocketCliPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSocketCliPortKeyword_0()); }
	'socketCliPort'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSocketCliPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__1__Impl
	rule__GSSIfaceSocketCliPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__2__Impl
	rule__GSSIfaceSocketCliPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressKeyword_2()); }
	'ipAddress'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__3__Impl
	rule__GSSIfaceSocketCliPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__4__Impl
	rule__GSSIfaceSocketCliPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressAssignment_4()); }
	(rule__GSSIfaceSocketCliPort__IpAddressAssignment_4)
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__5__Impl
	rule__GSSIfaceSocketCliPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__6__Impl
	rule__GSSIfaceSocketCliPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberKeyword_6()); }
	'portNumber'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__7__Impl
	rule__GSSIfaceSocketCliPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__8__Impl
	rule__GSSIfaceSocketCliPort__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberAssignment_8()); }
	(rule__GSSIfaceSocketCliPort__PortNumberAssignment_8)
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__9__Impl
	rule__GSSIfaceSocketCliPort__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__10__Impl
	rule__GSSIfaceSocketCliPort__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolAssignment_10()); }
	(rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10)
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__11__Impl
	rule__GSSIfaceSocketCliPort__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSocketCliPort__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfacePortProtocol__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__0__Impl
	rule__GSSIfacePortProtocol__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getPortProtocolKeyword_0()); }
	'portProtocol'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getPortProtocolKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__1__Impl
	rule__GSSIfacePortProtocol__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__2__Impl
	rule__GSSIfacePortProtocol__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getUnitKeyword_2()); }
	'unit'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getUnitKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__3__Impl
	rule__GSSIfacePortProtocol__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__4__Impl
	rule__GSSIfacePortProtocol__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getUnitAssignment_4()); }
	(rule__GSSIfacePortProtocol__UnitAssignment_4)
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getUnitAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__5__Impl
	rule__GSSIfacePortProtocol__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__6__Impl
	rule__GSSIfacePortProtocol__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getPowerKeyword_6()); }
	'power'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getPowerKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__7__Impl
	rule__GSSIfacePortProtocol__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__8__Impl
	rule__GSSIfacePortProtocol__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getPowerAssignment_8()); }
	(rule__GSSIfacePortProtocol__PowerAssignment_8)
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getPowerAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__9__Impl
	rule__GSSIfacePortProtocol__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__10__Impl
	rule__GSSIfacePortProtocol__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeAssignment_10()); }
	(rule__GSSIfacePortProtocol__ConstSizeAssignment_10)
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__11__Impl
	rule__GSSIfacePortProtocol__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetAssignment_11()); }
	(rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11)
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__12__Impl
	rule__GSSIfacePortProtocol__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimAssignment_12()); }
	(rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12)
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__13__Impl
	rule__GSSIfacePortProtocol__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternAssignment_13()); }
	(rule__GSSIfacePortProtocol__SyncPatternAssignment_13)?
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__14__Impl
	rule__GSSIfacePortProtocol__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortProtocol__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceConstSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__0__Impl
	rule__GSSIfaceConstSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0()); }
	'constSize'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__1__Impl
	rule__GSSIfaceConstSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__2__Impl
	rule__GSSIfaceConstSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__3__Impl
	rule__GSSIfaceConstSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__4__Impl
	rule__GSSIfaceConstSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4()); }
	(rule__GSSIfaceConstSize__BytesAssignment_4)
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__5__Impl
	rule__GSSIfaceConstSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__6__Impl
	rule__GSSIfaceConstSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__7__Impl
	rule__GSSIfaceConstSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__8__Impl
	rule__GSSIfaceConstSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8()); }
	(rule__GSSIfaceConstSize__BitsAssignment_8)
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__9__Impl
	rule__GSSIfaceConstSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__10__Impl
	rule__GSSIfaceConstSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__0__Impl
	rule__GSSIfaceSizeFieldOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0()); }
	'sizeFieldOffset'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__1__Impl
	rule__GSSIfaceSizeFieldOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__2__Impl
	rule__GSSIfaceSizeFieldOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__3__Impl
	rule__GSSIfaceSizeFieldOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__4__Impl
	rule__GSSIfaceSizeFieldOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4()); }
	(rule__GSSIfaceSizeFieldOffset__BytesAssignment_4)
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__5__Impl
	rule__GSSIfaceSizeFieldOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__6__Impl
	rule__GSSIfaceSizeFieldOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__7__Impl
	rule__GSSIfaceSizeFieldOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__8__Impl
	rule__GSSIfaceSizeFieldOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8()); }
	(rule__GSSIfaceSizeFieldOffset__BitsAssignment_8)
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__9__Impl
	rule__GSSIfaceSizeFieldOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__10__Impl
	rule__GSSIfaceSizeFieldOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldTrim__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__0__Impl
	rule__GSSIfaceSizeFieldTrim__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0()); }
	'sizeFieldTrim'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__1__Impl
	rule__GSSIfaceSizeFieldTrim__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__2__Impl
	rule__GSSIfaceSizeFieldTrim__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__3__Impl
	rule__GSSIfaceSizeFieldTrim__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__4__Impl
	rule__GSSIfaceSizeFieldTrim__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4()); }
	(rule__GSSIfaceSizeFieldTrim__BytesAssignment_4)
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__5__Impl
	rule__GSSIfaceSizeFieldTrim__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__6__Impl
	rule__GSSIfaceSizeFieldTrim__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__7__Impl
	rule__GSSIfaceSizeFieldTrim__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__8__Impl
	rule__GSSIfaceSizeFieldTrim__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8()); }
	(rule__GSSIfaceSizeFieldTrim__BitsAssignment_8)
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__9__Impl
	rule__GSSIfaceSizeFieldTrim__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__10__Impl
	rule__GSSIfaceSizeFieldTrim__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSyncPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__0__Impl
	rule__GSSIfaceSyncPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0()); }
	'syncPattern'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__1__Impl
	rule__GSSIfaceSyncPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__2__Impl
	rule__GSSIfaceSyncPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2()); }
	'hexValue'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__3__Impl
	rule__GSSIfaceSyncPattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__4__Impl
	rule__GSSIfaceSyncPattern__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4()); }
	(rule__GSSIfaceSyncPattern__HexValueAssignment_4)
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__5__Impl
	rule__GSSIfaceSyncPattern__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__6__Impl
	rule__GSSIfaceSyncPattern__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWTCPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__0__Impl
	rule__GSSIfaceSpWTCPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0()); }
	'spwTCPort'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__1__Impl
	rule__GSSIfaceSpWTCPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__2__Impl
	rule__GSSIfaceSpWTCPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2()); }
	'spwPortRef'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__3__Impl
	rule__GSSIfaceSpWTCPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__4__Impl
	rule__GSSIfaceSpWTCPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4()); }
	(rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4)
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__5__Impl
	rule__GSSIfaceSpWTCPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__6__Impl
	rule__GSSIfaceSpWTCPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceDummyPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceDummyPort__Group__0__Impl
	rule__GSSIfaceDummyPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); }
	()
	{ after(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceDummyPort__Group__1__Impl
	rule__GSSIfaceDummyPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1()); }
	'dummyPort'
	{ after(grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceDummyPort__Group__2__Impl
	rule__GSSIfaceDummyPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceDummyPort__Group__3__Impl
	rule__GSSIfaceDummyPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceDummyPort__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceDummyPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4()); }
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


rule__GSSIfacePortConfig__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
	}
:
	rule__GSSIfacePortConfig__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); }
					(rule__GSSIfacePortConfig__Group_3_0__0)
					{ after(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); }
					(rule__GSSIfacePortConfig__Group_3_1__0)
					{ after(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
	rule__GSSIfacePortConfig__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSIfacePortConfigParserRuleCall_1_0()); }
		ruleGSSIfacePortConfig
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSIfacePortConfigParserRuleCall_1_0()); }
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

rule__GSSIfacePortConfig__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortConfigAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSIfacePortConfigAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__PortConfigAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigGSSIfacePortParserRuleCall_4_0()); }
		ruleGSSIfacePort
		{ after(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigGSSIfacePortParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0()); }
		ruleGSSIfaceSpWPortType
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__LinkAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__WritingPortAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__ReadingPortAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_14_0()); }
		ruleGSSIfaceReadingPort
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__PortAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__NumberAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__BaudRateAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0()); }
		ruleGSSIfaceUartPortBaudRate
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__ParityAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_12_0()); }
		ruleGSSIfaceUartPortParity
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__DataBitsAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0()); }
		ruleGSSIfaceUartPortDataBits
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__StopBitsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0()); }
		ruleGSSIfaceUartPortStopBits
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__FlowControlAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0()); }
		ruleGSSIfaceUartPortFlowControl
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__PortProtocolAssignment_26
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_26_0()); }
		ruleGSSIfacePortProtocol
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_26_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_6_0()); }
		ruleGSSIfacePortProtocol
		{ after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__IpAddressAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__PortNumberAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_10_0()); }
		ruleGSSIfacePortProtocol
		{ after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__UnitAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0()); }
		ruleGSSIfacePortProtocolUnit
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__PowerAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0()); }
		ruleGSSIfacePortProtocolPower
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__ConstSizeAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0()); }
		ruleGSSIfaceConstSize
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0()); }
		ruleGSSIfaceSizeFieldOffset
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0()); }
		ruleGSSIfaceSizeFieldTrim
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortProtocol__SyncPatternAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0()); }
		ruleGSSIfaceSyncPattern
		{ after(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__HexValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_4_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_4_0()); }
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
