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
package es.uah.aut.srg.gss.lang.iface.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.iface.parser.antlr.internal.InternalIFACEParser;
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IFACEParser extends AbstractAntlrParser {

	@Inject
	private IFACEGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIFACEParser createParser(XtextTokenStream stream) {
		return new InternalIFACEParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSModelFile";
	}

	public IFACEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IFACEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
