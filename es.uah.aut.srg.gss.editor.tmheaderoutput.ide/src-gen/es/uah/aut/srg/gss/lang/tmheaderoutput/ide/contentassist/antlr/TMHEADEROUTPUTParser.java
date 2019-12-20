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
package es.uah.aut.srg.gss.lang.tmheaderoutput.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmheaderoutput.ide.contentassist.antlr.internal.InternalTMHEADEROUTPUTParser;
import es.uah.aut.srg.gss.lang.tmheaderoutput.services.TMHEADEROUTPUTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TMHEADEROUTPUTParser extends AbstractContentAssistParser {

	@Inject
	private TMHEADEROUTPUTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTMHEADEROUTPUTParser createParser() {
		InternalTMHEADEROUTPUTParser result = new InternalTMHEADEROUTPUTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTMHeaderOutputFieldAccess().getAlternatives_5(), "rule__GSSTMHeaderOutputField__Alternatives_5");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0(), "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0");
					put(grammarAccess.getGSSTMHeaderOutputAccess().getGroup(), "rule__GSSTMHeaderOutput__Group__0");
					put(grammarAccess.getGSSTMHeaderOutputAccess().getGroup_8(), "rule__GSSTMHeaderOutput__Group_8__0");
					put(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGroup(), "rule__GSSTMHeaderOutputField__Group__0");
					put(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGroup_5_0(), "rule__GSSTMHeaderOutputField__Group_5_0__0");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup(), "rule__TMTCIFFieldValueRaw__Group__0");
					put(grammarAccess.getGSSTMHeaderOutputAccess().getNameAssignment_2(), "rule__GSSTMHeaderOutput__NameAssignment_2");
					put(grammarAccess.getGSSTMHeaderOutputAccess().getFormatAssignment_6(), "rule__GSSTMHeaderOutput__FormatAssignment_6");
					put(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsAssignment_8_1(), "rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1");
					put(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameAssignment_2(), "rule__GSSTMHeaderOutputField__NameAssignment_2");
					put(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldAssignment_4(), "rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4");
					put(grammarAccess.getGSSTMHeaderOutputFieldAccess().getFieldValueAssignment_5_0_1(), "rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2(), "rule__TMTCIFFieldValueRaw__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTMHEADEROUTPUTParser typedParser = (InternalTMHEADEROUTPUTParser) parser;
			typedParser.entryRuleGSSTMHeaderOutput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TMHEADEROUTPUTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TMHEADEROUTPUTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
