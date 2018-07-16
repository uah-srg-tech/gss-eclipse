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
package es.uah.aut.srg.gss.iface.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.iface.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.iface.ifacePackage
 * @generated
 */
public class ifaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ifacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ifacePackage.eINSTANCE;
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
	protected ifaceSwitch<Adapter> modelSwitch =
		new ifaceSwitch<Adapter>() {
			@Override
			public Adapter caseGSSIfacePortConfig(GSSIfacePortConfig object) {
				return createGSSIfacePortConfigAdapter();
			}
			@Override
			public Adapter caseGSSIfacePort(GSSIfacePort object) {
				return createGSSIfacePortAdapter();
			}
			@Override
			public Adapter caseGSSIfaceSpWPort(GSSIfaceSpWPort object) {
				return createGSSIfaceSpWPortAdapter();
			}
			@Override
			public Adapter caseGSSIfaceReadingPort(GSSIfaceReadingPort object) {
				return createGSSIfaceReadingPortAdapter();
			}
			@Override
			public Adapter caseGSSIfaceUartPort(GSSIfaceUartPort object) {
				return createGSSIfaceUartPortAdapter();
			}
			@Override
			public Adapter caseGSSIfaceUartProtocol(GSSIfaceUartProtocol object) {
				return createGSSIfaceUartProtocolAdapter();
			}
			@Override
			public Adapter caseGSSIfaceConstSize(GSSIfaceConstSize object) {
				return createGSSIfaceConstSizeAdapter();
			}
			@Override
			public Adapter caseGSSIfaceSizeFieldOffset(GSSIfaceSizeFieldOffset object) {
				return createGSSIfaceSizeFieldOffsetAdapter();
			}
			@Override
			public Adapter caseGSSIfaceSizeFieldTrim(GSSIfaceSizeFieldTrim object) {
				return createGSSIfaceSizeFieldTrimAdapter();
			}
			@Override
			public Adapter caseGSSIfaceSyncPattern(GSSIfaceSyncPattern object) {
				return createGSSIfaceSyncPatternAdapter();
			}
			@Override
			public Adapter caseGSSIfaceSpWTCPort(GSSIfaceSpWTCPort object) {
				return createGSSIfaceSpWTCPortAdapter();
			}
			@Override
			public Adapter caseGSSIfaceDummyPort(GSSIfaceDummyPort object) {
				return createGSSIfaceDummyPortAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfacePortConfig <em>GSS Iface Port Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortConfig
	 * @generated
	 */
	public Adapter createGSSIfacePortConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfacePort <em>GSS Iface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePort
	 * @generated
	 */
	public Adapter createGSSIfacePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort <em>GSS Iface Sp WPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPort
	 * @generated
	 */
	public Adapter createGSSIfaceSpWPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort <em>GSS Iface Uart Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort
	 * @generated
	 */
	public Adapter createGSSIfaceUartPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort <em>GSS Iface Sp WTC Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort
	 * @generated
	 */
	public Adapter createGSSIfaceSpWTCPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceDummyPort <em>GSS Iface Dummy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceDummyPort
	 * @generated
	 */
	public Adapter createGSSIfaceDummyPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceReadingPort <em>GSS Iface Reading Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceReadingPort
	 * @generated
	 */
	public Adapter createGSSIfaceReadingPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol <em>GSS Iface Uart Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol
	 * @generated
	 */
	public Adapter createGSSIfaceUartProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceConstSize <em>GSS Iface Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceConstSize
	 * @generated
	 */
	public Adapter createGSSIfaceConstSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldOffset <em>GSS Iface Size Field Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldOffset
	 * @generated
	 */
	public Adapter createGSSIfaceSizeFieldOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim <em>GSS Iface Size Field Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim
	 * @generated
	 */
	public Adapter createGSSIfaceSizeFieldTrimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern <em>GSS Iface Sync Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern
	 * @generated
	 */
	public Adapter createGSSIfaceSyncPatternAdapter() {
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

} //ifaceAdapterFactory
