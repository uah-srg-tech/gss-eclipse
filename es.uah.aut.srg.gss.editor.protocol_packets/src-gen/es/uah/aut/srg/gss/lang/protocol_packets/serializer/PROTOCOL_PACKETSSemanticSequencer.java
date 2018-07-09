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
package es.uah.aut.srg.gss.lang.protocol_packets.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsExport;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;
import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PROTOCOL_PACKETSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PROTOCOL_PACKETSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == commonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case commonPackage.GSS_MODEL_FILE:
				sequence_GSSModelFile(context, (GSSModelFile) semanticObject); 
				return; 
			case commonPackage.GSS_MODEL_FILE_IMPORT:
				sequence_GSSModelFileImport(context, (GSSModelFileImport) semanticObject); 
				return; 
			}
		else if (epackage == protocol_packetsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_EXPORT:
				sequence_GSSProtocolPacketsExport(context, (GSSProtocolPacketsExport) semanticObject); 
				return; 
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_FORMAT:
				sequence_GSSProtocolPacketsFormat(context, (GSSProtocolPacketsFormat) semanticObject); 
				return; 
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET:
				sequence_GSSProtocolPacketsProtocolPacket(context, (GSSProtocolPacketsProtocolPacket) semanticObject); 
				return; 
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS:
				sequence_GSSProtocolPacketsProtocolPackets(context, (GSSProtocolPacketsProtocolPackets) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSModelFileImport returns GSSModelFileImport
	 *
	 * Constraint:
	 *     importURI=ID
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSProtocolPacketsProtocolPackets)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSProtocolPacketsExport returns GSSProtocolPacketsExport
	 *
	 * Constraint:
	 *     file=ID
	 */
	protected void sequence_GSSProtocolPacketsExport(ISerializationContext context, GSSProtocolPacketsExport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_EXPORT__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_EXPORT__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSProtocolPacketsExportAccess().getFileIDTerminalRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSProtocolPacketsFormat returns GSSProtocolPacketsFormat
	 *
	 * Constraint:
	 *     file=ID
	 */
	protected void sequence_GSSProtocolPacketsFormat(ISerializationContext context, GSSProtocolPacketsFormat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_FORMAT__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_FORMAT__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileIDTerminalRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSProtocolPacketsProtocolPacket returns GSSProtocolPacketsProtocolPacket
	 *
	 * Constraint:
	 *     (name=ID ifRef=INTEGER levelRef=INTEGER export=GSSProtocolPacketsExport format=GSSProtocolPacketsFormat)
	 */
	protected void sequence_GSSProtocolPacketsProtocolPacket(ISerializationContext context, GSSProtocolPacketsProtocolPacket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME));
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF));
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF));
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT));
			if (transientValues.isValueTransient(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0(), semanticObject.getIfRef());
		feeder.accept(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0(), semanticObject.getLevelRef());
		feeder.accept(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSProtocolPacketsExportParserRuleCall_14_0(), semanticObject.getExport());
		feeder.accept(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSProtocolPacketsFormatParserRuleCall_15_0(), semanticObject.getFormat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSProtocolPacketsProtocolPackets returns GSSProtocolPacketsProtocolPackets
	 *
	 * Constraint:
	 *     (name=EString (uri=QualifiedName | version=Version)+ ProtocolPacket+=GSSProtocolPacketsProtocolPacket+)
	 */
	protected void sequence_GSSProtocolPacketsProtocolPackets(ISerializationContext context, GSSProtocolPacketsProtocolPackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}