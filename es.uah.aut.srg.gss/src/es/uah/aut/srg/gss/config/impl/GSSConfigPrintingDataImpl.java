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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigEnableDisable;
import es.uah.aut.srg.gss.config.GSSConfigPrintingData;
import es.uah.aut.srg.gss.config.GSSConfigStructuredData;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Printing Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPrintingDataImpl#getPrintStatus <em>Print Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPrintingDataImpl#getStructuredData <em>Structured Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPrintingDataImpl extends MinimalEObjectImpl.Container implements GSSConfigPrintingData {
	/**
	 * The default value of the '{@link #getPrintStatus() <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigEnableDisable PRINT_STATUS_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getPrintStatus() <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable printStatus = PRINT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuredData() <em>Structured Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredData()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigStructuredData structuredData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPrintingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PRINTING_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable getPrintStatus() {
		return printStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintStatus(GSSConfigEnableDisable newPrintStatus) {
		GSSConfigEnableDisable oldPrintStatus = printStatus;
		printStatus = newPrintStatus == null ? PRINT_STATUS_EDEFAULT : newPrintStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PRINTING_DATA__PRINT_STATUS, oldPrintStatus, printStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigStructuredData getStructuredData() {
		return structuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredData(GSSConfigStructuredData newStructuredData, NotificationChain msgs) {
		GSSConfigStructuredData oldStructuredData = structuredData;
		structuredData = newStructuredData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA, oldStructuredData, newStructuredData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredData(GSSConfigStructuredData newStructuredData) {
		if (newStructuredData != structuredData) {
			NotificationChain msgs = null;
			if (structuredData != null)
				msgs = ((InternalEObject)structuredData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA, null, msgs);
			if (newStructuredData != null)
				msgs = ((InternalEObject)newStructuredData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA, null, msgs);
			msgs = basicSetStructuredData(newStructuredData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA, newStructuredData, newStructuredData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA:
				return basicSetStructuredData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PRINTING_DATA__PRINT_STATUS:
				return getPrintStatus();
			case configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA:
				return getStructuredData();
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
			case configPackage.GSS_CONFIG_PRINTING_DATA__PRINT_STATUS:
				setPrintStatus((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA:
				setStructuredData((GSSConfigStructuredData)newValue);
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
			case configPackage.GSS_CONFIG_PRINTING_DATA__PRINT_STATUS:
				setPrintStatus(PRINT_STATUS_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA:
				setStructuredData((GSSConfigStructuredData)null);
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
			case configPackage.GSS_CONFIG_PRINTING_DATA__PRINT_STATUS:
				return printStatus != PRINT_STATUS_EDEFAULT;
			case configPackage.GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA:
				return structuredData != null;
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
		result.append(" (printStatus: ");
		result.append(printStatus);
		result.append(')');
		return result.toString();
	}

} //GSSConfigPrintingDataImpl
