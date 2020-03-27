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
package es.uah.aut.srg.gss.lang.export.ui;

import com.google.inject.Injector;
import es.uah.aut.srg.gss.editor.export.ui.internal.ExportActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EXPORTExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ExportActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ExportActivator.getInstance().getInjector(ExportActivator.ES_UAH_AUT_SRG_GSS_LANG_EXPORT_EXPORT);
	}
	
}
