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
package es.uah.aut.srg.gss.lang.tcheaderinput.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcheaderinput.ide.contentassist.antlr.internal.InternalTCHEADERINPUTParser;
import es.uah.aut.srg.gss.lang.tcheaderinput.services.TCHEADERINPUTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TCHEADERINPUTParser extends AbstractContentAssistParser {

	@Inject
	private TCHEADERINPUTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTCHEADERINPUTParser createParser() {
		InternalTCHEADERINPUTParser result = new InternalTCHEADERINPUTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTCHeaderInputFieldAccess().getAlternatives_5(), "rule__GSSTCHeaderInputField__Alternatives_5");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0(), "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0");
					put(grammarAccess.getGSSTCHeaderInputAccess().getGroup(), "rule__GSSTCHeaderInput__Group__0");
					put(grammarAccess.getGSSTCHeaderInputAccess().getGroup_8(), "rule__GSSTCHeaderInput__Group_8__0");
					put(grammarAccess.getGSSTCHeaderInputFieldAccess().getGroup(), "rule__GSSTCHeaderInputField__Group__0");
					put(grammarAccess.getGSSTCHeaderInputFieldAccess().getGroup_5_0(), "rule__GSSTCHeaderInputField__Group_5_0__0");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup(), "rule__TMTCIFFieldValueRaw__Group__0");
					put(grammarAccess.getGSSTCHeaderInputAccess().getNameAssignment_2(), "rule__GSSTCHeaderInput__NameAssignment_2");
					put(grammarAccess.getGSSTCHeaderInputAccess().getFormatAssignment_6(), "rule__GSSTCHeaderInput__FormatAssignment_6");
					put(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsAssignment_8_1(), "rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1");
					put(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameAssignment_2(), "rule__GSSTCHeaderInputField__NameAssignment_2");
					put(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldAssignment_4(), "rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4");
					put(grammarAccess.getGSSTCHeaderInputFieldAccess().getFieldValueAssignment_5_0_1(), "rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2(), "rule__TMTCIFFieldValueRaw__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTCHEADERINPUTParser typedParser = (InternalTCHEADERINPUTParser) parser;
			typedParser.entryRuleGSSTCHeaderInput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TCHEADERINPUTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCHEADERINPUTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
