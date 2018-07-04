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

import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1ToLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2ToLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3ToLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcUnit;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Input Level3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel3 <em>Level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getApp_to_level3 <em>App to level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel3_to_level2 <em>Level3 to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcInputLevel3Impl extends MinimalEObjectImpl.Container implements GSSTestProcInputLevel3 {
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
	 * The default value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected String delay_value = DELAY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcUnit DELAY_UNIT_EDEFAULT = GSSTestProcUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcUnit delay_unit = DELAY_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevel3() <em>Level3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel3 level3;

	/**
	 * The cached value of the '{@link #getApp_to_level3() <em>App to level3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level3()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcAppToLevel3 app_to_level3;

	/**
	 * The cached value of the '{@link #getLevel2() <em>Level2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel2 level2;

	/**
	 * The cached value of the '{@link #getLevel3_to_level2() <em>Level3 to level2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3_to_level2()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel3ToLevel2 level3_to_level2;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel1 level1;

	/**
	 * The cached value of the '{@link #getLevel2_to_level1() <em>Level2 to level1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_to_level1()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel2ToLevel1 level2_to_level1;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel0 level0;

	/**
	 * The cached value of the '{@link #getLevel1_to_level0() <em>Level1 to level0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_to_level0()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcLevel1ToLevel0 level1_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcInputLevel3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay_value() {
		return delay_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_value(String newDelay_value) {
		String oldDelay_value = delay_value;
		delay_value = newDelay_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE, oldDelay_value, delay_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcUnit getDelay_unit() {
		return delay_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_unit(GSSTestProcUnit newDelay_unit) {
		GSSTestProcUnit oldDelay_unit = delay_unit;
		delay_unit = newDelay_unit == null ? DELAY_UNIT_EDEFAULT : newDelay_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT, oldDelay_unit, delay_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel3 getLevel3() {
		return level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel3(GSSTestProcLevel3 newLevel3, NotificationChain msgs) {
		GSSTestProcLevel3 oldLevel3 = level3;
		level3 = newLevel3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3, oldLevel3, newLevel3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3(GSSTestProcLevel3 newLevel3) {
		if (newLevel3 != level3) {
			NotificationChain msgs = null;
			if (level3 != null)
				msgs = ((InternalEObject)level3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3, null, msgs);
			if (newLevel3 != null)
				msgs = ((InternalEObject)newLevel3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3, null, msgs);
			msgs = basicSetLevel3(newLevel3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3, newLevel3, newLevel3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcAppToLevel3 getApp_to_level3() {
		return app_to_level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp_to_level3(GSSTestProcAppToLevel3 newApp_to_level3, NotificationChain msgs) {
		GSSTestProcAppToLevel3 oldApp_to_level3 = app_to_level3;
		app_to_level3 = newApp_to_level3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3, oldApp_to_level3, newApp_to_level3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level3(GSSTestProcAppToLevel3 newApp_to_level3) {
		if (newApp_to_level3 != app_to_level3) {
			NotificationChain msgs = null;
			if (app_to_level3 != null)
				msgs = ((InternalEObject)app_to_level3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3, null, msgs);
			if (newApp_to_level3 != null)
				msgs = ((InternalEObject)newApp_to_level3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3, null, msgs);
			msgs = basicSetApp_to_level3(newApp_to_level3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3, newApp_to_level3, newApp_to_level3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel2 getLevel2() {
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel2(GSSTestProcLevel2 newLevel2, NotificationChain msgs) {
		GSSTestProcLevel2 oldLevel2 = level2;
		level2 = newLevel2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2, oldLevel2, newLevel2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2(GSSTestProcLevel2 newLevel2) {
		if (newLevel2 != level2) {
			NotificationChain msgs = null;
			if (level2 != null)
				msgs = ((InternalEObject)level2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2, null, msgs);
			if (newLevel2 != null)
				msgs = ((InternalEObject)newLevel2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2, null, msgs);
			msgs = basicSetLevel2(newLevel2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2, newLevel2, newLevel2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel3ToLevel2 getLevel3_to_level2() {
		return level3_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel3_to_level2(GSSTestProcLevel3ToLevel2 newLevel3_to_level2, NotificationChain msgs) {
		GSSTestProcLevel3ToLevel2 oldLevel3_to_level2 = level3_to_level2;
		level3_to_level2 = newLevel3_to_level2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2, oldLevel3_to_level2, newLevel3_to_level2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3_to_level2(GSSTestProcLevel3ToLevel2 newLevel3_to_level2) {
		if (newLevel3_to_level2 != level3_to_level2) {
			NotificationChain msgs = null;
			if (level3_to_level2 != null)
				msgs = ((InternalEObject)level3_to_level2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2, null, msgs);
			if (newLevel3_to_level2 != null)
				msgs = ((InternalEObject)newLevel3_to_level2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2, null, msgs);
			msgs = basicSetLevel3_to_level2(newLevel3_to_level2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2, newLevel3_to_level2, newLevel3_to_level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel1 getLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel1(GSSTestProcLevel1 newLevel1, NotificationChain msgs) {
		GSSTestProcLevel1 oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1, oldLevel1, newLevel1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(GSSTestProcLevel1 newLevel1) {
		if (newLevel1 != level1) {
			NotificationChain msgs = null;
			if (level1 != null)
				msgs = ((InternalEObject)level1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1, null, msgs);
			if (newLevel1 != null)
				msgs = ((InternalEObject)newLevel1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1, null, msgs);
			msgs = basicSetLevel1(newLevel1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1, newLevel1, newLevel1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel2ToLevel1 getLevel2_to_level1() {
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel2_to_level1(GSSTestProcLevel2ToLevel1 newLevel2_to_level1, NotificationChain msgs) {
		GSSTestProcLevel2ToLevel1 oldLevel2_to_level1 = level2_to_level1;
		level2_to_level1 = newLevel2_to_level1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, newLevel2_to_level1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_to_level1(GSSTestProcLevel2ToLevel1 newLevel2_to_level1) {
		if (newLevel2_to_level1 != level2_to_level1) {
			NotificationChain msgs = null;
			if (level2_to_level1 != null)
				msgs = ((InternalEObject)level2_to_level1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1, null, msgs);
			if (newLevel2_to_level1 != null)
				msgs = ((InternalEObject)newLevel2_to_level1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1, null, msgs);
			msgs = basicSetLevel2_to_level1(newLevel2_to_level1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1, newLevel2_to_level1, newLevel2_to_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel0 getLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel0(GSSTestProcLevel0 newLevel0, NotificationChain msgs) {
		GSSTestProcLevel0 oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0, oldLevel0, newLevel0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSTestProcLevel0 newLevel0) {
		if (newLevel0 != level0) {
			NotificationChain msgs = null;
			if (level0 != null)
				msgs = ((InternalEObject)level0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0, null, msgs);
			if (newLevel0 != null)
				msgs = ((InternalEObject)newLevel0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0, null, msgs);
			msgs = basicSetLevel0(newLevel0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0, newLevel0, newLevel0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcLevel1ToLevel0 getLevel1_to_level0() {
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel1_to_level0(GSSTestProcLevel1ToLevel0 newLevel1_to_level0, NotificationChain msgs) {
		GSSTestProcLevel1ToLevel0 oldLevel1_to_level0 = level1_to_level0;
		level1_to_level0 = newLevel1_to_level0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, newLevel1_to_level0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_to_level0(GSSTestProcLevel1ToLevel0 newLevel1_to_level0) {
		if (newLevel1_to_level0 != level1_to_level0) {
			NotificationChain msgs = null;
			if (level1_to_level0 != null)
				msgs = ((InternalEObject)level1_to_level0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0, null, msgs);
			if (newLevel1_to_level0 != null)
				msgs = ((InternalEObject)newLevel1_to_level0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0, null, msgs);
			msgs = basicSetLevel1_to_level0(newLevel1_to_level0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0, newLevel1_to_level0, newLevel1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				return basicSetLevel3(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				return basicSetApp_to_level3(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				return basicSetLevel2(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				return basicSetLevel3_to_level2(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				return basicSetLevel1(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				return basicSetLevel2_to_level1(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				return basicSetLevel0(null, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
				return basicSetLevel1_to_level0(null, msgs);
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__NAME:
				return getName();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF:
				return getIfRef();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE:
				return getDelay_value();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT:
				return getDelay_unit();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				return getLevel3();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				return getApp_to_level3();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				return getLevel2();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				return getLevel3_to_level2();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				return getLevel1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				return getLevel2_to_level1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				return getLevel0();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
				return getLevel1_to_level0();
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__NAME:
				setName((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF:
				setIfRef((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE:
				setDelay_value((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT:
				setDelay_unit((GSSTestProcUnit)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				setLevel3((GSSTestProcLevel3)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				setApp_to_level3((GSSTestProcAppToLevel3)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				setLevel2((GSSTestProcLevel2)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				setLevel3_to_level2((GSSTestProcLevel3ToLevel2)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				setLevel1((GSSTestProcLevel1)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((GSSTestProcLevel2ToLevel1)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				setLevel0((GSSTestProcLevel0)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((GSSTestProcLevel1ToLevel0)newValue);
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE:
				setDelay_value(DELAY_VALUE_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT:
				setDelay_unit(DELAY_UNIT_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				setLevel3((GSSTestProcLevel3)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				setApp_to_level3((GSSTestProcAppToLevel3)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				setLevel2((GSSTestProcLevel2)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				setLevel3_to_level2((GSSTestProcLevel3ToLevel2)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				setLevel1((GSSTestProcLevel1)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((GSSTestProcLevel2ToLevel1)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				setLevel0((GSSTestProcLevel0)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((GSSTestProcLevel1ToLevel0)null);
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE:
				return DELAY_VALUE_EDEFAULT == null ? delay_value != null : !DELAY_VALUE_EDEFAULT.equals(delay_value);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT:
				return delay_unit != DELAY_UNIT_EDEFAULT;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				return level3 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				return app_to_level3 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				return level2 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				return level3_to_level2 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				return level1 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				return level2_to_level1 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				return level0 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
				return level1_to_level0 != null;
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
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", delay_value: ");
		result.append(delay_value);
		result.append(", delay_unit: ");
		result.append(delay_unit);
		result.append(')');
		return result.toString();
	}

} //GSSTestProcInputLevel3Impl
