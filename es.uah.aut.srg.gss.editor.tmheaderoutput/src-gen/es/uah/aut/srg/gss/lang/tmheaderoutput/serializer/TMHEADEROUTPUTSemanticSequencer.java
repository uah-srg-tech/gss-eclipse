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
package es.uah.aut.srg.gss.lang.tmheaderoutput.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmheaderoutput.services.TMHEADEROUTPUTGrammarAccess;
import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput;
import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField;
import es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputPackage;
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
public class TMHEADEROUTPUTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TMHEADEROUTPUTGrammarAccess grammarAccess;
	
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
		else if (epackage == tmheaderoutputPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tmheaderoutputPackage.GSSTM_HEADER_OUTPUT:
				sequence_GSSTMHeaderOutput(context, (GSSTMHeaderOutput) semanticObject); 
				return; 
			case tmheaderoutputPackage.GSSTM_HEADER_OUTPUT_FIELD:
				sequence_GSSTMHeaderOutputField(context, (GSSTMHeaderOutputField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTMHeaderOutputField returns GSSTMHeaderOutputField
	 *
	 * Constraint:
	 *     (name=STRING gssHeaderField=[GSSFormatField|STRING] fieldValue=TMTCIFFieldValueRaw?)
	 */
	protected void sequence_GSSTMHeaderOutputField(ISerializationContext context, GSSTMHeaderOutputField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTMHeaderOutput returns GSSTMHeaderOutput
	 *
	 * Constraint:
	 *     (name=STRING format=[GSSFormatFormat|STRING] gssHeaderFields+=GSSTMHeaderOutputField*)
	 */
	protected void sequence_GSSTMHeaderOutput(ISerializationContext context, GSSTMHeaderOutput semanticObject) {
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
