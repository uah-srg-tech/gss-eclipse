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
package es.uah.aut.srg.gss.lang.tcinput.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcinput.ide.contentassist.antlr.internal.InternalTCINPUTParser;
import es.uah.aut.srg.gss.lang.tcinput.services.TCINPUTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TCINPUTParser extends AbstractContentAssistParser {

	@Inject
	private TCINPUTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTCINPUTParser createParser() {
		InternalTCINPUTParser result = new InternalTCINPUTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTCInputAccess().getGroup(), "rule__GSSTCInput__Group__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_10(), "rule__GSSTCInput__Group_10__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_11(), "rule__GSSTCInput__Group_11__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_12(), "rule__GSSTCInput__Group_12__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_13(), "rule__GSSTCInput__Group_13__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_14(), "rule__GSSTCInput__Group_14__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_15(), "rule__GSSTCInput__Group_15__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_16(), "rule__GSSTCInput__Group_16__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_17(), "rule__GSSTCInput__Group_17__0");
					put(grammarAccess.getGSSTCInputAccess().getGroup_18(), "rule__GSSTCInput__Group_18__0");
					put(grammarAccess.getGSSTCInputFieldAccess().getGroup(), "rule__GSSTCInputField__Group__0");
					put(grammarAccess.getGSSTCInputFieldAccess().getGroup_5(), "rule__GSSTCInputField__Group_5__0");
					put(grammarAccess.getGSSTCInputAccess().getNameAssignment_2(), "rule__GSSTCInput__NameAssignment_2");
					put(grammarAccess.getGSSTCInputAccess().getTypeAssignment_4(), "rule__GSSTCInput__TypeAssignment_4");
					put(grammarAccess.getGSSTCInputAccess().getSubtypeAssignment_6(), "rule__GSSTCInput__SubtypeAssignment_6");
					put(grammarAccess.getGSSTCInputAccess().getLevelsAssignment_8(), "rule__GSSTCInput__LevelsAssignment_8");
					put(grammarAccess.getGSSTCInputAccess().getTo_level3_exportAssignment_10_2(), "rule__GSSTCInput__To_level3_exportAssignment_10_2");
					put(grammarAccess.getGSSTCInputAccess().getLevel3_formatAssignment_11_2(), "rule__GSSTCInput__Level3_formatAssignment_11_2");
					put(grammarAccess.getGSSTCInputAccess().getTo_level2_exportAssignment_12_2(), "rule__GSSTCInput__To_level2_exportAssignment_12_2");
					put(grammarAccess.getGSSTCInputAccess().getLevel2_formatAssignment_13_2(), "rule__GSSTCInput__Level2_formatAssignment_13_2");
					put(grammarAccess.getGSSTCInputAccess().getTo_level1_exportAssignment_14_2(), "rule__GSSTCInput__To_level1_exportAssignment_14_2");
					put(grammarAccess.getGSSTCInputAccess().getLevel1_formatAssignment_15_2(), "rule__GSSTCInput__Level1_formatAssignment_15_2");
					put(grammarAccess.getGSSTCInputAccess().getTo_level0_exportAssignment_16_2(), "rule__GSSTCInput__To_level0_exportAssignment_16_2");
					put(grammarAccess.getGSSTCInputAccess().getLevel0_formatAssignment_17_2(), "rule__GSSTCInput__Level0_formatAssignment_17_2");
					put(grammarAccess.getGSSTCInputAccess().getGssFieldsAssignment_18_1(), "rule__GSSTCInput__GssFieldsAssignment_18_1");
					put(grammarAccess.getGSSTCInputFieldAccess().getNameAssignment_2(), "rule__GSSTCInputField__NameAssignment_2");
					put(grammarAccess.getGSSTCInputFieldAccess().getGssFieldAssignment_4(), "rule__GSSTCInputField__GssFieldAssignment_4");
					put(grammarAccess.getGSSTCInputFieldAccess().getEnumRefAssignment_5_1(), "rule__GSSTCInputField__EnumRefAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTCINPUTParser typedParser = (InternalTCINPUTParser) parser;
			typedParser.entryRuleGSSTCInput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TCINPUTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCINPUTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
