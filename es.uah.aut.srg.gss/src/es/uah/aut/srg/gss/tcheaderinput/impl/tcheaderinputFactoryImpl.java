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
package es.uah.aut.srg.gss.tcheaderinput.impl;

import es.uah.aut.srg.gss.tcheaderinput.*;

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
public class tcheaderinputFactoryImpl extends EFactoryImpl implements tcheaderinputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tcheaderinputFactory init() {
		try {
			tcheaderinputFactory thetcheaderinputFactory = (tcheaderinputFactory)EPackage.Registry.INSTANCE.getEFactory(tcheaderinputPackage.eNS_URI);
			if (thetcheaderinputFactory != null) {
				return thetcheaderinputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tcheaderinputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderinputFactoryImpl() {
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT: return createGSSTCHeaderInput();
			case tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD: return createGSSTCHeaderInputField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTCHeaderInput createGSSTCHeaderInput() {
		GSSTCHeaderInputImpl gsstcHeaderInput = new GSSTCHeaderInputImpl();
		return gsstcHeaderInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTCHeaderInputField createGSSTCHeaderInputField() {
		GSSTCHeaderInputFieldImpl gsstcHeaderInputField = new GSSTCHeaderInputFieldImpl();
		return gsstcHeaderInputField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderinputPackage gettcheaderinputPackage() {
		return (tcheaderinputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tcheaderinputPackage getPackage() {
		return tcheaderinputPackage.eINSTANCE;
	}

} //tcheaderinputFactoryImpl
