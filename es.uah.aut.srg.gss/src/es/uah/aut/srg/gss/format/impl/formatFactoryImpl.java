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
package es.uah.aut.srg.gss.format.impl;

import es.uah.aut.srg.gss.format.*;

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
public class formatFactoryImpl extends EFactoryImpl implements formatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static formatFactory init() {
		try {
			formatFactory theformatFactory = (formatFactory)EPackage.Registry.INSTANCE.getEFactory(formatPackage.eNS_URI);
			if (theformatFactory != null) {
				return theformatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new formatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatFactoryImpl() {
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
			case formatPackage.GSS_FORMAT_FORMAT: return createGSSFormatFormat();
			case formatPackage.GSS_FORMAT_CS_FIELD: return createGSSFormatCSField();
			case formatPackage.GSS_FORMAT_CS_FORMULA_FIELD: return createGSSFormatCSFormulaField();
			case formatPackage.GSS_FORMAT_VS_FIELD: return createGSSFormatVSField();
			case formatPackage.GSS_FORMAT_VR_FIELD_SIZE: return createGSSFormatVRFieldSize();
			case formatPackage.GSS_FORMAT_FDIC_FIELD: return createGSSFormatFDICField();
			case formatPackage.GSS_FORMAT_AFIELD: return createGSSFormatAField();
			case formatPackage.GSS_FORMAT_AI_FIELD: return createGSSFormatAIField();
			case formatPackage.GSS_FORMAT_BYTES_BITS: return createGSSFormatBytesBits();
			case formatPackage.GSS_FORMAT_FORMULA: return createGSSFormatFormula();
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE: return createGSSFormatVariableSize();
			case formatPackage.GSS_FORMAT_FLOATING_OFFSET: return createGSSFormatFloatingOffset();
			case formatPackage.GSS_FORMAT_SORTED_FIELDS_TO_CHECK: return createGSSFormatSortedFieldsToCheck();
			case formatPackage.GSS_FORMAT_FIELD_TO_CHECK: return createGSSFormatFieldToCheck();
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION: return createGSSFormatArrayDimension();
			case formatPackage.GSS_FORMAT_ARRAY_REF: return createGSSFormatArrayRef();
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
			case formatPackage.GSS_FORMAT_FORMAT_TYPE:
				return createGSSFormatFormatTypeFromString(eDataType, initialValue);
			case formatPackage.GSS_FORMAT_FIELD_TYPE:
				return createGSSFormatFieldTypeFromString(eDataType, initialValue);
			case formatPackage.GSS_FORMAT_FIELD_BYTE_ORDER:
				return createGSSFormatFieldByteOrderFromString(eDataType, initialValue);
			case formatPackage.GSS_FORMAT_SFIELD_FIRST_BIT:
				return createGSSFormatSFieldFirstBitFromString(eDataType, initialValue);
			case formatPackage.GSS_FORMAT_CHECK_TYPE:
				return createGSSFormatCheckTypeFromString(eDataType, initialValue);
			case formatPackage.GSS_FORMAT_UNIT:
				return createGSSFormatUnitFromString(eDataType, initialValue);
			case formatPackage.GSS_FORMAT_POWER:
				return createGSSFormatPowerFromString(eDataType, initialValue);
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
			case formatPackage.GSS_FORMAT_FORMAT_TYPE:
				return convertGSSFormatFormatTypeToString(eDataType, instanceValue);
			case formatPackage.GSS_FORMAT_FIELD_TYPE:
				return convertGSSFormatFieldTypeToString(eDataType, instanceValue);
			case formatPackage.GSS_FORMAT_FIELD_BYTE_ORDER:
				return convertGSSFormatFieldByteOrderToString(eDataType, instanceValue);
			case formatPackage.GSS_FORMAT_SFIELD_FIRST_BIT:
				return convertGSSFormatSFieldFirstBitToString(eDataType, instanceValue);
			case formatPackage.GSS_FORMAT_CHECK_TYPE:
				return convertGSSFormatCheckTypeToString(eDataType, instanceValue);
			case formatPackage.GSS_FORMAT_UNIT:
				return convertGSSFormatUnitToString(eDataType, instanceValue);
			case formatPackage.GSS_FORMAT_POWER:
				return convertGSSFormatPowerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat createGSSFormatFormat() {
		GSSFormatFormatImpl gssFormatFormat = new GSSFormatFormatImpl();
		return gssFormatFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatCSField createGSSFormatCSField() {
		GSSFormatCSFieldImpl gssFormatCSField = new GSSFormatCSFieldImpl();
		return gssFormatCSField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatCSFormulaField createGSSFormatCSFormulaField() {
		GSSFormatCSFormulaFieldImpl gssFormatCSFormulaField = new GSSFormatCSFormulaFieldImpl();
		return gssFormatCSFormulaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatVSField createGSSFormatVSField() {
		GSSFormatVSFieldImpl gssFormatVSField = new GSSFormatVSFieldImpl();
		return gssFormatVSField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatVRFieldSize createGSSFormatVRFieldSize() {
		GSSFormatVRFieldSizeImpl gssFormatVRFieldSize = new GSSFormatVRFieldSizeImpl();
		return gssFormatVRFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFDICField createGSSFormatFDICField() {
		GSSFormatFDICFieldImpl gssFormatFDICField = new GSSFormatFDICFieldImpl();
		return gssFormatFDICField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatAField createGSSFormatAField() {
		GSSFormatAFieldImpl gssFormatAField = new GSSFormatAFieldImpl();
		return gssFormatAField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatAIField createGSSFormatAIField() {
		GSSFormatAIFieldImpl gssFormatAIField = new GSSFormatAIFieldImpl();
		return gssFormatAIField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatBytesBits createGSSFormatBytesBits() {
		GSSFormatBytesBitsImpl gssFormatBytesBits = new GSSFormatBytesBitsImpl();
		return gssFormatBytesBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormula createGSSFormatFormula() {
		GSSFormatFormulaImpl gssFormatFormula = new GSSFormatFormulaImpl();
		return gssFormatFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatVariableSize createGSSFormatVariableSize() {
		GSSFormatVariableSizeImpl gssFormatVariableSize = new GSSFormatVariableSizeImpl();
		return gssFormatVariableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFloatingOffset createGSSFormatFloatingOffset() {
		GSSFormatFloatingOffsetImpl gssFormatFloatingOffset = new GSSFormatFloatingOffsetImpl();
		return gssFormatFloatingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatSortedFieldsToCheck createGSSFormatSortedFieldsToCheck() {
		GSSFormatSortedFieldsToCheckImpl gssFormatSortedFieldsToCheck = new GSSFormatSortedFieldsToCheckImpl();
		return gssFormatSortedFieldsToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFieldToCheck createGSSFormatFieldToCheck() {
		GSSFormatFieldToCheckImpl gssFormatFieldToCheck = new GSSFormatFieldToCheckImpl();
		return gssFormatFieldToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatArrayDimension createGSSFormatArrayDimension() {
		GSSFormatArrayDimensionImpl gssFormatArrayDimension = new GSSFormatArrayDimensionImpl();
		return gssFormatArrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatArrayRef createGSSFormatArrayRef() {
		GSSFormatArrayRefImpl gssFormatArrayRef = new GSSFormatArrayRefImpl();
		return gssFormatArrayRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormatType createGSSFormatFormatTypeFromString(EDataType eDataType, String initialValue) {
		GSSFormatFormatType result = GSSFormatFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFieldType createGSSFormatFieldTypeFromString(EDataType eDataType, String initialValue) {
		GSSFormatFieldType result = GSSFormatFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFieldByteOrder createGSSFormatFieldByteOrderFromString(EDataType eDataType, String initialValue) {
		GSSFormatFieldByteOrder result = GSSFormatFieldByteOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatFieldByteOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatSFieldFirstBit createGSSFormatSFieldFirstBitFromString(EDataType eDataType, String initialValue) {
		GSSFormatSFieldFirstBit result = GSSFormatSFieldFirstBit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatSFieldFirstBitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatCheckType createGSSFormatCheckTypeFromString(EDataType eDataType, String initialValue) {
		GSSFormatCheckType result = GSSFormatCheckType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatCheckTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatUnit createGSSFormatUnitFromString(EDataType eDataType, String initialValue) {
		GSSFormatUnit result = GSSFormatUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatPower createGSSFormatPowerFromString(EDataType eDataType, String initialValue) {
		GSSFormatPower result = GSSFormatPower.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSFormatPowerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatPackage getformatPackage() {
		return (formatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static formatPackage getPackage() {
		return formatPackage.eINSTANCE;
	}

} //formatFactoryImpl
