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
 * @see es.uah.aut.srg.gss.export.exportPackage
 * @generated
 */
public class exportSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static exportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportSwitch() {
		if (modelPackage == null) {
			modelPackage = exportPackage.eINSTANCE;
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
			case exportPackage.GSS_EXPORT_EXPORT: {
				GSSExportExport gssExportExport = (GSSExportExport)theEObject;
				T result = caseGSSExportExport(gssExportExport);
				if (result == null) result = caseGSSModelElement(gssExportExport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SIZES: {
				GSSExportSizes gssExportSizes = (GSSExportSizes)theEObject;
				T result = caseGSSExportSizes(gssExportSizes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH: {
				GSSExportSizeFromFileLength gssExportSizeFromFileLength = (GSSExportSizeFromFileLength)theEObject;
				T result = caseGSSExportSizeFromFileLength(gssExportSizeFromFileLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE: {
				GSSExportSizeFromFileLine gssExportSizeFromFileLine = (GSSExportSizeFromFileLine)theEObject;
				T result = caseGSSExportSizeFromFileLine(gssExportSizeFromFileLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SIZE_IN_BITS: {
				GSSExportSizeInBits gssExportSizeInBits = (GSSExportSizeInBits)theEObject;
				T result = caseGSSExportSizeInBits(gssExportSizeInBits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTINGS: {
				GSSExportSettings gssExportSettings = (GSSExportSettings)theEObject;
				T result = caseGSSExportSettings(gssExportSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST: {
				GSSExportSettingFromConst gssExportSettingFromConst = (GSSExportSettingFromConst)theEObject;
				T result = caseGSSExportSettingFromConst(gssExportSettingFromConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTING_FROM_SIZE: {
				GSSExportSettingFromSize gssExportSettingFromSize = (GSSExportSettingFromSize)theEObject;
				T result = caseGSSExportSettingFromSize(gssExportSettingFromSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTING_FROM_FILE: {
				GSSExportSettingFromFile gssExportSettingFromFile = (GSSExportSettingFromFile)theEObject;
				T result = caseGSSExportSettingFromFile(gssExportSettingFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD: {
				GSSExportSettingFromField gssExportSettingFromField = (GSSExportSettingFromField)theEObject;
				T result = caseGSSExportSettingFromField(gssExportSettingFromField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST: {
				GSSExportSettingAIFromConst gssExportSettingAIFromConst = (GSSExportSettingAIFromConst)theEObject;
				T result = caseGSSExportSettingAIFromConst(gssExportSettingAIFromConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE: {
				GSSExportSettingAIFromFile gssExportSettingAIFromFile = (GSSExportSettingAIFromFile)theEObject;
				T result = caseGSSExportSettingAIFromFile(gssExportSettingAIFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS: {
				GSSExportActivateDICs gssExportActivateDICs = (GSSExportActivateDICs)theEObject;
				T result = caseGSSExportActivateDICs(gssExportActivateDICs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.GSS_EXPORT_DIC: {
				GSSExportDIC gssExportDIC = (GSSExportDIC)theEObject;
				T result = caseGSSExportDIC(gssExportDIC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportExport(GSSExportExport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Sizes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Sizes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSizes(GSSExportSizes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Size From File Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Size From File Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSizeFromFileLength(GSSExportSizeFromFileLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Size From File Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Size From File Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSizeFromFileLine(GSSExportSizeFromFileLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Size In Bits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Size In Bits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSizeInBits(GSSExportSizeInBits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettings(GSSExportSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Setting From Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Setting From Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettingFromConst(GSSExportSettingFromConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Setting From Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Setting From Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettingFromSize(GSSExportSettingFromSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Setting From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Setting From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettingFromFile(GSSExportSettingFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Setting From Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Setting From Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettingFromField(GSSExportSettingFromField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Setting AI From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Setting AI From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettingAIFromFile(GSSExportSettingAIFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Setting AI From Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Setting AI From Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportSettingAIFromConst(GSSExportSettingAIFromConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export Activate DI Cs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export Activate DI Cs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportActivateDICs(GSSExportActivateDICs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Export DIC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Export DIC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSExportDIC(GSSExportDIC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSModelElement(GSSModelElement object) {
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

} //exportSwitch
