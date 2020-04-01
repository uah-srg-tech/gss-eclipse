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
package es.uah.aut.srg.gss.lang.tmheader.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tmheader.services.TMHEADERGrammarAccess;
import es.uah.aut.srg.gss.tmheader.GSSTMHeader;
import es.uah.aut.srg.gss.tmheader.GSSTMHeaderField;
import es.uah.aut.srg.gss.tmheader.tmheaderPackage;
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
public class TMHEADERSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TMHEADERGrammarAccess grammarAccess;
	
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
		else if (epackage == tmheaderPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tmheaderPackage.GSSTM_HEADER:
				sequence_GSSTMHeader(context, (GSSTMHeader) semanticObject); 
				return; 
			case tmheaderPackage.GSSTM_HEADER_FIELD:
				sequence_GSSTMHeaderField(context, (GSSTMHeaderField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTMHeaderField returns GSSTMHeaderField
	 *
	 * Constraint:
	 *     (name=STRING gssHeaderField=[GSSFormatField|STRING] fieldValue=TMTCIFFieldValueRaw?)
	 */
	protected void sequence_GSSTMHeaderField(ISerializationContext context, GSSTMHeaderField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTMHeader returns GSSTMHeader
	 *
	 * Constraint:
	 *     (name=STRING format=[GSSFormatFormat|STRING] gssHeaderFields+=GSSTMHeaderField*)
	 */
	protected void sequence_GSSTMHeader(ISerializationContext context, GSSTMHeader semanticObject) {
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
