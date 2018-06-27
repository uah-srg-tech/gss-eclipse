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
package es.uah.aut.srg.gss.tm_tc_format.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.tm_tc_format.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage
 * @generated
 */
public class tm_tc_formatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tm_tc_formatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tm_tc_formatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = tm_tc_formatPackage.eINSTANCE;
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
	protected tm_tc_formatSwitch<Adapter> modelSwitch =
		new tm_tc_formatSwitch<Adapter>() {
			@Override
			public Adapter caseGSSTmTcFormatTmTCFormat(GSSTmTcFormatTmTCFormat object) {
				return createGSSTmTcFormatTmTCFormatAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatCSField(GSSTmTcFormatCSField object) {
				return createGSSTmTcFormatCSFieldAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatCSFormulaField(GSSTmTcFormatCSFormulaField object) {
				return createGSSTmTcFormatCSFormulaFieldAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatVSField(GSSTmTcFormatVSField object) {
				return createGSSTmTcFormatVSFieldAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatVRFieldSize(GSSTmTcFormatVRFieldSize object) {
				return createGSSTmTcFormatVRFieldSizeAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatFDICField(GSSTmTcFormatFDICField object) {
				return createGSSTmTcFormatFDICFieldAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatAField(GSSTmTcFormatAField object) {
				return createGSSTmTcFormatAFieldAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatAIField(GSSTmTcFormatAIField object) {
				return createGSSTmTcFormatAIFieldAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatSize(GSSTmTcFormatSize object) {
				return createGSSTmTcFormatSizeAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatGlobalOffset(GSSTmTcFormatGlobalOffset object) {
				return createGSSTmTcFormatGlobalOffsetAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatFormula(GSSTmTcFormatFormula object) {
				return createGSSTmTcFormatFormulaAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatConstSize(GSSTmTcFormatConstSize object) {
				return createGSSTmTcFormatConstSizeAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatVariableSize(GSSTmTcFormatVariableSize object) {
				return createGSSTmTcFormatVariableSizeAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatMaxSize(GSSTmTcFormatMaxSize object) {
				return createGSSTmTcFormatMaxSizeAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatFloatingOffset(GSSTmTcFormatFloatingOffset object) {
				return createGSSTmTcFormatFloatingOffsetAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatSortedFieldsToCheck(GSSTmTcFormatSortedFieldsToCheck object) {
				return createGSSTmTcFormatSortedFieldsToCheckAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatFieldToCheck(GSSTmTcFormatFieldToCheck object) {
				return createGSSTmTcFormatFieldToCheckAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatArrayDimension(GSSTmTcFormatArrayDimension object) {
				return createGSSTmTcFormatArrayDimensionAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatArrayRef(GSSTmTcFormatArrayRef object) {
				return createGSSTmTcFormatArrayRefAdapter();
			}
			@Override
			public Adapter caseGSSTmTcFormatLocalOffset(GSSTmTcFormatLocalOffset object) {
				return createGSSTmTcFormatLocalOffsetAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat <em>GSS Tm Tc Format Tm TC Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat
	 * @generated
	 */
	public Adapter createGSSTmTcFormatTmTCFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField <em>GSS Tm Tc Format CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField
	 * @generated
	 */
	public Adapter createGSSTmTcFormatCSFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize <em>GSS Tm Tc Format Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize
	 * @generated
	 */
	public Adapter createGSSTmTcFormatSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset <em>GSS Tm Tc Format Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset
	 * @generated
	 */
	public Adapter createGSSTmTcFormatGlobalOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField <em>GSS Tm Tc Format CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField
	 * @generated
	 */
	public Adapter createGSSTmTcFormatCSFormulaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula <em>GSS Tm Tc Format Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula
	 * @generated
	 */
	public Adapter createGSSTmTcFormatFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField <em>GSS Tm Tc Format VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField
	 * @generated
	 */
	public Adapter createGSSTmTcFormatVSFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize <em>GSS Tm Tc Format Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize
	 * @generated
	 */
	public Adapter createGSSTmTcFormatConstSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize <em>GSS Tm Tc Format Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize
	 * @generated
	 */
	public Adapter createGSSTmTcFormatVariableSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize <em>GSS Tm Tc Format Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize
	 * @generated
	 */
	public Adapter createGSSTmTcFormatMaxSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize <em>GSS Tm Tc Format VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize
	 * @generated
	 */
	public Adapter createGSSTmTcFormatVRFieldSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField <em>GSS Tm Tc Format FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField
	 * @generated
	 */
	public Adapter createGSSTmTcFormatFDICFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset <em>GSS Tm Tc Format Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset
	 * @generated
	 */
	public Adapter createGSSTmTcFormatFloatingOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck <em>GSS Tm Tc Format Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck
	 * @generated
	 */
	public Adapter createGSSTmTcFormatSortedFieldsToCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck <em>GSS Tm Tc Format Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck
	 * @generated
	 */
	public Adapter createGSSTmTcFormatFieldToCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField <em>GSS Tm Tc Format AField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField
	 * @generated
	 */
	public Adapter createGSSTmTcFormatAFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension <em>GSS Tm Tc Format Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension
	 * @generated
	 */
	public Adapter createGSSTmTcFormatArrayDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField <em>GSS Tm Tc Format AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField
	 * @generated
	 */
	public Adapter createGSSTmTcFormatAIFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef <em>GSS Tm Tc Format Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef
	 * @generated
	 */
	public Adapter createGSSTmTcFormatArrayRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset <em>GSS Tm Tc Format Local Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset
	 * @generated
	 */
	public Adapter createGSSTmTcFormatLocalOffsetAdapter() {
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

} //tm_tc_formatAdapterFactory
