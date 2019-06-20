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
package es.uah.aut.srg.gss.filters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Minterm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMinterm#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMinterm#getBoolVarRef <em>Bool Var Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMinterm()
 * @model
 * @generated
 */
public interface GSSFilterMinterm extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMinterm_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filters.GSSFilterMinterm#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Bool Var Ref</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filters.GSSFilterBoolVarRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var Ref</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMinterm_BoolVarRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GSSFilterBoolVarRef> getBoolVarRef();

} // GSSFilterMinterm
