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
package es.uah.aut.srg.gss.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Structured Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData#getFirstField <em>First Field</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigStructuredData()
 * @model
 * @generated
 */
public interface GSSConfigStructuredData extends EObject {
	/**
	 * Returns the value of the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Ref</em>' attribute.
	 * @see #setLevelRef(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigStructuredData_LevelRef()
	 * @model required="true"
	 * @generated
	 */
	String getLevelRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData#getLevelRef <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Ref</em>' attribute.
	 * @see #getLevelRef()
	 * @generated
	 */
	void setLevelRef(String value);

	/**
	 * Returns the value of the '<em><b>First Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Field</em>' attribute.
	 * @see #setFirstField(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigStructuredData_FirstField()
	 * @model required="true"
	 * @generated
	 */
	String getFirstField();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData#getFirstField <em>First Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Field</em>' attribute.
	 * @see #getFirstField()
	 * @generated
	 */
	void setFirstField(String value);

} // GSSConfigStructuredData
