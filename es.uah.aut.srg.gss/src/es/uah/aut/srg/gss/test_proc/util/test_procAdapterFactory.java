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
package es.uah.aut.srg.gss.test_proc.util;

import es.uah.aut.srg.gss.common.GSSModelElement;
import es.uah.aut.srg.gss.common.GSSModelObject;

import es.uah.aut.srg.gss.test_proc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage
 * @generated
 */
public class test_procAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static test_procPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_procAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = test_procPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected test_procSwitch<Adapter> modelSwitch =
		new test_procSwitch<Adapter>() {
			@Override
			public Adapter caseGSSTestProcTestProc(GSSTestProcTestProc object) {
				return createGSSTestProcTestProcAdapter();
			}
			@Override
			public Adapter caseGSSTestProcStep(GSSTestProcStep object) {
				return createGSSTestProcStepAdapter();
			}
			@Override
			public Adapter caseGSSTestProcAbstractInputs(GSSTestProcAbstractInputs object) {
				return createGSSTestProcAbstractInputsAdapter();
			}
			@Override
			public Adapter caseGSSTestProcAction(GSSTestProcAction object) {
				return createGSSTestProcActionAdapter();
			}
			@Override
			public Adapter caseGSSTestProcInputs(GSSTestProcInputs object) {
				return createGSSTestProcInputsAdapter();
			}
			@Override
			public Adapter caseGSSTestProcOutputs(GSSTestProcOutputs object) {
				return createGSSTestProcOutputsAdapter();
			}
			@Override
			public Adapter caseGSSTestProcSpecialPackets(GSSTestProcSpecialPackets object) {
				return createGSSTestProcSpecialPacketsAdapter();
			}
			@Override
			public Adapter caseGSSTestProcEnableDisable(GSSTestProcEnableDisable object) {
				return createGSSTestProcEnableDisableAdapter();
			}
			@Override
			public Adapter caseGSSTestProcConcurrentSteps(GSSTestProcConcurrentSteps object) {
				return createGSSTestProcConcurrentStepsAdapter();
			}
			@Override
			public Adapter caseGSSTestProcNextStep(GSSTestProcNextStep object) {
				return createGSSTestProcNextStepAdapter();
			}
			@Override
			public Adapter caseGSSTestProcConcurrentStep(GSSTestProcConcurrentStep object) {
				return createGSSTestProcConcurrentStepAdapter();
			}
			@Override
			public Adapter caseGSSTestProcInput(GSSTestProcInput object) {
				return createGSSTestProcInputAdapter();
			}
			@Override
			public Adapter caseGSSTestProcInputLevel3(GSSTestProcInputLevel3 object) {
				return createGSSTestProcInputLevel3Adapter();
			}
			@Override
			public Adapter caseGSSTestProcInputLevel2(GSSTestProcInputLevel2 object) {
				return createGSSTestProcInputLevel2Adapter();
			}
			@Override
			public Adapter caseGSSTestProcInputLevel1(GSSTestProcInputLevel1 object) {
				return createGSSTestProcInputLevel1Adapter();
			}
			@Override
			public Adapter caseGSSTestProcInputLevel0(GSSTestProcInputLevel0 object) {
				return createGSSTestProcInputLevel0Adapter();
			}
			@Override
			public Adapter caseGSSTestProcOutput(GSSTestProcOutput object) {
				return createGSSTestProcOutputAdapter();
			}
			@Override
			public Adapter caseGSSTestProcOutputLevel3(GSSTestProcOutputLevel3 object) {
				return createGSSTestProcOutputLevel3Adapter();
			}
			@Override
			public Adapter caseGSSTestProcOutputLevel2(GSSTestProcOutputLevel2 object) {
				return createGSSTestProcOutputLevel2Adapter();
			}
			@Override
			public Adapter caseGSSTestProcOutputLevel1(GSSTestProcOutputLevel1 object) {
				return createGSSTestProcOutputLevel1Adapter();
			}
			@Override
			public Adapter caseGSSTestProcOutputLevel0(GSSTestProcOutputLevel0 object) {
				return createGSSTestProcOutputLevel0Adapter();
			}
			@Override
			public Adapter caseGSSTestProcFilter(GSSTestProcFilter object) {
				return createGSSTestProcFilterAdapter();
			}
			@Override
			public Adapter caseGSSModelElement(GSSModelElement object) {
				return createGSSModelElementAdapter();
			}
			@Override
			public Adapter caseGSSModelObject(GSSModelObject object) {
				return createGSSModelObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc <em>GSS Test Proc Test Proc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc
	 * @generated
	 */
	public Adapter createGSSTestProcTestProcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep <em>GSS Test Proc Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep
	 * @generated
	 */
	public Adapter createGSSTestProcStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAbstractInputs <em>GSS Test Proc Abstract Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcAbstractInputs
	 * @generated
	 */
	public Adapter createGSSTestProcAbstractInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction <em>GSS Test Proc Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcAction
	 * @generated
	 */
	public Adapter createGSSTestProcActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputs <em>GSS Test Proc Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputs
	 * @generated
	 */
	public Adapter createGSSTestProcInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs <em>GSS Test Proc Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs
	 * @generated
	 */
	public Adapter createGSSTestProcOutputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets <em>GSS Test Proc Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets
	 * @generated
	 */
	public Adapter createGSSTestProcSpecialPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable <em>GSS Test Proc Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable
	 * @generated
	 */
	public Adapter createGSSTestProcEnableDisableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps <em>GSS Test Proc Concurrent Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps
	 * @generated
	 */
	public Adapter createGSSTestProcConcurrentStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep <em>GSS Test Proc Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep
	 * @generated
	 */
	public Adapter createGSSTestProcNextStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep <em>GSS Test Proc Concurrent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep
	 * @generated
	 */
	public Adapter createGSSTestProcConcurrentStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInput <em>GSS Test Proc Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInput
	 * @generated
	 */
	public Adapter createGSSTestProcInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3 <em>GSS Test Proc Input Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3
	 * @generated
	 */
	public Adapter createGSSTestProcInputLevel3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2 <em>GSS Test Proc Input Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2
	 * @generated
	 */
	public Adapter createGSSTestProcInputLevel2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1 <em>GSS Test Proc Input Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1
	 * @generated
	 */
	public Adapter createGSSTestProcInputLevel1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0 <em>GSS Test Proc Input Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0
	 * @generated
	 */
	public Adapter createGSSTestProcInputLevel0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput <em>GSS Test Proc Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutput
	 * @generated
	 */
	public Adapter createGSSTestProcOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3 <em>GSS Test Proc Output Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3
	 * @generated
	 */
	public Adapter createGSSTestProcOutputLevel3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2 <em>GSS Test Proc Output Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2
	 * @generated
	 */
	public Adapter createGSSTestProcOutputLevel2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1 <em>GSS Test Proc Output Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1
	 * @generated
	 */
	public Adapter createGSSTestProcOutputLevel1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0 <em>GSS Test Proc Output Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0
	 * @generated
	 */
	public Adapter createGSSTestProcOutputLevel0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcFilter <em>GSS Test Proc Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcFilter
	 * @generated
	 */
	public Adapter createGSSTestProcFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.common.GSSModelElement <em>GSS Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement
	 * @generated
	 */
	public Adapter createGSSModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.common.GSSModelObject <em>GSS Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.common.GSSModelObject
	 * @generated
	 */
	public Adapter createGSSModelObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //test_procAdapterFactory
