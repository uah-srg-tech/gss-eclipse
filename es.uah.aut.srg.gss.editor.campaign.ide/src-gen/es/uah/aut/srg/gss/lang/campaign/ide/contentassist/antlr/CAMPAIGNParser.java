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
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSCampaignCampaignAccess().getGroup(), "rule__GSSCampaignCampaign__Group__0");
					put(grammarAccess.getGSSCampaignCampaignAccess().getGroup_3(), "rule__GSSCampaignCampaign__Group_3__0");
					put(grammarAccess.getGSSCampaignScenarioAccess().getGroup(), "rule__GSSCampaignScenario__Group__0");
					put(grammarAccess.getGSSCampaignTestsAccess().getGroup(), "rule__GSSCampaignTests__Group__0");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getGroup(), "rule__GSSCampaignTestCase__Group__0");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getGroup_10(), "rule__GSSCampaignTestCase__Group_10__0");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getGroup_11(), "rule__GSSCampaignTestCase__Group_11__0");
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
					put(grammarAccess.getDATEAccess().getGroup(), "rule__DATE__Group__0");
					put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
					put(grammarAccess.getURLAccess().getGroup_1(), "rule__URL__Group_1__0");
					put(grammarAccess.getURLAccess().getGroup_3(), "rule__URL__Group_3__0");
					put(grammarAccess.getURLAccess().getGroup_4(), "rule__URL__Group_4__0");
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
					put(grammarAccess.getGSSCampaignTestsAccess().getTestCaseAssignment_2(), "rule__GSSCampaignTests__TestCaseAssignment_2");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getNameAssignment_4(), "rule__GSSCampaignTestCase__NameAssignment_4");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getProcedureAssignment_8(), "rule__GSSCampaignTestCase__ProcedureAssignment_8");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getReqAssignment_10_1(), "rule__GSSCampaignTestCase__ReqAssignment_10_1");
					put(grammarAccess.getGSSCampaignTestCaseAccess().getReqActionAssignment_11_1(), "rule__GSSCampaignTestCase__ReqActionAssignment_11_1");
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
