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
package es.uah.aut.srg.gss.lang.tcheaderinput.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcheaderinput.services.TCHEADERINPUTGrammarAccess;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField;
import es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class TCHEADERINPUTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TCHEADERINPUTGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == fieldvaluePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_RAW:
				sequence_TMTCIFFieldValueRaw(context, (TMTCIFFieldValueRaw) semanticObject); 
				return; 
			}
		else if (epackage == tcheaderinputPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tcheaderinputPackage.GSSTC_HEADER_INPUT:
				sequence_GSSTCHeaderInput(context, (GSSTCHeaderInput) semanticObject); 
				return; 
			case tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD:
				sequence_GSSTCHeaderInputField(context, (GSSTCHeaderInputField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTCHeaderInputField returns GSSTCHeaderInputField
	 *
	 * Constraint:
	 *     (name=STRING gssHeaderField=[GSSFormatField|STRING] fieldValue=TMTCIFFieldValueRaw?)
	 */
	protected void sequence_GSSTCHeaderInputField(ISerializationContext context, GSSTCHeaderInputField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTCHeaderInput returns GSSTCHeaderInput
	 *
	 * Constraint:
	 *     (name=STRING format=[GSSFormatFormat|STRING] gssHeaderFields+=GSSTCHeaderInputField*)
	 */
	protected void sequence_GSSTCHeaderInput(ISerializationContext context, GSSTCHeaderInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFieldValueRaw returns TMTCIFFieldValueRaw
	 *
	 * Constraint:
	 *     (value=UINT_STRING | value=HEX_STRING)
	 */
	protected void sequence_TMTCIFFieldValueRaw(ISerializationContext context, TMTCIFFieldValueRaw semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
