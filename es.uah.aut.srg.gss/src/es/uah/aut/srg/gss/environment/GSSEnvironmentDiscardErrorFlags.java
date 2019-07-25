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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Discard Error Flags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentDiscardErrorFlags()
 * @model
 * @generated
 */
public interface GSSEnvironmentDiscardErrorFlags extends EObject {
	/**
	 * Returns the value of the '<em><b>Tx Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Errors</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetTxErrors()
	 * @see #unsetTxErrors()
	 * @see #setTxErrors(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentDiscardErrorFlags_TxErrors()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getTxErrors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Errors</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetTxErrors()
	 * @see #unsetTxErrors()
	 * @see #getTxErrors()
	 * @generated
	 */
	void setTxErrors(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTxErrors()
	 * @see #getTxErrors()
	 * @see #setTxErrors(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetTxErrors();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tx Errors</em>' attribute is set.
	 * @see #unsetTxErrors()
	 * @see #getTxErrors()
	 * @see #setTxErrors(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetTxErrors();

	/**
	 * Returns the value of the '<em><b>Not Expected Packets</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Expected Packets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Expected Packets</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetNotExpectedPackets()
	 * @see #unsetNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentDiscardErrorFlags_NotExpectedPackets()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getNotExpectedPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Expected Packets</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetNotExpectedPackets()
	 * @see #unsetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @generated
	 */
	void setNotExpectedPackets(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetNotExpectedPackets();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Expected Packets</em>' attribute is set.
	 * @see #unsetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetNotExpectedPackets();

	/**
	 * Returns the value of the '<em><b>Filters Ko</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters Ko</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetFiltersKo()
	 * @see #unsetFiltersKo()
	 * @see #setFiltersKo(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentDiscardErrorFlags_FiltersKo()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getFiltersKo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filters Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetFiltersKo()
	 * @see #unsetFiltersKo()
	 * @see #getFiltersKo()
	 * @generated
	 */
	void setFiltersKo(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiltersKo()
	 * @see #getFiltersKo()
	 * @see #setFiltersKo(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetFiltersKo();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filters Ko</em>' attribute is set.
	 * @see #unsetFiltersKo()
	 * @see #getFiltersKo()
	 * @see #setFiltersKo(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetFiltersKo();

	/**
	 * Returns the value of the '<em><b>Valid Times Ko</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Times Ko</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Times Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetValidTimesKo()
	 * @see #unsetValidTimesKo()
	 * @see #setValidTimesKo(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentDiscardErrorFlags_ValidTimesKo()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getValidTimesKo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Times Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetValidTimesKo()
	 * @see #unsetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @generated
	 */
	void setValidTimesKo(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @see #setValidTimesKo(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetValidTimesKo();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid Times Ko</em>' attribute is set.
	 * @see #unsetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @see #setValidTimesKo(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetValidTimesKo();

} // GSSEnvironmentDiscardErrorFlags
