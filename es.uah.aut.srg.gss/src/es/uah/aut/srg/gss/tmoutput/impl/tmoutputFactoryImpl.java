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
package es.uah.aut.srg.gss.tmoutput.impl;

import es.uah.aut.srg.gss.tmoutput.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tmoutputFactoryImpl extends EFactoryImpl implements tmoutputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tmoutputFactory init() {
		try {
			tmoutputFactory thetmoutputFactory = (tmoutputFactory)EPackage.Registry.INSTANCE.getEFactory(tmoutputPackage.eNS_URI);
			if (thetmoutputFactory != null) {
				return thetmoutputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tmoutputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmoutputFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case tmoutputPackage.GSSTM_OUTPUT: return createGSSTMOutput();
			case tmoutputPackage.GSSTM_OUTPUT_PI1: return createGSSTMOutputPi1();
			case tmoutputPackage.GSSTM_OUTPUT_FIELD: return createGSSTMOutputField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMOutput createGSSTMOutput() {
		GSSTMOutputImpl gsstmOutput = new GSSTMOutputImpl();
		return gsstmOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMOutputPi1 createGSSTMOutputPi1() {
		GSSTMOutputPi1Impl gsstmOutputPi1 = new GSSTMOutputPi1Impl();
		return gsstmOutputPi1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMOutputField createGSSTMOutputField() {
		GSSTMOutputFieldImpl gsstmOutputField = new GSSTMOutputFieldImpl();
		return gsstmOutputField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmoutputPackage gettmoutputPackage() {
		return (tmoutputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tmoutputPackage getPackage() {
		return tmoutputPackage.eINSTANCE;
	}

} //tmoutputFactoryImpl
