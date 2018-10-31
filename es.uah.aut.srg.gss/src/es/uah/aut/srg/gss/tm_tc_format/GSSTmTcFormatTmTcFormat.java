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

import es.uah.aut.srg.gss.common.GSSModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Tm Tc Format Tm Tc Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getCSField <em>CS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getCSFormulaField <em>CS Formula Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getVSField <em>VS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getFDICField <em>FDIC Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getVRFieldSize <em>VR Field Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getAField <em>AField</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getAIField <em>AI Field</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat()
 * @model
 * @generated
 */
public interface GSSTmTcFormatTmTcFormat extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_Protocol()
	 * @model required="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormatType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSTmTcFormatTmTcFormatType)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatTmTcFormatType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormatType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSTmTcFormatTmTcFormatType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSTmTcFormatTmTcFormatType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSTmTcFormatTmTcFormatType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>CS Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_CSField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatCSField> getCSField();

	/**
	 * Returns the value of the '<em><b>CS Formula Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Formula Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Formula Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_CSFormulaField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatCSFormulaField> getCSFormulaField();

	/**
	 * Returns the value of the '<em><b>VS Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VS Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VS Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_VSField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatVSField> getVSField();

	/**
	 * Returns the value of the '<em><b>FDIC Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FDIC Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FDIC Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_FDICField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatFDICField> getFDICField();

	/**
	 * Returns the value of the '<em><b>VR Field Size</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VR Field Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VR Field Size</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_VRFieldSize()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatVRFieldSize> getVRFieldSize();

	/**
	 * Returns the value of the '<em><b>AField</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AField</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AField</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_AField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatAField> getAField();

	/**
	 * Returns the value of the '<em><b>AI Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatTmTcFormat_AIField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTmTcFormatAIField> getAIField();

} // GSSTmTcFormatTmTcFormat
