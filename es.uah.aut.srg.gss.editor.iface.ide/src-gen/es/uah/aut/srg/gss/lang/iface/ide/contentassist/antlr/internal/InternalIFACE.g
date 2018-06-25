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

// Entry rule entryRuleGSSIfaceUartProtocol
entryRuleGSSIfaceUartProtocol
:
{ before(grammarAccess.getGSSIfaceUartProtocolRule()); }
	 ruleGSSIfaceUartProtocol
{ after(grammarAccess.getGSSIfaceUartProtocolRule()); } 
	 EOF 
;

// Rule GSSIfaceUartProtocol
ruleGSSIfaceUartProtocol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup()); }
		(rule__GSSIfaceUartProtocol__Group__0)
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup()); }
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

// Rule GSSIfaceUartProtocolUnit
ruleGSSIfaceUartProtocolUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getAlternatives()); }
		(rule__GSSIfaceUartProtocolUnit__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule GSSIfaceUartProtocolPower
ruleGSSIfaceUartProtocolPower
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getAlternatives()); }
		(rule__GSSIfaceUartProtocolPower__Alternatives)
		{ after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getAlternatives()); }
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
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_2()); }
		ruleGSSIfaceSpWTCPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_3()); }
		ruleGSSIfaceDummyPort
		{ after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_3()); }
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

rule__GSSIfaceUartProtocolUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); }
		('bytes')
		{ after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); }
		('bits')
		{ after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocolPower__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); }
		('no')
		{ after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); }
		('2bits')
		{ after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); }
		('2_with_0')
		{ after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); }
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
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_4()); }
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
	{ before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_5()); }
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
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()); }
	(rule__GSSIfaceSpWPort__UnorderedGroup_2)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWPort__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_0__0__Impl
	rule__GSSIfaceSpWPort__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2_0_0()); }
	'type'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_0__1__Impl
	rule__GSSIfaceSpWPort__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_0__2__Impl
	rule__GSSIfaceSpWPort__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_2_0_2()); }
	(rule__GSSIfaceSpWPort__TypeAssignment_2_0_2)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWPort__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_1__0__Impl
	rule__GSSIfaceSpWPort__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_2_1_0()); }
	'link'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_1__1__Impl
	rule__GSSIfaceSpWPort__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_1__2__Impl
	rule__GSSIfaceSpWPort__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_2_1_2()); }
	(rule__GSSIfaceSpWPort__LinkAssignment_2_1_2)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWPort__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_2__0__Impl
	rule__GSSIfaceSpWPort__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_2_2_0()); }
	'writingPort'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_2__1__Impl
	rule__GSSIfaceSpWPort__Group_2_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_2_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_2__2__Impl
	rule__GSSIfaceSpWPort__Group_2_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_2_2_2()); }
	(rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2)
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_2_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__Group_2_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__Group_2_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_2_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_2_3()); }
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
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getGroup_2()); }
	(rule__GSSIfaceReadingPort__Group_2__0)
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceReadingPort__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group_2__0__Impl
	rule__GSSIfaceReadingPort__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2_0()); }
	'port'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group_2__1__Impl
	rule__GSSIfaceReadingPort__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group_2__2__Impl
	rule__GSSIfaceReadingPort__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_2_2()); }
	(rule__GSSIfaceReadingPort__PortAssignment_2_2)
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceReadingPort__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_2_3()); }
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
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()); }
	(rule__GSSIfaceUartPort__UnorderedGroup_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_0__0__Impl
	rule__GSSIfaceUartPort__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2_0_0()); }
	'number'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_0__1__Impl
	rule__GSSIfaceUartPort__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_0__2__Impl
	rule__GSSIfaceUartPort__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_2_0_2()); }
	(rule__GSSIfaceUartPort__NumberAssignment_2_0_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_1__0__Impl
	rule__GSSIfaceUartPort__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_2_1_0()); }
	'baudRate'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_1__1__Impl
	rule__GSSIfaceUartPort__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_1__2__Impl
	rule__GSSIfaceUartPort__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_2_1_2()); }
	(rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_2__0__Impl
	rule__GSSIfaceUartPort__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_2_2_0()); }
	'parity'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_2__1__Impl
	rule__GSSIfaceUartPort__Group_2_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_2_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_2__2__Impl
	rule__GSSIfaceUartPort__Group_2_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_2_2_2()); }
	(rule__GSSIfaceUartPort__ParityAssignment_2_2_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_2_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_2_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_3__0__Impl
	rule__GSSIfaceUartPort__Group_2_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_2_3_0()); }
	'dataBits'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_2_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_3__1__Impl
	rule__GSSIfaceUartPort__Group_2_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_3_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_3__2__Impl
	rule__GSSIfaceUartPort__Group_2_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_2_3_2()); }
	(rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_2_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_3_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_4__0__Impl
	rule__GSSIfaceUartPort__Group_2_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_2_4_0()); }
	'stopBits'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_2_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_4__1__Impl
	rule__GSSIfaceUartPort__Group_2_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_4_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_4__2__Impl
	rule__GSSIfaceUartPort__Group_2_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_2_4_2()); }
	(rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_2_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_4_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_5__0__Impl
	rule__GSSIfaceUartPort__Group_2_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_2_5_0()); }
	'inputQueueSize'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_2_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_5__1__Impl
	rule__GSSIfaceUartPort__Group_2_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_5_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_5__2__Impl
	rule__GSSIfaceUartPort__Group_2_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_2_5_2()); }
	(rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_2_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_5_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__Group_2_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_6__0__Impl
	rule__GSSIfaceUartPort__Group_2_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_2_6_0()); }
	'outputQueueSize'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_2_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_6__1__Impl
	rule__GSSIfaceUartPort__Group_2_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_6_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_6__2__Impl
	rule__GSSIfaceUartPort__Group_2_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_2_6_2()); }
	(rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2)
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_2_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__Group_2_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__Group_2_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_6_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartProtocol__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group__0__Impl
	rule__GSSIfaceUartProtocol__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0()); }
	'uartProtocol'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group__1__Impl
	rule__GSSIfaceUartProtocol__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group__2__Impl
	rule__GSSIfaceUartProtocol__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()); }
	(rule__GSSIfaceUartProtocol__UnorderedGroup_2)
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group__3__Impl
	rule__GSSIfaceUartProtocol__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartProtocol__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_0__0__Impl
	rule__GSSIfaceUartProtocol__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2_0_0()); }
	'unit'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_0__1__Impl
	rule__GSSIfaceUartProtocol__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_0__2__Impl
	rule__GSSIfaceUartProtocol__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_2_0_2()); }
	(rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2)
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartProtocol__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_1__0__Impl
	rule__GSSIfaceUartProtocol__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_2_1_0()); }
	'power'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_1__1__Impl
	rule__GSSIfaceUartProtocol__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_1__2__Impl
	rule__GSSIfaceUartProtocol__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_2_1_2()); }
	(rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2)
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_1_3()); }
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
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()); }
	(rule__GSSIfaceConstSize__UnorderedGroup_2)
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceConstSize__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_0__0__Impl
	rule__GSSIfaceConstSize__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2_0_0()); }
	'bytes'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_0__1__Impl
	rule__GSSIfaceConstSize__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_0__2__Impl
	rule__GSSIfaceConstSize__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_2_0_2()); }
	(rule__GSSIfaceConstSize__BytesAssignment_2_0_2)
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceConstSize__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_1__0__Impl
	rule__GSSIfaceConstSize__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_2_1_0()); }
	'bits'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_1__1__Impl
	rule__GSSIfaceConstSize__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_1__2__Impl
	rule__GSSIfaceConstSize__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_2_1_2()); }
	(rule__GSSIfaceConstSize__BitsAssignment_2_1_2)
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_1_3()); }
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
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()); }
	(rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2)
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldOffset__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl
	rule__GSSIfaceSizeFieldOffset__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2_0_0()); }
	'bytes'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl
	rule__GSSIfaceSizeFieldOffset__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl
	rule__GSSIfaceSizeFieldOffset__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_2_0_2()); }
	(rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2)
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldOffset__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl
	rule__GSSIfaceSizeFieldOffset__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_2_1_0()); }
	'bits'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl
	rule__GSSIfaceSizeFieldOffset__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl
	rule__GSSIfaceSizeFieldOffset__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_2_1_2()); }
	(rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2)
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_1_3()); }
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
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()); }
	(rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2)
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldTrim__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl
	rule__GSSIfaceSizeFieldTrim__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2_0_0()); }
	'bytes'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl
	rule__GSSIfaceSizeFieldTrim__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_0_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl
	rule__GSSIfaceSizeFieldTrim__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_2_0_2()); }
	(rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2)
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldTrim__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl
	rule__GSSIfaceSizeFieldTrim__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_2_1_0()); }
	'bits'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl
	rule__GSSIfaceSizeFieldTrim__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_1_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl
	rule__GSSIfaceSizeFieldTrim__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_2_1_2()); }
	(rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2)
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_1_3()); }
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
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup_2()); }
	(rule__GSSIfaceSyncPattern__Group_2__0)
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSyncPattern__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group_2__0__Impl
	rule__GSSIfaceSyncPattern__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2_0()); }
	'hexValue'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group_2__1__Impl
	rule__GSSIfaceSyncPattern__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group_2__2__Impl
	rule__GSSIfaceSyncPattern__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_2_2()); }
	(rule__GSSIfaceSyncPattern__HexValueAssignment_2_2)
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSyncPattern__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_2_3()); }
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
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup_2()); }
	(rule__GSSIfaceSpWTCPort__Group_2__0)
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup_2()); }
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
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWTCPort__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group_2__0__Impl
	rule__GSSIfaceSpWTCPort__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2_0()); }
	'spwPortRef'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group_2__1__Impl
	rule__GSSIfaceSpWTCPort__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_2_1()); }
	':='
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group_2__2__Impl
	rule__GSSIfaceSpWTCPort__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_2_2()); }
	(rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2)
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWTCPort__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_2_3()); }
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
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfacePortConfigAccess().getPortAssignment_3_2()); }
					(rule__GSSIfacePortConfig__PortAssignment_3_2)
					{ after(grammarAccess.getGSSIfacePortConfigAccess().getPortAssignment_3_2()); }
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
	rule__GSSIfacePortConfig__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfacePortConfig__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSpWPort__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
	}
