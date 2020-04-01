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
package es.uah.aut.srg.gss.lang.tm.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tm.ide.contentassist.antlr.internal.InternalTMParser;
import es.uah.aut.srg.gss.lang.tm.services.TMGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TMParser extends AbstractContentAssistParser {

	@Inject
	private TMGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTMParser createParser() {
		InternalTMParser result = new InternalTMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTMAccess().getGroup(), "rule__GSSTM__Group__0");
					put(grammarAccess.getGSSTMAccess().getGroup_10(), "rule__GSSTM__Group_10__0");
					put(grammarAccess.getGSSTMAccess().getGroup_11(), "rule__GSSTM__Group_11__0");
					put(grammarAccess.getGSSTMAccess().getGroup_12(), "rule__GSSTM__Group_12__0");
					put(grammarAccess.getGSSTMAccess().getGroup_13(), "rule__GSSTM__Group_13__0");
					put(grammarAccess.getGSSTMAccess().getGroup_14(), "rule__GSSTM__Group_14__0");
					put(grammarAccess.getGSSTMAccess().getGroup_15(), "rule__GSSTM__Group_15__0");
					put(grammarAccess.getGSSTMAccess().getGroup_16(), "rule__GSSTM__Group_16__0");
					put(grammarAccess.getGSSTMAccess().getGroup_17(), "rule__GSSTM__Group_17__0");
					put(grammarAccess.getGSSTMAccess().getGroup_18(), "rule__GSSTM__Group_18__0");
					put(grammarAccess.getGSSTMAccess().getGroup_19(), "rule__GSSTM__Group_19__0");
					put(grammarAccess.getGSSTMAccess().getGroup_20(), "rule__GSSTM__Group_20__0");
					put(grammarAccess.getGSSTMAccess().getGroup_22(), "rule__GSSTM__Group_22__0");
					put(grammarAccess.getGSSTMPi1Access().getGroup(), "rule__GSSTMPi1__Group__0");
					put(grammarAccess.getGSSTMFieldAccess().getGroup(), "rule__GSSTMField__Group__0");
					put(grammarAccess.getGSSTMFieldAccess().getGroup_5(), "rule__GSSTMField__Group_5__0");
					put(grammarAccess.getGSSTMAccess().getNameAssignment_2(), "rule__GSSTM__NameAssignment_2");
					put(grammarAccess.getGSSTMAccess().getTypeAssignment_4(), "rule__GSSTM__TypeAssignment_4");
					put(grammarAccess.getGSSTMAccess().getSubtypeAssignment_6(), "rule__GSSTM__SubtypeAssignment_6");
					put(grammarAccess.getGSSTMAccess().getLevelsAssignment_8(), "rule__GSSTM__LevelsAssignment_8");
					put(grammarAccess.getGSSTMAccess().getLevel3_formatAssignment_10_2(), "rule__GSSTM__Level3_formatAssignment_10_2");
					put(grammarAccess.getGSSTMAccess().getLevel3_filterAssignment_11_2(), "rule__GSSTM__Level3_filterAssignment_11_2");
					put(grammarAccess.getGSSTMAccess().getFrom_level2_importAssignment_12_2(), "rule__GSSTM__From_level2_importAssignment_12_2");
					put(grammarAccess.getGSSTMAccess().getLevel2_formatAssignment_13_2(), "rule__GSSTM__Level2_formatAssignment_13_2");
					put(grammarAccess.getGSSTMAccess().getLevel2_filterAssignment_14_2(), "rule__GSSTM__Level2_filterAssignment_14_2");
					put(grammarAccess.getGSSTMAccess().getFrom_level1_importAssignment_15_2(), "rule__GSSTM__From_level1_importAssignment_15_2");
					put(grammarAccess.getGSSTMAccess().getLevel1_formatAssignment_16_2(), "rule__GSSTM__Level1_formatAssignment_16_2");
					put(grammarAccess.getGSSTMAccess().getLevel1_filterAssignment_17_2(), "rule__GSSTM__Level1_filterAssignment_17_2");
					put(grammarAccess.getGSSTMAccess().getFrom_level0_importAssignment_18_2(), "rule__GSSTM__From_level0_importAssignment_18_2");
					put(grammarAccess.getGSSTMAccess().getLevel0_formatAssignment_19_2(), "rule__GSSTM__Level0_formatAssignment_19_2");
					put(grammarAccess.getGSSTMAccess().getLevel0_filterAssignment_20_2(), "rule__GSSTM__Level0_filterAssignment_20_2");
					put(grammarAccess.getGSSTMAccess().getGssPi1Assignment_21(), "rule__GSSTM__GssPi1Assignment_21");
					put(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1(), "rule__GSSTM__GssFieldsAssignment_22_1");
					put(grammarAccess.getGSSTMPi1Access().getNameAssignment_2(), "rule__GSSTMPi1__NameAssignment_2");
					put(grammarAccess.getGSSTMPi1Access().getValAssignment_4(), "rule__GSSTMPi1__ValAssignment_4");
					put(grammarAccess.getGSSTMPi1Access().getGssFieldAssignment_6(), "rule__GSSTMPi1__GssFieldAssignment_6");
					put(grammarAccess.getGSSTMFieldAccess().getNameAssignment_2(), "rule__GSSTMField__NameAssignment_2");
					put(grammarAccess.getGSSTMFieldAccess().getGssFieldAssignment_4(), "rule__GSSTMField__GssFieldAssignment_4");
					put(grammarAccess.getGSSTMFieldAccess().getEnumRefAssignment_5_1(), "rule__GSSTMField__EnumRefAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTMParser typedParser = (InternalTMParser) parser;
			typedParser.entryRuleGSSTM();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
