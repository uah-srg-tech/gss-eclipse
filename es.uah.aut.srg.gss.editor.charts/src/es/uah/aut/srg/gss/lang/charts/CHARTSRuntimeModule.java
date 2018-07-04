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
package es.uah.aut.srg.gss.lang.charts;

import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import es.uah.aut.srg.gss.xtext.GSSDescriptionAssociator;
import es.uah.aut.srg.gss.xtext.GSSLazyLinker;
import es.uah.aut.srg.gss.xtext.GSSQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CHARTSRuntimeModule extends AbstractCHARTSRuntimeModule {
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return GSSQualifiedNameProvider.GSSDefaultNameConverter.class;
	}
	
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {  
		return GSSQualifiedNameProvider.class;
	}
	
	public Class<? extends GSSDescriptionAssociator> bindDescriptionAssociator() {
		return GSSDescriptionAssociator.class;
	}
	
	public Class<? extends ILinker> bindILinker() {
		return GSSLazyLinker.class;
	}
}
