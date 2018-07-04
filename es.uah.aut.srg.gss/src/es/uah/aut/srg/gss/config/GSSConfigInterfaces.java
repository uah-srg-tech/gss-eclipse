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
package es.uah.aut.srg.gss.config;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces#getMainInterface <em>Main Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigInterfaces()
 * @model
 * @generated
 */
public interface GSSConfigInterfaces extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Interface</em>' containment reference.
	 * @see #setMainInterface(GSSConfigMainInterface)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigInterfaces_MainInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigMainInterface getMainInterface();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces#getMainInterface <em>Main Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Interface</em>' containment reference.
	 * @see #getMainInterface()
	 * @generated
	 */
	void setMainInterface(GSSConfigMainInterface value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigInterfaces_Interface()
	 * @model containment="true" upper="7"
	 * @generated
	 */
	EList<GSSConfigInterface> getInterface();

} // GSSConfigInterfaces
