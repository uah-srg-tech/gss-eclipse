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
package es.uah.aut.srg.gss.tm_tc_format.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.tm_tc_format.*;

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
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage
 * @generated
 */
public class tm_tc_formatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tm_tc_formatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tm_tc_formatSwitch() {
		if (modelPackage == null) {
			modelPackage = tm_tc_formatPackage.eINSTANCE;
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT: {
				GSSTmTcFormatTmTCFormat gssTmTcFormatTmTCFormat = (GSSTmTcFormatTmTCFormat)theEObject;
				T result = caseGSSTmTcFormatTmTCFormat(gssTmTcFormatTmTCFormat);
				if (result == null) result = caseGSSModelElement(gssTmTcFormatTmTCFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD: {
				GSSTmTcFormatField gssTmTcFormatField = (GSSTmTcFormatField)theEObject;
				T result = caseGSSTmTcFormatField(gssTmTcFormatField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD: {
				GSSTmTcFormatCSField gssTmTcFormatCSField = (GSSTmTcFormatCSField)theEObject;
				T result = caseGSSTmTcFormatCSField(gssTmTcFormatCSField);
				if (result == null) result = caseGSSTmTcFormatField(gssTmTcFormatCSField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FORMULA_FIELD: {
				GSSTmTcFormatCSFormulaField gssTmTcFormatCSFormulaField = (GSSTmTcFormatCSFormulaField)theEObject;
				T result = caseGSSTmTcFormatCSFormulaField(gssTmTcFormatCSFormulaField);
				if (result == null) result = caseGSSTmTcFormatField(gssTmTcFormatCSFormulaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD: {
				GSSTmTcFormatVSField gssTmTcFormatVSField = (GSSTmTcFormatVSField)theEObject;
				T result = caseGSSTmTcFormatVSField(gssTmTcFormatVSField);
				if (result == null) result = caseGSSTmTcFormatField(gssTmTcFormatVSField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VR_FIELD_SIZE: {
				GSSTmTcFormatVRFieldSize gssTmTcFormatVRFieldSize = (GSSTmTcFormatVRFieldSize)theEObject;
				T result = caseGSSTmTcFormatVRFieldSize(gssTmTcFormatVRFieldSize);
				if (result == null) result = caseGSSTmTcFormatField(gssTmTcFormatVRFieldSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD: {
				GSSTmTcFormatFDICField gssTmTcFormatFDICField = (GSSTmTcFormatFDICField)theEObject;
				T result = caseGSSTmTcFormatFDICField(gssTmTcFormatFDICField);
				if (result == null) result = caseGSSTmTcFormatField(gssTmTcFormatFDICField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AFIELD: {
				GSSTmTcFormatAField gssTmTcFormatAField = (GSSTmTcFormatAField)theEObject;
				T result = caseGSSTmTcFormatAField(gssTmTcFormatAField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD: {
				GSSTmTcFormatAIField gssTmTcFormatAIField = (GSSTmTcFormatAIField)theEObject;
				T result = caseGSSTmTcFormatAIField(gssTmTcFormatAIField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SIZE: {
				GSSTmTcFormatSize gssTmTcFormatSize = (GSSTmTcFormatSize)theEObject;
				T result = caseGSSTmTcFormatSize(gssTmTcFormatSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_GLOBAL_OFFSET: {
				GSSTmTcFormatGlobalOffset gssTmTcFormatGlobalOffset = (GSSTmTcFormatGlobalOffset)theEObject;
				T result = caseGSSTmTcFormatGlobalOffset(gssTmTcFormatGlobalOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA: {
				GSSTmTcFormatFormula gssTmTcFormatFormula = (GSSTmTcFormatFormula)theEObject;
				T result = caseGSSTmTcFormatFormula(gssTmTcFormatFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CONST_SIZE: {
				GSSTmTcFormatConstSize gssTmTcFormatConstSize = (GSSTmTcFormatConstSize)theEObject;
				T result = caseGSSTmTcFormatConstSize(gssTmTcFormatConstSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VARIABLE_SIZE: {
				GSSTmTcFormatVariableSize gssTmTcFormatVariableSize = (GSSTmTcFormatVariableSize)theEObject;
				T result = caseGSSTmTcFormatVariableSize(gssTmTcFormatVariableSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE: {
				GSSTmTcFormatMaxSize gssTmTcFormatMaxSize = (GSSTmTcFormatMaxSize)theEObject;
				T result = caseGSSTmTcFormatMaxSize(gssTmTcFormatMaxSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET: {
				GSSTmTcFormatFloatingOffset gssTmTcFormatFloatingOffset = (GSSTmTcFormatFloatingOffset)theEObject;
				T result = caseGSSTmTcFormatFloatingOffset(gssTmTcFormatFloatingOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK: {
				GSSTmTcFormatSortedFieldsToCheck gssTmTcFormatSortedFieldsToCheck = (GSSTmTcFormatSortedFieldsToCheck)theEObject;
				T result = caseGSSTmTcFormatSortedFieldsToCheck(gssTmTcFormatSortedFieldsToCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_TO_CHECK: {
				GSSTmTcFormatFieldToCheck gssTmTcFormatFieldToCheck = (GSSTmTcFormatFieldToCheck)theEObject;
				T result = caseGSSTmTcFormatFieldToCheck(gssTmTcFormatFieldToCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_ARRAY_DIMENSION: {
				GSSTmTcFormatArrayDimension gssTmTcFormatArrayDimension = (GSSTmTcFormatArrayDimension)theEObject;
				T result = caseGSSTmTcFormatArrayDimension(gssTmTcFormatArrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_ARRAY_REF: {
				GSSTmTcFormatArrayRef gssTmTcFormatArrayRef = (GSSTmTcFormatArrayRef)theEObject;
				T result = caseGSSTmTcFormatArrayRef(gssTmTcFormatArrayRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_LOCAL_OFFSET: {
				GSSTmTcFormatLocalOffset gssTmTcFormatLocalOffset = (GSSTmTcFormatLocalOffset)theEObject;
				T result = caseGSSTmTcFormatLocalOffset(gssTmTcFormatLocalOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Tm TC Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Tm TC Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatTmTCFormat(GSSTmTcFormatTmTCFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatField(GSSTmTcFormatField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format CS Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format CS Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatCSField(GSSTmTcFormatCSField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatSize(GSSTmTcFormatSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Global Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Global Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatGlobalOffset(GSSTmTcFormatGlobalOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format CS Formula Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format CS Formula Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatCSFormulaField(GSSTmTcFormatCSFormulaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatFormula(GSSTmTcFormatFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format VS Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format VS Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatVSField(GSSTmTcFormatVSField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Const Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Const Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatConstSize(GSSTmTcFormatConstSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Variable Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Variable Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatVariableSize(GSSTmTcFormatVariableSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Max Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Max Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatMaxSize(GSSTmTcFormatMaxSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format VR Field Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format VR Field Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatVRFieldSize(GSSTmTcFormatVRFieldSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format FDIC Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format FDIC Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatFDICField(GSSTmTcFormatFDICField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Floating Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Floating Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatFloatingOffset(GSSTmTcFormatFloatingOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Sorted Fields To Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Sorted Fields To Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatSortedFieldsToCheck(GSSTmTcFormatSortedFieldsToCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Field To Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Field To Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatFieldToCheck(GSSTmTcFormatFieldToCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format AField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format AField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatAField(GSSTmTcFormatAField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Array Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatArrayDimension(GSSTmTcFormatArrayDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format AI Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format AI Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatAIField(GSSTmTcFormatAIField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Array Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Array Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatArrayRef(GSSTmTcFormatArrayRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Local Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Tm Tc Format Local Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTmTcFormatLocalOffset(GSSTmTcFormatLocalOffset object) {
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

} //tm_tc_formatSwitch
