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
package es.uah.aut.srg.gss.lang.tm_tc_format;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class TM_TC_FORMATStandaloneSetup extends TM_TC_FORMATStandaloneSetupGenerated {

	public static void doSetup() {
		new TM_TC_FORMATStandaloneSetup().createInjectorAndDoEMFRegistration();
	}				
}
