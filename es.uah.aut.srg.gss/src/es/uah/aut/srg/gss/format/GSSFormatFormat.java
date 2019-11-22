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

import es.uah.aut.srg.gss.common.GSSModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Format Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getCSField <em>CS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getCSFormulaField <em>CS Formula Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getVSField <em>VS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getFDICField <em>FDIC Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getVRFieldSize <em>VR Field Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getAField <em>AField</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getAIField <em>AI Field</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat()
 * @model
 * @generated
 */
public interface GSSFormatFormat extends GSSModelElement {
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
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_Protocol()
	 * @model required="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.format.GSSFormatFormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormatType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSFormatFormatType)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatFormatType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormatType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSFormatFormatType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSFormatFormatType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSFormatFormatType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>CS Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatCSField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_CSField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatCSField> getCSField();

	/**
	 * Returns the value of the '<em><b>CS Formula Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatCSFormulaField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Formula Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Formula Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_CSFormulaField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatCSFormulaField> getCSFormulaField();

	/**
	 * Returns the value of the '<em><b>VS Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatVSField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VS Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VS Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_VSField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatVSField> getVSField();

	/**
	 * Returns the value of the '<em><b>FDIC Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatFDICField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FDIC Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FDIC Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_FDICField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatFDICField> getFDICField();

	/**
	 * Returns the value of the '<em><b>VR Field Size</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatVRFieldSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VR Field Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VR Field Size</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_VRFieldSize()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatVRFieldSize> getVRFieldSize();

	/**
	 * Returns the value of the '<em><b>AField</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatAField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AField</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AField</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_AField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatAField> getAField();

	/**
	 * Returns the value of the '<em><b>AI Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.format.GSSFormatAIField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormat_AIField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFormatAIField> getAIField();

} // GSSFormatFormat
