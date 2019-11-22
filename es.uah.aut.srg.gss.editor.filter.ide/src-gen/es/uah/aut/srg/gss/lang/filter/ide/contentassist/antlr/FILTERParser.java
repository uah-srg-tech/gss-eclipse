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
package es.uah.aut.srg.gss.lang.filter.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.filter.ide.contentassist.antlr.internal.InternalFILTERParser;
import es.uah.aut.srg.gss.lang.filter.services.FILTERGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FILTERParser extends AbstractContentAssistParser {

	@Inject
	private FILTERGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFILTERParser createParser() {
		InternalFILTERParser result = new InternalFILTERParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSFilterFilterAccess().getAlternatives(), "rule__GSSFilterFilter__Alternatives");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getAlternatives_3_1_5(), "rule__GSSFilterMaxtermFilter__Alternatives_3_1_5");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getAlternatives_3_1_5(), "rule__GSSFilterMintermFilter__Alternatives_3_1_5");
					put(grammarAccess.getGSSFilterBoolVarAccess().getAlternatives_19(), "rule__GSSFilterBoolVar__Alternatives_19");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAlternatives_19(), "rule__GSSFilterBoolVarFromArrayItem__Alternatives_19");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23(), "rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getGSSFilterConstantTypeAccess().getAlternatives(), "rule__GSSFilterConstantType__Alternatives");
					put(grammarAccess.getGSSFilterOPTypeAccess().getAlternatives(), "rule__GSSFilterOPType__Alternatives");
					put(grammarAccess.getGSSFilterSelectTypeAccess().getAlternatives(), "rule__GSSFilterSelectType__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup(), "rule__GSSFilterMaxtermFilter__Group__0");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_0(), "rule__GSSFilterMaxtermFilter__Group_3_0__0");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_1(), "rule__GSSFilterMaxtermFilter__Group_3_1__0");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup_3_1_0(), "rule__GSSFilterMaxtermFilter__Group_3_1_0__0");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getGroup(), "rule__GSSFilterMintermFilter__Group__0");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_0(), "rule__GSSFilterMintermFilter__Group_3_0__0");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_1(), "rule__GSSFilterMintermFilter__Group_3_1__0");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getGroup_3_1_0(), "rule__GSSFilterMintermFilter__Group_3_1_0__0");
					put(grammarAccess.getGSSFilterBoolVarAccess().getGroup(), "rule__GSSFilterBoolVar__Group__0");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGroup(), "rule__GSSFilterBoolVarFromArrayItem__Group__0");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroup(), "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0");
					put(grammarAccess.getGSSFilterBoolVarFDICAccess().getGroup(), "rule__GSSFilterBoolVarFDIC__Group__0");
					put(grammarAccess.getGSSFilterFieldOpAccess().getGroup(), "rule__GSSFilterFieldOp__Group__0");
					put(grammarAccess.getGSSFilterConstantAccess().getGroup(), "rule__GSSFilterConstant__Group__0");
					put(grammarAccess.getGSSFilterConstantAccess().getGroup_6(), "rule__GSSFilterConstant__Group_6__0");
					put(grammarAccess.getGSSFilterSelectAccess().getGroup(), "rule__GSSFilterSelect__Group__0");
					put(grammarAccess.getGSSFilterSelectAccess().getGroup_10(), "rule__GSSFilterSelect__Group_10__0");
					put(grammarAccess.getGSSFilterSelectAccess().getGroup_11(), "rule__GSSFilterSelect__Group_11__0");
					put(grammarAccess.getGSSFilterSelectAccess().getGroup_12(), "rule__GSSFilterSelect__Group_12__0");
					put(grammarAccess.getGSSFilterSelectLineAccess().getGroup(), "rule__GSSFilterSelectLine__Group__0");
					put(grammarAccess.getGSSFilterSelectLineAccess().getGroup_10(), "rule__GSSFilterSelectLine__Group_10__0");
					put(grammarAccess.getGSSFilterSelectLineAccess().getGroup_11(), "rule__GSSFilterSelectLine__Group_11__0");
					put(grammarAccess.getGSSFilterSelectLineAccess().getGroup_12(), "rule__GSSFilterSelectLine__Group_12__0");
					put(grammarAccess.getGSSFilterMaxtermAccess().getGroup(), "rule__GSSFilterMaxterm__Group__0");
					put(grammarAccess.getGSSFilterMintermAccess().getGroup(), "rule__GSSFilterMinterm__Group__0");
					put(grammarAccess.getGSSFilterBoolVarRefAccess().getGroup(), "rule__GSSFilterBoolVarRef__Group__0");
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
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameAssignment_1(), "rule__GSSFilterMaxtermFilter__NameAssignment_1");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_3_0_2(), "rule__GSSFilterMaxtermFilter__UriAssignment_3_0_2");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2(), "rule__GSSFilterMaxtermFilter__VersionAssignment_3_1_0_2");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3(), "rule__GSSFilterMaxtermFilter__FormatFileAssignment_3_1_3");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0(), "rule__GSSFilterMaxtermFilter__BoolVarAssignment_3_1_5_0");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1(), "rule__GSSFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2(), "rule__GSSFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3(), "rule__GSSFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_4(), "rule__GSSFilterMaxtermFilter__MaxtermAssignment_4");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getNameAssignment_1(), "rule__GSSFilterMintermFilter__NameAssignment_1");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_3_0_2(), "rule__GSSFilterMintermFilter__UriAssignment_3_0_2");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_3_1_0_2(), "rule__GSSFilterMintermFilter__VersionAssignment_3_1_0_2");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_3_1_3(), "rule__GSSFilterMintermFilter__FormatFileAssignment_3_1_3");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0(), "rule__GSSFilterMintermFilter__BoolVarAssignment_3_1_5_0");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1(), "rule__GSSFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2(), "rule__GSSFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3(), "rule__GSSFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_4(), "rule__GSSFilterMintermFilter__MintermAssignment_4");
					put(grammarAccess.getGSSFilterBoolVarAccess().getIdAssignment_4(), "rule__GSSFilterBoolVar__IdAssignment_4");
					put(grammarAccess.getGSSFilterBoolVarAccess().getNameAssignment_8(), "rule__GSSFilterBoolVar__NameAssignment_8");
					put(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeAssignment_12(), "rule__GSSFilterBoolVar__ConstantTypeAssignment_12");
					put(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_16(), "rule__GSSFilterBoolVar__FieldRefAssignment_16");
					put(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_18(), "rule__GSSFilterBoolVar__OpAssignment_18");
					put(grammarAccess.getGSSFilterBoolVarAccess().getConstantAssignment_19_0(), "rule__GSSFilterBoolVar__ConstantAssignment_19_0");
					put(grammarAccess.getGSSFilterBoolVarAccess().getSelectAssignment_19_1(), "rule__GSSFilterBoolVar__SelectAssignment_19_1");
					put(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineAssignment_19_2(), "rule__GSSFilterBoolVar__SelectLineAssignment_19_2");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdAssignment_4(), "rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameAssignment_8(), "rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12(), "rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16(), "rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_18(), "rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0(), "rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1(), "rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1");
					put(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2(), "rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4(), "rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8(), "rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12(), "rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16(), "rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20(), "rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22(), "rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0(), "rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1(), "rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1");
					put(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2(), "rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2");
					put(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdAssignment_4(), "rule__GSSFilterBoolVarFDIC__IdAssignment_4");
					put(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameAssignment_8(), "rule__GSSFilterBoolVarFDIC__NameAssignment_8");
					put(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_12(), "rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12");
					put(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_14(), "rule__GSSFilterBoolVarFDIC__OpAssignment_14");
					put(grammarAccess.getGSSFilterFieldOpAccess().getTypeAssignment_4(), "rule__GSSFilterFieldOp__TypeAssignment_4");
					put(grammarAccess.getGSSFilterConstantAccess().getValueAssignment_4(), "rule__GSSFilterConstant__ValueAssignment_4");
					put(grammarAccess.getGSSFilterConstantAccess().getMaskAssignment_6_2(), "rule__GSSFilterConstant__MaskAssignment_6_2");
					put(grammarAccess.getGSSFilterSelectAccess().getFromFileAssignment_4(), "rule__GSSFilterSelect__FromFileAssignment_4");
					put(grammarAccess.getGSSFilterSelectAccess().getTypeAssignment_8(), "rule__GSSFilterSelect__TypeAssignment_8");
					put(grammarAccess.getGSSFilterSelectAccess().getOffsetAssignment_10_2(), "rule__GSSFilterSelect__OffsetAssignment_10_2");
					put(grammarAccess.getGSSFilterSelectAccess().getSizeAssignment_11_2(), "rule__GSSFilterSelect__SizeAssignment_11_2");
					put(grammarAccess.getGSSFilterSelectAccess().getMaskAssignment_12_2(), "rule__GSSFilterSelect__MaskAssignment_12_2");
					put(grammarAccess.getGSSFilterSelectLineAccess().getFromFileAssignment_4(), "rule__GSSFilterSelectLine__FromFileAssignment_4");
					put(grammarAccess.getGSSFilterSelectLineAccess().getLineAssignment_8(), "rule__GSSFilterSelectLine__LineAssignment_8");
					put(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimAssignment_10_2(), "rule__GSSFilterSelectLine__LeftTrimAssignment_10_2");
					put(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimAssignment_11_2(), "rule__GSSFilterSelectLine__RightTrimAssignment_11_2");
					put(grammarAccess.getGSSFilterSelectLineAccess().getMaskAssignment_12_2(), "rule__GSSFilterSelectLine__MaskAssignment_12_2");
					put(grammarAccess.getGSSFilterMaxtermAccess().getIdAssignment_4(), "rule__GSSFilterMaxterm__IdAssignment_4");
					put(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6(), "rule__GSSFilterMaxterm__BoolVarRefAssignment_6");
					put(grammarAccess.getGSSFilterMintermAccess().getIdAssignment_4(), "rule__GSSFilterMinterm__IdAssignment_4");
					put(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6(), "rule__GSSFilterMinterm__BoolVarRefAssignment_6");
					put(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefAssignment_4(), "rule__GSSFilterBoolVarRef__IdRefAssignment_4");
					put(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), "rule__GSSFilterMaxtermFilter__UnorderedGroup_3");
					put(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), "rule__GSSFilterMintermFilter__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFILTERParser typedParser = (InternalFILTERParser) parser;
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

	public FILTERGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FILTERGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
