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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Tm Tc Format VR Field Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getPfid <em>Pfid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVRFieldSize()
 * @model
 * @generated
 */
public interface GSSTmTcFormatVRFieldSize extends EObject {
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVRFieldSize_Fid()
	 * @model required="true"
	 * @generated
	 */
	String getFid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getFid <em>Fid</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVRFieldSize_Pfid()
	 * @model required="true"
	 * @generated
	 */
	String getPfid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getPfid <em>Pfid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfid</em>' attribute.
	 * @see #getPfid()
	 * @generated
	 */
	void setPfid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVRFieldSize_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GSSTmTcFormatVRFieldSize
