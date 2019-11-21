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

import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps;
import es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable;
import es.uah.aut.srg.gss.test_proc.GSSTestProcFilter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcMode;
import es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets;
import es.uah.aut.srg.gss.test_proc.GSSTestProcStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;
import es.uah.aut.srg.gss.test_proc.GSSTestProcUnit;
import es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo;
import es.uah.aut.srg.gss.test_proc.test_procFactory;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
import es.uah.aut.srg.tmtcif.export.exportPackage;
import es.uah.aut.srg.tmtcif.filter.filterPackage;
import es.uah.aut.srg.tmtcif.format.formatPackage;
import es.uah.aut.srg.tmtcif.import_.importPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class test_procPackageImpl extends EPackageImpl implements test_procPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcTestProcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcSpecialPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcEnableDisableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcConcurrentStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcNextStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcConcurrentStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcCheckmodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcYesNoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private test_procPackageImpl() {
		super(eNS_URI, test_procFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link test_procPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static test_procPackage init() {
		if (isInited) return (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Obtain or create and register package
		test_procPackageImpl thetest_procPackage = (test_procPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof test_procPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new test_procPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();
		exportPackage.eINSTANCE.eClass();
		filterPackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetest_procPackage.createPackageContents();

		// Initialize created meta-data
		thetest_procPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetest_procPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(test_procPackage.eNS_URI, thetest_procPackage);
		return thetest_procPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcTestProc() {
		return gssTestProcTestProcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcTestProc_Step() {
		return (EReference)gssTestProcTestProcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcTestProc_Scenario() {
		return (EAttribute)gssTestProcTestProcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcStep() {
		return gssTestProcStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcStep_Id() {
		return (EAttribute)gssTestProcStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcStep_Mode() {
		return (EAttribute)gssTestProcStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcStep_Replays() {
		return (EAttribute)gssTestProcStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Prev_step_idref() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Output_idref_from_prev_step() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Inputs() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Outputs() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_SpecialPackets() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Concurrent_steps() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputs() {
		return gssTestProcInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputs_Input() {
		return (EReference)gssTestProcInputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputs() {
		return gssTestProcOutputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputs_Checkmode() {
		return (EAttribute)gssTestProcOutputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputs_Valid_time_interval_value() {
		return (EAttribute)gssTestProcOutputsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputs_Valid_time_interval_unit() {
		return (EAttribute)gssTestProcOutputsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputs_Output() {
		return (EReference)gssTestProcOutputsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcSpecialPackets() {
		return gssTestProcSpecialPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Enable() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Disable() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Enable_print() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Disable_print() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcEnableDisable() {
		return gssTestProcEnableDisableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcEnableDisable_Id() {
		return (EAttribute)gssTestProcEnableDisableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcConcurrentSteps() {
		return gssTestProcConcurrentStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcConcurrentSteps_NextStep() {
		return (EReference)gssTestProcConcurrentStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcConcurrentSteps_Concurrent_step() {
		return (EReference)gssTestProcConcurrentStepsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcNextStep() {
		return gssTestProcNextStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcNextStep_Id() {
		return (EAttribute)gssTestProcNextStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcNextStep_IsConcurrent() {
		return (EAttribute)gssTestProcNextStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcConcurrentStep() {
		return gssTestProcConcurrentStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcConcurrentStep_Id() {
		return (EAttribute)gssTestProcConcurrentStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInput() {
		return gssTestProcInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInput_Name() {
		return (EAttribute)gssTestProcInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInput_IfRef() {
		return (EAttribute)gssTestProcInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInput_Delay_value() {
		return (EAttribute)gssTestProcInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInput_Delay_unit() {
		return (EAttribute)gssTestProcInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel3() {
		return gssTestProcInputLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level3() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_App_to_level3() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level2() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level3_to_level2() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level1() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level2_to_level1() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level0() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level1_to_level0() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel2() {
		return gssTestProcInputLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level2() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_App_to_level2() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level1() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level2_to_level1() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level0() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level1_to_level0() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel1() {
		return gssTestProcInputLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_Level1() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_App_to_level1() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_Level0() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_Level1_to_level0() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel0() {
		return gssTestProcInputLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel0_Level0() {
		return (EReference)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel0_App_to_level0() {
		return (EReference)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutput() {
		return gssTestProcOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutput_Name() {
		return (EAttribute)gssTestProcOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutput_Id() {
		return (EAttribute)gssTestProcOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutput_IfRef() {
		return (EAttribute)gssTestProcOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutput_Optional() {
		return (EAttribute)gssTestProcOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel3() {
		return gssTestProcOutputLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level3() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level3_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level2() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level3_from_level2() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level2_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level1() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level2_from_level1() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level1_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level0() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level1_from_level0() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level0_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel2() {
		return gssTestProcOutputLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level2() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level2_filter() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level1() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level2_from_level1() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level1_filter() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level0() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level1_from_level0() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level0_filter() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel1() {
		return gssTestProcOutputLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level1() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level1_filter() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level0() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level1_from_level0() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level0_filter() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel0() {
		return gssTestProcOutputLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel0_Level0() {
		return (EReference)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel0_Level0_filter() {
		return (EReference)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcFilter() {
		return gssTestProcFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcFilter_Apply_def_filter() {
		return (EAttribute)gssTestProcFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcFilter_Extra_filter() {
		return (EReference)gssTestProcFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcMode() {
		return gssTestProcModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcUnit() {
		return gssTestProcUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcCheckmode() {
		return gssTestProcCheckmodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcYesNo() {
		return gssTestProcYesNoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_procFactory gettest_procFactory() {
		return (test_procFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gssTestProcTestProcEClass = createEClass(GSS_TEST_PROC_TEST_PROC);
		createEReference(gssTestProcTestProcEClass, GSS_TEST_PROC_TEST_PROC__STEP);
		createEAttribute(gssTestProcTestProcEClass, GSS_TEST_PROC_TEST_PROC__SCENARIO);

		gssTestProcStepEClass = createEClass(GSS_TEST_PROC_STEP);
		createEAttribute(gssTestProcStepEClass, GSS_TEST_PROC_STEP__ID);
		createEAttribute(gssTestProcStepEClass, GSS_TEST_PROC_STEP__MODE);
		createEAttribute(gssTestProcStepEClass, GSS_TEST_PROC_STEP__REPLAYS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__PREV_STEP_IDREF);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__INPUTS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__OUTPUTS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__SPECIAL_PACKETS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__CONCURRENT_STEPS);

		gssTestProcInputsEClass = createEClass(GSS_TEST_PROC_INPUTS);
		createEReference(gssTestProcInputsEClass, GSS_TEST_PROC_INPUTS__INPUT);

		gssTestProcOutputsEClass = createEClass(GSS_TEST_PROC_OUTPUTS);
		createEAttribute(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__CHECKMODE);
		createEAttribute(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE);
		createEAttribute(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT);
		createEReference(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__OUTPUT);

		gssTestProcSpecialPacketsEClass = createEClass(GSS_TEST_PROC_SPECIAL_PACKETS);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE_PRINT);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE_PRINT);

		gssTestProcEnableDisableEClass = createEClass(GSS_TEST_PROC_ENABLE_DISABLE);
		createEAttribute(gssTestProcEnableDisableEClass, GSS_TEST_PROC_ENABLE_DISABLE__ID);

		gssTestProcConcurrentStepsEClass = createEClass(GSS_TEST_PROC_CONCURRENT_STEPS);
		createEReference(gssTestProcConcurrentStepsEClass, GSS_TEST_PROC_CONCURRENT_STEPS__NEXT_STEP);
		createEReference(gssTestProcConcurrentStepsEClass, GSS_TEST_PROC_CONCURRENT_STEPS__CONCURRENT_STEP);

		gssTestProcNextStepEClass = createEClass(GSS_TEST_PROC_NEXT_STEP);
		createEAttribute(gssTestProcNextStepEClass, GSS_TEST_PROC_NEXT_STEP__ID);
		createEAttribute(gssTestProcNextStepEClass, GSS_TEST_PROC_NEXT_STEP__IS_CONCURRENT);

		gssTestProcConcurrentStepEClass = createEClass(GSS_TEST_PROC_CONCURRENT_STEP);
		createEAttribute(gssTestProcConcurrentStepEClass, GSS_TEST_PROC_CONCURRENT_STEP__ID);

		gssTestProcInputEClass = createEClass(GSS_TEST_PROC_INPUT);
		createEAttribute(gssTestProcInputEClass, GSS_TEST_PROC_INPUT__NAME);
		createEAttribute(gssTestProcInputEClass, GSS_TEST_PROC_INPUT__IF_REF);
		createEAttribute(gssTestProcInputEClass, GSS_TEST_PROC_INPUT__DELAY_VALUE);
		createEAttribute(gssTestProcInputEClass, GSS_TEST_PROC_INPUT__DELAY_UNIT);

		gssTestProcInputLevel3EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL3);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0);

		gssTestProcInputLevel2EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL2);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__APP_TO_LEVEL2);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2_TO_LEVEL1);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL0);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1_TO_LEVEL0);

		gssTestProcInputLevel1EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL1);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0);

		gssTestProcInputLevel0EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL0);
		createEReference(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__LEVEL0);
		createEReference(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__APP_TO_LEVEL0);

		gssTestProcOutputEClass = createEClass(GSS_TEST_PROC_OUTPUT);
		createEAttribute(gssTestProcOutputEClass, GSS_TEST_PROC_OUTPUT__NAME);
		createEAttribute(gssTestProcOutputEClass, GSS_TEST_PROC_OUTPUT__ID);
		createEAttribute(gssTestProcOutputEClass, GSS_TEST_PROC_OUTPUT__IF_REF);
		createEAttribute(gssTestProcOutputEClass, GSS_TEST_PROC_OUTPUT__OPTIONAL);

		gssTestProcOutputLevel3EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL3);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FILTER);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FILTER);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FILTER);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0_FILTER);

		gssTestProcOutputLevel2EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL2);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER);

		gssTestProcOutputLevel1EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL1);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FILTER);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0_FILTER);

		gssTestProcOutputLevel0EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL0);
		createEReference(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0);
		createEReference(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER);

		gssTestProcFilterEClass = createEClass(GSS_TEST_PROC_FILTER);
		createEAttribute(gssTestProcFilterEClass, GSS_TEST_PROC_FILTER__APPLY_DEF_FILTER);
		createEReference(gssTestProcFilterEClass, GSS_TEST_PROC_FILTER__EXTRA_FILTER);

		// Create enums
		gssTestProcModeEEnum = createEEnum(GSS_TEST_PROC_MODE);
		gssTestProcUnitEEnum = createEEnum(GSS_TEST_PROC_UNIT);
		gssTestProcCheckmodeEEnum = createEEnum(GSS_TEST_PROC_CHECKMODE);
		gssTestProcYesNoEEnum = createEEnum(GSS_TEST_PROC_YES_NO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);
		exportPackage theexportPackage = (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);
		importPackage theimportPackage = (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);
		filterPackage thefilterPackage = (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssTestProcTestProcEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());
		gssTestProcStepEClass.getESuperTypes().add(thecommonPackage.getGSSModelObject());
		gssTestProcInputLevel3EClass.getESuperTypes().add(this.getGSSTestProcInput());
		gssTestProcInputLevel2EClass.getESuperTypes().add(this.getGSSTestProcInput());
		gssTestProcInputLevel1EClass.getESuperTypes().add(this.getGSSTestProcInput());
		gssTestProcInputLevel0EClass.getESuperTypes().add(this.getGSSTestProcInput());
		gssTestProcOutputLevel3EClass.getESuperTypes().add(this.getGSSTestProcOutput());
		gssTestProcOutputLevel2EClass.getESuperTypes().add(this.getGSSTestProcOutput());
		gssTestProcOutputLevel1EClass.getESuperTypes().add(this.getGSSTestProcOutput());
		gssTestProcOutputLevel0EClass.getESuperTypes().add(this.getGSSTestProcOutput());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssTestProcTestProcEClass, GSSTestProcTestProc.class, "GSSTestProcTestProc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcTestProc_Step(), this.getGSSTestProcStep(), null, "step", null, 1, 1900, GSSTestProcTestProc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcTestProc_Scenario(), ecorePackage.getEString(), "scenario", null, 0, 1, GSSTestProcTestProc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcStepEClass, GSSTestProcStep.class, "GSSTestProcStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcStep_Mode(), this.getGSSTestProcMode(), "mode", null, 1, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcStep_Replays(), ecorePackage.getEString(), "replays", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Prev_step_idref(), this.getGSSTestProcStep(), null, "prev_step_idref", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Output_idref_from_prev_step(), this.getGSSTestProcOutput(), null, "output_idref_from_prev_step", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Inputs(), this.getGSSTestProcInputs(), null, "inputs", null, 1, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Outputs(), this.getGSSTestProcOutputs(), null, "outputs", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_SpecialPackets(), this.getGSSTestProcSpecialPackets(), null, "specialPackets", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Concurrent_steps(), this.getGSSTestProcConcurrentSteps(), null, "concurrent_steps", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputsEClass, GSSTestProcInputs.class, "GSSTestProcInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcInputs_Input(), this.getGSSTestProcInput(), null, "input", null, 1, -1, GSSTestProcInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputsEClass, GSSTestProcOutputs.class, "GSSTestProcOutputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutputs_Checkmode(), this.getGSSTestProcCheckmode(), "checkmode", null, 1, 1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputs_Valid_time_interval_value(), ecorePackage.getEString(), "valid_time_interval_value", null, 1, 1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputs_Valid_time_interval_unit(), this.getGSSTestProcUnit(), "valid_time_interval_unit", null, 1, 1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputs_Output(), this.getGSSTestProcOutput(), null, "output", null, 1, -1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcSpecialPacketsEClass, GSSTestProcSpecialPackets.class, "GSSTestProcSpecialPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcSpecialPackets_Enable(), this.getGSSTestProcEnableDisable(), null, "enable", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcSpecialPackets_Disable(), this.getGSSTestProcEnableDisable(), null, "disable", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcSpecialPackets_Enable_print(), this.getGSSTestProcEnableDisable(), null, "enable_print", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcSpecialPackets_Disable_print(), this.getGSSTestProcEnableDisable(), null, "disable_print", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcEnableDisableEClass, GSSTestProcEnableDisable.class, "GSSTestProcEnableDisable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcEnableDisable_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcEnableDisable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcConcurrentStepsEClass, GSSTestProcConcurrentSteps.class, "GSSTestProcConcurrentSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcConcurrentSteps_NextStep(), this.getGSSTestProcNextStep(), null, "nextStep", null, 1, 1, GSSTestProcConcurrentSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcConcurrentSteps_Concurrent_step(), this.getGSSTestProcConcurrentStep(), null, "concurrent_step", null, 1, -1, GSSTestProcConcurrentSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcNextStepEClass, GSSTestProcNextStep.class, "GSSTestProcNextStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcNextStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcNextStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcNextStep_IsConcurrent(), this.getGSSTestProcYesNo(), "isConcurrent", null, 1, 1, GSSTestProcNextStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcConcurrentStepEClass, GSSTestProcConcurrentStep.class, "GSSTestProcConcurrentStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcConcurrentStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcConcurrentStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputEClass, GSSTestProcInput.class, "GSSTestProcInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcInput_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInput_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInput_Delay_value(), ecorePackage.getEString(), "delay_value", null, 1, 1, GSSTestProcInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInput_Delay_unit(), this.getGSSTestProcUnit(), "delay_unit", null, 1, 1, GSSTestProcInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel3EClass, GSSTestProcInputLevel3.class, "GSSTestProcInputLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcInputLevel3_Level3(), theformatPackage.getTMTCIFFormatFormat(), null, "level3", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_App_to_level3(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level3", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level3_to_level2(), theexportPackage.getTMTCIFExportExport(), null, "level3_to_level2", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level2_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "level2_to_level1", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel2EClass, GSSTestProcInputLevel2.class, "GSSTestProcInputLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcInputLevel2_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_App_to_level2(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level2", null, 0, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level2_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "level2_to_level1", null, 0, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel1EClass, GSSTestProcInputLevel1.class, "GSSTestProcInputLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcInputLevel1_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_App_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level1", null, 0, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel0EClass, GSSTestProcInputLevel0.class, "GSSTestProcInputLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcInputLevel0_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel0_App_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level0", null, 0, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputEClass, GSSTestProcOutput.class, "GSSTestProcOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutput_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutput_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutput_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutput_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, GSSTestProcOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel3EClass, GSSTestProcOutputLevel3.class, "GSSTestProcOutputLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcOutputLevel3_Level3(), theformatPackage.getTMTCIFFormatFormat(), null, "level3", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level3_filter(), this.getGSSTestProcFilter(), null, "level3_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level3_from_level2(), theimportPackage.getTMTCIFImportImport(), null, "level3_from_level2", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level2_filter(), this.getGSSTestProcFilter(), null, "level2_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level2_from_level1(), theimportPackage.getTMTCIFImportImport(), null, "level2_from_level1", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level1_filter(), this.getGSSTestProcFilter(), null, "level1_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level1_from_level0(), theimportPackage.getTMTCIFImportImport(), null, "level1_from_level0", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level0_filter(), this.getGSSTestProcFilter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel2EClass, GSSTestProcOutputLevel2.class, "GSSTestProcOutputLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcOutputLevel2_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level2_filter(), this.getGSSTestProcFilter(), null, "level2_filter", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level2_from_level1(), theimportPackage.getTMTCIFImportImport(), null, "level2_from_level1", null, 0, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level1_filter(), this.getGSSTestProcFilter(), null, "level1_filter", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level1_from_level0(), theimportPackage.getTMTCIFImportImport(), null, "level1_from_level0", null, 0, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level0_filter(), this.getGSSTestProcFilter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel1EClass, GSSTestProcOutputLevel1.class, "GSSTestProcOutputLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcOutputLevel1_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level1_filter(), this.getGSSTestProcFilter(), null, "level1_filter", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level1_from_level0(), theimportPackage.getTMTCIFImportImport(), null, "level1_from_level0", null, 0, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level0_filter(), this.getGSSTestProcFilter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel0EClass, GSSTestProcOutputLevel0.class, "GSSTestProcOutputLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcOutputLevel0_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel0_Level0_filter(), this.getGSSTestProcFilter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcFilterEClass, GSSTestProcFilter.class, "GSSTestProcFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcFilter_Apply_def_filter(), this.getGSSTestProcYesNo(), "apply_def_filter", null, 1, 1, GSSTestProcFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcFilter_Extra_filter(), thefilterPackage.getTMTCIFFilterFilter(), null, "extra_filter", null, 0, 1, GSSTestProcFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssTestProcModeEEnum, GSSTestProcMode.class, "GSSTestProcMode");
		addEEnumLiteral(gssTestProcModeEEnum, GSSTestProcMode.CONTINUOUS);
		addEEnumLiteral(gssTestProcModeEEnum, GSSTestProcMode.MANUAL);
		addEEnumLiteral(gssTestProcModeEEnum, GSSTestProcMode.CONCURRENT);

		initEEnum(gssTestProcUnitEEnum, GSSTestProcUnit.class, "GSSTestProcUnit");
		addEEnumLiteral(gssTestProcUnitEEnum, GSSTestProcUnit.MILISECONDS);
		addEEnumLiteral(gssTestProcUnitEEnum, GSSTestProcUnit.SECONDS);

		initEEnum(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.class, "GSSTestProcCheckmode");
		addEEnumLiteral(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.ALL);
		addEEnumLiteral(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.ALLUNSORTED);
		addEEnumLiteral(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.ANY);

		initEEnum(gssTestProcYesNoEEnum, GSSTestProcYesNo.class, "GSSTestProcYesNo");
		addEEnumLiteral(gssTestProcYesNoEEnum, GSSTestProcYesNo.YES);
		addEEnumLiteral(gssTestProcYesNoEEnum, GSSTestProcYesNo.NO);

		// Create resource
		createResource(eNS_URI);
	}

} //test_procPackageImpl
