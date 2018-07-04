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
grammar InternalPROTOCOL_PACKETS;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.protocol_packets.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.protocol_packets.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;

}
@parser::members {
	private PROTOCOL_PACKETSGrammarAccess grammarAccess;

	public void setGrammarAccess(PROTOCOL_PACKETSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSProtocolPacketsProtocolPackets
entryRuleGSSProtocolPacketsProtocolPackets
:
{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule()); }
	 ruleGSSProtocolPacketsProtocolPackets
{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule()); } 
	 EOF 
;

// Rule GSSProtocolPacketsProtocolPackets
ruleGSSProtocolPacketsProtocolPackets 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup()); }
		(rule__GSSProtocolPacketsProtocolPackets__Group__0)
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSProtocolPacketsProtocolPacket
entryRuleGSSProtocolPacketsProtocolPacket
:
{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketRule()); }
	 ruleGSSProtocolPacketsProtocolPacket
{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketRule()); } 
	 EOF 
;

// Rule GSSProtocolPacketsProtocolPacket
ruleGSSProtocolPacketsProtocolPacket 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGroup()); }
		(rule__GSSProtocolPacketsProtocolPacket__Group__0)
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSProtocolPacketsExport
entryRuleGSSProtocolPacketsExport
:
{ before(grammarAccess.getGSSProtocolPacketsExportRule()); }
	 ruleGSSProtocolPacketsExport
{ after(grammarAccess.getGSSProtocolPacketsExportRule()); } 
	 EOF 
;

// Rule GSSProtocolPacketsExport
ruleGSSProtocolPacketsExport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getGroup()); }
		(rule__GSSProtocolPacketsExport__Group__0)
		{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSProtocolPacketsFormat
entryRuleGSSProtocolPacketsFormat
:
{ before(grammarAccess.getGSSProtocolPacketsFormatRule()); }
	 ruleGSSProtocolPacketsFormat
{ after(grammarAccess.getGSSProtocolPacketsFormatRule()); } 
	 EOF 
;

// Rule GSSProtocolPacketsFormat
ruleGSSProtocolPacketsFormat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getGroup()); }
		(rule__GSSProtocolPacketsFormat__Group__0)
		{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getGroup()); }
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


rule__GSSProtocolPacketsProtocolPackets__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0()); }
	'GSSProtocolPacketsProtocolPackets'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameAssignment_1()); }
	(rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()); }
	(rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); }
		(rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4)
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); }
	)
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); }
		(rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4)*
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriAssignment_3_0_2()); }
	(rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionAssignment_3_1_2()); }
	(rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSProtocolPacketsProtocolPacket__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGSSProtocolPacketsProtocolPacketKeyword_0()); }
	'GSSProtocolPacketsProtocolPacket'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGSSProtocolPacketsProtocolPacketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameAssignment_4()); }
	(rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefKeyword_6()); }
	'ifRef'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefAssignment_8()); }
	(rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefKeyword_10()); }
	'levelRef'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefAssignment_12()); }
	(rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportAssignment_14()); }
	(rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_14)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_15()); }
	(rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_15)
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl
	rule__GSSProtocolPacketsProtocolPacket__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_16()); }
	'}'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSProtocolPacketsExport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__0__Impl
	rule__GSSProtocolPacketsExport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getGSSProtocolPacketsExportKeyword_0()); }
	'GSSProtocolPacketsExport'
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getGSSProtocolPacketsExportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__1__Impl
	rule__GSSProtocolPacketsExport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__2__Impl
	rule__GSSProtocolPacketsExport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getFileKeyword_2()); }
	'file'
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__3__Impl
	rule__GSSProtocolPacketsExport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__4__Impl
	rule__GSSProtocolPacketsExport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getFileAssignment_4()); }
	(rule__GSSProtocolPacketsExport__FileAssignment_4)
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__5__Impl
	rule__GSSProtocolPacketsExport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__6__Impl
	rule__GSSProtocolPacketsExport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsExport__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSProtocolPacketsFormat__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__0__Impl
	rule__GSSProtocolPacketsFormat__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getGSSProtocolPacketsFormatKeyword_0()); }
	'GSSProtocolPacketsFormat'
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getGSSProtocolPacketsFormatKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__1__Impl
	rule__GSSProtocolPacketsFormat__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__2__Impl
	rule__GSSProtocolPacketsFormat__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileKeyword_2()); }
	'file'
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__3__Impl
	rule__GSSProtocolPacketsFormat__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__4__Impl
	rule__GSSProtocolPacketsFormat__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileAssignment_4()); }
	(rule__GSSProtocolPacketsFormat__FileAssignment_4)
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__5__Impl
	rule__GSSProtocolPacketsFormat__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__6__Impl
	rule__GSSProtocolPacketsFormat__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsFormat__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_7()); }
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


rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
	}
:
	rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); }
					(rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0)
					{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_1()); }
					(rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0)
					{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl
	rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getGSSModelFileAccess().getElementGSSProtocolPacketsProtocolPacketsParserRuleCall_1_0()); }
		ruleGSSProtocolPacketsProtocolPackets
		{ after(grammarAccess.getGSSModelFileAccess().getElementGSSProtocolPacketsProtocolPacketsParserRuleCall_1_0()); }
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

rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketGSSProtocolPacketsProtocolPacketParserRuleCall_4_0()); }
		ruleGSSProtocolPacketsProtocolPacket
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketGSSProtocolPacketsProtocolPacketParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSProtocolPacketsExportParserRuleCall_14_0()); }
		ruleGSSProtocolPacketsExport
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSProtocolPacketsExportParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSProtocolPacketsFormatParserRuleCall_15_0()); }
		ruleGSSProtocolPacketsFormat
		{ after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSProtocolPacketsFormatParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsExport__FileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsExportAccess().getFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSProtocolPacketsExportAccess().getFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSProtocolPacketsFormat__FileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileIDTerminalRuleCall_4_0()); }
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
