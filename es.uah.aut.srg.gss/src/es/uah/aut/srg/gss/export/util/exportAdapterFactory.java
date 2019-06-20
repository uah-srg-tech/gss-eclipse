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
package es.uah.aut.srg.gss.export.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.export.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.export.exportPackage
 * @generated
 */
public class exportAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static exportPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = exportPackage.eINSTANCE;
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
	protected exportSwitch<Adapter> modelSwitch =
		new exportSwitch<Adapter>() {
			@Override
			public Adapter caseGSSExportExport(GSSExportExport object) {
				return createGSSExportExportAdapter();
			}
			@Override
			public Adapter caseGSSExportSizes(GSSExportSizes object) {
				return createGSSExportSizesAdapter();
			}
			@Override
			public Adapter caseGSSExportSize(GSSExportSize object) {
				return createGSSExportSizeAdapter();
			}
			@Override
			public Adapter caseGSSExportSizeFromFileLength(GSSExportSizeFromFileLength object) {
				return createGSSExportSizeFromFileLengthAdapter();
			}
			@Override
			public Adapter caseGSSExportSizeFromFileLine(GSSExportSizeFromFileLine object) {
				return createGSSExportSizeFromFileLineAdapter();
			}
			@Override
			public Adapter caseGSSExportSizeInBits(GSSExportSizeInBits object) {
				return createGSSExportSizeInBitsAdapter();
			}
			@Override
			public Adapter caseGSSExportSettings(GSSExportSettings object) {
				return createGSSExportSettingsAdapter();
			}
			@Override
			public Adapter caseGSSExportSetting(GSSExportSetting object) {
				return createGSSExportSettingAdapter();
			}
			@Override
			public Adapter caseGSSExportSettingFromConst(GSSExportSettingFromConst object) {
				return createGSSExportSettingFromConstAdapter();
			}
			@Override
			public Adapter caseGSSExportSettingFromSize(GSSExportSettingFromSize object) {
				return createGSSExportSettingFromSizeAdapter();
			}
			@Override
			public Adapter caseGSSExportSettingFromFile(GSSExportSettingFromFile object) {
				return createGSSExportSettingFromFileAdapter();
			}
			@Override
			public Adapter caseGSSExportSettingFromField(GSSExportSettingFromField object) {
				return createGSSExportSettingFromFieldAdapter();
			}
			@Override
			public Adapter caseGSSExportSettingAIFromConst(GSSExportSettingAIFromConst object) {
				return createGSSExportSettingAIFromConstAdapter();
			}
			@Override
			public Adapter caseGSSExportSettingAIFromFile(GSSExportSettingAIFromFile object) {
				return createGSSExportSettingAIFromFileAdapter();
			}
			@Override
			public Adapter caseGSSExportActivateDICs(GSSExportActivateDICs object) {
				return createGSSExportActivateDICsAdapter();
			}
			@Override
			public Adapter caseGSSExportDIC(GSSExportDIC object) {
				return createGSSExportDICAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportExport <em>GSS Export Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport
	 * @generated
	 */
	public Adapter createGSSExportExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSizes <em>GSS Export Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizes
	 * @generated
	 */
	public Adapter createGSSExportSizesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSize <em>GSS Export Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSize
	 * @generated
	 */
	public Adapter createGSSExportSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength <em>GSS Export Size From File Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength
	 * @generated
	 */
	public Adapter createGSSExportSizeFromFileLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine <em>GSS Export Size From File Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine
	 * @generated
	 */
	public Adapter createGSSExportSizeFromFileLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits <em>GSS Export Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeInBits
	 * @generated
	 */
	public Adapter createGSSExportSizeInBitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettings <em>GSS Export Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings
	 * @generated
	 */
	public Adapter createGSSExportSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSetting <em>GSS Export Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSetting
	 * @generated
	 */
	public Adapter createGSSExportSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromConst <em>GSS Export Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromConst
	 * @generated
	 */
	public Adapter createGSSExportSettingFromConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromSize <em>GSS Export Setting From Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromSize
	 * @generated
	 */
	public Adapter createGSSExportSettingFromSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile <em>GSS Export Setting From File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile
	 * @generated
	 */
	public Adapter createGSSExportSettingFromFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromField <em>GSS Export Setting From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromField
	 * @generated
	 */
	public Adapter createGSSExportSettingFromFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst <em>GSS Export Setting AI From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst
	 * @generated
	 */
	public Adapter createGSSExportSettingAIFromConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile <em>GSS Export Setting AI From File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile
	 * @generated
	 */
	public Adapter createGSSExportSettingAIFromFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportActivateDICs <em>GSS Export Activate DI Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportActivateDICs
	 * @generated
	 */
	public Adapter createGSSExportActivateDICsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.export.GSSExportDIC <em>GSS Export DIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.export.GSSExportDIC
	 * @generated
	 */
	public Adapter createGSSExportDICAdapter() {
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

} //exportAdapterFactory
