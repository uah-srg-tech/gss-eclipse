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
package es.uah.aut.srg.gss.import_.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.import_.GSSImportDataSource;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.import_.GSSImportVirtualSize;
import es.uah.aut.srg.gss.import_.importPackage;

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
 * An implementation of the model object '<em><b>GSS Import Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportImportImpl#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportImportImpl#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportImportImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportImportImpl#getVirtualSize <em>Virtual Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSImportImportImpl extends GSSModelElementImpl implements GSSImportImport {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat to;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSImportDataSource> dataSource;

	/**
	 * The cached value of the '{@link #getVirtualSize() <em>Virtual Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSize()
	 * @generated
	 * @ordered
	 */
	protected GSSImportVirtualSize virtualSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSImportImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return importPackage.Literals.GSS_IMPORT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (GSSFormatFormat)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importPackage.GSS_IMPORT_IMPORT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(GSSFormatFormat newFrom) {
		GSSFormatFormat oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_IMPORT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (GSSFormatFormat)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importPackage.GSS_IMPORT_IMPORT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(GSSFormatFormat newTo) {
		GSSFormatFormat oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_IMPORT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSImportDataSource> getDataSource() {
		if (dataSource == null) {
			dataSource = new EObjectContainmentEList<GSSImportDataSource>(GSSImportDataSource.class, this, importPackage.GSS_IMPORT_IMPORT__DATA_SOURCE);
		}
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportVirtualSize getVirtualSize() {
		return virtualSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualSize(GSSImportVirtualSize newVirtualSize, NotificationChain msgs) {
		GSSImportVirtualSize oldVirtualSize = virtualSize;
		virtualSize = newVirtualSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, oldVirtualSize, newVirtualSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSize(GSSImportVirtualSize newVirtualSize) {
		if (newVirtualSize != virtualSize) {
			NotificationChain msgs = null;
			if (virtualSize != null)
				msgs = ((InternalEObject)virtualSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, null, msgs);
			if (newVirtualSize != null)
				msgs = ((InternalEObject)newVirtualSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, null, msgs);
			msgs = basicSetVirtualSize(newVirtualSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, newVirtualSize, newVirtualSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case importPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return basicSetVirtualSize(null, msgs);
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
			case importPackage.GSS_IMPORT_IMPORT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case importPackage.GSS_IMPORT_IMPORT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case importPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return getDataSource();
			case importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return getVirtualSize();
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
			case importPackage.GSS_IMPORT_IMPORT__FROM:
				setFrom((GSSFormatFormat)newValue);
				return;
			case importPackage.GSS_IMPORT_IMPORT__TO:
				setTo((GSSFormatFormat)newValue);
				return;
			case importPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends GSSImportDataSource>)newValue);
				return;
			case importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				setVirtualSize((GSSImportVirtualSize)newValue);
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
			case importPackage.GSS_IMPORT_IMPORT__FROM:
				setFrom((GSSFormatFormat)null);
				return;
			case importPackage.GSS_IMPORT_IMPORT__TO:
				setTo((GSSFormatFormat)null);
				return;
			case importPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				getDataSource().clear();
				return;
			case importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				setVirtualSize((GSSImportVirtualSize)null);
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
			case importPackage.GSS_IMPORT_IMPORT__FROM:
				return from != null;
			case importPackage.GSS_IMPORT_IMPORT__TO:
				return to != null;
			case importPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case importPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return virtualSize != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSImportImportImpl
