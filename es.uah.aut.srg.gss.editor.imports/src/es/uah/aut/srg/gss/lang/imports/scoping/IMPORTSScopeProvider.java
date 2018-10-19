/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.lang.imports.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.gss.imports.GSSImportImport;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField;
import es.uah.aut.srg.gss.xtext.GSSAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class IMPORTSScopeProvider extends GSSAbstractScopeProvider  {

	public IScope scope_GSSTmTcFormatField(final GSSImportImport imports, EReference reference) {
		
		if (imports.getFrom() == null) {
			return IScope.NULLSCOPE;
		}
		
		Set<GSSTmTcFormatField> fields = new HashSet<GSSTmTcFormatField>();
		
		fields.addAll(imports.getFrom().getCSField());
		fields.addAll(imports.getFrom().getCSFormulaField());
		fields.addAll(imports.getFrom().getFDICField());
		fields.addAll(imports.getFrom().getVRFieldSize());
		fields.addAll(imports.getFrom().getVSField());
		
		return getSimpleObjectScope(fields);
		
	}
}
