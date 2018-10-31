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
package es.uah.aut.srg.gss.test_proc.impl;

import es.uah.aut.srg.gss.imports.GSSImportImport;

import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Output Level2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getOptional <em>Optional</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel2_filter <em>Level2 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel2_from_level1 <em>Level2 from level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel1_filter <em>Level1 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel1_from_level0 <em>Level1 from level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl#getLevel0_filter <em>Level0 filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcOutputLevel2Impl extends GSSTestProcOutputImpl implements GSSTestProcOutputLevel2 {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected String ifRef = IF_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected String optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevel2() <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat level2;

	/**
	 * The cached value of the '{@link #getLevel2_filter() <em>Level2 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel2Filter level2_filter;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat level1;

	/**
	 * The cached value of the '{@link #getLevel2_from_level1() <em>Level2 from level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_from_level1()
	 * @generated
	 * @ordered
	 */
	protected GSSImportImport level2_from_level1;

	/**
	 * The cached value of the '{@link #getLevel1_filter() <em>Level1 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel1Filter level1_filter;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat level0;

	/**
	 * The cached value of the '{@link #getLevel1_from_level0() <em>Level1 from level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_from_level0()
	 * @generated
	 * @ordered
	 */
	protected GSSImportImport level1_from_level0;

	/**
	 * The cached value of the '{@link #getLevel0_filter() <em>Level0 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel0Filter level0_filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcOutputLevel2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_OUTPUT_LEVEL2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfRef() {
		return ifRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfRef(String newIfRef) {
		String oldIfRef = ifRef;
		ifRef = newIfRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(String newOptional) {
		String oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getLevel2() {
		if (level2 != null && level2.eIsProxy()) {
			InternalEObject oldLevel2 = (InternalEObject)level2;
			level2 = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldLevel2);
			if (level2 != oldLevel2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2, oldLevel2, level2));
			}
		}
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetLevel2() {
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2(GSSTmTcFormatTmTcFormat newLevel2) {
		GSSTmTcFormatTmTcFormat oldLevel2 = level2;
		level2 = newLevel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2, oldLevel2, level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel2Filter getLevel2_filter() {
		return level2_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel2_filter(GSSTestProcLevel2Filter newLevel2_filter, NotificationChain msgs) {
		GSSTestProcLevel2Filter oldLevel2_filter = level2_filter;
		level2_filter = newLevel2_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER, oldLevel2_filter, newLevel2_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_filter(GSSTestProcLevel2Filter newLevel2_filter) {
		if (newLevel2_filter != level2_filter) {
			NotificationChain msgs = null;
			if (level2_filter != null)
				msgs = ((InternalEObject)level2_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER, null, msgs);
			if (newLevel2_filter != null)
				msgs = ((InternalEObject)newLevel2_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER, null, msgs);
			msgs = basicSetLevel2_filter(newLevel2_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER, newLevel2_filter, newLevel2_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldLevel1);
			if (level1 != oldLevel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1, oldLevel1, level1));
			}
		}
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(GSSTmTcFormatTmTcFormat newLevel1) {
		GSSTmTcFormatTmTcFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport getLevel2_from_level1() {
		if (level2_from_level1 != null && level2_from_level1.eIsProxy()) {
			InternalEObject oldLevel2_from_level1 = (InternalEObject)level2_from_level1;
			level2_from_level1 = (GSSImportImport)eResolveProxy(oldLevel2_from_level1);
			if (level2_from_level1 != oldLevel2_from_level1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1, oldLevel2_from_level1, level2_from_level1));
			}
		}
		return level2_from_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport basicGetLevel2_from_level1() {
		return level2_from_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_from_level1(GSSImportImport newLevel2_from_level1) {
		GSSImportImport oldLevel2_from_level1 = level2_from_level1;
		level2_from_level1 = newLevel2_from_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1, oldLevel2_from_level1, level2_from_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel1Filter getLevel1_filter() {
		return level1_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel1_filter(GSSTestProcLevel1Filter newLevel1_filter, NotificationChain msgs) {
		GSSTestProcLevel1Filter oldLevel1_filter = level1_filter;
		level1_filter = newLevel1_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER, oldLevel1_filter, newLevel1_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_filter(GSSTestProcLevel1Filter newLevel1_filter) {
		if (newLevel1_filter != level1_filter) {
			NotificationChain msgs = null;
			if (level1_filter != null)
				msgs = ((InternalEObject)level1_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER, null, msgs);
			if (newLevel1_filter != null)
				msgs = ((InternalEObject)newLevel1_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER, null, msgs);
			msgs = basicSetLevel1_filter(newLevel1_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER, newLevel1_filter, newLevel1_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSTmTcFormatTmTcFormat newLevel0) {
		GSSTmTcFormatTmTcFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport getLevel1_from_level0() {
		if (level1_from_level0 != null && level1_from_level0.eIsProxy()) {
			InternalEObject oldLevel1_from_level0 = (InternalEObject)level1_from_level0;
			level1_from_level0 = (GSSImportImport)eResolveProxy(oldLevel1_from_level0);
			if (level1_from_level0 != oldLevel1_from_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0, oldLevel1_from_level0, level1_from_level0));
			}
		}
		return level1_from_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport basicGetLevel1_from_level0() {
		return level1_from_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_from_level0(GSSImportImport newLevel1_from_level0) {
		GSSImportImport oldLevel1_from_level0 = level1_from_level0;
		level1_from_level0 = newLevel1_from_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0, oldLevel1_from_level0, level1_from_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel0Filter getLevel0_filter() {
		return level0_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel0_filter(GSSTestProcLevel0Filter newLevel0_filter, NotificationChain msgs) {
		GSSTestProcLevel0Filter oldLevel0_filter = level0_filter;
		level0_filter = newLevel0_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER, oldLevel0_filter, newLevel0_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0_filter(GSSTestProcLevel0Filter newLevel0_filter) {
		if (newLevel0_filter != level0_filter) {
			NotificationChain msgs = null;
			if (level0_filter != null)
				msgs = ((InternalEObject)level0_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER, null, msgs);
			if (newLevel0_filter != null)
				msgs = ((InternalEObject)newLevel0_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER, null, msgs);
			msgs = basicSetLevel0_filter(newLevel0_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER, newLevel0_filter, newLevel0_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER:
				return basicSetLevel2_filter(null, msgs);
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER:
				return basicSetLevel1_filter(null, msgs);
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER:
				return basicSetLevel0_filter(null, msgs);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__NAME:
				return getName();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__ID:
				return getId();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF:
				return getIfRef();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL:
				return getOptional();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2:
				if (resolve) return getLevel2();
				return basicGetLevel2();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER:
				return getLevel2_filter();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1:
				if (resolve) return getLevel2_from_level1();
				return basicGetLevel2_from_level1();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER:
				return getLevel1_filter();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0:
				if (resolve) return getLevel1_from_level0();
				return basicGetLevel1_from_level0();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER:
				return getLevel0_filter();
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__NAME:
				setName((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__ID:
				setId((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF:
				setIfRef((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL:
				setOptional((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2:
				setLevel2((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER:
				setLevel2_filter((GSSTestProcLevel2Filter)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1:
				setLevel1((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1:
				setLevel2_from_level1((GSSImportImport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER:
				setLevel1_filter((GSSTestProcLevel1Filter)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0:
				setLevel0((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0:
				setLevel1_from_level0((GSSImportImport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER:
				setLevel0_filter((GSSTestProcLevel0Filter)newValue);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__ID:
				setId(ID_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2:
				setLevel2((GSSTmTcFormatTmTcFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER:
				setLevel2_filter((GSSTestProcLevel2Filter)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1:
				setLevel1((GSSTmTcFormatTmTcFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1:
				setLevel2_from_level1((GSSImportImport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER:
				setLevel1_filter((GSSTestProcLevel1Filter)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0:
				setLevel0((GSSTmTcFormatTmTcFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0:
				setLevel1_from_level0((GSSImportImport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER:
				setLevel0_filter((GSSTestProcLevel0Filter)null);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2:
				return level2 != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER:
				return level2_filter != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1:
				return level1 != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1:
				return level2_from_level1 != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER:
				return level1_filter != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0:
				return level0 != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0:
				return level1_from_level0 != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER:
				return level0_filter != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //GSSTestProcOutputLevel2Impl
