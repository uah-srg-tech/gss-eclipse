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

import es.uah.aut.srg.gss.common.GSSModelObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Tm Tc Format Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField#getPfid <em>Pfid</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatField()
 * @model abstract="true"
 * @generated
 */
public interface GSSTmTcFormatField extends GSSModelObject {
	/**
	 * Returns the value of the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fid</em>' attribute.
	 * @see #setFid(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatField_Fid()
	 * @model required="true"
	 * @generated
	 */
	String getFid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField#getFid <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fid</em>' attribute.
	 * @see #getFid()
	 * @generated
	 */
	void setFid(String value);

	/**
	 * Returns the value of the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfid</em>' attribute.
	 * @see #setPfid(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatField_Pfid()
	 * @model required="true"
	 * @generated
	 */
	String getPfid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField#getPfid <em>Pfid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfid</em>' attribute.
	 * @see #getPfid()
	 * @generated
	 */
	void setPfid(String value);

} // GSSTmTcFormatField
