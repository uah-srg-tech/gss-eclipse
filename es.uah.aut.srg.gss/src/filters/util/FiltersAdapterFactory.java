/**
 */
package filters.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import filters.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see filters.FiltersPackage
 * @generated
 */
public class FiltersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiltersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FiltersPackage.eINSTANCE;
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
	protected FiltersSwitch<Adapter> modelSwitch =
		new FiltersSwitch<Adapter>() {
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
			public Adapter caseGSSFilterFieldRef(GSSFilterFieldRef object) {
				return createGSSFilterFieldRefAdapter();
			}
			@Override
			public Adapter caseGSSFilterFieldOp(GSSFilterFieldOp object) {
				return createGSSFilterFieldOpAdapter();
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
			public Adapter caseGSSFilterAIFieldRef(GSSFilterAIFieldRef object) {
				return createGSSFilterAIFieldRefAdapter();
			}
			@Override
			public Adapter caseGSSFilterBoolVarFromGroupedArrayItem(GSSFilterBoolVarFromGroupedArrayItem object) {
				return createGSSFilterBoolVarFromGroupedArrayItemAdapter();
			}
			@Override
			public Adapter caseGSSFilterAIFieldRefs(GSSFilterAIFieldRefs object) {
				return createGSSFilterAIFieldRefsAdapter();
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
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterFilter <em>GSS Filter Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterFilter
	 * @generated
	 */
	public Adapter createGSSFilterFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterMaxtermFilter <em>GSS Filter Maxterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterMaxtermFilter
	 * @generated
	 */
	public Adapter createGSSFilterMaxtermFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterMintermFilter <em>GSS Filter Minterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterMintermFilter
	 * @generated
	 */
	public Adapter createGSSFilterMintermFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterBoolVar <em>GSS Filter Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterBoolVar
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterFieldRef <em>GSS Filter Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterFieldRef
	 * @generated
	 */
	public Adapter createGSSFilterFieldRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterFieldOp <em>GSS Filter Field Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterFieldOp
	 * @generated
	 */
	public Adapter createGSSFilterFieldOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterConstant <em>GSS Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterConstant
	 * @generated
	 */
	public Adapter createGSSFilterConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterSelect <em>GSS Filter Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterSelect
	 * @generated
	 */
	public Adapter createGSSFilterSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterSelectLine <em>GSS Filter Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterSelectLine
	 * @generated
	 */
	public Adapter createGSSFilterSelectLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterBoolVarFromArrayItem <em>GSS Filter Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterBoolVarFromArrayItem
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarFromArrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterAIFieldRef <em>GSS Filter AI Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterAIFieldRef
	 * @generated
	 */
	public Adapter createGSSFilterAIFieldRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterBoolVarFromGroupedArrayItem <em>GSS Filter Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarFromGroupedArrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterAIFieldRefs <em>GSS Filter AI Field Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterAIFieldRefs
	 * @generated
	 */
	public Adapter createGSSFilterAIFieldRefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterBoolVarFDIC <em>GSS Filter Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterBoolVarFDIC
	 * @generated
	 */
	public Adapter createGSSFilterBoolVarFDICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterMaxterm <em>GSS Filter Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterMaxterm
	 * @generated
	 */
	public Adapter createGSSFilterMaxtermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterMinterm <em>GSS Filter Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterMinterm
	 * @generated
	 */
	public Adapter createGSSFilterMintermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link filters.GSSFilterBoolVarRef <em>GSS Filter Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see filters.GSSFilterBoolVarRef
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

} //FiltersAdapterFactory
