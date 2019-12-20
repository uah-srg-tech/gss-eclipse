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
grammar InternalTMOUTPUT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tmoutput.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tmoutput.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tmoutput.services.TMOUTPUTGrammarAccess;

}
@parser::members {
	private TMOUTPUTGrammarAccess grammarAccess;

	public void setGrammarAccess(TMOUTPUTGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSTMOutput
entryRuleGSSTMOutput
:
{ before(grammarAccess.getGSSTMOutputRule()); }
	 ruleGSSTMOutput
{ after(grammarAccess.getGSSTMOutputRule()); } 
	 EOF 
;

// Rule GSSTMOutput
ruleGSSTMOutput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getGroup()); }
		(rule__GSSTMOutput__Group__0)
		{ after(grammarAccess.getGSSTMOutputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTMOutputField
entryRuleGSSTMOutputField
:
{ before(grammarAccess.getGSSTMOutputFieldRule()); }
	 ruleGSSTMOutputField
{ after(grammarAccess.getGSSTMOutputFieldRule()); } 
	 EOF 
;

// Rule GSSTMOutputField
ruleGSSTMOutputField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMOutputFieldAccess().getGroup()); }
		(rule__GSSTMOutputField__Group__0)
		{ after(grammarAccess.getGSSTMOutputFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__0__Impl
	rule__GSSTMOutput__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_0()); }
	'<GSSTMOutput'
	{ after(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__1__Impl
	rule__GSSTMOutput__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMOutputAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__2__Impl
	rule__GSSTMOutput__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getNameAssignment_2()); }
	(rule__GSSTMOutput__NameAssignment_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__3__Impl
	rule__GSSTMOutput__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getTypeKeyword_3()); }
	'type='
	{ after(grammarAccess.getGSSTMOutputAccess().getTypeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__4__Impl
	rule__GSSTMOutput__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getTypeAssignment_4()); }
	(rule__GSSTMOutput__TypeAssignment_4)
	{ after(grammarAccess.getGSSTMOutputAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__5__Impl
	rule__GSSTMOutput__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSubtypeKeyword_5()); }
	'subtype='
	{ after(grammarAccess.getGSSTMOutputAccess().getSubtypeKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__6__Impl
	rule__GSSTMOutput__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSubtypeAssignment_6()); }
	(rule__GSSTMOutput__SubtypeAssignment_6)
	{ after(grammarAccess.getGSSTMOutputAccess().getSubtypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__7__Impl
	rule__GSSTMOutput__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_7()); }
	(rule__GSSTMOutput__Group_7__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__8__Impl
	rule__GSSTMOutput__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_8()); }
	'levels='
	{ after(grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__9__Impl
	rule__GSSTMOutput__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevelsAssignment_9()); }
	(rule__GSSTMOutput__LevelsAssignment_9)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevelsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__10__Impl
	rule__GSSTMOutput__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_10()); }
	'>'
	{ after(grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__11__Impl
	rule__GSSTMOutput__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_11()); }
	(rule__GSSTMOutput__Group_11__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__12__Impl
	rule__GSSTMOutput__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_12()); }
	(rule__GSSTMOutput__Group_12__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__13__Impl
	rule__GSSTMOutput__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_13()); }
	(rule__GSSTMOutput__Group_13__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__14__Impl
	rule__GSSTMOutput__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_14()); }
	(rule__GSSTMOutput__Group_14__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__15__Impl
	rule__GSSTMOutput__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_15()); }
	(rule__GSSTMOutput__Group_15__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__16__Impl
	rule__GSSTMOutput__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_16()); }
	(rule__GSSTMOutput__Group_16__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__17__Impl
	rule__GSSTMOutput__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_17()); }
	(rule__GSSTMOutput__Group_17__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__18__Impl
	rule__GSSTMOutput__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_18()); }
	(rule__GSSTMOutput__Group_18__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__19__Impl
	rule__GSSTMOutput__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_19()); }
	(rule__GSSTMOutput__Group_19__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__20__Impl
	rule__GSSTMOutput__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_20()); }
	(rule__GSSTMOutput__Group_20__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__21__Impl
	rule__GSSTMOutput__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_21()); }
	(rule__GSSTMOutput__Group_21__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__22__Impl
	rule__GSSTMOutput__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGroup_22()); }
	(rule__GSSTMOutput__Group_22__0)?
	{ after(grammarAccess.getGSSTMOutputAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23()); }
	'</GSSTMOutput>'
	{ after(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_7__0__Impl
	rule__GSSTMOutput__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getPi1_valKeyword_7_0()); }
	'pi1_val='
	{ after(grammarAccess.getGSSTMOutputAccess().getPi1_valKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getPi1_valAssignment_7_1()); }
	(rule__GSSTMOutput__Pi1_valAssignment_7_1)
	{ after(grammarAccess.getGSSTMOutputAccess().getPi1_valAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_11__0__Impl
	rule__GSSTMOutput__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_11_0()); }
	'<level3_format'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_11__1__Impl
	rule__GSSTMOutput__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_11__2__Impl
	rule__GSSTMOutput__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatAssignment_11_2()); }
	(rule__GSSTMOutput__Level3_formatAssignment_11_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_12__0__Impl
	rule__GSSTMOutput__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_12_0()); }
	'<level3_filter'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_12__1__Impl
	rule__GSSTMOutput__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_12__2__Impl
	rule__GSSTMOutput__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterAssignment_12_2()); }
	(rule__GSSTMOutput__Level3_filterAssignment_12_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_13__0__Impl
	rule__GSSTMOutput__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_13_0()); }
	'<from_level2_import'
	{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_13__1__Impl
	rule__GSSTMOutput__Group_13__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_13__2__Impl
	rule__GSSTMOutput__Group_13__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importAssignment_13_2()); }
	(rule__GSSTMOutput__From_level2_importAssignment_13_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importAssignment_13_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_13__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_13__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_14__0__Impl
	rule__GSSTMOutput__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_14_0()); }
	'<level2_format'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_14__1__Impl
	rule__GSSTMOutput__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_14__2__Impl
	rule__GSSTMOutput__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatAssignment_14_2()); }
	(rule__GSSTMOutput__Level2_formatAssignment_14_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_15__0__Impl
	rule__GSSTMOutput__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_15_0()); }
	'<level2_filter'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_15__1__Impl
	rule__GSSTMOutput__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_15__2__Impl
	rule__GSSTMOutput__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterAssignment_15_2()); }
	(rule__GSSTMOutput__Level2_filterAssignment_15_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_16__0__Impl
	rule__GSSTMOutput__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_16_0()); }
	'<from_level1_import'
	{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_16__1__Impl
	rule__GSSTMOutput__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_16__2__Impl
	rule__GSSTMOutput__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importAssignment_16_2()); }
	(rule__GSSTMOutput__From_level1_importAssignment_16_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_17__0__Impl
	rule__GSSTMOutput__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_17_0()); }
	'<level1_format'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_17__1__Impl
	rule__GSSTMOutput__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_17__2__Impl
	rule__GSSTMOutput__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatAssignment_17_2()); }
	(rule__GSSTMOutput__Level1_formatAssignment_17_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatAssignment_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_17__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_18__0__Impl
	rule__GSSTMOutput__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_18_0()); }
	'<level1_filter'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_18__1__Impl
	rule__GSSTMOutput__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_18__2__Impl
	rule__GSSTMOutput__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterAssignment_18_2()); }
	(rule__GSSTMOutput__Level1_filterAssignment_18_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_19__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_19__0__Impl
	rule__GSSTMOutput__Group_19__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_19_0()); }
	'<from_level0_import'
	{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_19_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_19__1__Impl
	rule__GSSTMOutput__Group_19__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_19__2__Impl
	rule__GSSTMOutput__Group_19__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importAssignment_19_2()); }
	(rule__GSSTMOutput__From_level0_importAssignment_19_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importAssignment_19_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_19__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_19__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_20__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_20__0__Impl
	rule__GSSTMOutput__Group_20__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_20_0()); }
	'<level0_format'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_20_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_20__1__Impl
	rule__GSSTMOutput__Group_20__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_20__2__Impl
	rule__GSSTMOutput__Group_20__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatAssignment_20_2()); }
	(rule__GSSTMOutput__Level0_formatAssignment_20_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatAssignment_20_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_20__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_20__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_21__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_21__0__Impl
	rule__GSSTMOutput__Group_21__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_21_0()); }
	'<level0_filter'
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_21_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_21__1__Impl
	rule__GSSTMOutput__Group_21__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_21_1()); }
	'file='
	{ after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_21_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_21__2__Impl
	rule__GSSTMOutput__Group_21__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterAssignment_21_2()); }
	(rule__GSSTMOutput__Level0_filterAssignment_21_2)
	{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterAssignment_21_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_21__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_21__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_21_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_21_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_22__0__Impl
	rule__GSSTMOutput__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0()); }
	'<fields>'
	{ after(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_22__1__Impl
	rule__GSSTMOutput__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); }
		(rule__GSSTMOutput__GssFieldsAssignment_22_1)
		{ after(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); }
	)
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); }
		(rule__GSSTMOutput__GssFieldsAssignment_22_1)*
		{ after(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutput__Group_22__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2()); }
	'</fields>'
	{ after(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutputField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutputField__Group__0__Impl
	rule__GSSTMOutputField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0()); }
	'<OutputField'
	{ after(grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutputField__Group__1__Impl
	rule__GSSTMOutputField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutputField__Group__2__Impl
	rule__GSSTMOutputField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputFieldAccess().getNameAssignment_2()); }
	(rule__GSSTMOutputField__NameAssignment_2)
	{ after(grammarAccess.getGSSTMOutputFieldAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutputField__Group__3__Impl
	rule__GSSTMOutputField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldKeyword_3()); }
	'gssField='
	{ after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutputField__Group__4__Impl
	rule__GSSTMOutputField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldAssignment_4()); }
	(rule__GSSTMOutputField__GssFieldAssignment_4)
	{ after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMOutputField__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMOutputFieldAccess().getSolidusGreaterThanSignKeyword_5()); }
	'/>'
	{ after(grammarAccess.getGSSTMOutputFieldAccess().getSolidusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMOutput__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMOutputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__SubtypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMOutputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Pi1_valAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getPi1_valUINT_STRINGTerminalRuleCall_7_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMOutputAccess().getPi1_valUINT_STRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__LevelsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_9_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level3_formatAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level3_filterAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_12_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__From_level2_importAssignment_13_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_13_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_13_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level2_formatAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level2_filterAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__From_level1_importAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_16_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level1_formatAssignment_17_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_17_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_17_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level1_filterAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__From_level0_importAssignment_19_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_19_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_19_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level0_formatAssignment_20_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_20_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_20_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__Level0_filterAssignment_21_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_21_2_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_21_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutput__GssFieldsAssignment_22_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0()); }
		ruleGSSTMOutputField
		{ after(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMOutputField__GssFieldAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); }
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
