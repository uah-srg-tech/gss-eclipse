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

import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Periodic TC Level2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl#getApp_to_level2 <em>App to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentPeriodicTCLevel2Impl extends GSSEnvironmentPeriodicTCImpl implements GSSEnvironmentPeriodicTCLevel2 {
	/**
	 * The cached value of the '{@link #getLevel2() <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level2;

	/**
	 * The cached value of the '{@link #getApp_to_level2() <em>App to level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level2()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport app_to_level2;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level1;

	/**
	 * The cached value of the '{@link #getLevel2_to_level1() <em>Level2 to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_to_level1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport level2_to_level1;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level0;

	/**
	 * The cached value of the '{@link #getLevel1_to_level0() <em>Level1 to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_to_level0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport level1_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentPeriodicTCLevel2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel2() {
		if (level2 != null && level2.eIsProxy()) {
			InternalEObject oldLevel2 = (InternalEObject)level2;
			level2 = (TMTCIFFormatFormat)eResolveProxy(oldLevel2);
			if (level2 != oldLevel2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2, oldLevel2, level2));
			}
		}
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel2() {
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2(TMTCIFFormatFormat newLevel2) {
		TMTCIFFormatFormat oldLevel2 = level2;
		level2 = newLevel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2, oldLevel2, level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getApp_to_level2() {
		if (app_to_level2 != null && app_to_level2.eIsProxy()) {
			InternalEObject oldApp_to_level2 = (InternalEObject)app_to_level2;
			app_to_level2 = (TMTCIFExportExport)eResolveProxy(oldApp_to_level2);
			if (app_to_level2 != oldApp_to_level2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2, oldApp_to_level2, app_to_level2));
			}
		}
		return app_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetApp_to_level2() {
		return app_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level2(TMTCIFExportExport newApp_to_level2) {
		TMTCIFExportExport oldApp_to_level2 = app_to_level2;
		app_to_level2 = newApp_to_level2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2, oldApp_to_level2, app_to_level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (TMTCIFFormatFormat)eResolveProxy(oldLevel1);
			if (level1 != oldLevel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1, oldLevel1, level1));
			}
		}
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(TMTCIFFormatFormat newLevel1) {
		TMTCIFFormatFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getLevel2_to_level1() {
		if (level2_to_level1 != null && level2_to_level1.eIsProxy()) {
			InternalEObject oldLevel2_to_level1 = (InternalEObject)level2_to_level1;
			level2_to_level1 = (TMTCIFExportExport)eResolveProxy(oldLevel2_to_level1);
			if (level2_to_level1 != oldLevel2_to_level1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
			}
		}
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetLevel2_to_level1() {
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_to_level1(TMTCIFExportExport newLevel2_to_level1) {
		TMTCIFExportExport oldLevel2_to_level1 = level2_to_level1;
		level2_to_level1 = newLevel2_to_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (TMTCIFFormatFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(TMTCIFFormatFormat newLevel0) {
		TMTCIFFormatFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getLevel1_to_level0() {
		if (level1_to_level0 != null && level1_to_level0.eIsProxy()) {
			InternalEObject oldLevel1_to_level0 = (InternalEObject)level1_to_level0;
			level1_to_level0 = (TMTCIFExportExport)eResolveProxy(oldLevel1_to_level0);
			if (level1_to_level0 != oldLevel1_to_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
			}
		}
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetLevel1_to_level0() {
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_to_level0(TMTCIFExportExport newLevel1_to_level0) {
		TMTCIFExportExport oldLevel1_to_level0 = level1_to_level0;
		level1_to_level0 = newLevel1_to_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2:
				if (resolve) return getLevel2();
				return basicGetLevel2();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				if (resolve) return getApp_to_level2();
				return basicGetApp_to_level2();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				if (resolve) return getLevel2_to_level1();
				return basicGetLevel2_to_level1();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				if (resolve) return getLevel1_to_level0();
				return basicGetLevel1_to_level0();
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2:
				setLevel2((TMTCIFFormatFormat)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				setApp_to_level2((TMTCIFExportExport)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1:
				setLevel1((TMTCIFFormatFormat)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((TMTCIFExportExport)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0:
				setLevel0((TMTCIFFormatFormat)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((TMTCIFExportExport)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2:
				setLevel2((TMTCIFFormatFormat)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				setApp_to_level2((TMTCIFExportExport)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1:
				setLevel1((TMTCIFFormatFormat)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((TMTCIFExportExport)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0:
				setLevel0((TMTCIFFormatFormat)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((TMTCIFExportExport)null);
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2:
				return level2 != null;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				return app_to_level2 != null;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1:
				return level1 != null;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				return level2_to_level1 != null;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0:
				return level0 != null;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				return level1_to_level0 != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentPeriodicTCLevel2Impl
