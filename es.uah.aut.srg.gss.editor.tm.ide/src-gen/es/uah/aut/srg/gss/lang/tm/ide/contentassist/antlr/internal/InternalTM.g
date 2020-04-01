/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
grammar InternalTM;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.gss.lang.tm.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.gss.lang.tm.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tm.services.TMGrammarAccess;

}
@parser::members {
	private TMGrammarAccess grammarAccess;

	public void setGrammarAccess(TMGrammarAccess grammarAccess) {
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

// Entry rule entryRuleGSSTM
entryRuleGSSTM
:
{ before(grammarAccess.getGSSTMRule()); }
	 ruleGSSTM
{ after(grammarAccess.getGSSTMRule()); } 
	 EOF 
;

// Rule GSSTM
ruleGSSTM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMAccess().getGroup()); }
		(rule__GSSTM__Group__0)
		{ after(grammarAccess.getGSSTMAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTMPi1
entryRuleGSSTMPi1
:
{ before(grammarAccess.getGSSTMPi1Rule()); }
	 ruleGSSTMPi1
{ after(grammarAccess.getGSSTMPi1Rule()); } 
	 EOF 
;

// Rule GSSTMPi1
ruleGSSTMPi1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMPi1Access().getGroup()); }
		(rule__GSSTMPi1__Group__0)
		{ after(grammarAccess.getGSSTMPi1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGSSTMField
entryRuleGSSTMField
:
{ before(grammarAccess.getGSSTMFieldRule()); }
	 ruleGSSTMField
{ after(grammarAccess.getGSSTMFieldRule()); } 
	 EOF 
;

// Rule GSSTMField
ruleGSSTMField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGSSTMFieldAccess().getGroup()); }
		(rule__GSSTMField__Group__0)
		{ after(grammarAccess.getGSSTMFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__0__Impl
	rule__GSSTM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGSSTMKeyword_0()); }
	'<GSSTM'
	{ after(grammarAccess.getGSSTMAccess().getGSSTMKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__1__Impl
	rule__GSSTM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__2__Impl
	rule__GSSTM__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getNameAssignment_2()); }
	(rule__GSSTM__NameAssignment_2)
	{ after(grammarAccess.getGSSTMAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__3__Impl
	rule__GSSTM__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getTypeKeyword_3()); }
	'type='
	{ after(grammarAccess.getGSSTMAccess().getTypeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__4__Impl
	rule__GSSTM__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getTypeAssignment_4()); }
	(rule__GSSTM__TypeAssignment_4)
	{ after(grammarAccess.getGSSTMAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__5__Impl
	rule__GSSTM__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSubtypeKeyword_5()); }
	'subtype='
	{ after(grammarAccess.getGSSTMAccess().getSubtypeKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__6__Impl
	rule__GSSTM__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSubtypeAssignment_6()); }
	(rule__GSSTM__SubtypeAssignment_6)
	{ after(grammarAccess.getGSSTMAccess().getSubtypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__7__Impl
	rule__GSSTM__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevelsKeyword_7()); }
	'levels='
	{ after(grammarAccess.getGSSTMAccess().getLevelsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__8__Impl
	rule__GSSTM__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevelsAssignment_8()); }
	(rule__GSSTM__LevelsAssignment_8)
	{ after(grammarAccess.getGSSTMAccess().getLevelsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__9__Impl
	rule__GSSTM__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGreaterThanSignKeyword_9()); }
	'>'
	{ after(grammarAccess.getGSSTMAccess().getGreaterThanSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__10__Impl
	rule__GSSTM__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_10()); }
	(rule__GSSTM__Group_10__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__11__Impl
	rule__GSSTM__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_11()); }
	(rule__GSSTM__Group_11__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__12__Impl
	rule__GSSTM__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_12()); }
	(rule__GSSTM__Group_12__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__13__Impl
	rule__GSSTM__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_13()); }
	(rule__GSSTM__Group_13__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__14__Impl
	rule__GSSTM__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_14()); }
	(rule__GSSTM__Group_14__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__15__Impl
	rule__GSSTM__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_15()); }
	(rule__GSSTM__Group_15__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__16__Impl
	rule__GSSTM__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_16()); }
	(rule__GSSTM__Group_16__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__17__Impl
	rule__GSSTM__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_17()); }
	(rule__GSSTM__Group_17__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__18__Impl
	rule__GSSTM__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_18()); }
	(rule__GSSTM__Group_18__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__19__Impl
	rule__GSSTM__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_19()); }
	(rule__GSSTM__Group_19__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__20__Impl
	rule__GSSTM__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_20()); }
	(rule__GSSTM__Group_20__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__21__Impl
	rule__GSSTM__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGssPi1Assignment_21()); }
	(rule__GSSTM__GssPi1Assignment_21)?
	{ after(grammarAccess.getGSSTMAccess().getGssPi1Assignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__22__Impl
	rule__GSSTM__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGroup_22()); }
	(rule__GSSTM__Group_22__0)?
	{ after(grammarAccess.getGSSTMAccess().getGroup_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getGSSTMKeyword_23()); }
	'</GSSTM>'
	{ after(grammarAccess.getGSSTMAccess().getGSSTMKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_10__0__Impl
	rule__GSSTM__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel3_formatKeyword_10_0()); }
	'<level3_format'
	{ after(grammarAccess.getGSSTMAccess().getLevel3_formatKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_10__1__Impl
	rule__GSSTM__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_10_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_10__2__Impl
	rule__GSSTM__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel3_formatAssignment_10_2()); }
	(rule__GSSTM__Level3_formatAssignment_10_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel3_formatAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_10_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_11__0__Impl
	rule__GSSTM__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel3_filterKeyword_11_0()); }
	'<level3_filter'
	{ after(grammarAccess.getGSSTMAccess().getLevel3_filterKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_11__1__Impl
	rule__GSSTM__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_11_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_11__2__Impl
	rule__GSSTM__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel3_filterAssignment_11_2()); }
	(rule__GSSTM__Level3_filterAssignment_11_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel3_filterAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_11_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_12__0__Impl
	rule__GSSTM__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFrom_level2_importKeyword_12_0()); }
	'<from_level2_import'
	{ after(grammarAccess.getGSSTMAccess().getFrom_level2_importKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_12__1__Impl
	rule__GSSTM__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_12_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_12__2__Impl
	rule__GSSTM__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFrom_level2_importAssignment_12_2()); }
	(rule__GSSTM__From_level2_importAssignment_12_2)
	{ after(grammarAccess.getGSSTMAccess().getFrom_level2_importAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_12_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_13__0__Impl
	rule__GSSTM__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel2_formatKeyword_13_0()); }
	'<level2_format'
	{ after(grammarAccess.getGSSTMAccess().getLevel2_formatKeyword_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_13__1__Impl
	rule__GSSTM__Group_13__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_13_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_13__2__Impl
	rule__GSSTM__Group_13__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel2_formatAssignment_13_2()); }
	(rule__GSSTM__Level2_formatAssignment_13_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel2_formatAssignment_13_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_13__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_13__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_13_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_13_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_14__0__Impl
	rule__GSSTM__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel2_filterKeyword_14_0()); }
	'<level2_filter'
	{ after(grammarAccess.getGSSTMAccess().getLevel2_filterKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_14__1__Impl
	rule__GSSTM__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_14_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_14__2__Impl
	rule__GSSTM__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel2_filterAssignment_14_2()); }
	(rule__GSSTM__Level2_filterAssignment_14_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel2_filterAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_14_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_15__0__Impl
	rule__GSSTM__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFrom_level1_importKeyword_15_0()); }
	'<from_level1_import'
	{ after(grammarAccess.getGSSTMAccess().getFrom_level1_importKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_15__1__Impl
	rule__GSSTM__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_15_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_15__2__Impl
	rule__GSSTM__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFrom_level1_importAssignment_15_2()); }
	(rule__GSSTM__From_level1_importAssignment_15_2)
	{ after(grammarAccess.getGSSTMAccess().getFrom_level1_importAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_15_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_16__0__Impl
	rule__GSSTM__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel1_formatKeyword_16_0()); }
	'<level1_format'
	{ after(grammarAccess.getGSSTMAccess().getLevel1_formatKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_16__1__Impl
	rule__GSSTM__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_16_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_16__2__Impl
	rule__GSSTM__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel1_formatAssignment_16_2()); }
	(rule__GSSTM__Level1_formatAssignment_16_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel1_formatAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_16_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_17__0__Impl
	rule__GSSTM__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel1_filterKeyword_17_0()); }
	'<level1_filter'
	{ after(grammarAccess.getGSSTMAccess().getLevel1_filterKeyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_17__1__Impl
	rule__GSSTM__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_17_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_17__2__Impl
	rule__GSSTM__Group_17__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel1_filterAssignment_17_2()); }
	(rule__GSSTM__Level1_filterAssignment_17_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel1_filterAssignment_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_17__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_17__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_17_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_17_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_18__0__Impl
	rule__GSSTM__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFrom_level0_importKeyword_18_0()); }
	'<from_level0_import'
	{ after(grammarAccess.getGSSTMAccess().getFrom_level0_importKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_18__1__Impl
	rule__GSSTM__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_18_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_18__2__Impl
	rule__GSSTM__Group_18__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFrom_level0_importAssignment_18_2()); }
	(rule__GSSTM__From_level0_importAssignment_18_2)
	{ after(grammarAccess.getGSSTMAccess().getFrom_level0_importAssignment_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_18__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_18__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_18_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_18_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_19__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_19__0__Impl
	rule__GSSTM__Group_19__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel0_formatKeyword_19_0()); }
	'<level0_format'
	{ after(grammarAccess.getGSSTMAccess().getLevel0_formatKeyword_19_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_19__1__Impl
	rule__GSSTM__Group_19__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_19_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_19_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_19__2__Impl
	rule__GSSTM__Group_19__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel0_formatAssignment_19_2()); }
	(rule__GSSTM__Level0_formatAssignment_19_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel0_formatAssignment_19_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_19__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_19__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_19_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_19_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_20__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_20__0__Impl
	rule__GSSTM__Group_20__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel0_filterKeyword_20_0()); }
	'<level0_filter'
	{ after(grammarAccess.getGSSTMAccess().getLevel0_filterKeyword_20_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_20__1__Impl
	rule__GSSTM__Group_20__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFileKeyword_20_1()); }
	'file='
	{ after(grammarAccess.getGSSTMAccess().getFileKeyword_20_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_20__2__Impl
	rule__GSSTM__Group_20__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getLevel0_filterAssignment_20_2()); }
	(rule__GSSTM__Level0_filterAssignment_20_2)
	{ after(grammarAccess.getGSSTMAccess().getLevel0_filterAssignment_20_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_20__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_20__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_20_3()); }
	'/>'
	{ after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_20_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__Group_22__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_22__0__Impl
	rule__GSSTM__Group_22__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_22__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_0()); }
	'<fields>'
	{ after(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_22__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_22__1__Impl
	rule__GSSTM__Group_22__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_22__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); }
		(rule__GSSTM__GssFieldsAssignment_22_1)
		{ after(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); }
	)
	(
		{ before(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); }
		(rule__GSSTM__GssFieldsAssignment_22_1)*
		{ after(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_22__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTM__Group_22__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Group_22__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_2()); }
	'</fields>'
	{ after(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMPi1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__0__Impl
	rule__GSSTMPi1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getPI1Keyword_0()); }
	'<PI1'
	{ after(grammarAccess.getGSSTMPi1Access().getPI1Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__1__Impl
	rule__GSSTMPi1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMPi1Access().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__2__Impl
	rule__GSSTMPi1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getNameAssignment_2()); }
	(rule__GSSTMPi1__NameAssignment_2)
	{ after(grammarAccess.getGSSTMPi1Access().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__3__Impl
	rule__GSSTMPi1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getValKeyword_3()); }
	'val='
	{ after(grammarAccess.getGSSTMPi1Access().getValKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__4__Impl
	rule__GSSTMPi1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getValAssignment_4()); }
	(rule__GSSTMPi1__ValAssignment_4)
	{ after(grammarAccess.getGSSTMPi1Access().getValAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__5__Impl
	rule__GSSTMPi1__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getGssFieldKeyword_5()); }
	'gssField='
	{ after(grammarAccess.getGSSTMPi1Access().getGssFieldKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__6__Impl
	rule__GSSTMPi1__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getGssFieldAssignment_6()); }
	(rule__GSSTMPi1__GssFieldAssignment_6)
	{ after(grammarAccess.getGSSTMPi1Access().getGssFieldAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMPi1__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMPi1Access().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getGSSTMPi1Access().getSolidusGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__0__Impl
	rule__GSSTMField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getFieldKeyword_0()); }
	'<Field'
	{ after(grammarAccess.getGSSTMFieldAccess().getFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__1__Impl
	rule__GSSTMField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getGSSTMFieldAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__2__Impl
	rule__GSSTMField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getNameAssignment_2()); }
	(rule__GSSTMField__NameAssignment_2)
	{ after(grammarAccess.getGSSTMFieldAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__3__Impl
	rule__GSSTMField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getGssFieldKeyword_3()); }
	'gssField='
	{ after(grammarAccess.getGSSTMFieldAccess().getGssFieldKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__4__Impl
	rule__GSSTMField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getGssFieldAssignment_4()); }
	(rule__GSSTMField__GssFieldAssignment_4)
	{ after(grammarAccess.getGSSTMFieldAccess().getGssFieldAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__5__Impl
	rule__GSSTMField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getGroup_5()); }
	(rule__GSSTMField__Group_5__0)?
	{ after(grammarAccess.getGSSTMFieldAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getSolidusGreaterThanSignKeyword_6()); }
	'/>'
	{ after(grammarAccess.getGSSTMFieldAccess().getSolidusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTMField__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group_5__0__Impl
	rule__GSSTMField__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getEnumRefKeyword_5_0()); }
	'enumRef='
	{ after(grammarAccess.getGSSTMFieldAccess().getEnumRefKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GSSTMField__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGSSTMFieldAccess().getEnumRefAssignment_5_1()); }
	(rule__GSSTMField__EnumRefAssignment_5_1)
	{ after(grammarAccess.getGSSTMFieldAccess().getEnumRefAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GSSTM__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__SubtypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__LevelsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level3_formatAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_10_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_10_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level3_filterAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_11_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_11_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__From_level2_importAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_12_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_12_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level2_formatAssignment_13_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level2_filterAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_14_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__From_level1_importAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_15_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_15_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level1_formatAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_16_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_16_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level1_filterAssignment_17_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_17_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_17_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__From_level0_importAssignment_18_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_18_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_18_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level0_formatAssignment_19_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_19_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_19_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__Level0_filterAssignment_20_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0()); }
		(
			{ before(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_20_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_20_2_0_1()); }
		)
		{ after(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__GssPi1Assignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getGssPi1GSSTMPi1ParserRuleCall_21_0()); }
		ruleGSSTMPi1
		{ after(grammarAccess.getGSSTMAccess().getGssPi1GSSTMPi1ParserRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTM__GssFieldsAssignment_22_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMAccess().getGssFieldsGSSTMFieldParserRuleCall_22_1_0()); }
		ruleGSSTMField
		{ after(grammarAccess.getGSSTMAccess().getGssFieldsGSSTMFieldParserRuleCall_22_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMPi1Access().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMPi1Access().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__ValAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMPi1Access().getValUINT_STRINGTerminalRuleCall_4_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getGSSTMPi1Access().getValUINT_STRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMPi1__GssFieldAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0()); }
		(
			{ before(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_6_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getGSSTMFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__GssFieldAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GSSTMField__EnumRefAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); }
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
