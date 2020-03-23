/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tcheader.impl;

import es.uah.aut.srg.gss.tcheader.*;

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
public class tcheaderFactoryImpl extends EFactoryImpl implements tcheaderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tcheaderFactory init() {
		try {
			tcheaderFactory thetcheaderFactory = (tcheaderFactory)EPackage.Registry.INSTANCE.getEFactory(tcheaderPackage.eNS_URI);
			if (thetcheaderFactory != null) {
				return thetcheaderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tcheaderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderFactoryImpl() {
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
			case tcheaderPackage.GSSTC_HEADER: return createGSSTCHeader();
			case tcheaderPackage.GSSTC_HEADER_FIELD: return createGSSTCHeaderField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTCHeader createGSSTCHeader() {
		GSSTCHeaderImpl gsstcHeader = new GSSTCHeaderImpl();
		return gsstcHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTCHeaderField createGSSTCHeaderField() {
		GSSTCHeaderFieldImpl gsstcHeaderField = new GSSTCHeaderFieldImpl();
		return gsstcHeaderField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderPackage gettcheaderPackage() {
		return (tcheaderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tcheaderPackage getPackage() {
		return tcheaderPackage.eINSTANCE;
	}

} //tcheaderFactoryImpl
