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
package es.uah.aut.srg.gss.tmheader.impl;

import es.uah.aut.srg.gss.tmheader.*;

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
public class tmheaderFactoryImpl extends EFactoryImpl implements tmheaderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tmheaderFactory init() {
		try {
			tmheaderFactory thetmheaderFactory = (tmheaderFactory)EPackage.Registry.INSTANCE.getEFactory(tmheaderPackage.eNS_URI);
			if (thetmheaderFactory != null) {
				return thetmheaderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tmheaderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderFactoryImpl() {
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
			case tmheaderPackage.GSSTM_HEADER: return createGSSTMHeader();
			case tmheaderPackage.GSSTM_HEADER_FIELD: return createGSSTMHeaderField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMHeader createGSSTMHeader() {
		GSSTMHeaderImpl gsstmHeader = new GSSTMHeaderImpl();
		return gsstmHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMHeaderField createGSSTMHeaderField() {
		GSSTMHeaderFieldImpl gsstmHeaderField = new GSSTMHeaderFieldImpl();
		return gsstmHeaderField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderPackage gettmheaderPackage() {
		return (tmheaderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tmheaderPackage getPackage() {
		return tmheaderPackage.eINSTANCE;
	}

} //tmheaderFactoryImpl
