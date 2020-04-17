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
package es.uah.aut.srg.gss.tm.impl;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.import_.GSSImportImport;

import es.uah.aut.srg.gss.tm.GSSTM;
import es.uah.aut.srg.gss.tm.tmPackage;

import es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSSTM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel3_filter <em>Level3 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel3_format <em>Level3 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getFrom_level2_import <em>From level2 import</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel2_filter <em>Level2 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel2_format <em>Level2 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getFrom_level1_import <em>From level1 import</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel1_filter <em>Level1 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel1_format <em>Level1 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getFrom_level0_import <em>From level0 import</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel0_filter <em>Level0 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl#getLevel0_format <em>Level0 format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTMImpl extends TMTCIFTMImpl implements GSSTM {
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
	 * The cached value of the '{@link #getLevel3_filter() <em>Level3 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter level3_filter;

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
	 * The cached value of the '{@link #getFrom_level2_import() <em>From level2 import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_level2_import()
	 * @generated
	 * @ordered
	 */
	protected GSSImportImport from_level2_import;

	/**
	 * The cached value of the '{@link #getLevel2_filter() <em>Level2 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter level2_filter;

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
	 * The cached value of the '{@link #getFrom_level1_import() <em>From level1 import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_level1_import()
	 * @generated
	 * @ordered
	 */
	protected GSSImportImport from_level1_import;

	/**
	 * The cached value of the '{@link #getLevel1_filter() <em>Level1 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter level1_filter;

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
	 * The cached value of the '{@link #getFrom_level0_import() <em>From level0 import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_level0_import()
	 * @generated
	 * @ordered
	 */
	protected GSSImportImport from_level0_import;

	/**
	 * The cached value of the '{@link #getLevel0_filter() <em>Level0 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter level0_filter;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmPackage.Literals.GSSTM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVELS, oldLevels, levels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getLevel3_filter() {
		if (level3_filter != null && level3_filter.eIsProxy()) {
			InternalEObject oldLevel3_filter = (InternalEObject)level3_filter;
			level3_filter = (GSSFilterFilter)eResolveProxy(oldLevel3_filter);
			if (level3_filter != oldLevel3_filter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL3_FILTER, oldLevel3_filter, level3_filter));
			}
		}
		return level3_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetLevel3_filter() {
		return level3_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3_filter(GSSFilterFilter newLevel3_filter) {
		GSSFilterFilter oldLevel3_filter = level3_filter;
		level3_filter = newLevel3_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL3_FILTER, oldLevel3_filter, level3_filter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL3_FORMAT, oldLevel3_format, level3_format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL3_FORMAT, oldLevel3_format, level3_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport getFrom_level2_import() {
		if (from_level2_import != null && from_level2_import.eIsProxy()) {
			InternalEObject oldFrom_level2_import = (InternalEObject)from_level2_import;
			from_level2_import = (GSSImportImport)eResolveProxy(oldFrom_level2_import);
			if (from_level2_import != oldFrom_level2_import) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__FROM_LEVEL2_IMPORT, oldFrom_level2_import, from_level2_import));
			}
		}
		return from_level2_import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport basicGetFrom_level2_import() {
		return from_level2_import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_level2_import(GSSImportImport newFrom_level2_import) {
		GSSImportImport oldFrom_level2_import = from_level2_import;
		from_level2_import = newFrom_level2_import;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__FROM_LEVEL2_IMPORT, oldFrom_level2_import, from_level2_import));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getLevel2_filter() {
		if (level2_filter != null && level2_filter.eIsProxy()) {
			InternalEObject oldLevel2_filter = (InternalEObject)level2_filter;
			level2_filter = (GSSFilterFilter)eResolveProxy(oldLevel2_filter);
			if (level2_filter != oldLevel2_filter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL2_FILTER, oldLevel2_filter, level2_filter));
			}
		}
		return level2_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetLevel2_filter() {
		return level2_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_filter(GSSFilterFilter newLevel2_filter) {
		GSSFilterFilter oldLevel2_filter = level2_filter;
		level2_filter = newLevel2_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL2_FILTER, oldLevel2_filter, level2_filter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL2_FORMAT, oldLevel2_format, level2_format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL2_FORMAT, oldLevel2_format, level2_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport getFrom_level1_import() {
		if (from_level1_import != null && from_level1_import.eIsProxy()) {
			InternalEObject oldFrom_level1_import = (InternalEObject)from_level1_import;
			from_level1_import = (GSSImportImport)eResolveProxy(oldFrom_level1_import);
			if (from_level1_import != oldFrom_level1_import) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__FROM_LEVEL1_IMPORT, oldFrom_level1_import, from_level1_import));
			}
		}
		return from_level1_import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport basicGetFrom_level1_import() {
		return from_level1_import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_level1_import(GSSImportImport newFrom_level1_import) {
		GSSImportImport oldFrom_level1_import = from_level1_import;
		from_level1_import = newFrom_level1_import;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__FROM_LEVEL1_IMPORT, oldFrom_level1_import, from_level1_import));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getLevel1_filter() {
		if (level1_filter != null && level1_filter.eIsProxy()) {
			InternalEObject oldLevel1_filter = (InternalEObject)level1_filter;
			level1_filter = (GSSFilterFilter)eResolveProxy(oldLevel1_filter);
			if (level1_filter != oldLevel1_filter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL1_FILTER, oldLevel1_filter, level1_filter));
			}
		}
		return level1_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetLevel1_filter() {
		return level1_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_filter(GSSFilterFilter newLevel1_filter) {
		GSSFilterFilter oldLevel1_filter = level1_filter;
		level1_filter = newLevel1_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL1_FILTER, oldLevel1_filter, level1_filter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL1_FORMAT, oldLevel1_format, level1_format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL1_FORMAT, oldLevel1_format, level1_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport getFrom_level0_import() {
		if (from_level0_import != null && from_level0_import.eIsProxy()) {
			InternalEObject oldFrom_level0_import = (InternalEObject)from_level0_import;
			from_level0_import = (GSSImportImport)eResolveProxy(oldFrom_level0_import);
			if (from_level0_import != oldFrom_level0_import) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__FROM_LEVEL0_IMPORT, oldFrom_level0_import, from_level0_import));
			}
		}
		return from_level0_import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport basicGetFrom_level0_import() {
		return from_level0_import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_level0_import(GSSImportImport newFrom_level0_import) {
		GSSImportImport oldFrom_level0_import = from_level0_import;
		from_level0_import = newFrom_level0_import;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__FROM_LEVEL0_IMPORT, oldFrom_level0_import, from_level0_import));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getLevel0_filter() {
		if (level0_filter != null && level0_filter.eIsProxy()) {
			InternalEObject oldLevel0_filter = (InternalEObject)level0_filter;
			level0_filter = (GSSFilterFilter)eResolveProxy(oldLevel0_filter);
			if (level0_filter != oldLevel0_filter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL0_FILTER, oldLevel0_filter, level0_filter));
			}
		}
		return level0_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetLevel0_filter() {
		return level0_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0_filter(GSSFilterFilter newLevel0_filter) {
		GSSFilterFilter oldLevel0_filter = level0_filter;
		level0_filter = newLevel0_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL0_FILTER, oldLevel0_filter, level0_filter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmPackage.GSSTM__LEVEL0_FORMAT, oldLevel0_format, level0_format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.GSSTM__LEVEL0_FORMAT, oldLevel0_format, level0_format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmPackage.GSSTM__LEVELS:
				return getLevels();
			case tmPackage.GSSTM__LEVEL3_FILTER:
				if (resolve) return getLevel3_filter();
				return basicGetLevel3_filter();
			case tmPackage.GSSTM__LEVEL3_FORMAT:
				if (resolve) return getLevel3_format();
				return basicGetLevel3_format();
			case tmPackage.GSSTM__FROM_LEVEL2_IMPORT:
				if (resolve) return getFrom_level2_import();
				return basicGetFrom_level2_import();
			case tmPackage.GSSTM__LEVEL2_FILTER:
				if (resolve) return getLevel2_filter();
				return basicGetLevel2_filter();
			case tmPackage.GSSTM__LEVEL2_FORMAT:
				if (resolve) return getLevel2_format();
				return basicGetLevel2_format();
			case tmPackage.GSSTM__FROM_LEVEL1_IMPORT:
				if (resolve) return getFrom_level1_import();
				return basicGetFrom_level1_import();
			case tmPackage.GSSTM__LEVEL1_FILTER:
				if (resolve) return getLevel1_filter();
				return basicGetLevel1_filter();
			case tmPackage.GSSTM__LEVEL1_FORMAT:
				if (resolve) return getLevel1_format();
				return basicGetLevel1_format();
			case tmPackage.GSSTM__FROM_LEVEL0_IMPORT:
				if (resolve) return getFrom_level0_import();
				return basicGetFrom_level0_import();
			case tmPackage.GSSTM__LEVEL0_FILTER:
				if (resolve) return getLevel0_filter();
				return basicGetLevel0_filter();
			case tmPackage.GSSTM__LEVEL0_FORMAT:
				if (resolve) return getLevel0_format();
				return basicGetLevel0_format();
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
			case tmPackage.GSSTM__LEVELS:
				setLevels((String)newValue);
				return;
			case tmPackage.GSSTM__LEVEL3_FILTER:
				setLevel3_filter((GSSFilterFilter)newValue);
				return;
			case tmPackage.GSSTM__LEVEL3_FORMAT:
				setLevel3_format((GSSFormatFormat)newValue);
				return;
			case tmPackage.GSSTM__FROM_LEVEL2_IMPORT:
				setFrom_level2_import((GSSImportImport)newValue);
				return;
			case tmPackage.GSSTM__LEVEL2_FILTER:
				setLevel2_filter((GSSFilterFilter)newValue);
				return;
			case tmPackage.GSSTM__LEVEL2_FORMAT:
				setLevel2_format((GSSFormatFormat)newValue);
				return;
			case tmPackage.GSSTM__FROM_LEVEL1_IMPORT:
				setFrom_level1_import((GSSImportImport)newValue);
				return;
			case tmPackage.GSSTM__LEVEL1_FILTER:
				setLevel1_filter((GSSFilterFilter)newValue);
				return;
			case tmPackage.GSSTM__LEVEL1_FORMAT:
				setLevel1_format((GSSFormatFormat)newValue);
				return;
			case tmPackage.GSSTM__FROM_LEVEL0_IMPORT:
				setFrom_level0_import((GSSImportImport)newValue);
				return;
			case tmPackage.GSSTM__LEVEL0_FILTER:
				setLevel0_filter((GSSFilterFilter)newValue);
				return;
			case tmPackage.GSSTM__LEVEL0_FORMAT:
				setLevel0_format((GSSFormatFormat)newValue);
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
			case tmPackage.GSSTM__LEVELS:
				setLevels(LEVELS_EDEFAULT);
				return;
			case tmPackage.GSSTM__LEVEL3_FILTER:
				setLevel3_filter((GSSFilterFilter)null);
				return;
			case tmPackage.GSSTM__LEVEL3_FORMAT:
				setLevel3_format((GSSFormatFormat)null);
				return;
			case tmPackage.GSSTM__FROM_LEVEL2_IMPORT:
				setFrom_level2_import((GSSImportImport)null);
				return;
			case tmPackage.GSSTM__LEVEL2_FILTER:
				setLevel2_filter((GSSFilterFilter)null);
				return;
			case tmPackage.GSSTM__LEVEL2_FORMAT:
				setLevel2_format((GSSFormatFormat)null);
				return;
			case tmPackage.GSSTM__FROM_LEVEL1_IMPORT:
				setFrom_level1_import((GSSImportImport)null);
				return;
			case tmPackage.GSSTM__LEVEL1_FILTER:
				setLevel1_filter((GSSFilterFilter)null);
				return;
			case tmPackage.GSSTM__LEVEL1_FORMAT:
				setLevel1_format((GSSFormatFormat)null);
				return;
			case tmPackage.GSSTM__FROM_LEVEL0_IMPORT:
				setFrom_level0_import((GSSImportImport)null);
				return;
			case tmPackage.GSSTM__LEVEL0_FILTER:
				setLevel0_filter((GSSFilterFilter)null);
				return;
			case tmPackage.GSSTM__LEVEL0_FORMAT:
				setLevel0_format((GSSFormatFormat)null);
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
			case tmPackage.GSSTM__LEVELS:
				return LEVELS_EDEFAULT == null ? levels != null : !LEVELS_EDEFAULT.equals(levels);
			case tmPackage.GSSTM__LEVEL3_FILTER:
				return level3_filter != null;
			case tmPackage.GSSTM__LEVEL3_FORMAT:
				return level3_format != null;
			case tmPackage.GSSTM__FROM_LEVEL2_IMPORT:
				return from_level2_import != null;
			case tmPackage.GSSTM__LEVEL2_FILTER:
				return level2_filter != null;
			case tmPackage.GSSTM__LEVEL2_FORMAT:
				return level2_format != null;
			case tmPackage.GSSTM__FROM_LEVEL1_IMPORT:
				return from_level1_import != null;
			case tmPackage.GSSTM__LEVEL1_FILTER:
				return level1_filter != null;
			case tmPackage.GSSTM__LEVEL1_FORMAT:
				return level1_format != null;
			case tmPackage.GSSTM__FROM_LEVEL0_IMPORT:
				return from_level0_import != null;
			case tmPackage.GSSTM__LEVEL0_FILTER:
				return level0_filter != null;
			case tmPackage.GSSTM__LEVEL0_FORMAT:
				return level0_format != null;
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

} //GSSTMImpl
