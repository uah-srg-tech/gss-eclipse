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
package es.uah.aut.srg.gss.lang.filter.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVar;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef;
import es.uah.aut.srg.gss.filter.GSSFilterConstant;
import es.uah.aut.srg.gss.filter.GSSFilterFieldOp;
import es.uah.aut.srg.gss.filter.GSSFilterMaxterm;
import es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter;
import es.uah.aut.srg.gss.filter.GSSFilterMinterm;
import es.uah.aut.srg.gss.filter.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.filter.GSSFilterSelect;
import es.uah.aut.srg.gss.filter.GSSFilterSelectLine;
import es.uah.aut.srg.gss.filter.filterPackage;
import es.uah.aut.srg.gss.lang.filter.services.FILTERGrammarAccess;
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
public class FILTERSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FILTERGrammarAccess grammarAccess;
	
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
		else if (epackage == filterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case filterPackage.GSS_FILTER_BOOL_VAR:
				sequence_GSSFilterBoolVar(context, (GSSFilterBoolVar) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_BOOL_VAR_FDIC:
				sequence_GSSFilterBoolVarFDIC(context, (GSSFilterBoolVarFDIC) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM:
				sequence_GSSFilterBoolVarFromArrayItem(context, (GSSFilterBoolVarFromArrayItem) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				sequence_GSSFilterBoolVarFromGroupedArrayItem(context, (GSSFilterBoolVarFromGroupedArrayItem) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_BOOL_VAR_REF:
				sequence_GSSFilterBoolVarRef(context, (GSSFilterBoolVarRef) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_CONSTANT:
				sequence_GSSFilterConstant(context, (GSSFilterConstant) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_FIELD_OP:
				sequence_GSSFilterFieldOp(context, (GSSFilterFieldOp) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_MAXTERM:
				sequence_GSSFilterMaxterm(context, (GSSFilterMaxterm) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_MAXTERM_FILTER:
				sequence_GSSFilterMaxtermFilter(context, (GSSFilterMaxtermFilter) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_MINTERM:
				sequence_GSSFilterMinterm(context, (GSSFilterMinterm) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_MINTERM_FILTER:
				sequence_GSSFilterMintermFilter(context, (GSSFilterMintermFilter) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_SELECT:
				sequence_GSSFilterSelect(context, (GSSFilterSelect) semanticObject); 
				return; 
			case filterPackage.GSS_FILTER_SELECT_LINE:
				sequence_GSSFilterSelectLine(context, (GSSFilterSelectLine) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSFilterBoolVarFDIC returns GSSFilterBoolVarFDIC
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID FieldRef=[GSSFormatFDICField|VersionedQualifiedReferenceName] Op=GSSFilterFieldOp)
	 */
	protected void sequence_GSSFilterBoolVarFDIC(ISerializationContext context, GSSFilterBoolVarFDIC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__ID));
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__NAME));
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterBoolVarFromArrayItem returns GSSFilterBoolVarFromArrayItem
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         constantType=GSSFilterConstantType 
	 *         AIFieldRef=[GSSFormatAIField|VersionedQualifiedReferenceName] 
	 *         Op=GSSFilterFieldOp 
	 *         (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
	 *     )
	 */
	protected void sequence_GSSFilterBoolVarFromArrayItem(ISerializationContext context, GSSFilterBoolVarFromArrayItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterBoolVarFromGroupedArrayItem returns GSSFilterBoolVarFromGroupedArrayItem
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         constantType=GSSFilterConstantType 
	 *         group=ID 
	 *         AIFieldRefs=[GSSFormatAField|VersionedQualifiedReferenceName] 
	 *         Op=GSSFilterFieldOp 
	 *         (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
	 *     )
	 */
	protected void sequence_GSSFilterBoolVarFromGroupedArrayItem(ISerializationContext context, GSSFilterBoolVarFromGroupedArrayItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterBoolVarRef returns GSSFilterBoolVarRef
	 *
	 * Constraint:
	 *     idRef=INTEGER
	 */
	protected void sequence_GSSFilterBoolVarRef(ISerializationContext context, GSSFilterBoolVarRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_REF__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.GSS_FILTER_BOOL_VAR_REF__ID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0(), semanticObject.getIdRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterBoolVar returns GSSFilterBoolVar
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         constantType=GSSFilterConstantType 
	 *         FieldRef=[GSSFormatField|VersionedQualifiedReferenceName] 
	 *         Op=GSSFilterFieldOp 
	 *         (Constant=GSSFilterConstant | Select=GSSFilterSelect | SelectLine=GSSFilterSelectLine)
	 *     )
	 */
	protected void sequence_GSSFilterBoolVar(ISerializationContext context, GSSFilterBoolVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterConstant returns GSSFilterConstant
	 *
	 * Constraint:
	 *     (value=INTEGER mask=HEXADECIMAL?)
	 */
	protected void sequence_GSSFilterConstant(ISerializationContext context, GSSFilterConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterFieldOp returns GSSFilterFieldOp
	 *
	 * Constraint:
	 *     type=GSSFilterOPType
	 */
	protected void sequence_GSSFilterFieldOp(ISerializationContext context, GSSFilterFieldOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.GSS_FILTER_FIELD_OP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.GSS_FILTER_FIELD_OP__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterFilter returns GSSFilterMaxtermFilter
	 *     GSSFilterMaxtermFilter returns GSSFilterMaxtermFilter
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             uri=QualifiedName | 
	 *             (
	 *                 version=Version 
	 *                 formatFile=[GSSFormatFormat|VersionedQualifiedName] 
	 *                 (
	 *                     BoolVar+=GSSFilterBoolVar | 
	 *                     BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem | 
	 *                     BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | 
	 *                     BoolVarFDIC+=GSSFilterBoolVarFDIC
	 *                 )+
	 *             )
	 *         )+ 
	 *         Maxterm+=GSSFilterMaxterm+
	 *     )
	 */
	protected void sequence_GSSFilterMaxtermFilter(ISerializationContext context, GSSFilterMaxtermFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterMaxterm returns GSSFilterMaxterm
	 *
	 * Constraint:
	 *     (id=INTEGER BoolVarRef+=GSSFilterBoolVarRef+)
	 */
	protected void sequence_GSSFilterMaxterm(ISerializationContext context, GSSFilterMaxterm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterFilter returns GSSFilterMintermFilter
	 *     GSSFilterMintermFilter returns GSSFilterMintermFilter
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             uri=QualifiedName | 
	 *             (
	 *                 version=Version 
	 *                 formatFile=[GSSFormatFormat|VersionedQualifiedName] 
	 *                 (
	 *                     BoolVar+=GSSFilterBoolVar | 
	 *                     BoolVarFromArrayItem+=GSSFilterBoolVarFromArrayItem | 
	 *                     BoolVarFromGroupedArrayItem+=GSSFilterBoolVarFromGroupedArrayItem | 
	 *                     BoolVarFDIC+=GSSFilterBoolVarFDIC
	 *                 )+
	 *             )
	 *         )+ 
	 *         Minterm+=GSSFilterMinterm+
	 *     )
	 */
	protected void sequence_GSSFilterMintermFilter(ISerializationContext context, GSSFilterMintermFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterMinterm returns GSSFilterMinterm
	 *
	 * Constraint:
	 *     (id=INTEGER BoolVarRef+=GSSFilterBoolVarRef+)
	 */
	protected void sequence_GSSFilterMinterm(ISerializationContext context, GSSFilterMinterm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterSelectLine returns GSSFilterSelectLine
	 *
	 * Constraint:
	 *     (fromFile=ID line=INTEGER leftTrim=INTEGER? rightTrim=INTEGER? mask=HEXADECIMAL?)
	 */
	protected void sequence_GSSFilterSelectLine(ISerializationContext context, GSSFilterSelectLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSFilterSelect returns GSSFilterSelect
	 *
	 * Constraint:
	 *     (fromFile=ID type=GSSFilterSelectType offset=INTEGER? size=INTEGER? mask=HEXADECIMAL?)
	 */
	protected void sequence_GSSFilterSelect(ISerializationContext context, GSSFilterSelect semanticObject) {
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
	 *     (imports+=GSSModelFileImport* element=GSSFilterFilter)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
