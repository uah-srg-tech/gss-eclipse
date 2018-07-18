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
package es.uah.aut.srg.gss.lang.protocol_packets.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.protocol_packets.ide.contentassist.antlr.internal.InternalPROTOCOL_PACKETSParser;
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class PROTOCOL_PACKETSParser extends AbstractContentAssistParser {

	@Inject
	private PROTOCOL_PACKETSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPROTOCOL_PACKETSParser createParser() {
		InternalPROTOCOL_PACKETSParser result = new InternalPROTOCOL_PACKETSParser(null);
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
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup(), "rule__GSSProtocolPacketsProtocolPackets__Group__0");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0(), "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_1(), "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGroup(), "rule__GSSProtocolPacketsProtocolPacket__Group__0");
					put(grammarAccess.getGSSProtocolPacketsFormatAccess().getGroup(), "rule__GSSProtocolPacketsFormat__Group__0");
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
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameAssignment_1(), "rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriAssignment_3_0_2(), "rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionAssignment_3_1_2(), "rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4(), "rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameAssignment_4(), "rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefAssignment_8(), "rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefAssignment_12(), "rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportAssignment_14(), "rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_14");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_16(), "rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_16");
					put(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileAssignment_4(), "rule__GSSProtocolPacketsFormat__FileAssignment_4");
					put(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPROTOCOL_PACKETSParser typedParser = (InternalPROTOCOL_PACKETSParser) parser;
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

	public PROTOCOL_PACKETSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PROTOCOL_PACKETSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
