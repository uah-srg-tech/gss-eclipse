/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.lang.charts.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.charts.parser.antlr.internal.InternalCHARTSParser;
import es.uah.aut.srg.gss.lang.charts.services.CHARTSGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CHARTSParser extends AbstractAntlrParser {

	@Inject
	private CHARTSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCHARTSParser createParser(XtextTokenStream stream) {
		return new InternalCHARTSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSModelFile";
	}

	public CHARTSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CHARTSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
