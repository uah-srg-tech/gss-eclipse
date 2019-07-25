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

import es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment GV Filtered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVFilteredImpl#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVFilteredImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentGVFilteredImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentGVFiltered {
	/**
	 * The cached value of the '{@link #getGlobalVarRef() <em>Global Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVarRef()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentGlobalVar globalVarRef;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterFilter filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentGVFilteredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_GV_FILTERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVar getGlobalVarRef() {
		if (globalVarRef != null && globalVarRef.eIsProxy()) {
			InternalEObject oldGlobalVarRef = (InternalEObject)globalVarRef;
			globalVarRef = (GSSEnvironmentGlobalVar)eResolveProxy(oldGlobalVarRef);
			if (globalVarRef != oldGlobalVarRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
			}
		}
		return globalVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVar basicGetGlobalVarRef() {
		return globalVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVarRef(GSSEnvironmentGlobalVar newGlobalVarRef) {
		GSSEnvironmentGlobalVar oldGlobalVarRef = globalVarRef;
		globalVarRef = newGlobalVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (TMTCIFFilterFilter)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(TMTCIFFilterFilter newFilter) {
		TMTCIFFilterFilter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF:
				if (resolve) return getGlobalVarRef();
				return basicGetGlobalVarRef();
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
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
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSEnvironmentGlobalVar)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__FILTER:
				setFilter((TMTCIFFilterFilter)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSEnvironmentGlobalVar)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__FILTER:
				setFilter((TMTCIFFilterFilter)null);
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
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF:
				return globalVarRef != null;
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED__FILTER:
				return filter != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentGVFilteredImpl
