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
package es.uah.aut.srg.gss.lang.campaign.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.campaign.ide.contentassist.antlr.internal.InternalCAMPAIGNParser;
import es.uah.aut.srg.gss.lang.campaign.services.CAMPAIGNGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class CAMPAIGNParser extends AbstractContentAssistParser {

	@Inject
	private CAMPAIGNGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCAMPAIGNParser createParser() {
		InternalCAMPAIGNParser result = new InternalCAMPAIGNParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSCampaignCampaignAccess().getGroup(), "rule__GSSCampaignCampaign__Group__0");
					put(grammarAccess.getGSSCampaignCampaignAccess().getGroup_3(), "rule__GSSCampaignCampaign__Group_3__0");
					put(grammarAccess.getGSSCampaignScenarioAccess().getGroup(), "rule__GSSCampaignScenario__Group__0");
					put(grammarAccess.getGSSTestListTestListAccess().getGroup(), "rule__GSSTestListTestList__Group__0");
					put(grammarAccess.getGSSTestListTestCaseAccess().getGroup(), "rule__GSSTestListTestCase__Group__0");
					put(grammarAccess.getGSSTestListTestCaseAccess().getGroup_10(), "rule__GSSTestListTestCase__Group_10__0");
					put(grammarAccess.getGSSTestListTestCaseAccess().getGroup_11(), "rule__GSSTestListTestCase__Group_11__0");
					put(grammarAccess.getGSSTestListTestCaseAccess().getGroup_11_2(), "rule__GSSTestListTestCase__Group_11_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0(), "rule__GSSModelFile__ImportsAssignment_0");
					put(grammarAccess.getGSSModelFileAccess().getElementAssignment_1(), "rule__GSSModelFile__ElementAssignment_1");
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2(), "rule__GSSModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getGSSCampaignCampaignAccess().getNameAssignment_1(), "rule__GSSCampaignCampaign__NameAssignment_1");
					put(grammarAccess.getGSSCampaignCampaignAccess().getUriAssignment_3_2(), "rule__GSSCampaignCampaign__UriAssignment_3_2");
					put(grammarAccess.getGSSCampaignCampaignAccess().getVersionAssignment_6(), "rule__GSSCampaignCampaign__VersionAssignment_6");
					put(grammarAccess.getGSSCampaignCampaignAccess().getScenarioAssignment_8(), "rule__GSSCampaignCampaign__ScenarioAssignment_8");
					put(grammarAccess.getGSSCampaignCampaignAccess().getTestsAssignment_9(), "rule__GSSCampaignCampaign__TestsAssignment_9");
					put(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentAssignment_4(), "rule__GSSCampaignScenario__EnvironmentAssignment_4");
					put(grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefAssignment_8(), "rule__GSSCampaignScenario__ScenarioRefAssignment_8");
					put(grammarAccess.getGSSTestListTestListAccess().getTestCaseAssignment_2(), "rule__GSSTestListTestList__TestCaseAssignment_2");
					put(grammarAccess.getGSSTestListTestCaseAccess().getNameAssignment_4(), "rule__GSSTestListTestCase__NameAssignment_4");
					put(grammarAccess.getGSSTestListTestCaseAccess().getProcedureAssignment_8(), "rule__GSSTestListTestCase__ProcedureAssignment_8");
					put(grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgAssignment_10_1(), "rule__GSSTestListTestCase__PrevMsgAssignment_10_1");
					put(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionAssignment_11_1(), "rule__GSSTestListTestCase__PrevActionAssignment_11_1");
					put(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamAssignment_11_2_1(), "rule__GSSTestListTestCase__PrevActionParamAssignment_11_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalCAMPAIGNParser typedParser = (InternalCAMPAIGNParser) parser;
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

	public CAMPAIGNGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CAMPAIGNGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
