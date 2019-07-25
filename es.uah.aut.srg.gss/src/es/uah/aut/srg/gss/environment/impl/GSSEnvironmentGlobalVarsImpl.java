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

import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars;
import es.uah.aut.srg.gss.environment.environmentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Global Vars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarsImpl#getGlobalVar <em>Global Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentGlobalVarsImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentGlobalVars {
	/**
	 * The cached value of the '{@link #getGlobalVar() <em>Global Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVar()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentGlobalVar> globalVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentGlobalVarsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_GLOBAL_VARS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentGlobalVar> getGlobalVar() {
		if (globalVar == null) {
			globalVar = new EObjectContainmentEList<GSSEnvironmentGlobalVar>(GSSEnvironmentGlobalVar.class, this, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR);
		}
		return globalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR:
				return ((InternalEList<?>)getGlobalVar()).basicRemove(otherEnd, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR:
				return getGlobalVar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR:
				getGlobalVar().clear();
				getGlobalVar().addAll((Collection<? extends GSSEnvironmentGlobalVar>)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR:
				getGlobalVar().clear();
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR:
				return globalVar != null && !globalVar.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentGlobalVarsImpl
