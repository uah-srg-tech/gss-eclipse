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

import es.uah.aut.srg.gss.config.GSSConfigUpperLevel;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevels;
import es.uah.aut.srg.gss.config.configPackage;

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
 * An implementation of the model object '<em><b>GSS Config Upper Levels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelsImpl#getUpperLevel <em>Upper Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigUpperLevelsImpl extends MinimalEObjectImpl.Container implements GSSConfigUpperLevels {
	/**
	 * The cached value of the '{@link #getUpperLevel() <em>Upper Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigUpperLevel> upperLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigUpperLevelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_UPPER_LEVELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigUpperLevel> getUpperLevel() {
		if (upperLevel == null) {
			upperLevel = new EObjectContainmentEList<GSSConfigUpperLevel>(GSSConfigUpperLevel.class, this, configPackage.GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL);
		}
		return upperLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL:
				return ((InternalEList<?>)getUpperLevel()).basicRemove(otherEnd, msgs);
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
			case configPackage.GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL:
				return getUpperLevel();
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
			case configPackage.GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL:
				getUpperLevel().clear();
				getUpperLevel().addAll((Collection<? extends GSSConfigUpperLevel>)newValue);
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
			case configPackage.GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL:
				getUpperLevel().clear();
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
			case configPackage.GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL:
				return upperLevel != null && !upperLevel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigUpperLevelsImpl
