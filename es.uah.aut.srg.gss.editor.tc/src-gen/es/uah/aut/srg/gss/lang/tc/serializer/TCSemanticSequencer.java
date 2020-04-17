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
package es.uah.aut.srg.gss.lang.tc.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.lang.tc.services.TCGrammarAccess;
import es.uah.aut.srg.gss.tc.GSSTC;
import es.uah.aut.srg.gss.tc.GSSTCField;
import es.uah.aut.srg.gss.tc.tcPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class TCSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TCGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == tcPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tcPackage.GSSTC:
				sequence_GSSTC(context, (GSSTC) semanticObject); 
				return; 
			case tcPackage.GSSTC_FIELD:
				sequence_GSSTCField(context, (GSSTCField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSTCField returns GSSTCField
	 *
	 * Constraint:
	 *     (name=STRING gssField=[GSSFormatField|STRING] enumRef=[TMTCIFEnum|STRING]?)
	 */
	protected void sequence_GSSTCField(ISerializationContext context, GSSTCField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSTC returns GSSTC
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
	 *         fields+=GSSTCField*
	 *     )
	 */
	protected void sequence_GSSTC(ISerializationContext context, GSSTC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
