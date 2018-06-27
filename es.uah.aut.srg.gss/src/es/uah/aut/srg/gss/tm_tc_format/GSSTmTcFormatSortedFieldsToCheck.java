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
package es.uah.aut.srg.gss.tm_tc_format;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Tm Tc Format Sorted Fields To Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck#getFieldToCheck <em>Field To Check</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatSortedFieldsToCheck()
 * @model
 * @generated
 */
public interface GSSTmTcFormatSortedFieldsToCheck extends EObject {

	/**
	 * Returns the value of the '<em><b>Field To Check</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field To Check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field To Check</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatSortedFieldsToCheck_FieldToCheck()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatFieldToCheck> getFieldToCheck();
} // GSSTmTcFormatSortedFieldsToCheck
