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
grammar InternalTCINPUT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tcinput.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tcinput.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tcinput.services.TCINPUTGrammarAccess;

}
@parser::members {
	private TCINPUTGrammarAccess grammarAccess;

	public void setGrammarAccess(TCINPUTGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSTCInput
entryRuleGSSTCInput
:
{ before(grammarAccess.getGSSTCInputRule()); }
	 ruleGSSTCInput
{ after(grammarAccess.getGSSTCInputRule()); } 
	 EOF 
;

// Rule GSSTCInput
ruleGSSTCInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getGroup()); }
		(rule__GSSTCInput__Group__0)
		{ after(grammarAccess.getGSSTCInputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTCInputField
entryRuleGSSTCInputField
:
{ before(grammarAccess.getGSSTCInputFieldRule()); }
	 ruleGSSTCInputField
{ after(grammarAccess.getGSSTCInputFieldRule()); } 
	 EOF 
;

// Rule GSSTCInputField
ruleGSSTCInputField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTCInputFieldAccess().getGroup()); }
		(rule__GSSTCInputField__Group__0)
		{ after(grammarAccess.getGSSTCInputFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__0__Impl
	rule__GSSTCInput__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGSSTCInputKeyword_0()); }
	'<GSSTCInput'
	{ after(grammarAccess.getGSSTCInputAccess().getGSSTCInputKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__1__Impl
	rule__GSSTCInput__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTCInputAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__2__Impl
	rule__GSSTCInput__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getNameAssignment_2()); }
	(rule__GSSTCInput__NameAssignment_2)
	{ after(grammarAccess.getGSSTCInputAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__3__Impl
	rule__GSSTCInput__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTypeKeyword_3()); }
	'type='
	{ after(grammarAccess.getGSSTCInputAccess().getTypeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__4__Impl
	rule__GSSTCInput__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTypeAssignment_4()); }
	(rule__GSSTCInput__TypeAssignment_4)
	{ after(grammarAccess.getGSSTCInputAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__5__Impl
	rule__GSSTCInput__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSubtypeKeyword_5()); }
	'subtype='
	{ after(grammarAccess.getGSSTCInputAccess().getSubtypeKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__6__Impl
	rule__GSSTCInput__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSubtypeAssignment_6()); }
	(rule__GSSTCInput__SubtypeAssignment_6)
	{ after(grammarAccess.getGSSTCInputAccess().getSubtypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__7__Impl
	rule__GSSTCInput__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevelsKeyword_7()); }
	'levels='
	{ after(grammarAccess.getGSSTCInputAccess().getLevelsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__8__Impl
	rule__GSSTCInput__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevelsAssignment_8()); }
	(rule__GSSTCInput__LevelsAssignment_8)
	{ after(grammarAccess.getGSSTCInputAccess().getLevelsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__9__Impl
	rule__GSSTCInput__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGreaterThanSignKeyword_9()); }
	'>'
	{ after(grammarAccess.getGSSTCInputAccess().getGreaterThanSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__10__Impl
	rule__GSSTCInput__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_10()); }
	(rule__GSSTCInput__Group_10__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__11__Impl
	rule__GSSTCInput__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_11()); }
	(rule__GSSTCInput__Group_11__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__12__Impl
	rule__GSSTCInput__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_12()); }
	(rule__GSSTCInput__Group_12__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__13__Impl
	rule__GSSTCInput__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_13()); }
	(rule__GSSTCInput__Group_13__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__14__Impl
	rule__GSSTCInput__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_14()); }
	(rule__GSSTCInput__Group_14__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__15__Impl
	rule__GSSTCInput__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_15()); }
	(rule__GSSTCInput__Group_15__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__16__Impl
	rule__GSSTCInput__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_16()); }
	(rule__GSSTCInput__Group_16__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__17__Impl
	rule__GSSTCInput__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_17()); }
	(rule__GSSTCInput__Group_17__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__18__Impl
	rule__GSSTCInput__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGroup_18()); }
	(rule__GSSTCInput__Group_18__0)?
	{ after(grammarAccess.getGSSTCInputAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getGSSTCInputKeyword_19()); }
	'</GSSTCInput>'
	{ after(grammarAccess.getGSSTCInputAccess().getGSSTCInputKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_10__0__Impl
	rule__GSSTCInput__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level3_exportKeyword_10_0()); }
	'<to_level3_export'
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level3_exportKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_10__1__Impl
	rule__GSSTCInput__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_10_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_10__2__Impl
	rule__GSSTCInput__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level3_exportAssignment_10_2()); }
	(rule__GSSTCInput__To_level3_exportAssignment_10_2)
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level3_exportAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_10_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_11__0__Impl
	rule__GSSTCInput__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel3_formatKeyword_11_0()); }
	'<level3_format'
	{ after(grammarAccess.getGSSTCInputAccess().getLevel3_formatKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_11__1__Impl
	rule__GSSTCInput__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_11_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_11__2__Impl
	rule__GSSTCInput__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel3_formatAssignment_11_2()); }
	(rule__GSSTCInput__Level3_formatAssignment_11_2)
	{ after(grammarAccess.getGSSTCInputAccess().getLevel3_formatAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_11_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_12__0__Impl
	rule__GSSTCInput__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level2_exportKeyword_12_0()); }
	'<to_level2_export'
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level2_exportKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_12__1__Impl
	rule__GSSTCInput__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_12_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_12__2__Impl
	rule__GSSTCInput__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level2_exportAssignment_12_2()); }
	(rule__GSSTCInput__To_level2_exportAssignment_12_2)
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level2_exportAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_12_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_13__0__Impl
	rule__GSSTCInput__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel2_formatKeyword_13_0()); }
	'<level2_format'
	{ after(grammarAccess.getGSSTCInputAccess().getLevel2_formatKeyword_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_13__1__Impl
	rule__GSSTCInput__Group_13__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_13_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_13__2__Impl
	rule__GSSTCInput__Group_13__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel2_formatAssignment_13_2()); }
	(rule__GSSTCInput__Level2_formatAssignment_13_2)
	{ after(grammarAccess.getGSSTCInputAccess().getLevel2_formatAssignment_13_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_13__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_13__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_13_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_13_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_14__0__Impl
	rule__GSSTCInput__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level1_exportKeyword_14_0()); }
	'<to_level1_export'
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level1_exportKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_14__1__Impl
	rule__GSSTCInput__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_14_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_14__2__Impl
	rule__GSSTCInput__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level1_exportAssignment_14_2()); }
	(rule__GSSTCInput__To_level1_exportAssignment_14_2)
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level1_exportAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_14_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_15__0__Impl
	rule__GSSTCInput__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel1_formatKeyword_15_0()); }
	'<level1_format'
	{ after(grammarAccess.getGSSTCInputAccess().getLevel1_formatKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_15__1__Impl
	rule__GSSTCInput__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_15_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_15__2__Impl
	rule__GSSTCInput__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel1_formatAssignment_15_2()); }
	(rule__GSSTCInput__Level1_formatAssignment_15_2)
	{ after(grammarAccess.getGSSTCInputAccess().getLevel1_formatAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_15_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_16__0__Impl
	rule__GSSTCInput__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level0_exportKeyword_16_0()); }
	'<to_level0_export'
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level0_exportKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_16__1__Impl
	rule__GSSTCInput__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_16_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_16__2__Impl
	rule__GSSTCInput__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getTo_level0_exportAssignment_16_2()); }
	(rule__GSSTCInput__To_level0_exportAssignment_16_2)
	{ after(grammarAccess.getGSSTCInputAccess().getTo_level0_exportAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_16_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_17__0__Impl
	rule__GSSTCInput__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel0_formatKeyword_17_0()); }
	'<level0_format'
	{ after(grammarAccess.getGSSTCInputAccess().getLevel0_formatKeyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_17__1__Impl
	rule__GSSTCInput__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFileKeyword_17_1()); }
	'file='
	{ after(grammarAccess.getGSSTCInputAccess().getFileKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_17__2__Impl
	rule__GSSTCInput__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getLevel0_formatAssignment_17_2()); }
	(rule__GSSTCInput__Level0_formatAssignment_17_2)
	{ after(grammarAccess.getGSSTCInputAccess().getLevel0_formatAssignment_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_17__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_17_3()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_18__0__Impl
	rule__GSSTCInput__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFieldsKeyword_18_0()); }
	'<fields>'
	{ after(grammarAccess.getGSSTCInputAccess().getFieldsKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_18__1__Impl
	rule__GSSTCInput__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTCInputAccess().getGssFieldsAssignment_18_1()); }
		(rule__GSSTCInput__GssFieldsAssignment_18_1)
		{ after(grammarAccess.getGSSTCInputAccess().getGssFieldsAssignment_18_1()); }
	)
	(
		{ before(grammarAccess.getGSSTCInputAccess().getGssFieldsAssignment_18_1()); }
		(rule__GSSTCInput__GssFieldsAssignment_18_1)*
		{ after(grammarAccess.getGSSTCInputAccess().getGssFieldsAssignment_18_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInput__Group_18__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputAccess().getFieldsKeyword_18_2()); }
	'</fields>'
	{ after(grammarAccess.getGSSTCInputAccess().getFieldsKeyword_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInputField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__0__Impl
	rule__GSSTCInputField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getInputFieldKeyword_0()); }
	'<InputField'
	{ after(grammarAccess.getGSSTCInputFieldAccess().getInputFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__1__Impl
	rule__GSSTCInputField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTCInputFieldAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__2__Impl
	rule__GSSTCInputField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getNameAssignment_2()); }
	(rule__GSSTCInputField__NameAssignment_2)
	{ after(grammarAccess.getGSSTCInputFieldAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__3__Impl
	rule__GSSTCInputField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getGssFieldKeyword_3()); }
	'gssField='
	{ after(grammarAccess.getGSSTCInputFieldAccess().getGssFieldKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__4__Impl
	rule__GSSTCInputField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getGssFieldAssignment_4()); }
	(rule__GSSTCInputField__GssFieldAssignment_4)
	{ after(grammarAccess.getGSSTCInputFieldAccess().getGssFieldAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__5__Impl
	rule__GSSTCInputField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getGroup_5()); }
	(rule__GSSTCInputField__Group_5__0)?
	{ after(grammarAccess.getGSSTCInputFieldAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getSolidusGreaterThanSignKeyword_6()); }
	'/>'
	{ after(grammarAccess.getGSSTCInputFieldAccess().getSolidusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInputField__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group_5__0__Impl
	rule__GSSTCInputField__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getEnumRefKeyword_5_0()); }
	'enumRef='
	{ after(grammarAccess.getGSSTCInputFieldAccess().getEnumRefKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTCInputField__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTCInputFieldAccess().getEnumRefAssignment_5_1()); }
	(rule__GSSTCInputField__EnumRefAssignment_5_1)
	{ after(grammarAccess.getGSSTCInputFieldAccess().getEnumRefAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTCInput__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTCInputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTCInputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__SubtypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTCInputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__LevelsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTCInputAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__To_level3_exportAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getTo_level3_exportGSSExportExportCrossReference_10_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getTo_level3_exportGSSExportExportCrossReference_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Level3_formatAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__To_level2_exportAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getTo_level2_exportGSSExportExportCrossReference_12_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getTo_level2_exportGSSExportExportCrossReference_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Level2_formatAssignment_13_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__To_level1_exportAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getTo_level1_exportGSSExportExportCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getTo_level1_exportGSSExportExportCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Level1_formatAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getLevel1_formatGSSFormatFormatCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getLevel1_formatGSSFormatFormatCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__To_level0_exportAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getTo_level0_exportGSSExportExportCrossReference_16_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getTo_level0_exportGSSExportExportCrossReference_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__Level0_formatAssignment_17_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getLevel0_formatGSSFormatFormatCrossReference_17_2_0()); }
		(
			{ before(grammarAccess.getGSSTCInputAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputAccess().getLevel0_formatGSSFormatFormatCrossReference_17_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInput__GssFieldsAssignment_18_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputAccess().getGssFieldsGSSTCInputFieldParserRuleCall_18_1_0()); }
		ruleGSSTCInputField
		{ after(grammarAccess.getGSSTCInputAccess().getGssFieldsGSSTCInputFieldParserRuleCall_18_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTCInputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__GssFieldAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSTCInputFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTCInputField__EnumRefAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTCInputFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getGSSTCInputFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTCInputFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getGSSTCInputFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
