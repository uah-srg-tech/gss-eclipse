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
package es.uah.aut.srg.gss.lang.tcheader.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcheader.ide.contentassist.antlr.internal.InternalTCHEADERParser;
import es.uah.aut.srg.gss.lang.tcheader.services.TCHEADERGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TCHEADERParser extends AbstractContentAssistParser {

	@Inject
	private TCHEADERGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTCHEADERParser createParser() {
		InternalTCHEADERParser result = new InternalTCHEADERParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTCHeaderFieldAccess().getAlternatives_5(), "rule__GSSTCHeaderField__Alternatives_5");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0(), "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0");
					put(grammarAccess.getGSSTCHeaderAccess().getGroup(), "rule__GSSTCHeader__Group__0");
					put(grammarAccess.getGSSTCHeaderAccess().getGroup_8(), "rule__GSSTCHeader__Group_8__0");
					put(grammarAccess.getGSSTCHeaderFieldAccess().getGroup(), "rule__GSSTCHeaderField__Group__0");
					put(grammarAccess.getGSSTCHeaderFieldAccess().getGroup_5_0(), "rule__GSSTCHeaderField__Group_5_0__0");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup(), "rule__TMTCIFFieldValueRaw__Group__0");
					put(grammarAccess.getGSSTCHeaderAccess().getNameAssignment_2(), "rule__GSSTCHeader__NameAssignment_2");
					put(grammarAccess.getGSSTCHeaderAccess().getFormatAssignment_6(), "rule__GSSTCHeader__FormatAssignment_6");
					put(grammarAccess.getGSSTCHeaderAccess().getGssHeaderFieldsAssignment_8_1(), "rule__GSSTCHeader__GssHeaderFieldsAssignment_8_1");
					put(grammarAccess.getGSSTCHeaderFieldAccess().getNameAssignment_2(), "rule__GSSTCHeaderField__NameAssignment_2");
					put(grammarAccess.getGSSTCHeaderFieldAccess().getGssHeaderFieldAssignment_4(), "rule__GSSTCHeaderField__GssHeaderFieldAssignment_4");
					put(grammarAccess.getGSSTCHeaderFieldAccess().getFieldValueAssignment_5_0_1(), "rule__GSSTCHeaderField__FieldValueAssignment_5_0_1");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2(), "rule__TMTCIFFieldValueRaw__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTCHEADERParser typedParser = (InternalTCHEADERParser) parser;
			typedParser.entryRuleGSSTCHeader();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TCHEADERGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCHEADERGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
