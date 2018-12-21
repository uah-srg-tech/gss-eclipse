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
package es.uah.aut.srg.gss.lang.tm_tc_format.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tm_tc_format.ide.contentassist.antlr.internal.InternalTM_TC_FORMATParser;
import es.uah.aut.srg.gss.lang.tm_tc_format.services.TM_TC_FORMATGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TM_TC_FORMATParser extends AbstractContentAssistParser {

	@Inject
	private TM_TC_FORMATGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTM_TC_FORMATParser createParser() {
		InternalTM_TC_FORMATParser result = new InternalTM_TC_FORMATParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAlternatives_3_3_1(), "rule__GSSTmTcFormatTmTcFormat__Alternatives_3_3_1");
					put(grammarAccess.getGSSTmTcFormatFieldAccess().getAlternatives(), "rule__GSSTmTcFormatField__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatTypeAccess().getAlternatives(), "rule__GSSTmTcFormatTmTcFormatType__Alternatives");
					put(grammarAccess.getGSSTmTcFormatFieldTypeAccess().getAlternatives(), "rule__GSSTmTcFormatFieldType__Alternatives");
					put(grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getAlternatives(), "rule__GSSTmTcFormatFieldByteOrder__Alternatives");
					put(grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getAlternatives(), "rule__GSSTmTcFormatSFieldFirstBit__Alternatives");
					put(grammarAccess.getGSSTmTcFormatUnitAccess().getAlternatives(), "rule__GSSTmTcFormatUnit__Alternatives");
					put(grammarAccess.getGSSTmTcFormatPowerAccess().getAlternatives(), "rule__GSSTmTcFormatPower__Alternatives");
					put(grammarAccess.getGSSTmTcFormatCheckTypeAccess().getAlternatives(), "rule__GSSTmTcFormatCheckType__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGroup(), "rule__GSSTmTcFormatTmTcFormat__Group__0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGroup_3_0(), "rule__GSSTmTcFormatTmTcFormat__Group_3_0__0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGroup_3_1(), "rule__GSSTmTcFormatTmTcFormat__Group_3_1__0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGroup_3_2(), "rule__GSSTmTcFormatTmTcFormat__Group_3_2__0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGroup_3_3(), "rule__GSSTmTcFormatTmTcFormat__Group_3_3__0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGroup_3_3_0(), "rule__GSSTmTcFormatTmTcFormat__Group_3_3_0__0");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGroup(), "rule__GSSTmTcFormatCSField__Group__0");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGroup_14(), "rule__GSSTmTcFormatCSField__Group_14__0");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGroup(), "rule__GSSTmTcFormatCSFormulaField__Group__0");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGroup_14(), "rule__GSSTmTcFormatCSFormulaField__Group_14__0");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGroup(), "rule__GSSTmTcFormatVSField__Group__0");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGroup_14(), "rule__GSSTmTcFormatVSField__Group_14__0");
					put(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGroup(), "rule__GSSTmTcFormatVRFieldSize__Group__0");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGroup(), "rule__GSSTmTcFormatFDICField__Group__0");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGroup_14(), "rule__GSSTmTcFormatFDICField__Group_14__0");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getGroup(), "rule__GSSTmTcFormatAField__Group__0");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getGroup_14(), "rule__GSSTmTcFormatAField__Group_14__0");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGroup(), "rule__GSSTmTcFormatAIField__Group__0");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getGroup_14(), "rule__GSSTmTcFormatAIField__Group_14__0");
					put(grammarAccess.getGSSTmTcFormatSizeAccess().getGroup(), "rule__GSSTmTcFormatSize__Group__0");
					put(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGroup(), "rule__GSSTmTcFormatGlobalOffset__Group__0");
					put(grammarAccess.getGSSTmTcFormatFormulaAccess().getGroup(), "rule__GSSTmTcFormatFormula__Group__0");
					put(grammarAccess.getGSSTmTcFormatConstSizeAccess().getGroup(), "rule__GSSTmTcFormatConstSize__Group__0");
					put(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGroup(), "rule__GSSTmTcFormatMaxSize__Group__0");
					put(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGroup(), "rule__GSSTmTcFormatVariableSize__Group__0");
					put(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGroup_10(), "rule__GSSTmTcFormatVariableSize__Group_10__0");
					put(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGroup(), "rule__GSSTmTcFormatFloatingOffset__Group__0");
					put(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGroup(), "rule__GSSTmTcFormatSortedFieldsToCheck__Group__0");
					put(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGroup(), "rule__GSSTmTcFormatFieldToCheck__Group__0");
					put(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGroup(), "rule__GSSTmTcFormatArrayDimension__Group__0");
					put(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGroup(), "rule__GSSTmTcFormatLocalOffset__Group__0");
					put(grammarAccess.getGSSTmTcFormatArrayRefAccess().getGroup(), "rule__GSSTmTcFormatArrayRef__Group__0");
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
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getNameAssignment_1(), "rule__GSSTmTcFormatTmTcFormat__NameAssignment_1");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUriAssignment_3_0_2(), "rule__GSSTmTcFormatTmTcFormat__UriAssignment_3_0_2");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVersionAssignment_3_1_2(), "rule__GSSTmTcFormatTmTcFormat__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getProtocolAssignment_3_2_2(), "rule__GSSTmTcFormatTmTcFormat__ProtocolAssignment_3_2_2");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getTypeAssignment_3_3_0_2(), "rule__GSSTmTcFormatTmTcFormat__TypeAssignment_3_3_0_2");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getCSFieldAssignment_3_3_1_0(), "rule__GSSTmTcFormatTmTcFormat__CSFieldAssignment_3_3_1_0");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getCSFormulaFieldAssignment_3_3_1_1(), "rule__GSSTmTcFormatTmTcFormat__CSFormulaFieldAssignment_3_3_1_1");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVSFieldAssignment_3_3_1_2(), "rule__GSSTmTcFormatTmTcFormat__VSFieldAssignment_3_3_1_2");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getFDICFieldAssignment_3_3_1_3(), "rule__GSSTmTcFormatTmTcFormat__FDICFieldAssignment_3_3_1_3");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVRFieldSizeAssignment_3_3_1_4(), "rule__GSSTmTcFormatTmTcFormat__VRFieldSizeAssignment_3_3_1_4");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAFieldAssignment_3_3_1_5(), "rule__GSSTmTcFormatTmTcFormat__AFieldAssignment_3_3_1_5");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAIFieldAssignment_3_3_1_6(), "rule__GSSTmTcFormatTmTcFormat__AIFieldAssignment_3_3_1_6");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidAssignment_4(), "rule__GSSTmTcFormatCSField__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatCSField__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameAssignment_12(), "rule__GSSTmTcFormatCSField__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSTmTcFormatCSField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeAssignment_17(), "rule__GSSTmTcFormatCSField__TypeAssignment_17");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderAssignment_21(), "rule__GSSTmTcFormatCSField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitAssignment_25(), "rule__GSSTmTcFormatCSField__FirstBitAssignment_25");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeAssignment_27(), "rule__GSSTmTcFormatCSField__SizeAssignment_27");
					put(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetAssignment_28(), "rule__GSSTmTcFormatCSField__GlobalOffsetAssignment_28");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidAssignment_4(), "rule__GSSTmTcFormatCSFormulaField__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatCSFormulaField__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameAssignment_12(), "rule__GSSTmTcFormatCSFormulaField__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSTmTcFormatCSFormulaField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeAssignment_17(), "rule__GSSTmTcFormatCSFormulaField__TypeAssignment_17");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderAssignment_21(), "rule__GSSTmTcFormatCSFormulaField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitAssignment_25(), "rule__GSSTmTcFormatCSFormulaField__FirstBitAssignment_25");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeAssignment_27(), "rule__GSSTmTcFormatCSFormulaField__SizeAssignment_27");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28(), "rule__GSSTmTcFormatCSFormulaField__GlobalOffsetAssignment_28");
					put(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaAssignment_29(), "rule__GSSTmTcFormatCSFormulaField__FormulaAssignment_29");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidAssignment_4(), "rule__GSSTmTcFormatVSField__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatVSField__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameAssignment_12(), "rule__GSSTmTcFormatVSField__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSTmTcFormatVSField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeAssignment_17(), "rule__GSSTmTcFormatVSField__TypeAssignment_17");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderAssignment_21(), "rule__GSSTmTcFormatVSField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitAssignment_25(), "rule__GSSTmTcFormatVSField__FirstBitAssignment_25");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeAssignment_27(), "rule__GSSTmTcFormatVSField__ConstSizeAssignment_27");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeAssignment_28(), "rule__GSSTmTcFormatVSField__VariableSizeAssignment_28");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeAssignment_29(), "rule__GSSTmTcFormatVSField__MaxSizeAssignment_29");
					put(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetAssignment_30(), "rule__GSSTmTcFormatVSField__GlobalOffsetAssignment_30");
					put(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidAssignment_4(), "rule__GSSTmTcFormatVRFieldSize__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatVRFieldSize__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameAssignment_12(), "rule__GSSTmTcFormatVRFieldSize__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidAssignment_4(), "rule__GSSTmTcFormatFDICField__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatFDICField__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameAssignment_12(), "rule__GSSTmTcFormatFDICField__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSTmTcFormatFDICField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeAssignment_17(), "rule__GSSTmTcFormatFDICField__CheckTypeAssignment_17");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderAssignment_21(), "rule__GSSTmTcFormatFDICField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitAssignment_25(), "rule__GSSTmTcFormatFDICField__FirstBitAssignment_25");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeAssignment_27(), "rule__GSSTmTcFormatFDICField__SizeAssignment_27");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetAssignment_28(), "rule__GSSTmTcFormatFDICField__FloatingOffsetAssignment_28");
					put(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29(), "rule__GSSTmTcFormatFDICField__SortedFieldsToCheckAssignment_29");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidAssignment_4(), "rule__GSSTmTcFormatAField__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatAField__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getNameAssignment_12(), "rule__GSSTmTcFormatAField__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSTmTcFormatAField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeAssignment_17(), "rule__GSSTmTcFormatAField__TypeAssignment_17");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderAssignment_21(), "rule__GSSTmTcFormatAField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitAssignment_25(), "rule__GSSTmTcFormatAField__FirstBitAssignment_25");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionAssignment_27(), "rule__GSSTmTcFormatAField__ArrayDimensionAssignment_27");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeAssignment_28(), "rule__GSSTmTcFormatAField__SizeAssignment_28");
					put(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetAssignment_29(), "rule__GSSTmTcFormatAField__GlobalOffsetAssignment_29");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidAssignment_4(), "rule__GSSTmTcFormatAIField__FidAssignment_4");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidAssignment_8(), "rule__GSSTmTcFormatAIField__PfidAssignment_8");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameAssignment_12(), "rule__GSSTmTcFormatAIField__NameAssignment_12");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionAssignment_14_2(), "rule__GSSTmTcFormatAIField__DescriptionAssignment_14_2");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeAssignment_17(), "rule__GSSTmTcFormatAIField__TypeAssignment_17");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderAssignment_21(), "rule__GSSTmTcFormatAIField__ByteOrderAssignment_21");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitAssignment_25(), "rule__GSSTmTcFormatAIField__FirstBitAssignment_25");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefAssignment_27(), "rule__GSSTmTcFormatAIField__ArrayRefAssignment_27");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeAssignment_28(), "rule__GSSTmTcFormatAIField__SizeAssignment_28");
					put(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetAssignment_29(), "rule__GSSTmTcFormatAIField__LocalOffsetAssignment_29");
					put(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesAssignment_4(), "rule__GSSTmTcFormatSize__BytesAssignment_4");
					put(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsAssignment_8(), "rule__GSSTmTcFormatSize__BitsAssignment_8");
					put(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesAssignment_4(), "rule__GSSTmTcFormatGlobalOffset__BytesAssignment_4");
					put(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsAssignment_8(), "rule__GSSTmTcFormatGlobalOffset__BitsAssignment_8");
					put(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeAssignment_4(), "rule__GSSTmTcFormatFormula__SlopeAssignment_4");
					put(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptAssignment_8(), "rule__GSSTmTcFormatFormula__InterceptAssignment_8");
					put(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesAssignment_4(), "rule__GSSTmTcFormatConstSize__BytesAssignment_4");
					put(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsAssignment_8(), "rule__GSSTmTcFormatConstSize__BitsAssignment_8");
					put(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesAssignment_4(), "rule__GSSTmTcFormatMaxSize__BytesAssignment_4");
					put(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsAssignment_8(), "rule__GSSTmTcFormatMaxSize__BitsAssignment_8");
					put(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefAssignment_4(), "rule__GSSTmTcFormatVariableSize__FidRefAssignment_4");
					put(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitAssignment_8(), "rule__GSSTmTcFormatVariableSize__UnitAssignment_8");
					put(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerAssignment_10_2(), "rule__GSSTmTcFormatVariableSize__PowerAssignment_10_2");
					put(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefAssignment_4(), "rule__GSSTmTcFormatFloatingOffset__FidRefAssignment_4");
					put(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3(), "rule__GSSTmTcFormatSortedFieldsToCheck__FieldToCheckAssignment_3");
					put(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefAssignment_4(), "rule__GSSTmTcFormatFieldToCheck__FidRefAssignment_4");
					put(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefAssignment_4(), "rule__GSSTmTcFormatArrayDimension__FidRefAssignment_4");
					put(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsAssignment_8(), "rule__GSSTmTcFormatArrayDimension__MaxItemsAssignment_8");
					put(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesAssignment_4(), "rule__GSSTmTcFormatLocalOffset__BytesAssignment_4");
					put(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsAssignment_8(), "rule__GSSTmTcFormatLocalOffset__BitsAssignment_8");
					put(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefAssignment_4(), "rule__GSSTmTcFormatArrayRef__FidRefAssignment_4");
					put(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), "rule__GSSTmTcFormatTmTcFormat__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTM_TC_FORMATParser typedParser = (InternalTM_TC_FORMATParser) parser;
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

	public TM_TC_FORMATGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TM_TC_FORMATGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
