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
package es.uah.aut.srg.gss.filters.impl;

import es.uah.aut.srg.gss.filters.GSSFilterMaxterm;
import es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter;
import es.uah.aut.srg.gss.filters.filtersPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Maxterm Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getMaxterm <em>Maxterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterMaxtermFilterImpl extends GSSFilterFilterImpl implements GSSFilterMaxtermFilter {
	/**
	 * The cached value of the '{@link #getMaxterm() <em>Maxterm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxterm()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterMaxterm> maxterm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterMaxtermFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filtersPackage.Literals.GSS_FILTER_MAXTERM_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterMaxterm> getMaxterm() {
		if (maxterm == null) {
			maxterm = new EObjectContainmentEList<GSSFilterMaxterm>(GSSFilterMaxterm.class, this, filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM);
		}
		return maxterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM:
				return ((InternalEList<?>)getMaxterm()).basicRemove(otherEnd, msgs);
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM:
				return getMaxterm();
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM:
				getMaxterm().clear();
				getMaxterm().addAll((Collection<? extends GSSFilterMaxterm>)newValue);
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM:
				getMaxterm().clear();
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM:
				return maxterm != null && !maxterm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSFilterMaxtermFilterImpl
