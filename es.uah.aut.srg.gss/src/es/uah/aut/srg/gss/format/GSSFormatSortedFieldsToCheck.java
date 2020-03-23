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
package es.uah.aut.srg.gss.format;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Format Sorted Fields To Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck#getFieldToCheck <em>Field To Check</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatSortedFieldsToCheck()
 * @model
 * @generated
 */
public interface GSSFormatSortedFieldsToCheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Field To Check</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatFieldToCheck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field To Check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field To Check</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatSortedFieldsToCheck_FieldToCheck()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatFieldToCheck> getFieldToCheck();

} // GSSFormatSortedFieldsToCheck
