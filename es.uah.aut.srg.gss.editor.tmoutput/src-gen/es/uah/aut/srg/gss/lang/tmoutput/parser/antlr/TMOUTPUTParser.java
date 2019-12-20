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
package es.uah.aut.srg.gss.lang.tmoutput.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmoutput.parser.antlr.internal.InternalTMOUTPUTParser;
import es.uah.aut.srg.gss.lang.tmoutput.services.TMOUTPUTGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TMOUTPUTParser extends AbstractAntlrParser {

	@Inject
	private TMOUTPUTGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTMOUTPUTParser createParser(XtextTokenStream stream) {
		return new InternalTMOUTPUTParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSTMOutput";
	}

	public TMOUTPUTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TMOUTPUTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
