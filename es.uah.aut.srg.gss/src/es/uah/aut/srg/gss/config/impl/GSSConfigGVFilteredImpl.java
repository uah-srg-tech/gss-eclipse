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

import es.uah.aut.srg.gss.config.GSSConfigGVFiltered;
import es.uah.aut.srg.gss.config.configPackage;

import es.uah.aut.srg.gss.filters.GSSFilterFilter;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config GV Filtered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGVFilteredImpl#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGVFilteredImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigGVFilteredImpl extends MinimalEObjectImpl.Container implements GSSConfigGVFiltered {
	/**
	 * The default value of the '{@link #getGlobalVarRef() <em>Global Var Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVarRef()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_VAR_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalVarRef() <em>Global Var Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVarRef()
	 * @generated
	 * @ordered
	 */
	protected String globalVarRef = GLOBAL_VAR_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigGVFilteredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_GV_FILTERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalVarRef() {
		return globalVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVarRef(String newGlobalVarRef) {
		String oldGlobalVarRef = globalVarRef;
		globalVarRef = newGlobalVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (GSSFilterFilter)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_GV_FILTERED__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(GSSFilterFilter newFilter) {
		GSSFilterFilter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GV_FILTERED__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF:
				return getGlobalVarRef();
			case configPackage.GSS_CONFIG_GV_FILTERED__FILTER:
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
			case configPackage.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF:
				setGlobalVarRef((String)newValue);
				return;
			case configPackage.GSS_CONFIG_GV_FILTERED__FILTER:
				setFilter((GSSFilterFilter)newValue);
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
			case configPackage.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF:
				setGlobalVarRef(GLOBAL_VAR_REF_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_GV_FILTERED__FILTER:
				setFilter((GSSFilterFilter)null);
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
			case configPackage.GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF:
				return GLOBAL_VAR_REF_EDEFAULT == null ? globalVarRef != null : !GLOBAL_VAR_REF_EDEFAULT.equals(globalVarRef);
			case configPackage.GSS_CONFIG_GV_FILTERED__FILTER:
				return filter != null;
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
		result.append(" (GlobalVarRef: ");
		result.append(globalVarRef);
		result.append(')');
		return result.toString();
	}

} //GSSConfigGVFilteredImpl
