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
package es.uah.aut.srg.gss.tcheaderinput.impl;

import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField;
import es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage;
import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField;
import es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderImpl;

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
 * An implementation of the model object '<em><b>GSSTC Header Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputImpl#getGssHeaderFields <em>Gss Header Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTCHeaderInputImpl extends TMTCIFTCHeaderImpl implements GSSTCHeaderInput {
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
	protected EList<GSSTCHeaderInputField> gssHeaderFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTCHeaderInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcheaderinputPackage.Literals.GSSTC_HEADER_INPUT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcheaderinputPackage.GSSTC_HEADER_INPUT__FORMAT, oldFormat, format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tcheaderinputPackage.GSSTC_HEADER_INPUT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTCHeaderInputField> getGssHeaderFields() {
		if (gssHeaderFields == null) {
			gssHeaderFields = new EObjectContainmentEList<GSSTCHeaderInputField>(GSSTCHeaderInputField.class, this, tcheaderinputPackage.GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS);
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS:
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__FORMAT:
				if (resolve) return getFormat();
				return basicGetFormat();
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS:
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__FORMAT:
				setFormat((GSSFormatFormat)newValue);
				return;
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS:
				getGssHeaderFields().clear();
				getGssHeaderFields().addAll((Collection<? extends GSSTCHeaderInputField>)newValue);
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__FORMAT:
				setFormat((GSSFormatFormat)null);
				return;
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS:
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__FORMAT:
				return format != null;
			case tcheaderinputPackage.GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS:
				return gssHeaderFields != null && !gssHeaderFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<TMTCIFTCHeaderField> getFields() {
		EList<TMTCIFTCHeaderField> headerFields = new BasicEList<TMTCIFTCHeaderField>();
		for(GSSTCHeaderInputField gssField : getGssHeaderFields()) {
			headerFields.add((TMTCIFTCHeaderField) gssField);
		};
		return headerFields;
	}

} //GSSTCHeaderInputImpl
