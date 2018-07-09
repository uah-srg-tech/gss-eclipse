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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigGVFiltered;
import es.uah.aut.srg.gss.config.GSSConfigGVPeriodic;
import es.uah.aut.srg.gss.config.GSSConfigPlot;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl#getGVFiltered <em>GV Filtered</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl#getGVPeriodic <em>GV Periodic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPlotImpl extends MinimalEObjectImpl.Container implements GSSConfigPlot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGVFiltered() <em>GV Filtered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVFiltered()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGVFiltered gvFiltered;

	/**
	 * The cached value of the '{@link #getGVPeriodic() <em>GV Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVPeriodic()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGVPeriodic gvPeriodic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PLOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGVFiltered getGVFiltered() {
		return gvFiltered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGVFiltered(GSSConfigGVFiltered newGVFiltered, NotificationChain msgs) {
		GSSConfigGVFiltered oldGVFiltered = gvFiltered;
		gvFiltered = newGVFiltered;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PLOT__GV_FILTERED, oldGVFiltered, newGVFiltered);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGVFiltered(GSSConfigGVFiltered newGVFiltered) {
		if (newGVFiltered != gvFiltered) {
			NotificationChain msgs = null;
			if (gvFiltered != null)
				msgs = ((InternalEObject)gvFiltered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PLOT__GV_FILTERED, null, msgs);
			if (newGVFiltered != null)
				msgs = ((InternalEObject)newGVFiltered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PLOT__GV_FILTERED, null, msgs);
			msgs = basicSetGVFiltered(newGVFiltered, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PLOT__GV_FILTERED, newGVFiltered, newGVFiltered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGVPeriodic getGVPeriodic() {
		return gvPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGVPeriodic(GSSConfigGVPeriodic newGVPeriodic, NotificationChain msgs) {
		GSSConfigGVPeriodic oldGVPeriodic = gvPeriodic;
		gvPeriodic = newGVPeriodic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PLOT__GV_PERIODIC, oldGVPeriodic, newGVPeriodic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGVPeriodic(GSSConfigGVPeriodic newGVPeriodic) {
		if (newGVPeriodic != gvPeriodic) {
			NotificationChain msgs = null;
			if (gvPeriodic != null)
				msgs = ((InternalEObject)gvPeriodic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PLOT__GV_PERIODIC, null, msgs);
			if (newGVPeriodic != null)
				msgs = ((InternalEObject)newGVPeriodic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PLOT__GV_PERIODIC, null, msgs);
			msgs = basicSetGVPeriodic(newGVPeriodic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PLOT__GV_PERIODIC, newGVPeriodic, newGVPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PLOT__GV_FILTERED:
				return basicSetGVFiltered(null, msgs);
			case configPackage.GSS_CONFIG_PLOT__GV_PERIODIC:
				return basicSetGVPeriodic(null, msgs);
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
			case configPackage.GSS_CONFIG_PLOT__NAME:
				return getName();
			case configPackage.GSS_CONFIG_PLOT__GV_FILTERED:
				return getGVFiltered();
			case configPackage.GSS_CONFIG_PLOT__GV_PERIODIC:
				return getGVPeriodic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PLOT__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PLOT__GV_FILTERED:
				setGVFiltered((GSSConfigGVFiltered)newValue);
				return;
			case configPackage.GSS_CONFIG_PLOT__GV_PERIODIC:
				setGVPeriodic((GSSConfigGVPeriodic)newValue);
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
			case configPackage.GSS_CONFIG_PLOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PLOT__GV_FILTERED:
				setGVFiltered((GSSConfigGVFiltered)null);
				return;
			case configPackage.GSS_CONFIG_PLOT__GV_PERIODIC:
				setGVPeriodic((GSSConfigGVPeriodic)null);
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
			case configPackage.GSS_CONFIG_PLOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_PLOT__GV_FILTERED:
				return gvFiltered != null;
			case configPackage.GSS_CONFIG_PLOT__GV_PERIODIC:
				return gvPeriodic != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GSSConfigPlotImpl