:
	rule__GSSIfaceSpWPort__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_0()); }
					(rule__GSSIfaceSpWPort__Group_2_0__0)
					{ after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_1()); }
					(rule__GSSIfaceSpWPort__Group_2_1__0)
					{ after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_2()); }
					(rule__GSSIfaceSpWPort__Group_2_2__0)
					{ after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); }
						(rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3)
						{ after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); }
					)
					(
						{ before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); }
						((rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3)=>rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3)*
						{ after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); }
					)
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl
	rule__GSSIfaceSpWPort__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl
	rule__GSSIfaceSpWPort__UnorderedGroup_2__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__UnorderedGroup_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl
	rule__GSSIfaceSpWPort__UnorderedGroup_2__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__UnorderedGroup_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartPort__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_0()); }
					(rule__GSSIfaceUartPort__Group_2_0__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_1()); }
					(rule__GSSIfaceUartPort__Group_2_1__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_2()); }
					(rule__GSSIfaceUartPort__Group_2_2__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_3()); }
					(rule__GSSIfaceUartPort__Group_2_3__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_4()); }
					(rule__GSSIfaceUartPort__Group_2_4__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_4()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_5()); }
					(rule__GSSIfaceUartPort__Group_2_5__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_5()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_6()); }
					(rule__GSSIfaceUartPort__Group_2_6__0)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_6()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_2_7()); }
					(rule__GSSIfaceUartPort__UartProtocolAssignment_2_7)
					{ after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_2_7()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__5?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__6?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
	rule__GSSIfaceUartPort__UnorderedGroup_2__7?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UnorderedGroup_2__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceUartProtocol__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_0()); }
					(rule__GSSIfaceUartProtocol__Group_2_0__0)
					{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_1()); }
					(rule__GSSIfaceUartProtocol__Group_2_1__0)
					{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_2_2()); }
					(rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2)
					{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_2_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_2_3()); }
					(rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3)
					{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_2_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_2_4()); }
					(rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4)
					{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_2_4()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_2_5()); }
					(rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5)
					{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_2_5()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__5?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnorderedGroup_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceConstSize__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
	}
:
	rule__GSSIfaceConstSize__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_0()); }
					(rule__GSSIfaceConstSize__Group_2_0__0)
					{ after(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_1()); }
					(rule__GSSIfaceConstSize__Group_2_1__0)
					{ after(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__UnorderedGroup_2__Impl
	rule__GSSIfaceConstSize__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceConstSize__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
	}
:
	rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_0()); }
					(rule__GSSIfaceSizeFieldOffset__Group_2_0__0)
					{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_1()); }
					(rule__GSSIfaceSizeFieldOffset__Group_2_1__0)
					{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl
	rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
	}
:
	rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_0()); }
					(rule__GSSIfaceSizeFieldTrim__Group_2_0__0)
					{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_1()); }
					(rule__GSSIfaceSizeFieldTrim__Group_2_1__0)
					{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl
	rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl
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

rule__GSSIfacePortConfig__PortAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfacePortConfigAccess().getPortGSSIfacePortParserRuleCall_3_2_0()); }
		ruleGSSIfacePort
		{ after(grammarAccess.getGSSIfacePortConfigAccess().getPortGSSIfacePortParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__TypeAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0()); }
		ruleGSSIfaceSpWPortType
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__LinkAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_2_1_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_2_2_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_2_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0()); }
		ruleGSSIfaceReadingPort
		{ after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceReadingPort__PortAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_2_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__NumberAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_2_0_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0()); }
		ruleGSSIfaceUartPortBaudRate
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__ParityAssignment_2_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0()); }
		ruleGSSIfaceUartPortParity
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0()); }
		ruleGSSIfaceUartPortDataBits
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0()); }
		ruleGSSIfaceUartPortStopBits
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_2_5_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_2_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartPort__UartProtocolAssignment_2_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0()); }
		ruleGSSIfaceUartProtocol
		{ after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0()); }
		ruleGSSIfaceUartProtocolUnit
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0()); }
		ruleGSSIfaceUartProtocolPower
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0()); }
		ruleGSSIfaceConstSize
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0()); }
		ruleGSSIfaceSizeFieldOffset
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0()); }
		ruleGSSIfaceSizeFieldTrim
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0()); }
		ruleGSSIfaceSyncPattern
		{ after(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__BytesAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceConstSize__BitsAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSyncPattern__HexValueAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_2_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_2_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_2_2_0()); }
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
