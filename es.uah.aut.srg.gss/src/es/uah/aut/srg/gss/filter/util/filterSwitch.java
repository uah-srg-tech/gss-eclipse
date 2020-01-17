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
package es.uah.aut.srg.gss.filter.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.filter.*;

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
 * @see es.uah.aut.srg.gss.filter.filterPackage
 * @generated
 */
public class filterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static filterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterSwitch() {
		if (modelPackage == null) {
			modelPackage = filterPackage.eINSTANCE;
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
			case filterPackage.GSS_FILTER_FILTER: {
				GSSFilterFilter gssFilterFilter = (GSSFilterFilter)theEObject;
				T result = caseGSSFilterFilter(gssFilterFilter);
				if (result == null) result = caseGSSModelElement(gssFilterFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_MAXTERM_FILTER: {
				GSSFilterMaxtermFilter gssFilterMaxtermFilter = (GSSFilterMaxtermFilter)theEObject;
				T result = caseGSSFilterMaxtermFilter(gssFilterMaxtermFilter);
				if (result == null) result = caseGSSFilterFilter(gssFilterMaxtermFilter);
				if (result == null) result = caseGSSModelElement(gssFilterMaxtermFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_MINTERM_FILTER: {
				GSSFilterMintermFilter gssFilterMintermFilter = (GSSFilterMintermFilter)theEObject;
				T result = caseGSSFilterMintermFilter(gssFilterMintermFilter);
				if (result == null) result = caseGSSFilterFilter(gssFilterMintermFilter);
				if (result == null) result = caseGSSModelElement(gssFilterMintermFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_BOOL_VAR: {
				GSSFilterBoolVar gssFilterBoolVar = (GSSFilterBoolVar)theEObject;
				T result = caseGSSFilterBoolVar(gssFilterBoolVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_FIELD_OP: {
				GSSFilterFieldOp gssFilterFieldOp = (GSSFilterFieldOp)theEObject;
				T result = caseGSSFilterFieldOp(gssFilterFieldOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_VALUE: {
				GSSFilterValue gssFilterValue = (GSSFilterValue)theEObject;
				T result = caseGSSFilterValue(gssFilterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_CONSTANT: {
				GSSFilterConstant gssFilterConstant = (GSSFilterConstant)theEObject;
				T result = caseGSSFilterConstant(gssFilterConstant);
				if (result == null) result = caseGSSFilterValue(gssFilterConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_SELECT: {
				GSSFilterSelect gssFilterSelect = (GSSFilterSelect)theEObject;
				T result = caseGSSFilterSelect(gssFilterSelect);
				if (result == null) result = caseGSSFilterValue(gssFilterSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_SELECT_LINE: {
				GSSFilterSelectLine gssFilterSelectLine = (GSSFilterSelectLine)theEObject;
				T result = caseGSSFilterSelectLine(gssFilterSelectLine);
				if (result == null) result = caseGSSFilterValue(gssFilterSelectLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM: {
				GSSFilterBoolVarFromArrayItem gssFilterBoolVarFromArrayItem = (GSSFilterBoolVarFromArrayItem)theEObject;
				T result = caseGSSFilterBoolVarFromArrayItem(gssFilterBoolVarFromArrayItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM: {
				GSSFilterBoolVarFromGroupedArrayItem gssFilterBoolVarFromGroupedArrayItem = (GSSFilterBoolVarFromGroupedArrayItem)theEObject;
				T result = caseGSSFilterBoolVarFromGroupedArrayItem(gssFilterBoolVarFromGroupedArrayItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_BOOL_VAR_FDIC: {
				GSSFilterBoolVarFDIC gssFilterBoolVarFDIC = (GSSFilterBoolVarFDIC)theEObject;
				T result = caseGSSFilterBoolVarFDIC(gssFilterBoolVarFDIC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_MAXTERM: {
				GSSFilterMaxterm gssFilterMaxterm = (GSSFilterMaxterm)theEObject;
				T result = caseGSSFilterMaxterm(gssFilterMaxterm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_MINTERM: {
				GSSFilterMinterm gssFilterMinterm = (GSSFilterMinterm)theEObject;
				T result = caseGSSFilterMinterm(gssFilterMinterm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.GSS_FILTER_BOOL_VAR_REF: {
				GSSFilterBoolVarRef gssFilterBoolVarRef = (GSSFilterBoolVarRef)theEObject;
				T result = caseGSSFilterBoolVarRef(gssFilterBoolVarRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterFilter(GSSFilterFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Maxterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Maxterm Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterMaxtermFilter(GSSFilterMaxtermFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Minterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Minterm Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterMintermFilter(GSSFilterMintermFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Bool Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Bool Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterBoolVar(GSSFilterBoolVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Field Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Field Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterFieldOp(GSSFilterFieldOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterValue(GSSFilterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterConstant(GSSFilterConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterSelect(GSSFilterSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Select Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Select Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterSelectLine(GSSFilterSelectLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Bool Var From Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Bool Var From Array Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterBoolVarFromArrayItem(GSSFilterBoolVarFromArrayItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterBoolVarFromGroupedArrayItem(GSSFilterBoolVarFromGroupedArrayItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Bool Var FDIC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Bool Var FDIC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterBoolVarFDIC(GSSFilterBoolVarFDIC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Maxterm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Maxterm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterMaxterm(GSSFilterMaxterm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Minterm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Minterm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterMinterm(GSSFilterMinterm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Filter Bool Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Filter Bool Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSFilterBoolVarRef(GSSFilterBoolVarRef object) {
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

} //filterSwitch
