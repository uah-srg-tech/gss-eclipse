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
package es.uah.aut.srg.gss.tm_tc_format.impl;

import es.uah.aut.srg.gss.tm_tc_format.*;

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
public class tm_tc_formatFactoryImpl extends EFactoryImpl implements tm_tc_formatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tm_tc_formatFactory init() {
		try {
			tm_tc_formatFactory thetm_tc_formatFactory = (tm_tc_formatFactory)EPackage.Registry.INSTANCE.getEFactory(tm_tc_formatPackage.eNS_URI);
			if (thetm_tc_formatFactory != null) {
				return thetm_tc_formatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tm_tc_formatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tm_tc_formatFactoryImpl() {
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT: return createGSSTmTcFormatTmTCFormat();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD: return createGSSTmTcFormatCSField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SIZE: return createGSSTmTcFormatSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_GLOBAL_OFFSET: return createGSSTmTcFormatGlobalOffset();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FORMULA_FIELD: return createGSSTmTcFormatCSFormulaField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA: return createGSSTmTcFormatFormula();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD: return createGSSTmTcFormatVSField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CONST_SIZE: return createGSSTmTcFormatConstSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VARIABLE_SIZE: return createGSSTmTcFormatVariableSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE: return createGSSTmTcFormatMaxSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VR_FIELD_SIZE: return createGSSTmTcFormatVRFieldSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD: return createGSSTmTcFormatFDICField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET: return createGSSTmTcFormatFloatingOffset();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK: return createGSSTmTcFormatSortedFieldsToCheck();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_TO_CHECK: return createGSSTmTcFormatFieldToCheck();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AFIELD: return createGSSTmTcFormatAField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_ARRAY_DIMENSION: return createGSSTmTcFormatArrayDimension();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD: return createGSSTmTcFormatAIField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_ARRAY_REF: return createGSSTmTcFormatArrayRef();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_LOCAL_OFFSET: return createGSSTmTcFormatLocalOffset();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT_TYPE:
				return createGSSTmTcFormatTmTCFormatTypeFromString(eDataType, initialValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_TYPE:
				return createGSSTmTcFormatFieldTypeFromString(eDataType, initialValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_BYTE_ORDER:
				return createGSSTmTcFormatFieldByteOrderFromString(eDataType, initialValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SFIELD_FIRST_BIT:
				return createGSSTmTcFormatSFieldFirstBitFromString(eDataType, initialValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_UNIT:
				return createGSSTmTcFormatUnitFromString(eDataType, initialValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_POWER:
				return createGSSTmTcFormatPowerFromString(eDataType, initialValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CHECK_TYPE:
				return createGSSTmTcFormatCheckTypeFromString(eDataType, initialValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT_TYPE:
				return convertGSSTmTcFormatTmTCFormatTypeToString(eDataType, instanceValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_TYPE:
				return convertGSSTmTcFormatFieldTypeToString(eDataType, instanceValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FIELD_BYTE_ORDER:
				return convertGSSTmTcFormatFieldByteOrderToString(eDataType, instanceValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_SFIELD_FIRST_BIT:
				return convertGSSTmTcFormatSFieldFirstBitToString(eDataType, instanceValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_UNIT:
				return convertGSSTmTcFormatUnitToString(eDataType, instanceValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_POWER:
				return convertGSSTmTcFormatPowerToString(eDataType, instanceValue);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CHECK_TYPE:
				return convertGSSTmTcFormatCheckTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTCFormat createGSSTmTcFormatTmTCFormat() {
		GSSTmTcFormatTmTCFormatImpl gssTmTcFormatTmTCFormat = new GSSTmTcFormatTmTCFormatImpl();
		return gssTmTcFormatTmTCFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatCSField createGSSTmTcFormatCSField() {
		GSSTmTcFormatCSFieldImpl gssTmTcFormatCSField = new GSSTmTcFormatCSFieldImpl();
		return gssTmTcFormatCSField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatSize createGSSTmTcFormatSize() {
		GSSTmTcFormatSizeImpl gssTmTcFormatSize = new GSSTmTcFormatSizeImpl();
		return gssTmTcFormatSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatGlobalOffset createGSSTmTcFormatGlobalOffset() {
		GSSTmTcFormatGlobalOffsetImpl gssTmTcFormatGlobalOffset = new GSSTmTcFormatGlobalOffsetImpl();
		return gssTmTcFormatGlobalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatCSFormulaField createGSSTmTcFormatCSFormulaField() {
		GSSTmTcFormatCSFormulaFieldImpl gssTmTcFormatCSFormulaField = new GSSTmTcFormatCSFormulaFieldImpl();
		return gssTmTcFormatCSFormulaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFormula createGSSTmTcFormatFormula() {
		GSSTmTcFormatFormulaImpl gssTmTcFormatFormula = new GSSTmTcFormatFormulaImpl();
		return gssTmTcFormatFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatVSField createGSSTmTcFormatVSField() {
		GSSTmTcFormatVSFieldImpl gssTmTcFormatVSField = new GSSTmTcFormatVSFieldImpl();
		return gssTmTcFormatVSField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatConstSize createGSSTmTcFormatConstSize() {
		GSSTmTcFormatConstSizeImpl gssTmTcFormatConstSize = new GSSTmTcFormatConstSizeImpl();
		return gssTmTcFormatConstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatVariableSize createGSSTmTcFormatVariableSize() {
		GSSTmTcFormatVariableSizeImpl gssTmTcFormatVariableSize = new GSSTmTcFormatVariableSizeImpl();
		return gssTmTcFormatVariableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatMaxSize createGSSTmTcFormatMaxSize() {
		GSSTmTcFormatMaxSizeImpl gssTmTcFormatMaxSize = new GSSTmTcFormatMaxSizeImpl();
		return gssTmTcFormatMaxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatVRFieldSize createGSSTmTcFormatVRFieldSize() {
		GSSTmTcFormatVRFieldSizeImpl gssTmTcFormatVRFieldSize = new GSSTmTcFormatVRFieldSizeImpl();
		return gssTmTcFormatVRFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFDICField createGSSTmTcFormatFDICField() {
		GSSTmTcFormatFDICFieldImpl gssTmTcFormatFDICField = new GSSTmTcFormatFDICFieldImpl();
		return gssTmTcFormatFDICField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFloatingOffset createGSSTmTcFormatFloatingOffset() {
		GSSTmTcFormatFloatingOffsetImpl gssTmTcFormatFloatingOffset = new GSSTmTcFormatFloatingOffsetImpl();
		return gssTmTcFormatFloatingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatSortedFieldsToCheck createGSSTmTcFormatSortedFieldsToCheck() {
		GSSTmTcFormatSortedFieldsToCheckImpl gssTmTcFormatSortedFieldsToCheck = new GSSTmTcFormatSortedFieldsToCheckImpl();
		return gssTmTcFormatSortedFieldsToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFieldToCheck createGSSTmTcFormatFieldToCheck() {
		GSSTmTcFormatFieldToCheckImpl gssTmTcFormatFieldToCheck = new GSSTmTcFormatFieldToCheckImpl();
		return gssTmTcFormatFieldToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatAField createGSSTmTcFormatAField() {
		GSSTmTcFormatAFieldImpl gssTmTcFormatAField = new GSSTmTcFormatAFieldImpl();
		return gssTmTcFormatAField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatArrayDimension createGSSTmTcFormatArrayDimension() {
		GSSTmTcFormatArrayDimensionImpl gssTmTcFormatArrayDimension = new GSSTmTcFormatArrayDimensionImpl();
		return gssTmTcFormatArrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatAIField createGSSTmTcFormatAIField() {
		GSSTmTcFormatAIFieldImpl gssTmTcFormatAIField = new GSSTmTcFormatAIFieldImpl();
		return gssTmTcFormatAIField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatArrayRef createGSSTmTcFormatArrayRef() {
		GSSTmTcFormatArrayRefImpl gssTmTcFormatArrayRef = new GSSTmTcFormatArrayRefImpl();
		return gssTmTcFormatArrayRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatLocalOffset createGSSTmTcFormatLocalOffset() {
		GSSTmTcFormatLocalOffsetImpl gssTmTcFormatLocalOffset = new GSSTmTcFormatLocalOffsetImpl();
		return gssTmTcFormatLocalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTCFormatType createGSSTmTcFormatTmTCFormatTypeFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatTmTCFormatType result = GSSTmTcFormatTmTCFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatTmTCFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFieldType createGSSTmTcFormatFieldTypeFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatFieldType result = GSSTmTcFormatFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFieldByteOrder createGSSTmTcFormatFieldByteOrderFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatFieldByteOrder result = GSSTmTcFormatFieldByteOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatFieldByteOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatSFieldFirstBit createGSSTmTcFormatSFieldFirstBitFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatSFieldFirstBit result = GSSTmTcFormatSFieldFirstBit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatSFieldFirstBitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatUnit createGSSTmTcFormatUnitFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatUnit result = GSSTmTcFormatUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatPower createGSSTmTcFormatPowerFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatPower result = GSSTmTcFormatPower.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatPowerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatCheckType createGSSTmTcFormatCheckTypeFromString(EDataType eDataType, String initialValue) {
		GSSTmTcFormatCheckType result = GSSTmTcFormatCheckType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTmTcFormatCheckTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tm_tc_formatPackage gettm_tc_formatPackage() {
		return (tm_tc_formatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tm_tc_formatPackage getPackage() {
		return tm_tc_formatPackage.eINSTANCE;
	}

} //tm_tc_formatFactoryImpl
