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

import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Periodic TC Level0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel0Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel0Impl#getApp_to_level0 <em>App to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentPeriodicTCLevel0Impl extends GSSEnvironmentPeriodicTCImpl implements GSSEnvironmentPeriodicTCLevel0 {
	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level0;

	/**
	 * The cached value of the '{@link #getApp_to_level0() <em>App to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level0()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport app_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentPeriodicTCLevel0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (GSSFormatFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSFormatFormat newLevel0) {
		GSSFormatFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getApp_to_level0() {
		if (app_to_level0 != null && app_to_level0.eIsProxy()) {
			InternalEObject oldApp_to_level0 = (InternalEObject)app_to_level0;
			app_to_level0 = (GSSExportExport)eResolveProxy(oldApp_to_level0);
			if (app_to_level0 != oldApp_to_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0, oldApp_to_level0, app_to_level0));
			}
		}
		return app_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetApp_to_level0() {
		return app_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level0(GSSExportExport newApp_to_level0) {
		GSSExportExport oldApp_to_level0 = app_to_level0;
		app_to_level0 = newApp_to_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0, oldApp_to_level0, app_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				if (resolve) return getApp_to_level0();
				return basicGetApp_to_level0();
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0:
				setLevel0((GSSFormatFormat)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				setApp_to_level0((GSSExportExport)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0:
				setLevel0((GSSFormatFormat)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				setApp_to_level0((GSSExportExport)null);
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0:
				return level0 != null;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				return app_to_level0 != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentPeriodicTCLevel0Impl
