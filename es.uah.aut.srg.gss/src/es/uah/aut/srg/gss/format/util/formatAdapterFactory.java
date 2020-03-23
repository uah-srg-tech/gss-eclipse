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
package es.uah.aut.srg.gss.format.util;

import es.uah.aut.srg.gss.common.GSSModelElement;
import es.uah.aut.srg.gss.common.GSSModelObject;

import es.uah.aut.srg.gss.format.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.format.formatPackage
 * @generated
 */
public class formatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static formatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = formatPackage.eINSTANCE;
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
	protected formatSwitch<Adapter> modelSwitch =
		new formatSwitch<Adapter>() {
			@Override
			public Adapter caseGSSFormatFormat(GSSFormatFormat object) {
				return createGSSFormatFormatAdapter();
			}
			@Override
			public Adapter caseGSSFormatField(GSSFormatField object) {
				return createGSSFormatFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatCSField(GSSFormatCSField object) {
				return createGSSFormatCSFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatCSFormulaField(GSSFormatCSFormulaField object) {
				return createGSSFormatCSFormulaFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatVSField(GSSFormatVSField object) {
				return createGSSFormatVSFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatVRFieldSize(GSSFormatVRFieldSize object) {
				return createGSSFormatVRFieldSizeAdapter();
			}
			@Override
			public Adapter caseGSSFormatFDICField(GSSFormatFDICField object) {
				return createGSSFormatFDICFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatAField(GSSFormatAField object) {
				return createGSSFormatAFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatAIField(GSSFormatAIField object) {
				return createGSSFormatAIFieldAdapter();
			}
			@Override
			public Adapter caseGSSFormatBytesBits(GSSFormatBytesBits object) {
				return createGSSFormatBytesBitsAdapter();
			}
			@Override
			public Adapter caseGSSFormatFormula(GSSFormatFormula object) {
				return createGSSFormatFormulaAdapter();
			}
			@Override
			public Adapter caseGSSFormatVariableSize(GSSFormatVariableSize object) {
				return createGSSFormatVariableSizeAdapter();
			}
			@Override
			public Adapter caseGSSFormatFloatingOffset(GSSFormatFloatingOffset object) {
				return createGSSFormatFloatingOffsetAdapter();
			}
			@Override
			public Adapter caseGSSFormatSortedFieldsToCheck(GSSFormatSortedFieldsToCheck object) {
				return createGSSFormatSortedFieldsToCheckAdapter();
			}
			@Override
			public Adapter caseGSSFormatFieldToCheck(GSSFormatFieldToCheck object) {
				return createGSSFormatFieldToCheckAdapter();
			}
			@Override
			public Adapter caseGSSFormatArrayDimension(GSSFormatArrayDimension object) {
				return createGSSFormatArrayDimensionAdapter();
			}
			@Override
			public Adapter caseGSSFormatArrayRef(GSSFormatArrayRef object) {
				return createGSSFormatArrayRefAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatFormat <em>GSS Format Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormat
	 * @generated
	 */
	public Adapter createGSSFormatFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatField <em>GSS Format Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatField
	 * @generated
	 */
	public Adapter createGSSFormatFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatCSField <em>GSS Format CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField
	 * @generated
	 */
	public Adapter createGSSFormatCSFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatCSFormulaField <em>GSS Format CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSFormulaField
	 * @generated
	 */
	public Adapter createGSSFormatCSFormulaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatVSField <em>GSS Format VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField
	 * @generated
	 */
	public Adapter createGSSFormatVSFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatVRFieldSize <em>GSS Format VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVRFieldSize
	 * @generated
	 */
	public Adapter createGSSFormatVRFieldSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField <em>GSS Format FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField
	 * @generated
	 */
	public Adapter createGSSFormatFDICFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatAField <em>GSS Format AField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField
	 * @generated
	 */
	public Adapter createGSSFormatAFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatAIField <em>GSS Format AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField
	 * @generated
	 */
	public Adapter createGSSFormatAIFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatBytesBits <em>GSS Format Bytes Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatBytesBits
	 * @generated
	 */
	public Adapter createGSSFormatBytesBitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatFormula <em>GSS Format Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormula
	 * @generated
	 */
	public Adapter createGSSFormatFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatVariableSize <em>GSS Format Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVariableSize
	 * @generated
	 */
	public Adapter createGSSFormatVariableSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatFloatingOffset <em>GSS Format Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFloatingOffset
	 * @generated
	 */
	public Adapter createGSSFormatFloatingOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck <em>GSS Format Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck
	 * @generated
	 */
	public Adapter createGSSFormatSortedFieldsToCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatFieldToCheck <em>GSS Format Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldToCheck
	 * @generated
	 */
	public Adapter createGSSFormatFieldToCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatArrayDimension <em>GSS Format Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayDimension
	 * @generated
	 */
	public Adapter createGSSFormatArrayDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.format.GSSFormatArrayRef <em>GSS Format Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayRef
	 * @generated
	 */
	public Adapter createGSSFormatArrayRefAdapter() {
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

} //formatAdapterFactory
