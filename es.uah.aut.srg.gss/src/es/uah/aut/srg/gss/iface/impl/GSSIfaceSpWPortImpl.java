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
package es.uah.aut.srg.gss.iface.impl;

import es.uah.aut.srg.gss.iface.GSSIfaceReadingPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType;
import es.uah.aut.srg.gss.iface.ifacePackage;

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
 * An implementation of the model object '<em><b>GSS Iface Sp WPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl#getLink <em>Link</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl#getWritingPort <em>Writing Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl#getReadingPort <em>Reading Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSIfaceSpWPortImpl extends GSSIfacePortImpl implements GSSIfaceSpWPort {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceSpWPortType TYPE_EDEFAULT = GSSIfaceSpWPortType.USB;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceSpWPortType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritingPort() <em>Writing Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingPort()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITING_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWritingPort() <em>Writing Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingPort()
	 * @generated
	 * @ordered
	 */
	protected String writingPort = WRITING_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadingPort() <em>Reading Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingPort()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSIfaceReadingPort> readingPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSIfaceSpWPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ifacePackage.Literals.GSS_IFACE_SP_WPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSpWPortType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSIfaceSpWPortType newType) {
		GSSIfaceSpWPortType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SP_WPORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SP_WPORT__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWritingPort() {
		return writingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritingPort(String newWritingPort) {
		String oldWritingPort = writingPort;
		writingPort = newWritingPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SP_WPORT__WRITING_PORT, oldWritingPort, writingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSIfaceReadingPort> getReadingPort() {
		if (readingPort == null) {
			readingPort = new EObjectContainmentEList<GSSIfaceReadingPort>(GSSIfaceReadingPort.class, this, ifacePackage.GSS_IFACE_SP_WPORT__READING_PORT);
		}
		return readingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_SP_WPORT__READING_PORT:
				return ((InternalEList<?>)getReadingPort()).basicRemove(otherEnd, msgs);
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
			case ifacePackage.GSS_IFACE_SP_WPORT__TYPE:
				return getType();
			case ifacePackage.GSS_IFACE_SP_WPORT__LINK:
				return getLink();
			case ifacePackage.GSS_IFACE_SP_WPORT__WRITING_PORT:
				return getWritingPort();
			case ifacePackage.GSS_IFACE_SP_WPORT__READING_PORT:
				return getReadingPort();
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
			case ifacePackage.GSS_IFACE_SP_WPORT__TYPE:
				setType((GSSIfaceSpWPortType)newValue);
				return;
			case ifacePackage.GSS_IFACE_SP_WPORT__LINK:
				setLink((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_SP_WPORT__WRITING_PORT:
				setWritingPort((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_SP_WPORT__READING_PORT:
				getReadingPort().clear();
				getReadingPort().addAll((Collection<? extends GSSIfaceReadingPort>)newValue);
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
			case ifacePackage.GSS_IFACE_SP_WPORT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_SP_WPORT__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_SP_WPORT__WRITING_PORT:
				setWritingPort(WRITING_PORT_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_SP_WPORT__READING_PORT:
				getReadingPort().clear();
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
			case ifacePackage.GSS_IFACE_SP_WPORT__TYPE:
				return type != TYPE_EDEFAULT;
			case ifacePackage.GSS_IFACE_SP_WPORT__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ifacePackage.GSS_IFACE_SP_WPORT__WRITING_PORT:
				return WRITING_PORT_EDEFAULT == null ? writingPort != null : !WRITING_PORT_EDEFAULT.equals(writingPort);
			case ifacePackage.GSS_IFACE_SP_WPORT__READING_PORT:
				return readingPort != null && !readingPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", link: ");
		result.append(link);
		result.append(", writingPort: ");
		result.append(writingPort);
		result.append(')');
		return result.toString();
	}

} //GSSIfaceSpWPortImpl
