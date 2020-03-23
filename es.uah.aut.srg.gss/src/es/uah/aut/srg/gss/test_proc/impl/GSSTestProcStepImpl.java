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

import es.uah.aut.srg.gss.common.impl.GSSModelObjectImpl;

import es.uah.aut.srg.gss.test_proc.GSSTestProcAbstractInputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps;
import es.uah.aut.srg.gss.test_proc.GSSTestProcMode;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets;
import es.uah.aut.srg.gss.test_proc.GSSTestProcStep;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getReplays <em>Replays</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getPrev_step_idref <em>Prev step idref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl#getConcurrent_steps <em>Concurrent steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcStepImpl extends GSSModelObjectImpl implements GSSTestProcStep {
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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcMode MODE_EDEFAULT = GSSTestProcMode.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcMode mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getReplays() <em>Replays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplays()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplays() <em>Replays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplays()
	 * @generated
	 * @ordered
	 */
	protected String replays = REPLAYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrev_step_idref() <em>Prev step idref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev_step_idref()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcStep prev_step_idref;

	/**
	 * The cached value of the '{@link #getOutput_idref_from_prev_step() <em>Output idref from prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_idref_from_prev_step()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcOutput output_idref_from_prev_step;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcAbstractInputs inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcOutputs outputs;

	/**
	 * The cached value of the '{@link #getSpecialPackets() <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcSpecialPackets specialPackets;

	/**
	 * The cached value of the '{@link #getConcurrent_steps() <em>Concurrent steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrent_steps()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcConcurrentSteps concurrent_steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(GSSTestProcMode newMode) {
		GSSTestProcMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		GSSTestProcMode oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_STEP__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplays() {
		return replays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplays(String newReplays) {
		String oldReplays = replays;
		replays = newReplays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__REPLAYS, oldReplays, replays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcStep getPrev_step_idref() {
		if (prev_step_idref != null && prev_step_idref.eIsProxy()) {
			InternalEObject oldPrev_step_idref = (InternalEObject)prev_step_idref;
			prev_step_idref = (GSSTestProcStep)eResolveProxy(oldPrev_step_idref);
			if (prev_step_idref != oldPrev_step_idref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_STEP__PREV_STEP_IDREF, oldPrev_step_idref, prev_step_idref));
			}
		}
		return prev_step_idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcStep basicGetPrev_step_idref() {
		return prev_step_idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev_step_idref(GSSTestProcStep newPrev_step_idref) {
		GSSTestProcStep oldPrev_step_idref = prev_step_idref;
		prev_step_idref = newPrev_step_idref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__PREV_STEP_IDREF, oldPrev_step_idref, prev_step_idref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutput getOutput_idref_from_prev_step() {
		if (output_idref_from_prev_step != null && output_idref_from_prev_step.eIsProxy()) {
			InternalEObject oldOutput_idref_from_prev_step = (InternalEObject)output_idref_from_prev_step;
			output_idref_from_prev_step = (GSSTestProcOutput)eResolveProxy(oldOutput_idref_from_prev_step);
			if (output_idref_from_prev_step != oldOutput_idref_from_prev_step) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP, oldOutput_idref_from_prev_step, output_idref_from_prev_step));
			}
		}
		return output_idref_from_prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutput basicGetOutput_idref_from_prev_step() {
		return output_idref_from_prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_idref_from_prev_step(GSSTestProcOutput newOutput_idref_from_prev_step) {
		GSSTestProcOutput oldOutput_idref_from_prev_step = output_idref_from_prev_step;
		output_idref_from_prev_step = newOutput_idref_from_prev_step;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP, oldOutput_idref_from_prev_step, output_idref_from_prev_step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcAbstractInputs getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(GSSTestProcAbstractInputs newInputs, NotificationChain msgs) {
		GSSTestProcAbstractInputs oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(GSSTestProcAbstractInputs newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutputs getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(GSSTestProcOutputs newOutputs, NotificationChain msgs) {
		GSSTestProcOutputs oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS, oldOutputs, newOutputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(GSSTestProcOutputs newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcSpecialPackets getSpecialPackets() {
		return specialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialPackets(GSSTestProcSpecialPackets newSpecialPackets, NotificationChain msgs) {
		GSSTestProcSpecialPackets oldSpecialPackets = specialPackets;
		specialPackets = newSpecialPackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS, oldSpecialPackets, newSpecialPackets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialPackets(GSSTestProcSpecialPackets newSpecialPackets) {
		if (newSpecialPackets != specialPackets) {
			NotificationChain msgs = null;
			if (specialPackets != null)
				msgs = ((InternalEObject)specialPackets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS, null, msgs);
			if (newSpecialPackets != null)
				msgs = ((InternalEObject)newSpecialPackets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS, null, msgs);
			msgs = basicSetSpecialPackets(newSpecialPackets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS, newSpecialPackets, newSpecialPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcConcurrentSteps getConcurrent_steps() {
		return concurrent_steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrent_steps(GSSTestProcConcurrentSteps newConcurrent_steps, NotificationChain msgs) {
		GSSTestProcConcurrentSteps oldConcurrent_steps = concurrent_steps;
		concurrent_steps = newConcurrent_steps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS, oldConcurrent_steps, newConcurrent_steps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrent_steps(GSSTestProcConcurrentSteps newConcurrent_steps) {
		if (newConcurrent_steps != concurrent_steps) {
			NotificationChain msgs = null;
			if (concurrent_steps != null)
				msgs = ((InternalEObject)concurrent_steps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS, null, msgs);
			if (newConcurrent_steps != null)
				msgs = ((InternalEObject)newConcurrent_steps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS, null, msgs);
			msgs = basicSetConcurrent_steps(newConcurrent_steps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS, newConcurrent_steps, newConcurrent_steps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_STEP__INPUTS:
				return basicSetInputs(null, msgs);
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS:
				return basicSetOutputs(null, msgs);
			case test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS:
				return basicSetSpecialPackets(null, msgs);
			case test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS:
				return basicSetConcurrent_steps(null, msgs);
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
			case test_procPackage.GSS_TEST_PROC_STEP__ID:
				return getId();
			case test_procPackage.GSS_TEST_PROC_STEP__MODE:
				return getMode();
			case test_procPackage.GSS_TEST_PROC_STEP__REPLAYS:
				return getReplays();
			case test_procPackage.GSS_TEST_PROC_STEP__PREV_STEP_IDREF:
				if (resolve) return getPrev_step_idref();
				return basicGetPrev_step_idref();
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				if (resolve) return getOutput_idref_from_prev_step();
				return basicGetOutput_idref_from_prev_step();
			case test_procPackage.GSS_TEST_PROC_STEP__INPUTS:
				return getInputs();
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS:
				return getOutputs();
			case test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS:
				return getSpecialPackets();
			case test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS:
				return getConcurrent_steps();
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
			case test_procPackage.GSS_TEST_PROC_STEP__ID:
				setId((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__MODE:
				setMode((GSSTestProcMode)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__REPLAYS:
				setReplays((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__PREV_STEP_IDREF:
				setPrev_step_idref((GSSTestProcStep)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				setOutput_idref_from_prev_step((GSSTestProcOutput)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__INPUTS:
				setInputs((GSSTestProcAbstractInputs)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS:
				setOutputs((GSSTestProcOutputs)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS:
				setSpecialPackets((GSSTestProcSpecialPackets)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS:
				setConcurrent_steps((GSSTestProcConcurrentSteps)newValue);
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
			case test_procPackage.GSS_TEST_PROC_STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__MODE:
				unsetMode();
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__REPLAYS:
				setReplays(REPLAYS_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__PREV_STEP_IDREF:
				setPrev_step_idref((GSSTestProcStep)null);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				setOutput_idref_from_prev_step((GSSTestProcOutput)null);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__INPUTS:
				setInputs((GSSTestProcAbstractInputs)null);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS:
				setOutputs((GSSTestProcOutputs)null);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS:
				setSpecialPackets((GSSTestProcSpecialPackets)null);
				return;
			case test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS:
				setConcurrent_steps((GSSTestProcConcurrentSteps)null);
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
			case test_procPackage.GSS_TEST_PROC_STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case test_procPackage.GSS_TEST_PROC_STEP__MODE:
				return isSetMode();
			case test_procPackage.GSS_TEST_PROC_STEP__REPLAYS:
				return REPLAYS_EDEFAULT == null ? replays != null : !REPLAYS_EDEFAULT.equals(replays);
			case test_procPackage.GSS_TEST_PROC_STEP__PREV_STEP_IDREF:
				return prev_step_idref != null;
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				return output_idref_from_prev_step != null;
			case test_procPackage.GSS_TEST_PROC_STEP__INPUTS:
				return inputs != null;
			case test_procPackage.GSS_TEST_PROC_STEP__OUTPUTS:
				return outputs != null;
			case test_procPackage.GSS_TEST_PROC_STEP__SPECIAL_PACKETS:
				return specialPackets != null;
			case test_procPackage.GSS_TEST_PROC_STEP__CONCURRENT_STEPS:
				return concurrent_steps != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", replays: ");
		result.append(replays);
		result.append(')');
		return result.toString();
	}

} //GSSTestProcStepImpl
