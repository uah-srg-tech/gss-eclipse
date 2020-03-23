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
package es.uah.aut.srg.gss.format.util;

import es.uah.aut.srg.gss.common.GSSModelElement;
import es.uah.aut.srg.gss.common.GSSModelObject;

import es.uah.aut.srg.gss.format.*;

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
 * @see es.uah.aut.srg.gss.format.formatPackage
 * @generated
 */
public class formatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static formatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatSwitch() {
		if (modelPackage == null) {
			modelPackage = formatPackage.eINSTANCE;
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
			case formatPackage.GSS_FORMAT_FORMAT: {
				GSSFormatFormat gssFormatFormat = (GSSFormatFormat)theEObject;
				T result = caseGSSFormatFormat(gssFormatFormat);
				if (result == null) result = caseGSSModelElement(gssFormatFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_FIELD: {
				GSSFormatField gssFormatField = (GSSFormatField)theEObject;
				T result = caseGSSFormatField(gssFormatField);
				if (result == null) result = caseGSSModelObject(gssFormatField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_CS_FIELD: {
				GSSFormatCSField gssFormatCSField = (GSSFormatCSField)theEObject;
				T result = caseGSSFormatCSField(gssFormatCSField);
				if (result == null) result = caseGSSFormatField(gssFormatCSField);
				if (result == null) result = caseGSSModelObject(gssFormatCSField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_CS_FORMULA_FIELD: {
				GSSFormatCSFormulaField gssFormatCSFormulaField = (GSSFormatCSFormulaField)theEObject;
				T result = caseGSSFormatCSFormulaField(gssFormatCSFormulaField);
				if (result == null) result = caseGSSFormatCSField(gssFormatCSFormulaField);
				if (result == null) result = caseGSSFormatField(gssFormatCSFormulaField);
				if (result == null) result = caseGSSModelObject(gssFormatCSFormulaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_VS_FIELD: {
				GSSFormatVSField gssFormatVSField = (GSSFormatVSField)theEObject;
				T result = caseGSSFormatVSField(gssFormatVSField);
				if (result == null) result = caseGSSFormatField(gssFormatVSField);
				if (result == null) result = caseGSSModelObject(gssFormatVSField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_VR_FIELD_SIZE: {
				GSSFormatVRFieldSize gssFormatVRFieldSize = (GSSFormatVRFieldSize)theEObject;
				T result = caseGSSFormatVRFieldSize(gssFormatVRFieldSize);
				if (result == null) result = caseGSSFormatField(gssFormatVRFieldSize);
				if (result == null) result = caseGSSModelObject(gssFormatVRFieldSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_FDIC_FIELD: {
				GSSFormatFDICField gssFormatFDICField = (GSSFormatFDICField)theEObject;
				T result = caseGSSFormatFDICField(gssFormatFDICField);
				if (result == null) result = caseGSSFormatField(gssFormatFDICField);
				if (result == null) result = caseGSSModelObject(gssFormatFDICField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_AFIELD: {
				GSSFormatAField gssFormatAField = (GSSFormatAField)theEObject;
				T result = caseGSSFormatAField(gssFormatAField);
				if (result == null) result = caseGSSFormatField(gssFormatAField);
				if (result == null) result = caseGSSModelObject(gssFormatAField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_AI_FIELD: {
				GSSFormatAIField gssFormatAIField = (GSSFormatAIField)theEObject;
				T result = caseGSSFormatAIField(gssFormatAIField);
				if (result == null) result = caseGSSFormatField(gssFormatAIField);
				if (result == null) result = caseGSSModelObject(gssFormatAIField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_BYTES_BITS: {
				GSSFormatBytesBits gssFormatBytesBits = (GSSFormatBytesBits)theEObject;
				T result = caseGSSFormatBytesBits(gssFormatBytesBits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_FORMULA: {
				GSSFormatFormula gssFormatFormula = (GSSFormatFormula)theEObject;
				T result = caseGSSFormatFormula(gssFormatFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE: {
				GSSFormatVariableSize gssFormatVariableSize = (GSSFormatVariableSize)theEObject;
				T result = caseGSSFormatVariableSize(gssFormatVariableSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_FLOATING_OFFSET: {
				GSSFormatFloatingOffset gssFormatFloatingOffset = (GSSFormatFloatingOffset)theEObject;
				T result = caseGSSFormatFloatingOffset(gssFormatFloatingOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_SORTED_FIELDS_TO_CHECK: {
				GSSFormatSortedFieldsToCheck gssFormatSortedFieldsToCheck = (GSSFormatSortedFieldsToCheck)theEObject;
				T result = caseGSSFormatSortedFieldsToCheck(gssFormatSortedFieldsToCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_FIELD_TO_CHECK: {
				GSSFormatFieldToCheck gssFormatFieldToCheck = (GSSFormatFieldToCheck)theEObject;
				T result = caseGSSFormatFieldToCheck(gssFormatFieldToCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION: {
				GSSFormatArrayDimension gssFormatArrayDimension = (GSSFormatArrayDimension)theEObject;
				T result = caseGSSFormatArrayDimension(gssFormatArrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.GSS_FORMAT_ARRAY_REF: {
				GSSFormatArrayRef gssFormatArrayRef = (GSSFormatArrayRef)theEObject;
				T result = caseGSSFormatArrayRef(gssFormatArrayRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatFormat(GSSFormatFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatField(GSSFormatField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format CS Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format CS Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatCSField(GSSFormatCSField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format CS Formula Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format CS Formula Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatCSFormulaField(GSSFormatCSFormulaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format VS Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format VS Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatVSField(GSSFormatVSField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format VR Field Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format VR Field Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatVRFieldSize(GSSFormatVRFieldSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format FDIC Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format FDIC Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatFDICField(GSSFormatFDICField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format AField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format AField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatAField(GSSFormatAField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format AI Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format AI Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatAIField(GSSFormatAIField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Bytes Bits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Bytes Bits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatBytesBits(GSSFormatBytesBits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatFormula(GSSFormatFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Variable Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Variable Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatVariableSize(GSSFormatVariableSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Floating Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Floating Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatFloatingOffset(GSSFormatFloatingOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Sorted Fields To Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Sorted Fields To Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatSortedFieldsToCheck(GSSFormatSortedFieldsToCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Field To Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Field To Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatFieldToCheck(GSSFormatFieldToCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Array Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatArrayDimension(GSSFormatArrayDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Format Array Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Format Array Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFormatArrayRef(GSSFormatArrayRef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>GSS Model Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Model Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSModelObject(GSSModelObject object) {
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

} //formatSwitch
