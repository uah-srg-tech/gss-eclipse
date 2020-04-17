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
package es.uah.aut.srg.gss.lang.tc.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tc.ide.contentassist.antlr.internal.InternalTCParser;
import es.uah.aut.srg.gss.lang.tc.services.TCGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TCParser extends AbstractContentAssistParser {

	@Inject
	private TCGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTCParser createParser() {
		InternalTCParser result = new InternalTCParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTCAccess().getGroup(), "rule__GSSTC__Group__0");
					put(grammarAccess.getGSSTCAccess().getGroup_10(), "rule__GSSTC__Group_10__0");
					put(grammarAccess.getGSSTCAccess().getGroup_11(), "rule__GSSTC__Group_11__0");
					put(grammarAccess.getGSSTCAccess().getGroup_12(), "rule__GSSTC__Group_12__0");
					put(grammarAccess.getGSSTCAccess().getGroup_13(), "rule__GSSTC__Group_13__0");
					put(grammarAccess.getGSSTCAccess().getGroup_14(), "rule__GSSTC__Group_14__0");
					put(grammarAccess.getGSSTCAccess().getGroup_15(), "rule__GSSTC__Group_15__0");
					put(grammarAccess.getGSSTCAccess().getGroup_16(), "rule__GSSTC__Group_16__0");
					put(grammarAccess.getGSSTCAccess().getGroup_17(), "rule__GSSTC__Group_17__0");
					put(grammarAccess.getGSSTCAccess().getGroup_18(), "rule__GSSTC__Group_18__0");
					put(grammarAccess.getGSSTCFieldAccess().getGroup(), "rule__GSSTCField__Group__0");
					put(grammarAccess.getGSSTCFieldAccess().getGroup_5(), "rule__GSSTCField__Group_5__0");
					put(grammarAccess.getGSSTCAccess().getNameAssignment_2(), "rule__GSSTC__NameAssignment_2");
					put(grammarAccess.getGSSTCAccess().getTypeAssignment_4(), "rule__GSSTC__TypeAssignment_4");
					put(grammarAccess.getGSSTCAccess().getSubtypeAssignment_6(), "rule__GSSTC__SubtypeAssignment_6");
					put(grammarAccess.getGSSTCAccess().getLevelsAssignment_8(), "rule__GSSTC__LevelsAssignment_8");
					put(grammarAccess.getGSSTCAccess().getTo_level3_exportAssignment_10_2(), "rule__GSSTC__To_level3_exportAssignment_10_2");
					put(grammarAccess.getGSSTCAccess().getLevel3_formatAssignment_11_2(), "rule__GSSTC__Level3_formatAssignment_11_2");
					put(grammarAccess.getGSSTCAccess().getTo_level2_exportAssignment_12_2(), "rule__GSSTC__To_level2_exportAssignment_12_2");
					put(grammarAccess.getGSSTCAccess().getLevel2_formatAssignment_13_2(), "rule__GSSTC__Level2_formatAssignment_13_2");
					put(grammarAccess.getGSSTCAccess().getTo_level1_exportAssignment_14_2(), "rule__GSSTC__To_level1_exportAssignment_14_2");
					put(grammarAccess.getGSSTCAccess().getLevel1_formatAssignment_15_2(), "rule__GSSTC__Level1_formatAssignment_15_2");
					put(grammarAccess.getGSSTCAccess().getTo_level0_exportAssignment_16_2(), "rule__GSSTC__To_level0_exportAssignment_16_2");
					put(grammarAccess.getGSSTCAccess().getLevel0_formatAssignment_17_2(), "rule__GSSTC__Level0_formatAssignment_17_2");
					put(grammarAccess.getGSSTCAccess().getFieldsAssignment_18_1(), "rule__GSSTC__FieldsAssignment_18_1");
					put(grammarAccess.getGSSTCFieldAccess().getNameAssignment_2(), "rule__GSSTCField__NameAssignment_2");
					put(grammarAccess.getGSSTCFieldAccess().getGssFieldAssignment_4(), "rule__GSSTCField__GssFieldAssignment_4");
					put(grammarAccess.getGSSTCFieldAccess().getEnumRefAssignment_5_1(), "rule__GSSTCField__EnumRefAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTCParser typedParser = (InternalTCParser) parser;
			typedParser.entryRuleGSSTC();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
