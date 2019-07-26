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

import es.uah.aut.srg.gss.config.GSSConfigGSSInfo;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config GSS Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl#getTest_campaign <em>Test campaign</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl#getVersion_control_url <em>Version control url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigGSSInfoImpl extends MinimalEObjectImpl.Container implements GSSConfigGSSInfo {
	/**
	 * The default value of the '{@link #getTest_campaign() <em>Test campaign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_campaign()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_CAMPAIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest_campaign() <em>Test campaign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_campaign()
	 * @generated
	 * @ordered
	 */
	protected String test_campaign = TEST_CAMPAIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion_control_url() <em>Version control url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_control_url()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_CONTROL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion_control_url() <em>Version control url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_control_url()
	 * @generated
	 * @ordered
	 */
	protected String version_control_url = VERSION_CONTROL_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigGSSInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_GSS_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTest_campaign() {
		return test_campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest_campaign(String newTest_campaign) {
		String oldTest_campaign = test_campaign;
		test_campaign = newTest_campaign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN, oldTest_campaign, test_campaign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion_control_url() {
		return version_control_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion_control_url(String newVersion_control_url) {
		String oldVersion_control_url = version_control_url;
		version_control_url = newVersion_control_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL, oldVersion_control_url, version_control_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN:
				return getTest_campaign();
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION:
				return getVersion();
			case configPackage.GSS_CONFIG_GSS_INFO__DATE:
				return getDate();
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL:
				return getVersion_control_url();
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
			case configPackage.GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN:
				setTest_campaign((String)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION:
				setVersion((String)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO__DATE:
				setDate((String)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL:
				setVersion_control_url((String)newValue);
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
			case configPackage.GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN:
				setTest_campaign(TEST_CAMPAIGN_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL:
				setVersion_control_url(VERSION_CONTROL_URL_EDEFAULT);
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
			case configPackage.GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN:
				return TEST_CAMPAIGN_EDEFAULT == null ? test_campaign != null : !TEST_CAMPAIGN_EDEFAULT.equals(test_campaign);
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case configPackage.GSS_CONFIG_GSS_INFO__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case configPackage.GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL:
				return VERSION_CONTROL_URL_EDEFAULT == null ? version_control_url != null : !VERSION_CONTROL_URL_EDEFAULT.equals(version_control_url);
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
		result.append(" (test_campaign: ");
		result.append(test_campaign);
		result.append(", version: ");
		result.append(version);
		result.append(", date: ");
		result.append(date);
		result.append(", version_control_url: ");
		result.append(version_control_url);
		result.append(')');
		return result.toString();
	}

} //GSSConfigGSSInfoImpl
