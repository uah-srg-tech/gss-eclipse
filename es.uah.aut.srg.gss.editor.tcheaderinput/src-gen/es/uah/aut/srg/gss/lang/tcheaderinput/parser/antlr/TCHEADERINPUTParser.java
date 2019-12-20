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
package es.uah.aut.srg.gss.lang.tcheaderinput.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcheaderinput.parser.antlr.internal.InternalTCHEADERINPUTParser;
import es.uah.aut.srg.gss.lang.tcheaderinput.services.TCHEADERINPUTGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TCHEADERINPUTParser extends AbstractAntlrParser {

	@Inject
	private TCHEADERINPUTGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTCHEADERINPUTParser createParser(XtextTokenStream stream) {
		return new InternalTCHEADERINPUTParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSTCHeaderInput";
	}

	public TCHEADERINPUTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCHEADERINPUTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
