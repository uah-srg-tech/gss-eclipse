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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigEnableDisable;
import es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config GSS Discard Error Flags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl#getTxErrors <em>Tx Errors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl#getNotExpectedPackets <em>Not Expected Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl#getFiltersKo <em>Filters Ko</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl#getValidTimesKo <em>Valid Times Ko</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigGSSDiscardErrorFlagsImpl extends MinimalEObjectImpl.Container implements GSSConfigGSSDiscardErrorFlags {
	/**
	 * The default value of the '{@link #getTxErrors() <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxErrors()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigEnableDisable TX_ERRORS_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getTxErrors() <em>Tx Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxErrors()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable txErrors = TX_ERRORS_EDEFAULT;

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
	protected static final GSSConfigEnableDisable NOT_EXPECTED_PACKETS_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getNotExpectedPackets() <em>Not Expected Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotExpectedPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable notExpectedPackets = NOT_EXPECTED_PACKETS_EDEFAULT;

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
	protected static final GSSConfigEnableDisable FILTERS_KO_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getFiltersKo() <em>Filters Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersKo()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable filtersKo = FILTERS_KO_EDEFAULT;

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
	protected static final GSSConfigEnableDisable VALID_TIMES_KO_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getValidTimesKo() <em>Valid Times Ko</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTimesKo()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable validTimesKo = VALID_TIMES_KO_EDEFAULT;

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
	protected GSSConfigGSSDiscardErrorFlagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable getTxErrors() {
		return txErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxErrors(GSSConfigEnableDisable newTxErrors) {
		GSSConfigEnableDisable oldTxErrors = txErrors;
		txErrors = newTxErrors == null ? TX_ERRORS_EDEFAULT : newTxErrors;
		boolean oldTxErrorsESet = txErrorsESet;
		txErrorsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS, oldTxErrors, txErrors, !oldTxErrorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTxErrors() {
		GSSConfigEnableDisable oldTxErrors = txErrors;
		boolean oldTxErrorsESet = txErrorsESet;
		txErrors = TX_ERRORS_EDEFAULT;
		txErrorsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS, oldTxErrors, TX_ERRORS_EDEFAULT, oldTxErrorsESet));
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
	public GSSConfigEnableDisable getNotExpectedPackets() {
		return notExpectedPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotExpectedPackets(GSSConfigEnableDisable newNotExpectedPackets) {
		GSSConfigEnableDisable oldNotExpectedPackets = notExpectedPackets;
		notExpectedPackets = newNotExpectedPackets == null ? NOT_EXPECTED_PACKETS_EDEFAULT : newNotExpectedPackets;
		boolean oldNotExpectedPacketsESet = notExpectedPacketsESet;
		notExpectedPacketsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS, oldNotExpectedPackets, notExpectedPackets, !oldNotExpectedPacketsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotExpectedPackets() {
		GSSConfigEnableDisable oldNotExpectedPackets = notExpectedPackets;
		boolean oldNotExpectedPacketsESet = notExpectedPacketsESet;
		notExpectedPackets = NOT_EXPECTED_PACKETS_EDEFAULT;
		notExpectedPacketsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS, oldNotExpectedPackets, NOT_EXPECTED_PACKETS_EDEFAULT, oldNotExpectedPacketsESet));
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
	public GSSConfigEnableDisable getFiltersKo() {
		return filtersKo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltersKo(GSSConfigEnableDisable newFiltersKo) {
		GSSConfigEnableDisable oldFiltersKo = filtersKo;
		filtersKo = newFiltersKo == null ? FILTERS_KO_EDEFAULT : newFiltersKo;
		boolean oldFiltersKoESet = filtersKoESet;
		filtersKoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO, oldFiltersKo, filtersKo, !oldFiltersKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiltersKo() {
		GSSConfigEnableDisable oldFiltersKo = filtersKo;
		boolean oldFiltersKoESet = filtersKoESet;
		filtersKo = FILTERS_KO_EDEFAULT;
		filtersKoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO, oldFiltersKo, FILTERS_KO_EDEFAULT, oldFiltersKoESet));
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
	public GSSConfigEnableDisable getValidTimesKo() {
		return validTimesKo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTimesKo(GSSConfigEnableDisable newValidTimesKo) {
		GSSConfigEnableDisable oldValidTimesKo = validTimesKo;
		validTimesKo = newValidTimesKo == null ? VALID_TIMES_KO_EDEFAULT : newValidTimesKo;
		boolean oldValidTimesKoESet = validTimesKoESet;
		validTimesKoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO, oldValidTimesKo, validTimesKo, !oldValidTimesKoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidTimesKo() {
		GSSConfigEnableDisable oldValidTimesKo = validTimesKo;
		boolean oldValidTimesKoESet = validTimesKoESet;
		validTimesKo = VALID_TIMES_KO_EDEFAULT;
		validTimesKoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO, oldValidTimesKo, VALID_TIMES_KO_EDEFAULT, oldValidTimesKoESet));
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
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS:
				return getTxErrors();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				return getNotExpectedPackets();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO:
				return getFiltersKo();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
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
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS:
				setTxErrors((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				setNotExpectedPackets((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO:
				setFiltersKo((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
				setValidTimesKo((GSSConfigEnableDisable)newValue);
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
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS:
				unsetTxErrors();
				return;
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				unsetNotExpectedPackets();
				return;
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO:
				unsetFiltersKo();
				return;
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
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
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS:
				return isSetTxErrors();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS:
				return isSetNotExpectedPackets();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO:
				return isSetFiltersKo();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO:
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

} //GSSConfigGSSDiscardErrorFlagsImpl
