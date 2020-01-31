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
package es.uah.aut.srg.gss.scenario.impl;

import es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags;
import es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Discard Error Flags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl#getTxErrors <em>Tx Errors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl#getNotExpectedPackets <em>Not Expected Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl#getFiltersKo <em>Filters Ko</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl#getValidTimesKo <em>Valid Times Ko</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioDiscardErrorFlagsImpl extends MinimalEObjectImpl.Container implements GSSScenarioDiscardErrorFlags {
	/**
	 * The default value of the '{@link #getTxErrors() <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxErrors()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioEnableDisable TX_ERRORS_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getTxErrors() <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxErrors()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable txErrors = TX_ERRORS_EDEFAULT;

	/**
	 * This is true if the Tx Errors attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean txErrorsESet;

	/**
	 * The default value of the '{@link #getNotExpectedPackets() <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotExpectedPackets()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioEnableDisable NOT_EXPECTED_PACKETS_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getNotExpectedPackets() <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotExpectedPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable notExpectedPackets = NOT_EXPECTED_PACKETS_EDEFAULT;

	/**
	 * This is true if the Not Expected Packets attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notExpectedPacketsESet;

	/**
	 * The default value of the '{@link #getFiltersKo() <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersKo()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioEnableDisable FILTERS_KO_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getFiltersKo() <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersKo()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable filtersKo = FILTERS_KO_EDEFAULT;

	/**
	 * This is true if the Filters Ko attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filtersKoESet;

	/**
	 * The default value of the '{@link #getValidTimesKo() <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTimesKo()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioEnableDisable VALID_TIMES_KO_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getValidTimesKo() <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTimesKo()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable validTimesKo = VALID_TIMES_KO_EDEFAULT;

	/**
	 * This is true if the Valid Times Ko attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validTimesKoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioDiscardErrorFlagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_DISCARD_ERROR_FLAGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable getTxErrors() {
		return txErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxErrors(GSSScenarioEnableDisable newTxErrors) {
		GSSScenarioEnableDisable oldTxErrors = txErrors;
		txErrors = newTxErrors == null ? TX_ERRORS_EDEFAULT : newTxErrors;
		boolean oldTxErrorsESet = txErrorsESet;
		txErrorsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS, oldTxErrors, txErrors, !oldTxErrorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTxErrors() {
		GSSScenarioEnableDisable oldTxErrors = txErrors;
		boolean oldTxErrorsESet = txErrorsESet;
		txErrors = TX_ERRORS_EDEFAULT;
		txErrorsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS, oldTxErrors, TX_ERRORS_EDEFAULT, oldTxErrorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTxErrors() {
		return txErrorsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable getNotExpectedPackets() {
		return notExpectedPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotExpectedPackets(GSSScenarioEnableDisable newNotExpectedPackets) {
		GSSScenarioEnableDisable oldNotExpectedPackets = notExpectedPackets;
		notExpectedPackets = newNotExpectedPackets == null ? NOT_EXPECTED_PACKETS_EDEFAULT : newNotExpectedPackets;
		boolean oldNotExpectedPacketsESet = notExpectedPacketsESet;
		notExpectedPacketsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS, oldNotExpectedPackets, notExpectedPackets, !oldNotExpectedPacketsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotExpectedPackets() {
		GSSScenarioEnableDisable oldNotExpectedPackets = notExpectedPackets;
		boolean oldNotExpectedPacketsESet = notExpectedPacketsESet;
		notExpectedPackets = NOT_EXPECTED_PACKETS_EDEFAULT;
		notExpectedPacketsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS, oldNotExpectedPackets, NOT_EXPECTED_PACKETS_EDEFAULT, oldNotExpectedPacketsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotExpectedPackets() {
		return notExpectedPacketsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable getFiltersKo() {
		return filtersKo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltersKo(GSSScenarioEnableDisable newFiltersKo) {
		GSSScenarioEnableDisable oldFiltersKo = filtersKo;
		filtersKo = newFiltersKo == null ? FILTERS_KO_EDEFAULT : newFiltersKo;
		boolean oldFiltersKoESet = filtersKoESet;
		filtersKoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO, oldFiltersKo, filtersKo, !oldFiltersKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiltersKo() {
		GSSScenarioEnableDisable oldFiltersKo = filtersKo;
		boolean oldFiltersKoESet = filtersKoESet;
		filtersKo = FILTERS_KO_EDEFAULT;
		filtersKoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO, oldFiltersKo, FILTERS_KO_EDEFAULT, oldFiltersKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiltersKo() {
		return filtersKoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable getValidTimesKo() {
		return validTimesKo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTimesKo(GSSScenarioEnableDisable newValidTimesKo) {
		GSSScenarioEnableDisable oldValidTimesKo = validTimesKo;
		validTimesKo = newValidTimesKo == null ? VALID_TIMES_KO_EDEFAULT : newValidTimesKo;
		boolean oldValidTimesKoESet = validTimesKoESet;
		validTimesKoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO, oldValidTimesKo, validTimesKo, !oldValidTimesKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidTimesKo() {
		GSSScenarioEnableDisable oldValidTimesKo = validTimesKo;
		boolean oldValidTimesKoESet = validTimesKoESet;
		validTimesKo = VALID_TIMES_KO_EDEFAULT;
		validTimesKoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO, oldValidTimesKo, VALID_TIMES_KO_EDEFAULT, oldValidTimesKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidTimesKo() {
		return validTimesKoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS:
				return getTxErrors();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				return getNotExpectedPackets();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO:
				return getFiltersKo();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
				return getValidTimesKo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS:
				setTxErrors((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				setNotExpectedPackets((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO:
				setFiltersKo((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
				setValidTimesKo((GSSScenarioEnableDisable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS:
				unsetTxErrors();
				return;
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				unsetNotExpectedPackets();
				return;
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO:
				unsetFiltersKo();
				return;
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
				unsetValidTimesKo();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS:
				return isSetTxErrors();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				return isSetNotExpectedPackets();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO:
				return isSetFiltersKo();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
				return isSetValidTimesKo();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (txErrors: ");
		if (txErrorsESet) result.append(txErrors); else result.append("<unset>");
		result.append(", notExpectedPackets: ");
		if (notExpectedPacketsESet) result.append(notExpectedPackets); else result.append("<unset>");
		result.append(", filtersKo: ");
		if (filtersKoESet) result.append(filtersKo); else result.append("<unset>");
		result.append(", validTimesKo: ");
		if (validTimesKoESet) result.append(validTimesKo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSScenarioDiscardErrorFlagsImpl
