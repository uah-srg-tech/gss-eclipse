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
package es.uah.aut.srg.gss.lang.format.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.format.ide.contentassist.antlr.internal.InternalFORMATParser;
import es.uah.aut.srg.gss.lang.format.services.FORMATGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FORMATParser extends AbstractContentAssistParser {

	@Inject
	private FORMATGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFORMATParser createParser() {
		InternalFORMATParser result = new InternalFORMATParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSFormatFormatAccess().getAlternatives_3_3_1(), "rule__GSSFormatFormat__Alternatives_3_3_1");
					put(grammarAccess.getGSSFormatFieldAccess().getAlternatives(), "rule__GSSFormatField__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getGSSFormatFormatTypeAccess().getAlternatives(), "rule__GSSFormatFormatType__Alternatives");
					put(grammarAccess.getGSSFormatFieldTypeAccess().getAlternatives(), "rule__GSSFormatFieldType__Alternatives");
					put(grammarAccess.getGSSFormatFieldByteOrderAccess().getAlternatives(), "rule__GSSFormatFieldByteOrder__Alternatives");
					put(grammarAccess.getGSSFormatSFieldFirstBitAccess().getAlternatives(), "rule__GSSFormatSFieldFirstBit__Alternatives");
					put(grammarAccess.getGSSFormatUnitAccess().getAlternatives(), "rule__GSSFormatUnit__Alternatives");
					put(grammarAccess.getGSSFormatPowerAccess().getAlternatives(), "rule__GSSFormatPower__Alternatives");
					put(grammarAccess.getGSSFormatCheckTypeAccess().getAlternatives(), "rule__GSSFormatCheckType__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSFormatFormatAccess().getGroup(), "rule__GSSFormatFormat__Group__0");
					put(grammarAccess.getGSSFormatFormatAccess().getGroup_3_0(), "rule__GSSFormatFormat__Group_3_0__0");
					put(grammarAccess.getGSSFormatFormatAccess().getGroup_3_1(), "rule__GSSFormatFormat__Group_3_1__0");
					put(grammarAccess.getGSSFormatFormatAccess().getGroup_3_2(), "rule__GSSFormatFormat__Group_3_2__0");
					put(grammarAccess.getGSSFormatFormatAccess().getGroup_3_3(), "rule__GSSFormatFormat__Group_3_3__0");
					put(grammarAccess.getGSSFormatFormatAccess().getGroup_3_3_0(), "rule__GSSFormatFormat__Group_3_3_0__0");
					put(grammarAccess.getGSSFormatCSFieldAccess().getGroup(), "rule__GSSFormatCSField__Group__0");
					put(grammarAccess.getGSSFormatCSFieldAccess().getGroup_14(), "rule__GSSFormatCSField__Group_14__0");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGroup(), "rule__GSSFormatCSFormulaField__Group__0");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGroup_14(), "rule__GSSFormatCSFormulaField__Group_14__0");
					put(grammarAccess.getGSSFormatVSFieldAccess().getGroup(), "rule__GSSFormatVSField__Group__0");
					put(grammarAccess.getGSSFormatVSFieldAccess().getGroup_14(), "rule__GSSFormatVSField__Group_14__0");
					put(grammarAccess.getGSSFormatVRFieldSizeAccess().getGroup(), "rule__GSSFormatVRFieldSize__Group__0");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getGroup(), "rule__GSSFormatFDICField__Group__0");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getGroup_14(), "rule__GSSFormatFDICField__Group_14__0");
					put(grammarAccess.getGSSFormatAFieldAccess().getGroup(), "rule__GSSFormatAField__Group__0");
					put(grammarAccess.getGSSFormatAFieldAccess().getGroup_14(), "rule__GSSFormatAField__Group_14__0");
					put(grammarAccess.getGSSFormatAIFieldAccess().getGroup(), "rule__GSSFormatAIField__Group__0");
					put(grammarAccess.getGSSFormatAIFieldAccess().getGroup_14(), "rule__GSSFormatAIField__Group_14__0");
					put(grammarAccess.getGSSFormatSizeAccess().getGroup(), "rule__GSSFormatSize__Group__0");
					put(grammarAccess.getGSSFormatGlobalOffsetAccess().getGroup(), "rule__GSSFormatGlobalOffset__Group__0");
					put(grammarAccess.getGSSFormatFormulaAccess().getGroup(), "rule__GSSFormatFormula__Group__0");
					put(grammarAccess.getGSSFormatConstSizeAccess().getGroup(), "rule__GSSFormatConstSize__Group__0");
					put(grammarAccess.getGSSFormatMaxSizeAccess().getGroup(), "rule__GSSFormatMaxSize__Group__0");
					put(grammarAccess.getGSSFormatVariableSizeAccess().getGroup(), "rule__GSSFormatVariableSize__Group__0");
					put(grammarAccess.getGSSFormatVariableSizeAccess().getGroup_10(), "rule__GSSFormatVariableSize__Group_10__0");
					put(grammarAccess.getGSSFormatFloatingOffsetAccess().getGroup(), "rule__GSSFormatFloatingOffset__Group__0");
					put(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGroup(), "rule__GSSFormatSortedFieldsToCheck__Group__0");
					put(grammarAccess.getGSSFormatFieldToCheckAccess().getGroup(), "rule__GSSFormatFieldToCheck__Group__0");
					put(grammarAccess.getGSSFormatArrayDimensionAccess().getGroup(), "rule__GSSFormatArrayDimension__Group__0");
					put(grammarAccess.getGSSFormatLocalOffsetAccess().getGroup(), "rule__GSSFormatLocalOffset__Group__0");
					put(grammarAccess.getGSSFormatArrayRefAccess().getGroup(), "rule__GSSFormatArrayRef__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0(), "rule__GSSModelFile__ImportsAssignment_0");
					put(grammarAccess.getGSSModelFileAccess().getElementAssignment_1(), "rule__GSSModelFile__ElementAssignment_1");
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2(), "rule__GSSModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getGSSFormatFormatAccess().getNameAssignment_1(), "rule__GSSFormatFormat__NameAssignment_1");
					put(grammarAccess.getGSSFormatFormatAccess().getUriAssignment_3_0_2(), "rule__GSSFormatFormat__UriAssignment_3_0_2");
					put(grammarAccess.getGSSFormatFormatAccess().getVersionAssignment_3_1_2(), "rule__GSSFormatFormat__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSFormatFormatAccess().getProtocolAssignment_3_2_2(), "rule__GSSFormatFormat__ProtocolAssignment_3_2_2");
					put(grammarAccess.getGSSFormatFormatAccess().getTypeAssignment_3_3_0_2(), "rule__GSSFormatFormat__TypeAssignment_3_3_0_2");
					put(grammarAccess.getGSSFormatFormatAccess().getCSFieldAssignment_3_3_1_0(), "rule__GSSFormatFormat__CSFieldAssignment_3_3_1_0");
					put(grammarAccess.getGSSFormatFormatAccess().getCSFormulaFieldAssignment_3_3_1_1(), "rule__GSSFormatFormat__CSFormulaFieldAssignment_3_3_1_1");
					put(grammarAccess.getGSSFormatFormatAccess().getVSFieldAssignment_3_3_1_2(), "rule__GSSFormatFormat__VSFieldAssignment_3_3_1_2");
					put(grammarAccess.getGSSFormatFormatAccess().getFDICFieldAssignment_3_3_1_3(), "rule__GSSFormatFormat__FDICFieldAssignment_3_3_1_3");
					put(grammarAccess.getGSSFormatFormatAccess().getVRFieldSizeAssignment_3_3_1_4(), "rule__GSSFormatFormat__VRFieldSizeAssignment_3_3_1_4");
					put(grammarAccess.getGSSFormatFormatAccess().getAFieldAssignment_3_3_1_5(), "rule__GSSFormatFormat__AFieldAssignment_3_3_1_5");
					put(grammarAccess.getGSSFormatFormatAccess().getAIFieldAssignment_3_3_1_6(), "rule__GSSFormatFormat__AIFieldAssignment_3_3_1_6");
					put(grammarAccess.getGSSFormatCSFieldAccess().getFidAssignment_4(), "rule__GSSFormatCSField__FidAssignment_4");
					put(grammarAccess.getGSSFormatCSFieldAccess().getPfidAssignment_8(), "rule__GSSFormatCSField__PfidAssignment_8");
					put(grammarAccess.getGSSFormatCSFieldAccess().getNameAssignment_12(), "rule__GSSFormatCSField__NameAssignment_12");
					put(grammarAccess.getGSSFormatCSFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSFormatCSField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSFormatCSFieldAccess().getTypeAssignment_17(), "rule__GSSFormatCSField__TypeAssignment_17");
					put(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderAssignment_21(), "rule__GSSFormatCSField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitAssignment_25(), "rule__GSSFormatCSField__FirstBitAssignment_25");
					put(grammarAccess.getGSSFormatCSFieldAccess().getSizeAssignment_27(), "rule__GSSFormatCSField__SizeAssignment_27");
					put(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetAssignment_28(), "rule__GSSFormatCSField__GlobalOffsetAssignment_28");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidAssignment_4(), "rule__GSSFormatCSFormulaField__FidAssignment_4");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidAssignment_8(), "rule__GSSFormatCSFormulaField__PfidAssignment_8");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameAssignment_12(), "rule__GSSFormatCSFormulaField__NameAssignment_12");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSFormatCSFormulaField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeAssignment_17(), "rule__GSSFormatCSFormulaField__TypeAssignment_17");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderAssignment_21(), "rule__GSSFormatCSFormulaField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitAssignment_25(), "rule__GSSFormatCSFormulaField__FirstBitAssignment_25");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeAssignment_27(), "rule__GSSFormatCSFormulaField__SizeAssignment_27");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28(), "rule__GSSFormatCSFormulaField__GlobalOffsetAssignment_28");
					put(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaAssignment_29(), "rule__GSSFormatCSFormulaField__FormulaAssignment_29");
					put(grammarAccess.getGSSFormatVSFieldAccess().getFidAssignment_4(), "rule__GSSFormatVSField__FidAssignment_4");
					put(grammarAccess.getGSSFormatVSFieldAccess().getPfidAssignment_8(), "rule__GSSFormatVSField__PfidAssignment_8");
					put(grammarAccess.getGSSFormatVSFieldAccess().getNameAssignment_12(), "rule__GSSFormatVSField__NameAssignment_12");
					put(grammarAccess.getGSSFormatVSFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSFormatVSField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSFormatVSFieldAccess().getTypeAssignment_17(), "rule__GSSFormatVSField__TypeAssignment_17");
					put(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderAssignment_21(), "rule__GSSFormatVSField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitAssignment_25(), "rule__GSSFormatVSField__FirstBitAssignment_25");
					put(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeAssignment_27(), "rule__GSSFormatVSField__ConstSizeAssignment_27");
					put(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeAssignment_28(), "rule__GSSFormatVSField__VariableSizeAssignment_28");
					put(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeAssignment_29(), "rule__GSSFormatVSField__MaxSizeAssignment_29");
					put(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetAssignment_30(), "rule__GSSFormatVSField__GlobalOffsetAssignment_30");
					put(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidAssignment_4(), "rule__GSSFormatVRFieldSize__FidAssignment_4");
					put(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidAssignment_8(), "rule__GSSFormatVRFieldSize__PfidAssignment_8");
					put(grammarAccess.getGSSFormatVRFieldSizeAccess().getNameAssignment_12(), "rule__GSSFormatVRFieldSize__NameAssignment_12");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getFidAssignment_4(), "rule__GSSFormatFDICField__FidAssignment_4");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getPfidAssignment_8(), "rule__GSSFormatFDICField__PfidAssignment_8");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getNameAssignment_12(), "rule__GSSFormatFDICField__NameAssignment_12");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSFormatFDICField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeAssignment_17(), "rule__GSSFormatFDICField__CheckTypeAssignment_17");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderAssignment_21(), "rule__GSSFormatFDICField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitAssignment_25(), "rule__GSSFormatFDICField__FirstBitAssignment_25");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getSizeAssignment_27(), "rule__GSSFormatFDICField__SizeAssignment_27");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetAssignment_28(), "rule__GSSFormatFDICField__FloatingOffsetAssignment_28");
					put(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29(), "rule__GSSFormatFDICField__SortedFieldsToCheckAssignment_29");
					put(grammarAccess.getGSSFormatAFieldAccess().getFidAssignment_4(), "rule__GSSFormatAField__FidAssignment_4");
					put(grammarAccess.getGSSFormatAFieldAccess().getPfidAssignment_8(), "rule__GSSFormatAField__PfidAssignment_8");
					put(grammarAccess.getGSSFormatAFieldAccess().getNameAssignment_12(), "rule__GSSFormatAField__NameAssignment_12");
					put(grammarAccess.getGSSFormatAFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSFormatAField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSFormatAFieldAccess().getTypeAssignment_17(), "rule__GSSFormatAField__TypeAssignment_17");
					put(grammarAccess.getGSSFormatAFieldAccess().getByteOrderAssignment_21(), "rule__GSSFormatAField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSFormatAFieldAccess().getFirstBitAssignment_25(), "rule__GSSFormatAField__FirstBitAssignment_25");
					put(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionAssignment_27(), "rule__GSSFormatAField__ArrayDimensionAssignment_27");
					put(grammarAccess.getGSSFormatAFieldAccess().getSizeAssignment_28(), "rule__GSSFormatAField__SizeAssignment_28");
					put(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetAssignment_29(), "rule__GSSFormatAField__GlobalOffsetAssignment_29");
					put(grammarAccess.getGSSFormatAIFieldAccess().getFidAssignment_4(), "rule__GSSFormatAIField__FidAssignment_4");
					put(grammarAccess.getGSSFormatAIFieldAccess().getPfidAssignment_8(), "rule__GSSFormatAIField__PfidAssignment_8");
					put(grammarAccess.getGSSFormatAIFieldAccess().getNameAssignment_12(), "rule__GSSFormatAIField__NameAssignment_12");
					put(grammarAccess.getGSSFormatAIFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSFormatAIField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSFormatAIFieldAccess().getTypeAssignment_17(), "rule__GSSFormatAIField__TypeAssignment_17");
					put(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderAssignment_21(), "rule__GSSFormatAIField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitAssignment_25(), "rule__GSSFormatAIField__FirstBitAssignment_25");
					put(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefAssignment_27(), "rule__GSSFormatAIField__ArrayRefAssignment_27");
					put(grammarAccess.getGSSFormatAIFieldAccess().getSizeAssignment_28(), "rule__GSSFormatAIField__SizeAssignment_28");
					put(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetAssignment_29(), "rule__GSSFormatAIField__LocalOffsetAssignment_29");
					put(grammarAccess.getGSSFormatSizeAccess().getBytesAssignment_4(), "rule__GSSFormatSize__BytesAssignment_4");
					put(grammarAccess.getGSSFormatSizeAccess().getBitsAssignment_8(), "rule__GSSFormatSize__BitsAssignment_8");
					put(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesAssignment_4(), "rule__GSSFormatGlobalOffset__BytesAssignment_4");
					put(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsAssignment_8(), "rule__GSSFormatGlobalOffset__BitsAssignment_8");
					put(grammarAccess.getGSSFormatFormulaAccess().getSlopeAssignment_4(), "rule__GSSFormatFormula__SlopeAssignment_4");
					put(grammarAccess.getGSSFormatFormulaAccess().getInterceptAssignment_8(), "rule__GSSFormatFormula__InterceptAssignment_8");
					put(grammarAccess.getGSSFormatConstSizeAccess().getBytesAssignment_4(), "rule__GSSFormatConstSize__BytesAssignment_4");
					put(grammarAccess.getGSSFormatConstSizeAccess().getBitsAssignment_8(), "rule__GSSFormatConstSize__BitsAssignment_8");
					put(grammarAccess.getGSSFormatMaxSizeAccess().getBytesAssignment_4(), "rule__GSSFormatMaxSize__BytesAssignment_4");
					put(grammarAccess.getGSSFormatMaxSizeAccess().getBitsAssignment_8(), "rule__GSSFormatMaxSize__BitsAssignment_8");
					put(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefAssignment_4(), "rule__GSSFormatVariableSize__FidRefAssignment_4");
					put(grammarAccess.getGSSFormatVariableSizeAccess().getUnitAssignment_8(), "rule__GSSFormatVariableSize__UnitAssignment_8");
					put(grammarAccess.getGSSFormatVariableSizeAccess().getPowerAssignment_10_2(), "rule__GSSFormatVariableSize__PowerAssignment_10_2");
					put(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefAssignment_4(), "rule__GSSFormatFloatingOffset__FidRefAssignment_4");
					put(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3(), "rule__GSSFormatSortedFieldsToCheck__FieldToCheckAssignment_3");
					put(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefAssignment_4(), "rule__GSSFormatFieldToCheck__FidRefAssignment_4");
					put(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefAssignment_4(), "rule__GSSFormatArrayDimension__FidRefAssignment_4");
					put(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsAssignment_8(), "rule__GSSFormatArrayDimension__MaxItemsAssignment_8");
					put(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesAssignment_4(), "rule__GSSFormatLocalOffset__BytesAssignment_4");
					put(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsAssignment_8(), "rule__GSSFormatLocalOffset__BitsAssignment_8");
					put(grammarAccess.getGSSFormatArrayRefAccess().getFidRefAssignment_4(), "rule__GSSFormatArrayRef__FidRefAssignment_4");
					put(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), "rule__GSSFormatFormat__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFORMATParser typedParser = (InternalFORMATParser) parser;
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

	public FORMATGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FORMATGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
