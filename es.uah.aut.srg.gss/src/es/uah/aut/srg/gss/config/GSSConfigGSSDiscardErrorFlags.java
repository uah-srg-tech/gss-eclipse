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
 * A representation of the model object '<em><b>GSS Config GSS Discard Error Flags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSDiscardErrorFlags()
 * @model
 * @generated
 */
public interface GSSConfigGSSDiscardErrorFlags extends EObject {
	/**
	 * Returns the value of the '<em><b>Tx Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Errors</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetTxErrors()
	 * @see #unsetTxErrors()
	 * @see #setTxErrors(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSDiscardErrorFlags_TxErrors()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getTxErrors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Errors</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetTxErrors()
	 * @see #unsetTxErrors()
	 * @see #getTxErrors()
	 * @generated
	 */
	void setTxErrors(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTxErrors()
	 * @see #getTxErrors()
	 * @see #setTxErrors(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetTxErrors();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tx Errors</em>' attribute is set.
	 * @see #unsetTxErrors()
	 * @see #getTxErrors()
	 * @see #setTxErrors(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetTxErrors();

	/**
	 * Returns the value of the '<em><b>Not Expected Packets</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Expected Packets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Expected Packets</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetNotExpectedPackets()
	 * @see #unsetNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSDiscardErrorFlags_NotExpectedPackets()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getNotExpectedPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Expected Packets</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetNotExpectedPackets()
	 * @see #unsetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @generated
	 */
	void setNotExpectedPackets(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetNotExpectedPackets();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Expected Packets</em>' attribute is set.
	 * @see #unsetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetNotExpectedPackets();

	/**
	 * Returns the value of the '<em><b>Filters Ko</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters Ko</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetFiltersKo()
	 * @see #unsetFiltersKo()
	 * @see #setFiltersKo(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSDiscardErrorFlags_FiltersKo()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getFiltersKo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filters Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetFiltersKo()
	 * @see #unsetFiltersKo()
	 * @see #getFiltersKo()
	 * @generated
	 */
	void setFiltersKo(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiltersKo()
	 * @see #getFiltersKo()
	 * @see #setFiltersKo(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetFiltersKo();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filters Ko</em>' attribute is set.
	 * @see #unsetFiltersKo()
	 * @see #getFiltersKo()
	 * @see #setFiltersKo(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetFiltersKo();

	/**
	 * Returns the value of the '<em><b>Valid Times Ko</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Times Ko</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Times Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetValidTimesKo()
	 * @see #unsetValidTimesKo()
	 * @see #setValidTimesKo(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSDiscardErrorFlags_ValidTimesKo()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getValidTimesKo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Times Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetValidTimesKo()
	 * @see #unsetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @generated
	 */
	void setValidTimesKo(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @see #setValidTimesKo(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetValidTimesKo();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid Times Ko</em>' attribute is set.
	 * @see #unsetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @see #setValidTimesKo(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetValidTimesKo();

} // GSSConfigGSSDiscardErrorFlags
