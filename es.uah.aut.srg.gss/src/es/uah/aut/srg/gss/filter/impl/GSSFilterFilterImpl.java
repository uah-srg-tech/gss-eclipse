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
package es.uah.aut.srg.gss.filter.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.filter.GSSFilterBoolVar;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem;
import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.gss.filter.GSSFilterFilter;
import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GSSFilterFilterImpl extends GSSModelElementImpl implements GSSFilterFilter {
	/**
	 * The cached value of the '{@link #getFormatFile() <em>Format File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatFile()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat formatFile;

	/**
	 * The cached value of the '{@link #getBoolVar() <em>Bool Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVar()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVar> boolVar;

	/**
	 * The cached value of the '{@link #getBoolVarFromArrayItem() <em>Bool Var From Array Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFromArrayItem()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarFromArrayItem> boolVarFromArrayItem;

	/**
	 * The cached value of the '{@link #getBoolVarFromGroupedArrayItem() <em>Bool Var From Grouped Array Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFromGroupedArrayItem()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarFromGroupedArrayItem> boolVarFromGroupedArrayItem;

	/**
	 * The cached value of the '{@link #getBoolVarFDIC() <em>Bool Var FDIC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFDIC()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarFDIC> boolVarFDIC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.GSS_FILTER_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getFormatFile() {
		if (formatFile != null && formatFile.eIsProxy()) {
			InternalEObject oldFormatFile = (InternalEObject)formatFile;
			formatFile = (GSSFormatFormat)eResolveProxy(oldFormatFile);
			if (formatFile != oldFormatFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filterPackage.GSS_FILTER_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
			}
		}
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetFormatFile() {
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatFile(GSSFormatFormat newFormatFile) {
		GSSFormatFormat oldFormatFile = formatFile;
		formatFile = newFormatFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVar> getBoolVar() {
		if (boolVar == null) {
			boolVar = new EObjectContainmentEList<GSSFilterBoolVar>(GSSFilterBoolVar.class, this, filterPackage.GSS_FILTER_FILTER__BOOL_VAR);
		}
		return boolVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarFromArrayItem> getBoolVarFromArrayItem() {
		if (boolVarFromArrayItem == null) {
			boolVarFromArrayItem = new EObjectContainmentEList<GSSFilterBoolVarFromArrayItem>(GSSFilterBoolVarFromArrayItem.class, this, filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM);
		}
		return boolVarFromArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarFromGroupedArrayItem> getBoolVarFromGroupedArrayItem() {
		if (boolVarFromGroupedArrayItem == null) {
			boolVarFromGroupedArrayItem = new EObjectContainmentEList<GSSFilterBoolVarFromGroupedArrayItem>(GSSFilterBoolVarFromGroupedArrayItem.class, this, filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		}
		return boolVarFromGroupedArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarFDIC> getBoolVarFDIC() {
		if (boolVarFDIC == null) {
			boolVarFDIC = new EObjectContainmentEList<GSSFilterBoolVarFDIC>(GSSFilterBoolVarFDIC.class, this, filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FDIC);
		}
		return boolVarFDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR:
				return ((InternalEList<?>)getBoolVar()).basicRemove(otherEnd, msgs);
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return ((InternalEList<?>)getBoolVarFromArrayItem()).basicRemove(otherEnd, msgs);
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return ((InternalEList<?>)getBoolVarFromGroupedArrayItem()).basicRemove(otherEnd, msgs);
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FDIC:
				return ((InternalEList<?>)getBoolVarFDIC()).basicRemove(otherEnd, msgs);
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
			case filterPackage.GSS_FILTER_FILTER__FORMAT_FILE:
				if (resolve) return getFormatFile();
				return basicGetFormatFile();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR:
				return getBoolVar();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return getBoolVarFromArrayItem();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return getBoolVarFromGroupedArrayItem();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FDIC:
				return getBoolVarFDIC();
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
			case filterPackage.GSS_FILTER_FILTER__FORMAT_FILE:
				setFormatFile((GSSFormatFormat)newValue);
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR:
				getBoolVar().clear();
				getBoolVar().addAll((Collection<? extends GSSFilterBoolVar>)newValue);
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				getBoolVarFromArrayItem().addAll((Collection<? extends GSSFilterBoolVarFromArrayItem>)newValue);
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				getBoolVarFromGroupedArrayItem().addAll((Collection<? extends GSSFilterBoolVarFromGroupedArrayItem>)newValue);
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
				getBoolVarFDIC().addAll((Collection<? extends GSSFilterBoolVarFDIC>)newValue);
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
			case filterPackage.GSS_FILTER_FILTER__FORMAT_FILE:
				setFormatFile((GSSFormatFormat)null);
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR:
				getBoolVar().clear();
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				return;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
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
			case filterPackage.GSS_FILTER_FILTER__FORMAT_FILE:
				return formatFile != null;
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR:
				return boolVar != null && !boolVar.isEmpty();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return boolVarFromArrayItem != null && !boolVarFromArrayItem.isEmpty();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return boolVarFromGroupedArrayItem != null && !boolVarFromGroupedArrayItem.isEmpty();
			case filterPackage.GSS_FILTER_FILTER__BOOL_VAR_FDIC:
				return boolVarFDIC != null && !boolVarFDIC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSFilterFilterImpl
