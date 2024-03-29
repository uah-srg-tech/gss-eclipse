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
package es.uah.aut.srg.gss.lang.import_.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.import_.GSSImportDataSource;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.import_.GSSImportVirtualSize;
import es.uah.aut.srg.gss.import_.importPackage;
import es.uah.aut.srg.gss.lang.import_.services.IMPORTGrammarAccess;
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
public class IMPORTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IMPORTGrammarAccess grammarAccess;
	
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
		else if (epackage == importPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case importPackage.GSS_IMPORT_DATA_SOURCE:
				sequence_GSSImportDataSource(context, (GSSImportDataSource) semanticObject); 
				return; 
			case importPackage.GSS_IMPORT_IMPORT:
				sequence_GSSImportImport(context, (GSSImportImport) semanticObject); 
				return; 
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE:
				sequence_GSSImportVirtualSize(context, (GSSImportVirtualSize) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSImportDataSource returns GSSImportDataSource
	 *
	 * Constraint:
	 *     (FieldRef=[GSSFormatField|VersionedQualifiedReferenceName] leftTrim=INTEGER rightTrim=INTEGER)
	 */
	protected void sequence_GSSImportDataSource(ISerializationContext context, GSSImportDataSource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, importPackage.Literals.GSS_IMPORT_DATA_SOURCE__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, importPackage.Literals.GSS_IMPORT_DATA_SOURCE__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, importPackage.Literals.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, importPackage.Literals.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM));
			if (transientValues.isValueTransient(semanticObject, importPackage.Literals.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, importPackage.Literals.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0(), semanticObject.getLeftTrim());
		feeder.accept(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0(), semanticObject.getRightTrim());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSImportImport returns GSSImportImport
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (uri=QualifiedName | version=Version)+ 
	 *         from=[GSSFormatFormat|VersionedQualifiedName] 
	 *         to=[GSSFormatFormat|VersionedQualifiedName]? 
	 *         dataSource+=GSSImportDataSource+ 
	 *         virtualSize=GSSImportVirtualSize?
	 *     )
	 */
	protected void sequence_GSSImportImport(ISerializationContext context, GSSImportImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSImportVirtualSize returns GSSImportVirtualSize
	 *
	 * Constraint:
	 *     (
	 *         FieldRef=[GSSFormatField|VersionedQualifiedReferenceName] 
	 *         to=[GSSFormatField|VersionedQualifiedReferenceName] 
	 *         addSize=INTEGER? 
	 *         unit=GSSImportUnit?
	 *     )
	 */
	protected void sequence_GSSImportVirtualSize(ISerializationContext context, GSSImportVirtualSize semanticObject) {
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
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSImportImport)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
