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
package es.uah.aut.srg.gss.environment.impl;

import es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags;
import es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Discard Error Flags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl#getTxErrors <em>Tx Errors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl#getNotExpectedPackets <em>Not Expected Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl#getFiltersKo <em>Filters Ko</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl#getValidTimesKo <em>Valid Times Ko</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentDiscardErrorFlagsImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentDiscardErrorFlags {
	/**
	 * The default value of the '{@link #getTxErrors() <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxErrors()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentEnableDisable TX_ERRORS_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getTxErrors() <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxErrors()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable txErrors = TX_ERRORS_EDEFAULT;

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
	protected static final GSSEnvironmentEnableDisable NOT_EXPECTED_PACKETS_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getNotExpectedPackets() <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotExpectedPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable notExpectedPackets = NOT_EXPECTED_PACKETS_EDEFAULT;

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
	protected static final GSSEnvironmentEnableDisable FILTERS_KO_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getFiltersKo() <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersKo()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable filtersKo = FILTERS_KO_EDEFAULT;

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
	protected static final GSSEnvironmentEnableDisable VALID_TIMES_KO_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getValidTimesKo() <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTimesKo()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable validTimesKo = VALID_TIMES_KO_EDEFAULT;

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
	protected GSSEnvironmentDiscardErrorFlagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnableDisable getTxErrors() {
		return txErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxErrors(GSSEnvironmentEnableDisable newTxErrors) {
		GSSEnvironmentEnableDisable oldTxErrors = txErrors;
		txErrors = newTxErrors == null ? TX_ERRORS_EDEFAULT : newTxErrors;
		boolean oldTxErrorsESet = txErrorsESet;
		txErrorsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS, oldTxErrors, txErrors, !oldTxErrorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTxErrors() {
		GSSEnvironmentEnableDisable oldTxErrors = txErrors;
		boolean oldTxErrorsESet = txErrorsESet;
		txErrors = TX_ERRORS_EDEFAULT;
		txErrorsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS, oldTxErrors, TX_ERRORS_EDEFAULT, oldTxErrorsESet));
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
	public GSSEnvironmentEnableDisable getNotExpectedPackets() {
		return notExpectedPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotExpectedPackets(GSSEnvironmentEnableDisable newNotExpectedPackets) {
		GSSEnvironmentEnableDisable oldNotExpectedPackets = notExpectedPackets;
		notExpectedPackets = newNotExpectedPackets == null ? NOT_EXPECTED_PACKETS_EDEFAULT : newNotExpectedPackets;
		boolean oldNotExpectedPacketsESet = notExpectedPacketsESet;
		notExpectedPacketsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS, oldNotExpectedPackets, notExpectedPackets, !oldNotExpectedPacketsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotExpectedPackets() {
		GSSEnvironmentEnableDisable oldNotExpectedPackets = notExpectedPackets;
		boolean oldNotExpectedPacketsESet = notExpectedPacketsESet;
		notExpectedPackets = NOT_EXPECTED_PACKETS_EDEFAULT;
		notExpectedPacketsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS, oldNotExpectedPackets, NOT_EXPECTED_PACKETS_EDEFAULT, oldNotExpectedPacketsESet));
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
	public GSSEnvironmentEnableDisable getFiltersKo() {
		return filtersKo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltersKo(GSSEnvironmentEnableDisable newFiltersKo) {
		GSSEnvironmentEnableDisable oldFiltersKo = filtersKo;
		filtersKo = newFiltersKo == null ? FILTERS_KO_EDEFAULT : newFiltersKo;
		boolean oldFiltersKoESet = filtersKoESet;
		filtersKoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO, oldFiltersKo, filtersKo, !oldFiltersKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiltersKo() {
		GSSEnvironmentEnableDisable oldFiltersKo = filtersKo;
		boolean oldFiltersKoESet = filtersKoESet;
		filtersKo = FILTERS_KO_EDEFAULT;
		filtersKoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO, oldFiltersKo, FILTERS_KO_EDEFAULT, oldFiltersKoESet));
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
	public GSSEnvironmentEnableDisable getValidTimesKo() {
		return validTimesKo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTimesKo(GSSEnvironmentEnableDisable newValidTimesKo) {
		GSSEnvironmentEnableDisable oldValidTimesKo = validTimesKo;
		validTimesKo = newValidTimesKo == null ? VALID_TIMES_KO_EDEFAULT : newValidTimesKo;
		boolean oldValidTimesKoESet = validTimesKoESet;
		validTimesKoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO, oldValidTimesKo, validTimesKo, !oldValidTimesKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidTimesKo() {
		GSSEnvironmentEnableDisable oldValidTimesKo = validTimesKo;
		boolean oldValidTimesKoESet = validTimesKoESet;
		validTimesKo = VALID_TIMES_KO_EDEFAULT;
		validTimesKoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO, oldValidTimesKo, VALID_TIMES_KO_EDEFAULT, oldValidTimesKoESet));
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
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS:
				return getTxErrors();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				return getNotExpectedPackets();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO:
				return getFiltersKo();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
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
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS:
				setTxErrors((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				setNotExpectedPackets((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO:
				setFiltersKo((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
				setValidTimesKo((GSSEnvironmentEnableDisable)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS:
				unsetTxErrors();
				return;
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				unsetNotExpectedPackets();
				return;
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO:
				unsetFiltersKo();
				return;
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
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
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS:
				return isSetTxErrors();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				return isSetNotExpectedPackets();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO:
				return isSetFiltersKo();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
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

} //GSSEnvironmentDiscardErrorFlagsImpl
