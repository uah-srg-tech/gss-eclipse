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
package es.uah.aut.srg.gss.lang.protocol_packets.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.protocol_packets.parser.antlr.internal.InternalPROTOCOL_PACKETSParser;
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PROTOCOL_PACKETSParser extends AbstractAntlrParser {

	@Inject
	private PROTOCOL_PACKETSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPROTOCOL_PACKETSParser createParser(XtextTokenStream stream) {
		return new InternalPROTOCOL_PACKETSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GSSModelFile";
	}

	public PROTOCOL_PACKETSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PROTOCOL_PACKETSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
