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
package es.uah.aut.srg.gss.lang.iface.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.iface.GSSIfaceConstSize;
import es.uah.aut.srg.gss.iface.GSSIfaceDummyPort;
import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;
import es.uah.aut.srg.gss.iface.GSSIfaceReadingPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldOffset;
import es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPort;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol;
import es.uah.aut.srg.gss.iface.ifacePackage;
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;
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
public class IFACESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IFACEGrammarAccess grammarAccess;
	
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
		else if (epackage == ifacePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ifacePackage.GSS_IFACE_CONST_SIZE:
				sequence_GSSIfaceConstSize(context, (GSSIfaceConstSize) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_DUMMY_PORT:
				sequence_GSSIfaceDummyPort(context, (GSSIfaceDummyPort) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_PORT_CONFIG:
				sequence_GSSIfacePortConfig(context, (GSSIfacePortConfig) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_READING_PORT:
				sequence_GSSIfaceReadingPort(context, (GSSIfaceReadingPort) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_SIZE_FIELD_OFFSET:
				sequence_GSSIfaceSizeFieldOffset(context, (GSSIfaceSizeFieldOffset) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_SIZE_FIELD_TRIM:
				sequence_GSSIfaceSizeFieldTrim(context, (GSSIfaceSizeFieldTrim) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_SP_WPORT:
				sequence_GSSIfaceSpWPort(context, (GSSIfaceSpWPort) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_SP_WTC_PORT:
				sequence_GSSIfaceSpWTCPort(context, (GSSIfaceSpWTCPort) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_SYNC_PATTERN:
				sequence_GSSIfaceSyncPattern(context, (GSSIfaceSyncPattern) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_UART_PORT:
				sequence_GSSIfaceUartPort(context, (GSSIfaceUartPort) semanticObject); 
				return; 
			case ifacePackage.GSS_IFACE_UART_PROTOCOL:
				sequence_GSSIfaceUartProtocol(context, (GSSIfaceUartProtocol) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSIfaceConstSize returns GSSIfaceConstSize
	 *
	 * Constraint:
	 *     (bytes=INTEGER | bits=INTEGER)+
	 */
	protected void sequence_GSSIfaceConstSize(ISerializationContext context, GSSIfaceConstSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfacePort returns GSSIfaceDummyPort
	 *     GSSIfaceDummyPort returns GSSIfaceDummyPort
	 *
	 * Constraint:
	 *     {GSSIfaceDummyPort}
	 */
	protected void sequence_GSSIfaceDummyPort(ISerializationContext context, GSSIfaceDummyPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfacePortConfig returns GSSIfacePortConfig
	 *
	 * Constraint:
	 *     (name=ID (uri=QualifiedName | version=Version | port=GSSIfacePort)+)
	 */
	protected void sequence_GSSIfacePortConfig(ISerializationContext context, GSSIfacePortConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfaceReadingPort returns GSSIfaceReadingPort
	 *
	 * Constraint:
	 *     port=INTEGER
	 */
	protected void sequence_GSSIfaceReadingPort(ISerializationContext context, GSSIfaceReadingPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ifacePackage.Literals.GSS_IFACE_READING_PORT__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ifacePackage.Literals.GSS_IFACE_READING_PORT__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_2_2_0(), semanticObject.getPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfaceSizeFieldOffset returns GSSIfaceSizeFieldOffset
	 *
	 * Constraint:
	 *     (bytes=INTEGER | bits=INTEGER)+
	 */
	protected void sequence_GSSIfaceSizeFieldOffset(ISerializationContext context, GSSIfaceSizeFieldOffset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfaceSizeFieldTrim returns GSSIfaceSizeFieldTrim
	 *
	 * Constraint:
	 *     (bytes=INTEGER | bits=INTEGER)+
	 */
	protected void sequence_GSSIfaceSizeFieldTrim(ISerializationContext context, GSSIfaceSizeFieldTrim semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfacePort returns GSSIfaceSpWPort
	 *     GSSIfaceSpWPort returns GSSIfaceSpWPort
	 *
	 * Constraint:
	 *     (type=GSSIfaceSpWPortType | link=INTEGER | writingPort=INTEGER | readingPort+=GSSIfaceReadingPort)+
	 */
	protected void sequence_GSSIfaceSpWPort(ISerializationContext context, GSSIfaceSpWPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfacePort returns GSSIfaceSpWTCPort
	 *     GSSIfaceSpWTCPort returns GSSIfaceSpWTCPort
	 *
	 * Constraint:
	 *     spwPortRef=INTEGER
	 */
	protected void sequence_GSSIfaceSpWTCPort(ISerializationContext context, GSSIfaceSpWTCPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ifacePackage.Literals.GSS_IFACE_SP_WTC_PORT__SPW_PORT_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ifacePackage.Literals.GSS_IFACE_SP_WTC_PORT__SPW_PORT_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_2_2_0(), semanticObject.getSpwPortRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfaceSyncPattern returns GSSIfaceSyncPattern
	 *
	 * Constraint:
	 *     hexValue=HEXADECIMAL
	 */
	protected void sequence_GSSIfaceSyncPattern(ISerializationContext context, GSSIfaceSyncPattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ifacePackage.Literals.GSS_IFACE_SYNC_PATTERN__HEX_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ifacePackage.Literals.GSS_IFACE_SYNC_PATTERN__HEX_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_2_2_0(), semanticObject.getHexValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfacePort returns GSSIfaceUartPort
	 *     GSSIfaceUartPort returns GSSIfaceUartPort
	 *
	 * Constraint:
	 *     (
	 *         number=INTEGER | 
	 *         baudRate=GSSIfaceUartPortBaudRate | 
	 *         parity=GSSIfaceUartPortParity | 
	 *         dataBits=GSSIfaceUartPortDataBits | 
	 *         stopBits=GSSIfaceUartPortStopBits | 
	 *         inputQueueSize=INTEGER | 
	 *         outputQueueSize=INTEGER | 
	 *         uartProtocol=GSSIfaceUartProtocol
	 *     )+
	 */
	protected void sequence_GSSIfaceUartPort(ISerializationContext context, GSSIfaceUartPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSIfaceUartProtocol returns GSSIfaceUartProtocol
	 *
	 * Constraint:
	 *     (
	 *         unit=GSSIfaceUartProtocolUnit | 
	 *         power=GSSIfaceUartProtocolPower | 
	 *         constSize=GSSIfaceConstSize | 
	 *         sizeFieldOffset=GSSIfaceSizeFieldOffset | 
	 *         sizeFieldTrim=GSSIfaceSizeFieldTrim | 
	 *         syncPattern=GSSIfaceSyncPattern
	 *     )+
	 */
	protected void sequence_GSSIfaceUartProtocol(ISerializationContext context, GSSIfaceUartProtocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFileImport returns GSSModelFileImport
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSIfacePortConfig)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}