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
package es.uah.aut.srg.gss.lang.tmheader.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmheader.ide.contentassist.antlr.internal.InternalTMHEADERParser;
import es.uah.aut.srg.gss.lang.tmheader.services.TMHEADERGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TMHEADERParser extends AbstractContentAssistParser {

	@Inject
	private TMHEADERGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTMHEADERParser createParser() {
		InternalTMHEADERParser result = new InternalTMHEADERParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTMHeaderFieldAccess().getAlternatives_5(), "rule__GSSTMHeaderField__Alternatives_5");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0(), "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0");
					put(grammarAccess.getGSSTMHeaderAccess().getGroup(), "rule__GSSTMHeader__Group__0");
					put(grammarAccess.getGSSTMHeaderAccess().getGroup_8(), "rule__GSSTMHeader__Group_8__0");
					put(grammarAccess.getGSSTMHeaderFieldAccess().getGroup(), "rule__GSSTMHeaderField__Group__0");
					put(grammarAccess.getGSSTMHeaderFieldAccess().getGroup_5_0(), "rule__GSSTMHeaderField__Group_5_0__0");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup(), "rule__TMTCIFFieldValueRaw__Group__0");
					put(grammarAccess.getGSSTMHeaderAccess().getNameAssignment_2(), "rule__GSSTMHeader__NameAssignment_2");
					put(grammarAccess.getGSSTMHeaderAccess().getFormatAssignment_6(), "rule__GSSTMHeader__FormatAssignment_6");
					put(grammarAccess.getGSSTMHeaderAccess().getFieldsAssignment_8_1(), "rule__GSSTMHeader__FieldsAssignment_8_1");
					put(grammarAccess.getGSSTMHeaderFieldAccess().getNameAssignment_2(), "rule__GSSTMHeaderField__NameAssignment_2");
					put(grammarAccess.getGSSTMHeaderFieldAccess().getGssHeaderFieldAssignment_4(), "rule__GSSTMHeaderField__GssHeaderFieldAssignment_4");
					put(grammarAccess.getGSSTMHeaderFieldAccess().getFieldValueAssignment_5_0_1(), "rule__GSSTMHeaderField__FieldValueAssignment_5_0_1");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2(), "rule__TMTCIFFieldValueRaw__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTMHEADERParser typedParser = (InternalTMHEADERParser) parser;
			typedParser.entryRuleGSSTMHeader();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TMHEADERGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TMHEADERGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
