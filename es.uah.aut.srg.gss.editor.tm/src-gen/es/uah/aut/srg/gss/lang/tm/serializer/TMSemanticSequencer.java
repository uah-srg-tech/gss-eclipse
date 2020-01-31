/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.lang.tm.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tm.services.TMGrammarAccess;
import es.uah.aut.srg.gss.tm.GSSTM;
import es.uah.aut.srg.gss.tm.GSSTMField;
import es.uah.aut.srg.gss.tm.GSSTMPi1;
import es.uah.aut.srg.gss.tm.tmPackage;
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
public class TMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == tmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tmPackage.GSSTM:
				sequence_GSSTM(context, (GSSTM) semanticObject); 
				return; 
			case tmPackage.GSSTM_FIELD:
				sequence_GSSTMField(context, (GSSTMField) semanticObject); 
				return; 
			case tmPackage.GSSTM_PI1:
				sequence_GSSTMPi1(context, (GSSTMPi1) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTMField returns GSSTMField
	 *
	 * Constraint:
	 *     (name=STRING gssField=[GSSFormatField|STRING] enumRef=[TMTCIFEnum|STRING]?)
	 */
	protected void sequence_GSSTMField(ISerializationContext context, GSSTMField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTMPi1 returns GSSTMPi1
	 *
	 * Constraint:
	 *     (name=STRING val=UINT_STRING gssField=[GSSFormatField|STRING])
	 */
	protected void sequence_GSSTMPi1(ISerializationContext context, GSSTMPi1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, es.uah.aut.srg.tmtcif.tm.tmPackage.Literals.TMTCIFPI1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, es.uah.aut.srg.tmtcif.tm.tmPackage.Literals.TMTCIFPI1__NAME));
			if (transientValues.isValueTransient(semanticObject, es.uah.aut.srg.tmtcif.tm.tmPackage.Literals.TMTCIFPI1__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, es.uah.aut.srg.tmtcif.tm.tmPackage.Literals.TMTCIFPI1__VAL));
			if (transientValues.isValueTransient(semanticObject, tmPackage.Literals.GSSTM_PI1__GSS_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tmPackage.Literals.GSSTM_PI1__GSS_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSTMPi1Access().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSTMPi1Access().getValUINT_STRINGTerminalRuleCall_4_0(), semanticObject.getVal());
		feeder.accept(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_6_0_1(), semanticObject.getGssField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSTM returns GSSTM
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
	 *         gssPi1=GSSTMPi1? 
	 *         gssFields+=GSSTMField*
	 *     )
	 */
	protected void sequence_GSSTM(ISerializationContext context, GSSTM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
