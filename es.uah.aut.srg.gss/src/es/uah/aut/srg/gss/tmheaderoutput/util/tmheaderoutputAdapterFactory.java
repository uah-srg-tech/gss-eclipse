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
package es.uah.aut.srg.gss.tmheaderoutput.util;

import es.uah.aut.srg.gss.tmheaderoutput.*;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader;
import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputPackage
 * @generated
 */
public class tmheaderoutputAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tmheaderoutputPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderoutputAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = tmheaderoutputPackage.eINSTANCE;
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
	protected tmheaderoutputSwitch<Adapter> modelSwitch =
		new tmheaderoutputSwitch<Adapter>() {
			@Override
			public Adapter caseGSSTMHeaderOutput(GSSTMHeaderOutput object) {
				return createGSSTMHeaderOutputAdapter();
			}
			@Override
			public Adapter caseGSSTMHeaderOutputField(GSSTMHeaderOutputField object) {
				return createGSSTMHeaderOutputFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFTMHeader(TMTCIFTMHeader object) {
				return createTMTCIFTMHeaderAdapter();
			}
			@Override
			public Adapter caseTMTCIFTMHeaderField(TMTCIFTMHeaderField object) {
				return createTMTCIFTMHeaderFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput <em>GSSTM Header Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput
	 * @generated
	 */
	public Adapter createGSSTMHeaderOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField <em>GSSTM Header Output Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField
	 * @generated
	 */
	public Adapter createGSSTMHeaderOutputFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader <em>TMTCIFTM Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader
	 * @generated
	 */
	public Adapter createTMTCIFTMHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField <em>TMTCIFTM Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField
	 * @generated
	 */
	public Adapter createTMTCIFTMHeaderFieldAdapter() {
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

} //tmheaderoutputAdapterFactory
