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
package es.uah.aut.srg.gss.lang.iface.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.iface.ide.contentassist.antlr.internal.InternalIFACEParser;
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class IFACEParser extends AbstractContentAssistParser {

	@Inject
	private IFACEGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalIFACEParser createParser() {
		InternalIFACEParser result = new InternalIFACEParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGSSIfacePortAccess().getAlternatives(), "rule__GSSIfacePort__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getGSSIfaceSpWPortTypeAccess().getAlternatives(), "rule__GSSIfaceSpWPortType__Alternatives");
					put(grammarAccess.getGSSIfaceUartPortBaudRateAccess().getAlternatives(), "rule__GSSIfaceUartPortBaudRate__Alternatives");
					put(grammarAccess.getGSSIfaceUartPortParityAccess().getAlternatives(), "rule__GSSIfaceUartPortParity__Alternatives");
					put(grammarAccess.getGSSIfaceUartPortDataBitsAccess().getAlternatives(), "rule__GSSIfaceUartPortDataBits__Alternatives");
					put(grammarAccess.getGSSIfaceUartPortStopBitsAccess().getAlternatives(), "rule__GSSIfaceUartPortStopBits__Alternatives");
					put(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getAlternatives(), "rule__GSSIfaceUartProtocolUnit__Alternatives");
					put(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getAlternatives(), "rule__GSSIfaceUartProtocolPower__Alternatives");
					put(grammarAccess.getGSSModelFileAccess().getGroup(), "rule__GSSModelFile__Group__0");
					put(grammarAccess.getGSSModelFileImportAccess().getGroup(), "rule__GSSModelFileImport__Group__0");
					put(grammarAccess.getGSSIfacePortConfigAccess().getGroup(), "rule__GSSIfacePortConfig__Group__0");
					put(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0(), "rule__GSSIfacePortConfig__Group_3_0__0");
					put(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1(), "rule__GSSIfacePortConfig__Group_3_1__0");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getGroup(), "rule__GSSIfaceSpWPort__Group__0");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_0(), "rule__GSSIfaceSpWPort__Group_2_0__0");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_1(), "rule__GSSIfaceSpWPort__Group_2_1__0");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_2(), "rule__GSSIfaceSpWPort__Group_2_2__0");
					put(grammarAccess.getGSSIfaceReadingPortAccess().getGroup(), "rule__GSSIfaceReadingPort__Group__0");
					put(grammarAccess.getGSSIfaceReadingPortAccess().getGroup_2(), "rule__GSSIfaceReadingPort__Group_2__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup(), "rule__GSSIfaceUartPort__Group__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_0(), "rule__GSSIfaceUartPort__Group_2_0__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_1(), "rule__GSSIfaceUartPort__Group_2_1__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_2(), "rule__GSSIfaceUartPort__Group_2_2__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_3(), "rule__GSSIfaceUartPort__Group_2_3__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_4(), "rule__GSSIfaceUartPort__Group_2_4__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_5(), "rule__GSSIfaceUartPort__Group_2_5__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_6(), "rule__GSSIfaceUartPort__Group_2_6__0");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup(), "rule__GSSIfaceUartProtocol__Group__0");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_0(), "rule__GSSIfaceUartProtocol__Group_2_0__0");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_1(), "rule__GSSIfaceUartProtocol__Group_2_1__0");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getGroup(), "rule__GSSIfaceConstSize__Group__0");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_0(), "rule__GSSIfaceConstSize__Group_2_0__0");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_1(), "rule__GSSIfaceConstSize__Group_2_1__0");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup(), "rule__GSSIfaceSizeFieldOffset__Group__0");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_0(), "rule__GSSIfaceSizeFieldOffset__Group_2_0__0");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_1(), "rule__GSSIfaceSizeFieldOffset__Group_2_1__0");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup(), "rule__GSSIfaceSizeFieldTrim__Group__0");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_0(), "rule__GSSIfaceSizeFieldTrim__Group_2_0__0");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_1(), "rule__GSSIfaceSizeFieldTrim__Group_2_1__0");
					put(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup(), "rule__GSSIfaceSyncPattern__Group__0");
					put(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup_2(), "rule__GSSIfaceSyncPattern__Group_2__0");
					put(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup(), "rule__GSSIfaceSpWTCPort__Group__0");
					put(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup_2(), "rule__GSSIfaceSpWTCPort__Group_2__0");
					put(grammarAccess.getGSSIfaceDummyPortAccess().getGroup(), "rule__GSSIfaceDummyPort__Group__0");
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
					put(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1(), "rule__GSSModelFileImport__ImportURIAssignment_1");
					put(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1(), "rule__GSSIfacePortConfig__NameAssignment_1");
					put(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2(), "rule__GSSIfacePortConfig__UriAssignment_3_0_2");
					put(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2(), "rule__GSSIfacePortConfig__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSIfacePortConfigAccess().getPortAssignment_3_2(), "rule__GSSIfacePortConfig__PortAssignment_3_2");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_2_0_2(), "rule__GSSIfaceSpWPort__TypeAssignment_2_0_2");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_2_1_2(), "rule__GSSIfaceSpWPort__LinkAssignment_2_1_2");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_2_2_2(), "rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3(), "rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3");
					put(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_2_2(), "rule__GSSIfaceReadingPort__PortAssignment_2_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_2_0_2(), "rule__GSSIfaceUartPort__NumberAssignment_2_0_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_2_1_2(), "rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_2_2_2(), "rule__GSSIfaceUartPort__ParityAssignment_2_2_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_2_3_2(), "rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_2_4_2(), "rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_2_5_2(), "rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_2_6_2(), "rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_2_7(), "rule__GSSIfaceUartPort__UartProtocolAssignment_2_7");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_2_0_2(), "rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_2_1_2(), "rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_2_2(), "rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_2_3(), "rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_2_4(), "rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_2_5(), "rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_2_0_2(), "rule__GSSIfaceConstSize__BytesAssignment_2_0_2");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_2_1_2(), "rule__GSSIfaceConstSize__BitsAssignment_2_1_2");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_2_0_2(), "rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_2_1_2(), "rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_2_0_2(), "rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_2_1_2(), "rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2");
					put(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_2_2(), "rule__GSSIfaceSyncPattern__HexValueAssignment_2_2");
					put(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_2_2(), "rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2");
					put(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), "rule__GSSIfacePortConfig__UnorderedGroup_3");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), "rule__GSSIfaceSpWPort__UnorderedGroup_2");
					put(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), "rule__GSSIfaceUartPort__UnorderedGroup_2");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), "rule__GSSIfaceUartProtocol__UnorderedGroup_2");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), "rule__GSSIfaceConstSize__UnorderedGroup_2");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalIFACEParser typedParser = (InternalIFACEParser) parser;
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

	public IFACEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IFACEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
