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
package es.uah.aut.srg.gss.lang.import_.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.import_.parser.antlr.internal.InternalIMPORTParser;
import es.uah.aut.srg.gss.lang.import_.services.IMPORTGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IMPORTParser extends AbstractAntlrParser {

	@Inject
	private IMPORTGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIMPORTParser createParser(XtextTokenStream stream) {
		return new InternalIMPORTParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSModelFile";
	}

	public IMPORTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IMPORTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
