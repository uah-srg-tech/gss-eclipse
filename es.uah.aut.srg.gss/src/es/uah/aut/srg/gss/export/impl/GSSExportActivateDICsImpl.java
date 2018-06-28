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
package es.uah.aut.srg.gss.export.impl;

import es.uah.aut.srg.gss.export.GSSExportActivateDICs;
import es.uah.aut.srg.gss.export.GSSExportDIC;
import es.uah.aut.srg.gss.export.exportPackage;

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
 * An implementation of the model object '<em><b>GSS Export Activate DI Cs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportActivateDICsImpl#getDIC <em>DIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportActivateDICsImpl extends MinimalEObjectImpl.Container implements GSSExportActivateDICs {
	/**
	 * The cached value of the '{@link #getDIC() <em>DIC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIC()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportDIC> dic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportActivateDICsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_ACTIVATE_DI_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportDIC> getDIC() {
		if (dic == null) {
			dic = new EObjectContainmentEList<GSSExportDIC>(GSSExportDIC.class, this, exportPackage.GSS_EXPORT_ACTIVATE_DI_CS__DIC);
		}
		return dic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS__DIC:
				return ((InternalEList<?>)getDIC()).basicRemove(otherEnd, msgs);
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
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS__DIC:
				return getDIC();
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
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS__DIC:
				getDIC().clear();
				getDIC().addAll((Collection<? extends GSSExportDIC>)newValue);
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
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS__DIC:
				getDIC().clear();
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
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS__DIC:
				return dic != null && !dic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSExportActivateDICsImpl
