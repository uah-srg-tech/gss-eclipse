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
package es.uah.aut.srg.gss.lang.charts.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.charts.ide.contentassist.antlr.internal.InternalCHARTSParser;
import es.uah.aut.srg.gss.lang.charts.services.CHARTSGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class CHARTSParser extends AbstractContentAssistParser {

	@Inject
	private CHARTSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCHARTSParser createParser() {
		InternalCHARTSParser result = new InternalCHARTSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSChartsYUnitsAccess().getAlternatives(), "rule__GSSChartsYUnits__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSChartsChartsAccess().getGroup(), "rule__GSSChartsCharts__Group__0");
					put(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0(), "rule__GSSChartsCharts__Group_3_0__0");
					put(grammarAccess.getGSSChartsChartsAccess().getGroup_3_1(), "rule__GSSChartsCharts__Group_3_1__0");
					put(grammarAccess.getGSSChartsChartAccess().getGroup(), "rule__GSSChartsChart__Group__0");
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
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0(), "rule__GSSModelFile__ImportsAssignment_0");
					put(grammarAccess.getGSSModelFileAccess().getElementAssignment_1(), "rule__GSSModelFile__ElementAssignment_1");
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2(), "rule__GSSModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getGSSChartsChartsAccess().getNameAssignment_1(), "rule__GSSChartsCharts__NameAssignment_1");
					put(grammarAccess.getGSSChartsChartsAccess().getUriAssignment_3_0_2(), "rule__GSSChartsCharts__UriAssignment_3_0_2");
					put(grammarAccess.getGSSChartsChartsAccess().getVersionAssignment_3_1_2(), "rule__GSSChartsCharts__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4(), "rule__GSSChartsCharts__ChartAssignment_4");
					put(grammarAccess.getGSSChartsChartAccess().getIdAssignment_4(), "rule__GSSChartsChart__IdAssignment_4");
					put(grammarAccess.getGSSChartsChartAccess().getNameAssignment_8(), "rule__GSSChartsChart__NameAssignment_8");
					put(grammarAccess.getGSSChartsChartAccess().getY_unitsAssignment_12(), "rule__GSSChartsChart__Y_unitsAssignment_12");
					put(grammarAccess.getGSSChartsChartAccess().getY_maxAssignment_16(), "rule__GSSChartsChart__Y_maxAssignment_16");
					put(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), "rule__GSSChartsCharts__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalCHARTSParser typedParser = (InternalCHARTSParser) parser;
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

	public CHARTSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CHARTSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
