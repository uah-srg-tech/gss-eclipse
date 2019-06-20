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

import es.uah.aut.srg.gss.filters.GSSFilterMinterm;
import es.uah.aut.srg.gss.filters.GSSFilterMintermFilter;
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
 * An implementation of the model object '<em><b>GSS Filter Minterm Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMintermFilterImpl#getMinterm <em>Minterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterMintermFilterImpl extends GSSFilterFilterImpl implements GSSFilterMintermFilter {
	/**
	 * The cached value of the '{@link #getMinterm() <em>Minterm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinterm()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterMinterm> minterm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterMintermFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filtersPackage.Literals.GSS_FILTER_MINTERM_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterMinterm> getMinterm() {
		if (minterm == null) {
			minterm = new EObjectContainmentEList<GSSFilterMinterm>(GSSFilterMinterm.class, this, filtersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM);
		}
		return minterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filtersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				return ((InternalEList<?>)getMinterm()).basicRemove(otherEnd, msgs);
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
			case filtersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				return getMinterm();
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
			case filtersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				getMinterm().clear();
				getMinterm().addAll((Collection<? extends GSSFilterMinterm>)newValue);
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
			case filtersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				getMinterm().clear();
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
			case filtersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				return minterm != null && !minterm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSFilterMintermFilterImpl
