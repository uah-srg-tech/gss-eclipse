/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tmheader.impl;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.tmheader.GSSTMHeader;
import es.uah.aut.srg.gss.tmheader.GSSTMHeaderField;
import es.uah.aut.srg.gss.tmheader.tmheaderPackage;
import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField;
import es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSSTM Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tmheader.impl.GSSTMHeaderImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tmheader.impl.GSSTMHeaderImpl#getGssHeaderFields <em>Gss Header Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTMHeaderImpl extends TMTCIFTMHeaderImpl implements GSSTMHeader {
	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat format;

	/**
	 * The cached value of the '{@link #getGssHeaderFields() <em>Gss Header Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssHeaderFields()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTMHeaderField> gssHeaderFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTMHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmheaderPackage.Literals.GSSTM_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getFormat() {
		if (format != null && format.eIsProxy()) {
			InternalEObject oldFormat = (InternalEObject)format;
			format = (GSSFormatFormat)eResolveProxy(oldFormat);
			if (format != oldFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmheaderPackage.GSSTM_HEADER__FORMAT, oldFormat, format));
			}
		}
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(GSSFormatFormat newFormat) {
		GSSFormatFormat oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmheaderPackage.GSSTM_HEADER__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTMHeaderField> getGssHeaderFields() {
		if (gssHeaderFields == null) {
			gssHeaderFields = new EObjectContainmentEList<GSSTMHeaderField>(GSSTMHeaderField.class, this, tmheaderPackage.GSSTM_HEADER__GSS_HEADER_FIELDS);
		}
		return gssHeaderFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmheaderPackage.GSSTM_HEADER__GSS_HEADER_FIELDS:
				return ((InternalEList<?>)getGssHeaderFields()).basicRemove(otherEnd, msgs);
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				if (resolve) return getFormat();
				return basicGetFormat();
			case tmheaderPackage.GSSTM_HEADER__GSS_HEADER_FIELDS:
				return getGssHeaderFields();
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				setFormat((GSSFormatFormat)newValue);
				return;
			case tmheaderPackage.GSSTM_HEADER__GSS_HEADER_FIELDS:
				getGssHeaderFields().clear();
				getGssHeaderFields().addAll((Collection<? extends GSSTMHeaderField>)newValue);
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				setFormat((GSSFormatFormat)null);
				return;
			case tmheaderPackage.GSSTM_HEADER__GSS_HEADER_FIELDS:
				getGssHeaderFields().clear();
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				return format != null;
			case tmheaderPackage.GSSTM_HEADER__GSS_HEADER_FIELDS:
				return gssHeaderFields != null && !gssHeaderFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<TMTCIFTMHeaderField> getFields() {
		EList<TMTCIFTMHeaderField> headerFields = new BasicEList<TMTCIFTMHeaderField>();
		for(GSSTMHeaderField gssField : getGssHeaderFields()) {
			headerFields.add((TMTCIFTMHeaderField) gssField);
		};
		return headerFields;
	}
} //GSSTMHeaderImpl
