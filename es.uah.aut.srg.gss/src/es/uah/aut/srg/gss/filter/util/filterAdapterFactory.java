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
package es.uah.aut.srg.gss.filter.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.filter.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.filter.filterPackage
 * @generated
 */
public class filterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static filterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = filterPackage.eINSTANCE;
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
	protected filterSwitch<Adapter> modelSwitch =
		new filterSwitch<Adapter>() {
			@Override
			public Adapter caseGSSFilterFilter(GSSFilterFilter object) {
				return createGSSFilterFilterAdapter();
			}
			@Override
			public Adapter caseGSSFilterMaxtermFilter(GSSFilterMaxtermFilter object) {
				return createGSSFilterMaxtermFilterAdapter();
			}
			@Override
			public Adapter caseGSSFilterMintermFilter(GSSFilterMintermFilter object) {
				return createGSSFilterMintermFilterAdapter();
			}
			@Override
			public Adapter caseGSSFilterBoolVar(GSSFilterBoolVar object) {
				return createGSSFilterBoolVarAdapter();
			}
			@Override
			public Adapter caseGSSFilterFieldOp(GSSFilterFieldOp object) {
				return createGSSFilterFieldOpAdapter();
			}
			@Override
			public Adapter caseGSSFilterValue(GSSFilterValue object) {
				return createGSSFilterValueAdapter();
			}
			@Override
			public Adapter caseGSSFilterConstant(GSSFilterConstant object) {
				return createGSSFilterConstantAdapter();
			}
			@Override
			public Adapter caseGSSFilterSelect(GSSFilterSelect object) {
				return createGSSFilterSelectAdapter();
			}
			@Override
			public Adapter caseGSSFilterSelectLine(GSSFilterSelectLine object) {
				return createGSSFilterSelectLineAdapter();
			}
			@Override
			public Adapter caseGSSFilterBoolVarFromArrayItem(GSSFilterBoolVarFromArrayItem object) {
				return createGSSFilterBoolVarFromArrayItemAdapter();
			}
			@Override
			public Adapter caseGSSFilterBoolVarFromGroupedArrayItem(GSSFilterBoolVarFromGroupedArrayItem object) {
				return createGSSFilterBoolVarFromGroupedArrayItemAdapter();
			}
			@Override
			public Adapter caseGSSFilterBoolVarFDIC(GSSFilterBoolVarFDIC object) {
				return createGSSFilterBoolVarFDICAdapter();
			}
			@Override
			public Adapter caseGSSFilterMaxterm(GSSFilterMaxterm object) {
				return createGSSFilterMaxtermAdapter();
			}
			@Override
			public Adapter caseGSSFilterMinterm(GSSFilterMinterm object) {
				return createGSSFilterMintermAdapter();
			}
			@Override
			public Adapter caseGSSFilterBoolVarRef(GSSFilterBoolVarRef object) {
				return createGSSFilterBoolVarRefAdapter();
			}
			@Override
			public Adapter caseGSSModelElement(GSSModelElement object) {
				return createGSSModelElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter <em>GSS Filter Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter
	 * @generated
	 */
	public Adapter createGSSFilterFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter <em>GSS Filter Maxterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter
	 * @generated
	 */
	public Adapter createGSSFilterMaxtermFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterMintermFilter <em>GSS Filter Minterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMintermFilter
	 * @generated
	 */
	public Adapter createGSSFilterMintermFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar <em>GSS Filter Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterFieldOp <em>GSS Filter Field Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFieldOp
	 * @generated
	 */
	public Adapter createGSSFilterFieldOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterValue <em>GSS Filter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterValue
	 * @generated
	 */
	public Adapter createGSSFilterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterConstant <em>GSS Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstant
	 * @generated
	 */
	public Adapter createGSSFilterConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect <em>GSS Filter Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect
	 * @generated
	 */
	public Adapter createGSSFilterSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine <em>GSS Filter Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine
	 * @generated
	 */
	public Adapter createGSSFilterSelectLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem <em>GSS Filter Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarFromArrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem <em>GSS Filter Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarFromGroupedArrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC <em>GSS Filter Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarFDICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxterm <em>GSS Filter Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxterm
	 * @generated
	 */
	public Adapter createGSSFilterMaxtermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterMinterm <em>GSS Filter Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMinterm
	 * @generated
	 */
	public Adapter createGSSFilterMintermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef <em>GSS Filter Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarRefAdapter() {
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

} //filterAdapterFactory
