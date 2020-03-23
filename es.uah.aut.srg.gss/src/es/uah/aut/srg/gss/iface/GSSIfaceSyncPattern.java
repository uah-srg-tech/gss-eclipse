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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Iface Sync Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSyncPattern()
 * @model
 * @generated
 */
public interface GSSIfaceSyncPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Hex Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Value</em>' attribute.
	 * @see #setHexValue(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSyncPattern_HexValue()
	 * @model required="true"
	 * @generated
	 */
	String getHexValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern#getHexValue <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Value</em>' attribute.
	 * @see #getHexValue()
	 * @generated
	 */
	void setHexValue(String value);

} // GSSIfaceSyncPattern
