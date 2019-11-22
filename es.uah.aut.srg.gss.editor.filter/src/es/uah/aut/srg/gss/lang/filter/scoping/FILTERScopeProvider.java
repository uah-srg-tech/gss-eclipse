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
package es.uah.aut.srg.gss.lang.filter.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter;
import es.uah.aut.srg.gss.filter.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.format.GSSFormatField;
import es.uah.aut.srg.gss.xtext.GSSAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class FILTERScopeProvider extends GSSAbstractScopeProvider {

	public IScope scope_GSSFormatField(final GSSFilterMaxtermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		Set<GSSFormatField> fields = new HashSet<GSSFormatField>();
		
		fields.addAll(filter.getFormatFile().getCSField());
		fields.addAll(filter.getFormatFile().getCSFormulaField());
		fields.addAll(filter.getFormatFile().getFDICField());
		fields.addAll(filter.getFormatFile().getVRFieldSize());
		fields.addAll(filter.getFormatFile().getVSField());
		
		return getSimpleObjectScope(fields);
	}

	public IScope scope_GSSFormatField(final GSSFilterMintermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		Set<GSSFormatField> fields = new HashSet<GSSFormatField>();
		
		fields.addAll(filter.getFormatFile().getCSField());
		fields.addAll(filter.getFormatFile().getCSFormulaField());
		fields.addAll(filter.getFormatFile().getFDICField());
		fields.addAll(filter.getFormatFile().getVRFieldSize());
		fields.addAll(filter.getFormatFile().getVSField());
		
		return getSimpleObjectScope(fields);
	}
	
	public IScope scope_GSSTmTcAIFormatField(final GSSFilterMaxtermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getAIField());
	}
	
	public IScope scope_GSSTmTcAIFormatField(final GSSFilterMintermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getAIField());
	}
	
	public IScope scope_GSSFormatFDICField(final GSSFilterMaxtermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getFDICField());
	}
	
	public IScope scope_GSSFormatFDICField(final GSSFilterMintermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getFDICField());
	}
}
