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
package es.uah.aut.srg.gss.lang.test_proc.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.test_proc.parser.antlr.internal.InternalTEST_PROCParser;
import es.uah.aut.srg.gss.lang.test_proc.services.TEST_PROCGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TEST_PROCParser extends AbstractAntlrParser {

	@Inject
	private TEST_PROCGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTEST_PROCParser createParser(XtextTokenStream stream) {
		return new InternalTEST_PROCParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSModelFile";
	}

	public TEST_PROCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TEST_PROCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
