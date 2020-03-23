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
package es.uah.aut.srg.gss.tc.impl;

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.tc.GSSTC;
import es.uah.aut.srg.gss.tc.GSSTCField;
import es.uah.aut.srg.gss.tc.tcPackage;
import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;
import es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCImpl;

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
 * An implementation of the model object '<em><b>GSSTC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getTo_level3_export <em>To level3 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getLevel3_format <em>Level3 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getTo_level2_export <em>To level2 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getLevel2_format <em>Level2 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getTo_level1_export <em>To level1 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getLevel1_format <em>Level1 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getTo_level0_export <em>To level0 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getLevel0_format <em>Level0 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl#getGssFields <em>Gss Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTCImpl extends TMTCIFTCImpl implements GSSTC {
	/**
	 * The default value of the '{@link #getLevels() <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected String levels = LEVELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo_level3_export() <em>To level3 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_level3_export()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport to_level3_export;

	/**
	 * The cached value of the '{@link #getLevel3_format() <em>Level3 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3_format()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level3_format;

	/**
	 * The cached value of the '{@link #getTo_level2_export() <em>To level2 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_level2_export()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport to_level2_export;

	/**
	 * The cached value of the '{@link #getLevel2_format() <em>Level2 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_format()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level2_format;

	/**
	 * The cached value of the '{@link #getTo_level1_export() <em>To level1 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_level1_export()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport to_level1_export;

	/**
	 * The cached value of the '{@link #getLevel1_format() <em>Level1 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_format()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level1_format;

	/**
	 * The cached value of the '{@link #getTo_level0_export() <em>To level0 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_level0_export()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport to_level0_export;

	/**
	 * The cached value of the '{@link #getLevel0_format() <em>Level0 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0_format()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level0_format;

	/**
	 * The cached value of the '{@link #getGssFields() <em>Gss Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssFields()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTCField> gssFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcPackage.Literals.GSSTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevels() {
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevels(String newLevels) {
		String oldLevels = levels;
		levels = newLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__LEVELS, oldLevels, levels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getTo_level3_export() {
		if (to_level3_export != null && to_level3_export.eIsProxy()) {
			InternalEObject oldTo_level3_export = (InternalEObject)to_level3_export;
			to_level3_export = (GSSExportExport)eResolveProxy(oldTo_level3_export);
			if (to_level3_export != oldTo_level3_export) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__TO_LEVEL3_EXPORT, oldTo_level3_export, to_level3_export));
			}
		}
		return to_level3_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetTo_level3_export() {
		return to_level3_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_level3_export(GSSExportExport newTo_level3_export) {
		GSSExportExport oldTo_level3_export = to_level3_export;
		to_level3_export = newTo_level3_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__TO_LEVEL3_EXPORT, oldTo_level3_export, to_level3_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel3_format() {
		if (level3_format != null && level3_format.eIsProxy()) {
			InternalEObject oldLevel3_format = (InternalEObject)level3_format;
			level3_format = (GSSFormatFormat)eResolveProxy(oldLevel3_format);
			if (level3_format != oldLevel3_format) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__LEVEL3_FORMAT, oldLevel3_format, level3_format));
			}
		}
		return level3_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel3_format() {
		return level3_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3_format(GSSFormatFormat newLevel3_format) {
		GSSFormatFormat oldLevel3_format = level3_format;
		level3_format = newLevel3_format;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__LEVEL3_FORMAT, oldLevel3_format, level3_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getTo_level2_export() {
		if (to_level2_export != null && to_level2_export.eIsProxy()) {
			InternalEObject oldTo_level2_export = (InternalEObject)to_level2_export;
			to_level2_export = (GSSExportExport)eResolveProxy(oldTo_level2_export);
			if (to_level2_export != oldTo_level2_export) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__TO_LEVEL2_EXPORT, oldTo_level2_export, to_level2_export));
			}
		}
		return to_level2_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetTo_level2_export() {
		return to_level2_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_level2_export(GSSExportExport newTo_level2_export) {
		GSSExportExport oldTo_level2_export = to_level2_export;
		to_level2_export = newTo_level2_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__TO_LEVEL2_EXPORT, oldTo_level2_export, to_level2_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel2_format() {
		if (level2_format != null && level2_format.eIsProxy()) {
			InternalEObject oldLevel2_format = (InternalEObject)level2_format;
			level2_format = (GSSFormatFormat)eResolveProxy(oldLevel2_format);
			if (level2_format != oldLevel2_format) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__LEVEL2_FORMAT, oldLevel2_format, level2_format));
			}
		}
		return level2_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel2_format() {
		return level2_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_format(GSSFormatFormat newLevel2_format) {
		GSSFormatFormat oldLevel2_format = level2_format;
		level2_format = newLevel2_format;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__LEVEL2_FORMAT, oldLevel2_format, level2_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getTo_level1_export() {
		if (to_level1_export != null && to_level1_export.eIsProxy()) {
			InternalEObject oldTo_level1_export = (InternalEObject)to_level1_export;
			to_level1_export = (GSSExportExport)eResolveProxy(oldTo_level1_export);
			if (to_level1_export != oldTo_level1_export) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__TO_LEVEL1_EXPORT, oldTo_level1_export, to_level1_export));
			}
		}
		return to_level1_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetTo_level1_export() {
		return to_level1_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_level1_export(GSSExportExport newTo_level1_export) {
		GSSExportExport oldTo_level1_export = to_level1_export;
		to_level1_export = newTo_level1_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__TO_LEVEL1_EXPORT, oldTo_level1_export, to_level1_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel1_format() {
		if (level1_format != null && level1_format.eIsProxy()) {
			InternalEObject oldLevel1_format = (InternalEObject)level1_format;
			level1_format = (GSSFormatFormat)eResolveProxy(oldLevel1_format);
			if (level1_format != oldLevel1_format) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__LEVEL1_FORMAT, oldLevel1_format, level1_format));
			}
		}
		return level1_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel1_format() {
		return level1_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_format(GSSFormatFormat newLevel1_format) {
		GSSFormatFormat oldLevel1_format = level1_format;
		level1_format = newLevel1_format;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__LEVEL1_FORMAT, oldLevel1_format, level1_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getTo_level0_export() {
		if (to_level0_export != null && to_level0_export.eIsProxy()) {
			InternalEObject oldTo_level0_export = (InternalEObject)to_level0_export;
			to_level0_export = (GSSExportExport)eResolveProxy(oldTo_level0_export);
			if (to_level0_export != oldTo_level0_export) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__TO_LEVEL0_EXPORT, oldTo_level0_export, to_level0_export));
			}
		}
		return to_level0_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetTo_level0_export() {
		return to_level0_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_level0_export(GSSExportExport newTo_level0_export) {
		GSSExportExport oldTo_level0_export = to_level0_export;
		to_level0_export = newTo_level0_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__TO_LEVEL0_EXPORT, oldTo_level0_export, to_level0_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel0_format() {
		if (level0_format != null && level0_format.eIsProxy()) {
			InternalEObject oldLevel0_format = (InternalEObject)level0_format;
			level0_format = (GSSFormatFormat)eResolveProxy(oldLevel0_format);
			if (level0_format != oldLevel0_format) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.GSSTC__LEVEL0_FORMAT, oldLevel0_format, level0_format));
			}
		}
		return level0_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel0_format() {
		return level0_format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0_format(GSSFormatFormat newLevel0_format) {
		GSSFormatFormat oldLevel0_format = level0_format;
		level0_format = newLevel0_format;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.GSSTC__LEVEL0_FORMAT, oldLevel0_format, level0_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTCField> getGssFields() {
		if (gssFields == null) {
			gssFields = new EObjectContainmentEList<GSSTCField>(GSSTCField.class, this, tcPackage.GSSTC__GSS_FIELDS);
		}
		return gssFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tcPackage.GSSTC__GSS_FIELDS:
				return ((InternalEList<?>)getGssFields()).basicRemove(otherEnd, msgs);
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
			case tcPackage.GSSTC__LEVELS:
				return getLevels();
			case tcPackage.GSSTC__TO_LEVEL3_EXPORT:
				if (resolve) return getTo_level3_export();
				return basicGetTo_level3_export();
			case tcPackage.GSSTC__LEVEL3_FORMAT:
				if (resolve) return getLevel3_format();
				return basicGetLevel3_format();
			case tcPackage.GSSTC__TO_LEVEL2_EXPORT:
				if (resolve) return getTo_level2_export();
				return basicGetTo_level2_export();
			case tcPackage.GSSTC__LEVEL2_FORMAT:
				if (resolve) return getLevel2_format();
				return basicGetLevel2_format();
			case tcPackage.GSSTC__TO_LEVEL1_EXPORT:
				if (resolve) return getTo_level1_export();
				return basicGetTo_level1_export();
			case tcPackage.GSSTC__LEVEL1_FORMAT:
				if (resolve) return getLevel1_format();
				return basicGetLevel1_format();
			case tcPackage.GSSTC__TO_LEVEL0_EXPORT:
				if (resolve) return getTo_level0_export();
				return basicGetTo_level0_export();
			case tcPackage.GSSTC__LEVEL0_FORMAT:
				if (resolve) return getLevel0_format();
				return basicGetLevel0_format();
			case tcPackage.GSSTC__GSS_FIELDS:
				return getGssFields();
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
			case tcPackage.GSSTC__LEVELS:
				setLevels((String)newValue);
				return;
			case tcPackage.GSSTC__TO_LEVEL3_EXPORT:
				setTo_level3_export((GSSExportExport)newValue);
				return;
			case tcPackage.GSSTC__LEVEL3_FORMAT:
				setLevel3_format((GSSFormatFormat)newValue);
				return;
			case tcPackage.GSSTC__TO_LEVEL2_EXPORT:
				setTo_level2_export((GSSExportExport)newValue);
				return;
			case tcPackage.GSSTC__LEVEL2_FORMAT:
				setLevel2_format((GSSFormatFormat)newValue);
				return;
			case tcPackage.GSSTC__TO_LEVEL1_EXPORT:
				setTo_level1_export((GSSExportExport)newValue);
				return;
			case tcPackage.GSSTC__LEVEL1_FORMAT:
				setLevel1_format((GSSFormatFormat)newValue);
				return;
			case tcPackage.GSSTC__TO_LEVEL0_EXPORT:
				setTo_level0_export((GSSExportExport)newValue);
				return;
			case tcPackage.GSSTC__LEVEL0_FORMAT:
				setLevel0_format((GSSFormatFormat)newValue);
				return;
			case tcPackage.GSSTC__GSS_FIELDS:
				getGssFields().clear();
				getGssFields().addAll((Collection<? extends GSSTCField>)newValue);
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
			case tcPackage.GSSTC__LEVELS:
				setLevels(LEVELS_EDEFAULT);
				return;
			case tcPackage.GSSTC__TO_LEVEL3_EXPORT:
				setTo_level3_export((GSSExportExport)null);
				return;
			case tcPackage.GSSTC__LEVEL3_FORMAT:
				setLevel3_format((GSSFormatFormat)null);
				return;
			case tcPackage.GSSTC__TO_LEVEL2_EXPORT:
				setTo_level2_export((GSSExportExport)null);
				return;
			case tcPackage.GSSTC__LEVEL2_FORMAT:
				setLevel2_format((GSSFormatFormat)null);
				return;
			case tcPackage.GSSTC__TO_LEVEL1_EXPORT:
				setTo_level1_export((GSSExportExport)null);
				return;
			case tcPackage.GSSTC__LEVEL1_FORMAT:
				setLevel1_format((GSSFormatFormat)null);
				return;
			case tcPackage.GSSTC__TO_LEVEL0_EXPORT:
				setTo_level0_export((GSSExportExport)null);
				return;
			case tcPackage.GSSTC__LEVEL0_FORMAT:
				setLevel0_format((GSSFormatFormat)null);
				return;
			case tcPackage.GSSTC__GSS_FIELDS:
				getGssFields().clear();
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
			case tcPackage.GSSTC__LEVELS:
				return LEVELS_EDEFAULT == null ? levels != null : !LEVELS_EDEFAULT.equals(levels);
			case tcPackage.GSSTC__TO_LEVEL3_EXPORT:
				return to_level3_export != null;
			case tcPackage.GSSTC__LEVEL3_FORMAT:
				return level3_format != null;
			case tcPackage.GSSTC__TO_LEVEL2_EXPORT:
				return to_level2_export != null;
			case tcPackage.GSSTC__LEVEL2_FORMAT:
				return level2_format != null;
			case tcPackage.GSSTC__TO_LEVEL1_EXPORT:
				return to_level1_export != null;
			case tcPackage.GSSTC__LEVEL1_FORMAT:
				return level1_format != null;
			case tcPackage.GSSTC__TO_LEVEL0_EXPORT:
				return to_level0_export != null;
			case tcPackage.GSSTC__LEVEL0_FORMAT:
				return level0_format != null;
			case tcPackage.GSSTC__GSS_FIELDS:
				return gssFields != null && !gssFields.isEmpty();
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
		result.append(" (levels: ");
		result.append(levels);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<TMTCIFTCField> getFields() {
		EList<TMTCIFTCField> fields = new BasicEList<TMTCIFTCField>();
		for(GSSTCField gssField : getGssFields()) {
			fields.add((TMTCIFTCField) gssField);
		};
		return fields;
	}
} //GSSTCImpl
