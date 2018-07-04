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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config GV Filtered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGVFiltered()
 * @model
 * @generated
 */
public interface GSSConfigGVFiltered extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Var Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var Ref</em>' attribute.
	 * @see #setGlobalVarRef(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGVFiltered_GlobalVarRef()
	 * @model required="true"
	 * @generated
	 */
	String getGlobalVarRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getGlobalVarRef <em>Global Var Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Var Ref</em>' attribute.
	 * @see #getGlobalVarRef()
	 * @generated
	 */
	void setGlobalVarRef(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGVFiltered_Filter()
	 * @model required="true"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // GSSConfigGVFiltered
