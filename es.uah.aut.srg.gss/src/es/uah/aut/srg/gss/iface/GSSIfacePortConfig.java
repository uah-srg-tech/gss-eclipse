/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.iface;

import es.uah.aut.srg.gss.common.GSSModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Iface Port Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortConfig#getPortConfig <em>Port Config</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortConfig()
 * @model
 * @generated
 */
public interface GSSIfacePortConfig extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Port Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Config</em>' containment reference.
	 * @see #setPortConfig(GSSIfacePort)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortConfig_PortConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfacePort getPortConfig();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortConfig#getPortConfig <em>Port Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Config</em>' containment reference.
	 * @see #getPortConfig()
	 * @generated
	 */
	void setPortConfig(GSSIfacePort value);

} // GSSIfacePortConfig
