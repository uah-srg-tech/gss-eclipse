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

import es.uah.aut.srg.gss.filters.GSSFilterBoolVar;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFDIC;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFromArrayItem;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.gss.filters.GSSFilterMaxterm;
import es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter;
import es.uah.aut.srg.gss.filters.filtersPackage;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
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
 * An implementation of the model object '<em><b>GSS Filter Maxterm Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterMaxtermFilterImpl#getMaxterm <em>Maxterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterMaxtermFilterImpl extends GSSFilterFilterImpl implements GSSFilterMaxtermFilter {
	/**
	 * The cached value of the '{@link #getFormatFile() <em>Format File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatFile()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat formatFile;

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
	public GSSTmTcFormatTmTcFormat getFormatFile() {
		if (formatFile != null && formatFile.eIsProxy()) {
			InternalEObject oldFormatFile = (InternalEObject)formatFile;
			formatFile = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldFormatFile);
			if (formatFile != oldFormatFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filtersPackage.GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
			}
		}
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetFormatFile() {
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatFile(GSSTmTcFormatTmTcFormat newFormatFile) {
		GSSTmTcFormatTmTcFormat oldFormatFile = formatFile;
		formatFile = newFormatFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filtersPackage.GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVar> getBoolVar() {
		if (boolVar == null) {
			boolVar = new EObjectContainmentEList<GSSFilterBoolVar>(GSSFilterBoolVar.class, this, filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR);
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
			boolVarFromArrayItem = new EObjectContainmentEList<GSSFilterBoolVarFromArrayItem>(GSSFilterBoolVarFromArrayItem.class, this, filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM);
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
			boolVarFromGroupedArrayItem = new EObjectContainmentEList<GSSFilterBoolVarFromGroupedArrayItem>(GSSFilterBoolVarFromGroupedArrayItem.class, this, filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
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
			boolVarFDIC = new EObjectContainmentEList<GSSFilterBoolVarFDIC>(GSSFilterBoolVarFDIC.class, this, filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC);
		}
		return boolVarFDIC;
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR:
				return ((InternalEList<?>)getBoolVar()).basicRemove(otherEnd, msgs);
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return ((InternalEList<?>)getBoolVarFromArrayItem()).basicRemove(otherEnd, msgs);
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return ((InternalEList<?>)getBoolVarFromGroupedArrayItem()).basicRemove(otherEnd, msgs);
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC:
				return ((InternalEList<?>)getBoolVarFDIC()).basicRemove(otherEnd, msgs);
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE:
				if (resolve) return getFormatFile();
				return basicGetFormatFile();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR:
				return getBoolVar();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return getBoolVarFromArrayItem();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return getBoolVarFromGroupedArrayItem();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC:
				return getBoolVarFDIC();
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE:
				setFormatFile((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR:
				getBoolVar().clear();
				getBoolVar().addAll((Collection<? extends GSSFilterBoolVar>)newValue);
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				getBoolVarFromArrayItem().addAll((Collection<? extends GSSFilterBoolVarFromArrayItem>)newValue);
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				getBoolVarFromGroupedArrayItem().addAll((Collection<? extends GSSFilterBoolVarFromGroupedArrayItem>)newValue);
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
				getBoolVarFDIC().addAll((Collection<? extends GSSFilterBoolVarFDIC>)newValue);
				return;
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE:
				setFormatFile((GSSTmTcFormatTmTcFormat)null);
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR:
				getBoolVar().clear();
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				return;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
				return;
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
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE:
				return formatFile != null;
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR:
				return boolVar != null && !boolVar.isEmpty();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return boolVarFromArrayItem != null && !boolVarFromArrayItem.isEmpty();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return boolVarFromGroupedArrayItem != null && !boolVarFromGroupedArrayItem.isEmpty();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC:
				return boolVarFDIC != null && !boolVarFDIC.isEmpty();
			case filtersPackage.GSS_FILTER_MAXTERM_FILTER__MAXTERM:
				return maxterm != null && !maxterm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSFilterMaxtermFilterImpl
