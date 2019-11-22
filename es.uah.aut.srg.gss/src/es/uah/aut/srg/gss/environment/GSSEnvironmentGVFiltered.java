/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.environment;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment GV Filtered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVFiltered()
 * @model
 * @generated
 */
public interface GSSEnvironmentGVFiltered extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var Ref</em>' reference.
	 * @see #setGlobalVarRef(GSSEnvironmentGlobalVar)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVFiltered_GlobalVarRef()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentGlobalVar getGlobalVarRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getGlobalVarRef <em>Global Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Var Ref</em>' reference.
	 * @see #getGlobalVarRef()
	 * @generated
	 */
	void setGlobalVarRef(GSSEnvironmentGlobalVar value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVFiltered_Filter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(GSSFilterFilter value);

} // GSSEnvironmentGVFiltered
