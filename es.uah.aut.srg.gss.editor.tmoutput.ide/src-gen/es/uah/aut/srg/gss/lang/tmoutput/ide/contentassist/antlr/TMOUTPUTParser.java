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
package es.uah.aut.srg.gss.lang.tmoutput.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmoutput.ide.contentassist.antlr.internal.InternalTMOUTPUTParser;
import es.uah.aut.srg.gss.lang.tmoutput.services.TMOUTPUTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TMOUTPUTParser extends AbstractContentAssistParser {

	@Inject
	private TMOUTPUTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTMOUTPUTParser createParser() {
		InternalTMOUTPUTParser result = new InternalTMOUTPUTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTMOutputAccess().getGroup(), "rule__GSSTMOutput__Group__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_10(), "rule__GSSTMOutput__Group_10__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_11(), "rule__GSSTMOutput__Group_11__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_12(), "rule__GSSTMOutput__Group_12__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_13(), "rule__GSSTMOutput__Group_13__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_14(), "rule__GSSTMOutput__Group_14__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_15(), "rule__GSSTMOutput__Group_15__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_16(), "rule__GSSTMOutput__Group_16__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_17(), "rule__GSSTMOutput__Group_17__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_18(), "rule__GSSTMOutput__Group_18__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_19(), "rule__GSSTMOutput__Group_19__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_20(), "rule__GSSTMOutput__Group_20__0");
					put(grammarAccess.getGSSTMOutputAccess().getGroup_22(), "rule__GSSTMOutput__Group_22__0");
					put(grammarAccess.getGSSTMOutputPi1Access().getGroup(), "rule__GSSTMOutputPi1__Group__0");
					put(grammarAccess.getGSSTMOutputFieldAccess().getGroup(), "rule__GSSTMOutputField__Group__0");
					put(grammarAccess.getGSSTMOutputFieldAccess().getGroup_5(), "rule__GSSTMOutputField__Group_5__0");
					put(grammarAccess.getGSSTMOutputAccess().getNameAssignment_2(), "rule__GSSTMOutput__NameAssignment_2");
					put(grammarAccess.getGSSTMOutputAccess().getTypeAssignment_4(), "rule__GSSTMOutput__TypeAssignment_4");
					put(grammarAccess.getGSSTMOutputAccess().getSubtypeAssignment_6(), "rule__GSSTMOutput__SubtypeAssignment_6");
					put(grammarAccess.getGSSTMOutputAccess().getLevelsAssignment_8(), "rule__GSSTMOutput__LevelsAssignment_8");
					put(grammarAccess.getGSSTMOutputAccess().getLevel3_formatAssignment_10_2(), "rule__GSSTMOutput__Level3_formatAssignment_10_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel3_filterAssignment_11_2(), "rule__GSSTMOutput__Level3_filterAssignment_11_2");
					put(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importAssignment_12_2(), "rule__GSSTMOutput__From_level2_importAssignment_12_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel2_formatAssignment_13_2(), "rule__GSSTMOutput__Level2_formatAssignment_13_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel2_filterAssignment_14_2(), "rule__GSSTMOutput__Level2_filterAssignment_14_2");
					put(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importAssignment_15_2(), "rule__GSSTMOutput__From_level1_importAssignment_15_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel1_formatAssignment_16_2(), "rule__GSSTMOutput__Level1_formatAssignment_16_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel1_filterAssignment_17_2(), "rule__GSSTMOutput__Level1_filterAssignment_17_2");
					put(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importAssignment_18_2(), "rule__GSSTMOutput__From_level0_importAssignment_18_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel0_formatAssignment_19_2(), "rule__GSSTMOutput__Level0_formatAssignment_19_2");
					put(grammarAccess.getGSSTMOutputAccess().getLevel0_filterAssignment_20_2(), "rule__GSSTMOutput__Level0_filterAssignment_20_2");
					put(grammarAccess.getGSSTMOutputAccess().getGssPi1Assignment_21(), "rule__GSSTMOutput__GssPi1Assignment_21");
					put(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1(), "rule__GSSTMOutput__GssFieldsAssignment_22_1");
					put(grammarAccess.getGSSTMOutputPi1Access().getNameAssignment_2(), "rule__GSSTMOutputPi1__NameAssignment_2");
					put(grammarAccess.getGSSTMOutputPi1Access().getValAssignment_4(), "rule__GSSTMOutputPi1__ValAssignment_4");
					put(grammarAccess.getGSSTMOutputPi1Access().getGssFieldAssignment_6(), "rule__GSSTMOutputPi1__GssFieldAssignment_6");
					put(grammarAccess.getGSSTMOutputFieldAccess().getNameAssignment_2(), "rule__GSSTMOutputField__NameAssignment_2");
					put(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldAssignment_4(), "rule__GSSTMOutputField__GssFieldAssignment_4");
					put(grammarAccess.getGSSTMOutputFieldAccess().getEnumRefAssignment_5_1(), "rule__GSSTMOutputField__EnumRefAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTMOUTPUTParser typedParser = (InternalTMOUTPUTParser) parser;
			typedParser.entryRuleGSSTMOutput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TMOUTPUTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TMOUTPUTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
