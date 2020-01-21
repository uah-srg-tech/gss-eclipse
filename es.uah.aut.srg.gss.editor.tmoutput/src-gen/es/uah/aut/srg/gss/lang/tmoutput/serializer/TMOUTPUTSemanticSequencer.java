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
package es.uah.aut.srg.gss.lang.tmoutput.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmoutput.services.TMOUTPUTGrammarAccess;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutput;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutputField;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutputPi1;
import es.uah.aut.srg.gss.tmoutput.tmoutputPackage;
import es.uah.aut.srg.tmtcif.tm.tmPackage;
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
public class TMOUTPUTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TMOUTPUTGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == tmoutputPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tmoutputPackage.GSSTM_OUTPUT:
				sequence_GSSTMOutput(context, (GSSTMOutput) semanticObject); 
				return; 
			case tmoutputPackage.GSSTM_OUTPUT_FIELD:
				sequence_GSSTMOutputField(context, (GSSTMOutputField) semanticObject); 
				return; 
			case tmoutputPackage.GSSTM_OUTPUT_PI1:
				sequence_GSSTMOutputPi1(context, (GSSTMOutputPi1) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTMOutputField returns GSSTMOutputField
	 *
	 * Constraint:
	 *     (name=STRING gssField=[GSSFormatField|STRING] enumRef=[TMTCIFEnum|STRING]?)
	 */
	protected void sequence_GSSTMOutputField(ISerializationContext context, GSSTMOutputField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTMOutputPi1 returns GSSTMOutputPi1
	 *
	 * Constraint:
	 *     (name=STRING val=UINT_STRING gssField=[GSSFormatField|STRING])
	 */
	protected void sequence_GSSTMOutputPi1(ISerializationContext context, GSSTMOutputPi1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tmPackage.Literals.TMTCIFPI1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tmPackage.Literals.TMTCIFPI1__NAME));
			if (transientValues.isValueTransient(semanticObject, tmPackage.Literals.TMTCIFPI1__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tmPackage.Literals.TMTCIFPI1__VAL));
			if (transientValues.isValueTransient(semanticObject, tmoutputPackage.Literals.GSSTM_OUTPUT_PI1__GSS_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tmoutputPackage.Literals.GSSTM_OUTPUT_PI1__GSS_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTMOutputPi1Access().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSTMOutputPi1Access().getValUINT_STRINGTerminalRuleCall_4_0(), semanticObject.getVal());
		feeder.accept(grammarAccess.getGSSTMOutputPi1Access().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_6_0_1(), semanticObject.getGssField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTMOutput returns GSSTMOutput
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         type=UINT_STRING 
	 *         subtype=UINT_STRING 
	 *         levels=UINT_STRING 
	 *         level3_format=[GSSFormatFormat|STRING]? 
	 *         level3_filter=[GSSFilterFilter|STRING]? 
	 *         from_level2_import=[GSSImportImport|STRING]? 
	 *         level2_format=[GSSFormatFormat|STRING]? 
	 *         level2_filter=[GSSFilterFilter|STRING]? 
	 *         from_level1_import=[GSSImportImport|STRING]? 
	 *         level1_format=[GSSFormatFormat|STRING]? 
	 *         level1_filter=[GSSFilterFilter|STRING]? 
	 *         from_level0_import=[GSSImportImport|STRING]? 
	 *         level0_format=[GSSFormatFormat|STRING]? 
	 *         level0_filter=[GSSFilterFilter|STRING]? 
	 *         gssPi1=GSSTMOutputPi1? 
	 *         gssFields+=GSSTMOutputField*
	 *     )
	 */
	protected void sequence_GSSTMOutput(ISerializationContext context, GSSTMOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
