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

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatFactory;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tm_tc_formatPackageImpl extends EPackageImpl implements tm_tc_formatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatTmTCFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatCSFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatGlobalOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatCSFormulaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatVSFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatConstSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatVariableSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatMaxSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatVRFieldSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatFDICFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatFloatingOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatSortedFieldsToCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatFieldToCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatAFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatArrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatAIFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatArrayRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTmTcFormatLocalOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatTmTCFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatFieldByteOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatSFieldFirstBitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatPowerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTmTcFormatCheckTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tm_tc_formatPackageImpl() {
		super(eNS_URI, tm_tc_formatFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link tm_tc_formatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tm_tc_formatPackage init() {
		if (isInited) return (tm_tc_formatPackage)EPackage.Registry.INSTANCE.getEPackage(tm_tc_formatPackage.eNS_URI);

		// Obtain or create and register package
		tm_tc_formatPackageImpl thetm_tc_formatPackage = (tm_tc_formatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tm_tc_formatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tm_tc_formatPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetm_tc_formatPackage.createPackageContents();

		// Initialize created meta-data
		thetm_tc_formatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetm_tc_formatPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tm_tc_formatPackage.eNS_URI, thetm_tc_formatPackage);
		return thetm_tc_formatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatTmTCFormat() {
		return gssTmTcFormatTmTCFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatTmTCFormat_Protocol() {
		return (EAttribute)gssTmTcFormatTmTCFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatTmTCFormat_Type() {
		return (EAttribute)gssTmTcFormatTmTCFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatCSField() {
		return gssTmTcFormatCSFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_Fid() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_Pfid() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_Name() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_Description() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_Type() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_ByteOrder() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSField_FirstBit() {
		return (EAttribute)gssTmTcFormatCSFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatSize() {
		return gssTmTcFormatSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatSize_Bytes() {
		return (EAttribute)gssTmTcFormatSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatSize_Bits() {
		return (EAttribute)gssTmTcFormatSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatGlobalOffset() {
		return gssTmTcFormatGlobalOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatGlobalOffset_Bytes() {
		return (EAttribute)gssTmTcFormatGlobalOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatGlobalOffset_Bits() {
		return (EAttribute)gssTmTcFormatGlobalOffsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatCSFormulaField() {
		return gssTmTcFormatCSFormulaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_Fid() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_Pfid() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_Name() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_Description() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_Type() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_ByteOrder() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatCSFormulaField_FirstBit() {
		return (EAttribute)gssTmTcFormatCSFormulaFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatFormula() {
		return gssTmTcFormatFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFormula_Slope() {
		return (EAttribute)gssTmTcFormatFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFormula_Intercept() {
		return (EAttribute)gssTmTcFormatFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatVSField() {
		return gssTmTcFormatVSFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_Fid() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_Pfid() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_Name() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_Description() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_Type() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_ByteOrder() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVSField_FirstBit() {
		return (EAttribute)gssTmTcFormatVSFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatConstSize() {
		return gssTmTcFormatConstSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatConstSize_Bytes() {
		return (EAttribute)gssTmTcFormatConstSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatConstSize_Bits() {
		return (EAttribute)gssTmTcFormatConstSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatVariableSize() {
		return gssTmTcFormatVariableSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVariableSize_FidRef() {
		return (EAttribute)gssTmTcFormatVariableSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVariableSize_Unit() {
		return (EAttribute)gssTmTcFormatVariableSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVariableSize_Power() {
		return (EAttribute)gssTmTcFormatVariableSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatMaxSize() {
		return gssTmTcFormatMaxSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatMaxSize_Bytes() {
		return (EAttribute)gssTmTcFormatMaxSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatMaxSize_Bits() {
		return (EAttribute)gssTmTcFormatMaxSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatVRFieldSize() {
		return gssTmTcFormatVRFieldSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVRFieldSize_Fid() {
		return (EAttribute)gssTmTcFormatVRFieldSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVRFieldSize_Pfid() {
		return (EAttribute)gssTmTcFormatVRFieldSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatVRFieldSize_Name() {
		return (EAttribute)gssTmTcFormatVRFieldSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatFDICField() {
		return gssTmTcFormatFDICFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_Fid() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_Pfid() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_Name() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_Description() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_CheckType() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_ByteOrder() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFDICField_FirstBit() {
		return (EAttribute)gssTmTcFormatFDICFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatFloatingOffset() {
		return gssTmTcFormatFloatingOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFloatingOffset_FidRef() {
		return (EAttribute)gssTmTcFormatFloatingOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatSortedFieldsToCheck() {
		return gssTmTcFormatSortedFieldsToCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatFieldToCheck() {
		return gssTmTcFormatFieldToCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatFieldToCheck_FidRef() {
		return (EAttribute)gssTmTcFormatFieldToCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatAField() {
		return gssTmTcFormatAFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_Fid() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_Pfid() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_Name() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_Description() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_Type() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_ByteOrder() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAField_FirstBit() {
		return (EAttribute)gssTmTcFormatAFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatArrayDimension() {
		return gssTmTcFormatArrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatArrayDimension_FidRef() {
		return (EAttribute)gssTmTcFormatArrayDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatArrayDimension_MaxItems() {
		return (EAttribute)gssTmTcFormatArrayDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatAIField() {
		return gssTmTcFormatAIFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_Fid() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_Pfid() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_Name() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_Description() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_Type() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_ByteOrder() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatAIField_FirstBit() {
		return (EAttribute)gssTmTcFormatAIFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatArrayRef() {
		return gssTmTcFormatArrayRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatArrayRef_FidRef() {
		return (EAttribute)gssTmTcFormatArrayRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTmTcFormatLocalOffset() {
		return gssTmTcFormatLocalOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatLocalOffset_Bytes() {
		return (EAttribute)gssTmTcFormatLocalOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTmTcFormatLocalOffset_Bits() {
		return (EAttribute)gssTmTcFormatLocalOffsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatTmTCFormatType() {
		return gssTmTcFormatTmTCFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatFieldType() {
		return gssTmTcFormatFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatFieldByteOrder() {
		return gssTmTcFormatFieldByteOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatSFieldFirstBit() {
		return gssTmTcFormatSFieldFirstBitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatUnit() {
		return gssTmTcFormatUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatPower() {
		return gssTmTcFormatPowerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTmTcFormatCheckType() {
		return gssTmTcFormatCheckTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tm_tc_formatFactory gettm_tc_formatFactory() {
		return (tm_tc_formatFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gssTmTcFormatTmTCFormatEClass = createEClass(GSS_TM_TC_FORMAT_TM_TC_FORMAT);
		createEAttribute(gssTmTcFormatTmTCFormatEClass, GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL);
		createEAttribute(gssTmTcFormatTmTCFormatEClass, GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE);

		gssTmTcFormatCSFieldEClass = createEClass(GSS_TM_TC_FORMAT_CS_FIELD);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__FID);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__PFID);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__NAME);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__TYPE);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER);
		createEAttribute(gssTmTcFormatCSFieldEClass, GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT);

		gssTmTcFormatSizeEClass = createEClass(GSS_TM_TC_FORMAT_SIZE);
		createEAttribute(gssTmTcFormatSizeEClass, GSS_TM_TC_FORMAT_SIZE__BYTES);
		createEAttribute(gssTmTcFormatSizeEClass, GSS_TM_TC_FORMAT_SIZE__BITS);

		gssTmTcFormatGlobalOffsetEClass = createEClass(GSS_TM_TC_FORMAT_GLOBAL_OFFSET);
		createEAttribute(gssTmTcFormatGlobalOffsetEClass, GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BYTES);
		createEAttribute(gssTmTcFormatGlobalOffsetEClass, GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BITS);

		gssTmTcFormatCSFormulaFieldEClass = createEClass(GSS_TM_TC_FORMAT_CS_FORMULA_FIELD);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FID);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__PFID);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__NAME);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__DESCRIPTION);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__TYPE);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__BYTE_ORDER);
		createEAttribute(gssTmTcFormatCSFormulaFieldEClass, GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FIRST_BIT);

		gssTmTcFormatFormulaEClass = createEClass(GSS_TM_TC_FORMAT_FORMULA);
		createEAttribute(gssTmTcFormatFormulaEClass, GSS_TM_TC_FORMAT_FORMULA__SLOPE);
		createEAttribute(gssTmTcFormatFormulaEClass, GSS_TM_TC_FORMAT_FORMULA__INTERCEPT);

		gssTmTcFormatVSFieldEClass = createEClass(GSS_TM_TC_FORMAT_VS_FIELD);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__FID);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__PFID);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__NAME);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__TYPE);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER);
		createEAttribute(gssTmTcFormatVSFieldEClass, GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT);

		gssTmTcFormatConstSizeEClass = createEClass(GSS_TM_TC_FORMAT_CONST_SIZE);
		createEAttribute(gssTmTcFormatConstSizeEClass, GSS_TM_TC_FORMAT_CONST_SIZE__BYTES);
		createEAttribute(gssTmTcFormatConstSizeEClass, GSS_TM_TC_FORMAT_CONST_SIZE__BITS);

		gssTmTcFormatVariableSizeEClass = createEClass(GSS_TM_TC_FORMAT_VARIABLE_SIZE);
		createEAttribute(gssTmTcFormatVariableSizeEClass, GSS_TM_TC_FORMAT_VARIABLE_SIZE__FID_REF);
		createEAttribute(gssTmTcFormatVariableSizeEClass, GSS_TM_TC_FORMAT_VARIABLE_SIZE__UNIT);
		createEAttribute(gssTmTcFormatVariableSizeEClass, GSS_TM_TC_FORMAT_VARIABLE_SIZE__POWER);

		gssTmTcFormatMaxSizeEClass = createEClass(GSS_TM_TC_FORMAT_MAX_SIZE);
		createEAttribute(gssTmTcFormatMaxSizeEClass, GSS_TM_TC_FORMAT_MAX_SIZE__BYTES);
		createEAttribute(gssTmTcFormatMaxSizeEClass, GSS_TM_TC_FORMAT_MAX_SIZE__BITS);

		gssTmTcFormatVRFieldSizeEClass = createEClass(GSS_TM_TC_FORMAT_VR_FIELD_SIZE);
		createEAttribute(gssTmTcFormatVRFieldSizeEClass, GSS_TM_TC_FORMAT_VR_FIELD_SIZE__FID);
		createEAttribute(gssTmTcFormatVRFieldSizeEClass, GSS_TM_TC_FORMAT_VR_FIELD_SIZE__PFID);
		createEAttribute(gssTmTcFormatVRFieldSizeEClass, GSS_TM_TC_FORMAT_VR_FIELD_SIZE__NAME);

		gssTmTcFormatFDICFieldEClass = createEClass(GSS_TM_TC_FORMAT_FDIC_FIELD);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__FID);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__PFID);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__NAME);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER);
		createEAttribute(gssTmTcFormatFDICFieldEClass, GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT);

		gssTmTcFormatFloatingOffsetEClass = createEClass(GSS_TM_TC_FORMAT_FLOATING_OFFSET);
		createEAttribute(gssTmTcFormatFloatingOffsetEClass, GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF);

		gssTmTcFormatSortedFieldsToCheckEClass = createEClass(GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK);

		gssTmTcFormatFieldToCheckEClass = createEClass(GSS_TM_TC_FORMAT_FIELD_TO_CHECK);
		createEAttribute(gssTmTcFormatFieldToCheckEClass, GSS_TM_TC_FORMAT_FIELD_TO_CHECK__FID_REF);

		gssTmTcFormatAFieldEClass = createEClass(GSS_TM_TC_FORMAT_AFIELD);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__FID);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__PFID);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__NAME);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__DESCRIPTION);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__TYPE);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__BYTE_ORDER);
		createEAttribute(gssTmTcFormatAFieldEClass, GSS_TM_TC_FORMAT_AFIELD__FIRST_BIT);

		gssTmTcFormatArrayDimensionEClass = createEClass(GSS_TM_TC_FORMAT_ARRAY_DIMENSION);
		createEAttribute(gssTmTcFormatArrayDimensionEClass, GSS_TM_TC_FORMAT_ARRAY_DIMENSION__FID_REF);
		createEAttribute(gssTmTcFormatArrayDimensionEClass, GSS_TM_TC_FORMAT_ARRAY_DIMENSION__MAX_ITEMS);

		gssTmTcFormatAIFieldEClass = createEClass(GSS_TM_TC_FORMAT_AI_FIELD);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__FID);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__PFID);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__NAME);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__DESCRIPTION);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__TYPE);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER);
		createEAttribute(gssTmTcFormatAIFieldEClass, GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT);

		gssTmTcFormatArrayRefEClass = createEClass(GSS_TM_TC_FORMAT_ARRAY_REF);
		createEAttribute(gssTmTcFormatArrayRefEClass, GSS_TM_TC_FORMAT_ARRAY_REF__FID_REF);

		gssTmTcFormatLocalOffsetEClass = createEClass(GSS_TM_TC_FORMAT_LOCAL_OFFSET);
		createEAttribute(gssTmTcFormatLocalOffsetEClass, GSS_TM_TC_FORMAT_LOCAL_OFFSET__BYTES);
		createEAttribute(gssTmTcFormatLocalOffsetEClass, GSS_TM_TC_FORMAT_LOCAL_OFFSET__BITS);

		// Create enums
		gssTmTcFormatTmTCFormatTypeEEnum = createEEnum(GSS_TM_TC_FORMAT_TM_TC_FORMAT_TYPE);
		gssTmTcFormatFieldTypeEEnum = createEEnum(GSS_TM_TC_FORMAT_FIELD_TYPE);
		gssTmTcFormatFieldByteOrderEEnum = createEEnum(GSS_TM_TC_FORMAT_FIELD_BYTE_ORDER);
		gssTmTcFormatSFieldFirstBitEEnum = createEEnum(GSS_TM_TC_FORMAT_SFIELD_FIRST_BIT);
		gssTmTcFormatUnitEEnum = createEEnum(GSS_TM_TC_FORMAT_UNIT);
		gssTmTcFormatPowerEEnum = createEEnum(GSS_TM_TC_FORMAT_POWER);
		gssTmTcFormatCheckTypeEEnum = createEEnum(GSS_TM_TC_FORMAT_CHECK_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssTmTcFormatTmTCFormatEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssTmTcFormatTmTCFormatEClass, GSSTmTcFormatTmTCFormat.class, "GSSTmTcFormatTmTCFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatTmTCFormat_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, GSSTmTcFormatTmTCFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatTmTCFormat_Type(), this.getGSSTmTcFormatTmTCFormatType(), "type", null, 1, 1, GSSTmTcFormatTmTCFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatCSFieldEClass, GSSTmTcFormatCSField.class, "GSSTmTcFormatCSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatCSField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSField_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSField_Description(), ecorePackage.getEString(), "description", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSField_Type(), this.getGSSTmTcFormatFieldType(), "type", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSField_ByteOrder(), this.getGSSTmTcFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSField_FirstBit(), this.getGSSTmTcFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSTmTcFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatSizeEClass, GSSTmTcFormatSize.class, "GSSTmTcFormatSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatSize_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSTmTcFormatSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatSize_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSTmTcFormatSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatGlobalOffsetEClass, GSSTmTcFormatGlobalOffset.class, "GSSTmTcFormatGlobalOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatGlobalOffset_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSTmTcFormatGlobalOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatGlobalOffset_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSTmTcFormatGlobalOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatCSFormulaFieldEClass, GSSTmTcFormatCSFormulaField.class, "GSSTmTcFormatCSFormulaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatCSFormulaField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSFormulaField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSFormulaField_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSFormulaField_Description(), ecorePackage.getEString(), "description", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSFormulaField_Type(), this.getGSSTmTcFormatFieldType(), "type", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSFormulaField_ByteOrder(), this.getGSSTmTcFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatCSFormulaField_FirstBit(), this.getGSSTmTcFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSTmTcFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatFormulaEClass, GSSTmTcFormatFormula.class, "GSSTmTcFormatFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatFormula_Slope(), ecorePackage.getEString(), "slope", null, 1, 1, GSSTmTcFormatFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFormula_Intercept(), ecorePackage.getEString(), "intercept", null, 1, 1, GSSTmTcFormatFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatVSFieldEClass, GSSTmTcFormatVSField.class, "GSSTmTcFormatVSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatVSField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVSField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVSField_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVSField_Description(), ecorePackage.getEString(), "description", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVSField_Type(), this.getGSSTmTcFormatFieldType(), "type", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVSField_ByteOrder(), this.getGSSTmTcFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVSField_FirstBit(), this.getGSSTmTcFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSTmTcFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatConstSizeEClass, GSSTmTcFormatConstSize.class, "GSSTmTcFormatConstSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatConstSize_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSTmTcFormatConstSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatConstSize_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSTmTcFormatConstSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatVariableSizeEClass, GSSTmTcFormatVariableSize.class, "GSSTmTcFormatVariableSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatVariableSize_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSTmTcFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVariableSize_Unit(), this.getGSSTmTcFormatUnit(), "unit", null, 1, 1, GSSTmTcFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVariableSize_Power(), this.getGSSTmTcFormatPower(), "power", null, 1, 1, GSSTmTcFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatMaxSizeEClass, GSSTmTcFormatMaxSize.class, "GSSTmTcFormatMaxSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatMaxSize_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSTmTcFormatMaxSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatMaxSize_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSTmTcFormatMaxSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatVRFieldSizeEClass, GSSTmTcFormatVRFieldSize.class, "GSSTmTcFormatVRFieldSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatVRFieldSize_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatVRFieldSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVRFieldSize_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatVRFieldSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatVRFieldSize_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatVRFieldSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatFDICFieldEClass, GSSTmTcFormatFDICField.class, "GSSTmTcFormatFDICField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatFDICField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFDICField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFDICField_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFDICField_Description(), ecorePackage.getEString(), "description", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFDICField_CheckType(), this.getGSSTmTcFormatCheckType(), "checkType", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFDICField_ByteOrder(), this.getGSSTmTcFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatFDICField_FirstBit(), this.getGSSTmTcFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSTmTcFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatFloatingOffsetEClass, GSSTmTcFormatFloatingOffset.class, "GSSTmTcFormatFloatingOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatFloatingOffset_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSTmTcFormatFloatingOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatSortedFieldsToCheckEClass, GSSTmTcFormatSortedFieldsToCheck.class, "GSSTmTcFormatSortedFieldsToCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssTmTcFormatFieldToCheckEClass, GSSTmTcFormatFieldToCheck.class, "GSSTmTcFormatFieldToCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatFieldToCheck_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSTmTcFormatFieldToCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatAFieldEClass, GSSTmTcFormatAField.class, "GSSTmTcFormatAField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatAField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAField_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAField_Description(), ecorePackage.getEString(), "description", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAField_Type(), this.getGSSTmTcFormatFieldType(), "type", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAField_ByteOrder(), this.getGSSTmTcFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAField_FirstBit(), this.getGSSTmTcFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSTmTcFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatArrayDimensionEClass, GSSTmTcFormatArrayDimension.class, "GSSTmTcFormatArrayDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatArrayDimension_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSTmTcFormatArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatArrayDimension_MaxItems(), ecorePackage.getEString(), "maxItems", null, 1, 1, GSSTmTcFormatArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatAIFieldEClass, GSSTmTcFormatAIField.class, "GSSTmTcFormatAIField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatAIField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAIField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAIField_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAIField_Description(), ecorePackage.getEString(), "description", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAIField_Type(), this.getGSSTmTcFormatFieldType(), "type", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAIField_ByteOrder(), this.getGSSTmTcFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatAIField_FirstBit(), this.getGSSTmTcFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSTmTcFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatArrayRefEClass, GSSTmTcFormatArrayRef.class, "GSSTmTcFormatArrayRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatArrayRef_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSTmTcFormatArrayRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTmTcFormatLocalOffsetEClass, GSSTmTcFormatLocalOffset.class, "GSSTmTcFormatLocalOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTmTcFormatLocalOffset_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSTmTcFormatLocalOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTmTcFormatLocalOffset_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSTmTcFormatLocalOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssTmTcFormatTmTCFormatTypeEEnum, GSSTmTcFormatTmTCFormatType.class, "GSSTmTcFormatTmTCFormatType");
		addEEnumLiteral(gssTmTcFormatTmTCFormatTypeEEnum, GSSTmTcFormatTmTCFormatType.TM);
		addEEnumLiteral(gssTmTcFormatTmTCFormatTypeEEnum, GSSTmTcFormatTmTCFormatType.TC);

		initEEnum(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.class, "GSSTmTcFormatFieldType");
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.STRUCTURED);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.UINT);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.FLAG);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.ENUMERATED);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.BIT_VECTOR);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.BYTE_VECTOR);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.FLOAT);
		addEEnumLiteral(gssTmTcFormatFieldTypeEEnum, GSSTmTcFormatFieldType.DEDUCED);

		initEEnum(gssTmTcFormatFieldByteOrderEEnum, GSSTmTcFormatFieldByteOrder.class, "GSSTmTcFormatFieldByteOrder");
		addEEnumLiteral(gssTmTcFormatFieldByteOrderEEnum, GSSTmTcFormatFieldByteOrder.BIG_ENDIAN);
		addEEnumLiteral(gssTmTcFormatFieldByteOrderEEnum, GSSTmTcFormatFieldByteOrder.LITTLE_ENDIAN);
		addEEnumLiteral(gssTmTcFormatFieldByteOrderEEnum, GSSTmTcFormatFieldByteOrder.NA);

		initEEnum(gssTmTcFormatSFieldFirstBitEEnum, GSSTmTcFormatSFieldFirstBit.class, "GSSTmTcFormatSFieldFirstBit");
		addEEnumLiteral(gssTmTcFormatSFieldFirstBitEEnum, GSSTmTcFormatSFieldFirstBit.MSB);
		addEEnumLiteral(gssTmTcFormatSFieldFirstBitEEnum, GSSTmTcFormatSFieldFirstBit.LSB);

		initEEnum(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.class, "GSSTmTcFormatUnit");
		addEEnumLiteral(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.BYTES);
		addEEnumLiteral(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.BITS);
		addEEnumLiteral(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.HALFWORD);
		addEEnumLiteral(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.STRING10);
		addEEnumLiteral(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.STRING17);
		addEEnumLiteral(gssTmTcFormatUnitEEnum, GSSTmTcFormatUnit.STRING69);

		initEEnum(gssTmTcFormatPowerEEnum, GSSTmTcFormatPower.class, "GSSTmTcFormatPower");
		addEEnumLiteral(gssTmTcFormatPowerEEnum, GSSTmTcFormatPower._2);
		addEEnumLiteral(gssTmTcFormatPowerEEnum, GSSTmTcFormatPower._2WITH_0);

		initEEnum(gssTmTcFormatCheckTypeEEnum, GSSTmTcFormatCheckType.class, "GSSTmTcFormatCheckType");
		addEEnumLiteral(gssTmTcFormatCheckTypeEEnum, GSSTmTcFormatCheckType.CRC16);
		addEEnumLiteral(gssTmTcFormatCheckTypeEEnum, GSSTmTcFormatCheckType.CHECKSUM16);

		// Create resource
		createResource(eNS_URI);
	}

} //tm_tc_formatPackageImpl