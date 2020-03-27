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
package es.uah.aut.srg.gss.lang.export.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatField;
import es.uah.aut.srg.gss.xtext.GSSAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class EXPORTScopeProvider extends GSSAbstractScopeProvider {
	
	public IScope scope_GSSFormatField(final GSSExportExport export, EReference reference) {
		
		Set<GSSFormatField> fields = new HashSet<GSSFormatField>();
		
		if(reference.getName() == "toFieldRef") {
			if (export.getTo() == null) {
				return IScope.NULLSCOPE;
			}
			fields.addAll(export.getTo().getField());
			
		} else {

			fields.addAll(export.getFrom().getField());
		}
		return getSimpleObjectScope(fields);
		
	}
	public IScope scope_GSSFormatAIField(final GSSExportExport export, EReference reference) {

		Set<GSSFormatAIField> aifields = new HashSet<GSSFormatAIField>();
		
		if(reference.getName() == "toFieldRef") {
			if (export.getTo() == null) {
				return IScope.NULLSCOPE;
			} else {
				aifields.addAll(export.getTo().getAIField());
			}
		}
		return getSimpleObjectScope(aifields);
	}

}
