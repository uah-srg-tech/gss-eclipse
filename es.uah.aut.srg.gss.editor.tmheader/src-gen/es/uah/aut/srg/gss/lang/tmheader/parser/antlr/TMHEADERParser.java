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
package es.uah.aut.srg.gss.lang.tmheader.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmheader.parser.antlr.internal.InternalTMHEADERParser;
import es.uah.aut.srg.gss.lang.tmheader.services.TMHEADERGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TMHEADERParser extends AbstractAntlrParser {

	@Inject
	private TMHEADERGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTMHEADERParser createParser(XtextTokenStream stream) {
		return new InternalTMHEADERParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSTMHeader";
	}

	public TMHEADERGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TMHEADERGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
