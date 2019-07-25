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
package es.uah.aut.srg.gss.lang.environment.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.environment.parser.antlr.internal.InternalENVIRONMENTParser;
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ENVIRONMENTParser extends AbstractAntlrParser {

	@Inject
	private ENVIRONMENTGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalENVIRONMENTParser createParser(XtextTokenStream stream) {
		return new InternalENVIRONMENTParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSModelFile";
	}

	public ENVIRONMENTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ENVIRONMENTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
