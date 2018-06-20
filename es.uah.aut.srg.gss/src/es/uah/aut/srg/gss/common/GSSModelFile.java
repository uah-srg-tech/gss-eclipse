/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Model File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.common.GSSModelFile#getElement <em>Element</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.common.GSSModelFile#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.common.commonPackage#getGSSModelFile()
 * @model
 * @generated
 */
public interface GSSModelFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(GSSModelElement)
	 * @see es.uah.aut.srg.gss.common.commonPackage#getGSSModelFile_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSModelElement getElement();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.common.GSSModelFile#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(GSSModelElement value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.common.GSSModelFileImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.common.commonPackage#getGSSModelFile_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSModelFileImport> getImports();

} // GSSModelFile
