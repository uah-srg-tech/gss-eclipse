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
package es.uah.aut.srg.gss.lang.import_.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.import_.ide.contentassist.antlr.internal.InternalIMPORTParser;
import es.uah.aut.srg.gss.lang.import_.services.IMPORTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class IMPORTParser extends AbstractContentAssistParser {

	@Inject
	private IMPORTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalIMPORTParser createParser() {
		InternalIMPORTParser result = new InternalIMPORTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSImportImportAccess().getAlternatives_10(), "rule__GSSImportImport__Alternatives_10");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getGSSImportUnitAccess().getAlternatives(), "rule__GSSImportUnit__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSImportImportAccess().getGroup(), "rule__GSSImportImport__Group__0");
					put(grammarAccess.getGSSImportImportAccess().getGroup_3_0(), "rule__GSSImportImport__Group_3_0__0");
					put(grammarAccess.getGSSImportImportAccess().getGroup_3_1(), "rule__GSSImportImport__Group_3_1__0");
					put(grammarAccess.getGSSImportDataSourceAccess().getGroup(), "rule__GSSImportDataSource__Group__0");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getGroup(), "rule__GSSImportVirtualSize__Group__0");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_10(), "rule__GSSImportVirtualSize__Group_10__0");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_11(), "rule__GSSImportVirtualSize__Group_11__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0(), "rule__GSSModelFile__ImportsAssignment_0");
					put(grammarAccess.getGSSModelFileAccess().getElementAssignment_1(), "rule__GSSModelFile__ElementAssignment_1");
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2(), "rule__GSSModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getGSSImportImportAccess().getNameAssignment_1(), "rule__GSSImportImport__NameAssignment_1");
					put(grammarAccess.getGSSImportImportAccess().getUriAssignment_3_0_2(), "rule__GSSImportImport__UriAssignment_3_0_2");
					put(grammarAccess.getGSSImportImportAccess().getVersionAssignment_3_1_2(), "rule__GSSImportImport__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSImportImportAccess().getFromAssignment_6(), "rule__GSSImportImport__FromAssignment_6");
					put(grammarAccess.getGSSImportImportAccess().getToAssignment_10_1(), "rule__GSSImportImport__ToAssignment_10_1");
					put(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12(), "rule__GSSImportImport__DataSourceAssignment_12");
					put(grammarAccess.getGSSImportImportAccess().getVirtualSizeAssignment_13(), "rule__GSSImportImport__VirtualSizeAssignment_13");
					put(grammarAccess.getGSSImportDataSourceAccess().getFieldRefAssignment_4(), "rule__GSSImportDataSource__FieldRefAssignment_4");
					put(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimAssignment_8(), "rule__GSSImportDataSource__LeftTrimAssignment_8");
					put(grammarAccess.getGSSImportDataSourceAccess().getRightTrimAssignment_12(), "rule__GSSImportDataSource__RightTrimAssignment_12");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefAssignment_4(), "rule__GSSImportVirtualSize__FieldRefAssignment_4");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getToAssignment_8(), "rule__GSSImportVirtualSize__ToAssignment_8");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeAssignment_10_2(), "rule__GSSImportVirtualSize__AddSizeAssignment_10_2");
					put(grammarAccess.getGSSImportVirtualSizeAccess().getUnitAssignment_11_2(), "rule__GSSImportVirtualSize__UnitAssignment_11_2");
					put(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), "rule__GSSImportImport__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalIMPORTParser typedParser = (InternalIMPORTParser) parser;
			typedParser.entryRuleGSSModelFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IMPORTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IMPORTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
