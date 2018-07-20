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
package es.uah.aut.srg.gss.lang.export.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.export.ide.contentassist.antlr.internal.InternalEXPORTParser;
import es.uah.aut.srg.gss.lang.export.services.EXPORTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class EXPORTParser extends AbstractContentAssistParser {

	@Inject
	private EXPORTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEXPORTParser createParser() {
		InternalEXPORTParser result = new InternalEXPORTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSExportSizesAccess().getAlternatives_3(), "rule__GSSExportSizes__Alternatives_3");
					put(grammarAccess.getGSSExportSettingsAccess().getAlternatives_3(), "rule__GSSExportSettings__Alternatives_3");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSExportUnitAccess().getAlternatives(), "rule__GSSExportUnit__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSExportExportAccess().getGroup(), "rule__GSSExportExport__Group__0");
					put(grammarAccess.getGSSExportExportAccess().getGroup_3_0(), "rule__GSSExportExport__Group_3_0__0");
					put(grammarAccess.getGSSExportExportAccess().getGroup_3_1(), "rule__GSSExportExport__Group_3_1__0");
					put(grammarAccess.getGSSExportSizesAccess().getGroup(), "rule__GSSExportSizes__Group__0");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup(), "rule__GSSExportSizeFromFileLength__Group__0");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup_10(), "rule__GSSExportSizeFromFileLength__Group_10__0");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getGroup_11(), "rule__GSSExportSizeFromFileLength__Group_11__0");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup(), "rule__GSSExportSizeFromFileLine__Group__0");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup_14(), "rule__GSSExportSizeFromFileLine__Group_14__0");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getGroup_15(), "rule__GSSExportSizeFromFileLine__Group_15__0");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getGroup(), "rule__GSSExportSizeInBits__Group__0");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getGroup_10(), "rule__GSSExportSizeInBits__Group_10__0");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getGroup_11(), "rule__GSSExportSizeInBits__Group_11__0");
					put(grammarAccess.getGSSExportSettingsAccess().getGroup(), "rule__GSSExportSettings__Group__0");
					put(grammarAccess.getGSSExportSettingFromConstAccess().getGroup(), "rule__GSSExportSettingFromConst__Group__0");
					put(grammarAccess.getGSSExportSettingFromSizeAccess().getGroup(), "rule__GSSExportSettingFromSize__Group__0");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getGroup(), "rule__GSSExportSettingFromFile__Group__0");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_10(), "rule__GSSExportSettingFromFile__Group_10__0");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_11(), "rule__GSSExportSettingFromFile__Group_11__0");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getGroup_12(), "rule__GSSExportSettingFromFile__Group_12__0");
					put(grammarAccess.getGSSExportSettingFromFieldAccess().getGroup(), "rule__GSSExportSettingFromField__Group__0");
					put(grammarAccess.getGSSExportSettingAIFromConstAccess().getGroup(), "rule__GSSExportSettingAIFromConst__Group__0");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup(), "rule__GSSExportSettingAIFromFile__Group__0");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_14(), "rule__GSSExportSettingAIFromFile__Group_14__0");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_15(), "rule__GSSExportSettingAIFromFile__Group_15__0");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getGroup_16(), "rule__GSSExportSettingAIFromFile__Group_16__0");
					put(grammarAccess.getGSSExportActivateDICsAccess().getGroup(), "rule__GSSExportActivateDICs__Group__0");
					put(grammarAccess.getGSSExportDICAccess().getGroup(), "rule__GSSExportDIC__Group__0");
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
					put(grammarAccess.getGSSExportExportAccess().getNameAssignment_1(), "rule__GSSExportExport__NameAssignment_1");
					put(grammarAccess.getGSSExportExportAccess().getUriAssignment_3_0_2(), "rule__GSSExportExport__UriAssignment_3_0_2");
					put(grammarAccess.getGSSExportExportAccess().getVersionAssignment_3_1_2(), "rule__GSSExportExport__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSExportExportAccess().getFromAssignment_6(), "rule__GSSExportExport__FromAssignment_6");
					put(grammarAccess.getGSSExportExportAccess().getToAssignment_10(), "rule__GSSExportExport__ToAssignment_10");
					put(grammarAccess.getGSSExportExportAccess().getSizesAssignment_12(), "rule__GSSExportExport__SizesAssignment_12");
					put(grammarAccess.getGSSExportExportAccess().getSettingsAssignment_13(), "rule__GSSExportExport__SettingsAssignment_13");
					put(grammarAccess.getGSSExportExportAccess().getActivateDICsAssignment_14(), "rule__GSSExportExport__ActivateDICsAssignment_14");
					put(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLengthAssignment_3_0(), "rule__GSSExportSizes__SizeFromFileLengthAssignment_3_0");
					put(grammarAccess.getGSSExportSizesAccess().getSizeFromFileLineAssignment_3_1(), "rule__GSSExportSizes__SizeFromFileLineAssignment_3_1");
					put(grammarAccess.getGSSExportSizesAccess().getSizeInBitsAssignment_3_2(), "rule__GSSExportSizes__SizeInBitsAssignment_3_2");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdAssignment_4(), "rule__GSSExportSizeFromFileLength__IdAssignment_4");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileAssignment_8(), "rule__GSSExportSizeFromFileLength__FromFileAssignment_8");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2(), "rule__GSSExportSizeFromFileLength__AddSizeAssignment_10_2");
					put(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitAssignment_11_2(), "rule__GSSExportSizeFromFileLength__UnitAssignment_11_2");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdAssignment_4(), "rule__GSSExportSizeFromFileLine__IdAssignment_4");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileAssignment_8(), "rule__GSSExportSizeFromFileLine__FromFileAssignment_8");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineAssignment_12(), "rule__GSSExportSizeFromFileLine__LineAssignment_12");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeAssignment_14_2(), "rule__GSSExportSizeFromFileLine__AddSizeAssignment_14_2");
					put(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitAssignment_15_2(), "rule__GSSExportSizeFromFileLine__UnitAssignment_15_2");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getIdAssignment_4(), "rule__GSSExportSizeInBits__IdAssignment_4");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getFromAssignment_8(), "rule__GSSExportSizeInBits__FromAssignment_8");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeAssignment_10_2(), "rule__GSSExportSizeInBits__AddSizeAssignment_10_2");
					put(grammarAccess.getGSSExportSizeInBitsAccess().getUnitAssignment_11_2(), "rule__GSSExportSizeInBits__UnitAssignment_11_2");
					put(grammarAccess.getGSSExportSettingsAccess().getSettingFromConstAssignment_3_0(), "rule__GSSExportSettings__SettingFromConstAssignment_3_0");
					put(grammarAccess.getGSSExportSettingsAccess().getSettingFromSizeAssignment_3_1(), "rule__GSSExportSettings__SettingFromSizeAssignment_3_1");
					put(grammarAccess.getGSSExportSettingsAccess().getSettingFromFileAssignment_3_2(), "rule__GSSExportSettings__SettingFromFileAssignment_3_2");
					put(grammarAccess.getGSSExportSettingsAccess().getSettingFromFieldAssignment_3_3(), "rule__GSSExportSettings__SettingFromFieldAssignment_3_3");
					put(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromConstAssignment_3_4(), "rule__GSSExportSettings__SettingAIFromConstAssignment_3_4");
					put(grammarAccess.getGSSExportSettingsAccess().getSettingAIFromFileAssignment_3_5(), "rule__GSSExportSettings__SettingAIFromFileAssignment_3_5");
					put(grammarAccess.getGSSExportSettingFromConstAccess().getValueAssignment_4(), "rule__GSSExportSettingFromConst__ValueAssignment_4");
					put(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefAssignment_8(), "rule__GSSExportSettingFromConst__ToFieldRefAssignment_8");
					put(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefAssignment_4(), "rule__GSSExportSettingFromSize__SizeRefAssignment_4");
					put(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefAssignment_8(), "rule__GSSExportSettingFromSize__ToFieldRefAssignment_8");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getFileAssignment_4(), "rule__GSSExportSettingFromFile__FileAssignment_4");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefAssignment_8(), "rule__GSSExportSettingFromFile__ToFieldRefAssignment_8");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetAssignment_10_2(), "rule__GSSExportSettingFromFile__OffsetAssignment_10_2");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getSizeAssignment_11_2(), "rule__GSSExportSettingFromFile__SizeAssignment_11_2");
					put(grammarAccess.getGSSExportSettingFromFileAccess().getLineAssignment_12_2(), "rule__GSSExportSettingFromFile__LineAssignment_12_2");
					put(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefAssignment_4(), "rule__GSSExportSettingFromField__FieldRefAssignment_4");
					put(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefAssignment_8(), "rule__GSSExportSettingFromField__ToFieldRefAssignment_8");
					put(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueAssignment_4(), "rule__GSSExportSettingAIFromConst__ValueAssignment_4");
					put(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefAssignment_8(), "rule__GSSExportSettingAIFromConst__ToFieldRefAssignment_8");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getFileAssignment_4(), "rule__GSSExportSettingAIFromFile__FileAssignment_4");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefAssignment_8(), "rule__GSSExportSettingAIFromFile__ToFieldRefAssignment_8");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexAssignment_12(), "rule__GSSExportSettingAIFromFile__ToArrayIndexAssignment_12");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetAssignment_14_2(), "rule__GSSExportSettingAIFromFile__OffsetAssignment_14_2");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeAssignment_15_2(), "rule__GSSExportSettingAIFromFile__SizeAssignment_15_2");
					put(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineAssignment_16_2(), "rule__GSSExportSettingAIFromFile__LineAssignment_16_2");
					put(grammarAccess.getGSSExportActivateDICsAccess().getDICAssignment_3(), "rule__GSSExportActivateDICs__DICAssignment_3");
					put(grammarAccess.getGSSExportDICAccess().getIdAssignment_4(), "rule__GSSExportDIC__IdAssignment_4");
					put(grammarAccess.getGSSExportDICAccess().getDICRefAssignment_8(), "rule__GSSExportDIC__DICRefAssignment_8");
					put(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), "rule__GSSExportExport__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEXPORTParser typedParser = (InternalEXPORTParser) parser;
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

	public EXPORTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EXPORTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
