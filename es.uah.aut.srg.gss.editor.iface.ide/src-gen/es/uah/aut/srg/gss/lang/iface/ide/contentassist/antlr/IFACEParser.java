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
					put(grammarAccess.getGSSIfaceReadingPortAccess().getGroup(), "rule__GSSIfaceReadingPort__Group__0");
					put(grammarAccess.getGSSIfaceUartPortAccess().getGroup(), "rule__GSSIfaceUartPort__Group__0");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup(), "rule__GSSIfaceUartProtocol__Group__0");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getGroup(), "rule__GSSIfaceConstSize__Group__0");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup(), "rule__GSSIfaceSizeFieldOffset__Group__0");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup(), "rule__GSSIfaceSizeFieldTrim__Group__0");
					put(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup(), "rule__GSSIfaceSyncPattern__Group__0");
					put(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup(), "rule__GSSIfaceSpWTCPort__Group__0");
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
					put(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4(), "rule__GSSIfacePortConfig__PortConfigAssignment_4");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4(), "rule__GSSIfaceSpWPort__TypeAssignment_4");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8(), "rule__GSSIfaceSpWPort__LinkAssignment_8");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12(), "rule__GSSIfaceSpWPort__WritingPortAssignment_12");
					put(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14(), "rule__GSSIfaceSpWPort__ReadingPortAssignment_14");
					put(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4(), "rule__GSSIfaceReadingPort__PortAssignment_4");
					put(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4(), "rule__GSSIfaceUartPort__NumberAssignment_4");
					put(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8(), "rule__GSSIfaceUartPort__BaudRateAssignment_8");
					put(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12(), "rule__GSSIfaceUartPort__ParityAssignment_12");
					put(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16(), "rule__GSSIfaceUartPort__DataBitsAssignment_16");
					put(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20(), "rule__GSSIfaceUartPort__StopBitsAssignment_20");
					put(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_24(), "rule__GSSIfaceUartPort__InputQueueSizeAssignment_24");
					put(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_28(), "rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28");
					put(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_30(), "rule__GSSIfaceUartPort__UartProtocolAssignment_30");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_4(), "rule__GSSIfaceUartProtocol__UnitAssignment_4");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_8(), "rule__GSSIfaceUartProtocol__PowerAssignment_8");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_10(), "rule__GSSIfaceUartProtocol__ConstSizeAssignment_10");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_11(), "rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_12(), "rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12");
					put(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_13(), "rule__GSSIfaceUartProtocol__SyncPatternAssignment_13");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4(), "rule__GSSIfaceConstSize__BytesAssignment_4");
					put(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8(), "rule__GSSIfaceConstSize__BitsAssignment_8");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4(), "rule__GSSIfaceSizeFieldOffset__BytesAssignment_4");
					put(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8(), "rule__GSSIfaceSizeFieldOffset__BitsAssignment_8");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4(), "rule__GSSIfaceSizeFieldTrim__BytesAssignment_4");
					put(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8(), "rule__GSSIfaceSizeFieldTrim__BitsAssignment_8");
					put(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4(), "rule__GSSIfaceSyncPattern__HexValueAssignment_4");
					put(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4(), "rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4");
					put(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), "rule__GSSIfacePortConfig__UnorderedGroup_3");
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
