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
package es.uah.aut.srg.gss.imports.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.imports.GSSImportDataSource;
import es.uah.aut.srg.gss.imports.GSSImportImport;
import es.uah.aut.srg.gss.imports.GSSImportVirtualSize;
import es.uah.aut.srg.gss.imports.importsPackage;

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
 * An implementation of the model object '<em><b>GSS Import Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl#getVirtualSize <em>Virtual Size</em>}</li>
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
	protected GSSTmTcFormatTmTcFormat from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat to;

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
		return importsPackage.Literals.GSS_IMPORT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importsPackage.GSS_IMPORT_IMPORT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(GSSTmTcFormatTmTcFormat newFrom) {
		GSSTmTcFormatTmTcFormat oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_IMPORT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importsPackage.GSS_IMPORT_IMPORT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(GSSTmTcFormatTmTcFormat newTo) {
		GSSTmTcFormatTmTcFormat oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_IMPORT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSImportDataSource> getDataSource() {
		if (dataSource == null) {
			dataSource = new EObjectContainmentEList<GSSImportDataSource>(GSSImportDataSource.class, this, importsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, oldVirtualSize, newVirtualSize);
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
				msgs = ((InternalEObject)virtualSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, null, msgs);
			if (newVirtualSize != null)
				msgs = ((InternalEObject)newVirtualSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, null, msgs);
			msgs = basicSetVirtualSize(newVirtualSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, newVirtualSize, newVirtualSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case importsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
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
			case importsPackage.GSS_IMPORT_IMPORT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case importsPackage.GSS_IMPORT_IMPORT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case importsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return getDataSource();
			case importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
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
			case importsPackage.GSS_IMPORT_IMPORT__FROM:
				setFrom((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case importsPackage.GSS_IMPORT_IMPORT__TO:
				setTo((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case importsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends GSSImportDataSource>)newValue);
				return;
			case importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
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
			case importsPackage.GSS_IMPORT_IMPORT__FROM:
				setFrom((GSSTmTcFormatTmTcFormat)null);
				return;
			case importsPackage.GSS_IMPORT_IMPORT__TO:
				setTo((GSSTmTcFormatTmTcFormat)null);
				return;
			case importsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				getDataSource().clear();
				return;
			case importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
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
			case importsPackage.GSS_IMPORT_IMPORT__FROM:
				return from != null;
			case importsPackage.GSS_IMPORT_IMPORT__TO:
				return to != null;
			case importsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case importsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return virtualSize != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSImportImportImpl
