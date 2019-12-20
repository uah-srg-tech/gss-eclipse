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
package es.uah.aut.srg.gss.lang.tcinput.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tcinput.services.TCINPUTGrammarAccess;
import es.uah.aut.srg.gss.tcinput.GSSTCInput;
import es.uah.aut.srg.gss.tcinput.GSSTCInputField;
import es.uah.aut.srg.gss.tcinput.tcinputPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class TCINPUTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TCINPUTGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == tcinputPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tcinputPackage.GSSTC_INPUT:
				sequence_GSSTCInput(context, (GSSTCInput) semanticObject); 
				return; 
			case tcinputPackage.GSSTC_INPUT_FIELD:
				sequence_GSSTCInputField(context, (GSSTCInputField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTCInputField returns GSSTCInputField
	 *
	 * Constraint:
	 *     (name=STRING gssField=[GSSFormatField|STRING] enumRef=[TMTCIFEnum|STRING]?)
	 */
	protected void sequence_GSSTCInputField(ISerializationContext context, GSSTCInputField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTCInput returns GSSTCInput
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         type=UINT_STRING 
	 *         subtype=UINT_STRING 
	 *         levels=UINT_STRING 
	 *         to_level3_export=[GSSExportExport|STRING]? 
	 *         level3_format=[GSSFormatFormat|STRING]? 
	 *         to_level2_export=[GSSExportExport|STRING]? 
	 *         level2_format=[GSSFormatFormat|STRING]? 
	 *         to_level1_export=[GSSExportExport|STRING]? 
	 *         level1_format=[GSSFormatFormat|STRING]? 
	 *         to_level0_export=[GSSExportExport|STRING]? 
	 *         level0_format=[GSSFormatFormat|STRING]? 
	 *         gssFields+=GSSTCInputField*
	 *     )
	 */
	protected void sequence_GSSTCInput(ISerializationContext context, GSSTCInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
