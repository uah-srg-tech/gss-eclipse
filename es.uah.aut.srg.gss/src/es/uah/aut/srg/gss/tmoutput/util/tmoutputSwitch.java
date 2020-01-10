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
package es.uah.aut.srg.gss.tmoutput.util;

import es.uah.aut.srg.gss.tmoutput.*;

import es.uah.aut.srg.tmtcif.tm.TMTCIFPI1;
import es.uah.aut.srg.tmtcif.tm.TMTCIFTM;

import es.uah.aut.srg.tmtcif.tm.TMTCIFTMField;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tmoutput.tmoutputPackage
 * @generated
 */
public class tmoutputSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tmoutputPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmoutputSwitch() {
		if (modelPackage == null) {
			modelPackage = tmoutputPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case tmoutputPackage.GSSTM_OUTPUT: {
				GSSTMOutput gsstmOutput = (GSSTMOutput)theEObject;
				T result = caseGSSTMOutput(gsstmOutput);
				if (result == null) result = caseTMTCIFTM(gsstmOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmoutputPackage.GSSTM_OUTPUT_PI1: {
				GSSTMOutputPi1 gsstmOutputPi1 = (GSSTMOutputPi1)theEObject;
				T result = caseGSSTMOutputPi1(gsstmOutputPi1);
				if (result == null) result = caseTMTCIFPI1(gsstmOutputPi1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmoutputPackage.GSSTM_OUTPUT_FIELD: {
				GSSTMOutputField gsstmOutputField = (GSSTMOutputField)theEObject;
				T result = caseGSSTMOutputField(gsstmOutputField);
				if (result == null) result = caseTMTCIFTMField(gsstmOutputField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSSTM Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSSTM Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTMOutput(GSSTMOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSSTM Output Pi1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSSTM Output Pi1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTMOutputPi1(GSSTMOutputPi1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSSTM Output Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSSTM Output Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTMOutputField(GSSTMOutputField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIFTM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIFTM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFTM(TMTCIFTM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIFPI1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIFPI1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFPI1(TMTCIFPI1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIFTM Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIFTM Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFTMField(TMTCIFTMField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //tmoutputSwitch
