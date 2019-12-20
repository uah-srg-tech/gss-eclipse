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
package es.uah.aut.srg.gss.tmheaderoutput.impl;

import es.uah.aut.srg.gss.tmheaderoutput.*;

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
public class tmheaderoutputFactoryImpl extends EFactoryImpl implements tmheaderoutputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tmheaderoutputFactory init() {
		try {
			tmheaderoutputFactory thetmheaderoutputFactory = (tmheaderoutputFactory)EPackage.Registry.INSTANCE.getEFactory(tmheaderoutputPackage.eNS_URI);
			if (thetmheaderoutputFactory != null) {
				return thetmheaderoutputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tmheaderoutputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderoutputFactoryImpl() {
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
			case tmheaderoutputPackage.GSSTM_HEADER_OUTPUT: return createGSSTMHeaderOutput();
			case tmheaderoutputPackage.GSSTM_HEADER_OUTPUT_FIELD: return createGSSTMHeaderOutputField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMHeaderOutput createGSSTMHeaderOutput() {
		GSSTMHeaderOutputImpl gsstmHeaderOutput = new GSSTMHeaderOutputImpl();
		return gsstmHeaderOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTMHeaderOutputField createGSSTMHeaderOutputField() {
		GSSTMHeaderOutputFieldImpl gsstmHeaderOutputField = new GSSTMHeaderOutputFieldImpl();
		return gsstmHeaderOutputField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderoutputPackage gettmheaderoutputPackage() {
		return (tmheaderoutputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tmheaderoutputPackage getPackage() {
		return tmheaderoutputPackage.eINSTANCE;
	}

} //tmheaderoutputFactoryImpl
