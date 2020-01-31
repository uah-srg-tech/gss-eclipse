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
package es.uah.aut.srg.gss.lang.tcheader.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcheader.services.TCHEADERGrammarAccess;
import es.uah.aut.srg.gss.tcheader.GSSTCHeader;
import es.uah.aut.srg.gss.tcheader.GSSTCHeaderField;
import es.uah.aut.srg.gss.tcheader.tcheaderPackage;
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
public class TCHEADERSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TCHEADERGrammarAccess grammarAccess;
	
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
		else if (epackage == tcheaderPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tcheaderPackage.GSSTC_HEADER:
				sequence_GSSTCHeader(context, (GSSTCHeader) semanticObject); 
				return; 
			case tcheaderPackage.GSSTC_HEADER_FIELD:
				sequence_GSSTCHeaderField(context, (GSSTCHeaderField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTCHeaderField returns GSSTCHeaderField
	 *
	 * Constraint:
	 *     (name=STRING gssHeaderField=[GSSFormatField|STRING] fieldValue=TMTCIFFieldValueRaw?)
	 */
	protected void sequence_GSSTCHeaderField(ISerializationContext context, GSSTCHeaderField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTCHeader returns GSSTCHeader
	 *
	 * Constraint:
	 *     (name=STRING format=[GSSFormatFormat|STRING] gssHeaderFields+=GSSTCHeaderField*)
	 */
	protected void sequence_GSSTCHeader(ISerializationContext context, GSSTCHeader semanticObject) {
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
