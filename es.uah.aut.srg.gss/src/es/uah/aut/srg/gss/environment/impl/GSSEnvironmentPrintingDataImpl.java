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

import es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData;
import es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Printing Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPrintingDataImpl#getPrintStatus <em>Print Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPrintingDataImpl#getStructuredData <em>Structured Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentPrintingDataImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentPrintingData {
	/**
	 * The default value of the '{@link #getPrintStatus() <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentEnableDisable PRINT_STATUS_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getPrintStatus() <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable printStatus = PRINT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuredData() <em>Structured Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredData()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentStructuredData structuredData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentPrintingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PRINTING_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnableDisable getPrintStatus() {
		return printStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintStatus(GSSEnvironmentEnableDisable newPrintStatus) {
		GSSEnvironmentEnableDisable oldPrintStatus = printStatus;
		printStatus = newPrintStatus == null ? PRINT_STATUS_EDEFAULT : newPrintStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS, oldPrintStatus, printStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentStructuredData getStructuredData() {
		return structuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredData(GSSEnvironmentStructuredData newStructuredData, NotificationChain msgs) {
		GSSEnvironmentStructuredData oldStructuredData = structuredData;
		structuredData = newStructuredData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA, oldStructuredData, newStructuredData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredData(GSSEnvironmentStructuredData newStructuredData) {
		if (newStructuredData != structuredData) {
			NotificationChain msgs = null;
			if (structuredData != null)
				msgs = ((InternalEObject)structuredData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA, null, msgs);
			if (newStructuredData != null)
				msgs = ((InternalEObject)newStructuredData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA, null, msgs);
			msgs = basicSetStructuredData(newStructuredData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA, newStructuredData, newStructuredData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA:
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
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS:
				return getPrintStatus();
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA:
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
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS:
				setPrintStatus((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA:
				setStructuredData((GSSEnvironmentStructuredData)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS:
				setPrintStatus(PRINT_STATUS_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA:
				setStructuredData((GSSEnvironmentStructuredData)null);
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
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS:
				return printStatus != PRINT_STATUS_EDEFAULT;
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA:
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

} //GSSEnvironmentPrintingDataImpl
