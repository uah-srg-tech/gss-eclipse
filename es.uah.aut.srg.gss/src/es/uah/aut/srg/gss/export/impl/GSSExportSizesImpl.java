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
package es.uah.aut.srg.gss.export.impl;

import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength;
import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine;
import es.uah.aut.srg.gss.export.GSSExportSizeInBits;
import es.uah.aut.srg.gss.export.GSSExportSizes;
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
 * An implementation of the model object '<em><b>GSS Export Sizes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl#getSizeFromFileLength <em>Size From File Length</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl#getSizeFromFileLine <em>Size From File Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSizesImpl extends MinimalEObjectImpl.Container implements GSSExportSizes {
	/**
	 * The cached value of the '{@link #getSizeFromFileLength() <em>Size From File Length</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFromFileLength()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSizeFromFileLength> sizeFromFileLength;

	/**
	 * The cached value of the '{@link #getSizeFromFileLine() <em>Size From File Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFromFileLine()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSizeFromFileLine> sizeFromFileLine;

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSizeInBits> sizeInBits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSizesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SIZES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSizeFromFileLength> getSizeFromFileLength() {
		if (sizeFromFileLength == null) {
			sizeFromFileLength = new EObjectContainmentEList<GSSExportSizeFromFileLength>(GSSExportSizeFromFileLength.class, this, exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH);
		}
		return sizeFromFileLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSizeFromFileLine> getSizeFromFileLine() {
		if (sizeFromFileLine == null) {
			sizeFromFileLine = new EObjectContainmentEList<GSSExportSizeFromFileLine>(GSSExportSizeFromFileLine.class, this, exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE);
		}
		return sizeFromFileLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSizeInBits> getSizeInBits() {
		if (sizeInBits == null) {
			sizeInBits = new EObjectContainmentEList<GSSExportSizeInBits>(GSSExportSizeInBits.class, this, exportPackage.GSS_EXPORT_SIZES__SIZE_IN_BITS);
		}
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				return ((InternalEList<?>)getSizeFromFileLength()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				return ((InternalEList<?>)getSizeFromFileLine()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SIZES__SIZE_IN_BITS:
				return ((InternalEList<?>)getSizeInBits()).basicRemove(otherEnd, msgs);
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
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				return getSizeFromFileLength();
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				return getSizeFromFileLine();
			case exportPackage.GSS_EXPORT_SIZES__SIZE_IN_BITS:
				return getSizeInBits();
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
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				getSizeFromFileLength().clear();
				getSizeFromFileLength().addAll((Collection<? extends GSSExportSizeFromFileLength>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				getSizeFromFileLine().clear();
				getSizeFromFileLine().addAll((Collection<? extends GSSExportSizeFromFileLine>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZES__SIZE_IN_BITS:
				getSizeInBits().clear();
				getSizeInBits().addAll((Collection<? extends GSSExportSizeInBits>)newValue);
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
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				getSizeFromFileLength().clear();
				return;
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				getSizeFromFileLine().clear();
				return;
			case exportPackage.GSS_EXPORT_SIZES__SIZE_IN_BITS:
				getSizeInBits().clear();
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
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				return sizeFromFileLength != null && !sizeFromFileLength.isEmpty();
			case exportPackage.GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				return sizeFromFileLine != null && !sizeFromFileLine.isEmpty();
			case exportPackage.GSS_EXPORT_SIZES__SIZE_IN_BITS:
				return sizeInBits != null && !sizeInBits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSExportSizesImpl
