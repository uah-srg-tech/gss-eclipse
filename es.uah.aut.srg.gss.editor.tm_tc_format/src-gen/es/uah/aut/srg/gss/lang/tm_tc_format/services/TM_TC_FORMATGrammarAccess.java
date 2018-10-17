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
package es.uah.aut.srg.gss.lang.tm_tc_format.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TM_TC_FORMATGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GSSModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsGSSModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementGSSTmTcFormatTmTcFormatParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//GSSModelFile common::GSSModelFile:
		//	imports+=GSSModelFileImport*
		//	element=GSSTmTcFormatTmTcFormat
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=GSSModelFileImport* element=GSSTmTcFormatTmTcFormat
		public Group getGroup() { return cGroup; }
		
		//imports+=GSSModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//GSSModelFileImport
		public RuleCall getImportsGSSModelFileImportParserRuleCall_0_0() { return cImportsGSSModelFileImportParserRuleCall_0_0; }
		
		//element=GSSTmTcFormatTmTcFormat
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//GSSTmTcFormatTmTcFormat
		public RuleCall getElementGSSTmTcFormatTmTcFormatParserRuleCall_1_0() { return cElementGSSTmTcFormatTmTcFormatParserRuleCall_1_0; }
	}
	public class GSSModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSModelFileImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportURIAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportURISTRINGTerminalRuleCall_2_0 = (RuleCall)cImportURIAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GSSModelFileImport common::GSSModelFileImport:
		//	'import' ':=' importURI=STRING ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'import' ':=' importURI=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1() { return cColonEqualsSignKeyword_1; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_2() { return cImportURIAssignment_2; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_2_0() { return cImportURISTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class GSSTmTcFormatTmTcFormatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTcFormat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatTmTcFormatKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cUriKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cUriAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cUriQualifiedNameParserRuleCall_3_0_2_0 = (RuleCall)cUriAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cVersionKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_2_0 = (RuleCall)cVersionAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cProtocolKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cProtocolAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cProtocolIDTerminalRuleCall_3_2_2_0 = (RuleCall)cProtocolAssignment_3_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Group cGroup_3_3_0 = (Group)cGroup_3_3.eContents().get(0);
		private final Keyword cTypeKeyword_3_3_0_0 = (Keyword)cGroup_3_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_3_0_1 = (Keyword)cGroup_3_3_0.eContents().get(1);
		private final Assignment cTypeAssignment_3_3_0_2 = (Assignment)cGroup_3_3_0.eContents().get(2);
		private final RuleCall cTypeGSSTmTcFormatTmTcFormatTypeEnumRuleCall_3_3_0_2_0 = (RuleCall)cTypeAssignment_3_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_3_0_3 = (Keyword)cGroup_3_3_0.eContents().get(3);
		private final Alternatives cAlternatives_3_3_1 = (Alternatives)cGroup_3_3.eContents().get(1);
		private final Assignment cCSFieldAssignment_3_3_1_0 = (Assignment)cAlternatives_3_3_1.eContents().get(0);
		private final RuleCall cCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0 = (RuleCall)cCSFieldAssignment_3_3_1_0.eContents().get(0);
		private final Assignment cCSFormulaFieldAssignment_3_3_1_1 = (Assignment)cAlternatives_3_3_1.eContents().get(1);
		private final RuleCall cCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0 = (RuleCall)cCSFormulaFieldAssignment_3_3_1_1.eContents().get(0);
		private final Assignment cVSFieldAssignment_3_3_1_2 = (Assignment)cAlternatives_3_3_1.eContents().get(2);
		private final RuleCall cVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0 = (RuleCall)cVSFieldAssignment_3_3_1_2.eContents().get(0);
		private final Assignment cFDICFieldAssignment_3_3_1_3 = (Assignment)cAlternatives_3_3_1.eContents().get(3);
		private final RuleCall cFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0 = (RuleCall)cFDICFieldAssignment_3_3_1_3.eContents().get(0);
		private final Assignment cVRFieldSizeAssignment_3_3_1_4 = (Assignment)cAlternatives_3_3_1.eContents().get(4);
		private final RuleCall cVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0 = (RuleCall)cVRFieldSizeAssignment_3_3_1_4.eContents().get(0);
		private final Assignment cAFieldAssignment_3_3_1_5 = (Assignment)cAlternatives_3_3_1.eContents().get(5);
		private final RuleCall cAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0 = (RuleCall)cAFieldAssignment_3_3_1_5.eContents().get(0);
		private final Assignment cAIFieldAssignment_3_3_1_6 = (Assignment)cAlternatives_3_3_1.eContents().get(6);
		private final RuleCall cAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0 = (RuleCall)cAIFieldAssignment_3_3_1_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSTmTcFormatTmTcFormat:
		//	'GSSTmTcFormatTmTcFormat'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol' ':=' protocol=ID ';' &
		//	('type' ':=' type=GSSTmTcFormatTmTcFormatType ';') (CSField+=GSSTmTcFormatCSField |
		//	CSFormulaField+=GSSTmTcFormatCSFormulaField | VSField+=GSSTmTcFormatVSField | FDICField+=GSSTmTcFormatFDICField |
		//	VRFieldSize+=GSSTmTcFormatVRFieldSize | AField+=GSSTmTcFormatAField | AIField+=GSSTmTcFormatAIField)*)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatTmTcFormat' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' &
		//'protocol' ':=' protocol=ID ';' & ('type' ':=' type=GSSTmTcFormatTmTcFormatType ';') (CSField+=GSSTmTcFormatCSField |
		//CSFormulaField+=GSSTmTcFormatCSFormulaField | VSField+=GSSTmTcFormatVSField | FDICField+=GSSTmTcFormatFDICField |
		//VRFieldSize+=GSSTmTcFormatVRFieldSize | AField+=GSSTmTcFormatAField | AIField+=GSSTmTcFormatAIField)*) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatTmTcFormat'
		public Keyword getGSSTmTcFormatTmTcFormatKeyword_0() { return cGSSTmTcFormatTmTcFormatKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol' ':=' protocol=ID ';' & ('type' ':='
		//type=GSSTmTcFormatTmTcFormatType ';') (CSField+=GSSTmTcFormatCSField | CSFormulaField+=GSSTmTcFormatCSFormulaField |
		//VSField+=GSSTmTcFormatVSField | FDICField+=GSSTmTcFormatFDICField | VRFieldSize+=GSSTmTcFormatVRFieldSize |
		//AField+=GSSTmTcFormatAField | AIField+=GSSTmTcFormatAIField)*)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'uri' ':=' uri=QualifiedName ';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'uri'
		public Keyword getUriKeyword_3_0_0() { return cUriKeyword_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_3_0_2() { return cUriAssignment_3_0_2; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_3_0_2_0() { return cUriQualifiedNameParserRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//'version' ':=' version=Version ';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0() { return cVersionKeyword_3_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_2() { return cVersionAssignment_3_1_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_2_0() { return cVersionVersionParserRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//'protocol' ':=' protocol=ID ';'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'protocol'
		public Keyword getProtocolKeyword_3_2_0() { return cProtocolKeyword_3_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_2_1() { return cColonEqualsSignKeyword_3_2_1; }
		
		//protocol=ID
		public Assignment getProtocolAssignment_3_2_2() { return cProtocolAssignment_3_2_2; }
		
		//ID
		public RuleCall getProtocolIDTerminalRuleCall_3_2_2_0() { return cProtocolIDTerminalRuleCall_3_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_2_3() { return cSemicolonKeyword_3_2_3; }
		
		//('type' ':=' type=GSSTmTcFormatTmTcFormatType ';') (CSField+=GSSTmTcFormatCSField |
		//CSFormulaField+=GSSTmTcFormatCSFormulaField | VSField+=GSSTmTcFormatVSField | FDICField+=GSSTmTcFormatFDICField |
		//VRFieldSize+=GSSTmTcFormatVRFieldSize | AField+=GSSTmTcFormatAField | AIField+=GSSTmTcFormatAIField)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//('type' ':=' type=GSSTmTcFormatTmTcFormatType ';')
		public Group getGroup_3_3_0() { return cGroup_3_3_0; }
		
		//'type'
		public Keyword getTypeKeyword_3_3_0_0() { return cTypeKeyword_3_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_3_0_1() { return cColonEqualsSignKeyword_3_3_0_1; }
		
		//type=GSSTmTcFormatTmTcFormatType
		public Assignment getTypeAssignment_3_3_0_2() { return cTypeAssignment_3_3_0_2; }
		
		//GSSTmTcFormatTmTcFormatType
		public RuleCall getTypeGSSTmTcFormatTmTcFormatTypeEnumRuleCall_3_3_0_2_0() { return cTypeGSSTmTcFormatTmTcFormatTypeEnumRuleCall_3_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_3_0_3() { return cSemicolonKeyword_3_3_0_3; }
		
		//(CSField+=GSSTmTcFormatCSField | CSFormulaField+=GSSTmTcFormatCSFormulaField | VSField+=GSSTmTcFormatVSField |
		//FDICField+=GSSTmTcFormatFDICField | VRFieldSize+=GSSTmTcFormatVRFieldSize | AField+=GSSTmTcFormatAField |
		//AIField+=GSSTmTcFormatAIField)*
		public Alternatives getAlternatives_3_3_1() { return cAlternatives_3_3_1; }
		
		//CSField+=GSSTmTcFormatCSField
		public Assignment getCSFieldAssignment_3_3_1_0() { return cCSFieldAssignment_3_3_1_0; }
		
		//GSSTmTcFormatCSField
		public RuleCall getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0() { return cCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0; }
		
		//CSFormulaField+=GSSTmTcFormatCSFormulaField
		public Assignment getCSFormulaFieldAssignment_3_3_1_1() { return cCSFormulaFieldAssignment_3_3_1_1; }
		
		//GSSTmTcFormatCSFormulaField
		public RuleCall getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0() { return cCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0; }
		
		//VSField+=GSSTmTcFormatVSField
		public Assignment getVSFieldAssignment_3_3_1_2() { return cVSFieldAssignment_3_3_1_2; }
		
		//GSSTmTcFormatVSField
		public RuleCall getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0() { return cVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0; }
		
		//FDICField+=GSSTmTcFormatFDICField
		public Assignment getFDICFieldAssignment_3_3_1_3() { return cFDICFieldAssignment_3_3_1_3; }
		
		//GSSTmTcFormatFDICField
		public RuleCall getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0() { return cFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0; }
		
		//VRFieldSize+=GSSTmTcFormatVRFieldSize
		public Assignment getVRFieldSizeAssignment_3_3_1_4() { return cVRFieldSizeAssignment_3_3_1_4; }
		
		//GSSTmTcFormatVRFieldSize
		public RuleCall getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0() { return cVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0; }
		
		//AField+=GSSTmTcFormatAField
		public Assignment getAFieldAssignment_3_3_1_5() { return cAFieldAssignment_3_3_1_5; }
		
		//GSSTmTcFormatAField
		public RuleCall getAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0() { return cAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0; }
		
		//AIField+=GSSTmTcFormatAIField
		public Assignment getAIFieldAssignment_3_3_1_6() { return cAIFieldAssignment_3_3_1_6; }
		
		//GSSTmTcFormatAIField
		public RuleCall getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0() { return cAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSTmTcFormatFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatField");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGSSTmTcFormatCSFieldParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGSSTmTcFormatCSFormulaFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGSSTmTcFormatVSFieldParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cGSSTmTcFormatVRFieldSizeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cGSSTmTcFormatFDICFieldParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//GSSTmTcFormatField:
		//	GSSTmTcFormatCSField | GSSTmTcFormatCSFormulaField | GSSTmTcFormatVSField | GSSTmTcFormatVRFieldSize |
		//	GSSTmTcFormatFDICField;
		@Override public ParserRule getRule() { return rule; }
		
		//GSSTmTcFormatCSField | GSSTmTcFormatCSFormulaField | GSSTmTcFormatVSField | GSSTmTcFormatVRFieldSize |
		//GSSTmTcFormatFDICField
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GSSTmTcFormatCSField
		public RuleCall getGSSTmTcFormatCSFieldParserRuleCall_0() { return cGSSTmTcFormatCSFieldParserRuleCall_0; }
		
		//GSSTmTcFormatCSFormulaField
		public RuleCall getGSSTmTcFormatCSFormulaFieldParserRuleCall_1() { return cGSSTmTcFormatCSFormulaFieldParserRuleCall_1; }
		
		//GSSTmTcFormatVSField
		public RuleCall getGSSTmTcFormatVSFieldParserRuleCall_2() { return cGSSTmTcFormatVSFieldParserRuleCall_2; }
		
		//GSSTmTcFormatVRFieldSize
		public RuleCall getGSSTmTcFormatVRFieldSizeParserRuleCall_3() { return cGSSTmTcFormatVRFieldSizeParserRuleCall_3; }
		
		//GSSTmTcFormatFDICField
		public RuleCall getGSSTmTcFormatFDICFieldParserRuleCall_4() { return cGSSTmTcFormatFDICFieldParserRuleCall_4; }
	}
	public class GSSTmTcFormatCSFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatCSFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionIDTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSTmTcFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Keyword cSemicolonKeyword_30 = (Keyword)cGroup.eContents().get(30);
		
		//GSSTmTcFormatCSField:
		//	'GSSTmTcFormatCSField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
		//	'type' ':=' type=GSSTmTcFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//	size=GSSTmTcFormatSize
		//	globalOffset=GSSTmTcFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatCSField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';'
		//('description' ':=' description=ID ';')? 'type' ':=' type=GSSTmTcFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSTmTcFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//size=GSSTmTcFormatSize globalOffset=GSSTmTcFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatCSField'
		public Keyword getGSSTmTcFormatCSFieldKeyword_0() { return cGSSTmTcFormatCSFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=ID ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=ID
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//ID
		public RuleCall getDescriptionIDTerminalRuleCall_14_2_0() { return cDescriptionIDTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSTmTcFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSTmTcFormatFieldType
		public RuleCall getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSTmTcFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSTmTcFormatFieldByteOrder
		public RuleCall getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSTmTcFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSTmTcFormatSFieldFirstBit
		public RuleCall getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSTmTcFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSTmTcFormatSize
		public RuleCall getSizeGSSTmTcFormatSizeParserRuleCall_27_0() { return cSizeGSSTmTcFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=GSSTmTcFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//GSSTmTcFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_29() { return cRightCurlyBracketKeyword_29; }
		
		//';'
		public Keyword getSemicolonKeyword_30() { return cSemicolonKeyword_30; }
	}
	public class GSSTmTcFormatCSFormulaFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSFormulaField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatCSFormulaFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionIDTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSTmTcFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Assignment cFormulaAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cFormulaGSSTmTcFormatFormulaParserRuleCall_29_0 = (RuleCall)cFormulaAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSTmTcFormatCSFormulaField:
		//	'GSSTmTcFormatCSFormulaField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
		//	'type' ':=' type=GSSTmTcFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//	size=GSSTmTcFormatSize
		//	globalOffset=GSSTmTcFormatGlobalOffset
		//	formula=GSSTmTcFormatFormula
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatCSFormulaField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';'
		//('description' ':=' description=ID ';')? 'type' ':=' type=GSSTmTcFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSTmTcFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//size=GSSTmTcFormatSize globalOffset=GSSTmTcFormatGlobalOffset formula=GSSTmTcFormatFormula '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatCSFormulaField'
		public Keyword getGSSTmTcFormatCSFormulaFieldKeyword_0() { return cGSSTmTcFormatCSFormulaFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=ID ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=ID
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//ID
		public RuleCall getDescriptionIDTerminalRuleCall_14_2_0() { return cDescriptionIDTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSTmTcFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSTmTcFormatFieldType
		public RuleCall getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSTmTcFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSTmTcFormatFieldByteOrder
		public RuleCall getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSTmTcFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSTmTcFormatSFieldFirstBit
		public RuleCall getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSTmTcFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSTmTcFormatSize
		public RuleCall getSizeGSSTmTcFormatSizeParserRuleCall_27_0() { return cSizeGSSTmTcFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=GSSTmTcFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//GSSTmTcFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0; }
		
		//formula=GSSTmTcFormatFormula
		public Assignment getFormulaAssignment_29() { return cFormulaAssignment_29; }
		
		//GSSTmTcFormatFormula
		public RuleCall getFormulaGSSTmTcFormatFormulaParserRuleCall_29_0() { return cFormulaGSSTmTcFormatFormulaParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSTmTcFormatVSFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVSField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatVSFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionIDTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cConstSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0 = (RuleCall)cConstSizeAssignment_27.eContents().get(0);
		private final Assignment cMaxSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_28_0 = (RuleCall)cMaxSizeAssignment_28.eContents().get(0);
		private final Assignment cVariableSizeAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_29_0 = (RuleCall)cVariableSizeAssignment_29.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_30 = (Assignment)cGroup.eContents().get(30);
		private final RuleCall cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_30_0 = (RuleCall)cGlobalOffsetAssignment_30.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_31 = (Keyword)cGroup.eContents().get(31);
		private final Keyword cSemicolonKeyword_32 = (Keyword)cGroup.eContents().get(32);
		
		//GSSTmTcFormatVSField:
		//	'GSSTmTcFormatVSField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
		//	'type' ':=' type=GSSTmTcFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//	constSize=GSSTmTcFormatConstSize
		//	maxSize=GSSTmTcFormatMaxSize
		//	variableSize=GSSTmTcFormatVariableSize
		//	globalOffset=GSSTmTcFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatVSField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';'
		//('description' ':=' description=ID ';')? 'type' ':=' type=GSSTmTcFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSTmTcFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//constSize=GSSTmTcFormatConstSize maxSize=GSSTmTcFormatMaxSize variableSize=GSSTmTcFormatVariableSize
		//globalOffset=GSSTmTcFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatVSField'
		public Keyword getGSSTmTcFormatVSFieldKeyword_0() { return cGSSTmTcFormatVSFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=ID ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=ID
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//ID
		public RuleCall getDescriptionIDTerminalRuleCall_14_2_0() { return cDescriptionIDTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSTmTcFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSTmTcFormatFieldType
		public RuleCall getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSTmTcFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSTmTcFormatFieldByteOrder
		public RuleCall getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSTmTcFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSTmTcFormatSFieldFirstBit
		public RuleCall getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//constSize=GSSTmTcFormatConstSize
		public Assignment getConstSizeAssignment_27() { return cConstSizeAssignment_27; }
		
		//GSSTmTcFormatConstSize
		public RuleCall getConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0() { return cConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0; }
		
		//maxSize=GSSTmTcFormatMaxSize
		public Assignment getMaxSizeAssignment_28() { return cMaxSizeAssignment_28; }
		
		//GSSTmTcFormatMaxSize
		public RuleCall getMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_28_0() { return cMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_28_0; }
		
		//variableSize=GSSTmTcFormatVariableSize
		public Assignment getVariableSizeAssignment_29() { return cVariableSizeAssignment_29; }
		
		//GSSTmTcFormatVariableSize
		public RuleCall getVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_29_0() { return cVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_29_0; }
		
		//globalOffset=GSSTmTcFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_30() { return cGlobalOffsetAssignment_30; }
		
		//GSSTmTcFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_30_0() { return cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_30_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_31() { return cRightCurlyBracketKeyword_31; }
		
		//';'
		public Keyword getSemicolonKeyword_32() { return cSemicolonKeyword_32; }
	}
	public class GSSTmTcFormatVRFieldSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVRFieldSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatVRFieldSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//GSSTmTcFormatVRFieldSize:
		//	'GSSTmTcFormatVRFieldSize' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatVRFieldSize' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatVRFieldSize'
		public Keyword getGSSTmTcFormatVRFieldSizeKeyword_0() { return cGSSTmTcFormatVRFieldSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class GSSTmTcFormatFDICFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFDICField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatFDICFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionIDTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cCheckTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cCheckTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0 = (RuleCall)cCheckTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSTmTcFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cFloatingOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0 = (RuleCall)cFloatingOffsetAssignment_28.eContents().get(0);
		private final Assignment cSortedFieldsToCheckAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0 = (RuleCall)cSortedFieldsToCheckAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSTmTcFormatFDICField:
		//	'GSSTmTcFormatFDICField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
		//	'checkType' ':=' checkType=GSSTmTcFormatCheckType ';'
		//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//	size=GSSTmTcFormatSize
		//	floatingOffset=GSSTmTcFormatFloatingOffset
		//	sortedFieldsToCheck=GSSTmTcFormatSortedFieldsToCheck
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatFDICField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';'
		//('description' ':=' description=ID ';')? 'checkType' ':=' checkType=GSSTmTcFormatCheckType ';' 'byteOrder' ':='
		//byteOrder=GSSTmTcFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//size=GSSTmTcFormatSize floatingOffset=GSSTmTcFormatFloatingOffset sortedFieldsToCheck=GSSTmTcFormatSortedFieldsToCheck
		//'}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatFDICField'
		public Keyword getGSSTmTcFormatFDICFieldKeyword_0() { return cGSSTmTcFormatFDICFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=ID ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=ID
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//ID
		public RuleCall getDescriptionIDTerminalRuleCall_14_2_0() { return cDescriptionIDTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'checkType'
		public Keyword getCheckTypeKeyword_15() { return cCheckTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//checkType=GSSTmTcFormatCheckType
		public Assignment getCheckTypeAssignment_17() { return cCheckTypeAssignment_17; }
		
		//GSSTmTcFormatCheckType
		public RuleCall getCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0() { return cCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSTmTcFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSTmTcFormatFieldByteOrder
		public RuleCall getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSTmTcFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSTmTcFormatSFieldFirstBit
		public RuleCall getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSTmTcFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSTmTcFormatSize
		public RuleCall getSizeGSSTmTcFormatSizeParserRuleCall_27_0() { return cSizeGSSTmTcFormatSizeParserRuleCall_27_0; }
		
		//floatingOffset=GSSTmTcFormatFloatingOffset
		public Assignment getFloatingOffsetAssignment_28() { return cFloatingOffsetAssignment_28; }
		
		//GSSTmTcFormatFloatingOffset
		public RuleCall getFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0() { return cFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0; }
		
		//sortedFieldsToCheck=GSSTmTcFormatSortedFieldsToCheck
		public Assignment getSortedFieldsToCheckAssignment_29() { return cSortedFieldsToCheckAssignment_29; }
		
		//GSSTmTcFormatSortedFieldsToCheck
		public RuleCall getSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0() { return cSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSTmTcFormatAFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatAFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionIDTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSTmTcFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Assignment cArrayDimensionAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0 = (RuleCall)cArrayDimensionAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSTmTcFormatAField:
		//	'GSSTmTcFormatAField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
		//	'type' ':=' type=GSSTmTcFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//	size=GSSTmTcFormatSize
		//	globalOffset=GSSTmTcFormatGlobalOffset
		//	arrayDimension=GSSTmTcFormatArrayDimension
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatAField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';' ('description'
		//':=' description=ID ';')? 'type' ':=' type=GSSTmTcFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSTmTcFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//size=GSSTmTcFormatSize globalOffset=GSSTmTcFormatGlobalOffset arrayDimension=GSSTmTcFormatArrayDimension '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatAField'
		public Keyword getGSSTmTcFormatAFieldKeyword_0() { return cGSSTmTcFormatAFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=ID ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=ID
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//ID
		public RuleCall getDescriptionIDTerminalRuleCall_14_2_0() { return cDescriptionIDTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSTmTcFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSTmTcFormatFieldType
		public RuleCall getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSTmTcFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSTmTcFormatFieldByteOrder
		public RuleCall getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSTmTcFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSTmTcFormatSFieldFirstBit
		public RuleCall getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSTmTcFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSTmTcFormatSize
		public RuleCall getSizeGSSTmTcFormatSizeParserRuleCall_27_0() { return cSizeGSSTmTcFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=GSSTmTcFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//GSSTmTcFormatGlobalOffset
		public RuleCall getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0; }
		
		//arrayDimension=GSSTmTcFormatArrayDimension
		public Assignment getArrayDimensionAssignment_29() { return cArrayDimensionAssignment_29; }
		
		//GSSTmTcFormatArrayDimension
		public RuleCall getArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0() { return cArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSTmTcFormatAIFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAIField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatAIFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameIDTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionIDTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeGSSTmTcFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cLocalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0 = (RuleCall)cLocalOffsetAssignment_28.eContents().get(0);
		private final Assignment cArrayRefAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0 = (RuleCall)cArrayRefAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//GSSTmTcFormatAIField:
		//	'GSSTmTcFormatAIField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
		//	'type' ':=' type=GSSTmTcFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//	size=GSSTmTcFormatSize
		//	localOffset=GSSTmTcFormatLocalOffset
		//	arrayRef=GSSTmTcFormatArrayRef
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatAIField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=ID ';'
		//('description' ':=' description=ID ';')? 'type' ':=' type=GSSTmTcFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=GSSTmTcFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
		//size=GSSTmTcFormatSize localOffset=GSSTmTcFormatLocalOffset arrayRef=GSSTmTcFormatArrayRef '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatAIField'
		public Keyword getGSSTmTcFormatAIFieldKeyword_0() { return cGSSTmTcFormatAIFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=ID
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_12_0() { return cNameIDTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=ID ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=ID
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//ID
		public RuleCall getDescriptionIDTerminalRuleCall_14_2_0() { return cDescriptionIDTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=GSSTmTcFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//GSSTmTcFormatFieldType
		public RuleCall getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0() { return cTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=GSSTmTcFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//GSSTmTcFormatFieldByteOrder
		public RuleCall getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=GSSTmTcFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//GSSTmTcFormatSFieldFirstBit
		public RuleCall getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=GSSTmTcFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//GSSTmTcFormatSize
		public RuleCall getSizeGSSTmTcFormatSizeParserRuleCall_27_0() { return cSizeGSSTmTcFormatSizeParserRuleCall_27_0; }
		
		//localOffset=GSSTmTcFormatLocalOffset
		public Assignment getLocalOffsetAssignment_28() { return cLocalOffsetAssignment_28; }
		
		//GSSTmTcFormatLocalOffset
		public RuleCall getLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0() { return cLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0; }
		
		//arrayRef=GSSTmTcFormatArrayRef
		public Assignment getArrayRefAssignment_29() { return cArrayRefAssignment_29; }
		
		//GSSTmTcFormatArrayRef
		public RuleCall getArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0() { return cArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class GSSTmTcFormatSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatSize:
		//	'GSSTmTcFormatSize'
		//	'{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatSize'
		public Keyword getGSSTmTcFormatSizeKeyword_0() { return cGSSTmTcFormatSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatGlobalOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatGlobalOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatGlobalOffset:
		//	'GSSTmTcFormatGlobalOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatGlobalOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatGlobalOffset'
		public Keyword getGSSTmTcFormatGlobalOffsetKeyword_0() { return cGSSTmTcFormatGlobalOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatFormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFormula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatFormulaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSlopeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSlopeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSlopeSTRINGTerminalRuleCall_4_0 = (RuleCall)cSlopeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cInterceptKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cInterceptAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cInterceptSTRINGTerminalRuleCall_8_0 = (RuleCall)cInterceptAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatFormula:
		//	'GSSTmTcFormatFormula' '{'
		//	'slope' ':=' slope=STRING ';'
		//	'intercept' ':=' intercept=STRING ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatFormula' '{' 'slope' ':=' slope=STRING ';' 'intercept' ':=' intercept=STRING ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatFormula'
		public Keyword getGSSTmTcFormatFormulaKeyword_0() { return cGSSTmTcFormatFormulaKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'slope'
		public Keyword getSlopeKeyword_2() { return cSlopeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//slope=STRING
		public Assignment getSlopeAssignment_4() { return cSlopeAssignment_4; }
		
		//STRING
		public RuleCall getSlopeSTRINGTerminalRuleCall_4_0() { return cSlopeSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'intercept'
		public Keyword getInterceptKeyword_6() { return cInterceptKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//intercept=STRING
		public Assignment getInterceptAssignment_8() { return cInterceptAssignment_8; }
		
		//STRING
		public RuleCall getInterceptSTRINGTerminalRuleCall_8_0() { return cInterceptSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatConstSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatConstSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatConstSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatConstSize:
		//	'GSSTmTcFormatConstSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatConstSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatConstSize'
		public Keyword getGSSTmTcFormatConstSizeKeyword_0() { return cGSSTmTcFormatConstSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatMaxSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatMaxSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatMaxSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatMaxSize:
		//	'GSSTmTcFormatMaxSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatMaxSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatMaxSize'
		public Keyword getGSSTmTcFormatMaxSizeKeyword_0() { return cGSSTmTcFormatMaxSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatVariableSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVariableSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatVariableSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cUnitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cUnitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cUnitGSSTmTcFormatUnitEnumRuleCall_8_0 = (RuleCall)cUnitAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cPowerKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cPowerAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0 = (RuleCall)cPowerAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//GSSTmTcFormatVariableSize:
		//	'GSSTmTcFormatVariableSize' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'unit' ':=' unit=GSSTmTcFormatUnit ';' ('power' ':=' power=GSSTmTcFormatPower ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatVariableSize' '{' 'fidRef' ':=' fidRef=INTEGER ';' 'unit' ':=' unit=GSSTmTcFormatUnit ';' ('power' ':='
		//power=GSSTmTcFormatPower ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatVariableSize'
		public Keyword getGSSTmTcFormatVariableSizeKeyword_0() { return cGSSTmTcFormatVariableSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'unit'
		public Keyword getUnitKeyword_6() { return cUnitKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//unit=GSSTmTcFormatUnit
		public Assignment getUnitAssignment_8() { return cUnitAssignment_8; }
		
		//GSSTmTcFormatUnit
		public RuleCall getUnitGSSTmTcFormatUnitEnumRuleCall_8_0() { return cUnitGSSTmTcFormatUnitEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('power' ':=' power=GSSTmTcFormatPower ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'power'
		public Keyword getPowerKeyword_10_0() { return cPowerKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//power=GSSTmTcFormatPower
		public Assignment getPowerAssignment_10_2() { return cPowerAssignment_10_2; }
		
		//GSSTmTcFormatPower
		public RuleCall getPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0() { return cPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class GSSTmTcFormatFloatingOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFloatingOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatFloatingOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSTmTcFormatFloatingOffset:
		//	'GSSTmTcFormatFloatingOffset' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatFloatingOffset' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatFloatingOffset'
		public Keyword getGSSTmTcFormatFloatingOffsetKeyword_0() { return cGSSTmTcFormatFloatingOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSTmTcFormatSortedFieldsToCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSortedFieldsToCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGSSTmTcFormatSortedFieldsToCheckAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGSSTmTcFormatSortedFieldsToCheckKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldToCheckAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0 = (RuleCall)cFieldToCheckAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GSSTmTcFormatSortedFieldsToCheck:
		//	{GSSTmTcFormatSortedFieldsToCheck}
		//	'GSSTmTcFormatSortedFieldsToCheck' '{'
		//	fieldToCheck+=GSSTmTcFormatFieldToCheck+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{GSSTmTcFormatSortedFieldsToCheck} 'GSSTmTcFormatSortedFieldsToCheck' '{' fieldToCheck+=GSSTmTcFormatFieldToCheck+ '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//{GSSTmTcFormatSortedFieldsToCheck}
		public Action getGSSTmTcFormatSortedFieldsToCheckAction_0() { return cGSSTmTcFormatSortedFieldsToCheckAction_0; }
		
		//'GSSTmTcFormatSortedFieldsToCheck'
		public Keyword getGSSTmTcFormatSortedFieldsToCheckKeyword_1() { return cGSSTmTcFormatSortedFieldsToCheckKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fieldToCheck+=GSSTmTcFormatFieldToCheck+
		public Assignment getFieldToCheckAssignment_3() { return cFieldToCheckAssignment_3; }
		
		//GSSTmTcFormatFieldToCheck
		public RuleCall getFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0() { return cFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class GSSTmTcFormatFieldToCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldToCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatFieldToCheckKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSTmTcFormatFieldToCheck:
		//	'GSSTmTcFormatFieldToCheck' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatFieldToCheck' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatFieldToCheck'
		public Keyword getGSSTmTcFormatFieldToCheckKeyword_0() { return cGSSTmTcFormatFieldToCheckKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class GSSTmTcFormatArrayDimensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatArrayDimension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatArrayDimensionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMaxItemsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMaxItemsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMaxItemsINTEGERParserRuleCall_8_0 = (RuleCall)cMaxItemsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatArrayDimension:
		//	'GSSTmTcFormatArrayDimension' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'maxItems' ':=' maxItems=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatArrayDimension' '{' 'fidRef' ':=' fidRef=INTEGER ';' 'maxItems' ':=' maxItems=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatArrayDimension'
		public Keyword getGSSTmTcFormatArrayDimensionKeyword_0() { return cGSSTmTcFormatArrayDimensionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'maxItems'
		public Keyword getMaxItemsKeyword_6() { return cMaxItemsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//maxItems=INTEGER
		public Assignment getMaxItemsAssignment_8() { return cMaxItemsAssignment_8; }
		
		//INTEGER
		public RuleCall getMaxItemsINTEGERParserRuleCall_8_0() { return cMaxItemsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatLocalOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatLocalOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatLocalOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//GSSTmTcFormatLocalOffset:
		//	'GSSTmTcFormatLocalOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatLocalOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatLocalOffset'
		public Keyword getGSSTmTcFormatLocalOffsetKeyword_0() { return cGSSTmTcFormatLocalOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class GSSTmTcFormatArrayRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatArrayRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGSSTmTcFormatArrayRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GSSTmTcFormatArrayRef:
		//	'GSSTmTcFormatArrayRef' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'GSSTmTcFormatArrayRef' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'GSSTmTcFormatArrayRef'
		public Keyword getGSSTmTcFormatArrayRefKeyword_0() { return cGSSTmTcFormatArrayRefKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }
		
		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }
		
		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}
	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false'
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//REAL:
		//	'-'? (INT '.' INT) ('e' '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? (INT '.' INT) ('e' '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//(INT '.' INT)
		public Group getGroup_1() { return cGroup_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_2() { return cINTTerminalRuleCall_1_2; }
		
		//('e' '-'? INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'e'
		public Keyword getEKeyword_2_0() { return cEKeyword_2_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}
	
	public class GSSTmTcFormatTmTcFormatTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTcFormatType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTMEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTMTMKeyword_0_0 = (Keyword)cTMEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTCTCKeyword_1_0 = (Keyword)cTCEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSTmTcFormatTmTcFormatType:
		//	TM | TC;
		public EnumRule getRule() { return rule; }
		
		//TM | TC
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TM
		public EnumLiteralDeclaration getTMEnumLiteralDeclaration_0() { return cTMEnumLiteralDeclaration_0; }
		
		//'TM'
		public Keyword getTMTMKeyword_0_0() { return cTMTMKeyword_0_0; }
		
		//TC
		public EnumLiteralDeclaration getTCEnumLiteralDeclaration_1() { return cTCEnumLiteralDeclaration_1; }
		
		//'TC'
		public Keyword getTCTCKeyword_1_0() { return cTCTCKeyword_1_0; }
	}
	public class GSSTmTcFormatFieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStructuredEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStructuredStructuredKeyword_0_0 = (Keyword)cStructuredEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cUintEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cUintUintKeyword_1_0 = (Keyword)cUintEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFlagEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFlagFlagKeyword_2_0 = (Keyword)cFlagEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cEnumeratedEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cEnumeratedEnumeratedKeyword_3_0 = (Keyword)cEnumeratedEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBit_vectorEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBit_vectorBit_vectorKeyword_4_0 = (Keyword)cBit_vectorEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cByte_vectorEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cByte_vectorByte_vectorKeyword_5_0 = (Keyword)cByte_vectorEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cFloatFloatKeyword_6_0 = (Keyword)cFloatEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDeducedEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDeducedDeducedKeyword_7_0 = (Keyword)cDeducedEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum GSSTmTcFormatFieldType:
		//	structured | uint | flag |
		//	enumerated | bit_vector |
		//	byte_vector | float | deduced;
		public EnumRule getRule() { return rule; }
		
		//structured | uint | flag | enumerated | bit_vector | byte_vector | float | deduced
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//structured
		public EnumLiteralDeclaration getStructuredEnumLiteralDeclaration_0() { return cStructuredEnumLiteralDeclaration_0; }
		
		//'structured'
		public Keyword getStructuredStructuredKeyword_0_0() { return cStructuredStructuredKeyword_0_0; }
		
		//uint
		public EnumLiteralDeclaration getUintEnumLiteralDeclaration_1() { return cUintEnumLiteralDeclaration_1; }
		
		//'uint'
		public Keyword getUintUintKeyword_1_0() { return cUintUintKeyword_1_0; }
		
		//flag
		public EnumLiteralDeclaration getFlagEnumLiteralDeclaration_2() { return cFlagEnumLiteralDeclaration_2; }
		
		//'flag'
		public Keyword getFlagFlagKeyword_2_0() { return cFlagFlagKeyword_2_0; }
		
		//enumerated
		public EnumLiteralDeclaration getEnumeratedEnumLiteralDeclaration_3() { return cEnumeratedEnumLiteralDeclaration_3; }
		
		//'enumerated'
		public Keyword getEnumeratedEnumeratedKeyword_3_0() { return cEnumeratedEnumeratedKeyword_3_0; }
		
		//bit_vector
		public EnumLiteralDeclaration getBit_vectorEnumLiteralDeclaration_4() { return cBit_vectorEnumLiteralDeclaration_4; }
		
		//'bit_vector'
		public Keyword getBit_vectorBit_vectorKeyword_4_0() { return cBit_vectorBit_vectorKeyword_4_0; }
		
		//byte_vector
		public EnumLiteralDeclaration getByte_vectorEnumLiteralDeclaration_5() { return cByte_vectorEnumLiteralDeclaration_5; }
		
		//'byte_vector'
		public Keyword getByte_vectorByte_vectorKeyword_5_0() { return cByte_vectorByte_vectorKeyword_5_0; }
		
		//float
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_6() { return cFloatEnumLiteralDeclaration_6; }
		
		//'float'
		public Keyword getFloatFloatKeyword_6_0() { return cFloatFloatKeyword_6_0; }
		
		//deduced
		public EnumLiteralDeclaration getDeducedEnumLiteralDeclaration_7() { return cDeducedEnumLiteralDeclaration_7; }
		
		//'deduced'
		public Keyword getDeducedDeducedKeyword_7_0() { return cDeducedDeducedKeyword_7_0; }
	}
	public class GSSTmTcFormatFieldByteOrderElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBig_endianEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBig_endianBig_endianKeyword_0_0 = (Keyword)cBig_endianEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLittle_endianEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLittle_endianLittle_endianKeyword_1_0 = (Keyword)cLittle_endianEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNaEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNaNaKeyword_2_0 = (Keyword)cNaEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum GSSTmTcFormatFieldByteOrder:
		//	big_endian | little_endian | na;
		public EnumRule getRule() { return rule; }
		
		//big_endian | little_endian | na
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//big_endian
		public EnumLiteralDeclaration getBig_endianEnumLiteralDeclaration_0() { return cBig_endianEnumLiteralDeclaration_0; }
		
		//'big_endian'
		public Keyword getBig_endianBig_endianKeyword_0_0() { return cBig_endianBig_endianKeyword_0_0; }
		
		//little_endian
		public EnumLiteralDeclaration getLittle_endianEnumLiteralDeclaration_1() { return cLittle_endianEnumLiteralDeclaration_1; }
		
		//'little_endian'
		public Keyword getLittle_endianLittle_endianKeyword_1_0() { return cLittle_endianLittle_endianKeyword_1_0; }
		
		//na
		public EnumLiteralDeclaration getNaEnumLiteralDeclaration_2() { return cNaEnumLiteralDeclaration_2; }
		
		//'na'
		public Keyword getNaNaKeyword_2_0() { return cNaNaKeyword_2_0; }
	}
	public class GSSTmTcFormatSFieldFirstBitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMSBEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMSBMSBKeyword_0_0 = (Keyword)cMSBEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLSBEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLSBLSBKeyword_1_0 = (Keyword)cLSBEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSTmTcFormatSFieldFirstBit:
		//	MSB | LSB;
		public EnumRule getRule() { return rule; }
		
		//MSB | LSB
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MSB
		public EnumLiteralDeclaration getMSBEnumLiteralDeclaration_0() { return cMSBEnumLiteralDeclaration_0; }
		
		//'MSB'
		public Keyword getMSBMSBKeyword_0_0() { return cMSBMSBKeyword_0_0; }
		
		//LSB
		public EnumLiteralDeclaration getLSBEnumLiteralDeclaration_1() { return cLSBEnumLiteralDeclaration_1; }
		
		//'LSB'
		public Keyword getLSBLSBKeyword_1_0() { return cLSBLSBKeyword_1_0; }
	}
	public class GSSTmTcFormatUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBytesBytesKeyword_0_0 = (Keyword)cBytesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBitsBitsKeyword_1_0 = (Keyword)cBitsEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cHalfwordEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cHalfwordHalfwordKeyword_2_0 = (Keyword)cHalfwordEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cString10EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cString10String10Keyword_3_0 = (Keyword)cString10EnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cString17EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cString17String17Keyword_4_0 = (Keyword)cString17EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cString69EnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cString69String69Keyword_5_0 = (Keyword)cString69EnumLiteralDeclaration_5.eContents().get(0);
		
		//enum GSSTmTcFormatUnit:
		//	bytes | bits |
		//	halfword | string10 |
		//	string17 | string69;
		public EnumRule getRule() { return rule; }
		
		//bytes | bits | halfword | string10 | string17 | string69
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//bytes
		public EnumLiteralDeclaration getBytesEnumLiteralDeclaration_0() { return cBytesEnumLiteralDeclaration_0; }
		
		//'bytes'
		public Keyword getBytesBytesKeyword_0_0() { return cBytesBytesKeyword_0_0; }
		
		//bits
		public EnumLiteralDeclaration getBitsEnumLiteralDeclaration_1() { return cBitsEnumLiteralDeclaration_1; }
		
		//'bits'
		public Keyword getBitsBitsKeyword_1_0() { return cBitsBitsKeyword_1_0; }
		
		//halfword
		public EnumLiteralDeclaration getHalfwordEnumLiteralDeclaration_2() { return cHalfwordEnumLiteralDeclaration_2; }
		
		//'halfword'
		public Keyword getHalfwordHalfwordKeyword_2_0() { return cHalfwordHalfwordKeyword_2_0; }
		
		//string10
		public EnumLiteralDeclaration getString10EnumLiteralDeclaration_3() { return cString10EnumLiteralDeclaration_3; }
		
		//'string10'
		public Keyword getString10String10Keyword_3_0() { return cString10String10Keyword_3_0; }
		
		//string17
		public EnumLiteralDeclaration getString17EnumLiteralDeclaration_4() { return cString17EnumLiteralDeclaration_4; }
		
		//'string17'
		public Keyword getString17String17Keyword_4_0() { return cString17String17Keyword_4_0; }
		
		//string69
		public EnumLiteralDeclaration getString69EnumLiteralDeclaration_5() { return cString69EnumLiteralDeclaration_5; }
		
		//'string69'
		public Keyword getString69String69Keyword_5_0() { return cString69String69Keyword_5_0; }
	}
	public class GSSTmTcFormatPowerElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatPower");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_22bitsKeyword_0_0 = (Keyword)c_2EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2_with_0EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_2_with_02bits_with_0Keyword_1_0 = (Keyword)c_2_with_0EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSTmTcFormatPower:
		//	_2='2bits' | _2_with_0='2bits_with_0';
		public EnumRule getRule() { return rule; }
		
		//_2='2bits' | _2_with_0='2bits_with_0'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_2='2bits'
		public EnumLiteralDeclaration get_2EnumLiteralDeclaration_0() { return c_2EnumLiteralDeclaration_0; }
		
		//'2bits'
		public Keyword get_22bitsKeyword_0_0() { return c_22bitsKeyword_0_0; }
		
		//_2_with_0='2bits_with_0'
		public EnumLiteralDeclaration get_2_with_0EnumLiteralDeclaration_1() { return c_2_with_0EnumLiteralDeclaration_1; }
		
		//'2bits_with_0'
		public Keyword get_2_with_02bits_with_0Keyword_1_0() { return c_2_with_02bits_with_0Keyword_1_0; }
	}
	public class GSSTmTcFormatCheckTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCheckType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCrc16EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCrc16Crc16Keyword_0_0 = (Keyword)cCrc16EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cChecksum16EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cChecksum16Checksum16Keyword_1_0 = (Keyword)cChecksum16EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GSSTmTcFormatCheckType:
		//	crc16 | checksum16;
		public EnumRule getRule() { return rule; }
		
		//crc16 | checksum16
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//crc16
		public EnumLiteralDeclaration getCrc16EnumLiteralDeclaration_0() { return cCrc16EnumLiteralDeclaration_0; }
		
		//'crc16'
		public Keyword getCrc16Crc16Keyword_0_0() { return cCrc16Crc16Keyword_0_0; }
		
		//checksum16
		public EnumLiteralDeclaration getChecksum16EnumLiteralDeclaration_1() { return cChecksum16EnumLiteralDeclaration_1; }
		
		//'checksum16'
		public Keyword getChecksum16Checksum16Keyword_1_0() { return cChecksum16Checksum16Keyword_1_0; }
	}
	
	private final GSSModelFileElements pGSSModelFile;
	private final GSSModelFileImportElements pGSSModelFileImport;
	private final GSSTmTcFormatTmTcFormatElements pGSSTmTcFormatTmTcFormat;
	private final GSSTmTcFormatTmTcFormatTypeElements eGSSTmTcFormatTmTcFormatType;
	private final GSSTmTcFormatFieldElements pGSSTmTcFormatField;
	private final GSSTmTcFormatCSFieldElements pGSSTmTcFormatCSField;
	private final GSSTmTcFormatCSFormulaFieldElements pGSSTmTcFormatCSFormulaField;
	private final GSSTmTcFormatVSFieldElements pGSSTmTcFormatVSField;
	private final GSSTmTcFormatVRFieldSizeElements pGSSTmTcFormatVRFieldSize;
	private final GSSTmTcFormatFDICFieldElements pGSSTmTcFormatFDICField;
	private final GSSTmTcFormatAFieldElements pGSSTmTcFormatAField;
	private final GSSTmTcFormatAIFieldElements pGSSTmTcFormatAIField;
	private final GSSTmTcFormatFieldTypeElements eGSSTmTcFormatFieldType;
	private final GSSTmTcFormatFieldByteOrderElements eGSSTmTcFormatFieldByteOrder;
	private final GSSTmTcFormatSFieldFirstBitElements eGSSTmTcFormatSFieldFirstBit;
	private final GSSTmTcFormatSizeElements pGSSTmTcFormatSize;
	private final GSSTmTcFormatGlobalOffsetElements pGSSTmTcFormatGlobalOffset;
	private final GSSTmTcFormatFormulaElements pGSSTmTcFormatFormula;
	private final GSSTmTcFormatConstSizeElements pGSSTmTcFormatConstSize;
	private final GSSTmTcFormatMaxSizeElements pGSSTmTcFormatMaxSize;
	private final GSSTmTcFormatVariableSizeElements pGSSTmTcFormatVariableSize;
	private final GSSTmTcFormatUnitElements eGSSTmTcFormatUnit;
	private final GSSTmTcFormatPowerElements eGSSTmTcFormatPower;
	private final GSSTmTcFormatCheckTypeElements eGSSTmTcFormatCheckType;
	private final GSSTmTcFormatFloatingOffsetElements pGSSTmTcFormatFloatingOffset;
	private final GSSTmTcFormatSortedFieldsToCheckElements pGSSTmTcFormatSortedFieldsToCheck;
	private final GSSTmTcFormatFieldToCheckElements pGSSTmTcFormatFieldToCheck;
	private final GSSTmTcFormatArrayDimensionElements pGSSTmTcFormatArrayDimension;
	private final GSSTmTcFormatLocalOffsetElements pGSSTmTcFormatLocalOffset;
	private final GSSTmTcFormatArrayRefElements pGSSTmTcFormatArrayRef;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final EBooleanElements pEBoolean;
	private final REALElements pREAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TM_TC_FORMATGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGSSModelFile = new GSSModelFileElements();
		this.pGSSModelFileImport = new GSSModelFileImportElements();
		this.pGSSTmTcFormatTmTcFormat = new GSSTmTcFormatTmTcFormatElements();
		this.eGSSTmTcFormatTmTcFormatType = new GSSTmTcFormatTmTcFormatTypeElements();
		this.pGSSTmTcFormatField = new GSSTmTcFormatFieldElements();
		this.pGSSTmTcFormatCSField = new GSSTmTcFormatCSFieldElements();
		this.pGSSTmTcFormatCSFormulaField = new GSSTmTcFormatCSFormulaFieldElements();
		this.pGSSTmTcFormatVSField = new GSSTmTcFormatVSFieldElements();
		this.pGSSTmTcFormatVRFieldSize = new GSSTmTcFormatVRFieldSizeElements();
		this.pGSSTmTcFormatFDICField = new GSSTmTcFormatFDICFieldElements();
		this.pGSSTmTcFormatAField = new GSSTmTcFormatAFieldElements();
		this.pGSSTmTcFormatAIField = new GSSTmTcFormatAIFieldElements();
		this.eGSSTmTcFormatFieldType = new GSSTmTcFormatFieldTypeElements();
		this.eGSSTmTcFormatFieldByteOrder = new GSSTmTcFormatFieldByteOrderElements();
		this.eGSSTmTcFormatSFieldFirstBit = new GSSTmTcFormatSFieldFirstBitElements();
		this.pGSSTmTcFormatSize = new GSSTmTcFormatSizeElements();
		this.pGSSTmTcFormatGlobalOffset = new GSSTmTcFormatGlobalOffsetElements();
		this.pGSSTmTcFormatFormula = new GSSTmTcFormatFormulaElements();
		this.pGSSTmTcFormatConstSize = new GSSTmTcFormatConstSizeElements();
		this.pGSSTmTcFormatMaxSize = new GSSTmTcFormatMaxSizeElements();
		this.pGSSTmTcFormatVariableSize = new GSSTmTcFormatVariableSizeElements();
		this.eGSSTmTcFormatUnit = new GSSTmTcFormatUnitElements();
		this.eGSSTmTcFormatPower = new GSSTmTcFormatPowerElements();
		this.eGSSTmTcFormatCheckType = new GSSTmTcFormatCheckTypeElements();
		this.pGSSTmTcFormatFloatingOffset = new GSSTmTcFormatFloatingOffsetElements();
		this.pGSSTmTcFormatSortedFieldsToCheck = new GSSTmTcFormatSortedFieldsToCheckElements();
		this.pGSSTmTcFormatFieldToCheck = new GSSTmTcFormatFieldToCheckElements();
		this.pGSSTmTcFormatArrayDimension = new GSSTmTcFormatArrayDimensionElements();
		this.pGSSTmTcFormatLocalOffset = new GSSTmTcFormatLocalOffsetElements();
		this.pGSSTmTcFormatArrayRef = new GSSTmTcFormatArrayRefElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GSSModelFile common::GSSModelFile:
	//	imports+=GSSModelFileImport*
	//	element=GSSTmTcFormatTmTcFormat
	public GSSModelFileElements getGSSModelFileAccess() {
		return pGSSModelFile;
	}
	
	public ParserRule getGSSModelFileRule() {
		return getGSSModelFileAccess().getRule();
	}
	
	//GSSModelFileImport common::GSSModelFileImport:
	//	'import' ':=' importURI=STRING ';'
	public GSSModelFileImportElements getGSSModelFileImportAccess() {
		return pGSSModelFileImport;
	}
	
	public ParserRule getGSSModelFileImportRule() {
		return getGSSModelFileImportAccess().getRule();
	}
	
	//GSSTmTcFormatTmTcFormat:
	//	'GSSTmTcFormatTmTcFormat'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol' ':=' protocol=ID ';' &
	//	('type' ':=' type=GSSTmTcFormatTmTcFormatType ';') (CSField+=GSSTmTcFormatCSField |
	//	CSFormulaField+=GSSTmTcFormatCSFormulaField | VSField+=GSSTmTcFormatVSField | FDICField+=GSSTmTcFormatFDICField |
	//	VRFieldSize+=GSSTmTcFormatVRFieldSize | AField+=GSSTmTcFormatAField | AIField+=GSSTmTcFormatAIField)*)
	//	'}' ';';
	public GSSTmTcFormatTmTcFormatElements getGSSTmTcFormatTmTcFormatAccess() {
		return pGSSTmTcFormatTmTcFormat;
	}
	
	public ParserRule getGSSTmTcFormatTmTcFormatRule() {
		return getGSSTmTcFormatTmTcFormatAccess().getRule();
	}
	
	//enum GSSTmTcFormatTmTcFormatType:
	//	TM | TC;
	public GSSTmTcFormatTmTcFormatTypeElements getGSSTmTcFormatTmTcFormatTypeAccess() {
		return eGSSTmTcFormatTmTcFormatType;
	}
	
	public EnumRule getGSSTmTcFormatTmTcFormatTypeRule() {
		return getGSSTmTcFormatTmTcFormatTypeAccess().getRule();
	}
	
	//GSSTmTcFormatField:
	//	GSSTmTcFormatCSField | GSSTmTcFormatCSFormulaField | GSSTmTcFormatVSField | GSSTmTcFormatVRFieldSize |
	//	GSSTmTcFormatFDICField;
	public GSSTmTcFormatFieldElements getGSSTmTcFormatFieldAccess() {
		return pGSSTmTcFormatField;
	}
	
	public ParserRule getGSSTmTcFormatFieldRule() {
		return getGSSTmTcFormatFieldAccess().getRule();
	}
	
	//GSSTmTcFormatCSField:
	//	'GSSTmTcFormatCSField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
	//	'type' ':=' type=GSSTmTcFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
	//	size=GSSTmTcFormatSize
	//	globalOffset=GSSTmTcFormatGlobalOffset
	//	'}' ';';
	public GSSTmTcFormatCSFieldElements getGSSTmTcFormatCSFieldAccess() {
		return pGSSTmTcFormatCSField;
	}
	
	public ParserRule getGSSTmTcFormatCSFieldRule() {
		return getGSSTmTcFormatCSFieldAccess().getRule();
	}
	
	//GSSTmTcFormatCSFormulaField:
	//	'GSSTmTcFormatCSFormulaField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
	//	'type' ':=' type=GSSTmTcFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
	//	size=GSSTmTcFormatSize
	//	globalOffset=GSSTmTcFormatGlobalOffset
	//	formula=GSSTmTcFormatFormula
	//	'}' ';';
	public GSSTmTcFormatCSFormulaFieldElements getGSSTmTcFormatCSFormulaFieldAccess() {
		return pGSSTmTcFormatCSFormulaField;
	}
	
	public ParserRule getGSSTmTcFormatCSFormulaFieldRule() {
		return getGSSTmTcFormatCSFormulaFieldAccess().getRule();
	}
	
	//GSSTmTcFormatVSField:
	//	'GSSTmTcFormatVSField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
	//	'type' ':=' type=GSSTmTcFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
	//	constSize=GSSTmTcFormatConstSize
	//	maxSize=GSSTmTcFormatMaxSize
	//	variableSize=GSSTmTcFormatVariableSize
	//	globalOffset=GSSTmTcFormatGlobalOffset
	//	'}' ';';
	public GSSTmTcFormatVSFieldElements getGSSTmTcFormatVSFieldAccess() {
		return pGSSTmTcFormatVSField;
	}
	
	public ParserRule getGSSTmTcFormatVSFieldRule() {
		return getGSSTmTcFormatVSFieldAccess().getRule();
	}
	
	//GSSTmTcFormatVRFieldSize:
	//	'GSSTmTcFormatVRFieldSize' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'}' ';';
	public GSSTmTcFormatVRFieldSizeElements getGSSTmTcFormatVRFieldSizeAccess() {
		return pGSSTmTcFormatVRFieldSize;
	}
	
	public ParserRule getGSSTmTcFormatVRFieldSizeRule() {
		return getGSSTmTcFormatVRFieldSizeAccess().getRule();
	}
	
	//GSSTmTcFormatFDICField:
	//	'GSSTmTcFormatFDICField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
	//	'checkType' ':=' checkType=GSSTmTcFormatCheckType ';'
	//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
	//	size=GSSTmTcFormatSize
	//	floatingOffset=GSSTmTcFormatFloatingOffset
	//	sortedFieldsToCheck=GSSTmTcFormatSortedFieldsToCheck
	//	'}' ';';
	public GSSTmTcFormatFDICFieldElements getGSSTmTcFormatFDICFieldAccess() {
		return pGSSTmTcFormatFDICField;
	}
	
	public ParserRule getGSSTmTcFormatFDICFieldRule() {
		return getGSSTmTcFormatFDICFieldAccess().getRule();
	}
	
	//GSSTmTcFormatAField:
	//	'GSSTmTcFormatAField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
	//	'type' ':=' type=GSSTmTcFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
	//	size=GSSTmTcFormatSize
	//	globalOffset=GSSTmTcFormatGlobalOffset
	//	arrayDimension=GSSTmTcFormatArrayDimension
	//	'}' ';';
	public GSSTmTcFormatAFieldElements getGSSTmTcFormatAFieldAccess() {
		return pGSSTmTcFormatAField;
	}
	
	public ParserRule getGSSTmTcFormatAFieldRule() {
		return getGSSTmTcFormatAFieldAccess().getRule();
	}
	
	//GSSTmTcFormatAIField:
	//	'GSSTmTcFormatAIField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=ID ';' ('description' ':=' description=ID ';')?
	//	'type' ':=' type=GSSTmTcFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=GSSTmTcFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=GSSTmTcFormatSFieldFirstBit ';'
	//	size=GSSTmTcFormatSize
	//	localOffset=GSSTmTcFormatLocalOffset
	//	arrayRef=GSSTmTcFormatArrayRef
	//	'}' ';';
	public GSSTmTcFormatAIFieldElements getGSSTmTcFormatAIFieldAccess() {
		return pGSSTmTcFormatAIField;
	}
	
	public ParserRule getGSSTmTcFormatAIFieldRule() {
		return getGSSTmTcFormatAIFieldAccess().getRule();
	}
	
	//enum GSSTmTcFormatFieldType:
	//	structured | uint | flag |
	//	enumerated | bit_vector |
	//	byte_vector | float | deduced;
	public GSSTmTcFormatFieldTypeElements getGSSTmTcFormatFieldTypeAccess() {
		return eGSSTmTcFormatFieldType;
	}
	
	public EnumRule getGSSTmTcFormatFieldTypeRule() {
		return getGSSTmTcFormatFieldTypeAccess().getRule();
	}
	
	//enum GSSTmTcFormatFieldByteOrder:
	//	big_endian | little_endian | na;
	public GSSTmTcFormatFieldByteOrderElements getGSSTmTcFormatFieldByteOrderAccess() {
		return eGSSTmTcFormatFieldByteOrder;
	}
	
	public EnumRule getGSSTmTcFormatFieldByteOrderRule() {
		return getGSSTmTcFormatFieldByteOrderAccess().getRule();
	}
	
	//enum GSSTmTcFormatSFieldFirstBit:
	//	MSB | LSB;
	public GSSTmTcFormatSFieldFirstBitElements getGSSTmTcFormatSFieldFirstBitAccess() {
		return eGSSTmTcFormatSFieldFirstBit;
	}
	
	public EnumRule getGSSTmTcFormatSFieldFirstBitRule() {
		return getGSSTmTcFormatSFieldFirstBitAccess().getRule();
	}
	
	//GSSTmTcFormatSize:
	//	'GSSTmTcFormatSize'
	//	'{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatSizeElements getGSSTmTcFormatSizeAccess() {
		return pGSSTmTcFormatSize;
	}
	
	public ParserRule getGSSTmTcFormatSizeRule() {
		return getGSSTmTcFormatSizeAccess().getRule();
	}
	
	//GSSTmTcFormatGlobalOffset:
	//	'GSSTmTcFormatGlobalOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatGlobalOffsetElements getGSSTmTcFormatGlobalOffsetAccess() {
		return pGSSTmTcFormatGlobalOffset;
	}
	
	public ParserRule getGSSTmTcFormatGlobalOffsetRule() {
		return getGSSTmTcFormatGlobalOffsetAccess().getRule();
	}
	
	//GSSTmTcFormatFormula:
	//	'GSSTmTcFormatFormula' '{'
	//	'slope' ':=' slope=STRING ';'
	//	'intercept' ':=' intercept=STRING ';'
	//	'}' ';';
	public GSSTmTcFormatFormulaElements getGSSTmTcFormatFormulaAccess() {
		return pGSSTmTcFormatFormula;
	}
	
	public ParserRule getGSSTmTcFormatFormulaRule() {
		return getGSSTmTcFormatFormulaAccess().getRule();
	}
	
	//GSSTmTcFormatConstSize:
	//	'GSSTmTcFormatConstSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatConstSizeElements getGSSTmTcFormatConstSizeAccess() {
		return pGSSTmTcFormatConstSize;
	}
	
	public ParserRule getGSSTmTcFormatConstSizeRule() {
		return getGSSTmTcFormatConstSizeAccess().getRule();
	}
	
	//GSSTmTcFormatMaxSize:
	//	'GSSTmTcFormatMaxSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatMaxSizeElements getGSSTmTcFormatMaxSizeAccess() {
		return pGSSTmTcFormatMaxSize;
	}
	
	public ParserRule getGSSTmTcFormatMaxSizeRule() {
		return getGSSTmTcFormatMaxSizeAccess().getRule();
	}
	
	//GSSTmTcFormatVariableSize:
	//	'GSSTmTcFormatVariableSize' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'unit' ':=' unit=GSSTmTcFormatUnit ';' ('power' ':=' power=GSSTmTcFormatPower ';')?
	//	'}' ';';
	public GSSTmTcFormatVariableSizeElements getGSSTmTcFormatVariableSizeAccess() {
		return pGSSTmTcFormatVariableSize;
	}
	
	public ParserRule getGSSTmTcFormatVariableSizeRule() {
		return getGSSTmTcFormatVariableSizeAccess().getRule();
	}
	
	//enum GSSTmTcFormatUnit:
	//	bytes | bits |
	//	halfword | string10 |
	//	string17 | string69;
	public GSSTmTcFormatUnitElements getGSSTmTcFormatUnitAccess() {
		return eGSSTmTcFormatUnit;
	}
	
	public EnumRule getGSSTmTcFormatUnitRule() {
		return getGSSTmTcFormatUnitAccess().getRule();
	}
	
	//enum GSSTmTcFormatPower:
	//	_2='2bits' | _2_with_0='2bits_with_0';
	public GSSTmTcFormatPowerElements getGSSTmTcFormatPowerAccess() {
		return eGSSTmTcFormatPower;
	}
	
	public EnumRule getGSSTmTcFormatPowerRule() {
		return getGSSTmTcFormatPowerAccess().getRule();
	}
	
	//enum GSSTmTcFormatCheckType:
	//	crc16 | checksum16;
	public GSSTmTcFormatCheckTypeElements getGSSTmTcFormatCheckTypeAccess() {
		return eGSSTmTcFormatCheckType;
	}
	
	public EnumRule getGSSTmTcFormatCheckTypeRule() {
		return getGSSTmTcFormatCheckTypeAccess().getRule();
	}
	
	//GSSTmTcFormatFloatingOffset:
	//	'GSSTmTcFormatFloatingOffset' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatFloatingOffsetElements getGSSTmTcFormatFloatingOffsetAccess() {
		return pGSSTmTcFormatFloatingOffset;
	}
	
	public ParserRule getGSSTmTcFormatFloatingOffsetRule() {
		return getGSSTmTcFormatFloatingOffsetAccess().getRule();
	}
	
	//GSSTmTcFormatSortedFieldsToCheck:
	//	{GSSTmTcFormatSortedFieldsToCheck}
	//	'GSSTmTcFormatSortedFieldsToCheck' '{'
	//	fieldToCheck+=GSSTmTcFormatFieldToCheck+
	//	'}' ';';
	public GSSTmTcFormatSortedFieldsToCheckElements getGSSTmTcFormatSortedFieldsToCheckAccess() {
		return pGSSTmTcFormatSortedFieldsToCheck;
	}
	
	public ParserRule getGSSTmTcFormatSortedFieldsToCheckRule() {
		return getGSSTmTcFormatSortedFieldsToCheckAccess().getRule();
	}
	
	//GSSTmTcFormatFieldToCheck:
	//	'GSSTmTcFormatFieldToCheck' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatFieldToCheckElements getGSSTmTcFormatFieldToCheckAccess() {
		return pGSSTmTcFormatFieldToCheck;
	}
	
	public ParserRule getGSSTmTcFormatFieldToCheckRule() {
		return getGSSTmTcFormatFieldToCheckAccess().getRule();
	}
	
	//GSSTmTcFormatArrayDimension:
	//	'GSSTmTcFormatArrayDimension' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'maxItems' ':=' maxItems=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatArrayDimensionElements getGSSTmTcFormatArrayDimensionAccess() {
		return pGSSTmTcFormatArrayDimension;
	}
	
	public ParserRule getGSSTmTcFormatArrayDimensionRule() {
		return getGSSTmTcFormatArrayDimensionAccess().getRule();
	}
	
	//GSSTmTcFormatLocalOffset:
	//	'GSSTmTcFormatLocalOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatLocalOffsetElements getGSSTmTcFormatLocalOffsetAccess() {
		return pGSSTmTcFormatLocalOffset;
	}
	
	public ParserRule getGSSTmTcFormatLocalOffsetRule() {
		return getGSSTmTcFormatLocalOffsetAccess().getRule();
	}
	
	//GSSTmTcFormatArrayRef:
	//	'GSSTmTcFormatArrayRef' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public GSSTmTcFormatArrayRefElements getGSSTmTcFormatArrayRefAccess() {
		return pGSSTmTcFormatArrayRef;
	}
	
	public ParserRule getGSSTmTcFormatArrayRefRule() {
		return getGSSTmTcFormatArrayRefAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}
	
	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//REAL:
	//	'-'? (INT '.' INT) ('e' '-'? INT)?;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
