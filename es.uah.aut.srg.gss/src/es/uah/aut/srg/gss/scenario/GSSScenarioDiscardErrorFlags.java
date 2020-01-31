/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.scenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Discard Error Flags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioDiscardErrorFlags()
 * @model
 * @generated
 */
public interface GSSScenarioDiscardErrorFlags extends EObject {
	/**
	 * Returns the value of the '<em><b>Tx Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Errors</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetTxErrors()
	 * @see #unsetTxErrors()
	 * @see #setTxErrors(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioDiscardErrorFlags_TxErrors()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getTxErrors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Errors</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetTxErrors()
	 * @see #unsetTxErrors()
	 * @see #getTxErrors()
	 * @generated
	 */
	void setTxErrors(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTxErrors()
	 * @see #getTxErrors()
	 * @see #setTxErrors(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetTxErrors();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tx Errors</em>' attribute is set.
	 * @see #unsetTxErrors()
	 * @see #getTxErrors()
	 * @see #setTxErrors(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetTxErrors();

	/**
	 * Returns the value of the '<em><b>Not Expected Packets</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Expected Packets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Expected Packets</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetNotExpectedPackets()
	 * @see #unsetNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioDiscardErrorFlags_NotExpectedPackets()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getNotExpectedPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Expected Packets</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetNotExpectedPackets()
	 * @see #unsetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @generated
	 */
	void setNotExpectedPackets(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetNotExpectedPackets();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Expected Packets</em>' attribute is set.
	 * @see #unsetNotExpectedPackets()
	 * @see #getNotExpectedPackets()
	 * @see #setNotExpectedPackets(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetNotExpectedPackets();

	/**
	 * Returns the value of the '<em><b>Filters Ko</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters Ko</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetFiltersKo()
	 * @see #unsetFiltersKo()
	 * @see #setFiltersKo(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioDiscardErrorFlags_FiltersKo()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getFiltersKo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filters Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetFiltersKo()
	 * @see #unsetFiltersKo()
	 * @see #getFiltersKo()
	 * @generated
	 */
	void setFiltersKo(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiltersKo()
	 * @see #getFiltersKo()
	 * @see #setFiltersKo(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetFiltersKo();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filters Ko</em>' attribute is set.
	 * @see #unsetFiltersKo()
	 * @see #getFiltersKo()
	 * @see #setFiltersKo(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetFiltersKo();

	/**
	 * Returns the value of the '<em><b>Valid Times Ko</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Times Ko</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Times Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetValidTimesKo()
	 * @see #unsetValidTimesKo()
	 * @see #setValidTimesKo(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioDiscardErrorFlags_ValidTimesKo()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getValidTimesKo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Times Ko</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetValidTimesKo()
	 * @see #unsetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @generated
	 */
	void setValidTimesKo(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @see #setValidTimesKo(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetValidTimesKo();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid Times Ko</em>' attribute is set.
	 * @see #unsetValidTimesKo()
	 * @see #getValidTimesKo()
	 * @see #setValidTimesKo(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetValidTimesKo();

} // GSSScenarioDiscardErrorFlags
