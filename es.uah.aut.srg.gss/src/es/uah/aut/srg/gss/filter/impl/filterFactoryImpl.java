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
package es.uah.aut.srg.gss.filter.impl;

import es.uah.aut.srg.gss.filter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class filterFactoryImpl extends EFactoryImpl implements filterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static filterFactory init() {
		try {
			filterFactory thefilterFactory = (filterFactory)EPackage.Registry.INSTANCE.getEFactory(filterPackage.eNS_URI);
			if (thefilterFactory != null) {
				return thefilterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new filterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterFactoryImpl() {
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
			case filterPackage.GSS_FILTER_MAXTERM_FILTER: return createGSSFilterMaxtermFilter();
			case filterPackage.GSS_FILTER_MINTERM_FILTER: return createGSSFilterMintermFilter();
			case filterPackage.GSS_FILTER_BOOL_VAR: return createGSSFilterBoolVar();
			case filterPackage.GSS_FILTER_FIELD_OP: return createGSSFilterFieldOp();
			case filterPackage.GSS_FILTER_CONSTANT: return createGSSFilterConstant();
			case filterPackage.GSS_FILTER_SELECT: return createGSSFilterSelect();
			case filterPackage.GSS_FILTER_SELECT_LINE: return createGSSFilterSelectLine();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM: return createGSSFilterBoolVarFromArrayItem();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM: return createGSSFilterBoolVarFromGroupedArrayItem();
			case filterPackage.GSS_FILTER_BOOL_VAR_FDIC: return createGSSFilterBoolVarFDIC();
			case filterPackage.GSS_FILTER_MAXTERM: return createGSSFilterMaxterm();
			case filterPackage.GSS_FILTER_MINTERM: return createGSSFilterMinterm();
			case filterPackage.GSS_FILTER_BOOL_VAR_REF: return createGSSFilterBoolVarRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case filterPackage.GSS_FILTER_CONSTANT_TYPE:
				return createGSSFilterConstantTypeFromString(eDataType, initialValue);
			case filterPackage.GSS_FILTER_OP_TYPE:
				return createGSSFilterOPTypeFromString(eDataType, initialValue);
			case filterPackage.GSS_FILTER_SELECT_TYPE:
				return createGSSFilterSelectTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case filterPackage.GSS_FILTER_CONSTANT_TYPE:
				return convertGSSFilterConstantTypeToString(eDataType, instanceValue);
			case filterPackage.GSS_FILTER_OP_TYPE:
				return convertGSSFilterOPTypeToString(eDataType, instanceValue);
			case filterPackage.GSS_FILTER_SELECT_TYPE:
				return convertGSSFilterSelectTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterMaxtermFilter createGSSFilterMaxtermFilter() {
		GSSFilterMaxtermFilterImpl gssFilterMaxtermFilter = new GSSFilterMaxtermFilterImpl();
		return gssFilterMaxtermFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterMintermFilter createGSSFilterMintermFilter() {
		GSSFilterMintermFilterImpl gssFilterMintermFilter = new GSSFilterMintermFilterImpl();
		return gssFilterMintermFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterBoolVar createGSSFilterBoolVar() {
		GSSFilterBoolVarImpl gssFilterBoolVar = new GSSFilterBoolVarImpl();
		return gssFilterBoolVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFieldOp createGSSFilterFieldOp() {
		GSSFilterFieldOpImpl gssFilterFieldOp = new GSSFilterFieldOpImpl();
		return gssFilterFieldOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterConstant createGSSFilterConstant() {
		GSSFilterConstantImpl gssFilterConstant = new GSSFilterConstantImpl();
		return gssFilterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelect createGSSFilterSelect() {
		GSSFilterSelectImpl gssFilterSelect = new GSSFilterSelectImpl();
		return gssFilterSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelectLine createGSSFilterSelectLine() {
		GSSFilterSelectLineImpl gssFilterSelectLine = new GSSFilterSelectLineImpl();
		return gssFilterSelectLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterBoolVarFromArrayItem createGSSFilterBoolVarFromArrayItem() {
		GSSFilterBoolVarFromArrayItemImpl gssFilterBoolVarFromArrayItem = new GSSFilterBoolVarFromArrayItemImpl();
		return gssFilterBoolVarFromArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterBoolVarFromGroupedArrayItem createGSSFilterBoolVarFromGroupedArrayItem() {
		GSSFilterBoolVarFromGroupedArrayItemImpl gssFilterBoolVarFromGroupedArrayItem = new GSSFilterBoolVarFromGroupedArrayItemImpl();
		return gssFilterBoolVarFromGroupedArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterBoolVarFDIC createGSSFilterBoolVarFDIC() {
		GSSFilterBoolVarFDICImpl gssFilterBoolVarFDIC = new GSSFilterBoolVarFDICImpl();
		return gssFilterBoolVarFDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterMaxterm createGSSFilterMaxterm() {
		GSSFilterMaxtermImpl gssFilterMaxterm = new GSSFilterMaxtermImpl();
		return gssFilterMaxterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterMinterm createGSSFilterMinterm() {
		GSSFilterMintermImpl gssFilterMinterm = new GSSFilterMintermImpl();
		return gssFilterMinterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterBoolVarRef createGSSFilterBoolVarRef() {
		GSSFilterBoolVarRefImpl gssFilterBoolVarRef = new GSSFilterBoolVarRefImpl();
		return gssFilterBoolVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterConstantType createGSSFilterConstantTypeFromString(EDataType eDataType, String initialValue) {
		GSSFilterConstantType result = GSSFilterConstantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFilterConstantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterOPType createGSSFilterOPTypeFromString(EDataType eDataType, String initialValue) {
		GSSFilterOPType result = GSSFilterOPType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFilterOPTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelectType createGSSFilterSelectTypeFromString(EDataType eDataType, String initialValue) {
		GSSFilterSelectType result = GSSFilterSelectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFilterSelectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterPackage getfilterPackage() {
		return (filterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static filterPackage getPackage() {
		return filterPackage.eINSTANCE;
	}

} //filterFactoryImpl
